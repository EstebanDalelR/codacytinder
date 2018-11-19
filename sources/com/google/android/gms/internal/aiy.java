package com.google.android.gms.internal;

final class aiy implements Runnable {
    /* renamed from: a */
    private final aom f15319a;
    /* renamed from: b */
    private final asu f15320b;
    /* renamed from: c */
    private final Runnable f15321c;

    public aiy(ahh ahh, aom aom, asu asu, Runnable runnable) {
        this.f15319a = aom;
        this.f15320b = asu;
        this.f15321c = runnable;
    }

    public final void run() {
        if ((this.f15320b.f15691c == null ? 1 : null) != null) {
            this.f15319a.mo4624a(this.f15320b.f15689a);
        } else {
            this.f15319a.m19384a(this.f15320b.f15691c);
        }
        if (this.f15320b.f15692d) {
            this.f15319a.m19388b("intermediate-response");
        } else {
            this.f15319a.m19390c("done");
        }
        if (this.f15321c != null) {
            this.f15321c.run();
        }
    }
}
