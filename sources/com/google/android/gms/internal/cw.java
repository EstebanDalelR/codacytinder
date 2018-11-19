package com.google.android.gms.internal;

import java.util.Map;

final class cw implements Runnable {
    /* renamed from: a */
    private /* synthetic */ zzakv f15938a;
    /* renamed from: b */
    private /* synthetic */ cu f15939b;

    cw(cu cuVar, zzakv zzakv) {
        this.f15939b = cuVar;
        this.f15938a = zzakv;
    }

    public final void run() {
        try {
            this.f15939b.m27279a((Map) this.f15938a.get());
            if (this.f15939b.f23243a) {
                synchronized (this.f15939b.f23249g) {
                    this.f15939b.f23244b.f26552a = Integer.valueOf(9);
                }
            }
            this.f15939b.m27278a();
        } catch (Throwable e) {
            String str = "Failed to get SafeBrowsing metadata";
            if (((Boolean) aja.m19221f().m19334a(alo.cl)).booleanValue()) {
                hx.m19909a(str, e);
            }
        }
    }
}
