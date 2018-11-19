package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class CompletableConcatArray extends C3956a {
    /* renamed from: a */
    final CompletableSource[] f56806a;

    static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {
        private static final long serialVersionUID = -7965400327305809232L;
        /* renamed from: a */
        final CompletableObserver f53178a;
        /* renamed from: b */
        final CompletableSource[] f53179b;
        /* renamed from: c */
        int f53180c;
        /* renamed from: d */
        final SequentialDisposable f53181d = new SequentialDisposable();

        ConcatInnerObserver(CompletableObserver completableObserver, CompletableSource[] completableSourceArr) {
            this.f53178a = completableObserver;
            this.f53179b = completableSourceArr;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53181d.m63458b(disposable);
        }

        public void onError(Throwable th) {
            this.f53178a.onError(th);
        }

        public void onComplete() {
            m63485a();
        }

        /* renamed from: a */
        void m63485a() {
            if (!this.f53181d.isDisposed() && getAndIncrement() == 0) {
                CompletableSource[] completableSourceArr = this.f53179b;
                while (!this.f53181d.isDisposed()) {
                    int i = this.f53180c;
                    this.f53180c = i + 1;
                    if (i == completableSourceArr.length) {
                        this.f53178a.onComplete();
                        return;
                    }
                    completableSourceArr[i].subscribe(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    public CompletableConcatArray(CompletableSource[] completableSourceArr) {
        this.f56806a = completableSourceArr;
    }

    /* renamed from: a */
    public void m66383a(CompletableObserver completableObserver) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(completableObserver, this.f56806a);
        completableObserver.onSubscribe(concatInnerObserver.f53181d);
        concatInnerObserver.m63485a();
    }
}
