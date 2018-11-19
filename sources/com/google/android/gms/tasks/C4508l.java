package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.l */
final class C4508l implements Runnable {
    /* renamed from: a */
    private /* synthetic */ C4500a f16749a;
    /* renamed from: b */
    private /* synthetic */ C6292k f16750b;

    C4508l(C6292k c6292k, C4500a c4500a) {
        this.f16750b = c6292k;
        this.f16749a = c4500a;
    }

    public final void run() {
        synchronized (this.f16750b.f23563b) {
            if (this.f16750b.f23564c != null) {
                this.f16750b.f23564c.onSuccess(this.f16749a.mo4765c());
            }
        }
    }
}
