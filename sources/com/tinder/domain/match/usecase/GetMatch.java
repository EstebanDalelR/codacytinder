package com.tinder.domain.match.usecase;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.repository.MatchRepository;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/match/usecase/GetMatch;", "", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "(Lcom/tinder/domain/match/repository/MatchRepository;)V", "execute", "Lrx/Observable;", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "matchId", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class GetMatch {
    private final MatchRepository matchRepository;

    @Inject
    public GetMatch(@NotNull MatchRepository matchRepository) {
        C2668g.b(matchRepository, "matchRepository");
        this.matchRepository = matchRepository;
    }

    @NotNull
    public final Observable<Optional<Match>> execute(@NotNull String str) {
        C2668g.b(str, "matchId");
        return this.matchRepository.getMatch(str);
    }
}
