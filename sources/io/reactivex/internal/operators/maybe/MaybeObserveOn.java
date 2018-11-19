package io.reactivex.internal.operators.maybe;

import io.reactivex.C15679f;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeObserveOn<T> extends C18385a<T, T> {
    /* renamed from: b */
    final C15679f f58890b;

    static final class ObserveOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        /* renamed from: a */
        final MaybeObserver<? super T> f53262a;
        /* renamed from: b */
        final C15679f f53263b;
        /* renamed from: c */
        T f53264c;
        /* renamed from: d */
        Throwable f53265d;

        ObserveOnMaybeObserver(MaybeObserver<? super T> maybeObserver, C15679f c15679f) {
            this.f53262a = maybeObserver;
            this.f53263b = c15679f;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null) {
                this.f53262a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f53264c = t;
            DisposableHelper.replace(this, this.f53263b.mo12918a((Runnable) this));
        }

        public void onError(Throwable th) {
            this.f53265d = th;
            DisposableHelper.replace(this, this.f53263b.mo12918a((Runnable) this));
        }

        public void onComplete() {
            DisposableHelper.replace(this, this.f53263b.mo12918a((Runnable) this));
        }

        public void run() {
            Throwable th = this.f53265d;
            if (th != null) {
                this.f53265d = null;
                this.f53262a.onError(th);
                return;
            }
            Object obj = this.f53264c;
            if (obj != null) {
                this.f53264c = null;
                this.f53262a.onSuccess(obj);
                return;
            }
            this.f53262a.onComplete();
        }
    }

    public MaybeObserveOn(MaybeSource<T> maybeSource, C15679f c15679f) {
        super(maybeSource);
        this.f58890b = c15679f;
    }

    /* renamed from: a */
    protected void m67616a(MaybeObserver<? super T> maybeObserver) {
        this.a.subscribe(new ObserveOnMaybeObserver(maybeObserver, this.f58890b));
    }
}
