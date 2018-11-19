package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleFlatMap<T, R> extends C3960g<R> {
    /* renamed from: a */
    final SingleSource<? extends T> f57312a;
    /* renamed from: b */
    final Function<? super T, ? extends SingleSource<? extends R>> f57313b;

    static final class SingleFlatMapCallback<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = 3258103020495908596L;
        /* renamed from: a */
        final SingleObserver<? super R> f54057a;
        /* renamed from: b */
        final Function<? super T, ? extends SingleSource<? extends R>> f54058b;

        /* renamed from: io.reactivex.internal.operators.single.SingleFlatMap$SingleFlatMapCallback$a */
        static final class C17504a<R> implements SingleObserver<R> {
            /* renamed from: a */
            final AtomicReference<Disposable> f54055a;
            /* renamed from: b */
            final SingleObserver<? super R> f54056b;

            C17504a(AtomicReference<Disposable> atomicReference, SingleObserver<? super R> singleObserver) {
                this.f54055a = atomicReference;
                this.f54056b = singleObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this.f54055a, disposable);
            }

            public void onSuccess(R r) {
                this.f54056b.onSuccess(r);
            }

            public void onError(Throwable th) {
                this.f54056b.onError(th);
            }
        }

        SingleFlatMapCallback(SingleObserver<? super R> singleObserver, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f54057a = singleObserver;
            this.f54058b = function;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null) {
                this.f54057a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                SingleSource singleSource = (SingleSource) C15684a.m58895a(this.f54058b.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    singleSource.subscribe(new C17504a(this, this.f54057a));
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f54057a.onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f54057a.onError(th);
        }
    }

    public SingleFlatMap(SingleSource<? extends T> singleSource, Function<? super T, ? extends SingleSource<? extends R>> function) {
        this.f57313b = function;
        this.f57312a = singleSource;
    }

    /* renamed from: a */
    protected void m66532a(SingleObserver<? super R> singleObserver) {
        this.f57312a.subscribe(new SingleFlatMapCallback(singleObserver, this.f57313b));
    }
}
