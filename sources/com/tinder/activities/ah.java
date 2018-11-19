package com.tinder.activities;

import android.arch.lifecycle.LifecycleObserver;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.network.connectionclass.ConnectionClassManager;
import com.google.gson.Gson;
import com.tinder.analytics.performance.af;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.chat.activity.C8406b;
import com.tinder.home.p259b.C9695a;
import com.tinder.main.BackPressInterceptor;
import com.tinder.main.model.MainPage;
import com.tinder.managers.C2652a;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.managers.bq;
import com.tinder.managers.bt;
import com.tinder.match.dialog.C9861g;
import com.tinder.passport.p359e.C13543a;
import com.tinder.paywall.p360c.C13548a;
import com.tinder.presenters.C14354a;
import com.tinder.presenters.df;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import java.util.Set;
import javax.inject.Provider;

public final class ah implements MembersInjector<MainActivity> {
    /* renamed from: A */
    private final Provider<af> f26209A;
    /* renamed from: B */
    private final Provider<C9695a> f26210B;
    /* renamed from: C */
    private final Provider<Set<BackPressInterceptor>> f26211C;
    /* renamed from: D */
    private final Provider<MainPage> f26212D;
    /* renamed from: E */
    private final Provider<Set<LifecycleObserver>> f26213E;
    /* renamed from: F */
    private final Provider<C14548a> f26214F;
    /* renamed from: G */
    private final Provider<C14550a> f26215G;
    /* renamed from: H */
    private final Provider<AccountKitConfiguration> f26216H;
    /* renamed from: a */
    private final Provider<bk> f26217a;
    /* renamed from: b */
    private final Provider<C2652a> f26218b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f26219c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f26220d;
    /* renamed from: e */
    private final Provider<bt> f26221e;
    /* renamed from: f */
    private final Provider<com.tinder.managers.af> f26222f;
    /* renamed from: g */
    private final Provider<C2664c> f26223g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f26224h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f26225i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f26226j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f26227k;
    /* renamed from: l */
    private final Provider<bq> f26228l;
    /* renamed from: m */
    private final Provider<C13548a> f26229m;
    /* renamed from: n */
    private final Provider<C9861g> f26230n;
    /* renamed from: o */
    private final Provider<C2664c> f26231o;
    /* renamed from: p */
    private final Provider<Register> f26232p;
    /* renamed from: q */
    private final Provider<C8259d> f26233q;
    /* renamed from: r */
    private final Provider<C14354a> f26234r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f26235s;
    /* renamed from: t */
    private final Provider<bj> f26236t;
    /* renamed from: u */
    private final Provider<LegacyBreadCrumbTracker> f26237u;
    /* renamed from: v */
    private final Provider<df> f26238v;
    /* renamed from: w */
    private final Provider<C13543a> f26239w;
    /* renamed from: x */
    private final Provider<Gson> f26240x;
    /* renamed from: y */
    private final Provider<ConnectionClassManager> f26241y;
    /* renamed from: z */
    private final Provider<C8406b> f26242z;

    public /* synthetic */ void injectMembers(Object obj) {
        m31131a((MainActivity) obj);
    }

    /* renamed from: a */
    public void m31131a(MainActivity mainActivity) {
        C10358b.a(mainActivity, (bk) this.f26217a.get());
        C10358b.a(mainActivity, (C2652a) this.f26218b.get());
        C10358b.a(mainActivity, (UserMetaManager) this.f26219c.get());
        C10358b.a(mainActivity, (ManagerFusedLocation) this.f26220d.get());
        C10358b.a(mainActivity, (bt) this.f26221e.get());
        C10358b.a(mainActivity, (com.tinder.managers.af) this.f26222f.get());
        C10358b.a(mainActivity, (C2664c) this.f26223g.get());
        C10358b.a(mainActivity, (ManagerAnalytics) this.f26224h.get());
        C10363g.a(mainActivity, (bk) this.f26217a.get());
        C10363g.a(mainActivity, (ManagerProfile) this.f26225i.get());
        C10363g.a(mainActivity, (UpdatesScheduler) this.f26226j.get());
        C10363g.a(mainActivity, (ManagerDeepLinking) this.f26227k.get());
        C10363g.a(mainActivity, (bq) this.f26228l.get());
        C10363g.a(mainActivity, (C13548a) this.f26229m.get());
        C10363g.a(mainActivity, (C9861g) this.f26230n.get());
        C10363g.a(mainActivity, (C2664c) this.f26231o.get());
        C10363g.a(mainActivity, (Register) this.f26232p.get());
        C10363g.a(mainActivity, (C8259d) this.f26233q.get());
        C10363g.a(mainActivity, (C14354a) this.f26234r.get());
        C10363g.a(mainActivity, (InAppNotificationsPresenter) this.f26235s.get());
        m31120a(mainActivity, (C2652a) this.f26218b.get());
        m31122a(mainActivity, (bk) this.f26217a.get());
        m31121a(mainActivity, (bj) this.f26236t.get());
        m31118a(mainActivity, (ManagerDeepLinking) this.f26227k.get());
        m31123a(mainActivity, (bq) this.f26228l.get());
        m31119a(mainActivity, (ManagerFusedLocation) this.f26220d.get());
        m31124a(mainActivity, (bt) this.f26221e.get());
        m31117a(mainActivity, (LegacyBreadCrumbTracker) this.f26237u.get());
        m31126a(mainActivity, (df) this.f26238v.get());
        m31125a(mainActivity, (C13543a) this.f26239w.get());
        m31112a(mainActivity, (Gson) this.f26240x.get());
        m31111a(mainActivity, (ConnectionClassManager) this.f26241y.get());
        m31114a(mainActivity, (C8406b) this.f26242z.get());
        m31113a(mainActivity, (af) this.f26209A.get());
        m31115a(mainActivity, (C9695a) this.f26210B.get());
        m31129a(mainActivity, (Set) this.f26211C.get());
        m31116a(mainActivity, (MainPage) this.f26212D.get());
        m31130b(mainActivity, (Set) this.f26213E.get());
        m31127a(mainActivity, (C14548a) this.f26214F.get());
        m31128a(mainActivity, (C14550a) this.f26215G.get());
        m31110a(mainActivity, (AccountKitConfiguration) this.f26216H.get());
    }

