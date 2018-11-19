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
import com.tinder.profile.presenter.C14431r;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.activities.n */
public final class C7285n implements MembersInjector<ActivityJob> {
    /* renamed from: a */
    private final Provider<bk> f26319a;
    /* renamed from: b */
    private final Provider<C2652a> f26320b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f26321c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f26322d;
    /* renamed from: e */
    private final Provider<bt> f26323e;
    /* renamed from: f */
    private final Provider<af> f26324f;
    /* renamed from: g */
    private final Provider<C2664c> f26325g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f26326h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f26327i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f26328j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f26329k;
    /* renamed from: l */
    private final Provider<bq> f26330l;
    /* renamed from: m */
    private final Provider<C13548a> f26331m;
    /* renamed from: n */
    private final Provider<C9861g> f26332n;
    /* renamed from: o */
    private final Provider<C2664c> f26333o;
    /* renamed from: p */
    private final Provider<Register> f26334p;
    /* renamed from: q */
    private final Provider<C8259d> f26335q;
    /* renamed from: r */
    private final Provider<C14354a> f26336r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f26337s;
    /* renamed from: t */
    private final Provider<LegacyBreadCrumbTracker> f26338t;
    /* renamed from: u */
    private final Provider<C14431r> f26339u;

    public /* synthetic */ void injectMembers(Object obj) {
        m31155a((ActivityJob) obj);
    }

    /* renamed from: a */
    public void m31155a(ActivityJob activityJob) {
        C10358b.a(activityJob, (bk) this.f26319a.get());
        C10358b.a(activityJob, (C2652a) this.f26320b.get());
        C10358b.a(activityJob, (UserMetaManager) this.f26321c.get());
        C10358b.a(activityJob, (ManagerFusedLocation) this.f26322d.get());
        C10358b.a(activityJob, (bt) this.f26323e.get());
        C10358b.a(activityJob, (af) this.f26324f.get());
        C10358b.a(activityJob, (C2664c) this.f26325g.get());
        C10358b.a(activityJob, (ManagerAnalytics) this.f26326h.get());
        C10363g.a(activityJob, (bk) this.f26319a.get());
        C10363g.a(activityJob, (ManagerProfile) this.f26327i.get());
        C10363g.a(activityJob, (UpdatesScheduler) this.f26328j.get());
        C10363g.a(activityJob, (ManagerDeepLinking) this.f26329k.get());
        C10363g.a(activityJob, (bq) this.f26330l.get());
        C10363g.a(activityJob, (C13548a) this.f26331m.get());
        C10363g.a(activityJob, (C9861g) this.f26332n.get());
        C10363g.a(activityJob, (C2664c) this.f26333o.get());
        C10363g.a(activityJob, (Register) this.f26334p.get());
        C10363g.a(activityJob, (C8259d) this.f26335q.get());
        C10363g.a(activityJob, (C14354a) this.f26336r.get());
        C10363g.a(activityJob, (InAppNotificationsPresenter) this.f26337s.get());
        C7285n.m31153a(activityJob, (LegacyBreadCrumbTracker) this.f26338t.get());
        C7285n.m31154a(activityJob, (C14431r) this.f26339u.get());
    }

    /* renamed from: a */
    public static void m31153a(ActivityJob activityJob, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        activityJob.f29457a = legacyBreadCrumbTracker;
    }

    /* renamed from: a */
    public static void m31154a(ActivityJob activityJob, C14431r c14431r) {
        activityJob.f29458b = c14431r;
    }
}
