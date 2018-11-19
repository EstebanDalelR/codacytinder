package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.j */
final class C4507j implements Runnable {
    /* renamed from: a */
    private /* synthetic */ C4500a f16747a;
    /* renamed from: b */
    private /* synthetic */ C6291i f16748b;

    C4507j(C6291i c6291i, C4500a c4500a) {
        this.f16748b = c6291i;
        this.f16747a = c4500a;
    }

    public final void run() {
        synchronized (this.f16748b.f23560b) {
            if (this.f16748b.f23561c != null) {
                this.f16748b.f23561c.onFailure(this.f16747a.mo4766d());
            }
        }
    }
}
