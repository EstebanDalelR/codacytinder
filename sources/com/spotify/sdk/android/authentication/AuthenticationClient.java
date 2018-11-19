package com.spotify.sdk.android.authentication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.spotify.sdk.android.authentication.AuthenticationHandler.OnCompleteListener;
import com.spotify.sdk.android.authentication.AuthenticationResponse.Builder;
import com.spotify.sdk.android.authentication.AuthenticationResponse.Type;
import java.util.ArrayList;
import java.util.List;

public class AuthenticationClient {
    private AuthenticationClientListener mAuthenticationClientListener;
    private List<AuthenticationHandler> mAuthenticationHandlers = new ArrayList();
    private boolean mAuthenticationPending;
    private AuthenticationHandler mCurrentHandler;
    private final Activity mLoginActivity;

    interface AuthenticationClientListener {
        void onClientCancelled();

        void onClientComplete(AuthenticationResponse authenticationResponse);
    }

    public static void openLoginInBrowser(Activity activity, AuthenticationRequest authenticationRequest) {
        activity.startActivity(new Intent("android.intent.action.VIEW", authenticationRequest.toUri()));
    }

    public static Intent createLoginActivityIntent(Activity activity, AuthenticationRequest authenticationRequest) {
        return LoginActivity.getAuthIntent(activity, authenticationRequest);
    }

    public static void openLoginActivity(Activity activity, int i, AuthenticationRequest authenticationRequest) {
        activity.startActivityForResult(createLoginActivityIntent(activity, authenticationRequest), i);
    }

    public static void stopLoginActivity(Activity activity, int i) {
        activity.finishActivity(i);
    }

    public static void clearCookies(Context context) {
        LoginDialog.clearCookies(context);
    }

    public static AuthenticationResponse getResponse(int i, Intent intent) {
        if (i != -1 || LoginActivity.getResponseFromIntent(intent) == 0) {
            return new Builder().setType(Type.EMPTY).build();
        }
        return LoginActivity.getResponseFromIntent(intent);
    }

    public AuthenticationClient(Activity activity) {
        this.mLoginActivity = activity;
        this.mAuthenticationHandlers.add(new SpotifyAuthHandler());
        this.mAuthenticationHandlers.add(new WebViewAuthHandler());
    }

    void setOnCompleteListener(AuthenticationClientListener authenticationClientListener) {
        this.mAuthenticationClientListener = authenticationClientListener;
    }

    void authenticate(AuthenticationRequest authenticationRequest) {
        if (!this.mAuthenticationPending) {
            this.mAuthenticationPending = true;
            for (AuthenticationHandler authenticationHandler : this.mAuthenticationHandlers) {
                if (tryAuthenticationHandler(authenticationHandler, authenticationRequest)) {
                    this.mCurrentHandler = authenticationHandler;
                    break;
                }
            }
        }
    }

    void cancel() {
        this.mAuthenticationPending = false;
        closeAuthenticationHandler(this.mCurrentHandler);
        if (this.mAuthenticationClientListener != null) {
            this.mAuthenticationClientListener.onClientCancelled();
            this.mAuthenticationClientListener = null;
        }
    }

    void complete(AuthenticationResponse authenticationResponse) {
        sendComplete(this.mCurrentHandler, authenticationResponse);
    }

    private void sendComplete(AuthenticationHandler authenticationHandler, AuthenticationResponse authenticationResponse) {
        this.mAuthenticationPending = false;
        closeAuthenticationHandler(authenticationHandler);
        if (this.mAuthenticationClientListener != null) {
            this.mAuthenticationClientListener.onClientComplete(authenticationResponse);
            this.mAuthenticationClientListener = null;
        }
    }

    private boolean tryAuthenticationHandler(final AuthenticationHandler authenticationHandler, AuthenticationRequest authenticationRequest) {
        authenticationHandler.setOnCompleteListener(new OnCompleteListener() {
            public void onComplete(AuthenticationResponse authenticationResponse) {
                AuthenticationClient.this.sendComplete(authenticationHandler, authenticationResponse);
            }

            public void onCancel() {
                AuthenticationClient.this.sendComplete(authenticationHandler, new Builder().setType(Type.EMPTY).build());
            }

            public void onError(Throwable th) {
                AuthenticationClient.this.sendComplete(authenticationHandler, new Builder().setType(Type.ERROR).setError(th.getMessage()).build());
            }
        });
        if (authenticationHandler.start(this.mLoginActivity, authenticationRequest) != null) {
            return true;
        }
        closeAuthenticationHandler(authenticationHandler);
        return null;
    }

    private void closeAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        if (authenticationHandler != null) {
            authenticationHandler.setOnCompleteListener(null);
            authenticationHandler.stop();
        }
    }
}
