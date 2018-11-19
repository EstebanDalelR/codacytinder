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
import com.google.protobuf.Empty;
import com.google.protobuf.EmptyOrBuilder;
import com.google.protobuf.EmptyProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.TimestampProto;
import com.google.protobuf.UnknownFieldSet;
import com.tinder.proto.keepalive.KeepAliveNudge.Nudge;
import com.tinder.proto.keepalive.KeepAliveNudge.NudgeOrBuilder;
import com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator;
import com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicatorOrBuilder;
import com.tinder.proto.keepalive.KeepAliveUpdate.Update;
import com.tinder.proto.keepalive.KeepAliveUpdate.UpdateOrBuilder;
import java.io.IOException;
import java.io.InputStream;

public final class KeepAliveClientData {
    private static FileDescriptor descriptor;
    private static final Descriptor internal_static_keepalive_ClientData_descriptor = ((Descriptor) getDescriptor().getMessageTypes().get(0));
    private static final FieldAccessorTable internal_static_keepalive_ClientData_fieldAccessorTable = new FieldAccessorTable(internal_static_keepalive_ClientData_descriptor, new String[]{"Meta", "Error", "Nudge", "Update", "Ping", "Pong", "TypingIndicator", "Payload"});
    private static final Descriptor internal_static_keepalive_Error_descriptor = ((Descriptor) getDescriptor().getMessageTypes().get(2));
    private static final FieldAccessorTable internal_static_keepalive_Error_fieldAccessorTable = new FieldAccessorTable(internal_static_keepalive_Error_descriptor, new String[]{"Code", "Message"});
    private static final Descriptor internal_static_keepalive_Meta_descriptor = ((Descriptor) getDescriptor().getMessageTypes().get(1));
    private static final FieldAccessorTable internal_static_keepalive_Meta_fieldAccessorTable = new FieldAccessorTable(internal_static_keepalive_Meta_descriptor, new String[]{"UpstreamTime", "StartTime"});

    /* renamed from: com.tinder.proto.keepalive.KeepAliveClientData$1 */
    static class C162101 implements InternalDescriptorAssigner {
        C162101() {
        }

