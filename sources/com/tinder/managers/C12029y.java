package com.tinder.managers;

import android.support.text.emoji.EmojiCompat.C0282c;
import com.android.volley.RequestQueue;
import com.tinder.analytics.C2634g;
import com.tinder.analytics.attribution.AttributionTracker;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.C3918c;
import com.tinder.apprating.p087d.C3920a;
import com.tinder.bitmoji.C3922i;
import com.tinder.common.CrashReporter;
import com.tinder.common.log.LoggingInitializer;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.crashindicator.reporter.UncaughtExceptionTracker;
import com.tinder.domain.auth.DeleteUserData;
import com.tinder.domain.experiments.BucketsWorker;
import com.tinder.domain.match.usecase.DeleteAllMatches;
import com.tinder.domain.message.usecase.CleanUpPendingMessages;
import com.tinder.domain.places.tracker.PlacesLocationTracker;
import com.tinder.feed.view.C3929a;
import com.tinder.intropricing.C3930b;
import com.tinder.intropricing.C3931c;
import com.tinder.passport.p093d.C3945a;
import com.tinder.recs.engine.RecsEngineResolver;
import com.tinder.toppicks.notifications.C3947n;
import com.tinder.typingindicator.C3948a;
import com.tinder.typingindicator.worker.TypingIndicatorWorker;
import com.tinder.updates.C3949b;
import com.tinder.updates.UpdatesScheduler;
import com.tinder.usecase.C3950a;
import com.tinder.usecase.C3951c;
import com.tinder.usecase.C3952i;
import com.tinder.usecase.C3953l;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;
import okhttp3.C2670b;

/* renamed from: com.tinder.managers.y */
public final class C12029y implements MembersInjector<ManagerApp> {
    /* renamed from: A */
    private final Provider<C3951c> f39091A;
    /* renamed from: B */
    private final Provider<CleanUpPendingMessages> f39092B;
    /* renamed from: C */
    private final Provider<C3920a> f39093C;
    /* renamed from: D */
    private final Provider<UncaughtExceptionTracker> f39094D;
    /* renamed from: E */
    private final Provider<PlacesLocationTracker> f39095E;
    /* renamed from: F */
    private final Provider<C3952i> f39096F;
    /* renamed from: G */
    private final Provider<C3918c> f39097G;
    /* renamed from: H */
    private final Provider<C0282c> f39098H;
    /* renamed from: I */
    private final Provider<TypingIndicatorWorker> f39099I;
    /* renamed from: J */
    private final Provider<C3948a> f39100J;
    /* renamed from: K */
    private final Provider<C3930b> f39101K;
    /* renamed from: L */
    private final Provider<C3931c> f39102L;
    /* renamed from: M */
    private final Provider<C3947n> f39103M;
    /* renamed from: N */
    private final Provider<C3922i> f39104N;
    /* renamed from: O */
    private final Provider<BucketsWorker> f39105O;
    /* renamed from: a */
    private final Provider<C2652a> f39106a;
    /* renamed from: b */
    private final Provider<UserMetaManager> f39107b;
    /* renamed from: c */
    private final Provider<C2664c> f39108c;
    /* renamed from: d */
    private final Provider<C2670b> f39109d;
    /* renamed from: e */
    private final Provider<RequestQueue> f39110e;
    /* renamed from: f */
    private final Provider<bj> f39111f;
    /* renamed from: g */
    private final Provider<bk> f39112g;
    /* renamed from: h */
    private final Provider<C3945a> f39113h;
    /* renamed from: i */
    private final Provider<bq> f39114i;
    /* renamed from: j */
    private final Provider<ManagerProfile> f39115j;
    /* renamed from: k */
    private final Provider<C2634g> f39116k;
    /* renamed from: l */
    private final Provider<ManagerFusedLocation> f39117l;
    /* renamed from: m */
    private final Provider<C2630h> f39118m;
    /* renamed from: n */
    private final Provider<LoggingInitializer> f39119n;
    /* renamed from: o */
    private final Provider<CrashReporter> f39120o;
    /* renamed from: p */
    private final Provider<DeleteAllMatches> f39121p;
    /* renamed from: q */
    private final Provider<UpdatesScheduler> f39122q;
    /* renamed from: r */
    private final Provider<AppVisibilityTracker> f39123r;
    /* renamed from: s */
    private final Provider<C3949b> f39124s;
    /* renamed from: t */
    private final Provider<C3950a> f39125t;
    /* renamed from: u */
    private final Provider<AttributionTracker> f39126u;
    /* renamed from: v */
    private final Provider<DeleteUserData> f39127v;
    /* renamed from: w */
    private final Provider<C3929a> f39128w;
    /* renamed from: x */
    private final Provider<AbTestUtility> f39129x;
    /* renamed from: y */
    private final Provider<RecsEngineResolver> f39130y;
    /* renamed from: z */
    private final Provider<C3953l> f39131z;

