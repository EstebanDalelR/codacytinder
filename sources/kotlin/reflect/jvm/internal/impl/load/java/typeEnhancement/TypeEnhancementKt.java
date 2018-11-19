package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15819j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeEnhancementKt {
    private static final EnhancedTypeAnnotations ENHANCED_MUTABILITY_ANNOTATIONS;
    private static final EnhancedTypeAnnotations ENHANCED_NULLABILITY_ANNOTATIONS;

    @Nullable
    public static final KotlinType enhance(@NotNull KotlinType kotlinType, @NotNull Function1<? super Integer, JavaTypeQualifiers> function1) {
        C2668g.b(kotlinType, "$receiver");
        C2668g.b(function1, "qualifiers");
        return enhancePossiblyFlexible(kotlinType.unwrap(), function1, 0).getTypeIfChanged();
    }

    public static final boolean hasEnhancedNullability(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.getAnnotations();
        FqName fqName = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        C2668g.a(fqName, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        return kotlinType.findAnnotation(fqName) != null ? true : null;
    }

    private static final Result enhancePossiblyFlexible(@NotNull UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i) {
        KotlinType kotlinType = unwrappedType;
        boolean z = false;
        if (KotlinTypeKt.isError(kotlinType)) {
            return new Result(kotlinType, 1, false);
        }
        if (unwrappedType instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedType;
            SimpleResult enhanceInflexible = enhanceInflexible(flexibleType.getLowerBound(), function1, i, TypeComponentPosition.FLEXIBLE_LOWER);
            function1 = enhanceInflexible(flexibleType.getUpperBound(), function1, i, TypeComponentPosition.FLEXIBLE_UPPER);
            i = enhanceInflexible.getSubtreeSize() == function1.getSubtreeSize() ? 1 : 0;
            if (C15819j.f49018a && i == 0) {
                unwrappedType = new StringBuilder();
                unwrappedType.append("Different tree sizes of bounds: ");
                unwrappedType.append("lower = (");
                unwrappedType.append(flexibleType.getLowerBound());
                unwrappedType.append(", ");
                unwrappedType.append(enhanceInflexible.getSubtreeSize());
                unwrappedType.append("), ");
                unwrappedType.append("upper = (");
                unwrappedType.append(flexibleType.getUpperBound());
                unwrappedType.append(", ");
                unwrappedType.append(function1.getSubtreeSize());
                unwrappedType.append(')');
                throw ((Throwable) new AssertionError(unwrappedType.toString()));
            }
            if (!(enhanceInflexible.getWereChanges() == 0 && function1.getWereChanges() == 0)) {
                z = true;
            }
            i = TypeWithEnhancementKt.getEnhancement(enhanceInflexible.getType());
            if (i == 0) {
                i = TypeWithEnhancementKt.getEnhancement(function1.getType());
            }
            if (z) {
                if ((unwrappedType instanceof RawTypeImpl) != null) {
                    unwrappedType = new RawTypeImpl(enhanceInflexible.getType(), function1.getType());
                } else {
                    unwrappedType = KotlinTypeFactory.flexibleType(enhanceInflexible.getType(), function1.getType());
                }
                unwrappedType = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, i);
            }
            function1 = new Result(unwrappedType, enhanceInflexible.getSubtreeSize(), z);
        } else if (unwrappedType instanceof SimpleType) {
            function1 = enhanceInflexible((SimpleType) unwrappedType, function1, i, TypeComponentPosition.INFLEXIBLE);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return function1;
    }

    private static final SimpleResult enhanceInflexible(@NotNull SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, TypeComponentPosition typeComponentPosition) {
        SimpleType simpleType2 = simpleType;
        Function1<? super Integer, JavaTypeQualifiers> function12 = function1;
        TypeComponentPosition typeComponentPosition2 = typeComponentPosition;
        if (!shouldEnhance(typeComponentPosition) && simpleType.getArguments().isEmpty()) {
            return new SimpleResult(simpleType2, 1, false);
        }
        ClassifierDescriptor declarationDescriptor = simpleType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return new SimpleResult(simpleType2, 1, false);
        }
        Object obj;
        SimpleType simpleType3;
        UnwrappedType wrapEnhancement;
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) function12.invoke(Integer.valueOf(i));
        C2668g.a(declarationDescriptor, "originalClass");
        EnhancementResult enhanceMutability = enhanceMutability(declarationDescriptor, javaTypeQualifiers, typeComponentPosition2);
        ClassifierDescriptor classifierDescriptor = (ClassifierDescriptor) enhanceMutability.component1();
        Annotations component2 = enhanceMutability.component2();
        TypeConstructor typeConstructor = classifierDescriptor.getTypeConstructor();
        int i2 = i + 1;
        Object obj2 = component2 != null ? 1 : null;
        Iterable<TypeProjection> arguments = simpleType.getArguments();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) arguments, 10));
        int i3 = i2;
        i2 = 0;
        for (TypeProjection typeProjection : arguments) {
            Object makeStarProjection;
            int i4 = i2 + 1;
            if (typeProjection.isStarProjection()) {
                i3++;
                TypeConstructor typeConstructor2 = classifierDescriptor.getTypeConstructor();
                C2668g.a(typeConstructor2, "enhancedClassifier.typeConstructor");
                makeStarProjection = TypeUtils.makeStarProjection((TypeParameterDescriptor) typeConstructor2.getParameters().get(i2));
            } else {
                KotlinType type;
                Variance projectionKind;
                Result enhancePossiblyFlexible = enhancePossiblyFlexible(typeProjection.getType().unwrap(), function12, i3);
                if (obj2 == null) {
                    if (!enhancePossiblyFlexible.getWereChanges()) {
                        obj2 = null;
                        i3 += enhancePossiblyFlexible.getSubtreeSize();
                        type = enhancePossiblyFlexible.getType();
                        projectionKind = typeProjection.getProjectionKind();
                        C2668g.a(projectionKind, "arg.projectionKind");
                        C2668g.a(typeConstructor, "typeConstructor");
                        makeStarProjection = TypeUtilsKt.createProjection(type, projectionKind, (TypeParameterDescriptor) typeConstructor.getParameters().get(i2));
                    }
                }
                obj2 = 1;
                i3 += enhancePossiblyFlexible.getSubtreeSize();
                type = enhancePossiblyFlexible.getType();
                projectionKind = typeProjection.getProjectionKind();
                C2668g.a(projectionKind, "arg.projectionKind");
                C2668g.a(typeConstructor, "typeConstructor");
                makeStarProjection = TypeUtilsKt.createProjection(type, projectionKind, (TypeParameterDescriptor) typeConstructor.getParameters().get(i2));
            }
            arrayList.add(makeStarProjection);
            i2 = i4;
        }
        List list = (List) arrayList;
        EnhancementResult enhancedNullability = getEnhancedNullability(simpleType2, javaTypeQualifiers, typeComponentPosition2);
        boolean booleanValue = ((Boolean) enhancedNullability.component1()).booleanValue();
        Annotations component22 = enhancedNullability.component2();
        if (obj2 == null) {
            if (component22 == null) {
                obj = null;
                i3 -= i;
                if (obj == null) {
                    return new SimpleResult(simpleType2, i3, false);
                }
                Annotations compositeAnnotationsOrSingle = compositeAnnotationsOrSingle(C19299w.m68833h((Iterable) C17554o.m64199b((Object[]) new Annotations[]{simpleType.getAnnotations(), component2, component22})));
                C2668g.a(typeConstructor, "typeConstructor");
                simpleType3 = KotlinTypeFactory.simpleType(compositeAnnotationsOrSingle, typeConstructor, list, booleanValue);
                if (javaTypeQualifiers.isNotNullTypeParameter$descriptors_jvm()) {
                    simpleType3 = new NotNullTypeParameter(simpleType3);
                }
                Object obj3 = (component22 == null && javaTypeQualifiers.isNullabilityQualifierForWarning$descriptors_jvm()) ? 1 : null;
                wrapEnhancement = obj3 == null ? TypeWithEnhancementKt.wrapEnhancement(simpleType2, simpleType3) : simpleType3;
                if (wrapEnhancement == null) {
                    return new SimpleResult((SimpleType) wrapEnhancement, i3, true);
                }
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            }
        }
        obj = 1;
        i3 -= i;
        if (obj == null) {
            return new SimpleResult(simpleType2, i3, false);
        }
        Annotations compositeAnnotationsOrSingle2 = compositeAnnotationsOrSingle(C19299w.m68833h((Iterable) C17554o.m64199b((Object[]) new Annotations[]{simpleType.getAnnotations(), component2, component22})));
        C2668g.a(typeConstructor, "typeConstructor");
        simpleType3 = KotlinTypeFactory.simpleType(compositeAnnotationsOrSingle2, typeConstructor, list, booleanValue);
        if (javaTypeQualifiers.isNotNullTypeParameter$descriptors_jvm()) {
            simpleType3 = new NotNullTypeParameter(simpleType3);
        }
        if (component22 == null) {
        }
        if (obj3 == null) {
        }
        if (wrapEnhancement == null) {
            return new SimpleResult((SimpleType) wrapEnhancement, i3, true);
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }

    private static final Annotations compositeAnnotationsOrSingle(@NotNull List<? extends Annotations> list) {
        switch (list.size()) {
            case 0:
                throw new IllegalStateException("At least one Annotations object expected".toString());
            case 1:
                return (Annotations) C19299w.m68836j((List) list);
            default:
                return new CompositeAnnotations(C19299w.m68840l(list));
        }
    }

    private static final boolean shouldEnhance(@NotNull TypeComponentPosition typeComponentPosition) {
        return typeComponentPosition != TypeComponentPosition.INFLEXIBLE ? true : null;
    }

    private static final <T> EnhancementResult<T> noChange(T t) {
        return new EnhancementResult(t, null);
    }

    private static final <T> EnhancementResult<T> enhancedNullability(T t) {
        return new EnhancementResult(t, ENHANCED_NULLABILITY_ANNOTATIONS);
    }

    private static final <T> EnhancementResult<T> enhancedMutability(T t) {
        return new EnhancementResult(t, ENHANCED_MUTABILITY_ANNOTATIONS);
    }

    private static final EnhancementResult<ClassifierDescriptor> enhanceMutability(@NotNull ClassifierDescriptor classifierDescriptor, JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        if (!shouldEnhance(typeComponentPosition)) {
            return noChange(classifierDescriptor);
        }
        if (!(classifierDescriptor instanceof ClassDescriptor)) {
            return noChange(classifierDescriptor);
        }
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        javaTypeQualifiers = javaTypeQualifiers.getMutability();
        if (javaTypeQualifiers != null) {
            ClassDescriptor classDescriptor;
            switch (javaTypeQualifiers) {
                case READ_ONLY:
                    if (typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
                        classDescriptor = (ClassDescriptor) classifierDescriptor;
                        if (javaToKotlinClassMap.isMutable(classDescriptor) != null) {
                            return enhancedMutability(javaToKotlinClassMap.convertMutableToReadOnly(classDescriptor));
                        }
                    }
                    break;
                case MUTABLE:
                    if (typeComponentPosition == TypeComponentPosition.FLEXIBLE_UPPER) {
                        classDescriptor = (ClassDescriptor) classifierDescriptor;
                        if (javaToKotlinClassMap.isReadOnly(classDescriptor) != null) {
                            return enhancedMutability(javaToKotlinClassMap.convertReadOnlyToMutable(classDescriptor));
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return noChange(classifierDescriptor);
    }

    private static final EnhancementResult<Boolean> getEnhancedNullability(@NotNull KotlinType kotlinType, JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        if (shouldEnhance(typeComponentPosition) == null) {
            return noChange(Boolean.valueOf(kotlinType.isMarkedNullable()));
        }
        javaTypeQualifiers = javaTypeQualifiers.getNullability();
        if (javaTypeQualifiers != null) {
            switch (javaTypeQualifiers) {
                case NULLABLE:
                    kotlinType = enhancedNullability(Boolean.valueOf(true));
                    break;
                case NOT_NULL:
                    kotlinType = enhancedNullability(Boolean.valueOf(null));
                    break;
                default:
                    break;
            }
        }
        kotlinType = noChange(Boolean.valueOf(kotlinType.isMarkedNullable()));
        return kotlinType;
    }

    static {
        FqName fqName = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        C2668g.a(fqName, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        ENHANCED_NULLABILITY_ANNOTATIONS = new EnhancedTypeAnnotations(fqName);
        fqName = JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION;
        C2668g.a(fqName, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
        ENHANCED_MUTABILITY_ANNOTATIONS = new EnhancedTypeAnnotations(fqName);
    }
}
