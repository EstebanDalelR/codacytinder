package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.amn;
import com.google.android.gms.internal.amp;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzou;
import java.util.List;

final class ad implements Runnable {
    /* renamed from: a */
    private /* synthetic */ zzou f7083a;
    /* renamed from: b */
    private /* synthetic */ int f7084b;
    /* renamed from: c */
    private /* synthetic */ List f7085c;
    /* renamed from: d */
    private /* synthetic */ aa f7086d;

    ad(aa aaVar, zzou zzou, int i, List list) {
        this.f7086d = aaVar;
        this.f7083a = zzou;
        this.f7084b = i;
        this.f7085c = list;
    }

    public final void run() {
        try {
            boolean z = false;
            aa aaVar;
            if ((this.f7083a instanceof amp) && this.f7086d.e.f7178r != null) {
                aaVar = this.f7086d;
                if (this.f7084b != this.f7085c.size() - 1) {
                    z = true;
                }
                aaVar.c = z;
                this.f7086d.e.f7178r.zza((amp) this.f7083a);
            } else if (!(this.f7083a instanceof amn) || this.f7086d.e.f7177q == null) {
                C4269a c4269a = this.f7086d;
                if (this.f7084b != this.f7085c.size() - 1) {
                    z = true;
                }
                c4269a.mo3998a(3, z);
            } else {
                aaVar = this.f7086d;
                if (this.f7084b != this.f7085c.size() - 1) {
                    z = true;
                }
                aaVar.c = z;
                this.f7086d.e.f7177q.zza((amn) this.f7083a);
            }
        } catch (Throwable e) {
            ec.c("Could not call onAppInstallAdLoaded or onContentAdLoaded method", e);
        }
    }
}
