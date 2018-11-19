package com.tinder.feed.view.info;

import com.tinder.domain.feed.ActivityFeedItem.MatchType;
import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toAttribution", "Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "Lcom/tinder/domain/feed/ActivityFeedItem$MatchType;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.info.c */
public final class C9504c {
    @NotNull
    /* renamed from: a */
    public static final Attribution m39757a(@NotNull MatchType matchType) {
        C2668g.b(matchType, "$receiver");
        switch (C9505d.f31842a[matchType.ordinal()]) {
            case 1:
                return Attribution.NONE;
            case 2:
                return Attribution.TOP_PICKS;
            case 3:
                return Attribution.BOOST;
            case 4:
                return Attribution.SUPER_LIKE;
            case 5:
                return Attribution.LIKES_YOU;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
