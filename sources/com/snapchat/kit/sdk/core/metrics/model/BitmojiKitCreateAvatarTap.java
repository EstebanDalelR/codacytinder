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

public final class BitmojiKitCreateAvatarTap extends GeneratedMessageV3 implements BitmojiKitCreateAvatarTapOrBuilder {
    public static final int BITMOJI_KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final BitmojiKitCreateAvatarTap DEFAULT_INSTANCE = new BitmojiKitCreateAvatarTap();
    private static final Parser<BitmojiKitCreateAvatarTap> PARSER = new C78971();
    private static final long serialVersionUID = 0;
    private BitmojiKitEventBase bitmojiKitEventBase_;
    private byte memoizedIsInitialized;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap$1 */
    static class C78971 extends AbstractParser<BitmojiKitCreateAvatarTap> {
        C78971() {
        }

        public BitmojiKitCreateAvatarTap parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BitmojiKitCreateAvatarTap(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements BitmojiKitCreateAvatarTapOrBuilder {
        private SingleFieldBuilderV3<BitmojiKitEventBase, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder, BitmojiKitEventBaseOrBuilder> bitmojiKitEventBaseBuilder_;
        private BitmojiKitEventBase bitmojiKitEventBase_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21718x89a1fa3c;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21719x108124ba.ensureFieldAccessorsInitialized(BitmojiKitCreateAvatarTap.class, Builder.class);
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
            BitmojiKitCreateAvatarTap.alwaysUseFieldBuilders;
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
            return Event.f21718x89a1fa3c;
        }

        public BitmojiKitCreateAvatarTap getDefaultInstanceForType() {
            return BitmojiKitCreateAvatarTap.getDefaultInstance();
        }

        public BitmojiKitCreateAvatarTap build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public BitmojiKitCreateAvatarTap buildPartial() {
            BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap = new BitmojiKitCreateAvatarTap((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                bitmojiKitCreateAvatarTap.bitmojiKitEventBase_ = this.bitmojiKitEventBase_;
            } else {
                bitmojiKitCreateAvatarTap.bitmojiKitEventBase_ = (BitmojiKitEventBase) this.bitmojiKitEventBaseBuilder_.build();
            }
            onBuilt();
            return bitmojiKitCreateAvatarTap;
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
            if (message instanceof BitmojiKitCreateAvatarTap) {
                return mergeFrom((BitmojiKitCreateAvatarTap) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap) {
            if (bitmojiKitCreateAvatarTap == BitmojiKitCreateAvatarTap.getDefaultInstance()) {
                return this;
            }
            if (bitmojiKitCreateAvatarTap.hasBitmojiKitEventBase()) {
                mergeBitmojiKitEventBase(bitmojiKitCreateAvatarTap.getBitmojiKitEventBase());
            }
            mergeUnknownFields(bitmojiKitCreateAvatarTap.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap;
            BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap2 = null;
            try {
                BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap3 = (BitmojiKitCreateAvatarTap) BitmojiKitCreateAvatarTap.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (bitmojiKitCreateAvatarTap3 != null) {
                    mergeFrom(bitmojiKitCreateAvatarTap3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                bitmojiKitCreateAvatarTap = (BitmojiKitCreateAvatarTap) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                bitmojiKitCreateAvatarTap2 = bitmojiKitCreateAvatarTap;
                if (bitmojiKitCreateAvatarTap2 != null) {
                    mergeFrom(bitmojiKitCreateAvatarTap2);
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

    private BitmojiKitCreateAvatarTap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private BitmojiKitCreateAvatarTap() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private BitmojiKitCreateAvatarTap(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
        return Event.f21718x89a1fa3c;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21719x108124ba.ensureFieldAccessorsInitialized(BitmojiKitCreateAvatarTap.class, Builder.class);
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
        if (!(obj instanceof BitmojiKitCreateAvatarTap)) {
            return super.equals(obj);
        }
        BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap = (BitmojiKitCreateAvatarTap) obj;
        Object obj2 = hasBitmojiKitEventBase() == bitmojiKitCreateAvatarTap.hasBitmojiKitEventBase() ? 1 : null;
        if (hasBitmojiKitEventBase()) {
            obj2 = (obj2 == null || !getBitmojiKitEventBase().equals(bitmojiKitCreateAvatarTap.getBitmojiKitEventBase())) ? null : 1;
        }
        if (obj2 == null || this.unknownFields.equals(bitmojiKitCreateAvatarTap.unknownFields) == null) {
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

    public static BitmojiKitCreateAvatarTap parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BitmojiKitCreateAvatarTap) PARSER.parseFrom(byteBuffer);
    }

    public static BitmojiKitCreateAvatarTap parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitCreateAvatarTap) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BitmojiKitCreateAvatarTap parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BitmojiKitCreateAvatarTap) PARSER.parseFrom(byteString);
    }

    public static BitmojiKitCreateAvatarTap parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitCreateAvatarTap) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static BitmojiKitCreateAvatarTap parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BitmojiKitCreateAvatarTap) PARSER.parseFrom(bArr);
    }

    public static BitmojiKitCreateAvatarTap parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitCreateAvatarTap) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BitmojiKitCreateAvatarTap parseFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitCreateAvatarTap) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitCreateAvatarTap parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitCreateAvatarTap) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitCreateAvatarTap parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitCreateAvatarTap) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitCreateAvatarTap parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitCreateAvatarTap) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitCreateAvatarTap parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BitmojiKitCreateAvatarTap) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BitmojiKitCreateAvatarTap parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitCreateAvatarTap) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bitmojiKitCreateAvatarTap);
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

    public static BitmojiKitCreateAvatarTap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BitmojiKitCreateAvatarTap> parser() {
        return PARSER;
    }

    public Parser<BitmojiKitCreateAvatarTap> getParserForType() {
        return PARSER;
    }

    public BitmojiKitCreateAvatarTap getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
