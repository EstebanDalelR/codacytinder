package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15819j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CapturedTypeApproximationKt {
    private static final TypeProjection toTypeProjection(@NotNull TypeArgument typeArgument) {
        boolean isConsistent = typeArgument.isConsistent();
        if (!C15819j.f49018a || isConsistent) {
            CapturedTypeApproximationKt$toTypeProjection$2 capturedTypeApproximationKt$toTypeProjection$2 = new CapturedTypeApproximationKt$toTypeProjection$2(typeArgument);
            if (C2668g.a(typeArgument.getInProjection(), typeArgument.getOutProjection())) {
                return new TypeProjectionImpl(typeArgument.getInProjection());
            }
            if (KotlinBuiltIns.isNothing(typeArgument.getInProjection()) && typeArgument.getTypeParameter().getVariance() != Variance.IN_VARIANCE) {
                return new TypeProjectionImpl(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.OUT_VARIANCE), typeArgument.getOutProjection());
            }
            if (KotlinBuiltIns.isNullableAny(typeArgument.getOutProjection())) {
                return new TypeProjectionImpl(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.IN_VARIANCE), typeArgument.getInProjection());
            }
            return new TypeProjectionImpl(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.OUT_VARIANCE), typeArgument.getOutProjection());
        }
        DescriptorRenderer withOptions = DescriptorRenderer.Companion.withOptions(C19147x8e300b6.INSTANCE);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Only consistent enhanced type projection can be converted to type projection, but ");
        stringBuilder.append('[');
        stringBuilder.append(withOptions.render(typeArgument.getTypeParameter()));
        stringBuilder.append(": <");
        stringBuilder.append(withOptions.renderType(typeArgument.getInProjection()));
        stringBuilder.append(", ");
        stringBuilder.append(withOptions.renderType(typeArgument.getOutProjection()));
        stringBuilder.append(">]");
        stringBuilder.append(" was found");
        throw new AssertionError(stringBuilder.toString());
    }

    private static final TypeArgument toTypeArgument(@NotNull TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        KotlinType type;
        SimpleType nullableAnyType;
        switch (TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection)) {
            case INVARIANT:
                type = typeProjection.getType();
                C2668g.a(type, "type");
                typeProjection = typeProjection.getType();
                C2668g.a(typeProjection, "type");
                return new TypeArgument(typeParameterDescriptor, type, typeProjection);
            case IN_VARIANCE:
                typeProjection = typeProjection.getType();
                C2668g.a(typeProjection, "type");
                nullableAnyType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
                C2668g.a(nullableAnyType, "typeParameter.builtIns.nullableAnyType");
                return new TypeArgument(typeParameterDescriptor, typeProjection, nullableAnyType);
            case OUT_VARIANCE:
                nullableAnyType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
                C2668g.a(nullableAnyType, "typeParameter.builtIns.nothingType");
                type = nullableAnyType;
                typeProjection = typeProjection.getType();
                C2668g.a(typeProjection, "type");
                return new TypeArgument(typeParameterDescriptor, type, typeProjection);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Nullable
    public static final TypeProjection approximateCapturedTypesIfNecessary(@Nullable TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        if (!TypeUtils.contains(type, C19146x21acc51c.INSTANCE)) {
            return typeProjection;
        }
        Variance projectionKind = typeProjection.getProjectionKind();
        if (projectionKind == Variance.OUT_VARIANCE) {
            C2668g.a(type, "type");
            return (TypeProjection) new TypeProjectionImpl(projectionKind, (KotlinType) approximateCapturedTypes(type).getUpper());
        } else if (!z) {
            return substituteCapturedTypesWithProjections(typeProjection);
        } else {
            C2668g.a(type, "type");
            return (TypeProjection) new TypeProjectionImpl(projectionKind, (KotlinType) approximateCapturedTypes(type).getLower());
        }
    }

    private static final TypeProjection substituteCapturedTypesWithProjections(TypeProjection typeProjection) {
        return TypeSubstitutor.create((TypeSubstitution) new C18532x12aaa596()).substituteWithoutApproximation(typeProjection);
    }

    @NotNull
    public static final ApproximationBounds<KotlinType> approximateCapturedTypes(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "type");
        if (FlexibleTypesKt.isFlexible(kotlinType)) {
            ApproximationBounds approximateCapturedTypes = approximateCapturedTypes(FlexibleTypesKt.lowerIfFlexible(kotlinType));
            ApproximationBounds approximateCapturedTypes2 = approximateCapturedTypes(FlexibleTypesKt.upperIfFlexible(kotlinType));
            return new ApproximationBounds(TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible((KotlinType) approximateCapturedTypes.getLower()), FlexibleTypesKt.upperIfFlexible((KotlinType) approximateCapturedTypes2.getLower())), kotlinType), TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible((KotlinType) approximateCapturedTypes.getUpper()), FlexibleTypesKt.upperIfFlexible((KotlinType) approximateCapturedTypes2.getUpper())), kotlinType));
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (!CapturedTypeConstructorKt.isCaptured(kotlinType)) {
            if (!kotlinType.getArguments().isEmpty()) {
                if (kotlinType.getArguments().size() == constructor.getParameters().size()) {
                    TypeArgument toTypeArgument;
                    Object obj;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterable arguments = kotlinType.getArguments();
                    List parameters = constructor.getParameters();
                    C2668g.a(parameters, "typeConstructor.parameters");
                    for (Pair pair : C19299w.m68815c(arguments, (Iterable) parameters)) {
                        TypeProjection typeProjection = (TypeProjection) pair.m59805c();
                        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.m59806d();
                        C2668g.a(typeParameterDescriptor, "typeParameter");
                        toTypeArgument = toTypeArgument(typeProjection, typeParameterDescriptor);
                        if (typeProjection.isStarProjection()) {
                            arrayList.add(toTypeArgument);
                            arrayList2.add(toTypeArgument);
                        } else {
                            ApproximationBounds approximateProjection = approximateProjection(toTypeArgument);
                            TypeArgument typeArgument = (TypeArgument) approximateProjection.component1();
                            toTypeArgument = (TypeArgument) approximateProjection.component2();
                            arrayList.add(typeArgument);
                            arrayList2.add(toTypeArgument);
                        }
                    }
                    Iterable<TypeArgument> iterable = arrayList;
                    Object obj2 = null;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        for (TypeArgument toTypeArgument2 : iterable) {
                            if ((toTypeArgument2.isConsistent() ^ 1) != 0) {
                                obj2 = 1;
                                break;
                            }
                        }
                    }
                    if (obj2 != null) {
                        SimpleType nothingType = TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
                        C2668g.a(nothingType, "type.builtIns.nothingType");
                        obj = nothingType;
                    } else {
                        obj = replaceTypeArguments(kotlinType, arrayList);
                    }
                    return new ApproximationBounds(obj, replaceTypeArguments(kotlinType, arrayList2));
                }
            }
            return new ApproximationBounds(kotlinType, kotlinType);
        } else if (constructor == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
        } else {
            ApproximationBounds<KotlinType> approximationBounds;
            TypeProjection typeProjection2 = ((CapturedTypeConstructor) constructor).getTypeProjection();
            CapturedTypeApproximationKt$approximateCapturedTypes$1 capturedTypeApproximationKt$approximateCapturedTypes$1 = new CapturedTypeApproximationKt$approximateCapturedTypes$1(kotlinType);
            KotlinType type = typeProjection2.getType();
            C2668g.a(type, "typeProjection.type");
            type = capturedTypeApproximationKt$approximateCapturedTypes$1.invoke(type);
            switch (typeProjection2.getProjectionKind()) {
                case IN_VARIANCE:
                    C2668g.a(type, "bound");
                    kotlinType = TypeUtilsKt.getBuiltIns(kotlinType).getNullableAnyType();
                    C2668g.a(kotlinType, "type.builtIns.nullableAnyType");
                    approximationBounds = new ApproximationBounds(type, kotlinType);
                    break;
                case OUT_VARIANCE:
                    kotlinType = TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
                    C2668g.a(kotlinType, "type.builtIns.nothingType");
                    approximationBounds = new ApproximationBounds(capturedTypeApproximationKt$approximateCapturedTypes$1.invoke(kotlinType), type);
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Only nontrivial projections should have been captured, not: ");
                    stringBuilder.append(typeProjection2);
                    throw ((Throwable) new AssertionError(stringBuilder.toString()));
            }
            return approximationBounds;
        }
    }

    private static final KotlinType replaceTypeArguments(@NotNull KotlinType kotlinType, List<TypeArgument> list) {
        Object obj = kotlinType.getArguments().size() == list.size() ? 1 : null;
        if (C15819j.f49018a && obj == null) {
            kotlinType = new StringBuilder();
            kotlinType.append("Incorrect type arguments ");
            kotlinType.append(list);
            throw ((Throwable) new AssertionError(kotlinType.toString()));
        }
        Iterable<TypeArgument> iterable = list;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (TypeArgument toTypeProjection : iterable) {
            arrayList.add(toTypeProjection(toTypeProjection));
        }
        return TypeSubstitutionKt.replace$default(kotlinType, (List) arrayList, null, 2, null);
    }

    private static final ApproximationBounds<TypeArgument> approximateProjection(TypeArgument typeArgument) {
        ApproximationBounds approximateCapturedTypes = approximateCapturedTypes(typeArgument.getInProjection());
        KotlinType kotlinType = (KotlinType) approximateCapturedTypes.component1();
        KotlinType kotlinType2 = (KotlinType) approximateCapturedTypes.component2();
        ApproximationBounds approximateCapturedTypes2 = approximateCapturedTypes(typeArgument.getOutProjection());
        return new ApproximationBounds(new TypeArgument(typeArgument.getTypeParameter(), kotlinType2, (KotlinType) approximateCapturedTypes2.component1()), new TypeArgument(typeArgument.getTypeParameter(), kotlinType, (KotlinType) approximateCapturedTypes2.component2()));
    }
}
