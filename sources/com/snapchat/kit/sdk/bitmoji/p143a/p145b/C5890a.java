package com.snapchat.kit.sdk.bitmoji.p143a.p145b;

import android.support.annotation.NonNull;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.BitmojiScope;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.OpMetricFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import javax.inject.Inject;

@BitmojiScope
/* renamed from: com.snapchat.kit.sdk.bitmoji.a.b.a */
public class C5890a {
    /* renamed from: a */
    private static final String f21591a = ("1.0.2" != null ? "1.0.2".replace('.', '_') : null);
    /* renamed from: b */
    private final MetricQueue<OpMetric> f21592b;
    /* renamed from: c */
    private final Random f21593c;
    /* renamed from: d */
    private final Map<String, Long> f21594d = new HashMap();

    @Inject
    C5890a(MetricQueue<OpMetric> metricQueue, Random random) {
        this.f21592b = metricQueue;
        this.f21593c = random;
    }

    /* renamed from: a */
    public synchronized void m25425a(@NonNull String str, long j) {
        if (!this.f21594d.containsKey(str)) {
            this.f21594d.put(str, Long.valueOf(0));
        }
        this.f21594d.put(str, Long.valueOf(((Long) this.f21594d.get(str)).longValue() + j));
    }

    /* renamed from: b */
    public void m25427b(@NonNull String str, long j) {
        this.f21592b.push(OpMetricFactory.createTimer(C5890a.m25423a(str), j));
    }

    /* renamed from: a */
    public void m25426a(@NonNull String str, long j, float f) {
        if (this.f21593c.nextFloat() <= f) {
            m25427b(str, j);
        }
    }

    /* renamed from: a */
    public synchronized void m25424a() {
        for (Entry entry : this.f21594d.entrySet()) {
            this.f21592b.push(OpMetricFactory.createCount(C5890a.m25423a((String) entry.getKey()), ((Long) entry.getValue()).longValue()));
        }
        this.f21594d.clear();
    }

    /* renamed from: a */
    private static String m25423a(@NonNull String str) {
        return String.format("%s:bitmoji:%s", new Object[]{f21591a, str});
    }
}
