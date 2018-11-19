package com.tinder.feed.view;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.common.p196h.C8542c;
import com.tinder.common.p196h.C8544e;
import com.tinder.common.tracker.recyclerview.RecyclerViewItemTracker;
import com.tinder.common.tracker.recyclerview.p198a.C8564a;
import com.tinder.common.tracker.recyclerview.p200c.C8576g;
import com.tinder.common.view.extension.C8585e;
import com.tinder.common.view.extension.C8587g;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.feed.FeedRangeRepository;
import com.tinder.feed.p249d.C9462a;
import com.tinder.feed.p340a.C11682b;
import com.tinder.feed.presenter.C9468e;
import com.tinder.feed.qualifiers.Feed;
import com.tinder.feed.target.FeedMainTarget;
import com.tinder.feed.view.provider.C9542a;
import com.tinder.feed.view.provider.C9545e.C9544a;
import com.tinder.feed.view.tracker.C9548d;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.module.MainActivityComponentProvider;
import com.tinder.module.ViewScope;
import com.tinder.utils.RxUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscription;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001bB\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020FH\u0016J\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020FH\u0002J\b\u0010K\u001a\u00020FH\u0014J\b\u0010L\u001a\u00020FH\u0007J\b\u0010M\u001a\u00020FH\u0014J\b\u0010N\u001a\u00020FH\u0007J\b\u0010O\u001a\u00020FH\u0007J\b\u0010P\u001a\u00020FH\u0016J\b\u0010Q\u001a\u00020FH\u0016J\b\u0010R\u001a\u00020FH\u0016J\b\u0010S\u001a\u00020FH\u0002J\u001a\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020W0V0UH\u0002J\b\u0010X\u001a\u00020FH\u0002J\b\u0010Y\u001a\u00020FH\u0002J\b\u0010Z\u001a\u00020FH\u0002J\b\u0010[\u001a\u00020FH\u0002J\b\u0010\\\u001a\u00020FH\u0002J\b\u0010]\u001a\u00020FH\u0016J\b\u0010^\u001a\u00020FH\u0016J\u0010\u0010_\u001a\u00020F2\u0006\u0010`\u001a\u00020aH\u0016R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0002088\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020>8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0010\u0010C\u001a\u0004\u0018\u00010DX\u000e¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/tinder/feed/view/FeedMainView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/feed/target/FeedMainTarget;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feedCarouselItemSelectedProvider", "Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;", "getFeedCarouselItemSelectedProvider$Tinder_release", "()Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;", "setFeedCarouselItemSelectedProvider$Tinder_release", "(Lcom/tinder/feed/provider/FeedCarouselItemSelectedProvider;)V", "feedComposerProvider", "Lcom/tinder/feed/view/provider/FeedComposerProvider;", "getFeedComposerProvider$Tinder_release", "()Lcom/tinder/feed/view/provider/FeedComposerProvider;", "setFeedComposerProvider$Tinder_release", "(Lcom/tinder/feed/view/provider/FeedComposerProvider;)V", "feedItemTracker", "Lcom/tinder/common/tracker/recyclerview/RecyclerViewItemTracker;", "getFeedItemTracker$Tinder_release", "()Lcom/tinder/common/tracker/recyclerview/RecyclerViewItemTracker;", "setFeedItemTracker$Tinder_release", "(Lcom/tinder/common/tracker/recyclerview/RecyclerViewItemTracker;)V", "feedItemsAdapter", "Lcom/tinder/feed/adapter/FeedItemsAdapter;", "getFeedItemsAdapter$Tinder_release", "()Lcom/tinder/feed/adapter/FeedItemsAdapter;", "setFeedItemsAdapter$Tinder_release", "(Lcom/tinder/feed/adapter/FeedItemsAdapter;)V", "feedPlayableItemTracker", "Lcom/tinder/feed/view/tracker/FeedPlayableItemTracker;", "getFeedPlayableItemTracker$Tinder_release", "()Lcom/tinder/feed/view/tracker/FeedPlayableItemTracker;", "setFeedPlayableItemTracker$Tinder_release", "(Lcom/tinder/feed/view/tracker/FeedPlayableItemTracker;)V", "feedRangeRepository", "Lcom/tinder/domain/feed/FeedRangeRepository;", "getFeedRangeRepository$Tinder_release", "()Lcom/tinder/domain/feed/FeedRangeRepository;", "setFeedRangeRepository$Tinder_release", "(Lcom/tinder/domain/feed/FeedRangeRepository;)V", "layoutManager", "Lcom/tinder/feed/view/FeedMainView$FeedListLayoutManager;", "getLayoutManager$Tinder_release", "()Lcom/tinder/feed/view/FeedMainView$FeedListLayoutManager;", "lifecycle", "Landroid/arch/lifecycle/Lifecycle;", "getLifecycle", "()Landroid/arch/lifecycle/Lifecycle;", "setLifecycle", "(Landroid/arch/lifecycle/Lifecycle;)V", "listVisibleRangeProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleRangeProvider;", "getListVisibleRangeProvider$Tinder_release", "()Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleRangeProvider;", "setListVisibleRangeProvider$Tinder_release", "(Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleRangeProvider;)V", "presenter", "Lcom/tinder/feed/presenter/FeedMainPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/feed/presenter/FeedMainPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/feed/presenter/FeedMainPresenter;)V", "scrollToTopSubscription", "Lrx/Subscription;", "hideEmptyState", "", "hideLoadingState", "isApproachingEndOfList", "", "observeScrollEvents", "onAttachedToWindow", "onDestroy", "onDetachedFromWindow", "onPause", "onResume", "requestFirstItemPosition", "requestLastItemPosition", "scrollToTop", "scrollToTopAfterLayout", "selectedCarouselItems", "Lrx/Observable;", "", "", "setupComposerCallback", "setupEndOfListCallback", "setupPullToRefresh", "setupRangeProvider", "setupRecyclerViewAndAdapter", "showEmptyState", "showLoadingState", "updateFeedItems", "feedItemsUpdate", "Lcom/tinder/feed/view/provider/FeedItemsProvider$FeedItemsUpdate;", "FeedListLayoutManager", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ViewScope
public final class FeedMainView extends FrameLayout implements LifecycleObserver, FeedMainTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9468e f12286a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C9542a f12287b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C11682b f12288c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C9548d f12289d;
    @Inject
    @NotNull
    /* renamed from: e */
    public C9462a f12290e;
    @Inject
    @NotNull
    /* renamed from: f */
    public FeedRangeRepository f12291f;
    @Inject
    @NotNull
    /* renamed from: g */
    public Lifecycle f12292g;
    @Feed
    @Inject
    @NotNull
    /* renamed from: h */
    public RecyclerViewItemTracker f12293h;
    @Feed
    @Inject
    @NotNull
    /* renamed from: i */
    public C8576g f12294i;
    @NotNull
    /* renamed from: j */
    private final FeedMainView$FeedListLayoutManager f12295j;
    /* renamed from: k */
    private Subscription f12296k;
    /* renamed from: l */
    private HashMap f12297l;

    @JvmOverloads
    public FeedMainView(@NotNull Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: a */
    public View m14828a(int i) {
        if (this.f12297l == null) {
            this.f12297l = new HashMap();
        }
        View view = (View) this.f12297l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f12297l.put(Integer.valueOf(i), view);
        return view;
    }

    @JvmOverloads
    public /* synthetic */ FeedMainView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    @JvmOverloads
    public FeedMainView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        this.f12295j = new FeedMainView$FeedListLayoutManager(context);
        if (isInEditMode() == null) {
            Object build = ((MainActivityComponentProvider) context).provideMainActivityComponent().m14691d().feedMainView(this).build();
            FeedViewComponentProvider feedViewComponentProvider = (FeedViewComponentProvider) context;
            C2668g.m10305a(build, "feedViewComponent");
            feedViewComponentProvider.setFeedViewComponent(build);
            build.inject(this);
        }
        FrameLayout.inflate(context, R.layout.matches_tab_feed_view, this);
        m14820b();
        m14821c();
        context = this.f12292g;
        if (context == null) {
            C2668g.m10310b("lifecycle");
        }
        context.mo36a(this);
    }

    @NotNull
    public final FeedMainView$FeedListLayoutManager getLayoutManager$Tinder_release() {
        return this.f12295j;
    }

    @NotNull
    public final C9468e getPresenter$Tinder_release() {
        C9468e c9468e = this.f12286a;
        if (c9468e == null) {
            C2668g.m10310b("presenter");
        }
        return c9468e;
    }

    public final void setPresenter$Tinder_release(@NotNull C9468e c9468e) {
        C2668g.m10309b(c9468e, "<set-?>");
        this.f12286a = c9468e;
    }

    @NotNull
    public final C9542a getFeedComposerProvider$Tinder_release() {
        C9542a c9542a = this.f12287b;
        if (c9542a == null) {
            C2668g.m10310b("feedComposerProvider");
        }
        return c9542a;
    }

    public final void setFeedComposerProvider$Tinder_release(@NotNull C9542a c9542a) {
        C2668g.m10309b(c9542a, "<set-?>");
        this.f12287b = c9542a;
    }

    @NotNull
    public final C11682b getFeedItemsAdapter$Tinder_release() {
        C11682b c11682b = this.f12288c;
        if (c11682b == null) {
            C2668g.m10310b("feedItemsAdapter");
        }
        return c11682b;
    }

    public final void setFeedItemsAdapter$Tinder_release(@NotNull C11682b c11682b) {
        C2668g.m10309b(c11682b, "<set-?>");
        this.f12288c = c11682b;
    }

    @NotNull
    public final C9548d getFeedPlayableItemTracker$Tinder_release() {
        C9548d c9548d = this.f12289d;
        if (c9548d == null) {
            C2668g.m10310b("feedPlayableItemTracker");
        }
        return c9548d;
    }

    public final void setFeedPlayableItemTracker$Tinder_release(@NotNull C9548d c9548d) {
        C2668g.m10309b(c9548d, "<set-?>");
        this.f12289d = c9548d;
    }

    @NotNull
    public final C9462a getFeedCarouselItemSelectedProvider$Tinder_release() {
        C9462a c9462a = this.f12290e;
        if (c9462a == null) {
            C2668g.m10310b("feedCarouselItemSelectedProvider");
        }
        return c9462a;
    }

    public final void setFeedCarouselItemSelectedProvider$Tinder_release(@NotNull C9462a c9462a) {
        C2668g.m10309b(c9462a, "<set-?>");
        this.f12290e = c9462a;
    }

    @NotNull
    public final FeedRangeRepository getFeedRangeRepository$Tinder_release() {
        FeedRangeRepository feedRangeRepository = this.f12291f;
        if (feedRangeRepository == null) {
            C2668g.m10310b("feedRangeRepository");
        }
        return feedRangeRepository;
    }

    public final void setFeedRangeRepository$Tinder_release(@NotNull FeedRangeRepository feedRangeRepository) {
        C2668g.m10309b(feedRangeRepository, "<set-?>");
        this.f12291f = feedRangeRepository;
    }

    @NotNull
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f12292g;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        return lifecycle;
    }

    public final void setLifecycle(@NotNull Lifecycle lifecycle) {
        C2668g.m10309b(lifecycle, "<set-?>");
        this.f12292g = lifecycle;
    }

    @NotNull
    public final RecyclerViewItemTracker getFeedItemTracker$Tinder_release() {
        RecyclerViewItemTracker recyclerViewItemTracker = this.f12293h;
        if (recyclerViewItemTracker == null) {
            C2668g.m10310b("feedItemTracker");
        }
        return recyclerViewItemTracker;
    }

    public final void setFeedItemTracker$Tinder_release(@NotNull RecyclerViewItemTracker recyclerViewItemTracker) {
        C2668g.m10309b(recyclerViewItemTracker, "<set-?>");
        this.f12293h = recyclerViewItemTracker;
    }

    @NotNull
    public final C8576g getListVisibleRangeProvider$Tinder_release() {
        C8576g c8576g = this.f12294i;
        if (c8576g == null) {
            C2668g.m10310b("listVisibleRangeProvider");
        }
        return c8576g;
    }

    public final void setListVisibleRangeProvider$Tinder_release(@NotNull C8576g c8576g) {
        C2668g.m10309b(c8576g, "<set-?>");
        this.f12294i = c8576g;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9468e c9468e = this.f12286a;
        if (c9468e == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, c9468e);
        m14823e();
        m14824f();
        m14826h();
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        C9468e c9468e = this.f12286a;
        if (c9468e == null) {
            C2668g.m10310b("presenter");
        }
        c9468e.d();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        C9468e c9468e = this.f12286a;
        if (c9468e == null) {
            C2668g.m10310b("presenter");
        }
        c9468e.e();
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void onDestroy() {
        Lifecycle lifecycle = this.f12292g;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo37b(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
        RxUtils.m10188b(this.f12296k);
    }

    public void showLoadingState() {
        Object a = m14828a(C6248a.feedLoadingView);
        C2668g.m10305a(a, "feedLoadingView");
        C8587g.a(a, true);
    }

    public void hideLoadingState() {
        Object a = m14828a(C6248a.feedLoadingView);
        C2668g.m10305a(a, "feedLoadingView");
        C8587g.a(a, false);
        a = (SwipeRefreshLayout) m14828a(C6248a.feedSwipeRefreshLayout);
        C2668g.m10305a(a, "feedSwipeRefreshLayout");
        if (a.m11407b()) {
            a = (SwipeRefreshLayout) m14828a(C6248a.feedSwipeRefreshLayout);
            C2668g.m10305a(a, "feedSwipeRefreshLayout");
            a.setRefreshing(false);
        }
    }

    public void showEmptyState() {
        Object a = m14828a(C6248a.feedEmptyView);
        C2668g.m10305a(a, "feedEmptyView");
        C8587g.a(a, true);
        a = (RecyclerView) m14828a(C6248a.feedList);
        C2668g.m10305a(a, "feedList");
        C8587g.a((View) a, false);
    }

    public void hideEmptyState() {
        Object a = m14828a(C6248a.feedEmptyView);
        C2668g.m10305a(a, "feedEmptyView");
        C8587g.a(a, false);
        a = (RecyclerView) m14828a(C6248a.feedList);
        C2668g.m10305a(a, "feedList");
        C8587g.a((View) a, true);
    }

    public void updateFeedItems(@NotNull C9544a c9544a) {
        C2668g.m10309b(c9544a, "feedItemsUpdate");
        if (this.f12295j.findFirstCompletelyVisibleItemPosition() == 0) {
            m14818a();
        }
        C11682b c11682b = this.f12288c;
        if (c11682b == null) {
            C2668g.m10310b("feedItemsAdapter");
        }
        c11682b.a(c9544a);
        if (m14827i() != null) {
            c9544a = this.f12286a;
            if (c9544a == null) {
                C2668g.m10310b("presenter");
            }
            c9544a.g();
        }
    }

    public void scrollToTop() {
        this.f12295j.scrollToPositionWithOffset(0, 0);
    }

    /* renamed from: a */
    private final void m14818a() {
        RxUtils.m10188b(this.f12296k);
        this.f12296k = C5707b.c((RecyclerView) m14828a(C6248a.feedList)).k(FeedMainView$c.f42042a).h(Observable.b(200, TimeUnit.MILLISECONDS).k(FeedMainView$d.f42043a)).a(C19397a.a()).j(C5707b.a(this)).c(1).a(new FeedMainView$e(this), FeedMainView$f.f44151a);
    }

    public void requestFirstItemPosition() {
        C9468e c9468e = this.f12286a;
        if (c9468e == null) {
            C2668g.m10310b("presenter");
        }
        c9468e.a(this.f12295j.findFirstVisibleItemPosition());
    }

    public void requestLastItemPosition() {
        C9468e c9468e = this.f12286a;
        if (c9468e == null) {
            C2668g.m10310b("presenter");
        }
        c9468e.b(this.f12295j.findLastVisibleItemPosition());
    }

    /* renamed from: b */
    private final void m14820b() {
        Object obj = (RecyclerView) m14828a(C6248a.feedList);
        C2668g.m10305a(obj, "feedList");
        obj.setLayoutManager(this.f12295j);
        obj = (RecyclerView) m14828a(C6248a.feedList);
        C2668g.m10305a(obj, "feedList");
        obj.setItemAnimator(new DefaultItemAnimator());
        obj = (RecyclerView) m14828a(C6248a.feedList);
        C2668g.m10305a(obj, "feedList");
        C11682b c11682b = this.f12288c;
        if (c11682b == null) {
            C2668g.m10310b("feedItemsAdapter");
        }
        obj.setAdapter(c11682b);
        RecyclerViewItemTracker recyclerViewItemTracker = this.f12293h;
        if (recyclerViewItemTracker == null) {
            C2668g.m10310b("feedItemTracker");
        }
        Object obj2 = (RecyclerView) m14828a(C6248a.feedList);
        C2668g.m10305a(obj2, "feedList");
        recyclerViewItemTracker.bind(obj2);
        C9548d c9548d = this.f12289d;
        if (c9548d == null) {
            C2668g.m10310b("feedPlayableItemTracker");
        }
        obj2 = (RecyclerView) m14828a(C6248a.feedList);
        C2668g.m10305a(obj2, "feedList");
        c9548d.a(obj2);
        C9468e c9468e = this.f12286a;
        if (c9468e == null) {
            C2668g.m10310b("presenter");
        }
        obj2 = (RecyclerView) m14828a(C6248a.feedList);
        C2668g.m10305a(obj2, "feedList");
        c9468e.a(C8564a.a(obj2));
        m14822d();
    }

    /* renamed from: c */
    private final void m14821c() {
        C8576g c8576g = this.f12294i;
        if (c8576g == null) {
            C2668g.m10310b("listVisibleRangeProvider");
        }
        c8576g.a().j(C5707b.a(this)).i(new FeedMainView$t(this)).a(FeedMainView$u.f44158a, FeedMainView$v.f44159a);
    }

    /* renamed from: d */
    private final void m14822d() {
        C8542c c8542c = C8542c.f30287a;
        Object obj = (RecyclerView) m14828a(C6248a.feedList);
        C2668g.m10305a(obj, "feedList");
        c8542c.a(obj).j(C5707b.a(this)).b(1).a(new FeedMainView$a(this), FeedMainView$b.f44149a);
    }

    /* renamed from: e */
    private final void m14823e() {
        C8544e c8544e = C8544e.f30289a;
        Object obj = (SwipeRefreshLayout) m14828a(C6248a.feedSwipeRefreshLayout);
        C2668g.m10305a(obj, "feedSwipeRefreshLayout");
        c8544e.a(obj).j(C5707b.a(this)).f(new FeedMainView$q(this)).a(C19397a.a()).a(new FeedMainView$r(this), FeedMainView$s.f44157a);
    }

    /* renamed from: f */
    private final void m14824f() {
        C8542c c8542c = C8542c.f30287a;
        Object obj = (RecyclerView) m14828a(C6248a.feedList);
        C2668g.m10305a(obj, "feedList");
        c8542c.a(obj).j(C5707b.a(this)).f(100, TimeUnit.MILLISECONDS).k(new FeedMainView$m(this)).f(FeedMainView$n.f42049a).a(new FeedMainView$o(this), FeedMainView$p.f44155a);
    }

    /* renamed from: g */
    private final Observable<Map<String, String>> m14825g() {
        C9462a c9462a = this.f12290e;
        if (c9462a == null) {
            C2668g.m10310b("feedCarouselItemSelectedProvider");
        }
        Object b = c9462a.a().b(ae.a(), FeedMainView$g.f42044a);
        C2668g.m10305a(b, "feedCarouselItemSelected…diaItemId)\n            })");
        return b;
    }

    /* renamed from: h */
    private final void m14826h() {
        C9542a c9542a = this.f12287b;
        if (c9542a == null) {
            C2668g.m10310b("feedComposerProvider");
        }
        c9542a.a().f(FeedMainView$h.f42045a).k(FeedMainView$i.f42046a).a(m14825g(), FeedMainView$j.f42047a).j(C5707b.a(this)).a(new FeedMainView$k(this), FeedMainView$l.f44153a);
    }

    /* renamed from: i */
    private final boolean m14827i() {
        Object obj = (RecyclerView) m14828a(C6248a.feedList);
        C2668g.m10305a(obj, "feedList");
        return C8585e.a(obj) <= 3;
    }
}
