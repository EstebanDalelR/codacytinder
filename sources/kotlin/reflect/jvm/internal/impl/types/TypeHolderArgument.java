package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TypeHolderArgument<D extends TypeHolder<? extends D>> {
    @NotNull
    D getHolder();

    @NotNull
    TypeProjection getProjection();

    @Nullable
    TypeParameterDescriptor getTypeParameter();
}
