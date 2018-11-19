package com.tinder.settings.loops.activity;

import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
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
import com.tinder.settings.loops.p407a.C14883a;
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.loops.activity.b */
public final class C16646b implements MembersInjector<AutoPlayLoopsOptionsActivity> {
    /* renamed from: a */
    private final Provider<bk> f51528a;
    /* renamed from: b */
    private final Provider<C2652a> f51529b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f51530c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f51531d;
    /* renamed from: e */
    private final Provider<bt> f51532e;
    /* renamed from: f */
    private final Provider<af> f51533f;
    /* renamed from: g */
    private final Provider<C2664c> f51534g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f51535h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f51536i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f51537j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f51538k;
    /* renamed from: l */
    private final Provider<bq> f51539l;
    /* renamed from: m */
    private final Provider<C13548a> f51540m;
    /* renamed from: n */
    private final Provider<C9861g> f51541n;
    /* renamed from: o */
    private final Provider<C2664c> f51542o;
    /* renamed from: p */
    private final Provider<Register> f51543p;
    /* renamed from: q */
    private final Provider<C8259d> f51544q;
    /* renamed from: r */
    private final Provider<C14354a> f51545r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f51546s;
    /* renamed from: t */
    private final Provider<C14883a> f51547t;

    public /* synthetic */ void injectMembers(Object obj) {
        m62111a((AutoPlayLoopsOptionsActivity) obj);
    }

    /* renamed from: a */
    public void m62111a(AutoPlayLoopsOptionsActivity autoPlayLoopsOptionsActivity) {
        C10358b.a(autoPlayLoopsOptionsActivity, (bk) this.f51528a.get());
        C10358b.a(autoPlayLoopsOptionsActivity, (C2652a) this.f51529b.get());
        C10358b.a(autoPlayLoopsOptionsActivity, (UserMetaManager) this.f51530c.get());
        C10358b.a(autoPlayLoopsOptionsActivity, (ManagerFusedLocation) this.f51531d.get());
        C10358b.a(autoPlayLoopsOptionsActivity, (bt) this.f51532e.get());
        C10358b.a(autoPlayLoopsOptionsActivity, (af) this.f51533f.get());
        C10358b.a(autoPlayLoopsOptionsActivity, (C2664c) this.f51534g.get());
        C10358b.a(autoPlayLoopsOptionsActivity, (ManagerAnalytics) this.f51535h.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (bk) this.f51528a.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (ManagerProfile) this.f51536i.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (UpdatesScheduler) this.f51537j.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (ManagerDeepLinking) this.f51538k.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (bq) this.f51539l.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (C13548a) this.f51540m.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (C9861g) this.f51541n.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (C2664c) this.f51542o.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (Register) this.f51543p.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (C8259d) this.f51544q.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (C14354a) this.f51545r.get());
        C10363g.a(autoPlayLoopsOptionsActivity, (InAppNotificationsPresenter) this.f51546s.get());
        C16646b.m62110a(autoPlayLoopsOptionsActivity, (C14883a) this.f51547t.get());
    }

    /* renamed from: a */
    public static void m62110a(AutoPlayLoopsOptionsActivity autoPlayLoopsOptionsActivity, C14883a c14883a) {
        autoPlayLoopsOptionsActivity.f60023b = c14883a;
    }
}
