package com.facebook.ads.internal.p040g;

import android.content.Context;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.C1384c;
import com.facebook.ads.internal.p039f.C1403a;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1504q;
import com.facebook.ads.internal.p047k.C1504q.C1503a;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.p047k.p048a.C1475a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.g.i */
public class C1416i {
    /* renamed from: a */
    private static final AtomicInteger f3909a = new AtomicInteger(0);
    /* renamed from: b */
    private static String f3910b;
    /* renamed from: c */
    private static final C1503a f3911c = C1504q.m5290a();
    /* renamed from: d */
    private final Context f3912d;

    public C1416i(Context context, boolean z) {
        this.f3912d = context;
        C1416i.m4925a(context, z);
    }

    /* renamed from: a */
    private static void m4925a(final android.content.Context r4, boolean r5) {
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
        r0 = f3909a;
        r1 = 0;
        r2 = 1;
        r0 = r0.compareAndSet(r1, r2);
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        com.facebook.ads.internal.p040g.C1414h.m4920a();	 Catch:{ Exception -> 0x0037 }
        com.facebook.ads.internal.p039f.C1403a.m4872a(r4);	 Catch:{ Exception -> 0x0037 }
        r0 = "FBAdPrefs";	 Catch:{ Exception -> 0x0037 }
        r0 = r4.getSharedPreferences(r0, r1);	 Catch:{ Exception -> 0x0037 }
        r2 = "AFP";	 Catch:{ Exception -> 0x0037 }
        r3 = 0;	 Catch:{ Exception -> 0x0037 }
        r2 = r0.getString(r2, r3);	 Catch:{ Exception -> 0x0037 }
        f3910b = r2;	 Catch:{ Exception -> 0x0037 }
        r2 = new java.util.concurrent.FutureTask;	 Catch:{ Exception -> 0x0037 }
        r3 = new com.facebook.ads.internal.g.i$1;	 Catch:{ Exception -> 0x0037 }
        r3.<init>(r4, r0);	 Catch:{ Exception -> 0x0037 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x0037 }
        r4 = java.util.concurrent.Executors.newSingleThreadExecutor();	 Catch:{ Exception -> 0x0037 }
        r4.submit(r2);	 Catch:{ Exception -> 0x0037 }
        if (r5 == 0) goto L_0x003c;	 Catch:{ Exception -> 0x0037 }
    L_0x0033:
        r2.get();	 Catch:{ Exception -> 0x0037 }
        return;
    L_0x0037:
        r4 = f3909a;
        r4.set(r1);
    L_0x003c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.g.i.a(android.content.Context, boolean):void");
    }

