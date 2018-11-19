package com.tinder.domain.feed.usecase;

import com.tinder.domain.common.usecase.SingleUseCase;
import com.tinder.domain.feed.ActivityFeedComment;
import com.tinder.domain.feed.FeedRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/feed/usecase/RetryFailedFeedComment;", "Lcom/tinder/domain/common/usecase/SingleUseCase;", "", "Lcom/tinder/domain/feed/ActivityFeedComment;", "feedRepository", "Lcom/tinder/domain/feed/FeedRepository;", "(Lcom/tinder/domain/feed/FeedRepository;)V", "execute", "Lrx/Single;", "request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class RetryFailedFeedComment implements SingleUseCase<String, ActivityFeedComment> {
    private final FeedRepository feedRepository;

    @Inject
    public RetryFailedFeedComment(@NotNull FeedRepository feedRepository) {
        C2668g.b(feedRepository, "feedRepository");
        this.feedRepository = feedRepository;
    }

    @NotNull
    public Single<ActivityFeedComment> execute(@NotNull String str) {
        C2668g.b(str, "request");
        return this.feedRepository.retryFailedComment(str);
    }
}
