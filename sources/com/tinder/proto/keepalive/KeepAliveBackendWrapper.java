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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.TimestampProto;
import com.google.protobuf.UnknownFieldSet;
import com.tinder.proto.keepalive.KeepAliveClientData.ClientData;
import com.tinder.proto.keepalive.KeepAliveClientData.ClientDataOrBuilder;
import java.io.IOException;
import java.io.InputStream;

public final class KeepAliveBackendWrapper {
    private static FileDescriptor descriptor;
    private static final Descriptor internal_static_keepalive_BackendWrapper_descriptor = ((Descriptor) getDescriptor().getMessageTypes().get(0));
    private static final FieldAccessorTable internal_static_keepalive_BackendWrapper_fieldAccessorTable = new FieldAccessorTable(internal_static_keepalive_BackendWrapper_descriptor, new String[]{"ClientData", "StartTime", "UpstreamService", "UpstreamServiceTime", "UserNumber"});

    /* renamed from: com.tinder.proto.keepalive.KeepAliveBackendWrapper$1 */
    static class C162091 implements InternalDescriptorAssigner {
        C162091() {
        }

        public ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor) {
            KeepAliveBackendWrapper.descriptor = fileDescriptor;
            return null;
        }
    }

    public interface BackendWrapperOrBuilder extends MessageOrBuilder {
        ClientData getClientData();

        ClientDataOrBuilder getClientDataOrBuilder();

        Timestamp getStartTime();

        TimestampOrBuilder getStartTimeOrBuilder();

        String getUpstreamService();

        ByteString getUpstreamServiceBytes();

        Timestamp getUpstreamServiceTime();

        TimestampOrBuilder getUpstreamServiceTimeOrBuilder();

        long getUserNumber();

        boolean hasClientData();

        boolean hasStartTime();

        boolean hasUpstreamServiceTime();
    }

    public static final class BackendWrapper extends GeneratedMessageV3 implements BackendWrapperOrBuilder {
        public static final int CLIENT_DATA_FIELD_NUMBER = 1;
        private static final BackendWrapper DEFAULT_INSTANCE = new BackendWrapper();
        private static final Parser<BackendWrapper> PARSER = new C177891();
        public static final int START_TIME_FIELD_NUMBER = 2;
        public static final int UPSTREAM_SERVICE_FIELD_NUMBER = 3;
        public static final int UPSTREAM_SERVICE_TIME_FIELD_NUMBER = 4;
        public static final int USER_NUMBER_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private ClientData clientData_;
        private byte memoizedIsInitialized;
        private Timestamp startTime_;
        private Timestamp upstreamServiceTime_;
        private volatile Object upstreamService_;
        private long userNumber_;

        /* renamed from: com.tinder.proto.keepalive.KeepAliveBackendWrapper$BackendWrapper$1 */
        static class C177891 extends AbstractParser<BackendWrapper> {
            C177891() {
            }

            public BackendWrapper parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new BackendWrapper(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements BackendWrapperOrBuilder {
            private SingleFieldBuilderV3<ClientData, com.tinder.proto.keepalive.KeepAliveClientData.ClientData.Builder, ClientDataOrBuilder> clientDataBuilder_;
            private ClientData clientData_;
            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> startTimeBuilder_;
            private Timestamp startTime_;
            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> upstreamServiceTimeBuilder_;
            private Timestamp upstreamServiceTime_;
            private Object upstreamService_;
            private long userNumber_;

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
                return KeepAliveBackendWrapper.internal_static_keepalive_BackendWrapper_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return KeepAliveBackendWrapper.internal_static_keepalive_BackendWrapper_fieldAccessorTable.ensureFieldAccessorsInitialized(BackendWrapper.class, Builder.class);
            }

            private Builder() {
                this.clientData_ = null;
                this.startTime_ = null;
                this.upstreamService_ = "";
                this.upstreamServiceTime_ = null;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.clientData_ = null;
                this.startTime_ = null;
                this.upstreamService_ = "";
                this.upstreamServiceTime_ = null;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                BackendWrapper.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                if (this.clientDataBuilder_ == null) {
                    this.clientData_ = null;
                } else {
                    this.clientData_ = null;
                    this.clientDataBuilder_ = null;
                }
                if (this.startTimeBuilder_ == null) {
                    this.startTime_ = null;
                } else {
                    this.startTime_ = null;
                    this.startTimeBuilder_ = null;
                }
                this.upstreamService_ = "";
                if (this.upstreamServiceTimeBuilder_ == null) {
                    this.upstreamServiceTime_ = null;
                } else {
                    this.upstreamServiceTime_ = null;
                    this.upstreamServiceTimeBuilder_ = null;
                }
                this.userNumber_ = 0;
                return this;
            }

            public Descriptor getDescriptorForType() {
                return KeepAliveBackendWrapper.internal_static_keepalive_BackendWrapper_descriptor;
            }

            public BackendWrapper getDefaultInstanceForType() {
                return BackendWrapper.getDefaultInstance();
            }

            public BackendWrapper build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public BackendWrapper buildPartial() {
                BackendWrapper backendWrapper = new BackendWrapper((com.google.protobuf.GeneratedMessageV3.Builder) this);
                if (this.clientDataBuilder_ == null) {
                    backendWrapper.clientData_ = this.clientData_;
                } else {
                    backendWrapper.clientData_ = (ClientData) this.clientDataBuilder_.build();
                }
                if (this.startTimeBuilder_ == null) {
                    backendWrapper.startTime_ = this.startTime_;
                } else {
                    backendWrapper.startTime_ = (Timestamp) this.startTimeBuilder_.build();
                }
                backendWrapper.upstreamService_ = this.upstreamService_;
                if (this.upstreamServiceTimeBuilder_ == null) {
                    backendWrapper.upstreamServiceTime_ = this.upstreamServiceTime_;
                } else {
                    backendWrapper.upstreamServiceTime_ = (Timestamp) this.upstreamServiceTimeBuilder_.build();
                }
                backendWrapper.userNumber_ = this.userNumber_;
                onBuilt();
                return backendWrapper;
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
                if (message instanceof BackendWrapper) {
                    return mergeFrom((BackendWrapper) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BackendWrapper backendWrapper) {
                if (backendWrapper == BackendWrapper.getDefaultInstance()) {
                    return this;
                }
                if (backendWrapper.hasClientData()) {
                    mergeClientData(backendWrapper.getClientData());
                }
                if (backendWrapper.hasStartTime()) {
                    mergeStartTime(backendWrapper.getStartTime());
                }
                if (!backendWrapper.getUpstreamService().isEmpty()) {
                    this.upstreamService_ = backendWrapper.upstreamService_;
                    onChanged();
                }
                if (backendWrapper.hasUpstreamServiceTime()) {
                    mergeUpstreamServiceTime(backendWrapper.getUpstreamServiceTime());
                }
                if (backendWrapper.getUserNumber() != 0) {
                    setUserNumber(backendWrapper.getUserNumber());
                }
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                BackendWrapper backendWrapper;
                BackendWrapper backendWrapper2 = null;
                try {
                    BackendWrapper backendWrapper3 = (BackendWrapper) BackendWrapper.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (backendWrapper3 != null) {
                        mergeFrom(backendWrapper3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    backendWrapper = (BackendWrapper) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    backendWrapper2 = backendWrapper;
                    if (backendWrapper2 != null) {
                        mergeFrom(backendWrapper2);
                    }
                    throw codedInputStream2;
                }
            }

            public boolean hasClientData() {
                if (this.clientDataBuilder_ == null) {
                    if (this.clientData_ == null) {
                        return false;
                    }
                }
                return true;
            }

            public ClientData getClientData() {
                if (this.clientDataBuilder_ != null) {
                    return (ClientData) this.clientDataBuilder_.getMessage();
                }
                return this.clientData_ == null ? ClientData.getDefaultInstance() : this.clientData_;
            }

            public Builder setClientData(ClientData clientData) {
                if (this.clientDataBuilder_ != null) {
                    this.clientDataBuilder_.setMessage(clientData);
                } else if (clientData == null) {
                    throw new NullPointerException();
                } else {
                    this.clientData_ = clientData;
                    onChanged();
                }
                return this;
            }

            public Builder setClientData(com.tinder.proto.keepalive.KeepAliveClientData.ClientData.Builder builder) {
                if (this.clientDataBuilder_ == null) {
                    this.clientData_ = builder.build();
                    onChanged();
                } else {
                    this.clientDataBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeClientData(ClientData clientData) {
                if (this.clientDataBuilder_ == null) {
                    if (this.clientData_ != null) {
                        this.clientData_ = ClientData.newBuilder(this.clientData_).mergeFrom(clientData).buildPartial();
                    } else {
                        this.clientData_ = clientData;
                    }
                    onChanged();
                } else {
                    this.clientDataBuilder_.mergeFrom(clientData);
                }
                return this;
            }

            public Builder clearClientData() {
                if (this.clientDataBuilder_ == null) {
                    this.clientData_ = null;
                    onChanged();
                } else {
                    this.clientData_ = null;
                    this.clientDataBuilder_ = null;
                }
                return this;
            }

            public com.tinder.proto.keepalive.KeepAliveClientData.ClientData.Builder getClientDataBuilder() {
                onChanged();
                return (com.tinder.proto.keepalive.KeepAliveClientData.ClientData.Builder) getClientDataFieldBuilder().getBuilder();
            }

            public ClientDataOrBuilder getClientDataOrBuilder() {
                if (this.clientDataBuilder_ != null) {
                    return (ClientDataOrBuilder) this.clientDataBuilder_.getMessageOrBuilder();
                }
                return this.clientData_ == null ? ClientData.getDefaultInstance() : this.clientData_;
            }

            private SingleFieldBuilderV3<ClientData, com.tinder.proto.keepalive.KeepAliveClientData.ClientData.Builder, ClientDataOrBuilder> getClientDataFieldBuilder() {
                if (this.clientDataBuilder_ == null) {
                    this.clientDataBuilder_ = new SingleFieldBuilderV3(getClientData(), getParentForChildren(), isClean());
                    this.clientData_ = null;
                }
                return this.clientDataBuilder_;
            }

            public boolean hasStartTime() {
                if (this.startTimeBuilder_ == null) {
                    if (this.startTime_ == null) {
                        return false;
                    }
                }
                return true;
            }

            public Timestamp getStartTime() {
                if (this.startTimeBuilder_ != null) {
                    return (Timestamp) this.startTimeBuilder_.getMessage();
                }
                return this.startTime_ == null ? Timestamp.getDefaultInstance() : this.startTime_;
            }

            public Builder setStartTime(Timestamp timestamp) {
                if (this.startTimeBuilder_ != null) {
                    this.startTimeBuilder_.setMessage(timestamp);
                } else if (timestamp == null) {
                    throw new NullPointerException();
                } else {
                    this.startTime_ = timestamp;
                    onChanged();
                }
                return this;
            }

            public Builder setStartTime(com.google.protobuf.Timestamp.Builder builder) {
                if (this.startTimeBuilder_ == null) {
                    this.startTime_ = builder.build();
                    onChanged();
                } else {
                    this.startTimeBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeStartTime(Timestamp timestamp) {
                if (this.startTimeBuilder_ == null) {
                    if (this.startTime_ != null) {
                        this.startTime_ = Timestamp.newBuilder(this.startTime_).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.startTime_ = timestamp;
                    }
                    onChanged();
                } else {
                    this.startTimeBuilder_.mergeFrom(timestamp);
                }
                return this;
            }

            public Builder clearStartTime() {
                if (this.startTimeBuilder_ == null) {
                    this.startTime_ = null;
                    onChanged();
                } else {
                    this.startTime_ = null;
                    this.startTimeBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
                onChanged();
                return (com.google.protobuf.Timestamp.Builder) getStartTimeFieldBuilder().getBuilder();
            }

            public TimestampOrBuilder getStartTimeOrBuilder() {
                if (this.startTimeBuilder_ != null) {
                    return (TimestampOrBuilder) this.startTimeBuilder_.getMessageOrBuilder();
                }
                return this.startTime_ == null ? Timestamp.getDefaultInstance() : this.startTime_;
            }

            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> getStartTimeFieldBuilder() {
                if (this.startTimeBuilder_ == null) {
                    this.startTimeBuilder_ = new SingleFieldBuilderV3(getStartTime(), getParentForChildren(), isClean());
                    this.startTime_ = null;
                }
                return this.startTimeBuilder_;
            }

            public String getUpstreamService() {
                Object obj = this.upstreamService_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String toStringUtf8 = ((ByteString) obj).toStringUtf8();
                this.upstreamService_ = toStringUtf8;
                return toStringUtf8;
            }

            public ByteString getUpstreamServiceBytes() {
                Object obj = this.upstreamService_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.upstreamService_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUpstreamService(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.upstreamService_ = str;
                onChanged();
                return this;
            }

            public Builder clearUpstreamService() {
                this.upstreamService_ = BackendWrapper.getDefaultInstance().getUpstreamService();
                onChanged();
                return this;
            }

            public Builder setUpstreamServiceBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                BackendWrapper.checkByteStringIsUtf8(byteString);
                this.upstreamService_ = byteString;
                onChanged();
                return this;
            }

            public boolean hasUpstreamServiceTime() {
                if (this.upstreamServiceTimeBuilder_ == null) {
                    if (this.upstreamServiceTime_ == null) {
                        return false;
                    }
                }
                return true;
            }

            public Timestamp getUpstreamServiceTime() {
                if (this.upstreamServiceTimeBuilder_ != null) {
                    return (Timestamp) this.upstreamServiceTimeBuilder_.getMessage();
                }
                return this.upstreamServiceTime_ == null ? Timestamp.getDefaultInstance() : this.upstreamServiceTime_;
            }

            public Builder setUpstreamServiceTime(Timestamp timestamp) {
                if (this.upstreamServiceTimeBuilder_ != null) {
                    this.upstreamServiceTimeBuilder_.setMessage(timestamp);
                } else if (timestamp == null) {
                    throw new NullPointerException();
                } else {
                    this.upstreamServiceTime_ = timestamp;
                    onChanged();
                }
                return this;
            }

            public Builder setUpstreamServiceTime(com.google.protobuf.Timestamp.Builder builder) {
                if (this.upstreamServiceTimeBuilder_ == null) {
                    this.upstreamServiceTime_ = builder.build();
                    onChanged();
                } else {
                    this.upstreamServiceTimeBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeUpstreamServiceTime(Timestamp timestamp) {
                if (this.upstreamServiceTimeBuilder_ == null) {
                    if (this.upstreamServiceTime_ != null) {
                        this.upstreamServiceTime_ = Timestamp.newBuilder(this.upstreamServiceTime_).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.upstreamServiceTime_ = timestamp;
                    }
                    onChanged();
                } else {
                    this.upstreamServiceTimeBuilder_.mergeFrom(timestamp);
                }
                return this;
            }

            public Builder clearUpstreamServiceTime() {
                if (this.upstreamServiceTimeBuilder_ == null) {
                    this.upstreamServiceTime_ = null;
                    onChanged();
                } else {
                    this.upstreamServiceTime_ = null;
                    this.upstreamServiceTimeBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Timestamp.Builder getUpstreamServiceTimeBuilder() {
                onChanged();
                return (com.google.protobuf.Timestamp.Builder) getUpstreamServiceTimeFieldBuilder().getBuilder();
            }

            public TimestampOrBuilder getUpstreamServiceTimeOrBuilder() {
                if (this.upstreamServiceTimeBuilder_ != null) {
                    return (TimestampOrBuilder) this.upstreamServiceTimeBuilder_.getMessageOrBuilder();
                }
                return this.upstreamServiceTime_ == null ? Timestamp.getDefaultInstance() : this.upstreamServiceTime_;
            }

            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> getUpstreamServiceTimeFieldBuilder() {
                if (this.upstreamServiceTimeBuilder_ == null) {
                    this.upstreamServiceTimeBuilder_ = new SingleFieldBuilderV3(getUpstreamServiceTime(), getParentForChildren(), isClean());
                    this.upstreamServiceTime_ = null;
                }
                return this.upstreamServiceTimeBuilder_;
            }

            public long getUserNumber() {
                return this.userNumber_;
            }

            public Builder setUserNumber(long j) {
                this.userNumber_ = j;
                onChanged();
                return this;
            }

            public Builder clearUserNumber() {
                this.userNumber_ = 0;
                onChanged();
                return this;
            }
        }

        private BackendWrapper(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private BackendWrapper() {
            this.memoizedIsInitialized = (byte) -1;
            this.upstreamService_ = "";
            this.userNumber_ = 0;
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private BackendWrapper(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            Object obj = null;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        com.tinder.proto.keepalive.KeepAliveClientData.ClientData.Builder builder = null;
                        if (readTag == 10) {
                            if (this.clientData_ != null) {
                                builder = this.clientData_.toBuilder();
                            }
                            this.clientData_ = (ClientData) codedInputStream.readMessage(ClientData.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.clientData_);
                                this.clientData_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            if (this.startTime_ != null) {
                                r4 = this.startTime_.toBuilder();
                            }
                            this.startTime_ = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            if (r4 != null) {
                                r4.mergeFrom(this.startTime_);
                                this.startTime_ = r4.buildPartial();
                            }
                        } else if (readTag == 26) {
                            this.upstreamService_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 34) {
                            if (this.upstreamServiceTime_ != null) {
                                r4 = this.upstreamServiceTime_.toBuilder();
                            }
                            this.upstreamServiceTime_ = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            if (r4 != null) {
                                r4.mergeFrom(this.upstreamServiceTime_);
                                this.upstreamServiceTime_ = r4.buildPartial();
                            }
                        } else if (readTag == 40) {
                            this.userNumber_ = codedInputStream.readInt64();
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
            return KeepAliveBackendWrapper.internal_static_keepalive_BackendWrapper_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return KeepAliveBackendWrapper.internal_static_keepalive_BackendWrapper_fieldAccessorTable.ensureFieldAccessorsInitialized(BackendWrapper.class, Builder.class);
        }

        public boolean hasClientData() {
            return this.clientData_ != null;
        }

        public ClientData getClientData() {
            return this.clientData_ == null ? ClientData.getDefaultInstance() : this.clientData_;
        }

        public ClientDataOrBuilder getClientDataOrBuilder() {
            return getClientData();
        }

        public boolean hasStartTime() {
            return this.startTime_ != null;
        }

        public Timestamp getStartTime() {
            return this.startTime_ == null ? Timestamp.getDefaultInstance() : this.startTime_;
        }

        public TimestampOrBuilder getStartTimeOrBuilder() {
            return getStartTime();
        }

        public String getUpstreamService() {
            Object obj = this.upstreamService_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.upstreamService_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getUpstreamServiceBytes() {
            Object obj = this.upstreamService_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.upstreamService_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean hasUpstreamServiceTime() {
            return this.upstreamServiceTime_ != null;
        }

        public Timestamp getUpstreamServiceTime() {
            return this.upstreamServiceTime_ == null ? Timestamp.getDefaultInstance() : this.upstreamServiceTime_;
        }

        public TimestampOrBuilder getUpstreamServiceTimeOrBuilder() {
            return getUpstreamServiceTime();
        }

        public long getUserNumber() {
            return this.userNumber_;
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
            if (this.clientData_ != null) {
                codedOutputStream.writeMessage(1, getClientData());
            }
            if (this.startTime_ != null) {
                codedOutputStream.writeMessage(2, getStartTime());
            }
            if (!getUpstreamServiceBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.upstreamService_);
            }
            if (this.upstreamServiceTime_ != null) {
                codedOutputStream.writeMessage(4, getUpstreamServiceTime());
            }
            if (this.userNumber_ != 0) {
                codedOutputStream.writeInt64(5, this.userNumber_);
            }
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if (this.clientData_ != null) {
                i = 0 + CodedOutputStream.computeMessageSize(1, getClientData());
            }
            if (this.startTime_ != null) {
                i += CodedOutputStream.computeMessageSize(2, getStartTime());
            }
            if (!getUpstreamServiceBytes().isEmpty()) {
                i += GeneratedMessageV3.computeStringSize(3, this.upstreamService_);
            }
            if (this.upstreamServiceTime_ != null) {
                i += CodedOutputStream.computeMessageSize(4, getUpstreamServiceTime());
            }
            if (this.userNumber_ != 0) {
                i += CodedOutputStream.computeInt64Size(5, this.userNumber_);
            }
            this.memoizedSize = i;
            return i;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BackendWrapper)) {
                return super.equals(obj);
            }
            BackendWrapper backendWrapper = (BackendWrapper) obj;
            Object obj2 = hasClientData() == backendWrapper.hasClientData() ? 1 : null;
            if (hasClientData()) {
                obj2 = (obj2 == null || !getClientData().equals(backendWrapper.getClientData())) ? null : 1;
            }
            obj2 = (obj2 == null || hasStartTime() != backendWrapper.hasStartTime()) ? null : 1;
            if (hasStartTime()) {
                obj2 = (obj2 == null || !getStartTime().equals(backendWrapper.getStartTime())) ? null : 1;
            }
            obj2 = (obj2 == null || !getUpstreamService().equals(backendWrapper.getUpstreamService())) ? null : 1;
            obj2 = (obj2 == null || hasUpstreamServiceTime() != backendWrapper.hasUpstreamServiceTime()) ? null : 1;
            if (hasUpstreamServiceTime()) {
                obj2 = (obj2 == null || !getUpstreamServiceTime().equals(backendWrapper.getUpstreamServiceTime())) ? null : 1;
            }
            if (obj2 == null || getUserNumber() != backendWrapper.getUserNumber()) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptorForType().hashCode();
            if (hasClientData()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getClientData().hashCode();
            }
            if (hasStartTime()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getStartTime().hashCode();
            }
            hashCode = (((hashCode * 37) + 3) * 53) + getUpstreamService().hashCode();
            if (hasUpstreamServiceTime()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getUpstreamServiceTime().hashCode();
            }
            hashCode = (((((hashCode * 37) + 5) * 53) + Internal.hashLong(getUserNumber())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static BackendWrapper parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BackendWrapper) PARSER.parseFrom(byteString);
        }

        public static BackendWrapper parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BackendWrapper) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BackendWrapper parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BackendWrapper) PARSER.parseFrom(bArr);
        }

        public static BackendWrapper parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BackendWrapper) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static BackendWrapper parseFrom(InputStream inputStream) throws IOException {
            return (BackendWrapper) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static BackendWrapper parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BackendWrapper) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BackendWrapper parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BackendWrapper) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BackendWrapper parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BackendWrapper) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BackendWrapper parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BackendWrapper) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static BackendWrapper parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BackendWrapper) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(BackendWrapper backendWrapper) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(backendWrapper);
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

        public static BackendWrapper getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BackendWrapper> parser() {
            return PARSER;
        }

        public Parser<BackendWrapper> getParserForType() {
            return PARSER;
        }

        public BackendWrapper getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private KeepAliveBackendWrapper() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TimestampProto.getDescriptor(), KeepAliveClientData.getDescriptor()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001ekeepalive/BackendWrapper.proto\u0012\tkeepalive\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u001akeepalive/ClientData.proto\"Ö\u0001\n\u000eBackendWrapper\u0012*\n\u000bclient_data\u0018\u0001 \u0001(\u000b2\u0015.keepalive.ClientData\u0012.\n\nstart_time\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u0018\n\u0010upstream_service\u0018\u0003 \u0001(\t\u00129\n\u0015upstream_service_time\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u0013\n\u000buser_number\u0018\u0005 \u0001(\u0003B[\n\u001acom.tinder.proto.keepaliveB\u0017KeepAliveBackendWrapperZ$github.com/TinderApp/p", "roto/keepaliveb\u0006proto3"}, fileDescriptorArr, new C162091());
        TimestampProto.getDescriptor();
        KeepAliveClientData.getDescriptor();
    }
}
