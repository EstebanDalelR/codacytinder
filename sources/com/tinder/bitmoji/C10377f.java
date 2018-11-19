package com.tinder.bitmoji;

import com.tinder.bitmoji.repository.BitmojiImageUrlRepository;
import com.tinder.domain.common.usecase.ResultUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/bitmoji/CheckUserBitmojiAvatarAvailable;", "Lcom/tinder/domain/common/usecase/ResultUseCase;", "", "bitmojiImageUrlRepository", "Lcom/tinder/bitmoji/repository/BitmojiImageUrlRepository;", "(Lcom/tinder/bitmoji/repository/BitmojiImageUrlRepository;)V", "execute", "()Ljava/lang/Boolean;", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.f */
public final class C10377f implements ResultUseCase<Boolean> {
    /* renamed from: a */
    private final BitmojiImageUrlRepository f33857a;

    @Inject
    public C10377f(@NotNull BitmojiImageUrlRepository bitmojiImageUrlRepository) {
        C2668g.b(bitmojiImageUrlRepository, "bitmojiImageUrlRepository");
        this.f33857a = bitmojiImageUrlRepository;
    }

    public /* synthetic */ Object execute() {
        return m42205a();
    }

    @NotNull
    /* renamed from: a */
    public Boolean m42205a() {
        return Boolean.valueOf(this.f33857a.isUserBitmojiAvatarAvailable());
    }
}
