package com.tinder.settings.activity;

import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerNetwork;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.managers.C2652a;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.ad;
import com.tinder.managers.af;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.managers.bq;
import com.tinder.managers.bt;
import com.tinder.match.dialog.C9861g;
import com.tinder.p238f.p239a.C9363a;
import com.tinder.passport.p093d.C3945a;
import com.tinder.paywall.p360c.C13548a;
import com.tinder.presenters.C14354a;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import com.tinder.settings.p405c.C14867d;
import com.tinder.settings.presenter.C18077q;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.activity.p */
public final class C16612p implements MembersInjector<SettingsActivity> {
    /* renamed from: A */
    private final Provider<C9363a> f51413A;
    /* renamed from: B */
    private final Provider<FastMatchConfigProvider> f51414B;
    /* renamed from: C */
    private final Provider<C14867d> f51415C;
    /* renamed from: D */
    private final Provider<C18077q> f51416D;
    /* renamed from: a */
    private final Provider<bk> f51417a;
    /* renamed from: b */
    private final Provider<C2652a> f51418b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f51419c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f51420d;
    /* renamed from: e */
    private final Provider<bt> f51421e;
    /* renamed from: f */
    private final Provider<af> f51422f;
    /* renamed from: g */
    private final Provider<C2664c> f51423g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f51424h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f51425i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f51426j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f51427k;
    /* renamed from: l */
    private final Provider<bq> f51428l;
    /* renamed from: m */
    private final Provider<C13548a> f51429m;
    /* renamed from: n */
    private final Provider<C9861g> f51430n;
    /* renamed from: o */
    private final Provider<C2664c> f51431o;
    /* renamed from: p */
    private final Provider<Register> f51432p;
    /* renamed from: q */
    private final Provider<C8259d> f51433q;
    /* renamed from: r */
    private final Provider<C14354a> f51434r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f51435s;
    /* renamed from: t */
    private final Provider<C3945a> f51436t;
    /* renamed from: u */
    private final Provider<bj> f51437u;
    /* renamed from: v */
    private final Provider<ManagerNetwork> f51438v;
    /* renamed from: w */
    private final Provider<ad> f51439w;
    /* renamed from: x */
    private final Provider<LegacyBreadCrumbTracker> f51440x;
    /* renamed from: y */
    private final Provider<EnvironmentProvider> f51441y;
    /* renamed from: z */
    private final Provider<C15193i> f51442z;

    public /* synthetic */ void injectMembers(Object obj) {
        m62040a((SettingsActivity) obj);
    }

