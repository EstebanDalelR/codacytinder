package com.snapchat.kit.sdk.core.metrics;

import android.support.annotation.AnyThread;

public interface MetricQueue<T> {
    @AnyThread
    void push(T t);
}
