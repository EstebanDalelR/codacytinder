package com.tinder.feed.analytics.session;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.feed.FetchedItem;
import com.tinder.domain.injection.qualifiers.FeedTrackerScheduler;
import com.tinder.feed.analytics.SessionDestination;
import com.tinder.feed.analytics.SessionSource;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.C2671a;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/feed/analytics/session/FeedSessionExecutor;", "", "sessionTracker", "Lcom/tinder/feed/analytics/session/FeedSessionTracker;", "feedSessionItemsTracker", "Lcom/tinder/feed/analytics/session/FeedSessionItemsTracker;", "trackerScheduler", "Lrx/Scheduler;", "(Lcom/tinder/feed/analytics/session/FeedSessionTracker;Lcom/tinder/feed/analytics/session/FeedSessionItemsTracker;Lrx/Scheduler;)V", "addFetchedItems", "", "items", "", "Lcom/tinder/domain/feed/FetchedItem;", "endSession", "Lrx/Single;", "Lcom/tinder/feed/analytics/session/Session;", "destination", "Lcom/tinder/feed/analytics/SessionDestination;", "getSessionId", "", "increaseFetchFeedCount", "startSession", "source", "Lcom/tinder/feed/analytics/SessionSource;", "viewActivityEvent", "activityId", "userId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.f */
public final class C9450f {
    /* renamed from: a */
    private final C9455n f31661a;
    /* renamed from: b */
    private final C9451h f31662b;
    /* renamed from: c */
    private final C2671a f31663c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$a */
    static final class C9445a<V> implements Callable<Object> {
        /* renamed from: a */
        final /* synthetic */ C9450f f31651a;
        /* renamed from: b */
        final /* synthetic */ List f31652b;

        C9445a(C9450f c9450f, List list) {
            this.f31651a = c9450f;
            this.f31652b = list;
        }

