package com.tinder.onboarding.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.tinder.domain.auth.usecase.PasswordValidator;
import com.tinder.domain.auth.usecase.PasswordValidator.State;
import com.tinder.onboarding.exception.OnboardingInvalidDataException;
import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.OnboardingEventCode;
import com.tinder.onboarding.model.OnboardingInvalidDataType;
import com.tinder.onboarding.model.OnboardingPassword;
import com.tinder.onboarding.target.PasswordStepTarget;
import com.tinder.presenters.PresenterBase;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java8.util.Optional;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;
import rx.subjects.C19785a;

public class ex extends PresenterBase<PasswordStepTarget> {
    @NonNull
    /* renamed from: a */
    private static final List<OnboardingInvalidDataType> f43180a = Arrays.asList(new OnboardingInvalidDataType[]{OnboardingInvalidDataType.PASSWORD_NO_DIGITS, OnboardingInvalidDataType.PASSWORD_NO_LETTERS, OnboardingInvalidDataType.PASSWORD_TOO_SHORT, OnboardingInvalidDataType.PASSWORD_TOO_LONG, OnboardingInvalidDataType.PASSWORD_TOO_SIMPLE, OnboardingInvalidDataType.PASSWORD_REPEATING_CHARS, OnboardingInvalidDataType.PASSWORD_INVALID_TYPE});
    @NonNull
    /* renamed from: b */
    private final C9965a f43181b;
    @NonNull
    /* renamed from: c */
    private final PasswordValidator f43182c;
    @NonNull
    /* renamed from: d */
    private final OnboardingAnalyticsInteractor f43183d;
    @NonNull
    /* renamed from: e */
    private final C19785a<OnboardingPassword> f43184e;
    @NonNull
    /* renamed from: f */
    private final C19573b f43185f = new C19573b();

    /* renamed from: b */
    final /* synthetic */ void m52827b(Optional optional) {
        m52815c(optional);
    }

    @Inject
    public ex(@NonNull C9965a c9965a, @NonNull PasswordValidator passwordValidator, @NonNull OnboardingAnalyticsInteractor onboardingAnalyticsInteractor) {
        this.f43181b = c9965a;
        this.f43182c = passwordValidator;
        this.f43183d = onboardingAnalyticsInteractor;
        this.f43184e = C19785a.w();
    }

