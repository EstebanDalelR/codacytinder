package com.tinder.domain.feed.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.common.usecase.ObservableResultUseCase;
import com.tinder.domain.feed.FeedRepository;
import com.tinder.domain.feed.FeedRequestResult;
import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.C2671a;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/domain/feed/usecase/PollFeed;", "Lcom/tinder/domain/common/usecase/ObservableResultUseCase;", "Lcom/tinder/domain/feed/FeedRequestResult;", "repository", "Lcom/tinder/domain/feed/FeedRepository;", "timerScheduler", "Lrx/Scheduler;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/feed/FeedRepository;Lrx/Scheduler;Lcom/tinder/common/logger/Logger;)V", "execute", "Lrx/Observable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PollFeed implements ObservableResultUseCase<FeedRequestResult> {
    private final Logger logger;
    private final FeedRepository repository;
    private final C2671a timerScheduler;

    @Inject
    public PollFeed(@NotNull FeedRepository feedRepository, @NotNull @ComputationScheduler C2671a c2671a, @NotNull Logger logger) {
        C2668g.b(feedRepository, "repository");
        C2668g.b(c2671a, "timerScheduler");
        C2668g.b(logger, "logger");
        this.repository = feedRepository;
        this.timerScheduler = c2671a;
        this.logger = logger;
    }

    @NotNull
    public Observable<FeedRequestResult> execute() {
        Observable<FeedRequestResult> n = this.repository.checkNewItems().a().a(new PollFeed$execute$1(this)).l(PollFeed$execute$2.INSTANCE).n(new PollFeed$execute$3(this));
        C2668g.a(n, "repository.checkNewItems…      }\n                }");
        return n;
    }
}
