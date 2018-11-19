package com.tinder.scarlet.websocket.okhttp;

import com.tinder.scarlet.WebSocket.C14786a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/tinder/scarlet/WebSocket$Event;", "Lkotlin/ParameterName;", "name", "event", "invoke"}, k = 3, mv = {1, 1, 9})
final class OkHttpWebSocket$open$2 extends FunctionReference implements Function1<C14786a, C15813i> {
    OkHttpWebSocket$open$2(OkHttpWebSocket okHttpWebSocket) {
        super(1, okHttpWebSocket);
    }

    public final String getName() {
        return "handleWebSocketEvent";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(OkHttpWebSocket.class);
    }

    public final String getSignature() {
        return "handleWebSocketEvent(Lcom/tinder/scarlet/WebSocket$Event;)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m68113a((C14786a) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m68113a(@NotNull C14786a c14786a) {
        C2668g.b(c14786a, "p1");
        ((OkHttpWebSocket) this.receiver).m61971a(c14786a);
    }
}
