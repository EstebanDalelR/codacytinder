package com.tinder.base;

import com.tinder.apprating.p086a.C8259d;
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
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.base.g */
public final class C10363g implements MembersInjector<ActivitySignedInBase> {
    /* renamed from: a */
    private final Provider<bk> f33815a;
    /* renamed from: b */
    private final Provider<C2652a> f33816b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f33817c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f33818d;
    /* renamed from: e */
    private final Provider<bt> f33819e;
    /* renamed from: f */
    private final Provider<af> f33820f;
    /* renamed from: g */
    private final Provider<C2664c> f33821g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f33822h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f33823i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f33824j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f33825k;
    /* renamed from: l */
    private final Provider<bq> f33826l;
    /* renamed from: m */
    private final Provider<C13548a> f33827m;
    /* renamed from: n */
    private final Provider<C9861g> f33828n;
    /* renamed from: o */
    private final Provider<C2664c> f33829o;
    /* renamed from: p */
    private final Provider<Register> f33830p;
    /* renamed from: q */
    private final Provider<C8259d> f33831q;
    /* renamed from: r */
    private final Provider<C14354a> f33832r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f33833s;

    public /* synthetic */ void injectMembers(Object obj) {
        m42193a((ActivitySignedInBase) obj);
    }

    /* renamed from: a */
    public void m42193a(ActivitySignedInBase activitySignedInBase) {
        C10358b.m42176a((ActivityBase) activitySignedInBase, (bk) this.f33815a.get());
        C10358b.m42174a((ActivityBase) activitySignedInBase, (C2652a) this.f33816b.get());
        C10358b.m42173a((ActivityBase) activitySignedInBase, (UserMetaManager) this.f33817c.get());
        C10358b.m42172a((ActivityBase) activitySignedInBase, (ManagerFusedLocation) this.f33818d.get());
        C10358b.m42177a((ActivityBase) activitySignedInBase, (bt) this.f33819e.get());
        C10358b.m42175a((ActivityBase) activitySignedInBase, (af) this.f33820f.get());
        C10358b.m42178a((ActivityBase) activitySignedInBase, (C2664c) this.f33821g.get());
        C10358b.m42171a((ActivityBase) activitySignedInBase, (ManagerAnalytics) this.f33822h.get());
        C10363g.m42184a(activitySignedInBase, (bk) this.f33815a.get());
        C10363g.m42183a(activitySignedInBase, (ManagerProfile) this.f33823i.get());
        C10363g.m42191a(activitySignedInBase, (UpdatesScheduler) this.f33824j.get());
        C10363g.m42182a(activitySignedInBase, (ManagerDeepLinking) this.f33825k.get());
        C10363g.m42185a(activitySignedInBase, (bq) this.f33826l.get());
        C10363g.m42187a(activitySignedInBase, (C13548a) this.f33827m.get());
        C10363g.m42186a(activitySignedInBase, (C9861g) this.f33828n.get());
        C10363g.m42192a(activitySignedInBase, (C2664c) this.f33829o.get());
        C10363g.m42189a(activitySignedInBase, (Register) this.f33830p.get());
        C10363g.m42181a(activitySignedInBase, (C8259d) this.f33831q.get());
        C10363g.m42188a(activitySignedInBase, (C14354a) this.f33832r.get());
        C10363g.m42190a(activitySignedInBase, (InAppNotificationsPresenter) this.f33833s.get());
    }

    /* renamed from: a */
    public static void m42184a(ActivitySignedInBase activitySignedInBase, bk bkVar) {
        activitySignedInBase.f14898G = bkVar;
    }

    /* renamed from: a */
    public static void m42183a(ActivitySignedInBase activitySignedInBase, ManagerProfile managerProfile) {
        activitySignedInBase.f14899H = managerProfile;
    }

    /* renamed from: a */
    public static void m42191a(ActivitySignedInBase activitySignedInBase, UpdatesScheduler updatesScheduler) {
        activitySignedInBase.f14900I = updatesScheduler;
    }

    /* renamed from: a */
    public static void m42182a(ActivitySignedInBase activitySignedInBase, ManagerDeepLinking managerDeepLinking) {
        activitySignedInBase.f14901J = managerDeepLinking;
    }

    /* renamed from: a */
    public static void m42185a(ActivitySignedInBase activitySignedInBase, bq bqVar) {
        activitySignedInBase.f14902K = bqVar;
    }

    /* renamed from: a */
    public static void m42187a(ActivitySignedInBase activitySignedInBase, C13548a c13548a) {
        activitySignedInBase.f14903L = c13548a;
    }

    /* renamed from: a */
    public static void m42186a(ActivitySignedInBase activitySignedInBase, C9861g c9861g) {
        activitySignedInBase.f14904M = c9861g;
    }

    /* renamed from: a */
    public static void m42192a(ActivitySignedInBase activitySignedInBase, C2664c c2664c) {
        activitySignedInBase.f14905N = c2664c;
    }

    /* renamed from: a */
    public static void m42189a(ActivitySignedInBase activitySignedInBase, Register register) {
        activitySignedInBase.f14906O = register;
    }

    /* renamed from: a */
    public static void m42181a(ActivitySignedInBase activitySignedInBase, C8259d c8259d) {
        activitySignedInBase.f14907P = c8259d;
    }

    /* renamed from: a */
    public static void m42188a(ActivitySignedInBase activitySignedInBase, C14354a c14354a) {
        activitySignedInBase.f14908Q = c14354a;
    }

    /* renamed from: a */
    public static void m42190a(ActivitySignedInBase activitySignedInBase, InAppNotificationsPresenter inAppNotificationsPresenter) {
        activitySignedInBase.f14909R = inAppNotificationsPresenter;
    }
}
