package com.tinder.bitmoji;

import com.tinder.bitmoji.repository.BitmojiAuthRepository;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/bitmoji/ConnectBitmoji;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "bitmojiAuthRepository", "Lcom/tinder/bitmoji/repository/BitmojiAuthRepository;", "(Lcom/tinder/bitmoji/repository/BitmojiAuthRepository;)V", "execute", "", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.h */
public final class C10378h implements SimpleVoidUseCase {
    /* renamed from: a */
    private final BitmojiAuthRepository f33858a;

    @Inject
    public C10378h(@NotNull BitmojiAuthRepository bitmojiAuthRepository) {
        C2668g.b(bitmojiAuthRepository, "bitmojiAuthRepository");
        this.f33858a = bitmojiAuthRepository;
    }

    public void execute() {
        this.f33858a.connect();
    }
}
