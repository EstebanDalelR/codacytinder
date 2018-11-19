package com.mapbox.android.telemetry;

interface FlushQueueCallback {
    void onFullQueueFlush(ConcurrentQueue concurrentQueue, Event event);
}
