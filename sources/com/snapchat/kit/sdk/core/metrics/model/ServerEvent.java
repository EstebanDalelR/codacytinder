package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.AbstractMessageLite;
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

public final class ServerEvent extends GeneratedMessageV3 implements ServerEventOrBuilder {
    public static final int APP_BUILD_FIELD_NUMBER = 15;
    public static final int APP_VERSION_FIELD_NUMBER = 14;
    public static final int CITY_FIELD_NUMBER = 7;
    public static final int COUNTRY_FIELD_NUMBER = 6;
    private static final ServerEvent DEFAULT_INSTANCE = new ServerEvent();
    public static final int EVENT_DATA_FIELD_NUMBER = 100;
    public static final int EVENT_ID_FIELD_NUMBER = 9;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    public static final int INSTANCE_ID_FIELD_NUMBER = 10;
    public static final int OS_TYPE_FIELD_NUMBER = 12;
    public static final int OS_VERSION_FIELD_NUMBER = 13;
    private static final Parser<ServerEvent> PARSER = new C79181();
    public static final int REGION_FIELD_NUMBER = 8;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int SEQUENCE_ID_FIELD_NUMBER = 11;
    public static final int SERVER_TS_FIELD_NUMBER = 3;
    public static final int USER_AGENT_FIELD_NUMBER = 5;
    public static final int USER_ID_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private volatile Object appBuild_;
    private volatile Object appVersion_;
    private volatile Object city_;
    private volatile Object country_;
    private ServerEventData eventData_;
    private volatile Object eventId_;
    private volatile Object eventName_;
    private volatile Object instanceId_;
    private byte memoizedIsInitialized;
    private volatile Object osType_;
    private volatile Object osVersion_;
    private volatile Object region_;
    private volatile Object requestId_;
    private long sequenceId_;
    private double serverTs_;
    private volatile Object userAgent_;
    private volatile Object userId_;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.ServerEvent$1 */
    static class C79181 extends AbstractParser<ServerEvent> {
        C79181() {
        }

