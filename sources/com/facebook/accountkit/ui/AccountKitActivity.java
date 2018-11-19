package com.facebook.accountkit.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;
import com.facebook.accountkit.AccountKitLoginResult;
import com.facebook.accountkit.C1198e;
import com.facebook.accountkit.LoginResult;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.internal.C1251w;
import com.facebook.accountkit.internal.InternalAccountKitError;
import com.facebook.accountkit.ui.LoginFlowBroadcastReceiver.Event;
import com.facebook.accountkit.ui.StateStackManager.C1304a;
import com.facebook.accountkit.ui.StateStackManager.C1305b;
import com.google.android.gms.auth.api.C2422a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.C2464a;
import com.tinder.api.ManagerWebServices;

public final class AccountKitActivity extends C4461a {
    /* renamed from: e */
    private static final String f14867e = "AccountKitActivity";
    /* renamed from: g */
    private static final String f14868g;
    /* renamed from: h */
    private static final String f14869h;
    /* renamed from: i */
    private static final String f14870i;
    /* renamed from: j */
    private static final IntentFilter f14871j = LoginFlowBroadcastReceiver.m4564a();
    /* renamed from: f */
    private GoogleApiClient f14872f;
    /* renamed from: k */
    private AccessToken f14873k;
    /* renamed from: l */
    private String f14874l;
    /* renamed from: m */
    private C1198e f14875m;
    /* renamed from: n */
    private AccountKitError f14876n;
    /* renamed from: o */
    private String f14877o;
    /* renamed from: p */
    private boolean f14878p;
    @Nullable
    /* renamed from: q */
    private LoginFlowManager f14879q;
    /* renamed from: r */
    private LoginResult f14880r = LoginResult.CANCELLED;
    /* renamed from: s */
    private StateStackManager f14881s;
    /* renamed from: t */
    private long f14882t;
    /* renamed from: u */
    private final Bundle f14883u = new Bundle();
    /* renamed from: v */
    private final BroadcastReceiver f14884v = new C31821(this);

    public enum ResponseType {
        CODE("code"),
        TOKEN(ManagerWebServices.PARAM_TOKEN);
        
        private final String value;

        private ResponseType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    @Deprecated
    public enum TitleType {
        APP_NAME,
        LOGIN
    }

    /* renamed from: com.facebook.accountkit.ui.AccountKitActivity$1 */
    class C31821 extends LoginFlowBroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ AccountKitActivity f9760a;

        C31821(AccountKitActivity accountKitActivity) {
            this.f9760a = accountKitActivity;
        }

