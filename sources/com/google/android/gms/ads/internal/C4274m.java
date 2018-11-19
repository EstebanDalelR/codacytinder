package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.dy;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.m */
final class C4274m extends dy {
    /* renamed from: a */
    final /* synthetic */ C4458k f13898a;
    /* renamed from: b */
    private final int f13899b;

    public C4274m(C4458k c4458k, int i) {
        this.f13898a = c4458k;
        this.f13899b = i;
    }

    /* renamed from: a */
    public final void m17136a() {
        zzao zzao = new zzao(this.f13898a.e.f7153G, this.f13898a.m18661g(), this.f13898a.f14832l, this.f13898a.f14833m, this.f13898a.e.f7153G ? this.f13899b : -1, this.f13898a.f14834n, this.f13898a.e.f7170j.f15964I);
        int requestedOrientation = this.f13898a.e.f7170j.f15970b.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.f13898a.e.f7170j.f15975g;
        }
        fk.f16060a.post(new C2392n(this, new AdOverlayInfoParcel(this.f13898a, this.f13898a, this.f13898a, this.f13898a.e.f7170j.f15970b, requestedOrientation, this.f13898a.e.f7165e, this.f13898a.e.f7170j.f15994z, zzao)));
    }

    /* renamed from: b */
    public final void m17137b() {
    }
}
