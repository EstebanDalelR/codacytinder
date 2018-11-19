package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.operators.single.d */
public final class C18415d<T> extends C3960g<T> {
    /* renamed from: a */
    final SingleSource<T> f57333a;
    /* renamed from: b */
    final Consumer<? super Disposable> f57334b;

    /* renamed from: io.reactivex.internal.operators.single.d$a */
    static final class C17508a<T> implements SingleObserver<T> {
        /* renamed from: a */
        final SingleObserver<? super T> f54083a;
        /* renamed from: b */
        final Consumer<? super Disposable> f54084b;
        /* renamed from: c */
        boolean f54085c;

        C17508a(SingleObserver<? super T> singleObserver, Consumer<? super Disposable> consumer) {
            this.f54083a = singleObserver;
            this.f54084b = consumer;
        }

        public void onSubscribe(Disposable disposable) {
            try {
                this.f54084b.accept(disposable);
                this.f54083a.onSubscribe(disposable);
            } catch (Throwable th) {
                C15678a.m58850b(th);
                this.f54085c = true;
                disposable.dispose();
                EmptyDisposable.error(th, this.f54083a);
            }
        }

        public void onSuccess(T t) {
            if (!this.f54085c) {
                this.f54083a.onSuccess(t);
            }
        }

        public void onError(Throwable th) {
            if (this.f54085c) {
                C2667a.a(th);
            } else {
                this.f54083a.onError(th);
            }
        }
    }

    public C18415d(SingleSource<T> singleSource, Consumer<? super Disposable> consumer) {
        this.f57333a = singleSource;
        this.f57334b = consumer;
    }

    /* renamed from: a */
    protected void m66543a(SingleObserver<? super T> singleObserver) {
        this.f57333a.subscribe(new C17508a(singleObserver, this.f57334b));
    }
}
