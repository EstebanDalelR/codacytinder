package com.tinder.onboarding.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.tinder.onboarding.exception.OnboardingInternalErrorException;
import com.tinder.onboarding.exception.OnboardingInvalidDataException;
import com.tinder.onboarding.exception.OnboardingUnderageException;
import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.OnboardingEventCode;
import com.tinder.onboarding.model.OnboardingInvalidDataType;
import com.tinder.onboarding.model.OnboardingUser;
import com.tinder.onboarding.target.BirthdayStepTarget;
import com.tinder.presenters.PresenterBase;
import com.tinder.scope.ActivityScope;
import java8.util.Optional;
import javax.inject.Inject;
import org.joda.time.LocalDate;
import p000a.p001a.C0001a;
import rx.C19571c;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;
import rx.subjects.C19785a;

@ActivityScope
public class BirthdayStepPresenter extends PresenterBase<BirthdayStepTarget> {
    @NonNull
    /* renamed from: a */
    private final C9965a f43122a;
    @NonNull
    /* renamed from: b */
    private final OnboardingAnalyticsInteractor f43123b;
    @NonNull
    /* renamed from: c */
    private final C9974a f43124c;
    @NonNull
    /* renamed from: d */
    private final C12169c f43125d = new C12169c();
    @NonNull
    /* renamed from: e */
    private C13521a f43126e = new C13521a();
    @NonNull
    /* renamed from: f */
    private C19785a<C9973b> f43127f = C19785a.w();
    /* renamed from: g */
    private boolean f43128g = true;
    /* renamed from: h */
    private boolean f43129h;

    private enum BirthdayStep {
        WIDGET,
        STAY_TUNED,
        CERTIFICATION
    }

    /* renamed from: com.tinder.onboarding.presenter.BirthdayStepPresenter$b */
    private static class C9973b {
        @NonNull
        /* renamed from: a */
        private final Optional<LocalDate> f32807a;
        /* renamed from: b */
        private final boolean f32808b;
        @NonNull
        /* renamed from: c */
        private BirthdayStep f32809c;

        C9973b(@NonNull Optional<LocalDate> optional, boolean z, @NonNull BirthdayStep birthdayStep) {
            this.f32807a = optional;
            this.f32808b = z;
            this.f32809c = birthdayStep;
        }

        @NonNull
        /* renamed from: a */
        Optional<LocalDate> m40942a() {
            return this.f32807a;
        }

        /* renamed from: b */
        boolean m40944b() {
            return this.f32808b;
        }

        @NonNull
        /* renamed from: c */
        BirthdayStep m40945c() {
            return this.f32809c;
        }

        /* renamed from: a */
        void m40943a(@NonNull BirthdayStep birthdayStep) {
            this.f32809c = birthdayStep;
        }
    }

    /* renamed from: com.tinder.onboarding.presenter.BirthdayStepPresenter$c */
    private class C12169c implements CompletableSubscriber {
        /* renamed from: a */
        final /* synthetic */ BirthdayStepPresenter f39440a;

        public void onSubscribe(Subscription subscription) {
        }

        private C12169c(BirthdayStepPresenter birthdayStepPresenter) {
            this.f39440a = birthdayStepPresenter;
        }

        public void onCompleted() {
            C0001a.b("Successfully updated birthday", new Object[0]);
        }

        public void onError(Throwable th) {
            C0001a.c(th, "Failed to update birthday", new Object[0]);
            this.f39440a.a(new C14103v(this, th));
        }

        /* renamed from: a */
        final /* synthetic */ void m48313a(Throwable th, BirthdayStepTarget birthdayStepTarget) {
            if (th instanceof OnboardingInternalErrorException) {
                birthdayStepTarget.showGenericErrorMessage();
            } else if (th instanceof OnboardingInvalidDataException) {
                if (((OnboardingInvalidDataException) th).m40924a() == OnboardingInvalidDataType.INVALID_BIRTH_DATE) {
                    birthdayStepTarget.showInvalidBirthDayMessage();
                } else {
                    birthdayStepTarget.showGenericErrorMessage();
                }
            } else if ((th instanceof OnboardingUnderageException) != null) {
                C9973b a = this.f39440a.m52680g();
                if (a != null) {
                    a.m40943a(BirthdayStep.STAY_TUNED);
                    this.f39440a.m52664a(a);
                }
            } else {
                birthdayStepTarget.showGenericErrorMessage();
            }
        }
    }

