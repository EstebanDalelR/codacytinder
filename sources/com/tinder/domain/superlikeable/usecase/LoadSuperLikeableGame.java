package com.tinder.domain.superlikeable.usecase;

import com.tinder.domain.common.usecase.SingleResultUseCase;
import com.tinder.domain.superlikeable.SuperLikeableGameRepository;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/superlikeable/usecase/LoadSuperLikeableGame;", "Lcom/tinder/domain/common/usecase/SingleResultUseCase;", "Ljava8/util/Optional;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "superLikeableGameRepository", "Lcom/tinder/domain/superlikeable/SuperLikeableGameRepository;", "(Lcom/tinder/domain/superlikeable/SuperLikeableGameRepository;)V", "execute", "Lrx/Single;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LoadSuperLikeableGame implements SingleResultUseCase<Optional<SuperLikeableGame>> {
    private final SuperLikeableGameRepository superLikeableGameRepository;

    @Inject
    public LoadSuperLikeableGame(@NotNull SuperLikeableGameRepository superLikeableGameRepository) {
        C2668g.b(superLikeableGameRepository, "superLikeableGameRepository");
        this.superLikeableGameRepository = superLikeableGameRepository;
    }

    @NotNull
    public Single<Optional<SuperLikeableGame>> execute() {
        return this.superLikeableGameRepository.load();
    }
}
