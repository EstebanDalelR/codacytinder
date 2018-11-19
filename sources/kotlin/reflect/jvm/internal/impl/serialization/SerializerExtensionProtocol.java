package kotlin.reflect.jvm.internal.impl.serialization;

import java.util.List;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import org.jetbrains.annotations.NotNull;

public class SerializerExtensionProtocol {
    @NotNull
    private final GeneratedExtension<Class, List<Annotation>> classAnnotation;
    @NotNull
    private final GeneratedExtension<Property, Value> compileTimeValue;
    @NotNull
    private final GeneratedExtension<Constructor, List<Annotation>> constructorAnnotation;
    @NotNull
    private final GeneratedExtension<EnumEntry, List<Annotation>> enumEntryAnnotation;
    @NotNull
    private final ExtensionRegistryLite extensionRegistry;
    @NotNull
    private final GeneratedExtension<Function, List<Annotation>> functionAnnotation;
    @NotNull
    private final GeneratedExtension<Package, Integer> packageFqName;
    @NotNull
    private final GeneratedExtension<ValueParameter, List<Annotation>> parameterAnnotation;
    @NotNull
    private final GeneratedExtension<Property, List<Annotation>> propertyAnnotation;
    @NotNull
    private final GeneratedExtension<Type, List<Annotation>> typeAnnotation;
    @NotNull
    private final GeneratedExtension<TypeParameter, List<Annotation>> typeParameterAnnotation;

    public SerializerExtensionProtocol(@NotNull ExtensionRegistryLite extensionRegistryLite, @NotNull GeneratedExtension<Package, Integer> generatedExtension, @NotNull GeneratedExtension<Constructor, List<Annotation>> generatedExtension2, @NotNull GeneratedExtension<Class, List<Annotation>> generatedExtension3, @NotNull GeneratedExtension<Function, List<Annotation>> generatedExtension4, @NotNull GeneratedExtension<Property, List<Annotation>> generatedExtension5, @NotNull GeneratedExtension<EnumEntry, List<Annotation>> generatedExtension6, @NotNull GeneratedExtension<Property, Value> generatedExtension7, @NotNull GeneratedExtension<ValueParameter, List<Annotation>> generatedExtension8, @NotNull GeneratedExtension<Type, List<Annotation>> generatedExtension9, @NotNull GeneratedExtension<TypeParameter, List<Annotation>> generatedExtension10) {
        C2668g.b(extensionRegistryLite, "extensionRegistry");
        C2668g.b(generatedExtension, "packageFqName");
        C2668g.b(generatedExtension2, "constructorAnnotation");
        C2668g.b(generatedExtension3, "classAnnotation");
        C2668g.b(generatedExtension4, "functionAnnotation");
        C2668g.b(generatedExtension5, "propertyAnnotation");
        C2668g.b(generatedExtension6, "enumEntryAnnotation");
        C2668g.b(generatedExtension7, "compileTimeValue");
        C2668g.b(generatedExtension8, "parameterAnnotation");
        C2668g.b(generatedExtension9, "typeAnnotation");
        C2668g.b(generatedExtension10, "typeParameterAnnotation");
        this.extensionRegistry = extensionRegistryLite;
        this.packageFqName = generatedExtension;
        this.constructorAnnotation = generatedExtension2;
        this.classAnnotation = generatedExtension3;
        this.functionAnnotation = generatedExtension4;
        this.propertyAnnotation = generatedExtension5;
        this.enumEntryAnnotation = generatedExtension6;
        this.compileTimeValue = generatedExtension7;
        this.parameterAnnotation = generatedExtension8;
        this.typeAnnotation = generatedExtension9;
        this.typeParameterAnnotation = generatedExtension10;
    }

    @NotNull
    public final ExtensionRegistryLite getExtensionRegistry() {
        return this.extensionRegistry;
    }

    @NotNull
    public final GeneratedExtension<Constructor, List<Annotation>> getConstructorAnnotation() {
        return this.constructorAnnotation;
    }

    @NotNull
    public final GeneratedExtension<Class, List<Annotation>> getClassAnnotation() {
        return this.classAnnotation;
    }

    @NotNull
    public final GeneratedExtension<Function, List<Annotation>> getFunctionAnnotation() {
        return this.functionAnnotation;
    }

    @NotNull
    public final GeneratedExtension<Property, List<Annotation>> getPropertyAnnotation() {
        return this.propertyAnnotation;
    }

    @NotNull
    public final GeneratedExtension<EnumEntry, List<Annotation>> getEnumEntryAnnotation() {
        return this.enumEntryAnnotation;
    }

    @NotNull
    public final GeneratedExtension<Property, Value> getCompileTimeValue() {
        return this.compileTimeValue;
    }

    @NotNull
    public final GeneratedExtension<ValueParameter, List<Annotation>> getParameterAnnotation() {
        return this.parameterAnnotation;
    }

    @NotNull
    public final GeneratedExtension<Type, List<Annotation>> getTypeAnnotation() {
        return this.typeAnnotation;
    }

    @NotNull
    public final GeneratedExtension<TypeParameter, List<Annotation>> getTypeParameterAnnotation() {
        return this.typeParameterAnnotation;
    }
}
