package com.mapbox.android.telemetry;

import java.util.List;

class EventsQueue {
    static final int SIZE_LIMIT = 180;
    private final FlushQueueCallback callback;
    private boolean isTelemetryInitialized = false;
    final ConcurrentQueue<Event> queue;

    EventsQueue(FlushQueueCallback flushQueueCallback) {
        this.callback = flushQueueCallback;
        this.queue = new ConcurrentQueue();
    }

    boolean push(Event event) {
        if (!checkMaximumSize()) {
            return this.queue.add(event);
        }
        if (!this.isTelemetryInitialized) {
            return enqueue(event);
        }
        this.callback.onFullQueueFlush(this.queue, event);
        return null;
    }

    List<Event> flush() {
        return this.queue.flush();
    }

    void setTelemetryInitialized(boolean z) {
        this.isTelemetryInitialized = z;
    }

    private boolean enqueue(Event event) {
        return this.queue.enqueue(event);
    }

    private boolean checkMaximumSize() {
        return this.queue.size() >= SIZE_LIMIT;
    }
}