    /* renamed from: a */
    public void m62040a(SettingsActivity settingsActivity) {
        C10358b.a(settingsActivity, (bk) this.f51417a.get());
        C10358b.a(settingsActivity, (C2652a) this.f51418b.get());
        C10358b.a(settingsActivity, (UserMetaManager) this.f51419c.get());
        C10358b.a(settingsActivity, (ManagerFusedLocation) this.f51420d.get());
        C10358b.a(settingsActivity, (bt) this.f51421e.get());
        C10358b.a(settingsActivity, (af) this.f51422f.get());
        C10358b.a(settingsActivity, (C2664c) this.f51423g.get());
        C10358b.a(settingsActivity, (ManagerAnalytics) this.f51424h.get());
        C10363g.a(settingsActivity, (bk) this.f51417a.get());
        C10363g.a(settingsActivity, (ManagerProfile) this.f51425i.get());
        C10363g.a(settingsActivity, (UpdatesScheduler) this.f51426j.get());
        C10363g.a(settingsActivity, (ManagerDeepLinking) this.f51427k.get());
        C10363g.a(settingsActivity, (bq) this.f51428l.get());
        C10363g.a(settingsActivity, (C13548a) this.f51429m.get());
        C10363g.a(settingsActivity, (C9861g) this.f51430n.get());
        C10363g.a(settingsActivity, (C2664c) this.f51431o.get());
        C10363g.a(settingsActivity, (Register) this.f51432p.get());
        C10363g.a(settingsActivity, (C8259d) this.f51433q.get());
        C10363g.a(settingsActivity, (C14354a) this.f51434r.get());
        C10363g.a(settingsActivity, (InAppNotificationsPresenter) this.f51435s.get());
        C16612p.m62035a(settingsActivity, (C3945a) this.f51436t.get());
        C16612p.m62033a(settingsActivity, (bj) this.f51437u.get());
        C16612p.m62027a(settingsActivity, (ManagerNetwork) this.f51438v.get());
        C16612p.m62032a(settingsActivity, (ad) this.f51439w.get());
        C16612p.m62031a(settingsActivity, (ManagerAnalytics) this.f51424h.get());
        C16612p.m62039a(settingsActivity, (C2664c) this.f51423g.get());
        C16612p.m62030a(settingsActivity, (LegacyBreadCrumbTracker) this.f51440x.get());
        C16612p.m62026a(settingsActivity, (EnvironmentProvider) this.f51441y.get());
        C16612p.m62034a(settingsActivity, (bk) this.f51417a.get());
        C16612p.m62038a(settingsActivity, (C15193i) this.f51442z.get());
        C16612p.m62029a(settingsActivity, (C9363a) this.f51413A.get());
        C16612p.m62028a(settingsActivity, (FastMatchConfigProvider) this.f51414B.get());
        C16612p.m62036a(settingsActivity, (C14867d) this.f51415C.get());
        C16612p.m62037a(settingsActivity, (C18077q) this.f51416D.get());
    }

    /* renamed from: a */
    public static void m62035a(SettingsActivity settingsActivity, C3945a c3945a) {
        settingsActivity.f59998a = c3945a;
    }

    /* renamed from: a */
    public static void m62033a(SettingsActivity settingsActivity, bj bjVar) {
        settingsActivity.f59999b = bjVar;
    }

    /* renamed from: a */
    public static void m62027a(SettingsActivity settingsActivity, ManagerNetwork managerNetwork) {
        settingsActivity.f60000c = managerNetwork;
    }

    /* renamed from: a */
    public static void m62032a(SettingsActivity settingsActivity, ad adVar) {
        settingsActivity.f60001d = adVar;
    }

    /* renamed from: a */
    public static void m62031a(SettingsActivity settingsActivity, ManagerAnalytics managerAnalytics) {
        settingsActivity.f60002e = managerAnalytics;
    }

    /* renamed from: a */
    public static void m62039a(SettingsActivity settingsActivity, C2664c c2664c) {
        settingsActivity.f60003f = c2664c;
    }

    /* renamed from: a */
    public static void m62030a(SettingsActivity settingsActivity, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        settingsActivity.f60004g = legacyBreadCrumbTracker;
    }

    /* renamed from: a */
    public static void m62026a(SettingsActivity settingsActivity, EnvironmentProvider environmentProvider) {
        settingsActivity.f60005h = environmentProvider;
    }

    /* renamed from: a */
    public static void m62034a(SettingsActivity settingsActivity, bk bkVar) {
        settingsActivity.f60006i = bkVar;
    }

    /* renamed from: a */
    public static void m62038a(SettingsActivity settingsActivity, C15193i c15193i) {
        settingsActivity.f60007j = c15193i;
    }

    /* renamed from: a */
    public static void m62029a(SettingsActivity settingsActivity, C9363a c9363a) {
        settingsActivity.f60008k = c9363a;
    }

    /* renamed from: a */
    public static void m62028a(SettingsActivity settingsActivity, FastMatchConfigProvider fastMatchConfigProvider) {
        settingsActivity.f60009l = fastMatchConfigProvider;
    }

    /* renamed from: a */
    public static void m62036a(SettingsActivity settingsActivity, C14867d c14867d) {
        settingsActivity.f60010m = c14867d;
    }

    /* renamed from: a */
    public static void m62037a(SettingsActivity settingsActivity, C18077q c18077q) {
        settingsActivity.f60011n = c18077q;
    }
}
