package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AnnotationAndConstantLoaderImpl implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>, AnnotationWithTarget> {
    private final AnnotationDeserializer deserializer;
    private final SerializerExtensionProtocol protocol;

    public AnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses, @NotNull SerializerExtensionProtocol serializerExtensionProtocol) {
        C2668g.b(moduleDescriptor, "module");
        C2668g.b(notFoundClasses, "notFoundClasses");
        C2668g.b(serializerExtensionProtocol, "protocol");
        this.protocol = serializerExtensionProtocol;
        this.deserializer = new AnnotationDeserializer(moduleDescriptor, notFoundClasses);
    }

    @NotNull
    public List<AnnotationDescriptor> loadClassAnnotations(@NotNull Class classR) {
        C2668g.b(classR, "container");
        List list = (List) classR.getClassProto().getExtension(this.protocol.getClassAnnotation());
        if (list == null) {
            list = C17554o.m64195a();
        }
        Iterable<Annotation> iterable = list;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Annotation deserializeAnnotation : iterable) {
            arrayList.add(this.deserializer.deserializeAnnotation(deserializeAnnotation, classR.getNameResolver()));
        }
        return (List) arrayList;
    }

    @NotNull
    public List<AnnotationWithTarget> loadCallableAnnotations(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        C2668g.b(protoContainer, "container");
        C2668g.b(messageLite, "proto");
        C2668g.b(annotatedCallableKind, "kind");
        if ((messageLite instanceof Constructor) != null) {
            messageLite = (List) ((Constructor) messageLite).getExtension(this.protocol.getConstructorAnnotation());
        } else if ((messageLite instanceof Function) != null) {
            messageLite = (List) ((Function) messageLite).getExtension(this.protocol.getFunctionAnnotation());
        } else if ((messageLite instanceof Property) != null) {
            messageLite = (List) ((Property) messageLite).getExtension(this.protocol.getPropertyAnnotation());
        } else {
            protoContainer = new StringBuilder();
            protoContainer.append("Unknown message: ");
            protoContainer.append(messageLite);
            throw ((Throwable) new IllegalStateException(protoContainer.toString().toString()));
        }
        if (messageLite == null) {
            messageLite = C17554o.m64195a();
        }
        Iterable<Annotation> iterable = (Iterable) messageLite;
        Collection collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Annotation deserializeAnnotation : iterable) {
            collection.add(new AnnotationWithTarget(this.deserializer.deserializeAnnotation(deserializeAnnotation, protoContainer.getNameResolver()), null));
        }
        return (List) collection;
    }

    @NotNull
    public List<AnnotationDescriptor> loadEnumEntryAnnotations(@NotNull ProtoContainer protoContainer, @NotNull EnumEntry enumEntry) {
        C2668g.b(protoContainer, "container");
        C2668g.b(enumEntry, "proto");
        enumEntry = (List) enumEntry.getExtension(this.protocol.getEnumEntryAnnotation());
        if (enumEntry == null) {
            enumEntry = C17554o.m64195a();
        }
        Iterable<Annotation> iterable = (Iterable) enumEntry;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Annotation deserializeAnnotation : iterable) {
            arrayList.add(this.deserializer.deserializeAnnotation(deserializeAnnotation, protoContainer.getNameResolver()));
        }
        return (List) arrayList;
    }

    @NotNull
    public List<AnnotationDescriptor> loadValueParameterAnnotations(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @NotNull ValueParameter valueParameter) {
        C2668g.b(protoContainer, "container");
        C2668g.b(messageLite, "callableProto");
        C2668g.b(annotatedCallableKind, "kind");
        C2668g.b(valueParameter, "proto");
        messageLite = (List) valueParameter.getExtension(this.protocol.getParameterAnnotation());
        if (messageLite == null) {
            messageLite = C17554o.m64195a();
        }
        Iterable<Annotation> iterable = (Iterable) messageLite;
        Collection collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Annotation deserializeAnnotation : iterable) {
            collection.add(this.deserializer.deserializeAnnotation(deserializeAnnotation, protoContainer.getNameResolver()));
        }
        return (List) collection;
    }

    @NotNull
    public List<AnnotationDescriptor> loadExtensionReceiverParameterAnnotations(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        C2668g.b(protoContainer, "container");
        C2668g.b(messageLite, "proto");
        C2668g.b(annotatedCallableKind, "kind");
        return C17554o.m64195a();
    }

    @NotNull
    public List<AnnotationDescriptor> loadTypeAnnotations(@NotNull Type type, @NotNull NameResolver nameResolver) {
        C2668g.b(type, "proto");
        C2668g.b(nameResolver, "nameResolver");
        type = (List) type.getExtension(this.protocol.getTypeAnnotation());
        if (type == null) {
            type = C17554o.m64195a();
        }
        Iterable<Annotation> iterable = (Iterable) type;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Annotation deserializeAnnotation : iterable) {
            arrayList.add(this.deserializer.deserializeAnnotation(deserializeAnnotation, nameResolver));
        }
        return (List) arrayList;
    }

    @NotNull
    public List<AnnotationDescriptor> loadTypeParameterAnnotations(@NotNull TypeParameter typeParameter, @NotNull NameResolver nameResolver) {
        C2668g.b(typeParameter, "proto");
        C2668g.b(nameResolver, "nameResolver");
        typeParameter = (List) typeParameter.getExtension(this.protocol.getTypeParameterAnnotation());
        if (typeParameter == null) {
            typeParameter = C17554o.m64195a();
        }
        Iterable<Annotation> iterable = (Iterable) typeParameter;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Annotation deserializeAnnotation : iterable) {
            arrayList.add(this.deserializer.deserializeAnnotation(deserializeAnnotation, nameResolver));
        }
        return (List) arrayList;
    }

    @Nullable
    public ConstantValue<?> loadPropertyConstant(@NotNull ProtoContainer protoContainer, @NotNull Property property, @NotNull KotlinType kotlinType) {
        C2668g.b(protoContainer, "container");
        C2668g.b(property, "proto");
        C2668g.b(kotlinType, "expectedType");
        Value value = (Value) ProtoBufUtilKt.getExtensionOrNull(property, this.protocol.getCompileTimeValue());
        return value != null ? this.deserializer.resolveValue(kotlinType, value, protoContainer.getNameResolver()) : null;
    }
}
