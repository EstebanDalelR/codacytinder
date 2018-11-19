package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;

final class CapturedTypeApproximationKt$approximateCapturedTypes$1 extends Lambda implements Function1<KotlinType, KotlinType> {
    final /* synthetic */ KotlinType $type;

    CapturedTypeApproximationKt$approximateCapturedTypes$1(KotlinType kotlinType) {
        this.$type = kotlinType;
        super(1);
    }

    @NotNull
    public final KotlinType invoke(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return TypeUtils.makeNullableIfNeeded(kotlinType, this.$type.isMarkedNullable());
    }
}
