package com.tinder.feed.view.tracker;

import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C9540f;
import com.tinder.feed.view.model.FeedItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/feed/view/model/FeedViewModelWithPosition;", "index", "", "feedItem", "Lcom/tinder/feed/view/model/FeedItem;", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.tracker.FeedViewModelPositionTracker$feedItemIdToFeedViewModelWithPositionPairs$1 */
final class C14019x387a2873 extends Lambda implements Function2<Integer, FeedItem, C9540f> {
    /* renamed from: a */
    public static final C14019x387a2873 f44407a = new C14019x387a2873();

    C14019x387a2873() {
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m53670a(((Number) obj).intValue(), (FeedItem) obj2);
    }

    @Nullable
    /* renamed from: a */
    public final C9540f m53670a(int i, @NotNull FeedItem feedItem) {
        C2668g.b(feedItem, "feedItem");
        return feedItem instanceof ActivityFeedViewModel ? new C9540f((ActivityFeedViewModel) feedItem, i) : null;
    }
}
