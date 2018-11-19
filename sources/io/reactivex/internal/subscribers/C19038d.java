package io.reactivex.internal.subscribers;

import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.subscribers.d */
public final class C19038d<T> extends C18429c<T> {
    public void onNext(T t) {
        if (this.a == null) {
            this.a = t;
            this.c.cancel();
            countDown();
        }
    }

    public void onError(Throwable th) {
        if (this.a == null) {
            this.b = th;
        } else {
            C2667a.a(th);
        }
        countDown();
    }
}
