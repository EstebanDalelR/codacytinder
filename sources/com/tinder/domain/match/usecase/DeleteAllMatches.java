package com.tinder.domain.match.usecase;

import com.tinder.domain.common.reactivex.usecase.SimpleCompletableUseCase;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/match/usecase/DeleteAllMatches;", "Lcom/tinder/domain/common/reactivex/usecase/SimpleCompletableUseCase;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "(Lcom/tinder/domain/match/repository/MatchRepository;)V", "execute", "Lio/reactivex/Completable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class DeleteAllMatches implements SimpleCompletableUseCase {
    private final MatchRepository matchRepository;

    @Inject
    public DeleteAllMatches(@NotNull MatchRepository matchRepository) {
        C2668g.m10309b(matchRepository, "matchRepository");
        this.matchRepository = matchRepository;
    }

    @NotNull
    public C3956a execute() {
        return RxJavaInteropExtKt.toV2Completable(this.matchRepository.deleteAll());
    }
}
