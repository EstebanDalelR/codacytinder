package com.tinder.domain.match.usecase;

import com.tinder.domain.common.reactivex.usecase.SingleUseCase;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3960g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/tinder/domain/match/usecase/GetMatchByUserId;", "Lcom/tinder/domain/common/reactivex/usecase/SingleUseCase;", "", "Lcom/tinder/domain/match/model/Match;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "(Lcom/tinder/domain/match/repository/MatchRepository;)V", "getMatchRepository", "()Lcom/tinder/domain/match/repository/MatchRepository;", "execute", "Lio/reactivex/Single;", "request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class GetMatchByUserId implements SingleUseCase<String, Match> {
    @NotNull
    private final MatchRepository matchRepository;

    @Inject
    public GetMatchByUserId(@NotNull MatchRepository matchRepository) {
        C2668g.b(matchRepository, "matchRepository");
        this.matchRepository = matchRepository;
    }

    @NotNull
    public final MatchRepository getMatchRepository() {
        return this.matchRepository;
    }

    @NotNull
    public C3960g<Match> execute(@NotNull String str) {
        C2668g.b(str, "request");
        return RxJavaInteropExtKt.toV2Single(this.matchRepository.getMatchByUserId(str));
    }
}
