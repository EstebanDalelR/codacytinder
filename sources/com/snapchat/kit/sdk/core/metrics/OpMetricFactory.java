package com.snapchat.kit.sdk.core.metrics;

import android.support.annotation.NonNull;
import com.google.protobuf.Timestamp;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.CounterMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.LevelMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.TimerMetric;
import java.util.concurrent.TimeUnit;

public class OpMetricFactory {
    /* renamed from: a */
    private static final long f21704a = TimeUnit.SECONDS.toMillis(1);
    /* renamed from: b */
    private static final int f21705b = ((int) TimeUnit.MILLISECONDS.toNanos(1));

    @NonNull
    public static OpMetric createCount(String str, long j) {
        return OpMetric.newBuilder().setCounterMetric(CounterMetric.newBuilder().setName(str).setCount(j).setTimestamp(m25526a())).build();
    }

    @NonNull
    public static OpMetric createTimer(String str, long j) {
        return OpMetric.newBuilder().setTimerMetric(TimerMetric.newBuilder().setName(str).setLatencyMillis(j).setTimestamp(m25526a())).build();
    }

    @NonNull
    public static OpMetric createLevel(String str, long j) {
        return OpMetric.newBuilder().setLevelMetric(LevelMetric.newBuilder().setName(str).setLevel(j).setTimestamp(m25526a())).build();
    }

    /* renamed from: a */
    private static Timestamp m25526a() {
        long currentTimeMillis = System.currentTimeMillis();
        return Timestamp.newBuilder().setSeconds(currentTimeMillis / f21704a).setNanos(((int) (currentTimeMillis % f21704a)) * f21705b).build();
    }
}
