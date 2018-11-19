package com.tinder.domain.feed.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.feed.FeedRepository;
import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.C2671a;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/feed/usecase/PollForNewFeedItems;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "repository", "Lcom/tinder/domain/feed/FeedRepository;", "timerScheduler", "Lrx/Scheduler;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/feed/FeedRepository;Lrx/Scheduler;Lcom/tinder/common/logger/Logger;)V", "execute", "Lrx/Completable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PollForNewFeedItems implements SimpleCompletableUseCase {
    private final Logger logger;
    private final FeedRepository repository;
    private final C2671a timerScheduler;

    @Inject
    public PollForNewFeedItems(@NotNull FeedRepository feedRepository, @NotNull @ComputationScheduler C2671a c2671a, @NotNull Logger logger) {
        C2668g.b(feedRepository, "repository");
        C2668g.b(c2671a, "timerScheduler");
        C2668g.b(logger, "logger");
        this.repository = feedRepository;
        this.timerScheduler = c2671a;
        this.logger = logger;
    }

    @NotNull
    public Completable execute() {
        Completable c = this.repository.checkNewItemsOnColdStart().c(new PollForNewFeedItems$execute$1(this)).b(PollForNewFeedItems$execute$2.INSTANCE).c(new PollForNewFeedItems$execute$3(this));
        C2668g.a(c, "repository.checkNewItems…      }\n                }");
        return c;
    }
}
