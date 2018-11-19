package com.appsflyer;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.networkperf.InstrumentationConstantsKt;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

final class aa {
    /* renamed from: a */
    private static aa f2409a;
    /* renamed from: A */
    private final String f2410A;
    /* renamed from: B */
    private JSONObject f2411B;
    /* renamed from: C */
    private JSONArray f2412C;
    /* renamed from: D */
    private int f2413D;
    /* renamed from: E */
    private boolean f2414E;
    /* renamed from: F */
    private String f2415F;
    /* renamed from: b */
    private boolean f2416b;
    /* renamed from: c */
    private boolean f2417c;
    /* renamed from: d */
    private final String f2418d;
    /* renamed from: e */
    private final String f2419e;
    /* renamed from: f */
    private final String f2420f;
    /* renamed from: g */
    private final String f2421g;
    /* renamed from: h */
    private final String f2422h;
    /* renamed from: i */
    private final String f2423i;
    /* renamed from: j */
    private final String f2424j;
    /* renamed from: k */
    private final String f2425k;
    /* renamed from: l */
    private final String f2426l;
    /* renamed from: m */
    private final String f2427m;
    /* renamed from: n */
    private final String f2428n;
    /* renamed from: o */
    private final String f2429o;
    /* renamed from: p */
    private final String f2430p;
    /* renamed from: q */
    private final String f2431q;
    /* renamed from: r */
    private final String f2432r;
    /* renamed from: s */
    private final String f2433s;
    /* renamed from: t */
    private final String f2434t;
    /* renamed from: u */
    private final String f2435u;
    /* renamed from: v */
    private final String f2436v;
    /* renamed from: w */
    private final String f2437w;
    /* renamed from: x */
    private final String f2438x;
    /* renamed from: y */
    private final String f2439y;
    /* renamed from: z */
    private final String f2440z;

    private aa() {
        this.f2416b = true;
        this.f2417c = true;
        this.f2418d = "brand";
        this.f2419e = "model";
        this.f2420f = "platform";
        this.f2421g = "platform_version";
        this.f2422h = "advertiserId";
        this.f2423i = "imei";
        this.f2424j = "android_id";
        this.f2425k = "sdk_version";
        this.f2426l = "devkey";
        this.f2427m = "originalAppsFlyerId";
        this.f2428n = InstrumentationConstantsKt.FIELD_UID;
        this.f2429o = "app_id";
        this.f2430p = "app_version";
        this.f2431q = "channel";
        this.f2432r = "preInstall";
        this.f2433s = ManagerWebServices.FB_DATA;
        this.f2434t = "r_debugging_off";
        this.f2435u = "r_debugging_on";
        this.f2436v = "public_api_call";
        this.f2437w = "exception";
        this.f2438x = "server_request";
        this.f2439y = "server_response";
        this.f2440z = "yyyy-MM-dd HH:mm:ssZ";
        this.f2410A = "MM-dd HH:mm:ss.SSS";
        this.f2413D = 0;
        this.f2415F = "-1";
        this.f2412C = new JSONArray();
        this.f2413D = 0;
        this.f2414E = false;
    }

    /* renamed from: a */
    static aa m3121a() {
        if (f2409a == null) {
            f2409a = new aa();
        }
        return f2409a;
    }

    /* renamed from: a */
    final synchronized void m3131a(String str) {
        this.f2415F = str;
    }

