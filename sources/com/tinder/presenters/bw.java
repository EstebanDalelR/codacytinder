package com.tinder.presenters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKitLoginResult;
import com.facebook.login.C1772e;
import com.tinder.analytics.experiment.C6220a;
import com.tinder.auth.interactor.AddSmsValidateEvent;
import com.tinder.auth.interactor.AddSmsValidateEvent.C8275a;
import com.tinder.auth.interactor.AddSmsValidateEvent.EventCode;
import com.tinder.auth.interactor.AddSmsValidateEvent.VerifyMethod;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C10336s;
import com.tinder.auth.interactor.C8276b;
import com.tinder.auth.interactor.C8277d;
import com.tinder.auth.interactor.C8279j;
import com.tinder.auth.interactor.C8280l;
import com.tinder.auth.interactor.C8281o;
import com.tinder.auth.interactor.C8283q;
import com.tinder.auth.model.AuthState;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.model.C8288b;
import com.tinder.auth.model.C8290e;
import com.tinder.auth.model.C8292g;
import com.tinder.auth.p167b.C8272a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.auth.UserAttribute;
import com.tinder.interactors.C9713a;
import com.tinder.managers.C2652a;
import com.tinder.model.DefaultObserver;
import com.tinder.model.auth.AuthErrorType;
import com.tinder.model.auth.AuthException;
import com.tinder.model.auth.ValidationStatus;
import com.tinder.onboarding.model.OnboardingEventCode;
import com.tinder.session.usecase.C14838f;
import com.tinder.smsauth.entity.C14976d;
import com.tinder.targets.LoginTarget;
import com.tinder.utils.RxUtils;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.concurrent.TimeUnit;
import java8.util.Optional;
import javax.inject.Inject;
import javax.inject.Singleton;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Observable;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Singleton
public class bw extends PresenterBase<LoginTarget> implements FacebookCallback<C1772e> {
    /* renamed from: a */
    boolean f55211a = false;
    /* renamed from: b */
    private final C9713a f55212b;
    /* renamed from: c */
    private final C10333h f55213c;
    /* renamed from: d */
    private final C8276b f55214d;
    /* renamed from: e */
    private final C8281o f55215e;
    /* renamed from: f */
    private final C8283q f55216f;
    /* renamed from: g */
    private final AbTestUtility f55217g;
    /* renamed from: h */
    private final C8279j f55218h;
    /* renamed from: i */
    private final C8277d f55219i;
    /* renamed from: j */
    private final C10336s f55220j;
    /* renamed from: k */
    private final AddSmsValidateEvent f55221k;
    /* renamed from: l */
    private final C14838f f55222l;
    /* renamed from: m */
    private final C2652a f55223m;
    /* renamed from: n */
    private final C8280l f55224n;
    /* renamed from: o */
    private final C8272a f55225o;
    /* renamed from: p */
    private final C6220a f55226p;
    /* renamed from: q */
    private final C19573b f55227q = new C19573b();

    /* renamed from: com.tinder.presenters.bw$1 */
    static /* synthetic */ class C143551 {
        /* renamed from: a */
        static final /* synthetic */ int[] f45549a = new int[AuthState.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.auth.model.AuthState.values();
            r0 = r0.length;
            r0 = new int[r0];
            f45549a = r0;
            r0 = f45549a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.auth.model.AuthState.ONBOARDING_REQUIRED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f45549a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.auth.model.AuthState.VALIDATION_REQUIRED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f45549a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.auth.model.AuthState.AUTHENTICATED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.presenters.bw.1.<clinit>():void");
        }
    }

    /* renamed from: com.tinder.presenters.bw$a */
    private class C17742a extends DefaultObserver<C8288b> {
        @NonNull
        /* renamed from: a */
        protected final AuthType f55209a;
        /* renamed from: b */
        final /* synthetic */ bw f55210b;

        public /* synthetic */ void onNext(Object obj) {
            m64629a((C8288b) obj);
        }

        C17742a(bw bwVar, @NonNull AuthType authType) {
            this.f55210b = bwVar;
            this.f55209a = authType;
        }

        /* renamed from: a */
        public void m64629a(C8288b c8288b) {
            this.f55210b.m64634a(c8288b);
        }

