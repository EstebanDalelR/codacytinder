package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    /* renamed from: a */
    final T f59102a;
    /* renamed from: b */
    final Subscriber<? super T> f59103b;

    public int requestFusion(int i) {
        return i & 1;
    }

    public ScalarSubscription(Subscriber<? super T> subscriber, T t) {
        this.f59103b = subscriber;
        this.f59102a = t;
    }

    public void request(long j) {
        if (!(SubscriptionHelper.validate(j) == null || compareAndSet(0, 1) == null)) {
            j = this.f59103b;
            j.onNext(this.f59102a);
            if (get() != 2) {
                j.onComplete();
            }
        }
    }

    public void cancel() {
        lazySet(2);
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Nullable
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f59102a;
    }

    public boolean isEmpty() {
        return get() != 0;
    }

    public void clear() {
        lazySet(1);
    }
}
