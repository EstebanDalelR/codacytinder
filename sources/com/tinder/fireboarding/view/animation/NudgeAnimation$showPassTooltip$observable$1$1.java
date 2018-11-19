package com.tinder.fireboarding.view.animation;

import io.reactivex.ObservableEmitter;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class NudgeAnimation$showPassTooltip$observable$1$1 extends FunctionReference implements Function0<C15813i> {
    NudgeAnimation$showPassTooltip$observable$1$1(ObservableEmitter observableEmitter) {
        super(0, observableEmitter);
    }

    public final String getName() {
        return "onComplete";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(ObservableEmitter.class);
    }

    public final String getSignature() {
        return "onComplete()V";
    }

    public /* synthetic */ Object invoke() {
        m54421a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m54421a() {
        ((ObservableEmitter) this.receiver).onComplete();
    }
}
