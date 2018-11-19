package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableOnBackpressureLatest<T> extends C18364a<T, T> {

    static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 163080509307634843L;
        /* renamed from: a */
        final Subscriber<? super T> f56974a;
        /* renamed from: b */
        Subscription f56975b;
        /* renamed from: c */
        volatile boolean f56976c;
        /* renamed from: d */
        Throwable f56977d;
        /* renamed from: e */
        volatile boolean f56978e;
        /* renamed from: f */
        final AtomicLong f56979f = new AtomicLong();
        /* renamed from: g */
        final AtomicReference<T> f56980g = new AtomicReference();

        BackpressureLatestSubscriber(Subscriber<? super T> subscriber) {
            this.f56974a = subscriber;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f56975b, subscription)) {
                this.f56975b = subscription;
                this.f56974a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            this.f56980g.lazySet(t);
            m66450a();
        }

        public void onError(Throwable th) {
            this.f56977d = th;
            this.f56976c = true;
            m66450a();
        }

        public void onComplete() {
            this.f56976c = true;
            m66450a();
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a(this.f56979f, j);
                m66450a();
            }
        }

        public void cancel() {
            if (!this.f56978e) {
                this.f56978e = true;
                this.f56975b.cancel();
                if (getAndIncrement() == 0) {
                    this.f56980g.lazySet(null);
                }
            }
        }

        /* renamed from: a */
        void m66450a() {
            if (getAndIncrement() == 0) {
                Subscriber subscriber = this.f56974a;
                AtomicLong atomicLong = this.f56979f;
                AtomicReference atomicReference = this.f56980g;
                int i = 1;
                do {
                    boolean z;
                    boolean z2;
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        z2 = this.f56976c;
                        Object andSet = atomicReference.getAndSet(null);
                        boolean z3 = andSet == null;
                        if (!m66451a(z2, z3, subscriber, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            subscriber.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        z2 = this.f56976c;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (m66451a(z2, z, subscriber, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C15735a.m58969c(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* renamed from: a */
        boolean m66451a(boolean z, boolean z2, Subscriber<?> subscriber, AtomicReference<T> atomicReference) {
            if (this.f56978e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z) {
                z = this.f56977d;
                if (z) {
                    atomicReference.lazySet(null);
                    subscriber.onError(z);
                    return true;
                } else if (z2) {
                    subscriber.onComplete();
                    return true;
                }
            }
            return false;
        }
    }

    public FlowableOnBackpressureLatest(C3957b<T> c3957b) {
        super(c3957b);
    }

    /* renamed from: a */
    protected void m67583a(Subscriber<? super T> subscriber) {
        this.a.a(new BackpressureLatestSubscriber(subscriber));
    }
}