    /* renamed from: com.tinder.onboarding.presenter.BirthdayStepPresenter$a */
    private class C13521a extends C19571c<C9973b> {
        /* renamed from: a */
        final /* synthetic */ BirthdayStepPresenter f43121a;

        public void onCompleted() {
        }

        private C13521a(BirthdayStepPresenter birthdayStepPresenter) {
            this.f43121a = birthdayStepPresenter;
        }

        public /* synthetic */ void onNext(Object obj) {
            m52661a((C9973b) obj);
        }

        public void onError(Throwable th) {
            C0001a.c(th, "Filed in Birthday step subscriber", new Object[0]);
        }

        /* renamed from: a */
        public void m52661a(C9973b c9973b) {
            switch (c9973b.m40945c()) {
                case STAY_TUNED:
                    this.f43121a.a(C14100s.f44776a);
                    this.f43121a.f43123b.fireOnboardingViewEvent(OnboardingEventCode.UNDER_AGE);
                    return;
                case CERTIFICATION:
                    this.f43121a.a(C14101t.f44777a);
                    this.f43121a.f43123b.fireOnboardingViewEvent(OnboardingEventCode.UNDER_AGE_CERTIFICATION);
                    return;
                case WIDGET:
                    c9973b.m40942a().a(new C12171q(this));
                    if (this.f43121a.f43129h) {
                        this.f43121a.a(C14099r.f44775a);
                        this.f43121a.m52673b(c9973b.f32807a);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        final /* synthetic */ void m52662a(LocalDate localDate) {
            this.f43121a.a(new C14102u(localDate));
        }
    }

    /* renamed from: a */
    final /* synthetic */ C9973b m52681a(OnboardingUser onboardingUser) {
        return m52671b(onboardingUser);
    }

    @Inject
    public BirthdayStepPresenter(@NonNull C9965a c9965a, @NonNull OnboardingAnalyticsInteractor onboardingAnalyticsInteractor, @NonNull C9974a c9974a) {
        this.f43122a = c9965a;
        this.f43123b = onboardingAnalyticsInteractor;
        this.f43124c = c9974a;
    }

    /* renamed from: a */
    public void m52682a(@NonNull Optional<LocalDate> optional) {
        a(new C14087c(optional));
    }

    /* renamed from: a */
    static final /* synthetic */ void m52669a(@NonNull Optional optional, BirthdayStepTarget birthdayStepTarget) {
        if (optional.c() != null) {
            birthdayStepTarget.enableContinueButton();
        } else {
            birthdayStepTarget.disableContinueButton();
        }
        birthdayStepTarget.showBirthdayHint();
    }

    /* renamed from: a */
    public void m52683a(@NonNull LocalDate localDate) {
        if (((BirthdayStepTarget) H()) != null) {
            C9973b g = m52680g();
            if (g == null || !g.m40944b()) {
                m52674b(localDate, OnboardingEventCode.BIRTHDAY);
                return;
            }
            g.m40943a(BirthdayStep.CERTIFICATION);
            m52664a(g);
        }
    }

    /* renamed from: b */
    public boolean m52688b() {
        BirthdayStepTarget birthdayStepTarget = (BirthdayStepTarget) H();
        C9973b g = m52680g();
        if (!(birthdayStepTarget == null || g == null)) {
            switch (g.m40945c()) {
                case STAY_TUNED:
                case CERTIFICATION:
                    g.m40943a(BirthdayStep.WIDGET);
                    m52664a(g);
                    return true;
                default:
                    break;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m52687b(@NonNull LocalDate localDate) {
        m52674b(localDate, OnboardingEventCode.UNDER_AGE_CERTIFICATION);
    }

    /* renamed from: c */
    public void m52689c() {
        a(C14088d.f44682a);
        this.f43123b.fireOnboardingSubmitEvent(OnboardingEventCode.UNDER_AGE, null, true);
    }

    @VisibleForTesting
    /* renamed from: d */
    void m52691d() {
        if (this.f43127f.z()) {
            this.f43127f = C19785a.w();
        }
        if (this.f43126e.isUnsubscribed()) {
            this.f43126e = new C13521a();
        }
        this.f43127f.a(bindToLifecycle()).b(this.f43126e);
        Observable a = this.f43122a.m40937a().k(new C13523i(this)).b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle());
        C19785a c19785a = this.f43127f;
        c19785a.getClass();
        Action1 a2 = C14092j.m53820a(c19785a);
        C19785a c19785a2 = this.f43127f;
        c19785a2.getClass();
        a.a(a2, C14093k.m53821a(c19785a2));
    }

    /* renamed from: b */
    private void m52674b(@NonNull LocalDate localDate, OnboardingEventCode onboardingEventCode) {
        a(C14094l.f44766a);
        this.f43122a.m40936a(localDate).b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle().forCompletable()).d(new C14095m(this)).b(new C14096n(this, localDate, onboardingEventCode)).c(new C14097o(this, localDate, onboardingEventCode)).b(this.f43125d);
    }

    /* renamed from: f */
    final /* synthetic */ void m52693f() {
        a(C14091h.f44763a);
    }

    /* renamed from: a */
    final /* synthetic */ void m52684a(@NonNull LocalDate localDate, OnboardingEventCode onboardingEventCode) {
        m52670a(localDate, true, onboardingEventCode);
    }

    /* renamed from: a */
    final /* synthetic */ void m52685a(@NonNull LocalDate localDate, OnboardingEventCode onboardingEventCode, Throwable th) {
        m52670a(localDate, (boolean) null, onboardingEventCode);
    }

    /* renamed from: a */
    private void m52670a(@NonNull LocalDate localDate, boolean z, OnboardingEventCode onboardingEventCode) {
        this.f43123b.fireOnboardingSubmitEvent(onboardingEventCode, this.f43124c.m40947a(localDate), z);
    }

    /* renamed from: b */
    private C9973b m52671b(@NonNull OnboardingUser onboardingUser) {
        if (onboardingUser.isUnderage() && !this.f43128g) {
            return new C9973b(onboardingUser.getBirthday(), onboardingUser.isUnderage(), BirthdayStep.STAY_TUNED);
        }
        this.f43128g = false;
        return new C9973b(onboardingUser.getBirthday(), onboardingUser.isUnderage(), BirthdayStep.WIDGET);
    }

    @Nullable
    /* renamed from: g */
    private C9973b m52680g() {
        return (C9973b) this.f43127f.A();
    }

    /* renamed from: a */
    private void m52664a(C9973b c9973b) {
        this.f43127f.onNext(c9973b);
    }

    /* renamed from: a */
    public void m52686a(boolean z) {
        this.f43129h = z;
        if (z) {
            m52691d();
            a(C14098p.f44774a);
            return;
        }
        a(C14090e.f44700a);
    }

    /* renamed from: a */
    static final /* synthetic */ void m52668a(BirthdayStepTarget birthdayStepTarget) {
        birthdayStepTarget.enableFocusForFields();
        birthdayStepTarget.focusInputField();
    }

    /* renamed from: b */
    private void m52673b(Optional<LocalDate> optional) {
        optional.a(new C12170f(this), new C9982g(this));
    }

    /* renamed from: c */
    final /* synthetic */ void m52690c(LocalDate localDate) {
        this.f43123b.fireOnboardingViewEvent(OnboardingEventCode.BIRTHDAY, this.f43124c.m40947a(localDate));
    }

    /* renamed from: e */
    final /* synthetic */ void m52692e() {
        this.f43123b.fireOnboardingViewEvent(OnboardingEventCode.BIRTHDAY);
    }
}