    public /* synthetic */ void injectMembers(Object obj) {
        m48119a((ManagerApp) obj);
    }

    /* renamed from: a */
    public void m48119a(ManagerApp managerApp) {
        C12029y.m48101a(managerApp, (C2652a) this.f39106a.get());
        C12029y.m48100a(managerApp, (UserMetaManager) this.f39107b.get());
        C12029y.m48116a(managerApp, (C2664c) this.f39108c.get());
        C12029y.m48117a(managerApp, (C2670b) this.f39109d.get());
        C12029y.m48118b(managerApp, (C2670b) this.f39109d.get());
        C12029y.m48078a(managerApp, (RequestQueue) this.f39110e.get());
        C12029y.m48102a(managerApp, (bj) this.f39111f.get());
        C12029y.m48103a(managerApp, (bk) this.f39112g.get());
        C12029y.m48105a(managerApp, (C3945a) this.f39113h.get());
        C12029y.m48104a(managerApp, (bq) this.f39114i.get());
        C12029y.m48099a(managerApp, (ManagerProfile) this.f39115j.get());
        C12029y.m48081a(managerApp, (C2634g) this.f39116k.get());
        C12029y.m48098a(managerApp, (ManagerFusedLocation) this.f39117l.get());
        C12029y.m48080a(managerApp, (C2630h) this.f39118m.get());
        C12029y.m48087a(managerApp, (LoggingInitializer) this.f39119n.get());
        C12029y.m48086a(managerApp, (CrashReporter) this.f39120o.get());
        C12029y.m48092a(managerApp, (DeleteAllMatches) this.f39121p.get());
        C12029y.m48110a(managerApp, (UpdatesScheduler) this.f39122q.get());
        C12029y.m48082a(managerApp, (AppVisibilityTracker) this.f39123r.get());
        C12029y.m48111a(managerApp, (C3949b) this.f39124s.get());
        C12029y.m48112a(managerApp, (C3950a) this.f39125t.get());
        C12029y.m48079a(managerApp, (AttributionTracker) this.f39126u.get());
        C12029y.m48090a(managerApp, (DeleteUserData) this.f39127v.get());
        C12029y.m48095a(managerApp, (C3929a) this.f39128w.get());
        C12029y.m48088a(managerApp, (AbTestUtility) this.f39129x.get());
        C12029y.m48106a(managerApp, (RecsEngineResolver) this.f39130y.get());
        C12029y.m48115a(managerApp, (C3953l) this.f39131z.get());
        C12029y.m48113a(managerApp, (C3951c) this.f39091A.get());
        C12029y.m48093a(managerApp, (CleanUpPendingMessages) this.f39092B.get());
        C12029y.m48084a(managerApp, (C3920a) this.f39093C.get());
        C12029y.m48089a(managerApp, (UncaughtExceptionTracker) this.f39094D.get());
        C12029y.m48094a(managerApp, (PlacesLocationTracker) this.f39095E.get());
        C12029y.m48114a(managerApp, (C3952i) this.f39096F.get());
        C12029y.m48083a(managerApp, (C3918c) this.f39097G.get());
        C12029y.m48077a(managerApp, (C0282c) this.f39098H.get());
        C12029y.m48109a(managerApp, (TypingIndicatorWorker) this.f39099I.get());
        C12029y.m48108a(managerApp, (C3948a) this.f39100J.get());
        C12029y.m48096a(managerApp, (C3930b) this.f39101K.get());
        C12029y.m48097a(managerApp, (C3931c) this.f39102L.get());
        C12029y.m48107a(managerApp, (C3947n) this.f39103M.get());
        C12029y.m48085a(managerApp, (C3922i) this.f39104N.get());
        C12029y.m48091a(managerApp, (BucketsWorker) this.f39105O.get());
    }

