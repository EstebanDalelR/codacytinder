package io.reactivex.internal.observers;

/* renamed from: io.reactivex.internal.observers.d */
public final class C18343d<T> extends C17389c<T> {
    public void onNext(T t) {
        if (this.a == null) {
            this.a = t;
            this.c.dispose();
            countDown();
        }
    }

    public void onError(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }
}
