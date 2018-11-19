package com.tinder.domain.feed.usecase;

import com.tinder.domain.common.usecase.ObservableResultUseCase;
import com.tinder.domain.feed.FeedRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/domain/feed/usecase/ObserveHasNewFeedItems;", "Lcom/tinder/domain/common/usecase/ObservableResultUseCase;", "", "feedRepository", "Lcom/tinder/domain/feed/FeedRepository;", "(Lcom/tinder/domain/feed/FeedRepository;)V", "execute", "Lrx/Observable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ObserveHasNewFeedItems implements ObservableResultUseCase<Boolean> {
    private final FeedRepository feedRepository;

    @Inject
    public ObserveHasNewFeedItems(@NotNull FeedRepository feedRepository) {
        C2668g.b(feedRepository, "feedRepository");
        this.feedRepository = feedRepository;
    }

    @NotNull
    public Observable<Boolean> execute() {
        return this.feedRepository.observeNewItemsAvailable();
    }
}
