package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;
import java.util.concurrent.Future;

@zzzv
public final class apd implements zzm {
    @Nullable
    /* renamed from: a */
    private aoz f23034a;
    /* renamed from: b */
    private boolean f23035b;
    /* renamed from: c */
    private final Context f23036c;
    /* renamed from: d */
    private final Object f23037d = new Object();

    public apd(Context context) {
        this.f23036c = context;
    }

    /* renamed from: a */
    private final Future<ParcelFileDescriptor> m27180a(zzrr zzrr) {
        Future ape = new ape(this);
        zzf apf = new apf(this, ape, zzrr);
        zzg apj = new apj(this, ape);
        synchronized (this.f23037d) {
            this.f23034a = new aoz(this.f23036c, ar.s().m19836a(), apf, apj);
            this.f23034a.i();
        }
        return ape;
    }

    /* renamed from: a */
    private final void m27181a() {
        synchronized (this.f23037d) {
            if (this.f23034a == null) {
                return;
            }
            this.f23034a.disconnect();
            this.f23034a = null;
            Binder.flushPendingCommands();
        }
    }

    public final com.google.android.gms.internal.amz zzc(com.google.android.gms.internal.aom<?> r14) throws com.google.android.gms.internal.zzad {
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
        r13 = this;
        r14 = com.google.android.gms.internal.zzrr.zzg(r14);
        r0 = com.google.android.gms.internal.alo.cu;
        r1 = com.google.android.gms.internal.aja.m19221f();
        r0 = r1.m19334a(r0);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = (long) r0;
        r2 = com.google.android.gms.ads.internal.ar.k();
        r2 = r2.elapsedRealtime();
        r4 = 0;
        r5 = 52;
        r14 = r13.m27180a(r14);	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r14 = r14.get(r0, r6);	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r14 = (android.os.ParcelFileDescriptor) r14;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r0 = new com.google.android.gms.internal.zzabj;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r0.<init>(r14);	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r14 = com.google.android.gms.internal.zzrt.CREATOR;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r14 = r0.zza(r14);	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r14 = (com.google.android.gms.internal.zzrt) r14;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r0 = r14.zzbyq;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        if (r0 == 0) goto L_0x0045;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
    L_0x003d:
        r0 = new com.google.android.gms.internal.zzad;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r14 = r14.zzbyr;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r0.<init>(r14);	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        throw r0;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
    L_0x0045:
        r0 = r14.zzbyo;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r0 = r0.length;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r1 = r14.zzbyp;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r1 = r1.length;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        if (r0 == r1) goto L_0x004f;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
    L_0x004d:
        r0 = r4;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        goto L_0x0076;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
    L_0x004f:
        r9 = new java.util.HashMap;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r9.<init>();	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r0 = 0;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
    L_0x0055:
        r1 = r14.zzbyo;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r1 = r1.length;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        if (r0 >= r1) goto L_0x0068;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
    L_0x005a:
        r1 = r14.zzbyo;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r1 = r1[r0];	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r6 = r14.zzbyp;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r6 = r6[r0];	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r9.put(r1, r6);	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r0 = r0 + 1;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        goto L_0x0055;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
    L_0x0068:
        r0 = new com.google.android.gms.internal.amz;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r7 = r14.statusCode;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r8 = r14.data;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r10 = r14.zzad;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r11 = r14.zzae;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r6 = r0;	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
        r6.<init>(r7, r8, r9, r10, r11);	 Catch:{ InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, InterruptedException -> 0x00bf, all -> 0x009a }
    L_0x0076:
        r14 = com.google.android.gms.ads.internal.ar.k();
        r6 = r14.elapsedRealtime();
        r8 = r6 - r2;
        r14 = new java.lang.StringBuilder;
        r14.<init>(r5);
        r1 = "Http assets remote cache took ";
        r14.append(r1);
        r14.append(r8);
        r1 = "ms";
        r14.append(r1);
        r14 = r14.toString();
        com.google.android.gms.internal.ec.m27332a(r14);
        return r0;
    L_0x009a:
        r14 = move-exception;
        r0 = com.google.android.gms.ads.internal.ar.k();
        r0 = r0.elapsedRealtime();
        r6 = r0 - r2;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r5);
        r1 = "Http assets remote cache took ";
        r0.append(r1);
        r0.append(r6);
        r1 = "ms";
        r0.append(r1);
        r0 = r0.toString();
        com.google.android.gms.internal.ec.m27332a(r0);
        throw r14;
    L_0x00bf:
        r14 = com.google.android.gms.ads.internal.ar.k();
        r0 = r14.elapsedRealtime();
        r6 = r0 - r2;
        r14 = new java.lang.StringBuilder;
        r14.<init>(r5);
        r0 = "Http assets remote cache took ";
        r14.append(r0);
        r14.append(r6);
        r0 = "ms";
        r14.append(r0);
        r14 = r14.toString();
        com.google.android.gms.internal.ec.m27332a(r14);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.apd.zzc(com.google.android.gms.internal.aom):com.google.android.gms.internal.amz");
    }
}
