package com.tinder.scarlet.utils;

import com.tinder.scarlet.Stream.Observer;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", "p1", "", "Lkotlin/ParameterName;", "name", "throwable", "invoke"}, k = 3, mv = {1, 1, 9})
final class FlowableStream$start$disposable$2 extends FunctionReference implements Function1<Throwable, C15813i> {
    FlowableStream$start$disposable$2(Observer observer) {
        super(1, observer);
    }

    public final String getName() {
        return "onError";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(Observer.class);
    }

    public final String getSignature() {
        return "onError(Ljava/lang/Throwable;)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m68111a((Throwable) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m68111a(@NotNull Throwable th) {
        C2668g.b(th, "p1");
        ((Observer) this.receiver).onError(th);
    }
}
