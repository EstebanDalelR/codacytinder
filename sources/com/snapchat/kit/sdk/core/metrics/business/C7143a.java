package com.snapchat.kit.sdk.core.metrics.business;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.C5939b;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import com.snapchat.kit.sdk.core.metrics.p149b.C5938a;
import java.util.List;
import javax.inject.Inject;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.RetrofitError.Kind;
import retrofit.client.C19370e;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.metrics.business.a */
public class C7143a implements MetricPublisher<ServerEvent> {
    /* renamed from: a */
    private final SharedPreferences f25888a;
    /* renamed from: b */
    private final C5941h f25889b;
    /* renamed from: c */
    private final MetricsClient f25890c;
    /* renamed from: d */
    private final C5938a f25891d;

    @Inject
    C7143a(SharedPreferences sharedPreferences, C5941h c5941h, MetricsClient metricsClient, C5938a c5938a) {
        this.f25888a = sharedPreferences;
        this.f25889b = c5941h;
        this.f25890c = metricsClient;
        this.f25891d = c5938a;
    }

    public void publishMetrics(List<ServerEvent> list, final PublishCallback publishCallback) {
        this.f25890c.postAnalytics(m30802a(list), new Callback<Object>(this) {
            /* renamed from: b */
            final /* synthetic */ C7143a f25887b;

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

    public void persistMetrics(List<C5939b<ServerEvent>> list) {
        this.f25888a.edit().putString("unsent_analytics_events", this.f25891d.m25529a(list)).apply();
    }

    public List<C5939b<ServerEvent>> getPersistedEvents() {
        return this.f25891d.m25530a(ServerEvent.parser(), this.f25888a.getString("unsent_analytics_events", null));
    }

    @NonNull
    /* renamed from: a */
    private ServerEventBatch m30802a(List<ServerEvent> list) {
        return ServerEventBatch.newBuilder().addAllServerEvents(list).setMaxSequenceIdOnInstance(this.f25889b.m25541c()).build();
    }
}