    /* renamed from: a */
    public static void m31120a(MainActivity mainActivity, C2652a c2652a) {
        mainActivity.f14931a = c2652a;
    }

    /* renamed from: a */
    public static void m31122a(MainActivity mainActivity, bk bkVar) {
        mainActivity.f14932b = bkVar;
    }

    /* renamed from: a */
    public static void m31121a(MainActivity mainActivity, bj bjVar) {
        mainActivity.f14933c = bjVar;
    }

    /* renamed from: a */
    public static void m31118a(MainActivity mainActivity, ManagerDeepLinking managerDeepLinking) {
        mainActivity.f14934d = managerDeepLinking;
    }

    /* renamed from: a */
    public static void m31123a(MainActivity mainActivity, bq bqVar) {
        mainActivity.f14935e = bqVar;
    }

    /* renamed from: a */
    public static void m31119a(MainActivity mainActivity, ManagerFusedLocation managerFusedLocation) {
        mainActivity.f14936f = managerFusedLocation;
    }

    /* renamed from: a */
    public static void m31124a(MainActivity mainActivity, bt btVar) {
        mainActivity.f14937g = btVar;
    }

    /* renamed from: a */
    public static void m31117a(MainActivity mainActivity, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        mainActivity.f14938h = legacyBreadCrumbTracker;
    }

    /* renamed from: a */
    public static void m31126a(MainActivity mainActivity, df dfVar) {
        mainActivity.f14939i = dfVar;
    }

    /* renamed from: a */
    public static void m31125a(MainActivity mainActivity, C13543a c13543a) {
        mainActivity.f14940j = c13543a;
    }

    /* renamed from: a */
    public static void m31112a(MainActivity mainActivity, Gson gson) {
        mainActivity.f14941k = gson;
    }

    /* renamed from: a */
    public static void m31111a(MainActivity mainActivity, ConnectionClassManager connectionClassManager) {
        mainActivity.f14942l = connectionClassManager;
    }

    /* renamed from: a */
    public static void m31114a(MainActivity mainActivity, C8406b c8406b) {
        mainActivity.f14943m = c8406b;
    }

    /* renamed from: a */
    public static void m31113a(MainActivity mainActivity, af afVar) {
        mainActivity.f14944n = afVar;
    }

    /* renamed from: a */
    public static void m31115a(MainActivity mainActivity, C9695a c9695a) {
        mainActivity.f14945o = c9695a;
    }

    /* renamed from: a */
    public static void m31129a(MainActivity mainActivity, Set<BackPressInterceptor> set) {
        mainActivity.f14946p = set;
    }

    /* renamed from: a */
    public static void m31116a(MainActivity mainActivity, MainPage mainPage) {
        mainActivity.f14947q = mainPage;
    }

    /* renamed from: b */
    public static void m31130b(MainActivity mainActivity, Set<LifecycleObserver> set) {
        mainActivity.f14948r = set;
    }

    /* renamed from: a */
    public static void m31127a(MainActivity mainActivity, C14548a c14548a) {
        mainActivity.f14949s = c14548a;
    }

    /* renamed from: a */
    public static void m31128a(MainActivity mainActivity, C14550a c14550a) {
        mainActivity.f14950t = c14550a;
    }

    /* renamed from: a */
    public static void m31110a(MainActivity mainActivity, AccountKitConfiguration accountKitConfiguration) {
        mainActivity.f14951u = accountKitConfiguration;
    }
}
