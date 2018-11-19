package com.facebook.accountkit.ui;

import android.app.Activity;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitException;
import com.facebook.accountkit.C3163c;
import com.facebook.accountkit.LoginResult;
import com.facebook.accountkit.PhoneLoginModel;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.internal.C1220c;
import com.facebook.accountkit.ui.StateStackManager.C1304a;
import com.facebook.accountkit.ui.StateStackManager.C1305b;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;

final class ActivityPhoneHandler extends ActivityHandler {
    public static final Creator<ActivityPhoneHandler> CREATOR = new C12619();
    private C3217x smsTracker;

    /* renamed from: com.facebook.accountkit.ui.ActivityPhoneHandler$9 */
    static class C12619 implements Creator<ActivityPhoneHandler> {
        C12619() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4541a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4542a(i);
        }

        /* renamed from: a */
        public ActivityPhoneHandler m4541a(Parcel parcel) {
            return new ActivityPhoneHandler(parcel);
        }

        /* renamed from: a */
        public ActivityPhoneHandler[] m4542a(int i) {
            return new ActivityPhoneHandler[i];
        }
    }

    ActivityPhoneHandler(@NonNull AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    public C3163c getLoginTracker(final AccountKitActivity accountKitActivity) {
        if (getPhoneTracker() == null) {
            this.tracker = new C3163c(this) {
                /* renamed from: b */
                final /* synthetic */ ActivityPhoneHandler f13018b;

                /* renamed from: com.facebook.accountkit.ui.ActivityPhoneHandler$1$2 */
                class C12602 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C41231 f3377a;

                    C12602(C41231 c41231) {
                        this.f3377a = c41231;
                    }

                    public void run() {
                        this.f3377a.m16010i();
                    }
                }

                /* renamed from: com.facebook.accountkit.ui.ActivityPhoneHandler$1$1 */
                class C31851 implements C1304a {
                    /* renamed from: a */
                    final /* synthetic */ C41231 f9764a;

                    C31851(C41231 c41231) {
                        this.f9764a = c41231;
                    }

                    /* renamed from: a */
                    public void mo1593a() {
                        C1314f c = accountKitActivity.m18734c();
                        if (c instanceof C4344n) {
                            ((C4344n) c).m16027a(true);
                        }
                    }
                }

                /* renamed from: a */
                protected void mo3240a(PhoneLoginModel phoneLoginModel) {
                    C1314f c = accountKitActivity.m18734c();
                    boolean z = c instanceof C4130v;
                    if (z || (c instanceof ae)) {
                        if (phoneLoginModel.getNotificationChannel() == NotificationChannel.SMS) {
                            this.f13018b.startSmsTrackerIfPossible(accountKitActivity);
                        }
                        if (z) {
                            accountKitActivity.m18728a(LoginFlowState.SENT_CODE, null);
                        } else {
                            accountKitActivity.m18727a(LoginFlowState.CODE_INPUT, new C31851(this));
                        }
                    }
                }

                /* renamed from: b */
                protected void mo3241b(PhoneLoginModel phoneLoginModel) {
                    if ((accountKitActivity.m18734c() instanceof C4130v) != null) {
                        accountKitActivity.m18728a(LoginFlowState.ACCOUNT_VERIFIED, null);
                    }
                }

                /* renamed from: c */
                protected void mo3242c(PhoneLoginModel phoneLoginModel) {
                    C1314f c = accountKitActivity.m18734c();
                    if ((c instanceof C4344n) || (c instanceof ae)) {
                        accountKitActivity.m18728a(LoginFlowState.VERIFIED, null);
                        accountKitActivity.m18731a(phoneLoginModel.getCode());
                        accountKitActivity.m18723a(phoneLoginModel.getAccessToken());
                        accountKitActivity.m18725a(LoginResult.SUCCESS);
                        accountKitActivity.m18733b(phoneLoginModel.getFinalAuthState());
                        phoneLoginModel = phoneLoginModel.getAccessToken();
                        if (phoneLoginModel != null) {
                            accountKitActivity.m18722a(phoneLoginModel.getTokenRefreshIntervalSeconds());
                        }
                        new Handler().postDelayed(new C12602(this), DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
                    }
                }

                /* renamed from: a */
                protected void mo3239a(AccountKitException accountKitException) {
                    accountKitActivity.m18724a(accountKitException.m4126a());
                }

                /* renamed from: d */
                protected void mo3243d(PhoneLoginModel phoneLoginModel) {
                    accountKitActivity.m18726a(null);
                }

                /* renamed from: i */
                private void m16010i() {
                    accountKitActivity.mo4067e();
                }
            };
        }
        return getPhoneTracker();
    }

    void onConfirmationCodeComplete(AccountKitActivity accountKitActivity, PhoneLoginFlowManager phoneLoginFlowManager, String str) {
        accountKitActivity.m18728a(LoginFlowState.VERIFYING_CODE, null);
        phoneLoginFlowManager.setConfirmationCode(str);
    }

    void onConfirmationCodeRetry(AccountKitActivity accountKitActivity) {
        accountKitActivity.m18728a(LoginFlowState.RESEND, getResendOnPushListener());
    }

    private C1305b getResendOnPushListener() {
        final PhoneLoginModel f = AccountKit.m4117f();
        final String phoneNumber = f != null ? f.getPhoneNumber().toString() : null;
        if (phoneNumber == null) {
            return null;
        }
        return new C1305b(this) {
            /* renamed from: c */
            final /* synthetic */ ActivityPhoneHandler f9767c;

            /* renamed from: a */
            public void mo1607a() {
            }

            /* renamed from: a */
            public void mo1608a(C1314f c1314f) {
                if (c1314f instanceof ResendContentController) {
                    ResendContentController resendContentController = (ResendContentController) c1314f;
                    resendContentController.m16101a(phoneNumber);
                    resendContentController.m16102a(this.f9767c.configuration.getNotificationChannels());
                    resendContentController.m16098a(f.getResendTime());
                }
            }
        };
    }

    void onPhoneLoginComplete(AccountKitActivity accountKitActivity, PhoneLoginFlowManager phoneLoginFlowManager, PhoneNumber phoneNumber) {
        phoneLoginFlowManager.setNotificationChannel(NotificationChannel.SMS);
        accountKitActivity.m18728a(LoginFlowState.SENDING_CODE, null);
        phoneLoginFlowManager.logInWithPhoneNumber(phoneNumber, NotificationChannel.SMS, this.configuration.getResponseType(), this.configuration.getInitialAuthState());
    }

    void onResend(AccountKitActivity accountKitActivity) {
        AccountKit.m4115d();
        popToPhoneNumberInput(accountKitActivity);
    }

    private void popToPhoneNumberInput(final AccountKitActivity accountKitActivity) {
        C1314f c = accountKitActivity.m18734c();
        if (c instanceof ResendContentController) {
            accountKitActivity.m18729a(new C1304a(this) {
                /* renamed from: b */
                final /* synthetic */ ActivityPhoneHandler f9769b;

                /* renamed from: a */
                public void mo1593a() {
                    this.f9769b.popToPhoneNumberInput(accountKitActivity);
                }
            });
        } else if (c instanceof C4344n) {
            accountKitActivity.m18727a(LoginFlowState.PHONE_NUMBER_INPUT, new C1304a(this) {
                /* renamed from: b */
                final /* synthetic */ ActivityPhoneHandler f9771b;

                /* renamed from: a */
                public void mo1593a() {
                    this.f9771b.resendSetRetry(accountKitActivity);
                }
            });
        }
    }

    private void resendSetRetry(AccountKitActivity accountKitActivity) {
        C1314f c = accountKitActivity.m18734c();
        if (c instanceof C4347q) {
            ((C4347q) c).mo3701o();
            c.mo1630a((Activity) accountKitActivity);
        }
    }

    void onResendFacebookNotification(final AccountKitActivity accountKitActivity, final PhoneLoginFlowManager phoneLoginFlowManager) {
        PhoneLoginModel f = AccountKit.m4117f();
        if (f != null) {
            phoneLoginFlowManager.setNotificationChannel(NotificationChannel.FACEBOOK);
            final PhoneNumber phoneNumber = f.getPhoneNumber();
            accountKitActivity.m18729a(new C1304a(this) {
                /* renamed from: d */
                final /* synthetic */ ActivityPhoneHandler f9776d;

                /* renamed from: com.facebook.accountkit.ui.ActivityPhoneHandler$5$1 */
                class C31891 implements C1304a {
                    /* renamed from: a */
                    final /* synthetic */ C31905 f9772a;

                    C31891(C31905 c31905) {
                        this.f9772a = c31905;
                    }

                    /* renamed from: a */
                    public void mo1593a() {
                        accountKitActivity.m18728a(LoginFlowState.SENDING_CODE, null);
                        phoneLoginFlowManager.logInWithPhoneNumber(phoneNumber, NotificationChannel.FACEBOOK, this.f9772a.f9776d.configuration.getResponseType(), this.f9772a.f9776d.configuration.getInitialAuthState());
                    }
                }

                /* renamed from: a */
                public void mo1593a() {
                    accountKitActivity.m18727a(LoginFlowState.SENT_CODE, new C31891(this));
                }
            });
        }
    }

    void onResendVoiceCallNotification(final AccountKitActivity accountKitActivity, final PhoneLoginFlowManager phoneLoginFlowManager) {
        PhoneLoginModel f = AccountKit.m4117f();
        if (f != null) {
            phoneLoginFlowManager.setNotificationChannel(NotificationChannel.VOICE_CALLBACK);
            final PhoneNumber phoneNumber = f.getPhoneNumber();
            accountKitActivity.m18729a(new C1304a(this) {
                /* renamed from: d */
                final /* synthetic */ ActivityPhoneHandler f9781d;

                /* renamed from: com.facebook.accountkit.ui.ActivityPhoneHandler$6$1 */
                class C31911 implements C1304a {
                    /* renamed from: a */
                    final /* synthetic */ C31926 f9777a;

                    C31911(C31926 c31926) {
                        this.f9777a = c31926;
                    }

                    /* renamed from: a */
                    public void mo1593a() {
                        accountKitActivity.m18728a(LoginFlowState.SENDING_CODE, null);
                        phoneLoginFlowManager.logInWithPhoneNumber(phoneNumber, NotificationChannel.VOICE_CALLBACK, this.f9777a.f9781d.configuration.getResponseType(), this.f9777a.f9781d.configuration.getInitialAuthState());
                    }
                }

                /* renamed from: a */
                public void mo1593a() {
                    accountKitActivity.m18727a(LoginFlowState.SENT_CODE, new C31911(this));
                }
            });
        }
    }

    C1305b getConfirmationCodePushListener(final AccountKitActivity accountKitActivity) {
        return new C1305b(this) {
            /* renamed from: b */
            final /* synthetic */ ActivityPhoneHandler f9783b;

            /* renamed from: a */
            public void mo1607a() {
            }

            /* renamed from: a */
            public void mo1608a(C1314f c1314f) {
                if (c1314f instanceof C4344n) {
                    PhoneLoginModel f = AccountKit.m4117f();
                    if (f != null) {
                        C4344n c4344n = (C4344n) c1314f;
                        c4344n.m16023a(f.getPhoneNumber());
                        c4344n.m17703a(f.getNotificationChannel());
                        c4344n.m16026a(this.f9783b.getLoginTracker(accountKitActivity).mo1565b());
                    }
                }
            }
        };
    }

    public void onSentCodeComplete(AccountKitActivity accountKitActivity) {
        accountKitActivity.m18728a(LoginFlowState.CODE_INPUT, null);
    }

    public void onAccountVerifiedComplete(AccountKitActivity accountKitActivity) {
        accountKitActivity.m18728a(LoginFlowState.CONFIRM_ACCOUNT_VERIFIED, null);
    }

    C3217x getSmsTracker() {
        return this.smsTracker;
    }

    void startSmsTrackerIfPossible(final AccountKitActivity accountKitActivity) {
        if (C3217x.m12265a(C1220c.m4288a(), this.configuration)) {
            if (this.smsTracker == null) {
                this.smsTracker = new C3217x(this) {
                    /* renamed from: b */
                    final /* synthetic */ ActivityPhoneHandler f13020b;

                    /* renamed from: a */
                    protected void mo3244a(String str) {
                        C1314f c = accountKitActivity.m18734c();
                        if (!(c instanceof C4130v)) {
                            if (!(c instanceof C4131w)) {
                                if (c instanceof C4344n) {
                                    ((C4344n) c).m16026a(str);
                                }
                                this.f13020b.smsTracker.m4138d();
                            }
                        }
                        this.f13020b.getPhoneTracker().m12190a(str);
                        this.f13020b.smsTracker.m4138d();
                    }
                };
            }
            this.smsTracker.m4137c();
        }
    }

    void pauseSmsTracker() {
        if (this.smsTracker != null) {
            this.smsTracker.m4139e();
        }
    }

    void stopSmsTracker() {
        if (this.smsTracker != null) {
            this.smsTracker.m4138d();
        }
    }

    boolean isSmsTracking() {
        return this.smsTracker != null && this.smsTracker.m4141g();
    }

    private ActivityPhoneHandler(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    private C3163c getPhoneTracker() {
        return (C3163c) this.tracker;
    }
}
