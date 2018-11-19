package com.tinder.domain.message.usecase;

import com.tinder.domain.message.TextMessage;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/TextMessage;", "p1", "Lcom/tinder/domain/message/usecase/CommonMessageProperties;", "Lkotlin/ParameterName;", "name", "commonMessageProperties", "invoke"}, k = 3, mv = {1, 1, 10})
final class SendTextMessage$execute$1 extends FunctionReference implements Function1<CommonMessageProperties, TextMessage> {
    SendTextMessage$execute$1(SendTextMessage sendTextMessage) {
        super(1, sendTextMessage);
    }

    public final String getName() {
        return "createTextMessage";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(SendTextMessage.class);
    }

    public final String getSignature() {
        return "createTextMessage(Lcom/tinder/domain/message/usecase/CommonMessageProperties;)Lcom/tinder/domain/message/TextMessage;";
    }

    @NotNull
    public final TextMessage invoke(@NotNull CommonMessageProperties commonMessageProperties) {
        C2668g.b(commonMessageProperties, "p1");
        return ((SendTextMessage) this.receiver).createTextMessage(commonMessageProperties);
    }
}
