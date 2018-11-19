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

public final class LoginKitAuthStart extends GeneratedMessageV3 implements LoginKitAuthStartOrBuilder {
    private static final LoginKitAuthStart DEFAULT_INSTANCE = new LoginKitAuthStart();
    public static final int LOG_KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final Parser<LoginKitAuthStart> PARSER = new C79111();
    private static final long serialVersionUID = 0;
    private LoginKitEventBase logKitEventBase_;
    private byte memoizedIsInitialized;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart$1 */
    static class C79111 extends AbstractParser<LoginKitAuthStart> {
        C79111() {
        }

        public LoginKitAuthStart parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new LoginKitAuthStart(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements LoginKitAuthStartOrBuilder {
        private SingleFieldBuilderV3<LoginKitEventBase, com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.Builder, LoginKitEventBaseOrBuilder> logKitEventBaseBuilder_;
        private LoginKitEventBase logKitEventBase_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21746xc3b4be35;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21747x6fb0dfb3.ensureFieldAccessorsInitialized(LoginKitAuthStart.class, Builder.class);
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
            LoginKitAuthStart.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.logKitEventBaseBuilder_ == null) {
                this.logKitEventBase_ = null;
            } else {
                this.logKitEventBase_ = null;
                this.logKitEventBaseBuilder_ = null;
            }
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21746xc3b4be35;
        }

        public LoginKitAuthStart getDefaultInstanceForType() {
            return LoginKitAuthStart.getDefaultInstance();
        }

        public LoginKitAuthStart build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public LoginKitAuthStart buildPartial() {
            LoginKitAuthStart loginKitAuthStart = new LoginKitAuthStart((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.logKitEventBaseBuilder_ == null) {
                loginKitAuthStart.logKitEventBase_ = this.logKitEventBase_;
            } else {
                loginKitAuthStart.logKitEventBase_ = (LoginKitEventBase) this.logKitEventBaseBuilder_.build();
            }
            onBuilt();
            return loginKitAuthStart;
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
            if (message instanceof LoginKitAuthStart) {
                return mergeFrom((LoginKitAuthStart) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(LoginKitAuthStart loginKitAuthStart) {
            if (loginKitAuthStart == LoginKitAuthStart.getDefaultInstance()) {
                return this;
            }
            if (loginKitAuthStart.hasLogKitEventBase()) {
                mergeLogKitEventBase(loginKitAuthStart.getLogKitEventBase());
            }
            mergeUnknownFields(loginKitAuthStart.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            LoginKitAuthStart loginKitAuthStart;
            LoginKitAuthStart loginKitAuthStart2 = null;
            try {
                LoginKitAuthStart loginKitAuthStart3 = (LoginKitAuthStart) LoginKitAuthStart.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (loginKitAuthStart3 != null) {
                    mergeFrom(loginKitAuthStart3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                loginKitAuthStart = (LoginKitAuthStart) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                loginKitAuthStart2 = loginKitAuthStart;
                if (loginKitAuthStart2 != null) {
                    mergeFrom(loginKitAuthStart2);
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

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private LoginKitAuthStart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private LoginKitAuthStart() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private LoginKitAuthStart(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
        return Event.f21746xc3b4be35;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21747x6fb0dfb3.ensureFieldAccessorsInitialized(LoginKitAuthStart.class, Builder.class);
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
        i += this.unknownFields.getSerializedSize();
        this.memoizedSize = i;
        return i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginKitAuthStart)) {
            return super.equals(obj);
        }
        LoginKitAuthStart loginKitAuthStart = (LoginKitAuthStart) obj;
        Object obj2 = hasLogKitEventBase() == loginKitAuthStart.hasLogKitEventBase() ? 1 : null;
        if (hasLogKitEventBase()) {
            obj2 = (obj2 == null || !getLogKitEventBase().equals(loginKitAuthStart.getLogKitEventBase())) ? null : 1;
        }
        if (obj2 == null || this.unknownFields.equals(loginKitAuthStart.unknownFields) == null) {
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
        hashCode = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static LoginKitAuthStart parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LoginKitAuthStart) PARSER.parseFrom(byteBuffer);
    }

    public static LoginKitAuthStart parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoginKitAuthStart) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static LoginKitAuthStart parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LoginKitAuthStart) PARSER.parseFrom(byteString);
    }

    public static LoginKitAuthStart parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoginKitAuthStart) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static LoginKitAuthStart parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LoginKitAuthStart) PARSER.parseFrom(bArr);
    }

    public static LoginKitAuthStart parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoginKitAuthStart) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static LoginKitAuthStart parseFrom(InputStream inputStream) throws IOException {
        return (LoginKitAuthStart) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static LoginKitAuthStart parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoginKitAuthStart) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LoginKitAuthStart parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LoginKitAuthStart) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static LoginKitAuthStart parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoginKitAuthStart) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LoginKitAuthStart parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LoginKitAuthStart) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static LoginKitAuthStart parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoginKitAuthStart) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(LoginKitAuthStart loginKitAuthStart) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(loginKitAuthStart);
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

    public static LoginKitAuthStart getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<LoginKitAuthStart> parser() {
        return PARSER;
    }

    public Parser<LoginKitAuthStart> getParserForType() {
        return PARSER;
    }

    public LoginKitAuthStart getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
