package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCapabilitiesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TypeCheckingProcedure {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final TypeCheckingProcedureCallbacks constraints;

    public enum EnrichedProjectionKind {
        IN,
        OUT,
        INV,
        STAR;

        @NotNull
        public static EnrichedProjectionKind fromVariance(@NotNull Variance variance) {
            switch (variance) {
                case INVARIANT:
                    return INV;
                case IN_VARIANCE:
                    return IN;
                case OUT_VARIANCE:
                    return OUT;
                default:
                    throw new IllegalStateException("Unknown variance");
            }
        }
    }

    @Nullable
    public static KotlinType findCorrespondingSupertype(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        return findCorrespondingSupertype(kotlinType, kotlinType2, new TypeCheckerProcedureCallbacksImpl());
    }

    @Nullable
    public static KotlinType findCorrespondingSupertype(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        return UtilsKt.findCorrespondingSupertype(kotlinType, kotlinType2, typeCheckingProcedureCallbacks);
    }

    @NotNull
    private static KotlinType getOutType(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeProjection typeProjection) {
        Object obj;
        if (typeProjection.getProjectionKind() != Variance.IN_VARIANCE) {
            if (typeParameterDescriptor.getVariance() != Variance.IN_VARIANCE) {
                obj = null;
                return obj == null ? DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType() : typeProjection.getType();
            }
        }
        obj = 1;
        if (obj == null) {
        }
    }

    @NotNull
    private static KotlinType getInType(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeProjection typeProjection) {
        Object obj;
        if (typeProjection.getProjectionKind() != Variance.OUT_VARIANCE) {
            if (typeParameterDescriptor.getVariance() != Variance.OUT_VARIANCE) {
                obj = null;
                return obj == null ? DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType() : typeProjection.getType();
            }
        }
        obj = 1;
        if (obj == null) {
        }
    }

    public TypeCheckingProcedure(TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        this.constraints = typeCheckingProcedureCallbacks;
    }

    public boolean equalTypes(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        boolean z = true;
        if (kotlinType == kotlinType2) {
            return true;
        }
        if (FlexibleTypesKt.isFlexible(kotlinType)) {
            if (!FlexibleTypesKt.isFlexible(kotlinType2)) {
                return heterogeneousEquivalence(kotlinType2, kotlinType);
            }
            if (KotlinTypeKt.isError(kotlinType) || KotlinTypeKt.isError(kotlinType2) || !isSubtypeOf(kotlinType, kotlinType2) || isSubtypeOf(kotlinType2, kotlinType) == null) {
                z = false;
            }
            return z;
        } else if (FlexibleTypesKt.isFlexible(kotlinType2)) {
            return heterogeneousEquivalence(kotlinType, kotlinType2);
        } else {
            if (kotlinType.isMarkedNullable() != kotlinType2.isMarkedNullable()) {
                return false;
            }
            if (kotlinType.isMarkedNullable()) {
                return this.constraints.assertEqualTypes(TypeUtils.makeNotNullable(kotlinType), TypeUtils.makeNotNullable(kotlinType2), this);
            }
            TypeConstructor constructor = kotlinType.getConstructor();
            TypeConstructor constructor2 = kotlinType2.getConstructor();
            if (!this.constraints.assertEqualTypeConstructors(constructor, constructor2)) {
                return false;
            }
            kotlinType = kotlinType.getArguments();
            kotlinType2 = kotlinType2.getArguments();
            if (kotlinType.size() != kotlinType2.size()) {
                return false;
            }
            for (int i = 0; i < kotlinType.size(); i++) {
                TypeProjection typeProjection = (TypeProjection) kotlinType.get(i);
                TypeProjection typeProjection2 = (TypeProjection) kotlinType2.get(i);
                if (!typeProjection.isStarProjection() || !typeProjection2.isStarProjection()) {
                    TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) constructor.getParameters().get(i);
                    TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) constructor2.getParameters().get(i);
                    if (!capture(typeProjection, typeProjection2, typeParameterDescriptor)) {
                        if (getEffectiveProjectionKind(typeParameterDescriptor, typeProjection) != getEffectiveProjectionKind(typeParameterDescriptor2, typeProjection2) || !this.constraints.assertEqualTypes(typeProjection.getType(), typeProjection2.getType(), this)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    protected boolean heterogeneousEquivalence(KotlinType kotlinType, KotlinType kotlinType2) {
        return (!isSubtypeOf(FlexibleTypesKt.asFlexibleType(kotlinType2).getLowerBound(), kotlinType) || isSubtypeOf(kotlinType, FlexibleTypesKt.asFlexibleType(kotlinType2).getUpperBound()) == null) ? null : true;
    }

    public static EnrichedProjectionKind getEffectiveProjectionKind(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeProjection typeProjection) {
        typeParameterDescriptor = typeParameterDescriptor.getVariance();
        typeProjection = typeProjection.getProjectionKind();
        if (typeProjection == Variance.INVARIANT) {
            TypeProjection typeProjection2 = typeProjection;
            typeProjection = typeParameterDescriptor;
            typeParameterDescriptor = typeProjection2;
        }
        if (typeParameterDescriptor == Variance.IN_VARIANCE && typeProjection == Variance.OUT_VARIANCE) {
            return EnrichedProjectionKind.STAR;
        }
        if (typeParameterDescriptor == Variance.OUT_VARIANCE && typeProjection == Variance.IN_VARIANCE) {
            return EnrichedProjectionKind.STAR;
        }
        return EnrichedProjectionKind.fromVariance(typeProjection);
    }

    public boolean isSubtypeOf(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        if (TypeCapabilitiesKt.sameTypeConstructors(kotlinType, kotlinType2)) {
            if (kotlinType.isMarkedNullable() != null) {
                if (kotlinType2.isMarkedNullable() == null) {
                    kotlinType = null;
                    return kotlinType;
                }
            }
            kotlinType = true;
            return kotlinType;
        }
        KotlinType subtypeRepresentative = TypeCapabilitiesKt.getSubtypeRepresentative(kotlinType);
        KotlinType supertypeRepresentative = TypeCapabilitiesKt.getSupertypeRepresentative(kotlinType2);
        if (subtypeRepresentative == kotlinType) {
            if (supertypeRepresentative == kotlinType2) {
                return isSubtypeOfForRepresentatives(kotlinType, kotlinType2);
            }
        }
        return isSubtypeOf(subtypeRepresentative, supertypeRepresentative);
    }

    private boolean isSubtypeOfForRepresentatives(KotlinType kotlinType, KotlinType kotlinType2) {
        if (!KotlinTypeKt.isError(kotlinType)) {
            if (!KotlinTypeKt.isError(kotlinType2)) {
                if (!kotlinType2.isMarkedNullable() && kotlinType.isMarkedNullable()) {
                    return false;
                }
                if (KotlinBuiltIns.isNothingOrNullableNothing(kotlinType)) {
                    return true;
                }
                KotlinType findCorrespondingSupertype = findCorrespondingSupertype(kotlinType, kotlinType2, this.constraints);
                if (findCorrespondingSupertype == null) {
                    return this.constraints.noCorrespondingSupertype(kotlinType, kotlinType2);
                }
                if (kotlinType2.isMarkedNullable() != null || findCorrespondingSupertype.isMarkedNullable() == null) {
                    return checkSubtypeForTheSameConstructor(findCorrespondingSupertype, kotlinType2);
                }
                return false;
            }
        }
        return true;
    }

    private boolean checkSubtypeForTheSameConstructor(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        TypeConstructor constructor = kotlinType.getConstructor();
        kotlinType = kotlinType.getArguments();
        kotlinType2 = kotlinType2.getArguments();
        if (kotlinType.size() != kotlinType2.size()) {
            return false;
        }
        List parameters = constructor.getParameters();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= parameters.size()) {
                return true;
            }
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) parameters.get(i);
            TypeProjection typeProjection = (TypeProjection) kotlinType2.get(i);
            TypeProjection typeProjection2 = (TypeProjection) kotlinType.get(i);
            if (!typeProjection.isStarProjection()) {
                if (!capture(typeProjection2, typeProjection, typeParameterDescriptor)) {
                    if (!KotlinTypeKt.isError(typeProjection2.getType())) {
                        if (!KotlinTypeKt.isError(typeProjection.getType())) {
                            z = false;
                        }
                    }
                    if (z || typeParameterDescriptor.getVariance() != Variance.INVARIANT || typeProjection2.getProjectionKind() != Variance.INVARIANT || typeProjection.getProjectionKind() != Variance.INVARIANT) {
                        KotlinType outType = getOutType(typeParameterDescriptor, typeProjection);
                        if (!this.constraints.assertSubtype(getOutType(typeParameterDescriptor, typeProjection2), outType, this)) {
                            return false;
                        }
                        outType = getInType(typeParameterDescriptor, typeProjection);
                        KotlinType inType = getInType(typeParameterDescriptor, typeProjection2);
                        if (!(typeProjection.getProjectionKind() == Variance.OUT_VARIANCE || this.constraints.assertSubtype(outType, inType, this))) {
                            return false;
                        }
                    } else if (!this.constraints.assertEqualTypes(typeProjection2.getType(), typeProjection.getType(), this)) {
                        return false;
                    }
                }
            }
            i++;
        }
    }

    private boolean capture(@NotNull TypeProjection typeProjection, @NotNull TypeProjection typeProjection2, @NotNull TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor.getVariance() == Variance.INVARIANT && typeProjection.getProjectionKind() != Variance.INVARIANT && typeProjection2.getProjectionKind() == Variance.INVARIANT) {
            return this.constraints.capture(typeProjection2.getType(), typeProjection);
        }
        return false;
    }
}
