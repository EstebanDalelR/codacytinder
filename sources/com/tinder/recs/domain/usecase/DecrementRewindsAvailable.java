package com.tinder.recs.domain.usecase;

import com.tinder.domain.common.reactivex.usecase.SimpleCompletableUseCase;
import com.tinder.recs.domain.repository.RewindsAvailableRepository;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/recs/domain/usecase/DecrementRewindsAvailable;", "Lcom/tinder/domain/common/reactivex/usecase/SimpleCompletableUseCase;", "rewindsAvailableRepository", "Lcom/tinder/recs/domain/repository/RewindsAvailableRepository;", "(Lcom/tinder/recs/domain/repository/RewindsAvailableRepository;)V", "execute", "Lio/reactivex/Completable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class DecrementRewindsAvailable implements SimpleCompletableUseCase {
    private final RewindsAvailableRepository rewindsAvailableRepository;

    public DecrementRewindsAvailable(@NotNull RewindsAvailableRepository rewindsAvailableRepository) {
        C2668g.b(rewindsAvailableRepository, "rewindsAvailableRepository");
        this.rewindsAvailableRepository = rewindsAvailableRepository;
    }

    @NotNull
    public C3956a execute() {
        C3956a d = this.rewindsAvailableRepository.observeRewindsAvailable().f().d(new DecrementRewindsAvailable$execute$1(this));
        C2668g.a(d, "rewindsAvailableReposito…          }\n            }");
        return d;
    }
}
