package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Result;

/* renamed from: com.google.android.gms.common.api.internal.k */
public final class C3800k implements zzbh {
    /* renamed from: a */
    private final ah f12002a;
    /* renamed from: b */
    private boolean f12003b = false;

    public C3800k(ah ahVar) {
        this.f12002a = ahVar;
    }

    /* renamed from: a */
    final void m14380a() {
        if (this.f12003b) {
            this.f12003b = false;
            this.f12002a.f13947d.f11882e.m8985a();
            disconnect();
        }
    }

    public final void begin() {
    }

    public final void connect() {
        if (this.f12003b) {
            this.f12003b = false;
            this.f12002a.m17177a(new C3802m(this, this));
        }
    }

    public final boolean disconnect() {
        if (this.f12003b) {
            return false;
        }
        if (this.f12002a.f13947d.m14265n()) {
            this.f12003b = true;
            for (bv a : this.f12002a.f13947d.f11881d) {
                a.m14323a();
            }
            return false;
        }
        this.f12002a.m17176a(null);
        return true;
    }

    public final void onConnected(Bundle bundle) {
    }

    public final void onConnectionSuspended(int i) {
        this.f12002a.m17176a(null);
        this.f12002a.f13948e.zzf(i, this.f12003b);
    }

    public final void zza(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final <A extends zzb, R extends Result, T extends ck<R, A>> T zzd(T t) {
        return zze(t);
    }

    public final <A extends com.google.android.gms.common.api.Api.zzb, T extends com.google.android.gms.common.api.internal.ck<? extends com.google.android.gms.common.api.Result, A>> T zze(T r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.f12002a;	 Catch:{ DeadObjectException -> 0x0049 }
        r0 = r0.f13947d;	 Catch:{ DeadObjectException -> 0x0049 }
        r0 = r0.f11882e;	 Catch:{ DeadObjectException -> 0x0049 }
        r0.m8986a(r4);	 Catch:{ DeadObjectException -> 0x0049 }
        r0 = r3.f12002a;	 Catch:{ DeadObjectException -> 0x0049 }
        r0 = r0.f13947d;	 Catch:{ DeadObjectException -> 0x0049 }
        r1 = r4.mo3575g();	 Catch:{ DeadObjectException -> 0x0049 }
        r0 = r0.f11879b;	 Catch:{ DeadObjectException -> 0x0049 }
        r0 = r0.get(r1);	 Catch:{ DeadObjectException -> 0x0049 }
        r0 = (com.google.android.gms.common.api.Api.zze) r0;	 Catch:{ DeadObjectException -> 0x0049 }
        r1 = "Appropriate Api was not requested.";	 Catch:{ DeadObjectException -> 0x0049 }
        com.google.android.gms.common.internal.ad.m9046a(r0, r1);	 Catch:{ DeadObjectException -> 0x0049 }
        r1 = r0.isConnected();	 Catch:{ DeadObjectException -> 0x0049 }
        if (r1 != 0) goto L_0x003d;	 Catch:{ DeadObjectException -> 0x0049 }
    L_0x0024:
        r1 = r3.f12002a;	 Catch:{ DeadObjectException -> 0x0049 }
        r1 = r1.f13945b;	 Catch:{ DeadObjectException -> 0x0049 }
        r2 = r4.mo3575g();	 Catch:{ DeadObjectException -> 0x0049 }
        r1 = r1.containsKey(r2);	 Catch:{ DeadObjectException -> 0x0049 }
        if (r1 == 0) goto L_0x003d;	 Catch:{ DeadObjectException -> 0x0049 }
    L_0x0032:
        r0 = new com.google.android.gms.common.api.Status;	 Catch:{ DeadObjectException -> 0x0049 }
        r1 = 17;	 Catch:{ DeadObjectException -> 0x0049 }
        r0.<init>(r1);	 Catch:{ DeadObjectException -> 0x0049 }
        r4.zzu(r0);	 Catch:{ DeadObjectException -> 0x0049 }
        return r4;	 Catch:{ DeadObjectException -> 0x0049 }
    L_0x003d:
        r1 = r0 instanceof com.google.android.gms.common.internal.aj;	 Catch:{ DeadObjectException -> 0x0049 }
        if (r1 == 0) goto L_0x0045;	 Catch:{ DeadObjectException -> 0x0049 }
    L_0x0041:
        r0 = com.google.android.gms.common.internal.aj.m18160c();	 Catch:{ DeadObjectException -> 0x0049 }
    L_0x0045:
        r4.m17239b(r0);	 Catch:{ DeadObjectException -> 0x0049 }
        return r4;
    L_0x0049:
        r0 = r3.f12002a;
        r1 = new com.google.android.gms.common.api.internal.l;
        r1.<init>(r3, r3);
        r0.m17177a(r1);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.k.zze(com.google.android.gms.common.api.internal.ck):T");
    }
}
