package kotlin.reflect.jvm.internal.impl.types;

import kotlin.C15819j;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeVariable {
    public static final Companion Companion = new Companion();
    @NotNull
    private final SimpleType original;

    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final DefinitelyNotNullType makeDefinitelyNotNull$descriptors(@NotNull UnwrappedType unwrappedType) {
            C2668g.b(unwrappedType, "type");
            if (unwrappedType instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) unwrappedType;
            }
            if (!makesSenseToBeDefinitelyNotNull(unwrappedType)) {
                return null;
            }
            if (unwrappedType instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrappedType;
                boolean a = C2668g.a(flexibleType.getLowerBound().getConstructor(), flexibleType.getUpperBound().getConstructor());
                if (C15819j.f49018a && !a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DefinitelyNotNullType for flexible type (");
                    stringBuilder.append(unwrappedType);
                    stringBuilder.append(") can be created only from type variable with the same constructor for bounds");
                    throw new AssertionError(stringBuilder.toString());
                }
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.lowerIfFlexible(unwrappedType));
        }

        public final boolean makesSenseToBeDefinitelyNotNull(@NotNull UnwrappedType unwrappedType) {
            C2668g.b(unwrappedType, "type");
            return (TypeUtilsKt.canHaveUndefinedNullability(unwrappedType) && NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType) == null) ? true : null;
        }
    }

    public boolean isMarkedNullable() {
        return false;
    }

    private DefinitelyNotNullType(SimpleType simpleType) {
        this.original = simpleType;
    }

    @NotNull
    public final SimpleType getOriginal() {
        return this.original;
    }

    @NotNull
    protected SimpleType getDelegate() {
        return this.original;
    }

    public boolean isTypeVariable() {
        if (!(getDelegate().getConstructor() instanceof NewTypeVariableConstructor)) {
            if (!(getDelegate().getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public KotlinType substitutionResult(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "replacement");
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull(kotlinType.unwrap());
    }

    @NotNull
    public DefinitelyNotNullType replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        return new DefinitelyNotNullType(getDelegate().replaceAnnotations(annotations));
    }

    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(z) : this;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(getDelegate());
        stringBuilder.append("!!");
        return stringBuilder.toString();
    }
}
