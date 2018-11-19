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
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class KitEventBase extends GeneratedMessageV3 implements KitEventBaseOrBuilder {
    private static final KitEventBase DEFAULT_INSTANCE = new KitEventBase();
    public static final int IP_ADDRESS_FIELD_NUMBER = 4;
    public static final int KIT_CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 8;
    public static final int KIT_USER_AGENT_FIELD_NUMBER = 3;
    public static final int KIT_VARIANT_FIELD_NUMBER = 6;
    public static final int KIT_VARIANT_VERSION_FIELD_NUMBER = 7;
    public static final int LOCALE_FIELD_NUMBER = 2;
    public static final int OAUTH_CLIENT_ID_FIELD_NUMBER = 1;
    public static final int OS_MINOR_VERSION_FIELD_NUMBER = 5;
    private static final Parser<KitEventBase> PARSER = new C79091();
    private static final long serialVersionUID = 0;
    private volatile Object ipAddress_;
    private long kitClientTimestampMillis_;
    private volatile Object kitUserAgent_;
    private volatile Object kitVariantVersion_;
    private int kitVariant_;
    private volatile Object locale_;
    private byte memoizedIsInitialized;
    private volatile Object oauthClientId_;
    private volatile Object osMinorVersion_;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.KitEventBase$1 */
    static class C79091 extends AbstractParser<KitEventBase> {
        C79091() {
        }

        public KitEventBase parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new KitEventBase(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements KitEventBaseOrBuilder {
        private Object ipAddress_;
        private long kitClientTimestampMillis_;
        private Object kitUserAgent_;
        private Object kitVariantVersion_;
        private int kitVariant_;
        private Object locale_;
        private Object oauthClientId_;
        private Object osMinorVersion_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return Event.f21742xe4340465;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Event.f21743x245ef5e3.ensureFieldAccessorsInitialized(KitEventBase.class, Builder.class);
        }

        private Builder() {
            this.oauthClientId_ = "";
            this.locale_ = "";
            this.kitUserAgent_ = "";
            this.ipAddress_ = "";
            this.osMinorVersion_ = "";
            this.kitVariant_ = 0;
            this.kitVariantVersion_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.oauthClientId_ = "";
            this.locale_ = "";
            this.kitUserAgent_ = "";
            this.ipAddress_ = "";
            this.osMinorVersion_ = "";
            this.kitVariant_ = null;
            this.kitVariantVersion_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            KitEventBase.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.oauthClientId_ = "";
            this.locale_ = "";
            this.kitUserAgent_ = "";
            this.ipAddress_ = "";
            this.osMinorVersion_ = "";
            this.kitVariant_ = 0;
            this.kitVariantVersion_ = "";
            this.kitClientTimestampMillis_ = 0;
            return this;
        }

        public Descriptor getDescriptorForType() {
            return Event.f21742xe4340465;
        }

        public KitEventBase getDefaultInstanceForType() {
            return KitEventBase.getDefaultInstance();
        }

        public KitEventBase build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public KitEventBase buildPartial() {
            KitEventBase kitEventBase = new KitEventBase((com.google.protobuf.GeneratedMessageV3.Builder) this);
            kitEventBase.oauthClientId_ = this.oauthClientId_;
            kitEventBase.locale_ = this.locale_;
            kitEventBase.kitUserAgent_ = this.kitUserAgent_;
            kitEventBase.ipAddress_ = this.ipAddress_;
            kitEventBase.osMinorVersion_ = this.osMinorVersion_;
            kitEventBase.kitVariant_ = this.kitVariant_;
            kitEventBase.kitVariantVersion_ = this.kitVariantVersion_;
            kitEventBase.kitClientTimestampMillis_ = this.kitClientTimestampMillis_;
            onBuilt();
            return kitEventBase;
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
            if (message instanceof KitEventBase) {
                return mergeFrom((KitEventBase) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(KitEventBase kitEventBase) {
            if (kitEventBase == KitEventBase.getDefaultInstance()) {
                return this;
            }
            if (!kitEventBase.getOauthClientId().isEmpty()) {
                this.oauthClientId_ = kitEventBase.oauthClientId_;
                onChanged();
            }
            if (!kitEventBase.getLocale().isEmpty()) {
                this.locale_ = kitEventBase.locale_;
                onChanged();
            }
            if (!kitEventBase.getKitUserAgent().isEmpty()) {
                this.kitUserAgent_ = kitEventBase.kitUserAgent_;
                onChanged();
            }
            if (!kitEventBase.getIpAddress().isEmpty()) {
                this.ipAddress_ = kitEventBase.ipAddress_;
                onChanged();
            }
            if (!kitEventBase.getOsMinorVersion().isEmpty()) {
                this.osMinorVersion_ = kitEventBase.osMinorVersion_;
                onChanged();
            }
            if (kitEventBase.kitVariant_ != 0) {
                setKitVariantValue(kitEventBase.getKitVariantValue());
            }
            if (!kitEventBase.getKitVariantVersion().isEmpty()) {
                this.kitVariantVersion_ = kitEventBase.kitVariantVersion_;
                onChanged();
            }
            if (kitEventBase.getKitClientTimestampMillis() != 0) {
                setKitClientTimestampMillis(kitEventBase.getKitClientTimestampMillis());
            }
            mergeUnknownFields(kitEventBase.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            KitEventBase kitEventBase;
            KitEventBase kitEventBase2 = null;
            try {
                KitEventBase kitEventBase3 = (KitEventBase) KitEventBase.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (kitEventBase3 != null) {
                    mergeFrom(kitEventBase3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                kitEventBase = (KitEventBase) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                kitEventBase2 = kitEventBase;
                if (kitEventBase2 != null) {
                    mergeFrom(kitEventBase2);
                }
                throw codedInputStream2;
            }
        }

        public String getOauthClientId() {
            Object obj = this.oauthClientId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.oauthClientId_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getOauthClientIdBytes() {
            Object obj = this.oauthClientId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.oauthClientId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setOauthClientId(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.oauthClientId_ = str;
            onChanged();
            return this;
        }

        public Builder clearOauthClientId() {
            this.oauthClientId_ = KitEventBase.getDefaultInstance().getOauthClientId();
            onChanged();
            return this;
        }

        public Builder setOauthClientIdBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.oauthClientId_ = byteString;
            onChanged();
            return this;
        }

        public String getLocale() {
            Object obj = this.locale_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.locale_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getLocaleBytes() {
            Object obj = this.locale_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.locale_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setLocale(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.locale_ = str;
            onChanged();
            return this;
        }

        public Builder clearLocale() {
            this.locale_ = KitEventBase.getDefaultInstance().getLocale();
            onChanged();
            return this;
        }

        public Builder setLocaleBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.locale_ = byteString;
            onChanged();
            return this;
        }

        public String getKitUserAgent() {
            Object obj = this.kitUserAgent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.kitUserAgent_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getKitUserAgentBytes() {
            Object obj = this.kitUserAgent_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.kitUserAgent_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setKitUserAgent(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.kitUserAgent_ = str;
            onChanged();
            return this;
        }

        public Builder clearKitUserAgent() {
            this.kitUserAgent_ = KitEventBase.getDefaultInstance().getKitUserAgent();
            onChanged();
            return this;
        }

        public Builder setKitUserAgentBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.kitUserAgent_ = byteString;
            onChanged();
            return this;
        }

        public String getIpAddress() {
            Object obj = this.ipAddress_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ipAddress_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getIpAddressBytes() {
            Object obj = this.ipAddress_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ipAddress_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setIpAddress(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.ipAddress_ = str;
            onChanged();
            return this;
        }

        public Builder clearIpAddress() {
            this.ipAddress_ = KitEventBase.getDefaultInstance().getIpAddress();
            onChanged();
            return this;
        }

        public Builder setIpAddressBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.ipAddress_ = byteString;
            onChanged();
            return this;
        }

        public String getOsMinorVersion() {
            Object obj = this.osMinorVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osMinorVersion_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getOsMinorVersionBytes() {
            Object obj = this.osMinorVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osMinorVersion_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setOsMinorVersion(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.osMinorVersion_ = str;
            onChanged();
            return this;
        }

        public Builder clearOsMinorVersion() {
            this.osMinorVersion_ = KitEventBase.getDefaultInstance().getOsMinorVersion();
            onChanged();
            return this;
        }

        public Builder setOsMinorVersionBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osMinorVersion_ = byteString;
            onChanged();
            return this;
        }

        public int getKitVariantValue() {
            return this.kitVariant_;
        }

        public Builder setKitVariantValue(int i) {
            this.kitVariant_ = i;
            onChanged();
            return this;
        }

        public KitType getKitVariant() {
            KitType valueOf = KitType.valueOf(this.kitVariant_);
            return valueOf == null ? KitType.UNRECOGNIZED : valueOf;
        }

        public Builder setKitVariant(KitType kitType) {
            if (kitType == null) {
                throw new NullPointerException();
            }
            this.kitVariant_ = kitType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearKitVariant() {
            this.kitVariant_ = 0;
            onChanged();
            return this;
        }

        public String getKitVariantVersion() {
            Object obj = this.kitVariantVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.kitVariantVersion_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getKitVariantVersionBytes() {
            Object obj = this.kitVariantVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.kitVariantVersion_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setKitVariantVersion(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.kitVariantVersion_ = str;
            onChanged();
            return this;
        }

        public Builder clearKitVariantVersion() {
            this.kitVariantVersion_ = KitEventBase.getDefaultInstance().getKitVariantVersion();
            onChanged();
            return this;
        }

        public Builder setKitVariantVersionBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.kitVariantVersion_ = byteString;
            onChanged();
            return this;
        }

        public long getKitClientTimestampMillis() {
            return this.kitClientTimestampMillis_;
        }

        public Builder setKitClientTimestampMillis(long j) {
            this.kitClientTimestampMillis_ = j;
            onChanged();
            return this;
        }

        public Builder clearKitClientTimestampMillis() {
            this.kitClientTimestampMillis_ = 0;
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

    private KitEventBase(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private KitEventBase() {
        this.memoizedIsInitialized = (byte) -1;
        this.oauthClientId_ = "";
        this.locale_ = "";
        this.kitUserAgent_ = "";
        this.ipAddress_ = "";
        this.osMinorVersion_ = "";
        this.kitVariant_ = 0;
        this.kitVariantVersion_ = "";
        this.kitClientTimestampMillis_ = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private KitEventBase(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        this.oauthClientId_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 18) {
                        this.locale_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 26) {
                        this.kitUserAgent_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 34) {
                        this.ipAddress_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 42) {
                        this.osMinorVersion_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 48) {
                        this.kitVariant_ = codedInputStream.readEnum();
                    } else if (readTag == 58) {
                        this.kitVariantVersion_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 64) {
                        this.kitClientTimestampMillis_ = codedInputStream.readUInt64();
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
        return Event.f21742xe4340465;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Event.f21743x245ef5e3.ensureFieldAccessorsInitialized(KitEventBase.class, Builder.class);
    }

    public String getOauthClientId() {
        Object obj = this.oauthClientId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.oauthClientId_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getOauthClientIdBytes() {
        Object obj = this.oauthClientId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.oauthClientId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getLocale() {
        Object obj = this.locale_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.locale_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getLocaleBytes() {
        Object obj = this.locale_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.locale_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getKitUserAgent() {
        Object obj = this.kitUserAgent_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.kitUserAgent_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getKitUserAgentBytes() {
        Object obj = this.kitUserAgent_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.kitUserAgent_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getIpAddress() {
        Object obj = this.ipAddress_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ipAddress_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getIpAddressBytes() {
        Object obj = this.ipAddress_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ipAddress_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getOsMinorVersion() {
        Object obj = this.osMinorVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.osMinorVersion_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getOsMinorVersionBytes() {
        Object obj = this.osMinorVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.osMinorVersion_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getKitVariantValue() {
        return this.kitVariant_;
    }

    public KitType getKitVariant() {
        KitType valueOf = KitType.valueOf(this.kitVariant_);
        return valueOf == null ? KitType.UNRECOGNIZED : valueOf;
    }

    public String getKitVariantVersion() {
        Object obj = this.kitVariantVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String toStringUtf8 = ((ByteString) obj).toStringUtf8();
        this.kitVariantVersion_ = toStringUtf8;
        return toStringUtf8;
    }

    public ByteString getKitVariantVersionBytes() {
        Object obj = this.kitVariantVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.kitVariantVersion_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public long getKitClientTimestampMillis() {
        return this.kitClientTimestampMillis_;
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
        if (!getOauthClientIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.oauthClientId_);
        }
        if (!getLocaleBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.locale_);
        }
        if (!getKitUserAgentBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.kitUserAgent_);
        }
        if (!getIpAddressBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.ipAddress_);
        }
        if (!getOsMinorVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.osMinorVersion_);
        }
        if (this.kitVariant_ != KitType.UNKNOWN_KIT_TYPE.getNumber()) {
            codedOutputStream.writeEnum(6, this.kitVariant_);
        }
        if (!getKitVariantVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.kitVariantVersion_);
        }
        if (this.kitClientTimestampMillis_ != 0) {
            codedOutputStream.writeUInt64(8, this.kitClientTimestampMillis_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        i = 0;
        if (!getOauthClientIdBytes().isEmpty()) {
            i = 0 + GeneratedMessageV3.computeStringSize(1, this.oauthClientId_);
        }
        if (!getLocaleBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(2, this.locale_);
        }
        if (!getKitUserAgentBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(3, this.kitUserAgent_);
        }
        if (!getIpAddressBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(4, this.ipAddress_);
        }
        if (!getOsMinorVersionBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(5, this.osMinorVersion_);
        }
        if (this.kitVariant_ != KitType.UNKNOWN_KIT_TYPE.getNumber()) {
            i += CodedOutputStream.computeEnumSize(6, this.kitVariant_);
        }
        if (!getKitVariantVersionBytes().isEmpty()) {
            i += GeneratedMessageV3.computeStringSize(7, this.kitVariantVersion_);
        }
        if (this.kitClientTimestampMillis_ != 0) {
            i += CodedOutputStream.computeUInt64Size(8, this.kitClientTimestampMillis_);
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
        if (!(obj instanceof KitEventBase)) {
            return super.equals(obj);
        }
        KitEventBase kitEventBase = (KitEventBase) obj;
        Object obj2 = ((getOauthClientId().equals(kitEventBase.getOauthClientId()) ? 1 : null) == null || !getLocale().equals(kitEventBase.getLocale())) ? null : 1;
        obj2 = (obj2 == null || !getKitUserAgent().equals(kitEventBase.getKitUserAgent())) ? null : 1;
        obj2 = (obj2 == null || !getIpAddress().equals(kitEventBase.getIpAddress())) ? null : 1;
        obj2 = (obj2 == null || !getOsMinorVersion().equals(kitEventBase.getOsMinorVersion())) ? null : 1;
        obj2 = (obj2 == null || this.kitVariant_ != kitEventBase.kitVariant_) ? null : 1;
        obj2 = (obj2 == null || !getKitVariantVersion().equals(kitEventBase.getKitVariantVersion())) ? null : 1;
        obj2 = (obj2 == null || getKitClientTimestampMillis() != kitEventBase.getKitClientTimestampMillis()) ? null : 1;
        if (obj2 == null || this.unknownFields.equals(kitEventBase.unknownFields) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getOauthClientId().hashCode()) * 37) + 2) * 53) + getLocale().hashCode()) * 37) + 3) * 53) + getKitUserAgent().hashCode()) * 37) + 4) * 53) + getIpAddress().hashCode()) * 37) + 5) * 53) + getOsMinorVersion().hashCode()) * 37) + 6) * 53) + this.kitVariant_) * 37) + 7) * 53) + getKitVariantVersion().hashCode()) * 37) + 8) * 53) + Internal.hashLong(getKitClientTimestampMillis())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static KitEventBase parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KitEventBase) PARSER.parseFrom(byteBuffer);
    }

    public static KitEventBase parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KitEventBase) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static KitEventBase parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KitEventBase) PARSER.parseFrom(byteString);
    }

    public static KitEventBase parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KitEventBase) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static KitEventBase parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KitEventBase) PARSER.parseFrom(bArr);
    }

    public static KitEventBase parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KitEventBase) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static KitEventBase parseFrom(InputStream inputStream) throws IOException {
        return (KitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static KitEventBase parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static KitEventBase parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KitEventBase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static KitEventBase parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KitEventBase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static KitEventBase parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static KitEventBase parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KitEventBase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(KitEventBase kitEventBase) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(kitEventBase);
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

    public static KitEventBase getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<KitEventBase> parser() {
        return PARSER;
    }

    public Parser<KitEventBase> getParserForType() {
        return PARSER;
    }

    public KitEventBase getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
