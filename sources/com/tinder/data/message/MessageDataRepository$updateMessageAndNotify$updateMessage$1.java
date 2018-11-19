package com.tinder.data.message;

import com.tinder.domain.message.Message;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lrx/Completable;", "p1", "", "Lkotlin/ParameterName;", "name", "messageToBeUpdatedId", "p2", "Lcom/tinder/domain/message/Message;", "updatedMessage", "invoke"}, k = 3, mv = {1, 1, 10})
final class MessageDataRepository$updateMessageAndNotify$updateMessage$1 extends FunctionReference implements Function2<String, Message, Completable> {
    MessageDataRepository$updateMessageAndNotify$updateMessage$1(ag agVar) {
        super(2, agVar);
    }

    public final String getName() {
        return "updateOrDeleteMessageIfAlreadyExists";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(ag.class);
    }

    public final String getSignature() {
        return "updateOrDeleteMessageIfAlreadyExists(Ljava/lang/String;Lcom/tinder/domain/message/Message;)Lrx/Completable;";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m54353a((String) obj, (Message) obj2);
    }

    @NotNull
    /* renamed from: a */
    public final Completable m54353a(@NotNull String str, @NotNull Message message) {
        C2668g.b(str, "p1");
        C2668g.b(message, "p2");
        return ((ag) this.receiver).m37103a(str, message);
    }
}
