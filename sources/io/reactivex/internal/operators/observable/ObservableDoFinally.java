package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.p079d.C2667a;

@Experimental
public final class ObservableDoFinally<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Action f58922b;

    static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        /* renamed from: a */
        final Observer<? super T> f59513a;
        /* renamed from: b */
        final Action f59514b;
        /* renamed from: c */
        Disposable f59515c;
        /* renamed from: d */
        QueueDisposable<T> f59516d;
        /* renamed from: e */
        boolean f59517e;

        DoFinallyObserver(Observer<? super T> observer, Action action) {
            this.f59513a = observer;
            this.f59514b = action;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59515c, disposable)) {
                this.f59515c = disposable;
                if (disposable instanceof QueueDisposable) {
                    this.f59516d = (QueueDisposable) disposable;
                }
                this.f59513a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f59513a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f59513a.onError(th);
            m68207a();
        }

        public void onComplete() {
            this.f59513a.onComplete();
            m68207a();
        }

        public void dispose() {
            this.f59515c.dispose();
            m68207a();
        }

        public boolean isDisposed() {
            return this.f59515c.isDisposed();
        }

        public int requestFusion(int i) {
            QueueDisposable queueDisposable = this.f59516d;
            if (queueDisposable == null || (i & 4) != 0) {
                return 0;
            }
            i = queueDisposable.requestFusion(i);
            if (i != 0) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.f59517e = z;
            }
            return i;
        }

        public void clear() {
            this.f59516d.clear();
        }

        public boolean isEmpty() {
            return this.f59516d.isEmpty();
        }

        @Nullable
        public T poll() throws Exception {
            T poll = this.f59516d.poll();
            if (poll == null && this.f59517e) {
                m68207a();
            }
            return poll;
        }

        /* renamed from: a */
        void m68207a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f59514b.run();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    C2667a.a(th);
                }
            }
        }
    }

    public ObservableDoFinally(ObservableSource<T> observableSource, Action action) {
        super(observableSource);
        this.f58922b = action;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new DoFinallyObserver(observer, this.f58922b));
    }
}
