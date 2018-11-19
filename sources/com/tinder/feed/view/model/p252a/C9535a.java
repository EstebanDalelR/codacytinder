package com.tinder.feed.view.model.p252a;

import com.tinder.domain.feed.FeedCarouselItemSelected;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.FeedItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\u0007"}, d2 = {"isPlayableAtMediaPosition", "", "Lcom/tinder/feed/view/model/FeedItem;", "carouselItemSelectedMap", "", "", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.model.a.a */
public final class C9535a {
    /* renamed from: a */
    public static final boolean m39796a(@NotNull FeedItem feedItem, @NotNull Map<String, FeedCarouselItemSelected> map) {
        C2668g.b(feedItem, "$receiver");
        C2668g.b(map, "carouselItemSelectedMap");
        FeedCarouselItemSelected feedCarouselItemSelected = (FeedCarouselItemSelected) map.get(feedItem.getId());
        map = feedCarouselItemSelected != null ? feedCarouselItemSelected.getCarouselPosition() : null;
        if (feedItem instanceof ActivityFeedViewModel) {
            return C9536b.m39797a((ActivityFeedViewModel) feedItem, map);
        }
        return false;
    }
}
