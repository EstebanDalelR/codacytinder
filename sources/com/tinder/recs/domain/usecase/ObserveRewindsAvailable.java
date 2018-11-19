package com.tinder.recs.domain.usecase;

import com.tinder.domain.common.reactivex.usecase.FlowableResultUseCase;
import com.tinder.recs.domain.repository.RewindsAvailableRepository;
import io.reactivex.C3957b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/recs/domain/usecase/ObserveRewindsAvailable;", "Lcom/tinder/domain/common/reactivex/usecase/FlowableResultUseCase;", "", "rewindsAvailableRepository", "Lcom/tinder/recs/domain/repository/RewindsAvailableRepository;", "(Lcom/tinder/recs/domain/repository/RewindsAvailableRepository;)V", "execute", "Lio/reactivex/Flowable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ObserveRewindsAvailable implements FlowableResultUseCase<Integer> {
    private final RewindsAvailableRepository rewindsAvailableRepository;

    public ObserveRewindsAvailable(@NotNull RewindsAvailableRepository rewindsAvailableRepository) {
        C2668g.b(rewindsAvailableRepository, "rewindsAvailableRepository");
        this.rewindsAvailableRepository = rewindsAvailableRepository;
    }

    @NotNull
    public C3957b<Integer> execute() {
        return this.rewindsAvailableRepository.observeRewindsAvailable();
    }
}
