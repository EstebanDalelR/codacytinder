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

public final class BitmojiKitSnapchatLinkTap extends GeneratedMessageV3 implements BitmojiKitSnapchatLinkTapOrBuilder {
    public static final int BITMOJI_KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final BitmojiKitSnapchatLinkTap DEFAULT_INSTANCE = new BitmojiKitSnapchatLinkTap();
    private static final Parser<BitmojiKitSnapchatLinkTap> PARSER = new C79031();
    private static final long serialVersionUID = 0;
    private BitmojiKitEventBase bitmojiKitEventBase_;
    private byte memoizedIsInitialized;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap$1 */
    static class C79031 extends AbstractParser<BitmojiKitSnapchatLinkTap> {
        C79031() {
        }

        public BitmojiKitSnapchatLinkTap parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BitmojiKitSnapchatLinkTap(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements BitmojiKitSnapchatLinkTapOrBuilder {
        private SingleFieldBuilderV3<BitmojiKitEventBase, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder, BitmojiKitEventBaseOrBuilder> bitmojiKitEventBaseBuilder_;
        private BitmojiKitEventBase bitmojiKitEventBase_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21730xf74b81c3;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21731xbca3541.ensureFieldAccessorsInitialized(BitmojiKitSnapchatLinkTap.class, Builder.class);
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
            BitmojiKitSnapchatLinkTap.alwaysUseFieldBuilders;
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
            return Event.f21730xf74b81c3;
        }

        public BitmojiKitSnapchatLinkTap getDefaultInstanceForType() {
            return BitmojiKitSnapchatLinkTap.getDefaultInstance();
        }

        public BitmojiKitSnapchatLinkTap build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public BitmojiKitSnapchatLinkTap buildPartial() {
            BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap = new BitmojiKitSnapchatLinkTap((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                bitmojiKitSnapchatLinkTap.bitmojiKitEventBase_ = this.bitmojiKitEventBase_;
            } else {
                bitmojiKitSnapchatLinkTap.bitmojiKitEventBase_ = (BitmojiKitEventBase) this.bitmojiKitEventBaseBuilder_.build();
            }
            onBuilt();
            return bitmojiKitSnapchatLinkTap;
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
            if (message instanceof BitmojiKitSnapchatLinkTap) {
                return mergeFrom((BitmojiKitSnapchatLinkTap) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap) {
            if (bitmojiKitSnapchatLinkTap == BitmojiKitSnapchatLinkTap.getDefaultInstance()) {
                return this;
            }
            if (bitmojiKitSnapchatLinkTap.hasBitmojiKitEventBase()) {
                mergeBitmojiKitEventBase(bitmojiKitSnapchatLinkTap.getBitmojiKitEventBase());
            }
            mergeUnknownFields(bitmojiKitSnapchatLinkTap.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap;
            BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap2 = null;
            try {
                BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap3 = (BitmojiKitSnapchatLinkTap) BitmojiKitSnapchatLinkTap.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (bitmojiKitSnapchatLinkTap3 != null) {
                    mergeFrom(bitmojiKitSnapchatLinkTap3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                bitmojiKitSnapchatLinkTap = (BitmojiKitSnapchatLinkTap) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                bitmojiKitSnapchatLinkTap2 = bitmojiKitSnapchatLinkTap;
                if (bitmojiKitSnapchatLinkTap2 != null) {
                    mergeFrom(bitmojiKitSnapchatLinkTap2);
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

    private BitmojiKitSnapchatLinkTap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private BitmojiKitSnapchatLinkTap() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private BitmojiKitSnapchatLinkTap(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
        return Event.f21730xf74b81c3;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21731xbca3541.ensureFieldAccessorsInitialized(BitmojiKitSnapchatLinkTap.class, Builder.class);
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
        if (!(obj instanceof BitmojiKitSnapchatLinkTap)) {
            return super.equals(obj);
        }
        BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap = (BitmojiKitSnapchatLinkTap) obj;
        Object obj2 = hasBitmojiKitEventBase() == bitmojiKitSnapchatLinkTap.hasBitmojiKitEventBase() ? 1 : null;
        if (hasBitmojiKitEventBase()) {
            obj2 = (obj2 == null || !getBitmojiKitEventBase().equals(bitmojiKitSnapchatLinkTap.getBitmojiKitEventBase())) ? null : 1;
        }
        if (obj2 == null || this.unknownFields.equals(bitmojiKitSnapchatLinkTap.unknownFields) == null) {
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

    public static BitmojiKitSnapchatLinkTap parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkTap) PARSER.parseFrom(byteBuffer);
    }

    public static BitmojiKitSnapchatLinkTap parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkTap) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BitmojiKitSnapchatLinkTap parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkTap) PARSER.parseFrom(byteString);
    }

    public static BitmojiKitSnapchatLinkTap parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkTap) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static BitmojiKitSnapchatLinkTap parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkTap) PARSER.parseFrom(bArr);
    }

    public static BitmojiKitSnapchatLinkTap parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitSnapchatLinkTap) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BitmojiKitSnapchatLinkTap parseFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitSnapchatLinkTap) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitSnapchatLinkTap parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSnapchatLinkTap) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitSnapchatLinkTap parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitSnapchatLinkTap) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitSnapchatLinkTap parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSnapchatLinkTap) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitSnapchatLinkTap parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BitmojiKitSnapchatLinkTap) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BitmojiKitSnapchatLinkTap parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitSnapchatLinkTap) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bitmojiKitSnapchatLinkTap);
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

    public static BitmojiKitSnapchatLinkTap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BitmojiKitSnapchatLinkTap> parser() {
        return PARSER;
    }

    public Parser<BitmojiKitSnapchatLinkTap> getParserForType() {
        return PARSER;
    }

    public BitmojiKitSnapchatLinkTap getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