        public ServerEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ServerEvent(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements ServerEventOrBuilder {
        private Object appBuild_;
        private Object appVersion_;
        private Object city_;
        private Object country_;
        private SingleFieldBuilderV3<ServerEventData, com.snapchat.kit.sdk.core.metrics.model.ServerEventData.Builder, ServerEventDataOrBuilder> eventDataBuilder_;
        private ServerEventData eventData_;
        private Object eventId_;
        private Object eventName_;
        private Object instanceId_;
        private Object osType_;
        private Object osVersion_;
        private Object region_;
        private Object requestId_;
        private long sequenceId_;
        private double serverTs_;
        private Object userAgent_;
        private Object userId_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21754x678ca14b;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21755xb8d74cc9.ensureFieldAccessorsInitialized(ServerEvent.class, Builder.class);
        }

        private Builder() {
            this.eventName_ = "";
            this.requestId_ = "";
            this.userId_ = "";
            this.userAgent_ = "";
            this.country_ = "";
            this.city_ = "";
            this.region_ = "";
            this.eventId_ = "";
            this.instanceId_ = "";
            this.osType_ = "";
            this.osVersion_ = "";
            this.appVersion_ = "";
            this.appBuild_ = "";
            this.eventData_ = null;
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.eventName_ = "";
            this.requestId_ = "";
            this.userId_ = "";
            this.userAgent_ = "";
            this.country_ = "";
            this.city_ = "";
            this.region_ = "";
            this.eventId_ = "";
            this.instanceId_ = "";
            this.osType_ = "";
            this.osVersion_ = "";
            this.appVersion_ = "";
            this.appBuild_ = "";
            this.eventData_ = null;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            ServerEvent.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.eventName_ = "";
            this.requestId_ = "";
            this.serverTs_ = 0.0d;
            this.userId_ = "";
            this.userAgent_ = "";
            this.country_ = "";
            this.city_ = "";
            this.region_ = "";
            this.eventId_ = "";
            this.instanceId_ = "";
            this.sequenceId_ = 0;
            this.osType_ = "";
            this.osVersion_ = "";
            this.appVersion_ = "";
            this.appBuild_ = "";
            if (this.eventDataBuilder_ == null) {
                this.eventData_ = null;
            } else {
                this.eventData_ = null;
                this.eventDataBuilder_ = null;
            }
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21754x678ca14b;
        }

        public ServerEvent getDefaultInstanceForType() {
            return ServerEvent.getDefaultInstance();
        }

        public ServerEvent build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public ServerEvent buildPartial() {
            ServerEvent serverEvent = new ServerEvent((com.google.protobuf.GeneratedMessageV3.Builder) this);
            serverEvent.eventName_ = this.eventName_;
            serverEvent.requestId_ = this.requestId_;
            serverEvent.serverTs_ = this.serverTs_;
            serverEvent.userId_ = this.userId_;
            serverEvent.userAgent_ = this.userAgent_;
            serverEvent.country_ = this.country_;
            serverEvent.city_ = this.city_;
            serverEvent.region_ = this.region_;
            serverEvent.eventId_ = this.eventId_;
            serverEvent.instanceId_ = this.instanceId_;
            serverEvent.sequenceId_ = this.sequenceId_;
            serverEvent.osType_ = this.osType_;
            serverEvent.osVersion_ = this.osVersion_;
            serverEvent.appVersion_ = this.appVersion_;
            serverEvent.appBuild_ = this.appBuild_;
            if (this.eventDataBuilder_ == null) {
                serverEvent.eventData_ = this.eventData_;
            } else {
                serverEvent.eventData_ = (ServerEventData) this.eventDataBuilder_.build();
            }
            onBuilt();
            return serverEvent;
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
            if (message instanceof ServerEvent) {
                return mergeFrom((ServerEvent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ServerEvent serverEvent) {
            if (serverEvent == ServerEvent.getDefaultInstance()) {
                return this;
            }
            if (!serverEvent.getEventName().isEmpty()) {
                this.eventName_ = serverEvent.eventName_;
                onChanged();
            }
            if (!serverEvent.getRequestId().isEmpty()) {
                this.requestId_ = serverEvent.requestId_;
                onChanged();
            }
            if (serverEvent.getServerTs() != 0.0d) {
                setServerTs(serverEvent.getServerTs());
            }
            if (!serverEvent.getUserId().isEmpty()) {
                this.userId_ = serverEvent.userId_;
                onChanged();
            }
            if (!serverEvent.getUserAgent().isEmpty()) {
                this.userAgent_ = serverEvent.userAgent_;
                onChanged();
            }
            if (!serverEvent.getCountry().isEmpty()) {
                this.country_ = serverEvent.country_;
                onChanged();
            }
            if (!serverEvent.getCity().isEmpty()) {
                this.city_ = serverEvent.city_;
                onChanged();
            }
            if (!serverEvent.getRegion().isEmpty()) {
                this.region_ = serverEvent.region_;
                onChanged();
            }
            if (!serverEvent.getEventId().isEmpty()) {
                this.eventId_ = serverEvent.eventId_;
                onChanged();
            }
            if (!serverEvent.getInstanceId().isEmpty()) {
                this.instanceId_ = serverEvent.instanceId_;
                onChanged();
            }
            if (serverEvent.getSequenceId() != 0) {
                setSequenceId(serverEvent.getSequenceId());
            }
            if (!serverEvent.getOsType().isEmpty()) {
                this.osType_ = serverEvent.osType_;
                onChanged();
            }
            if (!serverEvent.getOsVersion().isEmpty()) {
                this.osVersion_ = serverEvent.osVersion_;
                onChanged();
            }
            if (!serverEvent.getAppVersion().isEmpty()) {
                this.appVersion_ = serverEvent.appVersion_;
                onChanged();
            }
            if (!serverEvent.getAppBuild().isEmpty()) {
                this.appBuild_ = serverEvent.appBuild_;
                onChanged();
            }
            if (serverEvent.hasEventData()) {
                mergeEventData(serverEvent.getEventData());
            }
            mergeUnknownFields(serverEvent.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            ServerEvent serverEvent;
            ServerEvent serverEvent2 = null;
            try {
                ServerEvent serverEvent3 = (ServerEvent) ServerEvent.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (serverEvent3 != null) {
                    mergeFrom(serverEvent3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                serverEvent = (ServerEvent) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                serverEvent2 = serverEvent;
                if (serverEvent2 != null) {
                    mergeFrom(serverEvent2);
                }
                throw codedInputStream2;
            }
        }

        public String getEventName() {
            Object obj = this.eventName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.eventName_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getEventNameBytes() {
            Object obj = this.eventName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.eventName_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setEventName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.eventName_ = str;
            onChanged();
            return this;
        }

        public Builder clearEventName() {
            this.eventName_ = ServerEvent.getDefaultInstance().getEventName();
            onChanged();
            return this;
        }

        public Builder setEventNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.eventName_ = byteString;
            onChanged();
            return this;
        }

        public String getRequestId() {
            Object obj = this.requestId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.requestId_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getRequestIdBytes() {
            Object obj = this.requestId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.requestId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setRequestId(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.requestId_ = str;
            onChanged();
            return this;
        }

        public Builder clearRequestId() {
            this.requestId_ = ServerEvent.getDefaultInstance().getRequestId();
            onChanged();
            return this;
        }

        public Builder setRequestIdBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.requestId_ = byteString;
            onChanged();
            return this;
        }

        public double getServerTs() {
            return this.serverTs_;
        }

        public Builder setServerTs(double d) {
            this.serverTs_ = d;
            onChanged();
            return this;
        }

        public Builder clearServerTs() {
            this.serverTs_ = 0.0d;
            onChanged();
            return this;
        }

        public String getUserId() {
            Object obj = this.userId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userId_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setUserId(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.userId_ = str;
            onChanged();
            return this;
        }

        public Builder clearUserId() {
            this.userId_ = ServerEvent.getDefaultInstance().getUserId();
            onChanged();
            return this;
        }

        public Builder setUserIdBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString;
            onChanged();
            return this;
        }

        public String getUserAgent() {
            Object obj = this.userAgent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userAgent_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getUserAgentBytes() {
            Object obj = this.userAgent_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userAgent_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setUserAgent(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.userAgent_ = str;
            onChanged();
            return this;
        }

        public Builder clearUserAgent() {
            this.userAgent_ = ServerEvent.getDefaultInstance().getUserAgent();
            onChanged();
            return this;
        }

        public Builder setUserAgentBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.userAgent_ = byteString;
            onChanged();
            return this;
        }

        public String getCountry() {
            Object obj = this.country_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.country_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getCountryBytes() {
            Object obj = this.country_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.country_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setCountry(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.country_ = str;
            onChanged();
            return this;
        }

        public Builder clearCountry() {
            this.country_ = ServerEvent.getDefaultInstance().getCountry();
            onChanged();
            return this;
        }

        public Builder setCountryBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.country_ = byteString;
            onChanged();
            return this;
        }

        public String getCity() {
            Object obj = this.city_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.city_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getCityBytes() {
            Object obj = this.city_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.city_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setCity(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.city_ = str;
            onChanged();
            return this;
        }

        public Builder clearCity() {
            this.city_ = ServerEvent.getDefaultInstance().getCity();
            onChanged();
            return this;
        }

        public Builder setCityBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.city_ = byteString;
            onChanged();
            return this;
        }

        public String getRegion() {
            Object obj = this.region_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.region_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getRegionBytes() {
            Object obj = this.region_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.region_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setRegion(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.region_ = str;
            onChanged();
            return this;
        }

        public Builder clearRegion() {
            this.region_ = ServerEvent.getDefaultInstance().getRegion();
            onChanged();
            return this;
        }

        public Builder setRegionBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.region_ = byteString;
            onChanged();
            return this;
        }

        public String getEventId() {
            Object obj = this.eventId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.eventId_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getEventIdBytes() {
            Object obj = this.eventId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.eventId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setEventId(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.eventId_ = str;
            onChanged();
            return this;
        }

        public Builder clearEventId() {
            this.eventId_ = ServerEvent.getDefaultInstance().getEventId();
            onChanged();
            return this;
        }

        public Builder setEventIdBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.eventId_ = byteString;
            onChanged();
            return this;
        }

        public String getInstanceId() {
            Object obj = this.instanceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.instanceId_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getInstanceIdBytes() {
            Object obj = this.instanceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.instanceId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setInstanceId(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.instanceId_ = str;
            onChanged();
            return this;
        }

        public Builder clearInstanceId() {
            this.instanceId_ = ServerEvent.getDefaultInstance().getInstanceId();
            onChanged();
            return this;
        }

        public Builder setInstanceIdBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.instanceId_ = byteString;
            onChanged();
            return this;
        }

        public long getSequenceId() {
            return this.sequenceId_;
        }

        public Builder setSequenceId(long j) {
            this.sequenceId_ = j;
            onChanged();
            return this;
        }

        public Builder clearSequenceId() {
            this.sequenceId_ = 0;
            onChanged();
            return this;
        }

        public String getOsType() {
            Object obj = this.osType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osType_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getOsTypeBytes() {
            Object obj = this.osType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osType_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setOsType(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.osType_ = str;
            onChanged();
            return this;
        }

        public Builder clearOsType() {
            this.osType_ = ServerEvent.getDefaultInstance().getOsType();
            onChanged();
            return this;
        }

        public Builder setOsTypeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osType_ = byteString;
            onChanged();
            return this;
        }

        public String getOsVersion() {
            Object obj = this.osVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osVersion_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getOsVersionBytes() {
            Object obj = this.osVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osVersion_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setOsVersion(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.osVersion_ = str;
            onChanged();
            return this;
        }

        public Builder clearOsVersion() {
            this.osVersion_ = ServerEvent.getDefaultInstance().getOsVersion();
            onChanged();
            return this;
        }

        public Builder setOsVersionBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString;
            onChanged();
            return this;
        }

        public String getAppVersion() {
            Object obj = this.appVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appVersion_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getAppVersionBytes() {
            Object obj = this.appVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVersion_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setAppVersion(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.appVersion_ = str;
            onChanged();
            return this;
        }

        public Builder clearAppVersion() {
            this.appVersion_ = ServerEvent.getDefaultInstance().getAppVersion();
            onChanged();
            return this;
        }

        public Builder setAppVersionBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appVersion_ = byteString;
            onChanged();
            return this;
        }

        public String getAppBuild() {
            Object obj = this.appBuild_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appBuild_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getAppBuildBytes() {
            Object obj = this.appBuild_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appBuild_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setAppBuild(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.appBuild_ = str;
            onChanged();
            return this;
        }

        public Builder clearAppBuild() {
            this.appBuild_ = ServerEvent.getDefaultInstance().getAppBuild();
            onChanged();
            return this;
        }

        public Builder setAppBuildBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appBuild_ = byteString;
            onChanged();
            return this;
        }

        public boolean hasEventData() {
            if (this.eventDataBuilder_ == null) {
                if (this.eventData_ == null) {
                    return false;
                }
            }
            return true;
        }

        public ServerEventData getEventData() {
            if (this.eventDataBuilder_ != null) {
                return (ServerEventData) this.eventDataBuilder_.getMessage();
            }
            return this.eventData_ == null ? ServerEventData.getDefaultInstance() : this.eventData_;
        }

        public Builder setEventData(ServerEventData serverEventData) {
            if (this.eventDataBuilder_ != null) {
                this.eventDataBuilder_.setMessage(serverEventData);
            } else if (serverEventData == null) {
                throw new NullPointerException();
            } else {
                this.eventData_ = serverEventData;
                onChanged();
            }
            return this;
        }

        public Builder setEventData(com.snapchat.kit.sdk.core.metrics.model.ServerEventData.Builder builder) {
            if (this.eventDataBuilder_ == null) {
                this.eventData_ = builder.build();
                onChanged();
            } else {
                this.eventDataBuilder_.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeEventData(ServerEventData serverEventData) {
            if (this.eventDataBuilder_ == null) {
                if (this.eventData_ != null) {
                    this.eventData_ = ServerEventData.newBuilder(this.eventData_).mergeFrom(serverEventData).buildPartial();
                } else {
                    this.eventData_ = serverEventData;
                }
                onChanged();
            } else {
                this.eventDataBuilder_.mergeFrom(serverEventData);
            }
            return this;
        }

        public Builder clearEventData() {
            if (this.eventDataBuilder_ == null) {
                this.eventData_ = null;
                onChanged();
            } else {
                this.eventData_ = null;
                this.eventDataBuilder_ = null;
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.ServerEventData.Builder getEventDataBuilder() {
            onChanged();
            return (com.snapchat.kit.sdk.core.metrics.model.ServerEventData.Builder) getEventDataFieldBuilder().getBuilder();
        }

        public ServerEventDataOrBuilder getEventDataOrBuilder() {
            if (this.eventDataBuilder_ != null) {
                return (ServerEventDataOrBuilder) this.eventDataBuilder_.getMessageOrBuilder();
            }
            return this.eventData_ == null ? ServerEventData.getDefaultInstance() : this.eventData_;
        }

        private SingleFieldBuilderV3<ServerEventData, com.snapchat.kit.sdk.core.metrics.model.ServerEventData.Builder, ServerEventDataOrBuilder> getEventDataFieldBuilder() {
            if (this.eventDataBuilder_ == null) {
                this.eventDataBuilder_ = new SingleFieldBuilderV3(getEventData(), getParentForChildren(), isClean());
                this.eventData_ = null;
            }
            return this.eventDataBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private ServerEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private ServerEvent() {
        this.memoizedIsInitialized = (byte) -1;
        this.eventName_ = "";
        this.requestId_ = "";
        this.serverTs_ = 0.0d;
        this.userId_ = "";
        this.userAgent_ = "";
        this.country_ = "";
        this.city_ = "";
        this.region_ = "";
        this.eventId_ = "";
        this.instanceId_ = "";
        this.sequenceId_ = 0;
        this.osType_ = "";
        this.osVersion_ = "";
        this.appVersion_ = "";
        this.appBuild_ = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private ServerEvent(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        Object obj = null;
        while (obj == null) {
            try {
                int readTag = codedInputStream.readTag();
                switch (readTag) {
                    case 0:
                        obj = 1;
                        break;
                    case 10:
                        this.eventName_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 18:
                        this.requestId_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 25:
                        this.serverTs_ = codedInputStream.readDouble();
                        break;
                    case 34:
                        this.userId_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 42:
                        this.userAgent_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 50:
                        this.country_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 58:
                        this.city_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 66:
                        this.region_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 74:
                        this.eventId_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 82:
                        this.instanceId_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 88:
                        this.sequenceId_ = codedInputStream.readUInt64();
                        break;
                    case 98:
                        this.osType_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 106:
                        this.osVersion_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 114:
                        this.appVersion_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 122:
                        this.appBuild_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 802:
                        com.snapchat.kit.sdk.core.metrics.model.ServerEventData.Builder builder = null;
                        if (this.eventData_ != null) {
                            builder = this.eventData_.toBuilder();
                        }
                        this.eventData_ = (ServerEventData) codedInputStream.readMessage(ServerEventData.parser(), extensionRegistryLite);
                        if (builder == null) {
                            break;
                        }
                        builder.mergeFrom(this.eventData_);
                        this.eventData_ = builder.buildPartial();
                        break;
                    default:
                        if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            obj = 1;
                            break;
                        }
                        break;
                }
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
        return Event.f21754x678ca14b;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21755xb8d74cc9.ensureFieldAccessorsInitialized(ServerEvent.class, Builder.class);
    }

    public String getEventName() {
        Object obj = this.eventName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.eventName_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getEventNameBytes() {
        Object obj = this.eventName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.eventName_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getRequestId() {
        Object obj = this.requestId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.requestId_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getRequestIdBytes() {
        Object obj = this.requestId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.requestId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public double getServerTs() {
        return this.serverTs_;
    }

    public String getUserId() {
        Object obj = this.userId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.userId_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getUserIdBytes() {
        Object obj = this.userId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.userId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getUserAgent() {
        Object obj = this.userAgent_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.userAgent_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getUserAgentBytes() {
        Object obj = this.userAgent_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.userAgent_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getCountry() {
        Object obj = this.country_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.country_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getCountryBytes() {
        Object obj = this.country_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.country_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getCity() {
        Object obj = this.city_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.city_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getCityBytes() {
        Object obj = this.city_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.city_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getRegion() {
        Object obj = this.region_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.region_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getRegionBytes() {
        Object obj = this.region_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.region_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getEventId() {
        Object obj = this.eventId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.eventId_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getEventIdBytes() {
        Object obj = this.eventId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.eventId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getInstanceId() {
        Object obj = this.instanceId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.instanceId_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getInstanceIdBytes() {
        Object obj = this.instanceId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.instanceId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public long getSequenceId() {
        return this.sequenceId_;
    }

    public String getOsType() {
        Object obj = this.osType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.osType_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getOsTypeBytes() {
        Object obj = this.osType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.osType_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getOsVersion() {
        Object obj = this.osVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.osVersion_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getOsVersionBytes() {
        Object obj = this.osVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.osVersion_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getAppVersion() {
        Object obj = this.appVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appVersion_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getAppVersionBytes() {
        Object obj = this.appVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appVersion_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getAppBuild() {
        Object obj = this.appBuild_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appBuild_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getAppBuildBytes() {
        Object obj = this.appBuild_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appBuild_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean hasEventData() {
        return this.eventData_ != null;
    }

    public ServerEventData getEventData() {
        return this.eventData_ == null ? ServerEventData.getDefaultInstance() : this.eventData_;
    }

    public ServerEventDataOrBuilder getEventDataOrBuilder() {
        return getEventData();
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
        if (!getEventNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.eventName_);
        }
        if (!getRequestIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.requestId_);
        }
        if (this.serverTs_ != 0.0d) {
            codedOutputStream.writeDouble(3, this.serverTs_);
        }
        if (!getUserIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.userId_);
        }
        if (!getUserAgentBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.userAgent_);
        }
        if (!getCountryBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.country_);
        }
        if (!getCityBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.city_);
        }
        if (!getRegionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.region_);
        }
        if (!getEventIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.eventId_);
        }
        if (!getInstanceIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 10, this.instanceId_);
        }
        if (this.sequenceId_ != 0) {
            codedOutputStream.writeUInt64(11, this.sequenceId_);
        }
        if (!getOsTypeBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.osType_);
        }
        if (!getOsVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 13, this.osVersion_);
        }
        if (!getAppVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 14, this.appVersion_);
        }
        if (!getAppBuildBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 15, this.appBuild_);
        }
        if (this.eventData_ != null) {
            codedOutputStream.writeMessage(100, getEventData());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        i = 0;
        if (!getEventNameBytes().isEmpty()) {
            i = 0 + GeneratedMessageV3.computeStringSize(1, this.eventName_);
        }
        if (!getRequestIdBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(2, this.requestId_);
        }
        if (this.serverTs_ != 0.0d) {
            i += CodedOutputStream.computeDoubleSize(3, this.serverTs_);
        }
        if (!getUserIdBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(4, this.userId_);
        }
        if (!getUserAgentBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(5, this.userAgent_);
        }
        if (!getCountryBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(6, this.country_);
        }
        if (!getCityBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(7, this.city_);
        }
        if (!getRegionBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(8, this.region_);
        }
        if (!getEventIdBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(9, this.eventId_);
        }
        if (!getInstanceIdBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(10, this.instanceId_);
        }
        if (this.sequenceId_ != 0) {
            i += CodedOutputStream.computeUInt64Size(11, this.sequenceId_);
        }
        if (!getOsTypeBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(12, this.osType_);
        }
        if (!getOsVersionBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(13, this.osVersion_);
        }
        if (!getAppVersionBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(14, this.appVersion_);
        }
        if (!getAppBuildBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(15, this.appBuild_);
        }
        if (this.eventData_ != null) {
            i += CodedOutputStream.computeMessageSize(100, getEventData());
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
        if (!(obj instanceof ServerEvent)) {
            return super.equals(obj);
        }
        ServerEvent serverEvent = (ServerEvent) obj;
        Object obj2 = ((getEventName().equals(serverEvent.getEventName()) ? 1 : null) == null || !getRequestId().equals(serverEvent.getRequestId())) ? null : 1;
        obj2 = (obj2 == null || Double.doubleToLongBits(getServerTs()) != Double.doubleToLongBits(serverEvent.getServerTs())) ? null : 1;
        obj2 = (obj2 == null || !getUserId().equals(serverEvent.getUserId())) ? null : 1;
        obj2 = (obj2 == null || !getUserAgent().equals(serverEvent.getUserAgent())) ? null : 1;
        obj2 = (obj2 == null || !getCountry().equals(serverEvent.getCountry())) ? null : 1;
        obj2 = (obj2 == null || !getCity().equals(serverEvent.getCity())) ? null : 1;
        obj2 = (obj2 == null || !getRegion().equals(serverEvent.getRegion())) ? null : 1;
        obj2 = (obj2 == null || !getEventId().equals(serverEvent.getEventId())) ? null : 1;
        obj2 = (obj2 == null || !getInstanceId().equals(serverEvent.getInstanceId())) ? null : 1;
        obj2 = (obj2 == null || getSequenceId() != serverEvent.getSequenceId()) ? null : 1;
        obj2 = (obj2 == null || !getOsType().equals(serverEvent.getOsType())) ? null : 1;
        obj2 = (obj2 == null || !getOsVersion().equals(serverEvent.getOsVersion())) ? null : 1;
        obj2 = (obj2 == null || !getAppVersion().equals(serverEvent.getAppVersion())) ? null : 1;
        obj2 = (obj2 == null || !getAppBuild().equals(serverEvent.getAppBuild())) ? null : 1;
        obj2 = (obj2 == null || hasEventData() != serverEvent.hasEventData()) ? null : 1;
        if (hasEventData()) {
            obj2 = (obj2 == null || !getEventData().equals(serverEvent.getEventData())) ? null : 1;
        }
        if (obj2 == null || this.unknownFields.equals(serverEvent.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getEventName().hashCode()) * 37) + 2) * 53) + getRequestId().hashCode()) * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getServerTs()))) * 37) + 4) * 53) + getUserId().hashCode()) * 37) + 5) * 53) + getUserAgent().hashCode()) * 37) + 6) * 53) + getCountry().hashCode()) * 37) + 7) * 53) + getCity().hashCode()) * 37) + 8) * 53) + getRegion().hashCode()) * 37) + 9) * 53) + getEventId().hashCode()) * 37) + 10) * 53) + getInstanceId().hashCode()) * 37) + 11) * 53) + Internal.hashLong(getSequenceId())) * 37) + 12) * 53) + getOsType().hashCode()) * 37) + 13) * 53) + getOsVersion().hashCode()) * 37) + 14) * 53) + getAppVersion().hashCode()) * 37) + 15) * 53) + getAppBuild().hashCode();
        if (hasEventData()) {
            hashCode = (((hashCode * 37) + 100) * 53) + getEventData().hashCode();
        }
        hashCode = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static ServerEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ServerEvent) PARSER.parseFrom(byteBuffer);
    }

    public static ServerEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ServerEvent) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ServerEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ServerEvent) PARSER.parseFrom(byteString);
    }

    public static ServerEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ServerEvent) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ServerEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ServerEvent) PARSER.parseFrom(bArr);
    }

    public static ServerEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ServerEvent) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ServerEvent parseFrom(InputStream inputStream) throws IOException {
        return (ServerEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ServerEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServerEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ServerEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ServerEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ServerEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServerEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ServerEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ServerEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ServerEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServerEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ServerEvent serverEvent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(serverEvent);
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

    public static ServerEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ServerEvent> parser() {
        return PARSER;
    }

    public Parser<ServerEvent> getParserForType() {
        return PARSER;
    }

    public ServerEvent getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
