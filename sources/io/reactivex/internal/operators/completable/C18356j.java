package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.operators.completable.C18355i.C17400a;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.internal.operators.completable.j */
public final class C18356j extends C3956a {
    /* renamed from: a */
    final Iterable<? extends CompletableSource> f56832a;

    public C18356j(Iterable<? extends CompletableSource> iterable) {
        this.f56832a = iterable;
    }

    /* renamed from: a */
    public void m66398a(CompletableObserver completableObserver) {
        Throwable a;
        C17356a c17356a = new C17356a();
        completableObserver.onSubscribe(c17356a);
        try {
            Iterator it = (Iterator) C15684a.m58895a(this.f56832a.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicThrowable atomicThrowable = new AtomicThrowable();
            while (!c17356a.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            a = atomicThrowable.m58960a();
                            if (a == null) {
                                completableObserver.onComplete();
                            } else {
                                completableObserver.onError(a);
                            }
                        }
                        return;
                    } else if (!c17356a.isDisposed()) {
                        try {
                            CompletableSource completableSource = (CompletableSource) C15684a.m58895a(it.next(), "The iterator returned a null CompletableSource");
                            if (!c17356a.isDisposed()) {
                                atomicInteger.getAndIncrement();
                                completableSource.subscribe(new C17400a(completableObserver, c17356a, atomicThrowable, atomicInteger));
                            } else {
                                return;
                            }
                        } catch (Throwable a2) {
                            C15678a.m58850b(a2);
                            atomicThrowable.m58961a(a2);
                        }
                    } else {
                        return;
                    }
                } catch (Throwable a22) {
                    C15678a.m58850b(a22);
                    atomicThrowable.m58961a(a22);
                }
            }
        } catch (Throwable a222) {
            C15678a.m58850b(a222);
            completableObserver.onError(a222);
        }
    }
}
