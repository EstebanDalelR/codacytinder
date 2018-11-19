package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.amb;
import com.google.android.gms.internal.amc;
import com.google.android.gms.internal.aum;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.zzafb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zznx;

final class bd implements Runnable {
    /* renamed from: a */
    final /* synthetic */ dm f7196a;
    /* renamed from: b */
    final /* synthetic */ zzafb f7197b;
    /* renamed from: c */
    final /* synthetic */ ba f7198c;
    /* renamed from: d */
    private /* synthetic */ amb f7199d;

    bd(ba baVar, dm dmVar, zzafb zzafb, amb amb) {
        this.f7198c = baVar;
        this.f7196a = dmVar;
        this.f7197b = zzafb;
        this.f7199d = amb;
    }

    public final void run() {
        if (this.f7196a.f15996b.zzcpf && this.f7198c.e.f7186z != null) {
            String str = null;
            if (this.f7196a.f15996b.zzcja != null) {
                ar.m8648e();
                str = fk.a(this.f7196a.f15996b.zzcja);
            }
            zznx amc = new amc(this.f7198c, str, this.f7196a.f15996b.body);
            this.f7198c.e.f7152F = 1;
            try {
                this.f7198c.c = false;
                this.f7198c.e.f7186z.zza(amc);
                return;
            } catch (Throwable e) {
                ec.c("Could not call the onCustomRenderedAdLoadedListener.", e);
                this.f7198c.c = true;
            }
        }
        bo boVar = new bo(this.f7198c.e.f7163c, this.f7197b, this.f7196a.f15996b.zzcpp);
        try {
            zzanh a = this.f7198c.mo4034a(this.f7196a, boVar, this.f7197b);
            a.setOnTouchListener(new bf(this, boVar));
            a.setOnClickListener(new bg(this, boVar));
            this.f7198c.e.f7152F = 0;
            as asVar = this.f7198c.e;
            ar.m8647d();
            asVar.f7168h = aum.a(this.f7198c.e.f7163c, this.f7198c, this.f7196a, this.f7198c.e.f7164d, a, this.f7198c.i, this.f7198c, this.f7199d);
        } catch (Throwable e2) {
            ec.b("Could not obtain webview.", e2);
            fk.f16060a.post(new be(this));
        }
    }
}
