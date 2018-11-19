package com.snapchat.kit.sdk.core.metrics.model;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BitmojiKitSnapchatLinkSuccess extends GeneratedMessageV3 implements BitmojiKitSnapchatLinkSuccessOrBuilder {
    public static final int BITMOJI_KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final BitmojiKitSnapchatLinkSuccess DEFAULT_INSTANCE = new BitmojiKitSnapchatLinkSuccess();
    private static final Parser<BitmojiKitSnapchatLinkSuccess> PARSER = new C79021();
    private static final long serialVersionUID = 0;
    private BitmojiKitEventBase bitmojiKitEventBase_;
    private byte memoizedIsInitialized;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkSuccess$1 */
    static class C79021 extends AbstractParser<BitmojiKitSnapchatLinkSuccess> {
        C79021() {
        }

        public BitmojiKitSnapchatLinkSuccess parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BitmojiKitSnapchatLinkSuccess(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements BitmojiKitSnapchatLinkSuccessOrBuilder {
        private SingleFieldBuilderV3<BitmojiKitEventBase, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder, BitmojiKitEventBaseOrBuilder> bitmojiKitEventBaseBuilder_;
        private BitmojiKitEventBase bitmojiKitEventBase_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21728x9fa52963;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21729x9a523ce1.ensureFieldAccessorsInitialized(BitmojiKitSnapchatLinkSuccess.class, Builder.class);
        }

        private Builder() {
            this.bitmojiKitEventBase_ = null;
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.bitmojiKitEventBase_ = null;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            BitmojiKitSnapchatLinkSuccess.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                this.bitmojiKitEventBase_ = null;
            } else {
                this.bitmojiKitEventBase_ = null;
                this.bitmojiKitEventBaseBuilder_ = null;
            }
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21728x9fa52963;
        }

        public BitmojiKitSnapchatLinkSuccess getDefaultInstanceForType() {
            return BitmojiKitSnapchatLinkSuccess.getDefaultInstance();
        }

        public BitmojiKitSnapchatLinkSuccess build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public BitmojiKitSnapchatLinkSuccess buildPartial() {
            BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess = new BitmojiKitSnapchatLinkSuccess((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                bitmojiKitSnapchatLinkSuccess.bitmojiKitEventBase_ = this.bitmojiKitEventBase_;
            } else {
                bitmojiKitSnapchatLinkSuccess.bitmojiKitEventBase_ = (BitmojiKitEventBase) this.bitmojiKitEventBaseBuilder_.build();
            }
            onBuilt();
            return bitmojiKitSnapchatLinkSuccess;
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
            if (message instanceof BitmojiKitSnapchatLinkSuccess) {
                return mergeFrom((BitmojiKitSnapchatLinkSuccess) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess) {
            if (bitmojiKitSnapchatLinkSuccess == BitmojiKitSnapchatLinkSuccess.getDefaultInstance()) {
                return this;
            }
            if (bitmojiKitSnapchatLinkSuccess.hasBitmojiKitEventBase()) {
                mergeBitmojiKitEventBase(bitmojiKitSnapchatLinkSuccess.getBitmojiKitEventBase());
            }
            mergeUnknownFields(bitmojiKitSnapchatLinkSuccess.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess;
            BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess2 = null;
            try {
                BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess3 = (BitmojiKitSnapchatLinkSuccess) BitmojiKitSnapchatLinkSuccess.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (bitmojiKitSnapchatLinkSuccess3 != null) {
                    mergeFrom(bitmojiKitSnapchatLinkSuccess3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                bitmojiKitSnapchatLinkSuccess = (BitmojiKitSnapchatLinkSuccess) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                bitmojiKitSnapchatLinkSuccess2 = bitmojiKitSnapchatLinkSuccess;
                if (bitmojiKitSnapchatLinkSuccess2 != null) {
                    mergeFrom(bitmojiKitSnapchatLinkSuccess2);
                }
                throw codedInputStream2;
            }
        }

        public boolean hasBitmojiKitEventBase() {
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                if (this.bitmojiKitEventBase_ == null) {
                    return false;
                }
            }
            return true;
        }

        public BitmojiKitEventBase getBitmojiKitEventBase() {
            if (this.bitmojiKitEventBaseBuilder_ != null) {
                return (BitmojiKitEventBase) this.bitmojiKitEventBaseBuilder_.getMessage();
            }
            return this.bitmojiKitEventBase_ == null ? BitmojiKitEventBase.getDefaultInstance() : this.bitmojiKitEventBase_;
        }

        public Builder setBitmojiKitEventBase(BitmojiKitEventBase bitmojiKitEventBase) {
            if (this.bitmojiKitEventBaseBuilder_ != null) {
                this.bitmojiKitEventBaseBuilder_.setMessage(bitmojiKitEventBase);
            } else if (bitmojiKitEventBase == null) {
                throw new NullPointerException();
            } else {
                this.bitmojiKitEventBase_ = bitmojiKitEventBase;
                onChanged();
            }
            return this;
        }

        public Builder setBitmojiKitEventBase(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder builder) {
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                this.bitmojiKitEventBase_ = builder.build();
                onChanged();
            } else {
                this.bitmojiKitEventBaseBuilder_.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeBitmojiKitEventBase(BitmojiKitEventBase bitmojiKitEventBase) {
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                if (this.bitmojiKitEventBase_ != null) {
                    this.bitmojiKitEventBase_ = BitmojiKitEventBase.newBuilder(this.bitmojiKitEventBase_).mergeFrom(bitmojiKitEventBase).buildPartial();
                } else {
                    this.bitmojiKitEventBase_ = bitmojiKitEventBase;
                }
                onChanged();
            } else {
                this.bitmojiKitEventBaseBuilder_.mergeFrom(bitmojiKitEventBase);
            }
            return this;
        }

        public Builder clearBitmojiKitEventBase() {
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                this.bitmojiKitEventBase_ = null;
                onChanged();
            } else {
                this.bitmojiKitEventBase_ = null;
                this.bitmojiKitEventBaseBuilder_ = null;
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder getBitmojiKitEventBaseBuilder() {
            onChanged();
            return (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder) getBitmojiKitEventBaseFieldBuilder().getBuilder();
        }

        public BitmojiKitEventBaseOrBuilder getBitmojiKitEventBaseOrBuilder() {
            if (this.bitmojiKitEventBaseBuilder_ != null) {
                return (BitmojiKitEventBaseOrBuilder) this.bitmojiKitEventBaseBuilder_.getMessageOrBuilder();
            }
            return this.bitmojiKitEventBase_ == null ? BitmojiKitEventBase.getDefaultInstance() : this.bitmojiKitEventBase_;
        }

        private SingleFieldBuilderV3<BitmojiKitEventBase, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder, BitmojiKitEventBaseOrBuilder> getBitmojiKitEventBaseFieldBuilder() {
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                this.bitmojiKitEventBaseBuilder_ = new SingleFieldBuilderV3(getBitmojiKitEventBase(), getParentForChildren(), isClean());
                this.bitmojiKitEventBase_ = null;
            }
            return this.bitmojiKitEventBaseBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private BitmojiKitSnapchatLinkSuccess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private BitmojiKitSnapchatLinkSuccess() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private BitmojiKitSnapchatLinkSuccess(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                    if (readTag == 10) {
                        com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder builder = null;
                        if (this.bitmojiKitEventBase_ != null) {
                            builder = this.bitmojiKitEventBase_.toBuilder();
                        }
                        this.bitmojiKitEventBase_ = (BitmojiKitEventBase) codedInputStream.readMessage(BitmojiKitEventBase.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom(this.bitmojiKitEventBase_);
                            this.bitmojiKitEventBase_ = builder.buildPartial();
                        }
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
        return Event.f21728x9fa52963;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21729x9a523ce1.ensureFieldAccessorsInitialized(BitmojiKitSnapchatLinkSuccess.class, Builder.class);
    }

    public boolean hasBitmojiKitEventBase() {
        return this.bitmojiKitEventBase_ != null;
    }

    public BitmojiKitEventBase getBitmojiKitEventBase() {
        return this.bitmojiKitEventBase_ == null ? BitmojiKitEventBase.getDefaultInstance() : this.bitmojiKitEventBase_;
    }

    public BitmojiKitEventBaseOrBuilder getBitmojiKitEventBaseOrBuilder() {
        return getBitmojiKitEventBase();
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
        if (this.bitmojiKitEventBase_ != null) {
            codedOutputStream.writeMessage(1, getBitmojiKitEventBase());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        i = 0;
        if (this.bitmojiKitEventBase_ != null) {
            i = 0 + CodedOutputStream.computeMessageSize(1, getBitmojiKitEventBase());
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
        if (!(obj instanceof BitmojiKitSnapchatLinkSuccess)) {
            return super.equals(obj);
        }
        BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess = (BitmojiKitSnapchatLinkSuccess) obj;
        Object obj2 = hasBitmojiKitEventBase() == bitmojiKitSnapchatLinkSuccess.hasBitmojiKitEventBase() ? 1 : null;
        if (hasBitmojiKitEventBase()) {
            obj2 = (obj2 == null || !getBitmojiKitEventBase().equals(bitmojiKitSnapchatLinkSuccess.getBitmojiKitEventBase())) ? null : 1;
        }
        if (obj2 == null || this.unknownFields.equals(bitmojiKitSnapchatLinkSuccess.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasBitmojiKitEventBase()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getBitmojiKitEventBase().hashCode();
        }
        hashCode = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static BitmojiKitSnapchatLinkSuccess parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkSuccess) PARSER.parseFrom(byteBuffer);
    }

    public static BitmojiKitSnapchatLinkSuccess parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkSuccess) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BitmojiKitSnapchatLinkSuccess parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkSuccess) PARSER.parseFrom(byteString);
    }

    public static BitmojiKitSnapchatLinkSuccess parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkSuccess) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static BitmojiKitSnapchatLinkSuccess parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkSuccess) PARSER.parseFrom(bArr);
    }

    public static BitmojiKitSnapchatLinkSuccess parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkSuccess) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BitmojiKitSnapchatLinkSuccess parseFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitSnapchatLinkSuccess) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitSnapchatLinkSuccess parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSnapchatLinkSuccess) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitSnapchatLinkSuccess parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitSnapchatLinkSuccess) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitSnapchatLinkSuccess parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSnapchatLinkSuccess) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitSnapchatLinkSuccess parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BitmojiKitSnapchatLinkSuccess) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BitmojiKitSnapchatLinkSuccess parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSnapchatLinkSuccess) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bitmojiKitSnapchatLinkSuccess);
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

    public static BitmojiKitSnapchatLinkSuccess getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BitmojiKitSnapchatLinkSuccess> parser() {
        return PARSER;
    }

    public Parser<BitmojiKitSnapchatLinkSuccess> getParserForType() {
        return PARSER;
    }

    public BitmojiKitSnapchatLinkSuccess getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
