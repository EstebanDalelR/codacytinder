package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SpecialTypesKt {
    @Nullable
    public static final AbbreviatedType getAbbreviatedType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.unwrap();
        if (!(kotlinType instanceof AbbreviatedType)) {
            kotlinType = null;
        }
        return (AbbreviatedType) kotlinType;
    }

    @Nullable
    public static final SimpleType getAbbreviation(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = getAbbreviatedType(kotlinType);
        return kotlinType != null ? kotlinType.getAbbreviation() : null;
    }

    @NotNull
    public static final SimpleType withAbbreviation(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        C2668g.b(simpleType, "$receiver");
        C2668g.b(simpleType2, "abbreviatedType");
        if (KotlinTypeKt.isError(simpleType)) {
            return simpleType;
        }
        return new AbbreviatedType(simpleType, simpleType2);
    }

    public static final boolean isDefinitelyNotNullType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return kotlinType.unwrap() instanceof DefinitelyNotNullType;
    }

    @NotNull
    public static final SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull(@NotNull SimpleType simpleType) {
        C2668g.b(simpleType, "$receiver");
        DefinitelyNotNullType makeDefinitelyNotNull$descriptors = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$descriptors(simpleType);
        return makeDefinitelyNotNull$descriptors != null ? makeDefinitelyNotNull$descriptors : simpleType.makeNullableAsSpecified(false);
    }

    @NotNull
    public static final UnwrappedType makeDefinitelyNotNullOrNotNull(@NotNull UnwrappedType unwrappedType) {
        C2668g.b(unwrappedType, "$receiver");
        DefinitelyNotNullType makeDefinitelyNotNull$descriptors = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$descriptors(unwrappedType);
        return makeDefinitelyNotNull$descriptors != null ? makeDefinitelyNotNull$descriptors : unwrappedType.makeNullableAsSpecified(false);
    }
}
