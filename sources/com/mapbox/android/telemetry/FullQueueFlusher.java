package com.mapbox.android.telemetry;

import java.util.List;

class FullQueueFlusher implements FlushQueueCallback {
    private final FullQueueCallback fullQueueCallback;

    FullQueueFlusher(FullQueueCallback fullQueueCallback) {
        this.fullQueueCallback = fullQueueCallback;
    }

    public void onFullQueueFlush(ConcurrentQueue concurrentQueue, Event event) {
        List flush = concurrentQueue.flush();
        concurrentQueue.add(event);
        this.fullQueueCallback.onFullQueue(flush);
    }
}
