package com.tinder.typingindicator.usecase;

import com.tinder.domain.common.reactivex.usecase.FlowableResultUseCase;
import com.tinder.domain.typingindicator.TypingIndicatorConfig;
import com.tinder.domain.typingindicator.TypingIndicatorConfig.Config;
import com.tinder.domain.typingindicator.TypingIndicatorConfig.NoConfig;
import com.tinder.typingindicator.model.C15326a;
import com.tinder.typingindicator.repository.TypingIndicatorRepository;
import io.reactivex.C3957b;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/typingindicator/usecase/ObserveTypingHeartbeat;", "Lcom/tinder/domain/common/reactivex/usecase/FlowableResultUseCase;", "Lcom/tinder/typingindicator/model/Heartbeat;", "typingIndicatorRepository", "Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;", "(Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;)V", "execute", "Lio/reactivex/Flowable;", "heartbeatFromConfig", "typingIndicatorConfig", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig;", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.k */
public final class C17181k implements FlowableResultUseCase<C15326a> {
    /* renamed from: a */
    private final TypingIndicatorRepository f52724a;

    @Inject
    public C17181k(@NotNull TypingIndicatorRepository typingIndicatorRepository) {
        C2668g.b(typingIndicatorRepository, "typingIndicatorRepository");
        this.f52724a = typingIndicatorRepository;
    }

    @NotNull
    public C3957b<C15326a> execute() {
        C3957b<C15326a> i = this.f52724a.observeConfig().i(new C17182l(new ObserveTypingHeartbeat$execute$1(this)));
        C2668g.a(i, "typingIndicatorRepositor…ap(::heartbeatFromConfig)");
        return i;
    }

    /* renamed from: a */
    private final C3957b<C15326a> m63051a(TypingIndicatorConfig typingIndicatorConfig) {
        if (typingIndicatorConfig instanceof Config) {
            typingIndicatorConfig = C3957b.a(new C15326a(((Config) typingIndicatorConfig).getHeartbeat(), TimeUnit.MILLISECONDS));
            C2668g.a(typingIndicatorConfig, "Flowable.just(\n         …      )\n                )");
            return typingIndicatorConfig;
        } else if ((typingIndicatorConfig instanceof NoConfig) != null) {
            typingIndicatorConfig = C3957b.b();
            C2668g.a(typingIndicatorConfig, "Flowable.empty()");
            return typingIndicatorConfig;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
