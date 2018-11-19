package com.tinder.feed.presenter;

import com.tinder.common.tracker.recyclerview.C8572b;
import com.tinder.common.tracker.recyclerview.adapter.TrackerAdapter;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.feed.FeedRequestResult;
import com.tinder.domain.feed.UnexpectedEmptyListException;
import com.tinder.domain.feed.usecase.LoadMoreFeedItems;
import com.tinder.domain.feed.usecase.ObserveHasNewFeedItems;
import com.tinder.domain.feed.usecase.PollFeed;
import com.tinder.domain.feed.usecase.RefreshFeedItems;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.feed.analytics.C9433c;
import com.tinder.feed.analytics.C9434e;
import com.tinder.feed.analytics.C9434e.C11683a;
import com.tinder.feed.analytics.TopSource;
import com.tinder.feed.analytics.events.C11689d;
import com.tinder.feed.analytics.events.C11689d.C9437a;
import com.tinder.feed.analytics.events.C11690e;
import com.tinder.feed.analytics.events.C11693i;
import com.tinder.feed.analytics.events.C11693i.C9440a;
import com.tinder.feed.analytics.session.C11694q;
import com.tinder.feed.analytics.session.C9450f;
import com.tinder.feed.analytics.session.C9454k;
import com.tinder.feed.analytics.session.FeedPositionRequestProvider;
import com.tinder.feed.analytics.session.FeedPositionRequestProvider.Request;
import com.tinder.feed.qualifiers.Feed;
import com.tinder.feed.target.FeedMainTarget;
import com.tinder.feed.usecase.FeedFirstOpened;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C11767j;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.feed.view.provider.C9545e;
import com.tinder.feed.view.provider.C9545e.C9544a;
import com.tinder.feed.view.tracker.C9546a;
import com.tinder.feed.view.tracker.C9549f;
import com.tinder.match.provider.C9876b;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func2;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0001\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0001\u0010 \u001a\u00020!\u0012\b\b\u0001\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%¢\u0006\u0002\u0010&J\b\u00109\u001a\u00020:H\u0007J\u0018\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020:H\u0002J\u0010\u0010A\u001a\u00020:2\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020:H\u0002J\b\u0010\u001e\u001a\u00020:H\u0002J\b\u0010E\u001a\u00020:H\u0002J\b\u0010F\u001a\u00020:H\u0002J\u0006\u0010G\u001a\u00020:J\u0006\u0010H\u001a\u00020:J\u0006\u0010I\u001a\u00020:J\u0006\u0010J\u001a\u00020:J\u0006\u0010K\u001a\u00020:J\u000e\u0010L\u001a\u00020:2\u0006\u0010M\u001a\u00020NJ\u001c\u0010\u0004\u001a\u00020:2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020:0PH\u0002J\u000e\u0010Q\u001a\u00020:2\u0006\u0010R\u001a\u00020SJ\u000e\u0010T\u001a\u00020:2\u0006\u0010U\u001a\u00020SJ\b\u0010V\u001a\u00020:H\u0002J\b\u0010W\u001a\u00020:H\u0002J\b\u0010X\u001a\u00020:H\u0007R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u001e\u00103\u001a\u0002048\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006Y"}, d2 = {"Lcom/tinder/feed/presenter/FeedMainPresenter;", "", "feedItemsProvider", "Lcom/tinder/feed/view/provider/FeedItemsProvider;", "refreshFeedItems", "Lcom/tinder/domain/feed/usecase/RefreshFeedItems;", "pollFeed", "Lcom/tinder/domain/feed/usecase/PollFeed;", "loadMoreFeedItems", "Lcom/tinder/domain/feed/usecase/LoadMoreFeedItems;", "feedNoActivityEventDispatcher", "Lcom/tinder/feed/analytics/events/FeedNoActivityEventDispatcher;", "feedTabReselectedProvider", "Lcom/tinder/match/provider/FeedTabReselectedProvider;", "feedTopEventDispatcher", "Lcom/tinder/feed/analytics/events/FeedTopEventDispatcher;", "feedFetchEventDispatcher", "Lcom/tinder/feed/analytics/events/FeedFetchEventDispatcher;", "feedSessionExecutor", "Lcom/tinder/feed/analytics/session/FeedSessionExecutor;", "observeHasNewFeedItems", "Lcom/tinder/domain/feed/usecase/ObserveHasNewFeedItems;", "feedSessionPositionTrackerExecutor", "Lcom/tinder/feed/analytics/session/FeedSessionPositionTrackerExecutor;", "feedPositionRequestProvider", "Lcom/tinder/feed/analytics/session/FeedPositionRequestProvider;", "feedCarouselItemTracker", "Lcom/tinder/feed/view/tracker/FeedCarouselItemTracker;", "feedViewModelPositionTracker", "Lcom/tinder/feed/view/tracker/FeedViewModelPositionTracker;", "observeFeedActivityViewed", "Lcom/tinder/feed/analytics/session/ObserveFeedActivityViewed;", "feedViewEventDispatcher", "Lcom/tinder/feed/analytics/FeedViewEventDispatcher;", "feedItemDurationTracker", "Lcom/tinder/common/tracker/recyclerview/RecyclerViewItemViewDurationTracker;", "feedFirstOpened", "Lcom/tinder/feed/usecase/FeedFirstOpened;", "(Lcom/tinder/feed/view/provider/FeedItemsProvider;Lcom/tinder/domain/feed/usecase/RefreshFeedItems;Lcom/tinder/domain/feed/usecase/PollFeed;Lcom/tinder/domain/feed/usecase/LoadMoreFeedItems;Lcom/tinder/feed/analytics/events/FeedNoActivityEventDispatcher;Lcom/tinder/match/provider/FeedTabReselectedProvider;Lcom/tinder/feed/analytics/events/FeedTopEventDispatcher;Lcom/tinder/feed/analytics/events/FeedFetchEventDispatcher;Lcom/tinder/feed/analytics/session/FeedSessionExecutor;Lcom/tinder/domain/feed/usecase/ObserveHasNewFeedItems;Lcom/tinder/feed/analytics/session/FeedSessionPositionTrackerExecutor;Lcom/tinder/feed/analytics/session/FeedPositionRequestProvider;Lcom/tinder/feed/view/tracker/FeedCarouselItemTracker;Lcom/tinder/feed/view/tracker/FeedViewModelPositionTracker;Lcom/tinder/feed/analytics/session/ObserveFeedActivityViewed;Lcom/tinder/feed/analytics/FeedViewEventDispatcher;Lcom/tinder/common/tracker/recyclerview/RecyclerViewItemViewDurationTracker;Lcom/tinder/feed/usecase/FeedFirstOpened;)V", "feedItemsSubscription", "Lrx/Subscription;", "feedPositionRequestSubscription", "feedTabReselectedSubscription", "feedTabSelectedSubscription", "isShowingLoadingIndicator", "", "loadMoreFeedItemsSubscription", "observeFeedActivityViewedSubscription", "pollFeedSubscription", "pullToRefreshCheckNewItemsSubscription", "refreshFeedItemsSubscription", "target", "Lcom/tinder/feed/target/FeedMainTarget;", "getTarget$Tinder_release", "()Lcom/tinder/feed/target/FeedMainTarget;", "setTarget$Tinder_release", "(Lcom/tinder/feed/target/FeedMainTarget;)V", "drop", "", "fireFeedFetchEvent", "fetchSource", "Lcom/tinder/feed/analytics/FetchSource;", "feedRequestResult", "Lcom/tinder/domain/feed/FeedRequestResult;", "fireFeedNoActivityEvent", "fireScrollToTopEvent", "topSource", "Lcom/tinder/feed/analytics/TopSource;", "listenFeedPositionRequester", "observeFeedFirstOpened", "observeFeedTabReselectedToScrollToTop", "onApproachingEndOfList", "onManualScrollToTop", "onPullToRefresh", "onTargetPaused", "onTargetResumed", "onTrackerAdapterReady", "trackerAdapter", "Lcom/tinder/common/tracker/recyclerview/adapter/TrackerAdapter;", "fireFeedFetchEventAfterRefresh", "Lkotlin/Function1;", "setFirstItemPosition", "firstVisibleItemPosition", "", "setLastItemPosition", "lastVisibleItemPosition", "startPolling", "subscribeToFeedItems", "take", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.presenter.e */
public final class C9468e {
    /* renamed from: A */
    private final C9433c f31738A;
    /* renamed from: B */
    private final C8572b f31739B;
    /* renamed from: C */
    private final FeedFirstOpened f31740C;
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public FeedMainTarget f31741a;
    /* renamed from: b */
    private boolean f31742b;
    /* renamed from: c */
    private Subscription f31743c;
    /* renamed from: d */
    private Subscription f31744d;
    /* renamed from: e */
    private Subscription f31745e;
    /* renamed from: f */
    private Subscription f31746f;
    /* renamed from: g */
    private Subscription f31747g;
    /* renamed from: h */
    private Subscription f31748h;
    /* renamed from: i */
    private Subscription f31749i;
    /* renamed from: j */
    private Subscription f31750j;
    /* renamed from: k */
    private Subscription f31751k;
    /* renamed from: l */
    private final C9545e f31752l;
    /* renamed from: m */
    private final RefreshFeedItems f31753m;
    /* renamed from: n */
    private final PollFeed f31754n;
    /* renamed from: o */
    private final LoadMoreFeedItems f31755o;
    /* renamed from: p */
    private final C11690e f31756p;
    /* renamed from: q */
    private final C9876b f31757q;
    /* renamed from: r */
    private final C11693i f31758r;
    /* renamed from: s */
    private final C11689d f31759s;
    /* renamed from: t */
    private final C9450f f31760t;
    /* renamed from: u */
    private final ObserveHasNewFeedItems f31761u;
    /* renamed from: v */
    private final C9454k f31762v;
    /* renamed from: w */
    private final FeedPositionRequestProvider f31763w;
    /* renamed from: x */
    private final C9546a f31764x;
    /* renamed from: y */
    private final C9549f f31765y;
    /* renamed from: z */
    private final C11694q f31766z;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "count", "", "kotlin.jvm.PlatformType", "error", "", "call", "(Ljava/lang/Integer;Ljava/lang/Throwable;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$i */
    static final class C13267i<T1, T2, R> implements Func2<Integer, Throwable, Boolean> {
        /* renamed from: a */
        public static final C13267i f42024a = new C13267i();

