package com.tinder.reactions.p385c;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.message.ReactionSettingsRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/reactions/usecase/UpdateChatBubbleSoundState;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "", "reactionsSettingsRepository", "Lcom/tinder/domain/message/ReactionSettingsRepository;", "(Lcom/tinder/domain/message/ReactionSettingsRepository;)V", "execute", "Lrx/Completable;", "isSoundEnabled", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.c.j */
public final class C16289j implements CompletableUseCase<Boolean> {
    /* renamed from: a */
    private final ReactionSettingsRepository f50712a;

    @Inject
    public C16289j(@NotNull ReactionSettingsRepository reactionSettingsRepository) {
        C2668g.b(reactionSettingsRepository, "reactionsSettingsRepository");
        this.f50712a = reactionSettingsRepository;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m61479a(((Boolean) obj).booleanValue());
    }

    @NotNull
    /* renamed from: a */
    public Completable m61479a(boolean z) {
        return this.f50712a.updateChatBubbleSoundState(z);
    }
}
