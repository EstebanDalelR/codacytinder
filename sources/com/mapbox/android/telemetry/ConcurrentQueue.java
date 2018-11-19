package com.mapbox.android.telemetry;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class ConcurrentQueue<T> {
    private int count = 0;
    private final Queue<T> queue = new ConcurrentLinkedQueue();

    ConcurrentQueue() {
    }

    boolean add(T t) {
        t = this.queue.add(t);
        this.count++;
        return t;
    }

    List<T> flush() {
        List<T> arrayList = new ArrayList(this.count);
        for (int i = 0; i < this.count; i++) {
            arrayList.add(this.queue.remove());
        }
        this.count = 0;
        return arrayList;
    }

    boolean enqueue(T t) {
        this.queue.remove();
        return this.queue.add(t);
    }

    int size() {
        return this.count;
    }

    Queue<T> obtainQueue() {
        return this.queue;
    }
}
