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

public final class KeepAliveTypingIndicator {
    private static FileDescriptor descriptor;
    private static final Descriptor internal_static_keepalive_TypingIndicator_descriptor = ((Descriptor) getDescriptor().getMessageTypes().get(0));
    private static final FieldAccessorTable internal_static_keepalive_TypingIndicator_fieldAccessorTable = new FieldAccessorTable(internal_static_keepalive_TypingIndicator_descriptor, new String[]{"SentTime", "MatchId", "ToUserId"});

    /* renamed from: com.tinder.proto.keepalive.KeepAliveTypingIndicator$1 */
    static class C162131 implements InternalDescriptorAssigner {
        C162131() {
        }

        public ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor) {
            KeepAliveTypingIndicator.descriptor = fileDescriptor;
            return null;
        }
    }

    public interface TypingIndicatorOrBuilder extends MessageOrBuilder {
        String getMatchId();

        ByteString getMatchIdBytes();

        Timestamp getSentTime();

        TimestampOrBuilder getSentTimeOrBuilder();

        String getToUserId();

        ByteString getToUserIdBytes();

        boolean hasSentTime();
    }

    public static final class TypingIndicator extends GeneratedMessageV3 implements TypingIndicatorOrBuilder {
        private static final TypingIndicator DEFAULT_INSTANCE = new TypingIndicator();
        public static final int MATCH_ID_FIELD_NUMBER = 2;
        private static final Parser<TypingIndicator> PARSER = new C177941();
        public static final int SENT_TIME_FIELD_NUMBER = 1;
        public static final int TO_USER_ID_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object matchId_;
        private byte memoizedIsInitialized;
        private Timestamp sentTime_;
        private volatile Object toUserId_;

        /* renamed from: com.tinder.proto.keepalive.KeepAliveTypingIndicator$TypingIndicator$1 */
        static class C177941 extends AbstractParser<TypingIndicator> {
            C177941() {
            }

            public TypingIndicator parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypingIndicator(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements TypingIndicatorOrBuilder {
            private Object matchId_;
            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> sentTimeBuilder_;
            private Timestamp sentTime_;
            private Object toUserId_;

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
                return KeepAliveTypingIndicator.internal_static_keepalive_TypingIndicator_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return KeepAliveTypingIndicator.internal_static_keepalive_TypingIndicator_fieldAccessorTable.ensureFieldAccessorsInitialized(TypingIndicator.class, Builder.class);
            }

            private Builder() {
                this.sentTime_ = null;
                this.matchId_ = "";
                this.toUserId_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.sentTime_ = null;
                this.matchId_ = "";
                this.toUserId_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                TypingIndicator.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                if (this.sentTimeBuilder_ == null) {
                    this.sentTime_ = null;
                } else {
                    this.sentTime_ = null;
                    this.sentTimeBuilder_ = null;
                }
                this.matchId_ = "";
                this.toUserId_ = "";
                return this;
            }

            public Descriptor getDescriptorForType() {
                return KeepAliveTypingIndicator.internal_static_keepalive_TypingIndicator_descriptor;
            }

            public TypingIndicator getDefaultInstanceForType() {
                return TypingIndicator.getDefaultInstance();
            }

            public TypingIndicator build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public TypingIndicator buildPartial() {
                TypingIndicator typingIndicator = new TypingIndicator((com.google.protobuf.GeneratedMessageV3.Builder) this);
                if (this.sentTimeBuilder_ == null) {
                    typingIndicator.sentTime_ = this.sentTime_;
                } else {
                    typingIndicator.sentTime_ = (Timestamp) this.sentTimeBuilder_.build();
                }
                typingIndicator.matchId_ = this.matchId_;
                typingIndicator.toUserId_ = this.toUserId_;
                onBuilt();
                return typingIndicator;
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
                if (message instanceof TypingIndicator) {
                    return mergeFrom((TypingIndicator) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TypingIndicator typingIndicator) {
                if (typingIndicator == TypingIndicator.getDefaultInstance()) {
                    return this;
                }
                if (typingIndicator.hasSentTime()) {
                    mergeSentTime(typingIndicator.getSentTime());
                }
                if (!typingIndicator.getMatchId().isEmpty()) {
                    this.matchId_ = typingIndicator.matchId_;
                    onChanged();
                }
                if (!typingIndicator.getToUserId().isEmpty()) {
                    this.toUserId_ = typingIndicator.toUserId_;
                    onChanged();
                }
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                TypingIndicator typingIndicator;
                TypingIndicator typingIndicator2 = null;
                try {
                    TypingIndicator typingIndicator3 = (TypingIndicator) TypingIndicator.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (typingIndicator3 != null) {
                        mergeFrom(typingIndicator3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    typingIndicator = (TypingIndicator) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    typingIndicator2 = typingIndicator;
                    if (typingIndicator2 != null) {
                        mergeFrom(typingIndicator2);
                    }
                    throw codedInputStream2;
                }
            }

            public boolean hasSentTime() {
                if (this.sentTimeBuilder_ == null) {
                    if (this.sentTime_ == null) {
                        return false;
                    }
                }
                return true;
            }

            public Timestamp getSentTime() {
                if (this.sentTimeBuilder_ != null) {
                    return (Timestamp) this.sentTimeBuilder_.getMessage();
                }
                return this.sentTime_ == null ? Timestamp.getDefaultInstance() : this.sentTime_;
            }

            public Builder setSentTime(Timestamp timestamp) {
                if (this.sentTimeBuilder_ != null) {
                    this.sentTimeBuilder_.setMessage(timestamp);
                } else if (timestamp == null) {
                    throw new NullPointerException();
                } else {
                    this.sentTime_ = timestamp;
                    onChanged();
                }
                return this;
            }

            public Builder setSentTime(com.google.protobuf.Timestamp.Builder builder) {
                if (this.sentTimeBuilder_ == null) {
                    this.sentTime_ = builder.build();
                    onChanged();
                } else {
                    this.sentTimeBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeSentTime(Timestamp timestamp) {
                if (this.sentTimeBuilder_ == null) {
                    if (this.sentTime_ != null) {
                        this.sentTime_ = Timestamp.newBuilder(this.sentTime_).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.sentTime_ = timestamp;
                    }
                    onChanged();
                } else {
                    this.sentTimeBuilder_.mergeFrom(timestamp);
                }
                return this;
            }

            public Builder clearSentTime() {
                if (this.sentTimeBuilder_ == null) {
                    this.sentTime_ = null;
                    onChanged();
                } else {
                    this.sentTime_ = null;
                    this.sentTimeBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Timestamp.Builder getSentTimeBuilder() {
                onChanged();
                return (com.google.protobuf.Timestamp.Builder) getSentTimeFieldBuilder().getBuilder();
            }

            public TimestampOrBuilder getSentTimeOrBuilder() {
                if (this.sentTimeBuilder_ != null) {
                    return (TimestampOrBuilder) this.sentTimeBuilder_.getMessageOrBuilder();
                }
                return this.sentTime_ == null ? Timestamp.getDefaultInstance() : this.sentTime_;
            }

            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> getSentTimeFieldBuilder() {
                if (this.sentTimeBuilder_ == null) {
                    this.sentTimeBuilder_ = new SingleFieldBuilderV3(getSentTime(), getParentForChildren(), isClean());
                    this.sentTime_ = null;
                }
                return this.sentTimeBuilder_;
            }

            public String getMatchId() {
                Object obj = this.matchId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String toStringUtf8 = ((ByteString) obj).toStringUtf8();
                this.matchId_ = toStringUtf8;
                return toStringUtf8;
            }

            public ByteString getMatchIdBytes() {
                Object obj = this.matchId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.matchId_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setMatchId(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.matchId_ = str;
                onChanged();
                return this;
            }

            public Builder clearMatchId() {
                this.matchId_ = TypingIndicator.getDefaultInstance().getMatchId();
                onChanged();
                return this;
            }

            public Builder setMatchIdBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                TypingIndicator.checkByteStringIsUtf8(byteString);
                this.matchId_ = byteString;
                onChanged();
                return this;
            }

            public String getToUserId() {
                Object obj = this.toUserId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String toStringUtf8 = ((ByteString) obj).toStringUtf8();
                this.toUserId_ = toStringUtf8;
                return toStringUtf8;
            }

            public ByteString getToUserIdBytes() {
                Object obj = this.toUserId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.toUserId_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setToUserId(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.toUserId_ = str;
                onChanged();
                return this;
            }

            public Builder clearToUserId() {
                this.toUserId_ = TypingIndicator.getDefaultInstance().getToUserId();
                onChanged();
                return this;
            }

            public Builder setToUserIdBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                TypingIndicator.checkByteStringIsUtf8(byteString);
                this.toUserId_ = byteString;
                onChanged();
                return this;
            }
        }

        private TypingIndicator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private TypingIndicator() {
            this.memoizedIsInitialized = (byte) -1;
            this.matchId_ = "";
            this.toUserId_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private TypingIndicator(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            Object obj = null;
            while (obj == null) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            com.google.protobuf.Timestamp.Builder builder = null;
                            if (this.sentTime_ != null) {
                                builder = this.sentTime_.toBuilder();
                            }
                            this.sentTime_ = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.sentTime_);
                                this.sentTime_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            this.matchId_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 26) {
                            this.toUserId_ = codedInputStream.readStringRequireUtf8();
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
            return KeepAliveTypingIndicator.internal_static_keepalive_TypingIndicator_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return KeepAliveTypingIndicator.internal_static_keepalive_TypingIndicator_fieldAccessorTable.ensureFieldAccessorsInitialized(TypingIndicator.class, Builder.class);
        }

        public boolean hasSentTime() {
            return this.sentTime_ != null;
        }

        public Timestamp getSentTime() {
            return this.sentTime_ == null ? Timestamp.getDefaultInstance() : this.sentTime_;
        }

        public TimestampOrBuilder getSentTimeOrBuilder() {
            return getSentTime();
        }

        public String getMatchId() {
            Object obj = this.matchId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.matchId_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getMatchIdBytes() {
            Object obj = this.matchId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.matchId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getToUserId() {
            Object obj = this.toUserId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.toUserId_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getToUserIdBytes() {
            Object obj = this.toUserId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.toUserId_ = copyFromUtf8;
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
            if (this.sentTime_ != null) {
                codedOutputStream.writeMessage(1, getSentTime());
            }
            if (!getMatchIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.matchId_);
            }
            if (!getToUserIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.toUserId_);
            }
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if (this.sentTime_ != null) {
                i = 0 + CodedOutputStream.computeMessageSize(1, getSentTime());
            }
            if (!getMatchIdBytes().isEmpty()) {
                i += GeneratedMessageV3.computeStringSize(2, this.matchId_);
            }
            if (!getToUserIdBytes().isEmpty()) {
                i += GeneratedMessageV3.computeStringSize(3, this.toUserId_);
            }
            this.memoizedSize = i;
            return i;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TypingIndicator)) {
                return super.equals(obj);
            }
            TypingIndicator typingIndicator = (TypingIndicator) obj;
            Object obj2 = hasSentTime() == typingIndicator.hasSentTime() ? 1 : null;
            if (hasSentTime()) {
                obj2 = (obj2 == null || !getSentTime().equals(typingIndicator.getSentTime())) ? null : 1;
            }
            obj2 = (obj2 == null || !getMatchId().equals(typingIndicator.getMatchId())) ? null : 1;
            if (obj2 == null || getToUserId().equals(typingIndicator.getToUserId()) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptorForType().hashCode();
            if (hasSentTime()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getSentTime().hashCode();
            }
            hashCode = (((((((((hashCode * 37) + 2) * 53) + getMatchId().hashCode()) * 37) + 3) * 53) + getToUserId().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static TypingIndicator parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TypingIndicator) PARSER.parseFrom(byteString);
        }

        public static TypingIndicator parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TypingIndicator) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TypingIndicator parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TypingIndicator) PARSER.parseFrom(bArr);
        }

        public static TypingIndicator parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TypingIndicator) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TypingIndicator parseFrom(InputStream inputStream) throws IOException {
            return (TypingIndicator) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TypingIndicator parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TypingIndicator) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TypingIndicator parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TypingIndicator) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TypingIndicator parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TypingIndicator) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TypingIndicator parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TypingIndicator) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TypingIndicator parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TypingIndicator) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(TypingIndicator typingIndicator) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(typingIndicator);
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

        public static TypingIndicator getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TypingIndicator> parser() {
            return PARSER;
        }

        public Parser<TypingIndicator> getParserForType() {
            return PARSER;
        }

        public TypingIndicator getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private KeepAliveTypingIndicator() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TimestampProto.getDescriptor()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fkeepalive/TypingIndicator.proto\u0012\tkeepalive\u001a\u001fgoogle/protobuf/timestamp.proto\"f\n\u000fTypingIndicator\u0012-\n\tsent_time\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u0010\n\bmatch_id\u0018\u0002 \u0001(\t\u0012\u0012\n\nto_user_id\u0018\u0003 \u0001(\tB\\\n\u001acom.tinder.proto.keepaliveB\u0018KeepAliveTypingIndicatorZ$github.com/TinderApp/proto/keepaliveb\u0006proto3"}, fileDescriptorArr, new C162131());
        TimestampProto.getDescriptor();
    }
}
