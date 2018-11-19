package com.tinder.settings.activity;

import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
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
import com.tinder.match.dialog.C9861g;
import com.tinder.paywall.p360c.C13548a;
import com.tinder.presenters.C14354a;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import com.tinder.settings.presenter.C16652g;
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.activity.f */
public final class C16610f implements MembersInjector<ExitSurveyFeedbackActivity> {
    /* renamed from: a */
    private final Provider<bk> f51384a;
    /* renamed from: b */
    private final Provider<C2652a> f51385b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f51386c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f51387d;
    /* renamed from: e */
    private final Provider<bt> f51388e;
    /* renamed from: f */
    private final Provider<af> f51389f;
    /* renamed from: g */
    private final Provider<C2664c> f51390g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f51391h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f51392i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f51393j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f51394k;
    /* renamed from: l */
    private final Provider<bq> f51395l;
    /* renamed from: m */
    private final Provider<C13548a> f51396m;
    /* renamed from: n */
    private final Provider<C9861g> f51397n;
    /* renamed from: o */
    private final Provider<C2664c> f51398o;
    /* renamed from: p */
    private final Provider<Register> f51399p;
    /* renamed from: q */
    private final Provider<C8259d> f51400q;
    /* renamed from: r */
    private final Provider<C14354a> f51401r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f51402s;
    /* renamed from: t */
    private final Provider<C16652g> f51403t;

    public /* synthetic */ void injectMembers(Object obj) {
        m62023a((ExitSurveyFeedbackActivity) obj);
    }

    /* renamed from: a */
    public void m62023a(ExitSurveyFeedbackActivity exitSurveyFeedbackActivity) {
        C10358b.a(exitSurveyFeedbackActivity, (bk) this.f51384a.get());
        C10358b.a(exitSurveyFeedbackActivity, (C2652a) this.f51385b.get());
        C10358b.a(exitSurveyFeedbackActivity, (UserMetaManager) this.f51386c.get());
        C10358b.a(exitSurveyFeedbackActivity, (ManagerFusedLocation) this.f51387d.get());
        C10358b.a(exitSurveyFeedbackActivity, (bt) this.f51388e.get());
        C10358b.a(exitSurveyFeedbackActivity, (af) this.f51389f.get());
        C10358b.a(exitSurveyFeedbackActivity, (C2664c) this.f51390g.get());
        C10358b.a(exitSurveyFeedbackActivity, (ManagerAnalytics) this.f51391h.get());
        C10363g.a(exitSurveyFeedbackActivity, (bk) this.f51384a.get());
        C10363g.a(exitSurveyFeedbackActivity, (ManagerProfile) this.f51392i.get());
        C10363g.a(exitSurveyFeedbackActivity, (UpdatesScheduler) this.f51393j.get());
        C10363g.a(exitSurveyFeedbackActivity, (ManagerDeepLinking) this.f51394k.get());
        C10363g.a(exitSurveyFeedbackActivity, (bq) this.f51395l.get());
        C10363g.a(exitSurveyFeedbackActivity, (C13548a) this.f51396m.get());
        C10363g.a(exitSurveyFeedbackActivity, (C9861g) this.f51397n.get());
        C10363g.a(exitSurveyFeedbackActivity, (C2664c) this.f51398o.get());
        C10363g.a(exitSurveyFeedbackActivity, (Register) this.f51399p.get());
        C10363g.a(exitSurveyFeedbackActivity, (C8259d) this.f51400q.get());
        C10363g.a(exitSurveyFeedbackActivity, (C14354a) this.f51401r.get());
        C10363g.a(exitSurveyFeedbackActivity, (InAppNotificationsPresenter) this.f51402s.get());
        C16610f.m62022a(exitSurveyFeedbackActivity, (C16652g) this.f51403t.get());
    }

    /* renamed from: a */
    public static void m62022a(ExitSurveyFeedbackActivity exitSurveyFeedbackActivity, C16652g c16652g) {
        exitSurveyFeedbackActivity.f59988a = c16652g;
    }
}
