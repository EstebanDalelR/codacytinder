package com.tinder.domain.superlikeable.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.domain.superlikeable.SuperLikeableGameRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/superlikeable/usecase/SkipSuperLikeableGame;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "gameRepository", "Lcom/tinder/domain/superlikeable/SuperLikeableGameRepository;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/superlikeable/SuperLikeableGameRepository;Lcom/tinder/common/logger/Logger;)V", "execute", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SkipSuperLikeableGame implements SimpleVoidUseCase {
    private final SuperLikeableGameRepository gameRepository;
    private final Logger logger;

    @Inject
    public SkipSuperLikeableGame(@NotNull SuperLikeableGameRepository superLikeableGameRepository, @NotNull Logger logger) {
        C2668g.b(superLikeableGameRepository, "gameRepository");
        C2668g.b(logger, "logger");
        this.gameRepository = superLikeableGameRepository;
        this.logger = logger;
    }

    public void execute() {
        this.gameRepository.skipGame().b(Schedulers.io()).a(new SkipSuperLikeableGame$execute$1(this), new SkipSuperLikeableGame$execute$2(this));
    }
}
