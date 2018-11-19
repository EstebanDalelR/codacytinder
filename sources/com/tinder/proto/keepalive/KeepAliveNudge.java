package com.tinder.proto.keepalive;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.TimestampProto;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;

public final class KeepAliveNudge {
    private static FileDescriptor descriptor;
    private static final Descriptor internal_static_keepalive_Nudge_descriptor = ((Descriptor) getDescriptor().getMessageTypes().get(0));
    private static final FieldAccessorTable internal_static_keepalive_Nudge_fieldAccessorTable = new FieldAccessorTable(internal_static_keepalive_Nudge_descriptor, new String[]{"UpdateTime", "Type"});

    /* renamed from: com.tinder.proto.keepalive.KeepAliveNudge$1 */
    static class C162111 implements InternalDescriptorAssigner {
        C162111() {
        }

        public ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor) {
            KeepAliveNudge.descriptor = fileDescriptor;
            return null;
        }
    }

    public interface NudgeOrBuilder extends MessageOrBuilder {
        Type getType();

        int getTypeValue();

        Timestamp getUpdateTime();

        TimestampOrBuilder getUpdateTimeOrBuilder();

        boolean hasUpdateTime();
    }

    public enum Type implements ProtocolMessageEnum {
        DEFAULT(0),
        NEW_MATCH(1),
        NEW_MESSAGE(2),
        MESSAGE_LIKE(3),
        MATCH_CLOSED(4),
        BOOST_SEEN(5),
        MATCH_MUTED(6),
        UNRECOGNIZED(-1);
        
        public static final int BOOST_SEEN_VALUE = 5;
        public static final int DEFAULT_VALUE = 0;
        public static final int MATCH_CLOSED_VALUE = 4;
        public static final int MATCH_MUTED_VALUE = 6;
        public static final int MESSAGE_LIKE_VALUE = 3;
        public static final int NEW_MATCH_VALUE = 1;
        public static final int NEW_MESSAGE_VALUE = 2;
        private static final Type[] VALUES = null;
        private static final EnumLiteMap<Type> internalValueMap = null;
        private final int value;

        /* renamed from: com.tinder.proto.keepalive.KeepAliveNudge$Type$1 */
        static class C162121 implements EnumLiteMap<Type> {
            C162121() {
            }

            public Type findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        }

        static {
            internalValueMap = new C162121();
            VALUES = values();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            switch (i) {
                case 0:
                    return DEFAULT;
                case 1:
                    return NEW_MATCH;
                case 2:
                    return NEW_MESSAGE;
                case 3:
                    return MESSAGE_LIKE;
                case 4:
                    return MATCH_CLOSED;
                case 5:
                    return BOOST_SEEN;
                case 6:
                    return MATCH_MUTED;
                default:
                    return 0;
            }
        }

        public static EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public final EnumValueDescriptor getValueDescriptor() {
            return (EnumValueDescriptor) getDescriptor().getValues().get(ordinal());
        }

        public final EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) KeepAliveNudge.getDescriptor().getEnumTypes().get(0);
        }

        public static Type valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            } else if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            } else {
                return VALUES[enumValueDescriptor.getIndex()];
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class Nudge extends GeneratedMessageV3 implements NudgeOrBuilder {
        private static final Nudge DEFAULT_INSTANCE = new Nudge();
        private static final Parser<Nudge> PARSER = new C177931();
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int UPDATE_TIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int type_;
        private Timestamp updateTime_;

        /* renamed from: com.tinder.proto.keepalive.KeepAliveNudge$Nudge$1 */
        static class C177931 extends AbstractParser<Nudge> {
            C177931() {
            }

            public Nudge parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Nudge(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements NudgeOrBuilder {
            private int type_;
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
                return KeepAliveNudge.internal_static_keepalive_Nudge_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return KeepAliveNudge.internal_static_keepalive_Nudge_fieldAccessorTable.ensureFieldAccessorsInitialized(Nudge.class, Builder.class);
            }

            private Builder() {
                this.updateTime_ = null;
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.updateTime_ = null;
                this.type_ = null;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                Nudge.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                if (this.updateTimeBuilder_ == null) {
                    this.updateTime_ = null;
                } else {
                    this.updateTime_ = null;
                    this.updateTimeBuilder_ = null;
                }
                this.type_ = 0;
                return this;
            }

            public Descriptor getDescriptorForType() {
                return KeepAliveNudge.internal_static_keepalive_Nudge_descriptor;
            }

            public Nudge getDefaultInstanceForType() {
                return Nudge.getDefaultInstance();
            }

            public Nudge build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Nudge buildPartial() {
                Nudge nudge = new Nudge((com.google.protobuf.GeneratedMessageV3.Builder) this);
                if (this.updateTimeBuilder_ == null) {
                    nudge.updateTime_ = this.updateTime_;
                } else {
                    nudge.updateTime_ = (Timestamp) this.updateTimeBuilder_.build();
                }
                nudge.type_ = this.type_;
                onBuilt();
                return nudge;
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
                if (message instanceof Nudge) {
                    return mergeFrom((Nudge) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Nudge nudge) {
                if (nudge == Nudge.getDefaultInstance()) {
                    return this;
                }
                if (nudge.hasUpdateTime()) {
                    mergeUpdateTime(nudge.getUpdateTime());
                }
                if (nudge.type_ != 0) {
                    setTypeValue(nudge.getTypeValue());
                }
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Nudge nudge;
                Nudge nudge2 = null;
                try {
                    Nudge nudge3 = (Nudge) Nudge.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (nudge3 != null) {
                        mergeFrom(nudge3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    nudge = (Nudge) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    nudge2 = nudge;
                    if (nudge2 != null) {
                        mergeFrom(nudge2);
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

            public int getTypeValue() {
                return this.type_;
            }

            public Builder setTypeValue(int i) {
                this.type_ = i;
                onChanged();
                return this;
            }

            public Type getType() {
                Type valueOf = Type.valueOf(this.type_);
                return valueOf == null ? Type.UNRECOGNIZED : valueOf;
            }

            public Builder setType(Type type) {
                if (type == null) {
                    throw new NullPointerException();
                }
                this.type_ = type.getNumber();
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }
        }

        private Nudge(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Nudge() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private Nudge(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        } else if (readTag == 16) {
                            this.type_ = codedInputStream.readEnum();
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
            return KeepAliveNudge.internal_static_keepalive_Nudge_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return KeepAliveNudge.internal_static_keepalive_Nudge_fieldAccessorTable.ensureFieldAccessorsInitialized(Nudge.class, Builder.class);
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

        public int getTypeValue() {
            return this.type_;
        }

        public Type getType() {
            Type valueOf = Type.valueOf(this.type_);
            return valueOf == null ? Type.UNRECOGNIZED : valueOf;
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
            if (this.type_ != Type.DEFAULT.getNumber()) {
                codedOutputStream.writeEnum(2, this.type_);
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
            if (this.type_ != Type.DEFAULT.getNumber()) {
                i += CodedOutputStream.computeEnumSize(2, this.type_);
            }
            this.memoizedSize = i;
            return i;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Nudge)) {
                return super.equals(obj);
            }
            Nudge nudge = (Nudge) obj;
            Object obj2 = hasUpdateTime() == nudge.hasUpdateTime() ? 1 : null;
            if (hasUpdateTime()) {
                obj2 = (obj2 == null || !getUpdateTime().equals(nudge.getUpdateTime())) ? null : 1;
            }
            if (obj2 == null || this.type_ != nudge.type_) {
                z = false;
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
            hashCode = (((((hashCode * 37) + 2) * 53) + this.type_) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Nudge parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Nudge) PARSER.parseFrom(byteString);
        }

        public static Nudge parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Nudge) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Nudge parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Nudge) PARSER.parseFrom(bArr);
        }

        public static Nudge parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Nudge) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Nudge parseFrom(InputStream inputStream) throws IOException {
            return (Nudge) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Nudge parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Nudge) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Nudge parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Nudge) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Nudge parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Nudge) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Nudge parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Nudge) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Nudge parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Nudge) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Nudge nudge) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(nudge);
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

        public static Nudge getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Nudge> parser() {
            return PARSER;
        }

        public Parser<Nudge> getParserForType() {
            return PARSER;
        }

        public Nudge getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private KeepAliveNudge() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TimestampProto.getDescriptor()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015keepalive/Nudge.proto\u0012\tkeepalive\u001a\u001fgoogle/protobuf/timestamp.proto\"W\n\u0005Nudge\u0012/\n\u000bupdate_time\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u001d\n\u0004type\u0018\u0002 \u0001(\u000e2\u000f.keepalive.Type*x\n\u0004Type\u0012\u000b\n\u0007DEFAULT\u0010\u0000\u0012\r\n\tNEW_MATCH\u0010\u0001\u0012\u000f\n\u000bNEW_MESSAGE\u0010\u0002\u0012\u0010\n\fMESSAGE_LIKE\u0010\u0003\u0012\u0010\n\fMATCH_CLOSED\u0010\u0004\u0012\u000e\n\nBOOST_SEEN\u0010\u0005\u0012\u000f\n\u000bMATCH_MUTED\u0010\u0006BR\n\u001acom.tinder.proto.keepaliveB\u000eKeepAliveNudgeZ$github.com/TinderApp/proto/keepaliveb\u0006proto3"}, fileDescriptorArr, new C162111());
        TimestampProto.getDescriptor();
    }
}
