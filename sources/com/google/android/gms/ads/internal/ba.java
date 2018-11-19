package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.afd;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.amb;
import com.google.android.gms.internal.aum;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.mb;
import com.google.android.gms.internal.zzafb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanv;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzxc;
import com.google.android.gms.internal.zzzv;

@zzzv
public class ba extends av implements zzae, zzxc {
    /* renamed from: j */
    private boolean f14809j;

    public ba(Context context, zzjn zzjn, String str, zzux zzux, zzakd zzakd, bn bnVar) {
        super(context, zzjn, str, zzux, zzakd, bnVar);
    }

    /* renamed from: a */
    protected zzanh mo4034a(dm dmVar, @Nullable bo boVar, @Nullable zzafb zzafb) throws zzanv {
        dm dmVar2 = dmVar;
        View nextView = this.e.f7166f.getNextView();
        if (nextView instanceof zzanh) {
            ((zzanh) nextView).destroy();
        }
        if (nextView != null) {
            r12.e.f7166f.removeView(nextView);
        }
        zzanh a = ar.m8649f().a(r12.e.f7163c, mb.a(r12.e.f7169i), r12.e.f7169i.zzbek, false, false, r12.e.f7164d, r12.e.f7165e, r12.a, r12, r12.h, dmVar2.f16003i);
        if (r12.e.f7169i.zzbem == null) {
            if (a == null) {
                throw null;
            }
            m17090a((View) a);
        }
        a.zzsz().a(r12, r12, r12, r12, false, null, boVar, r12, zzafb);
        m18579a(a);
        a.zzda(dmVar2.f15995a.zzcnq);
        return a;
    }

    /* renamed from: a */
    protected void mo3999a(dm dmVar, amb amb) {
        if (dmVar.f15999e != -2) {
            fk.f16060a.post(new bc(this, dmVar));
            return;
        }
        if (dmVar.f15998d != null) {
            this.e.f7169i = dmVar.f15998d;
        }
        if (!dmVar.f15996b.zzcow || dmVar.f15996b.zzbep) {
            fk.f16060a.post(new bd(this, dmVar, this.h.f7214c.zza(this.e.f7163c, this.e.f7165e, dmVar.f15996b), amb));
            return;
        }
        this.e.f7152F = 0;
        as asVar = this.e;
        ar.m8647d();
        asVar.f7168h = aum.a(this.e.f7163c, this, dmVar, this.e.f7164d, null, this.i, this, amb);
    }

    /* renamed from: a */
    protected final void m18579a(zzanh zzanh) {
        zzanh.zza("/trackActiveViewUnit", new bb(this));
    }

    /* renamed from: a */
    protected boolean mo3743a(@android.support.annotation.Nullable com.google.android.gms.internal.dl r3, com.google.android.gms.internal.dl r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.e;
        r0 = r0.m8677d();
        if (r0 == 0) goto L_0x001b;
    L_0x0008:
        r0 = r2.e;
        r0 = r0.f7166f;
        if (r0 == 0) goto L_0x001b;
    L_0x000e:
        r0 = r2.e;
        r0 = r0.f7166f;
        r0 = r0.m8680a();
        r1 = r4.f15994z;
        r0.c(r1);
    L_0x001b:
        r0 = r4.f15970b;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x006a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x001f:
        r0 = r4.f15981m;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 != 0) goto L_0x006a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x0023:
        r0 = r4.f15965J;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x006a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x0027:
        r0 = com.google.android.gms.internal.alo.cP;	 Catch:{ RuntimeException -> 0x0065 }
        r1 = com.google.android.gms.internal.aja.f();	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r1.a(r0);	 Catch:{ RuntimeException -> 0x0065 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r0.booleanValue();	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x006a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x0039:
        r0 = r4.f15969a;	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r0.zzbdt;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x004a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x003f:
        r1 = "com.google.ads.mediation.AbstractAdViewAdapter";	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r1.equals(r0);	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x0048;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x0047:
        goto L_0x004a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x0048:
        r0 = 0;	 Catch:{ RuntimeException -> 0x0065 }
        goto L_0x004b;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x004a:
        r0 = 1;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x004b:
        if (r0 == 0) goto L_0x006a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x004d:
        r0 = r4.f15969a;	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r0.extras;	 Catch:{ RuntimeException -> 0x0065 }
        r1 = "sdk_less_server_data";	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r0.containsKey(r1);	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 != 0) goto L_0x006a;
    L_0x0059:
        r0 = r4.f15970b;	 Catch:{ Throwable -> 0x005f }
        r0.zztl();	 Catch:{ Throwable -> 0x005f }
        goto L_0x006a;
    L_0x005f:
        r0 = "Could not render test Ad label.";	 Catch:{ RuntimeException -> 0x0065 }
        com.google.android.gms.internal.ec.a(r0);	 Catch:{ RuntimeException -> 0x0065 }
        goto L_0x006a;
    L_0x0065:
        r0 = "Could not render test AdLabel.";
        com.google.android.gms.internal.ec.a(r0);
    L_0x006a:
        r3 = super.mo3743a(r3, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ba.a(com.google.android.gms.internal.dl, com.google.android.gms.internal.dl):boolean");
    }

    /* renamed from: b */
    final void m18581b(zzanh zzanh) {
        if (this.e.f7170j != null) {
            afd afd = this.g;
            zzjn zzjn = this.e.f7169i;
            dl dlVar = this.e.f7170j;
            if (zzanh == null) {
                throw null;
            }
            afd.a(zzjn, dlVar, (View) zzanh, zzanh);
            this.f14809j = false;
            return;
        }
        this.f14809j = true;
        ec.e("Request to enable ActiveView before adState is available.");
    }

    /* renamed from: e */
    protected void mo4002e() {
        super.mo4002e();
        if (this.f14809j) {
            if (((Boolean) aja.f().a(alo.bS)).booleanValue()) {
                m18581b(this.e.f7170j.f15970b);
            }
        }
    }

    public final void zza(int i, int i2, int i3, int i4) {
        m17101d();
    }

    public final void zza(zzoa zzoa) {
        ad.m9053b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.e.f7186z = zzoa;
    }

    public final void zzcs() {
        onAdClicked();
    }

    public final void zzct() {
        recordImpression();
        zzbu();
    }

    public final void zzcu() {
        mo4037b();
    }

    public final void zzh(View view) {
        this.e.f7151E = view;
        zzb(new dl(this.e.f7171k, null, null, null, null, null, null, null));
    }
}
