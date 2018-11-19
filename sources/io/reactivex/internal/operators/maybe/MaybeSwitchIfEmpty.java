package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeSwitchIfEmpty<T> extends C18385a<T, T> {
    /* renamed from: b */
    final MaybeSource<? extends T> f58892b;

    static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = -2223459372976438024L;
        /* renamed from: a */
        final MaybeObserver<? super T> f53270a;
        /* renamed from: b */
        final MaybeSource<? extends T> f53271b;

        /* renamed from: io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver$a */
        static final class C17415a<T> implements MaybeObserver<T> {
            /* renamed from: a */
            final MaybeObserver<? super T> f53268a;
            /* renamed from: b */
            final AtomicReference<Disposable> f53269b;

            C17415a(MaybeObserver<? super T> maybeObserver, AtomicReference<Disposable> atomicReference) {
                this.f53268a = maybeObserver;
                this.f53269b = atomicReference;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this.f53269b, disposable);
            }

            public void onSuccess(T t) {
                this.f53268a.onSuccess(t);
            }

            public void onError(Throwable th) {
                this.f53268a.onError(th);
            }

            public void onComplete() {
                this.f53268a.onComplete();
            }
        }

        SwitchIfEmptyMaybeObserver(MaybeObserver<? super T> maybeObserver, MaybeSource<? extends T> maybeSource) {
            this.f53270a = maybeObserver;
            this.f53271b = maybeSource;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null) {
                this.f53270a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f53270a.onSuccess(t);
        }

        public void onError(Throwable th) {
            this.f53270a.onError(th);
        }

        public void onComplete() {
            Disposable disposable = (Disposable) get();
            if (disposable != DisposableHelper.DISPOSED && compareAndSet(disposable, null)) {
                this.f53271b.subscribe(new C17415a(this.f53270a, this));
            }
        }
    }

    public MaybeSwitchIfEmpty(MaybeSource<T> maybeSource, MaybeSource<? extends T> maybeSource2) {
        super(maybeSource);
        this.f58892b = maybeSource2;
    }

    /* renamed from: a */
    protected void m67618a(MaybeObserver<? super T> maybeObserver) {
        this.a.subscribe(new SwitchIfEmptyMaybeObserver(maybeObserver, this.f58892b));
    }
}
