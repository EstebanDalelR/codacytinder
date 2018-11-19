package com.snapchat.kit.sdk.login.p150a;

import android.support.annotation.NonNull;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.OpMetricFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import javax.inject.Inject;

/* renamed from: com.snapchat.kit.sdk.login.a.a */
public class C5954a {
    /* renamed from: a */
    private static final String f21783a = ("1.0.2" != null ? "1.0.2".replace('.', '_') : null);
    /* renamed from: b */
    private final MetricQueue<OpMetric> f21784b;

    @Inject
    public C5954a(MetricQueue<OpMetric> metricQueue) {
        this.f21784b = metricQueue;
    }

    /* renamed from: a */
    public synchronized void m25570a(@NonNull String str, long j) {
        this.f21784b.push(OpMetricFactory.createCount(C5954a.m25569a(str), j));
    }

    /* renamed from: b */
    public synchronized void m25571b(@NonNull String str, long j) {
        this.f21784b.push(OpMetricFactory.createTimer(C5954a.m25569a(str), j));
    }

    /* renamed from: a */
    private static String m25569a(@NonNull String str) {
        return String.format("%s:login:%s", new Object[]{f21783a, str});
    }
}
