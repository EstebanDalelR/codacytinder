package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import io.reactivex.subscribers.C18434b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableThrottleFirstTimed<T> extends C18364a<T, T> {
    /* renamed from: c */
    final long f58861c;
    /* renamed from: d */
    final TimeUnit f58862d;
    /* renamed from: e */
    final C15679f f58863e;

    static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Runnable, Subscription {
        private static final long serialVersionUID = -9102637559663639004L;
        /* renamed from: a */
        final Subscriber<? super T> f57058a;
        /* renamed from: b */
        final long f57059b;
        /* renamed from: c */
        final TimeUnit f57060c;
        /* renamed from: d */
        final C17362c f57061d;
        /* renamed from: e */
        Subscription f57062e;
        /* renamed from: f */
        final SequentialDisposable f57063f = new SequentialDisposable();
        /* renamed from: g */
        volatile boolean f57064g;
        /* renamed from: h */
        boolean f57065h;

        DebounceTimedSubscriber(Subscriber<? super T> subscriber, long j, TimeUnit timeUnit, C17362c c17362c) {
            this.f57058a = subscriber;
            this.f57059b = j;
            this.f57060c = timeUnit;
            this.f57061d = c17362c;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57062e, subscription)) {
                this.f57062e = subscription;
                this.f57058a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            if (!(this.f57065h || this.f57064g)) {
                this.f57064g = true;
                if (get() != 0) {
                    this.f57058a.onNext(t);
                    C15735a.m58969c(this, 1);
                    Disposable disposable = (Disposable) this.f57063f.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.f57063f.m63458b(this.f57061d.mo13559a(this, this.f57059b, this.f57060c));
                } else {
                    this.f57065h = true;
                    cancel();
                    this.f57058a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                }
            }
        }

        public void run() {
            this.f57064g = false;
        }

        public void onError(Throwable th) {
            if (this.f57065h) {
                C2667a.a(th);
                return;
            }
            this.f57065h = true;
            this.f57058a.onError(th);
            this.f57061d.dispose();
        }

        public void onComplete() {
            if (!this.f57065h) {
                this.f57065h = true;
                this.f57058a.onComplete();
                this.f57061d.dispose();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            this.f57062e.cancel();
            this.f57061d.dispose();
        }
    }

    public FlowableThrottleFirstTimed(C3957b<T> c3957b, long j, TimeUnit timeUnit, C15679f c15679f) {
        super(c3957b);
        this.f58861c = j;
        this.f58862d = timeUnit;
        this.f58863e = c15679f;
    }

    /* renamed from: a */
    protected void m67601a(Subscriber<? super T> subscriber) {
        this.a.a(new DebounceTimedSubscriber(new C18434b(subscriber), this.f58861c, this.f58862d, this.f58863e.mo12872a()));
    }
}