        public void onReceive(Context context, Intent intent) {
            if (LoginFlowBroadcastReceiver.f3413b.contentEquals(intent.getAction()) != null) {
                Event event = (Event) intent.getSerializableExtra(c);
                C1314f a = this.f9760a.f14881s.m16115a();
                PhoneLoginFlowManager phoneLoginFlowManager;
                PhoneLoginFlowManager phoneLoginFlowManager2;
                switch (event) {
                    case SENT_CODE_COMPLETE:
                        this.f9760a.f14879q.getActivityHandler().onSentCodeComplete(this.f9760a);
                        break;
                    case ACCOUNT_VERIFIED_COMPLETE:
                        this.f9760a.f14879q.getActivityHandler().onAccountVerifiedComplete(this.f9760a);
                        break;
                    case CONFIRM_SEAMLESS_LOGIN:
                        this.f9760a.f14879q.getActivityHandler().onConfirmSeamlessLogin(this.f9760a, this.f9760a.f14879q);
                        break;
                    case EMAIL_LOGIN_COMPLETE:
                        if ((a instanceof EmailLoginContentController) != null) {
                            context = intent.getStringExtra(d);
                            EmailLoginFlowManager emailLoginFlowManager = (EmailLoginFlowManager) this.f9760a.f14879q;
                            ((ActivityEmailHandler) emailLoginFlowManager.getActivityHandler()).onEmailLoginComplete(this.f9760a, emailLoginFlowManager, context);
                            break;
                        }
                        break;
                    case EMAIL_VERIFY_RETRY:
                        if ((a instanceof C4128l) != null) {
                            ((ActivityEmailHandler) this.f9760a.f14879q.getActivityHandler()).onEmailVerifyRetry(this.f9760a);
                            break;
                        }
                        break;
                    case ERROR_RESTART:
                        if ((a instanceof C4346o) != null) {
                            C1312c.m4621a(this.f9760a, LoginFlowState.values()[intent.getIntExtra(g, 0)]);
                            break;
                        }
                        break;
                    case PHONE_LOGIN_COMPLETE:
                        if ((a instanceof C4347q) != null) {
                            PhoneNumber phoneNumber = (PhoneNumber) intent.getParcelableExtra(f);
                            phoneLoginFlowManager = (PhoneLoginFlowManager) this.f9760a.f14879q;
                            ((ActivityPhoneHandler) phoneLoginFlowManager.getActivityHandler()).onPhoneLoginComplete(this.f9760a, phoneLoginFlowManager, phoneNumber);
                            break;
                        }
                        break;
                    case PHONE_CONFIRMATION_CODE_COMPLETE:
                        if ((a instanceof C4344n) != null) {
                            context = intent.getStringExtra(e);
                            phoneLoginFlowManager = (PhoneLoginFlowManager) this.f9760a.f14879q;
                            ((ActivityPhoneHandler) phoneLoginFlowManager.getActivityHandler()).onConfirmationCodeComplete(this.f9760a, phoneLoginFlowManager, context);
                            break;
                        }
                        break;
                    case PHONE_CONFIRMATION_CODE_RETRY:
                        if ((a instanceof C4344n) != null) {
                            ((ActivityPhoneHandler) this.f9760a.f14879q.getActivityHandler()).onConfirmationCodeRetry(this.f9760a);
                            break;
                        }
                        break;
                    case PHONE_RESEND:
                        if (!((a instanceof ResendContentController) == null && (a instanceof C4344n) == null)) {
                            ((ActivityPhoneHandler) this.f9760a.f14879q.getActivityHandler()).onResend(this.f9760a);
                            break;
                        }
                    case PHONE_RESEND_FACEBOOK_NOTIFICATION:
                        if ((a instanceof ResendContentController) != null) {
                            phoneLoginFlowManager2 = (PhoneLoginFlowManager) this.f9760a.f14879q;
                            ((ActivityPhoneHandler) phoneLoginFlowManager2.getActivityHandler()).onResendFacebookNotification(this.f9760a, phoneLoginFlowManager2);
                            break;
                        }
                        break;
                    case PHONE_RESEND_VOICE_CALL_NOTIFICATION:
                        if ((a instanceof ResendContentController) != null) {
                            phoneLoginFlowManager2 = (PhoneLoginFlowManager) this.f9760a.f14879q;
                            ((ActivityPhoneHandler) phoneLoginFlowManager2.getActivityHandler()).onResendVoiceCallNotification(this.f9760a, phoneLoginFlowManager2);
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }

    /* renamed from: com.facebook.accountkit.ui.AccountKitActivity$2 */
    class C31832 implements C1304a {
        /* renamed from: a */
        final /* synthetic */ AccountKitActivity f9761a;

        C31832(AccountKitActivity accountKitActivity) {
            this.f9761a = accountKitActivity;
        }

        /* renamed from: a */
        public void mo1593a() {
            this.f9761a.m18734c().mo1630a(this.f9761a);
        }
    }

    /* renamed from: a */
    public GoogleApiClient m18721a() {
        return this.f14872f;
    }

    @Nullable
    /* renamed from: b */
    public LoginFlowState m18732b() {
        return this.f14879q != null ? this.f14879q.getFlowState() : null;
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f14867e);
        stringBuilder.append(".loginFlowManager");
        f14868g = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f14867e);
        stringBuilder.append(".pendingLoginFlowState");
        f14869h = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f14867e);
        stringBuilder.append(".trackingSms");
        f14870i = stringBuilder.toString();
    }

