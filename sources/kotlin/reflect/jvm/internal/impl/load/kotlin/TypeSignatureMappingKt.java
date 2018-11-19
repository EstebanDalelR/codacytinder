package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.C15813i;
import kotlin.C15819j;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap.PlatformMutabilityMapping;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeSignatureMappingKt {
    private static final String CONTINUATION_INTERNAL_NAME;

    private static final <T> T boxTypeIfNeeded(@NotNull JvmTypeFactory<T> jvmTypeFactory, T t, boolean z) {
        return z ? jvmTypeFactory.boxType(t) : t;
    }

    static {
        JvmClassName byClassId = JvmClassName.byClassId(ClassId.topLevel(DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME));
        C2668g.a(byClassId, "JvmClassName.byClassId(C…ATION_INTERFACE_FQ_NAME))");
        CONTINUATION_INTERNAL_NAME = byClassId.getInternalName();
    }

    @NotNull
    public static /* synthetic */ Object mapType$default(KotlinType kotlinType, JvmTypeFactory jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration typeMappingConfiguration, JvmDescriptorTypeWriter jvmDescriptorTypeWriter, Function3 function3, int i, Object obj) {
        if ((i & 32) != 0) {
            function3 = FunctionsKt.getDO_NOTHING_3();
        }
        return mapType(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
    }

    @NotNull
    public static final <T> T mapType(@NotNull KotlinType kotlinType, @NotNull JvmTypeFactory<T> jvmTypeFactory, @NotNull TypeMappingMode typeMappingMode, @NotNull TypeMappingConfiguration<? extends T> typeMappingConfiguration, @Nullable JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter, @NotNull Function3<? super KotlinType, ? super T, ? super TypeMappingMode, C15813i> function3) {
        C2668g.b(kotlinType, "kotlinType");
        C2668g.b(jvmTypeFactory, "factory");
        C2668g.b(typeMappingMode, "mode");
        C2668g.b(typeMappingConfiguration, "typeMappingConfiguration");
        C2668g.b(function3, "writeGenericType");
        if (FunctionTypesKt.isSuspendFunctionType(kotlinType)) {
            return mapType(SuspendFunctionTypesKt.transformSuspendFunctionToRuntimeFunctionType(kotlinType), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        Object mapBuiltInType = mapBuiltInType(kotlinType, jvmTypeFactory, typeMappingMode);
        if (mapBuiltInType != null) {
            jvmTypeFactory = boxTypeIfNeeded(jvmTypeFactory, mapBuiltInType, typeMappingMode.getNeedPrimitiveBoxing());
            function3.invoke(kotlinType, jvmTypeFactory, typeMappingMode);
            return jvmTypeFactory;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            kotlinType = ((IntersectionTypeConstructor) constructor).getSupertypes();
            C2668g.a(kotlinType, "constructor.supertypes");
            return mapType(TypeUtilsKt.replaceArgumentsWithStarProjections(typeMappingConfiguration.commonSupertype(kotlinType)), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
        }
        ClassifierDescriptor declarationDescriptor = constructor.getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            typeMappingMode = new StringBuilder();
            typeMappingMode.append("no descriptor for type constructor of ");
            typeMappingMode.append(kotlinType);
            throw ((Throwable) new UnsupportedOperationException(typeMappingMode.toString()));
        } else if (ErrorUtils.isError(declarationDescriptor)) {
            jvmTypeFactory = jvmTypeFactory.createObjectType("error/NonExistentClass");
            if (declarationDescriptor == null) {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
            typeMappingConfiguration.processErrorType(kotlinType, (ClassDescriptor) declarationDescriptor);
            if (jvmDescriptorTypeWriter != null) {
                jvmDescriptorTypeWriter.writeClass(jvmTypeFactory);
            }
            return jvmTypeFactory;
        } else {
            boolean z = declarationDescriptor instanceof ClassDescriptor;
            if (z && KotlinBuiltIns.isArray(kotlinType)) {
                if (kotlinType.getArguments().size() != 1) {
                    throw ((Throwable) new UnsupportedOperationException("arrays must have one type argument"));
                }
                TypeProjection typeProjection = (TypeProjection) kotlinType.getArguments().get(0);
                KotlinType type = typeProjection.getType();
                if (typeProjection.getProjectionKind() == Variance.IN_VARIANCE) {
                    kotlinType = jvmTypeFactory.createObjectType("java/lang/Object");
                    if (jvmDescriptorTypeWriter != null) {
                        jvmDescriptorTypeWriter.writeArrayType();
                        jvmDescriptorTypeWriter.writeClass(kotlinType);
                        jvmDescriptorTypeWriter.writeArrayEnd();
                    }
                } else {
                    if (jvmDescriptorTypeWriter != null) {
                        jvmDescriptorTypeWriter.writeArrayType();
                    }
                    C2668g.a(type, "memberType");
                    kotlinType = typeProjection.getProjectionKind();
                    C2668g.a(kotlinType, "memberProjection.projectionKind");
                    kotlinType = mapType(type, jvmTypeFactory, typeMappingMode.toGenericArgumentMode(kotlinType), typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
                    if (jvmDescriptorTypeWriter != null) {
                        jvmDescriptorTypeWriter.writeArrayEnd();
                    }
                }
                typeMappingMode = new StringBuilder();
                typeMappingMode.append("[");
                typeMappingMode.append(jvmTypeFactory.toString(kotlinType));
                return jvmTypeFactory.createFromString(typeMappingMode.toString());
            } else if (z) {
                ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
                if (classDescriptor.isInline() && !typeMappingMode.getNeedInlineClassWrapping()) {
                    KotlinType computeUnderlyingType = computeUnderlyingType(kotlinType);
                    if (computeUnderlyingType != null) {
                        if (InlineClassesUtilsKt.isInlineClassType(computeUnderlyingType) == null) {
                            typeMappingMode = typeMappingMode.wrapInlineClassesMode();
                        }
                        return mapType(computeUnderlyingType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
                    }
                }
                if (typeMappingMode.isForAnnotationParameter() == null || KotlinBuiltIns.isKClass(classDescriptor) == null) {
                    jvmDescriptorTypeWriter = classDescriptor.getOriginal();
                    C2668g.a(jvmDescriptorTypeWriter, "descriptor.original");
                    jvmDescriptorTypeWriter = typeMappingConfiguration.getPredefinedTypeForClass(jvmDescriptorTypeWriter);
                    if (jvmDescriptorTypeWriter != null) {
                        jvmTypeFactory = jvmDescriptorTypeWriter;
                    } else {
                        if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
                            jvmDescriptorTypeWriter = classDescriptor.getContainingDeclaration();
                            if (jvmDescriptorTypeWriter == null) {
                                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            }
                            classDescriptor = (ClassDescriptor) jvmDescriptorTypeWriter;
                        }
                        jvmDescriptorTypeWriter = classDescriptor.getOriginal();
                        C2668g.a(jvmDescriptorTypeWriter, "enumClassIfEnumEntry.original");
                        jvmTypeFactory = jvmTypeFactory.createObjectType(computeInternalName(jvmDescriptorTypeWriter, typeMappingConfiguration));
                    }
                } else {
                    jvmTypeFactory = jvmTypeFactory.getJavaLangClassType();
                }
                function3.invoke(kotlinType, jvmTypeFactory, typeMappingMode);
                return jvmTypeFactory;
            } else if ((declarationDescriptor instanceof TypeParameterDescriptor) != null) {
                kotlinType = mapType(getRepresentativeUpperBound((TypeParameterDescriptor) declarationDescriptor), jvmTypeFactory, typeMappingMode, typeMappingConfiguration, null, FunctionsKt.getDO_NOTHING_3());
                if (jvmDescriptorTypeWriter != null) {
                    jvmTypeFactory = declarationDescriptor.getName();
                    C2668g.a(jvmTypeFactory, "descriptor.getName()");
                    jvmDescriptorTypeWriter.writeTypeVariable(jvmTypeFactory, kotlinType);
                }
                return kotlinType;
            } else {
                typeMappingMode = new StringBuilder();
                typeMappingMode.append("Unknown type ");
                typeMappingMode.append(kotlinType);
                throw ((Throwable) new UnsupportedOperationException(typeMappingMode.toString()));
            }
        }
    }

    public static final boolean hasVoidReturnType(@NotNull CallableDescriptor callableDescriptor) {
        C2668g.b(callableDescriptor, "descriptor");
        boolean z = true;
        if (callableDescriptor instanceof ConstructorDescriptor) {
            return true;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        if (returnType == null) {
            C2668g.a();
        }
        if (KotlinBuiltIns.isUnit(returnType)) {
            returnType = callableDescriptor.getReturnType();
            if (returnType == null) {
                C2668g.a();
            }
            if (!TypeUtils.isNullableType(returnType) && (callableDescriptor instanceof PropertyGetterDescriptor) == null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    private static final <T> T mapBuiltInType(KotlinType kotlinType, JvmTypeFactory<T> jvmTypeFactory, TypeMappingMode typeMappingMode) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassDescriptor)) {
            declarationDescriptor = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        if (classDescriptor == null) {
            return null;
        }
        if (classDescriptor == SuspendFunctionTypesKt.getFAKE_CONTINUATION_CLASS_DESCRIPTOR()) {
            kotlinType = CONTINUATION_INTERNAL_NAME;
            C2668g.a(kotlinType, "CONTINUATION_INTERNAL_NAME");
            return jvmTypeFactory.createObjectType(kotlinType);
        }
        DeclarationDescriptor declarationDescriptor2 = classDescriptor;
        PrimitiveType primitiveType = KotlinBuiltIns.getPrimitiveType(declarationDescriptor2);
        boolean z = true;
        Object obj = null;
        if (primitiveType != null) {
            typeMappingMode = JvmPrimitiveType.get(primitiveType);
            C2668g.a(typeMappingMode, "JvmPrimitiveType.get(primitiveType)");
            typeMappingMode = typeMappingMode.getDesc();
            C2668g.a(typeMappingMode, "JvmPrimitiveType.get(primitiveType).desc");
            typeMappingMode = jvmTypeFactory.createFromString(typeMappingMode);
            if (!TypeUtils.isNullableType(kotlinType)) {
                if (TypeEnhancementKt.hasEnhancedNullability(kotlinType) == null) {
                    z = false;
                }
            }
            return boxTypeIfNeeded(jvmTypeFactory, typeMappingMode, z);
        }
        PrimitiveType primitiveArrayType = KotlinBuiltIns.getPrimitiveArrayType(declarationDescriptor2);
        if (primitiveArrayType != null) {
            typeMappingMode = new StringBuilder();
            typeMappingMode.append("[");
            kotlinType = JvmPrimitiveType.get(primitiveArrayType);
            C2668g.a(kotlinType, "JvmPrimitiveType.get(arrayElementType)");
            typeMappingMode.append(kotlinType.getDesc());
            return jvmTypeFactory.createFromString(typeMappingMode.toString());
        }
        if (KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor2) != null) {
            kotlinType = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor2));
            if (kotlinType != null) {
                if (typeMappingMode.getKotlinCollectionsToJavaCollections() == null) {
                    Iterable<PlatformMutabilityMapping> mutabilityMappings = JavaToKotlinClassMap.INSTANCE.getMutabilityMappings();
                    if (!(mutabilityMappings instanceof Collection) || !((Collection) mutabilityMappings).isEmpty()) {
                        for (PlatformMutabilityMapping javaClass : mutabilityMappings) {
                            if (C2668g.a(javaClass.getJavaClass(), kotlinType)) {
                                obj = 1;
                                break;
                            }
                        }
                    }
                    if (obj != null) {
                        return null;
                    }
                }
                kotlinType = JvmClassName.byClassId(kotlinType);
                C2668g.a(kotlinType, "JvmClassName.byClassId(classId)");
                kotlinType = kotlinType.getInternalName();
                C2668g.a(kotlinType, "JvmClassName.byClassId(classId).internalName");
                return jvmTypeFactory.createObjectType(kotlinType);
            }
        }
        return null;
    }

    private static final KotlinType computeUnderlyingType(KotlinType kotlinType) {
        if (!shouldUseUnderlyingType(kotlinType)) {
            return null;
        }
        KotlinType unsubstitutedUnderlyingType = InlineClassesUtilsKt.unsubstitutedUnderlyingType(kotlinType);
        if (unsubstitutedUnderlyingType != null) {
            TypeConstructor constructor = unsubstitutedUnderlyingType.getConstructor();
            if (constructor != null) {
                ClassifierDescriptor declarationDescriptor = constructor.getDeclarationDescriptor();
                if (declarationDescriptor != null) {
                    if (declarationDescriptor instanceof TypeParameterDescriptor) {
                        kotlinType = getRepresentativeUpperBound((TypeParameterDescriptor) declarationDescriptor);
                    } else {
                        kotlinType = InlineClassesUtilsKt.substitutedUnderlyingType(kotlinType);
                    }
                    return kotlinType;
                }
            }
        }
        return null;
    }

    private static final boolean shouldUseUnderlyingType(KotlinType kotlinType) {
        KotlinType unsubstitutedUnderlyingType = InlineClassesUtilsKt.unsubstitutedUnderlyingType(kotlinType);
        boolean z = false;
        if (unsubstitutedUnderlyingType == null) {
            return false;
        }
        if (kotlinType.isMarkedNullable() == null || (TypeUtils.isNullableType(unsubstitutedUnderlyingType) == null && KotlinBuiltIns.isPrimitiveType(unsubstitutedUnderlyingType) == null)) {
            z = true;
        }
        return z;
    }

    @NotNull
    public static /* synthetic */ String computeInternalName$default(ClassDescriptor classDescriptor, TypeMappingConfiguration typeMappingConfiguration, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMappingConfiguration = TypeMappingConfigurationImpl.INSTANCE;
        }
        return computeInternalName(classDescriptor, typeMappingConfiguration);
    }

    @NotNull
    public static final String computeInternalName(@NotNull ClassDescriptor classDescriptor, @NotNull TypeMappingConfiguration<?> typeMappingConfiguration) {
        C2668g.b(classDescriptor, "klass");
        C2668g.b(typeMappingConfiguration, "typeMappingConfiguration");
        DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
        Name safeIdentifier = SpecialNames.safeIdentifier(classDescriptor.getName());
        C2668g.a(safeIdentifier, "SpecialNames.safeIdentifier(klass.name)");
        String identifier = safeIdentifier.getIdentifier();
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            classDescriptor = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
            if (classDescriptor.isRoot() != null) {
                C2668g.a(identifier, "name");
            } else {
                typeMappingConfiguration = new StringBuilder();
                String asString = classDescriptor.asString();
                C2668g.a(asString, "fqName.asString()");
                typeMappingConfiguration.append(C19296q.m68670a(asString, '.', '/', false, 4, null));
                typeMappingConfiguration.append('/');
                typeMappingConfiguration.append(identifier);
                identifier = typeMappingConfiguration.toString();
            }
            return identifier;
        }
        ClassDescriptor classDescriptor2 = (ClassDescriptor) (!(containingDeclaration instanceof ClassDescriptor) ? null : containingDeclaration);
        if (classDescriptor2 != null) {
            classDescriptor = typeMappingConfiguration.getPredefinedInternalNameForClass(classDescriptor2);
            if (classDescriptor == null) {
                classDescriptor = computeInternalName(classDescriptor2, typeMappingConfiguration);
            }
            typeMappingConfiguration = new StringBuilder();
            typeMappingConfiguration.append(classDescriptor);
            typeMappingConfiguration.append("$");
            typeMappingConfiguration.append(identifier);
            return typeMappingConfiguration.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected container: ");
        stringBuilder.append(containingDeclaration);
        stringBuilder.append(" for ");
        stringBuilder.append(classDescriptor);
        throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
    }

    private static final KotlinType getRepresentativeUpperBound(TypeParameterDescriptor typeParameterDescriptor) {
        List upperBounds = typeParameterDescriptor.getUpperBounds();
        int isEmpty = upperBounds.isEmpty() ^ 1;
        if (C15819j.f49018a && isEmpty == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Upper bounds should not be empty: ");
            stringBuilder.append(typeParameterDescriptor);
            throw new AssertionError(stringBuilder.toString());
        }
        Object obj;
        C2668g.a(upperBounds, "upperBounds");
        typeParameterDescriptor = upperBounds.iterator();
        Object obj2;
        do {
            ClassifierDescriptor classifierDescriptor = null;
            if (!typeParameterDescriptor.hasNext()) {
                obj = null;
                break;
            }
            obj = typeParameterDescriptor.next();
            ClassifierDescriptor declarationDescriptor = ((KotlinType) obj).getConstructor().getDeclarationDescriptor();
            if (declarationDescriptor instanceof ClassDescriptor) {
                classifierDescriptor = declarationDescriptor;
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptor;
            obj2 = null;
            if (!(classDescriptor == null || classDescriptor.getKind() == ClassKind.INTERFACE || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS)) {
                obj2 = 1;
                continue;
            }
        } while (obj2 == null);
        KotlinType kotlinType = (KotlinType) obj;
        if (kotlinType != null) {
            return kotlinType;
        }
        typeParameterDescriptor = C19299w.m68829f(upperBounds);
        C2668g.a(typeParameterDescriptor, "upperBounds.first()");
        return (KotlinType) typeParameterDescriptor;
    }
}
