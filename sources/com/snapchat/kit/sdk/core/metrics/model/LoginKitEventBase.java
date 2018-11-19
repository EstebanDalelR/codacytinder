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

public final class LoginKitEventBase extends GeneratedMessageV3 implements LoginKitEventBaseOrBuilder {
    private static final LoginKitEventBase DEFAULT_INSTANCE = new LoginKitEventBase();
    public static final int KIT_EVENT_BASE_FIELD_NUMBER = 1;
    private static final Parser<LoginKitEventBase> PARSER = new C79121();
    private static final long serialVersionUID = 0;
    private KitEventBase kitEventBase_;
    private byte memoizedIsInitialized;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase$1 */
    static class C79121 extends AbstractParser<LoginKitEventBase> {
        C79121() {
        }

        public LoginKitEventBase parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new LoginKitEventBase(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements LoginKitEventBaseOrBuilder {
        private SingleFieldBuilderV3<KitEventBase, com.snapchat.kit.sdk.core.metrics.model.KitEventBase.Builder, KitEventBaseOrBuilder> kitEventBaseBuilder_;
        private KitEventBase kitEventBase_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21748x91629ca4;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21749xe24cdf22.ensureFieldAccessorsInitialized(LoginKitEventBase.class, Builder.class);
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
            LoginKitEventBase.alwaysUseFieldBuilders;
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
            return Event.f21748x91629ca4;
        }

        public LoginKitEventBase getDefaultInstanceForType() {
            return LoginKitEventBase.getDefaultInstance();
        }

        public LoginKitEventBase build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public LoginKitEventBase buildPartial() {
            LoginKitEventBase loginKitEventBase = new LoginKitEventBase((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.kitEventBaseBuilder_ == null) {
                loginKitEventBase.kitEventBase_ = this.kitEventBase_;
            } else {
                loginKitEventBase.kitEventBase_ = (KitEventBase) this.kitEventBaseBuilder_.build();
            }
            onBuilt();
            return loginKitEventBase;
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
            if (message instanceof LoginKitEventBase) {
                return mergeFrom((LoginKitEventBase) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(LoginKitEventBase loginKitEventBase) {
            if (loginKitEventBase == LoginKitEventBase.getDefaultInstance()) {
                return this;
            }
            if (loginKitEventBase.hasKitEventBase()) {
                mergeKitEventBase(loginKitEventBase.getKitEventBase());
            }
            mergeUnknownFields(loginKitEventBase.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            LoginKitEventBase loginKitEventBase;
            LoginKitEventBase loginKitEventBase2 = null;
            try {
                LoginKitEventBase loginKitEventBase3 = (LoginKitEventBase) LoginKitEventBase.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (loginKitEventBase3 != null) {
                    mergeFrom(loginKitEventBase3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                loginKitEventBase = (LoginKitEventBase) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                loginKitEventBase2 = loginKitEventBase;
                if (loginKitEventBase2 != null) {
                    mergeFrom(loginKitEventBase2);
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

    private LoginKitEventBase(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private LoginKitEventBase() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private LoginKitEventBase(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
        return Event.f21748x91629ca4;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21749xe24cdf22.ensureFieldAccessorsInitialized(LoginKitEventBase.class, Builder.class);
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
        if (!(obj instanceof LoginKitEventBase)) {
            return super.equals(obj);
        }
        LoginKitEventBase loginKitEventBase = (LoginKitEventBase) obj;
        Object obj2 = hasKitEventBase() == loginKitEventBase.hasKitEventBase() ? 1 : null;
        if (hasKitEventBase()) {
            obj2 = (obj2 == null || !getKitEventBase().equals(loginKitEventBase.getKitEventBase())) ? null : 1;
        }
        if (obj2 == null || this.unknownFields.equals(loginKitEventBase.unknownFields) == null) {
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

    public static LoginKitEventBase parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LoginKitEventBase) PARSER.parseFrom(byteBuffer);
    }

    public static LoginKitEventBase parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoginKitEventBase) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static LoginKitEventBase parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LoginKitEventBase) PARSER.parseFrom(byteString);
    }

    public static LoginKitEventBase parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoginKitEventBase) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static LoginKitEventBase parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LoginKitEventBase) PARSER.parseFrom(bArr);
    }

    public static LoginKitEventBase parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoginKitEventBase) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static LoginKitEventBase parseFrom(InputStream inputStream) throws IOException {
        return (LoginKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static LoginKitEventBase parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoginKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LoginKitEventBase parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LoginKitEventBase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static LoginKitEventBase parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoginKitEventBase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LoginKitEventBase parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LoginKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static LoginKitEventBase parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoginKitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(LoginKitEventBase loginKitEventBase) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(loginKitEventBase);
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

    public static LoginKitEventBase getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<LoginKitEventBase> parser() {
        return PARSER;
    }

    public Parser<LoginKitEventBase> getParserForType() {
        return PARSER;
    }

    public LoginKitEventBase getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
