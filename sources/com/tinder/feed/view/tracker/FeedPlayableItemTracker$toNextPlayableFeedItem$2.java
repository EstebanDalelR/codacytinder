package com.tinder.feed.view.tracker;

import com.tinder.common.tracker.recyclerview.p199b.C8571j;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.feed.view.model.p252a.C9535a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/common/tracker/recyclerview/model/VisibleItemState;", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedPlayableItemTracker$toNextPlayableFeedItem$2 extends Lambda implements Function1<C8571j, Boolean> {
    /* renamed from: a */
    final /* synthetic */ List f44404a;
    /* renamed from: b */
    final /* synthetic */ Map f44405b;

    FeedPlayableItemTracker$toNextPlayableFeedItem$2(List list, Map map) {
        this.f44404a = list;
        this.f44405b = map;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53668a((C8571j) obj));
    }

    /* renamed from: a */
    public final boolean m53668a(@NotNull C8571j c8571j) {
        C2668g.b(c8571j, "it");
        return C9535a.m39796a((FeedItem) this.f44404a.get(c8571j.m36573a()), this.f44405b);
    }
}
