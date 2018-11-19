package com.tinder.domain.match.usecase;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/tinder/domain/match/usecase/ObserveHasUntouchedMatches;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "(Lcom/tinder/domain/match/repository/MatchRepository;)V", "getMatchRepository", "()Lcom/tinder/domain/match/repository/MatchRepository;", "execute", "Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ObserveHasUntouchedMatches implements ObservableResultUseCase<Boolean> {
    @NotNull
    private final MatchRepository matchRepository;

    @Inject
    public ObserveHasUntouchedMatches(@NotNull MatchRepository matchRepository) {
        C2668g.b(matchRepository, "matchRepository");
        this.matchRepository = matchRepository;
    }

    @NotNull
    public final MatchRepository getMatchRepository() {
        return this.matchRepository;
    }

    @NotNull
    public C3959e<Boolean> execute() {
        C3959e<Boolean> distinctUntilChanged = RxJavaInteropExtKt.toV2Observable(this.matchRepository.countUnTouchedMatches()).map(ObserveHasUntouchedMatches$execute$1.INSTANCE).distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "matchRepository\n        …  .distinctUntilChanged()");
        return distinctUntilChanged;
    }
}
