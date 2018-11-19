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

public final class CreativeKitEventBase extends GeneratedMessageV3 implements CreativeKitEventBaseOrBuilder {
    private static final CreativeKitEventBase DEFAULT_INSTANCE = new CreativeKitEventBase();
    public static final int KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final Parser<CreativeKitEventBase> PARSER = new C79061();
    private static final long serialVersionUID = 0;
    private KitEventBase kitEventBase_;
    private byte memoizedIsInitialized;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase$1 */
    static class C79061 extends AbstractParser<CreativeKitEventBase> {
        C79061() {
        }

        public CreativeKitEventBase parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new CreativeKitEventBase(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements CreativeKitEventBaseOrBuilder {
        private SingleFieldBuilderV3<KitEventBase, com.snapchat.kit.sdk.core.metrics.model.KitEventBase.Builder, KitEventBaseOrBuilder> kitEventBaseBuilder_;
        private KitEventBase kitEventBase_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21736x2d97abb6;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21737xe8d2bc34.ensureFieldAccessorsInitialized(CreativeKitEventBase.class, Builder.class);
        }

        private Builder() {
            this.kitEventBase_ = null;
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.kitEventBase_ = null;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            CreativeKitEventBase.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.kitEventBaseBuilder_ == null) {
                this.kitEventBase_ = null;
            } else {
                this.kitEventBase_ = null;
                this.kitEventBaseBuilder_ = null;
            }
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21736x2d97abb6;
        }

        public CreativeKitEventBase getDefaultInstanceForType() {
            return CreativeKitEventBase.getDefaultInstance();
        }

        public CreativeKitEventBase build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public CreativeKitEventBase buildPartial() {
            CreativeKitEventBase creativeKitEventBase = new CreativeKitEventBase((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.kitEventBaseBuilder_ == null) {
                creativeKitEventBase.kitEventBase_ = this.kitEventBase_;
            } else {
                creativeKitEventBase.kitEventBase_ = (KitEventBase) this.kitEventBaseBuilder_.build();
            }
            onBuilt();
            return creativeKitEventBase;
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
            if (message instanceof CreativeKitEventBase) {
                return mergeFrom((CreativeKitEventBase) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(CreativeKitEventBase creativeKitEventBase) {
            if (creativeKitEventBase == CreativeKitEventBase.getDefaultInstance()) {
                return this;
            }
            if (creativeKitEventBase.hasKitEventBase()) {
                mergeKitEventBase(creativeKitEventBase.getKitEventBase());
            }
            mergeUnknownFields(creativeKitEventBase.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            CreativeKitEventBase creativeKitEventBase;
            CreativeKitEventBase creativeKitEventBase2 = null;
            try {
                CreativeKitEventBase creativeKitEventBase3 = (CreativeKitEventBase) CreativeKitEventBase.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (creativeKitEventBase3 != null) {
                    mergeFrom(creativeKitEventBase3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                creativeKitEventBase = (CreativeKitEventBase) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                creativeKitEventBase2 = creativeKitEventBase;
                if (creativeKitEventBase2 != null) {
                    mergeFrom(creativeKitEventBase2);
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

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private CreativeKitEventBase(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private CreativeKitEventBase() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private CreativeKitEventBase(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
        return Event.f21736x2d97abb6;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21737xe8d2bc34.ensureFieldAccessorsInitialized(CreativeKitEventBase.class, Builder.class);
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
        i += this.unknownFields.getSerializedSize();
        this.memoizedSize = i;
        return i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeKitEventBase)) {
            return super.equals(obj);
        }
        CreativeKitEventBase creativeKitEventBase = (CreativeKitEventBase) obj;
        Object obj2 = hasKitEventBase() == creativeKitEventBase.hasKitEventBase() ? 1 : null;
        if (hasKitEventBase()) {
            obj2 = (obj2 == null || !getKitEventBase().equals(creativeKitEventBase.getKitEventBase())) ? null : 1;
        }
        if (obj2 == null || this.unknownFields.equals(creativeKitEventBase.unknownFields) == null) {
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
        hashCode = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static CreativeKitEventBase parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CreativeKitEventBase) PARSER.parseFrom(byteBuffer);
    }

    public static CreativeKitEventBase parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeKitEventBase) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static CreativeKitEventBase parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CreativeKitEventBase) PARSER.parseFrom(byteString);
    }

    public static CreativeKitEventBase parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeKitEventBase) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static CreativeKitEventBase parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CreativeKitEventBase) PARSER.parseFrom(bArr);
    }

    public static CreativeKitEventBase parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeKitEventBase) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CreativeKitEventBase parseFrom(InputStream inputStream) throws IOException {
        return (CreativeKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static CreativeKitEventBase parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreativeKitEventBase parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreativeKitEventBase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CreativeKitEventBase parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeKitEventBase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreativeKitEventBase parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreativeKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CreativeKitEventBase parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CreativeKitEventBase creativeKitEventBase) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(creativeKitEventBase);
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

    public static CreativeKitEventBase getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<CreativeKitEventBase> parser() {
        return PARSER;
    }

    public Parser<CreativeKitEventBase> getParserForType() {
        return PARSER;
    }

    public CreativeKitEventBase getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
