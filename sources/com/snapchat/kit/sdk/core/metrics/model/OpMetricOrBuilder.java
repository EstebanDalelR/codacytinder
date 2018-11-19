package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.MessageOrBuilder;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric.MetricCase;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.CounterMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.CounterMetricOrBuilder;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.LevelMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.LevelMetricOrBuilder;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.TimerMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.TimerMetricOrBuilder;

public interface OpMetricOrBuilder extends MessageOrBuilder {
    CounterMetric getCounterMetric();

    CounterMetricOrBuilder getCounterMetricOrBuilder();

    LevelMetric getLevelMetric();

    LevelMetricOrBuilder getLevelMetricOrBuilder();

    MetricCase getMetricCase();

    TimerMetric getTimerMetric();

    TimerMetricOrBuilder getTimerMetricOrBuilder();

    boolean hasCounterMetric();

    boolean hasLevelMetric();

    boolean hasTimerMetric();
}
