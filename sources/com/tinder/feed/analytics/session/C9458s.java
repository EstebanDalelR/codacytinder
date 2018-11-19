package com.tinder.feed.analytics.session;

import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10683b;
import com.tinder.domain.utils.RxJavaInteropExtKt;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/feed/analytics/session/StartFeedSession;", "", "feedSessionExecutor", "Lcom/tinder/feed/analytics/session/FeedSessionExecutor;", "currentScreenTracker", "Lcom/tinder/common/navigation/CurrentScreenTracker;", "feedScreen", "Lcom/tinder/common/navigation/Screen;", "(Lcom/tinder/feed/analytics/session/FeedSessionExecutor;Lcom/tinder/common/navigation/CurrentScreenTracker;Lcom/tinder/common/navigation/Screen;)V", "defaultScreen", "subscription", "Lrx/Subscription;", "startWatching", "", "stopWatching", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.s */
public final class C9458s {
    /* renamed from: a */
    private Screen f31715a = ((Screen) C10683b.f35024a);
    /* renamed from: b */
    private Subscription f31716b;
    /* renamed from: c */
    private final C9450f f31717c;
    /* renamed from: d */
    private final CurrentScreenTracker f31718d;
    /* renamed from: e */
    private final Screen f31719e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/common/navigation/Screen;", "kotlin.jvm.PlatformType", "previousScreen", "currentScreen", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.s$a */
    static final class C13251a<T1, T2, R> implements Func2<R, T, R> {
        /* renamed from: a */
        final /* synthetic */ C9458s f41989a;

        C13251a(C9458s c9458s) {
            this.f41989a = c9458s;
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m51267a((Screen) obj, (Screen) obj2);
        }

        /* renamed from: a */
        public final Screen m51267a(Screen screen, Screen screen2) {
            if ((C2668g.a(screen, this.f41989a.f31719e) ^ 1) != 0 && C2668g.a(screen2, this.f41989a.f31719e)) {
                C9450f b = this.f41989a.f31717c;
                C2668g.a(screen, "previousScreen");
                b.m39499a(C9459t.m39553b(screen));
            }
            return screen2;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/common/navigation/Screen;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.s$b */
    static final class C13975b<T> implements Action1<Screen> {
        /* renamed from: a */
        public static final C13975b f44109a = new C13975b();

        C13975b() {
        }

        public /* synthetic */ void call(Object obj) {
            m53494a((Screen) obj);
        }

        /* renamed from: a */
        public final void m53494a(Screen screen) {
            C0001a.b("StartFeedSession starts watching CurrentScreenProvider.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.s$c */
    static final class C13976c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13976c f44110a = new C13976c();

        C13976c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53495a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53495a(Throwable th) {
            C0001a.c(th, "StartFeedSession failed to watch CurrentScreenProvider", new Object[0]);
        }
    }

    @Inject
    public C9458s(@NotNull C9450f c9450f, @NotNull CurrentScreenTracker currentScreenTracker, @NotNull @Named("FeedScreen") Screen screen) {
        C2668g.b(c9450f, "feedSessionExecutor");
        C2668g.b(currentScreenTracker, "currentScreenTracker");
        C2668g.b(screen, "feedScreen");
        this.f31717c = c9450f;
        this.f31718d = currentScreenTracker;
        this.f31719e = screen;
    }

    /* renamed from: a */
    public final void m39551a() {
        Subscription a = RxJavaInteropExtKt.toV1Observable(this.f31718d.observe(), BackpressureStrategy.LATEST).b(this.f31715a, new C13251a(this)).b(Schedulers.io()).a(C13975b.f44109a, C13976c.f44110a);
        C2668g.a(a, "currentScreenTracker\n   …                        )");
        this.f31716b = a;
    }
}
