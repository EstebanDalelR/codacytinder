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
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ServerEventBatch extends GeneratedMessageV3 implements ServerEventBatchOrBuilder {
    private static final ServerEventBatch DEFAULT_INSTANCE = new ServerEventBatch();
    public static final int MAX_SEQUENCE_ID_ON_INSTANCE_FIELD_NUMBER = 3;
    private static final Parser<ServerEventBatch> PARSER = new C79191();
    public static final int SERVER_EVENTS_FIELD_NUMBER = 4;
    public static final int SERVER_UPLOAD_TS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private long maxSequenceIdOnInstance_;
    private byte memoizedIsInitialized;
    private List<ServerEvent> serverEvents_;
    private double serverUploadTs_;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch$1 */
    static class C79191 extends AbstractParser<ServerEventBatch> {
        C79191() {
        }

        public ServerEventBatch parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ServerEventBatch(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements ServerEventBatchOrBuilder {
        private int bitField0_;
        private long maxSequenceIdOnInstance_;
        private RepeatedFieldBuilderV3<ServerEvent, com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder, ServerEventOrBuilder> serverEventsBuilder_;
        private List<ServerEvent> serverEvents_;
        private double serverUploadTs_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21750x7d50d397;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21751x2c9a7315.ensureFieldAccessorsInitialized(ServerEventBatch.class, Builder.class);
        }

        private Builder() {
            this.serverEvents_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.serverEvents_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (ServerEventBatch.alwaysUseFieldBuilders) {
                getServerEventsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.serverUploadTs_ = 0.0d;
            this.maxSequenceIdOnInstance_ = 0;
            if (this.serverEventsBuilder_ == null) {
                this.serverEvents_ = Collections.emptyList();
                this.bitField0_ &= -5;
            } else {
                this.serverEventsBuilder_.clear();
            }
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21750x7d50d397;
        }

        public ServerEventBatch getDefaultInstanceForType() {
            return ServerEventBatch.getDefaultInstance();
        }

        public ServerEventBatch build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public ServerEventBatch buildPartial() {
            ServerEventBatch serverEventBatch = new ServerEventBatch((com.google.protobuf.GeneratedMessageV3.Builder) this);
            int i = this.bitField0_;
            serverEventBatch.serverUploadTs_ = this.serverUploadTs_;
            serverEventBatch.maxSequenceIdOnInstance_ = this.maxSequenceIdOnInstance_;
            if (this.serverEventsBuilder_ == null) {
                if ((this.bitField0_ & 4) == 4) {
                    this.serverEvents_ = Collections.unmodifiableList(this.serverEvents_);
                    this.bitField0_ &= -5;
                }
                serverEventBatch.serverEvents_ = this.serverEvents_;
            } else {
                serverEventBatch.serverEvents_ = this.serverEventsBuilder_.build();
            }
            serverEventBatch.bitField0_ = 0;
            onBuilt();
            return serverEventBatch;
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
            if (message instanceof ServerEventBatch) {
                return mergeFrom((ServerEventBatch) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ServerEventBatch serverEventBatch) {
            if (serverEventBatch == ServerEventBatch.getDefaultInstance()) {
                return this;
            }
            if (serverEventBatch.getServerUploadTs() != 0.0d) {
                setServerUploadTs(serverEventBatch.getServerUploadTs());
            }
            if (serverEventBatch.getMaxSequenceIdOnInstance() != 0) {
                setMaxSequenceIdOnInstance(serverEventBatch.getMaxSequenceIdOnInstance());
            }
            if (this.serverEventsBuilder_ == null) {
                if (!serverEventBatch.serverEvents_.isEmpty()) {
                    if (this.serverEvents_.isEmpty()) {
                        this.serverEvents_ = serverEventBatch.serverEvents_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureServerEventsIsMutable();
                        this.serverEvents_.addAll(serverEventBatch.serverEvents_);
                    }
                    onChanged();
                }
            } else if (!serverEventBatch.serverEvents_.isEmpty()) {
                if (this.serverEventsBuilder_.isEmpty()) {
                    this.serverEventsBuilder_.dispose();
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = null;
                    this.serverEventsBuilder_ = null;
                    this.serverEvents_ = serverEventBatch.serverEvents_;
                    this.bitField0_ &= -5;
                    if (ServerEventBatch.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getServerEventsFieldBuilder();
                    }
                    this.serverEventsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.serverEventsBuilder_.addAllMessages(serverEventBatch.serverEvents_);
                }
            }
            mergeUnknownFields(serverEventBatch.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            ServerEventBatch serverEventBatch;
            ServerEventBatch serverEventBatch2 = null;
            try {
                ServerEventBatch serverEventBatch3 = (ServerEventBatch) ServerEventBatch.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (serverEventBatch3 != null) {
                    mergeFrom(serverEventBatch3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                serverEventBatch = (ServerEventBatch) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                serverEventBatch2 = serverEventBatch;
                if (serverEventBatch2 != null) {
                    mergeFrom(serverEventBatch2);
                }
                throw codedInputStream2;
            }
        }

        public double getServerUploadTs() {
            return this.serverUploadTs_;
        }

        public Builder setServerUploadTs(double d) {
            this.serverUploadTs_ = d;
            onChanged();
            return this;
        }

        public Builder clearServerUploadTs() {
            this.serverUploadTs_ = 0.0d;
            onChanged();
            return this;
        }

        public long getMaxSequenceIdOnInstance() {
            return this.maxSequenceIdOnInstance_;
        }

        public Builder setMaxSequenceIdOnInstance(long j) {
            this.maxSequenceIdOnInstance_ = j;
            onChanged();
            return this;
        }

        public Builder clearMaxSequenceIdOnInstance() {
            this.maxSequenceIdOnInstance_ = 0;
            onChanged();
            return this;
        }

        private void ensureServerEventsIsMutable() {
            if ((this.bitField0_ & 4) != 4) {
                this.serverEvents_ = new ArrayList(this.serverEvents_);
                this.bitField0_ |= 4;
            }
        }

        public List<ServerEvent> getServerEventsList() {
            if (this.serverEventsBuilder_ == null) {
                return Collections.unmodifiableList(this.serverEvents_);
            }
            return this.serverEventsBuilder_.getMessageList();
        }

        public int getServerEventsCount() {
            if (this.serverEventsBuilder_ == null) {
                return this.serverEvents_.size();
            }
            return this.serverEventsBuilder_.getCount();
        }

        public ServerEvent getServerEvents(int i) {
            if (this.serverEventsBuilder_ == null) {
                return (ServerEvent) this.serverEvents_.get(i);
            }
            return (ServerEvent) this.serverEventsBuilder_.getMessage(i);
        }

        public Builder setServerEvents(int i, ServerEvent serverEvent) {
            if (this.serverEventsBuilder_ != null) {
                this.serverEventsBuilder_.setMessage(i, serverEvent);
            } else if (serverEvent == null) {
                throw new NullPointerException();
            } else {
                ensureServerEventsIsMutable();
                this.serverEvents_.set(i, serverEvent);
                onChanged();
            }
            return this;
        }

        public Builder setServerEvents(int i, com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder builder) {
            if (this.serverEventsBuilder_ == null) {
                ensureServerEventsIsMutable();
                this.serverEvents_.set(i, builder.build());
                onChanged();
            } else {
                this.serverEventsBuilder_.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addServerEvents(ServerEvent serverEvent) {
            if (this.serverEventsBuilder_ != null) {
                this.serverEventsBuilder_.addMessage(serverEvent);
            } else if (serverEvent == null) {
                throw new NullPointerException();
            } else {
                ensureServerEventsIsMutable();
                this.serverEvents_.add(serverEvent);
                onChanged();
            }
            return this;
        }

        public Builder addServerEvents(int i, ServerEvent serverEvent) {
            if (this.serverEventsBuilder_ != null) {
                this.serverEventsBuilder_.addMessage(i, serverEvent);
            } else if (serverEvent == null) {
                throw new NullPointerException();
            } else {
                ensureServerEventsIsMutable();
                this.serverEvents_.add(i, serverEvent);
                onChanged();
            }
            return this;
        }

        public Builder addServerEvents(com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder builder) {
            if (this.serverEventsBuilder_ == null) {
                ensureServerEventsIsMutable();
                this.serverEvents_.add(builder.build());
                onChanged();
            } else {
                this.serverEventsBuilder_.addMessage(builder.build());
            }
            return this;
        }

        public Builder addServerEvents(int i, com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder builder) {
            if (this.serverEventsBuilder_ == null) {
                ensureServerEventsIsMutable();
                this.serverEvents_.add(i, builder.build());
                onChanged();
            } else {
                this.serverEventsBuilder_.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllServerEvents(Iterable<? extends ServerEvent> iterable) {
            if (this.serverEventsBuilder_ == null) {
                ensureServerEventsIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.serverEvents_);
                onChanged();
            } else {
                this.serverEventsBuilder_.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearServerEvents() {
            if (this.serverEventsBuilder_ == null) {
                this.serverEvents_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
            } else {
                this.serverEventsBuilder_.clear();
            }
            return this;
        }

        public Builder removeServerEvents(int i) {
            if (this.serverEventsBuilder_ == null) {
                ensureServerEventsIsMutable();
                this.serverEvents_.remove(i);
                onChanged();
            } else {
                this.serverEventsBuilder_.remove(i);
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder getServerEventsBuilder(int i) {
            return (com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder) getServerEventsFieldBuilder().getBuilder(i);
        }

        public ServerEventOrBuilder getServerEventsOrBuilder(int i) {
            if (this.serverEventsBuilder_ == null) {
                return (ServerEventOrBuilder) this.serverEvents_.get(i);
            }
            return (ServerEventOrBuilder) this.serverEventsBuilder_.getMessageOrBuilder(i);
        }

        public List<? extends ServerEventOrBuilder> getServerEventsOrBuilderList() {
            if (this.serverEventsBuilder_ != null) {
                return this.serverEventsBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.serverEvents_);
        }

        public com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder addServerEventsBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder) getServerEventsFieldBuilder().addBuilder(ServerEvent.getDefaultInstance());
        }

        public com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder addServerEventsBuilder(int i) {
            return (com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder) getServerEventsFieldBuilder().addBuilder(i, ServerEvent.getDefaultInstance());
        }

        public List<com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder> getServerEventsBuilderList() {
            return getServerEventsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<ServerEvent, com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder, ServerEventOrBuilder> getServerEventsFieldBuilder() {
            if (this.serverEventsBuilder_ == null) {
                this.serverEventsBuilder_ = new RepeatedFieldBuilderV3(this.serverEvents_, (this.bitField0_ & 4) == 4, getParentForChildren(), isClean());
                this.serverEvents_ = null;
            }
            return this.serverEventsBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private ServerEventBatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private ServerEventBatch() {
        this.memoizedIsInitialized = (byte) -1;
        this.serverUploadTs_ = 0.0d;
        this.maxSequenceIdOnInstance_ = 0;
        this.serverEvents_ = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private ServerEventBatch(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        Object obj = null;
        int i = 0;
        while (obj == null) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 9) {
                        this.serverUploadTs_ = codedInputStream.readDouble();
                    } else if (readTag == 24) {
                        this.maxSequenceIdOnInstance_ = codedInputStream.readUInt64();
                    } else if (readTag == 34) {
                        if ((i & 4) != 4) {
                            this.serverEvents_ = new ArrayList();
                            i |= 4;
                        }
                        this.serverEvents_.add(codedInputStream.readMessage(ServerEvent.parser(), extensionRegistryLite));
                    } else if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                    }
                }
                obj = 1;
            } catch (CodedInputStream codedInputStream2) {
                throw codedInputStream2.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } catch (Throwable th) {
                if ((i & 4) == 4) {
                    this.serverEvents_ = Collections.unmodifiableList(this.serverEvents_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
        if ((i & 4) == 4) {
            this.serverEvents_ = Collections.unmodifiableList(this.serverEvents_);
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static final Descriptor getDescriptor() {
        return Event.f21750x7d50d397;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21751x2c9a7315.ensureFieldAccessorsInitialized(ServerEventBatch.class, Builder.class);
    }

    public double getServerUploadTs() {
        return this.serverUploadTs_;
    }

    public long getMaxSequenceIdOnInstance() {
        return this.maxSequenceIdOnInstance_;
    }

    public List<ServerEvent> getServerEventsList() {
        return this.serverEvents_;
    }

    public List<? extends ServerEventOrBuilder> getServerEventsOrBuilderList() {
        return this.serverEvents_;
    }

    public int getServerEventsCount() {
        return this.serverEvents_.size();
    }

    public ServerEvent getServerEvents(int i) {
        return (ServerEvent) this.serverEvents_.get(i);
    }

    public ServerEventOrBuilder getServerEventsOrBuilder(int i) {
        return (ServerEventOrBuilder) this.serverEvents_.get(i);
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
        if (this.serverUploadTs_ != 0.0d) {
            codedOutputStream.writeDouble(1, this.serverUploadTs_);
        }
        if (this.maxSequenceIdOnInstance_ != 0) {
            codedOutputStream.writeUInt64(3, this.maxSequenceIdOnInstance_);
        }
        for (int i = 0; i < this.serverEvents_.size(); i++) {
            codedOutputStream.writeMessage(4, (MessageLite) this.serverEvents_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        i = 0;
        int computeDoubleSize = this.serverUploadTs_ != 0.0d ? CodedOutputStream.computeDoubleSize(1, this.serverUploadTs_) + 0 : 0;
        if (this.maxSequenceIdOnInstance_ != 0) {
            computeDoubleSize += CodedOutputStream.computeUInt64Size(3, this.maxSequenceIdOnInstance_);
        }
        while (i < this.serverEvents_.size()) {
            computeDoubleSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.serverEvents_.get(i));
            i++;
        }
        computeDoubleSize += this.unknownFields.getSerializedSize();
        this.memoizedSize = computeDoubleSize;
        return computeDoubleSize;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServerEventBatch)) {
            return super.equals(obj);
        }
        ServerEventBatch serverEventBatch = (ServerEventBatch) obj;
        Object obj2 = (((Double.doubleToLongBits(getServerUploadTs()) > Double.doubleToLongBits(serverEventBatch.getServerUploadTs()) ? 1 : (Double.doubleToLongBits(getServerUploadTs()) == Double.doubleToLongBits(serverEventBatch.getServerUploadTs()) ? 0 : -1)) == 0 ? 1 : null) == null || getMaxSequenceIdOnInstance() != serverEventBatch.getMaxSequenceIdOnInstance()) ? null : 1;
        obj2 = (obj2 == null || !getServerEventsList().equals(serverEventBatch.getServerEventsList())) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(serverEventBatch.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(Double.doubleToLongBits(getServerUploadTs()))) * 37) + 3) * 53) + Internal.hashLong(getMaxSequenceIdOnInstance());
        if (getServerEventsCount() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + getServerEventsList().hashCode();
        }
        hashCode = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static ServerEventBatch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ServerEventBatch) PARSER.parseFrom(byteBuffer);
    }

    public static ServerEventBatch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ServerEventBatch) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ServerEventBatch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ServerEventBatch) PARSER.parseFrom(byteString);
    }

    public static ServerEventBatch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ServerEventBatch) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ServerEventBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ServerEventBatch) PARSER.parseFrom(bArr);
    }

    public static ServerEventBatch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ServerEventBatch) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ServerEventBatch parseFrom(InputStream inputStream) throws IOException {
        return (ServerEventBatch) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ServerEventBatch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServerEventBatch) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ServerEventBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ServerEventBatch) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ServerEventBatch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServerEventBatch) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ServerEventBatch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ServerEventBatch) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ServerEventBatch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServerEventBatch) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ServerEventBatch serverEventBatch) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(serverEventBatch);
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

    public static ServerEventBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ServerEventBatch> parser() {
        return PARSER;
    }

    public Parser<ServerEventBatch> getParserForType() {
        return PARSER;
    }

    public ServerEventBatch getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
