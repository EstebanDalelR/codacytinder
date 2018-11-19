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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BitmojiKitStickerPickerClose extends GeneratedMessageV3 implements BitmojiKitStickerPickerCloseOrBuilder {
    public static final int BITMOJI_KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final BitmojiKitStickerPickerClose DEFAULT_INSTANCE = new BitmojiKitStickerPickerClose();
    private static final Parser<BitmojiKitStickerPickerClose> PARSER = new C79041();
    public static final int STICKER_PICKER_SESSION_DURATION_MILLIS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private BitmojiKitEventBase bitmojiKitEventBase_;
    private byte memoizedIsInitialized;
    private long stickerPickerSessionDurationMillis_;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose$1 */
    static class C79041 extends AbstractParser<BitmojiKitStickerPickerClose> {
        C79041() {
        }

        public BitmojiKitStickerPickerClose parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BitmojiKitStickerPickerClose(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements BitmojiKitStickerPickerCloseOrBuilder {
        private SingleFieldBuilderV3<BitmojiKitEventBase, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder, BitmojiKitEventBaseOrBuilder> bitmojiKitEventBaseBuilder_;
        private BitmojiKitEventBase bitmojiKitEventBase_;
        private long stickerPickerSessionDurationMillis_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21732x598b8505;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21733x34fbd683.ensureFieldAccessorsInitialized(BitmojiKitStickerPickerClose.class, Builder.class);
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
            BitmojiKitStickerPickerClose.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                this.bitmojiKitEventBase_ = null;
            } else {
                this.bitmojiKitEventBase_ = null;
                this.bitmojiKitEventBaseBuilder_ = null;
            }
            this.stickerPickerSessionDurationMillis_ = 0;
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21732x598b8505;
        }

        public BitmojiKitStickerPickerClose getDefaultInstanceForType() {
            return BitmojiKitStickerPickerClose.getDefaultInstance();
        }

        public BitmojiKitStickerPickerClose build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public BitmojiKitStickerPickerClose buildPartial() {
            BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose = new BitmojiKitStickerPickerClose((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                bitmojiKitStickerPickerClose.bitmojiKitEventBase_ = this.bitmojiKitEventBase_;
            } else {
                bitmojiKitStickerPickerClose.bitmojiKitEventBase_ = (BitmojiKitEventBase) this.bitmojiKitEventBaseBuilder_.build();
            }
            bitmojiKitStickerPickerClose.stickerPickerSessionDurationMillis_ = this.stickerPickerSessionDurationMillis_;
            onBuilt();
            return bitmojiKitStickerPickerClose;
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
            if (message instanceof BitmojiKitStickerPickerClose) {
                return mergeFrom((BitmojiKitStickerPickerClose) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose) {
            if (bitmojiKitStickerPickerClose == BitmojiKitStickerPickerClose.getDefaultInstance()) {
                return this;
            }
            if (bitmojiKitStickerPickerClose.hasBitmojiKitEventBase()) {
                mergeBitmojiKitEventBase(bitmojiKitStickerPickerClose.getBitmojiKitEventBase());
            }
            if (bitmojiKitStickerPickerClose.getStickerPickerSessionDurationMillis() != 0) {
                setStickerPickerSessionDurationMillis(bitmojiKitStickerPickerClose.getStickerPickerSessionDurationMillis());
            }
            mergeUnknownFields(bitmojiKitStickerPickerClose.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose;
            BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose2 = null;
            try {
                BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose3 = (BitmojiKitStickerPickerClose) BitmojiKitStickerPickerClose.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (bitmojiKitStickerPickerClose3 != null) {
                    mergeFrom(bitmojiKitStickerPickerClose3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                bitmojiKitStickerPickerClose = (BitmojiKitStickerPickerClose) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                bitmojiKitStickerPickerClose2 = bitmojiKitStickerPickerClose;
                if (bitmojiKitStickerPickerClose2 != null) {
                    mergeFrom(bitmojiKitStickerPickerClose2);
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

        public long getStickerPickerSessionDurationMillis() {
            return this.stickerPickerSessionDurationMillis_;
        }

        public Builder setStickerPickerSessionDurationMillis(long j) {
            this.stickerPickerSessionDurationMillis_ = j;
            onChanged();
            return this;
        }

        public Builder clearStickerPickerSessionDurationMillis() {
            this.stickerPickerSessionDurationMillis_ = 0;
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

    private BitmojiKitStickerPickerClose(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private BitmojiKitStickerPickerClose() {
        this.memoizedIsInitialized = (byte) -1;
        this.stickerPickerSessionDurationMillis_ = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private BitmojiKitStickerPickerClose(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                    } else if (readTag == 16) {
                        this.stickerPickerSessionDurationMillis_ = codedInputStream.readUInt64();
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
        return Event.f21732x598b8505;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21733x34fbd683.ensureFieldAccessorsInitialized(BitmojiKitStickerPickerClose.class, Builder.class);
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

    public long getStickerPickerSessionDurationMillis() {
        return this.stickerPickerSessionDurationMillis_;
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
        if (this.stickerPickerSessionDurationMillis_ != 0) {
            codedOutputStream.writeUInt64(2, this.stickerPickerSessionDurationMillis_);
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
        if (this.stickerPickerSessionDurationMillis_ != 0) {
            i += CodedOutputStream.computeUInt64Size(2, this.stickerPickerSessionDurationMillis_);
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
        if (!(obj instanceof BitmojiKitStickerPickerClose)) {
            return super.equals(obj);
        }
        BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose = (BitmojiKitStickerPickerClose) obj;
        Object obj2 = hasBitmojiKitEventBase() == bitmojiKitStickerPickerClose.hasBitmojiKitEventBase() ? 1 : null;
        if (hasBitmojiKitEventBase()) {
            obj2 = (obj2 == null || !getBitmojiKitEventBase().equals(bitmojiKitStickerPickerClose.getBitmojiKitEventBase())) ? null : 1;
        }
        obj2 = (obj2 == null || getStickerPickerSessionDurationMillis() != bitmojiKitStickerPickerClose.getStickerPickerSessionDurationMillis()) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(bitmojiKitStickerPickerClose.unknownFields) == null) {
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
        hashCode = (((((hashCode * 37) + 2) * 53) + Internal.hashLong(getStickerPickerSessionDurationMillis())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static BitmojiKitStickerPickerClose parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerClose) PARSER.parseFrom(byteBuffer);
    }

    public static BitmojiKitStickerPickerClose parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerClose) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BitmojiKitStickerPickerClose parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerClose) PARSER.parseFrom(byteString);
    }

    public static BitmojiKitStickerPickerClose parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerClose) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static BitmojiKitStickerPickerClose parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerClose) PARSER.parseFrom(bArr);
    }

    public static BitmojiKitStickerPickerClose parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerClose) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BitmojiKitStickerPickerClose parseFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitStickerPickerClose) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitStickerPickerClose parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitStickerPickerClose) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitStickerPickerClose parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitStickerPickerClose) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitStickerPickerClose parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitStickerPickerClose) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitStickerPickerClose parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BitmojiKitStickerPickerClose) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BitmojiKitStickerPickerClose parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitStickerPickerClose) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bitmojiKitStickerPickerClose);
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

    public static BitmojiKitStickerPickerClose getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BitmojiKitStickerPickerClose> parser() {
        return PARSER;
    }

    public Parser<BitmojiKitStickerPickerClose> getParserForType() {
        return PARSER;
    }

    public BitmojiKitStickerPickerClose getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
