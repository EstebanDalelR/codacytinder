package io.reactivex.internal.operators.completable;

import io.reactivex.C3960g;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.completable.p */
public final class C18362p<T> extends C3960g<T> {
    /* renamed from: a */
    final CompletableSource f56846a;
    /* renamed from: b */
    final Callable<? extends T> f56847b;
    /* renamed from: c */
    final T f56848c;

    /* renamed from: io.reactivex.internal.operators.completable.p$a */
    final class C17406a implements CompletableObserver {
        /* renamed from: a */
        final /* synthetic */ C18362p f53212a;
        /* renamed from: b */
        private final SingleObserver<? super T> f53213b;

        C17406a(C18362p c18362p, SingleObserver<? super T> singleObserver) {
            this.f53212a = c18362p;
            this.f53213b = singleObserver;
        }

        public void onComplete() {
            if (this.f53212a.f56847b != null) {
                try {
                    Object call = this.f53212a.f56847b.call();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    this.f53213b.onError(th);
                    return;
                }
            }
            call = this.f53212a.f56848c;
            if (call == null) {
                this.f53213b.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f53213b.onSuccess(call);
            }
        }

        public void onError(Throwable th) {
            this.f53213b.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f53213b.onSubscribe(disposable);
        }
    }

    public C18362p(CompletableSource completableSource, Callable<? extends T> callable, T t) {
        this.f56846a = completableSource;
        this.f56848c = t;
        this.f56847b = callable;
    }

    /* renamed from: a */
    protected void m66403a(SingleObserver<? super T> singleObserver) {
        this.f56846a.subscribe(new C17406a(this, singleObserver));
    }
}
