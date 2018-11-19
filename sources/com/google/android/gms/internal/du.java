package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;

@zzzv
public final class du {
    /* renamed from: a */
    int f16033a = -1;
    /* renamed from: b */
    private long f16034b = -1;
    /* renamed from: c */
    private long f16035c = -1;
    /* renamed from: d */
    private int f16036d = -1;
    /* renamed from: e */
    private long f16037e = 0;
    /* renamed from: f */
    private final Object f16038f = new Object();
    /* renamed from: g */
    private String f16039g;
    /* renamed from: h */
    private int f16040h = 0;
    /* renamed from: i */
    private int f16041i = 0;

    public du(String str) {
        this.f16039g = str;
    }

    /* renamed from: a */
    private static boolean m19642a(android.content.Context r5) {
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
        r0 = r5.getResources();
        r1 = "Theme.Translucent";
        r2 = "style";
        r3 = "android";
        r0 = r0.getIdentifier(r1, r2, r3);
        r1 = 0;
        if (r0 != 0) goto L_0x0017;
    L_0x0011:
        r5 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
        com.google.android.gms.internal.hx.m19915d(r5);
        return r1;
    L_0x0017:
        r2 = new android.content.ComponentName;
        r3 = r5.getPackageName();
        r4 = "com.google.android.gms.ads.AdActivity";
        r2.<init>(r3, r4);
        r5 = r5.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0036 }
        r5 = r5.getActivityInfo(r2, r1);	 Catch:{ NameNotFoundException -> 0x0036 }
        r5 = r5.theme;	 Catch:{ NameNotFoundException -> 0x0036 }
        if (r0 != r5) goto L_0x0030;	 Catch:{ NameNotFoundException -> 0x0036 }
    L_0x002e:
        r5 = 1;	 Catch:{ NameNotFoundException -> 0x0036 }
        return r5;	 Catch:{ NameNotFoundException -> 0x0036 }
    L_0x0030:
        r5 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";	 Catch:{ NameNotFoundException -> 0x0036 }
        com.google.android.gms.internal.hx.m19915d(r5);	 Catch:{ NameNotFoundException -> 0x0036 }
        return r1;
    L_0x0036:
        r5 = "Fail to fetch AdActivity theme";
        com.google.android.gms.internal.hx.m19916e(r5);
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.du.a(android.content.Context):boolean");
    }

    /* renamed from: a */
    public final Bundle m19643a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f16038f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f16039g);
            bundle.putLong("basets", this.f16035c);
            bundle.putLong("currts", this.f16034b);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f16036d);
            bundle.putInt("preqs_in_session", this.f16033a);
            bundle.putLong("time_in_session", this.f16037e);
            bundle.putInt("pclick", this.f16040h);
            bundle.putInt("pimp", this.f16041i);
            bundle.putBoolean("support_transparent_background", m19642a(context));
        }
        return bundle;
    }

    /* renamed from: a */
    public final void m19644a() {
        synchronized (this.f16038f) {
            this.f16040h++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m19645a(com.google.android.gms.internal.zzjj r11, long r12) {
        /*
        r10 = this;
        r0 = r10.f16038f;
        monitor-enter(r0);
        r1 = com.google.android.gms.ads.internal.ar.i();	 Catch:{ all -> 0x0082 }
        r1 = r1.m27313k();	 Catch:{ all -> 0x0082 }
        r3 = com.google.android.gms.ads.internal.ar.k();	 Catch:{ all -> 0x0082 }
        r3 = r3.currentTimeMillis();	 Catch:{ all -> 0x0082 }
        r5 = r10.f16035c;	 Catch:{ all -> 0x0082 }
        r7 = -1;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 != 0) goto L_0x0043;
    L_0x001b:
        r5 = r3 - r1;
        r1 = com.google.android.gms.internal.alo.aw;	 Catch:{ all -> 0x0082 }
        r2 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x0082 }
        r1 = r2.m19334a(r1);	 Catch:{ all -> 0x0082 }
        r1 = (java.lang.Long) r1;	 Catch:{ all -> 0x0082 }
        r1 = r1.longValue();	 Catch:{ all -> 0x0082 }
        r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r7 <= 0) goto L_0x0035;
    L_0x0031:
        r1 = -1;
        r10.f16033a = r1;	 Catch:{ all -> 0x0082 }
        goto L_0x003f;
    L_0x0035:
        r1 = com.google.android.gms.ads.internal.ar.i();	 Catch:{ all -> 0x0082 }
        r1 = r1.m27316n();	 Catch:{ all -> 0x0082 }
        r10.f16033a = r1;	 Catch:{ all -> 0x0082 }
    L_0x003f:
        r10.f16035c = r12;	 Catch:{ all -> 0x0082 }
        r12 = r10.f16035c;	 Catch:{ all -> 0x0082 }
    L_0x0043:
        r10.f16034b = r12;	 Catch:{ all -> 0x0082 }
        r12 = 1;
        if (r11 == 0) goto L_0x0059;
    L_0x0048:
        r13 = r11.extras;	 Catch:{ all -> 0x0082 }
        if (r13 == 0) goto L_0x0059;
    L_0x004c:
        r11 = r11.extras;	 Catch:{ all -> 0x0082 }
        r13 = "gw";
        r1 = 2;
        r11 = r11.getInt(r13, r1);	 Catch:{ all -> 0x0082 }
        if (r11 != r12) goto L_0x0059;
    L_0x0057:
        monitor-exit(r0);	 Catch:{ all -> 0x0082 }
        return;
    L_0x0059:
        r11 = r10.f16036d;	 Catch:{ all -> 0x0082 }
        r11 = r11 + r12;
        r10.f16036d = r11;	 Catch:{ all -> 0x0082 }
        r11 = r10.f16033a;	 Catch:{ all -> 0x0082 }
        r11 = r11 + r12;
        r10.f16033a = r11;	 Catch:{ all -> 0x0082 }
        r11 = r10.f16033a;	 Catch:{ all -> 0x0082 }
        if (r11 != 0) goto L_0x0073;
    L_0x0067:
        r11 = 0;
        r10.f16037e = r11;	 Catch:{ all -> 0x0082 }
        r11 = com.google.android.gms.ads.internal.ar.i();	 Catch:{ all -> 0x0082 }
        r11.m27288a(r3);	 Catch:{ all -> 0x0082 }
        goto L_0x0080;
    L_0x0073:
        r11 = com.google.android.gms.ads.internal.ar.i();	 Catch:{ all -> 0x0082 }
        r11 = r11.m27314l();	 Catch:{ all -> 0x0082 }
        r13 = 0;
        r1 = r3 - r11;
        r10.f16037e = r1;	 Catch:{ all -> 0x0082 }
    L_0x0080:
        monitor-exit(r0);	 Catch:{ all -> 0x0082 }
        return;
    L_0x0082:
        r11 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0082 }
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.du.a(com.google.android.gms.internal.zzjj, long):void");
    }

    /* renamed from: b */
    public final void m19646b() {
        synchronized (this.f16038f) {
            this.f16041i++;
        }
    }
}
