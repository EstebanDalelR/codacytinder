package com.tinder.domain.fastmatch.newCount.usecase;

import com.tinder.domain.common.usecase.ObservableResultUseCase;
import com.tinder.domain.fastmatch.repository.NewCountRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/domain/fastmatch/newCount/usecase/ObserveNewCountUpdate;", "Lcom/tinder/domain/common/usecase/ObservableResultUseCase;", "", "newCountRepository", "Lcom/tinder/domain/fastmatch/repository/NewCountRepository;", "(Lcom/tinder/domain/fastmatch/repository/NewCountRepository;)V", "execute", "Lrx/Observable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ObserveNewCountUpdate implements ObservableResultUseCase<Integer> {
    private final NewCountRepository newCountRepository;

    @Inject
    public ObserveNewCountUpdate(@NotNull NewCountRepository newCountRepository) {
        C2668g.b(newCountRepository, "newCountRepository");
        this.newCountRepository = newCountRepository;
    }

    @NotNull
    public Observable<Integer> execute() {
        return this.newCountRepository.observeCount();
    }
}
