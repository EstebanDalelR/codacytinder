package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.internal.operators.single.c */
public final class C18414c<T> extends C3960g<T> {
    /* renamed from: a */
    final SingleSource<T> f57331a;
    /* renamed from: b */
    final Consumer<? super Throwable> f57332b;

    /* renamed from: io.reactivex.internal.operators.single.c$a */
    final class C17507a implements SingleObserver<T> {
        /* renamed from: a */
        final /* synthetic */ C18414c f54081a;
        /* renamed from: b */
        private final SingleObserver<? super T> f54082b;

        C17507a(C18414c c18414c, SingleObserver<? super T> singleObserver) {
            this.f54081a = c18414c;
            this.f54082b = singleObserver;
        }

        public void onSubscribe(Disposable disposable) {
            this.f54082b.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            this.f54082b.onSuccess(t);
        }

        public void onError(Throwable th) {
            try {
                this.f54081a.f57332b.accept(th);
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                th = new CompositeException(th, th2);
            }
            this.f54082b.onError(th);
        }
    }

    public C18414c(SingleSource<T> singleSource, Consumer<? super Throwable> consumer) {
        this.f57331a = singleSource;
        this.f57332b = consumer;
    }

    /* renamed from: a */
    protected void m66542a(SingleObserver<? super T> singleObserver) {
        this.f57331a.subscribe(new C17507a(this, singleObserver));
    }
}
