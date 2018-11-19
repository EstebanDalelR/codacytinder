package com.tinder.data.feed;

import com.tinder.domain.feed.ActivityFeedItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/tinder/data/feed/DebuggableFeedDataRepository;", "", "deleteFeedItemsByMatchId", "", "matchId", "", "replaceFeedItems", "items", "", "Lcom/tinder/domain/feed/ActivityFeedItem;", "data_release"}, k = 1, mv = {1, 1, 10})
public interface DebuggableFeedDataRepository {
    void deleteFeedItemsByMatchId(@NotNull String str);

    void replaceFeedItems(@NotNull List<ActivityFeedItem> list);
}
