package com.tinder.fireboarding.domain;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/fireboarding/domain/UpdateFireboardingConfig;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "fireboardingEnabledRepository", "Lcom/tinder/fireboarding/domain/FireboardingEnabledRepository;", "(Lcom/tinder/fireboarding/domain/FireboardingEnabledRepository;)V", "execute", "Lio/reactivex/Completable;", "request", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.u */
public final class C11824u implements CompletableUseCase<C9566h> {
    /* renamed from: a */
    private final FireboardingEnabledRepository f38554a;

    public C11824u(@NotNull FireboardingEnabledRepository fireboardingEnabledRepository) {
        C2668g.b(fireboardingEnabledRepository, "fireboardingEnabledRepository");
        this.f38554a = fireboardingEnabledRepository;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m47736a((C9566h) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m47736a(@NotNull C9566h c9566h) {
        C2668g.b(c9566h, "request");
        return this.f38554a.update(c9566h.m39871a());
    }
}
