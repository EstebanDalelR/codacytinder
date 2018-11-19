package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.amn;
import com.google.android.gms.internal.ec;

final class bk implements Runnable {
    /* renamed from: a */
    private /* synthetic */ amn f7206a;
    /* renamed from: b */
    private /* synthetic */ bi f7207b;

    bk(bi biVar, amn amn) {
        this.f7207b = biVar;
        this.f7206a = amn;
    }

    public final void run() {
        try {
            if (this.f7207b.e.f7177q != null) {
                this.f7207b.e.f7177q.zza(this.f7206a);
            }
        } catch (Throwable e) {
            ec.c("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }
}
