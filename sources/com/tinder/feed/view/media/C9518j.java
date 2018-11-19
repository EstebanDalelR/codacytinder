package com.tinder.feed.view.media;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.common.feed.view.FeedProfileChangeWorkContentView;
import com.tinder.common.p191d.C8529a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/feed/view/media/FeedProfileChangeWorkMediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bind", "", "feedChangeWorkViewModel", "Lcom/tinder/feed/view/media/FeedChangeWorkViewModel;", "onFeedItemDoubleTapListener", "Lcom/tinder/feed/view/media/OnFeedItemDoubleTapListener;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.media.j */
public final class C9518j extends FrameLayout {
    /* renamed from: a */
    private HashMap f31870a;

    /* renamed from: a */
    public View m39777a(int i) {
        if (this.f31870a == null) {
            this.f31870a = new HashMap();
        }
        View view = (View) this.f31870a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f31870a.put(Integer.valueOf(i), view);
        return view;
    }

    public C9518j(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        FrameLayout.inflate(context, R.layout.feed_profile_changed_work_view, this);
        setLayoutParams(C8529a.f30276a.m36494b());
        setClipChildren(null);
    }

    /* renamed from: a */
    public final void m39778a(@NotNull C9509c c9509c, @NotNull OnFeedItemDoubleTapListener onFeedItemDoubleTapListener) {
        C2668g.b(c9509c, "feedChangeWorkViewModel");
        C2668g.b(onFeedItemDoubleTapListener, "onFeedItemDoubleTapListener");
        FeedProfileChangeWorkContentView.m50258a((FeedProfileChangeWorkContentView) m39777a(C6248a.feedProfileChangeWorkContentView), c9509c.m39768a(), c9509c.m39769b(), null, 4, null);
        FeedProfileChangeWorkContentView feedProfileChangeWorkContentView = (FeedProfileChangeWorkContentView) m39777a(C6248a.feedProfileChangeWorkContentView);
        C2668g.a(feedProfileChangeWorkContentView, "feedProfileChangeWorkContentView");
        C9513e.m39771a(onFeedItemDoubleTapListener, feedProfileChangeWorkContentView);
    }
}
