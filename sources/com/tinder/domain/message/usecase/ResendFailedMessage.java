package com.tinder.domain.message.usecase;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.message.SystemMessage;
import com.tinder.domain.message.TextMessage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/domain/message/usecase/ResendFailedMessage;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "(Lcom/tinder/domain/message/MessageRepository;)V", "execute", "Lrx/Completable;", "messageId", "withPendingStatus", "Lcom/tinder/domain/message/Message;", "message", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ResendFailedMessage implements CompletableUseCase<String> {
    private final MessageRepository messageRepository;

    @Inject
    public ResendFailedMessage(@NotNull MessageRepository messageRepository) {
        C2668g.b(messageRepository, "messageRepository");
        this.messageRepository = messageRepository;
    }

    @NotNull
    public Completable execute(@NotNull String str) {
        C2668g.b(str, "messageId");
        str = this.messageRepository.getMessage(str).c(new ResendFailedMessage$execute$1(this));
        C2668g.a(str, "messageRepository.getMes…essage)\n                }");
        return str;
    }

    private final Message withPendingStatus(Message message) {
        Message message2 = message;
        if (message2 instanceof TextMessage) {
            return TextMessage.copy$default((TextMessage) message2, null, null, null, null, null, null, null, false, false, DeliveryStatus.PENDING, 511, null);
        }
        if (message2 instanceof GifMessage) {
            return GifMessage.copy$default((GifMessage) message2, null, null, null, null, null, null, null, false, false, DeliveryStatus.PENDING, null, null, 3583, null);
        }
        if (message2 instanceof ReactionMessage) {
            return ReactionMessage.copy$default((ReactionMessage) message2, null, null, null, null, null, null, null, false, false, DeliveryStatus.PENDING, null, 1535, null);
        }
        if (message2 instanceof ActivityMessage) {
            return ActivityMessage.copy$default((ActivityMessage) message2, null, null, null, null, null, null, null, false, false, DeliveryStatus.PENDING, null, 1535, null);
        }
        if (message2 instanceof ImageMessage) {
            return ImageMessage.copy$default((ImageMessage) message2, null, null, null, null, null, null, null, false, false, DeliveryStatus.PENDING, null, 1535, null);
        }
        if (message2 instanceof SystemMessage) {
            throw new IllegalArgumentException("System messages are inherently inbound and should never have a Pending state");
        }
        throw new NoWhenBranchMatchedException();
    }
}
