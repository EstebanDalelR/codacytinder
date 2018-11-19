package com.tinder.scarlet.utils;

import com.tinder.scarlet.Stream.Observer;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 1, 9})
final class FlowableStream$start$disposable$3 extends FunctionReference implements Function0<C15813i> {
    FlowableStream$start$disposable$3(Observer observer) {
        super(0, observer);
    }

    public final String getName() {
        return "onComplete";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(Observer.class);
    }

    public final String getSignature() {
        return "onComplete()V";
    }

    public /* synthetic */ Object invoke() {
        m68112a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m68112a() {
        ((Observer) this.receiver).onComplete();
    }
}
