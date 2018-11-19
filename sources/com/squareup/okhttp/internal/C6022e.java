package com.squareup.okhttp.internal;

/* renamed from: com.squareup.okhttp.internal.e */
public abstract class C6022e implements Runnable {
    /* renamed from: b */
    protected final String f22042b;

    /* renamed from: b */
    protected abstract void mo6491b();

    public C6022e(String str, Object... objArr) {
        this.f22042b = String.format(str, objArr);
    }

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f22042b);
        try {
            mo6491b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
