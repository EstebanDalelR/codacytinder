package com.tinder.application;

import android.view.inputmethod.InputMethodManager;
import com.tinder.base.ActivityBase;
import com.tinder.base.C10358b;
import com.tinder.domain.auth.usecase.PasswordValidator;
import com.tinder.domain.auth.usecase.RegexEmailValidator_Factory;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bt;
import com.tinder.onboarding.C13507b;
import com.tinder.onboarding.C13508d;
import com.tinder.onboarding.C13509f;
import com.tinder.onboarding.activities.C12160c;
import com.tinder.onboarding.activities.OnboardingActivity;
import com.tinder.onboarding.interactor.C13512d;
import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.module.C13513b;
import com.tinder.onboarding.module.C13514c;
import com.tinder.onboarding.module.C13515d;
import com.tinder.onboarding.module.C13516e;
import com.tinder.onboarding.module.C13517f;
import com.tinder.onboarding.module.C13518g;
import com.tinder.onboarding.module.C13519h;
import com.tinder.onboarding.module.C13520i;
import com.tinder.onboarding.module.C2655a;
import com.tinder.onboarding.module.OnboardingComponent;
import com.tinder.onboarding.presenter.BirthdayStepPresenter;
import com.tinder.onboarding.presenter.C13522b;
import com.tinder.onboarding.presenter.C13524w;
import com.tinder.onboarding.presenter.C13526y;
import com.tinder.onboarding.presenter.bs;
import com.tinder.onboarding.presenter.bx;
import com.tinder.onboarding.presenter.by;
import com.tinder.onboarding.presenter.cy;
import com.tinder.onboarding.presenter.cz;
import com.tinder.onboarding.presenter.dm;
import com.tinder.onboarding.presenter.dn;
import com.tinder.onboarding.presenter.er;
import com.tinder.onboarding.presenter.es;
import com.tinder.onboarding.presenter.ew;
import com.tinder.onboarding.presenter.ex;
import com.tinder.onboarding.presenter.gm;
import com.tinder.onboarding.presenter.gy;
import com.tinder.onboarding.repository.C12187s;
import com.tinder.onboarding.repository.C13529r;
import com.tinder.onboarding.repository.OnboardingService;
import com.tinder.onboarding.repository.OnboardingUserRepository;
import com.tinder.onboarding.repository.ar;
import com.tinder.onboarding.view.BirthdayStepView;
import com.tinder.onboarding.view.C12209b;
import com.tinder.onboarding.view.C12211e;
import com.tinder.onboarding.view.C12212h;
import com.tinder.onboarding.view.C12213j;
import com.tinder.onboarding.view.C12215m;
import com.tinder.onboarding.view.C12216o;
import com.tinder.onboarding.view.C12220t;
import com.tinder.onboarding.view.DateWidgetDateValidator;
import com.tinder.onboarding.view.EmailStepView;
import com.tinder.onboarding.view.GenderStepView;
import com.tinder.onboarding.view.NameStepView;
import com.tinder.onboarding.view.OnboardingDateWidgetView;
import com.tinder.onboarding.view.PasswordStepView;
import com.tinder.onboarding.view.PhotosStepView;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

