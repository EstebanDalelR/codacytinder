package com.tinder.activities;

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
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.activities.h */
public final class C7283h implements MembersInjector<ActivityEditProfile> {
    /* renamed from: a */
    private final Provider<bk> f26297a;
    /* renamed from: b */
    private final Provider<C2652a> f26298b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f26299c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f26300d;
    /* renamed from: e */
    private final Provider<bt> f26301e;
    /* renamed from: f */
    private final Provider<af> f26302f;
    /* renamed from: g */
    private final Provider<C2664c> f26303g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f26304h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f26305i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f26306j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f26307k;
    /* renamed from: l */
    private final Provider<bq> f26308l;
    /* renamed from: m */
    private final Provider<C13548a> f26309m;
    /* renamed from: n */
    private final Provider<C9861g> f26310n;
    /* renamed from: o */
    private final Provider<C2664c> f26311o;
    /* renamed from: p */
    private final Provider<Register> f26312p;
    /* renamed from: q */
    private final Provider<C8259d> f26313q;
    /* renamed from: r */
    private final Provider<C14354a> f26314r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f26315s;
    /* renamed from: t */
    private final Provider<LegacyBreadCrumbTracker> f26316t;

    public /* synthetic */ void injectMembers(Object obj) {
        m31149a((ActivityEditProfile) obj);
    }

    /* renamed from: a */
    public void m31149a(ActivityEditProfile activityEditProfile) {
        C10358b.a(activityEditProfile, (bk) this.f26297a.get());
        C10358b.a(activityEditProfile, (C2652a) this.f26298b.get());
        C10358b.a(activityEditProfile, (UserMetaManager) this.f26299c.get());
        C10358b.a(activityEditProfile, (ManagerFusedLocation) this.f26300d.get());
        C10358b.a(activityEditProfile, (bt) this.f26301e.get());
        C10358b.a(activityEditProfile, (af) this.f26302f.get());
        C10358b.a(activityEditProfile, (C2664c) this.f26303g.get());
        C10358b.a(activityEditProfile, (ManagerAnalytics) this.f26304h.get());
        C10363g.a(activityEditProfile, (bk) this.f26297a.get());
        C10363g.a(activityEditProfile, (ManagerProfile) this.f26305i.get());
        C10363g.a(activityEditProfile, (UpdatesScheduler) this.f26306j.get());
        C10363g.a(activityEditProfile, (ManagerDeepLinking) this.f26307k.get());
        C10363g.a(activityEditProfile, (bq) this.f26308l.get());
        C10363g.a(activityEditProfile, (C13548a) this.f26309m.get());
        C10363g.a(activityEditProfile, (C9861g) this.f26310n.get());
        C10363g.a(activityEditProfile, (C2664c) this.f26311o.get());
        C10363g.a(activityEditProfile, (Register) this.f26312p.get());
        C10363g.a(activityEditProfile, (C8259d) this.f26313q.get());
        C10363g.a(activityEditProfile, (C14354a) this.f26314r.get());
        C10363g.a(activityEditProfile, (InAppNotificationsPresenter) this.f26315s.get());
        C7283h.m31148a(activityEditProfile, (bt) this.f26301e.get());
        C7283h.m31147a(activityEditProfile, (LegacyBreadCrumbTracker) this.f26316t.get());
    }

    /* renamed from: a */
    public static void m31148a(ActivityEditProfile activityEditProfile, bt btVar) {
        activityEditProfile.f29451a = btVar;
    }

    /* renamed from: a */
    public static void m31147a(ActivityEditProfile activityEditProfile, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        activityEditProfile.f29452b = legacyBreadCrumbTracker;
    }
}
