package com.facebook.accountkit.ui;

import android.content.Intent;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.EmailLoginModel;
import com.facebook.accountkit.internal.C1220c;
import com.facebook.accountkit.internal.InternalAccountKitError;
import com.facebook.accountkit.internal.LoginStatus;
import com.facebook.accountkit.ui.AccountKitActivity.ResponseType;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.util.Date;

final class DemoEmailLoginFlowManager extends EmailLoginFlowManager {
    public static final Creator<DemoEmailLoginFlowManager> CREATOR = new C12712();
    private static final int MOCK_EMAIL_DELAY_MS = 6000;
    private static final int MOCK_NETWORK_DELAY_MS = 2000;
    private boolean isValid = true;
    private DemoEmailLoginModel loginModel;

    /* renamed from: com.facebook.accountkit.ui.DemoEmailLoginFlowManager$2 */
    static class C12712 implements Creator<DemoEmailLoginFlowManager> {
        C12712() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4550a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4551a(i);
        }

        /* renamed from: a */
        public DemoEmailLoginFlowManager m4550a(Parcel parcel) {
            return new DemoEmailLoginFlowManager(parcel);
        }

        /* renamed from: a */
        public DemoEmailLoginFlowManager[] m4551a(int i) {
            return new DemoEmailLoginFlowManager[i];
        }
    }

    private static class DemoEmailLoginModel implements EmailLoginModel {
        public static final Creator<DemoEmailLoginModel> CREATOR = new C12721();
        private final AccessToken accessToken;
        private final String authState;
        private final String confirmationCode;
        private final String email;

        /* renamed from: com.facebook.accountkit.ui.DemoEmailLoginFlowManager$DemoEmailLoginModel$1 */
        static class C12721 implements Creator<DemoEmailLoginModel> {
            C12721() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m4552a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m4553a(i);
            }

            /* renamed from: a */
            public DemoEmailLoginModel m4552a(Parcel parcel) {
                return new DemoEmailLoginModel(parcel);
            }

            /* renamed from: a */
            public DemoEmailLoginModel[] m4553a(int i) {
                return new DemoEmailLoginModel[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public String getCode() {
            return null;
        }

        @Nullable
        public String getPrivacyPolicy() {
            return null;
        }

        @Nullable
        public String getTermsOfService() {
            return null;
        }

        public DemoEmailLoginModel(String str, String str2, String str3, AccessToken accessToken) {
            this.email = str;
            this.authState = str2;
            this.confirmationCode = str3;
            this.accessToken = accessToken;
        }

        public String getEmail() {
            return this.email;
        }

        public String getFinalAuthState() {
            return this.authState;
        }

        public AccessToken getAccessToken() {
            return this.accessToken;
        }

        DemoEmailLoginModel(Parcel parcel) {
            this.accessToken = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authState = parcel.readString();
            this.confirmationCode = parcel.readString();
            this.email = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.accessToken, i);
            parcel.writeString(this.authState);
            parcel.writeString(this.confirmationCode);
            parcel.writeString(this.email);
        }
    }

    public DemoEmailLoginFlowManager(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    public void cancel() {
        this.isValid = false;
        broadcastLoginState(LoginStatus.CANCELLED, null);
    }

    public AccessToken getAccessToken() {
        if (this.isValid) {
            return new AccessToken("TEST_ACCESS_TOKEN", "TEST_ACCOUNT_ID", AccountKit.m4119h(), 300000, new Date());
        }
        return null;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public void logInWithEmail(ResponseType responseType, String str) {
        if (this.isValid) {
            final String email = getEmail();
            AccessToken accessToken = null;
            String str2 = responseType == ResponseType.CODE ? "DEMOCODE" : null;
            if (responseType == ResponseType.TOKEN) {
                accessToken = getAccessToken();
            }
            this.loginModel = new DemoEmailLoginModel(email, str, str2, accessToken);
            new Handler().postDelayed(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ DemoEmailLoginFlowManager f3393b;

                /* renamed from: com.facebook.accountkit.ui.DemoEmailLoginFlowManager$1$1 */
                class C12691 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C12701 f3391a;

                    C12691(C12701 c12701) {
                        this.f3391a = c12701;
                    }

                    public void run() {
                        this.f3391a.f3393b.broadcastLoginState(LoginStatus.SUCCESS, null);
                    }
                }

                public void run() {
                    if (email.endsWith("@example.com")) {
                        this.f3393b.broadcastLoginState(LoginStatus.PENDING, null);
                        new Handler().postDelayed(new C12691(this), 6000);
                        return;
                    }
                    this.f3393b.broadcastLoginState(LoginStatus.ERROR, new AccountKitError(Type.ARGUMENT_ERROR, new InternalAccountKitError(InternalAccountKitError.INVALID_CONFIRMATION_CODE, null, "[Demo] use *@example.com")));
                }
            }, DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
        }
    }

    private void broadcastLoginState(LoginStatus loginStatus, AccountKitError accountKitError) {
        C0436c.m1648a(C1220c.m4288a()).m1653a(new Intent("com.facebook.accountkit.sdk.ACTION_EMAIL_LOGIN_STATE_CHANGED").putExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_MODEL", this.loginModel).putExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_STATUS", loginStatus).putExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_ERROR", accountKitError));
    }

    protected DemoEmailLoginFlowManager(Parcel parcel) {
        super(parcel);
    }
}
