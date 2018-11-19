package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import io.reactivex.subscribers.C18434b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableDebounceTimed<T> extends C18364a<T, T> {
    /* renamed from: c */
    final long f58810c;
    /* renamed from: d */
    final TimeUnit f58811d;
    /* renamed from: e */
    final C15679f f58812e;

    static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 6812032969491025141L;
        /* renamed from: a */
        final T f53221a;
        /* renamed from: b */
        final long f53222b;
        /* renamed from: c */
        final DebounceTimedSubscriber<T> f53223c;
        /* renamed from: d */
        final AtomicBoolean f53224d = new AtomicBoolean();

        DebounceEmitter(T t, long j, DebounceTimedSubscriber<T> debounceTimedSubscriber) {
            this.f53221a = t;
            this.f53222b = j;
            this.f53223c = debounceTimedSubscriber;
        }

        public void run() {
            m63492a();
        }

        /* renamed from: a */
        void m63492a() {
            if (this.f53224d.compareAndSet(false, true)) {
                this.f53223c.m66419a(this.f53222b, this.f53221a, this);
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        /* renamed from: a */
        public void m63493a(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -9102637559663639004L;
        /* renamed from: a */
        final Subscriber<? super T> f56897a;
        /* renamed from: b */
        final long f56898b;
        /* renamed from: c */
        final TimeUnit f56899c;
        /* renamed from: d */
        final C17362c f56900d;
        /* renamed from: e */
        Subscription f56901e;
        /* renamed from: f */
        final SequentialDisposable f56902f = new SequentialDisposable();
        /* renamed from: g */
        volatile long f56903g;
        /* renamed from: h */
        boolean f56904h;

        DebounceTimedSubscriber(Subscriber<? super T> subscriber, long j, TimeUnit timeUnit, C17362c c17362c) {
            this.f56897a = subscriber;
            this.f56898b = j;
            this.f56899c = timeUnit;
            this.f56900d = c17362c;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f56901e, subscription)) {
                this.f56901e = subscription;
                this.f56897a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            if (!this.f56904h) {
                long j = this.f56903g + 1;
                this.f56903g = j;
                Disposable disposable = (Disposable) this.f56902f.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                DebounceEmitter debounceEmitter = new DebounceEmitter(t, j, this);
                if (this.f56902f.m63458b(debounceEmitter) != null) {
                    debounceEmitter.m63493a(this.f56900d.mo13559a(debounceEmitter, this.f56898b, this.f56899c));
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f56904h) {
                C2667a.a(th);
                return;
            }
            this.f56904h = true;
            this.f56897a.onError(th);
            this.f56900d.dispose();
        }

        public void onComplete() {
            if (!this.f56904h) {
                this.f56904h = true;
                Disposable disposable = (Disposable) this.f56902f.get();
                if (!DisposableHelper.isDisposed(disposable)) {
                    DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
                    if (debounceEmitter != null) {
                        debounceEmitter.m63492a();
                    }
                    DisposableHelper.dispose(this.f56902f);
                    this.f56897a.onComplete();
                    this.f56900d.dispose();
                }
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            this.f56901e.cancel();
            this.f56900d.dispose();
        }

        /* renamed from: a */
        void m66419a(long j, T t, DebounceEmitter<T> debounceEmitter) {
            if (j != this.f56903g) {
                return;
            }
            if (get() != 0) {
                this.f56897a.onNext(t);
                C15735a.m58969c(this, 1);
                debounceEmitter.dispose();
                return;
            }
            cancel();
            this.f56897a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
        }
    }

    public FlowableDebounceTimed(C3957b<T> c3957b, long j, TimeUnit timeUnit, C15679f c15679f) {
        super(c3957b);
        this.f58810c = j;
        this.f58811d = timeUnit;
        this.f58812e = c15679f;
    }

    /* renamed from: a */
    protected void m67571a(Subscriber<? super T> subscriber) {
        this.a.a(new DebounceTimedSubscriber(new C18434b(subscriber), this.f58810c, this.f58811d, this.f58812e.mo12872a()));
    }
}
