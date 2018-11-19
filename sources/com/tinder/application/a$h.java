package com.tinder.application;

import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bq;
import com.tinder.managers.bt;
import com.tinder.purchase.register.Register;
import com.tinder.settings.activity.C16608c;
import com.tinder.settings.activity.C16610f;
import com.tinder.settings.activity.ExitSurveyActivity;
import com.tinder.settings.activity.ExitSurveyFeedbackActivity;
import com.tinder.settings.analytics.TrackExitSurveyEvent;
import com.tinder.settings.module.C18073b;
import com.tinder.settings.module.C2656a;
import com.tinder.settings.module.ExitSurveyComponent;
import com.tinder.settings.presenter.C16652g;
import com.tinder.settings.presenter.C16653i;
import com.tinder.updates.UpdatesScheduler;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

final class a$h implements ExitSurveyComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33521a;
    /* renamed from: b */
    private C2656a f33522b;
    /* renamed from: c */
    private Provider<TrackExitSurveyEvent> f33523c;

    private a$h(C4423a c4423a, C2656a c2656a) {
        this.f33521a = c4423a;
        m41816a(c2656a);
    }

    /* renamed from: a */
    private C16653i m41815a() {
        return new C16653i((TrackExitSurveyEvent) this.f33523c.get(), C4423a.s(this.f33521a), C4423a.t(this.f33521a), (AbTestUtility) C4423a.f(this.f33521a).get());
    }

    /* renamed from: b */
    private C16652g m41817b() {
        return new C16652g((TrackExitSurveyEvent) this.f33523c.get(), C4423a.s(this.f33521a), C4423a.t(this.f33521a), (AbTestUtility) C4423a.f(this.f33521a).get());
    }

    /* renamed from: a */
    private void m41816a(C2656a c2656a) {
        this.f33522b = (C2656a) C15521i.a(c2656a);
        this.f33523c = C17281c.a(C18073b.b(this.f33522b, C4423a.u(this.f33521a)));
    }

    public void inject(ExitSurveyActivity exitSurveyActivity) {
        m41813a(exitSurveyActivity);
    }

    public void inject(ExitSurveyFeedbackActivity exitSurveyFeedbackActivity) {
        m41814a(exitSurveyFeedbackActivity);
    }

    /* renamed from: a */
    private ExitSurveyActivity m41813a(ExitSurveyActivity exitSurveyActivity) {
        C10358b.m42176a((ActivityBase) exitSurveyActivity, (bk) C4423a.j(this.f33521a).get());
        C10358b.m42174a((ActivityBase) exitSurveyActivity, (C2652a) C4423a.k(this.f33521a).get());
        C10358b.m42173a((ActivityBase) exitSurveyActivity, (UserMetaManager) C4423a.l(this.f33521a).get());
        C10358b.m42172a((ActivityBase) exitSurveyActivity, (ManagerFusedLocation) C4423a.m(this.f33521a).get());
        C10358b.m42177a((ActivityBase) exitSurveyActivity, (bt) C4423a.h(this.f33521a).get());
        C10358b.m42175a((ActivityBase) exitSurveyActivity, (af) C4423a.n(this.f33521a).get());
        C10358b.m42178a((ActivityBase) exitSurveyActivity, (C2664c) C4423a.o(this.f33521a).get());
        C10358b.m42171a((ActivityBase) exitSurveyActivity, (ManagerAnalytics) C4423a.p(this.f33521a).get());
        C10363g.m42184a((ActivitySignedInBase) exitSurveyActivity, (bk) C4423a.j(this.f33521a).get());
        C10363g.m42183a((ActivitySignedInBase) exitSurveyActivity, (ManagerProfile) C4423a.v(this.f33521a).get());
        C10363g.m42191a((ActivitySignedInBase) exitSurveyActivity, (UpdatesScheduler) C4423a.w(this.f33521a).get());
        C10363g.m42182a((ActivitySignedInBase) exitSurveyActivity, (ManagerDeepLinking) C4423a.x(this.f33521a).get());
        C10363g.m42185a((ActivitySignedInBase) exitSurveyActivity, (bq) C4423a.y(this.f33521a).get());
        C10363g.m42187a((ActivitySignedInBase) exitSurveyActivity, C4423a.z(this.f33521a));
        C10363g.m42186a((ActivitySignedInBase) exitSurveyActivity, C4423a.A(this.f33521a));
        C10363g.m42192a((ActivitySignedInBase) exitSurveyActivity, (C2664c) C4423a.B(this.f33521a).get());
        C10363g.m42189a((ActivitySignedInBase) exitSurveyActivity, (Register) C4423a.C(this.f33521a).get());
        C10363g.m42181a((ActivitySignedInBase) exitSurveyActivity, (C8259d) C4423a.D(this.f33521a).get());
        C10363g.m42188a((ActivitySignedInBase) exitSurveyActivity, C4423a.E(this.f33521a));
        C10363g.m42190a((ActivitySignedInBase) exitSurveyActivity, C4423a.F(this.f33521a));
        C16608c.a(exitSurveyActivity, m41815a());
        return exitSurveyActivity;
    }

    /* renamed from: a */
    private ExitSurveyFeedbackActivity m41814a(ExitSurveyFeedbackActivity exitSurveyFeedbackActivity) {
        C10358b.m42176a((ActivityBase) exitSurveyFeedbackActivity, (bk) C4423a.j(this.f33521a).get());
        C10358b.m42174a((ActivityBase) exitSurveyFeedbackActivity, (C2652a) C4423a.k(this.f33521a).get());
        C10358b.m42173a((ActivityBase) exitSurveyFeedbackActivity, (UserMetaManager) C4423a.l(this.f33521a).get());
        C10358b.m42172a((ActivityBase) exitSurveyFeedbackActivity, (ManagerFusedLocation) C4423a.m(this.f33521a).get());
        C10358b.m42177a((ActivityBase) exitSurveyFeedbackActivity, (bt) C4423a.h(this.f33521a).get());
        C10358b.m42175a((ActivityBase) exitSurveyFeedbackActivity, (af) C4423a.n(this.f33521a).get());
        C10358b.m42178a((ActivityBase) exitSurveyFeedbackActivity, (C2664c) C4423a.o(this.f33521a).get());
        C10358b.m42171a((ActivityBase) exitSurveyFeedbackActivity, (ManagerAnalytics) C4423a.p(this.f33521a).get());
        C10363g.m42184a((ActivitySignedInBase) exitSurveyFeedbackActivity, (bk) C4423a.j(this.f33521a).get());
        C10363g.m42183a((ActivitySignedInBase) exitSurveyFeedbackActivity, (ManagerProfile) C4423a.v(this.f33521a).get());
        C10363g.m42191a((ActivitySignedInBase) exitSurveyFeedbackActivity, (UpdatesScheduler) C4423a.w(this.f33521a).get());
        C10363g.m42182a((ActivitySignedInBase) exitSurveyFeedbackActivity, (ManagerDeepLinking) C4423a.x(this.f33521a).get());
        C10363g.m42185a((ActivitySignedInBase) exitSurveyFeedbackActivity, (bq) C4423a.y(this.f33521a).get());
        C10363g.m42187a((ActivitySignedInBase) exitSurveyFeedbackActivity, C4423a.z(this.f33521a));
        C10363g.m42186a((ActivitySignedInBase) exitSurveyFeedbackActivity, C4423a.A(this.f33521a));
        C10363g.m42192a((ActivitySignedInBase) exitSurveyFeedbackActivity, (C2664c) C4423a.B(this.f33521a).get());
        C10363g.m42189a((ActivitySignedInBase) exitSurveyFeedbackActivity, (Register) C4423a.C(this.f33521a).get());
        C10363g.m42181a((ActivitySignedInBase) exitSurveyFeedbackActivity, (C8259d) C4423a.D(this.f33521a).get());
        C10363g.m42188a((ActivitySignedInBase) exitSurveyFeedbackActivity, C4423a.E(this.f33521a));
        C10363g.m42190a((ActivitySignedInBase) exitSurveyFeedbackActivity, C4423a.F(this.f33521a));
        C16610f.a(exitSurveyFeedbackActivity, m41817b());
        return exitSurveyFeedbackActivity;
    }
}
