package com.tinder.utils;

import java.lang.ref.WeakReference;

@Deprecated
public abstract class ax<T> implements Runnable {
    /* renamed from: a */
    private WeakReference<T> f47623a;

    /* renamed from: a */
    public abstract void m57653a(T t);

    public ax(T t) {
        this.f47623a = new WeakReference(t);
    }

    public void run() {
        Object obj = this.f47623a.get();
        if (obj != null) {
            m57653a(obj);
        } else {
            ad.c("Reference was null for WeakRunnable");
        }
    }
}
