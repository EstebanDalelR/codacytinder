package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType;

public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final ExtensionDescriptor descriptor;
        final Method enumValueOf;
        final MessageLite messageDefaultInstance;
        final Class singularType;

        GeneratedExtension(ContainingType containingType, Type type, MessageLite messageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (containingType == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (extensionDescriptor.getLiteType() == FieldType.MESSAGE && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.containingTypeDefaultInstance = containingType;
                this.defaultValue = type;
                this.messageDefaultInstance = messageLite;
                this.descriptor = extensionDescriptor;
                this.singularType = cls;
                if (EnumLite.class.isAssignableFrom(cls) != null) {
                    this.enumValueOf = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", new Class[]{Integer.TYPE});
                    return;
                }
                this.enumValueOf = null;
            }
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        public int getNumber() {
            return this.descriptor.getNumber();
        }

        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != JavaType.ENUM) {
                return obj;
            }
            List arrayList = new ArrayList();
            for (Object singularFromFieldSetType : (List) obj) {
                arrayList.add(singularFromFieldSetType(singularFromFieldSetType));
            }
            return arrayList;
        }

        Object singularFromFieldSetType(Object obj) {
            if (this.descriptor.getLiteJavaType() != JavaType.ENUM) {
                return obj;
            }
            return GeneratedMessageLite.invokeOrDie(this.enumValueOf, null, (Integer) obj);
        }

        Object singularToFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == JavaType.ENUM ? Integer.valueOf(((EnumLite) obj).getNumber()) : obj;
        }
    }

    public interface ExtendableMessageOrBuilder extends MessageLiteOrBuilder {
    }

    static final class ExtensionDescriptor implements FieldDescriptorLite<ExtensionDescriptor> {
        final EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final FieldType type;

        ExtensionDescriptor(EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, boolean z, boolean z2) {
            this.enumTypeMap = enumLiteMap;
            this.number = i;
            this.type = fieldType;
            this.isRepeated = z;
            this.isPacked = z2;
        }

        public int getNumber() {
            return this.number;
        }

        public FieldType getLiteType() {
            return this.type;
        }

        public JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        public boolean isRepeated() {
            return this.isRepeated;
        }

        public boolean isPacked() {
            return this.isPacked;
        }

        public EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder internalMergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.number - extensionDescriptor.number;
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder<BuilderType> {
        private ByteString unknownFields = ByteString.EMPTY;

        public abstract MessageType getDefaultInstanceForType();

        public abstract BuilderType mergeFrom(MessageType messageType);

        protected Builder() {
        }

        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final ByteString getUnknownFields() {
            return this.unknownFields;
        }

        public final BuilderType setUnknownFields(ByteString byteString) {
            this.unknownFields = byteString;
            return this;
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {
        private FieldSet<ExtensionDescriptor> extensions = FieldSet.emptySet();
        private boolean extensionsIsMutable;

        protected ExtendableBuilder() {
        }

        private void ensureExtensionsIsMutable() {
            if (!this.extensionsIsMutable) {
                this.extensions = this.extensions.clone();
                this.extensionsIsMutable = true;
            }
        }

        private FieldSet<ExtensionDescriptor> buildExtensions() {
            this.extensions.makeImmutable();
            this.extensionsIsMutable = false;
            return this.extensions;
        }

        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected final void mergeExtensionFields(MessageType messageType) {
            ensureExtensionsIsMutable();
            this.extensions.mergeFrom(messageType.extensions);
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {
        private final FieldSet<ExtensionDescriptor> extensions;

        protected class ExtensionWriter {
            private final Iterator<Entry<ExtensionDescriptor, Object>> iter;
            private final boolean messageSetWireFormat;
            private Entry<ExtensionDescriptor, Object> next;

            private ExtensionWriter(boolean z) {
                this.iter = ExtendableMessage.this.extensions.iterator();
                if (this.iter.hasNext() != null) {
                    this.next = (Entry) this.iter.next();
                }
                this.messageSetWireFormat = z;
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (this.next != null && ((ExtensionDescriptor) this.next.getKey()).getNumber() < i) {
                    ExtensionDescriptor extensionDescriptor = (ExtensionDescriptor) this.next.getKey();
                    if (this.messageSetWireFormat && extensionDescriptor.getLiteJavaType() == JavaType.MESSAGE && !extensionDescriptor.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(extensionDescriptor.getNumber(), (MessageLite) this.next.getValue());
                    } else {
                        FieldSet.writeField(extensionDescriptor, this.next.getValue(), codedOutputStream);
                    }
                    if (this.iter.hasNext()) {
                        this.next = (Entry) this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        protected ExtendableMessage() {
            this.extensions = FieldSet.newFieldSet();
        }

        protected ExtendableMessage(ExtendableBuilder<MessageType, ?> extendableBuilder) {
            this.extensions = extendableBuilder.buildExtensions();
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.hasField(generatedExtension.descriptor);
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            Object field = this.extensions.getField(generatedExtension.descriptor);
            if (field == null) {
                return generatedExtension.defaultValue;
            }
            return generatedExtension.fromFieldSetType(field);
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i) {
            verifyExtensionContainingType(generatedExtension);
            return generatedExtension.singularFromFieldSetType(this.extensions.getRepeatedField(generatedExtension.descriptor, i));
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            return GeneratedMessageLite.parseUnknownField(this.extensions, getDefaultInstanceForType(), codedInputStream, codedOutputStream, extensionRegistryLite, i);
        }

        protected void makeExtensionsImmutable() {
            this.extensions.makeImmutable();
        }

        protected ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(false);
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }
    }

    protected void makeExtensionsImmutable() {
    }

    protected GeneratedMessageLite() {
    }

    protected GeneratedMessageLite(Builder builder) {
    }

    public Parser<? extends MessageLite> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        return codedInputStream.skipField(i, codedOutputStream);
    }

    private static <MessageType extends MessageLite> boolean parseUnknownField(FieldSet<ExtensionDescriptor> fieldSet, MessageType messageType, CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        Object obj;
        Object obj2;
        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder;
        MessageLite messageLite;
        int tagWireType = WireFormat.getTagWireType(i);
        messageType = extensionRegistryLite.findLiteExtensionByNumber(messageType, WireFormat.getTagFieldNumber(i));
        if (messageType != null) {
            if (tagWireType == FieldSet.getWireFormatForFieldType(messageType.descriptor.getLiteType(), false)) {
                obj = null;
                obj2 = null;
                if (obj == null) {
                    return codedInputStream.skipField(i, codedOutputStream);
                }
                if (obj2 != null) {
                    codedOutputStream = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                    if (messageType.descriptor.getLiteType() == FieldType.ENUM) {
                        while (codedInputStream.getBytesUntilLimit() > null) {
                            extensionRegistryLite = messageType.descriptor.getEnumType().findValueByNumber(codedInputStream.readEnum());
                            if (extensionRegistryLite != null) {
                                return true;
                            }
                            fieldSet.addRepeatedField(messageType.descriptor, messageType.singularToFieldSetType(extensionRegistryLite));
                        }
                    } else {
                        while (codedInputStream.getBytesUntilLimit() > null) {
                            fieldSet.addRepeatedField(messageType.descriptor, FieldSet.readPrimitiveField(codedInputStream, messageType.descriptor.getLiteType(), false));
                        }
                    }
                    codedInputStream.popLimit(codedOutputStream);
                } else {
                    switch (messageType.descriptor.getLiteJavaType()) {
                        case MESSAGE:
                            builder = null;
                            if (messageType.descriptor.isRepeated() == 0) {
                                messageLite = (MessageLite) fieldSet.getField(messageType.descriptor);
                                if (messageLite != null) {
                                    builder = messageLite.toBuilder();
                                }
                            }
                            if (builder == null) {
                                builder = messageType.getMessageDefaultInstance().newBuilderForType();
                            }
                            if (messageType.descriptor.getLiteType() == FieldType.GROUP) {
                                codedInputStream.readGroup(messageType.getNumber(), builder, extensionRegistryLite);
                            } else {
                                codedInputStream.readMessage(builder, extensionRegistryLite);
                            }
                            extensionRegistryLite = builder.build();
                            break;
                        case ENUM:
                            codedInputStream = codedInputStream.readEnum();
                            extensionRegistryLite = messageType.descriptor.getEnumType().findValueByNumber(codedInputStream);
                            if (extensionRegistryLite == null) {
                                codedOutputStream.writeRawVarint32(i);
                                codedOutputStream.writeUInt32NoTag(codedInputStream);
                                return true;
                            }
                            break;
                        default:
                            extensionRegistryLite = FieldSet.readPrimitiveField(codedInputStream, messageType.descriptor.getLiteType(), false);
                            break;
                    }
                    if (messageType.descriptor.isRepeated() != null) {
                        fieldSet.addRepeatedField(messageType.descriptor, messageType.singularToFieldSetType(extensionRegistryLite));
                    } else {
                        fieldSet.setField(messageType.descriptor, messageType.singularToFieldSetType(extensionRegistryLite));
                    }
                }
                return true;
            } else if (messageType.descriptor.isRepeated && messageType.descriptor.type.isPackable() && tagWireType == FieldSet.getWireFormatForFieldType(messageType.descriptor.getLiteType(), true)) {
                obj = null;
                obj2 = 1;
                if (obj == null) {
                    return codedInputStream.skipField(i, codedOutputStream);
                }
                if (obj2 != null) {
                    switch (messageType.descriptor.getLiteJavaType()) {
                        case MESSAGE:
                            builder = null;
                            if (messageType.descriptor.isRepeated() == 0) {
                                messageLite = (MessageLite) fieldSet.getField(messageType.descriptor);
                                if (messageLite != null) {
                                    builder = messageLite.toBuilder();
                                }
                            }
                            if (builder == null) {
                                builder = messageType.getMessageDefaultInstance().newBuilderForType();
                            }
                            if (messageType.descriptor.getLiteType() == FieldType.GROUP) {
                                codedInputStream.readMessage(builder, extensionRegistryLite);
                            } else {
                                codedInputStream.readGroup(messageType.getNumber(), builder, extensionRegistryLite);
                            }
                            extensionRegistryLite = builder.build();
                            break;
                        case ENUM:
                            codedInputStream = codedInputStream.readEnum();
                            extensionRegistryLite = messageType.descriptor.getEnumType().findValueByNumber(codedInputStream);
                            if (extensionRegistryLite == null) {
                                codedOutputStream.writeRawVarint32(i);
                                codedOutputStream.writeUInt32NoTag(codedInputStream);
                                return true;
                            }
                            break;
                        default:
                            extensionRegistryLite = FieldSet.readPrimitiveField(codedInputStream, messageType.descriptor.getLiteType(), false);
                            break;
                    }
                    if (messageType.descriptor.isRepeated() != null) {
                        fieldSet.setField(messageType.descriptor, messageType.singularToFieldSetType(extensionRegistryLite));
                    } else {
                        fieldSet.addRepeatedField(messageType.descriptor, messageType.singularToFieldSetType(extensionRegistryLite));
                    }
                } else {
                    codedOutputStream = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                    if (messageType.descriptor.getLiteType() == FieldType.ENUM) {
                        while (codedInputStream.getBytesUntilLimit() > null) {
                            fieldSet.addRepeatedField(messageType.descriptor, FieldSet.readPrimitiveField(codedInputStream, messageType.descriptor.getLiteType(), false));
                        }
                    } else {
                        while (codedInputStream.getBytesUntilLimit() > null) {
                            extensionRegistryLite = messageType.descriptor.getEnumType().findValueByNumber(codedInputStream.readEnum());
                            if (extensionRegistryLite != null) {
                                return true;
                            }
                            fieldSet.addRepeatedField(messageType.descriptor, messageType.singularToFieldSetType(extensionRegistryLite));
                        }
                    }
                    codedInputStream.popLimit(codedOutputStream);
                }
                return true;
            }
        }
        obj = 1;
        obj2 = null;
        if (obj == null) {
            return codedInputStream.skipField(i, codedOutputStream);
        }
        if (obj2 != null) {
            codedOutputStream = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
            if (messageType.descriptor.getLiteType() == FieldType.ENUM) {
                while (codedInputStream.getBytesUntilLimit() > null) {
                    extensionRegistryLite = messageType.descriptor.getEnumType().findValueByNumber(codedInputStream.readEnum());
                    if (extensionRegistryLite != null) {
                        return true;
                    }
                    fieldSet.addRepeatedField(messageType.descriptor, messageType.singularToFieldSetType(extensionRegistryLite));
                }
            } else {
                while (codedInputStream.getBytesUntilLimit() > null) {
                    fieldSet.addRepeatedField(messageType.descriptor, FieldSet.readPrimitiveField(codedInputStream, messageType.descriptor.getLiteType(), false));
                }
            }
            codedInputStream.popLimit(codedOutputStream);
        } else {
            switch (messageType.descriptor.getLiteJavaType()) {
                case MESSAGE:
                    builder = null;
                    if (messageType.descriptor.isRepeated() == 0) {
                        messageLite = (MessageLite) fieldSet.getField(messageType.descriptor);
                        if (messageLite != null) {
                            builder = messageLite.toBuilder();
                        }
                    }
                    if (builder == null) {
                        builder = messageType.getMessageDefaultInstance().newBuilderForType();
                    }
                    if (messageType.descriptor.getLiteType() == FieldType.GROUP) {
                        codedInputStream.readGroup(messageType.getNumber(), builder, extensionRegistryLite);
                    } else {
                        codedInputStream.readMessage(builder, extensionRegistryLite);
                    }
                    extensionRegistryLite = builder.build();
                    break;
                case ENUM:
                    codedInputStream = codedInputStream.readEnum();
                    extensionRegistryLite = messageType.descriptor.getEnumType().findValueByNumber(codedInputStream);
                    if (extensionRegistryLite == null) {
                        codedOutputStream.writeRawVarint32(i);
                        codedOutputStream.writeUInt32NoTag(codedInputStream);
                        return true;
                    }
                    break;
                default:
                    extensionRegistryLite = FieldSet.readPrimitiveField(codedInputStream, messageType.descriptor.getLiteType(), false);
                    break;
            }
            if (messageType.descriptor.isRepeated() != null) {
                fieldSet.addRepeatedField(messageType.descriptor, messageType.singularToFieldSetType(extensionRegistryLite));
            } else {
                fieldSet.setField(messageType.descriptor, messageType.singularToFieldSetType(extensionRegistryLite));
            }
        }
        return true;
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingType, Type type, MessageLite messageLite, EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, Class cls) {
        return new GeneratedExtension(containingType, type, messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, false, false), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingType, MessageLite messageLite, EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension(containingType, Collections.emptyList(), messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, true, z), cls);
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (Class[] clsArr2) {
            cls = String.valueOf(String.valueOf(cls.getName()));
            str = String.valueOf(String.valueOf(str));
            StringBuilder stringBuilder = new StringBuilder((cls.length() + 45) + str.length());
            stringBuilder.append("Generated message class \"");
            stringBuilder.append(cls);
            stringBuilder.append("\" missing method \"");
            stringBuilder.append(str);
            stringBuilder.append("\".");
            throw new RuntimeException(stringBuilder.toString(), clsArr2);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (Method method2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", method2);
        } catch (Method method22) {
            method22 = method22.getCause();
            if ((method22 instanceof RuntimeException) != null) {
                throw ((RuntimeException) method22);
            } else if ((method22 instanceof Error) != null) {
                throw ((Error) method22);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", method22);
            }
        }
    }
}
