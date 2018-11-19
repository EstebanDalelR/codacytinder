package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableConcatArray<T> extends C3957b<T> {
    /* renamed from: a */
    final Publisher<? extends T>[] f56873a;
    /* renamed from: c */
    final boolean f56874c;

    static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        /* renamed from: a */
        final Subscriber<? super T> f56866a;
        /* renamed from: b */
        final Publisher<? extends T>[] f56867b;
        /* renamed from: c */
        final boolean f56868c;
        /* renamed from: d */
        final AtomicInteger f56869d = new AtomicInteger();
        /* renamed from: e */
        int f56870e;
        /* renamed from: f */
        List<Throwable> f56871f;
        /* renamed from: g */
        long f56872g;

        ConcatArraySubscriber(Publisher<? extends T>[] publisherArr, boolean z, Subscriber<? super T> subscriber) {
            this.f56866a = subscriber;
            this.f56867b = publisherArr;
            this.f56868c = z;
        }

        public void onSubscribe(Subscription subscription) {
            m63749a(subscription);
        }

        public void onNext(T t) {
            this.f56872g++;
            this.f56866a.onNext(t);
        }

        public void onError(Throwable th) {
            if (this.f56868c) {
                List list = this.f56871f;
                if (list == null) {
                    list = new ArrayList((this.f56867b.length - this.f56870e) + 1);
                    this.f56871f = list;
                }
                list.add(th);
                onComplete();
                return;
            }
            this.f56866a.onError(th);
        }

        public void onComplete() {
            if (this.f56869d.getAndIncrement() == 0) {
                Publisher[] publisherArr = this.f56867b;
                int length = publisherArr.length;
                int i = this.f56870e;
                while (i != length) {
                    Publisher publisher = publisherArr[i];
                    if (publisher == null) {
                        Throwable nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.f56868c) {
                            List list = this.f56871f;
                            if (list == null) {
                                list = new ArrayList((length - i) + 1);
                                this.f56871f = list;
                            }
                            list.add(nullPointerException);
                            i++;
                        } else {
                            this.f56866a.onError(nullPointerException);
                            return;
                        }
                    }
                    long j = this.f56872g;
                    if (j != 0) {
                        this.f56872g = 0;
                        m63748a(j);
                    }
                    publisher.subscribe(this);
                    i++;
                    this.f56870e = i;
                    if (this.f56869d.decrementAndGet() == 0) {
                    }
                }
                Iterable iterable = this.f56871f;
                if (iterable == null) {
                    this.f56866a.onComplete();
                } else if (iterable.size() == 1) {
                    this.f56866a.onError((Throwable) iterable.get(0));
                } else {
                    this.f56866a.onError(new CompositeException(iterable));
                }
            }
        }
    }

    public FlowableConcatArray(Publisher<? extends T>[] publisherArr, boolean z) {
        this.f56873a = publisherArr;
        this.f56874c = z;
    }

    /* renamed from: a */
    protected void m66408a(Subscriber<? super T> subscriber) {
        Object concatArraySubscriber = new ConcatArraySubscriber(this.f56873a, this.f56874c, subscriber);
        subscriber.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
