package com.tinder.feed.view.tracker;

import com.tinder.common.tracker.recyclerview.p199b.C8571j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/common/tracker/recyclerview/model/VisibleItemState;", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedPlayableItemTracker$toNextPlayableFeedItem$1 extends Lambda implements Function1<C8571j, Boolean> {
    /* renamed from: a */
    public static final FeedPlayableItemTracker$toNextPlayableFeedItem$1 f44403a = new FeedPlayableItemTracker$toNextPlayableFeedItem$1();

    FeedPlayableItemTracker$toNextPlayableFeedItem$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53667a((C8571j) obj));
    }

    /* renamed from: a */
    public final boolean m53667a(@NotNull C8571j c8571j) {
        C2668g.b(c8571j, "it");
        return c8571j.m36574b() > 50.0f ? true : null;
    }
}
