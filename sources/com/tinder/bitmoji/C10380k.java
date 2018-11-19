package com.tinder.bitmoji;

import com.tinder.bitmoji.repository.BitmojiAuthRepository;
import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/bitmoji/ObserveBitmojiAuthStatus;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "Lcom/tinder/bitmoji/BitmojiAuthStatus;", "bitmojiAuthRepository", "Lcom/tinder/bitmoji/repository/BitmojiAuthRepository;", "(Lcom/tinder/bitmoji/repository/BitmojiAuthRepository;)V", "execute", "Lio/reactivex/Observable;", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.k */
public final class C10380k implements ObservableResultUseCase<BitmojiAuthStatus> {
    /* renamed from: a */
    private final BitmojiAuthRepository f33862a;

    @Inject
    public C10380k(@NotNull BitmojiAuthRepository bitmojiAuthRepository) {
        C2668g.b(bitmojiAuthRepository, "bitmojiAuthRepository");
        this.f33862a = bitmojiAuthRepository;
    }

    @NotNull
    public C3959e<BitmojiAuthStatus> execute() {
        return this.f33862a.observeBitmojiAuthStatus();
    }
}
