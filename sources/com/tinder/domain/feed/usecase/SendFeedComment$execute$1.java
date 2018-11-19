package com.tinder.domain.feed.usecase;

import com.tinder.domain.feed.ActivityCommentMetaData;
import com.tinder.domain.feed.ActivityFeedComment;
import com.tinder.domain.feed.usecase.SendFeedComment.Request;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/ActivityFeedComment;", "call"}, k = 3, mv = {1, 1, 10})
final class SendFeedComment$execute$1<V> implements Callable<T> {
    final /* synthetic */ Request $request;
    final /* synthetic */ SendFeedComment this$0;

    SendFeedComment$execute$1(SendFeedComment sendFeedComment, Request request) {
        this.this$0 = sendFeedComment;
        this.$request = request;
    }

    @NotNull
    public final ActivityFeedComment call() {
        String comment = this.$request.getComment();
        String feedItemId = this.$request.getFeedItemId();
        long millis = ((DateTime) this.this$0.dateTimeProvider.invoke()).getMillis();
        String carouselItemId = this.$request.getCarouselItemId();
        if (carouselItemId == null) {
            carouselItemId = "";
        }
        return new ActivityFeedComment(comment, feedItemId, millis, new ActivityCommentMetaData(carouselItemId), null, 16, null);
    }
}
