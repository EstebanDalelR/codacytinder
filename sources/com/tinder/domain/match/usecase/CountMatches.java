package com.tinder.domain.match.usecase;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3959e;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/domain/match/usecase/CountMatches;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "(Lcom/tinder/domain/match/repository/MatchRepository;)V", "execute", "Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class CountMatches implements ObservableResultUseCase<Long> {
    private final MatchRepository matchRepository;

    public CountMatches(@NotNull MatchRepository matchRepository) {
        C2668g.b(matchRepository, "matchRepository");
        this.matchRepository = matchRepository;
    }

    @NotNull
    public C3959e<Long> execute() {
        return RxJavaInteropExtKt.toV2Observable(this.matchRepository.countMatches());
    }
}
