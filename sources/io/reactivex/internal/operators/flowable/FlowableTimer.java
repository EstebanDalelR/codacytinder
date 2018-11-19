package io.reactivex.internal.operators.flowable;

import io.reactivex.C15679f;
import io.reactivex.C3957b;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableTimer extends C3957b<Long> {
    /* renamed from: a */
    final C15679f f57066a;
    /* renamed from: c */
    final long f57067c;
    /* renamed from: d */
    final TimeUnit f57068d;

    static final class TimerSubscriber extends AtomicReference<Disposable> implements Runnable, Subscription {
        private static final long serialVersionUID = -2809475196591179431L;
        /* renamed from: a */
        final Subscriber<? super Long> f53236a;
        /* renamed from: b */
        volatile boolean f53237b;

        TimerSubscriber(Subscriber<? super Long> subscriber) {
            this.f53236a = subscriber;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j) != null) {
                this.f53237b = 1;
            }
        }

        public void cancel() {
            DisposableHelper.dispose(this);
        }

        public void run() {
            if (get() == DisposableHelper.DISPOSED) {
                return;
            }
            if (this.f53237b) {
                this.f53236a.onNext(Long.valueOf(0));
                lazySet(EmptyDisposable.INSTANCE);
                this.f53236a.onComplete();
                return;
            }
            lazySet(EmptyDisposable.INSTANCE);
            this.f53236a.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
        }

        /* renamed from: a */
        public void m63496a(Disposable disposable) {
            DisposableHelper.trySet(this, disposable);
        }
    }

    public FlowableTimer(long j, TimeUnit timeUnit, C15679f c15679f) {
        this.f57067c = j;
        this.f57068d = timeUnit;
        this.f57066a = c15679f;
    }

    /* renamed from: a */
    public void m66465a(Subscriber<? super Long> subscriber) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(subscriber);
        subscriber.onSubscribe(timerSubscriber);
        timerSubscriber.m63496a(this.f57066a.mo12871a(timerSubscriber, this.f57067c, this.f57068d));
    }
}
