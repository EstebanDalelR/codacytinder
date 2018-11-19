package com.tinder.feed.view.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tinder.feed.view.feed.C9492d;
import com.tinder.video.view.MediaView;
import com.tinder.video.view.MediaView.C15417a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/feed/view/media/FeedProfileAddLoopMediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bind", "", "feedLoopViewModel", "Lcom/tinder/feed/view/media/FeedLoopViewModel;", "onFeedItemDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.media.g */
public final class C9515g extends FrameLayout {
    public C9515g(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        setLayoutParams(new LayoutParams(-1, -2));
        setClipChildren(null);
    }

    /* renamed from: a */
    public final void m39772a(@NotNull C9510d c9510d, @NotNull OnFeedItemDoubleTapListener onFeedItemDoubleTapListener) {
        C2668g.b(c9510d, "feedLoopViewModel");
        C2668g.b(onFeedItemDoubleTapListener, "onFeedItemDoubleTapListener");
        c9510d = c9510d.m39770a();
        C15417a c15417a = MediaView.f56646c;
        Context context = getContext();
        C2668g.a(context, "context");
        View a = c15417a.a(context, C9492d.m39695b(c9510d.m42941b()), C9492d.m39696c(c9510d.m42940a()));
        addView(a);
        C9513e.m39771a(onFeedItemDoubleTapListener, a);
    }
}
