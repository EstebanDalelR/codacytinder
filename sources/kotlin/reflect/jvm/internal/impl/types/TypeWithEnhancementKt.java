package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeWithEnhancementKt {
    @Nullable
    public static final KotlinType getEnhancement(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return kotlinType instanceof TypeWithEnhancement ? ((TypeWithEnhancement) kotlinType).getEnhancement() : null;
    }

    @NotNull
    public static final KotlinType unwrapEnhancement(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        KotlinType enhancement = getEnhancement(kotlinType);
        return enhancement != null ? enhancement : kotlinType;
    }

    @NotNull
    public static final UnwrappedType inheritEnhancement(@NotNull UnwrappedType unwrappedType, @NotNull KotlinType kotlinType) {
        C2668g.b(unwrappedType, "$receiver");
        C2668g.b(kotlinType, "origin");
        return wrapEnhancement(unwrappedType, getEnhancement(kotlinType));
    }

    @NotNull
    public static final UnwrappedType wrapEnhancement(@NotNull UnwrappedType unwrappedType, @Nullable KotlinType kotlinType) {
        C2668g.b(unwrappedType, "$receiver");
        if (kotlinType == null) {
            return unwrappedType;
        }
        UnwrappedType simpleTypeWithEnhancement;
        if (unwrappedType instanceof SimpleType) {
            simpleTypeWithEnhancement = new SimpleTypeWithEnhancement((SimpleType) unwrappedType, kotlinType);
        } else if (unwrappedType instanceof FlexibleType) {
            simpleTypeWithEnhancement = new FlexibleTypeWithEnhancement((FlexibleType) unwrappedType, kotlinType);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return simpleTypeWithEnhancement;
    }
}
