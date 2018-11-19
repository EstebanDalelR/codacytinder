package com.tinder.feed.p248c;

import com.tinder.common.tracker.recyclerview.C10701a;
import com.tinder.common.tracker.recyclerview.C8572b;
import com.tinder.common.tracker.recyclerview.RecyclerViewItemTracker;
import com.tinder.common.tracker.recyclerview.p200c.C8573a;
import com.tinder.common.tracker.recyclerview.p200c.C8574c;
import com.tinder.common.tracker.recyclerview.p200c.C8575e;
import com.tinder.common.tracker.recyclerview.p200c.C8576g;
import com.tinder.common.tracker.recyclerview.p200c.C8577i;
import com.tinder.data.feed.C8654e;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.tracker.ListItemViewDurationRepository;
import com.tinder.feed.analytics.C9433c;
import com.tinder.feed.p341b.C11695a;
import com.tinder.feed.qualifiers.Feed;
import com.tinder.feed.usecase.C11707c;
import com.tinder.feed.usecase.C13272a;
import com.tinder.feed.usecase.C13273b;
import com.tinder.feed.usecase.FeedFirstOpened;
import com.tinder.feed.view.FeedMainView;
import com.tinder.feed.view.action.C11724d;
import com.tinder.feed.view.action.MatchProfileDisplayAction;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.feed.view.provider.C9545e;
import com.tinder.home.p259b.C9695a;
import com.tinder.match.provider.C9879g;
import com.tinder.module.ViewScope;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000fJ'\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00132\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0001¢\u0006\u0002\b\u0017J3\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"J\u0015\u0010#\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020$H\u0001¢\u0006\u0002\b%J\u001f\u0010&\u001a\u00020'2\b\b\u0001\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+J\u0015\u0010,\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020-H\u0001¢\u0006\u0002\b.J9\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u00103\u001a\u00020-2\u000e\b\u0001\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0001¢\u0006\u0002\b7J!\u00108\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0001¢\u0006\u0002\b9J\u0015\u0010:\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u001bH\u0001¢\u0006\u0002\b;J\u0015\u0010<\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u001dH\u0001¢\u0006\u0002\b=J\u0015\u0010>\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b?J\u0015\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0001¢\u0006\u0002\bDJ\u0015\u0010E\u001a\u00020F2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\bG¨\u0006H"}, d2 = {"Lcom/tinder/feed/module/FeedViewModule;", "", "()V", "provideFeedFirstOpened", "Lcom/tinder/feed/usecase/FeedFirstOpened;", "feedExperimentUtility", "Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "homePageTabSelectedProvider", "Lcom/tinder/home/provider/HomePageTabSelectedProvider;", "matchesTabSelectedProvider", "Lcom/tinder/match/provider/MatchesTabSelectedProvider;", "provideFeedFirstOpened$Tinder_release", "provideFeedItemsProvider", "Lcom/tinder/feed/view/provider/FeedItemsProvider;", "provider", "provideFeedItemsProvider$Tinder_release", "provideFeedPlayableItemTracker", "Lcom/tinder/feed/view/tracker/FeedPlayableItemTracker;", "feedPlayableItemObservers", "Lcom/tinder/feed/view/tracker/FeedPlayableItemObservers;", "listPlayableItemStateProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListPlayableItemStateProvider;", "Lcom/tinder/feed/view/model/FeedItem;", "provideFeedPlayableItemTracker$Tinder_release", "provideFeedRecyclerViewTracker", "Lcom/tinder/common/tracker/recyclerview/RecyclerViewItemTracker;", "listVisibleItemProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleItemProvider;", "listVisibleRangeProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleRangeProvider;", "listVisibleStateProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListVisibleStateProvider;", "observeFeedVisible", "Lcom/tinder/feed/usecase/ObserveFeedVisible;", "provideFeedRecyclerViewTracker$Tinder_release", "provideFeedViewEventDispatcher", "Lcom/tinder/feed/analytics/FeedViewEventDispatcher;", "provideFeedViewEventDispatcher$Tinder_release", "provideFeedViewModelPositionTracker", "Lcom/tinder/feed/view/tracker/FeedViewModelPositionTracker;", "feedItemsProvider", "feedViewModelWithPositionMap", "Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;", "provideFeedViewModelPositionTracker$Tinder_release", "provideListItemDurationProvider", "Lcom/tinder/common/tracker/recyclerview/provider/ListItemDurationProvider;", "provideListItemDurationProvider$Tinder_release", "provideListItemDurationTracker", "Lcom/tinder/common/tracker/recyclerview/RecyclerViewItemViewDurationTracker;", "listItemViewDurationRepository", "Lcom/tinder/domain/tracker/ListItemViewDurationRepository;", "listItemDurationProvider", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "provideListItemDurationTracker$Tinder_release", "provideListPlayableItemStateProvider", "provideListPlayableItemStateProvider$Tinder_release", "provideListVisibleItemProvider", "provideListVisibleItemProvider$Tinder_release", "provideListVisibleRangeProvider", "provideListVisibleRangeProvider$Tinder_release", "provideListVisibleStateProvider", "provideListVisibleStateProvider$Tinder_release", "provideMatchProfileDisplayAction", "Lcom/tinder/feed/view/action/MatchProfileDisplayAction;", "feedMainView", "Lcom/tinder/feed/view/FeedMainView;", "provideMatchProfileDisplayAction$Tinder_release", "provideViewVisibleObserver", "Lcom/tinder/common/tracker/recyclerview/rx/ViewVisibleObserver;", "provideViewVisibleObserver$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module(includes = {C8654e.class})
/* renamed from: com.tinder.feed.c.b */
public final class C9461b {
    @Feed
    @ViewScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final C8573a m39556a(@NotNull C8573a c8573a) {
        C2668g.b(c8573a, "provider");
        return c8573a;
    }

