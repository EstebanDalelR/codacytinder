package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.js.C2388t;
import com.google.android.gms.ads.internal.js.C4272a;
import com.google.android.gms.ads.internal.js.zzc;
import java.util.concurrent.TimeUnit;

@zzzv
public final class ae extends dy {
    /* renamed from: a */
    private static long f26539a = TimeUnit.SECONDS.toMillis(10);
    /* renamed from: b */
    private static final Object f26540b = new Object();
    /* renamed from: c */
    private static boolean f26541c = false;
    /* renamed from: d */
    private static C2388t f26542d;
    /* renamed from: e */
    private static HttpClient f26543e;
    /* renamed from: f */
    private static aa f26544f;
    /* renamed from: g */
    private static zzt<Object> f26545g;
    /* renamed from: h */
    private final zzzx f26546h;
    /* renamed from: i */
    private final C4474r f26547i;
    /* renamed from: j */
    private final Object f26548j = new Object();
    /* renamed from: k */
    private final Context f26549k;
    /* renamed from: l */
    private C4272a f26550l;
    /* renamed from: m */
    private ahz f26551m;

    public ae(Context context, C4474r c4474r, zzzx zzzx, ahz ahz) {
        super(true);
        this.f26546h = zzzx;
        this.f26549k = context;
        this.f26547i = c4474r;
        this.f26551m = ahz;
        synchronized (f26540b) {
            if (!f26541c) {
                f26544f = new aa();
                f26543e = new HttpClient(context.getApplicationContext(), c4474r.f16490j);
                f26545g = new am();
                f26542d = new C2388t(this.f26549k.getApplicationContext(), this.f26547i.f16490j, (String) aja.m19221f().m19334a(alo.f15449a), new al(), new ak());
                f26541c = true;
            }
        }
    }

