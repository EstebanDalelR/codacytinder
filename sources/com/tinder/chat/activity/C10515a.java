package com.tinder.chat.activity;

import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.chat.presenter.C8445s;
import com.tinder.data.keyboard.KeyboardHeightNotifier;
import com.tinder.data.keyboard.KeyboardHeightProvider;
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

/* renamed from: com.tinder.chat.activity.a */
public final class C10515a implements MembersInjector<ChatActivity> {
    /* renamed from: a */
    private final Provider<bk> f34174a;
    /* renamed from: b */
    private final Provider<C2652a> f34175b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f34176c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f34177d;
    /* renamed from: e */
    private final Provider<bt> f34178e;
    /* renamed from: f */
    private final Provider<af> f34179f;
    /* renamed from: g */
    private final Provider<C2664c> f34180g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f34181h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f34182i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f34183j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f34184k;
    /* renamed from: l */
    private final Provider<bq> f34185l;
    /* renamed from: m */
    private final Provider<C13548a> f34186m;
    /* renamed from: n */
    private final Provider<C9861g> f34187n;
    /* renamed from: o */
    private final Provider<C2664c> f34188o;
    /* renamed from: p */
    private final Provider<Register> f34189p;
    /* renamed from: q */
    private final Provider<C8259d> f34190q;
    /* renamed from: r */
    private final Provider<C14354a> f34191r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f34192s;
    /* renamed from: t */
    private final Provider<C8445s> f34193t;
    /* renamed from: u */
    private final Provider<KeyboardHeightProvider> f34194u;
    /* renamed from: v */
    private final Provider<KeyboardHeightNotifier> f34195v;

    public /* synthetic */ void injectMembers(Object obj) {
        m42485a((ChatActivity) obj);
    }

    /* renamed from: a */
    public void m42485a(ChatActivity chatActivity) {
        C10358b.m42176a((ActivityBase) chatActivity, (bk) this.f34174a.get());
        C10358b.m42174a((ActivityBase) chatActivity, (C2652a) this.f34175b.get());
        C10358b.m42173a((ActivityBase) chatActivity, (UserMetaManager) this.f34176c.get());
        C10358b.m42172a((ActivityBase) chatActivity, (ManagerFusedLocation) this.f34177d.get());
        C10358b.m42177a((ActivityBase) chatActivity, (bt) this.f34178e.get());
        C10358b.m42175a((ActivityBase) chatActivity, (af) this.f34179f.get());
        C10358b.m42178a((ActivityBase) chatActivity, (C2664c) this.f34180g.get());
        C10358b.m42171a((ActivityBase) chatActivity, (ManagerAnalytics) this.f34181h.get());
        C10363g.m42184a((ActivitySignedInBase) chatActivity, (bk) this.f34174a.get());
        C10363g.m42183a((ActivitySignedInBase) chatActivity, (ManagerProfile) this.f34182i.get());
        C10363g.m42191a((ActivitySignedInBase) chatActivity, (UpdatesScheduler) this.f34183j.get());
        C10363g.m42182a((ActivitySignedInBase) chatActivity, (ManagerDeepLinking) this.f34184k.get());
        C10363g.m42185a((ActivitySignedInBase) chatActivity, (bq) this.f34185l.get());
        C10363g.m42187a((ActivitySignedInBase) chatActivity, (C13548a) this.f34186m.get());
        C10363g.m42186a((ActivitySignedInBase) chatActivity, (C9861g) this.f34187n.get());
        C10363g.m42192a((ActivitySignedInBase) chatActivity, (C2664c) this.f34188o.get());
        C10363g.m42189a((ActivitySignedInBase) chatActivity, (Register) this.f34189p.get());
        C10363g.m42181a((ActivitySignedInBase) chatActivity, (C8259d) this.f34190q.get());
        C10363g.m42188a((ActivitySignedInBase) chatActivity, (C14354a) this.f34191r.get());
        C10363g.m42190a((ActivitySignedInBase) chatActivity, (InAppNotificationsPresenter) this.f34192s.get());
        C10515a.m42482a(chatActivity, (C8445s) this.f34193t.get());
        C10515a.m42484a(chatActivity, (KeyboardHeightProvider) this.f34194u.get());
        C10515a.m42483a(chatActivity, (KeyboardHeightNotifier) this.f34195v.get());
    }

    /* renamed from: a */
    public static void m42482a(ChatActivity chatActivity, C8445s c8445s) {
        chatActivity.f45418a = c8445s;
    }

    /* renamed from: a */
    public static void m42484a(ChatActivity chatActivity, KeyboardHeightProvider keyboardHeightProvider) {
        chatActivity.f45419b = keyboardHeightProvider;
    }

    /* renamed from: a */
    public static void m42483a(ChatActivity chatActivity, KeyboardHeightNotifier keyboardHeightNotifier) {
        chatActivity.f45420c = keyboardHeightNotifier;
    }
}
