package com.tinder.onboarding.presenter;

import android.support.annotation.NonNull;
import com.tinder.common.p077b.C8524b;
import com.tinder.onboarding.exception.OnboardingInvalidDataException;
import com.tinder.onboarding.exception.OnboardingInvalidTokenException;
import com.tinder.onboarding.exception.OnboardingServerException;
import com.tinder.onboarding.exception.OnboardingUnderageException;
import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.OnboardingEmail;
import com.tinder.onboarding.model.OnboardingEventCode;
import com.tinder.onboarding.model.OnboardingExperiments;
import com.tinder.onboarding.model.OnboardingPassword;
import com.tinder.onboarding.model.OnboardingUser;
import com.tinder.onboarding.target.OnboardingActivityTarget;
import com.tinder.onboarding.viewmodel.OnboardingStep;
import com.tinder.presenters.PresenterBase;
import com.tinder.scope.ActivityScope;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java8.util.Objects;
import java8.util.Optional;
import javax.inject.Inject;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import p000a.p001a.C0001a;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;
import rx.subjects.C19785a;

@ActivityScope
public class dn extends PresenterBase<OnboardingActivityTarget> {
    @NonNull
    /* renamed from: a */
    private final C9965a f43165a;
    @NonNull
    /* renamed from: b */
    private final OnboardingAnalyticsInteractor f43166b;
    @NonNull
    /* renamed from: c */
    private final OnboardingExperiments f43167c;
    @NonNull
    /* renamed from: d */
    private final bt f43168d;
    @NonNull
    /* renamed from: e */
    private C19785a<C9979a> f43169e = C19785a.w();
    /* renamed from: f */
    private boolean f43170f = false;
    /* renamed from: g */
    private OnboardingUser f43171g;

    /* renamed from: com.tinder.onboarding.presenter.dn$1 */
    static /* synthetic */ class C99781 {
        /* renamed from: a */
        static final /* synthetic */ int[] f32821a = new int[OnboardingStep.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.onboarding.viewmodel.OnboardingStep.values();
            r0 = r0.length;
            r0 = new int[r0];
            f32821a = r0;
            r0 = f32821a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.onboarding.viewmodel.OnboardingStep.EMAIL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.onboarding.presenter.dn.1.<clinit>():void");
        }
    }

    /* renamed from: com.tinder.onboarding.presenter.dn$a */
    private static class C9979a {
        @NonNull
        /* renamed from: a */
        private final OnboardingStep f32822a;
        @NonNull
        /* renamed from: b */
        private final List<OnboardingStep> f32823b;
        @NonNull
        /* renamed from: c */
        private final Set<OnboardingStep> f32824c;

        C9979a(@NonNull List<OnboardingStep> list, @NonNull OnboardingStep onboardingStep, @NonNull Set<OnboardingStep> set) {
            this.f32823b = (List) Objects.b(list);
            this.f32822a = (OnboardingStep) Objects.b(onboardingStep);
            this.f32824c = set;
        }

        @NonNull
        /* renamed from: a */
        OnboardingStep m40954a() {
            return this.f32822a;
        }

        @NonNull
        /* renamed from: b */
        List<OnboardingStep> m40955b() {
            return this.f32823b;
        }

        @NonNull
        /* renamed from: c */
        OnboardingStep m40956c() {
            int indexOf = this.f32823b.indexOf(this.f32822a);
            if (indexOf < this.f32823b.size() - 1) {
                return (OnboardingStep) this.f32823b.get(indexOf + 1);
            }
            return OnboardingStep.COMPLETE;
        }

        /* renamed from: d */
        boolean m40957d() {
            return this.f32824c.contains(this.f32822a) ^ 1;
        }
    }

    /* renamed from: b */
    final /* synthetic */ OnboardingUser m52774b(OnboardingUser onboardingUser) {
        return m52759d(onboardingUser);
    }

    /* renamed from: b */
    final /* synthetic */ void m52776b(C9979a c9979a) {
        m52758c(c9979a);
    }

    /* renamed from: c */
    final /* synthetic */ C9979a m52779c(OnboardingUser onboardingUser) {
        return m52760e(onboardingUser);
    }

    /* renamed from: j */
    final /* synthetic */ void m52791j() {
        m52768o();
    }

    @Inject
    dn(@NonNull C9965a c9965a, @NonNull OnboardingAnalyticsInteractor onboardingAnalyticsInteractor, @NonNull OnboardingExperiments onboardingExperiments, @NonNull bt btVar) {
        this.f43165a = c9965a;
        this.f43166b = onboardingAnalyticsInteractor;
        this.f43167c = onboardingExperiments;
        this.f43168d = btVar;
    }