    /* renamed from: a */
    private final com.google.android.gms.internal.zzaax m31339a(com.google.android.gms.internal.zzaat r11) {
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
        com.google.android.gms.ads.internal.ar.e();
        r0 = com.google.android.gms.internal.fk.m19685a();
        r1 = r10.m31341a(r11, r0);
        r2 = 0;
        if (r1 != 0) goto L_0x0014;
    L_0x000e:
        r11 = new com.google.android.gms.internal.zzaax;
        r11.<init>(r2);
        return r11;
    L_0x0014:
        r3 = com.google.android.gms.ads.internal.ar.k();
        r3 = r3.elapsedRealtime();
        r5 = f26544f;
        r5 = r5.a(r0);
        r6 = com.google.android.gms.internal.hn.f16157a;
        r7 = new com.google.android.gms.internal.ag;
        r7.<init>(r10, r1, r0);
        r6.post(r7);
        r0 = f26539a;
        r6 = com.google.android.gms.ads.internal.ar.k();
        r6 = r6.elapsedRealtime();
        r8 = r6 - r3;
        r3 = r0 - r8;
        r0 = -1;
        r1 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ CancellationException -> 0x0076, CancellationException -> 0x0076, TimeoutException -> 0x006f, ExecutionException -> 0x0069 }
        r1 = r5.get(r3, r1);	 Catch:{ CancellationException -> 0x0076, CancellationException -> 0x0076, TimeoutException -> 0x006f, ExecutionException -> 0x0069 }
        r1 = (org.json.JSONObject) r1;	 Catch:{ CancellationException -> 0x0076, CancellationException -> 0x0076, TimeoutException -> 0x006f, ExecutionException -> 0x0069 }
        if (r1 != 0) goto L_0x004b;
    L_0x0045:
        r11 = new com.google.android.gms.internal.zzaax;
        r11.<init>(r0);
        return r11;
    L_0x004b:
        r0 = r10.f26549k;
        r1 = r1.toString();
        r11 = com.google.android.gms.internal.au.m19492a(r0, r11, r1);
        r0 = r11.errorCode;
        r1 = -3;
        if (r0 == r1) goto L_0x0068;
    L_0x005a:
        r0 = r11.body;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0068;
    L_0x0062:
        r11 = new com.google.android.gms.internal.zzaax;
        r0 = 3;
        r11.<init>(r0);
    L_0x0068:
        return r11;
    L_0x0069:
        r11 = new com.google.android.gms.internal.zzaax;
        r11.<init>(r2);
        return r11;
    L_0x006f:
        r11 = new com.google.android.gms.internal.zzaax;
        r0 = 2;
        r11.<init>(r0);
        return r11;
    L_0x0076:
        r11 = new com.google.android.gms.internal.zzaax;
        r11.<init>(r0);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ae.a(com.google.android.gms.internal.zzaat):com.google.android.gms.internal.zzaax");
    }

    /* renamed from: a */
    private final org.json.JSONObject m31341a(com.google.android.gms.internal.zzaat r6, java.lang.String r7) {
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
        r5 = this;
        r0 = r6.zzcnd;
        r0 = r0.extras;
        r1 = "sdk_less_server_data";
        r0 = r0.getBundle(r1);
        r1 = 0;
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return r1;
    L_0x000e:
        r2 = com.google.android.gms.ads.internal.ar.o();	 Catch:{ Exception -> 0x001f }
        r3 = r5.f26549k;	 Catch:{ Exception -> 0x001f }
        r2 = r2.m19563a(r3);	 Catch:{ Exception -> 0x001f }
        r2 = r2.get();	 Catch:{ Exception -> 0x001f }
        r2 = (com.google.android.gms.internal.bb) r2;	 Catch:{ Exception -> 0x001f }
        goto L_0x0026;
    L_0x001f:
        r2 = move-exception;
        r3 = "Error grabbing device info: ";
        com.google.android.gms.internal.hx.m19914c(r3, r2);
        r2 = r1;
    L_0x0026:
        r3 = r5.f26549k;
        r4 = new com.google.android.gms.internal.ao;
        r4.<init>();
        r4.f15531i = r6;
        r4.f15532j = r2;
        r6 = com.google.android.gms.internal.au.m19496a(r3, r4);
        if (r6 != 0) goto L_0x0038;
    L_0x0037:
        return r1;
    L_0x0038:
        r2 = r5.f26549k;	 Catch:{ IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f }
        r2 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r2);	 Catch:{ IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f }
        goto L_0x0046;
    L_0x003f:
        r2 = move-exception;
        r3 = "Cannot get advertising id info";
        com.google.android.gms.internal.hx.m19914c(r3, r2);
        r2 = r1;
    L_0x0046:
        r3 = new java.util.HashMap;
        r3.<init>();
        r4 = "request_id";
        r3.put(r4, r7);
        r7 = "request_param";
        r3.put(r7, r6);
        r6 = "data";
        r3.put(r6, r0);
        if (r2 == 0) goto L_0x0072;
    L_0x005c:
        r6 = "adid";
        r7 = r2.getId();
        r3.put(r6, r7);
        r6 = "lat";
        r7 = r2.isLimitAdTrackingEnabled();
        r7 = java.lang.Integer.valueOf(r7);
        r3.put(r6, r7);
    L_0x0072:
        r6 = com.google.android.gms.ads.internal.ar.e();	 Catch:{ JSONException -> 0x007b }
        r6 = r6.m19748a(r3);	 Catch:{ JSONException -> 0x007b }
        return r6;
    L_0x007b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ae.a(com.google.android.gms.internal.zzaat, java.lang.String):org.json.JSONObject");
    }

    /* renamed from: a */
    protected static void m31342a(zzc zzc) {
        zzc.zza("/loadAd", f26544f);
        zzc.zza("/fetchHttpRequest", f26543e);
        zzc.zza("/invalidRequest", f26545g);
    }

    /* renamed from: b */
    protected static void m31344b(zzc zzc) {
        zzc.zzb("/loadAd", f26544f);
        zzc.zzb("/fetchHttpRequest", f26543e);
        zzc.zzb("/invalidRequest", f26545g);
    }

    /* renamed from: a */
    public final void mo6837a() {
        hx.m19911b("SdkLessAdLoaderBackgroundTask started.");
        String i = ar.z().m19611i(this.f26549k);
        zzaat zzaat = new zzaat(this.f26547i, -1, ar.z().m19609g(this.f26549k), ar.z().m19610h(this.f26549k), i);
        ar.z().m19608f(this.f26549k, i);
        zzaax a = m31339a(zzaat);
        long elapsedRealtime = ar.k().elapsedRealtime();
        zzaat = zzaat;
        hn.f16157a.post(new af(this, new dm(zzaat, a, null, null, a.errorCode, elapsedRealtime, a.zzcpa, null, this.f26551m)));
    }

    /* renamed from: b */
    public final void mo6838b() {
        synchronized (this.f26548j) {
            hn.f16157a.post(new aj(this));
        }
    }
}
