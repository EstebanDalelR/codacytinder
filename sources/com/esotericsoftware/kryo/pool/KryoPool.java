package com.esotericsoftware.kryo.pool;

import com.esotericsoftware.kryo.Kryo;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public interface KryoPool {

    public static class Builder {
        private final KryoFactory factory;
        private Queue<Kryo> queue = new ConcurrentLinkedQueue();
        private boolean softReferences;

        public Builder(KryoFactory kryoFactory) {
            if (kryoFactory == null) {
                throw new IllegalArgumentException("factory must not be null");
            }
            this.factory = kryoFactory;
        }

        public Builder queue(Queue<Kryo> queue) {
            if (queue == null) {
                throw new IllegalArgumentException("queue must not be null");
            }
            this.queue = queue;
            return this;
        }

        public Builder softReferences() {
            this.softReferences = true;
            return this;
        }

        public KryoPool build() {
            return new KryoPoolQueueImpl(this.factory, this.softReferences ? new SoftReferenceQueue(this.queue) : this.queue);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getName());
            stringBuilder.append("[queue.class=");
            stringBuilder.append(this.queue.getClass());
            stringBuilder.append(", softReferences=");
            stringBuilder.append(this.softReferences);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    Kryo borrow();

    void release(Kryo kryo);

    <T> T run(KryoCallback<T> kryoCallback);
}
