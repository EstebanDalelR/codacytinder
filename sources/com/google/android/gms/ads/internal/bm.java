package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzqm;
import com.google.android.gms.internal.zzqz;

final class bm implements Runnable {
    /* renamed from: a */
    private /* synthetic */ zzqm f7210a;
    /* renamed from: b */
    private /* synthetic */ bi f7211b;

    bm(bi biVar, zzqm zzqm) {
        this.f7211b = biVar;
        this.f7210a = zzqm;
    }

    public final void run() {
        try {
            ((zzqz) this.f7211b.e.f7180t.get(this.f7210a.getCustomTemplateId())).zzb(this.f7210a);
        } catch (Throwable e) {
            ec.c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
