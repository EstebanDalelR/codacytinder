package com.snapchat.kit.sdk.core.metrics;

import java.util.List;
import retrofit.RetrofitError;

public interface MetricPublisher<T> {

    public interface PublishCallback {
        void onNetworkError();

        void onServerError(RetrofitError retrofitError);

        void onSuccess();
    }

    List<C5939b<T>> getPersistedEvents();

    void persistMetrics(List<C5939b<T>> list);

    void publishMetrics(List<T> list, PublishCallback publishCallback);
}
