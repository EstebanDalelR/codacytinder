package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

public interface SubtypingRepresentatives {
    @NotNull
    KotlinType getSubTypeRepresentative();

    @NotNull
    KotlinType getSuperTypeRepresentative();

    boolean sameTypeConstructor(@NotNull KotlinType kotlinType);
}