        C13267i() {
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return Boolean.valueOf(m51321a((Integer) obj, (Throwable) obj2));
        }

        /* renamed from: a */
        public final boolean m51321a(Integer num, Throwable th) {
            return (C2668g.a(num.intValue(), 2) > null || (th instanceof UnexpectedEmptyListException) == null) ? null : true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "request", "Lcom/tinder/feed/analytics/session/FeedPositionRequestProvider$Request;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$a */
    static final class C13985a<T> implements Action1<Request> {
        /* renamed from: a */
        final /* synthetic */ C9468e f44125a;

        C13985a(C9468e c9468e) {
            this.f44125a = c9468e;
        }

        public /* synthetic */ void call(Object obj) {
            m53505a((Request) obj);
        }

        /* renamed from: a */
        public final void m53505a(Request request) {
            if (request != null) {
                switch (C9469f.f31767a[request.ordinal()]) {
                    case 1:
                        this.f44125a.m39611a().requestFirstItemPosition();
                        return;
                    case 2:
                        this.f44125a.m39611a().requestLastItemPosition();
                        return;
                    default:
                        break;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FeedPositionRequestProvider emits ");
            stringBuilder.append("unknown request type ");
            stringBuilder.append(request);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$b */
    static final class C13986b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13986b f44126a = new C13986b();

        C13986b() {
        }

        public /* synthetic */ void call(Object obj) {
            m53506a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53506a(Throwable th) {
            C0001a.c(th, "Failed to observe to FeedPositionRequestProvider", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "viewModel", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$c */
    static final class C13987c<T> implements Action1<ActivityFeedViewModel<?>> {
        /* renamed from: a */
        final /* synthetic */ C9468e f44127a;

        C13987c(C9468e c9468e) {
            this.f44127a = c9468e;
        }

        public /* synthetic */ void call(Object obj) {
            m53507a((ActivityFeedViewModel) obj);
        }

        /* renamed from: a */
        public final void m53507a(ActivityFeedViewModel<?> activityFeedViewModel) {
            this.f44127a.f31760t.m39500a(activityFeedViewModel.mo11139a(), activityFeedViewModel.mo11143e().m39804b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$d */
    static final class C13988d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13988d f44128a = new C13988d();

        C13988d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53508a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53508a(Throwable th) {
            C0001a.c(th, "Failed to observe feed activity viewed", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$e */
    static final class C13989e implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C9468e f44129a;

        C13989e(C9468e c9468e) {
            this.f44129a = c9468e;
        }

        public final void call() {
            this.f44129a.m39601a((Function1) new FeedMainPresenter$observeFeedFirstOpened$1$1(this));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$f */
    static final class C13990f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13990f f44130a = new C13990f();

        C13990f() {
        }

        public /* synthetic */ void call(Object obj) {
            m53509a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53509a(Throwable th) {
            C0001a.c(th, "Failed to observe tab selection", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$g */
    static final class C13991g<T> implements Action1<C15813i> {
        /* renamed from: a */
        final /* synthetic */ C9468e f44131a;

        C13991g(C9468e c9468e) {
            this.f44131a = c9468e;
        }

        public /* synthetic */ void call(Object obj) {
            m53510a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m53510a(C15813i c15813i) {
            this.f44131a.m39611a().scrollToTop();
            this.f44131a.m39595a(TopSource.TAB_BAR);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$h */
    static final class C13992h<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13992h f44132a = new C13992h();

        C13992h() {
        }

        public /* synthetic */ void call(Object obj) {
            m53511a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53511a(Throwable th) {
            C0001a.c(th, "Failed to scroll to Top", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/tinder/domain/feed/FeedRequestResult;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$j */
    static final class C13993j<T> implements Action1<FeedRequestResult> {
        /* renamed from: a */
        final /* synthetic */ C9468e f44133a;

        C13993j(C9468e c9468e) {
            this.f44133a = c9468e;
        }

        public /* synthetic */ void call(Object obj) {
            m53512a((FeedRequestResult) obj);
        }

        /* renamed from: a */
        public final void m53512a(FeedRequestResult feedRequestResult) {
            this.f44133a.f31760t.m39502b();
            this.f44133a.f31760t.m39501a(feedRequestResult.getFetchedItems());
            if (feedRequestResult.getHasMoreItems()) {
                C9468e c9468e = this.f44133a;
                C9434e c9434e = C11683a.f38181a;
                C2668g.a(feedRequestResult, "result");
                c9468e.m39596a(c9434e, feedRequestResult);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Loaded ");
            stringBuilder.append(feedRequestResult.getFetchedItems().size());
            stringBuilder.append(" feed items");
            C0001a.a(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$k */
    static final class C13994k<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13994k f44134a = new C13994k();

        C13994k() {
        }

        public /* synthetic */ void call(Object obj) {
            m53513a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53513a(Throwable th) {
            C0001a.c(th, "Error loading more feed items", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "hasNewFeedItems", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$l */
    static final class C13995l<T> implements Action1<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C9468e f44135a;

        C13995l(C9468e c9468e) {
            this.f44135a = c9468e;
        }

        public /* synthetic */ void call(Object obj) {
            m53514a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m53514a(Boolean bool) {
            this.f44135a.m39601a((Function1) new FeedMainPresenter$onPullToRefresh$1$1(this, bool));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$m */
    static final class C13996m<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13996m f44136a = new C13996m();

        C13996m() {
        }

        public /* synthetic */ void call(Object obj) {
            m53515a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53515a(Throwable th) {
            C0001a.c(th, "Failed to observe new items for Pull to Refresh", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/tinder/domain/feed/FeedRequestResult;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$n */
    static final class C13997n<T> implements Action1<FeedRequestResult> {
        /* renamed from: a */
        final /* synthetic */ C9468e f44137a;
        /* renamed from: b */
        final /* synthetic */ Function1 f44138b;

        C13997n(C9468e c9468e, Function1 function1) {
            this.f44137a = c9468e;
            this.f44138b = function1;
        }

        public /* synthetic */ void call(Object obj) {
            m53516a((FeedRequestResult) obj);
        }

        /* renamed from: a */
        public final void m53516a(FeedRequestResult feedRequestResult) {
            Function1 function1 = this.f44138b;
            C2668g.a(feedRequestResult, "result");
            function1.invoke(feedRequestResult);
            this.f44137a.f31760t.m39502b();
            this.f44137a.f31760t.m39501a(feedRequestResult.getFetchedItems());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Finished loading ");
            stringBuilder.append(feedRequestResult.getFetchedItems().size());
            stringBuilder.append(" feed items");
            C0001a.a(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$o */
    static final class C13998o<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13998o f44139a = new C13998o();

        C13998o() {
        }

        public /* synthetic */ void call(Object obj) {
            m53517a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53517a(Throwable th) {
            C0001a.c(th, "Failed to load new feed items", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$p */
    static final class C13999p implements Action0 {
        /* renamed from: a */
        public static final C13999p f44140a = new C13999p();

        C13999p() {
        }

        public final void call() {
            C0001a.a("Starting polling feed items", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$q */
    static final class C14000q implements Action0 {
        /* renamed from: a */
        public static final C14000q f44141a = new C14000q();

        C14000q() {
        }

        public final void call() {
            C0001a.a("Stopped polling feed items", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/feed/FeedRequestResult;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$r */
    static final class C14001r<T> implements Action1<FeedRequestResult> {
        /* renamed from: a */
        public static final C14001r f44142a = new C14001r();

        C14001r() {
        }

        public /* synthetic */ void call(Object obj) {
            m53518a((FeedRequestResult) obj);
        }

        /* renamed from: a */
        public final void m53518a(FeedRequestResult feedRequestResult) {
            C0001a.a("Received feed items from polling", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$s */
    static final class C14002s<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14002s f44143a = new C14002s();

        C14002s() {
        }

        public /* synthetic */ void call(Object obj) {
            m53519a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53519a(Throwable th) {
            C0001a.c(th, "Error polling feed items", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "feedItemsUpdate", "Lcom/tinder/feed/view/provider/FeedItemsProvider$FeedItemsUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$t */
    static final class C14003t<T> implements Action1<C9544a> {
        /* renamed from: a */
        final /* synthetic */ C9468e f44144a;

        C14003t(C9468e c9468e) {
            this.f44144a = c9468e;
        }

        public /* synthetic */ void call(Object obj) {
            m53520a((C9544a) obj);
        }

        /* renamed from: a */
        public final void m53520a(C9544a c9544a) {
            this.f44144a.m39611a().hideLoadingState();
            FeedMainTarget a = this.f44144a.m39611a();
            C2668g.a(c9544a, "feedItemsUpdate");
            a.updateFeedItems(c9544a);
            this.f44144a.f31742b = C2668g.a((FeedItem) C19301m.i(c9544a.m39820a()), C11767j.f38473a);
            if (c9544a.m39820a().isEmpty() != null) {
                this.f44144a.m39609n();
                this.f44144a.m39611a().showEmptyState();
                return;
            }
            this.f44144a.m39611a().hideEmptyState();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.e$u */
    static final class C14004u<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14004u f44145a = new C14004u();

        C14004u() {
        }

        public /* synthetic */ void call(Object obj) {
            m53521a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53521a(Throwable th) {
            C0001a.c(th, "Failed to observe new feed items", new Object[0]);
        }
    }

    @Inject
    public C9468e(@Feed @NotNull C9545e c9545e, @NotNull RefreshFeedItems refreshFeedItems, @NotNull PollFeed pollFeed, @NotNull LoadMoreFeedItems loadMoreFeedItems, @NotNull C11690e c11690e, @NotNull C9876b c9876b, @NotNull C11693i c11693i, @NotNull C11689d c11689d, @NotNull C9450f c9450f, @NotNull ObserveHasNewFeedItems observeHasNewFeedItems, @NotNull C9454k c9454k, @NotNull FeedPositionRequestProvider feedPositionRequestProvider, @NotNull C9546a c9546a, @NotNull C9549f c9549f, @NotNull C11694q c11694q, @Feed @NotNull C9433c c9433c, @Feed @NotNull C8572b c8572b, @NotNull FeedFirstOpened feedFirstOpened) {
        C9468e c9468e = this;
        C9545e c9545e2 = c9545e;
        RefreshFeedItems refreshFeedItems2 = refreshFeedItems;
        PollFeed pollFeed2 = pollFeed;
        LoadMoreFeedItems loadMoreFeedItems2 = loadMoreFeedItems;
        C11690e c11690e2 = c11690e;
        C9876b c9876b2 = c9876b;
        C11693i c11693i2 = c11693i;
        C11689d c11689d2 = c11689d;
        C9450f c9450f2 = c9450f;
        ObserveHasNewFeedItems observeHasNewFeedItems2 = observeHasNewFeedItems;
        C9454k c9454k2 = c9454k;
        FeedPositionRequestProvider feedPositionRequestProvider2 = feedPositionRequestProvider;
        C9546a c9546a2 = c9546a;
        C9549f c9549f2 = c9549f;
        C11694q c11694q2 = c11694q;
        C9433c c9433c2 = c9433c;
        C2668g.b(c9545e2, "feedItemsProvider");
        C2668g.b(refreshFeedItems2, "refreshFeedItems");
        C2668g.b(pollFeed2, "pollFeed");
        C2668g.b(loadMoreFeedItems2, "loadMoreFeedItems");
        C2668g.b(c11690e2, "feedNoActivityEventDispatcher");
        C2668g.b(c9876b2, "feedTabReselectedProvider");
        C2668g.b(c11693i2, "feedTopEventDispatcher");
        C2668g.b(c11689d2, "feedFetchEventDispatcher");
        C2668g.b(c9450f2, "feedSessionExecutor");
        C2668g.b(observeHasNewFeedItems2, "observeHasNewFeedItems");
        C2668g.b(c9454k2, "feedSessionPositionTrackerExecutor");
        C2668g.b(feedPositionRequestProvider2, "feedPositionRequestProvider");
        C2668g.b(c9546a2, "feedCarouselItemTracker");
        C2668g.b(c9549f2, "feedViewModelPositionTracker");
        C2668g.b(c11694q2, "observeFeedActivityViewed");
        C2668g.b(c9433c, "feedViewEventDispatcher");
        C2668g.b(c8572b, "feedItemDurationTracker");
        C2668g.b(feedFirstOpened, "feedFirstOpened");
        C9433c c9433c3 = c9433c;
        this.f31752l = c9545e2;
        this.f31753m = refreshFeedItems2;
        this.f31754n = pollFeed2;
        this.f31755o = loadMoreFeedItems2;
        this.f31756p = c11690e2;
        this.f31757q = c9876b2;
        this.f31758r = c11693i2;
        this.f31759s = c11689d2;
        this.f31760t = c9450f2;
        this.f31761u = observeHasNewFeedItems2;
        this.f31762v = c9454k2;
        this.f31763w = feedPositionRequestProvider2;
        this.f31764x = c9546a2;
        this.f31765y = c9549f2;
        this.f31766z = c11694q;
        this.f31738A = c9433c3;
        FeedFirstOpened feedFirstOpened2 = feedFirstOpened;
        this.f31739B = c8572b;
        this.f31740C = feedFirstOpened2;
    }

    @NotNull
    /* renamed from: a */
    public final FeedMainTarget m39611a() {
        FeedMainTarget feedMainTarget = this.f31741a;
        if (feedMainTarget == null) {
            C2668g.b("target");
        }
        return feedMainTarget;
    }

    @Take
    /* renamed from: b */
    public final void m39614b() {
        FeedMainTarget feedMainTarget = this.f31741a;
        if (feedMainTarget == null) {
            C2668g.b("target");
        }
        feedMainTarget.showLoadingState();
        this.f31764x.m39835a();
        m39605j();
        m39604i();
        m39608m();
        m39607l();
        this.f31765y.m39850a();
        this.f31738A.m39441a();
        m39610o();
    }

    @Drop
    /* renamed from: c */
    public final void m39616c() {
        this.f31764x.m39836b();
        this.f31739B.m36585a();
        this.f31738A.m39442b();
        this.f31765y.m39851b();
        RxUtils.b(this.f31743c);
        RxUtils.b(this.f31744d);
        RxUtils.b(this.f31745e);
        RxUtils.b(this.f31746f);
        RxUtils.b(this.f31747g);
        RxUtils.b(this.f31748h);
        RxUtils.b(this.f31749i);
        RxUtils.b(this.f31750j);
        RxUtils.b(this.f31750j);
        RxUtils.b(this.f31751k);
    }

    /* renamed from: d */
    public final void m39617d() {
        m39606k();
    }

    /* renamed from: e */
    public final void m39618e() {
        RxUtils.b(this.f31745e);
    }

    /* renamed from: a */
    public final void m39613a(@NotNull TrackerAdapter trackerAdapter) {
        C2668g.b(trackerAdapter, "trackerAdapter");
        this.f31739B.m36586a(trackerAdapter);
    }

    /* renamed from: f */
    public final void m39619f() {
        m39595a(TopSource.MANUAL);
    }

    /* renamed from: a */
    public final void m39612a(int i) {
        this.f31762v.m39523a(i);
    }

    /* renamed from: b */
    public final void m39615b(int i) {
        this.f31762v.m39524b(i);
    }

    /* renamed from: g */
    public final void m39620g() {
        if (this.f31742b) {
            if (!RxUtils.a(this.f31746f)) {
                this.f31746f = this.f31755o.execute().b(Schedulers.io()).a(C13267i.f42024a).a(new C13993j(this), C13994k.f44134a);
            }
        }
    }

    /* renamed from: h */
    public final void m39621h() {
        if (!RxUtils.a(this.f31744d)) {
            this.f31749i = this.f31761u.execute().h().a().b(Schedulers.io()).a(C19397a.a()).a(new C13995l(this), C13996m.f44136a);
        }
    }

    /* renamed from: i */
    private final void m39604i() {
        this.f31747g = RxJavaInteropExtKt.toV1Completable(this.f31740C.execute()).a(C19397a.a()).a(new C13989e(this), C13990f.f44130a);
    }

    /* renamed from: a */
    private final void m39601a(Function1<? super FeedRequestResult, C15813i> function1) {
        RxUtils.b(this.f31746f);
        this.f31744d = this.f31753m.execute().b(Schedulers.io()).a(C19397a.a()).a(new C13997n(this, function1), (Action1) C13998o.f44139a);
    }

    /* renamed from: j */
    private final void m39605j() {
        RxUtils.b(this.f31743c);
        this.f31743c = this.f31752l.m39832a().b(Schedulers.io()).a(C19397a.a()).a(new C14003t(this), C14004u.f44145a);
    }

    /* renamed from: k */
    private final void m39606k() {
        RxUtils.b(this.f31745e);
        this.f31745e = this.f31754n.execute().b(Schedulers.io()).b(C13999p.f44140a).d(C14000q.f44141a).a(C14001r.f44142a, C14002s.f44143a);
    }

    /* renamed from: l */
    private final void m39607l() {
        this.f31750j = this.f31763w.m39470a().a(C19397a.a()).a(new C13985a(this), C13986b.f44126a);
    }

    /* renamed from: m */
    private final void m39608m() {
        this.f31748h = this.f31757q.m40635a().a(C19397a.a()).a(new C13991g(this), C13992h.f44132a);
    }

    /* renamed from: a */
    private final void m39595a(TopSource topSource) {
        this.f31758r.m47520a(new C9440a(topSource));
    }

    /* renamed from: n */
    private final void m39609n() {
        this.f31756p.execute();
    }

    /* renamed from: a */
    private final void m39596a(C9434e c9434e, FeedRequestResult feedRequestResult) {
        this.f31759s.m47510a(new C9437a(c9434e, feedRequestResult.getHasMoreItems() ^ 1, feedRequestResult.getFetchedItems().size()));
    }

    /* renamed from: o */
    private final void m39610o() {
        this.f31751k = this.f31766z.execute().a(new C13987c(this), C13988d.f44128a);
    }
}
