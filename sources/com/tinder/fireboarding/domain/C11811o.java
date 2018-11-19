package com.tinder.fireboarding.domain;

import com.tinder.domain.common.reactivex.usecase.FlowableResultUseCase;
import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;", "Lcom/tinder/domain/common/reactivex/usecase/FlowableResultUseCase;", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "fireboardingEnabledRepository", "Lcom/tinder/fireboarding/domain/FireboardingEnabledRepository;", "(Lcom/tinder/fireboarding/domain/FireboardingEnabledRepository;)V", "execute", "Lio/reactivex/Flowable;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.o */
public final class C11811o implements FlowableResultUseCase<C9566h> {
    /* renamed from: a */
    private final FireboardingEnabledRepository f38537a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "it", "", "apply", "(Ljava/lang/Boolean;)Lcom/tinder/fireboarding/domain/FireboardingConfig;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.o$a */
    static final class C11810a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11810a f38536a = new C11810a();

        C11810a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47724a((Boolean) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C9566h m47724a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return new C9566h(bool.booleanValue());
        }
    }

    public C11811o(@NotNull FireboardingEnabledRepository fireboardingEnabledRepository) {
        C2668g.b(fireboardingEnabledRepository, "fireboardingEnabledRepository");
        this.f38537a = fireboardingEnabledRepository;
    }

    @NotNull
    public C3957b<C9566h> execute() {
        C3957b<C9566h> f = this.f38537a.observe().f(C11810a.f38536a);
        C2668g.a(f, "fireboardingEnabledRepos… FireboardingConfig(it) }");
        return f;
    }
}
