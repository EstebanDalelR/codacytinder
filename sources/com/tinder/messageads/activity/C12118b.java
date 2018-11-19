package com.tinder.messageads.activity;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.domain.match.repository.MatchRepository;
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
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import com.tinder.updates.UpdatesScheduler;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.messageads.activity.b */
public final class C12118b implements MembersInjector<MessageAdMatchProfileActivity> {
    /* renamed from: a */
    private final Provider<bk> f39318a;
    /* renamed from: b */
    private final Provider<C2652a> f39319b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f39320c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f39321d;
    /* renamed from: e */
    private final Provider<bt> f39322e;
    /* renamed from: f */
    private final Provider<af> f39323f;
    /* renamed from: g */
    private final Provider<C2664c> f39324g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f39325h;
    /* renamed from: i */
    private final Provider<ManagerProfile> f39326i;
    /* renamed from: j */
    private final Provider<UpdatesScheduler> f39327j;
    /* renamed from: k */
    private final Provider<ManagerDeepLinking> f39328k;
    /* renamed from: l */
    private final Provider<bq> f39329l;
    /* renamed from: m */
    private final Provider<C13548a> f39330m;
    /* renamed from: n */
    private final Provider<C9861g> f39331n;
    /* renamed from: o */
    private final Provider<C2664c> f39332o;
    /* renamed from: p */
    private final Provider<Register> f39333p;
    /* renamed from: q */
    private final Provider<C8259d> f39334q;
    /* renamed from: r */
    private final Provider<C14354a> f39335r;
    /* renamed from: s */
    private final Provider<InAppNotificationsPresenter> f39336s;
    /* renamed from: t */
    private final Provider<MatchRepository> f39337t;
    /* renamed from: u */
    private final Provider<C14418b> f39338u;
    /* renamed from: v */
    private final Provider<AdUrlTracker> f39339v;

    public /* synthetic */ void injectMembers(Object obj) {
        m48259a((MessageAdMatchProfileActivity) obj);
    }

    /* renamed from: a */
    public void m48259a(MessageAdMatchProfileActivity messageAdMatchProfileActivity) {
        C10358b.m42176a((ActivityBase) messageAdMatchProfileActivity, (bk) this.f39318a.get());
        C10358b.m42174a((ActivityBase) messageAdMatchProfileActivity, (C2652a) this.f39319b.get());
        C10358b.m42173a((ActivityBase) messageAdMatchProfileActivity, (UserMetaManager) this.f39320c.get());
        C10358b.m42172a((ActivityBase) messageAdMatchProfileActivity, (ManagerFusedLocation) this.f39321d.get());
        C10358b.m42177a((ActivityBase) messageAdMatchProfileActivity, (bt) this.f39322e.get());
        C10358b.m42175a((ActivityBase) messageAdMatchProfileActivity, (af) this.f39323f.get());
        C10358b.m42178a((ActivityBase) messageAdMatchProfileActivity, (C2664c) this.f39324g.get());
        C10358b.m42171a((ActivityBase) messageAdMatchProfileActivity, (ManagerAnalytics) this.f39325h.get());
        C10363g.m42184a((ActivitySignedInBase) messageAdMatchProfileActivity, (bk) this.f39318a.get());
        C10363g.m42183a((ActivitySignedInBase) messageAdMatchProfileActivity, (ManagerProfile) this.f39326i.get());
        C10363g.m42191a((ActivitySignedInBase) messageAdMatchProfileActivity, (UpdatesScheduler) this.f39327j.get());
        C10363g.m42182a((ActivitySignedInBase) messageAdMatchProfileActivity, (ManagerDeepLinking) this.f39328k.get());
        C10363g.m42185a((ActivitySignedInBase) messageAdMatchProfileActivity, (bq) this.f39329l.get());
        C10363g.m42187a((ActivitySignedInBase) messageAdMatchProfileActivity, (C13548a) this.f39330m.get());
        C10363g.m42186a((ActivitySignedInBase) messageAdMatchProfileActivity, (C9861g) this.f39331n.get());
        C10363g.m42192a((ActivitySignedInBase) messageAdMatchProfileActivity, (C2664c) this.f39332o.get());
        C10363g.m42189a((ActivitySignedInBase) messageAdMatchProfileActivity, (Register) this.f39333p.get());
        C10363g.m42181a((ActivitySignedInBase) messageAdMatchProfileActivity, (C8259d) this.f39334q.get());
        C10363g.m42188a((ActivitySignedInBase) messageAdMatchProfileActivity, (C14354a) this.f39335r.get());
        C10363g.m42190a((ActivitySignedInBase) messageAdMatchProfileActivity, (InAppNotificationsPresenter) this.f39336s.get());
        C12118b.m48257a(messageAdMatchProfileActivity, (MatchRepository) this.f39337t.get());
        C12118b.m48258a(messageAdMatchProfileActivity, (C14418b) this.f39338u.get());
        C12118b.m48256a(messageAdMatchProfileActivity, (AdUrlTracker) this.f39339v.get());
    }

    /* renamed from: a */
    public static void m48257a(MessageAdMatchProfileActivity messageAdMatchProfileActivity, MatchRepository matchRepository) {
        messageAdMatchProfileActivity.f45424a = matchRepository;
    }

    /* renamed from: a */
    public static void m48258a(MessageAdMatchProfileActivity messageAdMatchProfileActivity, C14418b c14418b) {
        messageAdMatchProfileActivity.f45425b = c14418b;
    }

    /* renamed from: a */
    public static void m48256a(MessageAdMatchProfileActivity messageAdMatchProfileActivity, AdUrlTracker adUrlTracker) {
        messageAdMatchProfileActivity.f45426c = adUrlTracker;
    }
}
