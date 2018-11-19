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
import com.tinder.profile.presenter.bf;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

public final class ak implements MembersInjector<SchoolActivity> {
    /* renamed from: a */
    private final Provider<bk> f26243a;
    /* renamed from: b */
    private final Provider<C2652a> f26244b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f26245c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f26246d;
    /* renamed from: e */
    private final Provider<bt> f26247e;
    /* renamed from: f */
    private final Provider<af> f26248f;
    /* renamed from: g */
    private final Provider<C2664c> f26249g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f26250h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f26251i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f26252j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f26253k;
    /* renamed from: l */
    private final Provider<bq> f26254l;
    /* renamed from: m */
    private final Provider<C13548a> f26255m;
    /* renamed from: n */
    private final Provider<C9861g> f26256n;
    /* renamed from: o */
    private final Provider<C2664c> f26257o;
    /* renamed from: p */
    private final Provider<Register> f26258p;
    /* renamed from: q */
    private final Provider<C8259d> f26259q;
    /* renamed from: r */
    private final Provider<C14354a> f26260r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f26261s;
    /* renamed from: t */
    private final Provider<LegacyBreadCrumbTracker> f26262t;
    /* renamed from: u */
    private final Provider<bf> f26263u;

    public /* synthetic */ void injectMembers(Object obj) {
        m31134a((SchoolActivity) obj);
    }

    /* renamed from: a */
    public void m31134a(SchoolActivity schoolActivity) {
        C10358b.a(schoolActivity, (bk) this.f26243a.get());
        C10358b.a(schoolActivity, (C2652a) this.f26244b.get());
        C10358b.a(schoolActivity, (UserMetaManager) this.f26245c.get());
        C10358b.a(schoolActivity, (ManagerFusedLocation) this.f26246d.get());
        C10358b.a(schoolActivity, (bt) this.f26247e.get());
        C10358b.a(schoolActivity, (af) this.f26248f.get());
        C10358b.a(schoolActivity, (C2664c) this.f26249g.get());
        C10358b.a(schoolActivity, (ManagerAnalytics) this.f26250h.get());
        C10363g.a(schoolActivity, (bk) this.f26243a.get());
        C10363g.a(schoolActivity, (ManagerProfile) this.f26251i.get());
        C10363g.a(schoolActivity, (UpdatesScheduler) this.f26252j.get());
        C10363g.a(schoolActivity, (ManagerDeepLinking) this.f26253k.get());
        C10363g.a(schoolActivity, (bq) this.f26254l.get());
        C10363g.a(schoolActivity, (C13548a) this.f26255m.get());
        C10363g.a(schoolActivity, (C9861g) this.f26256n.get());
        C10363g.a(schoolActivity, (C2664c) this.f26257o.get());
        C10363g.a(schoolActivity, (Register) this.f26258p.get());
        C10363g.a(schoolActivity, (C8259d) this.f26259q.get());
        C10363g.a(schoolActivity, (C14354a) this.f26260r.get());
        C10363g.a(schoolActivity, (InAppNotificationsPresenter) this.f26261s.get());
        m31132a(schoolActivity, (LegacyBreadCrumbTracker) this.f26262t.get());
        m31133a(schoolActivity, (bf) this.f26263u.get());
    }

    /* renamed from: a */
    public static void m31132a(SchoolActivity schoolActivity, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        schoolActivity.f29460a = legacyBreadCrumbTracker;
    }

    /* renamed from: a */
    public static void m31133a(SchoolActivity schoolActivity, bf bfVar) {
        schoolActivity.f29461b = bfVar;
    }
}
