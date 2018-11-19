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
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.CounterMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.CounterMetricOrBuilder;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.LevelMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.LevelMetricOrBuilder;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.TimerMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.TimerMetricOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OpMetric extends GeneratedMessageV3 implements OpMetricOrBuilder {
    public static final int COUNTER_METRIC_FIELD_NUMBER = 1;
    private static final OpMetric DEFAULT_INSTANCE = new OpMetric();
    public static final int LEVEL_METRIC_FIELD_NUMBER = 3;
    private static final Parser<OpMetric> PARSER = new C79131();
    public static final int TIMER_METRIC_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int metricCase_;
    private Object metric_;

    public enum MetricCase implements EnumLite {
        COUNTER_METRIC(1),
        TIMER_METRIC(2),
        LEVEL_METRIC(3),
        METRIC_NOT_SET(0);
        
        private final int value;

        private MetricCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static MetricCase valueOf(int i) {
            return forNumber(i);
        }

        public static MetricCase forNumber(int i) {
            switch (i) {
                case 0:
                    return METRIC_NOT_SET;
                case 1:
                    return COUNTER_METRIC;
                case 2:
                    return TIMER_METRIC;
                case 3:
                    return LEVEL_METRIC;
                default:
                    return 0;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.metrics.model.OpMetric$1 */
    static class C79131 extends AbstractParser<OpMetric> {
        C79131() {
        }

        public OpMetric parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new OpMetric(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements OpMetricOrBuilder {
        private SingleFieldBuilderV3<CounterMetric, com.snapchat.kit.sdk.core.metrics.model.OpMetrics.CounterMetric.Builder, CounterMetricOrBuilder> counterMetricBuilder_;
        private SingleFieldBuilderV3<LevelMetric, com.snapchat.kit.sdk.core.metrics.model.OpMetrics.LevelMetric.Builder, LevelMetricOrBuilder> levelMetricBuilder_;
        private int metricCase_;
        private Object metric_;
        private SingleFieldBuilderV3<TimerMetric, com.snapchat.kit.sdk.core.metrics.model.OpMetrics.TimerMetric.Builder, TimerMetricOrBuilder> timerMetricBuilder_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptor getDescriptor() {
            return MetricWrapper.f21756x7d71b049;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MetricWrapper.f21757xf3b47dc7.ensureFieldAccessorsInitialized(OpMetric.class, Builder.class);
        }

        private Builder() {
            this.metricCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent builderParent) {
            super(builderParent);
            this.metricCase_ = null;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            OpMetric.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.metricCase_ = 0;
            this.metric_ = null;
            return this;
        }

        public Descriptor getDescriptorForType() {
            return MetricWrapper.f21756x7d71b049;
        }

        public OpMetric getDefaultInstanceForType() {
            return OpMetric.getDefaultInstance();
        }

        public OpMetric build() {
            Object buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public OpMetric buildPartial() {
            OpMetric opMetric = new OpMetric((com.google.protobuf.GeneratedMessageV3.Builder) this);
            if (this.metricCase_ == 1) {
                if (this.counterMetricBuilder_ == null) {
                    opMetric.metric_ = this.metric_;
                } else {
                    opMetric.metric_ = this.counterMetricBuilder_.build();
                }
            }
            if (this.metricCase_ == 2) {
                if (this.timerMetricBuilder_ == null) {
                    opMetric.metric_ = this.metric_;
                } else {
                    opMetric.metric_ = this.timerMetricBuilder_.build();
                }
            }
            if (this.metricCase_ == 3) {
                if (this.levelMetricBuilder_ == null) {
                    opMetric.metric_ = this.metric_;
                } else {
                    opMetric.metric_ = this.levelMetricBuilder_.build();
                }
            }
            opMetric.metricCase_ = this.metricCase_;
            onBuilt();
            return opMetric;
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
            if (message instanceof OpMetric) {
                return mergeFrom((OpMetric) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(OpMetric opMetric) {
            if (opMetric == OpMetric.getDefaultInstance()) {
                return this;
            }
            switch (opMetric.getMetricCase()) {
                case COUNTER_METRIC:
                    mergeCounterMetric(opMetric.getCounterMetric());
                    break;
                case TIMER_METRIC:
                    mergeTimerMetric(opMetric.getTimerMetric());
                    break;
                case LEVEL_METRIC:
                    mergeLevelMetric(opMetric.getLevelMetric());
                    break;
                default:
                    break;
            }
            mergeUnknownFields(opMetric.unknownFields);
            onChanged();
            return this;
        }

        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            OpMetric opMetric;
            OpMetric opMetric2 = null;
            try {
                OpMetric opMetric3 = (OpMetric) OpMetric.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                if (opMetric3 != null) {
                    mergeFrom(opMetric3);
                }
                return this;
            } catch (CodedInputStream codedInputStream2) {
                opMetric = (OpMetric) codedInputStream2.getUnfinishedMessage();
                throw codedInputStream2.unwrapIOException();
            } catch (Throwable th) {
                codedInputStream2 = th;
                opMetric2 = opMetric;
                if (opMetric2 != null) {
                    mergeFrom(opMetric2);
                }
                throw codedInputStream2;
            }
        }

        public MetricCase getMetricCase() {
            return MetricCase.forNumber(this.metricCase_);
        }

        public Builder clearMetric() {
            this.metricCase_ = 0;
            this.metric_ = null;
            onChanged();
            return this;
        }

        public boolean hasCounterMetric() {
            return this.metricCase_ == 1;
        }

        public CounterMetric getCounterMetric() {
            if (this.counterMetricBuilder_ == null) {
                if (this.metricCase_ == 1) {
                    return (CounterMetric) this.metric_;
                }
                return CounterMetric.getDefaultInstance();
            } else if (this.metricCase_ == 1) {
                return (CounterMetric) this.counterMetricBuilder_.getMessage();
            } else {
                return CounterMetric.getDefaultInstance();
            }
        }

        public Builder setCounterMetric(CounterMetric counterMetric) {
            if (this.counterMetricBuilder_ != null) {
                this.counterMetricBuilder_.setMessage(counterMetric);
            } else if (counterMetric == null) {
                throw new NullPointerException();
            } else {
                this.metric_ = counterMetric;
                onChanged();
            }
            this.metricCase_ = 1;
            return this;
        }

        public Builder setCounterMetric(com.snapchat.kit.sdk.core.metrics.model.OpMetrics.CounterMetric.Builder builder) {
            if (this.counterMetricBuilder_ == null) {
                this.metric_ = builder.build();
                onChanged();
            } else {
                this.counterMetricBuilder_.setMessage(builder.build());
            }
            this.metricCase_ = 1;
            return this;
        }

        public Builder mergeCounterMetric(CounterMetric counterMetric) {
            if (this.counterMetricBuilder_ == null) {
                if (this.metricCase_ != 1 || this.metric_ == CounterMetric.getDefaultInstance()) {
                    this.metric_ = counterMetric;
                } else {
                    this.metric_ = CounterMetric.newBuilder((CounterMetric) this.metric_).mergeFrom(counterMetric).buildPartial();
                }
                onChanged();
            } else {
                if (this.metricCase_ == 1) {
                    this.counterMetricBuilder_.mergeFrom(counterMetric);
                }
                this.counterMetricBuilder_.setMessage(counterMetric);
            }
            this.metricCase_ = 1;
            return this;
        }

        public Builder clearCounterMetric() {
            if (this.counterMetricBuilder_ != null) {
                if (this.metricCase_ == 1) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                }
                this.counterMetricBuilder_.clear();
            } else if (this.metricCase_ == 1) {
                this.metricCase_ = 0;
                this.metric_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.OpMetrics.CounterMetric.Builder getCounterMetricBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.OpMetrics.CounterMetric.Builder) getCounterMetricFieldBuilder().getBuilder();
        }

        public CounterMetricOrBuilder getCounterMetricOrBuilder() {
            if (this.metricCase_ == 1 && this.counterMetricBuilder_ != null) {
                return (CounterMetricOrBuilder) this.counterMetricBuilder_.getMessageOrBuilder();
            }
            if (this.metricCase_ == 1) {
                return (CounterMetric) this.metric_;
            }
            return CounterMetric.getDefaultInstance();
        }

        private SingleFieldBuilderV3<CounterMetric, com.snapchat.kit.sdk.core.metrics.model.OpMetrics.CounterMetric.Builder, CounterMetricOrBuilder> getCounterMetricFieldBuilder() {
            if (this.counterMetricBuilder_ == null) {
                if (this.metricCase_ != 1) {
                    this.metric_ = CounterMetric.getDefaultInstance();
                }
                this.counterMetricBuilder_ = new SingleFieldBuilderV3((CounterMetric) this.metric_, getParentForChildren(), isClean());
                this.metric_ = null;
            }
            this.metricCase_ = 1;
            onChanged();
            return this.counterMetricBuilder_;
        }

        public boolean hasTimerMetric() {
            return this.metricCase_ == 2;
        }

        public TimerMetric getTimerMetric() {
            if (this.timerMetricBuilder_ == null) {
                if (this.metricCase_ == 2) {
                    return (TimerMetric) this.metric_;
                }
                return TimerMetric.getDefaultInstance();
            } else if (this.metricCase_ == 2) {
                return (TimerMetric) this.timerMetricBuilder_.getMessage();
            } else {
                return TimerMetric.getDefaultInstance();
            }
        }

        public Builder setTimerMetric(TimerMetric timerMetric) {
            if (this.timerMetricBuilder_ != null) {
                this.timerMetricBuilder_.setMessage(timerMetric);
            } else if (timerMetric == null) {
                throw new NullPointerException();
            } else {
                this.metric_ = timerMetric;
                onChanged();
            }
            this.metricCase_ = 2;
            return this;
        }

        public Builder setTimerMetric(com.snapchat.kit.sdk.core.metrics.model.OpMetrics.TimerMetric.Builder builder) {
            if (this.timerMetricBuilder_ == null) {
                this.metric_ = builder.build();
                onChanged();
            } else {
                this.timerMetricBuilder_.setMessage(builder.build());
            }
            this.metricCase_ = 2;
            return this;
        }

        public Builder mergeTimerMetric(TimerMetric timerMetric) {
            if (this.timerMetricBuilder_ == null) {
                if (this.metricCase_ != 2 || this.metric_ == TimerMetric.getDefaultInstance()) {
                    this.metric_ = timerMetric;
                } else {
                    this.metric_ = TimerMetric.newBuilder((TimerMetric) this.metric_).mergeFrom(timerMetric).buildPartial();
                }
                onChanged();
            } else {
                if (this.metricCase_ == 2) {
                    this.timerMetricBuilder_.mergeFrom(timerMetric);
                }
                this.timerMetricBuilder_.setMessage(timerMetric);
            }
            this.metricCase_ = 2;
            return this;
        }

        public Builder clearTimerMetric() {
            if (this.timerMetricBuilder_ != null) {
                if (this.metricCase_ == 2) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                }
                this.timerMetricBuilder_.clear();
            } else if (this.metricCase_ == 2) {
                this.metricCase_ = 0;
                this.metric_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.OpMetrics.TimerMetric.Builder getTimerMetricBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.OpMetrics.TimerMetric.Builder) getTimerMetricFieldBuilder().getBuilder();
        }

        public TimerMetricOrBuilder getTimerMetricOrBuilder() {
            if (this.metricCase_ == 2 && this.timerMetricBuilder_ != null) {
                return (TimerMetricOrBuilder) this.timerMetricBuilder_.getMessageOrBuilder();
            }
            if (this.metricCase_ == 2) {
                return (TimerMetric) this.metric_;
            }
            return TimerMetric.getDefaultInstance();
        }

        private SingleFieldBuilderV3<TimerMetric, com.snapchat.kit.sdk.core.metrics.model.OpMetrics.TimerMetric.Builder, TimerMetricOrBuilder> getTimerMetricFieldBuilder() {
            if (this.timerMetricBuilder_ == null) {
                if (this.metricCase_ != 2) {
                    this.metric_ = TimerMetric.getDefaultInstance();
                }
                this.timerMetricBuilder_ = new SingleFieldBuilderV3((TimerMetric) this.metric_, getParentForChildren(), isClean());
                this.metric_ = null;
            }
            this.metricCase_ = 2;
            onChanged();
            return this.timerMetricBuilder_;
        }

        public boolean hasLevelMetric() {
            return this.metricCase_ == 3;
        }

        public LevelMetric getLevelMetric() {
            if (this.levelMetricBuilder_ == null) {
                if (this.metricCase_ == 3) {
                    return (LevelMetric) this.metric_;
                }
                return LevelMetric.getDefaultInstance();
            } else if (this.metricCase_ == 3) {
                return (LevelMetric) this.levelMetricBuilder_.getMessage();
            } else {
                return LevelMetric.getDefaultInstance();
            }
        }

        public Builder setLevelMetric(LevelMetric levelMetric) {
            if (this.levelMetricBuilder_ != null) {
                this.levelMetricBuilder_.setMessage(levelMetric);
            } else if (levelMetric == null) {
                throw new NullPointerException();
            } else {
                this.metric_ = levelMetric;
                onChanged();
            }
            this.metricCase_ = 3;
            return this;
        }

        public Builder setLevelMetric(com.snapchat.kit.sdk.core.metrics.model.OpMetrics.LevelMetric.Builder builder) {
            if (this.levelMetricBuilder_ == null) {
                this.metric_ = builder.build();
                onChanged();
            } else {
                this.levelMetricBuilder_.setMessage(builder.build());
            }
            this.metricCase_ = 3;
            return this;
        }

        public Builder mergeLevelMetric(LevelMetric levelMetric) {
            if (this.levelMetricBuilder_ == null) {
                if (this.metricCase_ != 3 || this.metric_ == LevelMetric.getDefaultInstance()) {
                    this.metric_ = levelMetric;
                } else {
                    this.metric_ = LevelMetric.newBuilder((LevelMetric) this.metric_).mergeFrom(levelMetric).buildPartial();
                }
                onChanged();
            } else {
                if (this.metricCase_ == 3) {
                    this.levelMetricBuilder_.mergeFrom(levelMetric);
                }
                this.levelMetricBuilder_.setMessage(levelMetric);
            }
            this.metricCase_ = 3;
            return this;
        }

        public Builder clearLevelMetric() {
            if (this.levelMetricBuilder_ != null) {
                if (this.metricCase_ == 3) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                }
                this.levelMetricBuilder_.clear();
            } else if (this.metricCase_ == 3) {
                this.metricCase_ = 0;
                this.metric_ = null;
                onChanged();
            }
            return this;
        }

        public com.snapchat.kit.sdk.core.metrics.model.OpMetrics.LevelMetric.Builder getLevelMetricBuilder() {
            return (com.snapchat.kit.sdk.core.metrics.model.OpMetrics.LevelMetric.Builder) getLevelMetricFieldBuilder().getBuilder();
        }

        public LevelMetricOrBuilder getLevelMetricOrBuilder() {
            if (this.metricCase_ == 3 && this.levelMetricBuilder_ != null) {
                return (LevelMetricOrBuilder) this.levelMetricBuilder_.getMessageOrBuilder();
            }
            if (this.metricCase_ == 3) {
                return (LevelMetric) this.metric_;
            }
            return LevelMetric.getDefaultInstance();
        }

        private SingleFieldBuilderV3<LevelMetric, com.snapchat.kit.sdk.core.metrics.model.OpMetrics.LevelMetric.Builder, LevelMetricOrBuilder> getLevelMetricFieldBuilder() {
            if (this.levelMetricBuilder_ == null) {
                if (this.metricCase_ != 3) {
                    this.metric_ = LevelMetric.getDefaultInstance();
                }
                this.levelMetricBuilder_ = new SingleFieldBuilderV3((LevelMetric) this.metric_, getParentForChildren(), isClean());
                this.metric_ = null;
            }
            this.metricCase_ = 3;
            onChanged();
            return this.levelMetricBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    private OpMetric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.metricCase_ = null;
        this.memoizedIsInitialized = (byte) -1;
    }

    private OpMetric() {
        this.metricCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private OpMetric(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                    com.snapchat.kit.sdk.core.metrics.model.OpMetrics.CounterMetric.Builder builder = null;
                    if (readTag == 10) {
                        if (this.metricCase_ == 1) {
                            builder = ((CounterMetric) this.metric_).toBuilder();
                        }
                        this.metric_ = codedInputStream.readMessage(CounterMetric.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom((CounterMetric) this.metric_);
                            this.metric_ = builder.buildPartial();
                        }
                        this.metricCase_ = 1;
                    } else if (readTag == 18) {
                        com.snapchat.kit.sdk.core.metrics.model.OpMetrics.TimerMetric.Builder toBuilder;
                        if (this.metricCase_ == 2) {
                            toBuilder = ((TimerMetric) this.metric_).toBuilder();
                        }
                        this.metric_ = codedInputStream.readMessage(TimerMetric.parser(), extensionRegistryLite);
                        if (toBuilder != null) {
                            toBuilder.mergeFrom((TimerMetric) this.metric_);
                            this.metric_ = toBuilder.buildPartial();
                        }
                        this.metricCase_ = 2;
                    } else if (readTag == 26) {
                        com.snapchat.kit.sdk.core.metrics.model.OpMetrics.LevelMetric.Builder toBuilder2;
                        if (this.metricCase_ == 3) {
                            toBuilder2 = ((LevelMetric) this.metric_).toBuilder();
                        }
                        this.metric_ = codedInputStream.readMessage(LevelMetric.parser(), extensionRegistryLite);
                        if (toBuilder2 != null) {
                            toBuilder2.mergeFrom((LevelMetric) this.metric_);
                            this.metric_ = toBuilder2.buildPartial();
                        }
                        this.metricCase_ = 3;
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
        return MetricWrapper.f21756x7d71b049;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return MetricWrapper.f21757xf3b47dc7.ensureFieldAccessorsInitialized(OpMetric.class, Builder.class);
    }

    public MetricCase getMetricCase() {
        return MetricCase.forNumber(this.metricCase_);
    }

    public boolean hasCounterMetric() {
        return this.metricCase_ == 1;
    }

    public CounterMetric getCounterMetric() {
        if (this.metricCase_ == 1) {
            return (CounterMetric) this.metric_;
        }
        return CounterMetric.getDefaultInstance();
    }

    public CounterMetricOrBuilder getCounterMetricOrBuilder() {
        if (this.metricCase_ == 1) {
            return (CounterMetric) this.metric_;
        }
        return CounterMetric.getDefaultInstance();
    }

    public boolean hasTimerMetric() {
        return this.metricCase_ == 2;
    }

    public TimerMetric getTimerMetric() {
        if (this.metricCase_ == 2) {
            return (TimerMetric) this.metric_;
        }
        return TimerMetric.getDefaultInstance();
    }

    public TimerMetricOrBuilder getTimerMetricOrBuilder() {
        if (this.metricCase_ == 2) {
            return (TimerMetric) this.metric_;
        }
        return TimerMetric.getDefaultInstance();
    }

    public boolean hasLevelMetric() {
        return this.metricCase_ == 3;
    }

    public LevelMetric getLevelMetric() {
        if (this.metricCase_ == 3) {
            return (LevelMetric) this.metric_;
        }
        return LevelMetric.getDefaultInstance();
    }

    public LevelMetricOrBuilder getLevelMetricOrBuilder() {
        if (this.metricCase_ == 3) {
            return (LevelMetric) this.metric_;
        }
        return LevelMetric.getDefaultInstance();
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
        if (this.metricCase_ == 1) {
            codedOutputStream.writeMessage(1, (CounterMetric) this.metric_);
        }
        if (this.metricCase_ == 2) {
            codedOutputStream.writeMessage(2, (TimerMetric) this.metric_);
        }
        if (this.metricCase_ == 3) {
            codedOutputStream.writeMessage(3, (LevelMetric) this.metric_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        i = 0;
        if (this.metricCase_ == 1) {
            i = 0 + CodedOutputStream.computeMessageSize(1, (CounterMetric) this.metric_);
        }
        if (this.metricCase_ == 2) {
            i += CodedOutputStream.computeMessageSize(2, (TimerMetric) this.metric_);
        }
        if (this.metricCase_ == 3) {
            i += CodedOutputStream.computeMessageSize(3, (LevelMetric) this.metric_);
        }
        i += this.unknownFields.getSerializedSize();
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
        r1 = r5 instanceof com.snapchat.kit.sdk.core.metrics.model.OpMetric;
        if (r1 != 0) goto L_0x000d;
    L_0x0008:
        r5 = super.equals(r5);
        return r5;
    L_0x000d:
        r5 = (com.snapchat.kit.sdk.core.metrics.model.OpMetric) r5;
        r1 = r4.getMetricCase();
        r2 = r5.getMetricCase();
        r1 = r1.equals(r2);
        r2 = 0;
        if (r1 == 0) goto L_0x0020;
    L_0x001e:
        r1 = 1;
        goto L_0x0021;
    L_0x0020:
        r1 = 0;
    L_0x0021:
        if (r1 != 0) goto L_0x0024;
    L_0x0023:
        return r2;
    L_0x0024:
        r3 = r4.metricCase_;
        switch(r3) {
            case 1: goto L_0x004f;
            case 2: goto L_0x003e;
            case 3: goto L_0x002a;
            default: goto L_0x0029;
        };
    L_0x0029:
        goto L_0x0060;
    L_0x002a:
        if (r1 == 0) goto L_0x003c;
    L_0x002c:
        r1 = r4.getLevelMetric();
        r3 = r5.getLevelMetric();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003c;
    L_0x003a:
        r1 = 1;
        goto L_0x0060;
    L_0x003c:
        r1 = 0;
        goto L_0x0060;
    L_0x003e:
        if (r1 == 0) goto L_0x003c;
    L_0x0040:
        r1 = r4.getTimerMetric();
        r3 = r5.getTimerMetric();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003c;
    L_0x004e:
        goto L_0x003a;
    L_0x004f:
        if (r1 == 0) goto L_0x003c;
    L_0x0051:
        r1 = r4.getCounterMetric();
        r3 = r5.getCounterMetric();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003c;
    L_0x005f:
        goto L_0x003a;
    L_0x0060:
        if (r1 == 0) goto L_0x006d;
    L_0x0062:
        r1 = r4.unknownFields;
        r5 = r5.unknownFields;
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x006d;
    L_0x006c:
        goto L_0x006e;
    L_0x006d:
        r0 = 0;
    L_0x006e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.OpMetric.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        switch (this.metricCase_) {
            case 1:
                hashCode = (((hashCode * 37) + 1) * 53) + getCounterMetric().hashCode();
                break;
            case 2:
                hashCode = (((hashCode * 37) + 2) * 53) + getTimerMetric().hashCode();
                break;
            case 3:
                hashCode = (((hashCode * 37) + 3) * 53) + getLevelMetric().hashCode();
                break;
            default:
                break;
        }
        hashCode = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static OpMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OpMetric) PARSER.parseFrom(byteBuffer);
    }

    public static OpMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OpMetric) PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static OpMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OpMetric) PARSER.parseFrom(byteString);
    }

    public static OpMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OpMetric) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static OpMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OpMetric) PARSER.parseFrom(bArr);
    }

    public static OpMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OpMetric) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static OpMetric parseFrom(InputStream inputStream) throws IOException {
        return (OpMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static OpMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OpMetric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static OpMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OpMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static OpMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OpMetric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static OpMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OpMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static OpMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OpMetric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(OpMetric opMetric) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(opMetric);
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

    public static OpMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<OpMetric> parser() {
        return PARSER;
    }

    public Parser<OpMetric> getParserForType() {
        return PARSER;
    }

    public OpMetric getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
