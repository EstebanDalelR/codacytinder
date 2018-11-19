package io.reactivex.internal.operators.maybe;

import io.reactivex.C3960g;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import java.util.NoSuchElementException;

/* renamed from: io.reactivex.internal.operators.maybe.i */
public final class C18390i<T> extends C3960g<T> implements HasUpstreamMaybeSource<T> {
    /* renamed from: a */
    final MaybeSource<T> f57160a;
    /* renamed from: b */
    final T f57161b;

    /* renamed from: io.reactivex.internal.operators.maybe.i$a */
    static final class C17422a<T> implements MaybeObserver<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super T> f53295a;
        /* renamed from: b */
        final T f53296b;
        /* renamed from: c */
        Disposable f53297c;

        C17422a(SingleObserver<? super T> singleObserver, T t) {
            this.f53295a = singleObserver;
            this.f53296b = t;
        }

        public void dispose() {
            this.f53297c.dispose();
            this.f53297c = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f53297c.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53297c, disposable)) {
                this.f53297c = disposable;
                this.f53295a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f53297c = DisposableHelper.DISPOSED;
            this.f53295a.onSuccess(t);
        }

        public void onError(Throwable th) {
            this.f53297c = DisposableHelper.DISPOSED;
            this.f53295a.onError(th);
        }

        public void onComplete() {
            this.f53297c = DisposableHelper.DISPOSED;
            if (this.f53296b != null) {
                this.f53295a.onSuccess(this.f53296b);
            } else {
                this.f53295a.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }
    }

    public C18390i(MaybeSource<T> maybeSource, T t) {
        this.f57160a = maybeSource;
        this.f57161b = t;
    }

    public MaybeSource<T> source() {
        return this.f57160a;
    }

    /* renamed from: a */
    protected void m66488a(SingleObserver<? super T> singleObserver) {
        this.f57160a.subscribe(new C17422a(singleObserver, this.f57161b));
    }
}
