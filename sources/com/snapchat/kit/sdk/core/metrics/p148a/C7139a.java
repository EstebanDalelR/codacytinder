package com.snapchat.kit.sdk.core.metrics.p148a;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.C5939b;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.Metrics;
import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.Metrics.Builder;
import com.snapchat.kit.sdk.core.metrics.p149b.C5938a;
import java.util.List;
import javax.inject.Inject;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.RetrofitError.Kind;
import retrofit.client.C19370e;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.metrics.a.a */
public class C7139a implements MetricPublisher<OpMetric> {
    /* renamed from: a */
    private final SharedPreferences f25876a;
    /* renamed from: b */
    private final MetricsClient f25877b;
    /* renamed from: c */
    private final C5938a f25878c;

    @Inject
    C7139a(SharedPreferences sharedPreferences, MetricsClient metricsClient, C5938a c5938a) {
        this.f25876a = sharedPreferences;
        this.f25877b = metricsClient;
        this.f25878c = c5938a;
    }

    public void publishMetrics(List<OpMetric> list, final PublishCallback publishCallback) {
        this.f25877b.postOperationalMetrics(C7139a.m30790a(list), new Callback<Object>(this) {
            /* renamed from: b */
            final /* synthetic */ C7139a f25875b;

            public void success(Object obj, C19370e c19370e) {
                publishCallback.onSuccess();
            }

            public void failure(RetrofitError retrofitError) {
                if (retrofitError.c() == Kind.NETWORK) {
                    publishCallback.onNetworkError();
                } else {
                    publishCallback.onServerError(retrofitError);
                }
            }
        });
    }

    public void persistMetrics(List<C5939b<OpMetric>> list) {
        this.f25876a.edit().putString("unsent_operational_metrics", this.f25878c.m25529a(list)).apply();
    }

    public List<C5939b<OpMetric>> getPersistedEvents() {
        return this.f25878c.m25530a(OpMetric.parser(), this.f25876a.getString("unsent_operational_metrics", null));
    }

    /* renamed from: a */
    private static Metrics m30790a(List<OpMetric> list) {
        Builder newBuilder = Metrics.newBuilder();
        for (OpMetric opMetric : list) {
            switch (opMetric.getMetricCase()) {
                case COUNTER_METRIC:
                    newBuilder.addCounters(opMetric.getCounterMetric());
                    break;
                case TIMER_METRIC:
                    newBuilder.addTimers(opMetric.getTimerMetric());
                    break;
                case LEVEL_METRIC:
                    newBuilder.addLevels(opMetric.getLevelMetric());
                    break;
                default:
                    break;
            }
        }
        return newBuilder.build();
    }
}
