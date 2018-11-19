package com.facebook.accountkit.ui;

import android.content.Intent;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.content.C0436c;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.PhoneLoginModel;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.internal.C1220c;
import com.facebook.accountkit.internal.InternalAccountKitError;
import com.facebook.accountkit.internal.LoginStatus;
import com.facebook.accountkit.ui.AccountKitActivity.ResponseType;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.util.Date;

final class DemoPhoneLoginFlowManager extends PhoneLoginFlowManager {
    public static final Creator<DemoPhoneLoginFlowManager> CREATOR = new C12763();
    private static final String MOCK_CONFIRMATION_CODE = "123456";
    private static final int MOCK_NETWORK_DELAY_MS = 2000;
    private AccountKitActivity activity;
    private boolean isValid;
    private DemoPhoneLoginModel loginModel;
    private ActivityPhoneHandler phoneListeners;

    /* renamed from: com.facebook.accountkit.ui.DemoPhoneLoginFlowManager$3 */
    static class C12763 implements Creator<DemoPhoneLoginFlowManager> {
        C12763() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4554a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4555a(i);
        }

        /* renamed from: a */
        public DemoPhoneLoginFlowManager m4554a(Parcel parcel) {
            return new DemoPhoneLoginFlowManager(parcel);
        }

        /* renamed from: a */
        public DemoPhoneLoginFlowManager[] m4555a(int i) {
            return new DemoPhoneLoginFlowManager[i];
        }
    }

    private static class DemoPhoneLoginModel implements PhoneLoginModel {
        public static final Creator<DemoPhoneLoginModel> CREATOR = new C12771();
        private final AccessToken accessToken;
        private final String authState;
        private final String confirmationCode;
        private final PhoneNumber phoneNumber;

        /* renamed from: com.facebook.accountkit.ui.DemoPhoneLoginFlowManager$DemoPhoneLoginModel$1 */
        static class C12771 implements Creator<DemoPhoneLoginModel> {
            C12771() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m4556a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m4557a(i);
            }

            /* renamed from: a */
            public DemoPhoneLoginModel m4556a(Parcel parcel) {
                return new DemoPhoneLoginModel(parcel);
            }

            /* renamed from: a */
            public DemoPhoneLoginModel[] m4557a(int i) {
                return new DemoPhoneLoginModel[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public String getPrivacyPolicy() {
            return null;
        }

        public String getTermsOfService() {
            return null;
        }

        DemoPhoneLoginModel(PhoneNumber phoneNumber, String str, String str2, AccessToken accessToken) {
            this.phoneNumber = phoneNumber;
            this.authState = str;
            this.confirmationCode = str2;
            this.accessToken = accessToken;
        }

        public String getConfirmationCode() {
            return this.confirmationCode;
        }

        public PhoneNumber getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getFinalAuthState() {
            return this.authState;
        }

        public String getCode() {
            return this.confirmationCode;
        }

        public AccessToken getAccessToken() {
            return this.accessToken;
        }

        public NotificationChannel getNotificationChannel() {
            return NotificationChannel.SMS;
        }

        public long getResendTime() {
            return System.currentTimeMillis();
        }

        DemoPhoneLoginModel(Parcel parcel) {
            this.accessToken = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authState = parcel.readString();
            this.confirmationCode = parcel.readString();
            this.phoneNumber = (PhoneNumber) parcel.readParcelable(PhoneNumber.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.accessToken, i);
            parcel.writeString(this.authState);
            parcel.writeString(this.confirmationCode);
            parcel.writeParcelable(this.phoneNumber, i);
        }
    }

    public DemoPhoneLoginFlowManager(AccountKitConfiguration accountKitConfiguration, AccountKitActivity accountKitActivity, ActivityPhoneHandler activityPhoneHandler) {
        super(accountKitConfiguration);
        this.isValid = true;
        this.activity = accountKitActivity;
        this.phoneListeners = activityPhoneHandler;
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

    public void logInWithPhoneNumber(final PhoneNumber phoneNumber, NotificationChannel notificationChannel, ResponseType responseType, String str) {
        if (this.isValid != null) {
            AccessToken accessToken = null;
            notificationChannel = responseType == ResponseType.CODE ? "DEMOCODE" : null;
            if (responseType == ResponseType.TOKEN) {
                accessToken = getAccessToken();
            }
            this.loginModel = new DemoPhoneLoginModel(phoneNumber, str, notificationChannel, accessToken);
            setLastUsedPhoneNumber(phoneNumber);
            new Handler().postDelayed(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ DemoPhoneLoginFlowManager f3396b;

                /* renamed from: com.facebook.accountkit.ui.DemoPhoneLoginFlowManager$1$1 */
                class C12731 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C12741 f3394a;

                    C12731(C12741 c12741) {
                        this.f3394a = c12741;
                    }

                    public void run() {
                        this.f3394a.f3396b.phoneListeners.startSmsTrackerIfPossible(this.f3394a.f3396b.activity);
                        this.f3394a.f3396b.phoneListeners.getSmsTracker().mo3244a(DemoPhoneLoginFlowManager.MOCK_CONFIRMATION_CODE);
                    }
                }

                public void run() {
                    if (phoneNumber.getPhoneNumber().length() == 10) {
                        this.f3396b.broadcastLoginState(LoginStatus.PENDING, null);
                        new Handler().postDelayed(new C12731(this), DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
                        return;
                    }
                    this.f3396b.broadcastLoginState(LoginStatus.ERROR, new AccountKitError(Type.ARGUMENT_ERROR, new InternalAccountKitError(InternalAccountKitError.INVALID_CREDENTIALS_OR_LOGIN_REQUEST, null, "[Demo] use a 10 digit number")));
                }
            }, DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
        }
    }

    public void setConfirmationCode(final String str) {
        if (this.isValid) {
            new Handler().postDelayed(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ DemoPhoneLoginFlowManager f3398b;

                public void run() {
                    if (str.equals(DemoPhoneLoginFlowManager.MOCK_CONFIRMATION_CODE)) {
                        this.f3398b.broadcastLoginState(LoginStatus.SUCCESS, null);
                        return;
                    }
                    this.f3398b.broadcastLoginState(LoginStatus.ERROR, new AccountKitError(Type.ARGUMENT_ERROR, new InternalAccountKitError(InternalAccountKitError.INVALID_CREDENTIALS_OR_LOGIN_REQUEST, null, "[Demo] use confirmation code 123456")));
                }
            }, DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
        }
    }

    private void broadcastLoginState(LoginStatus loginStatus, AccountKitError accountKitError) {
        C0436c.m1648a(C1220c.m4288a()).m1653a(new Intent("com.facebook.accountkit.sdk.ACTION_PHONE_LOGIN_STATE_CHANGED").putExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_MODEL", this.loginModel).putExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_STATUS", loginStatus).putExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_ERROR", accountKitError));
    }

    private DemoPhoneLoginFlowManager(Parcel parcel) {
        super(parcel);
        this.isValid = true;
    }
}