    /* renamed from: b */
    final synchronized void m3137b() {
        this.f2414E = true;
        m3125a("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    /* renamed from: c */
    final synchronized void m3139c() {
        m3125a("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.f2414E = false;
        this.f2416b = false;
    }

    /* renamed from: d */
    final synchronized void m3140d() {
        this.f2411B = null;
        this.f2412C = null;
        f2409a = null;
    }

    /* renamed from: a */
    final void m3133a(java.lang.String r5, android.content.pm.PackageManager r6) {
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
        r4 = this;
        r0 = m3121a();	 Catch:{ Throwable -> 0x0041 }
        r0.m3127b(r5, r6);	 Catch:{ Throwable -> 0x0041 }
        r6 = m3121a();	 Catch:{ Throwable -> 0x0041 }
        r0 = 1;	 Catch:{ Throwable -> 0x0041 }
        r6 = r6.m3122a(r0);	 Catch:{ Throwable -> 0x0041 }
        r1 = new com.appsflyer.v;	 Catch:{ Throwable -> 0x0041 }
        r2 = 0;	 Catch:{ Throwable -> 0x0041 }
        r3 = com.appsflyer.C3010d.m11689c();	 Catch:{ Throwable -> 0x0041 }
        r3 = r3.m11750e();	 Catch:{ Throwable -> 0x0041 }
        r1.<init>(r2, r3);	 Catch:{ Throwable -> 0x0041 }
        r1.f2535b = r6;	 Catch:{ Throwable -> 0x0041 }
        r6 = 0;	 Catch:{ Throwable -> 0x0041 }
        r1.m3259a(r6);	 Catch:{ Throwable -> 0x0041 }
        r0 = new java.lang.String[r0];	 Catch:{ Throwable -> 0x0041 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0041 }
        r2.<init>();	 Catch:{ Throwable -> 0x0041 }
        r3 = "https://monitorsdk.%s/remote-debug?app_id=";	 Catch:{ Throwable -> 0x0041 }
        r3 = com.appsflyer.C0929g.m3169b(r3);	 Catch:{ Throwable -> 0x0041 }
        r2.append(r3);	 Catch:{ Throwable -> 0x0041 }
        r2.append(r5);	 Catch:{ Throwable -> 0x0041 }
        r5 = r2.toString();	 Catch:{ Throwable -> 0x0041 }
        r0[r6] = r5;	 Catch:{ Throwable -> 0x0041 }
        r1.execute(r0);	 Catch:{ Throwable -> 0x0041 }
        return;
    L_0x0041:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.aa.a(java.lang.String, android.content.pm.PackageManager):void");
    }

    /* renamed from: g */
    private boolean m3129g() {
        return this.f2417c && (this.f2416b || this.f2414E);
    }

    /* renamed from: a */
    private synchronized void m3124a(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
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
        monitor-enter(r2);
        r0 = r2.f2411B;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r1 = "brand";	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r0.put(r1, r3);	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r0 = "model";	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r3.put(r0, r4);	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r4 = "platform";	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r0 = "Android";	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r3.put(r4, r0);	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r4 = "platform_version";	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r3.put(r4, r5);	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        if (r6 == 0) goto L_0x002e;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
    L_0x0021:
        r3 = r6.length();	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        if (r3 <= 0) goto L_0x002e;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
    L_0x0027:
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r4 = "advertiserId";	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r3.put(r4, r6);	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
    L_0x002e:
        if (r7 == 0) goto L_0x003d;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
    L_0x0030:
        r3 = r7.length();	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        if (r3 <= 0) goto L_0x003d;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
    L_0x0036:
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r4 = "imei";	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r3.put(r4, r7);	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
    L_0x003d:
        if (r8 == 0) goto L_0x004c;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
    L_0x003f:
        r3 = r8.length();	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        if (r3 <= 0) goto L_0x004c;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
    L_0x0045:
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r4 = "android_id";	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
        r3.put(r4, r8);	 Catch:{ Throwable -> 0x0051, all -> 0x004e }
    L_0x004c:
        monitor-exit(r2);
        return;
    L_0x004e:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
    L_0x0051:
        monitor-exit(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.aa.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    private synchronized void m3123a(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
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
        monitor-enter(r2);
        r0 = r2.f2411B;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r1 = "sdk_version";	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r0.put(r1, r3);	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        if (r4 == 0) goto L_0x0017;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
    L_0x000a:
        r3 = r4.length();	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        if (r3 <= 0) goto L_0x0017;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
    L_0x0010:
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r0 = "devkey";	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r3.put(r0, r4);	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
    L_0x0017:
        if (r5 == 0) goto L_0x0026;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
    L_0x0019:
        r3 = r5.length();	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        if (r3 <= 0) goto L_0x0026;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
    L_0x001f:
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r4 = "originalAppsFlyerId";	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r3.put(r4, r5);	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
    L_0x0026:
        if (r6 == 0) goto L_0x0035;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
    L_0x0028:
        r3 = r6.length();	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        if (r3 <= 0) goto L_0x0035;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
    L_0x002e:
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r4 = "uid";	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r3.put(r4, r6);	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
    L_0x0035:
        monitor-exit(r2);
        return;
    L_0x0037:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
    L_0x003a:
        monitor-exit(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.aa.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    private synchronized void m3128b(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
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
        monitor-enter(r2);
        if (r3 == 0) goto L_0x0013;
    L_0x0003:
        r0 = r3.length();	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        if (r0 <= 0) goto L_0x0013;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
    L_0x0009:
        r0 = r2.f2411B;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        r1 = "app_id";	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        r0.put(r1, r3);	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        goto L_0x0013;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
    L_0x0011:
        r3 = move-exception;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        goto L_0x0041;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
    L_0x0013:
        if (r4 == 0) goto L_0x0022;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
    L_0x0015:
        r3 = r4.length();	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        if (r3 <= 0) goto L_0x0022;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
    L_0x001b:
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        r0 = "app_version";	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        r3.put(r0, r4);	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
    L_0x0022:
        if (r5 == 0) goto L_0x0031;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
    L_0x0024:
        r3 = r5.length();	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        if (r3 <= 0) goto L_0x0031;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
    L_0x002a:
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        r4 = "channel";	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        r3.put(r4, r5);	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
    L_0x0031:
        if (r6 == 0) goto L_0x0045;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
    L_0x0033:
        r3 = r6.length();	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        if (r3 <= 0) goto L_0x0045;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
    L_0x0039:
        r3 = r2.f2411B;	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        r4 = "preInstall";	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        r3.put(r4, r6);	 Catch:{ Throwable -> 0x0043, all -> 0x0011 }
        goto L_0x0045;
    L_0x0041:
        monitor-exit(r2);
        throw r3;
    L_0x0043:
        monitor-exit(r2);
        return;
    L_0x0045:
        monitor-exit(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.aa.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    final void m3135a(String str, String... strArr) {
        m3125a("public_api_call", str, strArr);
    }

    /* renamed from: a */
    final void m3136a(Throwable th) {
        Throwable cause = th.getCause();
        m3125a("exception", th.getClass().getSimpleName(), m3126a(cause == null ? th.getMessage() : cause.getMessage(), cause == null ? th.getStackTrace() : cause.getStackTrace()));
    }

    /* renamed from: a */
    final void m3134a(String str, String str2) {
        m3125a("server_request", str, str2);
    }

    /* renamed from: a */
    final void m3132a(String str, int i, String str2) {
        m3125a("server_response", str, String.valueOf(i), str2);
    }

    /* renamed from: b */
    final void m3138b(String str, String str2) {
        m3125a(null, str, str2);
    }

    /* renamed from: a */
    private synchronized void m3125a(java.lang.String r12, java.lang.String r13, java.lang.String... r14) {
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
        r11 = this;
        monitor-enter(r11);
        r0 = r11.m3129g();	 Catch:{ all -> 0x00aa }
        if (r0 == 0) goto L_0x00a8;	 Catch:{ all -> 0x00aa }
    L_0x0007:
        r0 = r11.f2413D;	 Catch:{ all -> 0x00aa }
        r1 = 98304; // 0x18000 float:1.37753E-40 double:4.85686E-319;
        if (r0 < r1) goto L_0x0010;
    L_0x000e:
        goto L_0x00a8;
    L_0x0010:
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ Throwable -> 0x00a6 }
        r2 = "";	 Catch:{ Throwable -> 0x00a6 }
        r3 = r14.length;	 Catch:{ Throwable -> 0x00a6 }
        r4 = 0;	 Catch:{ Throwable -> 0x00a6 }
        r5 = 1;	 Catch:{ Throwable -> 0x00a6 }
        if (r3 <= 0) goto L_0x003a;	 Catch:{ Throwable -> 0x00a6 }
    L_0x001b:
        r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00a6 }
        r2.<init>();	 Catch:{ Throwable -> 0x00a6 }
        r3 = r14.length;	 Catch:{ Throwable -> 0x00a6 }
        r3 = r3 - r5;	 Catch:{ Throwable -> 0x00a6 }
    L_0x0022:
        if (r3 <= 0) goto L_0x0031;	 Catch:{ Throwable -> 0x00a6 }
    L_0x0024:
        r6 = r14[r3];	 Catch:{ Throwable -> 0x00a6 }
        r2.append(r6);	 Catch:{ Throwable -> 0x00a6 }
        r6 = ", ";	 Catch:{ Throwable -> 0x00a6 }
        r2.append(r6);	 Catch:{ Throwable -> 0x00a6 }
        r3 = r3 + -1;	 Catch:{ Throwable -> 0x00a6 }
        goto L_0x0022;	 Catch:{ Throwable -> 0x00a6 }
    L_0x0031:
        r14 = r14[r4];	 Catch:{ Throwable -> 0x00a6 }
        r2.append(r14);	 Catch:{ Throwable -> 0x00a6 }
        r2 = r2.toString();	 Catch:{ Throwable -> 0x00a6 }
    L_0x003a:
        r14 = new java.text.SimpleDateFormat;	 Catch:{ Throwable -> 0x00a6 }
        r3 = "MM-dd HH:mm:ss.SSS";	 Catch:{ Throwable -> 0x00a6 }
        r6 = java.util.Locale.ENGLISH;	 Catch:{ Throwable -> 0x00a6 }
        r14.<init>(r3, r6);	 Catch:{ Throwable -> 0x00a6 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ Throwable -> 0x00a6 }
        r14 = r14.format(r0);	 Catch:{ Throwable -> 0x00a6 }
        r0 = 5;	 Catch:{ Throwable -> 0x00a6 }
        r1 = 4;	 Catch:{ Throwable -> 0x00a6 }
        r3 = 3;	 Catch:{ Throwable -> 0x00a6 }
        r6 = 2;	 Catch:{ Throwable -> 0x00a6 }
        if (r12 == 0) goto L_0x0075;	 Catch:{ Throwable -> 0x00a6 }
    L_0x0051:
        r7 = "%18s %5s _/%s [%s] %s %s";	 Catch:{ Throwable -> 0x00a6 }
        r8 = 6;	 Catch:{ Throwable -> 0x00a6 }
        r8 = new java.lang.Object[r8];	 Catch:{ Throwable -> 0x00a6 }
        r8[r4] = r14;	 Catch:{ Throwable -> 0x00a6 }
        r14 = java.lang.Thread.currentThread();	 Catch:{ Throwable -> 0x00a6 }
        r9 = r14.getId();	 Catch:{ Throwable -> 0x00a6 }
        r14 = java.lang.Long.valueOf(r9);	 Catch:{ Throwable -> 0x00a6 }
        r8[r5] = r14;	 Catch:{ Throwable -> 0x00a6 }
        r14 = "AppsFlyer_4.8.7";	 Catch:{ Throwable -> 0x00a6 }
        r8[r6] = r14;	 Catch:{ Throwable -> 0x00a6 }
        r8[r3] = r12;	 Catch:{ Throwable -> 0x00a6 }
        r8[r1] = r13;	 Catch:{ Throwable -> 0x00a6 }
        r8[r0] = r2;	 Catch:{ Throwable -> 0x00a6 }
        r12 = java.lang.String.format(r7, r8);	 Catch:{ Throwable -> 0x00a6 }
        goto L_0x0095;	 Catch:{ Throwable -> 0x00a6 }
    L_0x0075:
        r12 = "%18s %5s %s/%s %s";	 Catch:{ Throwable -> 0x00a6 }
        r0 = new java.lang.Object[r0];	 Catch:{ Throwable -> 0x00a6 }
        r0[r4] = r14;	 Catch:{ Throwable -> 0x00a6 }
        r14 = java.lang.Thread.currentThread();	 Catch:{ Throwable -> 0x00a6 }
        r7 = r14.getId();	 Catch:{ Throwable -> 0x00a6 }
        r14 = java.lang.Long.valueOf(r7);	 Catch:{ Throwable -> 0x00a6 }
        r0[r5] = r14;	 Catch:{ Throwable -> 0x00a6 }
        r0[r6] = r13;	 Catch:{ Throwable -> 0x00a6 }
        r13 = "AppsFlyer_4.8.7";	 Catch:{ Throwable -> 0x00a6 }
        r0[r3] = r13;	 Catch:{ Throwable -> 0x00a6 }
        r0[r1] = r2;	 Catch:{ Throwable -> 0x00a6 }
        r12 = java.lang.String.format(r12, r0);	 Catch:{ Throwable -> 0x00a6 }
    L_0x0095:
        r13 = r11.f2412C;	 Catch:{ Throwable -> 0x00a6 }
        r13.put(r12);	 Catch:{ Throwable -> 0x00a6 }
        r13 = r11.f2413D;	 Catch:{ Throwable -> 0x00a6 }
        r12 = r12.getBytes();	 Catch:{ Throwable -> 0x00a6 }
        r12 = r12.length;	 Catch:{ Throwable -> 0x00a6 }
        r13 = r13 + r12;	 Catch:{ Throwable -> 0x00a6 }
        r11.f2413D = r13;	 Catch:{ Throwable -> 0x00a6 }
        monitor-exit(r11);
        return;
    L_0x00a6:
        monitor-exit(r11);
        return;
    L_0x00a8:
        monitor-exit(r11);
        return;
    L_0x00aa:
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.aa.a(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: a */
    private synchronized java.lang.String m3122a(boolean r5) {
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
        r4 = this;
        monitor-enter(r4);
        r0 = 0;
        java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x001d, all -> 0x001a }
        r1 = r4.f2411B;	 Catch:{ JSONException -> 0x001d, all -> 0x001a }
        r2 = "data";	 Catch:{ JSONException -> 0x001d, all -> 0x001a }
        r3 = r4.f2412C;	 Catch:{ JSONException -> 0x001d, all -> 0x001a }
        r1.put(r2, r3);	 Catch:{ JSONException -> 0x001d, all -> 0x001a }
        r1 = r4.f2411B;	 Catch:{ JSONException -> 0x001d, all -> 0x001a }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x001d, all -> 0x001a }
        if (r5 == 0) goto L_0x001e;
    L_0x0016:
        r4.m3130h();	 Catch:{ JSONException -> 0x001e, all -> 0x001a }
        goto L_0x001e;
    L_0x001a:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
    L_0x001d:
        r1 = r0;
    L_0x001e:
        monitor-exit(r4);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.aa.a(boolean):java.lang.String");
    }

    /* renamed from: b */
    private synchronized void m3127b(java.lang.String r11, android.content.pm.PackageManager r12) {
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
        r10 = this;
        monitor-enter(r10);
        r0 = com.appsflyer.AppsFlyerProperties.m3086a();	 Catch:{ all -> 0x0081 }
        r1 = com.appsflyer.C3010d.m11689c();	 Catch:{ all -> 0x0081 }
        r2 = "remote_debug_static_data";	 Catch:{ all -> 0x0081 }
        r2 = r0.m3090a(r2);	 Catch:{ all -> 0x0081 }
        if (r2 == 0) goto L_0x0019;
    L_0x0011:
        r11 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0070 }
        r11.<init>(r2);	 Catch:{ Throwable -> 0x0070 }
        r10.f2411B = r11;	 Catch:{ Throwable -> 0x0070 }
        goto L_0x0070;
    L_0x0019:
        r2 = new org.json.JSONObject;	 Catch:{ all -> 0x0081 }
        r2.<init>();	 Catch:{ all -> 0x0081 }
        r10.f2411B = r2;	 Catch:{ all -> 0x0081 }
        r4 = android.os.Build.BRAND;	 Catch:{ all -> 0x0081 }
        r5 = android.os.Build.MODEL;	 Catch:{ all -> 0x0081 }
        r6 = android.os.Build.VERSION.RELEASE;	 Catch:{ all -> 0x0081 }
        r2 = "advertiserId";	 Catch:{ all -> 0x0081 }
        r7 = r0.m3090a(r2);	 Catch:{ all -> 0x0081 }
        r8 = r1.f9371g;	 Catch:{ all -> 0x0081 }
        r9 = r1.f9372h;	 Catch:{ all -> 0x0081 }
        r3 = r10;	 Catch:{ all -> 0x0081 }
        r3.m3124a(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0081 }
        r1 = "4.8.7.364";	 Catch:{ all -> 0x0081 }
        r2 = "AppsFlyerKey";	 Catch:{ all -> 0x0081 }
        r2 = r0.m3090a(r2);	 Catch:{ all -> 0x0081 }
        r3 = "KSAppsFlyerId";	 Catch:{ all -> 0x0081 }
        r3 = r0.m3090a(r3);	 Catch:{ all -> 0x0081 }
        r4 = "uid";	 Catch:{ all -> 0x0081 }
        r4 = r0.m3090a(r4);	 Catch:{ all -> 0x0081 }
        r10.m3123a(r1, r2, r3, r4);	 Catch:{ all -> 0x0081 }
        r1 = 0;
        r12 = r12.getPackageInfo(r11, r1);	 Catch:{ Throwable -> 0x0065 }
        r12 = r12.versionCode;	 Catch:{ Throwable -> 0x0065 }
        r1 = "channel";	 Catch:{ Throwable -> 0x0065 }
        r1 = r0.m3090a(r1);	 Catch:{ Throwable -> 0x0065 }
        r2 = "preInstallName";	 Catch:{ Throwable -> 0x0065 }
        r2 = r0.m3090a(r2);	 Catch:{ Throwable -> 0x0065 }
        r12 = java.lang.String.valueOf(r12);	 Catch:{ Throwable -> 0x0065 }
        r10.m3128b(r11, r12, r1, r2);	 Catch:{ Throwable -> 0x0065 }
    L_0x0065:
        r11 = "remote_debug_static_data";	 Catch:{ all -> 0x0081 }
        r12 = r10.f2411B;	 Catch:{ all -> 0x0081 }
        r12 = r12.toString();	 Catch:{ all -> 0x0081 }
        r0.m3092a(r11, r12);	 Catch:{ all -> 0x0081 }
    L_0x0070:
        r11 = r10.f2411B;	 Catch:{ JSONException -> 0x007b }
        r12 = "launch_counter";	 Catch:{ JSONException -> 0x007b }
        r0 = r10.f2415F;	 Catch:{ JSONException -> 0x007b }
        r11.put(r12, r0);	 Catch:{ JSONException -> 0x007b }
        monitor-exit(r10);
        return;
    L_0x007b:
        r11 = move-exception;
        r11.printStackTrace();	 Catch:{ all -> 0x0081 }
        monitor-exit(r10);
        return;
    L_0x0081:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.aa.b(java.lang.String, android.content.pm.PackageManager):void");
    }

    /* renamed from: a */
    private String[] m3126a(String str, StackTraceElement[] stackTraceElementArr) {
        int i = 1;
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[(stackTraceElementArr.length + 1)];
        strArr[0] = str;
        while (i < stackTraceElementArr.length) {
            strArr[i] = stackTraceElementArr[i].toString();
            i++;
        }
        return strArr;
    }

    /* renamed from: h */
    private synchronized void m3130h() {
        this.f2412C = null;
        this.f2412C = new JSONArray();
        this.f2413D = 0;
    }

    /* renamed from: e */
    final synchronized void m3141e() {
        this.f2416b = false;
        m3130h();
    }

    /* renamed from: f */
    final boolean m3142f() {
        return this.f2414E;
    }
}
