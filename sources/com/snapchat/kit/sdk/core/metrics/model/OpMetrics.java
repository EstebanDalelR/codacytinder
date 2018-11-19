package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.TimestampProto;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class OpMetrics {
    private static FileDescriptor descriptor;
    /* renamed from: internal_static_com_snapchat_snapkit_metrics_CounterMetric_descriptor */
    private static final Descriptor f21759x13225361 = ((Descriptor) getDescriptor().getMessageTypes().get(0));
    /* renamed from: internal_static_com_snapchat_snapkit_metrics_CounterMetric_fieldAccessorTable */
    private static final FieldAccessorTable f21760x527c88df = new FieldAccessorTable(f21759x13225361, new String[]{"Name", "Timestamp", "Count"});
    /* renamed from: internal_static_com_snapchat_snapkit_metrics_LevelMetric_descriptor */
    private static final Descriptor f21761x9f6b6a99 = ((Descriptor) getDescriptor().getMessageTypes().get(2));
    /* renamed from: internal_static_com_snapchat_snapkit_metrics_LevelMetric_fieldAccessorTable */
    private static final FieldAccessorTable f21762x1ab6e817 = new FieldAccessorTable(f21761x9f6b6a99, new String[]{"Name", "Timestamp", "Level"});
    private static final Descriptor internal_static_com_snapchat_snapkit_metrics_Metrics_descriptor = ((Descriptor) getDescriptor().getMessageTypes().get(3));
    /* renamed from: internal_static_com_snapchat_snapkit_metrics_Metrics_fieldAccessorTable */
    private static final FieldAccessorTable f21763x9886acc8 = new FieldAccessorTable(internal_static_com_snapchat_snapkit_metrics_Metrics_descriptor, new String[]{"Counters", "Timers", "Levels"});
    /* renamed from: internal_static_com_snapchat_snapkit_metrics_TimerMetric_descriptor */
    private static final Descriptor f21764x7cb7d8f8 = ((Descriptor) getDescriptor().getMessageTypes().get(1));
    /* renamed from: internal_static_com_snapchat_snapkit_metrics_TimerMetric_fieldAccessorTable */
    private static final FieldAccessorTable f21765x591a8776 = new FieldAccessorTable(f21764x7cb7d8f8, new String[]{"Name", "Timestamp", "LatencyMillis"});

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.OpMetrics$1 */
    static class C71511 implements InternalDescriptorAssigner {
        C71511() {
        }

        public ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor) {
            OpMetrics.descriptor = fileDescriptor;
            return null;
        }
    }

    public interface CounterMetricOrBuilder extends MessageOrBuilder {
        long getCount();

        String getName();

        ByteString getNameBytes();

        Timestamp getTimestamp();

        TimestampOrBuilder getTimestampOrBuilder();

        boolean hasTimestamp();
    }

    public interface LevelMetricOrBuilder extends MessageOrBuilder {
        long getLevel();

        String getName();

        ByteString getNameBytes();

        Timestamp getTimestamp();

        TimestampOrBuilder getTimestampOrBuilder();

        boolean hasTimestamp();
    }

    public interface MetricsOrBuilder extends MessageOrBuilder {
        CounterMetric getCounters(int i);

        int getCountersCount();

        List<CounterMetric> getCountersList();

        CounterMetricOrBuilder getCountersOrBuilder(int i);

        List<? extends CounterMetricOrBuilder> getCountersOrBuilderList();

        LevelMetric getLevels(int i);

        int getLevelsCount();

        List<LevelMetric> getLevelsList();

        LevelMetricOrBuilder getLevelsOrBuilder(int i);

        List<? extends LevelMetricOrBuilder> getLevelsOrBuilderList();

        TimerMetric getTimers(int i);

        int getTimersCount();

        List<TimerMetric> getTimersList();

        TimerMetricOrBuilder getTimersOrBuilder(int i);

        List<? extends TimerMetricOrBuilder> getTimersOrBuilderList();
    }

    public interface TimerMetricOrBuilder extends MessageOrBuilder {
        long getLatencyMillis();

        String getName();

        ByteString getNameBytes();

        Timestamp getTimestamp();

        TimestampOrBuilder getTimestampOrBuilder();

        boolean hasTimestamp();
    }

    public static final class CounterMetric extends GeneratedMessageV3 implements CounterMetricOrBuilder {
        public static final int COUNT_FIELD_NUMBER = 3;
        private static final CounterMetric DEFAULT_INSTANCE = new CounterMetric();
        public static final int NAME_FIELD_NUMBER = 1;
        private static final Parser<CounterMetric> PARSER = new C79141();
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private long count_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private Timestamp timestamp_;

        /* renamed from: com.snapchat.kit.sdk.core.metrics.model.OpMetrics$CounterMetric$1 */
        static class C79141 extends AbstractParser<CounterMetric> {
            C79141() {
            }

            public CounterMetric parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CounterMetric(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements CounterMetricOrBuilder {
            private long count_;
            private Object name_;
            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> timestampBuilder_;
            private Timestamp timestamp_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptor getDescriptor() {
                return OpMetrics.f21759x13225361;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return OpMetrics.f21760x527c88df.ensureFieldAccessorsInitialized(CounterMetric.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.timestamp_ = null;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.timestamp_ = null;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                CounterMetric.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.name_ = "";
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                this.count_ = 0;
                return this;
            }

            public Descriptor getDescriptorForType() {
                return OpMetrics.f21759x13225361;
            }

            public CounterMetric getDefaultInstanceForType() {
                return CounterMetric.getDefaultInstance();
            }

            public CounterMetric build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public CounterMetric buildPartial() {
                CounterMetric counterMetric = new CounterMetric((com.google.protobuf.GeneratedMessageV3.Builder) this);
                counterMetric.name_ = this.name_;
                if (this.timestampBuilder_ == null) {
                    counterMetric.timestamp_ = this.timestamp_;
                } else {
                    counterMetric.timestamp_ = (Timestamp) this.timestampBuilder_.build();
                }
                counterMetric.count_ = this.count_;
                onBuilt();
                return counterMetric;
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
                if (message instanceof CounterMetric) {
                    return mergeFrom((CounterMetric) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CounterMetric counterMetric) {
                if (counterMetric == CounterMetric.getDefaultInstance()) {
                    return this;
                }
                if (!counterMetric.getName().isEmpty()) {
                    this.name_ = counterMetric.name_;
                    onChanged();
                }
                if (counterMetric.hasTimestamp()) {
                    mergeTimestamp(counterMetric.getTimestamp());
                }
                if (counterMetric.getCount() != 0) {
                    setCount(counterMetric.getCount());
                }
                mergeUnknownFields(counterMetric.unknownFields);
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                CounterMetric counterMetric;
                CounterMetric counterMetric2 = null;
                try {
                    CounterMetric counterMetric3 = (CounterMetric) CounterMetric.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (counterMetric3 != null) {
                        mergeFrom(counterMetric3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    counterMetric = (CounterMetric) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    counterMetric2 = counterMetric;
                    if (counterMetric2 != null) {
                        mergeFrom(counterMetric2);
                    }
                    throw codedInputStream2;
                }
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String toStringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = toStringUtf8;
                return toStringUtf8;
            }

            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = CounterMetric.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public boolean hasTimestamp() {
                if (this.timestampBuilder_ == null) {
                    if (this.timestamp_ == null) {
                        return false;
                    }
                }
                return true;
            }

            public Timestamp getTimestamp() {
                if (this.timestampBuilder_ != null) {
                    return (Timestamp) this.timestampBuilder_.getMessage();
                }
                return this.timestamp_ == null ? Timestamp.getDefaultInstance() : this.timestamp_;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                if (this.timestampBuilder_ != null) {
                    this.timestampBuilder_.setMessage(timestamp);
                } else if (timestamp == null) {
                    throw new NullPointerException();
                } else {
                    this.timestamp_ = timestamp;
                    onChanged();
                }
                return this;
            }

            public Builder setTimestamp(com.google.protobuf.Timestamp.Builder builder) {
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = builder.build();
                    onChanged();
                } else {
                    this.timestampBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                if (this.timestampBuilder_ == null) {
                    if (this.timestamp_ != null) {
                        this.timestamp_ = Timestamp.newBuilder(this.timestamp_).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.timestamp_ = timestamp;
                    }
                    onChanged();
                } else {
                    this.timestampBuilder_.mergeFrom(timestamp);
                }
                return this;
            }

            public Builder clearTimestamp() {
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                    onChanged();
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
                onChanged();
                return (com.google.protobuf.Timestamp.Builder) getTimestampFieldBuilder().getBuilder();
            }

            public TimestampOrBuilder getTimestampOrBuilder() {
                if (this.timestampBuilder_ != null) {
                    return (TimestampOrBuilder) this.timestampBuilder_.getMessageOrBuilder();
                }
                return this.timestamp_ == null ? Timestamp.getDefaultInstance() : this.timestamp_;
            }

            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> getTimestampFieldBuilder() {
                if (this.timestampBuilder_ == null) {
                    this.timestampBuilder_ = new SingleFieldBuilderV3(getTimestamp(), getParentForChildren(), isClean());
                    this.timestamp_ = null;
                }
                return this.timestampBuilder_;
            }

            public long getCount() {
                return this.count_;
            }

            public Builder setCount(long j) {
                this.count_ = j;
                onChanged();
                return this;
            }

            public Builder clearCount() {
                this.count_ = 0;
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

        private CounterMetric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private CounterMetric() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.count_ = 0;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CounterMetric(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.name_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            com.google.protobuf.Timestamp.Builder builder = null;
                            if (this.timestamp_ != null) {
                                builder = this.timestamp_.toBuilder();
                            }
                            this.timestamp_ = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.timestamp_);
                                this.timestamp_ = builder.buildPartial();
                            }
                        } else if (readTag == 24) {
                            this.count_ = codedInputStream.readInt64();
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
            return OpMetrics.f21759x13225361;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return OpMetrics.f21760x527c88df.ensureFieldAccessorsInitialized(CounterMetric.class, Builder.class);
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        public Timestamp getTimestamp() {
            return this.timestamp_ == null ? Timestamp.getDefaultInstance() : this.timestamp_;
        }

        public TimestampOrBuilder getTimestampOrBuilder() {
            return getTimestamp();
        }

        public long getCount() {
            return this.count_;
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
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if (this.timestamp_ != null) {
                codedOutputStream.writeMessage(2, getTimestamp());
            }
            if (this.count_ != 0) {
                codedOutputStream.writeInt64(3, this.count_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if (!getNameBytes().isEmpty()) {
                i = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
            }
            if (this.timestamp_ != null) {
                i += CodedOutputStream.computeMessageSize(2, getTimestamp());
            }
            if (this.count_ != 0) {
                i += CodedOutputStream.computeInt64Size(3, this.count_);
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
            if (!(obj instanceof CounterMetric)) {
                return super.equals(obj);
            }
            CounterMetric counterMetric = (CounterMetric) obj;
            Object obj2 = ((getName().equals(counterMetric.getName()) ? 1 : null) == null || hasTimestamp() != counterMetric.hasTimestamp()) ? null : 1;
            if (hasTimestamp()) {
                obj2 = (obj2 == null || !getTimestamp().equals(counterMetric.getTimestamp())) ? null : 1;
            }
            obj2 = (obj2 == null || getCount() != counterMetric.getCount()) ? null : 1;
            if (obj2 == null || this.unknownFields.equals(counterMetric.unknownFields) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
            if (hasTimestamp()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getTimestamp().hashCode();
            }
            hashCode = (((((hashCode * 37) + 3) * 53) + Internal.hashLong(getCount())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CounterMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CounterMetric) PARSER.parseFrom(byteBuffer);
        }

        public static CounterMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CounterMetric) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CounterMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CounterMetric) PARSER.parseFrom(byteString);
        }

        public static CounterMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CounterMetric) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CounterMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CounterMetric) PARSER.parseFrom(bArr);
        }

        public static CounterMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CounterMetric) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CounterMetric parseFrom(InputStream inputStream) throws IOException {
            return (CounterMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CounterMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CounterMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CounterMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CounterMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CounterMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CounterMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CounterMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CounterMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CounterMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CounterMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CounterMetric counterMetric) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(counterMetric);
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

        public static CounterMetric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CounterMetric> parser() {
            return PARSER;
        }

        public Parser<CounterMetric> getParserForType() {
            return PARSER;
        }

        public CounterMetric getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class LevelMetric extends GeneratedMessageV3 implements LevelMetricOrBuilder {
        private static final LevelMetric DEFAULT_INSTANCE = new LevelMetric();
        public static final int LEVEL_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        private static final Parser<LevelMetric> PARSER = new C79151();
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private long level_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private Timestamp timestamp_;

        /* renamed from: com.snapchat.kit.sdk.core.metrics.model.OpMetrics$LevelMetric$1 */
        static class C79151 extends AbstractParser<LevelMetric> {
            C79151() {
            }

            public LevelMetric parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new LevelMetric(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements LevelMetricOrBuilder {
            private long level_;
            private Object name_;
            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> timestampBuilder_;
            private Timestamp timestamp_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptor getDescriptor() {
                return OpMetrics.f21761x9f6b6a99;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return OpMetrics.f21762x1ab6e817.ensureFieldAccessorsInitialized(LevelMetric.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.timestamp_ = null;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.timestamp_ = null;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                LevelMetric.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.name_ = "";
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                this.level_ = 0;
                return this;
            }

            public Descriptor getDescriptorForType() {
                return OpMetrics.f21761x9f6b6a99;
            }

            public LevelMetric getDefaultInstanceForType() {
                return LevelMetric.getDefaultInstance();
            }

            public LevelMetric build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public LevelMetric buildPartial() {
                LevelMetric levelMetric = new LevelMetric((com.google.protobuf.GeneratedMessageV3.Builder) this);
                levelMetric.name_ = this.name_;
                if (this.timestampBuilder_ == null) {
                    levelMetric.timestamp_ = this.timestamp_;
                } else {
                    levelMetric.timestamp_ = (Timestamp) this.timestampBuilder_.build();
                }
                levelMetric.level_ = this.level_;
                onBuilt();
                return levelMetric;
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
                if (message instanceof LevelMetric) {
                    return mergeFrom((LevelMetric) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LevelMetric levelMetric) {
                if (levelMetric == LevelMetric.getDefaultInstance()) {
                    return this;
                }
                if (!levelMetric.getName().isEmpty()) {
                    this.name_ = levelMetric.name_;
                    onChanged();
                }
                if (levelMetric.hasTimestamp()) {
                    mergeTimestamp(levelMetric.getTimestamp());
                }
                if (levelMetric.getLevel() != 0) {
                    setLevel(levelMetric.getLevel());
                }
                mergeUnknownFields(levelMetric.unknownFields);
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                LevelMetric levelMetric;
                LevelMetric levelMetric2 = null;
                try {
                    LevelMetric levelMetric3 = (LevelMetric) LevelMetric.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (levelMetric3 != null) {
                        mergeFrom(levelMetric3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    levelMetric = (LevelMetric) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    levelMetric2 = levelMetric;
                    if (levelMetric2 != null) {
                        mergeFrom(levelMetric2);
                    }
                    throw codedInputStream2;
                }
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String toStringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = toStringUtf8;
                return toStringUtf8;
            }

            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = LevelMetric.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public boolean hasTimestamp() {
                if (this.timestampBuilder_ == null) {
                    if (this.timestamp_ == null) {
                        return false;
                    }
                }
                return true;
            }

            public Timestamp getTimestamp() {
                if (this.timestampBuilder_ != null) {
                    return (Timestamp) this.timestampBuilder_.getMessage();
                }
                return this.timestamp_ == null ? Timestamp.getDefaultInstance() : this.timestamp_;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                if (this.timestampBuilder_ != null) {
                    this.timestampBuilder_.setMessage(timestamp);
                } else if (timestamp == null) {
                    throw new NullPointerException();
                } else {
                    this.timestamp_ = timestamp;
                    onChanged();
                }
                return this;
            }

            public Builder setTimestamp(com.google.protobuf.Timestamp.Builder builder) {
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = builder.build();
                    onChanged();
                } else {
                    this.timestampBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                if (this.timestampBuilder_ == null) {
                    if (this.timestamp_ != null) {
                        this.timestamp_ = Timestamp.newBuilder(this.timestamp_).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.timestamp_ = timestamp;
                    }
                    onChanged();
                } else {
                    this.timestampBuilder_.mergeFrom(timestamp);
                }
                return this;
            }

            public Builder clearTimestamp() {
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                    onChanged();
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
                onChanged();
                return (com.google.protobuf.Timestamp.Builder) getTimestampFieldBuilder().getBuilder();
            }

            public TimestampOrBuilder getTimestampOrBuilder() {
                if (this.timestampBuilder_ != null) {
                    return (TimestampOrBuilder) this.timestampBuilder_.getMessageOrBuilder();
                }
                return this.timestamp_ == null ? Timestamp.getDefaultInstance() : this.timestamp_;
            }

            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> getTimestampFieldBuilder() {
                if (this.timestampBuilder_ == null) {
                    this.timestampBuilder_ = new SingleFieldBuilderV3(getTimestamp(), getParentForChildren(), isClean());
                    this.timestamp_ = null;
                }
                return this.timestampBuilder_;
            }

            public long getLevel() {
                return this.level_;
            }

            public Builder setLevel(long j) {
                this.level_ = j;
                onChanged();
                return this;
            }

            public Builder clearLevel() {
                this.level_ = 0;
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

        private LevelMetric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private LevelMetric() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.level_ = 0;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private LevelMetric(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.name_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            com.google.protobuf.Timestamp.Builder builder = null;
                            if (this.timestamp_ != null) {
                                builder = this.timestamp_.toBuilder();
                            }
                            this.timestamp_ = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.timestamp_);
                                this.timestamp_ = builder.buildPartial();
                            }
                        } else if (readTag == 24) {
                            this.level_ = codedInputStream.readInt64();
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
            return OpMetrics.f21761x9f6b6a99;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return OpMetrics.f21762x1ab6e817.ensureFieldAccessorsInitialized(LevelMetric.class, Builder.class);
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        public Timestamp getTimestamp() {
            return this.timestamp_ == null ? Timestamp.getDefaultInstance() : this.timestamp_;
        }

        public TimestampOrBuilder getTimestampOrBuilder() {
            return getTimestamp();
        }

        public long getLevel() {
            return this.level_;
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
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if (this.timestamp_ != null) {
                codedOutputStream.writeMessage(2, getTimestamp());
            }
            if (this.level_ != 0) {
                codedOutputStream.writeInt64(3, this.level_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if (!getNameBytes().isEmpty()) {
                i = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
            }
            if (this.timestamp_ != null) {
                i += CodedOutputStream.computeMessageSize(2, getTimestamp());
            }
            if (this.level_ != 0) {
                i += CodedOutputStream.computeInt64Size(3, this.level_);
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
            if (!(obj instanceof LevelMetric)) {
                return super.equals(obj);
            }
            LevelMetric levelMetric = (LevelMetric) obj;
            Object obj2 = ((getName().equals(levelMetric.getName()) ? 1 : null) == null || hasTimestamp() != levelMetric.hasTimestamp()) ? null : 1;
            if (hasTimestamp()) {
                obj2 = (obj2 == null || !getTimestamp().equals(levelMetric.getTimestamp())) ? null : 1;
            }
            obj2 = (obj2 == null || getLevel() != levelMetric.getLevel()) ? null : 1;
            if (obj2 == null || this.unknownFields.equals(levelMetric.unknownFields) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
            if (hasTimestamp()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getTimestamp().hashCode();
            }
            hashCode = (((((hashCode * 37) + 3) * 53) + Internal.hashLong(getLevel())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static LevelMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LevelMetric) PARSER.parseFrom(byteBuffer);
        }

        public static LevelMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LevelMetric) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static LevelMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LevelMetric) PARSER.parseFrom(byteString);
        }

        public static LevelMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LevelMetric) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LevelMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LevelMetric) PARSER.parseFrom(bArr);
        }

        public static LevelMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LevelMetric) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LevelMetric parseFrom(InputStream inputStream) throws IOException {
            return (LevelMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LevelMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LevelMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LevelMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LevelMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LevelMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LevelMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LevelMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LevelMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LevelMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LevelMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(LevelMetric levelMetric) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(levelMetric);
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

        public static LevelMetric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LevelMetric> parser() {
            return PARSER;
        }

        public Parser<LevelMetric> getParserForType() {
            return PARSER;
        }

        public LevelMetric getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Metrics extends GeneratedMessageV3 implements MetricsOrBuilder {
        public static final int COUNTERS_FIELD_NUMBER = 1;
        private static final Metrics DEFAULT_INSTANCE = new Metrics();
        public static final int LEVELS_FIELD_NUMBER = 3;
        private static final Parser<Metrics> PARSER = new C79161();
        public static final int TIMERS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<CounterMetric> counters_;
        private List<LevelMetric> levels_;
        private byte memoizedIsInitialized;
        private List<TimerMetric> timers_;

        /* renamed from: com.snapchat.kit.sdk.core.metrics.model.OpMetrics$Metrics$1 */
        static class C79161 extends AbstractParser<Metrics> {
            C79161() {
            }

            public Metrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Metrics(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements MetricsOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<CounterMetric, Builder, CounterMetricOrBuilder> countersBuilder_;
            private List<CounterMetric> counters_;
            private RepeatedFieldBuilderV3<LevelMetric, Builder, LevelMetricOrBuilder> levelsBuilder_;
            private List<LevelMetric> levels_;
            private RepeatedFieldBuilderV3<TimerMetric, Builder, TimerMetricOrBuilder> timersBuilder_;
            private List<TimerMetric> timers_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptor getDescriptor() {
                return OpMetrics.internal_static_com_snapchat_snapkit_metrics_Metrics_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return OpMetrics.f21763x9886acc8.ensureFieldAccessorsInitialized(Metrics.class, Builder.class);
            }

            private Builder() {
                this.counters_ = Collections.emptyList();
                this.timers_ = Collections.emptyList();
                this.levels_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.counters_ = Collections.emptyList();
                this.timers_ = Collections.emptyList();
                this.levels_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Metrics.alwaysUseFieldBuilders) {
                    getCountersFieldBuilder();
                    getTimersFieldBuilder();
                    getLevelsFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                if (this.countersBuilder_ == null) {
                    this.counters_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.countersBuilder_.clear();
                }
                if (this.timersBuilder_ == null) {
                    this.timers_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.timersBuilder_.clear();
                }
                if (this.levelsBuilder_ == null) {
                    this.levels_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    this.levelsBuilder_.clear();
                }
                return this;
            }

            public Descriptor getDescriptorForType() {
                return OpMetrics.internal_static_com_snapchat_snapkit_metrics_Metrics_descriptor;
            }

            public Metrics getDefaultInstanceForType() {
                return Metrics.getDefaultInstance();
            }

            public Metrics build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public Metrics buildPartial() {
                Metrics metrics = new Metrics((com.google.protobuf.GeneratedMessageV3.Builder) this);
                int i = this.bitField0_;
                if (this.countersBuilder_ == null) {
                    if ((this.bitField0_ & 1) == 1) {
                        this.counters_ = Collections.unmodifiableList(this.counters_);
                        this.bitField0_ &= -2;
                    }
                    metrics.counters_ = this.counters_;
                } else {
                    metrics.counters_ = this.countersBuilder_.build();
                }
                if (this.timersBuilder_ == null) {
                    if ((this.bitField0_ & 2) == 2) {
                        this.timers_ = Collections.unmodifiableList(this.timers_);
                        this.bitField0_ &= -3;
                    }
                    metrics.timers_ = this.timers_;
                } else {
                    metrics.timers_ = this.timersBuilder_.build();
                }
                if (this.levelsBuilder_ == null) {
                    if ((this.bitField0_ & 4) == 4) {
                        this.levels_ = Collections.unmodifiableList(this.levels_);
                        this.bitField0_ &= -5;
                    }
                    metrics.levels_ = this.levels_;
                } else {
                    metrics.levels_ = this.levelsBuilder_.build();
                }
                onBuilt();
                return metrics;
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
                if (message instanceof Metrics) {
                    return mergeFrom((Metrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Metrics metrics) {
                if (metrics == Metrics.getDefaultInstance()) {
                    return this;
                }
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = null;
                if (this.countersBuilder_ == null) {
                    if (!metrics.counters_.isEmpty()) {
                        if (this.counters_.isEmpty()) {
                            this.counters_ = metrics.counters_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCountersIsMutable();
                            this.counters_.addAll(metrics.counters_);
                        }
                        onChanged();
                    }
                } else if (!metrics.counters_.isEmpty()) {
                    if (this.countersBuilder_.isEmpty()) {
                        this.countersBuilder_.dispose();
                        this.countersBuilder_ = null;
                        this.counters_ = metrics.counters_;
                        this.bitField0_ &= -2;
                        this.countersBuilder_ = Metrics.alwaysUseFieldBuilders ? getCountersFieldBuilder() : null;
                    } else {
                        this.countersBuilder_.addAllMessages(metrics.counters_);
                    }
                }
                if (this.timersBuilder_ == null) {
                    if (!metrics.timers_.isEmpty()) {
                        if (this.timers_.isEmpty()) {
                            this.timers_ = metrics.timers_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureTimersIsMutable();
                            this.timers_.addAll(metrics.timers_);
                        }
                        onChanged();
                    }
                } else if (!metrics.timers_.isEmpty()) {
                    if (this.timersBuilder_.isEmpty()) {
                        this.timersBuilder_.dispose();
                        this.timersBuilder_ = null;
                        this.timers_ = metrics.timers_;
                        this.bitField0_ &= -3;
                        this.timersBuilder_ = Metrics.alwaysUseFieldBuilders ? getTimersFieldBuilder() : null;
                    } else {
                        this.timersBuilder_.addAllMessages(metrics.timers_);
                    }
                }
                if (this.levelsBuilder_ == null) {
                    if (!metrics.levels_.isEmpty()) {
                        if (this.levels_.isEmpty()) {
                            this.levels_ = metrics.levels_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureLevelsIsMutable();
                            this.levels_.addAll(metrics.levels_);
                        }
                        onChanged();
                    }
                } else if (!metrics.levels_.isEmpty()) {
                    if (this.levelsBuilder_.isEmpty()) {
                        this.levelsBuilder_.dispose();
                        this.levelsBuilder_ = null;
                        this.levels_ = metrics.levels_;
                        this.bitField0_ &= -5;
                        if (Metrics.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getLevelsFieldBuilder();
                        }
                        this.levelsBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.levelsBuilder_.addAllMessages(metrics.levels_);
                    }
                }
                mergeUnknownFields(metrics.unknownFields);
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Metrics metrics;
                Metrics metrics2 = null;
                try {
                    Metrics metrics3 = (Metrics) Metrics.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (metrics3 != null) {
                        mergeFrom(metrics3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    metrics = (Metrics) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    metrics2 = metrics;
                    if (metrics2 != null) {
                        mergeFrom(metrics2);
                    }
                    throw codedInputStream2;
                }
            }

            private void ensureCountersIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.counters_ = new ArrayList(this.counters_);
                    this.bitField0_ |= 1;
                }
            }

            public List<CounterMetric> getCountersList() {
                if (this.countersBuilder_ == null) {
                    return Collections.unmodifiableList(this.counters_);
                }
                return this.countersBuilder_.getMessageList();
            }

            public int getCountersCount() {
                if (this.countersBuilder_ == null) {
                    return this.counters_.size();
                }
                return this.countersBuilder_.getCount();
            }

            public CounterMetric getCounters(int i) {
                if (this.countersBuilder_ == null) {
                    return (CounterMetric) this.counters_.get(i);
                }
                return (CounterMetric) this.countersBuilder_.getMessage(i);
            }

            public Builder setCounters(int i, CounterMetric counterMetric) {
                if (this.countersBuilder_ != null) {
                    this.countersBuilder_.setMessage(i, counterMetric);
                } else if (counterMetric == null) {
                    throw new NullPointerException();
                } else {
                    ensureCountersIsMutable();
                    this.counters_.set(i, counterMetric);
                    onChanged();
                }
                return this;
            }

            public Builder setCounters(int i, Builder builder) {
                if (this.countersBuilder_ == null) {
                    ensureCountersIsMutable();
                    this.counters_.set(i, builder.build());
                    onChanged();
                } else {
                    this.countersBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addCounters(CounterMetric counterMetric) {
                if (this.countersBuilder_ != null) {
                    this.countersBuilder_.addMessage(counterMetric);
                } else if (counterMetric == null) {
                    throw new NullPointerException();
                } else {
                    ensureCountersIsMutable();
                    this.counters_.add(counterMetric);
                    onChanged();
                }
                return this;
            }

            public Builder addCounters(int i, CounterMetric counterMetric) {
                if (this.countersBuilder_ != null) {
                    this.countersBuilder_.addMessage(i, counterMetric);
                } else if (counterMetric == null) {
                    throw new NullPointerException();
                } else {
                    ensureCountersIsMutable();
                    this.counters_.add(i, counterMetric);
                    onChanged();
                }
                return this;
            }

            public Builder addCounters(Builder builder) {
                if (this.countersBuilder_ == null) {
                    ensureCountersIsMutable();
                    this.counters_.add(builder.build());
                    onChanged();
                } else {
                    this.countersBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public Builder addCounters(int i, Builder builder) {
                if (this.countersBuilder_ == null) {
                    ensureCountersIsMutable();
                    this.counters_.add(i, builder.build());
                    onChanged();
                } else {
                    this.countersBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllCounters(Iterable<? extends CounterMetric> iterable) {
                if (this.countersBuilder_ == null) {
                    ensureCountersIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.counters_);
                    onChanged();
                } else {
                    this.countersBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearCounters() {
                if (this.countersBuilder_ == null) {
                    this.counters_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    this.countersBuilder_.clear();
                }
                return this;
            }

            public Builder removeCounters(int i) {
                if (this.countersBuilder_ == null) {
                    ensureCountersIsMutable();
                    this.counters_.remove(i);
                    onChanged();
                } else {
                    this.countersBuilder_.remove(i);
                }
                return this;
            }

            public Builder getCountersBuilder(int i) {
                return (Builder) getCountersFieldBuilder().getBuilder(i);
            }

            public CounterMetricOrBuilder getCountersOrBuilder(int i) {
                if (this.countersBuilder_ == null) {
                    return (CounterMetricOrBuilder) this.counters_.get(i);
                }
                return (CounterMetricOrBuilder) this.countersBuilder_.getMessageOrBuilder(i);
            }

            public List<? extends CounterMetricOrBuilder> getCountersOrBuilderList() {
                if (this.countersBuilder_ != null) {
                    return this.countersBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.counters_);
            }

            public Builder addCountersBuilder() {
                return (Builder) getCountersFieldBuilder().addBuilder(CounterMetric.getDefaultInstance());
            }

            public Builder addCountersBuilder(int i) {
                return (Builder) getCountersFieldBuilder().addBuilder(i, CounterMetric.getDefaultInstance());
            }

            public List<Builder> getCountersBuilderList() {
                return getCountersFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<CounterMetric, Builder, CounterMetricOrBuilder> getCountersFieldBuilder() {
                if (this.countersBuilder_ == null) {
                    List list = this.counters_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) != 1) {
                        z = false;
                    }
                    this.countersBuilder_ = new RepeatedFieldBuilderV3(list, z, getParentForChildren(), isClean());
                    this.counters_ = null;
                }
                return this.countersBuilder_;
            }

            private void ensureTimersIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.timers_ = new ArrayList(this.timers_);
                    this.bitField0_ |= 2;
                }
            }

            public List<TimerMetric> getTimersList() {
                if (this.timersBuilder_ == null) {
                    return Collections.unmodifiableList(this.timers_);
                }
                return this.timersBuilder_.getMessageList();
            }

            public int getTimersCount() {
                if (this.timersBuilder_ == null) {
                    return this.timers_.size();
                }
                return this.timersBuilder_.getCount();
            }

            public TimerMetric getTimers(int i) {
                if (this.timersBuilder_ == null) {
                    return (TimerMetric) this.timers_.get(i);
                }
                return (TimerMetric) this.timersBuilder_.getMessage(i);
            }

            public Builder setTimers(int i, TimerMetric timerMetric) {
                if (this.timersBuilder_ != null) {
                    this.timersBuilder_.setMessage(i, timerMetric);
                } else if (timerMetric == null) {
                    throw new NullPointerException();
                } else {
                    ensureTimersIsMutable();
                    this.timers_.set(i, timerMetric);
                    onChanged();
                }
                return this;
            }

            public Builder setTimers(int i, Builder builder) {
                if (this.timersBuilder_ == null) {
                    ensureTimersIsMutable();
                    this.timers_.set(i, builder.build());
                    onChanged();
                } else {
                    this.timersBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addTimers(TimerMetric timerMetric) {
                if (this.timersBuilder_ != null) {
                    this.timersBuilder_.addMessage(timerMetric);
                } else if (timerMetric == null) {
                    throw new NullPointerException();
                } else {
                    ensureTimersIsMutable();
                    this.timers_.add(timerMetric);
                    onChanged();
                }
                return this;
            }

            public Builder addTimers(int i, TimerMetric timerMetric) {
                if (this.timersBuilder_ != null) {
                    this.timersBuilder_.addMessage(i, timerMetric);
                } else if (timerMetric == null) {
                    throw new NullPointerException();
                } else {
                    ensureTimersIsMutable();
                    this.timers_.add(i, timerMetric);
                    onChanged();
                }
                return this;
            }

            public Builder addTimers(Builder builder) {
                if (this.timersBuilder_ == null) {
                    ensureTimersIsMutable();
                    this.timers_.add(builder.build());
                    onChanged();
                } else {
                    this.timersBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public Builder addTimers(int i, Builder builder) {
                if (this.timersBuilder_ == null) {
                    ensureTimersIsMutable();
                    this.timers_.add(i, builder.build());
                    onChanged();
                } else {
                    this.timersBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllTimers(Iterable<? extends TimerMetric> iterable) {
                if (this.timersBuilder_ == null) {
                    ensureTimersIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.timers_);
                    onChanged();
                } else {
                    this.timersBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearTimers() {
                if (this.timersBuilder_ == null) {
                    this.timers_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.timersBuilder_.clear();
                }
                return this;
            }

            public Builder removeTimers(int i) {
                if (this.timersBuilder_ == null) {
                    ensureTimersIsMutable();
                    this.timers_.remove(i);
                    onChanged();
                } else {
                    this.timersBuilder_.remove(i);
                }
                return this;
            }

            public Builder getTimersBuilder(int i) {
                return (Builder) getTimersFieldBuilder().getBuilder(i);
            }

            public TimerMetricOrBuilder getTimersOrBuilder(int i) {
                if (this.timersBuilder_ == null) {
                    return (TimerMetricOrBuilder) this.timers_.get(i);
                }
                return (TimerMetricOrBuilder) this.timersBuilder_.getMessageOrBuilder(i);
            }

            public List<? extends TimerMetricOrBuilder> getTimersOrBuilderList() {
                if (this.timersBuilder_ != null) {
                    return this.timersBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.timers_);
            }

            public Builder addTimersBuilder() {
                return (Builder) getTimersFieldBuilder().addBuilder(TimerMetric.getDefaultInstance());
            }

            public Builder addTimersBuilder(int i) {
                return (Builder) getTimersFieldBuilder().addBuilder(i, TimerMetric.getDefaultInstance());
            }

            public List<Builder> getTimersBuilderList() {
                return getTimersFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<TimerMetric, Builder, TimerMetricOrBuilder> getTimersFieldBuilder() {
                if (this.timersBuilder_ == null) {
                    this.timersBuilder_ = new RepeatedFieldBuilderV3(this.timers_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                    this.timers_ = null;
                }
                return this.timersBuilder_;
            }

            private void ensureLevelsIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.levels_ = new ArrayList(this.levels_);
                    this.bitField0_ |= 4;
                }
            }

            public List<LevelMetric> getLevelsList() {
                if (this.levelsBuilder_ == null) {
                    return Collections.unmodifiableList(this.levels_);
                }
                return this.levelsBuilder_.getMessageList();
            }

            public int getLevelsCount() {
                if (this.levelsBuilder_ == null) {
                    return this.levels_.size();
                }
                return this.levelsBuilder_.getCount();
            }

            public LevelMetric getLevels(int i) {
                if (this.levelsBuilder_ == null) {
                    return (LevelMetric) this.levels_.get(i);
                }
                return (LevelMetric) this.levelsBuilder_.getMessage(i);
            }

            public Builder setLevels(int i, LevelMetric levelMetric) {
                if (this.levelsBuilder_ != null) {
                    this.levelsBuilder_.setMessage(i, levelMetric);
                } else if (levelMetric == null) {
                    throw new NullPointerException();
                } else {
                    ensureLevelsIsMutable();
                    this.levels_.set(i, levelMetric);
                    onChanged();
                }
                return this;
            }

            public Builder setLevels(int i, Builder builder) {
                if (this.levelsBuilder_ == null) {
                    ensureLevelsIsMutable();
                    this.levels_.set(i, builder.build());
                    onChanged();
                } else {
                    this.levelsBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addLevels(LevelMetric levelMetric) {
                if (this.levelsBuilder_ != null) {
                    this.levelsBuilder_.addMessage(levelMetric);
                } else if (levelMetric == null) {
                    throw new NullPointerException();
                } else {
                    ensureLevelsIsMutable();
                    this.levels_.add(levelMetric);
                    onChanged();
                }
                return this;
            }

            public Builder addLevels(int i, LevelMetric levelMetric) {
                if (this.levelsBuilder_ != null) {
                    this.levelsBuilder_.addMessage(i, levelMetric);
                } else if (levelMetric == null) {
                    throw new NullPointerException();
                } else {
                    ensureLevelsIsMutable();
                    this.levels_.add(i, levelMetric);
                    onChanged();
                }
                return this;
            }

            public Builder addLevels(Builder builder) {
                if (this.levelsBuilder_ == null) {
                    ensureLevelsIsMutable();
                    this.levels_.add(builder.build());
                    onChanged();
                } else {
                    this.levelsBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public Builder addLevels(int i, Builder builder) {
                if (this.levelsBuilder_ == null) {
                    ensureLevelsIsMutable();
                    this.levels_.add(i, builder.build());
                    onChanged();
                } else {
                    this.levelsBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllLevels(Iterable<? extends LevelMetric> iterable) {
                if (this.levelsBuilder_ == null) {
                    ensureLevelsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll((Iterable) iterable, this.levels_);
                    onChanged();
                } else {
                    this.levelsBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearLevels() {
                if (this.levelsBuilder_ == null) {
                    this.levels_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    this.levelsBuilder_.clear();
                }
                return this;
            }

            public Builder removeLevels(int i) {
                if (this.levelsBuilder_ == null) {
                    ensureLevelsIsMutable();
                    this.levels_.remove(i);
                    onChanged();
                } else {
                    this.levelsBuilder_.remove(i);
                }
                return this;
            }

            public Builder getLevelsBuilder(int i) {
                return (Builder) getLevelsFieldBuilder().getBuilder(i);
            }

            public LevelMetricOrBuilder getLevelsOrBuilder(int i) {
                if (this.levelsBuilder_ == null) {
                    return (LevelMetricOrBuilder) this.levels_.get(i);
                }
                return (LevelMetricOrBuilder) this.levelsBuilder_.getMessageOrBuilder(i);
            }

            public List<? extends LevelMetricOrBuilder> getLevelsOrBuilderList() {
                if (this.levelsBuilder_ != null) {
                    return this.levelsBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.levels_);
            }

            public Builder addLevelsBuilder() {
                return (Builder) getLevelsFieldBuilder().addBuilder(LevelMetric.getDefaultInstance());
            }

            public Builder addLevelsBuilder(int i) {
                return (Builder) getLevelsFieldBuilder().addBuilder(i, LevelMetric.getDefaultInstance());
            }

            public List<Builder> getLevelsBuilderList() {
                return getLevelsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<LevelMetric, Builder, LevelMetricOrBuilder> getLevelsFieldBuilder() {
                if (this.levelsBuilder_ == null) {
                    this.levelsBuilder_ = new RepeatedFieldBuilderV3(this.levels_, (this.bitField0_ & 4) == 4, getParentForChildren(), isClean());
                    this.levels_ = null;
                }
                return this.levelsBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        private Metrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Metrics() {
            this.memoizedIsInitialized = (byte) -1;
            this.counters_ = Collections.emptyList();
            this.timers_ = Collections.emptyList();
            this.levels_ = Collections.emptyList();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Metrics(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        if (readTag == 10) {
                            if ((i & 1) != 1) {
                                this.counters_ = new ArrayList();
                                i |= 1;
                            }
                            this.counters_.add(codedInputStream.readMessage(CounterMetric.parser(), extensionRegistryLite));
                        } else if (readTag == 18) {
                            if ((i & 2) != 2) {
                                this.timers_ = new ArrayList();
                                i |= 2;
                            }
                            this.timers_.add(codedInputStream.readMessage(TimerMetric.parser(), extensionRegistryLite));
                        } else if (readTag == 26) {
                            if ((i & 4) != 4) {
                                this.levels_ = new ArrayList();
                                i |= 4;
                            }
                            this.levels_.add(codedInputStream.readMessage(LevelMetric.parser(), extensionRegistryLite));
                        } else if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    obj = 1;
                } catch (CodedInputStream codedInputStream2) {
                    throw codedInputStream2.setUnfinishedMessage(this);
                } catch (IOException e) {
                    throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.counters_ = Collections.unmodifiableList(this.counters_);
                    }
                    if ((i & 2) == 2) {
                        this.timers_ = Collections.unmodifiableList(this.timers_);
                    }
                    if ((i & 4) == 4) {
                        this.levels_ = Collections.unmodifiableList(this.levels_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
            if ((i & 1) == 1) {
                this.counters_ = Collections.unmodifiableList(this.counters_);
            }
            if ((i & 2) == 2) {
                this.timers_ = Collections.unmodifiableList(this.timers_);
            }
            if ((i & 4) == 4) {
                this.levels_ = Collections.unmodifiableList(this.levels_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
        }

        public static final Descriptor getDescriptor() {
            return OpMetrics.internal_static_com_snapchat_snapkit_metrics_Metrics_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return OpMetrics.f21763x9886acc8.ensureFieldAccessorsInitialized(Metrics.class, Builder.class);
        }

        public List<CounterMetric> getCountersList() {
            return this.counters_;
        }

        public List<? extends CounterMetricOrBuilder> getCountersOrBuilderList() {
            return this.counters_;
        }

        public int getCountersCount() {
            return this.counters_.size();
        }

        public CounterMetric getCounters(int i) {
            return (CounterMetric) this.counters_.get(i);
        }

        public CounterMetricOrBuilder getCountersOrBuilder(int i) {
            return (CounterMetricOrBuilder) this.counters_.get(i);
        }

        public List<TimerMetric> getTimersList() {
            return this.timers_;
        }

        public List<? extends TimerMetricOrBuilder> getTimersOrBuilderList() {
            return this.timers_;
        }

        public int getTimersCount() {
            return this.timers_.size();
        }

        public TimerMetric getTimers(int i) {
            return (TimerMetric) this.timers_.get(i);
        }

        public TimerMetricOrBuilder getTimersOrBuilder(int i) {
            return (TimerMetricOrBuilder) this.timers_.get(i);
        }

        public List<LevelMetric> getLevelsList() {
            return this.levels_;
        }

        public List<? extends LevelMetricOrBuilder> getLevelsOrBuilderList() {
            return this.levels_;
        }

        public int getLevelsCount() {
            return this.levels_.size();
        }

        public LevelMetric getLevels(int i) {
            return (LevelMetric) this.levels_.get(i);
        }

        public LevelMetricOrBuilder getLevelsOrBuilder(int i) {
            return (LevelMetricOrBuilder) this.levels_.get(i);
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
            int i;
            for (i = 0; i < this.counters_.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.counters_.get(i));
            }
            for (i = 0; i < this.timers_.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.timers_.get(i));
            }
            for (int i2 = 0; i2 < this.levels_.size(); i2++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.levels_.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2;
            int i3 = 0;
            for (i2 = 0; i2 < this.counters_.size(); i2++) {
                i3 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.counters_.get(i2));
            }
            for (i2 = 0; i2 < this.timers_.size(); i2++) {
                i3 += CodedOutputStream.computeMessageSize(2, (MessageLite) this.timers_.get(i2));
            }
            for (i = 0; i < this.levels_.size(); i++) {
                i3 += CodedOutputStream.computeMessageSize(3, (MessageLite) this.levels_.get(i));
            }
            i3 += this.unknownFields.getSerializedSize();
            this.memoizedSize = i3;
            return i3;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Metrics)) {
                return super.equals(obj);
            }
            Metrics metrics = (Metrics) obj;
            Object obj2 = ((getCountersList().equals(metrics.getCountersList()) ? 1 : null) == null || !getTimersList().equals(metrics.getTimersList())) ? null : 1;
            obj2 = (obj2 == null || !getLevelsList().equals(metrics.getLevelsList())) ? null : 1;
            if (obj2 == null || this.unknownFields.equals(metrics.unknownFields) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (getCountersCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getCountersList().hashCode();
            }
            if (getTimersCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getTimersList().hashCode();
            }
            if (getLevelsCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + getLevelsList().hashCode();
            }
            hashCode = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Metrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Metrics) PARSER.parseFrom(byteBuffer);
        }

        public static Metrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Metrics) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Metrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Metrics) PARSER.parseFrom(byteString);
        }

        public static Metrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Metrics) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Metrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Metrics) PARSER.parseFrom(bArr);
        }

        public static Metrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Metrics) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Metrics parseFrom(InputStream inputStream) throws IOException {
            return (Metrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Metrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Metrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Metrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Metrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Metrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Metrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Metrics parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Metrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Metrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Metrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Metrics metrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metrics);
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

        public static Metrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Metrics> parser() {
            return PARSER;
        }

        public Parser<Metrics> getParserForType() {
            return PARSER;
        }

        public Metrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class TimerMetric extends GeneratedMessageV3 implements TimerMetricOrBuilder {
        private static final TimerMetric DEFAULT_INSTANCE = new TimerMetric();
        public static final int LATENCY_MILLIS_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        private static final Parser<TimerMetric> PARSER = new C79171();
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private long latencyMillis_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private Timestamp timestamp_;

        /* renamed from: com.snapchat.kit.sdk.core.metrics.model.OpMetrics$TimerMetric$1 */
        static class C79171 extends AbstractParser<TimerMetric> {
            C79171() {
            }

            public TimerMetric parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TimerMetric(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements TimerMetricOrBuilder {
            private long latencyMillis_;
            private Object name_;
            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> timestampBuilder_;
            private Timestamp timestamp_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptor getDescriptor() {
                return OpMetrics.f21764x7cb7d8f8;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return OpMetrics.f21765x591a8776.ensureFieldAccessorsInitialized(TimerMetric.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.timestamp_ = null;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.timestamp_ = null;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                TimerMetric.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.name_ = "";
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                this.latencyMillis_ = 0;
                return this;
            }

            public Descriptor getDescriptorForType() {
                return OpMetrics.f21764x7cb7d8f8;
            }

            public TimerMetric getDefaultInstanceForType() {
                return TimerMetric.getDefaultInstance();
            }

            public TimerMetric build() {
                Object buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
            }

            public TimerMetric buildPartial() {
                TimerMetric timerMetric = new TimerMetric((com.google.protobuf.GeneratedMessageV3.Builder) this);
                timerMetric.name_ = this.name_;
                if (this.timestampBuilder_ == null) {
                    timerMetric.timestamp_ = this.timestamp_;
                } else {
                    timerMetric.timestamp_ = (Timestamp) this.timestampBuilder_.build();
                }
                timerMetric.latencyMillis_ = this.latencyMillis_;
                onBuilt();
                return timerMetric;
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
                if (message instanceof TimerMetric) {
                    return mergeFrom((TimerMetric) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TimerMetric timerMetric) {
                if (timerMetric == TimerMetric.getDefaultInstance()) {
                    return this;
                }
                if (!timerMetric.getName().isEmpty()) {
                    this.name_ = timerMetric.name_;
                    onChanged();
                }
                if (timerMetric.hasTimestamp()) {
                    mergeTimestamp(timerMetric.getTimestamp());
                }
                if (timerMetric.getLatencyMillis() != 0) {
                    setLatencyMillis(timerMetric.getLatencyMillis());
                }
                mergeUnknownFields(timerMetric.unknownFields);
                onChanged();
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                TimerMetric timerMetric;
                TimerMetric timerMetric2 = null;
                try {
                    TimerMetric timerMetric3 = (TimerMetric) TimerMetric.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (timerMetric3 != null) {
                        mergeFrom(timerMetric3);
                    }
                    return this;
                } catch (CodedInputStream codedInputStream2) {
                    timerMetric = (TimerMetric) codedInputStream2.getUnfinishedMessage();
                    throw codedInputStream2.unwrapIOException();
                } catch (Throwable th) {
                    codedInputStream2 = th;
                    timerMetric2 = timerMetric;
                    if (timerMetric2 != null) {
                        mergeFrom(timerMetric2);
                    }
                    throw codedInputStream2;
                }
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String toStringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = toStringUtf8;
                return toStringUtf8;
            }

            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setName(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = TimerMetric.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                if (byteString == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public boolean hasTimestamp() {
                if (this.timestampBuilder_ == null) {
                    if (this.timestamp_ == null) {
                        return false;
                    }
                }
                return true;
            }

            public Timestamp getTimestamp() {
                if (this.timestampBuilder_ != null) {
                    return (Timestamp) this.timestampBuilder_.getMessage();
                }
                return this.timestamp_ == null ? Timestamp.getDefaultInstance() : this.timestamp_;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                if (this.timestampBuilder_ != null) {
                    this.timestampBuilder_.setMessage(timestamp);
                } else if (timestamp == null) {
                    throw new NullPointerException();
                } else {
                    this.timestamp_ = timestamp;
                    onChanged();
                }
                return this;
            }

            public Builder setTimestamp(com.google.protobuf.Timestamp.Builder builder) {
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = builder.build();
                    onChanged();
                } else {
                    this.timestampBuilder_.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                if (this.timestampBuilder_ == null) {
                    if (this.timestamp_ != null) {
                        this.timestamp_ = Timestamp.newBuilder(this.timestamp_).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.timestamp_ = timestamp;
                    }
                    onChanged();
                } else {
                    this.timestampBuilder_.mergeFrom(timestamp);
                }
                return this;
            }

            public Builder clearTimestamp() {
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                    onChanged();
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
                onChanged();
                return (com.google.protobuf.Timestamp.Builder) getTimestampFieldBuilder().getBuilder();
            }

            public TimestampOrBuilder getTimestampOrBuilder() {
                if (this.timestampBuilder_ != null) {
                    return (TimestampOrBuilder) this.timestampBuilder_.getMessageOrBuilder();
                }
                return this.timestamp_ == null ? Timestamp.getDefaultInstance() : this.timestamp_;
            }

            private SingleFieldBuilderV3<Timestamp, com.google.protobuf.Timestamp.Builder, TimestampOrBuilder> getTimestampFieldBuilder() {
                if (this.timestampBuilder_ == null) {
                    this.timestampBuilder_ = new SingleFieldBuilderV3(getTimestamp(), getParentForChildren(), isClean());
                    this.timestamp_ = null;
                }
                return this.timestampBuilder_;
            }

            public long getLatencyMillis() {
                return this.latencyMillis_;
            }

            public Builder setLatencyMillis(long j) {
                this.latencyMillis_ = j;
                onChanged();
                return this;
            }

            public Builder clearLatencyMillis() {
                this.latencyMillis_ = 0;
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

        private TimerMetric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private TimerMetric() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.latencyMillis_ = 0;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private TimerMetric(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.name_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            com.google.protobuf.Timestamp.Builder builder = null;
                            if (this.timestamp_ != null) {
                                builder = this.timestamp_.toBuilder();
                            }
                            this.timestamp_ = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom(this.timestamp_);
                                this.timestamp_ = builder.buildPartial();
                            }
                        } else if (readTag == 24) {
                            this.latencyMillis_ = codedInputStream.readInt64();
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
            return OpMetrics.f21764x7cb7d8f8;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return OpMetrics.f21765x591a8776.ensureFieldAccessorsInitialized(TimerMetric.class, Builder.class);
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String toStringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = toStringUtf8;
            return toStringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        public Timestamp getTimestamp() {
            return this.timestamp_ == null ? Timestamp.getDefaultInstance() : this.timestamp_;
        }

        public TimestampOrBuilder getTimestampOrBuilder() {
            return getTimestamp();
        }

        public long getLatencyMillis() {
            return this.latencyMillis_;
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
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if (this.timestamp_ != null) {
                codedOutputStream.writeMessage(2, getTimestamp());
            }
            if (this.latencyMillis_ != 0) {
                codedOutputStream.writeInt64(3, this.latencyMillis_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if (!getNameBytes().isEmpty()) {
                i = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
            }
            if (this.timestamp_ != null) {
                i += CodedOutputStream.computeMessageSize(2, getTimestamp());
            }
            if (this.latencyMillis_ != 0) {
                i += CodedOutputStream.computeInt64Size(3, this.latencyMillis_);
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
            if (!(obj instanceof TimerMetric)) {
                return super.equals(obj);
            }
            TimerMetric timerMetric = (TimerMetric) obj;
            Object obj2 = ((getName().equals(timerMetric.getName()) ? 1 : null) == null || hasTimestamp() != timerMetric.hasTimestamp()) ? null : 1;
            if (hasTimestamp()) {
                obj2 = (obj2 == null || !getTimestamp().equals(timerMetric.getTimestamp())) ? null : 1;
            }
            obj2 = (obj2 == null || getLatencyMillis() != timerMetric.getLatencyMillis()) ? null : 1;
            if (obj2 == null || this.unknownFields.equals(timerMetric.unknownFields) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
            if (hasTimestamp()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getTimestamp().hashCode();
            }
            hashCode = (((((hashCode * 37) + 3) * 53) + Internal.hashLong(getLatencyMillis())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static TimerMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TimerMetric) PARSER.parseFrom(byteBuffer);
        }

        public static TimerMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimerMetric) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static TimerMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TimerMetric) PARSER.parseFrom(byteString);
        }

        public static TimerMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimerMetric) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TimerMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TimerMetric) PARSER.parseFrom(bArr);
        }

        public static TimerMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimerMetric) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TimerMetric parseFrom(InputStream inputStream) throws IOException {
            return (TimerMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TimerMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimerMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TimerMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TimerMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TimerMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimerMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TimerMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TimerMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TimerMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimerMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(TimerMetric timerMetric) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(timerMetric);
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

        public static TimerMetric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TimerMetric> parser() {
            return PARSER;
        }

        public Parser<TimerMetric> getParserForType() {
            return PARSER;
        }

        public TimerMetric getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private OpMetrics() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TimestampProto.getDescriptor()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010op_metrics.proto\u0012\u001ccom.snapchat.snapkit.metrics\u001a\u001fgoogle/protobuf/timestamp.proto\"[\n\rCounterMetric\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012-\n\ttimestamp\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\r\n\u0005count\u0018\u0003 \u0001(\u0003\"b\n\u000bTimerMetric\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012-\n\ttimestamp\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u0016\n\u000elatency_millis\u0018\u0003 \u0001(\u0003\"Y\n\u000bLevelMetric\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012-\n\ttimestamp\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\r\n\u0005level\u0018\u0003 \u0001(\u0003\"¾\u0001\n\u0007Metrics\u0012=\n\bcounters\u0018\u0001 \u0003(\u000b2+.com.snapchat.snapkit.metrics.CounterMetric\u00129\n\u0006timers\u0018\u0002 \u0003(\u000b2).com.snapchat.snapkit.metrics.TimerMetric\u00129\n\u0006levels\u0018\u0003 \u0003(\u000b2).com.snapchat.snapkit.metrics.LevelMetricB,\n'com.snapchat.kit.sdk.core.metrics.model \u0001\u0001b\u0006proto3"}, fileDescriptorArr, new C71511());
        TimestampProto.getDescriptor();
    }
}