    /* renamed from: c */
    private static boolean m18719c(@NonNull String str) {
        return str.startsWith(C1251w.m4512e());
    }

    /* renamed from: c */
    C1314f m18734c() {
        return this.f14881s.m16115a();
    }

    public void onBackPressed() {
        if (this.f14881s.m16115a() == null) {
            super.onBackPressed();
        } else {
            m18720f();
        }
    }

    public void onBackPressed(View view) {
        onBackPressed();
    }

    public void onCancelPressed(View view) {
        m18735d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String dataString = getIntent().getDataString();
        if (dataString == null || m18719c(dataString)) {
            if (this.b != null) {
                if (this.b.getLoginType() != null) {
                    if (this.b.getResponseType() == null) {
                        this.f14876n = new AccountKitError(Type.INITIALIZATION_ERROR, InternalAccountKitError.INVALID_INTENT_EXTRAS_RESPONSE_TYPE);
                        mo4067e();
                        return;
                    }
                    this.f14881s = new StateStackManager(this, this.b);
                    AccountKit.m4111a(this, bundle);
                    m18715a(this.f14883u, bundle != null ? true : null);
                    C0436c.m1648a((Context) this).m1652a(this.f14884v, f14871j);
                    this.f14872f = new C2464a(this).m8854a(C2422a.f7346d).m8860b();
                    return;
                }
            }
            this.f14876n = new AccountKitError(Type.INITIALIZATION_ERROR, InternalAccountKitError.INVALID_INTENT_EXTRAS_LOGIN_TYPE);
            mo4067e();
            return;
        }
        mo4067e();
    }

    protected void onStart() {
        super.onStart();
        this.f14872f.mo2504e();
    }

    protected void onStop() {
        super.onStop();
        this.f14872f.mo2506g();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C1314f c = m18734c();
        if (c != null) {
            c.mo1629a(i, i2, intent);
        }
    }