    /* renamed from: a */
    public java.lang.String m4928a() {
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
        r7 = this;
        r0 = r7.f3912d;
        r1 = 1;
        com.facebook.ads.internal.p040g.C1416i.m4925a(r0, r1);
        r0 = 0;
        r1 = new java.io.ByteArrayOutputStream;	 Catch:{ IOException -> 0x005e, all -> 0x0058 }
        r1.<init>();	 Catch:{ IOException -> 0x005e, all -> 0x0058 }
        r2 = new android.util.Base64OutputStream;	 Catch:{ IOException -> 0x0053, all -> 0x004e }
        r3 = 0;	 Catch:{ IOException -> 0x0053, all -> 0x004e }
        r2.<init>(r1, r3);	 Catch:{ IOException -> 0x0053, all -> 0x004e }
        r3 = new java.util.zip.DeflaterOutputStream;	 Catch:{ IOException -> 0x0049, all -> 0x0044 }
        r3.<init>(r2);	 Catch:{ IOException -> 0x0049, all -> 0x0044 }
        r0 = new org.json.JSONObject;	 Catch:{ IOException -> 0x0042 }
        r4 = r7.m4929b();	 Catch:{ IOException -> 0x0042 }
        r0.<init>(r4);	 Catch:{ IOException -> 0x0042 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0042 }
        r0 = r0.getBytes();	 Catch:{ IOException -> 0x0042 }
        r3.write(r0);	 Catch:{ IOException -> 0x0042 }
        r3.close();	 Catch:{ IOException -> 0x0042 }
        r0 = r1.toString();	 Catch:{ IOException -> 0x0042 }
        if (r3 == 0) goto L_0x0037;
    L_0x0034:
        r3.close();	 Catch:{ IOException -> 0x0041 }
    L_0x0037:
        if (r2 == 0) goto L_0x003c;	 Catch:{ IOException -> 0x0041 }
    L_0x0039:
        r2.close();	 Catch:{ IOException -> 0x0041 }
    L_0x003c:
        if (r1 == 0) goto L_0x0041;	 Catch:{ IOException -> 0x0041 }
    L_0x003e:
        r1.close();	 Catch:{ IOException -> 0x0041 }
    L_0x0041:
        return r0;
    L_0x0042:
        r0 = move-exception;
        goto L_0x0063;
    L_0x0044:
        r3 = move-exception;
        r6 = r3;
        r3 = r0;
        r0 = r6;
        goto L_0x006c;
    L_0x0049:
        r3 = move-exception;
        r6 = r3;
        r3 = r0;
        r0 = r6;
        goto L_0x0063;
    L_0x004e:
        r2 = move-exception;
        r3 = r0;
        r0 = r2;
        r2 = r3;
        goto L_0x006c;
    L_0x0053:
        r2 = move-exception;
        r3 = r0;
        r0 = r2;
        r2 = r3;
        goto L_0x0063;
    L_0x0058:
        r1 = move-exception;
        r2 = r0;
        r3 = r2;
        r0 = r1;
        r1 = r3;
        goto L_0x006c;
    L_0x005e:
        r1 = move-exception;
        r2 = r0;
        r3 = r2;
        r0 = r1;
        r1 = r3;
    L_0x0063:
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x006b }
        r5 = "Failed to build user token";	 Catch:{ all -> 0x006b }
        r4.<init>(r5, r0);	 Catch:{ all -> 0x006b }
        throw r4;	 Catch:{ all -> 0x006b }
    L_0x006b:
        r0 = move-exception;
    L_0x006c:
        if (r3 == 0) goto L_0x0071;
    L_0x006e:
        r3.close();	 Catch:{ IOException -> 0x007b }
    L_0x0071:
        if (r2 == 0) goto L_0x0076;	 Catch:{ IOException -> 0x007b }
    L_0x0073:
        r2.close();	 Catch:{ IOException -> 0x007b }
    L_0x0076:
        if (r1 == 0) goto L_0x007b;	 Catch:{ IOException -> 0x007b }
    L_0x0078:
        r1.close();	 Catch:{ IOException -> 0x007b }
    L_0x007b:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.g.i.a():java.lang.String");
    }

    /* renamed from: b */
    public Map<String, String> m4929b() {
        C1416i.m4925a(this.f3912d, false);
        Map<String, String> hashMap = new HashMap();
        hashMap.put("SDK", "android");
        hashMap.put("SDK_VERSION", "4.27.0");
        hashMap.put("LOCALE", Locale.getDefault().toString());
        float f = an.f4090b;
        int i = this.f3912d.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.f3912d.getResources().getDisplayMetrics().heightPixels;
        hashMap.put("DENSITY", String.valueOf(f));
        hashMap.put("SCREEN_WIDTH", String.valueOf((int) (((float) i) / f)));
        hashMap.put("SCREEN_HEIGHT", String.valueOf((int) (((float) i2) / f)));
        hashMap.put("ATTRIBUTION_ID", C1411f.f3886a);
        hashMap.put("ID_SOURCE", C1411f.f3889d);
        hashMap.put("OS", "Android");
        hashMap.put("OSVERS", C1403a.f3822a);
        hashMap.put("BUNDLE", C1403a.f3825d);
        hashMap.put("APPNAME", C1403a.f3826e);
        hashMap.put("APPVERS", C1403a.f3827f);
        hashMap.put("APPBUILD", String.valueOf(C1403a.f3828g));
        hashMap.put("CARRIER", C1403a.f3830i);
        hashMap.put("MAKE", C1403a.f3823b);
        hashMap.put("MODEL", C1403a.f3824c);
        hashMap.put("ROOTED", String.valueOf(f3911c.f4167d));
        hashMap.put("INSTALLER", C1403a.f3829h);
        hashMap.put("SDK_CAPABILITY", C1384c.m4821b());
        hashMap.put("NETWORK_TYPE", String.valueOf(C1475a.m5158c(this.f3912d).f4038g));
        hashMap.put("SESSION_TIME", C1490h.m5241a(C1414h.m4921b()));
        hashMap.put("SESSION_ID", C1414h.m4922c());
        if (f3910b != null) {
            hashMap.put("AFP", f3910b);
        }
        String c = C1504q.m5296c(this.f3912d);
        if (c != null) {
            hashMap.put("ASHAS", c);
        }
        hashMap.put("UNITY", String.valueOf(C1490h.m5254a(this.f3912d)));
        c = AdSettings.getMediationService();
        if (c != null) {
            hashMap.put("MEDIATION_SERVICE", c);
        }
        return hashMap;
    }
}
