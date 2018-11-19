package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C17530d;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableThrottleFirstTimed<T> extends C18394a<T, T> {
    /* renamed from: b */
    final long f59000b;
    /* renamed from: c */
    final TimeUnit f59001c;
    /* renamed from: d */
    final C15679f f59002d;

    static final class DebounceTimedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        /* renamed from: a */
        final Observer<? super T> f53758a;
        /* renamed from: b */
        final long f53759b;
        /* renamed from: c */
        final TimeUnit f53760c;
        /* renamed from: d */
        final C17362c f53761d;
        /* renamed from: e */
        Disposable f53762e;
        /* renamed from: f */
        volatile boolean f53763f;
        /* renamed from: g */
        boolean f53764g;

        DebounceTimedObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, C17362c c17362c) {
            this.f53758a = observer;
            this.f53759b = j;
            this.f53760c = timeUnit;
            this.f53761d = c17362c;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53762e, disposable)) {
                this.f53762e = disposable;
                this.f53758a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f53763f && !this.f53764g) {
                this.f53763f = true;
                this.f53758a.onNext(t);
                Disposable disposable = (Disposable) get();
                if (disposable != null) {
                    disposable.dispose();
                }
                DisposableHelper.replace(this, this.f53761d.mo13559a(this, this.f53759b, this.f53760c));
            }
        }

        public void run() {
            this.f53763f = false;
        }

        public void onError(Throwable th) {
            if (this.f53764g) {
                C2667a.a(th);
                return;
            }
            this.f53764g = true;
            this.f53758a.onError(th);
            this.f53761d.dispose();
        }

        public void onComplete() {
            if (!this.f53764g) {
                this.f53764g = true;
                this.f53758a.onComplete();
                this.f53761d.dispose();
            }
        }

        public void dispose() {
            this.f53762e.dispose();
            this.f53761d.dispose();
        }

        public boolean isDisposed() {
            return this.f53761d.isDisposed();
        }
    }

    public ObservableThrottleFirstTimed(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C15679f c15679f) {
        super(observableSource);
        this.f59000b = j;
        this.f59001c = timeUnit;
        this.f59002d = c15679f;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new DebounceTimedObserver(new C17530d(observer), this.f59000b, this.f59001c, this.f59002d.mo12872a()));
    }
}
