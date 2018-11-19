package com.google.protobuf;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor.JavaType;
import com.google.protobuf.Descriptors.FieldDescriptor.Type;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.ExtensionRegistry.ExtensionInfo;
import com.google.protobuf.Message.Builder;
import com.google.protobuf.UnknownFieldSet.Field;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class MessageReflection {

    interface MergeTarget {

        public enum ContainerType {
            MESSAGE,
            EXTENSION_SET
        }

        MergeTarget addRepeatedField(FieldDescriptor fieldDescriptor, Object obj);

        MergeTarget clearField(FieldDescriptor fieldDescriptor);

        MergeTarget clearOneof(OneofDescriptor oneofDescriptor);

        ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str);

        ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptor descriptor, int i);

        Object finish();

        ContainerType getContainerType();

        Descriptor getDescriptorForType();

        Object getField(FieldDescriptor fieldDescriptor);

        FieldDescriptor getOneofFieldDescriptor(OneofDescriptor oneofDescriptor);

        Utf8Validation getUtf8Validation(FieldDescriptor fieldDescriptor);

        boolean hasField(FieldDescriptor fieldDescriptor);

        boolean hasOneof(OneofDescriptor oneofDescriptor);

        MergeTarget newMergeTargetForField(FieldDescriptor fieldDescriptor, Message message);

        Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) throws IOException;

        Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) throws IOException;

        Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) throws IOException;

        MergeTarget setField(FieldDescriptor fieldDescriptor, Object obj);

        MergeTarget setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj);
    }

    static class BuilderAdapter implements MergeTarget {
        private final Builder builder;

        public Descriptor getDescriptorForType() {
            return this.builder.getDescriptorForType();
        }

        public BuilderAdapter(Builder builder) {
            this.builder = builder;
        }

        public Object getField(FieldDescriptor fieldDescriptor) {
            return this.builder.getField(fieldDescriptor);
        }

        public boolean hasField(FieldDescriptor fieldDescriptor) {
            return this.builder.hasField(fieldDescriptor);
        }

        public MergeTarget setField(FieldDescriptor fieldDescriptor, Object obj) {
            this.builder.setField(fieldDescriptor, obj);
            return this;
        }

        public MergeTarget clearField(FieldDescriptor fieldDescriptor) {
            this.builder.clearField(fieldDescriptor);
            return this;
        }

        public MergeTarget setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj) {
            this.builder.setRepeatedField(fieldDescriptor, i, obj);
            return this;
        }

        public MergeTarget addRepeatedField(FieldDescriptor fieldDescriptor, Object obj) {
            this.builder.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        public boolean hasOneof(OneofDescriptor oneofDescriptor) {
            return this.builder.hasOneof(oneofDescriptor);
        }

        public MergeTarget clearOneof(OneofDescriptor oneofDescriptor) {
            this.builder.clearOneof(oneofDescriptor);
            return this;
        }

        public FieldDescriptor getOneofFieldDescriptor(OneofDescriptor oneofDescriptor) {
            return this.builder.getOneofFieldDescriptor(oneofDescriptor);
        }

        public ContainerType getContainerType() {
            return ContainerType.MESSAGE;
        }

        public ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str) {
            return extensionRegistry.findImmutableExtensionByName(str);
        }

        public ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptor descriptor, int i) {
            return extensionRegistry.findImmutableExtensionByNumber(descriptor, i);
        }

        public Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) throws IOException {
            MessageLite.Builder newBuilderForType;
            if (message != null) {
                newBuilderForType = message.newBuilderForType();
            } else {
                newBuilderForType = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            codedInputStream.readGroup(fieldDescriptor.getNumber(), newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) throws IOException {
            MessageLite.Builder newBuilderForType;
            if (message != null) {
                newBuilderForType = message.newBuilderForType();
            } else {
                newBuilderForType = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            codedInputStream.readMessage(newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) throws IOException {
            if (message != null) {
                message = message.newBuilderForType();
            } else {
                message = this.builder.newBuilderForField(fieldDescriptor);
            }
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    message.mergeFrom(message2);
                }
            }
            message.mergeFrom(byteString, extensionRegistryLite);
            return message.buildPartial();
        }

        public MergeTarget newMergeTargetForField(FieldDescriptor fieldDescriptor, Message message) {
            if (message != null) {
                return new BuilderAdapter(message.newBuilderForType());
            }
            return new BuilderAdapter(this.builder.newBuilderForField(fieldDescriptor));
        }

        public Utf8Validation getUtf8Validation(FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.needsUtf8Check()) {
                return Utf8Validation.STRICT;
            }
            if (fieldDescriptor.isRepeated() != null || (this.builder instanceof GeneratedMessage.Builder) == null) {
                return Utf8Validation.LOOSE;
            }
            return Utf8Validation.LAZY;
        }

        public Object finish() {
            return this.builder.buildPartial();
        }
    }

    static class ExtensionAdapter implements MergeTarget {
        private final FieldSet<FieldDescriptor> extensions;

        public MergeTarget clearOneof(OneofDescriptor oneofDescriptor) {
            return this;
        }

        public FieldDescriptor getOneofFieldDescriptor(OneofDescriptor oneofDescriptor) {
            return null;
        }

        public boolean hasOneof(OneofDescriptor oneofDescriptor) {
            return false;
        }

        ExtensionAdapter(FieldSet<FieldDescriptor> fieldSet) {
            this.extensions = fieldSet;
        }

        public Descriptor getDescriptorForType() {
            throw new UnsupportedOperationException("getDescriptorForType() called on FieldSet object");
        }

        public Object getField(FieldDescriptor fieldDescriptor) {
            return this.extensions.getField(fieldDescriptor);
        }

        public boolean hasField(FieldDescriptor fieldDescriptor) {
            return this.extensions.hasField(fieldDescriptor);
        }

        public MergeTarget setField(FieldDescriptor fieldDescriptor, Object obj) {
            this.extensions.setField(fieldDescriptor, obj);
            return this;
        }

        public MergeTarget clearField(FieldDescriptor fieldDescriptor) {
            this.extensions.clearField(fieldDescriptor);
            return this;
        }

        public MergeTarget setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj) {
            this.extensions.setRepeatedField(fieldDescriptor, i, obj);
            return this;
        }

        public MergeTarget addRepeatedField(FieldDescriptor fieldDescriptor, Object obj) {
            this.extensions.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        public ContainerType getContainerType() {
            return ContainerType.EXTENSION_SET;
        }

        public ExtensionInfo findExtensionByName(ExtensionRegistry extensionRegistry, String str) {
            return extensionRegistry.findImmutableExtensionByName(str);
        }

        public ExtensionInfo findExtensionByNumber(ExtensionRegistry extensionRegistry, Descriptor descriptor, int i) {
            return extensionRegistry.findImmutableExtensionByNumber(descriptor, i);
        }

        public Object parseGroup(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) throws IOException {
            MessageLite.Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            codedInputStream.readGroup(fieldDescriptor.getNumber(), newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public Object parseMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) throws IOException {
            MessageLite.Builder newBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    newBuilderForType.mergeFrom(message2);
                }
            }
            codedInputStream.readMessage(newBuilderForType, extensionRegistryLite);
            return newBuilderForType.buildPartial();
        }

        public Object parseMessageFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, FieldDescriptor fieldDescriptor, Message message) throws IOException {
            message = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated()) {
                Message message2 = (Message) getField(fieldDescriptor);
                if (message2 != null) {
                    message.mergeFrom(message2);
                }
            }
            message.mergeFrom(byteString, extensionRegistryLite);
            return message.buildPartial();
        }

        public MergeTarget newMergeTargetForField(FieldDescriptor fieldDescriptor, Message message) {
            throw new UnsupportedOperationException("newMergeTargetForField() called on FieldSet object");
        }

        public Utf8Validation getUtf8Validation(FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.needsUtf8Check() != null) {
                return Utf8Validation.STRICT;
            }
            return Utf8Validation.LOOSE;
        }

        public Object finish() {
            throw new UnsupportedOperationException("finish() called on FieldSet object");
        }
    }

    MessageReflection() {
    }

    static void writeMessageTo(Message message, Map<FieldDescriptor, Object> map, CodedOutputStream codedOutputStream, boolean z) throws IOException {
        FieldDescriptor fieldDescriptor;
        boolean messageSetWireFormat = message.getDescriptorForType().getOptions().getMessageSetWireFormat();
        if (z) {
            z = new TreeMap(map);
            map = message.getDescriptorForType().getFields().iterator();
            while (map.hasNext()) {
                fieldDescriptor = (FieldDescriptor) map.next();
                if (fieldDescriptor.isRequired() && !z.containsKey(fieldDescriptor)) {
                    z.put(fieldDescriptor, message.getField(fieldDescriptor));
                }
            }
            map = z;
        }
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            fieldDescriptor = (FieldDescriptor) entry.getKey();
            z = entry.getValue();
            if (messageSetWireFormat && fieldDescriptor.isExtension() && fieldDescriptor.getType() == Type.MESSAGE && !fieldDescriptor.isRepeated()) {
                codedOutputStream.writeMessageSetExtension(fieldDescriptor.getNumber(), (Message) z);
            } else {
                FieldSet.writeField(fieldDescriptor, z, codedOutputStream);
            }
        }
        message = message.getUnknownFields();
        if (messageSetWireFormat) {
            message.writeAsMessageSetTo(codedOutputStream);
        } else {
            message.writeTo(codedOutputStream);
        }
    }

    static int getSerializedSize(Message message, Map<FieldDescriptor, Object> map) {
        boolean messageSetWireFormat = message.getDescriptorForType().getOptions().getMessageSetWireFormat();
        map = map.entrySet().iterator();
        int i = 0;
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            FieldDescriptor fieldDescriptor = (FieldDescriptor) entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && fieldDescriptor.isExtension() && fieldDescriptor.getType() == Type.MESSAGE && !fieldDescriptor.isRepeated()) {
                i += CodedOutputStream.computeMessageSetExtensionSize(fieldDescriptor.getNumber(), (Message) value);
            } else {
                i += FieldSet.computeFieldSize(fieldDescriptor, value);
            }
        }
        message = message.getUnknownFields();
        if (messageSetWireFormat) {
            return i + message.getSerializedSizeAsMessageSet();
        }
        return i + message.getSerializedSize();
    }

    static String delimitWithCommas(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : list) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    static boolean isInitialized(MessageOrBuilder messageOrBuilder) {
        FieldDescriptor fieldDescriptor;
        for (FieldDescriptor fieldDescriptor2 : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor2.isRequired() && !messageOrBuilder.hasField(fieldDescriptor2)) {
                return false;
            }
        }
        for (Entry entry : messageOrBuilder.getAllFields().entrySet()) {
            fieldDescriptor2 = (FieldDescriptor) entry.getKey();
            if (fieldDescriptor2.getJavaType() == JavaType.MESSAGE) {
                if (fieldDescriptor2.isRepeated()) {
                    for (Message isInitialized : (List) entry.getValue()) {
                        if (!isInitialized.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (!((Message) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String subMessagePrefix(String str, FieldDescriptor fieldDescriptor, int i) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (fieldDescriptor.isExtension() != null) {
            stringBuilder.append('(');
            stringBuilder.append(fieldDescriptor.getFullName());
            stringBuilder.append(')');
        } else {
            stringBuilder.append(fieldDescriptor.getName());
        }
        if (i != -1) {
            stringBuilder.append('[');
            stringBuilder.append(i);
            stringBuilder.append(']');
        }
        stringBuilder.append('.');
        return stringBuilder.toString();
    }

    private static void findMissingFields(MessageOrBuilder messageOrBuilder, String str, List<String> list) {
        for (FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(fieldDescriptor.getName());
                list.add(stringBuilder.toString());
            }
        }
        for (Entry entry : messageOrBuilder.getAllFields().entrySet()) {
            FieldDescriptor fieldDescriptor2 = (FieldDescriptor) entry.getKey();
            Object value = entry.getValue();
            if (fieldDescriptor2.getJavaType() == JavaType.MESSAGE) {
                if (fieldDescriptor2.isRepeated()) {
                    int i = 0;
                    for (MessageOrBuilder findMissingFields : (List) value) {
                        int i2 = i + 1;
                        findMissingFields(findMissingFields, subMessagePrefix(str, fieldDescriptor2, i), list);
                        i = i2;
                    }
                } else if (messageOrBuilder.hasField(fieldDescriptor2)) {
                    findMissingFields((MessageOrBuilder) value, subMessagePrefix(str, fieldDescriptor2, -1), list);
                }
            }
        }
    }

    static List<String> findMissingFields(MessageOrBuilder messageOrBuilder) {
        List<String> arrayList = new ArrayList();
        findMissingFields(messageOrBuilder, "", arrayList);
        return arrayList;
    }

    static boolean mergeFieldFrom(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, Descriptor descriptor, MergeTarget mergeTarget, int i) throws IOException {
        if (descriptor.getOptions().getMessageSetWireFormat() && i == WireFormat.MESSAGE_SET_ITEM_TAG) {
            mergeMessageSetExtensionFromCodedStream(codedInputStream, builder, extensionRegistryLite, descriptor, mergeTarget);
            return true;
        }
        boolean z;
        Object obj;
        int readEnum;
        int readEnum2;
        int tagWireType = WireFormat.getTagWireType(i);
        int tagFieldNumber = WireFormat.getTagFieldNumber(i);
        FieldDescriptor fieldDescriptor = null;
        if (descriptor.isExtensionNumber(tagFieldNumber)) {
            if (extensionRegistryLite instanceof ExtensionRegistry) {
                descriptor = mergeTarget.findExtensionByNumber((ExtensionRegistry) extensionRegistryLite, descriptor, tagFieldNumber);
                if (descriptor != null) {
                    fieldDescriptor = descriptor.descriptor;
                    descriptor = descriptor.defaultInstance;
                    if (descriptor == null && fieldDescriptor.getJavaType() == JavaType.MESSAGE) {
                        builder = new StringBuilder();
                        builder.append("Message-typed extension lacked default instance: ");
                        builder.append(fieldDescriptor.getFullName());
                        throw new IllegalStateException(builder.toString());
                    }
                    z = false;
                    if (fieldDescriptor != null) {
                        if (tagWireType == FieldSet.getWireFormatForFieldType(fieldDescriptor.getLiteType(), false)) {
                            obj = null;
                        } else if (fieldDescriptor.isPackable() && tagWireType == FieldSet.getWireFormatForFieldType(fieldDescriptor.getLiteType(), true)) {
                            obj = 1;
                        }
                        if (z) {
                            if (obj == null) {
                                builder = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (fieldDescriptor.getLiteType() != FieldType.ENUM) {
                                    while (codedInputStream.getBytesUntilLimit() > null) {
                                        readEnum = codedInputStream.readEnum();
                                        if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                                            mergeTarget.addRepeatedField(fieldDescriptor, fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum));
                                        } else {
                                            extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum);
                                            if (extensionRegistryLite == null) {
                                                return true;
                                            }
                                            mergeTarget.addRepeatedField(fieldDescriptor, extensionRegistryLite);
                                        }
                                    }
                                } else {
                                    while (codedInputStream.getBytesUntilLimit() > null) {
                                        mergeTarget.addRepeatedField(fieldDescriptor, WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor)));
                                    }
                                }
                                codedInputStream.popLimit(builder);
                            } else {
                                switch (fieldDescriptor.getType()) {
                                    case GROUP:
                                        codedInputStream = mergeTarget.parseGroup(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                                        break;
                                    case MESSAGE:
                                        codedInputStream = mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                                        break;
                                    case ENUM:
                                        readEnum2 = codedInputStream.readEnum();
                                        if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                                            extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum2);
                                            if (extensionRegistryLite == null) {
                                                codedInputStream = extensionRegistryLite;
                                                break;
                                            }
                                            if (builder != null) {
                                                builder.mergeVarintField(tagFieldNumber, readEnum2);
                                            }
                                            return true;
                                        }
                                        codedInputStream = fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum2);
                                        break;
                                    default:
                                        codedInputStream = WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor));
                                        break;
                                }
                                if (fieldDescriptor.isRepeated() == null) {
                                    mergeTarget.addRepeatedField(fieldDescriptor, codedInputStream);
                                } else {
                                    mergeTarget.setField(fieldDescriptor, codedInputStream);
                                }
                            }
                            return true;
                        } else if (builder == null) {
                            return builder.mergeFieldFrom(i, codedInputStream);
                        } else {
                            return codedInputStream.skipField(i);
                        }
                    }
                    obj = null;
                    z = true;
                    if (z) {
                        if (obj == null) {
                            switch (fieldDescriptor.getType()) {
                                case GROUP:
                                    codedInputStream = mergeTarget.parseGroup(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                                    break;
                                case MESSAGE:
                                    codedInputStream = mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                                    break;
                                case ENUM:
                                    readEnum2 = codedInputStream.readEnum();
                                    if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                                        codedInputStream = fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum2);
                                        break;
                                    }
                                    extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum2);
                                    if (extensionRegistryLite == null) {
                                        codedInputStream = extensionRegistryLite;
                                        break;
                                    }
                                    if (builder != null) {
                                        builder.mergeVarintField(tagFieldNumber, readEnum2);
                                    }
                                    return true;
                                default:
                                    codedInputStream = WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor));
                                    break;
                            }
                            if (fieldDescriptor.isRepeated() == null) {
                                mergeTarget.setField(fieldDescriptor, codedInputStream);
                            } else {
                                mergeTarget.addRepeatedField(fieldDescriptor, codedInputStream);
                            }
                        } else {
                            builder = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (fieldDescriptor.getLiteType() != FieldType.ENUM) {
                                while (codedInputStream.getBytesUntilLimit() > null) {
                                    mergeTarget.addRepeatedField(fieldDescriptor, WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor)));
                                }
                            } else {
                                while (codedInputStream.getBytesUntilLimit() > null) {
                                    readEnum = codedInputStream.readEnum();
                                    if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                                        extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum);
                                        if (extensionRegistryLite == null) {
                                            return true;
                                        }
                                        mergeTarget.addRepeatedField(fieldDescriptor, extensionRegistryLite);
                                    } else {
                                        mergeTarget.addRepeatedField(fieldDescriptor, fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum));
                                    }
                                }
                            }
                            codedInputStream.popLimit(builder);
                        }
                        return true;
                    } else if (builder == null) {
                        return codedInputStream.skipField(i);
                    } else {
                        return builder.mergeFieldFrom(i, codedInputStream);
                    }
                }
            }
        } else if (mergeTarget.getContainerType() == ContainerType.MESSAGE) {
            fieldDescriptor = descriptor.findFieldByNumber(tagFieldNumber);
            descriptor = null;
            z = false;
            if (fieldDescriptor != null) {
                if (tagWireType == FieldSet.getWireFormatForFieldType(fieldDescriptor.getLiteType(), false)) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (z) {
                    if (obj == null) {
                        builder = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                        if (fieldDescriptor.getLiteType() != FieldType.ENUM) {
                            while (codedInputStream.getBytesUntilLimit() > null) {
                                readEnum = codedInputStream.readEnum();
                                if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                                    mergeTarget.addRepeatedField(fieldDescriptor, fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum));
                                } else {
                                    extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum);
                                    if (extensionRegistryLite == null) {
                                        return true;
                                    }
                                    mergeTarget.addRepeatedField(fieldDescriptor, extensionRegistryLite);
                                }
                            }
                        } else {
                            while (codedInputStream.getBytesUntilLimit() > null) {
                                mergeTarget.addRepeatedField(fieldDescriptor, WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor)));
                            }
                        }
                        codedInputStream.popLimit(builder);
                    } else {
                        switch (fieldDescriptor.getType()) {
                            case GROUP:
                                codedInputStream = mergeTarget.parseGroup(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                                break;
                            case MESSAGE:
                                codedInputStream = mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                                break;
                            case ENUM:
                                readEnum2 = codedInputStream.readEnum();
                                if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                                    extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum2);
                                    if (extensionRegistryLite == null) {
                                        codedInputStream = extensionRegistryLite;
                                        break;
                                    }
                                    if (builder != null) {
                                        builder.mergeVarintField(tagFieldNumber, readEnum2);
                                    }
                                    return true;
                                }
                                codedInputStream = fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum2);
                                break;
                            default:
                                codedInputStream = WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor));
                                break;
                        }
                        if (fieldDescriptor.isRepeated() == null) {
                            mergeTarget.addRepeatedField(fieldDescriptor, codedInputStream);
                        } else {
                            mergeTarget.setField(fieldDescriptor, codedInputStream);
                        }
                    }
                    return true;
                } else if (builder == null) {
                    return builder.mergeFieldFrom(i, codedInputStream);
                } else {
                    return codedInputStream.skipField(i);
                }
            }
            obj = null;
            z = true;
            if (z) {
                if (obj == null) {
                    switch (fieldDescriptor.getType()) {
                        case GROUP:
                            codedInputStream = mergeTarget.parseGroup(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                            break;
                        case MESSAGE:
                            codedInputStream = mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                            break;
                        case ENUM:
                            readEnum2 = codedInputStream.readEnum();
                            if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                                codedInputStream = fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum2);
                                break;
                            }
                            extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum2);
                            if (extensionRegistryLite == null) {
                                codedInputStream = extensionRegistryLite;
                                break;
                            }
                            if (builder != null) {
                                builder.mergeVarintField(tagFieldNumber, readEnum2);
                            }
                            return true;
                        default:
                            codedInputStream = WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor));
                            break;
                    }
                    if (fieldDescriptor.isRepeated() == null) {
                        mergeTarget.setField(fieldDescriptor, codedInputStream);
                    } else {
                        mergeTarget.addRepeatedField(fieldDescriptor, codedInputStream);
                    }
                } else {
                    builder = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                    if (fieldDescriptor.getLiteType() != FieldType.ENUM) {
                        while (codedInputStream.getBytesUntilLimit() > null) {
                            mergeTarget.addRepeatedField(fieldDescriptor, WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor)));
                        }
                    } else {
                        while (codedInputStream.getBytesUntilLimit() > null) {
                            readEnum = codedInputStream.readEnum();
                            if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                                extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum);
                                if (extensionRegistryLite == null) {
                                    return true;
                                }
                                mergeTarget.addRepeatedField(fieldDescriptor, extensionRegistryLite);
                            } else {
                                mergeTarget.addRepeatedField(fieldDescriptor, fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum));
                            }
                        }
                    }
                    codedInputStream.popLimit(builder);
                }
                return true;
            } else if (builder == null) {
                return codedInputStream.skipField(i);
            } else {
                return builder.mergeFieldFrom(i, codedInputStream);
            }
        }
        descriptor = null;
        z = false;
        if (fieldDescriptor != null) {
            if (tagWireType == FieldSet.getWireFormatForFieldType(fieldDescriptor.getLiteType(), false)) {
                obj = null;
            } else {
                obj = 1;
            }
            if (z) {
                if (obj == null) {
                    builder = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                    if (fieldDescriptor.getLiteType() != FieldType.ENUM) {
                        while (codedInputStream.getBytesUntilLimit() > null) {
                            readEnum = codedInputStream.readEnum();
                            if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                                mergeTarget.addRepeatedField(fieldDescriptor, fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum));
                            } else {
                                extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum);
                                if (extensionRegistryLite == null) {
                                    return true;
                                }
                                mergeTarget.addRepeatedField(fieldDescriptor, extensionRegistryLite);
                            }
                        }
                    } else {
                        while (codedInputStream.getBytesUntilLimit() > null) {
                            mergeTarget.addRepeatedField(fieldDescriptor, WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor)));
                        }
                    }
                    codedInputStream.popLimit(builder);
                } else {
                    switch (fieldDescriptor.getType()) {
                        case GROUP:
                            codedInputStream = mergeTarget.parseGroup(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                            break;
                        case MESSAGE:
                            codedInputStream = mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                            break;
                        case ENUM:
                            readEnum2 = codedInputStream.readEnum();
                            if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                                extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum2);
                                if (extensionRegistryLite == null) {
                                    codedInputStream = extensionRegistryLite;
                                    break;
                                }
                                if (builder != null) {
                                    builder.mergeVarintField(tagFieldNumber, readEnum2);
                                }
                                return true;
                            }
                            codedInputStream = fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum2);
                            break;
                        default:
                            codedInputStream = WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor));
                            break;
                    }
                    if (fieldDescriptor.isRepeated() == null) {
                        mergeTarget.addRepeatedField(fieldDescriptor, codedInputStream);
                    } else {
                        mergeTarget.setField(fieldDescriptor, codedInputStream);
                    }
                }
                return true;
            } else if (builder == null) {
                return builder.mergeFieldFrom(i, codedInputStream);
            } else {
                return codedInputStream.skipField(i);
            }
        }
        obj = null;
        z = true;
        if (z) {
            if (obj == null) {
                switch (fieldDescriptor.getType()) {
                    case GROUP:
                        codedInputStream = mergeTarget.parseGroup(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                        break;
                    case MESSAGE:
                        codedInputStream = mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, fieldDescriptor, descriptor);
                        break;
                    case ENUM:
                        readEnum2 = codedInputStream.readEnum();
                        if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                            codedInputStream = fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum2);
                            break;
                        }
                        extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum2);
                        if (extensionRegistryLite == null) {
                            codedInputStream = extensionRegistryLite;
                            break;
                        }
                        if (builder != null) {
                            builder.mergeVarintField(tagFieldNumber, readEnum2);
                        }
                        return true;
                    default:
                        codedInputStream = WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor));
                        break;
                }
                if (fieldDescriptor.isRepeated() == null) {
                    mergeTarget.setField(fieldDescriptor, codedInputStream);
                } else {
                    mergeTarget.addRepeatedField(fieldDescriptor, codedInputStream);
                }
            } else {
                builder = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                if (fieldDescriptor.getLiteType() != FieldType.ENUM) {
                    while (codedInputStream.getBytesUntilLimit() > null) {
                        mergeTarget.addRepeatedField(fieldDescriptor, WireFormat.readPrimitiveField(codedInputStream, fieldDescriptor.getLiteType(), mergeTarget.getUtf8Validation(fieldDescriptor)));
                    }
                } else {
                    while (codedInputStream.getBytesUntilLimit() > null) {
                        readEnum = codedInputStream.readEnum();
                        if (fieldDescriptor.getFile().supportsUnknownEnumValue() == null) {
                            extensionRegistryLite = fieldDescriptor.getEnumType().findValueByNumber(readEnum);
                            if (extensionRegistryLite == null) {
                                return true;
                            }
                            mergeTarget.addRepeatedField(fieldDescriptor, extensionRegistryLite);
                        } else {
                            mergeTarget.addRepeatedField(fieldDescriptor, fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(readEnum));
                        }
                    }
                }
                codedInputStream.popLimit(builder);
            }
            return true;
        } else if (builder == null) {
            return codedInputStream.skipField(i);
        } else {
            return builder.mergeFieldFrom(i, codedInputStream);
        }
    }

    private static void mergeMessageSetExtensionFromCodedStream(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, Descriptor descriptor, MergeTarget mergeTarget) throws IOException {
        int i = 0;
        ExtensionInfo extensionInfo = null;
        ByteString byteString = extensionInfo;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                i = codedInputStream.readUInt32();
                if (i != 0 && (extensionRegistryLite instanceof ExtensionRegistry)) {
                    extensionInfo = mergeTarget.findExtensionByNumber((ExtensionRegistry) extensionRegistryLite, descriptor, i);
                }
            } else if (readTag == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (i == 0 || extensionInfo == null || !ExtensionRegistryLite.isEagerlyParseMessageSets()) {
                    byteString = codedInputStream.readBytes();
                } else {
                    eagerlyMergeMessageSetExtension(codedInputStream, extensionInfo, extensionRegistryLite, mergeTarget);
                    byteString = null;
                }
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
        if (byteString != null && i != 0) {
            if (extensionInfo != null) {
                mergeMessageSetExtensionFromBytes(byteString, extensionInfo, extensionRegistryLite, mergeTarget);
            } else if (byteString != null && builder != null) {
                builder.mergeField(i, Field.newBuilder().addLengthDelimited(byteString).build());
            }
        }
    }

    private static void mergeMessageSetExtensionFromBytes(ByteString byteString, ExtensionInfo extensionInfo, ExtensionRegistryLite extensionRegistryLite, MergeTarget mergeTarget) throws IOException {
        FieldDescriptor fieldDescriptor = extensionInfo.descriptor;
        if (!mergeTarget.hasField(fieldDescriptor)) {
            if (!ExtensionRegistryLite.isEagerlyParseMessageSets()) {
                mergeTarget.setField(fieldDescriptor, new LazyField(extensionInfo.defaultInstance, extensionRegistryLite, byteString));
                return;
            }
        }
        mergeTarget.setField(fieldDescriptor, mergeTarget.parseMessageFromBytes(byteString, extensionRegistryLite, fieldDescriptor, extensionInfo.defaultInstance));
    }

    private static void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, ExtensionInfo extensionInfo, ExtensionRegistryLite extensionRegistryLite, MergeTarget mergeTarget) throws IOException {
        FieldDescriptor fieldDescriptor = extensionInfo.descriptor;
        mergeTarget.setField(fieldDescriptor, mergeTarget.parseMessage(codedInputStream, extensionRegistryLite, fieldDescriptor, extensionInfo.defaultInstance));
    }
}
