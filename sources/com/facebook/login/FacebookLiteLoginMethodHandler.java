package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C1745t;
import com.facebook.login.LoginClient.Request;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<FacebookLiteLoginMethodHandler> CREATOR = new C17611();

    /* renamed from: com.facebook.login.FacebookLiteLoginMethodHandler$1 */
    static class C17611 implements Creator {
        C17611() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6085a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6086a(i);
        }

        /* renamed from: a */
        public FacebookLiteLoginMethodHandler m6085a(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public FacebookLiteLoginMethodHandler[] m6086a(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    String getNameForLogging() {
        return "fb_lite_login";
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    boolean tryAuthorize(Request request) {
        String e2e = LoginClient.getE2E();
        request = C1745t.m6024a(this.loginClient.getActivity(), request.getApplicationId(), request.getPermissions(), e2e, request.isRerequest(), request.hasPublishPermission(), request.getDefaultAudience(), getClientState(request.getAuthId()));
        addLoggingExtra("e2e", e2e);
        return tryIntent(request, LoginClient.getLoginRequestCode());
    }

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
