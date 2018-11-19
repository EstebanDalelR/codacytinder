package com.tinder.tinderplus.activities;

import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.managers.C2652a;
import com.tinder.managers.LegacyBreadCrumbTracker;
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
import com.tinder.tinderplus.p429b.C18211a;
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.tinderplus.activities.e */
public final class C16930e implements MembersInjector<ActivityTPlusControl> {
    /* renamed from: a */
    private final Provider<bk> f52156a;
    /* renamed from: b */
    private final Provider<C2652a> f52157b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f52158c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f52159d;
    /* renamed from: e */
    private final Provider<bt> f52160e;
    /* renamed from: f */
    private final Provider<af> f52161f;
    /* renamed from: g */
    private final Provider<C2664c> f52162g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f52163h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f52164i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f52165j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f52166k;
    /* renamed from: l */
    private final Provider<bq> f52167l;
    /* renamed from: m */
    private final Provider<C13548a> f52168m;
    /* renamed from: n */
    private final Provider<C9861g> f52169n;
    /* renamed from: o */
    private final Provider<C2664c> f52170o;
    /* renamed from: p */
    private final Provider<Register> f52171p;
    /* renamed from: q */
    private final Provider<C8259d> f52172q;
    /* renamed from: r */
    private final Provider<C14354a> f52173r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f52174s;
    /* renamed from: t */
    private final Provider<C18211a> f52175t;
    /* renamed from: u */
    private final Provider<LegacyBreadCrumbTracker> f52176u;

    public /* synthetic */ void injectMembers(Object obj) {
        m62600a((ActivityTPlusControl) obj);
    }

    /* renamed from: a */
    public void m62600a(ActivityTPlusControl activityTPlusControl) {
        C10358b.a(activityTPlusControl, (bk) this.f52156a.get());
        C10358b.a(activityTPlusControl, (C2652a) this.f52157b.get());
        C10358b.a(activityTPlusControl, (UserMetaManager) this.f52158c.get());
        C10358b.a(activityTPlusControl, (ManagerFusedLocation) this.f52159d.get());
        C10358b.a(activityTPlusControl, (bt) this.f52160e.get());
        C10358b.a(activityTPlusControl, (af) this.f52161f.get());
        C10358b.a(activityTPlusControl, (C2664c) this.f52162g.get());
        C10358b.a(activityTPlusControl, (ManagerAnalytics) this.f52163h.get());
        C10363g.a(activityTPlusControl, (bk) this.f52156a.get());
        C10363g.a(activityTPlusControl, (ManagerProfile) this.f52164i.get());
        C10363g.a(activityTPlusControl, (UpdatesScheduler) this.f52165j.get());
        C10363g.a(activityTPlusControl, (ManagerDeepLinking) this.f52166k.get());
        C10363g.a(activityTPlusControl, (bq) this.f52167l.get());
        C10363g.a(activityTPlusControl, (C13548a) this.f52168m.get());
        C10363g.a(activityTPlusControl, (C9861g) this.f52169n.get());
        C10363g.a(activityTPlusControl, (C2664c) this.f52170o.get());
        C10363g.a(activityTPlusControl, (Register) this.f52171p.get());
        C10363g.a(activityTPlusControl, (C8259d) this.f52172q.get());
        C10363g.a(activityTPlusControl, (C14354a) this.f52173r.get());
        C10363g.a(activityTPlusControl, (InAppNotificationsPresenter) this.f52174s.get());
        C16930e.m62599a(activityTPlusControl, (C18211a) this.f52175t.get());
        C16930e.m62598a(activityTPlusControl, (LegacyBreadCrumbTracker) this.f52176u.get());
    }

    /* renamed from: a */
    public static void m62599a(ActivityTPlusControl activityTPlusControl, C18211a c18211a) {
        activityTPlusControl.f60032a = c18211a;
    }

    /* renamed from: a */
    public static void m62598a(ActivityTPlusControl activityTPlusControl, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        activityTPlusControl.f60033b = legacyBreadCrumbTracker;
    }
}
