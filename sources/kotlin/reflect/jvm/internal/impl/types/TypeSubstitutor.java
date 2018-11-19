package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TypeSubstitutor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final TypeSubstitutor EMPTY = create(TypeSubstitution.EMPTY);
    @NotNull
    private final TypeSubstitution substitution;

    private static final class SubstitutionException extends Exception {
        public SubstitutionException(String str) {
            super(str);
        }
    }

    private enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$1 */
    static class C185301 implements Function1<FqName, Boolean> {
        C185301() {
        }

        public Boolean invoke(@NotNull FqName fqName) {
            return Boolean.valueOf(fqName.equals(KotlinBuiltIns.FQ_NAMES.unsafeVariance) ^ 1);
        }
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull TypeSubstitution typeSubstitution) {
        return new TypeSubstitutor(typeSubstitution);
    }

    @NotNull
    public static TypeSubstitutor createChainedSubstitutor(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
        return create(DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull KotlinType kotlinType) {
        return create(TypeConstructorSubstitution.create(kotlinType.getConstructor(), kotlinType.getArguments()));
    }

    protected TypeSubstitutor(@NotNull TypeSubstitution typeSubstitution) {
        this.substitution = typeSubstitution;
    }

    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    @NotNull
    public TypeSubstitution getSubstitution() {
        return this.substitution;
    }

    @NotNull
    public KotlinType safeSubstitute(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (isEmpty()) {
            return kotlinType;
        }
        try {
            return unsafeSubstitute(new TypeProjectionImpl(variance, kotlinType), null).getType();
        } catch (KotlinType kotlinType2) {
            return ErrorUtils.createErrorType(kotlinType2.getMessage());
        }
    }

    @Nullable
    public KotlinType substitute(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        kotlinType = substitute(new TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (kotlinType == null) {
            return null;
        }
        return kotlinType.getType();
    }

    @Nullable
    public TypeProjection substitute(@NotNull TypeProjection typeProjection) {
        typeProjection = substituteWithoutApproximation(typeProjection);
        if (this.substitution.approximateCapturedTypes() || this.substitution.approximateContravariantCapturedTypes()) {
            return CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(typeProjection, this.substitution.approximateContravariantCapturedTypes());
        }
        return typeProjection;
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.TypeProjection substituteWithoutApproximation(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeProjection r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.isEmpty();
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return r2;
    L_0x0007:
        r0 = 0;
        r2 = r1.unsafeSubstitute(r2, r0);	 Catch:{ SubstitutionException -> 0x000d }
        return r2;
    L_0x000d:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.substituteWithoutApproximation(kotlin.reflect.jvm.internal.impl.types.TypeProjection):kotlin.reflect.jvm.internal.impl.types.TypeProjection");
    }

    @NotNull
    private TypeProjection unsafeSubstitute(@NotNull TypeProjection typeProjection, int i) throws SubstitutionException {
        assertRecursionDepth(i, typeProjection, this.substitution);
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        if (type instanceof TypeWithEnhancement) {
            TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
            KotlinType origin = typeWithEnhancement.getOrigin();
            type = typeWithEnhancement.getEnhancement();
            i = unsafeSubstitute(new TypeProjectionImpl(typeProjection.getProjectionKind(), origin), i + 1);
            return new TypeProjectionImpl(i.getProjectionKind(), TypeWithEnhancementKt.wrapEnhancement(i.getType().unwrap(), substitute(type, typeProjection.getProjectionKind())));
        }
        if (!DynamicTypesKt.isDynamic(type)) {
            if (!(type.unwrap() instanceof RawType)) {
                TypeProjection typeProjection2 = this.substitution.get(type);
                Variance projectionKind = typeProjection.getProjectionKind();
                if (typeProjection2 == null && FlexibleTypesKt.isFlexible(type) && !TypeCapabilitiesKt.isCustomTypeVariable(type)) {
                    FlexibleType asFlexibleType = FlexibleTypesKt.asFlexibleType(type);
                    i++;
                    typeProjection2 = unsafeSubstitute(new TypeProjectionImpl(projectionKind, asFlexibleType.getLowerBound()), i);
                    i = unsafeSubstitute(new TypeProjectionImpl(projectionKind, asFlexibleType.getUpperBound()), i);
                    Variance projectionKind2 = typeProjection2.getProjectionKind();
                    if (typeProjection2.getType() == asFlexibleType.getLowerBound() && i.getType() == asFlexibleType.getUpperBound()) {
                        return typeProjection;
                    }
                    return new TypeProjectionImpl(projectionKind2, KotlinTypeFactory.flexibleType(TypeSubstitutionKt.asSimpleType(typeProjection2.getType()), TypeSubstitutionKt.asSimpleType(i.getType())));
                }
                if (!KotlinBuiltIns.isNothing(type)) {
                    if (!KotlinTypeKt.isError(type)) {
                        if (typeProjection2 == null) {
                            return substituteCompoundType(typeProjection, i);
                        }
                        typeProjection = conflictType(projectionKind, typeProjection2.getProjectionKind());
                        if (CapturedTypeConstructorKt.isCaptured(type) == 0) {
                            switch (typeProjection) {
                                case OUT_IN_IN_POSITION:
                                    throw new SubstitutionException("Out-projection in in-position");
                                case IN_IN_OUT_POSITION:
                                    return new TypeProjectionImpl(Variance.OUT_VARIANCE, type.getConstructor().getBuiltIns().getNullableAnyType());
                                default:
                                    break;
                            }
                        }
                        i = TypeCapabilitiesKt.getCustomTypeVariable(type);
                        if (typeProjection2.isStarProjection()) {
                            return typeProjection2;
                        }
                        if (i != 0) {
                            i = i.substitutionResult(typeProjection2.getType());
                        } else {
                            i = TypeUtils.makeNullableIfNeeded(typeProjection2.getType(), type.isMarkedNullable());
                        }
                        if (!type.getAnnotations().isEmpty()) {
                            Annotations filterOutUnsafeVariance = filterOutUnsafeVariance(this.substitution.filterAnnotations(type.getAnnotations()));
                            i = TypeUtilsKt.replaceAnnotations(i, new CompositeAnnotations(i.getAnnotations(), filterOutUnsafeVariance));
                        }
                        if (typeProjection == VarianceConflictType.NO_CONFLICT) {
                            projectionKind = combine(projectionKind, typeProjection2.getProjectionKind());
                        }
                        return new TypeProjectionImpl(projectionKind, i);
                    }
                }
                return typeProjection;
            }
        }
        return typeProjection;
    }

    @NotNull
    private static Annotations filterOutUnsafeVariance(@NotNull Annotations annotations) {
        if (annotations.hasAnnotation(KotlinBuiltIns.FQ_NAMES.unsafeVariance)) {
            return new FilteredAnnotations(annotations, new C185301());
        }
        return annotations;
    }

    private TypeProjection substituteCompoundType(TypeProjection typeProjection, int i) throws SubstitutionException {
        KotlinType type = typeProjection.getType();
        Variance projectionKind = typeProjection.getProjectionKind();
        if (type.getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        typeProjection = null;
        KotlinType abbreviation = SpecialTypesKt.getAbbreviation(type);
        if (abbreviation != null) {
            typeProjection = substitute(abbreviation, Variance.INVARIANT);
        }
        i = TypeSubstitutionKt.replace(type, substituteTypeArguments(type.getConstructor().getParameters(), type.getArguments(), i), this.substitution.filterAnnotations(type.getAnnotations()));
        if ((i instanceof SimpleType) && (typeProjection instanceof SimpleType)) {
            i = SpecialTypesKt.withAbbreviation((SimpleType) i, (SimpleType) typeProjection);
        }
        return new TypeProjectionImpl(projectionKind, i);
    }

    private List<TypeProjection> substituteTypeArguments(List<TypeParameterDescriptor> list, List<TypeProjection> list2, int i) throws SubstitutionException {
        List<TypeProjection> arrayList = new ArrayList(list.size());
        Object obj = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) list.get(i2);
            TypeProjection typeProjection = (TypeProjection) list2.get(i2);
            TypeProjection unsafeSubstitute = unsafeSubstitute(typeProjection, i + 1);
            switch (conflictType(typeParameterDescriptor.getVariance(), unsafeSubstitute.getProjectionKind())) {
                case OUT_IN_IN_POSITION:
                case IN_IN_OUT_POSITION:
                    unsafeSubstitute = TypeUtils.makeStarProjection(typeParameterDescriptor);
                    break;
                case NO_CONFLICT:
                    if (!(typeParameterDescriptor.getVariance() == Variance.INVARIANT || unsafeSubstitute.isStarProjection())) {
                        unsafeSubstitute = new TypeProjectionImpl(Variance.INVARIANT, unsafeSubstitute.getType());
                        break;
                    }
                default:
                    break;
            }
            if (unsafeSubstitute != typeProjection) {
                obj = 1;
            }
            arrayList.add(unsafeSubstitute);
        }
        return obj == null ? list2 : arrayList;
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance, @NotNull TypeProjection typeProjection) {
        if (typeProjection.isStarProjection()) {
            return Variance.OUT_VARIANCE;
        }
        return combine(variance, typeProjection.getProjectionKind());
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance, @NotNull Variance variance2) {
        if (variance == Variance.INVARIANT) {
            return variance2;
        }
        if (variance2 == Variance.INVARIANT) {
            return variance;
        }
        if (variance == variance2) {
            return variance2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Variance conflict: type parameter variance '");
        stringBuilder.append(variance);
        stringBuilder.append("' and ");
        stringBuilder.append("projection kind '");
        stringBuilder.append(variance2);
        stringBuilder.append("' cannot be combined");
        throw new AssertionError(stringBuilder.toString());
    }

    private static VarianceConflictType conflictType(Variance variance, Variance variance2) {
        if (variance == Variance.IN_VARIANCE && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        if (variance == Variance.OUT_VARIANCE && variance2 == Variance.IN_VARIANCE) {
            return VarianceConflictType.IN_IN_OUT_POSITION;
        }
        return VarianceConflictType.NO_CONFLICT;
    }

    private static void assertRecursionDepth(int i, TypeProjection typeProjection, TypeSubstitution typeSubstitution) {
        if (i > 100) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Recursion too deep. Most likely infinite loop while substituting ");
            stringBuilder.append(safeToString(typeProjection));
            stringBuilder.append("; substitution: ");
            stringBuilder.append(safeToString(typeSubstitution));
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private static String safeToString(Object obj) {
        try {
            return obj.toString();
        } catch (Object obj2) {
            if (ExceptionUtilsKt.isProcessCanceledException(obj2)) {
                RuntimeException runtimeException = (RuntimeException) obj2;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[Exception while computing toString(): ");
                stringBuilder.append(obj2);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        }
    }
}
