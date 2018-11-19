package com.tinder.feed.view.tracker;

import com.tinder.common.tracker.recyclerview.p199b.C8569h;
import com.tinder.common.tracker.recyclerview.p199b.C8571j;
import com.tinder.common.tracker.recyclerview.p200c.C8577i;
import com.tinder.domain.feed.FeedCarouselItemSelected;
import com.tinder.domain.feed.FeedCarouselItemSelectedRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.feed.qualifiers.Feed;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.feed.view.provider.C9545e;
import io.reactivex.BackpressureStrategy;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\nJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/feed/view/tracker/FeedPlayableItemObservers;", "", "feedItemsProvider", "Lcom/tinder/feed/view/provider/FeedItemsProvider;", "feedCarouselItemSelectedRepository", "Lcom/tinder/domain/feed/FeedCarouselItemSelectedRepository;", "listVisibleStateProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleStateProvider;", "(Lcom/tinder/feed/view/provider/FeedItemsProvider;Lcom/tinder/domain/feed/FeedCarouselItemSelectedRepository;Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleStateProvider;)V", "observeCarouselItems", "Lrx/Observable;", "", "", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "observeFeedItems", "", "Lcom/tinder/feed/view/model/FeedItem;", "observeListVisibleItems", "Lcom/tinder/common/tracker/recyclerview/model/VisibleItemState;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.tracker.b */
public final class C9547b {
    /* renamed from: a */
    private final C9545e f31939a;
    /* renamed from: b */
    private final FeedCarouselItemSelectedRepository f31940b;
    /* renamed from: c */
    private final C8577i f31941c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/common/tracker/recyclerview/model/VisibleItemState;", "it", "Lcom/tinder/common/tracker/recyclerview/model/ListVisibleItemsStateUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.b$a */
    static final class C13298a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13298a f42155a = new C13298a();

        C13298a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51454a((C8569h) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<C8571j> m51454a(C8569h c8569h) {
            return c8569h.m36570a();
        }
    }

    @Inject
    public C9547b(@Feed @NotNull C9545e c9545e, @NotNull FeedCarouselItemSelectedRepository feedCarouselItemSelectedRepository, @Feed @NotNull C8577i c8577i) {
        C2668g.b(c9545e, "feedItemsProvider");
        C2668g.b(feedCarouselItemSelectedRepository, "feedCarouselItemSelectedRepository");
        C2668g.b(c8577i, "listVisibleStateProvider");
        this.f31939a = c9545e;
        this.f31940b = feedCarouselItemSelectedRepository;
        this.f31941c = c8577i;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<List<FeedItem>> m39837a() {
        Observable<List<FeedItem>> e = this.f31939a.m39833b().e(C19301m.a());
        C2668g.a(e, "feedItemsProvider.observ…th(emptyList<FeedItem>())");
        return e;
    }

    @NotNull
    /* renamed from: b */
    public final Observable<Map<String, FeedCarouselItemSelected>> m39838b() {
        Observable<Map<String, FeedCarouselItemSelected>> e = RxJavaInteropExtKt.toV1Observable(this.f31940b.observe(), BackpressureStrategy.LATEST).e(ae.a());
        C2668g.a(e, "feedCarouselItemSelected…   .startWith(emptyMap())");
        return e;
    }

    @NotNull
    /* renamed from: c */
    public final Observable<List<C8571j>> m39839c() {
        Observable<List<C8571j>> k = this.f31941c.m36594a().e(new C8569h(0, 0, C19301m.a())).k(C13298a.f42155a);
        C2668g.a(k, "listVisibleStateProvider… .map { it.visibleItems }");
        return k;
    }
}
