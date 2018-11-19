package com.tinder.shimmy.shimmer;

import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "rollAngle", "invoke"}, k = 3, mv = {1, 1, 9})
final class ShimmerEngine$start$subscription$2 extends FunctionReference implements Function1<Float, C15813i> {
    ShimmerEngine$start$subscription$2(C14963d c14963d) {
        super(1, c14963d);
    }

    public final String getName() {
        return "drawShimmer";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C14963d.class);
    }

    public final String getSignature() {
        return "drawShimmer(F)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m68132a(((Number) obj).floatValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m68132a(float f) {
        ((C14963d) this.receiver).m56520b(f);
    }
}
