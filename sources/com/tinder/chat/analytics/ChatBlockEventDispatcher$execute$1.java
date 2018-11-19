package com.tinder.chat.analytics;

import com.tinder.etl.event.cw;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "p1", "Lcom/tinder/etl/event/ChatBlockEvent;", "Lkotlin/ParameterName;", "name", "chatBlockEvent", "invoke"}, k = 3, mv = {1, 1, 10})
final class ChatBlockEventDispatcher$execute$1 extends FunctionReference implements Function1<cw, C3956a> {
    ChatBlockEventDispatcher$execute$1(C10529d c10529d) {
        super(1, c10529d);
    }

    public final String getName() {
        return "addEvent";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10529d.class);
    }

    public final String getSignature() {
        return "addEvent(Lcom/tinder/etl/event/ChatBlockEvent;)Lio/reactivex/Completable;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54042a((cw) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m54042a(@NotNull cw cwVar) {
        C2668g.b(cwVar, "p1");
        return ((C10529d) this.receiver).m42611a(cwVar);
    }
}
