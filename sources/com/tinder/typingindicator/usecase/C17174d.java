package com.tinder.typingindicator.usecase;

import com.tinder.domain.common.reactivex.usecase.MaybeResultUseCase;
import com.tinder.domain.typingindicator.TypingIndicatorConfig.Config;
import com.tinder.typingindicator.repository.TypingIndicatorRepository;
import io.reactivex.C3958c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/typingindicator/usecase/GetTypingIndicatorConfig;", "Lcom/tinder/domain/common/reactivex/usecase/MaybeResultUseCase;", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig$Config;", "typingIndicatorRepository", "Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;", "(Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;)V", "execute", "Lio/reactivex/Maybe;", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.d */
public final class C17174d implements MaybeResultUseCase<Config> {
    /* renamed from: a */
    private final TypingIndicatorRepository f52715a;

    @Inject
    public C17174d(@NotNull TypingIndicatorRepository typingIndicatorRepository) {
        C2668g.b(typingIndicatorRepository, "typingIndicatorRepository");
        this.f52715a = typingIndicatorRepository;
    }

    @NotNull
    public C3958c<Config> execute() {
        C3958c<Config> b = this.f52715a.observeConfig().e().b(Config.class);
        C2668g.a(b, "typingIndicatorRepositor…onfig.Config::class.java)");
        return b;
    }
}
