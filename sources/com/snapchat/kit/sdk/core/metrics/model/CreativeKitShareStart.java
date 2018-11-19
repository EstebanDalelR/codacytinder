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

public final class CreativeKitShareStart extends GeneratedMessageV3 implements CreativeKitShareStartOrBuilder {
    public static final int CREATIVE_KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final CreativeKitShareStart DEFAULT_INSTANCE = new CreativeKitShareStart();
    private static final Parser<CreativeKitShareStart> PARSER = new C79081();
    private static final long serialVersionUID = 0;
    private CreativeKitEventBase creativeKitEventBase_;
    private byte memoizedIsInitialized;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart$1 */
    static class C79081 extends AbstractParser<CreativeKitShareStart> {
        C79081() {
        }

        public CreativeKitShareStart parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new CreativeKitShareStart(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements CreativeKitShareStartOrBuilder {
        private SingleFieldBuilderV3<CreativeKitEventBase, com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.Builder, CreativeKitEventBaseOrBuilder> creativeKitEventBaseBuilder_;
        private CreativeKitEventBase creativeKitEventBase_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21740xaa3363b8;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21741xf2bf5236.ensureFieldAccessorsInitialized(CreativeKitShareStart.class, Builder.class);
        }

        private Builder() {
            this.creativeKitEventBase_ = null;
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.creativeKitEventBase_ = null;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            CreativeKitShareStart.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.creativeKitEventBaseBuilder_ == null) {
                this.creativeKitEventBase_ = null;
            } else {
                this.creativeKitEventBase_ = null;
                this.creativeKitEventBaseBuilder_ = null;
            }
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21740xaa3363b8;
        }

        public CreativeKitShareStart getDefaultInstanceForType() {
            return CreativeKitShareStart.getDefaultInstance();
        }

