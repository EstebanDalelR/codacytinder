package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableAmb<T> extends C3957b<T> {
    /* renamed from: a */
    final Publisher<? extends T>[] f56854a;
    /* renamed from: c */
    final Iterable<? extends Publisher<? extends T>> f56855c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableAmb$a */
    static final class C17407a<T> implements Subscription {
        /* renamed from: a */
        final Subscriber<? super T> f53214a;
        /* renamed from: b */
        final AmbInnerSubscriber<T>[] f53215b;
        /* renamed from: c */
        final AtomicInteger f53216c = new AtomicInteger();

        C17407a(Subscriber<? super T> subscriber, int i) {
            this.f53214a = subscriber;
            this.f53215b = new AmbInnerSubscriber[i];
        }

        /* renamed from: a */
        public void m63490a(Publisher<? extends T>[] publisherArr) {
            AmbInnerSubscriber[] ambInnerSubscriberArr = this.f53215b;
            int length = ambInnerSubscriberArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                ambInnerSubscriberArr[i2] = new AmbInnerSubscriber(this, i3, this.f53214a);
                i2 = i3;
            }
            this.f53216c.lazySet(0);
            this.f53214a.onSubscribe(this);
            while (i < length && this.f53216c.get() == 0) {
                publisherArr[i].subscribe(ambInnerSubscriberArr[i]);
                i++;
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                int i = this.f53216c.get();
                if (i > 0) {
                    this.f53215b[i - 1].request(j);
                } else if (i == 0) {
                    for (AmbInnerSubscriber request : this.f53215b) {
                        request.request(j);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean m63491a(int i) {
            int i2 = 0;
            if (this.f53216c.get() != 0 || !this.f53216c.compareAndSet(0, i)) {
                return false;
            }
            AmbInnerSubscriber[] ambInnerSubscriberArr = this.f53215b;
            int length = ambInnerSubscriberArr.length;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (i3 != i) {
                    ambInnerSubscriberArr[i2].cancel();
                }
                i2 = i3;
            }
            return true;
        }

        public void cancel() {
            if (this.f53216c.get() != -1) {
                this.f53216c.lazySet(-1);
                for (AmbInnerSubscriber cancel : this.f53215b) {
                    cancel.cancel();
                }
            }
        }
    }

    static final class AmbInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -1185974347409665484L;
        /* renamed from: a */
        final C17407a<T> f56849a;
        /* renamed from: b */
        final int f56850b;
        /* renamed from: c */
        final Subscriber<? super T> f56851c;
        /* renamed from: d */
        boolean f56852d;
        /* renamed from: e */
        final AtomicLong f56853e = new AtomicLong();

        AmbInnerSubscriber(C17407a<T> c17407a, int i, Subscriber<? super T> subscriber) {
            this.f56849a = c17407a;
            this.f56850b = i;
            this.f56851c = subscriber;
        }

        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this, this.f56853e, subscription);
        }

        public void request(long j) {
            SubscriptionHelper.deferredRequest(this, this.f56853e, j);
        }

        public void onNext(T t) {
            if (this.f56852d) {
                this.f56851c.onNext(t);
            } else if (this.f56849a.m63491a(this.f56850b)) {
                this.f56852d = true;
                this.f56851c.onNext(t);
            } else {
                ((Subscription) get()).cancel();
            }
        }

        public void onError(Throwable th) {
            if (this.f56852d) {
                this.f56851c.onError(th);
            } else if (this.f56849a.m63491a(this.f56850b)) {
                this.f56852d = true;
                this.f56851c.onError(th);
            } else {
                ((Subscription) get()).cancel();
                C2667a.a(th);
            }
        }

        public void onComplete() {
            if (this.f56852d) {
                this.f56851c.onComplete();
            } else if (this.f56849a.m63491a(this.f56850b)) {
                this.f56852d = true;
                this.f56851c.onComplete();
            } else {
                ((Subscription) get()).cancel();
            }
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }
    }

    public FlowableAmb(Publisher<? extends T>[] publisherArr, Iterable<? extends Publisher<? extends T>> iterable) {
        this.f56854a = publisherArr;
        this.f56855c = iterable;
    }

    /* renamed from: a */
    public void m66404a(Subscriber<? super T> subscriber) {
        int i;
        Publisher[] publisherArr = this.f56854a;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            try {
                i = 0;
                for (Publisher publisher : this.f56855c) {
                    if (publisher == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), subscriber);
                        return;
                    }
                    if (i == publisherArr.length) {
                        Object obj = new Publisher[((i >> 2) + i)];
                        System.arraycopy(publisherArr, 0, obj, 0, i);
                        publisherArr = obj;
                    }
                    int i2 = i + 1;
                    publisherArr[i] = publisher;
                    i = i2;
                }
            } catch (Throwable th) {
                C15678a.m58850b(th);
                EmptySubscription.error(th, subscriber);
                return;
            }
        }
        i = publisherArr.length;
        if (i == 0) {
            EmptySubscription.complete(subscriber);
        } else if (i == 1) {
            publisherArr[0].subscribe(subscriber);
        } else {
            new C17407a(subscriber, i).m63490a(publisherArr);
        }
    }
}
