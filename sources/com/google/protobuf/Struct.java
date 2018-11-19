package com.google.protobuf;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Map.Entry;

public final class Struct extends GeneratedMessageV3 implements StructOrBuilder {
    private static final Struct DEFAULT_INSTANCE = new Struct();
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static final Parser<Struct> PARSER = new C77901();
    private static final long serialVersionUID = 0;
    private MapField<String, Value> fields_;
    private byte memoizedIsInitialized;

    private static final class FieldsDefaultEntryHolder {
        static final MapEntry<String, Value> defaultEntry = MapEntry.newDefaultInstance(StructProto.internal_static_google_protobuf_Struct_FieldsEntry_descriptor, FieldType.STRING, "", FieldType.MESSAGE, Value.getDefaultInstance());

        private FieldsDefaultEntryHolder() {
        }
    }

    /* renamed from: com.google.protobuf.Struct$1 */
    static class C77901 extends AbstractParser<Struct> {
        C77901() {
        }

        public Struct parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Struct(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements StructOrBuilder {
        private int bitField0_;
        private MapField<String, Value> fields_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return StructProto.internal_static_google_protobuf_Struct_descriptor;
        }

        protected MapField internalGetMapField(int i) {
            if (i == 1) {
                return internalGetFields();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid map field number: ");
            stringBuilder.append(i);
            throw new RuntimeException(stringBuilder.toString());
        }

        protected MapField internalGetMutableMapField(int i) {
            if (i == 1) {
                return internalGetMutableFields();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid map field number: ");
            stringBuilder.append(i);
            throw new RuntimeException(stringBuilder.toString());
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return StructProto.internal_static_google_protobuf_Struct_fieldAccessorTable.ensureFieldAccessorsInitialized(Struct.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            internalGetMutableFields().clear();
            return this;
        }

        public Descriptor getDescriptorForType() {
            return StructProto.internal_static_google_protobuf_Struct_descriptor;
        }

        public Struct getDefaultInstanceForType() {
            return Struct.getDefaultInstance();
        }

        public Struct build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public Struct buildPartial() {
            Struct struct = new Struct((com.google.protobuf.GeneratedMessageV3.Builder) this);
            int i = this.bitField0_;
            struct.fields_ = internalGetFields();
            struct.fields_.makeImmutable();
            onBuilt();
            return struct;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public Builder clearField(FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public Builder clearOneof(OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public Builder setRepeatedField(FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        public Builder addRepeatedField(FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof Struct) {
                return mergeFrom((Struct) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Struct struct) {
            if (struct == Struct.getDefaultInstance()) {
                return this;
            }
            internalGetMutableFields().mergeFrom(struct.internalGetFields());
            mergeUnknownFields(struct.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            Struct struct;
            Struct struct2 = null;
            try {
                Struct struct3 = (Struct) Struct.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (struct3 != null) {
                    mergeFrom(struct3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                struct = (Struct) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                struct2 = struct;
                if (struct2 != null) {
                    mergeFrom(struct2);
                }
                throw codedInputStream2;
            }
        }

        private MapField<String, Value> internalGetFields() {
            if (this.fields_ == null) {
                return MapField.emptyMapField(FieldsDefaultEntryHolder.defaultEntry);
            }
            return this.fields_;
        }

        private MapField<String, Value> internalGetMutableFields() {
            onChanged();
            if (this.fields_ == null) {
                this.fields_ = MapField.newMapField(FieldsDefaultEntryHolder.defaultEntry);
            }
            if (!this.fields_.isMutable()) {
                this.fields_ = this.fields_.copy();
            }
            return this.fields_;
        }

        public int getFieldsCount() {
            return internalGetFields().getMap().size();
        }

        public boolean containsFields(String str) {
            if (str != null) {
                return internalGetFields().getMap().containsKey(str);
            }
            throw new NullPointerException();
        }

        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        public Map<String, Value> getFieldsMap() {
            return internalGetFields().getMap();
        }

        public Value getFieldsOrDefault(String str, Value value) {
            if (str == null) {
                throw new NullPointerException();
            }
            Map map = internalGetFields().getMap();
            return map.containsKey(str) ? (Value) map.get(str) : value;
        }

        public Value getFieldsOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            Map map = internalGetFields().getMap();
            if (map.containsKey(str)) {
                return (Value) map.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder clearFields() {
            internalGetMutableFields().getMutableMap().clear();
            return this;
        }

        public Builder removeFields(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            internalGetMutableFields().getMutableMap().remove(str);
            return this;
        }

        @Deprecated
        public Map<String, Value> getMutableFields() {
            return internalGetMutableFields().getMutableMap();
        }

        public Builder putFields(String str, Value value) {
            if (str == null) {
                throw new NullPointerException();
            } else if (value == null) {
                throw new NullPointerException();
            } else {
                internalGetMutableFields().getMutableMap().put(str, value);
                return this;
            }
        }

        public Builder putAllFields(Map<String, Value> map) {
            internalGetMutableFields().getMutableMap().putAll(map);
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private Struct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Struct() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Struct(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        Object obj = null;
        int i = 0;
        while (obj == null) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 10) {
                        if ((i & 1) != 1) {
                            this.fields_ = MapField.newMapField(FieldsDefaultEntryHolder.defaultEntry);
                            i |= 1;
                        }
                        MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(FieldsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                        this.fields_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                    } else if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                    }
                }
                obj = 1;
            } catch (CodedInputStream codedInputStream2) {
                throw codedInputStream2.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } catch (Throwable th) {
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptor getDescriptor() {
        return StructProto.internal_static_google_protobuf_Struct_descriptor;
    }

    protected MapField internalGetMapField(int i) {
        if (i == 1) {
            return internalGetFields();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid map field number: ");
        stringBuilder.append(i);
        throw new RuntimeException(stringBuilder.toString());
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return StructProto.internal_static_google_protobuf_Struct_fieldAccessorTable.ensureFieldAccessorsInitialized(Struct.class, Builder.class);
    }

    private MapField<String, Value> internalGetFields() {
        if (this.fields_ == null) {
            return MapField.emptyMapField(FieldsDefaultEntryHolder.defaultEntry);
        }
        return this.fields_;
    }

    public int getFieldsCount() {
        return internalGetFields().getMap().size();
    }

    public boolean containsFields(String str) {
        if (str != null) {
            return internalGetFields().getMap().containsKey(str);
        }
        throw new NullPointerException();
    }

    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    public Map<String, Value> getFieldsMap() {
        return internalGetFields().getMap();
    }

    public Value getFieldsOrDefault(String str, Value value) {
        if (str == null) {
            throw new NullPointerException();
        }
        Map map = internalGetFields().getMap();
        return map.containsKey(str) ? (Value) map.get(str) : value;
    }

    public Value getFieldsOrThrow(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        Map map = internalGetFields().getMap();
        if (map.containsKey(str)) {
            return (Value) map.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == (byte) 1) {
            return true;
        }
        if (b == (byte) 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetFields(), FieldsDefaultEntryHolder.defaultEntry, 1);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        i = 0;
        for (Entry entry : internalGetFields().getMap().entrySet()) {
            i += CodedOutputStream.computeMessageSize(1, FieldsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        i += this.unknownFields.getSerializedSize();
        this.memoizedSize = i;
        return i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Struct)) {
            return super.equals(obj);
        }
        Struct struct = (Struct) obj;
        if ((internalGetFields().equals(struct.internalGetFields()) ? 1 : null) == null || this.unknownFields.equals(struct.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (!internalGetFields().getMap().isEmpty()) {
            hashCode = (((hashCode * 37) + 1) * 53) + internalGetFields().hashCode();
        }
        hashCode = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteBuffer);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Struct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteString);
    }

    public static Struct parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Struct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(bArr);
    }

    public static Struct parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Struct) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Struct) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Struct) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Struct) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(struct);
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Struct> parser() {
        return PARSER;
    }

    public Parser<Struct> getParserForType() {
        return PARSER;
    }

    public Struct getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
