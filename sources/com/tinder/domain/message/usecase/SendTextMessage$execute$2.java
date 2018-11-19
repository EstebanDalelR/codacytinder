package com.tinder.domain.message.usecase;

import com.tinder.domain.message.Message;
import com.tinder.domain.message.MessageRepository;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lrx/Completable;", "p1", "Lcom/tinder/domain/message/Message;", "Lkotlin/ParameterName;", "name", "message", "invoke"}, k = 3, mv = {1, 1, 10})
final class SendTextMessage$execute$2 extends FunctionReference implements Function1<Message, Completable> {
    SendTextMessage$execute$2(MessageRepository messageRepository) {
        super(1, messageRepository);
    }

    public final String getName() {
        return "createMessage";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(MessageRepository.class);
    }

    public final String getSignature() {
        return "createMessage(Lcom/tinder/domain/message/Message;)Lrx/Completable;";
    }

    @NotNull
    public final Completable invoke(@NotNull Message message) {
        C2668g.b(message, "p1");
        return ((MessageRepository) this.receiver).createMessage(message);
    }
}
