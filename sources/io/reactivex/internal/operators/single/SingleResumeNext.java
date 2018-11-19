package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.C17395n;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleResumeNext<T> extends C3960g<T> {
    /* renamed from: a */
    final SingleSource<? extends T> f57318a;
    /* renamed from: b */
    final Function<? super Throwable, ? extends SingleSource<? extends T>> f57319b;

    static final class ResumeMainSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = -5314538511045349925L;
        /* renamed from: a */
        final SingleObserver<? super T> f54065a;
        /* renamed from: b */
        final Function<? super Throwable, ? extends SingleSource<? extends T>> f54066b;

        ResumeMainSingleObserver(SingleObserver<? super T> singleObserver, Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
            this.f54065a = singleObserver;
            this.f54066b = function;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null) {
                this.f54065a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f54065a.onSuccess(t);
        }

        public void onError(Throwable th) {
            try {
                ((SingleSource) C15684a.m58895a(this.f54066b.apply(th), "The nextFunction returned a null SingleSource.")).subscribe(new C17395n(this, this.f54065a));
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                this.f54065a.onError(new CompositeException(th, th2));
            }
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }
    }

    public SingleResumeNext(SingleSource<? extends T> singleSource, Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
        this.f57318a = singleSource;
        this.f57319b = function;
    }

    /* renamed from: a */
    protected void m66535a(SingleObserver<? super T> singleObserver) {
        this.f57318a.subscribe(new ResumeMainSingleObserver(singleObserver, this.f57319b));
    }
}
