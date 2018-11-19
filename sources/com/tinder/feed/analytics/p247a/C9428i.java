package com.tinder.feed.analytics.p247a;

import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import com.tinder.overflow.analytics.AnalyticsMatchAttribution;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MEDIA_POSITION_FOR_NON_CAROUSEL_ITEM", "", "SINGLE_MEDIA_AVAILABLE", "toAnalyticsMatchAttribution", "Lcom/tinder/overflow/analytics/AnalyticsMatchAttribution;", "Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.a.i */
public final class C9428i {
    @NotNull
    /* renamed from: a */
    public static final AnalyticsMatchAttribution m39429a(@NotNull Attribution attribution) {
        C2668g.b(attribution, "$receiver");
        switch (C9429j.f31596a[attribution.ordinal()]) {
            case 1:
                return AnalyticsMatchAttribution.DEFAULT;
            case 2:
                return AnalyticsMatchAttribution.SUPER_LIKE;
            case 3:
                return AnalyticsMatchAttribution.BOOST;
            case 4:
                return AnalyticsMatchAttribution.LIKES_YOU;
            case 5:
                return AnalyticsMatchAttribution.TOP_PICKS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
