package com.tinder.feed.view;

import android.support.v4.widget.SwipeRefreshLayout;
import com.tinder.C6250b.C6248a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)Z"}, k = 3, mv = {1, 1, 10})
final class FeedMainView$q<T, R> implements Func1<C15813i, Boolean> {
    /* renamed from: a */
    final /* synthetic */ FeedMainView f42050a;

    FeedMainView$q(FeedMainView feedMainView) {
        this.f42050a = feedMainView;
    }

    public /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(m51346a((C15813i) obj));
    }

    /* renamed from: a */
    public final boolean m51346a(C15813i c15813i) {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f42050a.a(C6248a.feedSwipeRefreshLayout);
        C2668g.a(swipeRefreshLayout, "feedSwipeRefreshLayout");
        return swipeRefreshLayout.b();
    }
}
