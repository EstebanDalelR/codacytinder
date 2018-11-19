package com.tinder.fireboarding.domain;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import io.reactivex.C3959e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "", "Lcom/tinder/fireboarding/domain/Level;", "completedLevelRepository", "Lcom/tinder/fireboarding/domain/CompletedLevelRepository;", "(Lcom/tinder/fireboarding/domain/CompletedLevelRepository;)V", "execute", "Lio/reactivex/Observable;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.n */
public final class C11809n implements ObservableResultUseCase<Set<? extends Level>> {
    /* renamed from: a */
    private final CompletedLevelRepository f38535a;

    public C11809n(@NotNull CompletedLevelRepository completedLevelRepository) {
        C2668g.b(completedLevelRepository, "completedLevelRepository");
        this.f38535a = completedLevelRepository;
    }

    @NotNull
    public C3959e<Set<Level>> execute() {
        return this.f38535a.observeCompletedLevels();
    }
}
