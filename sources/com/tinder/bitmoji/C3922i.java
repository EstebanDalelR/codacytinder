package com.tinder.bitmoji;

import com.tinder.bitmoji.repository.BitmojiAuthRepository;
import com.tinder.bitmoji.repository.BitmojiImageUrlRepository;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/bitmoji/DisconnectBitmoji;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "bitmojiAuthRepository", "Lcom/tinder/bitmoji/repository/BitmojiAuthRepository;", "bitmojiImageUrlRepository", "Lcom/tinder/bitmoji/repository/BitmojiImageUrlRepository;", "(Lcom/tinder/bitmoji/repository/BitmojiAuthRepository;Lcom/tinder/bitmoji/repository/BitmojiImageUrlRepository;)V", "execute", "", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.i */
public final class C3922i implements SimpleVoidUseCase {
    /* renamed from: a */
    private final BitmojiAuthRepository f12222a;
    /* renamed from: b */
    private final BitmojiImageUrlRepository f12223b;

    @Inject
    public C3922i(@NotNull BitmojiAuthRepository bitmojiAuthRepository, @NotNull BitmojiImageUrlRepository bitmojiImageUrlRepository) {
        C2668g.m10309b(bitmojiAuthRepository, "bitmojiAuthRepository");
        C2668g.m10309b(bitmojiImageUrlRepository, "bitmojiImageUrlRepository");
        this.f12222a = bitmojiAuthRepository;
        this.f12223b = bitmojiImageUrlRepository;
    }

    public void execute() {
        C3956a a = C3956a.m15275a((Action) new i$a(this));
        Action action = i$b.f33860a;
        Function1 function1 = DisconnectBitmoji$execute$3.f45096a;
        if (function1 != null) {
            function1 = new C10379j(function1);
        }
        a.m15288a(action, (Consumer) function1);
    }
}