    /* renamed from: a */
    public void m52824a(boolean z) {
        if (z) {
            this.f43181b.m40937a().k(ez.f43186a).h().b(new fk(this)).b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle()).a(new fv(this), gf.f44748a);
            return;
        }
        this.f43185f.a();
        a(ey.f44722a);
    }

    /* renamed from: a */
    final /* synthetic */ void m52823a(Optional optional) {
        if (optional.c()) {
            OnboardingPassword onboardingPassword = (OnboardingPassword) optional.b();
            this.f43184e.onNext(onboardingPassword);
            if (onboardingPassword.exists() != null) {
                a(gd.f44746a);
            } else {
                m52828c();
                a(ge.f44747a);
            }
            return;
        }
        m52828c();
        a(gc.f44745a);
    }

    /* renamed from: c */
    static final /* synthetic */ void m52814c(PasswordStepTarget passwordStepTarget) {
        passwordStepTarget.setText("dummypassword");
        passwordStepTarget.removeHintMessage();
        passwordStepTarget.dismissKeyboard();
        passwordStepTarget.enableActionButton();
    }

    /* renamed from: b */
    public void m52825b() {
        this.f43184e.e().h().f(gg.f43191a).a(new gh(this), gi.f44750a);
    }

    /* renamed from: b */
    final /* synthetic */ void m52826b(OnboardingPassword onboardingPassword) {
        a(gb.f44744a);
        m52828c();
        this.f43184e.onNext(onboardingPassword.withChanged());
    }

    /* renamed from: b */
    static final /* synthetic */ void m52812b(PasswordStepTarget passwordStepTarget) {
        passwordStepTarget.setText("");
        passwordStepTarget.showPasswordNormalHint();
    }

    /* renamed from: a */
    public void m52821a(@NonNull String str) {
        a(gj.f44751a);
        str = this.f43184e.e().h().k(new gk(str));
        C19785a c19785a = this.f43184e;
        c19785a.getClass();
        str = str.b(fa.m53819a(c19785a));
        C9965a c9965a = this.f43181b;
        c9965a.getClass();
        str.i(fb.m52834a(c9965a)).b().b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle().forCompletable()).d(new fc(this)).a(new fd(this), new fe(this));
    }

    /* renamed from: a */
    static final /* synthetic */ OnboardingPassword m52809a(@NonNull String str, OnboardingPassword onboardingPassword) {
        return (onboardingPassword.changed() || !onboardingPassword.exists()) ? onboardingPassword.withText(str) : onboardingPassword;
    }

    /* renamed from: f */
    final /* synthetic */ void m52833f() {
        a(ga.f44743a);
    }

    /* renamed from: e */
    final /* synthetic */ void m52832e() {
        m52810a(((OnboardingPassword) this.f43184e.A()).changed(), true);
    }

    /* renamed from: a */
    final /* synthetic */ void m52822a(Throwable th) {
        C0001a.c(th);
        m52810a(((OnboardingPassword) this.f43184e.A()).changed(), false);
        m52813b(th);
    }

    /* renamed from: a */
    public void m52817a() {
        super.a();
        this.f43185f.a();
    }

    @VisibleForTesting
    /* renamed from: c */
    public void m52828c() {
        a(new ff(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m52820a(PasswordStepTarget passwordStepTarget) {
        passwordStepTarget = passwordStepTarget.editTextAfterTextChanges();
        PasswordValidator passwordValidator = this.f43182c;
        passwordValidator.getClass();
        passwordStepTarget = passwordStepTarget.h(fl.m52835a(passwordValidator)).r();
        this.f43185f.a(passwordStepTarget.c(2, TimeUnit.SECONDS).f(fm.f43189a).a(C19397a.a()).d(new fn(this)));
        this.f43185f.a(passwordStepTarget.d(new fo(this)));
        this.f43185f.a(passwordStepTarget.f(fp.f43190a).h().e(passwordStepTarget).a(new fq(this), fr.f44734a));
    }

    /* renamed from: e */
    static final /* synthetic */ Boolean m52816e(State state) {
        state = (state == State.STRONG || state == State.EMPTY) ? null : true;
        return Boolean.valueOf(state);
    }

    /* renamed from: d */
    final /* synthetic */ void m52831d(State state) {
        a(fz.f44742a);
    }

    /* renamed from: c */
    final /* synthetic */ void m52829c(State state) {
        a(state == State.STRONG ? fx.f44740a : fy.f44741a);
    }

    /* renamed from: b */
    static final /* synthetic */ Boolean m52811b(State state) {
        return Boolean.valueOf(state == State.STRONG ? true : null);
    }

    /* renamed from: a */
    final /* synthetic */ void m52818a(State state) {
        switch (state) {
            case STRONG:
                a(fs.f44735a);
                return;
            case EMPTY:
                a(ft.f44736a);
                return;
            case TOO_SIMPLE:
            case REPEATING_CHARS:
                a(fu.f44737a);
                return;
            default:
                a(fw.f44739a);
                return;
        }
    }

    /* renamed from: b */
    private void m52813b(@NonNull Throwable th) {
        if (th instanceof OnboardingInvalidDataException) {
            if (f43180a.contains(((OnboardingInvalidDataException) th).m40924a()) != null) {
                a(fg.f44728a);
                return;
            }
        }
        a(fh.f44729a);
    }

    /* renamed from: a */
    private void m52810a(boolean z, boolean z2) {
        this.f43183d.fireOnboardingSubmitEvent(OnboardingEventCode.PASSWORD, String.valueOf(z), z2);
    }

    /* renamed from: c */
    private void m52815c(Optional<OnboardingPassword> optional) {
        optional.a(new fi(this), new fj(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m52819a(OnboardingPassword onboardingPassword) {
        this.f43183d.fireOnboardingViewEvent(OnboardingEventCode.PASSWORD, String.valueOf(onboardingPassword.exists()));
    }

    /* renamed from: d */
    final /* synthetic */ void m52830d() {
        this.f43183d.fireOnboardingViewEvent(OnboardingEventCode.PASSWORD);
    }
}
