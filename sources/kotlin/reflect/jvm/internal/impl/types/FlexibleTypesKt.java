package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class FlexibleTypesKt {
    public static final boolean isFlexible(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return kotlinType.unwrap() instanceof FlexibleType;
    }

    @NotNull
    public static final FlexibleType asFlexibleType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.unwrap();
        if (kotlinType != null) {
            return (FlexibleType) kotlinType;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
    }

    @NotNull
    public static final SimpleType lowerIfFlexible(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.unwrap();
        if (kotlinType instanceof FlexibleType) {
            return ((FlexibleType) kotlinType).getLowerBound();
        }
        if (kotlinType instanceof SimpleType) {
            return (SimpleType) kotlinType;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final SimpleType upperIfFlexible(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.unwrap();
        if (kotlinType instanceof FlexibleType) {
            return ((FlexibleType) kotlinType).getUpperBound();
        }
        if (kotlinType instanceof SimpleType) {
            return (SimpleType) kotlinType;
        }
        throw new NoWhenBranchMatchedException();
    }
}
