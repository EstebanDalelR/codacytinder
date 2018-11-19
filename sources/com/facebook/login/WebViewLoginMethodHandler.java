package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.C4354e;
import com.facebook.internal.WebDialog;
import com.facebook.internal.WebDialog.C1693a;
import com.facebook.internal.WebDialog.OnCompleteListener;
import com.facebook.login.LoginClient.Request;
import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<WebViewLoginMethodHandler> CREATOR = new C17682();
    private String e2e;
    private WebDialog loginDialog;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$2 */
    static class C17682 implements Creator {
        C17682() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6099a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6100a(i);
        }

        /* renamed from: a */
        public WebViewLoginMethodHandler m6099a(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public WebViewLoginMethodHandler[] m6100a(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    static class C3430a extends C1693a {
        /* renamed from: a */
        private String f10421a;
        /* renamed from: b */
        private boolean f10422b;

        public C3430a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        /* renamed from: a */
        public C3430a m13119a(String str) {
            this.f10421a = str;
            return this;
        }

        /* renamed from: a */
        public C3430a m13120a(boolean z) {
            this.f10422b = z;
            return this;
        }

        /* renamed from: a */
        public WebDialog mo1866a() {
            Bundle e = m5817e();
            e.putString(QueryParams.REDIRECT_URI, "fbconnect://success");
            e.putString("client_id", m5814b());
            e.putString("e2e", this.f10421a);
            e.putString(QueryParams.RESPONSE_TYPE, "token,signed_request");
            e.putString("return_scopes", "true");
            e.putString("auth_type", "rerequest");
            return WebDialog.m5824a(m5815c(), "oauth", e, m5816d(), m5818f());
        }
    }

    public int describeContents() {
        return 0;
    }

    String getNameForLogging() {
        return "web_view";
    }

    boolean needsInternetPermission() {
        return true;
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    AccessTokenSource getTokenSource() {
        return AccessTokenSource.WEB_VIEW;
    }

    void cancel() {
        if (this.loginDialog != null) {
            this.loginDialog.cancel();
            this.loginDialog = null;
        }
    }

    boolean tryAuthorize(final Request request) {
        Bundle parameters = getParameters(request);
        OnCompleteListener c34291 = new OnCompleteListener(this) {
            /* renamed from: b */
            final /* synthetic */ WebViewLoginMethodHandler f10420b;

            public void onComplete(Bundle bundle, FacebookException facebookException) {
                this.f10420b.onWebDialogComplete(request, bundle, facebookException);
            }
        };
        this.e2e = LoginClient.getE2E();
        addLoggingExtra("e2e", this.e2e);
        Context activity = this.loginClient.getActivity();
        this.loginDialog = new C3430a(activity, request.getApplicationId(), parameters).m13119a(this.e2e).m13120a(request.isRerequest()).m5812a(c34291).mo1866a();
        request = new C4354e();
        request.setRetainInstance(true);
        request.m17757a(this.loginDialog);
        request.show(activity.getSupportFragmentManager(), "FacebookDialogFragment");
        return true;
    }

    void onWebDialogComplete(Request request, Bundle bundle, FacebookException facebookException) {
        super.onComplete(request, bundle, facebookException);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.e2e = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e2e);
    }
}
