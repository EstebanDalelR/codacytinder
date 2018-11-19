package com.google.protobuf;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.Internal.EnumLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Value extends GeneratedMessageV3 implements ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE = new Value();
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static final Parser<Value> PARSER = new C77951();
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int kindCase_;
    private Object kind_;
    private byte memoizedIsInitialized;

    public enum KindCase implements EnumLite {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);
        
        private final int value;

        private KindCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static KindCase valueOf(int i) {
            return forNumber(i);
        }

        public static KindCase forNumber(int i) {
            switch (i) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return 0;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.google.protobuf.Value$1 */
    static class C77951 extends AbstractParser<Value> {
        C77951() {
        }

        public Value parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Value(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements ValueOrBuilder {
        private int kindCase_;
        private Object kind_;
        private SingleFieldBuilderV3<ListValue, com.google.protobuf.ListValue.Builder, ListValueOrBuilder> listValueBuilder_;
        private SingleFieldBuilderV3<Struct, com.google.protobuf.Struct.Builder, StructOrBuilder> structValueBuilder_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return StructProto.internal_static_google_protobuf_Value_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return StructProto.internal_static_google_protobuf_Value_fieldAccessorTable.ensureFieldAccessorsInitialized(Value.class, Builder.class);
        }

        private Builder() {
            this.kindCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.kindCase_ = null;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.kindCase_ = 0;
            this.kind_ = null;
            return this;
        }

        public Descriptor getDescriptorForType() {
            return StructProto.internal_static_google_protobuf_Value_descriptor;
        }

        public Value getDefaultInstanceForType() {
            return Value.getDefaultInstance();
        }

        public Value build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public Value buildPartial() {
            Value value = new Value((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.kindCase_ == 1) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 2) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 3) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 4) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 5) {
                if (this.structValueBuilder_ == null) {
                    value.kind_ = this.kind_;
                } else {
                    value.kind_ = this.structValueBuilder_.build();
                }
            }
            if (this.kindCase_ == 6) {
                if (this.listValueBuilder_ == null) {
                    value.kind_ = this.kind_;
                } else {
                    value.kind_ = this.listValueBuilder_.build();
                }
            }
            value.kindCase_ = this.kindCase_;
            onBuilt();
            return value;
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
            if (message instanceof Value) {
                return mergeFrom((Value) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Value value) {
            if (value == Value.getDefaultInstance()) {
                return this;
            }
            switch (value.getKindCase()) {
                case NULL_VALUE:
                    setNullValueValue(value.getNullValueValue());
                    break;
                case NUMBER_VALUE:
                    setNumberValue(value.getNumberValue());
                    break;
                case STRING_VALUE:
                    this.kindCase_ = 3;
                    this.kind_ = value.kind_;
                    onChanged();
                    break;
                case BOOL_VALUE:
                    setBoolValue(value.getBoolValue());
                    break;
                case STRUCT_VALUE:
                    mergeStructValue(value.getStructValue());
                    break;
                case LIST_VALUE:
                    mergeListValue(value.getListValue());
                    break;
                default:
                    break;
            }
            mergeUnknownFields(value.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            Value value;
            Value value2 = null;
            try {
                Value value3 = (Value) Value.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (value3 != null) {
                    mergeFrom(value3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                value = (Value) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                value2 = value;
                if (value2 != null) {
                    mergeFrom(value2);
                }
                throw codedInputStream2;
            }
        }

        public KindCase getKindCase() {
            return KindCase.forNumber(this.kindCase_);
        }

        public Builder clearKind() {
            this.kindCase_ = 0;
            this.kind_ = null;
            onChanged();
            return this;
        }

        public int getNullValueValue() {
            return this.kindCase_ == 1 ? ((Integer) this.kind_).intValue() : 0;
        }

        public Builder setNullValueValue(int i) {
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(i);
            onChanged();
            return this;
        }

        public NullValue getNullValue() {
            if (this.kindCase_ != 1) {
                return NullValue.NULL_VALUE;
            }
            NullValue valueOf = NullValue.valueOf(((Integer) this.kind_).intValue());
            if (valueOf == null) {
                valueOf = NullValue.UNRECOGNIZED;
            }
            return valueOf;
        }

        public Builder setNullValue(NullValue nullValue) {
            if (nullValue == null) {
                throw new NullPointerException();
            }
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(nullValue.getNumber());
            onChanged();
            return this;
        }

        public Builder clearNullValue() {
            if (this.kindCase_ == 1) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public double getNumberValue() {
            return this.kindCase_ == 2 ? ((Double) this.kind_).doubleValue() : 0.0d;
        }

        public Builder setNumberValue(double d) {
            this.kindCase_ = 2;
            this.kind_ = Double.valueOf(d);
            onChanged();
            return this;
        }

        public Builder clearNumberValue() {
            if (this.kindCase_ == 2) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public String getStringValue() {
            String str = "";
            if (this.kindCase_ == 3) {
                str = this.kind_;
            }
            if (str instanceof String) {
                return str;
            }
            str = ((ByteString) str).toStringUtf8();
            if (this.kindCase_ == 3) {
                this.kind_ = str;
            }
            return str;
        }

        public ByteString getStringValueBytes() {
            String str = "";
            if (this.kindCase_ == 3) {
                str = this.kind_;
            }
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8(str);
            if (this.kindCase_ == 3) {
                this.kind_ = copyFromUtf8;
            }
            return copyFromUtf8;
        }

        public Builder setStringValue(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.kindCase_ = 3;
            this.kind_ = str;
            onChanged();
            return this;
        }

        public Builder clearStringValue() {
            if (this.kindCase_ == 3) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public Builder setStringValueBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.kindCase_ = 3;
            this.kind_ = byteString;
            onChanged();
            return this;
        }

        public boolean getBoolValue() {
            return this.kindCase_ == 4 ? ((Boolean) this.kind_).booleanValue() : false;
        }

        public Builder setBoolValue(boolean z) {
            this.kindCase_ = 4;
            this.kind_ = Boolean.valueOf(z);
            onChanged();
            return this;
        }

        public Builder clearBoolValue() {
            if (this.kindCase_ == 4) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public boolean hasStructValue() {
            return this.kindCase_ == 5;
        }

        public Struct getStructValue() {
            if (this.structValueBuilder_ == null) {
                if (this.kindCase_ == 5) {
                    return (Struct) this.kind_;
                }
                return Struct.getDefaultInstance();
            } else if (this.kindCase_ == 5) {
                return (Struct) this.structValueBuilder_.getMessage();
            } else {
                return Struct.getDefaultInstance();
            }
        }

        public Builder setStructValue(Struct struct) {
            if (this.structValueBuilder_ != null) {
                this.structValueBuilder_.setMessage(struct);
            } else if (struct == null) {
                throw new NullPointerException();
            } else {
                this.kind_ = struct;
                onChanged();
            }
            this.kindCase_ = 5;
            return this;
        }

        public Builder setStructValue(com.google.protobuf.Struct.Builder builder) {
            if (this.structValueBuilder_ == null) {
                this.kind_ = builder.build();
                onChanged();
            } else {
                this.structValueBuilder_.setMessage(builder.build());
            }
            this.kindCase_ = 5;
            return this;
        }

        public Builder mergeStructValue(Struct struct) {
            if (this.structValueBuilder_ == null) {
                if (this.kindCase_ != 5 || this.kind_ == Struct.getDefaultInstance()) {
                    this.kind_ = struct;
                } else {
                    this.kind_ = Struct.newBuilder((Struct) this.kind_).mergeFrom(struct).buildPartial();
                }
                onChanged();
            } else {
                if (this.kindCase_ == 5) {
                    this.structValueBuilder_.mergeFrom(struct);
                }
                this.structValueBuilder_.setMessage(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        public Builder clearStructValue() {
            if (this.structValueBuilder_ != null) {
                if (this.kindCase_ == 5) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                }
                this.structValueBuilder_.clear();
            } else if (this.kindCase_ == 5) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public com.google.protobuf.Struct.Builder getStructValueBuilder() {
            return (com.google.protobuf.Struct.Builder) getStructValueFieldBuilder().getBuilder();
        }

        public StructOrBuilder getStructValueOrBuilder() {
            if (this.kindCase_ == 5 && this.structValueBuilder_ != null) {
                return (StructOrBuilder) this.structValueBuilder_.getMessageOrBuilder();
            }
            if (this.kindCase_ == 5) {
                return (Struct) this.kind_;
            }
            return Struct.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Struct, com.google.protobuf.Struct.Builder, StructOrBuilder> getStructValueFieldBuilder() {
            if (this.structValueBuilder_ == null) {
                if (this.kindCase_ != 5) {
                    this.kind_ = Struct.getDefaultInstance();
                }
                this.structValueBuilder_ = new SingleFieldBuilderV3((Struct) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 5;
            onChanged();
            return this.structValueBuilder_;
        }

        public boolean hasListValue() {
            return this.kindCase_ == 6;
        }

        public ListValue getListValue() {
            if (this.listValueBuilder_ == null) {
                if (this.kindCase_ == 6) {
                    return (ListValue) this.kind_;
                }
                return ListValue.getDefaultInstance();
            } else if (this.kindCase_ == 6) {
                return (ListValue) this.listValueBuilder_.getMessage();
            } else {
                return ListValue.getDefaultInstance();
            }
        }

        public Builder setListValue(ListValue listValue) {
            if (this.listValueBuilder_ != null) {
                this.listValueBuilder_.setMessage(listValue);
            } else if (listValue == null) {
                throw new NullPointerException();
            } else {
                this.kind_ = listValue;
                onChanged();
            }
            this.kindCase_ = 6;
            return this;
        }

        public Builder setListValue(com.google.protobuf.ListValue.Builder builder) {
            if (this.listValueBuilder_ == null) {
                this.kind_ = builder.build();
                onChanged();
            } else {
                this.listValueBuilder_.setMessage(builder.build());
            }
            this.kindCase_ = 6;
            return this;
        }

        public Builder mergeListValue(ListValue listValue) {
            if (this.listValueBuilder_ == null) {
                if (this.kindCase_ != 6 || this.kind_ == ListValue.getDefaultInstance()) {
                    this.kind_ = listValue;
                } else {
                    this.kind_ = ListValue.newBuilder((ListValue) this.kind_).mergeFrom(listValue).buildPartial();
                }
                onChanged();
            } else {
                if (this.kindCase_ == 6) {
                    this.listValueBuilder_.mergeFrom(listValue);
                }
                this.listValueBuilder_.setMessage(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public Builder clearListValue() {
            if (this.listValueBuilder_ != null) {
                if (this.kindCase_ == 6) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                }
                this.listValueBuilder_.clear();
            } else if (this.kindCase_ == 6) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public com.google.protobuf.ListValue.Builder getListValueBuilder() {
            return (com.google.protobuf.ListValue.Builder) getListValueFieldBuilder().getBuilder();
        }

        public ListValueOrBuilder getListValueOrBuilder() {
            if (this.kindCase_ == 6 && this.listValueBuilder_ != null) {
                return (ListValueOrBuilder) this.listValueBuilder_.getMessageOrBuilder();
            }
            if (this.kindCase_ == 6) {
                return (ListValue) this.kind_;
            }
            return ListValue.getDefaultInstance();
        }

        private SingleFieldBuilderV3<ListValue, com.google.protobuf.ListValue.Builder, ListValueOrBuilder> getListValueFieldBuilder() {
            if (this.listValueBuilder_ == null) {
                if (this.kindCase_ != 6) {
                    this.kind_ = ListValue.getDefaultInstance();
                }
                this.listValueBuilder_ = new SingleFieldBuilderV3((ListValue) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 6;
            onChanged();
            return this.listValueBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private Value(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.kindCase_ = null;
        this.memoizedIsInitialized = (byte) -1;
    }

    private Value() {
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        Object obj = null;
        while (obj == null) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 8) {
                        readTag = codedInputStream.readEnum();
                        this.kindCase_ = 1;
                        this.kind_ = Integer.valueOf(readTag);
                    } else if (readTag == 17) {
                        this.kindCase_ = 2;
                        this.kind_ = Double.valueOf(codedInputStream.readDouble());
                    } else if (readTag == 26) {
                        String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                        this.kindCase_ = 3;
                        this.kind_ = readStringRequireUtf8;
                    } else if (readTag != 32) {
                        com.google.protobuf.Struct.Builder builder = null;
                        if (readTag == 42) {
                            if (this.kindCase_ == 5) {
                                builder = ((Struct) this.kind_).toBuilder();
                            }
                            this.kind_ = codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom((Struct) this.kind_);
                                this.kind_ = builder.buildPartial();
                            }
                            this.kindCase_ = 5;
                        } else if (readTag == 50) {
                            com.google.protobuf.ListValue.Builder toBuilder;
                            if (this.kindCase_ == 6) {
                                toBuilder = ((ListValue) this.kind_).toBuilder();
                            }
                            this.kind_ = codedInputStream.readMessage(ListValue.parser(), extensionRegistryLite);
                            if (toBuilder != null) {
                                toBuilder.mergeFrom((ListValue) this.kind_);
                                this.kind_ = toBuilder.buildPartial();
                            }
                            this.kindCase_ = 6;
                        } else if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    } else {
                        this.kindCase_ = 4;
                        this.kind_ = Boolean.valueOf(codedInputStream.readBool());
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
        return StructProto.internal_static_google_protobuf_Value_descriptor;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return StructProto.internal_static_google_protobuf_Value_fieldAccessorTable.ensureFieldAccessorsInitialized(Value.class, Builder.class);
    }

    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    public int getNullValueValue() {
        return this.kindCase_ == 1 ? ((Integer) this.kind_).intValue() : 0;
    }

    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue valueOf = NullValue.valueOf(((Integer) this.kind_).intValue());
        if (valueOf == null) {
            valueOf = NullValue.UNRECOGNIZED;
        }
        return valueOf;
    }

    public double getNumberValue() {
        return this.kindCase_ == 2 ? ((Double) this.kind_).doubleValue() : 0.0d;
    }

    public String getStringValue() {
        String str = "";
        if (this.kindCase_ == 3) {
            str = this.kind_;
        }
        if (str instanceof String) {
            return str;
        }
        str = ((ByteString) str).toStringUtf8();
        if (this.kindCase_ == 3) {
            this.kind_ = str;
        }
        return str;
    }

    public ByteString getStringValueBytes() {
        String str = "";
        if (this.kindCase_ == 3) {
            str = this.kind_;
        }
        if (!(str instanceof String)) {
            return (ByteString) str;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str);
        if (this.kindCase_ == 3) {
            this.kind_ = copyFromUtf8;
        }
        return copyFromUtf8;
    }

    public boolean getBoolValue() {
        return this.kindCase_ == 4 ? ((Boolean) this.kind_).booleanValue() : false;
    }

    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (Struct) this.kind_;
        }
        return Struct.getDefaultInstance();
    }

    public StructOrBuilder getStructValueOrBuilder() {
        if (this.kindCase_ == 5) {
            return (Struct) this.kind_;
        }
        return Struct.getDefaultInstance();
    }

    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    public ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (ListValue) this.kind_;
        }
        return ListValue.getDefaultInstance();
    }

    public ListValueOrBuilder getListValueOrBuilder() {
        if (this.kindCase_ == 6) {
            return (ListValue) this.kind_;
        }
        return ListValue.getDefaultInstance();
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
        if (this.kindCase_ == 1) {
            codedOutputStream.writeEnum(1, ((Integer) this.kind_).intValue());
        }
        if (this.kindCase_ == 2) {
            codedOutputStream.writeDouble(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            codedOutputStream.writeBool(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            codedOutputStream.writeMessage(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            codedOutputStream.writeMessage(6, (ListValue) this.kind_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        i = 0;
        if (this.kindCase_ == 1) {
            i = 0 + CodedOutputStream.computeEnumSize(1, ((Integer) this.kind_).intValue());
        }
        if (this.kindCase_ == 2) {
            i += CodedOutputStream.computeDoubleSize(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            i += GeneratedMessageV3.computeStringSize(3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            i += CodedOutputStream.computeBoolSize(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            i += CodedOutputStream.computeMessageSize(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            i += CodedOutputStream.computeMessageSize(6, (ListValue) this.kind_);
        }
        i += this.unknownFields.getSerializedSize();
        this.memoizedSize = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
        r7 = this;
        r0 = 1;
        if (r8 != r7) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r8 instanceof com.google.protobuf.Value;
        if (r1 != 0) goto L_0x000d;
    L_0x0008:
        r8 = super.equals(r8);
        return r8;
    L_0x000d:
        r8 = (com.google.protobuf.Value) r8;
        r1 = r7.getKindCase();
        r2 = r8.getKindCase();
        r1 = r1.equals(r2);
        r2 = 0;
        if (r1 == 0) goto L_0x0020;
    L_0x001e:
        r1 = 1;
        goto L_0x0021;
    L_0x0020:
        r1 = 0;
    L_0x0021:
        if (r1 != 0) goto L_0x0024;
    L_0x0023:
        return r2;
    L_0x0024:
        r3 = r7.kindCase_;
        switch(r3) {
            case 1: goto L_0x0085;
            case 2: goto L_0x006e;
            case 3: goto L_0x005d;
            case 4: goto L_0x0050;
            case 5: goto L_0x003f;
            case 6: goto L_0x002b;
            default: goto L_0x0029;
        };
    L_0x0029:
        goto L_0x0092;
    L_0x002b:
        if (r1 == 0) goto L_0x003d;
    L_0x002d:
        r1 = r7.getListValue();
        r3 = r8.getListValue();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003d;
    L_0x003b:
        r1 = 1;
        goto L_0x0092;
    L_0x003d:
        r1 = 0;
        goto L_0x0092;
    L_0x003f:
        if (r1 == 0) goto L_0x003d;
    L_0x0041:
        r1 = r7.getStructValue();
        r3 = r8.getStructValue();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003d;
    L_0x004f:
        goto L_0x003b;
    L_0x0050:
        if (r1 == 0) goto L_0x003d;
    L_0x0052:
        r1 = r7.getBoolValue();
        r3 = r8.getBoolValue();
        if (r1 != r3) goto L_0x003d;
    L_0x005c:
        goto L_0x003b;
    L_0x005d:
        if (r1 == 0) goto L_0x003d;
    L_0x005f:
        r1 = r7.getStringValue();
        r3 = r8.getStringValue();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003d;
    L_0x006d:
        goto L_0x003b;
    L_0x006e:
        if (r1 == 0) goto L_0x003d;
    L_0x0070:
        r3 = r7.getNumberValue();
        r3 = java.lang.Double.doubleToLongBits(r3);
        r5 = r8.getNumberValue();
        r5 = java.lang.Double.doubleToLongBits(r5);
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x003d;
    L_0x0084:
        goto L_0x003b;
    L_0x0085:
        if (r1 == 0) goto L_0x003d;
    L_0x0087:
        r1 = r7.getNullValueValue();
        r3 = r8.getNullValueValue();
        if (r1 != r3) goto L_0x003d;
    L_0x0091:
        goto L_0x003b;
    L_0x0092:
        if (r1 == 0) goto L_0x009f;
    L_0x0094:
        r1 = r7.unknownFields;
        r8 = r8.unknownFields;
        r8 = r1.equals(r8);
        if (r8 == 0) goto L_0x009f;
    L_0x009e:
        goto L_0x00a0;
    L_0x009f:
        r0 = 0;
    L_0x00a0:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Value.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        switch (this.kindCase_) {
            case 1:
                hashCode = (((hashCode * 37) + 1) * 53) + getNullValueValue();
                break;
            case 2:
                hashCode = (((hashCode * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getNumberValue()));
                break;
            case 3:
                hashCode = (((hashCode * 37) + 3) * 53) + getStringValue().hashCode();
                break;
            case 4:
                hashCode = (((hashCode * 37) + 4) * 53) + Internal.hashBoolean(getBoolValue());
                break;
            case 5:
                hashCode = (((hashCode * 37) + 5) * 53) + getStructValue().hashCode();
                break;
            case 6:
                hashCode = (((hashCode * 37) + 6) * 53) + getListValue().hashCode();
                break;
            default:
                break;
        }
        hashCode = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteBuffer);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteString);
    }

    public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(bArr);
    }

    public static Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Value parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Value value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(value);
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

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Value> parser() {
        return PARSER;
    }

    public Parser<Value> getParserForType() {
        return PARSER;
    }

    public Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
