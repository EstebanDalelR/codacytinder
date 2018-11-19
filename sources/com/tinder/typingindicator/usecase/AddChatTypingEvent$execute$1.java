package com.tinder.typingindicator.usecase;

import com.tinder.etl.event.dt;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "p1", "Lcom/tinder/etl/event/ChatTypingEvent;", "Lkotlin/ParameterName;", "name", "chatTypingEvent", "invoke"}, k = 3, mv = {1, 1, 10})
final class AddChatTypingEvent$execute$1 extends FunctionReference implements Function1<dt, C3956a> {
    AddChatTypingEvent$execute$1(C17172a c17172a) {
        super(1, c17172a);
    }

    public final String getName() {
        return "addEvent";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C17172a.class);
    }

    public final String getSignature() {
        return "addEvent(Lcom/tinder/etl/event/ChatTypingEvent;)Lio/reactivex/Completable;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68166a((dt) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m68166a(@NotNull dt dtVar) {
        C2668g.b(dtVar, "p1");
        return ((C17172a) this.receiver).m63044a(dtVar);
    }
}
