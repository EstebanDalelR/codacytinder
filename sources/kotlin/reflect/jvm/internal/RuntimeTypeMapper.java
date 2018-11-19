package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.BuiltInFunction.Predefined;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaConstructor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaMethod;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction;
import kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField;
import kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty;
import kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.structure.ReflectJavaConstructor;
import kotlin.reflect.jvm.internal.structure.ReflectJavaField;
import kotlin.reflect.jvm.internal.structure.ReflectJavaMethod;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "()V", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "primitiveType", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "Ljava/lang/Class;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "mapIntrinsicFunctionSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "function", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "mapJvmClassToKotlinClassId", "klass", "mapPropertySignature", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "mapSignature", "possiblySubstitutedFunction", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
public final class RuntimeTypeMapper {
    public static final RuntimeTypeMapper INSTANCE = new RuntimeTypeMapper();
    private static final ClassId JAVA_LANG_VOID = ClassId.topLevel(new FqName("java.lang.Void"));

    private RuntimeTypeMapper() {
    }

    @NotNull
    public final JvmFunctionSignature mapSignature(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "possiblySubstitutedFunction");
        functionDescriptor = DescriptorUtils.unwrapFakeOverride(functionDescriptor);
        C2668g.a(functionDescriptor, "DescriptorUtils.unwrapFa…siblySubstitutedFunction)");
        functionDescriptor = functionDescriptor.getOriginal();
        if (functionDescriptor instanceof DeserializedCallableMemberDescriptor) {
            C2668g.a(functionDescriptor, "function");
            JvmFunctionSignature mapIntrinsicFunctionSignature = mapIntrinsicFunctionSignature(functionDescriptor);
            if (mapIntrinsicFunctionSignature != null) {
                return mapIntrinsicFunctionSignature;
            }
            DeserializedCallableMemberDescriptor deserializedCallableMemberDescriptor = (DeserializedCallableMemberDescriptor) functionDescriptor;
            MessageLite proto = deserializedCallableMemberDescriptor.getProto();
            if (proto instanceof Function) {
                String jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((Function) proto, deserializedCallableMemberDescriptor.getNameResolver(), deserializedCallableMemberDescriptor.getTypeTable());
                if (jvmMethodSignature != null) {
                    return (JvmFunctionSignature) new KotlinFunction(jvmMethodSignature);
                }
            }
            if (proto instanceof Constructor) {
                String jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((Constructor) proto, deserializedCallableMemberDescriptor.getNameResolver(), deserializedCallableMemberDescriptor.getTypeTable());
                if (jvmConstructorSignature != null) {
                    return (JvmFunctionSignature) new KotlinConstructor(jvmConstructorSignature);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Reflection on built-in Kotlin types is not yet fully supported. ");
            stringBuilder.append("No metadata found for ");
            stringBuilder.append(functionDescriptor);
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        }
        Object obj = null;
        SourceElement source;
        JavaSourceElement javaSourceElement;
        if (functionDescriptor instanceof JavaMethodDescriptor) {
            C2668g.a(functionDescriptor, "function");
            source = ((JavaMethodDescriptor) functionDescriptor).getSource();
            if (!(source instanceof JavaSourceElement)) {
                source = null;
            }
            javaSourceElement = (JavaSourceElement) source;
            JavaElement javaElement = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
            if (!(javaElement instanceof ReflectJavaMethod)) {
                javaElement = null;
            }
            ReflectJavaMethod reflectJavaMethod = (ReflectJavaMethod) javaElement;
            if (reflectJavaMethod != null) {
                Method member = reflectJavaMethod.getMember();
                if (member != null) {
                    return (JvmFunctionSignature) new JavaMethod(member);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Incorrect resolution sequence for Java method ");
            stringBuilder.append(functionDescriptor);
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        } else if (functionDescriptor instanceof JavaClassConstructorDescriptor) {
            C2668g.a(functionDescriptor, "function");
            source = ((JavaClassConstructorDescriptor) functionDescriptor).getSource();
            if (!(source instanceof JavaSourceElement)) {
                source = null;
            }
            javaSourceElement = (JavaSourceElement) source;
            if (javaSourceElement != null) {
                obj = javaSourceElement.getJavaElement();
            }
            if (obj instanceof ReflectJavaConstructor) {
                functionDescriptor = (JvmFunctionSignature) new JavaConstructor(((ReflectJavaConstructor) obj).getMember());
            } else {
                if (obj instanceof ReflectJavaClass) {
                    ReflectJavaClass reflectJavaClass = (ReflectJavaClass) obj;
                    if (reflectJavaClass.isAnnotationType()) {
                        functionDescriptor = (JvmFunctionSignature) new FakeJavaAnnotationConstructor(reflectJavaClass.getElement());
                    }
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Incorrect resolution sequence for Java constructor ");
                stringBuilder2.append(functionDescriptor);
                stringBuilder2.append(" (");
                stringBuilder2.append(obj);
                stringBuilder2.append(')');
                throw new KotlinReflectionInternalError(stringBuilder2.toString());
            }
            return functionDescriptor;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown origin of ");
            stringBuilder.append(functionDescriptor);
            stringBuilder.append(" (");
            stringBuilder.append(functionDescriptor.getClass());
            stringBuilder.append(')');
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        }
    }

    @NotNull
    public final JvmPropertySignature mapPropertySignature(@NotNull PropertyDescriptor propertyDescriptor) {
        C2668g.b(propertyDescriptor, "possiblyOverriddenProperty");
        propertyDescriptor = DescriptorUtils.unwrapFakeOverride(propertyDescriptor);
        C2668g.a(propertyDescriptor, "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)");
        PropertyDescriptor original = propertyDescriptor.getOriginal();
        if ((original instanceof DeserializedPropertyDescriptor) != null) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) original;
            Property proto = deserializedPropertyDescriptor.getProto();
            ExtendableMessage extendableMessage = proto;
            GeneratedExtension generatedExtension = JvmProtoBuf.propertySignature;
            C2668g.a(generatedExtension, "JvmProtoBuf.propertySignature");
            JvmPropertySignature jvmPropertySignature = (JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(extendableMessage, generatedExtension);
            if (jvmPropertySignature != null) {
                C2668g.a(original, "property");
                return new KotlinProperty(original, proto, jvmPropertySignature, deserializedPropertyDescriptor.getNameResolver(), deserializedPropertyDescriptor.getTypeTable());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Reflection on built-in Kotlin types is not yet fully supported. No metadata found for ");
            stringBuilder.append(original);
            throw ((Throwable) new KotlinReflectionInternalError(stringBuilder.toString()));
        } else if ((original instanceof JavaPropertyDescriptor) != null) {
            C2668g.a(original, "property");
            propertyDescriptor = ((JavaPropertyDescriptor) original).getSource();
            Method method = null;
            if (!(propertyDescriptor instanceof JavaSourceElement)) {
                propertyDescriptor = null;
            }
            JavaSourceElement javaSourceElement = (JavaSourceElement) propertyDescriptor;
            propertyDescriptor = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
            if (propertyDescriptor instanceof ReflectJavaField) {
                return new JavaField(((ReflectJavaField) propertyDescriptor).getMember());
            }
            if (propertyDescriptor instanceof ReflectJavaMethod) {
                propertyDescriptor = ((ReflectJavaMethod) propertyDescriptor).getMember();
                PropertySetterDescriptor setter = original.getSetter();
                SourceElement source = setter != null ? setter.getSource() : null;
                if (!(source instanceof JavaSourceElement)) {
                    source = null;
                }
                JavaSourceElement javaSourceElement2 = (JavaSourceElement) source;
                JavaElement javaElement = javaSourceElement2 != null ? javaSourceElement2.getJavaElement() : null;
                if (!(javaElement instanceof ReflectJavaMethod)) {
                    javaElement = null;
                }
                ReflectJavaMethod reflectJavaMethod = (ReflectJavaMethod) javaElement;
                if (reflectJavaMethod != null) {
                    method = reflectJavaMethod.getMember();
                }
                return new JavaMethodProperty(propertyDescriptor, method);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Incorrect resolution sequence for Java field ");
            stringBuilder2.append(original);
            stringBuilder2.append(" (source = ");
            stringBuilder2.append(propertyDescriptor);
            stringBuilder2.append(')');
            throw new KotlinReflectionInternalError(stringBuilder2.toString());
        } else {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Unknown origin of ");
            stringBuilder3.append(original);
            stringBuilder3.append(" (");
            stringBuilder3.append(original.getClass());
            stringBuilder3.append(')');
            throw ((Throwable) new KotlinReflectionInternalError(stringBuilder3.toString()));
        }
    }

    private final JvmFunctionSignature mapIntrinsicFunctionSignature(FunctionDescriptor functionDescriptor) {
        List valueParameters = functionDescriptor.getValueParameters();
        functionDescriptor = functionDescriptor.getName().asString();
        int hashCode = functionDescriptor.hashCode();
        Method declaredMethod;
        if (hashCode != -1776922004) {
            if (hashCode != -1295482945) {
                if (hashCode == 147696667) {
                    if (!(functionDescriptor.equals("hashCode") == null || valueParameters.isEmpty() == null)) {
                        declaredMethod = Object.class.getDeclaredMethod("hashCode", new Class[0]);
                        C2668g.a(declaredMethod, "Any::class.java.getDeclaredMethod(\"hashCode\")");
                        return (JvmFunctionSignature) new Predefined("hashCode()I", declaredMethod);
                    }
                }
            } else if (functionDescriptor.equals("equals") != null && valueParameters.size() == 1) {
                C2668g.a(valueParameters, "parameters");
                functionDescriptor = C19299w.m68836j(valueParameters);
                C2668g.a(functionDescriptor, "parameters.single()");
                if (KotlinBuiltIns.isNullableAny(((ValueParameterDescriptor) functionDescriptor).getType()) != null) {
                    declaredMethod = Object.class.getDeclaredMethod("equals", new Class[]{Object.class});
                    C2668g.a(declaredMethod, "Any::class.java.getDecla…equals\", Any::class.java)");
                    return (JvmFunctionSignature) new Predefined("equals(Ljava/lang/Object;)Z", declaredMethod);
                }
            }
        } else if (!(functionDescriptor.equals("toString") == null || valueParameters.isEmpty() == null)) {
            declaredMethod = Object.class.getDeclaredMethod("toString", new Class[0]);
            C2668g.a(declaredMethod, "Any::class.java.getDeclaredMethod(\"toString\")");
            return (JvmFunctionSignature) new Predefined("toString()Ljava/lang/String;", declaredMethod);
        }
        return null;
    }

    @NotNull
    public final ClassId mapJvmClassToKotlinClassId(@NotNull Class<?> cls) {
        C2668g.b(cls, "klass");
        if (cls.isArray()) {
            cls = cls.getComponentType();
            C2668g.a(cls, "klass.componentType");
            cls = getPrimitiveType(cls);
            if (cls != null) {
                return new ClassId(KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME, cls.getArrayTypeName());
            }
            cls = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.array.toSafe());
            C2668g.a(cls, "ClassId.topLevel(KotlinB….FQ_NAMES.array.toSafe())");
            return cls;
        } else if (C2668g.a(cls, Void.TYPE)) {
            cls = JAVA_LANG_VOID;
            C2668g.a(cls, "JAVA_LANG_VOID");
            return cls;
        } else {
            PrimitiveType primitiveType = getPrimitiveType(cls);
            if (primitiveType != null) {
                return new ClassId(KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getTypeName());
            }
            cls = ReflectClassUtilKt.getClassId(cls);
            if (!cls.isLocal()) {
                JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
                FqName asSingleFqName = cls.asSingleFqName();
                C2668g.a(asSingleFqName, "classId.asSingleFqName()");
                ClassId mapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(asSingleFqName);
                if (mapJavaToKotlin != null) {
                    return mapJavaToKotlin;
                }
            }
            return cls;
        }
    }

    private final PrimitiveType getPrimitiveType(@NotNull Class<?> cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        cls = JvmPrimitiveType.get(cls.getSimpleName());
        C2668g.a(cls, "JvmPrimitiveType.get(simpleName)");
        return cls.getPrimitiveType();
    }
}
