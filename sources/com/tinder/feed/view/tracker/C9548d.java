package com.tinder.feed.view.tracker;

import android.support.v7.widget.RecyclerView;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.common.tracker.recyclerview.p199b.C10704e;
import com.tinder.common.tracker.recyclerview.p199b.C10705f;
import com.tinder.common.tracker.recyclerview.p199b.C8571j;
import com.tinder.common.tracker.recyclerview.p200c.C8574c;
import com.tinder.domain.feed.FeedCarouselItemSelected;
import com.tinder.feed.qualifiers.Feed;
import com.tinder.feed.view.model.C11766d;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.module.ViewScope;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func3;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J4\u0010\u000f\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0002R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/feed/view/tracker/FeedPlayableItemTracker;", "", "feedPlayableItemObservers", "Lcom/tinder/feed/view/tracker/FeedPlayableItemObservers;", "listPlayableItemStateProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListPlayableItemStateProvider;", "Lcom/tinder/feed/view/model/FeedItem;", "(Lcom/tinder/feed/view/tracker/FeedPlayableItemObservers;Lcom/tinder/common/tracker/recyclerview/provider/ListPlayableItemStateProvider;)V", "currentPlayableFeedItem", "bind", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getNextPlayableItemFromTopAndUpdate", "nextPlayableFeedItem", "toNextPlayableFeedItem", "", "Lcom/tinder/common/tracker/recyclerview/model/VisibleItemState;", "carouselItemMap", "", "", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "feedItems", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ViewScope
/* renamed from: com.tinder.feed.view.tracker.d */
public final class C9548d {
    /* renamed from: a */
    private FeedItem f31942a = ((FeedItem) C11766d.f38472a);
    /* renamed from: b */
    private final C9547b f31943b;
    /* renamed from: c */
    private final C8574c<FeedItem> f31944c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\\\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0004*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0004*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00020\u00020\u00012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0004*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u00052\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b \u0004*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "", "Lcom/tinder/common/tracker/recyclerview/model/VisibleItemState;", "kotlin.jvm.PlatformType", "", "", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "Lcom/tinder/feed/view/model/FeedItem;", "visibleItems", "carouselItemMap", "feedItems", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.d$a */
    static final class C13300a<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        public static final C13300a f42159a = new C13300a();

        C13300a() {
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m51458a((List) obj, (Map) obj2, (List) obj3);
        }

        @NotNull
        /* renamed from: a */
        public final Triple<List<C8571j>, Map<String, FeedCarouselItemSelected>, List<FeedItem>> m51458a(List<C8571j> list, Map<String, FeedCarouselItemSelected> map, List<? extends FeedItem> list2) {
            return new Triple(list, map, list2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012Ã\u0001\u0010\u0002\u001a¾\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t \u0006*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0006*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004 \u0006*^\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t \u0006*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0006*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lcom/tinder/feed/view/model/FeedItem;", "<name for destructuring parameter 0>", "Lkotlin/Triple;", "", "Lcom/tinder/common/tracker/recyclerview/model/VisibleItemState;", "kotlin.jvm.PlatformType", "", "", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.d$b */
    static final class C13301b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C9548d f42160a;

        C13301b(C9548d c9548d) {
            this.f42160a = c9548d;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51459a((Triple) obj);
        }

        @NotNull
        /* renamed from: a */
        public final FeedItem m51459a(Triple<? extends List<C8571j>, ? extends Map<String, FeedCarouselItemSelected>, ? extends List<? extends FeedItem>> triple) {
            List list = (List) triple.d();
            Map map = (Map) triple.e();
            List list2 = (List) triple.f();
            C9548d c9548d = this.f42160a;
            C2668g.a(list, "visibleItems");
            C2668g.a(map, "carouselItemMap");
            C2668g.a(list2, "feedItems");
            return c9548d.m39844a(list, map, list2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "nextPlayableFeedItem", "Lcom/tinder/feed/view/model/FeedItem;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.d$c */
    static final class C13302c<T, R> implements Func1<FeedItem, Boolean> {
        /* renamed from: a */
        final /* synthetic */ C9548d f42161a;

        C13302c(C9548d c9548d) {
            this.f42161a = c9548d;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51460a((FeedItem) obj));
        }

        /* renamed from: a */
        public final boolean m51460a(FeedItem feedItem) {
            return C2668g.a(this.f42161a.f31942a.getId(), feedItem.getId()) ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "nextPlayableFeedItem", "Lcom/tinder/feed/view/model/FeedItem;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.d$d */
    static final class C14023d<T> implements Action1<FeedItem> {
        /* renamed from: a */
        final /* synthetic */ C9548d f44411a;

        C14023d(C9548d c9548d) {
            this.f44411a = c9548d;
        }

        public /* synthetic */ void call(Object obj) {
            m53674a((FeedItem) obj);
        }

        /* renamed from: a */
        public final void m53674a(FeedItem feedItem) {
            C9548d c9548d = this.f44411a;
            C9548d c9548d2 = this.f44411a;
            FeedItem a = this.f44411a.f31942a;
            C2668g.a(feedItem, "nextPlayableFeedItem");
            c9548d.f31942a = c9548d2.m39840a(a, feedItem);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.tracker.d$e */
    static final class C14024e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14024e f44412a = new C14024e();

        C14024e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53675a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53675a(Throwable th) {
            C0001a.c(th, "Error observing playable item chain", new Object[0]);
        }
    }

    @Inject
    public C9548d(@NotNull C9547b c9547b, @Feed @NotNull C8574c<FeedItem> c8574c) {
        C2668g.b(c9547b, "feedPlayableItemObservers");
        C2668g.b(c8574c, "listPlayableItemStateProvider");
        this.f31943b = c9547b;
        this.f31944c = c8574c;
    }

    /* renamed from: a */
    public final void m39846a(@NotNull RecyclerView recyclerView) {
        C2668g.b(recyclerView, "recyclerView");
        Observable.a(this.f31943b.m39839c(), this.f31943b.m39838b(), this.f31943b.m39837a(), C13300a.f42159a).j(C5707b.a(recyclerView)).a(C19397a.a()).k(new C13301b(this)).f(new C13302c(this)).a(new C14023d(this), C14024e.f44412a);
    }

    /* renamed from: a */
    private final FeedItem m39840a(FeedItem feedItem, FeedItem feedItem2) {
        if (!(feedItem instanceof C11766d)) {
            this.f31944c.m36589a(new C10705f(feedItem));
        }
        if ((feedItem2 instanceof C11766d) == null) {
            this.f31944c.m36589a(new C10704e(feedItem2));
        }
        return feedItem2;
    }

    /* renamed from: a */
    private final FeedItem m39844a(@NotNull List<C8571j> list, Map<String, FeedCarouselItemSelected> map, List<? extends FeedItem> list2) {
        FeedItem feedItem = (FeedItem) C19285g.d(C19285g.e(C19285g.a(C19285g.a(C19301m.r(list), FeedPlayableItemTracker$toNextPlayableFeedItem$1.f44403a), new FeedPlayableItemTracker$toNextPlayableFeedItem$2(list2, map)), (Function1) new FeedPlayableItemTracker$toNextPlayableFeedItem$3(list2)));
        return feedItem != null ? feedItem : (FeedItem) C11766d.f38472a;
    }
}
