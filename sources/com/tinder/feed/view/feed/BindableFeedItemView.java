package com.tinder.feed.view.feed;

import com.tinder.feed.view.model.FeedItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/feed/view/feed/BindableFeedItemView;", "ITEM", "Lcom/tinder/feed/view/model/FeedItem;", "", "bind", "", "feedItem", "(Lcom/tinder/feed/view/model/FeedItem;)V", "bindComments", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface BindableFeedItemView<ITEM extends FeedItem> {
    void bind(@NotNull ITEM item);

    void bindComments(@NotNull ITEM item);
}
