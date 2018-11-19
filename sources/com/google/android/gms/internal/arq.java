package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@zzzv
public final class arq implements zzug {
    /* renamed from: a */
    private final zzaat f23080a;
    /* renamed from: b */
    private final zzux f23081b;
    /* renamed from: c */
    private final Context f23082c;
    /* renamed from: d */
    private final arj f23083d;
    /* renamed from: e */
    private final boolean f23084e;
    /* renamed from: f */
    private final long f23085f;
    /* renamed from: g */
    private final long f23086g;
    /* renamed from: h */
    private final int f23087h;
    /* renamed from: i */
    private final Object f23088i = new Object();
    /* renamed from: j */
    private boolean f23089j = false;
    /* renamed from: k */
    private final Map<zzakv<aro>, arl> f23090k = new HashMap();
    /* renamed from: l */
    private final boolean f23091l;
    /* renamed from: m */
    private final String f23092m;
    /* renamed from: n */
    private List<aro> f23093n = new ArrayList();
    /* renamed from: o */
    private final boolean f23094o;

    public arq(Context context, zzaat zzaat, zzux zzux, arj arj, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.f23082c = context;
        this.f23080a = zzaat;
        this.f23081b = zzux;
        this.f23083d = arj;
        this.f23084e = z;
        this.f23091l = z2;
        this.f23092m = str;
        this.f23085f = j;
        this.f23086g = j2;
        this.f23087h = 2;
        this.f23094o = z3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final com.google.android.gms.internal.aro m27225a(java.util.List<com.google.android.gms.internal.zzakv<com.google.android.gms.internal.aro>> r4) {
        /*
        r3 = this;
        r0 = r3.f23088i;
        monitor-enter(r0);
        r1 = r3.f23089j;	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x000f;
    L_0x0007:
        r4 = new com.google.android.gms.internal.aro;	 Catch:{ all -> 0x0047 }
        r1 = -1;
        r4.<init>(r1);	 Catch:{ all -> 0x0047 }
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        return r4;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        r4 = r4.iterator();
    L_0x0014:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x003c;
    L_0x001a:
        r0 = r4.next();
        r0 = (com.google.android.gms.internal.zzakv) r0;
        r1 = r0.get();	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r1 = (com.google.android.gms.internal.aro) r1;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r2 = r3.f23093n;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r2.add(r1);	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        if (r1 == 0) goto L_0x0014;
    L_0x002d:
        r2 = r1.f15662a;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        if (r2 != 0) goto L_0x0014;
    L_0x0031:
        r3.m27227a(r0);	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        return r1;
    L_0x0035:
        r0 = move-exception;
        r1 = "Exception while processing an adapter; continuing with other adapters";
        com.google.android.gms.internal.hx.m19914c(r1, r0);
        goto L_0x0014;
    L_0x003c:
        r4 = 0;
        r3.m27227a(r4);
        r4 = new com.google.android.gms.internal.aro;
        r0 = 1;
        r4.<init>(r0);
        return r4;
    L_0x0047:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.arq.a(java.util.List):com.google.android.gms.internal.aro");
    }

    /* renamed from: a */
    private final void m27227a(zzakv<aro> zzakv) {
        fk.f16060a.post(new ars(this, zzakv));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final com.google.android.gms.internal.aro m27228b(java.util.List<com.google.android.gms.internal.zzakv<com.google.android.gms.internal.aro>> r15) {
        /*
        r14 = this;
        r0 = r14.f23088i;
        monitor-enter(r0);
        r1 = r14.f23089j;	 Catch:{ all -> 0x00ab }
        r2 = -1;
        if (r1 == 0) goto L_0x000f;
    L_0x0008:
        r15 = new com.google.android.gms.internal.aro;	 Catch:{ all -> 0x00ab }
        r15.<init>(r2);	 Catch:{ all -> 0x00ab }
        monitor-exit(r0);	 Catch:{ all -> 0x00ab }
        return r15;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x00ab }
        r0 = r14.f23083d;
        r0 = r0.f15653m;
        r3 = -1;
        r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x001f;
    L_0x001a:
        r0 = r14.f23083d;
        r0 = r0.f15653m;
        goto L_0x0021;
    L_0x001f:
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
    L_0x0021:
        r15 = r15.iterator();
        r3 = 0;
        r1 = r0;
        r0 = r3;
        r4 = -1;
    L_0x0029:
        r5 = r15.hasNext();
        if (r5 == 0) goto L_0x009e;
    L_0x002f:
        r5 = r15.next();
        r5 = (com.google.android.gms.internal.zzakv) r5;
        r6 = com.google.android.gms.ads.internal.ar.k();
        r6 = r6.currentTimeMillis();
        r8 = 0;
        r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r10 != 0) goto L_0x0054;
    L_0x0043:
        r10 = r5.isDone();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r10 == 0) goto L_0x0054;
    L_0x0049:
        r10 = r5.get();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
    L_0x004d:
        r10 = (com.google.android.gms.internal.aro) r10;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        goto L_0x005b;
    L_0x0050:
        r15 = move-exception;
        goto L_0x008e;
    L_0x0052:
        r5 = move-exception;
        goto L_0x0078;
    L_0x0054:
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        r10 = r5.get(r1, r10);	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        goto L_0x004d;
    L_0x005b:
        r11 = r14.f23093n;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        r11.add(r10);	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r10 == 0) goto L_0x007d;
    L_0x0062:
        r11 = r10.f15662a;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r11 != 0) goto L_0x007d;
    L_0x0066:
        r11 = r10.f15667f;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r11 == 0) goto L_0x007d;
    L_0x006a:
        r12 = r11.zzmc();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r12 <= r4) goto L_0x007d;
    L_0x0070:
        r11 = r11.zzmc();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        r3 = r5;
        r0 = r10;
        r4 = r11;
        goto L_0x007d;
    L_0x0078:
        r10 = "Exception while processing an adapter; continuing with other adapters";
        com.google.android.gms.internal.hx.m19914c(r10, r5);	 Catch:{ all -> 0x0050 }
    L_0x007d:
        r5 = com.google.android.gms.ads.internal.ar.k();
        r10 = r5.currentTimeMillis();
        r12 = r10 - r6;
        r5 = r1 - r12;
        r1 = java.lang.Math.max(r5, r8);
        goto L_0x0029;
    L_0x008e:
        r0 = com.google.android.gms.ads.internal.ar.k();
        r3 = r0.currentTimeMillis();
        r10 = r3 - r6;
        r3 = r1 - r10;
        java.lang.Math.max(r3, r8);
        throw r15;
    L_0x009e:
        r14.m27227a(r3);
        if (r0 != 0) goto L_0x00aa;
    L_0x00a3:
        r15 = new com.google.android.gms.internal.aro;
        r0 = 1;
        r15.<init>(r0);
        return r15;
    L_0x00aa:
        return r0;
    L_0x00ab:
        r15 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ab }
        throw r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.arq.b(java.util.List):com.google.android.gms.internal.aro");
    }

    public final void cancel() {
        synchronized (this.f23088i) {
            this.f23089j = true;
            for (arl a : this.f23090k.values()) {
                a.m27224a();
            }
        }
    }

    public final aro zzh(List<ari> list) {
        hx.m19911b("Starting mediation.");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = new ArrayList();
        zzjn zzjn = this.f23080a.zzauc;
        int[] iArr = new int[2];
        if (zzjn.zzbem != null) {
            ar.v();
            if (arp.m19464a(r0.f23092m, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzjn[] zzjnArr = zzjn.zzbem;
                int length = zzjnArr.length;
                while (i < length) {
                    zzjn zzjn2 = zzjnArr[i];
                    if (i2 == zzjn2.width && i3 == zzjn2.height) {
                        zzjn = zzjn2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ari ari = (ari) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(ari.f15623b);
            hx.m19915d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = ari.f15624c.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                Context context = r0.f23082c;
                zzux zzux = r0.f23081b;
                arj arj = r0.f23083d;
                zzjj zzjj = r0.f23080a.zzcnd;
                zzakd zzakd = r0.f23080a.zzaty;
                boolean z = r0.f23084e;
                boolean z2 = r0.f23091l;
                Iterator it3 = it;
                zzpe zzpe = r0.f23080a.zzauo;
                Iterator it4 = it2;
                ArrayList arrayList2 = arrayList;
                zzakd zzakd2 = zzakd;
                ari ari2 = ari;
                zzjj zzjj2 = zzjj;
                zzjn zzjn3 = zzjn;
                arl arl = new arl(context, str2, zzux, arj, ari2, zzjj2, zzjn3, zzakd2, z, z2, zzpe, r0.f23080a.zzauw, r0.f23080a.zzcns, r0.f23080a.zzcon, r0.f23094o);
                zzakv a = fe.m19677a(newCachedThreadPool, new arr(r0, arl));
                r0.f23090k.put(a, arl);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a);
                arrayList = arrayList3;
                it = it3;
                it2 = it4;
            }
        }
        List list2 = arrayList;
        return r0.f23087h != 2 ? m27225a(list2) : m27228b(list2);
    }

    public final List<aro> zzlu() {
        return this.f23093n;
    }
}
