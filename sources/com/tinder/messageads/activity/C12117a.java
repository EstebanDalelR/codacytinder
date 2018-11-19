package com.tinder.messageads.activity;

import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.chat.activity.C10515a;
import com.tinder.chat.activity.ChatActivity;
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
import com.tinder.messageads.p298e.C9908a;
import com.tinder.paywall.p360c.C13548a;
import com.tinder.presenters.C14354a;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.messageads.activity.a */
public final class C12117a implements MembersInjector<AdMessageChatActivity> {
    /* renamed from: a */
    private final Provider<bk> f39295a;
    /* renamed from: b */
    private final Provider<C2652a> f39296b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f39297c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f39298d;
    /* renamed from: e */
    private final Provider<bt> f39299e;
    /* renamed from: f */
    private final Provider<af> f39300f;
    /* renamed from: g */
    private final Provider<C2664c> f39301g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f39302h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f39303i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f39304j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f39305k;
    /* renamed from: l */
    private final Provider<bq> f39306l;
    /* renamed from: m */
    private final Provider<C13548a> f39307m;
    /* renamed from: n */
    private final Provider<C9861g> f39308n;
    /* renamed from: o */
    private final Provider<C2664c> f39309o;
    /* renamed from: p */
    private final Provider<Register> f39310p;
    /* renamed from: q */
    private final Provider<C8259d> f39311q;
    /* renamed from: r */
    private final Provider<C14354a> f39312r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f39313s;
    /* renamed from: t */
    private final Provider<C8445s> f39314t;
    /* renamed from: u */
    private final Provider<KeyboardHeightProvider> f39315u;
    /* renamed from: v */
    private final Provider<KeyboardHeightNotifier> f39316v;
    /* renamed from: w */
    private final Provider<C9908a> f39317w;

    public /* synthetic */ void injectMembers(Object obj) {
        m48255a((AdMessageChatActivity) obj);
    }

    /* renamed from: a */
    public void m48255a(AdMessageChatActivity adMessageChatActivity) {
        C10358b.m42176a((ActivityBase) adMessageChatActivity, (bk) this.f39295a.get());
        C10358b.m42174a((ActivityBase) adMessageChatActivity, (C2652a) this.f39296b.get());
        C10358b.m42173a((ActivityBase) adMessageChatActivity, (UserMetaManager) this.f39297c.get());
        C10358b.m42172a((ActivityBase) adMessageChatActivity, (ManagerFusedLocation) this.f39298d.get());
        C10358b.m42177a((ActivityBase) adMessageChatActivity, (bt) this.f39299e.get());
        C10358b.m42175a((ActivityBase) adMessageChatActivity, (af) this.f39300f.get());
        C10358b.m42178a((ActivityBase) adMessageChatActivity, (C2664c) this.f39301g.get());
        C10358b.m42171a((ActivityBase) adMessageChatActivity, (ManagerAnalytics) this.f39302h.get());
        C10363g.m42184a((ActivitySignedInBase) adMessageChatActivity, (bk) this.f39295a.get());
        C10363g.m42183a((ActivitySignedInBase) adMessageChatActivity, (ManagerProfile) this.f39303i.get());
        C10363g.m42191a((ActivitySignedInBase) adMessageChatActivity, (UpdatesScheduler) this.f39304j.get());
        C10363g.m42182a((ActivitySignedInBase) adMessageChatActivity, (ManagerDeepLinking) this.f39305k.get());
        C10363g.m42185a((ActivitySignedInBase) adMessageChatActivity, (bq) this.f39306l.get());
        C10363g.m42187a((ActivitySignedInBase) adMessageChatActivity, (C13548a) this.f39307m.get());
        C10363g.m42186a((ActivitySignedInBase) adMessageChatActivity, (C9861g) this.f39308n.get());
        C10363g.m42192a((ActivitySignedInBase) adMessageChatActivity, (C2664c) this.f39309o.get());
        C10363g.m42189a((ActivitySignedInBase) adMessageChatActivity, (Register) this.f39310p.get());
        C10363g.m42181a((ActivitySignedInBase) adMessageChatActivity, (C8259d) this.f39311q.get());
        C10363g.m42188a((ActivitySignedInBase) adMessageChatActivity, (C14354a) this.f39312r.get());
        C10363g.m42190a((ActivitySignedInBase) adMessageChatActivity, (InAppNotificationsPresenter) this.f39313s.get());
        C10515a.m42482a((ChatActivity) adMessageChatActivity, (C8445s) this.f39314t.get());
        C10515a.m42484a((ChatActivity) adMessageChatActivity, (KeyboardHeightProvider) this.f39315u.get());
        C10515a.m42483a((ChatActivity) adMessageChatActivity, (KeyboardHeightNotifier) this.f39316v.get());
        C12117a.m48254a(adMessageChatActivity, (C9908a) this.f39317w.get());
    }

    /* renamed from: a */
    public static void m48254a(AdMessageChatActivity adMessageChatActivity, C9908a c9908a) {
        adMessageChatActivity.f45465e = c9908a;
    }
}
