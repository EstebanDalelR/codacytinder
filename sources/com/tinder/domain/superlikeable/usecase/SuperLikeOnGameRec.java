package com.tinder.domain.superlikeable.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.superlikeable.SuperLikeableGameRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/superlikeable/usecase/SuperLikeOnGameRec;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/domain/recs/model/UserRec;", "superLikeableGameRepository", "Lcom/tinder/domain/superlikeable/SuperLikeableGameRepository;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/superlikeable/SuperLikeableGameRepository;Lcom/tinder/common/logger/Logger;)V", "execute", "Lrx/Completable;", "userRec", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeOnGameRec implements CompletableUseCase<UserRec> {
    private final Logger logger;
    private final SuperLikeableGameRepository superLikeableGameRepository;

    @Inject
    public SuperLikeOnGameRec(@NotNull SuperLikeableGameRepository superLikeableGameRepository, @NotNull Logger logger) {
        C2668g.b(superLikeableGameRepository, "superLikeableGameRepository");
        C2668g.b(logger, "logger");
        this.superLikeableGameRepository = superLikeableGameRepository;
        this.logger = logger;
    }

    @NotNull
    public Completable execute(@NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        userRec = this.superLikeableGameRepository.superLikeOnRec(userRec).b(new SuperLikeOnGameRec$execute$1(this, userRec)).c(new SuperLikeOnGameRec$execute$2(this, userRec));
        C2668g.a(userRec, "superLikeableGameReposit…          }\n            }");
        return userRec;
    }
}
