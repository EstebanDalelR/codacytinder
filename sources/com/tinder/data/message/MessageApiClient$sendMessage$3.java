package com.tinder.data.message;

import com.tinder.api.model.common.ApiMessage;
import com.tinder.domain.message.Message;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/Message;", "p1", "Lcom/tinder/api/model/common/ApiMessage;", "Lkotlin/ParameterName;", "name", "apiMessage", "invoke"}, k = 3, mv = {1, 1, 10})
final class MessageApiClient$sendMessage$3 extends FunctionReference implements Function1<ApiMessage, Message> {
    MessageApiClient$sendMessage$3(C10839m c10839m) {
        super(1, c10839m);
    }

    public final String getName() {
        return "fromApi";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10839m.class);
    }

    public final String getSignature() {
        return "fromApi(Lcom/tinder/api/model/common/ApiMessage;)Lcom/tinder/domain/message/Message;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54352a((ApiMessage) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Message m54352a(@NotNull ApiMessage apiMessage) {
        C2668g.b(apiMessage, "p1");
        return ((C10839m) this.receiver).m43301a(apiMessage);
    }
}
