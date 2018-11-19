package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import org.reactivestreams.Subscriber;

public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    private static final long serialVersionUID = -2151279923272604993L;
    /* renamed from: g */
    protected final Subscriber<? super T> f59651g;
    /* renamed from: h */
    protected T f59652h;

    public DeferredScalarSubscription(Subscriber<? super T> subscriber) {
        this.f59651g = subscriber;
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j) != null) {
            do {
                j = get();
                if ((j & -2) == 0) {
                    if (j == 1) {
                        if (compareAndSet(1, 3) != null) {
                            j = this.f59652h;
                            if (j != null) {
                                this.f59652h = null;
                                Subscriber subscriber = this.f59651g;
                                subscriber.onNext(j);
                                if (get() != 4) {
                                    subscriber.onComplete();
                                }
                            }
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (compareAndSet(0, 2) == null);
        }
    }

    /* renamed from: a */
    public final void m68249a(T t) {
        Subscriber subscriber;
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    subscriber = this.f59651g;
                    subscriber.onNext(t);
                    if (get() != 4) {
                        subscriber.onComplete();
                    }
                    return;
                }
                this.f59652h = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.f59652h = null;
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.f59652h = t;
        lazySet(16);
        subscriber = this.f59651g;
        subscriber.onNext(t);
        if (get() != 4) {
            subscriber.onComplete();
        }
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Nullable
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.f59652h;
        this.f59652h = null;
        return t;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final void clear() {
        lazySet(32);
        this.f59652h = null;
    }

    public void cancel() {
        set(4);
        this.f59652h = null;
    }
}