        public void onError(Throwable th) {
            super.onError(th);
            if (AuthType.ACCOUNTKIT.equals(this.f55209a)) {
                this.f55210b.m64651s();
            } else if (AuthType.FACEBOOK.equals(this.f55209a)) {
                this.f55210b.f55215e.c();
            }
            this.f55210b.a(new dd(this, th));
        }

        /* renamed from: a */
        final /* synthetic */ void m64630a(Throwable th, LoginTarget loginTarget) {
            if (th instanceof AuthException) {
                this.f55210b.m64638a((AuthException) th, loginTarget);
            } else {
                loginTarget.showLoginFailedDialog(Optional.m59119a());
            }
        }
    }

    /* renamed from: m */
    static final /* synthetic */ void m64649m() {
    }

    /* renamed from: q */
    static final /* synthetic */ void m64650q() {
    }

    /* renamed from: r */
    final /* synthetic */ void m64682r() {
        m64651s();
    }

    public /* synthetic */ void onSuccess(@NonNull Object obj) {
        m64657a((C1772e) obj);
    }

    @Inject
    public bw(C9713a c9713a, C10333h c10333h, C8276b c8276b, C8281o c8281o, C8283q c8283q, AbTestUtility abTestUtility, C8279j c8279j, C8277d c8277d, C10336s c10336s, C2652a c2652a, AddSmsValidateEvent addSmsValidateEvent, C8280l c8280l, C14838f c14838f, C8272a c8272a, C6220a c6220a) {
        this.f55212b = c9713a;
        this.f55213c = c10333h;
        this.f55214d = c8276b;
        this.f55215e = c8281o;
        this.f55216f = c8283q;
        this.f55217g = abTestUtility;
        this.f55218h = c8279j;
        this.f55219i = c8277d;
        this.f55220j = c10336s;
        this.f55221k = addSmsValidateEvent;
        this.f55222l = c14838f;
        this.f55223m = c2652a;
        this.f55224n = c8280l;
        this.f55225o = c8272a;
        this.f55226p = c6220a;
    }

    /* renamed from: a */
    public void m64657a(@NonNull C1772e c1772e) {
        a(bx.f57877a);
        m64645b(AuthType.FACEBOOK).a(new C17742a(this, AuthType.FACEBOOK));
    }

    public void onCancel() {
        this.f55212b.a(false);
        this.f55215e.c();
        this.f55213c.d(AuthType.FACEBOOK);
    }

    public void onError(FacebookException facebookException) {
        this.f55215e.c();
        this.f55213c.c(AuthType.FACEBOOK);
        ((LoginTarget) H()).showFbAuthFixesDialog();
    }

    /* renamed from: a */
    public void m64662a(boolean z, @Nullable AuthType authType) {
        if (authType != null) {
            m64645b(authType).a(new C17742a(this, authType));
            return;
        }
        C8292g a = this.f55225o.a();
        if (a.a()) {
            m64635a(a);
        } else {
            if (!z) {
                if (this.f55212b.a()) {
                    if (this.f55218h.a()) {
                        m64663b();
                    } else {
                        C0001a.e("Missing auth type when user is logged into Tinder", new Object[null]);
                        a(cj.f57889a);
                    }
                }
            }
            a(by.f57878a);
            this.f55213c.g();
        }
        this.f55213c.d();
    }

    /* renamed from: b */
    void m64663b() {
        if (this.f55212b.a()) {
            this.f55211a = true;
            m64637a(UserAttribute.RETURNING_USER);
            return;
        }
        a(cu.f57899a);
    }

    /* renamed from: a */
    private void m64637a(UserAttribute userAttribute) {
        this.f55227q.a(m64652t().b(Schedulers.io()).a(cx.f57901a, cy.f57902a));
        this.f55226p.a();
        this.f55222l.m56220a(userAttribute);
        a(cz.f57903a);
    }

    /* renamed from: c */
    public boolean m64669c() {
        LoginTarget loginTarget = (LoginTarget) H();
        if (loginTarget == null) {
            return true;
        }
        if (loginTarget.hasNetwork()) {
            this.f55215e.c();
            loginTarget.relaunchLoginActivity();
            return false;
        }
        loginTarget.showNetworkDialog();
        return true;
    }

    /* renamed from: b */
    void m64667b(boolean z, @NonNull AuthType authType) {
        this.f55213c.f();
        this.f55213c.a(authType, z);
        if (authType == AuthType.FACEBOOK) {
            this.f55212b.b();
        }
    }