    @Feed
    @ViewScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final C8574c<FeedItem> m39557a(@NotNull C8574c<FeedItem> c8574c) {
        C2668g.b(c8574c, "provider");
        return c8574c;
    }

    @Feed
    @ViewScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final C8575e m39558a(@NotNull C8575e c8575e) {
        C2668g.b(c8575e, "provider");
        return c8575e;
    }

    @Feed
    @ViewScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final C8576g m39559a(@NotNull C8576g c8576g) {
        C2668g.b(c8576g, "provider");
        return c8576g;
    }

    @Feed
    @ViewScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final C8577i m39560a(@NotNull C8577i c8577i) {
        C2668g.b(c8577i, "provider");
        return c8577i;
    }

    @Feed
    @ViewScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final C9433c m39561a(@NotNull C9433c c9433c) {
        C2668g.b(c9433c, "provider");
        return c9433c;
    }

    @Feed
    @ViewScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final C9545e m39564a(@NotNull C9545e c9545e) {
        C2668g.b(c9545e, "provider");
        return c9545e;
    }

    @NotNull
    @ViewScope
    @Provides
    /* renamed from: a */
    public final MatchProfileDisplayAction m39563a(@NotNull FeedMainView feedMainView) {
        C2668g.b(feedMainView, "feedMainView");
        feedMainView = feedMainView.getContext();
        C2668g.a(feedMainView, "feedMainView.context");
        return new C11724d(feedMainView);
    }

    @Feed
    @ViewScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final RecyclerViewItemTracker m39554a(@Feed @NotNull C8575e c8575e, @Feed @NotNull C8576g c8576g, @Feed @NotNull C8577i c8577i, @NotNull C11707c c11707c) {
        C2668g.b(c8575e, "listVisibleItemProvider");
        C2668g.b(c8576g, "listVisibleRangeProvider");
        C2668g.b(c8577i, "listVisibleStateProvider");
        C2668g.b(c11707c, "observeFeedVisible");
        return new C10701a(c8575e, c8576g, c8577i, c11707c);
    }

    @Feed
    @ViewScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final C8572b m39555a(@NotNull ListItemViewDurationRepository listItemViewDurationRepository, @Feed @NotNull C8575e c8575e, @Feed @NotNull C8573a c8573a, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(listItemViewDurationRepository, "listItemViewDurationRepository");
        C2668g.b(c8575e, "listVisibleItemProvider");
        C2668g.b(c8573a, "listItemDurationProvider");
        C2668g.b(function0, "dateTimeProvider");
        return new C8572b(listItemViewDurationRepository, c8575e, c8573a, function0);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final FeedFirstOpened m39562a(@NotNull C11695a c11695a, @NotNull C9695a c9695a, @NotNull C9879g c9879g) {
        C2668g.b(c11695a, "feedExperimentUtility");
        C2668g.b(c9695a, "homePageTabSelectedProvider");
        C2668g.b(c9879g, "matchesTabSelectedProvider");
        if (c11695a.m47525d() != null) {
            return (FeedFirstOpened) new C13272a(c9695a);
        }
        return (FeedFirstOpened) new C13273b(c9879g);
    }
}
