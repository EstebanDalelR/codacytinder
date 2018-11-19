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

public final class BitmojiKitStickerPickerOpen extends GeneratedMessageV3 implements BitmojiKitStickerPickerOpenOrBuilder {
    public static final int BITMOJI_KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final BitmojiKitStickerPickerOpen DEFAULT_INSTANCE = new BitmojiKitStickerPickerOpen();
    private static final Parser<BitmojiKitStickerPickerOpen> PARSER = new C79051();
    public static final int STICKER_PICKER_VIEW_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private BitmojiKitEventBase bitmojiKitEventBase_;
    private byte memoizedIsInitialized;
    private int stickerPickerView_;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen$1 */
    static class C79051 extends AbstractParser<BitmojiKitStickerPickerOpen> {
        C79051() {
        }

        public BitmojiKitStickerPickerOpen parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BitmojiKitStickerPickerOpen(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements BitmojiKitStickerPickerOpenOrBuilder {
        private SingleFieldBuilderV3<BitmojiKitEventBase, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.Builder, BitmojiKitEventBaseOrBuilder> bitmojiKitEventBaseBuilder_;
        private BitmojiKitEventBase bitmojiKitEventBase_;
        private int stickerPickerView_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21734xf10311b5;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21735xc133b333.ensureFieldAccessorsInitialized(BitmojiKitStickerPickerOpen.class, Builder.class);
        }

        private Builder() {
            this.bitmojiKitEventBase_ = null;
            this.stickerPickerView_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.bitmojiKitEventBase_ = null;
            this.stickerPickerView_ = null;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            BitmojiKitStickerPickerOpen.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                this.bitmojiKitEventBase_ = null;
            } else {
                this.bitmojiKitEventBase_ = null;
                this.bitmojiKitEventBaseBuilder_ = null;
            }
            this.stickerPickerView_ = 0;
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21734xf10311b5;
        }

        public BitmojiKitStickerPickerOpen getDefaultInstanceForType() {
            return BitmojiKitStickerPickerOpen.getDefaultInstance();
        }

