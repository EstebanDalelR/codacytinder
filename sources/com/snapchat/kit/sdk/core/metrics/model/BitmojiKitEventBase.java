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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BitmojiKitEventBase extends GeneratedMessageV3 implements BitmojiKitEventBaseOrBuilder {
    private static final BitmojiKitEventBase DEFAULT_INSTANCE = new BitmojiKitEventBase();
    public static final int KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final Parser<BitmojiKitEventBase> PARSER = new C78981();
    public static final int STICKER_PICKER_SESSION_ID_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private KitEventBase kitEventBase_;
    private byte memoizedIsInitialized;
    private volatile Object stickerPickerSessionId_;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase$1 */
    static class C78981 extends AbstractParser<BitmojiKitEventBase> {
        C78981() {
        }

        public BitmojiKitEventBase parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BitmojiKitEventBase(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements BitmojiKitEventBaseOrBuilder {
        private SingleFieldBuilderV3<KitEventBase, com.snapchat.kit.sdk.core.metrics.model.KitEventBase.Builder, KitEventBaseOrBuilder> kitEventBaseBuilder_;
        private KitEventBase kitEventBase_;
        private Object stickerPickerSessionId_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21720xdf02607f;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21721x180497fd.ensureFieldAccessorsInitialized(BitmojiKitEventBase.class, Builder.class);
        }

        private Builder() {
            this.kitEventBase_ = null;
            this.stickerPickerSessionId_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.kitEventBase_ = null;
            this.stickerPickerSessionId_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            BitmojiKitEventBase.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.kitEventBaseBuilder_ == null) {
                this.kitEventBase_ = null;
            } else {
                this.kitEventBase_ = null;
                this.kitEventBaseBuilder_ = null;
            }
            this.stickerPickerSessionId_ = "";
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21720xdf02607f;
        }

        public BitmojiKitEventBase getDefaultInstanceForType() {
            return BitmojiKitEventBase.getDefaultInstance();
        }

        public BitmojiKitEventBase build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public BitmojiKitEventBase buildPartial() {
            BitmojiKitEventBase bitmojiKitEventBase = new BitmojiKitEventBase((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.kitEventBaseBuilder_ == null) {
                bitmojiKitEventBase.kitEventBase_ = this.kitEventBase_;
            } else {
                bitmojiKitEventBase.kitEventBase_ = (KitEventBase) this.kitEventBaseBuilder_.build();
            }
            bitmojiKitEventBase.stickerPickerSessionId_ = this.stickerPickerSessionId_;
            onBuilt();
            return bitmojiKitEventBase;
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
            if (message instanceof BitmojiKitEventBase) {
                return mergeFrom((BitmojiKitEventBase) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BitmojiKitEventBase bitmojiKitEventBase) {
            if (bitmojiKitEventBase == BitmojiKitEventBase.getDefaultInstance()) {
                return this;
            }
            if (bitmojiKitEventBase.hasKitEventBase()) {
                mergeKitEventBase(bitmojiKitEventBase.getKitEventBase());
            }
            if (!bitmojiKitEventBase.getStickerPickerSessionId().isEmpty()) {
                this.stickerPickerSessionId_ = bitmojiKitEventBase.stickerPickerSessionId_;
                onChanged();
            }
            mergeUnknownFields(bitmojiKitEventBase.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            BitmojiKitEventBase bitmojiKitEventBase;
            BitmojiKitEventBase bitmojiKitEventBase2 = null;
            try {
                BitmojiKitEventBase bitmojiKitEventBase3 = (BitmojiKitEventBase) BitmojiKitEventBase.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (bitmojiKitEventBase3 != null) {
                    mergeFrom(bitmojiKitEventBase3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                bitmojiKitEventBase = (BitmojiKitEventBase) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                bitmojiKitEventBase2 = bitmojiKitEventBase;
                if (bitmojiKitEventBase2 != null) {
                    mergeFrom(bitmojiKitEventBase2);
                }
                throw codedInputStream2;
            }
        }

        public boolean hasKitEventBase() {
            if (this.kitEventBaseBuilder_ == null) {
                if (this.kitEventBase_ == null) {
                    return false;
                }
            }
            return true;
        }

        public KitEventBase getKitEventBase() {
            if (this.kitEventBaseBuilder_ != null) {
                return (KitEventBase) this.kitEventBaseBuilder_.getMessage();
            }
            return this.kitEventBase_ == null ? KitEventBase.getDefaultInstance() : this.kitEventBase_;
        }

        public Builder setKitEventBase(KitEventBase kitEventBase) {
            if (this.kitEventBaseBuilder_ != null) {
                this.kitEventBaseBuilder_.setMessage(kitEventBase);
            } else if (kitEventBase == null) {
                throw new NullPointerException();
            } else {
                this.kitEventBase_ = kitEventBase;
                onChanged();
            }
            return this;
        }

        public Builder setKitEventBase(com.snapchat.kit.sdk.core.metrics.model.KitEventBase.Builder builder) {
            if (this.kitEventBaseBuilder_ == null) {
                this.kitEventBase_ = builder.build();
                onChanged();
            } else {
                this.kitEventBaseBuilder_.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeKitEventBase(KitEventBase kitEventBase) {
            if (this.kitEventBaseBuilder_ == null) {
                if (this.kitEventBase_ != null) {
                    this.kitEventBase_ = KitEventBase.newBuilder(this.kitEventBase_).mergeFrom(kitEventBase).buildPartial();
                } else {
                    this.kitEventBase_ = kitEventBase;
                }
                onChanged();
            } else {
                this.kitEventBaseBuilder_.mergeFrom(kitEventBase);
            }
            return this;
        }

        public Builder clearKitEventBase() {
            if (this.kitEventBaseBuilder_ == null) {
                this.kitEventBase_ = null;
                onChanged();
            } else {
                this.kitEventBase_ = null;
                this.kitEventBaseBuilder_ = null;
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.KitEventBase.Builder getKitEventBaseBuilder() {
            onChanged();
            return (com.snapchat.kit.sdk.core.metrics.model.KitEventBase.Builder) getKitEventBaseFieldBuilder().getBuilder();
        }

        public KitEventBaseOrBuilder getKitEventBaseOrBuilder() {
            if (this.kitEventBaseBuilder_ != null) {
                return (KitEventBaseOrBuilder) this.kitEventBaseBuilder_.getMessageOrBuilder();
            }
            return this.kitEventBase_ == null ? KitEventBase.getDefaultInstance() : this.kitEventBase_;
        }

        private SingleFieldBuilderV3<KitEventBase, com.snapchat.kit.sdk.core.metrics.model.KitEventBase.Builder, KitEventBaseOrBuilder> getKitEventBaseFieldBuilder() {
            if (this.kitEventBaseBuilder_ == null) {
                this.kitEventBaseBuilder_ = new SingleFieldBuilderV3(getKitEventBase(), getParentForChildren(), isClean());
                this.kitEventBase_ = null;
            }
            return this.kitEventBaseBuilder_;
        }

        public String getStickerPickerSessionId() {
            Object obj = this.stickerPickerSessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.stickerPickerSessionId_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getStickerPickerSessionIdBytes() {
            Object obj = this.stickerPickerSessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.stickerPickerSessionId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setStickerPickerSessionId(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.stickerPickerSessionId_ = str;
            onChanged();
            return this;
        }

        public Builder clearStickerPickerSessionId() {
            this.stickerPickerSessionId_ = BitmojiKitEventBase.getDefaultInstance().getStickerPickerSessionId();
            onChanged();
            return this;
        }

        public Builder setStickerPickerSessionIdBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.stickerPickerSessionId_ = byteString;
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

    private BitmojiKitEventBase(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private BitmojiKitEventBase() {
        this.memoizedIsInitialized = (byte) -1;
        this.stickerPickerSessionId_ = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private BitmojiKitEventBase(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        com.snapchat.kit.sdk.core.metrics.model.KitEventBase.Builder builder = null;
                        if (this.kitEventBase_ != null) {
                            builder = this.kitEventBase_.toBuilder();
                        }
                        this.kitEventBase_ = (KitEventBase) codedInputStream.readMessage(KitEventBase.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom(this.kitEventBase_);
                            this.kitEventBase_ = builder.buildPartial();
                        }
                    } else if (readTag == 18) {
                        this.stickerPickerSessionId_ = codedInputStream.readStringRequireUtf8();
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
        return Event.f21720xdf02607f;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21721x180497fd.ensureFieldAccessorsInitialized(BitmojiKitEventBase.class, Builder.class);
    }

    public boolean hasKitEventBase() {
        return this.kitEventBase_ != null;
    }

    public KitEventBase getKitEventBase() {
        return this.kitEventBase_ == null ? KitEventBase.getDefaultInstance() : this.kitEventBase_;
    }

    public KitEventBaseOrBuilder getKitEventBaseOrBuilder() {
        return getKitEventBase();
    }

    public String getStickerPickerSessionId() {
        Object obj = this.stickerPickerSessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.stickerPickerSessionId_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getStickerPickerSessionIdBytes() {
        Object obj = this.stickerPickerSessionId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.stickerPickerSessionId_ = copyFromUtf8;
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
        if (this.kitEventBase_ != null) {
            codedOutputStream.writeMessage(1, getKitEventBase());
        }
        if (!getStickerPickerSessionIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.stickerPickerSessionId_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        i = 0;
        if (this.kitEventBase_ != null) {
            i = 0 + CodedOutputStream.computeMessageSize(1, getKitEventBase());
        }
        if (!getStickerPickerSessionIdBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(2, this.stickerPickerSessionId_);
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
        if (!(obj instanceof BitmojiKitEventBase)) {
            return super.equals(obj);
        }
        BitmojiKitEventBase bitmojiKitEventBase = (BitmojiKitEventBase) obj;
        Object obj2 = hasKitEventBase() == bitmojiKitEventBase.hasKitEventBase() ? 1 : null;
        if (hasKitEventBase()) {
            obj2 = (obj2 == null || !getKitEventBase().equals(bitmojiKitEventBase.getKitEventBase())) ? null : 1;
        }
        obj2 = (obj2 == null || !getStickerPickerSessionId().equals(bitmojiKitEventBase.getStickerPickerSessionId())) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(bitmojiKitEventBase.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasKitEventBase()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getKitEventBase().hashCode();
        }
        hashCode = (((((hashCode * 37) + 2) * 53) + getStickerPickerSessionId().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static BitmojiKitEventBase parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BitmojiKitEventBase) PARSER.parseFrom(byteBuffer);
    }

    public static BitmojiKitEventBase parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitEventBase) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BitmojiKitEventBase parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BitmojiKitEventBase) PARSER.parseFrom(byteString);
    }

    public static BitmojiKitEventBase parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitEventBase) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static BitmojiKitEventBase parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BitmojiKitEventBase) PARSER.parseFrom(bArr);
    }

    public static BitmojiKitEventBase parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BitmojiKitEventBase) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BitmojiKitEventBase parseFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitEventBase parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitEventBase parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BitmojiKitEventBase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BitmojiKitEventBase parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitEventBase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BitmojiKitEventBase parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BitmojiKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BitmojiKitEventBase parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BitmojiKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BitmojiKitEventBase bitmojiKitEventBase) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bitmojiKitEventBase);
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

    public static BitmojiKitEventBase getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BitmojiKitEventBase> parser() {
        return PARSER;
    }

    public Parser<BitmojiKitEventBase> getParserForType() {
        return PARSER;
    }

    public BitmojiKitEventBase getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
