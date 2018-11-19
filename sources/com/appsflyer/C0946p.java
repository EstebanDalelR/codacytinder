package com.appsflyer;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.p */
final class C0946p {
    /* renamed from: g */
    private static final BitSet f2499g = new BitSet(6);
    /* renamed from: h */
    private static final Handler f2500h = new Handler(Looper.getMainLooper());
    /* renamed from: i */
    private static volatile C0946p f2501i;
    /* renamed from: a */
    final Handler f2502a;
    /* renamed from: b */
    final Object f2503b = new Object();
    /* renamed from: c */
    boolean f2504c;
    /* renamed from: d */
    final Runnable f2505d = new C09431(this);
    /* renamed from: e */
    final Runnable f2506e = new C09442(this);
    /* renamed from: f */
    final Runnable f2507f = new C09453(this);
    /* renamed from: j */
    private final Map<C0942o, C0942o> f2508j = new HashMap(f2499g.size());
    /* renamed from: k */
    private final Map<C0942o, Map<String, Object>> f2509k = new HashMap(f2499g.size());
    /* renamed from: l */
    private final SensorManager f2510l;
    /* renamed from: m */
    private boolean f2511m;

    /* renamed from: com.appsflyer.p$1 */
    class C09431 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0946p f2496a;

        C09431(C0946p c0946p) {
            this.f2496a = c0946p;
        }