    /* renamed from: b */
    public void m52775b() {
        m52767n();
        if (this.f43169e.z() || this.f43169e.y()) {
            this.f43169e = C19785a.w();
        }
        this.f43169e.a(bindToLifecycle()).a(new C14089do(this), new dp(this));
        this.f43165a.m40937a().b(Schedulers.io()).a(C19397a.a()).b(new ea(this)).a(bindToLifecycle()).k(new ek(this)).k(new el(this)).a(new em(this), new en(this));
    }

    /* renamed from: e */
    final /* synthetic */ void m52786e(Throwable th) {
        C0001a.c(th);
        a(new ej(this, th));
    }

    /* renamed from: c */
    final /* synthetic */ void m52782c(Throwable th, OnboardingActivityTarget onboardingActivityTarget) {
        if (th instanceof OnboardingUnderageException) {
            onboardingActivityTarget.finishOnboardingWithUnderage(m52749a((OnboardingUnderageException) th));
        } else if (th instanceof OnboardingInvalidTokenException) {
            onboardingActivityTarget.finishOnboardingWithError(th);
        } else {
            onboardingActivityTarget.showGenericErrorMessage(true);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m52770a(OnboardingUser onboardingUser) {
        this.f43166b.setEditableFields(this.f43168d.m40950a(onboardingUser));
        this.f43166b.setRequiredFields(this.f43168d.m40951b(onboardingUser));
    }

    /* renamed from: a */
    final /* synthetic */ void m52771a(C9979a c9979a) {
        m52768o();
        this.f43169e.onNext(c9979a);
        m52764k();
    }

    /* renamed from: d */
    final /* synthetic */ void m52784d(Throwable th) {
        m52768o();
        this.f43169e.onError(th);
        m52764k();
    }

    /* renamed from: c */
    public void m52780c() {
        OnboardingActivityTarget onboardingActivityTarget = (OnboardingActivityTarget) H();
        if (onboardingActivityTarget != null) {
            if (m52765l()) {
                m52766m();
            } else {
                onboardingActivityTarget.showCancelConfirmationDialog();
            }
        }
    }

    /* renamed from: d */
    public void m52783d() {
        m52767n();
        this.f43165a.m40939c().a(bindToLifecycle().forCompletable()).b(Schedulers.io()).a(C19397a.a()).d(new eo(this)).a(new ep(this), new eq(this));
    }

    /* renamed from: i */
    final /* synthetic */ void m52790i() {
        a(ei.f44709a);
        this.f43166b.fireOnboardingCancelEvent(true);
    }

    /* renamed from: c */
    final /* synthetic */ void m52781c(Throwable th) {
        C0001a.c(th);
        if (th instanceof OnboardingInvalidTokenException) {
            a(new eh(th));
        }
        this.f43166b.fireOnboardingCancelEvent(false);
    }

    @NonNull
    /* renamed from: d */
    private OnboardingUser m52759d(@NonNull OnboardingUser onboardingUser) {
        if (!onboardingUser.isUnderage() || m52755a(onboardingUser.getBirthday())) {
            return onboardingUser;
        }
        throw new OnboardingUnderageException((LocalDate) onboardingUser.getBirthday().c(LocalDate.a().c(this.f43167c.ageLimit()).b(1)));
    }

    /* renamed from: a */
    private boolean m52755a(Optional<LocalDate> optional) {
        return ((Boolean) optional.a(dq.f39455a).a(dr.f39456a).c(Boolean.valueOf(false))).booleanValue();
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m52751a(Years years) {
        return Boolean.valueOf(Math.abs(years.b()) <= 2 ? true : null);
    }

    @NonNull
    /* renamed from: e */
    private C9979a m52760e(@NonNull OnboardingUser onboardingUser) {
        List f = m52761f(onboardingUser);
        C9979a c9979a = new C9979a(f, m52750a(f, onboardingUser), m52762g(onboardingUser));
        this.f43171g = onboardingUser;
        return c9979a;
    }

    /* renamed from: c */
    private void m52758c(@NonNull C9979a c9979a) {
        OnboardingActivityTarget onboardingActivityTarget = (OnboardingActivityTarget) H();
        if (onboardingActivityTarget != null) {
            if (!this.f43170f) {
                OnboardingStep a = c9979a.m40954a();
                if (a == OnboardingStep.COMPLETE) {
                    m52785e();
                } else {
                    onboardingActivityTarget.setSteps(c9979a.m40955b());
                    onboardingActivityTarget.showStep(a);
                    if (c9979a.m40957d() != null) {
                        onboardingActivityTarget.hideSkipButton();
                    } else {
                        onboardingActivityTarget.showSkipButton();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void m52785e() {
        m52767n();
        this.f43165a.m40938b().b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle().forCompletable()).d(new ds(this)).a(new dt(this), new du(this));
    }

    /* renamed from: h */
    final /* synthetic */ void m52789h() {
        a(eg.f44707a);
    }

    /* renamed from: b */
    final /* synthetic */ void m52778b(Throwable th) {
        a(new ef(th));
    }

    /* renamed from: a */
    static final /* synthetic */ void m52754a(Throwable th, OnboardingActivityTarget onboardingActivityTarget) {
        if (th instanceof OnboardingInvalidTokenException) {
            onboardingActivityTarget.finishOnboardingWithError(th);
        } else if (th instanceof OnboardingInvalidDataException) {
            onboardingActivityTarget.showCreateUserError(Optional.a(Integer.valueOf(((OnboardingInvalidDataException) th).m40924a().getInternalCode())));
        } else if (th instanceof OnboardingServerException) {
            onboardingActivityTarget.showCreateUserError(Optional.a(Integer.valueOf(((OnboardingServerException) th).m40928a())));
        } else {
            onboardingActivityTarget.showCreateUserError(Optional.a());
        }
    }

    /* renamed from: f */
    public void m52787f() {
        this.f43170f = true;
    }

    /* renamed from: k */
    private void m52764k() {
        this.f43170f = false;
    }

    @NonNull
    /* renamed from: f */
    private List<OnboardingStep> m52761f(@NonNull OnboardingUser onboardingUser) {
        List<OnboardingStep> linkedList = new LinkedList();
        if (onboardingUser.isEmailRequired()) {
            linkedList.add(OnboardingStep.EMAIL);
        }
        if (onboardingUser.isPasswordRequired()) {
            linkedList.add(OnboardingStep.PASSWORD);
        }
        if (onboardingUser.isNameRequired()) {
            linkedList.add(OnboardingStep.NAME);
        }
        if (onboardingUser.isBirthdayRequired() || onboardingUser.isUnderage()) {
            linkedList.add(OnboardingStep.BIRTHDAY);
        }
        if (onboardingUser.isGenderSelectionRequired()) {
            linkedList.add(OnboardingStep.GENDER);
        }
        if (onboardingUser.isPhotosRequired() != null) {
            linkedList.add(OnboardingStep.PHOTOS);
        }
        return linkedList;
    }

    @NonNull
    /* renamed from: g */
    private Set<OnboardingStep> m52762g(@NonNull OnboardingUser onboardingUser) {
        onboardingUser = ((Boolean) onboardingUser.getEmail().a(dv.f39457a).c(Boolean.valueOf(false))).booleanValue();
        if (!this.f43167c.isEmailStepRequired()) {
            if (onboardingUser == null) {
                return C8524b.m36481a(new OnboardingStep[]{OnboardingStep.EMAIL});
            }
        }
        return C8524b.m36480a();
    }

    @NonNull
    /* renamed from: a */
    private OnboardingStep m52750a(List<OnboardingStep> list, @NonNull OnboardingUser onboardingUser) {
        if (onboardingUser.isUnderage()) {
            return OnboardingStep.BIRTHDAY;
        }
        if (!this.f43169e.x()) {
            return m52756b((List) list, onboardingUser);
        }
        C9979a c9979a = (C9979a) this.f43169e.A();
        OnboardingStep a = c9979a.m40954a();
        if (this.f43170f) {
            return a;
        }
        if (onboardingUser.equals(this.f43171g) == null) {
            a = c9979a.m40956c();
        }
        return a;
    }

    /* renamed from: b */
    private OnboardingStep m52756b(@NonNull List<OnboardingStep> list, @NonNull OnboardingUser onboardingUser) {
        if (!m52763h(onboardingUser) && list.contains(OnboardingStep.EMAIL)) {
            return OnboardingStep.EMAIL;
        }
        if (onboardingUser.isPasswordRequired() && ((!onboardingUser.getPassword().c() || !((OnboardingPassword) onboardingUser.getPassword().b()).exists()) && list.contains(OnboardingStep.PASSWORD))) {
            return OnboardingStep.PASSWORD;
        }
        if (!onboardingUser.getName().c() && list.contains(OnboardingStep.NAME)) {
            return OnboardingStep.NAME;
        }
        if ((!onboardingUser.getBirthday().c() || onboardingUser.isUnderage()) && list.contains(OnboardingStep.BIRTHDAY)) {
            return OnboardingStep.BIRTHDAY;
        }
        if (!onboardingUser.getGenderSelection().c() && list.contains(OnboardingStep.GENDER)) {
            return OnboardingStep.GENDER;
        }
        if (onboardingUser.getPhotos().c() != null || list.contains(OnboardingStep.PHOTOS) == null) {
            return OnboardingStep.COMPLETE;
        }
        return OnboardingStep.PHOTOS;
    }

    /* renamed from: h */
    private boolean m52763h(@NonNull OnboardingUser onboardingUser) {
        boolean z = true;
        if (!onboardingUser.isEmailRequired()) {
            return true;
        }
        if (!onboardingUser.getEmail().c()) {
            return false;
        }
        Object obj;
        OnboardingEmail onboardingEmail = (OnboardingEmail) onboardingUser.getEmail().b();
        if (!onboardingEmail.skipped()) {
            if (onboardingEmail.email() == null) {
                obj = null;
                if (onboardingEmail.allowMarketing() == null) {
                    if (onboardingEmail.allowMarketingEditable() == null) {
                        onboardingUser = null;
                        if (obj != null || r5 == null) {
                            z = false;
                        }
                        return z;
                    }
                }
                onboardingUser = true;
                if (obj != null) {
                }
                z = false;
                return z;
            }
        }
        obj = 1;
        if (onboardingEmail.allowMarketing() == null) {
            if (onboardingEmail.allowMarketingEditable() == null) {
                onboardingUser = null;
                if (obj != null) {
                }
                z = false;
                return z;
            }
        }
        onboardingUser = true;
        if (obj != null) {
        }
        z = false;
        return z;
    }

    /* renamed from: l */
    private boolean m52765l() {
        return m52769p().c();
    }

    /* renamed from: m */
    private void m52766m() {
        Optional p = m52769p();
        C19785a c19785a = this.f43169e;
        c19785a.getClass();
        p.a(dw.m48315a(c19785a));
    }

    /* renamed from: n */
    private void m52767n() {
        a(dx.f44697a);
    }

    /* renamed from: o */
    private void m52768o() {
        a(dy.f44698a);
    }

    @NonNull
    /* renamed from: p */
    private Optional<C9979a> m52769p() {
        C9979a c9979a = (C9979a) this.f43169e.A();
        if (c9979a == null) {
            return Optional.a();
        }
        List b = c9979a.m40955b();
        int indexOf = b.indexOf(c9979a.m40954a());
        if (indexOf < 1) {
            return Optional.a();
        }
        return Optional.a(new C9979a(c9979a.m40955b(), (OnboardingStep) b.get(indexOf - 1), c9979a.f32824c));
    }

    /* renamed from: a */
    public void m52772a(@NonNull OnboardingStep onboardingStep) {
        if (onboardingStep != OnboardingStep.GENDER) {
            a(dz.f44699a);
        }
    }

    /* renamed from: b */
    public void m52777b(@NonNull OnboardingStep onboardingStep) {
        if (C99781.f32821a[onboardingStep.ordinal()] != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("skipping steps isn't supported for: ");
            stringBuilder.append(onboardingStep);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f43167c.isEmailStepRequired() != null) {
            throw new IllegalStateException("Can not skip email step");
        } else {
            m52767n();
            this.f43165a.m40932a(OnboardingEmail.builder().skipped(true).build()).b(Schedulers.io()).a(C19397a.a()).a(bindToLifecycle().forCompletable()).d(new eb(this)).a(new ec(this), new ed(this));
        }
    }

    /* renamed from: g */
    final /* synthetic */ void m52788g() {
        this.f43166b.fireOnboardingSkipEvent(OnboardingEventCode.EMAIL, true);
    }

    /* renamed from: a */
    final /* synthetic */ void m52773a(Throwable th) {
        C0001a.c(th);
        a(ee.f44705a);
        this.f43166b.fireOnboardingSkipEvent(OnboardingEventCode.EMAIL, false);
    }

    /* renamed from: a */
    private int m52749a(OnboardingUnderageException onboardingUnderageException) {
        return new Duration(LocalDate.a().c(), onboardingUnderageException.m40929a().a(this.f43167c.ageLimit()).c()).c().b();
    }
}
