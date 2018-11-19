package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C1745t;
import com.facebook.login.LoginClient.Request;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<KatanaProxyLoginMethodHandler> CREATOR = new C17631();

    /* renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$1 */
    static class C17631 implements Creator {
        C17631() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6089a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6090a(i);
        }

        /* renamed from: a */
        public KatanaProxyLoginMethodHandler m6089a(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public KatanaProxyLoginMethodHandler[] m6090a(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    String getNameForLogging() {
        return "katana_proxy_auth";
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    boolean tryAuthorize(Request request) {
        String e2e = LoginClient.getE2E();
        request = C1745t.m6036b(this.loginClient.getActivity(), request.getApplicationId(), request.getPermissions(), e2e, request.isRerequest(), request.hasPublishPermission(), request.getDefaultAudience(), getClientState(request.getAuthId()));
        addLoggingExtra("e2e", e2e);
        return tryIntent(request, LoginClient.getLoginRequestCode());
    }

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
