package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.amn;
import com.google.android.gms.internal.ec;

final class ae implements Runnable {
    /* renamed from: a */
    private /* synthetic */ amn f7087a;
    /* renamed from: b */
    private /* synthetic */ aa f7088b;

    ae(aa aaVar, amn amn) {
        this.f7088b = aaVar;
        this.f7087a = amn;
    }

    public final void run() {
        try {
            if (this.f7088b.e.f7177q != null) {
                this.f7088b.e.f7177q.zza(this.f7087a);
            }
        } catch (Throwable e) {
            ec.c("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }
}
