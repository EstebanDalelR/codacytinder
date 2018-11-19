package io.reactivex.internal.observers;

import io.reactivex.internal.fuseable.QueueDisposable;

/* renamed from: io.reactivex.internal.observers.b */
public abstract class C19002b<T> implements QueueDisposable<T> {
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
