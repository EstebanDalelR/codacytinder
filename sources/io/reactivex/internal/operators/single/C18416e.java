package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.internal.operators.single.e */
public final class C18416e<T> extends C3960g<T> {
    /* renamed from: a */
    final SingleSource<T> f57335a;
    /* renamed from: b */
    final Consumer<? super T> f57336b;

    /* renamed from: io.reactivex.internal.operators.single.e$a */
    final class C17509a implements SingleObserver<T> {
        /* renamed from: a */
        final /* synthetic */ C18416e f54086a;
        /* renamed from: b */
        private final SingleObserver<? super T> f54087b;

        C17509a(C18416e c18416e, SingleObserver<? super T> singleObserver) {
            this.f54086a = c18416e;
            this.f54087b = singleObserver;
        }

        public void onSubscribe(Disposable disposable) {
            this.f54087b.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            try {
                this.f54086a.f57336b.accept(t);
                this.f54087b.onSuccess(t);
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f54087b.onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f54087b.onError(th);
        }
    }

    public C18416e(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.f57335a = singleSource;
        this.f57336b = consumer;
    }

    /* renamed from: a */
    protected void m66544a(SingleObserver<? super T> singleObserver) {
        this.f57335a.subscribe(new C17509a(this, singleObserver));
    }
}
