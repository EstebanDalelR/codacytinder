package com.facebook.ads.internal.p047k;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.k.ao */
public abstract class ao<T> implements Runnable {
    /* renamed from: a */
    private final WeakReference<T> f4092a;

    public ao(T t) {
        this.f4092a = new WeakReference(t);
    }

    /* renamed from: a */
    public T m5207a() {
        return this.f4092a.get();
    }
}
