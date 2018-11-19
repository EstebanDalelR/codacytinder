package com.tinder.proto.keepalive;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.TimestampProto;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;

public final class KeepAliveUpdate {
    private static FileDescriptor descriptor;
    private static final Descriptor internal_static_keepalive_Update_descriptor = ((Descriptor) getDescriptor().getMessageTypes().get(0));
    private static final FieldAccessorTable internal_static_keepalive_Update_fieldAccessorTable = new FieldAccessorTable(internal_static_keepalive_Update_descriptor, new String[]{"UpdateTime"});

    /* renamed from: com.tinder.proto.keepalive.KeepAliveUpdate$1 */
    static class C162141 implements InternalDescriptorAssigner {
        C162141() {
        }

        public ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor) {
            KeepAliveUpdate.descriptor = fileDescriptor;
            return null;
        }
    }

    public interface UpdateOrBuilder extends MessageOrBuilder {
        Timestamp getUpdateTime();

        TimestampOrBuilder getUpdateTimeOrBuilder();

        boolean hasUpdateTime();
    }

    public static final class Update extends GeneratedMessageV3 implements UpdateOrBuilder {
        private static final Update DEFAULT_INSTANCE = new Update();
        private static final Parser<Update> PARSER = new C177951();
        public static final int UPDATE_TIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private Timestamp updateTime_;

        /* renamed from: com.tinder.proto.keepalive.KeepAliveUpdate$Update$1 */
        static class C177951 extends AbstractParser<Update> {
            C177951() {
            }

            public Update parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Update(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements UpdateOrBuilder {
            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> updateTimeBuilder_;
            private Timestamp updateTime_;

            public final boolean isInitialized() {
                return true;
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public static final Descriptor getDescriptor() {
                return KeepAliveUpdate.internal_static_keepalive_Update_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return KeepAliveUpdate.internal_static_keepalive_Update_fieldAccessorTable.ensureFieldAccessorsInitialized(Update.class, Builder.class);
            }

            private Builder() {
                this.updateTime_ = null;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.updateTime_ = null;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                Update.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                if (this.updateTimeBuilder_ == null) {
                    this.updateTime_ = null;
                } else {
                    this.updateTime_ = null;
                    this.updateTimeBuilder_ = null;
                }
                return this;
            }

            public Descriptor getDescriptorForType() {
                return KeepAliveUpdate.internal_static_keepalive_Update_descriptor;
            }

            public Update getDefaultInstanceForType() {
                return Update.getDefaultInstance();
            }

            public Update build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Update buildPartial() {
                Update update = new Update((com.google.protobuf.GeneratedMessageV3.Builder) this);
                if (this.updateTimeBuilder_ == null) {
                    update.updateTime_ = this.updateTime_;
                } else {
                    update.updateTime_ = (Timestamp) this.updateTimeBuilder_.build();
                }
                onBuilt();
                return update;
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
                if (message instanceof Update) {
                    return mergeFrom((Update) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Update update) {
                if (update == Update.getDefaultInstance()) {
                    return this;
                }
                if (update.hasUpdateTime()) {
                    mergeUpdateTime(update.getUpdateTime());
                }
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Update update;
                Update update2 = null;
                try {
                    Update update3 = (Update) Update.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (update3 != null) {
                        mergeFrom(update3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    update = (Update) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    update2 = update;
                    if (update2 != null) {
                        mergeFrom(update2);
                    }
                    throw codedInputStream2;
                }
            }

            public boolean hasUpdateTime() {
                if (this.updateTimeBuilder_ == null) {
                    if (this.updateTime_ == null) {
                        return false;
                    }
                }
                return true;
            }

            public Timestamp getUpdateTime() {
                if (this.updateTimeBuilder_ != null) {
                    return (Timestamp) this.updateTimeBuilder_.getMessage();
                }
                return this.updateTime_ == null ? Timestamp.getDefaultInstance() : this.updateTime_;
            }

            public Builder setUpdateTime(Timestamp timestamp) {
                if (this.updateTimeBuilder_ != null) {
                    this.updateTimeBuilder_.setMessage(timestamp);
                } else if (timestamp == null) {
                    throw new NullPointerException();
                } else {
                    this.updateTime_ = timestamp;
                    onChanged();
                }
                return this;
            }

            public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builder) {
                if (this.updateTimeBuilder_ == null) {
                    this.updateTime_ = builder.build();
                    onChanged();
                } else {
                    this.updateTimeBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeUpdateTime(Timestamp timestamp) {
                if (this.updateTimeBuilder_ == null) {
                    if (this.updateTime_ != null) {
                        this.updateTime_ = Timestamp.newBuilder(this.updateTime_).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.updateTime_ = timestamp;
                    }
                    onChanged();
                } else {
                    this.updateTimeBuilder_.mergeFrom(timestamp);
                }
                return this;
            }

            public Builder clearUpdateTime() {
                if (this.updateTimeBuilder_ == null) {
                    this.updateTime_ = null;
                    onChanged();
                } else {
                    this.updateTime_ = null;
                    this.updateTimeBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
                onChanged();
                return (com.google.protobuf.Timestamp.Builder) getUpdateTimeFieldBuilder().getBuilder();
            }

            public TimestampOrBuilder getUpdateTimeOrBuilder() {
                if (this.updateTimeBuilder_ != null) {
                    return (TimestampOrBuilder) this.updateTimeBuilder_.getMessageOrBuilder();
                }
                return this.updateTime_ == null ? Timestamp.getDefaultInstance() : this.updateTime_;
            }

            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> getUpdateTimeFieldBuilder() {
                if (this.updateTimeBuilder_ == null) {
                    this.updateTimeBuilder_ = new SingleFieldBuilderV3(getUpdateTime(), getParentForChildren(), isClean());
                    this.updateTime_ = null;
                }
                return this.updateTimeBuilder_;
            }
        }

        private Update(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Update() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private Update(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            Object obj = null;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            com.google.protobuf.Timestamp.Builder builder = null;
                            if (this.updateTime_ != null) {
                                builder = this.updateTime_.toBuilder();
                            }
                            this.updateTime_ = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.updateTime_);
                                this.updateTime_ = builder.buildPartial();
                            }
                        } else if (codedInputStream.skipField(readTag)) {
                        }
                    }
                    obj = 1;
                } catch (CodedInputStream codedInputStream2) {
                    throw codedInputStream2.setUnfinishedMessage(this);
                } catch (CodedInputStream codedInputStream22) {
                    throw new InvalidProtocolBufferException(codedInputStream22).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                }
            }
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return KeepAliveUpdate.internal_static_keepalive_Update_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return KeepAliveUpdate.internal_static_keepalive_Update_fieldAccessorTable.ensureFieldAccessorsInitialized(Update.class, Builder.class);
        }

        public boolean hasUpdateTime() {
            return this.updateTime_ != null;
        }

        public Timestamp getUpdateTime() {
            return this.updateTime_ == null ? Timestamp.getDefaultInstance() : this.updateTime_;
        }

        public TimestampOrBuilder getUpdateTimeOrBuilder() {
            return getUpdateTime();
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
            if (this.updateTime_ != null) {
                codedOutputStream.writeMessage(1, getUpdateTime());
            }
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if (this.updateTime_ != null) {
                i = 0 + CodedOutputStream.computeMessageSize(1, getUpdateTime());
            }
            this.memoizedSize = i;
            return i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Update)) {
                return super.equals(obj);
            }
            Update update = (Update) obj;
            boolean z = hasUpdateTime() == update.hasUpdateTime();
            if (hasUpdateTime()) {
                z = z && getUpdateTime().equals(update.getUpdateTime()) != null;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptorForType().hashCode();
            if (hasUpdateTime()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getUpdateTime().hashCode();
            }
            hashCode = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Update parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Update) PARSER.parseFrom(byteString);
        }

        public static Update parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Update) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Update parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Update) PARSER.parseFrom(bArr);
        }

        public static Update parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Update) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Update parseFrom(InputStream inputStream) throws IOException {
            return (Update) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Update parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Update) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Update parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Update) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Update parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Update) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Update parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Update) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Update parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Update) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Update update) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(update);
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

        public static Update getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Update> parser() {
            return PARSER;
        }

        public Parser<Update> getParserForType() {
            return PARSER;
        }

        public Update getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private KeepAliveUpdate() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TimestampProto.getDescriptor()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016keepalive/Update.proto\u0012\tkeepalive\u001a\u001fgoogle/protobuf/timestamp.proto\"9\n\u0006Update\u0012/\n\u000bupdate_time\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.TimestampBS\n\u001acom.tinder.proto.keepaliveB\u000fKeepAliveUpdateZ$github.com/TinderApp/proto/keepaliveb\u0006proto3"}, fileDescriptorArr, new C162141());
        TimestampProto.getDescriptor();
    }
}
