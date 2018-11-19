package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableFlatMapCompletable<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Function<? super T, ? extends CompletableSource> f58927b;
    /* renamed from: c */
    final boolean f58928c;

    static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        /* renamed from: a */
        final Observer<? super T> f59518a;
        /* renamed from: b */
        final AtomicThrowable f59519b = new AtomicThrowable();
        /* renamed from: c */
        final Function<? super T, ? extends CompletableSource> f59520c;
        /* renamed from: d */
        final boolean f59521d;
        /* renamed from: e */
        final C17356a f59522e = new C17356a();
        /* renamed from: f */
        Disposable f59523f;
        /* renamed from: g */
        volatile boolean f59524g;

        final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            private static final long serialVersionUID = 8606673141535671828L;
            /* renamed from: a */
            final /* synthetic */ FlatMapCompletableMainObserver f53460a;

            InnerObserver(FlatMapCompletableMainObserver flatMapCompletableMainObserver) {
                this.f53460a = flatMapCompletableMainObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public void onComplete() {
                this.f53460a.m68208a(this);
            }

            public void onError(Throwable th) {
                this.f53460a.m68209a(this, th);
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }
        }

        public void clear() {
        }

        public boolean isEmpty() {
            return true;
        }

        @Nullable
        public T poll() throws Exception {
            return null;
        }

        public int requestFusion(int i) {
            return i & 2;
        }

        FlatMapCompletableMainObserver(Observer<? super T> observer, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.f59518a = observer;
            this.f59520c = function;
            this.f59521d = z;
            lazySet(1);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59523f, disposable)) {
                this.f59523f = disposable;
                this.f59518a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            try {
                CompletableSource completableSource = (CompletableSource) C15684a.m58895a(this.f59520c.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                Object innerObserver = new InnerObserver(this);
                if (!this.f59524g && this.f59522e.add(innerObserver)) {
                    completableSource.subscribe(innerObserver);
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f59523f.dispose();
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            if (!this.f59519b.m58961a(th)) {
                C2667a.a(th);
            } else if (this.f59521d == null) {
                dispose();
                if (getAndSet(null) > null) {
                    this.f59518a.onError(this.f59519b.m58960a());
                }
            } else if (decrementAndGet() == null) {
                this.f59518a.onError(this.f59519b.m58960a());
            }
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a = this.f59519b.m58960a();
                if (a != null) {
                    this.f59518a.onError(a);
                } else {
                    this.f59518a.onComplete();
                }
            }
        }

        public void dispose() {
            this.f59524g = true;
            this.f59523f.dispose();
            this.f59522e.dispose();
        }

        public boolean isDisposed() {
            return this.f59523f.isDisposed();
        }

        /* renamed from: a */
        void m68208a(InnerObserver innerObserver) {
            this.f59522e.delete(innerObserver);
            onComplete();
        }

        /* renamed from: a */
        void m68209a(InnerObserver innerObserver, Throwable th) {
            this.f59522e.delete(innerObserver);
            onError(th);
        }
    }

    public ObservableFlatMapCompletable(ObservableSource<T> observableSource, Function<? super T, ? extends CompletableSource> function, boolean z) {
        super(observableSource);
        this.f58927b = function;
        this.f58928c = z;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new FlatMapCompletableMainObserver(observer, this.f58927b, this.f58928c));
    }
}
