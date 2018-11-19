package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2400j;

/* renamed from: com.google.android.gms.ads.internal.n */
final class C2392n implements Runnable {
    /* renamed from: a */
    private /* synthetic */ AdOverlayInfoParcel f7300a;
    /* renamed from: b */
    private /* synthetic */ C4274m f7301b;

    C2392n(C4274m c4274m, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f7301b = c4274m;
        this.f7300a = adOverlayInfoParcel;
    }

    public final void run() {
        ar.m8646c();
        C2400j.m8731a(this.f7301b.f13898a.e.f7163c, this.f7300a, true);
    }
}
