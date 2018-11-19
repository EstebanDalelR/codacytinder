package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import android.os.Handler;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.business.C5941h;
import com.snapchat.kit.sdk.core.metrics.business.C7143a;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.p148a.C7139a;
import com.snapchat.kit.sdk.core.networking.ClientFactory;
import dagger.Module;
import dagger.Provides;

@Module
/* renamed from: com.snapchat.kit.sdk.core.metrics.c */
public abstract class C5942c {
    @Provides
    /* renamed from: a */
    static C7140a<ServerEvent> m25544a(C7143a c7143a, Handler handler) {
        C7140a<ServerEvent> c7140a = new C7140a(c7143a, handler, 10);
        c7140a.m30800a();
        return c7140a;
    }

    @Provides
    /* renamed from: a */
    static C5941h m25545a(SharedPreferences sharedPreferences) {
        C5941h c5941h = new C5941h(sharedPreferences);
        c5941h.m25539a();
        return c5941h;
    }

    @SnapConnectScope
    @Provides
    /* renamed from: a */
    static MetricQueue<OpMetric> m25542a(C7139a c7139a, Handler handler) {
        MetricQueue c7140a = new C7140a(c7139a, handler, 1);
        c7140a.m30800a();
        return c7140a;
    }

    @SnapConnectScope
    @Provides
    /* renamed from: a */
    static MetricsClient m25543a(ClientFactory clientFactory) {
        return (MetricsClient) clientFactory.generateFingerprintedClient("https://api.snapkit.com", MetricsClient.class);
    }
}
