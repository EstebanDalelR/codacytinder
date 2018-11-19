package com.snapchat.kit.sdk.p142a;

import android.support.annotation.NonNull;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.OpMetricFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.Lazy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.snapchat.kit.sdk.a.a */
public class C5876a {
    /* renamed from: a */
    private final Lazy<MetricQueue<OpMetric>> f21564a;
    /* renamed from: b */
    private final Map<C5875a, Long> f21565b = new ConcurrentHashMap();

    /* renamed from: com.snapchat.kit.sdk.a.a$a */
    public enum C5875a {
        REVOKE,
        REFRESH,
        GRANT
    }

    public C5876a(Lazy<MetricQueue<OpMetric>> lazy) {
        this.f21564a = lazy;
    }

    /* renamed from: a */
    public synchronized void m25391a(@NonNull String str) {
        ((MetricQueue) this.f21564a.get()).push(OpMetricFactory.createCount(C5876a.m25386b(str), 1));
    }

    /* renamed from: a */
    public synchronized void m25389a(@NonNull C5875a c5875a) {
        ((MetricQueue) this.f21564a.get()).push(OpMetricFactory.createCount(C5876a.m25388d(c5875a), 1));
        this.f21565b.put(c5875a, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public synchronized void m25390a(C5875a c5875a, boolean z) {
        MetricQueue metricQueue = (MetricQueue) this.f21564a.get();
        if (z) {
            Long l = (Long) this.f21565b.remove(c5875a);
            if (l != null) {
                metricQueue.push(OpMetricFactory.createTimer(m25385b(c5875a), System.currentTimeMillis() - l.longValue()));
            }
        } else {
            metricQueue.push(OpMetricFactory.createCount(C5876a.m25387c(c5875a), 1));
        }
    }

    /* renamed from: b */
    private String m25385b(C5875a c5875a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c5875a.toString().toLowerCase());
        stringBuilder.append("TokenLatency");
        return C5876a.m25386b(stringBuilder.toString());
    }

    /* renamed from: c */
    private static String m25387c(C5875a c5875a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c5875a.toString().toLowerCase());
        stringBuilder.append("TokenFailure");
        return C5876a.m25386b(stringBuilder.toString());
    }

    /* renamed from: d */
    private static String m25388d(C5875a c5875a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c5875a.toString().toLowerCase());
        stringBuilder.append("TokenRequest");
        return C5876a.m25386b(stringBuilder.toString());
    }

    /* renamed from: b */
    private static String m25386b(String str) {
        String replace = "1.0.2" != null ? "1.0.2".replace('.', '_') : null;
        return String.format("%s:login:%s", new Object[]{replace, str});
    }
}
