package com.tinder.activities;

import com.tinder.auth.interactor.C8280l;
import com.tinder.base.C10358b;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.managers.C2652a;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bt;
import com.tinder.presenters.C17741b;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.activities.r */
public final class C7288r implements MembersInjector<ActivityVerification> {
    /* renamed from: a */
    private final Provider<bk> f26342a;
    /* renamed from: b */
    private final Provider<C2652a> f26343b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f26344c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f26345d;
    /* renamed from: e */
    private final Provider<bt> f26346e;
    /* renamed from: f */
    private final Provider<af> f26347f;
    /* renamed from: g */
    private final Provider<C2664c> f26348g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f26349h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f26350i;
    /* renamed from: j */
    private final Provider<LegacyBreadCrumbTracker> f26351j;
    /* renamed from: k */
    private final Provider<C17741b> f26352k;
    /* renamed from: l */
    private final Provider<AbTestUtility> f26353l;
    /* renamed from: m */
    private final Provider<C8280l> f26354m;

    public /* synthetic */ void injectMembers(Object obj) {
        m31165a((ActivityVerification) obj);
    }

    /* renamed from: a */
    public void m31165a(ActivityVerification activityVerification) {
        C10358b.a(activityVerification, (bk) this.f26342a.get());
        C10358b.a(activityVerification, (C2652a) this.f26343b.get());
        C10358b.a(activityVerification, (UserMetaManager) this.f26344c.get());
        C10358b.a(activityVerification, (ManagerFusedLocation) this.f26345d.get());
        C10358b.a(activityVerification, (bt) this.f26346e.get());
        C10358b.a(activityVerification, (af) this.f26347f.get());
        C10358b.a(activityVerification, (C2664c) this.f26348g.get());
        C10358b.a(activityVerification, (ManagerAnalytics) this.f26349h.get());
        C7288r.m31161a(activityVerification, (C2652a) this.f26343b.get());
        C7288r.m31160a(activityVerification, (ManagerProfile) this.f26350i.get());
        C7288r.m31162a(activityVerification, (bk) this.f26342a.get());
        C7288r.m31159a(activityVerification, (ManagerFusedLocation) this.f26345d.get());
        C7288r.m31163a(activityVerification, (bt) this.f26346e.get());
        C7288r.m31158a(activityVerification, (LegacyBreadCrumbTracker) this.f26351j.get());
        C7288r.m31164a(activityVerification, (C17741b) this.f26352k.get());
        C7288r.m31157a(activityVerification, (AbTestUtility) this.f26353l.get());
        C7288r.m31156a(activityVerification, (C8280l) this.f26354m.get());
    }

    /* renamed from: a */
    public static void m31161a(ActivityVerification activityVerification, C2652a c2652a) {
        activityVerification.f29424a = c2652a;
    }

    /* renamed from: a */
    public static void m31160a(ActivityVerification activityVerification, ManagerProfile managerProfile) {
        activityVerification.f29425b = managerProfile;
    }

    /* renamed from: a */
    public static void m31162a(ActivityVerification activityVerification, bk bkVar) {
        activityVerification.f29426c = bkVar;
    }

    /* renamed from: a */
    public static void m31159a(ActivityVerification activityVerification, ManagerFusedLocation managerFusedLocation) {
        activityVerification.f29427d = managerFusedLocation;
    }

    /* renamed from: a */
    public static void m31163a(ActivityVerification activityVerification, bt btVar) {
        activityVerification.f29428e = btVar;
    }

    /* renamed from: a */
    public static void m31158a(ActivityVerification activityVerification, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        activityVerification.f29429f = legacyBreadCrumbTracker;
    }

    /* renamed from: a */
    public static void m31164a(ActivityVerification activityVerification, C17741b c17741b) {
        activityVerification.f29430g = c17741b;
    }

    /* renamed from: a */
    public static void m31157a(ActivityVerification activityVerification, AbTestUtility abTestUtility) {
        activityVerification.f29431h = abTestUtility;
    }

    /* renamed from: a */
    public static void m31156a(ActivityVerification activityVerification, C8280l c8280l) {
        activityVerification.f29432i = c8280l;
    }
}
