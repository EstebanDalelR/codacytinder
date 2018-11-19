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
import com.tinder.settings.presenter.C16653i;
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.activity.c */
public final class C16608c implements MembersInjector<ExitSurveyActivity> {
    /* renamed from: a */
    private final Provider<bk> f51363a;
    /* renamed from: b */
    private final Provider<C2652a> f51364b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f51365c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f51366d;
    /* renamed from: e */
    private final Provider<bt> f51367e;
    /* renamed from: f */
    private final Provider<af> f51368f;
    /* renamed from: g */
    private final Provider<C2664c> f51369g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f51370h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f51371i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f51372j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f51373k;
    /* renamed from: l */
    private final Provider<bq> f51374l;
    /* renamed from: m */
    private final Provider<C13548a> f51375m;
    /* renamed from: n */
    private final Provider<C9861g> f51376n;
    /* renamed from: o */
    private final Provider<C2664c> f51377o;
    /* renamed from: p */
    private final Provider<Register> f51378p;
    /* renamed from: q */
    private final Provider<C8259d> f51379q;
    /* renamed from: r */
    private final Provider<C14354a> f51380r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f51381s;
    /* renamed from: t */
    private final Provider<C16653i> f51382t;

    public /* synthetic */ void injectMembers(Object obj) {
        m62021a((ExitSurveyActivity) obj);
    }

    /* renamed from: a */
    public void m62021a(ExitSurveyActivity exitSurveyActivity) {
        C10358b.a(exitSurveyActivity, (bk) this.f51363a.get());
        C10358b.a(exitSurveyActivity, (C2652a) this.f51364b.get());
        C10358b.a(exitSurveyActivity, (UserMetaManager) this.f51365c.get());
        C10358b.a(exitSurveyActivity, (ManagerFusedLocation) this.f51366d.get());
        C10358b.a(exitSurveyActivity, (bt) this.f51367e.get());
        C10358b.a(exitSurveyActivity, (af) this.f51368f.get());
        C10358b.a(exitSurveyActivity, (C2664c) this.f51369g.get());
        C10358b.a(exitSurveyActivity, (ManagerAnalytics) this.f51370h.get());
        C10363g.a(exitSurveyActivity, (bk) this.f51363a.get());
        C10363g.a(exitSurveyActivity, (ManagerProfile) this.f51371i.get());
        C10363g.a(exitSurveyActivity, (UpdatesScheduler) this.f51372j.get());
        C10363g.a(exitSurveyActivity, (ManagerDeepLinking) this.f51373k.get());
        C10363g.a(exitSurveyActivity, (bq) this.f51374l.get());
        C10363g.a(exitSurveyActivity, (C13548a) this.f51375m.get());
        C10363g.a(exitSurveyActivity, (C9861g) this.f51376n.get());
        C10363g.a(exitSurveyActivity, (C2664c) this.f51377o.get());
        C10363g.a(exitSurveyActivity, (Register) this.f51378p.get());
        C10363g.a(exitSurveyActivity, (C8259d) this.f51379q.get());
        C10363g.a(exitSurveyActivity, (C14354a) this.f51380r.get());
        C10363g.a(exitSurveyActivity, (InAppNotificationsPresenter) this.f51381s.get());
        C16608c.m62020a(exitSurveyActivity, (C16653i) this.f51382t.get());
    }

    /* renamed from: a */
    public static void m62020a(ExitSurveyActivity exitSurveyActivity, C16653i c16653i) {
        exitSurveyActivity.f59987a = c16653i;
    }
}
