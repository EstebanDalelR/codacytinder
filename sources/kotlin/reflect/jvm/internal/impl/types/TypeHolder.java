package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TypeHolder<D extends TypeHolder<? extends D>> {
    @NotNull
    List<TypeHolderArgument<D>> getArguments();

    @Nullable
    Pair<D, D> getFlexibleBounds();

    @NotNull
    KotlinType getType();
}