    public void onPause() {
        super.onPause();
        C1314f c = m18734c();
        if (c != null) {
            c.mo1631b((Activity) this);
        }
        this.f14878p = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        AccountKit.m4112b(this, bundle);
        if (this.f14879q.getLoginType() == LoginType.PHONE) {
            ActivityPhoneHandler activityPhoneHandler = (ActivityPhoneHandler) this.f14879q.getActivityHandler();
            this.f14883u.putBoolean(f14870i, activityPhoneHandler.isSmsTracking());
            activityPhoneHandler.pauseSmsTracker();
            this.f14883u.putParcelable(f14868g, this.f14879q);
        }
        if (this.f14875m != null) {
            this.f14875m.m4139e();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String dataString = intent.getDataString();
        if (dataString != null) {
            if (m18719c(dataString) == null) {
                mo4067e();
                return;
            }
            if ((m18734c() instanceof C4128l) != null) {
                m18728a(LoginFlowState.VERIFYING_CODE, null);
            }
        }
    }

    /* renamed from: a */
    private void m18715a(Bundle bundle, boolean z) {
        m18726a((LoginFlowManager) bundle.getParcelable(f14868g));
        if (!z) {
            if (this.b != null) {
                switch (this.b.getLoginType()) {
                    case PHONE:
                        m18728a(LoginFlowState.PHONE_NUMBER_INPUT, null);
                        break;
                    case EMAIL:
                        m18728a(LoginFlowState.EMAIL_INPUT, null);
                        break;
                    default:
                        this.f14876n = new AccountKitError(Type.INITIALIZATION_ERROR, InternalAccountKitError.INVALID_LOGIN_TYPE);
                        mo4067e();
                        break;
                }
            }
            return;
        }
        this.f14881s.m16116a(this);
    }

    protected void onResume() {
        super.onResume();
        C1314f c = m18734c();
        if (c != null) {
            c.mo1630a((Activity) this);
        }
        this.f14878p = true;
        if (this.b != null) {
            switch (this.b.getLoginType()) {
                case PHONE:
                case EMAIL:
                    this.f14875m = this.f14879q.getActivityHandler().getLoginTracker(this);
                    this.f14875m.m4137c();
                    break;
                default:
                    break;
            }
            if (this.f14879q.getLoginType() == LoginType.PHONE && (this.f14879q.getFlowState() == LoginFlowState.SENDING_CODE || this.f14883u.getBoolean(f14870i, false))) {
                ((ActivityPhoneHandler) this.f14879q.getActivityHandler()).startSmsTrackerIfPossible(this);
            }
            String string = this.f14883u.getString(f14869h);
            if (!C1251w.m4500a(string)) {
                this.f14883u.putString(f14869h, null);
                m18728a(LoginFlowState.valueOf(string), null);
            }
        }
    }

    protected void onDestroy() {
        C0436c.m1648a((Context) this).m1651a(this.f14884v);
        super.onDestroy();
        if (this.f14875m != null) {
            this.f14875m.m4138d();
            this.f14875m = null;
        }
        if (this.f14879q != null && this.f14879q.getLoginType() == LoginType.PHONE) {
            ((ActivityPhoneHandler) this.f14879q.getActivityHandler()).stopSmsTracker();
        }
        AccountKit.m4110a(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        m18720f();
        return true;
    }

    /* renamed from: d */
    void m18735d() {
        m18714a(0, new AccountKitLoginResultImpl(null, null, null, 0, null, true));
    }

    /* renamed from: e */
    void mo4067e() {
        m18714a(this.f14880r == LoginResult.SUCCESS ? -1 : 0, new AccountKitLoginResultImpl(this.f14873k, this.f14874l, this.f14877o, this.f14882t, this.f14876n, false));
    }

    /* renamed from: a */
    private void m18714a(int i, AccountKitLoginResult accountKitLoginResult) {
        if (getCallingActivity() == null) {
            startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(AccountKitLoginResult.RESULT_KEY, accountKitLoginResult);
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    void m18731a(String str) {
        this.f14874l = str;
    }

    /* renamed from: b */
    void m18733b(String str) {
        this.f14877o = str;
    }

    /* renamed from: a */
    void m18723a(AccessToken accessToken) {
        this.f14873k = accessToken;
    }

    /* renamed from: a */
    void m18722a(long j) {
        this.f14882t = j;
    }

    /* renamed from: a */
    void m18725a(LoginResult loginResult) {
        this.f14880r = loginResult;
    }

    /* renamed from: f */
    private void m18720f() {
        C1314f a = this.f14881s.m16115a();
        if (a != null) {
            if (a instanceof C4344n) {
                ((C4344n) a).m16027a(false);
            }
            m18730a(a);
            LoginFlowState d = a.mo3261d();
            LoginFlowState backState = LoginFlowState.getBackState(d);
            switch (d) {
                case NONE:
                case PHONE_NUMBER_INPUT:
                case EMAIL_INPUT:
                    m18735d();
                    break;
                case SENDING_CODE:
                case SENT_CODE:
                case CODE_INPUT:
                case ACCOUNT_VERIFIED:
                case CONFIRM_ACCOUNT_VERIFIED:
                case CONFIRM_INSTANT_VERIFICATION_LOGIN:
                case EMAIL_VERIFY:
                case VERIFYING_CODE:
                case RESEND:
                    m18716a(d, backState);
                    break;
                case ERROR:
                    m18716a(d, ((C4346o) a).m17716g());
                    break;
                case VERIFIED:
                    mo4067e();
                    break;
                default:
                    m18716a(d, LoginFlowState.NONE);
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m18716a(LoginFlowState loginFlowState, LoginFlowState loginFlowState2) {
        this.f14879q.setFlowState(loginFlowState2);
        C1304a c31832 = new C31832(this);
        if (loginFlowState != LoginFlowState.RESEND) {
            m18726a((LoginFlowManager) null);
        }
        m18727a(loginFlowState2, c31832);
    }

    /* renamed from: a */
    void m18726a(LoginFlowManager loginFlowManager) {
        LoginFlowState loginFlowState;
        if (this.f14879q == null) {
            loginFlowState = LoginFlowState.NONE;
        } else {
            loginFlowState = this.f14879q.getFlowState();
        }
        if (loginFlowManager == null && this.f14879q != null) {
            this.f14879q.cancel();
        }
        switch (this.b.getLoginType()) {
            case PHONE:
                this.f14879q = new PhoneLoginFlowManager(this.b);
                this.f14879q.setFlowState(loginFlowState);
                return;
            case EMAIL:
                this.f14879q = new EmailLoginFlowManager(this.b);
                this.f14879q.setFlowState(loginFlowState);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    void m18727a(@NonNull LoginFlowState loginFlowState, @Nullable C1304a c1304a) {
        this.f14881s.m16119a(loginFlowState, c1304a);
    }

    /* renamed from: a */
    void m18729a(@Nullable C1304a c1304a) {
        this.f14881s.m16120a(c1304a);
    }

    /* renamed from: a */
    void m18724a(@Nullable AccountKitError accountKitError) {
        String userFacingMessage = accountKitError == null ? null : accountKitError.getUserFacingMessage();
        this.f14876n = accountKitError;
        LoginFlowState backState = LoginFlowState.getBackState(this.f14879q.getFlowState());
        this.f14879q.setFlowState(LoginFlowState.ERROR);
        this.f14881s.m16117a(this, this.f14879q, backState, accountKitError, this.f14881s.m16114a(userFacingMessage));
    }

    /* renamed from: a */
    void m18728a(LoginFlowState loginFlowState, @Nullable C1305b c1305b) {
        if (this.f14878p) {
            this.f14879q.setFlowState(loginFlowState);
            if (c1305b == null) {
                int i = C12533.f3362c[loginFlowState.ordinal()];
                if (i == 6) {
                    c1305b = ((ActivityPhoneHandler) this.f14879q.getActivityHandler()).getConfirmationCodePushListener(this);
                } else if (i == 13) {
                    m18724a(null);
                    return;
                }
            }
            this.f14881s.m16118a(this, this.f14879q, c1305b);
        } else {
            this.f14883u.putString(f14869h, loginFlowState.name());
        }
        if (loginFlowState.equals(LoginFlowState.ERROR) == null) {
            this.f14876n = null;
        }
    }

    /* renamed from: a */
    void m18730a(C1314f c1314f) {
        if (c1314f != null) {
            c1314f.mo1631b((Activity) this);
            m18718c(c1314f);
        }
    }

    /* renamed from: c */
    private void m18718c(C1314f c1314f) {
        if (this.b != null) {
            if (c1314f instanceof C4347q) {
                C1219a.m4257a();
            } else if (c1314f instanceof C4130v) {
                C1219a.m4275b(false, this.b.getLoginType());
            } else if (c1314f instanceof C4131w) {
                C1219a.m4280c(false, this.b.getLoginType());
            } else if (c1314f instanceof C4344n) {
                C1219a.m4271b();
            } else if (c1314f instanceof ae) {
                C1219a.m4284d(false, this.b.getLoginType());
            } else if (c1314f instanceof ad) {
                C1219a.m4286e(false, this.b.getLoginType());
            } else if (c1314f instanceof C4346o) {
                C1219a.m4269a(false, this.b.getLoginType());
            } else if (c1314f instanceof EmailLoginContentController) {
                C1219a.m4281d();
            } else if (c1314f instanceof C4128l) {
                C1219a.m4283d(false);
            } else if (c1314f instanceof ResendContentController) {
                C1219a.m4279c(false);
            } else if (c1314f instanceof C4126e) {
                C1219a.m4287f(false);
            } else if (c1314f instanceof C4125b) {
                C1219a.m4285e(false);
            } else {
                throw new AccountKitException(Type.INTERNAL_ERROR, InternalAccountKitError.UNEXPECTED_FRAGMENT, c1314f.getClass().getName());
            }
        }
    }
}
