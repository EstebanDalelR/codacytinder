package com.tinder.feed.analytics.session;

import com.tinder.domain.feed.FeedPositionRange;
import com.tinder.domain.feed.FeedRangeRepository;
import com.tinder.domain.injection.qualifiers.FeedRequestFirstItemPosition;
import com.tinder.domain.injection.qualifiers.FeedRequestLastItemPosition;
import com.tinder.domain.injection.qualifiers.FeedTrackerScheduler;
import com.tinder.feed.analytics.session.FeedPositionRequestProvider.Request;
import java.util.concurrent.CyclicBarrier;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.C2671a;
import rx.functions.Action1;
import rx.p500e.C19573b;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\rJ\u0006\u0010\u001f\u001a\u00020\u0018J\b\u0010 \u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/feed/analytics/session/FeedSessionPositionTracker;", "", "feedPositionRequestProvider", "Lcom/tinder/feed/analytics/session/FeedPositionRequestProvider;", "requestFirstItemPositionBarrier", "Ljava/util/concurrent/CyclicBarrier;", "requestLastItemPositionBarrier", "feedRangeRepository", "Lcom/tinder/domain/feed/FeedRangeRepository;", "trackerScheduler", "Lrx/Scheduler;", "(Lcom/tinder/feed/analytics/session/FeedPositionRequestProvider;Ljava/util/concurrent/CyclicBarrier;Ljava/util/concurrent/CyclicBarrier;Lcom/tinder/domain/feed/FeedRangeRepository;Lrx/Scheduler;)V", "firstItemPositionOnStart", "", "isStarted", "", "lastItemPositionOnEnd", "maxItemPositionForSession", "minItemPositionForSession", "subscriptions", "Lrx/subscriptions/CompositeSubscription;", "end", "Lcom/tinder/feed/analytics/session/FeedPositionInfo;", "requestFirstItemPositionAndWait", "", "requestLastItemPositionAndWait", "resetBarriers", "resetValues", "setFirstItemPositionOnStart", "position", "setLastItemPositionOnEnd", "start", "subscribeToFeedRangeRepository", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.j */
public final class C9453j {
    /* renamed from: a */
    public static final C9452a f31673a = new C9452a();
    /* renamed from: b */
    private volatile int f31674b = -1;
    /* renamed from: c */
    private volatile int f31675c = -1;
    /* renamed from: d */
    private int f31676d = -1;
    /* renamed from: e */
    private int f31677e = -1;
    /* renamed from: f */
    private boolean f31678f;
    /* renamed from: g */
    private final C19573b f31679g = new C19573b();
    /* renamed from: h */
    private final FeedPositionRequestProvider f31680h;
    /* renamed from: i */
    private final CyclicBarrier f31681i;
    /* renamed from: j */
    private final CyclicBarrier f31682j;
    /* renamed from: k */
    private final FeedRangeRepository f31683k;
    /* renamed from: l */
    private final C2671a f31684l;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/feed/analytics/session/FeedSessionPositionTracker$Companion;", "", "()V", "DEFAULT_POSITION_VALUE", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.j$a */
    public static final class C9452a {
        private C9452a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "range", "Lcom/tinder/domain/feed/FeedPositionRange;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.j$b */
    static final class C13971b<T> implements Action1<FeedPositionRange> {
        /* renamed from: a */
        final /* synthetic */ C9453j f44105a;

        C13971b(C9453j c9453j) {
            this.f44105a = c9453j;
        }

        public /* synthetic */ void call(Object obj) {
            m53490a((FeedPositionRange) obj);
        }

        /* renamed from: a */
        public final void m53490a(FeedPositionRange feedPositionRange) {
            this.f44105a.f31676d = feedPositionRange.getMinRangePosition();
            this.f44105a.f31677e = feedPositionRange.getMaxRangePosition();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.session.j$c */
    static final class C13972c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13972c f44106a = new C13972c();

        C13972c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53491a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53491a(Throwable th) {
            C0001a.b(th);
        }
    }

    @Inject
    public C9453j(@NotNull FeedPositionRequestProvider feedPositionRequestProvider, @NotNull @FeedRequestFirstItemPosition CyclicBarrier cyclicBarrier, @NotNull @FeedRequestLastItemPosition CyclicBarrier cyclicBarrier2, @NotNull FeedRangeRepository feedRangeRepository, @FeedTrackerScheduler @NotNull C2671a c2671a) {
        C2668g.b(feedPositionRequestProvider, "feedPositionRequestProvider");
        C2668g.b(cyclicBarrier, "requestFirstItemPositionBarrier");
        C2668g.b(cyclicBarrier2, "requestLastItemPositionBarrier");
        C2668g.b(feedRangeRepository, "feedRangeRepository");
        C2668g.b(c2671a, "trackerScheduler");
        this.f31680h = feedPositionRequestProvider;
        this.f31681i = cyclicBarrier;
        this.f31682j = cyclicBarrier2;
        this.f31683k = feedRangeRepository;
        this.f31684l = c2671a;
    }

    /* renamed from: a */
    public final void m39518a() {
        if ((this.f31678f ^ 1) == 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f31678f = true;
        m39513c();
        m39514d();
        m39517g();
    }

    @NotNull
    /* renamed from: b */
    public final C9444d m39520b() {
        if (this.f31678f) {
            this.f31678f = false;
            m39515e();
            m39516f();
            this.f31679g.a();
            return new C9444d(this.f31674b, this.f31675c, this.f31676d, this.f31677e);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final void m39519a(int i) {
        this.f31674b = i;
    }

    /* renamed from: b */
    public final void m39521b(int i) {
        this.f31675c = i;
    }

    /* renamed from: c */
    private final void m39513c() {
        this.f31674b = -1;
        this.f31675c = -1;
        this.f31676d = -1;
        this.f31677e = -1;
    }

    /* renamed from: d */
    private final void m39514d() {
        this.f31680h.m39471a(Request.FIRST_ITEM_POSITION);
        this.f31681i.await();
    }

    /* renamed from: e */
    private final void m39515e() {
        this.f31680h.m39471a(Request.LAST_ITEM_POSITION);
        this.f31682j.await();
    }

    /* renamed from: f */
    private final void m39516f() {
        this.f31681i.reset();
        this.f31682j.reset();
    }

    /* renamed from: g */
    private final void m39517g() {
        this.f31679g.a(this.f31683k.observe().a(this.f31684l).a(new C13971b(this), C13972c.f44106a));
    }
}
