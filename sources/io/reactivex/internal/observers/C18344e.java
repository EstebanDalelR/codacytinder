package io.reactivex.internal.observers;

/* renamed from: io.reactivex.internal.observers.e */
public final class C18344e<T> extends C17389c<T> {
    public void onNext(T t) {
        this.a = t;
    }

    public void onError(Throwable th) {
        this.a = null;
        this.b = th;
        countDown();
    }
}
