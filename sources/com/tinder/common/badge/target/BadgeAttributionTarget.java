package com.tinder.common.badge.target;

import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/tinder/common/badge/target/BadgeAttributionTarget;", "", "disableShimmer", "", "enableShimmer", "hideBadgeAttribution", "showBadgeAttribution", "attribution", "Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface BadgeAttributionTarget {
    void disableShimmer();

    void enableShimmer();

    void hideBadgeAttribution();

    void showBadgeAttribution(@NotNull Attribution attribution);
}