        public /* synthetic */ Object call() {
            m39490a();
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m39490a() {
            this.f31651a.f31662b.m39508a(this.f31652b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/feed/analytics/session/Session;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$d */
    static final class C9446d<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C9450f f31653a;
        /* renamed from: b */
        final /* synthetic */ SessionDestination f31654b;

        C9446d(C9450f c9450f, SessionDestination sessionDestination) {
            this.f31653a = c9450f;
            this.f31654b = sessionDestination;
        }

        public /* synthetic */ Object call() {
            return m39491a();
        }

        @NotNull
        /* renamed from: a */
        public final C9457r m39491a() {
            return this.f31653a.f31661a.m39531a(this.f31654b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$e */
    static final class C9447e<V> implements Callable<Object> {
        /* renamed from: a */
        final /* synthetic */ C9450f f31655a;

        C9447e(C9450f c9450f) {
            this.f31655a = c9450f;
        }

        public /* synthetic */ Object call() {
            m39492a();
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m39492a() {
            this.f31655a.f31662b.m39510c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$h */
    static final class C9448h<V> implements Callable<Object> {
        /* renamed from: a */
        final /* synthetic */ C9450f f31656a;
        /* renamed from: b */
        final /* synthetic */ SessionSource f31657b;

        C9448h(C9450f c9450f, SessionSource sessionSource) {
            this.f31656a = c9450f;
            this.f31657b = sessionSource;
        }

        public /* synthetic */ Object call() {
            m39493a();
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m39493a() {
            this.f31656a.f31661a.m39533a(this.f31657b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$k */
    static final class C9449k<V> implements Callable<Object> {
        /* renamed from: a */
        final /* synthetic */ C9450f f31658a;
        /* renamed from: b */
        final /* synthetic */ String f31659b;
        /* renamed from: c */
        final /* synthetic */ String f31660c;

        C9449k(C9450f c9450f, String str, String str2) {
            this.f31658a = c9450f;
            this.f31659b = str;
            this.f31660c = str2;
        }

        public /* synthetic */ Object call() {
            m39494a();
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m39494a() {
            this.f31658a.f31662b.m39507a(this.f31659b, this.f31660c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$b */
    static final class C13961b implements Action0 {
        /* renamed from: a */
        public static final C13961b f44095a = new C13961b();

        C13961b() {
        }

        public final void call() {
            C0001a.a("Add fetched items to FeedSessionItemsTracker.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$c */
    static final class C13962c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13962c f44096a = new C13962c();

        C13962c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53484a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53484a(Throwable th) {
            C0001a.c(th, "Failed to add fetched items to FeedSessionItemsTracker.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$f */
    static final class C13963f implements Action0 {
        /* renamed from: a */
        public static final C13963f f44097a = new C13963f();

        C13963f() {
        }

        public final void call() {
            C0001a.a("Increase fetch feed count by 1", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$g */
    static final class C13964g<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13964g f44098a = new C13964g();

        C13964g() {
        }

        public /* synthetic */ void call(Object obj) {
            m53485a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53485a(Throwable th) {
            C0001a.c(th, "Failed to increase fetch feed count", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$i */
    static final class C13965i implements Action0 {
        /* renamed from: a */
        public static final C13965i f44099a = new C13965i();

        C13965i() {
        }

        public final void call() {
            C0001a.a("Start a feed tracker session", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$j */
    static final class C13966j<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13966j f44100a = new C13966j();

        C13966j() {
        }

        public /* synthetic */ void call(Object obj) {
            m53486a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53486a(Throwable th) {
            C0001a.c(th, "Failed to start a session", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$l */
    static final class C13967l implements Action0 {
        /* renamed from: a */
        final /* synthetic */ String f44101a;

        C13967l(String str) {
            this.f44101a = str;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FeedSessionTracker set viewed activity event: ");
            stringBuilder.append(this.f44101a);
            C0001a.a(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.f$m */
    static final class C13968m<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ String f44102a;

        C13968m(String str) {
            this.f44102a = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53487a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53487a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FeedSessionTracker failed to set viewed activity event: ");
            stringBuilder.append(this.f44102a);
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C9450f(@NotNull C9455n c9455n, @NotNull C9451h c9451h, @FeedTrackerScheduler @NotNull C2671a c2671a) {
        C2668g.b(c9455n, "sessionTracker");
        C2668g.b(c9451h, "feedSessionItemsTracker");
        C2668g.b(c2671a, "trackerScheduler");
        this.f31661a = c9455n;
        this.f31662b = c9451h;
        this.f31663c = c2671a;
    }

    /* renamed from: a */
    public final void m39499a(@NotNull SessionSource sessionSource) {
        C2668g.b(sessionSource, "source");
        Completable.a(new C9448h(this, sessionSource)).b(this.f31663c).a(C13965i.f44099a, C13966j.f44100a);
    }

    @NotNull
    /* renamed from: a */
    public final Single<C9457r> m39498a(@NotNull SessionDestination sessionDestination) {
        C2668g.b(sessionDestination, "destination");
        sessionDestination = Single.a(new C9446d(this, sessionDestination)).b(this.f31663c);
        C2668g.a(sessionDestination, "Single.fromCallable {\n  …cribeOn(trackerScheduler)");
        return sessionDestination;
    }

    /* renamed from: a */
    public final void m39500a(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "activityId");
        C2668g.b(str2, ManagerWebServices.PARAM_USER_ID);
        Completable.a(new C9449k(this, str, str2)).b(this.f31663c).a(new C13967l(str), new C13968m(str));
    }

    @NotNull
    /* renamed from: a */
    public final String m39497a() {
        return this.f31661a.m39532a();
    }

    /* renamed from: b */
    public final void m39502b() {
        Completable.a(new C9447e(this)).b(this.f31663c).a(C13963f.f44097a, C13964g.f44098a);
    }

    /* renamed from: a */
    public final void m39501a(@NotNull List<FetchedItem> list) {
        C2668g.b(list, "items");
        Completable.a(new C9445a(this, list)).b(this.f31663c).a(C13961b.f44095a, C13962c.f44096a);
    }
}