        public ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor) {
            KeepAliveClientData.descriptor = fileDescriptor;
            return null;
        }
    }

    public interface ClientDataOrBuilder extends MessageOrBuilder {
        Error getError();

        ErrorOrBuilder getErrorOrBuilder();

        Meta getMeta();

        MetaOrBuilder getMetaOrBuilder();

        Nudge getNudge();

        NudgeOrBuilder getNudgeOrBuilder();

        PayloadCase getPayloadCase();

        Empty getPing();

        EmptyOrBuilder getPingOrBuilder();

        Empty getPong();

        EmptyOrBuilder getPongOrBuilder();

        TypingIndicator getTypingIndicator();

        TypingIndicatorOrBuilder getTypingIndicatorOrBuilder();

        Update getUpdate();

        UpdateOrBuilder getUpdateOrBuilder();

        boolean hasError();

        boolean hasMeta();
    }

    public interface ErrorOrBuilder extends MessageOrBuilder {
        int getCode();

        String getMessage();

        ByteString getMessageBytes();
    }

    public interface MetaOrBuilder extends MessageOrBuilder {
        Timestamp getStartTime();

        TimestampOrBuilder getStartTimeOrBuilder();

        Timestamp getUpstreamTime();

        TimestampOrBuilder getUpstreamTimeOrBuilder();

        boolean hasStartTime();

        boolean hasUpstreamTime();
    }

    public static final class ClientData extends GeneratedMessageV3 implements ClientDataOrBuilder {
        private static final ClientData DEFAULT_INSTANCE = new ClientData();
        public static final int ERROR_FIELD_NUMBER = 2;
        public static final int META_FIELD_NUMBER = 1;
        public static final int NUDGE_FIELD_NUMBER = 3;
        private static final Parser<ClientData> PARSER = new C177901();
        public static final int PING_FIELD_NUMBER = 5;
        public static final int PONG_FIELD_NUMBER = 6;
        public static final int TYPING_INDICATOR_FIELD_NUMBER = 7;
        public static final int UPDATE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private Error error_;
        private byte memoizedIsInitialized;
        private Meta meta_;
        private int payloadCase_;
        private Object payload_;

        public enum PayloadCase implements EnumLite {
            NUDGE(3),
            UPDATE(4),
            PING(5),
            PONG(6),
            TYPING_INDICATOR(7),
            PAYLOAD_NOT_SET(0);
            
            private final int value;

            private PayloadCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static PayloadCase valueOf(int i) {
                return forNumber(i);
            }

            public static PayloadCase forNumber(int i) {
                if (i == 0) {
                    return PAYLOAD_NOT_SET;
                }
                switch (i) {
                    case 3:
                        return NUDGE;
                    case 4:
                        return UPDATE;
                    case 5:
                        return PING;
                    case 6:
                        return PONG;
                    case 7:
                        return TYPING_INDICATOR;
                    default:
                        return 0;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }

        /* renamed from: com.tinder.proto.keepalive.KeepAliveClientData$ClientData$1 */
        static class C177901 extends AbstractParser<ClientData> {
            C177901() {
            }

            public ClientData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ClientData(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements ClientDataOrBuilder {
            private SingleFieldBuilderV3<Error, Builder, ErrorOrBuilder> errorBuilder_;
            private Error error_;
            private SingleFieldBuilderV3<Meta, Builder, MetaOrBuilder> metaBuilder_;
            private Meta meta_;
            private SingleFieldBuilderV3<Nudge, com.tinder.proto.keepalive.KeepAliveNudge.Nudge.Builder, NudgeOrBuilder> nudgeBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilderV3<Empty, com.google.protobuf.Empty.Builder, EmptyOrBuilder> pingBuilder_;
            private SingleFieldBuilderV3<Empty, com.google.protobuf.Empty.Builder, EmptyOrBuilder> pongBuilder_;
            private SingleFieldBuilderV3<TypingIndicator, com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator.Builder, TypingIndicatorOrBuilder> typingIndicatorBuilder_;
            private SingleFieldBuilderV3<Update, com.tinder.proto.keepalive.KeepAliveUpdate.Update.Builder, UpdateOrBuilder> updateBuilder_;

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
                return KeepAliveClientData.internal_static_keepalive_ClientData_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return KeepAliveClientData.internal_static_keepalive_ClientData_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientData.class, Builder.class);
            }

            private Builder() {
                this.payloadCase_ = 0;
                this.meta_ = null;
                this.error_ = null;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = null;
                this.meta_ = null;
                this.error_ = null;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                ClientData.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                if (this.metaBuilder_ == null) {
                    this.meta_ = null;
                } else {
                    this.meta_ = null;
                    this.metaBuilder_ = null;
                }
                if (this.errorBuilder_ == null) {
                    this.error_ = null;
                } else {
                    this.error_ = null;
                    this.errorBuilder_ = null;
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            public Descriptor getDescriptorForType() {
                return KeepAliveClientData.internal_static_keepalive_ClientData_descriptor;
            }

            public ClientData getDefaultInstanceForType() {
                return ClientData.getDefaultInstance();
            }

            public ClientData build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public ClientData buildPartial() {
                ClientData clientData = new ClientData((com.google.protobuf.GeneratedMessageV3.Builder) this);
                if (this.metaBuilder_ == null) {
                    clientData.meta_ = this.meta_;
                } else {
                    clientData.meta_ = (Meta) this.metaBuilder_.build();
                }
                if (this.errorBuilder_ == null) {
                    clientData.error_ = this.error_;
                } else {
                    clientData.error_ = (Error) this.errorBuilder_.build();
                }
                if (this.payloadCase_ == 3) {
                    if (this.nudgeBuilder_ == null) {
                        clientData.payload_ = this.payload_;
                    } else {
                        clientData.payload_ = this.nudgeBuilder_.build();
                    }
                }
                if (this.payloadCase_ == 4) {
                    if (this.updateBuilder_ == null) {
                        clientData.payload_ = this.payload_;
                    } else {
                        clientData.payload_ = this.updateBuilder_.build();
                    }
                }
                if (this.payloadCase_ == 5) {
                    if (this.pingBuilder_ == null) {
                        clientData.payload_ = this.payload_;
                    } else {
                        clientData.payload_ = this.pingBuilder_.build();
                    }
                }
                if (this.payloadCase_ == 6) {
                    if (this.pongBuilder_ == null) {
                        clientData.payload_ = this.payload_;
                    } else {
                        clientData.payload_ = this.pongBuilder_.build();
                    }
                }
                if (this.payloadCase_ == 7) {
                    if (this.typingIndicatorBuilder_ == null) {
                        clientData.payload_ = this.payload_;
                    } else {
                        clientData.payload_ = this.typingIndicatorBuilder_.build();
                    }
                }
                clientData.payloadCase_ = this.payloadCase_;
                onBuilt();
                return clientData;
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
                if (message instanceof ClientData) {
                    return mergeFrom((ClientData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ClientData clientData) {
                if (clientData == ClientData.getDefaultInstance()) {
                    return this;
                }
                if (clientData.hasMeta()) {
                    mergeMeta(clientData.getMeta());
                }
                if (clientData.hasError()) {
                    mergeError(clientData.getError());
                }
                switch (clientData.getPayloadCase()) {
                    case NUDGE:
                        mergeNudge(clientData.getNudge());
                        break;
                    case UPDATE:
                        mergeUpdate(clientData.getUpdate());
                        break;
                    case PING:
                        mergePing(clientData.getPing());
                        break;
                    case PONG:
                        mergePong(clientData.getPong());
                        break;
                    case TYPING_INDICATOR:
                        mergeTypingIndicator(clientData.getTypingIndicator());
                        break;
                    default:
                        break;
                }
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                ClientData clientData;
                ClientData clientData2 = null;
                try {
                    ClientData clientData3 = (ClientData) ClientData.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (clientData3 != null) {
                        mergeFrom(clientData3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    clientData = (ClientData) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    clientData2 = clientData;
                    if (clientData2 != null) {
                        mergeFrom(clientData2);
                    }
                    throw codedInputStream2;
                }
            }

            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public boolean hasMeta() {
                if (this.metaBuilder_ == null) {
                    if (this.meta_ == null) {
                        return false;
                    }
                }
                return true;
            }

            public Meta getMeta() {
                if (this.metaBuilder_ != null) {
                    return (Meta) this.metaBuilder_.getMessage();
                }
                return this.meta_ == null ? Meta.getDefaultInstance() : this.meta_;
            }

            public Builder setMeta(Meta meta) {
                if (this.metaBuilder_ != null) {
                    this.metaBuilder_.setMessage(meta);
                } else if (meta == null) {
                    throw new NullPointerException();
                } else {
                    this.meta_ = meta;
                    onChanged();
                }
                return this;
            }

            public Builder setMeta(Builder builder) {
                if (this.metaBuilder_ == null) {
                    this.meta_ = builder.build();
                    onChanged();
                } else {
                    this.metaBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeMeta(Meta meta) {
                if (this.metaBuilder_ == null) {
                    if (this.meta_ != null) {
                        this.meta_ = Meta.newBuilder(this.meta_).mergeFrom(meta).buildPartial();
                    } else {
                        this.meta_ = meta;
                    }
                    onChanged();
                } else {
                    this.metaBuilder_.mergeFrom(meta);
                }
                return this;
            }

            public Builder clearMeta() {
                if (this.metaBuilder_ == null) {
                    this.meta_ = null;
                    onChanged();
                } else {
                    this.meta_ = null;
                    this.metaBuilder_ = null;
                }
                return this;
            }

            public Builder getMetaBuilder() {
                onChanged();
                return (Builder) getMetaFieldBuilder().getBuilder();
            }

            public MetaOrBuilder getMetaOrBuilder() {
                if (this.metaBuilder_ != null) {
                    return (MetaOrBuilder) this.metaBuilder_.getMessageOrBuilder();
                }
                return this.meta_ == null ? Meta.getDefaultInstance() : this.meta_;
            }

            private SingleFieldBuilderV3<Meta, Builder, MetaOrBuilder> getMetaFieldBuilder() {
                if (this.metaBuilder_ == null) {
                    this.metaBuilder_ = new SingleFieldBuilderV3(getMeta(), getParentForChildren(), isClean());
                    this.meta_ = null;
                }
                return this.metaBuilder_;
            }

            public boolean hasError() {
                if (this.errorBuilder_ == null) {
                    if (this.error_ == null) {
                        return false;
                    }
                }
                return true;
            }

            public Error getError() {
                if (this.errorBuilder_ != null) {
                    return (Error) this.errorBuilder_.getMessage();
                }
                return this.error_ == null ? Error.getDefaultInstance() : this.error_;
            }

            public Builder setError(Error error) {
                if (this.errorBuilder_ != null) {
                    this.errorBuilder_.setMessage(error);
                } else if (error == null) {
                    throw new NullPointerException();
                } else {
                    this.error_ = error;
                    onChanged();
                }
                return this;
            }

            public Builder setError(Builder builder) {
                if (this.errorBuilder_ == null) {
                    this.error_ = builder.build();
                    onChanged();
                } else {
                    this.errorBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeError(Error error) {
                if (this.errorBuilder_ == null) {
                    if (this.error_ != null) {
                        this.error_ = Error.newBuilder(this.error_).mergeFrom(error).buildPartial();
                    } else {
                        this.error_ = error;
                    }
                    onChanged();
                } else {
                    this.errorBuilder_.mergeFrom(error);
                }
                return this;
            }

            public Builder clearError() {
                if (this.errorBuilder_ == null) {
                    this.error_ = null;
                    onChanged();
                } else {
                    this.error_ = null;
                    this.errorBuilder_ = null;
                }
                return this;
            }

            public Builder getErrorBuilder() {
                onChanged();
                return (Builder) getErrorFieldBuilder().getBuilder();
            }

            public ErrorOrBuilder getErrorOrBuilder() {
                if (this.errorBuilder_ != null) {
                    return (ErrorOrBuilder) this.errorBuilder_.getMessageOrBuilder();
                }
                return this.error_ == null ? Error.getDefaultInstance() : this.error_;
            }

            private SingleFieldBuilderV3<Error, Builder, ErrorOrBuilder> getErrorFieldBuilder() {
                if (this.errorBuilder_ == null) {
                    this.errorBuilder_ = new SingleFieldBuilderV3(getError(), getParentForChildren(), isClean());
                    this.error_ = null;
                }
                return this.errorBuilder_;
            }

            public Nudge getNudge() {
                if (this.nudgeBuilder_ == null) {
                    if (this.payloadCase_ == 3) {
                        return (Nudge) this.payload_;
                    }
                    return Nudge.getDefaultInstance();
                } else if (this.payloadCase_ == 3) {
                    return (Nudge) this.nudgeBuilder_.getMessage();
                } else {
                    return Nudge.getDefaultInstance();
                }
            }

            public Builder setNudge(Nudge nudge) {
                if (this.nudgeBuilder_ != null) {
                    this.nudgeBuilder_.setMessage(nudge);
                } else if (nudge == null) {
                    throw new NullPointerException();
                } else {
                    this.payload_ = nudge;
                    onChanged();
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setNudge(com.tinder.proto.keepalive.KeepAliveNudge.Nudge.Builder builder) {
                if (this.nudgeBuilder_ == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    this.nudgeBuilder_.setMessage(builder.build());
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeNudge(Nudge nudge) {
                if (this.nudgeBuilder_ == null) {
                    if (this.payloadCase_ != 3 || this.payload_ == Nudge.getDefaultInstance()) {
                        this.payload_ = nudge;
                    } else {
                        this.payload_ = Nudge.newBuilder((Nudge) this.payload_).mergeFrom(nudge).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.payloadCase_ == 3) {
                        this.nudgeBuilder_.mergeFrom(nudge);
                    }
                    this.nudgeBuilder_.setMessage(nudge);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder clearNudge() {
                if (this.nudgeBuilder_ != null) {
                    if (this.payloadCase_ == 3) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                    }
                    this.nudgeBuilder_.clear();
                } else if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public com.tinder.proto.keepalive.KeepAliveNudge.Nudge.Builder getNudgeBuilder() {
                return (com.tinder.proto.keepalive.KeepAliveNudge.Nudge.Builder) getNudgeFieldBuilder().getBuilder();
            }

            public NudgeOrBuilder getNudgeOrBuilder() {
                if (this.payloadCase_ == 3 && this.nudgeBuilder_ != null) {
                    return (NudgeOrBuilder) this.nudgeBuilder_.getMessageOrBuilder();
                }
                if (this.payloadCase_ == 3) {
                    return (Nudge) this.payload_;
                }
                return Nudge.getDefaultInstance();
            }

            private SingleFieldBuilderV3<Nudge, com.tinder.proto.keepalive.KeepAliveNudge.Nudge.Builder, NudgeOrBuilder> getNudgeFieldBuilder() {
                if (this.nudgeBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = Nudge.getDefaultInstance();
                    }
                    this.nudgeBuilder_ = new SingleFieldBuilderV3((Nudge) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.nudgeBuilder_;
            }

            public Update getUpdate() {
                if (this.updateBuilder_ == null) {
                    if (this.payloadCase_ == 4) {
                        return (Update) this.payload_;
                    }
                    return Update.getDefaultInstance();
                } else if (this.payloadCase_ == 4) {
                    return (Update) this.updateBuilder_.getMessage();
                } else {
                    return Update.getDefaultInstance();
                }
            }

            public Builder setUpdate(Update update) {
                if (this.updateBuilder_ != null) {
                    this.updateBuilder_.setMessage(update);
                } else if (update == null) {
                    throw new NullPointerException();
                } else {
                    this.payload_ = update;
                    onChanged();
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setUpdate(com.tinder.proto.keepalive.KeepAliveUpdate.Update.Builder builder) {
                if (this.updateBuilder_ == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    this.updateBuilder_.setMessage(builder.build());
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeUpdate(Update update) {
                if (this.updateBuilder_ == null) {
                    if (this.payloadCase_ != 4 || this.payload_ == Update.getDefaultInstance()) {
                        this.payload_ = update;
                    } else {
                        this.payload_ = Update.newBuilder((Update) this.payload_).mergeFrom(update).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.payloadCase_ == 4) {
                        this.updateBuilder_.mergeFrom(update);
                    }
                    this.updateBuilder_.setMessage(update);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder clearUpdate() {
                if (this.updateBuilder_ != null) {
                    if (this.payloadCase_ == 4) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                    }
                    this.updateBuilder_.clear();
                } else if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public com.tinder.proto.keepalive.KeepAliveUpdate.Update.Builder getUpdateBuilder() {
                return (com.tinder.proto.keepalive.KeepAliveUpdate.Update.Builder) getUpdateFieldBuilder().getBuilder();
            }

            public UpdateOrBuilder getUpdateOrBuilder() {
                if (this.payloadCase_ == 4 && this.updateBuilder_ != null) {
                    return (UpdateOrBuilder) this.updateBuilder_.getMessageOrBuilder();
                }
                if (this.payloadCase_ == 4) {
                    return (Update) this.payload_;
                }
                return Update.getDefaultInstance();
            }

            private SingleFieldBuilderV3<Update, com.tinder.proto.keepalive.KeepAliveUpdate.Update.Builder, UpdateOrBuilder> getUpdateFieldBuilder() {
                if (this.updateBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = Update.getDefaultInstance();
                    }
                    this.updateBuilder_ = new SingleFieldBuilderV3((Update) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.updateBuilder_;
            }

            public Empty getPing() {
                if (this.pingBuilder_ == null) {
                    if (this.payloadCase_ == 5) {
                        return (Empty) this.payload_;
                    }
                    return Empty.getDefaultInstance();
                } else if (this.payloadCase_ == 5) {
                    return (Empty) this.pingBuilder_.getMessage();
                } else {
                    return Empty.getDefaultInstance();
                }
            }

            public Builder setPing(Empty empty) {
                if (this.pingBuilder_ != null) {
                    this.pingBuilder_.setMessage(empty);
                } else if (empty == null) {
                    throw new NullPointerException();
                } else {
                    this.payload_ = empty;
                    onChanged();
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setPing(com.google.protobuf.Empty.Builder builder) {
                if (this.pingBuilder_ == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    this.pingBuilder_.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergePing(Empty empty) {
                if (this.pingBuilder_ == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == Empty.getDefaultInstance()) {
                        this.payload_ = empty;
                    } else {
                        this.payload_ = Empty.newBuilder((Empty) this.payload_).mergeFrom(empty).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.payloadCase_ == 5) {
                        this.pingBuilder_.mergeFrom(empty);
                    }
                    this.pingBuilder_.setMessage(empty);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder clearPing() {
                if (this.pingBuilder_ != null) {
                    if (this.payloadCase_ == 5) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                    }
                    this.pingBuilder_.clear();
                } else if (this.payloadCase_ == 5) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public com.google.protobuf.Empty.Builder getPingBuilder() {
                return (com.google.protobuf.Empty.Builder) getPingFieldBuilder().getBuilder();
            }

            public EmptyOrBuilder getPingOrBuilder() {
                if (this.payloadCase_ == 5 && this.pingBuilder_ != null) {
                    return (EmptyOrBuilder) this.pingBuilder_.getMessageOrBuilder();
                }
                if (this.payloadCase_ == 5) {
                    return (Empty) this.payload_;
                }
                return Empty.getDefaultInstance();
            }

            private SingleFieldBuilderV3<Empty, com.google.protobuf.Empty.Builder, EmptyOrBuilder> getPingFieldBuilder() {
                if (this.pingBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = Empty.getDefaultInstance();
                    }
                    this.pingBuilder_ = new SingleFieldBuilderV3((Empty) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.pingBuilder_;
            }

            public Empty getPong() {
                if (this.pongBuilder_ == null) {
                    if (this.payloadCase_ == 6) {
                        return (Empty) this.payload_;
                    }
                    return Empty.getDefaultInstance();
                } else if (this.payloadCase_ == 6) {
                    return (Empty) this.pongBuilder_.getMessage();
                } else {
                    return Empty.getDefaultInstance();
                }
            }

            public Builder setPong(Empty empty) {
                if (this.pongBuilder_ != null) {
                    this.pongBuilder_.setMessage(empty);
                } else if (empty == null) {
                    throw new NullPointerException();
                } else {
                    this.payload_ = empty;
                    onChanged();
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setPong(com.google.protobuf.Empty.Builder builder) {
                if (this.pongBuilder_ == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    this.pongBuilder_.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergePong(Empty empty) {
                if (this.pongBuilder_ == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == Empty.getDefaultInstance()) {
                        this.payload_ = empty;
                    } else {
                        this.payload_ = Empty.newBuilder((Empty) this.payload_).mergeFrom(empty).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.payloadCase_ == 6) {
                        this.pongBuilder_.mergeFrom(empty);
                    }
                    this.pongBuilder_.setMessage(empty);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder clearPong() {
                if (this.pongBuilder_ != null) {
                    if (this.payloadCase_ == 6) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                    }
                    this.pongBuilder_.clear();
                } else if (this.payloadCase_ == 6) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public com.google.protobuf.Empty.Builder getPongBuilder() {
                return (com.google.protobuf.Empty.Builder) getPongFieldBuilder().getBuilder();
            }

            public EmptyOrBuilder getPongOrBuilder() {
                if (this.payloadCase_ == 6 && this.pongBuilder_ != null) {
                    return (EmptyOrBuilder) this.pongBuilder_.getMessageOrBuilder();
                }
                if (this.payloadCase_ == 6) {
                    return (Empty) this.payload_;
                }
                return Empty.getDefaultInstance();
            }

            private SingleFieldBuilderV3<Empty, com.google.protobuf.Empty.Builder, EmptyOrBuilder> getPongFieldBuilder() {
                if (this.pongBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = Empty.getDefaultInstance();
                    }
                    this.pongBuilder_ = new SingleFieldBuilderV3((Empty) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.pongBuilder_;
            }

            public TypingIndicator getTypingIndicator() {
                if (this.typingIndicatorBuilder_ == null) {
                    if (this.payloadCase_ == 7) {
                        return (TypingIndicator) this.payload_;
                    }
                    return TypingIndicator.getDefaultInstance();
                } else if (this.payloadCase_ == 7) {
                    return (TypingIndicator) this.typingIndicatorBuilder_.getMessage();
                } else {
                    return TypingIndicator.getDefaultInstance();
                }
            }

            public Builder setTypingIndicator(TypingIndicator typingIndicator) {
                if (this.typingIndicatorBuilder_ != null) {
                    this.typingIndicatorBuilder_.setMessage(typingIndicator);
                } else if (typingIndicator == null) {
                    throw new NullPointerException();
                } else {
                    this.payload_ = typingIndicator;
                    onChanged();
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setTypingIndicator(com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator.Builder builder) {
                if (this.typingIndicatorBuilder_ == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    this.typingIndicatorBuilder_.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeTypingIndicator(TypingIndicator typingIndicator) {
                if (this.typingIndicatorBuilder_ == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == TypingIndicator.getDefaultInstance()) {
                        this.payload_ = typingIndicator;
                    } else {
                        this.payload_ = TypingIndicator.newBuilder((TypingIndicator) this.payload_).mergeFrom(typingIndicator).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.payloadCase_ == 7) {
                        this.typingIndicatorBuilder_.mergeFrom(typingIndicator);
                    }
                    this.typingIndicatorBuilder_.setMessage(typingIndicator);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder clearTypingIndicator() {
                if (this.typingIndicatorBuilder_ != null) {
                    if (this.payloadCase_ == 7) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                    }
                    this.typingIndicatorBuilder_.clear();
                } else if (this.payloadCase_ == 7) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator.Builder getTypingIndicatorBuilder() {
                return (com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator.Builder) getTypingIndicatorFieldBuilder().getBuilder();
            }

            public TypingIndicatorOrBuilder getTypingIndicatorOrBuilder() {
                if (this.payloadCase_ == 7 && this.typingIndicatorBuilder_ != null) {
                    return (TypingIndicatorOrBuilder) this.typingIndicatorBuilder_.getMessageOrBuilder();
                }
                if (this.payloadCase_ == 7) {
                    return (TypingIndicator) this.payload_;
                }
                return TypingIndicator.getDefaultInstance();
            }

            private SingleFieldBuilderV3<TypingIndicator, com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator.Builder, TypingIndicatorOrBuilder> getTypingIndicatorFieldBuilder() {
                if (this.typingIndicatorBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = TypingIndicator.getDefaultInstance();
                    }
                    this.typingIndicatorBuilder_ = new SingleFieldBuilderV3((TypingIndicator) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.typingIndicatorBuilder_;
            }
        }

        private ClientData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = null;
            this.memoizedIsInitialized = (byte) -1;
        }

        private ClientData() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private ClientData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            Object obj = null;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        Builder builder = null;
                        if (readTag == 10) {
                            if (this.meta_ != null) {
                                builder = this.meta_.toBuilder();
                            }
                            this.meta_ = (Meta) codedInputStream.readMessage(Meta.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.meta_);
                                this.meta_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            Builder toBuilder;
                            if (this.error_ != null) {
                                toBuilder = this.error_.toBuilder();
                            }
                            this.error_ = (Error) codedInputStream.readMessage(Error.parser(), extensionRegistryLite);
                            if (toBuilder != null) {
                                toBuilder.mergeFrom(this.error_);
                                this.error_ = toBuilder.buildPartial();
                            }
                        } else if (readTag == 26) {
                            com.tinder.proto.keepalive.KeepAliveNudge.Nudge.Builder toBuilder2;
                            if (this.payloadCase_ == 3) {
                                toBuilder2 = ((Nudge) this.payload_).toBuilder();
                            }
                            this.payload_ = codedInputStream.readMessage(Nudge.parser(), extensionRegistryLite);
                            if (toBuilder2 != null) {
                                toBuilder2.mergeFrom((Nudge) this.payload_);
                                this.payload_ = toBuilder2.buildPartial();
                            }
                            this.payloadCase_ = 3;
                        } else if (readTag == 34) {
                            com.tinder.proto.keepalive.KeepAliveUpdate.Update.Builder toBuilder3;
                            if (this.payloadCase_ == 4) {
                                toBuilder3 = ((Update) this.payload_).toBuilder();
                            }
                            this.payload_ = codedInputStream.readMessage(Update.parser(), extensionRegistryLite);
                            if (toBuilder3 != null) {
                                toBuilder3.mergeFrom((Update) this.payload_);
                                this.payload_ = toBuilder3.buildPartial();
                            }
                            this.payloadCase_ = 4;
                        } else if (readTag == 42) {
                            if (this.payloadCase_ == 5) {
                                r4 = ((Empty) this.payload_).toBuilder();
                            }
                            this.payload_ = codedInputStream.readMessage(Empty.parser(), extensionRegistryLite);
                            if (r4 != null) {
                                r4.mergeFrom((Empty) this.payload_);
                                this.payload_ = r4.buildPartial();
                            }
                            this.payloadCase_ = 5;
                        } else if (readTag == 50) {
                            if (this.payloadCase_ == 6) {
                                r4 = ((Empty) this.payload_).toBuilder();
                            }
                            this.payload_ = codedInputStream.readMessage(Empty.parser(), extensionRegistryLite);
                            if (r4 != null) {
                                r4.mergeFrom((Empty) this.payload_);
                                this.payload_ = r4.buildPartial();
                            }
                            this.payloadCase_ = 6;
                        } else if (readTag == 58) {
                            com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator.Builder toBuilder4;
                            if (this.payloadCase_ == 7) {
                                toBuilder4 = ((TypingIndicator) this.payload_).toBuilder();
                            }
                            this.payload_ = codedInputStream.readMessage(TypingIndicator.parser(), extensionRegistryLite);
                            if (toBuilder4 != null) {
                                toBuilder4.mergeFrom((TypingIndicator) this.payload_);
                                this.payload_ = toBuilder4.buildPartial();
                            }
                            this.payloadCase_ = 7;
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
            return KeepAliveClientData.internal_static_keepalive_ClientData_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return KeepAliveClientData.internal_static_keepalive_ClientData_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientData.class, Builder.class);
        }

        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        public boolean hasMeta() {
            return this.meta_ != null;
        }

        public Meta getMeta() {
            return this.meta_ == null ? Meta.getDefaultInstance() : this.meta_;
        }

        public MetaOrBuilder getMetaOrBuilder() {
            return getMeta();
        }

        public boolean hasError() {
            return this.error_ != null;
        }

        public Error getError() {
            return this.error_ == null ? Error.getDefaultInstance() : this.error_;
        }

        public ErrorOrBuilder getErrorOrBuilder() {
            return getError();
        }

        public Nudge getNudge() {
            if (this.payloadCase_ == 3) {
                return (Nudge) this.payload_;
            }
            return Nudge.getDefaultInstance();
        }

        public NudgeOrBuilder getNudgeOrBuilder() {
            if (this.payloadCase_ == 3) {
                return (Nudge) this.payload_;
            }
            return Nudge.getDefaultInstance();
        }

        public Update getUpdate() {
            if (this.payloadCase_ == 4) {
                return (Update) this.payload_;
            }
            return Update.getDefaultInstance();
        }

        public UpdateOrBuilder getUpdateOrBuilder() {
            if (this.payloadCase_ == 4) {
                return (Update) this.payload_;
            }
            return Update.getDefaultInstance();
        }

        public Empty getPing() {
            if (this.payloadCase_ == 5) {
                return (Empty) this.payload_;
            }
            return Empty.getDefaultInstance();
        }

        public EmptyOrBuilder getPingOrBuilder() {
            if (this.payloadCase_ == 5) {
                return (Empty) this.payload_;
            }
            return Empty.getDefaultInstance();
        }

        public Empty getPong() {
            if (this.payloadCase_ == 6) {
                return (Empty) this.payload_;
            }
            return Empty.getDefaultInstance();
        }

        public EmptyOrBuilder getPongOrBuilder() {
            if (this.payloadCase_ == 6) {
                return (Empty) this.payload_;
            }
            return Empty.getDefaultInstance();
        }

        public TypingIndicator getTypingIndicator() {
            if (this.payloadCase_ == 7) {
                return (TypingIndicator) this.payload_;
            }
            return TypingIndicator.getDefaultInstance();
        }

        public TypingIndicatorOrBuilder getTypingIndicatorOrBuilder() {
            if (this.payloadCase_ == 7) {
                return (TypingIndicator) this.payload_;
            }
            return TypingIndicator.getDefaultInstance();
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
            if (this.meta_ != null) {
                codedOutputStream.writeMessage(1, getMeta());
            }
            if (this.error_ != null) {
                codedOutputStream.writeMessage(2, getError());
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (Nudge) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (Update) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (Empty) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (Empty) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (TypingIndicator) this.payload_);
            }
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if (this.meta_ != null) {
                i = 0 + CodedOutputStream.computeMessageSize(1, getMeta());
            }
            if (this.error_ != null) {
                i += CodedOutputStream.computeMessageSize(2, getError());
            }
            if (this.payloadCase_ == 3) {
                i += CodedOutputStream.computeMessageSize(3, (Nudge) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                i += CodedOutputStream.computeMessageSize(4, (Update) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                i += CodedOutputStream.computeMessageSize(5, (Empty) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                i += CodedOutputStream.computeMessageSize(6, (Empty) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                i += CodedOutputStream.computeMessageSize(7, (TypingIndicator) this.payload_);
            }
            this.memoizedSize = i;
            return i;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r5) {
            /*
            r4 = this;
            r0 = 1;
            if (r5 != r4) goto L_0x0004;
        L_0x0003:
            return r0;
        L_0x0004:
            r1 = r5 instanceof com.tinder.proto.keepalive.KeepAliveClientData.ClientData;
            if (r1 != 0) goto L_0x000d;
        L_0x0008:
            r5 = super.equals(r5);
            return r5;
        L_0x000d:
            r5 = (com.tinder.proto.keepalive.KeepAliveClientData.ClientData) r5;
            r1 = r4.hasMeta();
            r2 = r5.hasMeta();
            r3 = 0;
            if (r1 != r2) goto L_0x001c;
        L_0x001a:
            r1 = 1;
            goto L_0x001d;
        L_0x001c:
            r1 = 0;
        L_0x001d:
            r2 = r4.hasMeta();
            if (r2 == 0) goto L_0x0036;
        L_0x0023:
            if (r1 == 0) goto L_0x0035;
        L_0x0025:
            r1 = r4.getMeta();
            r2 = r5.getMeta();
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0035;
        L_0x0033:
            r1 = 1;
            goto L_0x0036;
        L_0x0035:
            r1 = 0;
        L_0x0036:
            if (r1 == 0) goto L_0x0044;
        L_0x0038:
            r1 = r4.hasError();
            r2 = r5.hasError();
            if (r1 != r2) goto L_0x0044;
        L_0x0042:
            r1 = 1;
            goto L_0x0045;
        L_0x0044:
            r1 = 0;
        L_0x0045:
            r2 = r4.hasError();
            if (r2 == 0) goto L_0x005e;
        L_0x004b:
            if (r1 == 0) goto L_0x005d;
        L_0x004d:
            r1 = r4.getError();
            r2 = r5.getError();
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x005d;
        L_0x005b:
            r1 = 1;
            goto L_0x005e;
        L_0x005d:
            r1 = 0;
        L_0x005e:
            if (r1 == 0) goto L_0x0070;
        L_0x0060:
            r1 = r4.getPayloadCase();
            r2 = r5.getPayloadCase();
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0070;
        L_0x006e:
            r1 = 1;
            goto L_0x0071;
        L_0x0070:
            r1 = 0;
        L_0x0071:
            if (r1 != 0) goto L_0x0074;
        L_0x0073:
            return r3;
        L_0x0074:
            r2 = r4.payloadCase_;
            switch(r2) {
                case 3: goto L_0x00c1;
                case 4: goto L_0x00b0;
                case 5: goto L_0x009f;
                case 6: goto L_0x008e;
                case 7: goto L_0x007a;
                default: goto L_0x0079;
            };
        L_0x0079:
            goto L_0x00d2;
        L_0x007a:
            if (r1 == 0) goto L_0x008c;
        L_0x007c:
            r1 = r4.getTypingIndicator();
            r5 = r5.getTypingIndicator();
            r5 = r1.equals(r5);
            if (r5 == 0) goto L_0x008c;
        L_0x008a:
            r1 = 1;
            goto L_0x00d2;
        L_0x008c:
            r1 = 0;
            goto L_0x00d2;
        L_0x008e:
            if (r1 == 0) goto L_0x008c;
        L_0x0090:
            r1 = r4.getPong();
            r5 = r5.getPong();
            r5 = r1.equals(r5);
            if (r5 == 0) goto L_0x008c;
        L_0x009e:
            goto L_0x008a;
        L_0x009f:
            if (r1 == 0) goto L_0x008c;
        L_0x00a1:
            r1 = r4.getPing();
            r5 = r5.getPing();
            r5 = r1.equals(r5);
            if (r5 == 0) goto L_0x008c;
        L_0x00af:
            goto L_0x008a;
        L_0x00b0:
            if (r1 == 0) goto L_0x008c;
        L_0x00b2:
            r1 = r4.getUpdate();
            r5 = r5.getUpdate();
            r5 = r1.equals(r5);
            if (r5 == 0) goto L_0x008c;
        L_0x00c0:
            goto L_0x008a;
        L_0x00c1:
            if (r1 == 0) goto L_0x008c;
        L_0x00c3:
            r1 = r4.getNudge();
            r5 = r5.getNudge();
            r5 = r1.equals(r5);
            if (r5 == 0) goto L_0x008c;
        L_0x00d1:
            goto L_0x008a;
        L_0x00d2:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.proto.keepalive.KeepAliveClientData.ClientData.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptorForType().hashCode();
            if (hasMeta()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getMeta().hashCode();
            }
            if (hasError()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getError().hashCode();
            }
            switch (this.payloadCase_) {
                case 3:
                    hashCode = (((hashCode * 37) + 3) * 53) + getNudge().hashCode();
                    break;
                case 4:
                    hashCode = (((hashCode * 37) + 4) * 53) + getUpdate().hashCode();
                    break;
                case 5:
                    hashCode = (((hashCode * 37) + 5) * 53) + getPing().hashCode();
                    break;
                case 6:
                    hashCode = (((hashCode * 37) + 6) * 53) + getPong().hashCode();
                    break;
                case 7:
                    hashCode = (((hashCode * 37) + 7) * 53) + getTypingIndicator().hashCode();
                    break;
                default:
                    break;
            }
            hashCode = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static ClientData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClientData) PARSER.parseFrom(byteString);
        }

        public static ClientData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientData) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ClientData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClientData) PARSER.parseFrom(bArr);
        }

        public static ClientData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientData) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ClientData parseFrom(InputStream inputStream) throws IOException {
            return (ClientData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ClientData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClientData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClientData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ClientData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClientData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClientData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ClientData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ClientData clientData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(clientData);
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

        public static ClientData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ClientData> parser() {
            return PARSER;
        }

        public Parser<ClientData> getParserForType() {
            return PARSER;
        }

        public ClientData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Error extends GeneratedMessageV3 implements ErrorOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final Error DEFAULT_INSTANCE = new Error();
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static final Parser<Error> PARSER = new C177911();
        private static final long serialVersionUID = 0;
        private int code_;
        private byte memoizedIsInitialized;
        private volatile Object message_;

        /* renamed from: com.tinder.proto.keepalive.KeepAliveClientData$Error$1 */
        static class C177911 extends AbstractParser<Error> {
            C177911() {
            }

            public Error parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Error(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements ErrorOrBuilder {
            private int code_;
            private Object message_;

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
                return KeepAliveClientData.internal_static_keepalive_Error_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return KeepAliveClientData.internal_static_keepalive_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
            }

            private Builder() {
                this.message_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.message_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                Error.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.code_ = 0;
                this.message_ = "";
                return this;
            }

            public Descriptor getDescriptorForType() {
                return KeepAliveClientData.internal_static_keepalive_Error_descriptor;
            }

            public Error getDefaultInstanceForType() {
                return Error.getDefaultInstance();
            }

            public Error build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Error buildPartial() {
                Error error = new Error((com.google.protobuf.GeneratedMessageV3.Builder) this);
                error.code_ = this.code_;
                error.message_ = this.message_;
                onBuilt();
                return error;
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
                if (message instanceof Error) {
                    return mergeFrom((Error) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Error error) {
                if (error == Error.getDefaultInstance()) {
                    return this;
                }
                if (error.getCode() != 0) {
                    setCode(error.getCode());
                }
                if (!error.getMessage().isEmpty()) {
                    this.message_ = error.message_;
                    onChanged();
                }
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Error error;
                Error error2 = null;
                try {
                    Error error3 = (Error) Error.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (error3 != null) {
                        mergeFrom(error3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    error = (Error) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    error2 = error;
                    if (error2 != null) {
                        mergeFrom(error2);
                    }
                    throw codedInputStream2;
                }
            }

            public int getCode() {
                return this.code_;
            }

            public Builder setCode(int i) {
                this.code_ = i;
                onChanged();
                return this;
            }

            public Builder clearCode() {
                this.code_ = 0;
                onChanged();
                return this;
            }

            public String getMessage() {
                Object obj = this.message_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String toStringUtf8 = ((ByteString) obj).toStringUtf8();
                this.message_ = toStringUtf8;
                return toStringUtf8;
            }

            public ByteString getMessageBytes() {
                Object obj = this.message_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.message_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setMessage(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.message_ = str;
                onChanged();
                return this;
            }

            public Builder clearMessage() {
                this.message_ = Error.getDefaultInstance().getMessage();
                onChanged();
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                Error.checkByteStringIsUtf8(byteString);
                this.message_ = byteString;
                onChanged();
                return this;
            }
        }

        private Error(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Error() {
            this.memoizedIsInitialized = (byte) -1;
            this.code_ = 0;
            this.message_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private Error(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite = null;
            while (extensionRegistryLite == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.code_ = codedInputStream.readInt32();
                        } else if (readTag == 18) {
                            this.message_ = codedInputStream.readStringRequireUtf8();
                        } else if (codedInputStream.skipField(readTag)) {
                        }
                    }
                    extensionRegistryLite = true;
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
            return KeepAliveClientData.internal_static_keepalive_Error_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return KeepAliveClientData.internal_static_keepalive_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
        }

        public int getCode() {
            return this.code_;
        }

        public String getMessage() {
            Object obj = this.message_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.message_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getMessageBytes() {
            Object obj = this.message_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.message_ = copyFromUtf8;
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
            if (this.code_ != 0) {
                codedOutputStream.writeInt32(1, this.code_);
            }
            if (!getMessageBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.message_);
            }
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if (this.code_ != 0) {
                i = 0 + CodedOutputStream.computeInt32Size(1, this.code_);
            }
            if (!getMessageBytes().isEmpty()) {
                i += GeneratedMessageV3.computeStringSize(2, this.message_);
            }
            this.memoizedSize = i;
            return i;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return super.equals(obj);
            }
            Error error = (Error) obj;
            if ((getCode() == error.getCode() ? 1 : null) == null || getMessage().equals(error.getMessage()) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + getCode()) * 37) + 2) * 53) + getMessage().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Error) PARSER.parseFrom(byteString);
        }

        public static Error parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Error) PARSER.parseFrom(bArr);
        }

        public static Error parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Error parseFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Error parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Error parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Error) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Error parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Error error) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
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

        public static Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Error> parser() {
            return PARSER;
        }

        public Parser<Error> getParserForType() {
            return PARSER;
        }

        public Error getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Meta extends GeneratedMessageV3 implements MetaOrBuilder {
        private static final Meta DEFAULT_INSTANCE = new Meta();
        private static final Parser<Meta> PARSER = new C177921();
        public static final int START_TIME_FIELD_NUMBER = 2;
        public static final int UPSTREAM_TIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private Timestamp startTime_;
        private Timestamp upstreamTime_;

        /* renamed from: com.tinder.proto.keepalive.KeepAliveClientData$Meta$1 */
        static class C177921 extends AbstractParser<Meta> {
            C177921() {
            }

            public Meta parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Meta(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements MetaOrBuilder {
            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> startTimeBuilder_;
            private Timestamp startTime_;
            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> upstreamTimeBuilder_;
            private Timestamp upstreamTime_;

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
                return KeepAliveClientData.internal_static_keepalive_Meta_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return KeepAliveClientData.internal_static_keepalive_Meta_fieldAccessorTable.ensureFieldAccessorsInitialized(Meta.class, Builder.class);
            }

            private Builder() {
                this.upstreamTime_ = null;
                this.startTime_ = null;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.upstreamTime_ = null;
                this.startTime_ = null;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                Meta.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                if (this.upstreamTimeBuilder_ == null) {
                    this.upstreamTime_ = null;
                } else {
                    this.upstreamTime_ = null;
                    this.upstreamTimeBuilder_ = null;
                }
                if (this.startTimeBuilder_ == null) {
                    this.startTime_ = null;
                } else {
                    this.startTime_ = null;
                    this.startTimeBuilder_ = null;
                }
                return this;
            }

            public Descriptor getDescriptorForType() {
                return KeepAliveClientData.internal_static_keepalive_Meta_descriptor;
            }

            public Meta getDefaultInstanceForType() {
                return Meta.getDefaultInstance();
            }

            public Meta build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Meta buildPartial() {
                Meta meta = new Meta((com.google.protobuf.GeneratedMessageV3.Builder) this);
                if (this.upstreamTimeBuilder_ == null) {
                    meta.upstreamTime_ = this.upstreamTime_;
                } else {
                    meta.upstreamTime_ = (Timestamp) this.upstreamTimeBuilder_.build();
                }
                if (this.startTimeBuilder_ == null) {
                    meta.startTime_ = this.startTime_;
                } else {
                    meta.startTime_ = (Timestamp) this.startTimeBuilder_.build();
                }
                onBuilt();
                return meta;
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
                if (message instanceof Meta) {
                    return mergeFrom((Meta) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Meta meta) {
                if (meta == Meta.getDefaultInstance()) {
                    return this;
                }
                if (meta.hasUpstreamTime()) {
                    mergeUpstreamTime(meta.getUpstreamTime());
                }
                if (meta.hasStartTime()) {
                    mergeStartTime(meta.getStartTime());
                }
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Meta meta;
                Meta meta2 = null;
                try {
                    Meta meta3 = (Meta) Meta.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (meta3 != null) {
                        mergeFrom(meta3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    meta = (Meta) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    meta2 = meta;
                    if (meta2 != null) {
                        mergeFrom(meta2);
                    }
                    throw codedInputStream2;
                }
            }

            public boolean hasUpstreamTime() {
                if (this.upstreamTimeBuilder_ == null) {
                    if (this.upstreamTime_ == null) {
                        return false;
                    }
                }
                return true;
            }

            public Timestamp getUpstreamTime() {
                if (this.upstreamTimeBuilder_ != null) {
                    return (Timestamp) this.upstreamTimeBuilder_.getMessage();
                }
                return this.upstreamTime_ == null ? Timestamp.getDefaultInstance() : this.upstreamTime_;
            }

            public Builder setUpstreamTime(Timestamp timestamp) {
                if (this.upstreamTimeBuilder_ != null) {
                    this.upstreamTimeBuilder_.setMessage(timestamp);
                } else if (timestamp == null) {
                    throw new NullPointerException();
                } else {
                    this.upstreamTime_ = timestamp;
                    onChanged();
                }
                return this;
            }

            public Builder setUpstreamTime(com.google.protobuf.Timestamp.Builder builder) {
                if (this.upstreamTimeBuilder_ == null) {
                    this.upstreamTime_ = builder.build();
                    onChanged();
                } else {
                    this.upstreamTimeBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeUpstreamTime(Timestamp timestamp) {
                if (this.upstreamTimeBuilder_ == null) {
                    if (this.upstreamTime_ != null) {
                        this.upstreamTime_ = Timestamp.newBuilder(this.upstreamTime_).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.upstreamTime_ = timestamp;
                    }
                    onChanged();
                } else {
                    this.upstreamTimeBuilder_.mergeFrom(timestamp);
                }
                return this;
            }

            public Builder clearUpstreamTime() {
                if (this.upstreamTimeBuilder_ == null) {
                    this.upstreamTime_ = null;
                    onChanged();
                } else {
                    this.upstreamTime_ = null;
                    this.upstreamTimeBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Timestamp.Builder getUpstreamTimeBuilder() {
                onChanged();
                return (com.google.protobuf.Timestamp.Builder) getUpstreamTimeFieldBuilder().getBuilder();
            }

            public TimestampOrBuilder getUpstreamTimeOrBuilder() {
                if (this.upstreamTimeBuilder_ != null) {
                    return (TimestampOrBuilder) this.upstreamTimeBuilder_.getMessageOrBuilder();
                }
                return this.upstreamTime_ == null ? Timestamp.getDefaultInstance() : this.upstreamTime_;
            }

            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> getUpstreamTimeFieldBuilder() {
                if (this.upstreamTimeBuilder_ == null) {
                    this.upstreamTimeBuilder_ = new SingleFieldBuilderV3(getUpstreamTime(), getParentForChildren(), isClean());
                    this.upstreamTime_ = null;
                }
                return this.upstreamTimeBuilder_;
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
        }

        private Meta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Meta() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private Meta(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            Object obj = null;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        com.google.protobuf.Timestamp.Builder builder = null;
                        if (readTag == 10) {
                            if (this.upstreamTime_ != null) {
                                builder = this.upstreamTime_.toBuilder();
                            }
                            this.upstreamTime_ = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.upstreamTime_);
                                this.upstreamTime_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            if (this.startTime_ != null) {
                                builder = this.startTime_.toBuilder();
                            }
                            this.startTime_ = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.startTime_);
                                this.startTime_ = builder.buildPartial();
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
            return KeepAliveClientData.internal_static_keepalive_Meta_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return KeepAliveClientData.internal_static_keepalive_Meta_fieldAccessorTable.ensureFieldAccessorsInitialized(Meta.class, Builder.class);
        }

        public boolean hasUpstreamTime() {
            return this.upstreamTime_ != null;
        }

        public Timestamp getUpstreamTime() {
            return this.upstreamTime_ == null ? Timestamp.getDefaultInstance() : this.upstreamTime_;
        }

        public TimestampOrBuilder getUpstreamTimeOrBuilder() {
            return getUpstreamTime();
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
            if (this.upstreamTime_ != null) {
                codedOutputStream.writeMessage(1, getUpstreamTime());
            }
            if (this.startTime_ != null) {
                codedOutputStream.writeMessage(2, getStartTime());
            }
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if (this.upstreamTime_ != null) {
                i = 0 + CodedOutputStream.computeMessageSize(1, getUpstreamTime());
            }
            if (this.startTime_ != null) {
                i += CodedOutputStream.computeMessageSize(2, getStartTime());
            }
            this.memoizedSize = i;
            return i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Meta)) {
                return super.equals(obj);
            }
            Meta meta = (Meta) obj;
            Object obj2 = hasUpstreamTime() == meta.hasUpstreamTime() ? 1 : null;
            if (hasUpstreamTime()) {
                obj2 = (obj2 == null || !getUpstreamTime().equals(meta.getUpstreamTime())) ? null : 1;
            }
            boolean z = obj2 != null && hasStartTime() == meta.hasStartTime();
            if (hasStartTime()) {
                z = z && getStartTime().equals(meta.getStartTime()) != null;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptorForType().hashCode();
            if (hasUpstreamTime()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getUpstreamTime().hashCode();
            }
            if (hasStartTime()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getStartTime().hashCode();
            }
            hashCode = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Meta parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Meta) PARSER.parseFrom(byteString);
        }

        public static Meta parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Meta) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Meta parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Meta) PARSER.parseFrom(bArr);
        }

        public static Meta parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Meta) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Meta parseFrom(InputStream inputStream) throws IOException {
            return (Meta) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Meta parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Meta) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Meta parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Meta) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Meta parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Meta) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Meta parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Meta) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Meta parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Meta) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Meta meta) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(meta);
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

        public static Meta getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Meta> parser() {
            return PARSER;
        }

        public Parser<Meta> getParserForType() {
            return PARSER;
        }

        public Meta getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private KeepAliveClientData() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TimestampProto.getDescriptor(), EmptyProto.getDescriptor(), KeepAliveNudge.getDescriptor(), KeepAliveUpdate.getDescriptor(), KeepAliveTypingIndicator.getDescriptor()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001akeepalive/ClientData.proto\u0012\tkeepalive\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u001bgoogle/protobuf/empty.proto\u001a\u0015keepalive/Nudge.proto\u001a\u0016keepalive/Update.proto\u001a\u001fkeepalive/TypingIndicator.proto\"§\u0002\n\nClientData\u0012\u001d\n\u0004meta\u0018\u0001 \u0001(\u000b2\u000f.keepalive.Meta\u0012\u001f\n\u0005error\u0018\u0002 \u0001(\u000b2\u0010.keepalive.Error\u0012!\n\u0005nudge\u0018\u0003 \u0001(\u000b2\u0010.keepalive.NudgeH\u0000\u0012#\n\u0006update\u0018\u0004 \u0001(\u000b2\u0011.keepalive.UpdateH\u0000\u0012&\n\u0004ping\u0018\u0005 \u0001(\u000b2\u0016.google.protobuf.EmptyH\u0000\u0012&\n\u0004pong\u0018\u0006 \u0001(\u000b2\u0016.google.prot", "obuf.EmptyH\u0000\u00126\n\u0010typing_indicator\u0018\u0007 \u0001(\u000b2\u001a.keepalive.TypingIndicatorH\u0000B\t\n\u0007payload\"i\n\u0004Meta\u00121\n\rupstream_time\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012.\n\nstart_time\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\"&\n\u0005Error\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0005\u0012\u000f\n\u0007message\u0018\u0002 \u0001(\tBW\n\u001acom.tinder.proto.keepaliveB\u0013KeepAliveClientDataZ$github.com/TinderApp/proto/keepaliveb\u0006proto3"}, fileDescriptorArr, new C162101());
        TimestampProto.getDescriptor();
        EmptyProto.getDescriptor();
        KeepAliveNudge.getDescriptor();
        KeepAliveUpdate.getDescriptor();
        KeepAliveTypingIndicator.getDescriptor();
    }
}
