package com.tinder.feed.view.feed;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tinder.R;
import com.tinder.feed.view.model.C11767j;
import com.tinder.feed.view.model.FeedItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tinder/feed/view/feed/LoadingIndicatorView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/feed/view/feed/BindableFeedItemView;", "Lcom/tinder/feed/view/model/LoadingIndicatorItem;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bind", "", "feedItem", "bindComments", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.feed.l */
public final class C11737l extends FrameLayout implements BindableFeedItemView<C11767j> {
    /* renamed from: a */
    public void m47585a(@NotNull C11767j c11767j) {
        C2668g.b(c11767j, "feedItem");
    }

    /* renamed from: b */
    public void m47586b(@NotNull C11767j c11767j) {
        C2668g.b(c11767j, "feedItem");
    }

    public /* synthetic */ void bind(FeedItem feedItem) {
        m47585a((C11767j) feedItem);
    }

    public /* synthetic */ void bindComments(FeedItem feedItem) {
        m47586b((C11767j) feedItem);
    }

    public C11737l(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        FrameLayout.inflate(context, R.layout.activity_feed_loading_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
    }
}