        public final void run() {
            synchronized (this.f2496a.f2503b) {
                this.f2496a.m3233d();
                this.f2496a.f2502a.postDelayed(this.f2496a.f2506e, 1800000);
            }
        }
    }

    /* renamed from: com.appsflyer.p$2 */
    class C09442 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0946p f2497a;

        C09442(C0946p c0946p) {
            this.f2497a = c0946p;
        }

        public final void run() {
            synchronized (this.f2497a.f2503b) {
                this.f2497a.m3232c();
                this.f2497a.f2502a.postDelayed(this.f2497a.f2505d, 500);
                this.f2497a.f2504c = true;
            }
        }
    }

    /* renamed from: com.appsflyer.p$3 */
    class C09453 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0946p f2498a;

        C09453(C0946p c0946p) {
            this.f2498a = c0946p;
        }

        public final void run() {
            synchronized (this.f2498a.f2503b) {
                if (this.f2498a.f2504c) {
                    this.f2498a.f2502a.removeCallbacks(this.f2498a.f2506e);
                    this.f2498a.f2502a.removeCallbacks(this.f2498a.f2505d);
                    this.f2498a.m3233d();
                    this.f2498a.f2504c = false;
                }
            }
        }
    }

    static {
        f2499g.set(1);
        f2499g.set(2);
        f2499g.set(4);
    }

    private C0946p(@NonNull SensorManager sensorManager, Handler handler) {
        this.f2510l = sensorManager;
        this.f2502a = handler;
    }

    /* renamed from: a */
    static C0946p m3226a(Context context) {
        return C0946p.m3227a((SensorManager) context.getApplicationContext().getSystemService("sensor"), f2500h);
    }

    /* renamed from: a */
    static C0946p m3227a(SensorManager sensorManager, Handler handler) {
        if (f2501i == null) {
            synchronized (C0946p.class) {
                if (f2501i == null) {
                    f2501i = C0946p.m3229b(sensorManager, handler);
                }
            }
        }
        return f2501i;
    }

    /* renamed from: b */
    static C0946p m3229b(SensorManager sensorManager, Handler handler) {
        return new C0946p(sensorManager, handler);
    }

    /* renamed from: a */
    private static boolean m3228a(int i) {
        return i >= 0 && f2499g.get(i) != 0;
    }

    /* renamed from: a */
    final void m3230a() {
        this.f2502a.post(this.f2507f);
        this.f2502a.post(this.f2506e);
    }

    /* renamed from: b */
    final void m3231b() {
        this.f2502a.post(this.f2507f);
    }

    /* renamed from: c */
    final void m3232c() {
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
        r5 = this;
        r0 = r5.f2510l;	 Catch:{ Throwable -> 0x0041 }
        r1 = -1;	 Catch:{ Throwable -> 0x0041 }
        r0 = r0.getSensorList(r1);	 Catch:{ Throwable -> 0x0041 }
        r0 = r0.iterator();	 Catch:{ Throwable -> 0x0041 }
    L_0x000b:
        r1 = r0.hasNext();	 Catch:{ Throwable -> 0x0041 }
        if (r1 == 0) goto L_0x0041;	 Catch:{ Throwable -> 0x0041 }
    L_0x0011:
        r1 = r0.next();	 Catch:{ Throwable -> 0x0041 }
        r1 = (android.hardware.Sensor) r1;	 Catch:{ Throwable -> 0x0041 }
        r2 = r1.getType();	 Catch:{ Throwable -> 0x0041 }
        r2 = com.appsflyer.C0946p.m3228a(r2);	 Catch:{ Throwable -> 0x0041 }
        if (r2 == 0) goto L_0x000b;	 Catch:{ Throwable -> 0x0041 }
    L_0x0021:
        r2 = com.appsflyer.C0942o.m3212a(r1);	 Catch:{ Throwable -> 0x0041 }
        r3 = r5.f2508j;	 Catch:{ Throwable -> 0x0041 }
        r3 = r3.containsKey(r2);	 Catch:{ Throwable -> 0x0041 }
        if (r3 != 0) goto L_0x0032;	 Catch:{ Throwable -> 0x0041 }
    L_0x002d:
        r3 = r5.f2508j;	 Catch:{ Throwable -> 0x0041 }
        r3.put(r2, r2);	 Catch:{ Throwable -> 0x0041 }
    L_0x0032:
        r3 = r5.f2508j;	 Catch:{ Throwable -> 0x0041 }
        r2 = r3.get(r2);	 Catch:{ Throwable -> 0x0041 }
        r2 = (android.hardware.SensorEventListener) r2;	 Catch:{ Throwable -> 0x0041 }
        r3 = r5.f2510l;	 Catch:{ Throwable -> 0x0041 }
        r4 = 0;	 Catch:{ Throwable -> 0x0041 }
        r3.registerListener(r2, r1, r4);	 Catch:{ Throwable -> 0x0041 }
        goto L_0x000b;
    L_0x0041:
        r0 = 1;
        r5.f2511m = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.p.c():void");
    }

    /* renamed from: d */
    final void m3233d() {
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
        r0 = r3.f2508j;	 Catch:{ Throwable -> 0x0029 }
        r0 = r0.isEmpty();	 Catch:{ Throwable -> 0x0029 }
        if (r0 != 0) goto L_0x0029;	 Catch:{ Throwable -> 0x0029 }
    L_0x0008:
        r0 = r3.f2508j;	 Catch:{ Throwable -> 0x0029 }
        r0 = r0.values();	 Catch:{ Throwable -> 0x0029 }
        r0 = r0.iterator();	 Catch:{ Throwable -> 0x0029 }
    L_0x0012:
        r1 = r0.hasNext();	 Catch:{ Throwable -> 0x0029 }
        if (r1 == 0) goto L_0x0029;	 Catch:{ Throwable -> 0x0029 }
    L_0x0018:
        r1 = r0.next();	 Catch:{ Throwable -> 0x0029 }
        r1 = (com.appsflyer.C0942o) r1;	 Catch:{ Throwable -> 0x0029 }
        r2 = r3.f2510l;	 Catch:{ Throwable -> 0x0029 }
        r2.unregisterListener(r1);	 Catch:{ Throwable -> 0x0029 }
        r2 = r3.f2509k;	 Catch:{ Throwable -> 0x0029 }
        r1.m3222a(r2);	 Catch:{ Throwable -> 0x0029 }
        goto L_0x0012;
    L_0x0029:
        r0 = 0;
        r3.f2511m = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.p.d():void");
    }

    @NonNull
    /* renamed from: e */
    final List<Map<String, Object>> m3234e() {
        synchronized (this.f2503b) {
            if (!this.f2508j.isEmpty() && this.f2511m) {
                for (C0942o b : this.f2508j.values()) {
                    b.m3224b(this.f2509k);
                }
            }
            if (this.f2509k.isEmpty()) {
                List<Map<String, Object>> emptyList = Collections.emptyList();
                return emptyList;
            }
            List arrayList = new ArrayList(this.f2509k.values());
            return arrayList;
        }
    }
}
