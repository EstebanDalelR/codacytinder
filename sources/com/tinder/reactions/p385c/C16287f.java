package com.tinder.reactions.p385c;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.domain.common.usecase.ObservableResultUseCase;
import com.tinder.domain.message.ReactionSettingsRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/reactions/usecase/GetChatBubbleSoundState;", "Lcom/tinder/domain/common/usecase/ObservableResultUseCase;", "", "repository", "Lcom/tinder/domain/message/ReactionSettingsRepository;", "(Lcom/tinder/domain/message/ReactionSettingsRepository;)V", "execute", "Lrx/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.c.f */
public final class C16287f implements ObservableResultUseCase<Boolean> {
    /* renamed from: a */
    private final ReactionSettingsRepository f50709a;

    @Inject
    public C16287f(@NotNull ReactionSettingsRepository reactionSettingsRepository) {
        C2668g.b(reactionSettingsRepository, "repository");
        this.f50709a = reactionSettingsRepository;
    }

    @NotNull
    public Observable<Boolean> execute() {
        return this.f50709a.observeChatBubbleSoundState();
    }
}