    /* renamed from: a */
    public void m64654a() {
        super.a();
        this.f55227q.a();
    }

    /* renamed from: a */
    public void m64656a(@Nullable AccountKitLoginResult accountKitLoginResult) {
        LoginTarget loginTarget = (LoginTarget) H();
        if (loginTarget != null) {
            if (this.f55214d.a(accountKitLoginResult)) {
                loginTarget.showProgressDialog();
                m64645b(AuthType.ACCOUNTKIT).a(new C17742a(this, AuthType.ACCOUNTKIT));
                this.f55213c.b(AuthType.ACCOUNTKIT);
            } else {
                accountKitLoginResult = this.f55214d.b(accountKitLoginResult);
                loginTarget.showLoginFailure();
                if (accountKitLoginResult != null) {
                    this.f55213c.a(AuthType.ACCOUNTKIT, accountKitLoginResult.getDetailErrorCode());
                } else {
                    this.f55213c.c(AuthType.ACCOUNTKIT);
                }
            }
        }
    }

    /* renamed from: b */
    public void m64664b(AccountKitLoginResult accountKitLoginResult) {
        AccessToken accessToken = accountKitLoginResult.getAccessToken();
        if (this.f55214d.a(accountKitLoginResult) == null || accessToken == null) {
            m64653u();
            m64633a(EventCode.ERROR_RETRIEVING_CODE);
            a(cb.f57881a);
            m64651s();
            return;
        }
        this.f55225o.a(false);
        m64633a(EventCode.SUBMIT_VERIFY_CODE);
        this.f55220j.a(accessToken.getToken()).a(bindToLifecycle().forSingle()).a(RxUtils.a().m67518a()).c(new da(this)).a(new db(this)).c(new dc(this)).a(new bz(this), new ca(this));
    }

    /* renamed from: p */
    final /* synthetic */ void m64681p() {
        if (((LoginTarget) H()) != null) {
            ((LoginTarget) H()).showProgressDialog();
        }
    }

    /* renamed from: o */
    final /* synthetic */ void m64680o() {
        a(cw.f57900a);
    }

