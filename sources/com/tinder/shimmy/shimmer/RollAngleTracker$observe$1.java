package com.tinder.shimmy.shimmer;

import com.tinder.shimmy.shimmer.C14959b.C14957b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "sensorValues", "invoke"}, k = 3, mv = {1, 1, 9})
final class RollAngleTracker$observe$1 extends FunctionReference implements Function1<float[], Float> {
    RollAngleTracker$observe$1(C14957b c14957b) {
        super(1, c14957b);
    }

    public final String getName() {
        return "findRollAngle";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C14957b.class);
    }

    public final String getSignature() {
        return "findRollAngle([F)F";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Float.valueOf(m68129a((float[]) obj));
    }

    /* renamed from: a */
    public final float m68129a(@NotNull float[] fArr) {
        C2668g.b(fArr, "p1");
        return ((C14957b) this.receiver).m56492a(fArr);
    }
}
