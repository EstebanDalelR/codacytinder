package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Creator<DeviceAuthMethodHandler> CREATOR = new C17601();
    private static ScheduledThreadPoolExecutor backgroundExecutor;

    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$1 */
    static class C17601 implements Creator {
        C17601() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6083a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6084a(i);
        }

        /* renamed from: a */
        public DeviceAuthMethodHandler m6083a(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        /* renamed from: a */
        public DeviceAuthMethodHandler[] m6084a(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    String getNameForLogging() {
        return "device_auth";
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    boolean tryAuthorize(Request request) {
        showDialog(request);
        return true;
    }

    private void showDialog(Request request) {
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.show(this.loginClient.getActivity().getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialog.m17784a(request);
    }

    public void onCancel() {
        this.loginClient.completeAndValidate(Result.createCancelResult(this.loginClient.getPendingRequest(), "User canceled log in."));
    }

    public void onError(Exception exception) {
        this.loginClient.completeAndValidate(Result.createErrorResult(this.loginClient.getPendingRequest(), null, exception.getMessage()));
    }

    public void onSuccess(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, AccessTokenSource accessTokenSource, Date date, Date date2) {
        this.loginClient.completeAndValidate(Result.createTokenResult(this.loginClient.getPendingRequest(), new AccessToken(str, str2, str3, collection, collection2, accessTokenSource, date, date2)));
    }

    public static synchronized ScheduledThreadPoolExecutor getBackgroundExecutor() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (backgroundExecutor == null) {
                backgroundExecutor = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = backgroundExecutor;
        }
        return scheduledThreadPoolExecutor;
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
