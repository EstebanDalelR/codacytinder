package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class UnsafeVarianceTypeSubstitution$prepareTopLevelType$2 extends Lambda implements Function1 {
    public static final UnsafeVarianceTypeSubstitution$prepareTopLevelType$2 INSTANCE = new UnsafeVarianceTypeSubstitution$prepareTopLevelType$2();

    UnsafeVarianceTypeSubstitution$prepareTopLevelType$2() {
        super(1);
    }

    @Nullable
    public final Void invoke(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        C2668g.b(typeParameterDescriptor, "it");
        return null;
    }
}
