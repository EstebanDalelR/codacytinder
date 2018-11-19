package io.reactivex.internal.operators.single;

import io.reactivex.C15679f;
import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleObserveOn<T> extends C3960g<T> {
    /* renamed from: a */
    final SingleSource<T> f57316a;
    /* renamed from: b */
    final C15679f f57317b;

    static final class ObserveOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        /* renamed from: a */
        final SingleObserver<? super T> f54061a;
        /* renamed from: b */
        final C15679f f54062b;
        /* renamed from: c */
        T f54063c;
        /* renamed from: d */
        Throwable f54064d;

        ObserveOnSingleObserver(SingleObserver<? super T> singleObserver, C15679f c15679f) {
            this.f54061a = singleObserver;
            this.f54062b = c15679f;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null) {
                this.f54061a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f54063c = t;
            DisposableHelper.replace(this, this.f54062b.mo12918a((Runnable) this));
        }

        public void onError(Throwable th) {
            this.f54064d = th;
            DisposableHelper.replace(this, this.f54062b.mo12918a((Runnable) this));
        }

        public void run() {
            Throwable th = this.f54064d;
            if (th != null) {
                this.f54061a.onError(th);
            } else {
                this.f54061a.onSuccess(this.f54063c);
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }
    }

    public SingleObserveOn(SingleSource<T> singleSource, C15679f c15679f) {
        this.f57316a = singleSource;
        this.f57317b = c15679f;
    }

    /* renamed from: a */
    protected void m66534a(SingleObserver<? super T> singleObserver) {
        this.f57316a.subscribe(new ObserveOnSingleObserver(singleObserver, this.f57317b));
    }
}