    /* renamed from: a */
    final /* synthetic */ void m64659a(ValidationStatus validationStatus) {
        m64633a(EventCode.SERVER_VERIFY_COMPLETE);
        validationStatus = this.f55225o.a();
        if (validationStatus.b()) {
            a(new cs(validationStatus));
        } else {
            this.f55224n.a(AuthType.FACEBOOK).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new ct(this), new cv(this));
        }
    }

    /* renamed from: n */
    final /* synthetic */ void m64679n() throws Exception {
        m64637a(UserAttribute.NEW_USER);
    }

    /* renamed from: b */
    final /* synthetic */ void m64666b(Throwable th) throws Exception {
        C0001a.c(th);
        m64637a(UserAttribute.NEW_USER);
    }

    /* renamed from: a */
    final /* synthetic */ void m64661a(Throwable th) {
        C0001a.c(th);
        m64633a(EventCode.SERVER_VERIFY_ERROR);
        m64653u();
        if (th instanceof AuthException) {
            a(new cq(th));
        } else {
            a(cr.f57897a);
        }
    }

    /* renamed from: s */
    private void m64651s() {
        this.f55219i.a().a(RxUtils.a().m67520b()).a(cc.f57882a, cd.f57883a);
    }

    /* renamed from: d */
    public void m64670d() {
        m64633a(EventCode.CANCEL);
        m64653u();
        a(ce.f57884a);
    }

    /* renamed from: a */
    public void m64658a(AuthType authType) {
        a(cf.f57885a);
        m64645b(authType).a(new C17742a(this, authType));
    }

    /* renamed from: b */
    private Observable<C8288b> m64645b(@NonNull AuthType authType) {
        return m64631a(authType, null);
    }

    /* renamed from: a */
    private Observable<C8288b> m64631a(@NonNull AuthType authType, @Nullable C14976d c14976d) {
        return this.f55216f.a(new C8290e(authType, c14976d)).a(bindToLifecycle()).a(RxUtils.a()).c(new cg(this));
    }

    /* renamed from: l */
    final /* synthetic */ void m64678l() {
        a(cp.f57895a);
    }

    /* renamed from: a */
    private void m64634a(C8288b c8288b) {
        LoginTarget loginTarget = (LoginTarget) H();
        if (loginTarget != null) {
            AuthType i = c8288b.i();
            switch (C143551.f45549a[c8288b.g().ordinal()]) {
                case 1:
                    if (i != AuthType.ACCOUNTKIT) {
                        if (i != AuthType.FACEBOOK) {
                            if (i != AuthType.TINDER_SMS) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Onboarding flow for auth type ");
                                stringBuilder.append(i);
                                stringBuilder.append(" isn't supported.");
                                throw new UnsupportedOperationException(stringBuilder.toString());
                            }
                        }
                        loginTarget.showOnBoardingScreen(i);
                        break;
                    }
                    this.f55213c.fireOnboardingViewEvent(OnboardingEventCode.SMS_CONFIRM);
                    loginTarget.showSmsConfirmationScreen();
                    break;
                case 2:
                    m64635a(new C8292g(c8288b.d(), c8288b.f(), c8288b.e()));
                    break;
                case 3:
                    UserAttribute userAttribute;
                    boolean b = c8288b.b();
                    m64667b(b, i);
                    if (b) {
                        userAttribute = UserAttribute.NEW_USER;
                    } else {
                        userAttribute = UserAttribute.RETURNING_USER;
                    }
                    m64637a(userAttribute);
                    break;
                default:
                    throw new UnsupportedOperationException("All auth state has exhausted");
            }
        }
    }

    /* renamed from: a */
    private void m64635a(C8292g c8292g) {
        if (c8292g.c()) {
            a(new ch(this));
        } else if (c8292g.b()) {
            a(new ci(c8292g));
        }
    }

    /* renamed from: c */
    final /* synthetic */ void m64668c(LoginTarget loginTarget) {
        loginTarget.showAccountKitSMSValidation(this.f55214d.b());
    }

    /* renamed from: a */
    private void m64638a(@NonNull AuthException authException, @NonNull LoginTarget loginTarget) {
        AuthErrorType errorType = authException.getErrorType();
        if (AuthErrorType.UNDERAGE == errorType) {
            loginTarget.showLoginIsTween(null);
        } else if (AuthErrorType.OUTDATED_CLIENT_VERSION == errorType) {
            loginTarget.showOutdatedClientDialog();
        } else {
            loginTarget.showLoginFailedDialog(Optional.m59120a(Integer.valueOf(authException.getErrorCode())));
        }
    }

    /* renamed from: e */
    public void m64671e() {
        this.f55213c.d(AuthType.ACCOUNTKIT);
    }

    /* renamed from: f */
    public void m64672f() {
        a(new ck(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m64665b(LoginTarget loginTarget) {
        if (this.f55211a) {
            loginTarget.relaunchLoginActivity();
        }
    }

    /* renamed from: g */
    public void m64673g() {
        this.f55213c.a(0);
    }

    /* renamed from: h */
    public void m64674h() {
        this.f55213c.b(0);
    }

    /* renamed from: a */
    private void m64633a(EventCode eventCode) {
        this.f55221k.a(new C8275a(eventCode, VerifyMethod.ACCOUNT_KIT, null));
    }

    /* renamed from: t */
    private Completable m64652t() {
        return this.f55217g.forceContentUpdate().h(2, TimeUnit.SECONDS).b();
    }

    /* renamed from: u */
    private void m64653u() {
        this.f55215e.c();
        this.f55212b.a(false);
        this.f55223m.a(null);
        this.f55225o.b();
    }

    /* renamed from: i */
    public void m64675i() {
        this.f55213c.fireOnboardingSubmitEvent(OnboardingEventCode.SMS_CONFIRM, "log_in_with_facebook", true);
        a(cl.f57891a);
        m64651s();
    }

    /* renamed from: j */
    public void m64676j() {
        this.f55213c.fireOnboardingSubmitEvent(OnboardingEventCode.SMS_CONFIRM, "get_started", true);
        a(cm.f57892a);
    }

    /* renamed from: k */
    public void m64677k() {
        this.f55213c.fireOnboardingSmsCancelEvent(true);
    }

    /* renamed from: a */
    public void m64655a(int i) {
        m64651s();
        a(new cn(i));
    }

    /* renamed from: a */
    public void m64660a(C14976d c14976d) {
        a(co.f57894a);
        m64631a(AuthType.TINDER_SMS, c14976d).a(new C17742a(this, AuthType.TINDER_SMS));
    }
}
