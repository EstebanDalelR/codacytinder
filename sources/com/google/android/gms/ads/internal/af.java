package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.amp;
import com.google.android.gms.internal.ec;

final class af implements Runnable {
    /* renamed from: a */
    private /* synthetic */ amp f7089a;
    /* renamed from: b */
    private /* synthetic */ aa f7090b;

    af(aa aaVar, amp amp) {
        this.f7090b = aaVar;
        this.f7089a = amp;
    }

    public final void run() {
        try {
            if (this.f7090b.e.f7178r != null) {
                this.f7090b.e.f7178r.zza(this.f7089a);
            }
        } catch (Throwable e) {
            ec.c("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
