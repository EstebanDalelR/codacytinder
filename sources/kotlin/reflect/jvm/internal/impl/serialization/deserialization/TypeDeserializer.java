package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeBasedStarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeDeserializer {
    /* renamed from: c */
    private final DeserializationContext f49043c;
    private final Function1<Integer, ClassDescriptor> classDescriptors = this.f49043c.getStorageManager().createMemoizedFunctionWithNullableValues((Function1) new TypeDeserializer$classDescriptors$1(this));
    private final String debugName;
    private final TypeDeserializer parent;
    private final Function1<Integer, ClassifierDescriptor> typeAliasDescriptors = this.f49043c.getStorageManager().createMemoizedFunctionWithNullableValues((Function1) new TypeDeserializer$typeAliasDescriptors$1(this));
    private final Map<Integer, TypeParameterDescriptor> typeParameterDescriptors;

    public TypeDeserializer(@NotNull DeserializationContext deserializationContext, @Nullable TypeDeserializer typeDeserializer, @NotNull List<TypeParameter> list, @NotNull String str) {
        C2668g.b(deserializationContext, "c");
        C2668g.b(list, "typeParameterProtos");
        C2668g.b(str, "debugName");
        this.f49043c = deserializationContext;
        this.parent = typeDeserializer;
        this.debugName = str;
        if (list.isEmpty() != null) {
            deserializationContext = ah.m66884a();
        } else {
            deserializationContext = new LinkedHashMap();
            typeDeserializer = null;
            for (TypeParameter typeParameter : list) {
                ((Map) deserializationContext).put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f49043c, typeParameter, typeDeserializer));
                typeDeserializer++;
            }
            deserializationContext = (Map) deserializationContext;
        }
        this.typeParameterDescriptors = deserializationContext;
    }

    @NotNull
    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return C19299w.m68840l(this.typeParameterDescriptors.values());
    }

    @NotNull
    public static /* synthetic */ KotlinType type$default(TypeDeserializer typeDeserializer, Type type, Annotations annotations, int i, Object obj) {
        if ((i & 2) != 0) {
            annotations = Annotations.Companion.getEMPTY();
        }
        return typeDeserializer.type(type, annotations);
    }

    @NotNull
    public final KotlinType type(@NotNull Type type, @NotNull Annotations annotations) {
        C2668g.b(type, "proto");
        C2668g.b(annotations, "additionalAnnotations");
        if (!type.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(type, annotations);
        }
        String string = this.f49043c.getNameResolver().getString(type.getFlexibleTypeCapabilitiesId());
        SimpleType simpleType = simpleType(type, annotations);
        Type flexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(type, this.f49043c.getTypeTable());
        if (flexibleUpperBound == null) {
            C2668g.a();
        }
        return this.f49043c.getComponents().getFlexibleTypeDeserializer().create(type, string, simpleType, simpleType(flexibleUpperBound, annotations));
    }

    @NotNull
    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, Type type, Annotations annotations, int i, Object obj) {
        if ((i & 2) != 0) {
            annotations = Annotations.Companion.getEMPTY();
        }
        return typeDeserializer.simpleType(type, annotations);
    }

    @NotNull
    public final SimpleType simpleType(@NotNull Type type, @NotNull Annotations annotations) {
        C2668g.b(type, "proto");
        C2668g.b(annotations, "additionalAnnotations");
        SimpleType computeLocalClassifierReplacementType = type.hasClassName() ? computeLocalClassifierReplacementType(type.getClassName()) : type.hasTypeAliasName() ? computeLocalClassifierReplacementType(type.getTypeAliasName()) : null;
        if (computeLocalClassifierReplacementType != null) {
            return computeLocalClassifierReplacementType;
        }
        TypeConstructor typeConstructor = typeConstructor(type);
        if (ErrorUtils.isError(typeConstructor.getDeclarationDescriptor())) {
            type = ErrorUtils.createErrorTypeWithCustomConstructor(typeConstructor.toString(), typeConstructor);
            C2668g.a(type, "ErrorUtils.createErrorTy….toString(), constructor)");
            return type;
        }
        DeserializedAnnotationsWithPossibleTargets deserializedAnnotationsWithPossibleTargets = new DeserializedAnnotationsWithPossibleTargets(this.f49043c.getStorageManager(), new TypeDeserializer$simpleType$annotations$1(this, type, annotations));
        Iterable<Argument> invoke = new TypeDeserializer$simpleType$1(this).invoke(type);
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) invoke, 10));
        int i = 0;
        for (Argument argument : invoke) {
            int i2 = i + 1;
            List parameters = typeConstructor.getParameters();
            C2668g.a(parameters, "constructor.parameters");
            arrayList.add(typeArgument((TypeParameterDescriptor) C19299w.m68813c(parameters, i), argument));
            i = i2;
        }
        List l = C19299w.m68840l((List) arrayList);
        Boolean bool = Flags.SUSPEND_TYPE.get(type.getFlags());
        C2668g.a(bool, "Flags.SUSPEND_TYPE.get(proto.flags)");
        if (bool.booleanValue()) {
            computeLocalClassifierReplacementType = createSuspendFunctionType(deserializedAnnotationsWithPossibleTargets, typeConstructor, l, type.getNullable());
        } else {
            computeLocalClassifierReplacementType = KotlinTypeFactory.simpleType(deserializedAnnotationsWithPossibleTargets, typeConstructor, l, type.getNullable());
        }
        type = ProtoTypeTableUtilKt.abbreviatedType(type, this.f49043c.getTypeTable());
        return type != null ? SpecialTypesKt.withAbbreviation(computeLocalClassifierReplacementType, simpleType(type, annotations)) : computeLocalClassifierReplacementType;
    }

    private final TypeConstructor typeConstructor(Type type) {
        TypeDeserializer$typeConstructor$1 typeDeserializer$typeConstructor$1 = new TypeDeserializer$typeConstructor$1(this, type);
        if (type.hasClassName()) {
            ClassDescriptor classDescriptor = (ClassDescriptor) this.classDescriptors.invoke(Integer.valueOf(type.getClassName()));
            if (classDescriptor == null) {
                classDescriptor = typeDeserializer$typeConstructor$1.invoke(type.getClassName());
            }
            type = classDescriptor.getTypeConstructor();
            C2668g.a(type, "(classDescriptors(proto.…assName)).typeConstructor");
            return type;
        } else if (type.hasTypeParameter()) {
            TypeConstructor typeParameterTypeConstructor = typeParameterTypeConstructor(type.getTypeParameter());
            if (typeParameterTypeConstructor != null) {
                return typeParameterTypeConstructor;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown type parameter ");
            stringBuilder.append(type.getTypeParameter());
            type = ErrorUtils.createErrorTypeConstructor(stringBuilder.toString());
            C2668g.a(type, "ErrorUtils.createErrorTy… ${proto.typeParameter}\")");
            return type;
        } else if (type.hasTypeParameterName()) {
            DeclarationDescriptor containingDeclaration = this.f49043c.getContainingDeclaration();
            type = this.f49043c.getNameResolver().getString(type.getTypeParameterName());
            for (Object next : getOwnTypeParameters()) {
                if (C2668g.a(((TypeParameterDescriptor) next).getName().asString(), type)) {
                    break;
                }
            }
            Object next2 = null;
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) next2;
            if (typeParameterDescriptor != null) {
                TypeConstructor typeConstructor = typeParameterDescriptor.getTypeConstructor();
                if (typeConstructor != null) {
                    return typeConstructor;
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Deserialized type parameter ");
            stringBuilder2.append(type);
            stringBuilder2.append(" in ");
            stringBuilder2.append(containingDeclaration);
            type = ErrorUtils.createErrorTypeConstructor(stringBuilder2.toString());
            C2668g.a(type, "ErrorUtils.createErrorTy…ter $name in $container\")");
            return type;
        } else if (type.hasTypeAliasName()) {
            ClassifierDescriptor classifierDescriptor = (ClassifierDescriptor) this.typeAliasDescriptors.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (classifierDescriptor == null) {
                classifierDescriptor = typeDeserializer$typeConstructor$1.invoke(type.getTypeAliasName());
            }
            type = classifierDescriptor.getTypeConstructor();
            C2668g.a(type, "(typeAliasDescriptors(pr…iasName)).typeConstructor");
            return type;
        } else {
            type = ErrorUtils.createErrorTypeConstructor("Unknown type");
            C2668g.a(type, "ErrorUtils.createErrorTy…nstructor(\"Unknown type\")");
            return type;
        }
    }

    private final SimpleType createSuspendFunctionType(Annotations annotations, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        SimpleType simpleType = null;
        switch (typeConstructor.getParameters().size() - list.size()) {
            case 0:
                annotations = KotlinTypeFactory.simpleType(annotations, typeConstructor, list, z);
                if (!FunctionTypesKt.isFunctionType((KotlinType) annotations)) {
                    annotations = null;
                }
                if (annotations != null) {
                    simpleType = SuspendFunctionTypesKt.transformRuntimeFunctionTypeToSuspendFunction((KotlinType) annotations);
                    break;
                }
                break;
            case 1:
                int size = list.size() - 1;
                if (size >= 0) {
                    ClassDescriptor suspendFunction = typeConstructor.getBuiltIns().getSuspendFunction(size);
                    C2668g.a(suspendFunction, "functionTypeConstructor.…getSuspendFunction(arity)");
                    TypeConstructor typeConstructor2 = suspendFunction.getTypeConstructor();
                    C2668g.a(typeConstructor2, "functionTypeConstructor.…on(arity).typeConstructor");
                    simpleType = KotlinTypeFactory.simpleType(annotations, typeConstructor2, list, z);
                    break;
                }
                break;
            default:
                break;
        }
        if (simpleType != null) {
            return simpleType;
        }
        annotations = new StringBuilder();
        annotations.append("Bad suspend function in metadata with constructor: ");
        annotations.append(typeConstructor);
        simpleType = ErrorUtils.createErrorTypeWithArguments(annotations.toString(), list);
        C2668g.a(simpleType, "ErrorUtils.createErrorTy…eConstructor\", arguments)");
        return simpleType;
    }

    private final TypeConstructor typeParameterTypeConstructor(int i) {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) this.typeParameterDescriptors.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null) {
            TypeConstructor typeConstructor = typeParameterDescriptor.getTypeConstructor();
            if (typeConstructor != null) {
                return typeConstructor;
            }
        }
        TypeDeserializer typeDeserializer = this.parent;
        return typeDeserializer != null ? typeDeserializer.typeParameterTypeConstructor(i) : null;
    }

    private final ClassDescriptor computeClassDescriptor(int i) {
        i = NameResolverUtilKt.getClassId(this.f49043c.getNameResolver(), i);
        if (i.isLocal()) {
            return this.f49043c.getComponents().deserializeClass(i);
        }
        return FindClassInModuleKt.findClassAcrossModuleDependencies(this.f49043c.getComponents().getModuleDescriptor(), i);
    }

    private final SimpleType computeLocalClassifierReplacementType(int i) {
        return NameResolverUtilKt.getClassId(this.f49043c.getNameResolver(), i).isLocal() != 0 ? this.f49043c.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers() : 0;
    }

    private final ClassifierDescriptor computeTypeAliasDescriptor(int i) {
        i = NameResolverUtilKt.getClassId(this.f49043c.getNameResolver(), i);
        if (i.isLocal()) {
            return 0;
        }
        return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(this.f49043c.getComponents().getModuleDescriptor(), i);
    }

    private final TypeProjection typeArgument(TypeParameterDescriptor typeParameterDescriptor, Argument argument) {
        if (argument.getProjection() == Projection.STAR) {
            if (typeParameterDescriptor == null) {
                argument = this.f49043c.getComponents().getModuleDescriptor().getBuiltIns().getNullableAnyType();
                C2668g.a(argument, "c.components.moduleDescr….builtIns.nullableAnyType");
                typeParameterDescriptor = (TypeProjection) new TypeBasedStarProjectionImpl((KotlinType) argument);
            } else {
                typeParameterDescriptor = (TypeProjection) new StarProjectionImpl(typeParameterDescriptor);
            }
            return typeParameterDescriptor;
        }
        typeParameterDescriptor = ProtoEnumFlags.INSTANCE;
        Projection projection = argument.getProjection();
        C2668g.a(projection, "typeArgumentProto.projection");
        typeParameterDescriptor = typeParameterDescriptor.variance(projection);
        argument = ProtoTypeTableUtilKt.type(argument, this.f49043c.getTypeTable());
        if (argument != null) {
            return new TypeProjectionImpl(typeParameterDescriptor, type$default(this, argument, null, 2, null));
        }
        return (TypeProjection) new TypeProjectionImpl(ErrorUtils.createErrorType("No type recorded"));
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.debugName);
        if (this.parent == null) {
            str = "";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(". Child of ");
            stringBuilder2.append(this.parent.debugName);
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
