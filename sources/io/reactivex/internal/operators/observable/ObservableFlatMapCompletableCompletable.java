package io.reactivex.internal.operators.observable;

import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableFlatMapCompletableCompletable<T> extends C3956a implements FuseToObservable<T> {
    /* renamed from: a */
    final ObservableSource<T> f57178a;
    /* renamed from: b */
    final Function<? super T, ? extends CompletableSource> f57179b;
    /* renamed from: c */
    final boolean f57180c;

    static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8443155186132538303L;
        /* renamed from: a */
        final CompletableObserver f53462a;
        /* renamed from: b */
        final AtomicThrowable f53463b = new AtomicThrowable();
        /* renamed from: c */
        final Function<? super T, ? extends CompletableSource> f53464c;
        /* renamed from: d */
        final boolean f53465d;
        /* renamed from: e */
        final C17356a f53466e = new C17356a();
        /* renamed from: f */
        Disposable f53467f;
        /* renamed from: g */
        volatile boolean f53468g;

        final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            private static final long serialVersionUID = 8606673141535671828L;
            /* renamed from: a */
            final /* synthetic */ FlatMapCompletableMainObserver f53461a;

            InnerObserver(FlatMapCompletableMainObserver flatMapCompletableMainObserver) {
                this.f53461a = flatMapCompletableMainObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onComplete() {
                this.f53461a.m63551a(this);
            }

            public void onError(Throwable th) {
                this.f53461a.m63552a(this, th);
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }
        }

        FlatMapCompletableMainObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.f53462a = completableObserver;
            this.f53464c = function;
            this.f53465d = z;
            lazySet(1);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53467f, disposable)) {
                this.f53467f = disposable;
                this.f53462a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            try {
                CompletableSource completableSource = (CompletableSource) C15684a.m58895a(this.f53464c.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                Object innerObserver = new InnerObserver(this);
                if (!this.f53468g && this.f53466e.add(innerObserver)) {
                    completableSource.subscribe(innerObserver);
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f53467f.dispose();
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            if (!this.f53463b.m58961a(th)) {
                C2667a.a(th);
            } else if (this.f53465d == null) {
                dispose();
                if (getAndSet(null) > null) {
                    this.f53462a.onError(this.f53463b.m58960a());
                }
            } else if (decrementAndGet() == null) {
                this.f53462a.onError(this.f53463b.m58960a());
            }
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a = this.f53463b.m58960a();
                if (a != null) {
                    this.f53462a.onError(a);
                } else {
                    this.f53462a.onComplete();
                }
            }
        }

        public void dispose() {
            this.f53468g = true;
            this.f53467f.dispose();
            this.f53466e.dispose();
        }

        public boolean isDisposed() {
            return this.f53467f.isDisposed();
        }

        /* renamed from: a */
        void m63551a(InnerObserver innerObserver) {
            this.f53466e.delete(innerObserver);
            onComplete();
        }

        /* renamed from: a */
        void m63552a(InnerObserver innerObserver, Throwable th) {
            this.f53466e.delete(innerObserver);
            onError(th);
        }
    }

    public ObservableFlatMapCompletableCompletable(ObservableSource<T> observableSource, Function<? super T, ? extends CompletableSource> function, boolean z) {
        this.f57178a = observableSource;
        this.f57179b = function;
        this.f57180c = z;
    }

    /* renamed from: a */
    protected void m66492a(CompletableObserver completableObserver) {
        this.f57178a.subscribe(new FlatMapCompletableMainObserver(completableObserver, this.f57179b, this.f57180c));
    }

    public C3959e<T> fuseToObservable() {
        return C2667a.a(new ObservableFlatMapCompletable(this.f57178a, this.f57179b, this.f57180c));
    }
}