        public CreativeKitShareStart build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public CreativeKitShareStart buildPartial() {
            CreativeKitShareStart creativeKitShareStart = new CreativeKitShareStart((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.creativeKitEventBaseBuilder_ == null) {
                creativeKitShareStart.creativeKitEventBase_ = this.creativeKitEventBase_;
            } else {
                creativeKitShareStart.creativeKitEventBase_ = (CreativeKitEventBase) this.creativeKitEventBaseBuilder_.build();
            }
            onBuilt();
            return creativeKitShareStart;
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
            if (message instanceof CreativeKitShareStart) {
                return mergeFrom((CreativeKitShareStart) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(CreativeKitShareStart creativeKitShareStart) {
            if (creativeKitShareStart == CreativeKitShareStart.getDefaultInstance()) {
                return this;
            }
            if (creativeKitShareStart.hasCreativeKitEventBase()) {
                mergeCreativeKitEventBase(creativeKitShareStart.getCreativeKitEventBase());
            }
            mergeUnknownFields(creativeKitShareStart.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            CreativeKitShareStart creativeKitShareStart;
            CreativeKitShareStart creativeKitShareStart2 = null;
            try {
                CreativeKitShareStart creativeKitShareStart3 = (CreativeKitShareStart) CreativeKitShareStart.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (creativeKitShareStart3 != null) {
                    mergeFrom(creativeKitShareStart3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                creativeKitShareStart = (CreativeKitShareStart) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                creativeKitShareStart2 = creativeKitShareStart;
                if (creativeKitShareStart2 != null) {
                    mergeFrom(creativeKitShareStart2);
                }
                throw codedInputStream2;
            }
        }

        public boolean hasCreativeKitEventBase() {
            if (this.creativeKitEventBaseBuilder_ == null) {
                if (this.creativeKitEventBase_ == null) {
                    return false;
                }
            }
            return true;
        }

        public CreativeKitEventBase getCreativeKitEventBase() {
            if (this.creativeKitEventBaseBuilder_ != null) {
                return (CreativeKitEventBase) this.creativeKitEventBaseBuilder_.getMessage();
            }
            return this.creativeKitEventBase_ == null ? CreativeKitEventBase.getDefaultInstance() : this.creativeKitEventBase_;
        }

        public Builder setCreativeKitEventBase(CreativeKitEventBase creativeKitEventBase) {
            if (this.creativeKitEventBaseBuilder_ != null) {
                this.creativeKitEventBaseBuilder_.setMessage(creativeKitEventBase);
            } else if (creativeKitEventBase == null) {
                throw new NullPointerException();
            } else {
                this.creativeKitEventBase_ = creativeKitEventBase;
                onChanged();
            }
            return this;
        }

        public Builder setCreativeKitEventBase(com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.Builder builder) {
            if (this.creativeKitEventBaseBuilder_ == null) {
                this.creativeKitEventBase_ = builder.build();
                onChanged();
            } else {
                this.creativeKitEventBaseBuilder_.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeCreativeKitEventBase(CreativeKitEventBase creativeKitEventBase) {
            if (this.creativeKitEventBaseBuilder_ == null) {
                if (this.creativeKitEventBase_ != null) {
                    this.creativeKitEventBase_ = CreativeKitEventBase.newBuilder(this.creativeKitEventBase_).mergeFrom(creativeKitEventBase).buildPartial();
                } else {
                    this.creativeKitEventBase_ = creativeKitEventBase;
                }
                onChanged();
            } else {
                this.creativeKitEventBaseBuilder_.mergeFrom(creativeKitEventBase);
            }
            return this;
        }

        public Builder clearCreativeKitEventBase() {
            if (this.creativeKitEventBaseBuilder_ == null) {
                this.creativeKitEventBase_ = null;
                onChanged();
            } else {
                this.creativeKitEventBase_ = null;
                this.creativeKitEventBaseBuilder_ = null;
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.Builder getCreativeKitEventBaseBuilder() {
            onChanged();
            return (com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.Builder) getCreativeKitEventBaseFieldBuilder().getBuilder();
        }

        public CreativeKitEventBaseOrBuilder getCreativeKitEventBaseOrBuilder() {
            if (this.creativeKitEventBaseBuilder_ != null) {
                return (CreativeKitEventBaseOrBuilder) this.creativeKitEventBaseBuilder_.getMessageOrBuilder();
            }
            return this.creativeKitEventBase_ == null ? CreativeKitEventBase.getDefaultInstance() : this.creativeKitEventBase_;
        }

        private SingleFieldBuilderV3<CreativeKitEventBase, com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.Builder, CreativeKitEventBaseOrBuilder> getCreativeKitEventBaseFieldBuilder() {
            if (this.creativeKitEventBaseBuilder_ == null) {
                this.creativeKitEventBaseBuilder_ = new SingleFieldBuilderV3(getCreativeKitEventBase(), getParentForChildren(), isClean());
                this.creativeKitEventBase_ = null;
            }
            return this.creativeKitEventBaseBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private CreativeKitShareStart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private CreativeKitShareStart() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private CreativeKitShareStart(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.Builder builder = null;
                        if (this.creativeKitEventBase_ != null) {
                            builder = this.creativeKitEventBase_.toBuilder();
                        }
                        this.creativeKitEventBase_ = (CreativeKitEventBase) codedInputStream.readMessage(CreativeKitEventBase.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom(this.creativeKitEventBase_);
                            this.creativeKitEventBase_ = builder.buildPartial();
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
        return Event.f21740xaa3363b8;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21741xf2bf5236.ensureFieldAccessorsInitialized(CreativeKitShareStart.class, Builder.class);
    }

    public boolean hasCreativeKitEventBase() {
        return this.creativeKitEventBase_ != null;
    }

    public CreativeKitEventBase getCreativeKitEventBase() {
        return this.creativeKitEventBase_ == null ? CreativeKitEventBase.getDefaultInstance() : this.creativeKitEventBase_;
    }

    public CreativeKitEventBaseOrBuilder getCreativeKitEventBaseOrBuilder() {
        return getCreativeKitEventBase();
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
        if (this.creativeKitEventBase_ != null) {
            codedOutputStream.writeMessage(1, getCreativeKitEventBase());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        i = 0;
        if (this.creativeKitEventBase_ != null) {
            i = 0 + CodedOutputStream.computeMessageSize(1, getCreativeKitEventBase());
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
        if (!(obj instanceof CreativeKitShareStart)) {
            return super.equals(obj);
        }
        CreativeKitShareStart creativeKitShareStart = (CreativeKitShareStart) obj;
        Object obj2 = hasCreativeKitEventBase() == creativeKitShareStart.hasCreativeKitEventBase() ? 1 : null;
        if (hasCreativeKitEventBase()) {
            obj2 = (obj2 == null || !getCreativeKitEventBase().equals(creativeKitShareStart.getCreativeKitEventBase())) ? null : 1;
        }
        if (obj2 == null || this.unknownFields.equals(creativeKitShareStart.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasCreativeKitEventBase()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getCreativeKitEventBase().hashCode();
        }
        hashCode = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static CreativeKitShareStart parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CreativeKitShareStart) PARSER.parseFrom(byteBuffer);
    }

    public static CreativeKitShareStart parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeKitShareStart) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static CreativeKitShareStart parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CreativeKitShareStart) PARSER.parseFrom(byteString);
    }

    public static CreativeKitShareStart parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeKitShareStart) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static CreativeKitShareStart parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CreativeKitShareStart) PARSER.parseFrom(bArr);
    }

    public static CreativeKitShareStart parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeKitShareStart) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CreativeKitShareStart parseFrom(InputStream inputStream) throws IOException {
        return (CreativeKitShareStart) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static CreativeKitShareStart parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeKitShareStart) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreativeKitShareStart parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreativeKitShareStart) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CreativeKitShareStart parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeKitShareStart) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreativeKitShareStart parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreativeKitShareStart) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CreativeKitShareStart parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeKitShareStart) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CreativeKitShareStart creativeKitShareStart) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(creativeKitShareStart);
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

    public static CreativeKitShareStart getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<CreativeKitShareStart> parser() {
        return PARSER;
    }

    public Parser<CreativeKitShareStart> getParserForType() {
        return PARSER;
    }

    public CreativeKitShareStart getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
