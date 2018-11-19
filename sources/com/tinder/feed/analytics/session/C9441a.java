package com.tinder.feed.analytics.session;

import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10683b;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.feed.analytics.events.C11691f;
import com.tinder.feed.analytics.events.C11691f.C9438a;
import io.reactivex.BackpressureStrategy;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/feed/analytics/session/EndFeedSession;", "", "feedSessionExecutor", "Lcom/tinder/feed/analytics/session/FeedSessionExecutor;", "feedSessionEventDispatcher", "Lcom/tinder/feed/analytics/events/FeedSessionEventDispatcher;", "currentScreenTracker", "Lcom/tinder/common/navigation/CurrentScreenTracker;", "feedScreen", "Lcom/tinder/common/navigation/Screen;", "(Lcom/tinder/feed/analytics/session/FeedSessionExecutor;Lcom/tinder/feed/analytics/events/FeedSessionEventDispatcher;Lcom/tinder/common/navigation/CurrentScreenTracker;Lcom/tinder/common/navigation/Screen;)V", "defaultScreen", "subscription", "Lrx/Subscription;", "buildRequest", "Lcom/tinder/feed/analytics/events/FeedSessionEventDispatcher$Request;", "session", "Lcom/tinder/feed/analytics/session/Session;", "endSession", "", "previousScreen", "currentScreen", "startWatching", "stopWatching", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.a */
public final class C9441a {
    /* renamed from: a */
    private Screen f31635a = ((Screen) C10683b.f35024a);
    /* renamed from: b */
    private Subscription f31636b;
    /* renamed from: c */
    private final C9450f f31637c;
    /* renamed from: d */
    private final C11691f f31638d;
    /* renamed from: e */
    private final CurrentScreenTracker f31639e;
    /* renamed from: f */
    private final Screen f31640f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/common/navigation/Screen;", "kotlin.jvm.PlatformType", "previousScreen", "currentScreen", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.a$c */
    static final class C13239c<T1, T2, R> implements Func2<R, T, R> {
        /* renamed from: a */
        final /* synthetic */ C9441a f41965a;

        C13239c(C9441a c9441a) {
            this.f41965a = c9441a;
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m51243a((Screen) obj, (Screen) obj2);
        }

        /* renamed from: a */
        public final Screen m51243a(Screen screen, Screen screen2) {
            C9441a c9441a = this.f41965a;
            C2668g.a(screen2, "currentScreen");
            c9441a.m39475a(screen, screen2);
            return screen2;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "session", "Lcom/tinder/feed/analytics/session/Session;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.a$a */
    static final class C13957a<T> implements Action1<C9457r> {
        /* renamed from: a */
        final /* synthetic */ C9441a f44091a;

        C13957a(C9441a c9441a) {
            this.f44091a = c9441a;
        }

        public /* synthetic */ void call(Object obj) {
            m53480a((C9457r) obj);
        }

        /* renamed from: a */
        public final void m53480a(C9457r c9457r) {
            C11691f a = this.f44091a.f31638d;
            C9441a c9441a = this.f44091a;
            C2668g.a(c9457r, "session");
            a.m47515a(c9441a.m39473a(c9457r));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.a$b */
    static final class C13958b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13958b f44092a = new C13958b();

        C13958b() {
        }

        public /* synthetic */ void call(Object obj) {
            m53481a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53481a(Throwable th) {
            C0001a.c(th, "Failed to fire FeedSessionEvent when a session ends", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/common/navigation/Screen;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.a$d */
    static final class C13959d<T> implements Action1<Screen> {
        /* renamed from: a */
        public static final C13959d f44093a = new C13959d();

        C13959d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53482a((Screen) obj);
        }

        /* renamed from: a */
        public final void m53482a(Screen screen) {
            C0001a.b("EndFeedSession starts watching CurrentScreenProvider.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.a$e */
    static final class C13960e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13960e f44094a = new C13960e();

        C13960e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53483a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53483a(Throwable th) {
            C0001a.c(th, "EndFeedSession failed to watch CurrentScreenProvider", new Object[0]);
        }
    }

    @Inject
    public C9441a(@NotNull C9450f c9450f, @NotNull C11691f c11691f, @NotNull CurrentScreenTracker currentScreenTracker, @NotNull @Named("FeedScreen") Screen screen) {
        C2668g.b(c9450f, "feedSessionExecutor");
        C2668g.b(c11691f, "feedSessionEventDispatcher");
        C2668g.b(currentScreenTracker, "currentScreenTracker");
        C2668g.b(screen, "feedScreen");
        this.f31637c = c9450f;
        this.f31638d = c11691f;
        this.f31639e = currentScreenTracker;
        this.f31640f = screen;
    }

    /* renamed from: a */
    public final void m39477a() {
        Subscription a = RxJavaInteropExtKt.toV1Observable(this.f31639e.observe(), BackpressureStrategy.LATEST).b(this.f31635a, new C13239c(this)).b(Schedulers.io()).a(C13959d.f44093a, C13960e.f44094a);
        C2668g.a(a, "currentScreenTracker\n   …                        )");
        this.f31636b = a;
    }

    /* renamed from: a */
    private final void m39475a(Screen screen, Screen screen2) {
        if (C2668g.a(screen, this.f31640f) != null && (C2668g.a(screen2, this.f31640f) ^ 1) != null) {
            this.f31637c.m39498a(C9442b.m39479b(screen2)).a(Schedulers.io()).a((Action1) new C13957a(this), C13958b.f44092a);
        }
    }

    /* renamed from: a */
    private final C9438a m39473a(C9457r c9457r) {
        return new C9438a(c9457r.m39534a(), c9457r.m39535b(), c9457r.m39536c(), c9457r.m39537d(), c9457r.m39538e(), c9457r.m39539f(), c9457r.m39540g(), c9457r.m39541h(), c9457r.m39542i(), c9457r.m39543j(), c9457r.m39544k(), c9457r.m39545l(), c9457r.m39546m(), c9457r.m39547n(), c9457r.m39548o());
    }
}
