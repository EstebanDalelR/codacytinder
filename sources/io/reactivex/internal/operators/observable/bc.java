package io.reactivex.internal.operators.observable;

import io.reactivex.C3958c;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;

public final class bc<T> extends C3958c<T> {
    /* renamed from: a */
    final ObservableSource<T> f57260a;
    /* renamed from: b */
    final BiFunction<T, T, T> f57261b;

    /* renamed from: io.reactivex.internal.operators.observable.bc$a */
    static final class C17470a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final MaybeObserver<? super T> f53907a;
        /* renamed from: b */
        final BiFunction<T, T, T> f53908b;
        /* renamed from: c */
        boolean f53909c;
        /* renamed from: d */
        T f53910d;
        /* renamed from: e */
        Disposable f53911e;

        C17470a(MaybeObserver<? super T> maybeObserver, BiFunction<T, T, T> biFunction) {
            this.f53907a = maybeObserver;
            this.f53908b = biFunction;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53911e, disposable)) {
                this.f53911e = disposable;
                this.f53907a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f53909c) {
                Object obj = this.f53910d;
                if (obj == null) {
                    this.f53910d = t;
                    return;
                }
                try {
                    this.f53910d = C15684a.m58895a(this.f53908b.apply(obj, t), "The reducer returned a null value");
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53911e.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53909c) {
                C2667a.a(th);
                return;
            }
            this.f53909c = true;
            this.f53910d = null;
            this.f53907a.onError(th);
        }

        public void onComplete() {
            if (!this.f53909c) {
                this.f53909c = true;
                Object obj = this.f53910d;
                this.f53910d = null;
                if (obj != null) {
                    this.f53907a.onSuccess(obj);
                } else {
                    this.f53907a.onComplete();
                }
            }
        }

        public void dispose() {
            this.f53911e.dispose();
        }

        public boolean isDisposed() {
            return this.f53911e.isDisposed();
        }
    }

    public bc(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        this.f57260a = observableSource;
        this.f57261b = biFunction;
    }

    /* renamed from: a */
    protected void m66514a(MaybeObserver<? super T> maybeObserver) {
        this.f57260a.subscribe(new C17470a(maybeObserver, this.f57261b));
    }
}
