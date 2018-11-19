package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzqm;
import com.google.android.gms.internal.zzqz;

final class ah implements Runnable {
    /* renamed from: a */
    private /* synthetic */ zzqm f7094a;
    /* renamed from: b */
    private /* synthetic */ aa f7095b;

    ah(aa aaVar, zzqm zzqm) {
        this.f7095b = aaVar;
        this.f7094a = zzqm;
    }

    public final void run() {
        try {
            ((zzqz) this.f7095b.e.f7180t.get(this.f7094a.getCustomTemplateId())).zzb(this.f7094a);
        } catch (Throwable e) {
            ec.c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
