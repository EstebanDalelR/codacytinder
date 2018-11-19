package com.tinder.feed.p340a;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.tinder.feed.view.feed.BindableFeedItemView;
import com.tinder.feed.view.model.FeedItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/tinder/feed/adapter/FeedItemViewHolder;", "T", "Lcom/tinder/feed/view/model/FeedItem;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Lcom/tinder/feed/view/feed/BindableFeedItemView;", "(Lcom/tinder/feed/view/feed/BindableFeedItemView;)V", "getView", "()Lcom/tinder/feed/view/feed/BindableFeedItemView;", "bind", "", "feedItem", "bindComments", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.a.a */
public final class C11681a<T extends FeedItem> extends ViewHolder {
    @NotNull
    /* renamed from: a */
    private final BindableFeedItemView<T> f38178a;

    public C11681a(@NotNull BindableFeedItemView<? super T> bindableFeedItemView) {
        C2668g.b(bindableFeedItemView, "view");
        super((View) bindableFeedItemView);
        this.f38178a = bindableFeedItemView;
    }

    /* renamed from: a */
    public final void m47485a(@NotNull FeedItem feedItem) {
        C2668g.b(feedItem, "feedItem");
        if (feedItem != null) {
            this.f38178a.bind(feedItem);
        }
    }

    /* renamed from: b */
    public final void m47486b(@NotNull FeedItem feedItem) {
        C2668g.b(feedItem, "feedItem");
        if (feedItem != null) {
            this.f38178a.bindComments(feedItem);
        }
    }
}