        public BitmojiKitStickerPickerOpen build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public BitmojiKitStickerPickerOpen buildPartial() {
            BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen = new BitmojiKitStickerPickerOpen((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.bitmojiKitEventBaseBuilder_ == null) {
                bitmojiKitStickerPickerOpen.bitmojiKitEventBase_ = this.bitmojiKitEventBase_;
            } else {
                bitmojiKitStickerPickerOpen.bitmojiKitEventBase_ = (BitmojiKitEventBase) this.bitmojiKitEventBaseBuilder_.build();
            }
            bitmojiKitStickerPickerOpen.stickerPickerView_ = this.stickerPickerView_;
            onBuilt();
            return bitmojiKitStickerPickerOpen;
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
            if (message instanceof BitmojiKitStickerPickerOpen) {
                return mergeFrom((BitmojiKitStickerPickerOpen) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen) {
            if (bitmojiKitStickerPickerOpen == BitmojiKitStickerPickerOpen.getDefaultInstance()) {
                return this;
            }
            if (bitmojiKitStickerPickerOpen.hasBitmojiKitEventBase()) {
                mergeBitmojiKitEventBase(bitmojiKitStickerPickerOpen.getBitmojiKitEventBase());
            }
            if (bitmojiKitStickerPickerOpen.stickerPickerView_ != 0) {
                setStickerPickerViewValue(bitmojiKitStickerPickerOpen.getStickerPickerViewValue());
            }
            mergeUnknownFields(bitmojiKitStickerPickerOpen.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen;
            BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen2 = null;
            try {
                BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen3 = (BitmojiKitStickerPickerOpen) BitmojiKitStickerPickerOpen.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (bitmojiKitStickerPickerOpen3 != null) {
                    mergeFrom(bitmojiKitStickerPickerOpen3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                bitmojiKitStickerPickerOpen = (BitmojiKitStickerPickerOpen) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                bitmojiKitStickerPickerOpen2 = bitmojiKitStickerPickerOpen;
                if (bitmojiKitStickerPickerOpen2 != null) {
                    mergeFrom(bitmojiKitStickerPickerOpen2);
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

        public int getStickerPickerViewValue() {
            return this.stickerPickerView_;
        }

        public Builder setStickerPickerViewValue(int i) {
            this.stickerPickerView_ = i;
            onChanged();
            return this;
        }

        public BitmojiKitStickerPickerView getStickerPickerView() {
            BitmojiKitStickerPickerView valueOf = BitmojiKitStickerPickerView.valueOf(this.stickerPickerView_);
            return valueOf == null ? BitmojiKitStickerPickerView.UNRECOGNIZED : valueOf;
        }

        public Builder setStickerPickerView(BitmojiKitStickerPickerView bitmojiKitStickerPickerView) {
            if (bitmojiKitStickerPickerView == null) {
                throw new NullPointerException();
            }
            this.stickerPickerView_ = bitmojiKitStickerPickerView.getNumber();
            onChanged();
            return this;
        }

        public Builder clearStickerPickerView() {
            this.stickerPickerView_ = 0;
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

    private BitmojiKitStickerPickerOpen(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private BitmojiKitStickerPickerOpen() {
        this.memoizedIsInitialized = (byte) -1;
        this.stickerPickerView_ = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private BitmojiKitStickerPickerOpen(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        this.stickerPickerView_ = codedInputStream.readEnum();
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
        return Event.f21734xf10311b5;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21735xc133b333.ensureFieldAccessorsInitialized(BitmojiKitStickerPickerOpen.class, Builder.class);
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

    public int getStickerPickerViewValue() {
        return this.stickerPickerView_;
    }

    public BitmojiKitStickerPickerView getStickerPickerView() {
        BitmojiKitStickerPickerView valueOf = BitmojiKitStickerPickerView.valueOf(this.stickerPickerView_);
        return valueOf == null ? BitmojiKitStickerPickerView.UNRECOGNIZED : valueOf;
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
        if (this.stickerPickerView_ != BitmojiKitStickerPickerView.UNKNOWN_BITMOJI_KIT_PICKER_VIEW.getNumber()) {
            codedOutputStream.writeEnum(2, this.stickerPickerView_);
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
        if (this.stickerPickerView_ != BitmojiKitStickerPickerView.UNKNOWN_BITMOJI_KIT_PICKER_VIEW.getNumber()) {
            i += CodedOutputStream.computeEnumSize(2, this.stickerPickerView_);
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
        if (!(obj instanceof BitmojiKitStickerPickerOpen)) {
            return super.equals(obj);
        }
        BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen = (BitmojiKitStickerPickerOpen) obj;
        Object obj2 = hasBitmojiKitEventBase() == bitmojiKitStickerPickerOpen.hasBitmojiKitEventBase() ? 1 : null;
        if (hasBitmojiKitEventBase()) {
            obj2 = (obj2 == null || !getBitmojiKitEventBase().equals(bitmojiKitStickerPickerOpen.getBitmojiKitEventBase())) ? null : 1;
        }
        obj2 = (obj2 == null || this.stickerPickerView_ != bitmojiKitStickerPickerOpen.stickerPickerView_) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(bitmojiKitStickerPickerOpen.unknownFields) == null) {
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
        hashCode = (((((hashCode * 37) + 2) * 53) + this.stickerPickerView_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static BitmojiKitStickerPickerOpen parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerOpen) PARSER.parseFrom(byteBuffer);
    }

    public static BitmojiKitStickerPickerOpen parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerOpen) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BitmojiKitStickerPickerOpen parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerOpen) PARSER.parseFrom(byteString);
    }

    public static BitmojiKitStickerPickerOpen parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerOpen) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static BitmojiKitStickerPickerOpen parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerOpen) PARSER.parseFrom(bArr);
    }

    public static BitmojiKitStickerPickerOpen parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitStickerPickerOpen) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BitmojiKitStickerPickerOpen parseFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitStickerPickerOpen) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitStickerPickerOpen parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitStickerPickerOpen) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitStickerPickerOpen parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitStickerPickerOpen) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitStickerPickerOpen parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitStickerPickerOpen) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitStickerPickerOpen parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BitmojiKitStickerPickerOpen) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BitmojiKitStickerPickerOpen parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitStickerPickerOpen) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bitmojiKitStickerPickerOpen);
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

    public static BitmojiKitStickerPickerOpen getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BitmojiKitStickerPickerOpen> parser() {
        return PARSER;
    }

    public Parser<BitmojiKitStickerPickerOpen> getParserForType() {
        return PARSER;
    }

    public BitmojiKitStickerPickerOpen getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
