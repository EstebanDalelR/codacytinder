package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeCapabilitiesKt {
    public static final boolean isCustomTypeVariable(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.unwrap();
        if (!(kotlinType instanceof CustomTypeVariable)) {
            kotlinType = null;
        }
        CustomTypeVariable customTypeVariable = (CustomTypeVariable) kotlinType;
        return customTypeVariable != null ? customTypeVariable.isTypeVariable() : null;
    }

    @Nullable
    public static final CustomTypeVariable getCustomTypeVariable(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.unwrap();
        if (!(kotlinType instanceof CustomTypeVariable)) {
            kotlinType = null;
        }
        CustomTypeVariable customTypeVariable = (CustomTypeVariable) kotlinType;
        if (customTypeVariable == null || !customTypeVariable.isTypeVariable()) {
            return null;
        }
        return customTypeVariable;
    }

    @NotNull
    public static final KotlinType getSubtypeRepresentative(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof SubtypingRepresentatives)) {
            unwrap = null;
        }
        SubtypingRepresentatives subtypingRepresentatives = (SubtypingRepresentatives) unwrap;
        if (subtypingRepresentatives == null) {
            return kotlinType;
        }
        KotlinType subTypeRepresentative = subtypingRepresentatives.getSubTypeRepresentative();
        return subTypeRepresentative != null ? subTypeRepresentative : kotlinType;
    }

    @NotNull
    public static final KotlinType getSupertypeRepresentative(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof SubtypingRepresentatives)) {
            unwrap = null;
        }
        SubtypingRepresentatives subtypingRepresentatives = (SubtypingRepresentatives) unwrap;
        if (subtypingRepresentatives == null) {
            return kotlinType;
        }
        KotlinType superTypeRepresentative = subtypingRepresentatives.getSuperTypeRepresentative();
        return superTypeRepresentative != null ? superTypeRepresentative : kotlinType;
    }

    public static final boolean sameTypeConstructors(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        C2668g.b(kotlinType, "first");
        C2668g.b(kotlinType2, "second");
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof SubtypingRepresentatives)) {
            unwrap = null;
        }
        SubtypingRepresentatives subtypingRepresentatives = (SubtypingRepresentatives) unwrap;
        if (!(subtypingRepresentatives != null ? subtypingRepresentatives.sameTypeConstructor(kotlinType2) : false)) {
            kotlinType2 = kotlinType2.unwrap();
            if (!(kotlinType2 instanceof SubtypingRepresentatives)) {
                kotlinType2 = null;
            }
            SubtypingRepresentatives subtypingRepresentatives2 = (SubtypingRepresentatives) kotlinType2;
            if ((subtypingRepresentatives2 != null ? subtypingRepresentatives2.sameTypeConstructor(kotlinType) : null) == null) {
                return false;
            }
        }
        return true;
    }
}
