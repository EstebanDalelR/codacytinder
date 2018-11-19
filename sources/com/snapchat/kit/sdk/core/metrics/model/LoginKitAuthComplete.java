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

public final class LoginKitAuthComplete extends GeneratedMessageV3 implements LoginKitAuthCompleteOrBuilder {
    private static final LoginKitAuthComplete DEFAULT_INSTANCE = new LoginKitAuthComplete();
    public static final int IS_SUCCESS_FIELD_NUMBER = 2;
    public static final int LOG_KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final Parser<LoginKitAuthComplete> PARSER = new C79101();
    private static final long serialVersionUID = 0;
    private boolean isSuccess_;
    private LoginKitEventBase logKitEventBase_;
    private byte memoizedIsInitialized;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete$1 */
    static class C79101 extends AbstractParser<LoginKitAuthComplete> {
        C79101() {
        }

        public LoginKitAuthComplete parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new LoginKitAuthComplete(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements LoginKitAuthCompleteOrBuilder {
        private boolean isSuccess_;
        private SingleFieldBuilderV3<LoginKitEventBase, com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.Builder, LoginKitEventBaseOrBuilder> logKitEventBaseBuilder_;
        private LoginKitEventBase logKitEventBase_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21744x646cbecc;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21745x4cc6594a.ensureFieldAccessorsInitialized(LoginKitAuthComplete.class, Builder.class);
        }

        private Builder() {
            this.logKitEventBase_ = null;
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.logKitEventBase_ = null;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            LoginKitAuthComplete.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.logKitEventBaseBuilder_ == null) {
                this.logKitEventBase_ = null;
            } else {
                this.logKitEventBase_ = null;
                this.logKitEventBaseBuilder_ = null;
            }
            this.isSuccess_ = false;
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21744x646cbecc;
        }

        public LoginKitAuthComplete getDefaultInstanceForType() {
            return LoginKitAuthComplete.getDefaultInstance();
        }

