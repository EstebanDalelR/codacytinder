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

public final class CreativeKitShareComplete extends GeneratedMessageV3 implements CreativeKitShareCompleteOrBuilder {
    public static final int CREATIVE_KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final CreativeKitShareComplete DEFAULT_INSTANCE = new CreativeKitShareComplete();
    public static final int IS_SUCCESS_FIELD_NUMBER = 2;
    private static final Parser<CreativeKitShareComplete> PARSER = new C79071();
    private static final long serialVersionUID = 0;
    private CreativeKitEventBase creativeKitEventBase_;
    private boolean isSuccess_;
    private byte memoizedIsInitialized;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete$1 */
    static class C79071 extends AbstractParser<CreativeKitShareComplete> {
        C79071() {
        }

        public CreativeKitShareComplete parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new CreativeKitShareComplete(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements CreativeKitShareCompleteOrBuilder {
        private SingleFieldBuilderV3<CreativeKitEventBase, com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.Builder, CreativeKitEventBaseOrBuilder> creativeKitEventBaseBuilder_;
        private CreativeKitEventBase creativeKitEventBase_;
        private boolean isSuccess_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21738x506b8669;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21739x7b0633e7.ensureFieldAccessorsInitialized(CreativeKitShareComplete.class, Builder.class);
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
            CreativeKitShareComplete.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.creativeKitEventBaseBuilder_ == null) {
                this.creativeKitEventBase_ = null;
            } else {
                this.creativeKitEventBase_ = null;
                this.creativeKitEventBaseBuilder_ = null;
            }
            this.isSuccess_ = false;
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21738x506b8669;
        }

        public CreativeKitShareComplete getDefaultInstanceForType() {
            return CreativeKitShareComplete.getDefaultInstance();
        }

        public CreativeKitShareComplete build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public CreativeKitShareComplete buildPartial() {
            CreativeKitShareComplete creativeKitShareComplete = new CreativeKitShareComplete((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.creativeKitEventBaseBuilder_ == null) {
                creativeKitShareComplete.creativeKitEventBase_ = this.creativeKitEventBase_;
            } else {
                creativeKitShareComplete.creativeKitEventBase_ = (CreativeKitEventBase) this.creativeKitEventBaseBuilder_.build();
            }
            creativeKitShareComplete.isSuccess_ = this.isSuccess_;
            onBuilt();
            return creativeKitShareComplete;
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
            if (message instanceof CreativeKitShareComplete) {
                return mergeFrom((CreativeKitShareComplete) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(CreativeKitShareComplete creativeKitShareComplete) {
            if (creativeKitShareComplete == CreativeKitShareComplete.getDefaultInstance()) {
                return this;
            }
            if (creativeKitShareComplete.hasCreativeKitEventBase()) {
                mergeCreativeKitEventBase(creativeKitShareComplete.getCreativeKitEventBase());
            }
            if (creativeKitShareComplete.getIsSuccess()) {
                setIsSuccess(creativeKitShareComplete.getIsSuccess());
            }
            mergeUnknownFields(creativeKitShareComplete.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            CreativeKitShareComplete creativeKitShareComplete;
            CreativeKitShareComplete creativeKitShareComplete2 = null;
            try {
                CreativeKitShareComplete creativeKitShareComplete3 = (CreativeKitShareComplete) CreativeKitShareComplete.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (creativeKitShareComplete3 != null) {
                    mergeFrom(creativeKitShareComplete3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                creativeKitShareComplete = (CreativeKitShareComplete) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                creativeKitShareComplete2 = creativeKitShareComplete;
                if (creativeKitShareComplete2 != null) {
                    mergeFrom(creativeKitShareComplete2);
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

        public boolean getIsSuccess() {
            return this.isSuccess_;
        }

        public Builder setIsSuccess(boolean z) {
            this.isSuccess_ = z;
            onChanged();
            return this;
        }

        public Builder clearIsSuccess() {
            this.isSuccess_ = false;
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

    private CreativeKitShareComplete(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private CreativeKitShareComplete() {
        this.memoizedIsInitialized = (byte) -1;
        this.isSuccess_ = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private CreativeKitShareComplete(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                    } else if (readTag == 16) {
                        this.isSuccess_ = codedInputStream.readBool();
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
        return Event.f21738x506b8669;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21739x7b0633e7.ensureFieldAccessorsInitialized(CreativeKitShareComplete.class, Builder.class);
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

    public boolean getIsSuccess() {
        return this.isSuccess_;
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
        if (this.isSuccess_) {
            codedOutputStream.writeBool(2, this.isSuccess_);
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
        if (this.isSuccess_) {
            i += CodedOutputStream.computeBoolSize(2, this.isSuccess_);
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
        if (!(obj instanceof CreativeKitShareComplete)) {
            return super.equals(obj);
        }
        CreativeKitShareComplete creativeKitShareComplete = (CreativeKitShareComplete) obj;
        Object obj2 = hasCreativeKitEventBase() == creativeKitShareComplete.hasCreativeKitEventBase() ? 1 : null;
        if (hasCreativeKitEventBase()) {
            obj2 = (obj2 == null || !getCreativeKitEventBase().equals(creativeKitShareComplete.getCreativeKitEventBase())) ? null : 1;
        }
        obj2 = (obj2 == null || getIsSuccess() != creativeKitShareComplete.getIsSuccess()) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(creativeKitShareComplete.unknownFields) == null) {
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
        hashCode = (((((hashCode * 37) + 2) * 53) + Internal.hashBoolean(getIsSuccess())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static CreativeKitShareComplete parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CreativeKitShareComplete) PARSER.parseFrom(byteBuffer);
    }

    public static CreativeKitShareComplete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeKitShareComplete) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static CreativeKitShareComplete parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CreativeKitShareComplete) PARSER.parseFrom(byteString);
    }

    public static CreativeKitShareComplete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeKitShareComplete) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static CreativeKitShareComplete parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CreativeKitShareComplete) PARSER.parseFrom(bArr);
    }

    public static CreativeKitShareComplete parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeKitShareComplete) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CreativeKitShareComplete parseFrom(InputStream inputStream) throws IOException {
        return (CreativeKitShareComplete) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static CreativeKitShareComplete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeKitShareComplete) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreativeKitShareComplete parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreativeKitShareComplete) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CreativeKitShareComplete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeKitShareComplete) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreativeKitShareComplete parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreativeKitShareComplete) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CreativeKitShareComplete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeKitShareComplete) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CreativeKitShareComplete creativeKitShareComplete) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(creativeKitShareComplete);
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

    public static CreativeKitShareComplete getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<CreativeKitShareComplete> parser() {
        return PARSER;
    }

    public Parser<CreativeKitShareComplete> getParserForType() {
        return PARSER;
    }

    public CreativeKitShareComplete getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