    /* renamed from: a */
    public static void m48101a(ManagerApp managerApp, C2652a c2652a) {
        managerApp.f12369d = c2652a;
    }

    /* renamed from: a */
    public static void m48100a(ManagerApp managerApp, UserMetaManager userMetaManager) {
        managerApp.f12370e = userMetaManager;
    }

    /* renamed from: a */
    public static void m48116a(ManagerApp managerApp, C2664c c2664c) {
        managerApp.f12371f = c2664c;
    }

    /* renamed from: a */
    public static void m48117a(ManagerApp managerApp, C2670b c2670b) {
        managerApp.f12372g = c2670b;
    }

    /* renamed from: b */
    public static void m48118b(ManagerApp managerApp, C2670b c2670b) {
        managerApp.f12373h = c2670b;
    }

    /* renamed from: a */
    public static void m48078a(ManagerApp managerApp, RequestQueue requestQueue) {
        managerApp.f12374i = requestQueue;
    }

    /* renamed from: a */
    public static void m48102a(ManagerApp managerApp, bj bjVar) {
        managerApp.f12375j = bjVar;
    }

    /* renamed from: a */
    public static void m48103a(ManagerApp managerApp, bk bkVar) {
        managerApp.f12376k = bkVar;
    }

    /* renamed from: a */
    public static void m48105a(ManagerApp managerApp, C3945a c3945a) {
        managerApp.f12377l = c3945a;
    }

    /* renamed from: a */
    public static void m48104a(ManagerApp managerApp, bq bqVar) {
        managerApp.f12378m = bqVar;
    }

    /* renamed from: a */
    public static void m48099a(ManagerApp managerApp, ManagerProfile managerProfile) {
        managerApp.f12379n = managerProfile;
    }

    /* renamed from: a */
    public static void m48081a(ManagerApp managerApp, C2634g c2634g) {
        managerApp.f12380o = c2634g;
    }

    /* renamed from: a */
    public static void m48098a(ManagerApp managerApp, ManagerFusedLocation managerFusedLocation) {
        managerApp.f12381p = managerFusedLocation;
    }

    /* renamed from: a */
    public static void m48080a(ManagerApp managerApp, C2630h c2630h) {
        managerApp.f12382q = c2630h;
    }

    /* renamed from: a */
    public static void m48087a(ManagerApp managerApp, LoggingInitializer loggingInitializer) {
        managerApp.f12383r = loggingInitializer;
    }

    /* renamed from: a */
    public static void m48086a(ManagerApp managerApp, CrashReporter crashReporter) {
        managerApp.f12384s = crashReporter;
    }

    /* renamed from: a */
    public static void m48092a(ManagerApp managerApp, DeleteAllMatches deleteAllMatches) {
        managerApp.f12385t = deleteAllMatches;
    }

    /* renamed from: a */
    public static void m48110a(ManagerApp managerApp, UpdatesScheduler updatesScheduler) {
        managerApp.f12386u = updatesScheduler;
    }

    /* renamed from: a */
    public static void m48082a(ManagerApp managerApp, AppVisibilityTracker appVisibilityTracker) {
        managerApp.f12387v = appVisibilityTracker;
    }

