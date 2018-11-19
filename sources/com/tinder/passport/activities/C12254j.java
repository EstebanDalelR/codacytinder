package com.tinder.passport.activities;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerNetwork;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.core.experiment.AbTestUtility;
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
import com.tinder.passport.p093d.C3945a;
import com.tinder.paywall.p360c.C13548a;
import com.tinder.presenters.C14354a;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.passport.activities.j */
public final class C12254j implements MembersInjector<ActivityPassport> {
    /* renamed from: a */
    private final Provider<bk> f39639a;
    /* renamed from: b */
    private final Provider<C2652a> f39640b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f39641c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f39642d;
    /* renamed from: e */
    private final Provider<bt> f39643e;
    /* renamed from: f */
    private final Provider<af> f39644f;
    /* renamed from: g */
    private final Provider<C2664c> f39645g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f39646h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f39647i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f39648j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f39649k;
    /* renamed from: l */
    private final Provider<bq> f39650l;
    /* renamed from: m */
    private final Provider<C13548a> f39651m;
    /* renamed from: n */
    private final Provider<C9861g> f39652n;
    /* renamed from: o */
    private final Provider<C2664c> f39653o;
    /* renamed from: p */
    private final Provider<Register> f39654p;
    /* renamed from: q */
    private final Provider<C8259d> f39655q;
    /* renamed from: r */
    private final Provider<C14354a> f39656r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f39657s;
    /* renamed from: t */
    private final Provider<C3945a> f39658t;
    /* renamed from: u */
    private final Provider<ManagerNetwork> f39659u;
    /* renamed from: v */
    private final Provider<LegacyBreadCrumbTracker> f39660v;
    /* renamed from: w */
    private final Provider<C2630h> f39661w;
    /* renamed from: x */
    private final Provider<AbTestUtility> f39662x;

    public /* synthetic */ void injectMembers(Object obj) {
        m48457a((ActivityPassport) obj);
    }

    /* renamed from: a */
    public void m48457a(ActivityPassport activityPassport) {
        C10358b.m42176a((ActivityBase) activityPassport, (bk) this.f39639a.get());
        C10358b.m42174a((ActivityBase) activityPassport, (C2652a) this.f39640b.get());
        C10358b.m42173a((ActivityBase) activityPassport, (UserMetaManager) this.f39641c.get());
        C10358b.m42172a((ActivityBase) activityPassport, (ManagerFusedLocation) this.f39642d.get());
        C10358b.m42177a((ActivityBase) activityPassport, (bt) this.f39643e.get());
        C10358b.m42175a((ActivityBase) activityPassport, (af) this.f39644f.get());
        C10358b.m42178a((ActivityBase) activityPassport, (C2664c) this.f39645g.get());
        C10358b.m42171a((ActivityBase) activityPassport, (ManagerAnalytics) this.f39646h.get());
        C10363g.m42184a((ActivitySignedInBase) activityPassport, (bk) this.f39639a.get());
        C10363g.m42183a((ActivitySignedInBase) activityPassport, (ManagerProfile) this.f39647i.get());
        C10363g.m42191a((ActivitySignedInBase) activityPassport, (UpdatesScheduler) this.f39648j.get());
        C10363g.m42182a((ActivitySignedInBase) activityPassport, (ManagerDeepLinking) this.f39649k.get());
        C10363g.m42185a((ActivitySignedInBase) activityPassport, (bq) this.f39650l.get());
        C10363g.m42187a((ActivitySignedInBase) activityPassport, (C13548a) this.f39651m.get());
        C10363g.m42186a((ActivitySignedInBase) activityPassport, (C9861g) this.f39652n.get());
        C10363g.m42192a((ActivitySignedInBase) activityPassport, (C2664c) this.f39653o.get());
        C10363g.m42189a((ActivitySignedInBase) activityPassport, (Register) this.f39654p.get());
        C10363g.m42181a((ActivitySignedInBase) activityPassport, (C8259d) this.f39655q.get());
        C10363g.m42188a((ActivitySignedInBase) activityPassport, (C14354a) this.f39656r.get());
        C10363g.m42190a((ActivitySignedInBase) activityPassport, (InAppNotificationsPresenter) this.f39657s.get());
        C12254j.m48456a(activityPassport, (C3945a) this.f39658t.get());
        C12254j.m48451a(activityPassport, (ManagerNetwork) this.f39659u.get());
        C12254j.m48454a(activityPassport, (ManagerAnalytics) this.f39646h.get());
        C12254j.m48455a(activityPassport, (bt) this.f39643e.get());
        C12254j.m48453a(activityPassport, (LegacyBreadCrumbTracker) this.f39660v.get());
        C12254j.m48450a(activityPassport, (C2630h) this.f39661w.get());
        C12254j.m48452a(activityPassport, (AbTestUtility) this.f39662x.get());
    }

    /* renamed from: a */
    public static void m48456a(ActivityPassport activityPassport, C3945a c3945a) {
        activityPassport.f45429a = c3945a;
    }

    /* renamed from: a */
    public static void m48451a(ActivityPassport activityPassport, ManagerNetwork managerNetwork) {
        activityPassport.f45430b = managerNetwork;
    }

    /* renamed from: a */
    public static void m48454a(ActivityPassport activityPassport, ManagerAnalytics managerAnalytics) {
        activityPassport.f45431c = managerAnalytics;
    }

    /* renamed from: a */
    public static void m48455a(ActivityPassport activityPassport, bt btVar) {
        activityPassport.f45432d = btVar;
    }

    /* renamed from: a */
    public static void m48453a(ActivityPassport activityPassport, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        activityPassport.f45433e = legacyBreadCrumbTracker;
    }

    /* renamed from: a */
    public static void m48450a(ActivityPassport activityPassport, C2630h c2630h) {
        activityPassport.f45434f = c2630h;
    }

    /* renamed from: a */
    public static void m48452a(ActivityPassport activityPassport, AbTestUtility abTestUtility) {
        activityPassport.f45435g = abTestUtility;
    }
}
