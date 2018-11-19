package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

public final class StrictEqualityTypeChecker {
    public static final StrictEqualityTypeChecker INSTANCE = new StrictEqualityTypeChecker();

    private StrictEqualityTypeChecker() {
    }

    public final boolean strictEqualTypes(@NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        C2668g.b(unwrappedType, "a");
        C2668g.b(unwrappedType2, "b");
        boolean z = true;
        if (unwrappedType == unwrappedType2) {
            return true;
        }
        if ((unwrappedType instanceof SimpleType) && (unwrappedType2 instanceof SimpleType)) {
            return strictEqualTypes((SimpleType) unwrappedType, (SimpleType) unwrappedType2);
        }
        if (!(unwrappedType instanceof FlexibleType) || !(unwrappedType2 instanceof FlexibleType)) {
            return false;
        }
        FlexibleType flexibleType = (FlexibleType) unwrappedType;
        FlexibleType flexibleType2 = (FlexibleType) unwrappedType2;
        if (!strictEqualTypes(flexibleType.getLowerBound(), flexibleType2.getLowerBound()) || strictEqualTypes(flexibleType.getUpperBound(), flexibleType2.getUpperBound()) == null) {
            z = false;
        }
        return z;
    }

    public final boolean strictEqualTypes(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        C2668g.b(simpleType, "a");
        C2668g.b(simpleType2, "b");
        if (simpleType.isMarkedNullable() == simpleType2.isMarkedNullable() && SpecialTypesKt.isDefinitelyNotNullType(simpleType) == SpecialTypesKt.isDefinitelyNotNullType(simpleType2) && (C2668g.a(simpleType.getConstructor(), simpleType2.getConstructor()) ^ 1) == 0) {
            if (simpleType.getArguments().size() == simpleType2.getArguments().size()) {
                if (simpleType.getArguments() == simpleType2.getArguments()) {
                    return true;
                }
                int size = simpleType.getArguments().size();
                for (int i = 0; i < size; i++) {
                    TypeProjection typeProjection = (TypeProjection) simpleType.getArguments().get(i);
                    TypeProjection typeProjection2 = (TypeProjection) simpleType2.getArguments().get(i);
                    if (typeProjection.isStarProjection() != typeProjection2.isStarProjection()) {
                        return false;
                    }
                    if (!typeProjection.isStarProjection() && (typeProjection.getProjectionKind() != typeProjection2.getProjectionKind() || !strictEqualTypes(typeProjection.getType().unwrap(), typeProjection2.getType().unwrap()))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
