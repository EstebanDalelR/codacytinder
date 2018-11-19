package com.facebook.accountkit.ui;

import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitException;
import com.facebook.accountkit.C3162a;
import com.facebook.accountkit.EmailLoginModel;
import com.facebook.accountkit.LoginResult;
import com.facebook.accountkit.ui.StateStackManager.C1304a;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;

final class ActivityEmailHandler extends ActivityHandler {
    public static final Creator<ActivityEmailHandler> CREATOR = new C12593();

    /* renamed from: com.facebook.accountkit.ui.ActivityEmailHandler$3 */
    static class C12593 implements Creator<ActivityEmailHandler> {
        C12593() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4539a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4540a(i);
        }

        /* renamed from: a */
        public ActivityEmailHandler m4539a(Parcel parcel) {
            return new ActivityEmailHandler(parcel);
        }

        /* renamed from: a */
        public ActivityEmailHandler[] m4540a(int i) {
            return new ActivityEmailHandler[i];
        }
    }

    public ActivityEmailHandler(@NonNull AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    public C3162a getLoginTracker(final AccountKitActivity accountKitActivity) {
        if (getEmailTracker() == null) {
            this.tracker = new C3162a(this) {
                /* renamed from: b */
                final /* synthetic */ ActivityEmailHandler f13016b;

                /* renamed from: com.facebook.accountkit.ui.ActivityEmailHandler$1$1 */
                class C12581 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C41221 f3376a;

                    C12581(C41221 c41221) {
                        this.f3376a = c41221;
                    }

                    public void run() {
                        this.f3376a.m16003b();
                    }
                }

                /* renamed from: a */
                protected void mo3235a(EmailLoginModel emailLoginModel) {
                    if ((accountKitActivity.m18734c() instanceof C4130v) != null) {
                        accountKitActivity.m18728a(LoginFlowState.SENT_CODE, null);
                    }
                }

                /* renamed from: d */
                protected void mo3238d(EmailLoginModel emailLoginModel) {
                    if ((accountKitActivity.m18734c() instanceof C4130v) != null) {
                        accountKitActivity.m18728a(LoginFlowState.ACCOUNT_VERIFIED, null);
                    }
                }

                /* renamed from: b */
                protected void mo3236b(EmailLoginModel emailLoginModel) {
                    C1314f c = accountKitActivity.m18734c();
                    if ((c instanceof C4128l) || (c instanceof ae)) {
                        accountKitActivity.m18728a(LoginFlowState.VERIFIED, null);
                        accountKitActivity.m18733b(emailLoginModel.getFinalAuthState());
                        accountKitActivity.m18723a(emailLoginModel.getAccessToken());
                        accountKitActivity.m18731a(emailLoginModel.getCode());
                        accountKitActivity.m18725a(LoginResult.SUCCESS);
                        emailLoginModel = emailLoginModel.getAccessToken();
                        if (emailLoginModel != null) {
                            accountKitActivity.m18722a(emailLoginModel.getTokenRefreshIntervalSeconds());
                        }
                        new Handler().postDelayed(new C12581(this), DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
                    }
                }

                /* renamed from: a */
                protected void mo3234a(AccountKitException accountKitException) {
                    accountKitActivity.m18724a(accountKitException.m4126a());
                }

                /* renamed from: c */
                protected void mo3237c(EmailLoginModel emailLoginModel) {
                    accountKitActivity.m18726a(null);
                }

                /* renamed from: b */
                private void m16003b() {
                    accountKitActivity.mo4067e();
                }
            };
        }
        return getEmailTracker();
    }

    public void onEmailLoginComplete(AccountKitActivity accountKitActivity, EmailLoginFlowManager emailLoginFlowManager, String str) {
        accountKitActivity.m18728a(LoginFlowState.SENDING_CODE, null);
        emailLoginFlowManager.setEmail(str);
        emailLoginFlowManager.logInWithEmail(this.configuration.getResponseType(), this.configuration.getInitialAuthState());
    }

    public void onEmailVerifyRetry(final AccountKitActivity accountKitActivity) {
        AccountKit.m4115d();
        accountKitActivity.m18727a(LoginFlowState.EMAIL_INPUT, new C1304a(this) {
            /* renamed from: b */
            final /* synthetic */ ActivityEmailHandler f9763b;

            /* renamed from: a */
            public void mo1593a() {
                this.f9763b.emailVerifySetRetry(accountKitActivity);
            }
        });
    }

    private void emailVerifySetRetry(AccountKitActivity accountKitActivity) {
        accountKitActivity = accountKitActivity.m18734c();
        if (accountKitActivity instanceof EmailLoginContentController) {
            ((EmailLoginContentController) accountKitActivity).m16067j();
        }
    }

    public void onSentCodeComplete(AccountKitActivity accountKitActivity) {
        if (accountKitActivity.m18734c() instanceof C4131w) {
            accountKitActivity.m18728a(LoginFlowState.EMAIL_VERIFY, null);
        }
    }

    public void onAccountVerifiedComplete(AccountKitActivity accountKitActivity) {
        accountKitActivity.m18728a(LoginFlowState.CONFIRM_ACCOUNT_VERIFIED, null);
    }

    protected ActivityEmailHandler(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    private C3162a getEmailTracker() {
        return (C3162a) this.tracker;
    }
}
