package com.tinder.feed.view.tracker;

import com.tinder.common.tracker.recyclerview.p199b.C8571j;
import com.tinder.feed.view.model.FeedItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/feed/view/model/FeedItem;", "it", "Lcom/tinder/common/tracker/recyclerview/model/VisibleItemState;", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedPlayableItemTracker$toNextPlayableFeedItem$3 extends Lambda implements Function1<C8571j, FeedItem> {
    /* renamed from: a */
    final /* synthetic */ List f44406a;

    FeedPlayableItemTracker$toNextPlayableFeedItem$3(List list) {
        this.f44406a = list;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53669a((C8571j) obj);
    }

    @NotNull
    /* renamed from: a */
    public final FeedItem m53669a(@NotNull C8571j c8571j) {
        C2668g.b(c8571j, "it");
        return (FeedItem) this.f44406a.get(c8571j.m36573a());
    }
}
