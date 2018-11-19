package com.tinder.activities;

import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.managers.C2652a;
import com.tinder.managers.FacebookManager;
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
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.activities.d */
public final class C7280d implements MembersInjector<ActivityAddPhoto> {
    /* renamed from: a */
    private final Provider<bk> f26271a;
    /* renamed from: b */
    private final Provider<C2652a> f26272b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f26273c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f26274d;
    /* renamed from: e */
    private final Provider<bt> f26275e;
    /* renamed from: f */
    private final Provider<af> f26276f;
    /* renamed from: g */
    private final Provider<C2664c> f26277g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f26278h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f26279i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f26280j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f26281k;
    /* renamed from: l */
    private final Provider<bq> f26282l;
    /* renamed from: m */
    private final Provider<C13548a> f26283m;
    /* renamed from: n */
    private final Provider<C9861g> f26284n;
    /* renamed from: o */
    private final Provider<C2664c> f26285o;
    /* renamed from: p */
    private final Provider<Register> f26286p;
    /* renamed from: q */
    private final Provider<C8259d> f26287q;
    /* renamed from: r */
    private final Provider<C14354a> f26288r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f26289s;
    /* renamed from: t */
    private final Provider<FacebookManager> f26290t;
    /* renamed from: u */
    private final Provider<LegacyBreadCrumbTracker> f26291u;

    public /* synthetic */ void injectMembers(Object obj) {
        m31141a((ActivityAddPhoto) obj);
    }

    /* renamed from: a */
    public void m31141a(ActivityAddPhoto activityAddPhoto) {
        C10358b.a(activityAddPhoto, (bk) this.f26271a.get());
        C10358b.a(activityAddPhoto, (C2652a) this.f26272b.get());
        C10358b.a(activityAddPhoto, (UserMetaManager) this.f26273c.get());
        C10358b.a(activityAddPhoto, (ManagerFusedLocation) this.f26274d.get());
        C10358b.a(activityAddPhoto, (bt) this.f26275e.get());
        C10358b.a(activityAddPhoto, (af) this.f26276f.get());
        C10358b.a(activityAddPhoto, (C2664c) this.f26277g.get());
        C10358b.a(activityAddPhoto, (ManagerAnalytics) this.f26278h.get());
        C10363g.a(activityAddPhoto, (bk) this.f26271a.get());
        C10363g.a(activityAddPhoto, (ManagerProfile) this.f26279i.get());
        C10363g.a(activityAddPhoto, (UpdatesScheduler) this.f26280j.get());
        C10363g.a(activityAddPhoto, (ManagerDeepLinking) this.f26281k.get());
        C10363g.a(activityAddPhoto, (bq) this.f26282l.get());
        C10363g.a(activityAddPhoto, (C13548a) this.f26283m.get());
        C10363g.a(activityAddPhoto, (C9861g) this.f26284n.get());
        C10363g.a(activityAddPhoto, (C2664c) this.f26285o.get());
        C10363g.a(activityAddPhoto, (Register) this.f26286p.get());
        C10363g.a(activityAddPhoto, (C8259d) this.f26287q.get());
        C10363g.a(activityAddPhoto, (C14354a) this.f26288r.get());
        C10363g.a(activityAddPhoto, (InAppNotificationsPresenter) this.f26289s.get());
        C7280d.m31140a(activityAddPhoto, (bk) this.f26271a.get());
        C7280d.m31137a(activityAddPhoto, (FacebookManager) this.f26290t.get());
        C7280d.m31139a(activityAddPhoto, (ManagerProfile) this.f26279i.get());
        C7280d.m31138a(activityAddPhoto, (LegacyBreadCrumbTracker) this.f26291u.get());
    }

    /* renamed from: a */
    public static void m31140a(ActivityAddPhoto activityAddPhoto, bk bkVar) {
        activityAddPhoto.f29440a = bkVar;
    }

    /* renamed from: a */
    public static void m31137a(ActivityAddPhoto activityAddPhoto, FacebookManager facebookManager) {
        activityAddPhoto.f29441b = facebookManager;
    }

    /* renamed from: a */
    public static void m31139a(ActivityAddPhoto activityAddPhoto, ManagerProfile managerProfile) {
        activityAddPhoto.f29442c = managerProfile;
    }

    /* renamed from: a */
    public static void m31138a(ActivityAddPhoto activityAddPhoto, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        activityAddPhoto.f29443d = legacyBreadCrumbTracker;
    }
}
