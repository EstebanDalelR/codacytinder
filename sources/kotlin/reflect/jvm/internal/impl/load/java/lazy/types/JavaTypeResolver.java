package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.leanplum.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15819j;
import kotlin.collections.C15807n;
import kotlin.collections.C15808y;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class JavaTypeResolver {
    /* renamed from: c */
    private final LazyJavaResolverContext f49039c;
    private final TypeParameterResolver typeParameterResolver;

    public JavaTypeResolver(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        C2668g.b(lazyJavaResolverContext, "c");
        C2668g.b(typeParameterResolver, "typeParameterResolver");
        this.f49039c = lazyJavaResolverContext;
        this.typeParameterResolver = typeParameterResolver;
    }

    @NotNull
    public final KotlinType transformJavaType(@NotNull JavaType javaType, @NotNull JavaTypeAttributes javaTypeAttributes) {
        C2668g.b(javaType, "javaType");
        C2668g.b(javaTypeAttributes, "attr");
        if (javaType instanceof JavaPrimitiveType) {
            javaType = ((JavaPrimitiveType) javaType).getType();
            if (javaType != null) {
                javaType = this.f49039c.getModule().getBuiltIns().getPrimitiveKotlinType(javaType);
            } else {
                javaType = this.f49039c.getModule().getBuiltIns().getUnitType();
            }
            C2668g.a(javaType, "if (primitiveType != nul….module.builtIns.unitType");
            return (KotlinType) javaType;
        } else if (javaType instanceof JavaClassifierType) {
            return transformJavaClassifierType((JavaClassifierType) javaType, javaTypeAttributes);
        } else {
            if (javaType instanceof JavaArrayType) {
                return transformArrayType$default(this, (JavaArrayType) javaType, javaTypeAttributes, false, 4, null);
            }
            if (javaType instanceof JavaWildcardType) {
                javaType = ((JavaWildcardType) javaType).getBound();
                if (javaType != null) {
                    javaType = transformJavaType(javaType, javaTypeAttributes);
                    if (javaType != null) {
                        return javaType;
                    }
                }
                javaType = this.f49039c.getModule().getBuiltIns().getDefaultBound();
                C2668g.a(javaType, "c.module.builtIns.defaultBound");
                return (KotlinType) javaType;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported type: ");
            stringBuilder.append(javaType);
            throw ((Throwable) new UnsupportedOperationException(stringBuilder.toString()));
        }
    }

    @NotNull
    public static /* synthetic */ KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z);
    }

    @NotNull
    public final KotlinType transformArrayType(@NotNull JavaArrayType javaArrayType, @NotNull JavaTypeAttributes javaTypeAttributes, boolean z) {
        C2668g.b(javaArrayType, "arrayType");
        C2668g.b(javaTypeAttributes, "attr");
        javaArrayType = javaArrayType.getComponentType();
        JavaPrimitiveType javaPrimitiveType = (JavaPrimitiveType) (!(javaArrayType instanceof JavaPrimitiveType) ? null : javaArrayType);
        PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        if (type != null) {
            javaArrayType = this.f49039c.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type);
            if (javaTypeAttributes.isForAnnotationParameter() != null) {
                C2668g.a(javaArrayType, "jetType");
                javaArrayType = (KotlinType) javaArrayType;
            } else {
                C2668g.a(javaArrayType, "jetType");
                javaArrayType = KotlinTypeFactory.flexibleType(javaArrayType, javaArrayType.makeNullableAsSpecified(true));
            }
            return javaArrayType;
        }
        javaArrayType = transformJavaType(javaArrayType, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, javaTypeAttributes.isForAnnotationParameter(), null, 2, null));
        if (javaTypeAttributes.isForAnnotationParameter() != null) {
            javaArrayType = this.f49039c.getModule().getBuiltIns().getArrayType(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, javaArrayType);
            C2668g.a(javaArrayType, "c.module.builtIns.getArr…ctionKind, componentType)");
            return (KotlinType) javaArrayType;
        }
        javaTypeAttributes = this.f49039c.getModule().getBuiltIns().getArrayType(Variance.INVARIANT, javaArrayType);
        C2668g.a(javaTypeAttributes, "c.module.builtIns.getArr…INVARIANT, componentType)");
        return KotlinTypeFactory.flexibleType(javaTypeAttributes, this.f49039c.getModule().getBuiltIns().getArrayType(Variance.OUT_VARIANCE, javaArrayType).makeNullableAsSpecified(true));
    }

    private final KotlinType transformJavaClassifierType(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        JavaTypeResolver$transformJavaClassifierType$1 javaTypeResolver$transformJavaClassifierType$1 = new JavaTypeResolver$transformJavaClassifierType$1(javaClassifierType);
        Object obj = (javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? null : 1;
        boolean isRaw = javaClassifierType.isRaw();
        if (isRaw || obj != null) {
            SimpleType computeSimpleJavaClassifierType = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
            if (computeSimpleJavaClassifierType != null) {
                javaClassifierType = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), computeSimpleJavaClassifierType);
                if (javaClassifierType != null) {
                    if (isRaw) {
                        javaTypeAttributes = (KotlinType) new RawTypeImpl(computeSimpleJavaClassifierType, javaClassifierType);
                    } else {
                        javaTypeAttributes = KotlinTypeFactory.flexibleType(computeSimpleJavaClassifierType, javaClassifierType);
                    }
                    return javaTypeAttributes;
                }
                javaClassifierType = javaTypeResolver$transformJavaClassifierType$1.invoke();
                C2668g.a(javaClassifierType, "errorType()");
                return (KotlinType) javaClassifierType;
            }
            javaClassifierType = javaTypeResolver$transformJavaClassifierType$1.invoke();
            C2668g.a(javaClassifierType, "errorType()");
            return (KotlinType) javaClassifierType;
        }
        javaClassifierType = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes, null);
        if (javaClassifierType == null) {
            javaClassifierType = javaTypeResolver$transformJavaClassifierType$1.invoke();
            C2668g.a(javaClassifierType, "errorType()");
        }
        return (KotlinType) javaClassifierType;
    }

    private final SimpleType computeSimpleJavaClassifierType(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        Annotations annotations;
        TypeConstructor computeTypeConstructor;
        Object obj;
        boolean isNullable;
        if (simpleType != null) {
            annotations = simpleType.getAnnotations();
            if (annotations != null) {
                computeTypeConstructor = computeTypeConstructor(javaClassifierType, javaTypeAttributes);
                obj = null;
                if (computeTypeConstructor != null) {
                    return null;
                }
                isNullable = isNullable(javaTypeAttributes);
                if (simpleType != null) {
                    obj = simpleType.getConstructor();
                }
                if (C2668g.a(obj, computeTypeConstructor) || javaClassifierType.isRaw() || !isNullable) {
                    return KotlinTypeFactory.simpleType(annotations, computeTypeConstructor, computeArguments(javaClassifierType, javaTypeAttributes, computeTypeConstructor), isNullable);
                }
                return simpleType.makeNullableAsSpecified(true);
            }
        }
        annotations = new LazyJavaAnnotations(this.f49039c, javaClassifierType);
        computeTypeConstructor = computeTypeConstructor(javaClassifierType, javaTypeAttributes);
        obj = null;
        if (computeTypeConstructor != null) {
            return null;
        }
        isNullable = isNullable(javaTypeAttributes);
        if (simpleType != null) {
            obj = simpleType.getConstructor();
        }
        if (C2668g.a(obj, computeTypeConstructor)) {
        }
        return KotlinTypeFactory.simpleType(annotations, computeTypeConstructor, computeArguments(javaClassifierType, javaTypeAttributes, computeTypeConstructor), isNullable);
    }

    private final TypeConstructor computeTypeConstructor(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        JavaClassifier classifier = javaClassifierType.getClassifier();
        if (classifier == null) {
            return createNotFoundClass(javaClassifierType);
        }
        if (classifier instanceof JavaClass) {
            JavaClass javaClass = (JavaClass) classifier;
            FqName fqName = javaClass.getFqName();
            if (fqName != null) {
                javaTypeAttributes = mapKotlinClass(javaClassifierType, javaTypeAttributes, fqName);
                if (javaTypeAttributes == null) {
                    javaTypeAttributes = this.f49039c.getComponents().getModuleClassResolver().resolveClass(javaClass);
                }
                if (javaTypeAttributes != null) {
                    javaTypeAttributes = javaTypeAttributes.getTypeConstructor();
                    if (javaTypeAttributes != null) {
                    }
                }
                javaTypeAttributes = createNotFoundClass(javaClassifierType);
            } else {
                javaClassifierType = new StringBuilder();
                javaClassifierType.append("Class type should have a FQ name: ");
                javaClassifierType.append(classifier);
                throw ((Throwable) new AssertionError(javaClassifierType.toString()));
            }
        } else if ((classifier instanceof JavaTypeParameter) != null) {
            javaClassifierType = this.typeParameterResolver.resolveTypeParameter((JavaTypeParameter) classifier);
            javaTypeAttributes = javaClassifierType != null ? javaClassifierType.getTypeConstructor() : null;
        } else {
            javaTypeAttributes = new StringBuilder();
            javaTypeAttributes.append("Unknown classifier kind: ");
            javaTypeAttributes.append(classifier);
            throw ((Throwable) new IllegalStateException(javaTypeAttributes.toString()));
        }
        return javaTypeAttributes;
    }

    private final TypeConstructor createNotFoundClass(JavaClassifierType javaClassifierType) {
        javaClassifierType = ClassId.topLevel(new FqName(javaClassifierType.getClassifierQualifiedName()));
        NotFoundClasses notFoundClasses = this.f49039c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses();
        C2668g.a(javaClassifierType, "classId");
        javaClassifierType = notFoundClasses.getClass(javaClassifierType, C15807n.m59826a(Integer.valueOf(0))).getTypeConstructor();
        C2668g.a(javaClassifierType, "c.components.deserialize…istOf(0)).typeConstructor");
        return javaClassifierType;
    }

    private final ClassDescriptor mapKotlinClass(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, FqName fqName) {
        if (javaTypeAttributes.isForAnnotationParameter() && C2668g.a(fqName, JavaTypeResolverKt.JAVA_LANG_CLASS_FQ_NAME)) {
            return this.f49039c.getComponents().getReflectionTypes().getKClass();
        }
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        ClassDescriptor mapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(fqName, this.f49039c.getModule().getBuiltIns());
        if (mapJavaToKotlin != null) {
            return (javaToKotlinClassMap.isReadOnly(mapJavaToKotlin) && (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE || argumentsMakeSenseOnlyForMutableContainer(javaClassifierType, mapJavaToKotlin) != null)) ? javaToKotlinClassMap.convertReadOnlyToMutable(mapJavaToKotlin) : mapJavaToKotlin;
        } else {
            return null;
        }
    }

    private final boolean argumentsMakeSenseOnlyForMutableContainer(@NotNull JavaClassifierType javaClassifierType, ClassDescriptor classDescriptor) {
        boolean z = false;
        if (JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1.INSTANCE.invoke((JavaType) C19299w.m68834i((List) javaClassifierType.getTypeArguments())) == null) {
            return false;
        }
        javaClassifierType = JavaToKotlinClassMap.INSTANCE.convertReadOnlyToMutable(classDescriptor).getTypeConstructor();
        C2668g.a(javaClassifierType, "JavaToKotlinClassMap.con…         .typeConstructor");
        javaClassifierType = javaClassifierType.getParameters();
        C2668g.a(javaClassifierType, "JavaToKotlinClassMap.con…ypeConstructor.parameters");
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) C19299w.m68834i((List) javaClassifierType);
        if (typeParameterDescriptor != null) {
            javaClassifierType = typeParameterDescriptor.getVariance();
            if (javaClassifierType != null) {
                if (javaClassifierType != Variance.OUT_VARIANCE) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    private final List<TypeProjection> computeArguments(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor) {
        Object obj;
        List parameters;
        Iterable<TypeParameterDescriptor> iterable;
        Collection collection;
        JavaTypeAttributes withFlexibility;
        Collection collection2;
        int c;
        JavaType javaType;
        boolean isRaw = javaClassifierType.isRaw();
        if (!isRaw) {
            if (!javaClassifierType.getTypeArguments().isEmpty() || typeConstructor.getParameters().isEmpty()) {
                obj = null;
                parameters = typeConstructor.getParameters();
                if (obj != null) {
                    C2668g.a(parameters, "typeParameters");
                    iterable = parameters;
                    collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor : iterable) {
                        LazyWrappedType lazyWrappedType = new LazyWrappedType(this.f49039c.getStorageManager(), new JavaTypeResolver$computeArguments$$inlined$map$lambda$1(typeParameterDescriptor, this, javaTypeAttributes, typeConstructor, isRaw));
                        RawSubstitution rawSubstitution = RawSubstitution.INSTANCE;
                        C2668g.a(typeParameterDescriptor, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                        if (isRaw) {
                            withFlexibility = javaTypeAttributes.withFlexibility(JavaTypeFlexibility.INFLEXIBLE);
                        } else {
                            withFlexibility = javaTypeAttributes;
                        }
                        collection.add(rawSubstitution.computeProjection(typeParameterDescriptor, withFlexibility, lazyWrappedType));
                    }
                    return C19299w.m68840l((List) collection);
                } else if (parameters.size() == javaClassifierType.getTypeArguments().size()) {
                    C2668g.a(parameters, "typeParameters");
                    iterable = parameters;
                    collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor2 : iterable) {
                        C2668g.a(typeParameterDescriptor2, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                        collection.add(new TypeProjectionImpl(ErrorUtils.createErrorType(typeParameterDescriptor2.getName().asString())));
                    }
                    return C19299w.m68840l((List) collection);
                } else {
                    JavaClassifierType<C15808y> o = C19299w.m68843o(javaClassifierType.getTypeArguments());
                    collection2 = (Collection) new ArrayList(C18457p.m66906a((Iterable) o, 10));
                    for (C15808y c15808y : o) {
                        c = c15808y.m59830c();
                        javaType = (JavaType) c15808y.m59831d();
                        Object obj2 = c >= parameters.size() ? 1 : null;
                        if (C15819j.f49018a || obj2 != null) {
                            TypeParameterDescriptor typeParameterDescriptor3 = (TypeParameterDescriptor) parameters.get(c);
                            JavaTypeAttributes toAttributes$default = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null);
                            C2668g.a(typeParameterDescriptor3, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                            collection2.add(transformToTypeProjection(javaType, toAttributes$default, typeParameterDescriptor3));
                        } else {
                            javaClassifierType = new StringBuilder();
                            javaClassifierType.append("Argument index should be less then type parameters count, but ");
                            javaClassifierType.append(c);
                            javaClassifierType.append(" > ");
                            javaClassifierType.append(parameters.size());
                            throw ((Throwable) new AssertionError(javaClassifierType.toString()));
                        }
                    }
                    return C19299w.m68840l((List) collection2);
                }
            }
        }
        obj = 1;
        parameters = typeConstructor.getParameters();
        if (obj != null) {
            C2668g.a(parameters, "typeParameters");
            iterable = parameters;
            collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (TypeParameterDescriptor typeParameterDescriptor4 : iterable) {
                LazyWrappedType lazyWrappedType2 = new LazyWrappedType(this.f49039c.getStorageManager(), new JavaTypeResolver$computeArguments$$inlined$map$lambda$1(typeParameterDescriptor4, this, javaTypeAttributes, typeConstructor, isRaw));
                RawSubstitution rawSubstitution2 = RawSubstitution.INSTANCE;
                C2668g.a(typeParameterDescriptor4, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                if (isRaw) {
                    withFlexibility = javaTypeAttributes.withFlexibility(JavaTypeFlexibility.INFLEXIBLE);
                } else {
                    withFlexibility = javaTypeAttributes;
                }
                collection.add(rawSubstitution2.computeProjection(typeParameterDescriptor4, withFlexibility, lazyWrappedType2));
            }
            return C19299w.m68840l((List) collection);
        } else if (parameters.size() == javaClassifierType.getTypeArguments().size()) {
            JavaClassifierType<C15808y> o2 = C19299w.m68843o(javaClassifierType.getTypeArguments());
            collection2 = (Collection) new ArrayList(C18457p.m66906a((Iterable) o2, 10));
            for (C15808y c15808y2 : o2) {
                c = c15808y2.m59830c();
                javaType = (JavaType) c15808y2.m59831d();
                if (c >= parameters.size()) {
                }
                if (C15819j.f49018a) {
                }
                TypeParameterDescriptor typeParameterDescriptor32 = (TypeParameterDescriptor) parameters.get(c);
                JavaTypeAttributes toAttributes$default2 = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null);
                C2668g.a(typeParameterDescriptor32, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                collection2.add(transformToTypeProjection(javaType, toAttributes$default2, typeParameterDescriptor32));
            }
            return C19299w.m68840l((List) collection2);
        } else {
            C2668g.a(parameters, "typeParameters");
            iterable = parameters;
            collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (TypeParameterDescriptor typeParameterDescriptor22 : iterable) {
                C2668g.a(typeParameterDescriptor22, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                collection.add(new TypeProjectionImpl(ErrorUtils.createErrorType(typeParameterDescriptor22.getName().asString())));
            }
            return C19299w.m68840l((List) collection);
        }
    }

    private final TypeProjection transformToTypeProjection(JavaType javaType, JavaTypeAttributes javaTypeAttributes, TypeParameterDescriptor typeParameterDescriptor) {
        if (!(javaType instanceof JavaWildcardType)) {
            return (TypeProjection) new TypeProjectionImpl(Variance.INVARIANT, transformJavaType(javaType, javaTypeAttributes));
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        JavaType bound = javaWildcardType.getBound();
        javaType = javaWildcardType.isExtends() != null ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
        if (bound != null) {
            if (!isConflictingArgumentFor(javaType, typeParameterDescriptor)) {
                return TypeUtilsKt.createProjection(transformJavaType(bound, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null)), javaType, typeParameterDescriptor);
            }
        }
        return JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
    }

    private final boolean isConflictingArgumentFor(@NotNull Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        boolean z = false;
        if (typeParameterDescriptor.getVariance() == Variance.INVARIANT) {
            return false;
        }
        if (variance != typeParameterDescriptor.getVariance()) {
            z = true;
        }
        return z;
    }

    private final boolean isNullable(@NotNull JavaTypeAttributes javaTypeAttributes) {
        boolean z = false;
        if (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND) {
            return false;
        }
        if (!(javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE)) {
            z = true;
        }
        return z;
    }
}
