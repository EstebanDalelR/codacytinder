package com.tinder.scarlet.internal.servicemethod;

import com.tinder.scarlet.C14788b;
import io.reactivex.C3958c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "", "p1", "Lcom/tinder/scarlet/Event;", "Lkotlin/ParameterName;", "name", "event", "invoke"}, k = 3, mv = {1, 1, 9})
final class ServiceMethod$Receive$execute$stream$2 extends FunctionReference implements Function1<C14788b, C3958c<? extends Object>> {
    ServiceMethod$Receive$execute$stream$2(C14809a c14809a) {
        super(1, c14809a);
    }

    public final String getName() {
        return "mapToData";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C14809a.class);
    }

    public final String getSignature() {
        return "mapToData(Lcom/tinder/scarlet/Event;)Lio/reactivex/Maybe;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68106a((C14788b) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3958c<? extends Object> m68106a(@NotNull C14788b c14788b) {
        C2668g.b(c14788b, "p1");
        return ((C14809a) this.receiver).mo12255a(c14788b);
    }
}
