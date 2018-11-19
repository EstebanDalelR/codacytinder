package com.tinder.feed.view.tracker;

import com.tinder.feed.qualifiers.Feed;
import com.tinder.feed.view.model.C9540f;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.feed.view.provider.C9545e;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/feed/view/tracker/FeedViewModelPositionTracker;", "", "feedViewModelWithPositionMap", "Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;", "feedItemsProvider", "Lcom/tinder/feed/view/provider/FeedItemsProvider;", "(Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;Lcom/tinder/feed/view/provider/FeedItemsProvider;)V", "feedItemAnalyticsPropertiesSubscription", "Lrx/Subscription;", "feedItemIdToFeedViewModelWithPositionPairs", "", "Lkotlin/Pair;", "", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "feedItems", "Lcom/tinder/feed/view/model/FeedItem;", "startTracking", "", "stopTracking", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.tracker.f */
public final class C9549f {
    /* renamed from: a */
    private Subscription f31945a;
    /* renamed from: b */
    private final C9551g f31946b;
    /* renamed from: c */
    private final C9545e f31947c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lkotlin/Pair;", "", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "it", "Lcom/tinder/feed/view/model/FeedItem;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.f$a */
    static final class C13304a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C9549f f42164a;

        C13304a(C9549f c9549f) {
            this.f42164a = c9549f;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51464a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<Pair<String, C9540f>> m51464a(List<? extends FeedItem> list) {
            C9549f c9549f = this.f42164a;
            C2668g.a(list, "it");
            return c9549f.m39849a((List) list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lrx/Completable;", "it", "", "Lkotlin/Pair;", "", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.f$b */
    static final class C13305b<T, R> implements Func1<List<? extends Pair<? extends String, ? extends C9540f>>, Completable> {
        /* renamed from: a */
        final /* synthetic */ C9549f f42165a;

        C13305b(C9549f c9549f) {
            this.f42165a = c9549f;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51465a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m51465a(List<Pair<String, C9540f>> list) {
            C9551g a = this.f42165a.f31946b;
            C2668g.a(list, "it");
            return a.m39855a((Iterable) list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "", "Lkotlin/Pair;", "", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.f$c */
    static final class C14025c<T> implements Action1<List<? extends Pair<? extends String, ? extends C9540f>>> {
        /* renamed from: a */
        public static final C14025c f44413a = new C14025c();

        C14025c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53676a((List) obj);
        }

        /* renamed from: a */
        public final void m53676a(List<Pair<String, C9540f>> list) {
            C0001a.b("Successfully mapped feed items", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.f$d */
    static final class C14026d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14026d f44414a = new C14026d();

        C14026d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53677a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53677a(Throwable th) {
            C0001a.c(th, "Failed to map feed items", new Object[0]);
        }
    }

    @Inject
    public C9549f(@NotNull C9551g c9551g, @Feed @NotNull C9545e c9545e) {
        C2668g.b(c9551g, "feedViewModelWithPositionMap");
        C2668g.b(c9545e, "feedItemsProvider");
        this.f31946b = c9551g;
        this.f31947c = c9545e;
    }

    /* renamed from: a */
    public final void m39850a() {
        Subscription subscription = this.f31945a;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        this.f31945a = this.f31947c.m39833b().k(new C13304a(this)).i(new C13305b(this)).b(Schedulers.io()).a(C14025c.f44413a, C14026d.f44414a);
    }

    /* renamed from: b */
    public final void m39851b() {
        Subscription subscription = this.f31945a;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }

    /* renamed from: a */
    private final List<Pair<String, C9540f>> m39849a(List<? extends FeedItem> list) {
        return C19285g.f(C19285g.e(C19285g.a(C19301m.r(list), C14019x387a2873.f44407a), C14020x387a2874.f44408a));
    }
}
