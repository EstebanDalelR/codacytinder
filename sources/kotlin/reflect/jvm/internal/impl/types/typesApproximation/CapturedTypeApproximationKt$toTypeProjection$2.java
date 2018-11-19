package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

final class CapturedTypeApproximationKt$toTypeProjection$2 extends Lambda implements Function1<Variance, Variance> {
    final /* synthetic */ TypeArgument receiver$0;

    CapturedTypeApproximationKt$toTypeProjection$2(TypeArgument typeArgument) {
        this.receiver$0 = typeArgument;
        super(1);
    }

    @NotNull
    public final Variance invoke(@NotNull Variance variance) {
        C2668g.b(variance, "variance");
        return variance == this.receiver$0.getTypeParameter().getVariance() ? Variance.INVARIANT : variance;
    }
}
