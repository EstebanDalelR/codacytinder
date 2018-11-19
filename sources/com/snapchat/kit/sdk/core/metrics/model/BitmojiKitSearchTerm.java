package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BitmojiKitSearchTerm extends GeneratedMessageV3 implements BitmojiKitSearchTermOrBuilder {
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final BitmojiKitSearchTerm DEFAULT_INSTANCE = new BitmojiKitSearchTerm();
    private static final Parser<BitmojiKitSearchTerm> PARSER = new C79001();
    public static final int VALUE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int category_;
    private byte memoizedIsInitialized;
    private volatile Object value_;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm$1 */
    static class C79001 extends AbstractParser<BitmojiKitSearchTerm> {
        C79001() {
        }

        public BitmojiKitSearchTerm parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BitmojiKitSearchTerm(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements BitmojiKitSearchTermOrBuilder {
        private int category_;
        private Object value_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21722x650b94fe;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21723xf98cdd7c.ensureFieldAccessorsInitialized(BitmojiKitSearchTerm.class, Builder.class);
        }

        private Builder() {
            this.category_ = 0;
            this.value_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.category_ = null;
            this.value_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            BitmojiKitSearchTerm.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.category_ = 0;
            this.value_ = "";
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21722x650b94fe;
        }

        public BitmojiKitSearchTerm getDefaultInstanceForType() {
            return BitmojiKitSearchTerm.getDefaultInstance();
        }

        public BitmojiKitSearchTerm build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public BitmojiKitSearchTerm buildPartial() {
            BitmojiKitSearchTerm bitmojiKitSearchTerm = new BitmojiKitSearchTerm((com.google.protobuf.GeneratedMessageV3.Builder) this);
            bitmojiKitSearchTerm.category_ = this.category_;
            bitmojiKitSearchTerm.value_ = this.value_;
            onBuilt();
            return bitmojiKitSearchTerm;
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
            if (message instanceof BitmojiKitSearchTerm) {
                return mergeFrom((BitmojiKitSearchTerm) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BitmojiKitSearchTerm bitmojiKitSearchTerm) {
            if (bitmojiKitSearchTerm == BitmojiKitSearchTerm.getDefaultInstance()) {
                return this;
            }
            if (bitmojiKitSearchTerm.category_ != 0) {
                setCategoryValue(bitmojiKitSearchTerm.getCategoryValue());
            }
            if (!bitmojiKitSearchTerm.getValue().isEmpty()) {
                this.value_ = bitmojiKitSearchTerm.value_;
                onChanged();
            }
            mergeUnknownFields(bitmojiKitSearchTerm.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            BitmojiKitSearchTerm bitmojiKitSearchTerm;
            BitmojiKitSearchTerm bitmojiKitSearchTerm2 = null;
            try {
                BitmojiKitSearchTerm bitmojiKitSearchTerm3 = (BitmojiKitSearchTerm) BitmojiKitSearchTerm.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (bitmojiKitSearchTerm3 != null) {
                    mergeFrom(bitmojiKitSearchTerm3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                bitmojiKitSearchTerm = (BitmojiKitSearchTerm) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                bitmojiKitSearchTerm2 = bitmojiKitSearchTerm;
                if (bitmojiKitSearchTerm2 != null) {
                    mergeFrom(bitmojiKitSearchTerm2);
                }
                throw codedInputStream2;
            }
        }

        public int getCategoryValue() {
            return this.category_;
        }

        public Builder setCategoryValue(int i) {
            this.category_ = i;
            onChanged();
            return this;
        }

        public BitmojiKitSearchCategory getCategory() {
            BitmojiKitSearchCategory valueOf = BitmojiKitSearchCategory.valueOf(this.category_);
            return valueOf == null ? BitmojiKitSearchCategory.UNRECOGNIZED : valueOf;
        }

        public Builder setCategory(BitmojiKitSearchCategory bitmojiKitSearchCategory) {
            if (bitmojiKitSearchCategory == null) {
                throw new NullPointerException();
            }
            this.category_ = bitmojiKitSearchCategory.getNumber();
            onChanged();
            return this;
        }

        public Builder clearCategory() {
            this.category_ = 0;
            onChanged();
            return this;
        }

        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setValue(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.value_ = str;
            onChanged();
            return this;
        }

        public Builder clearValue() {
            this.value_ = BitmojiKitSearchTerm.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        public Builder setValueBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.value_ = byteString;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private BitmojiKitSearchTerm(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private BitmojiKitSearchTerm() {
        this.memoizedIsInitialized = (byte) -1;
        this.category_ = 0;
        this.value_ = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private BitmojiKitSearchTerm(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        Object obj = null;
        while (obj == null) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 8) {
                        this.category_ = codedInputStream.readEnum();
                    } else if (readTag == 18) {
                        this.value_ = codedInputStream.readStringRequireUtf8();
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
        return Event.f21722x650b94fe;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21723xf98cdd7c.ensureFieldAccessorsInitialized(BitmojiKitSearchTerm.class, Builder.class);
    }

    public int getCategoryValue() {
        return this.category_;
    }

    public BitmojiKitSearchCategory getCategory() {
        BitmojiKitSearchCategory valueOf = BitmojiKitSearchCategory.valueOf(this.category_);
        return valueOf == null ? BitmojiKitSearchCategory.UNRECOGNIZED : valueOf;
    }

    public String getValue() {
        Object obj = this.value_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.value_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getValueBytes() {
        Object obj = this.value_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.value_ = copyFromUtf8;
        return copyFromUtf8;
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
        if (this.category_ != BitmojiKitSearchCategory.UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY.getNumber()) {
            codedOutputStream.writeEnum(1, this.category_);
        }
        if (!getValueBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        i = 0;
        if (this.category_ != BitmojiKitSearchCategory.UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY.getNumber()) {
            i = 0 + CodedOutputStream.computeEnumSize(1, this.category_);
        }
        if (!getValueBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(2, this.value_);
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
        if (!(obj instanceof BitmojiKitSearchTerm)) {
            return super.equals(obj);
        }
        BitmojiKitSearchTerm bitmojiKitSearchTerm = (BitmojiKitSearchTerm) obj;
        Object obj2 = ((this.category_ == bitmojiKitSearchTerm.category_ ? 1 : null) == null || !getValue().equals(bitmojiKitSearchTerm.getValue())) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(bitmojiKitSearchTerm.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.category_) * 37) + 2) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static BitmojiKitSearchTerm parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BitmojiKitSearchTerm) PARSER.parseFrom(byteBuffer);
    }

    public static BitmojiKitSearchTerm parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSearchTerm) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BitmojiKitSearchTerm parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BitmojiKitSearchTerm) PARSER.parseFrom(byteString);
    }

    public static BitmojiKitSearchTerm parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSearchTerm) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static BitmojiKitSearchTerm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BitmojiKitSearchTerm) PARSER.parseFrom(bArr);
    }

    public static BitmojiKitSearchTerm parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSearchTerm) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BitmojiKitSearchTerm parseFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitSearchTerm) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitSearchTerm parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSearchTerm) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitSearchTerm parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitSearchTerm) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitSearchTerm parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSearchTerm) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitSearchTerm parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BitmojiKitSearchTerm) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BitmojiKitSearchTerm parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSearchTerm) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BitmojiKitSearchTerm bitmojiKitSearchTerm) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bitmojiKitSearchTerm);
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

    public static BitmojiKitSearchTerm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BitmojiKitSearchTerm> parser() {
        return PARSER;
    }

    public Parser<BitmojiKitSearchTerm> getParserForType() {
        return PARSER;
    }

    public BitmojiKitSearchTerm getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
