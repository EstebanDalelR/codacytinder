package com.tinder.domain.feed;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Observable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u0018"}, d2 = {"Lcom/tinder/domain/feed/FeedRepository;", "", "addComment", "Lrx/Single;", "Lcom/tinder/domain/feed/ActivityFeedComment;", "comment", "checkNewItems", "Lcom/tinder/domain/feed/FeedRequestResult;", "checkNewItemsOnColdStart", "Lrx/Completable;", "clear", "deleteFailedComment", "feedItemId", "", "loadFeed", "loadNextFeedPage", "observeFeed", "Lrx/Observable;", "Lcom/tinder/domain/feed/FeedResult;", "observeNewItemsAvailable", "", "pollIntervalSeconds", "", "retryFailedComment", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface FeedRepository {
    @NotNull
    Single<ActivityFeedComment> addComment(@NotNull ActivityFeedComment activityFeedComment);

    @NotNull
    Single<FeedRequestResult> checkNewItems();

    @NotNull
    Completable checkNewItemsOnColdStart();

    @NotNull
    Completable clear();

    @NotNull
    Completable deleteFailedComment(@NotNull String str);

    @NotNull
    Single<FeedRequestResult> loadFeed();

    @NotNull
    Single<FeedRequestResult> loadNextFeedPage();

    @NotNull
    Observable<FeedResult> observeFeed();

    @NotNull
    Observable<Boolean> observeNewItemsAvailable();

    @NotNull
    Single<Integer> pollIntervalSeconds();

    @NotNull
    Single<ActivityFeedComment> retryFailedComment(@NotNull String str);
}
