package com.tinder.feed.target;

import com.tinder.feed.view.provider.C9545e.C9544a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/tinder/feed/target/FeedMainTarget;", "", "hideEmptyState", "", "hideLoadingState", "requestFirstItemPosition", "requestLastItemPosition", "scrollToTop", "showEmptyState", "showLoadingState", "updateFeedItems", "feedItemsUpdate", "Lcom/tinder/feed/view/provider/FeedItemsProvider$FeedItemsUpdate;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface FeedMainTarget {
    void hideEmptyState();

    void hideLoadingState();

    void requestFirstItemPosition();

    void requestLastItemPosition();

    void scrollToTop();

    void showEmptyState();

    void showLoadingState();

    void updateFeedItems(@NotNull C9544a c9544a);
}
