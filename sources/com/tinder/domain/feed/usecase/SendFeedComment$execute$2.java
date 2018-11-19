package com.tinder.domain.feed.usecase;

import com.tinder.domain.feed.ActivityFeedComment;
import com.tinder.domain.feed.FeedRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/domain/feed/ActivityFeedComment;", "it", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class SendFeedComment$execute$2<T, R> implements Func1<T, Single<? extends R>> {
    final /* synthetic */ SendFeedComment this$0;

    SendFeedComment$execute$2(SendFeedComment sendFeedComment) {
        this.this$0 = sendFeedComment;
    }

    @NotNull
    public final Single<ActivityFeedComment> call(ActivityFeedComment activityFeedComment) {
        FeedRepository access$getFeedRepository$p = this.this$0.feedRepository;
        C2668g.a(activityFeedComment, "it");
        return access$getFeedRepository$p.addComment(activityFeedComment);
    }
}
