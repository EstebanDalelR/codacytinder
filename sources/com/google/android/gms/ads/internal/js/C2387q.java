package com.google.android.gms.ads.internal.js;

/* renamed from: com.google.android.gms.ads.internal.js.q */
final class C2387q implements Runnable {
    /* renamed from: a */
    private /* synthetic */ String f7285a;
    /* renamed from: b */
    private /* synthetic */ C4390l f7286b;

    C2387q(C4390l c4390l, String str) {
        this.f7286b = c4390l;
        this.f7285a = str;
    }

    public final void run() {
        this.f7286b.f14562a.loadUrl(this.f7285a);
    }
}