    /* renamed from: a */
    public static void m48111a(ManagerApp managerApp, C3949b c3949b) {
        managerApp.f12388w = c3949b;
    }

    /* renamed from: a */
    public static void m48112a(ManagerApp managerApp, C3950a c3950a) {
        managerApp.f12389x = c3950a;
    }

    /* renamed from: a */
    public static void m48079a(ManagerApp managerApp, AttributionTracker attributionTracker) {
        managerApp.f12390y = attributionTracker;
    }

    /* renamed from: a */
    public static void m48090a(ManagerApp managerApp, DeleteUserData deleteUserData) {
        managerApp.f12391z = deleteUserData;
    }

    /* renamed from: a */
    public static void m48095a(ManagerApp managerApp, C3929a c3929a) {
        managerApp.f12348A = c3929a;
    }

    /* renamed from: a */
    public static void m48088a(ManagerApp managerApp, AbTestUtility abTestUtility) {
        managerApp.f12349B = abTestUtility;
    }

    /* renamed from: a */
    public static void m48106a(ManagerApp managerApp, RecsEngineResolver recsEngineResolver) {
        managerApp.f12350C = recsEngineResolver;
    }

    /* renamed from: a */
    public static void m48115a(ManagerApp managerApp, C3953l c3953l) {
        managerApp.f12351D = c3953l;
    }

    /* renamed from: a */
    public static void m48113a(ManagerApp managerApp, C3951c c3951c) {
        managerApp.f12352E = c3951c;
    }

    /* renamed from: a */
    public static void m48093a(ManagerApp managerApp, CleanUpPendingMessages cleanUpPendingMessages) {
        managerApp.f12353F = cleanUpPendingMessages;
    }

    /* renamed from: a */
    public static void m48084a(ManagerApp managerApp, C3920a c3920a) {
        managerApp.f12354G = c3920a;
    }

    /* renamed from: a */
    public static void m48089a(ManagerApp managerApp, UncaughtExceptionTracker uncaughtExceptionTracker) {
        managerApp.f12355H = uncaughtExceptionTracker;
    }

    /* renamed from: a */
    public static void m48094a(ManagerApp managerApp, PlacesLocationTracker placesLocationTracker) {
        managerApp.f12356I = placesLocationTracker;
    }

    /* renamed from: a */
    public static void m48114a(ManagerApp managerApp, C3952i c3952i) {
        managerApp.f12357J = c3952i;
    }

    /* renamed from: a */
    public static void m48083a(ManagerApp managerApp, C3918c c3918c) {
        managerApp.f12358K = c3918c;
    }

    /* renamed from: a */
    public static void m48077a(ManagerApp managerApp, C0282c c0282c) {
        managerApp.f12359L = c0282c;
    }

    /* renamed from: a */
    public static void m48109a(ManagerApp managerApp, TypingIndicatorWorker typingIndicatorWorker) {
        managerApp.f12360M = typingIndicatorWorker;
    }

    /* renamed from: a */
    public static void m48108a(ManagerApp managerApp, C3948a c3948a) {
        managerApp.f12361N = c3948a;
    }

    /* renamed from: a */
    public static void m48096a(ManagerApp managerApp, C3930b c3930b) {
        managerApp.f12362O = c3930b;
    }

    /* renamed from: a */
    public static void m48097a(ManagerApp managerApp, C3931c c3931c) {
        managerApp.f12363P = c3931c;
    }

    /* renamed from: a */
    public static void m48107a(ManagerApp managerApp, C3947n c3947n) {
        managerApp.f12364Q = c3947n;
    }

    /* renamed from: a */
    public static void m48085a(ManagerApp managerApp, C3922i c3922i) {
        managerApp.f12365R = c3922i;
    }

    /* renamed from: a */
    public static void m48091a(ManagerApp managerApp, BucketsWorker bucketsWorker) {
        managerApp.f12366S = bucketsWorker;
    }
}
