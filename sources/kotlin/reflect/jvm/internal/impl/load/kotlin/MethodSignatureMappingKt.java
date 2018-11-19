package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MethodSignatureMappingKt {
    @NotNull
    public static /* synthetic */ String computeJvmDescriptor$default(FunctionDescriptor functionDescriptor, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return computeJvmDescriptor(functionDescriptor, z);
    }

    @NotNull
    public static final String computeJvmDescriptor(@NotNull FunctionDescriptor functionDescriptor, boolean z) {
        String str;
        C2668g.b(functionDescriptor, "$receiver");
        StringBuilder stringBuilder = new StringBuilder();
        if (functionDescriptor instanceof ConstructorDescriptor) {
            str = "<init>";
        } else {
            str = functionDescriptor.getName().asString();
            C2668g.a(str, "name.asString()");
        }
        stringBuilder.append(str);
        stringBuilder.append("(");
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        C2668g.a(valueParameters, "valueParameters");
        for (ValueParameterDescriptor valueParameterDescriptor : valueParameters) {
            C2668g.a(valueParameterDescriptor, "it");
            KotlinType type = valueParameterDescriptor.getType();
            C2668g.a(type, "it.type");
            appendErasedType(stringBuilder, type);
        }
        stringBuilder.append(")");
        if (z) {
            if (TypeSignatureMappingKt.hasVoidReturnType(functionDescriptor)) {
                stringBuilder.append("V");
            } else {
                functionDescriptor = functionDescriptor.getReturnType();
                if (functionDescriptor == null) {
                    C2668g.a();
                }
                C2668g.a(functionDescriptor, "returnType!!");
                appendErasedType(stringBuilder, functionDescriptor);
            }
        }
        return stringBuilder.toString();
    }

    public static final boolean forceSingleValueParameterBoxing(@NotNull CallableDescriptor callableDescriptor) {
        C2668g.b(callableDescriptor, "f");
        boolean z = false;
        if (!(callableDescriptor instanceof FunctionDescriptor)) {
            return false;
        }
        FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor;
        if (functionDescriptor.getValueParameters().size() == 1 && SpecialBuiltinMembers.isFromJavaOrBuiltins((CallableMemberDescriptor) callableDescriptor) == null) {
            if ((C2668g.a(functionDescriptor.getName().asString(), "remove") ^ 1) == null) {
                callableDescriptor = functionDescriptor.getOriginal();
                C2668g.a(callableDescriptor, "f.original");
                callableDescriptor = callableDescriptor.getValueParameters();
                C2668g.a(callableDescriptor, "f.original.valueParameters");
                callableDescriptor = C19299w.m68836j((List) callableDescriptor);
                C2668g.a(callableDescriptor, "f.original.valueParameters.single()");
                callableDescriptor = ((ValueParameterDescriptor) callableDescriptor).getType();
                C2668g.a(callableDescriptor, "f.original.valueParameters.single().type");
                callableDescriptor = mapToJvmType(callableDescriptor);
                JvmPrimitiveType jvmPrimitiveType = null;
                if (!(callableDescriptor instanceof Primitive)) {
                    callableDescriptor = null;
                }
                Primitive primitive = (Primitive) callableDescriptor;
                if (primitive != null) {
                    jvmPrimitiveType = primitive.getJvmPrimitiveType();
                }
                if (jvmPrimitiveType != JvmPrimitiveType.INT) {
                    return false;
                }
                callableDescriptor = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(functionDescriptor);
                if (callableDescriptor == null) {
                    return false;
                }
                functionDescriptor = callableDescriptor.getOriginal();
                C2668g.a(functionDescriptor, "overridden.original");
                List valueParameters = functionDescriptor.getValueParameters();
                C2668g.a(valueParameters, "overridden.original.valueParameters");
                Object j = C19299w.m68836j(valueParameters);
                C2668g.a(j, "overridden.original.valueParameters.single()");
                KotlinType type = ((ValueParameterDescriptor) j).getType();
                C2668g.a(type, "overridden.original.valueParameters.single().type");
                JvmType mapToJvmType = mapToJvmType(type);
                callableDescriptor = callableDescriptor.getContainingDeclaration();
                C2668g.a(callableDescriptor, "overridden.containingDeclaration");
                if (!(C2668g.a(DescriptorUtilsKt.getFqNameUnsafe(callableDescriptor), KotlinBuiltIns.FQ_NAMES.mutableCollection.toUnsafe()) == null || (mapToJvmType instanceof Object) == null || C2668g.a(((Object) mapToJvmType).getInternalName(), "java/lang/Object") == null)) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    @NotNull
    public static final String getInternalName(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "$receiver");
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        FqNameUnsafe toUnsafe = DescriptorUtilsKt.getFqNameSafe(classDescriptor).toUnsafe();
        C2668g.a(toUnsafe, "fqNameSafe.toUnsafe()");
        ClassId mapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(toUnsafe);
        if (mapKotlinToJava == null) {
            return TypeSignatureMappingKt.computeInternalName$default(classDescriptor, null, 2, null);
        }
        classDescriptor = JvmClassName.byClassId(mapKotlinToJava);
        C2668g.a(classDescriptor, "JvmClassName.byClassId(it)");
        classDescriptor = classDescriptor.getInternalName();
        C2668g.a(classDescriptor, "JvmClassName.byClassId(it).internalName");
        return classDescriptor;
    }

    private static final void appendErasedType(@NotNull StringBuilder stringBuilder, KotlinType kotlinType) {
        stringBuilder.append(mapToJvmType(kotlinType));
    }

    @NotNull
    public static final JvmType mapToJvmType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        return (JvmType) TypeSignatureMappingKt.mapType$default(kotlinType, JvmTypeFactoryImpl.INSTANCE, TypeMappingMode.DEFAULT, TypeMappingConfigurationImpl.INSTANCE, null, null, 32, null);
    }

    @Nullable
    public static final String computeJvmSignature(@NotNull CallableDescriptor callableDescriptor) {
        C2668g.b(callableDescriptor, "$receiver");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        if (DescriptorUtils.isLocal(callableDescriptor)) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            containingDeclaration = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        if (classDescriptor == null) {
            return null;
        }
        Name name = classDescriptor.getName();
        C2668g.a(name, "classDescriptor.name");
        if (name.isSpecial()) {
            return null;
        }
        callableDescriptor = callableDescriptor.getOriginal();
        if (!(callableDescriptor instanceof SimpleFunctionDescriptor)) {
            callableDescriptor = null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) callableDescriptor;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        String computeJvmDescriptor$default = computeJvmDescriptor$default(simpleFunctionDescriptor, false, 1, null);
        C2668g.a(computeJvmDescriptor$default, "(original as? SimpleFunc…l).computeJvmDescriptor()");
        return signatureBuildingComponents.signature(classDescriptor, computeJvmDescriptor$default);
    }
}
