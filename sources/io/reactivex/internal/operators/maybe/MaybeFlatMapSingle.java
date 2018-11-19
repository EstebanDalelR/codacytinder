package io.reactivex.internal.operators.maybe;

import io.reactivex.C3960g;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatMapSingle<T, R> extends C3960g<R> {
    /* renamed from: a */
    final MaybeSource<T> f57146a;
    /* renamed from: b */
    final Function<? super T, ? extends SingleSource<? extends R>> f57147b;

    static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = 4827726964688405508L;
        /* renamed from: a */
        final SingleObserver<? super R> f53254a;
        /* renamed from: b */
        final Function<? super T, ? extends SingleSource<? extends R>> f53255b;

        FlatMapMaybeObserver(SingleObserver<? super R> singleObserver, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f53254a = singleObserver;
            this.f53255b = function;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null) {
                this.f53254a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                SingleSource singleSource = (SingleSource) C15684a.m58895a(this.f53255b.apply(t), "The mapper returned a null SingleSource");
                if (!isDisposed()) {
                    singleSource.subscribe(new C17413a(this, this.f53254a));
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f53254a.onError(th);
        }

        public void onComplete() {
            this.f53254a.onError(new NoSuchElementException());
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFlatMapSingle$a */
    static final class C17413a<R> implements SingleObserver<R> {
        /* renamed from: a */
        final AtomicReference<Disposable> f53256a;
        /* renamed from: b */
        final SingleObserver<? super R> f53257b;

        C17413a(AtomicReference<Disposable> atomicReference, SingleObserver<? super R> singleObserver) {
            this.f53256a = atomicReference;
            this.f53257b = singleObserver;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f53256a, disposable);
        }

        public void onSuccess(R r) {
            this.f53257b.onSuccess(r);
        }

        public void onError(Throwable th) {
            this.f53257b.onError(th);
        }
    }

    public MaybeFlatMapSingle(MaybeSource<T> maybeSource, Function<? super T, ? extends SingleSource<? extends R>> function) {
        this.f57146a = maybeSource;
        this.f57147b = function;
    }

    /* renamed from: a */
    protected void m66480a(SingleObserver<? super R> singleObserver) {
        this.f57146a.subscribe(new FlatMapMaybeObserver(singleObserver, this.f57147b));
    }
}
