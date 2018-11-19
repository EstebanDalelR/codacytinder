package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.h */
final class C4506h implements Runnable {
    /* renamed from: a */
    private /* synthetic */ C4500a f16745a;
    /* renamed from: b */
    private /* synthetic */ C6290g f16746b;

    C4506h(C6290g c6290g, C4500a c4500a) {
        this.f16746b = c6290g;
        this.f16745a = c4500a;
    }

    public final void run() {
        synchronized (this.f16746b.f23557b) {
            if (this.f16746b.f23558c != null) {
                this.f16746b.f23558c.onComplete(this.f16745a);
            }
        }
    }
}
