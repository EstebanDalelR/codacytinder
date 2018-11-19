package com.tinder.base;

import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bt;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.base.b */
public final class C10358b implements MembersInjector<ActivityBase> {
    /* renamed from: a */
    private final Provider<bk> f33803a;
    /* renamed from: b */
    private final Provider<C2652a> f33804b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f33805c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f33806d;
    /* renamed from: e */
    private final Provider<bt> f33807e;
    /* renamed from: f */
    private final Provider<af> f33808f;
    /* renamed from: g */
    private final Provider<C2664c> f33809g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f33810h;

    public /* synthetic */ void injectMembers(Object obj) {
        m42179a((ActivityBase) obj);
    }

    /* renamed from: a */
    public void m42179a(ActivityBase activityBase) {
        C10358b.m42176a(activityBase, (bk) this.f33803a.get());
        C10358b.m42174a(activityBase, (C2652a) this.f33804b.get());
        C10358b.m42173a(activityBase, (UserMetaManager) this.f33805c.get());
        C10358b.m42172a(activityBase, (ManagerFusedLocation) this.f33806d.get());
        C10358b.m42177a(activityBase, (bt) this.f33807e.get());
        C10358b.m42175a(activityBase, (af) this.f33808f.get());
        C10358b.m42178a(activityBase, (C2664c) this.f33809g.get());
        C10358b.m42171a(activityBase, (ManagerAnalytics) this.f33810h.get());
    }

    /* renamed from: a */
    public static void m42176a(ActivityBase activityBase, bk bkVar) {
        activityBase.f14863w = bkVar;
    }

    /* renamed from: a */
    public static void m42174a(ActivityBase activityBase, C2652a c2652a) {
        activityBase.f14864x = c2652a;
    }

    /* renamed from: a */
    public static void m42173a(ActivityBase activityBase, UserMetaManager userMetaManager) {
        activityBase.f14865y = userMetaManager;
    }

    /* renamed from: a */
    public static void m42172a(ActivityBase activityBase, ManagerFusedLocation managerFusedLocation) {
        activityBase.f14866z = managerFusedLocation;
    }

    /* renamed from: a */
    public static void m42177a(ActivityBase activityBase, bt btVar) {
        activityBase.f14853A = btVar;
    }

    /* renamed from: a */
    public static void m42175a(ActivityBase activityBase, af afVar) {
        activityBase.f14854B = afVar;
    }

    /* renamed from: a */
    public static void m42178a(ActivityBase activityBase, C2664c c2664c) {
        activityBase.f14855C = c2664c;
    }

    /* renamed from: a */
    public static void m42171a(ActivityBase activityBase, ManagerAnalytics managerAnalytics) {
        activityBase.f14856D = managerAnalytics;
    }
}
