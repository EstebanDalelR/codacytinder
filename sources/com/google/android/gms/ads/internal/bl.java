package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.amp;
import com.google.android.gms.internal.ec;

final class bl implements Runnable {
    /* renamed from: a */
    private /* synthetic */ amp f7208a;
    /* renamed from: b */
    private /* synthetic */ bi f7209b;

    bl(bi biVar, amp amp) {
        this.f7209b = biVar;
        this.f7208a = amp;
    }

    public final void run() {
        try {
            if (this.f7209b.e.f7178r != null) {
                this.f7209b.e.f7178r.zza(this.f7208a);
            }
        } catch (Throwable e) {
            ec.c("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
