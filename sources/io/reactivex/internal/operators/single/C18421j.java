package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;

/* renamed from: io.reactivex.internal.operators.single.j */
public final class C18421j<T, R> extends C3960g<R> {
    /* renamed from: a */
    final SingleSource<? extends T> f57341a;
    /* renamed from: b */
    final Function<? super T, ? extends R> f57342b;

    /* renamed from: io.reactivex.internal.operators.single.j$a */
    static final class C17510a<T, R> implements SingleObserver<T> {
        /* renamed from: a */
        final SingleObserver<? super R> f54088a;
        /* renamed from: b */
        final Function<? super T, ? extends R> f54089b;

        C17510a(SingleObserver<? super R> singleObserver, Function<? super T, ? extends R> function) {
            this.f54088a = singleObserver;
            this.f54089b = function;
        }

        public void onSubscribe(Disposable disposable) {
            this.f54088a.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            try {
                this.f54088a.onSuccess(C15684a.m58895a(this.f54089b.apply(t), "The mapper function returned a null value."));
            } catch (T t2) {
                C15678a.m58850b(t2);
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f54088a.onError(th);
        }
    }

    public C18421j(SingleSource<? extends T> singleSource, Function<? super T, ? extends R> function) {
        this.f57341a = singleSource;
        this.f57342b = function;
    }

    /* renamed from: a */
    protected void m66549a(SingleObserver<? super R> singleObserver) {
        this.f57341a.subscribe(new C17510a(singleObserver, this.f57342b));
    }
}
