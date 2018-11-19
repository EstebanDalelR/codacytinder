package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.model.OpMetrics.Metrics;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

public interface MetricsClient {
    @POST("/v1/sdk/metrics/business")
    void postAnalytics(@Body ServerEventBatch serverEventBatch, Callback<Object> callback);

    @POST("/v1/sdk/metrics/operational")
    void postOperationalMetrics(@Body Metrics metrics, Callback<Object> callback);
}
