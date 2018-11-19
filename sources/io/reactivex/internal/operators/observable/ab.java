package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;
import java.util.NoSuchElementException;

public final class ab<T> extends C18394a<T, T> {
    /* renamed from: b */
    final long f59022b;
    /* renamed from: c */
    final T f59023c;
    /* renamed from: d */
    final boolean f59024d;

    /* renamed from: io.reactivex.internal.operators.observable.ab$a */
    static final class C17456a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53850a;
        /* renamed from: b */
        final long f53851b;
        /* renamed from: c */
        final T f53852c;
        /* renamed from: d */
        final boolean f53853d;
        /* renamed from: e */
        Disposable f53854e;
        /* renamed from: f */
        long f53855f;
        /* renamed from: g */
        boolean f53856g;

        C17456a(Observer<? super T> observer, long j, T t, boolean z) {
            this.f53850a = observer;
            this.f53851b = j;
            this.f53852c = t;
            this.f53853d = z;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53854e, disposable)) {
                this.f53854e = disposable;
                this.f53850a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53854e.dispose();
        }

        public boolean isDisposed() {
            return this.f53854e.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f53856g) {
                long j = this.f53855f;
                if (j == this.f53851b) {
                    this.f53856g = true;
                    this.f53854e.dispose();
                    this.f53850a.onNext(t);
                    this.f53850a.onComplete();
                    return;
                }
                this.f53855f = j + 1;
            }
        }

        public void onError(Throwable th) {
            if (this.f53856g) {
                C2667a.a(th);
                return;
            }
            this.f53856g = true;
            this.f53850a.onError(th);
        }

        public void onComplete() {
            if (!this.f53856g) {
                this.f53856g = true;
                Object obj = this.f53852c;
                if (obj == null && this.f53853d) {
                    this.f53850a.onError(new NoSuchElementException());
                    return;
                }
                if (obj != null) {
                    this.f53850a.onNext(obj);
                }
                this.f53850a.onComplete();
            }
        }
    }

    public ab(ObservableSource<T> observableSource, long j, T t, boolean z) {
        super(observableSource);
        this.f59022b = j;
        this.f59023c = t;
        this.f59024d = z;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17456a(observer, this.f59022b, this.f59023c, this.f59024d));
    }
}
