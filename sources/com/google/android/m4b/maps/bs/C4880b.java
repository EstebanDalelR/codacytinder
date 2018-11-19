package com.google.android.m4b.maps.bs;

import android.util.Log;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.az.C4733b;
import com.google.android.m4b.maps.ch.C5203e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* renamed from: com.google.android.m4b.maps.bs.b */
public final class C4880b {
    /* renamed from: a */
    private static final Locale f17905a = Locale.ENGLISH;
    /* renamed from: b */
    private final int f17906b = 512;
    /* renamed from: c */
    private final C4891e f17907c;
    /* renamed from: d */
    private final C4712d f17908d;
    /* renamed from: e */
    private boolean f17909e;

    private C4880b(int r10, java.io.File r11, com.google.android.m4b.maps.ay.C4712d r12, com.google.android.m4b.maps.ch.C5203e r13) {
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
        r9 = this;
        r9.<init>();
        r10 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r9.f17906b = r10;
        r9.f17908d = r12;
        r0 = com.google.android.m4b.maps.ay.C4712d.m20957c();
        r6 = new com.google.android.m4b.maps.bg.a$a;
        r6.<init>(r11);
        r10 = 0;
        r11 = "r";	 Catch:{ IOException -> 0x001a }
        r11 = com.google.android.m4b.maps.bs.C4891e.m21894a(r11, r6, r10, r13);	 Catch:{ IOException -> 0x001a }
        goto L_0x003a;
    L_0x001a:
        r2 = "r";	 Catch:{ IOException -> 0x0028 }
        r3 = r9.f17906b;	 Catch:{ IOException -> 0x0028 }
        r4 = 0;	 Catch:{ IOException -> 0x0028 }
        r5 = f17905a;	 Catch:{ IOException -> 0x0028 }
        r7 = 0;	 Catch:{ IOException -> 0x0028 }
        r8 = r13;	 Catch:{ IOException -> 0x0028 }
        r11 = com.google.android.m4b.maps.bs.C4891e.m21893a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x0028 }
        goto L_0x003a;
    L_0x0028:
        r11 = move-exception;
        r12 = "DiskResourceCache";
        r13 = 6;
        r12 = com.google.android.m4b.maps.ay.C4728u.m21050a(r12, r13);
        if (r12 == 0) goto L_0x0039;
    L_0x0032:
        r12 = "DiskResourceCache";
        r13 = "Error creating the cache";
        android.util.Log.e(r12, r13, r11);
    L_0x0039:
        r11 = r10;
    L_0x003a:
        if (r11 == 0) goto L_0x0077;
    L_0x003c:
        r12 = com.google.android.m4b.maps.ay.C4712d.m20957c();
        r2 = r12 - r0;
        r10 = "DiskResourceCache";
        r12 = 3;
        r10 = com.google.android.m4b.maps.ay.C4728u.m21050a(r10, r12);
        if (r10 == 0) goto L_0x0074;
    L_0x004b:
        r10 = "DiskResourceCache";
        r12 = r11.m21937d();
        r13 = new java.lang.StringBuilder;
        r0 = 50;
        r13.<init>(r0);
        r0 = "Loaded ";
        r13.append(r0);
        r13.append(r12);
        r12 = " entries, ";
        r13.append(r12);
        r13.append(r2);
        r12 = "ms";
        r13.append(r12);
        r12 = r13.toString();
        android.util.Log.d(r10, r12);
    L_0x0074:
        r10 = 1;
        r9.f17909e = r10;
    L_0x0077:
        r9.f17907c = r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.b.<init>(int, java.io.File, com.google.android.m4b.maps.ay.d, com.google.android.m4b.maps.ch.e):void");
    }

    /* renamed from: a */
    public static C4880b m21842a(File file, C5203e c5203e) {
        return new C4880b(512, file, C4712d.m20955a(), c5203e);
    }

    /* renamed from: a */
    public final synchronized com.google.android.m4b.maps.bu.C4910a m21843a(java.lang.String r10) {
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
        r9 = this;
        monitor-enter(r9);
        r0 = r9.f17909e;	 Catch:{ all -> 0x0056 }
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r9);
        return r1;
    L_0x0008:
        r0 = r9.f17907c;	 Catch:{ all -> 0x0056 }
        r2 = com.google.android.m4b.maps.az.C4733b.m21060a(r10);	 Catch:{ all -> 0x0056 }
        r0 = r0.m21933a(r2, r1);	 Catch:{ all -> 0x0056 }
        if (r0 == 0) goto L_0x0054;	 Catch:{ all -> 0x0056 }
    L_0x0014:
        r2 = r0.length;	 Catch:{ all -> 0x0056 }
        r3 = 9;	 Catch:{ all -> 0x0056 }
        if (r2 <= r3) goto L_0x0054;	 Catch:{ all -> 0x0056 }
    L_0x0019:
        r2 = 0;	 Catch:{ all -> 0x0056 }
        r2 = r0[r2];	 Catch:{ all -> 0x0056 }
        r4 = 1;	 Catch:{ all -> 0x0056 }
        if (r2 == r4) goto L_0x0020;	 Catch:{ all -> 0x0056 }
    L_0x001f:
        goto L_0x0054;	 Catch:{ all -> 0x0056 }
    L_0x0020:
        r5 = com.google.android.m4b.maps.bs.C4891e.m21914c(r0, r4);	 Catch:{ all -> 0x0056 }
        r2 = new com.google.android.m4b.maps.ar.a;	 Catch:{ all -> 0x0056 }
        r7 = com.google.android.m4b.maps.de.C5350x.f20104b;	 Catch:{ all -> 0x0056 }
        r2.<init>(r7);	 Catch:{ all -> 0x0056 }
        r7 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x0052 }
        r8 = r0.length;	 Catch:{ IOException -> 0x0052 }
        r8 = r8 - r3;	 Catch:{ IOException -> 0x0052 }
        r7.<init>(r0, r3, r8);	 Catch:{ IOException -> 0x0052 }
        r2.m20818a(r7);	 Catch:{ IOException -> 0x0052 }
        r0 = 2;
        r0 = r2.m20843h(r0);	 Catch:{ all -> 0x0056 }
        r10 = r10.equals(r0);	 Catch:{ all -> 0x0056 }
        if (r10 != 0) goto L_0x0042;
    L_0x0040:
        monitor-exit(r9);
        return r1;
    L_0x0042:
        r10 = new com.google.android.m4b.maps.bu.a;	 Catch:{ all -> 0x0056 }
        r10.<init>();	 Catch:{ all -> 0x0056 }
        r10.m22018a(r4);	 Catch:{ all -> 0x0056 }
        r10.m22020a(r2);	 Catch:{ all -> 0x0056 }
        r10.m22016a(r5);	 Catch:{ all -> 0x0056 }
        monitor-exit(r9);
        return r10;
    L_0x0052:
        monitor-exit(r9);
        return r1;
    L_0x0054:
        monitor-exit(r9);
        return r1;
    L_0x0056:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.b.a(java.lang.String):com.google.android.m4b.maps.bu.a");
    }

    /* renamed from: a */
    public final synchronized void m21845a(C4662a c4662a) {
        if (this.f17909e) {
            String h = c4662a.m20843h(2);
            try {
                long b = C4712d.m20956b();
                c4662a = c4662a.m20837d();
                byte[] bArr = new byte[(c4662a.length + 9)];
                bArr[0] = (byte) 1;
                C4891e.m21904a(bArr, 1, b);
                System.arraycopy(c4662a, 0, bArr, 9, c4662a.length);
                Collection arrayList = new ArrayList(1);
                arrayList.add(C4891e.m21889a(C4733b.m21060a(h), bArr));
                this.f17907c.m21930a(arrayList);
            } catch (C4662a c4662a2) {
                if (C4728u.m21050a("DiskResourceCache", 6)) {
                    c4662a2 = String.valueOf(c4662a2);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(h).length() + 20) + String.valueOf(c4662a2).length());
                    stringBuilder.append("Error inserting: ");
                    stringBuilder.append(h);
                    stringBuilder.append(" : ");
                    stringBuilder.append(c4662a2);
                    Log.e("DiskResourceCache", stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m21844a() {
        if (this.f17909e) {
            try {
                this.f17907c.m21932a(0, f17905a);
            } catch (IOException e) {
                if (C4728u.m21050a("DiskResourceCache", 6)) {
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
                    stringBuilder.append("Clearing cache: ");
                    stringBuilder.append(valueOf);
                    Log.e("DiskResourceCache", stringBuilder.toString());
                }
            }
        }
    }
}
