package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, Disposable, Subscription {
    /* renamed from: i */
    private final Subscriber<? super T> f57435i;
    /* renamed from: j */
    private volatile boolean f57436j;
    /* renamed from: k */
    private final AtomicReference<Subscription> f57437k;
    /* renamed from: l */
    private final AtomicLong f57438l;
    /* renamed from: m */
    private QueueSubscription<T> f57439m;

    enum EmptySubscriber implements FlowableSubscriber<Object> {
        INSTANCE;

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(Object obj) {
        }

        public void onSubscribe(Subscription subscription) {
        }
    }

    /* renamed from: a */
    protected void m66612a() {
    }

    public void onSubscribe(Subscription subscription) {
        this.e = Thread.currentThread();
        if (subscription == null) {
            this.c.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (this.f57437k.compareAndSet(null, subscription)) {
            if (this.g != 0 && (subscription instanceof QueueSubscription)) {
                this.f57439m = (QueueSubscription) subscription;
                int requestFusion = this.f57439m.requestFusion(this.g);
                this.h = requestFusion;
                if (requestFusion == 1) {
                    this.f = true;
                    this.e = Thread.currentThread();
                    while (true) {
                        try {
                            subscription = this.f57439m.poll();
                            if (subscription == null) {
                                break;
                            }
                            this.b.add(subscription);
                        } catch (Subscription subscription2) {
                            this.c.add(subscription2);
                        }
                    }
                    this.d++;
                    return;
                }
            }
            this.f57435i.onSubscribe(subscription2);
            long andSet = this.f57438l.getAndSet(0);
            if (andSet != 0) {
                subscription2.request(andSet);
            }
            m66612a();
        } else {
            subscription2.cancel();
            if (this.f57437k.get() != SubscriptionHelper.CANCELLED) {
                List list = this.c;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onSubscribe received multiple subscriptions: ");
                stringBuilder.append(subscription2);
                list.add(new IllegalStateException(stringBuilder.toString()));
            }
        }
    }

    public void onNext(T t) {
        if (!this.f) {
            this.f = true;
            if (this.f57437k.get() == null) {
                this.c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.e = Thread.currentThread();
        if (this.h == 2) {
            while (true) {
                try {
                    t = this.f57439m.poll();
                    if (t == null) {
                        break;
                    }
                    this.b.add(t);
                } catch (T t2) {
                    this.c.add(t2);
                    this.f57439m.cancel();
                }
            }
            return;
        }
        this.b.add(t2);
        if (t2 == null) {
            this.c.add(new NullPointerException("onNext received a null value"));
        }
        this.f57435i.onNext(t2);
    }

    public void onError(Throwable th) {
        if (!this.f) {
            this.f = true;
            if (this.f57437k.get() == null) {
                this.c.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.e = Thread.currentThread();
            this.c.add(th);
            if (th == null) {
                this.c.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.f57435i.onError(th);
        } finally {
            this.a.countDown();
        }
    }

    public void onComplete() {
        if (!this.f) {
            this.f = true;
            if (this.f57437k.get() == null) {
                this.c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.e = Thread.currentThread();
            this.d++;
            this.f57435i.onComplete();
        } finally {
            this.a.countDown();
        }
    }

    public final void request(long j) {
        SubscriptionHelper.deferredRequest(this.f57437k, this.f57438l, j);
    }

    public final void cancel() {
        if (!this.f57436j) {
            this.f57436j = true;
            SubscriptionHelper.cancel(this.f57437k);
        }
    }

    public final void dispose() {
        cancel();
    }

    public final boolean isDisposed() {
        return this.f57436j;
    }
}
