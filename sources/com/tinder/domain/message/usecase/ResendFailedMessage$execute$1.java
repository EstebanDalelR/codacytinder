package com.tinder.domain.message.usecase;

import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "message", "Lcom/tinder/domain/message/Message;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class ResendFailedMessage$execute$1<T, R> implements Func1<Message, Completable> {
    final /* synthetic */ ResendFailedMessage this$0;

    ResendFailedMessage$execute$1(ResendFailedMessage resendFailedMessage) {
        this.this$0 = resendFailedMessage;
    }

    @NotNull
    public final Completable call(Message message) {
        if ((message.getDeliveryStatus() == DeliveryStatus.FAILED ? 1 : null) == null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ResendFailedMessage resendFailedMessage = this.this$0;
        C2668g.a(message, "message");
        return this.this$0.messageRepository.createMessage(resendFailedMessage.withPendingStatus(message));
    }
}
