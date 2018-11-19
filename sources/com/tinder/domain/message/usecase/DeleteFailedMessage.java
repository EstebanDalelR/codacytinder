package com.tinder.domain.message.usecase;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.message.MessageRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/message/usecase/DeleteFailedMessage;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "(Lcom/tinder/domain/message/MessageRepository;)V", "execute", "Lrx/Completable;", "messageId", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class DeleteFailedMessage implements CompletableUseCase<String> {
    private final MessageRepository messageRepository;

    @Inject
    public DeleteFailedMessage(@NotNull MessageRepository messageRepository) {
        C2668g.b(messageRepository, "messageRepository");
        this.messageRepository = messageRepository;
    }

    @NotNull
    public Completable execute(@NotNull String str) {
        C2668g.b(str, "messageId");
        return this.messageRepository.deleteFailedMessage(str);
    }
}
