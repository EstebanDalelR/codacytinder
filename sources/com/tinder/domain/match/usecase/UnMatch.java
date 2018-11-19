package com.tinder.domain.match.usecase;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/match/usecase/UnMatch;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "(Lcom/tinder/domain/match/repository/MatchRepository;)V", "execute", "Lio/reactivex/Completable;", "request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class UnMatch implements CompletableUseCase<String> {
    private final MatchRepository matchRepository;

    @Inject
    public UnMatch(@NotNull MatchRepository matchRepository) {
        C2668g.b(matchRepository, "matchRepository");
        this.matchRepository = matchRepository;
    }

    @NotNull
    public C3956a execute(@NotNull String str) {
        C2668g.b(str, "request");
        return RxJavaInteropExtKt.toV2Completable(this.matchRepository.unMatch(str));
    }
}
