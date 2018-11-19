package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.internal.operators.completable.i */
public final class C18355i extends C3956a {
    /* renamed from: a */
    final CompletableSource[] f56831a;

    /* renamed from: io.reactivex.internal.operators.completable.i$a */
    static final class C17400a implements CompletableObserver {
        /* renamed from: a */
        final CompletableObserver f53198a;
        /* renamed from: b */
        final C17356a f53199b;
        /* renamed from: c */
        final AtomicThrowable f53200c;
        /* renamed from: d */
        final AtomicInteger f53201d;

        C17400a(CompletableObserver completableObserver, C17356a c17356a, AtomicThrowable atomicThrowable, AtomicInteger atomicInteger) {
            this.f53198a = completableObserver;
            this.f53199b = c17356a;
            this.f53200c = atomicThrowable;
            this.f53201d = atomicInteger;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53199b.add(disposable);
        }

        public void onError(Throwable th) {
            if (this.f53200c.m58961a(th)) {
                m63488a();
            } else {
                C2667a.a(th);
            }
        }

        public void onComplete() {
            m63488a();
        }

        /* renamed from: a */
        void m63488a() {
            if (this.f53201d.decrementAndGet() == 0) {
                Throwable a = this.f53200c.m58960a();
                if (a == null) {
                    this.f53198a.onComplete();
                } else {
                    this.f53198a.onError(a);
                }
            }
        }
    }

    /* renamed from: a */
    public void m66397a(CompletableObserver completableObserver) {
        C17356a c17356a = new C17356a();
        AtomicInteger atomicInteger = new AtomicInteger(this.f56831a.length + 1);
        AtomicThrowable atomicThrowable = new AtomicThrowable();
        completableObserver.onSubscribe(c17356a);
        CompletableSource[] completableSourceArr = this.f56831a;
        int length = completableSourceArr.length;
        int i = 0;
        while (i < length) {
            CompletableSource completableSource = completableSourceArr[i];
            if (!c17356a.isDisposed()) {
                if (completableSource == null) {
                    atomicThrowable.m58961a(new NullPointerException("A completable source is null"));
                    atomicInteger.decrementAndGet();
                } else {
                    completableSource.subscribe(new C17400a(completableObserver, c17356a, atomicThrowable, atomicInteger));
                }
                i++;
            } else {
                return;
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable a = atomicThrowable.m58960a();
            if (a == null) {
                completableObserver.onComplete();
            } else {
                completableObserver.onError(a);
            }
        }
    }
}
