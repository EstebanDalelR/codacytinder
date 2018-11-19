package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.amr;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzqz;

final class ag implements Runnable {
    /* renamed from: a */
    private /* synthetic */ String f7091a;
    /* renamed from: b */
    private /* synthetic */ dl f7092b;
    /* renamed from: c */
    private /* synthetic */ aa f7093c;

    ag(aa aaVar, String str, dl dlVar) {
        this.f7093c = aaVar;
        this.f7091a = str;
        this.f7092b = dlVar;
    }

    public final void run() {
        try {
            ((zzqz) this.f7093c.e.f7180t.get(this.f7091a)).zzb((amr) this.f7092b.f15957B);
        } catch (Throwable e) {
            ec.c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