final class a$o implements OnboardingComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f40560a;
    /* renamed from: b */
    private C2655a f40561b;
    /* renamed from: c */
    private Provider<OnboardingAnalyticsInteractor> f40562c;
    /* renamed from: d */
    private Provider<OnboardingService> f40563d;
    /* renamed from: e */
    private Provider f40564e;
    /* renamed from: f */
    private C13518g f40565f;
    /* renamed from: g */
    private C13508d f40566g;
    /* renamed from: h */
    private C13514c f40567h;
    /* renamed from: i */
    private C13507b f40568i;
    /* renamed from: j */
    private C13515d f40569j;
    /* renamed from: k */
    private Provider<C12187s> f40570k;
    /* renamed from: l */
    private Provider<OnboardingUserRepository> f40571l;
    /* renamed from: m */
    private Provider<C9965a> f40572m;
    /* renamed from: n */
    private bx f40573n;
    /* renamed from: o */
    private Provider<dn> f40574o;
    /* renamed from: p */
    private Provider<DateWidgetDateValidator> f40575p;
    /* renamed from: q */
    private Provider<es> f40576q;
    /* renamed from: r */
    private Provider<cz> f40577r;
    /* renamed from: s */
    private Provider<BirthdayStepPresenter> f40578s;
    /* renamed from: t */
    private Provider<by> f40579t;
    /* renamed from: u */
    private C13509f f40580u;
    /* renamed from: v */
    private C13516e f40581v;
    /* renamed from: w */
    private Provider<gm> f40582w;
    /* renamed from: x */
    private Provider<C13526y> f40583x;

    private a$o(C4423a c4423a, C2655a c2655a) {
        this.f40560a = c4423a;
        m49626a(c2655a);
    }

    /* renamed from: a */
    private ex m49618a() {
        return new ex((C9965a) this.f40572m.get(), new PasswordValidator(), (OnboardingAnalyticsInteractor) this.f40562c.get());
    }

    /* renamed from: a */
    private void m49626a(C2655a c2655a) {
        this.f40561b = (C2655a) C15521i.a(c2655a);
        this.f40562c = C17281c.a(C13513b.m52630b(this.f40561b, C4423a.a(this.f40560a)));
        this.f40563d = C17281c.a(C13517f.m52646b(this.f40561b, C4423a.b(this.f40560a), C4423a.c(this.f40560a)));
        this.f40564e = C17281c.a(C13529r.m52892b(C4423a.d(this.f40560a)));
        this.f40565f = C13518g.m52650b(this.f40561b, C4423a.e(this.f40560a));
        this.f40566g = C13508d.m52617b(C4423a.a(this.f40560a));
        this.f40567h = C13514c.m52634b(this.f40561b, this.f40566g);
        this.f40568i = C13507b.m52614b(C4423a.f(this.f40560a));
        this.f40569j = C13515d.m52638b(this.f40561b, this.f40568i);
        this.f40570k = C17281c.a(ar.m52888b(this.f40563d, this.f40564e, this.f40565f, C4423a.g(this.f40560a), C4423a.d(this.f40560a), this.f40567h, this.f40569j));
        this.f40571l = C17281c.a(C13519h.m52654b(this.f40561b, this.f40570k));
        this.f40572m = C17281c.a(C13512d.m52626b(this.f40571l));
        this.f40573n = bx.m52704b(this.f40569j);
        this.f40574o = C17281c.a(er.m52793b(this.f40572m, this.f40562c, this.f40569j, this.f40573n));
        this.f40575p = C17281c.a(C13520i.m52657b(this.f40561b));
        this.f40576q = C17281c.a(ew.m52807b(this.f40575p));
        this.f40577r = C17281c.a(dm.m52747b(this.f40572m, this.f40562c));
        this.f40578s = C17281c.a(C13524w.m52842b(this.f40572m, this.f40562c, C13522b.m52696c()));
        this.f40579t = C17281c.a(cy.m52730b(this.f40572m, this.f40569j, this.f40562c));
        this.f40580u = C13509f.m52622b(C4423a.h(this.f40560a));
        this.f40581v = C13516e.m52642b(this.f40561b, this.f40580u);
        this.f40582w = C17281c.a(gy.m52839b(this.f40572m, this.f40581v, this.f40562c));
        this.f40583x = C17281c.a(bs.m52701b(this.f40572m, this.f40562c, RegexEmailValidator_Factory.create(), C4423a.i(this.f40560a)));
    }

    public OnboardingAnalyticsInteractor provideOnboardingAnalyticsInteractor() {
        return (OnboardingAnalyticsInteractor) this.f40562c.get();
    }

    public void inject(OnboardingActivity onboardingActivity) {
        m49617a(onboardingActivity);
    }

    public void inject(OnboardingDateWidgetView onboardingDateWidgetView) {
        m49623a(onboardingDateWidgetView);
    }

    public void inject(NameStepView nameStepView) {
        m49622a(nameStepView);
    }

    public void inject(BirthdayStepView birthdayStepView) {
        m49619a(birthdayStepView);
    }

    public void inject(GenderStepView genderStepView) {
        m49621a(genderStepView);
    }

    public void inject(PhotosStepView photosStepView) {
        m49625a(photosStepView);
    }

    public void inject(EmailStepView emailStepView) {
        m49620a(emailStepView);
    }

    public void inject(PasswordStepView passwordStepView) {
        m49624a(passwordStepView);
    }

    /* renamed from: a */
    private OnboardingActivity m49617a(OnboardingActivity onboardingActivity) {
        C10358b.m42176a((ActivityBase) onboardingActivity, (bk) C4423a.j(this.f40560a).get());
        C10358b.m42174a((ActivityBase) onboardingActivity, (C2652a) C4423a.k(this.f40560a).get());
        C10358b.m42173a((ActivityBase) onboardingActivity, (UserMetaManager) C4423a.l(this.f40560a).get());
        C10358b.m42172a((ActivityBase) onboardingActivity, (ManagerFusedLocation) C4423a.m(this.f40560a).get());
        C10358b.m42177a((ActivityBase) onboardingActivity, (bt) C4423a.h(this.f40560a).get());
        C10358b.m42175a((ActivityBase) onboardingActivity, (af) C4423a.n(this.f40560a).get());
        C10358b.m42178a((ActivityBase) onboardingActivity, (C2664c) C4423a.o(this.f40560a).get());
        C10358b.m42171a((ActivityBase) onboardingActivity, (ManagerAnalytics) C4423a.p(this.f40560a).get());
        C12160c.m48307a(onboardingActivity, (dn) this.f40574o.get());
        return onboardingActivity;
    }

    /* renamed from: a */
    private OnboardingDateWidgetView m49623a(OnboardingDateWidgetView onboardingDateWidgetView) {
        C12215m.m48374a(onboardingDateWidgetView, (es) this.f40576q.get());
        return onboardingDateWidgetView;
    }

    /* renamed from: a */
    private NameStepView m49622a(NameStepView nameStepView) {
        C12213j.m48372a(nameStepView, (cz) this.f40577r.get());
        C12213j.m48371a(nameStepView, (InputMethodManager) C4423a.q(this.f40560a).get());
        return nameStepView;
    }

    /* renamed from: a */
    private BirthdayStepView m49619a(BirthdayStepView birthdayStepView) {
        C12209b.m48357a(birthdayStepView, (BirthdayStepPresenter) this.f40578s.get());
        C12209b.m48356a(birthdayStepView, (InputMethodManager) C4423a.q(this.f40560a).get());
        return birthdayStepView;
    }

    /* renamed from: a */
    private GenderStepView m49621a(GenderStepView genderStepView) {
        C12212h.m48368a(genderStepView, (InputMethodManager) C4423a.q(this.f40560a).get());
        C12212h.m48369a(genderStepView, (by) this.f40579t.get());
        return genderStepView;
    }

    /* renamed from: a */
    private PhotosStepView m49625a(PhotosStepView photosStepView) {
        C12220t.m48380a(photosStepView, (gm) this.f40582w.get());
        C12220t.m48381a(photosStepView, C4423a.r(this.f40560a));
        C12220t.m48379a(photosStepView, (InputMethodManager) C4423a.q(this.f40560a).get());
        return photosStepView;
    }

    /* renamed from: a */
    private EmailStepView m49620a(EmailStepView emailStepView) {
        C12211e.m48366a(emailStepView, (C13526y) this.f40583x.get());
        return emailStepView;
    }

    /* renamed from: a */
    private PasswordStepView m49624a(PasswordStepView passwordStepView) {
        C12216o.m48377a(passwordStepView, m49618a());
        C12216o.m48376a(passwordStepView, (InputMethodManager) C4423a.q(this.f40560a).get());
        return passwordStepView;
    }
}
