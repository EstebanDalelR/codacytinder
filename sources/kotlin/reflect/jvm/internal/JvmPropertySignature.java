package kotlin.reflect.jvm.internal;

import com.tinder.api.ManagerWebServices;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "()V", "asString", "", "JavaField", "JavaMethodProperty", "KotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
public abstract class JvmPropertySignature {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "getField", "()Ljava/lang/reflect/Field;", "asString", "", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static final class JavaField extends JvmPropertySignature {
        @NotNull
        private final Field field;

        public JavaField(@NotNull Field field) {
            C2668g.b(field, "field");
            super();
            this.field = field;
        }

        @NotNull
        public final Field getField() {
            return this.field;
        }

        @NotNull
        public String asString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(JvmAbi.getterName(this.field.getName()));
            stringBuilder.append("()");
            Class type = this.field.getType();
            C2668g.a(type, "field.type");
            stringBuilder.append(ReflectClassUtilKt.getDesc(type));
            return stringBuilder.toString();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterMethod", "Ljava/lang/reflect/Method;", "setterMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetterMethod", "()Ljava/lang/reflect/Method;", "getSetterMethod", "asString", "", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static final class JavaMethodProperty extends JvmPropertySignature {
        @NotNull
        private final Method getterMethod;
        @Nullable
        private final Method setterMethod;

        public JavaMethodProperty(@NotNull Method method, @Nullable Method method2) {
            C2668g.b(method, "getterMethod");
            super();
            this.getterMethod = method;
            this.setterMethod = method2;
        }

        @NotNull
        public final Method getGetterMethod() {
            return this.getterMethod;
        }

        @Nullable
        public final Method getSetterMethod() {
            return this.setterMethod;
        }

        @NotNull
        public String asString() {
            return RuntimeTypeMapperKt.getSignature(this.getterMethod);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "string", "", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "asString", "getManglingSuffix", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static final class KotlinProperty extends JvmPropertySignature {
        @NotNull
        private final PropertyDescriptor descriptor;
        @NotNull
        private final NameResolver nameResolver;
        @NotNull
        private final Property proto;
        @NotNull
        private final kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature signature;
        private final String string;
        @NotNull
        private final TypeTable typeTable;

        @NotNull
        public final PropertyDescriptor getDescriptor() {
            return this.descriptor;
        }

        @NotNull
        public final Property getProto() {
            return this.proto;
        }

        @NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature getSignature() {
            return this.signature;
        }

        @NotNull
        public final NameResolver getNameResolver() {
            return this.nameResolver;
        }

        @NotNull
        public final TypeTable getTypeTable() {
            return this.typeTable;
        }

        public KotlinProperty(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Property property, @NotNull kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature jvmPropertySignature, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
            C2668g.b(propertyDescriptor, "descriptor");
            C2668g.b(property, "proto");
            C2668g.b(jvmPropertySignature, ManagerWebServices.PARAM_SIGNATURE);
            C2668g.b(nameResolver, "nameResolver");
            C2668g.b(typeTable, "typeTable");
            super();
            this.descriptor = propertyDescriptor;
            this.proto = property;
            this.signature = jvmPropertySignature;
            this.nameResolver = nameResolver;
            this.typeTable = typeTable;
            if (this.signature.hasGetter() != null) {
                propertyDescriptor = new StringBuilder();
                property = this.nameResolver;
                jvmPropertySignature = this.signature.getGetter();
                C2668g.a(jvmPropertySignature, "signature.getter");
                propertyDescriptor.append(property.getString(jvmPropertySignature.getName()));
                property = this.nameResolver;
                jvmPropertySignature = this.signature.getGetter();
                C2668g.a(jvmPropertySignature, "signature.getter");
                propertyDescriptor.append(property.getString(jvmPropertySignature.getDesc()));
                propertyDescriptor = propertyDescriptor.toString();
            } else {
                propertyDescriptor = JvmProtoBufUtil.INSTANCE.getJvmFieldSignature(this.proto, this.nameResolver, this.typeTable);
                if (propertyDescriptor != null) {
                    property = propertyDescriptor.component1();
                    propertyDescriptor = propertyDescriptor.component2();
                    jvmPropertySignature = new StringBuilder();
                    jvmPropertySignature.append(JvmAbi.getterName(property));
                    jvmPropertySignature.append(getManglingSuffix());
                    jvmPropertySignature.append("()");
                    jvmPropertySignature.append(propertyDescriptor);
                    propertyDescriptor = jvmPropertySignature.toString();
                } else {
                    property = new StringBuilder();
                    property.append("No field signature for property: ");
                    property.append(this.descriptor);
                    throw ((Throwable) new KotlinReflectionInternalError(property.toString()));
                }
            }
            this.string = propertyDescriptor;
        }

        private final String getManglingSuffix() {
            DeclarationDescriptor containingDeclaration = this.descriptor.getContainingDeclaration();
            StringBuilder stringBuilder;
            if (C2668g.a(this.descriptor.getVisibility(), Visibilities.INTERNAL) && (containingDeclaration instanceof DeserializedClassDescriptor)) {
                String string;
                ExtendableMessage classProto = ((DeserializedClassDescriptor) containingDeclaration).getClassProto();
                GeneratedExtension generatedExtension = JvmProtoBuf.classModuleName;
                C2668g.a(generatedExtension, "JvmProtoBuf.classModuleName");
                Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(classProto, generatedExtension);
                if (num != null) {
                    string = this.nameResolver.getString(num.intValue());
                    if (string != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("$");
                        stringBuilder.append(NameUtils.sanitizeAsJavaIdentifier(string));
                        return stringBuilder.toString();
                    }
                }
                string = "main";
                stringBuilder = new StringBuilder();
                stringBuilder.append("$");
                stringBuilder.append(NameUtils.sanitizeAsJavaIdentifier(string));
                return stringBuilder.toString();
            }
            if (C2668g.a(this.descriptor.getVisibility(), Visibilities.PRIVATE) && (containingDeclaration instanceof PackageFragmentDescriptor)) {
                PropertyDescriptor propertyDescriptor = this.descriptor;
                if (propertyDescriptor == null) {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                }
                DeserializedContainerSource containerSource = ((DeserializedPropertyDescriptor) propertyDescriptor).getContainerSource();
                if (containerSource instanceof JvmPackagePartSource) {
                    JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) containerSource;
                    if (jvmPackagePartSource.getFacadeClassName() != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("$");
                        stringBuilder.append(jvmPackagePartSource.getSimpleName().asString());
                        return stringBuilder.toString();
                    }
                }
            }
            return "";
        }

        @NotNull
        public String asString() {
            return this.string;
        }
    }

    @NotNull
    public abstract String asString();

    private JvmPropertySignature() {
    }
}
