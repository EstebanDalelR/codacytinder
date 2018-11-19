package com.google.android.gms.internal;

final class agr implements Runnable {
    /* renamed from: a */
    private /* synthetic */ agq f15222a;

    agr(agq agq) {
        this.f15222a = agq;
    }

    public final void run() {
        synchronized (this.f15222a.f15214c) {
            if (this.f15222a.f15215d && this.f15222a.f15216e) {
                this.f15222a.f15215d = false;
                hx.m19911b("App went background");
                for (zzhj zzg : this.f15222a.f15217f) {
                    try {
                        zzg.zzg(false);
                    } catch (Throwable e) {
                        hx.m19912b("OnForegroundStateChangedListener threw exception.", e);
                    }
                }
            } else {
                hx.m19911b("App is still foreground");
            }
        }
    }
}
