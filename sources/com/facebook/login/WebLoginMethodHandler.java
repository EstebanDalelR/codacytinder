package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import com.tinder.api.ManagerWebServices;
import java.util.Locale;

abstract class WebLoginMethodHandler extends LoginMethodHandler {
    private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
    private String e2e;

    protected String getSSODevice() {
        return null;
    }

    abstract AccessTokenSource getTokenSource();

    private static final String getRedirectUri() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ManagerWebServices.PARAM_PHOTOS_SOURCE);
        stringBuilder.append(FacebookSdk.m3998i());
        stringBuilder.append("://authorize");
        return stringBuilder.toString();
    }

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    protected Bundle getParameters(Request request) {
        Bundle bundle = new Bundle();
        if (!Utility.m5786a(request.getPermissions())) {
            String join = TextUtils.join(",", request.getPermissions());
            bundle.putString(QueryParams.SCOPE, join);
            addLoggingExtra(QueryParams.SCOPE, join);
        }
        bundle.putString("default_audience", request.getDefaultAudience().getNativeProtocolAudience());
        bundle.putString("state", getClientState(request.getAuthId()));
        request = AccessToken.getCurrentAccessToken();
        request = request != null ? request.getToken() : null;
        if (request == null || !request.equals(loadCookieToken())) {
            Utility.m5792b(this.loginClient.getActivity());
            addLoggingExtra("access_token", "0");
        } else {
            bundle.putString("access_token", request);
            addLoggingExtra("access_token", "1");
        }
        return bundle;
    }

    protected Bundle addExtraParameters(Bundle bundle, Request request) {
        bundle.putString(QueryParams.REDIRECT_URI, getRedirectUri());
        bundle.putString("client_id", request.getApplicationId());
        LoginClient loginClient = this.loginClient;
        bundle.putString("e2e", LoginClient.getE2E());
        bundle.putString(QueryParams.RESPONSE_TYPE, "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", "rerequest");
        if (getSSODevice() != null) {
            bundle.putString("sso", getSSODevice());
        }
        return bundle;
    }

    protected void onComplete(Request request, Bundle bundle, FacebookException facebookException) {
        this.e2e = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e") != null) {
                this.e2e = bundle.getString("e2e");
            }
            try {
                request = LoginMethodHandler.createAccessTokenFromWebBundle(request.getPermissions(), bundle, getTokenSource(), request.getApplicationId());
                bundle = Result.createTokenResult(this.loginClient.getPendingRequest(), request);
                CookieSyncManager.createInstance(this.loginClient.getActivity()).sync();
                saveCookieToken(request.getToken());
            } catch (Request request2) {
                bundle = Result.createErrorResult(this.loginClient.getPendingRequest(), null, request2.getMessage());
            }
        } else if ((facebookException instanceof FacebookOperationCanceledException) != null) {
            bundle = Result.createCancelResult(this.loginClient.getPendingRequest(), "User canceled log in.");
        } else {
            this.e2e = null;
            request2 = facebookException.getMessage();
            if ((facebookException instanceof FacebookServiceException) != null) {
                bundle = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(((FacebookServiceException) facebookException).m12165a().getErrorCode())});
                request2 = request2.toString();
            } else {
                bundle = null;
            }
            bundle = Result.createErrorResult(this.loginClient.getPendingRequest(), null, request2, bundle);
        }
        if (Utility.m5785a(this.e2e) == null) {
            logWebLoginCompleted(this.e2e);
        }
        this.loginClient.completeAndValidate(bundle);
    }

    private String loadCookieToken() {
        return this.loginClient.getActivity().getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).getString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, "");
    }

    private void saveCookieToken(String str) {
        this.loginClient.getActivity().getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).edit().putString(WEB_VIEW_AUTH_HANDLER_TOKEN_KEY, str).apply();
    }
}
