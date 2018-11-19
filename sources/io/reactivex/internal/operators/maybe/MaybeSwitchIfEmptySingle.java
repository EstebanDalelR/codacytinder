package io.reactivex.internal.operators.maybe;

import io.reactivex.C3960g;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeSwitchIfEmptySingle<T> extends C3960g<T> implements HasUpstreamMaybeSource<T> {
    /* renamed from: a */
    final MaybeSource<T> f57148a;
    /* renamed from: b */
    final SingleSource<? extends T> f57149b;

    static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = 4603919676453758899L;
        /* renamed from: a */
        final SingleObserver<? super T> f53274a;
        /* renamed from: b */
        final SingleSource<? extends T> f53275b;

        /* renamed from: io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle$SwitchIfEmptyMaybeObserver$a */
        static final class C17416a<T> implements SingleObserver<T> {
            /* renamed from: a */
            final SingleObserver<? super T> f53272a;
            /* renamed from: b */
            final AtomicReference<Disposable> f53273b;

            C17416a(SingleObserver<? super T> singleObserver, AtomicReference<Disposable> atomicReference) {
                this.f53272a = singleObserver;
                this.f53273b = atomicReference;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this.f53273b, disposable);
            }

            public void onSuccess(T t) {
                this.f53272a.onSuccess(t);
            }

            public void onError(Throwable th) {
                this.f53272a.onError(th);
            }
        }

        SwitchIfEmptyMaybeObserver(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource) {
            this.f53274a = singleObserver;
            this.f53275b = singleSource;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null) {
                this.f53274a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f53274a.onSuccess(t);
        }

        public void onError(Throwable th) {
            this.f53274a.onError(th);
        }

        public void onComplete() {
            Disposable disposable = (Disposable) get();
            if (disposable != DisposableHelper.DISPOSED && compareAndSet(disposable, null)) {
                this.f53275b.subscribe(new C17416a(this.f53274a, this));
            }
        }
    }

    public MaybeSwitchIfEmptySingle(MaybeSource<T> maybeSource, SingleSource<? extends T> singleSource) {
        this.f57148a = maybeSource;
        this.f57149b = singleSource;
    }

    public MaybeSource<T> source() {
        return this.f57148a;
    }

    /* renamed from: a */
    protected void m66481a(SingleObserver<? super T> singleObserver) {
        this.f57148a.subscribe(new SwitchIfEmptyMaybeObserver(singleObserver, this.f57149b));
    }
}
