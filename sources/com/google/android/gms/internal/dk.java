package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

final class dk implements Runnable {
    /* renamed from: a */
    private /* synthetic */ Context f15954a;
    /* renamed from: b */
    private /* synthetic */ iw f15955b;

    dk(dj djVar, Context context, iw iwVar) {
        this.f15954a = context;
        this.f15955b = iwVar;
    }

    public final void run() {
        try {
            this.f15955b.m27364b(AdvertisingIdClient.getAdvertisingIdInfo(this.f15954a));
        } catch (Throwable e) {
            this.f15955b.m27363a(e);
            hx.m19912b("Exception while getting advertising Id info", e);
        }
    }
}
