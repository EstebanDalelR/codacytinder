package com.tinder.feed.view.tracker;

import com.tinder.feed.view.model.C9540f;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "it", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.tracker.FeedViewModelPositionTracker$feedItemIdToFeedViewModelWithPositionPairs$2 */
final class C14020x387a2874 extends Lambda implements Function1<C9540f, Pair<? extends String, ? extends C9540f>> {
    /* renamed from: a */
    public static final C14020x387a2874 f44408a = new C14020x387a2874();

    C14020x387a2874() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53671a((C9540f) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Pair<String, C9540f> m53671a(@NotNull C9540f c9540f) {
        C2668g.b(c9540f, "it");
        return C15811g.a(c9540f.m39810a().getId(), c9540f);
    }
}
