package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.C15813i;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

final class UnsafeVarianceTypeSubstitution$prepareTopLevelType$1 extends Lambda implements Function3<TypeParameterDescriptor, IndexedTypeHolder, Variance, C15813i> {
    final /* synthetic */ List $unsafeVariancePaths;

    UnsafeVarianceTypeSubstitution$prepareTopLevelType$1(List list) {
        this.$unsafeVariancePaths = list;
        super(3);
    }

    public final void invoke(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull IndexedTypeHolder indexedTypeHolder, @NotNull Variance variance) {
        C2668g.b(typeParameterDescriptor, "<anonymous parameter 0>");
        C2668g.b(indexedTypeHolder, "indexedTypeHolder");
        C2668g.b(variance, "<anonymous parameter 2>");
        this.$unsafeVariancePaths.add(indexedTypeHolder.getArgumentIndices());
    }
}
