package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableConcatWithMaybe<T> extends C18394a<T, T> {
    /* renamed from: b */
    final MaybeSource<? extends T> f58917b;

    static final class ConcatWithObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Observer<T>, Disposable {
        private static final long serialVersionUID = -1953724749712440952L;
        /* renamed from: a */
        final Observer<? super T> f53419a;
        /* renamed from: b */
        MaybeSource<? extends T> f53420b;
        /* renamed from: c */
        boolean f53421c;

        ConcatWithObserver(Observer<? super T> observer, MaybeSource<? extends T> maybeSource) {
            this.f53419a = observer;
            this.f53420b = maybeSource;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null && this.f53421c == null) {
                this.f53419a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f53419a.onNext(t);
        }

        public void onSuccess(T t) {
            this.f53419a.onNext(t);
            this.f53419a.onComplete();
        }

        public void onError(Throwable th) {
            this.f53419a.onError(th);
        }

        public void onComplete() {
            if (this.f53421c) {
                this.f53419a.onComplete();
                return;
            }
            this.f53421c = true;
            DisposableHelper.replace(this, null);
            MaybeSource maybeSource = this.f53420b;
            this.f53420b = null;
            maybeSource.subscribe(this);
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }
    }

    public ObservableConcatWithMaybe(C3959e<T> c3959e, MaybeSource<? extends T> maybeSource) {
        super(c3959e);
        this.f58917b = maybeSource;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new ConcatWithObserver(observer, this.f58917b));
    }
}
