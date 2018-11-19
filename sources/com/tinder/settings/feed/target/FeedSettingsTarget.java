package com.tinder.settings.feed.target;

import com.tinder.domain.settings.feed.model.FeedSharingOption;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/tinder/settings/feed/target/FeedSettingsTarget;", "", "disableSharing", "", "enableSharing", "exitFeedSettings", "showOptions", "feedSharingOptions", "", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface FeedSettingsTarget {
    void disableSharing();

    void enableSharing();

    void exitFeedSettings();

    void showOptions(@NotNull Set<FeedSharingOption> set);
}