        public LoginKitAuthComplete build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public LoginKitAuthComplete buildPartial() {
            LoginKitAuthComplete loginKitAuthComplete = new LoginKitAuthComplete((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.logKitEventBaseBuilder_ == null) {
                loginKitAuthComplete.logKitEventBase_ = this.logKitEventBase_;
            } else {
                loginKitAuthComplete.logKitEventBase_ = (LoginKitEventBase) this.logKitEventBaseBuilder_.build();
            }
            loginKitAuthComplete.isSuccess_ = this.isSuccess_;
            onBuilt();
            return loginKitAuthComplete;
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
            if (message instanceof LoginKitAuthComplete) {
                return mergeFrom((LoginKitAuthComplete) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(LoginKitAuthComplete loginKitAuthComplete) {
            if (loginKitAuthComplete == LoginKitAuthComplete.getDefaultInstance()) {
                return this;
            }
            if (loginKitAuthComplete.hasLogKitEventBase()) {
                mergeLogKitEventBase(loginKitAuthComplete.getLogKitEventBase());
            }
            if (loginKitAuthComplete.getIsSuccess()) {
                setIsSuccess(loginKitAuthComplete.getIsSuccess());
            }
            mergeUnknownFields(loginKitAuthComplete.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            LoginKitAuthComplete loginKitAuthComplete;
            LoginKitAuthComplete loginKitAuthComplete2 = null;
            try {
                LoginKitAuthComplete loginKitAuthComplete3 = (LoginKitAuthComplete) LoginKitAuthComplete.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (loginKitAuthComplete3 != null) {
                    mergeFrom(loginKitAuthComplete3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                loginKitAuthComplete = (LoginKitAuthComplete) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                loginKitAuthComplete2 = loginKitAuthComplete;
                if (loginKitAuthComplete2 != null) {
                    mergeFrom(loginKitAuthComplete2);
                }
                throw codedInputStream2;
            }
        }

        public boolean hasLogKitEventBase() {
            if (this.logKitEventBaseBuilder_ == null) {
                if (this.logKitEventBase_ == null) {
                    return false;
                }
            }
            return true;
        }

        public LoginKitEventBase getLogKitEventBase() {
            if (this.logKitEventBaseBuilder_ != null) {
                return (LoginKitEventBase) this.logKitEventBaseBuilder_.getMessage();
            }
            return this.logKitEventBase_ == null ? LoginKitEventBase.getDefaultInstance() : this.logKitEventBase_;
        }

        public Builder setLogKitEventBase(LoginKitEventBase loginKitEventBase) {
            if (this.logKitEventBaseBuilder_ != null) {
                this.logKitEventBaseBuilder_.setMessage(loginKitEventBase);
            } else if (loginKitEventBase == null) {
                throw new NullPointerException();
            } else {
                this.logKitEventBase_ = loginKitEventBase;
                onChanged();
            }
            return this;
        }

        public Builder setLogKitEventBase(com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.Builder builder) {
            if (this.logKitEventBaseBuilder_ == null) {
                this.logKitEventBase_ = builder.build();
                onChanged();
            } else {
                this.logKitEventBaseBuilder_.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeLogKitEventBase(LoginKitEventBase loginKitEventBase) {
            if (this.logKitEventBaseBuilder_ == null) {
                if (this.logKitEventBase_ != null) {
                    this.logKitEventBase_ = LoginKitEventBase.newBuilder(this.logKitEventBase_).mergeFrom(loginKitEventBase).buildPartial();
                } else {
                    this.logKitEventBase_ = loginKitEventBase;
                }
                onChanged();
            } else {
                this.logKitEventBaseBuilder_.mergeFrom(loginKitEventBase);
            }
            return this;
        }

        public Builder clearLogKitEventBase() {
            if (this.logKitEventBaseBuilder_ == null) {
                this.logKitEventBase_ = null;
                onChanged();
            } else {
                this.logKitEventBase_ = null;
                this.logKitEventBaseBuilder_ = null;
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.Builder getLogKitEventBaseBuilder() {
            onChanged();
            return (com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.Builder) getLogKitEventBaseFieldBuilder().getBuilder();
        }

        public LoginKitEventBaseOrBuilder getLogKitEventBaseOrBuilder() {
            if (this.logKitEventBaseBuilder_ != null) {
                return (LoginKitEventBaseOrBuilder) this.logKitEventBaseBuilder_.getMessageOrBuilder();
            }
            return this.logKitEventBase_ == null ? LoginKitEventBase.getDefaultInstance() : this.logKitEventBase_;
        }

        private SingleFieldBuilderV3<LoginKitEventBase, com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.Builder, LoginKitEventBaseOrBuilder> getLogKitEventBaseFieldBuilder() {
            if (this.logKitEventBaseBuilder_ == null) {
                this.logKitEventBaseBuilder_ = new SingleFieldBuilderV3(getLogKitEventBase(), getParentForChildren(), isClean());
                this.logKitEventBase_ = null;
            }
            return this.logKitEventBaseBuilder_;
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

    private LoginKitAuthComplete(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private LoginKitAuthComplete() {
        this.memoizedIsInitialized = (byte) -1;
        this.isSuccess_ = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private LoginKitAuthComplete(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.Builder builder = null;
                        if (this.logKitEventBase_ != null) {
                            builder = this.logKitEventBase_.toBuilder();
                        }
                        this.logKitEventBase_ = (LoginKitEventBase) codedInputStream.readMessage(LoginKitEventBase.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom(this.logKitEventBase_);
                            this.logKitEventBase_ = builder.buildPartial();
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
        return Event.f21744x646cbecc;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21745x4cc6594a.ensureFieldAccessorsInitialized(LoginKitAuthComplete.class, Builder.class);
    }

    public boolean hasLogKitEventBase() {
        return this.logKitEventBase_ != null;
    }

    public LoginKitEventBase getLogKitEventBase() {
        return this.logKitEventBase_ == null ? LoginKitEventBase.getDefaultInstance() : this.logKitEventBase_;
    }

    public LoginKitEventBaseOrBuilder getLogKitEventBaseOrBuilder() {
        return getLogKitEventBase();
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
        if (this.logKitEventBase_ != null) {
            codedOutputStream.writeMessage(1, getLogKitEventBase());
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
        if (this.logKitEventBase_ != null) {
            i = 0 + CodedOutputStream.computeMessageSize(1, getLogKitEventBase());
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
        if (!(obj instanceof LoginKitAuthComplete)) {
            return super.equals(obj);
        }
        LoginKitAuthComplete loginKitAuthComplete = (LoginKitAuthComplete) obj;
        Object obj2 = hasLogKitEventBase() == loginKitAuthComplete.hasLogKitEventBase() ? 1 : null;
        if (hasLogKitEventBase()) {
            obj2 = (obj2 == null || !getLogKitEventBase().equals(loginKitAuthComplete.getLogKitEventBase())) ? null : 1;
        }
        obj2 = (obj2 == null || getIsSuccess() != loginKitAuthComplete.getIsSuccess()) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(loginKitAuthComplete.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasLogKitEventBase()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getLogKitEventBase().hashCode();
        }
        hashCode = (((((hashCode * 37) + 2) * 53) + Internal.hashBoolean(getIsSuccess())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static LoginKitAuthComplete parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LoginKitAuthComplete) PARSER.parseFrom(byteBuffer);
    }

    public static LoginKitAuthComplete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoginKitAuthComplete) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static LoginKitAuthComplete parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LoginKitAuthComplete) PARSER.parseFrom(byteString);
    }

    public static LoginKitAuthComplete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoginKitAuthComplete) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static LoginKitAuthComplete parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LoginKitAuthComplete) PARSER.parseFrom(bArr);
    }

    public static LoginKitAuthComplete parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoginKitAuthComplete) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static LoginKitAuthComplete parseFrom(InputStream inputStream) throws IOException {
        return (LoginKitAuthComplete) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static LoginKitAuthComplete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoginKitAuthComplete) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LoginKitAuthComplete parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LoginKitAuthComplete) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static LoginKitAuthComplete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoginKitAuthComplete) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LoginKitAuthComplete parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LoginKitAuthComplete) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static LoginKitAuthComplete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoginKitAuthComplete) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(LoginKitAuthComplete loginKitAuthComplete) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(loginKitAuthComplete);
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

    public static LoginKitAuthComplete getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<LoginKitAuthComplete> parser() {
        return PARSER;
    }

    public Parser<LoginKitAuthComplete> getParserForType() {
        return PARSER;
    }

    public LoginKitAuthComplete getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
