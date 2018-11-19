package com.google.android.gms.internal;

import android.content.Context;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.ar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

@zzzv
public final class aq extends C6272w {
    /* renamed from: a */
    private static final Object f26772a = new Object();
    /* renamed from: b */
    private static aq f26773b;
    /* renamed from: c */
    private final Context f26774c;
    /* renamed from: d */
    private final ap f26775d;
    /* renamed from: e */
    private final ScheduledExecutorService f26776e = Executors.newSingleThreadScheduledExecutor();

    private aq(Context context, ap apVar) {
        this.f26774c = context;
        this.f26775d = apVar;
    }

    /* renamed from: a */
    public static aq m31494a(Context context, ap apVar) {
        aq aqVar;
        synchronized (f26772a) {
            if (f26773b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                alo.m19337a(context);
                f26773b = new aq(context, apVar);
                if (context.getApplicationContext() != null) {
                    ar.e().m19757c(context);
                }
                ea.m19651a(context);
            }
            aqVar = f26773b;
        }
        return aqVar;
    }

    /* renamed from: a */
    private static com.google.android.gms.internal.zzaax m31495a(android.content.Context r19, com.google.android.gms.internal.ap r20, com.google.android.gms.internal.zzaat r21, java.util.concurrent.ScheduledExecutorService r22) {
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
        r1 = r19;
        r7 = r20;
        r0 = r21;
        r2 = r22;
        r3 = "Starting ad request from service using: google.afma.request.getAdDictionary";
        com.google.android.gms.internal.hx.m19911b(r3);
        r8 = new com.google.android.gms.internal.amb;
        r3 = com.google.android.gms.internal.alo.f15430H;
        r4 = com.google.android.gms.internal.aja.m19221f();
        r3 = r4.m19334a(r3);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        r4 = "load_ad";
        r5 = r0.zzauc;
        r5 = r5.zzbek;
        r8.<init>(r3, r4, r5);
        r3 = r0.versionCode;
        r4 = 10;
        if (r3 <= r4) goto L_0x0045;
    L_0x002e:
        r3 = r0.zzcnt;
        r5 = -1;
        r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r9 == 0) goto L_0x0045;
    L_0x0036:
        r3 = r0.zzcnt;
        r3 = r8.m19362a(r3);
        r4 = "cts";
        r4 = new java.lang.String[]{r4};
        r8.m19367a(r3, r4);
    L_0x0045:
        r9 = r8.m19361a();
        r3 = r7.f15557h;
        r3 = r3.zzi(r1);
        r4 = com.google.android.gms.internal.alo.ck;
        r5 = com.google.android.gms.internal.aja.m19221f();
        r4 = r5.m19334a(r4);
        r4 = (java.lang.Long) r4;
        r4 = r4.longValue();
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r3 = com.google.android.gms.internal.id.m19921a(r3, r4, r6, r2);
        r4 = r7.f15556g;
        r4 = r4.zzp(r1);
        r5 = com.google.android.gms.internal.alo.bh;
        r6 = com.google.android.gms.internal.aja.m19221f();
        r5 = r6.m19334a(r5);
        r5 = (java.lang.Long) r5;
        r5 = r5.longValue();
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r4 = com.google.android.gms.internal.id.m19921a(r4, r5, r10, r2);
        r5 = r7.f15552c;
        r6 = r0.zzcne;
        r6 = r6.packageName;
        r5 = r5.zzby(r6);
        r6 = r7.f15558i;
        r10 = r0.zzcnf;
        r11 = r0.zzcne;
        r6 = r6.zza(r10, r11);
        r10 = com.google.android.gms.ads.internal.ar.o();
        r10 = r10.m19563a(r1);
        r11 = 0;
        r12 = com.google.android.gms.internal.id.m19920a(r11);
        r13 = r0.zzcnd;
        r13 = r13.extras;
        if (r13 == 0) goto L_0x00b2;
    L_0x00a8:
        r15 = "_ad";
        r13 = r13.getString(r15);
        if (r13 == 0) goto L_0x00b2;
    L_0x00b0:
        r13 = 1;
        goto L_0x00b3;
    L_0x00b2:
        r13 = 0;
    L_0x00b3:
        r15 = r0.zzcnz;
        if (r15 == 0) goto L_0x00c1;
    L_0x00b7:
        if (r13 != 0) goto L_0x00c1;
    L_0x00b9:
        r12 = r7.f15555f;
        r13 = r0.applicationInfo;
        r12 = r12.zza(r13);
    L_0x00c1:
        r13 = com.google.android.gms.internal.alo.cb;
        r15 = com.google.android.gms.internal.aja.m19221f();
        r13 = r15.m19334a(r13);
        r13 = (java.lang.Long) r13;
        r14 = r13.longValue();
        r13 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r12 = com.google.android.gms.internal.id.m19921a(r12, r14, r13, r2);
        r13 = com.google.android.gms.internal.id.m19920a(r11);
        r14 = com.google.android.gms.internal.alo.ax;
        r15 = com.google.android.gms.internal.aja.m19221f();
        r14 = r15.m19334a(r14);
        r14 = (java.lang.Boolean) r14;
        r14 = r14.booleanValue();
        if (r14 == 0) goto L_0x0109;
    L_0x00ed:
        r13 = r7.f15558i;
        r13 = r13.zzab(r1);
        r14 = com.google.android.gms.internal.alo.ay;
        r15 = com.google.android.gms.internal.aja.m19221f();
        r14 = r15.m19334a(r14);
        r14 = (java.lang.Long) r14;
        r14 = r14.longValue();
        r11 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r13 = com.google.android.gms.internal.id.m19921a(r13, r14, r11, r2);
    L_0x0109:
        r11 = r0.versionCode;
        r14 = 4;
        if (r11 < r14) goto L_0x0115;
    L_0x010e:
        r11 = r0.zzcnk;
        if (r11 == 0) goto L_0x0115;
    L_0x0112:
        r11 = r0.zzcnk;
        goto L_0x0116;
    L_0x0115:
        r11 = 0;
    L_0x0116:
        r14 = com.google.android.gms.internal.alo.f15446X;
        r15 = com.google.android.gms.internal.aja.m19221f();
        r14 = r15.m19334a(r14);
        r14 = (java.lang.Boolean) r14;
        r14.booleanValue();
        com.google.android.gms.ads.internal.ar.e();
        r14 = r19.getPackageName();
        r15 = "android.permission.ACCESS_NETWORK_STATE";
        r14 = com.google.android.gms.internal.fk.m19706a(r1, r14, r15);
        if (r14 == 0) goto L_0x0147;
    L_0x0134:
        r14 = "connectivity";
        r14 = r1.getSystemService(r14);
        r14 = (android.net.ConnectivityManager) r14;
        r14 = r14.getActiveNetworkInfo();
        if (r14 != 0) goto L_0x0147;
    L_0x0142:
        r14 = "Device is offline.";
        com.google.android.gms.internal.hx.m19911b(r14);
    L_0x0147:
        r14 = r0.versionCode;
        r15 = 7;
        if (r14 < r15) goto L_0x014f;
    L_0x014c:
        r14 = r0.zzcnq;
        goto L_0x0157;
    L_0x014f:
        r14 = java.util.UUID.randomUUID();
        r14 = r14.toString();
    L_0x0157:
        r15 = new com.google.android.gms.internal.av;
        r2 = r0.applicationInfo;
        r2 = r2.packageName;
        r15.<init>(r1, r14, r2);
        r2 = r0.zzcnd;
        r2 = r2.extras;
        if (r2 == 0) goto L_0x0177;
    L_0x0166:
        r2 = r0.zzcnd;
        r2 = r2.extras;
        r15 = "_ad";
        r2 = r2.getString(r15);
        if (r2 == 0) goto L_0x0177;
    L_0x0172:
        r0 = com.google.android.gms.internal.au.m19492a(r1, r0, r2);
        return r0;
    L_0x0177:
        r2 = r7.f15553d;
        r15 = r0.zzcnr;
        r2 = r2.zzf(r15);
        r15 = com.google.android.gms.internal.alo.ck;
        r16 = r8;
        r8 = com.google.android.gms.internal.aja.m19221f();
        r8 = r8.m19334a(r15);
        r8 = (java.lang.Long) r8;
        r17 = r9;
        r8 = r8.longValue();
        r15 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r18 = r14;
        r14 = 0;
        r3 = com.google.android.gms.internal.id.m19926a(r3, r14, r8, r15);
        r3 = (android.os.Bundle) r3;
        r4 = com.google.android.gms.internal.id.m19925a(r4, r14);
        r4 = (com.google.android.gms.internal.bj) r4;
        r8 = com.google.android.gms.internal.id.m19925a(r12, r14);
        r8 = (android.location.Location) r8;
        r9 = com.google.android.gms.internal.id.m19925a(r13, r14);
        r9 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r9;
        r6 = com.google.android.gms.internal.id.m19925a(r6, r14);
        r6 = (java.lang.String) r6;
        r5 = com.google.android.gms.internal.id.m19925a(r5, r14);
        r5 = (java.lang.String) r5;
        r10 = com.google.android.gms.internal.id.m19925a(r10, r14);
        r10 = (com.google.android.gms.internal.bb) r10;
        if (r10 != 0) goto L_0x01d0;
    L_0x01c4:
        r0 = "Error fetching device info. This is not recoverable.";
        com.google.android.gms.internal.hx.m19916e(r0);
        r0 = new com.google.android.gms.internal.zzaax;
        r1 = 0;
        r0.<init>(r1);
        return r0;
    L_0x01d0:
        r12 = new com.google.android.gms.internal.ao;
        r12.<init>();
        r12.f15531i = r0;
        r12.f15532j = r10;
        r12.f15527e = r4;
        r12.f15526d = r8;
        r12.f15524b = r3;
        r12.f15529g = r6;
        r12.f15530h = r9;
        if (r2 != 0) goto L_0x01ea;
    L_0x01e5:
        r3 = r12.f15525c;
        r3.clear();
    L_0x01ea:
        r12.f15525c = r2;
        r12.f15523a = r11;
        r12.f15528f = r5;
        r2 = r7.f15551b;
        r2 = r2.zze(r1);
        r12.f15533k = r2;
        r2 = r7.f15559j;
        r12.f15534l = r2;
        r2 = com.google.android.gms.internal.au.m19496a(r1, r12);
        if (r2 != 0) goto L_0x0209;
    L_0x0202:
        r0 = new com.google.android.gms.internal.zzaax;
        r1 = 0;
        r0.<init>(r1);
        return r0;
    L_0x0209:
        r3 = r0.versionCode;
        r4 = 7;
        if (r3 >= r4) goto L_0x0215;
    L_0x020e:
        r3 = "request_id";	 Catch:{ JSONException -> 0x0215 }
        r14 = r18;	 Catch:{ JSONException -> 0x0215 }
        r2.put(r3, r14);	 Catch:{ JSONException -> 0x0215 }
    L_0x0215:
        r2.toString();
        r3 = "arc";
        r3 = new java.lang.String[]{r3};
        r8 = r16;
        r9 = r17;
        r8.m19367a(r9, r3);
        r8.m19361a();
        r3 = r7.f15560k;
        r3 = r3.zznq();
        r2 = r3.zzg(r2);
        r3 = com.google.android.gms.internal.ar.f23050a;
        r4 = r22;
        r2 = com.google.android.gms.internal.id.m19922a(r2, r3, r4);
        r10 = 10;
        r3 = java.util.concurrent.TimeUnit.SECONDS;
        r2 = com.google.android.gms.internal.id.m19921a(r2, r10, r3, r4);
        r3 = r7.f15554e;
        r3 = r3.mo4565a();
        if (r3 == 0) goto L_0x024f;
    L_0x024a:
        r4 = "AdRequestServiceImpl.loadAd.flags";
        com.google.android.gms.internal.ib.m19919a(r3, r4);
    L_0x024f:
        r14 = 0;
        r2 = com.google.android.gms.internal.id.m19925a(r2, r14);
        r6 = r2;
        r6 = (com.google.android.gms.internal.ba) r6;
        if (r6 != 0) goto L_0x0260;
    L_0x0259:
        r0 = new com.google.android.gms.internal.zzaax;
        r1 = 0;
        r0.<init>(r1);
        return r0;
    L_0x0260:
        r2 = r6.m19544a();
        r3 = -2;
        if (r2 == r3) goto L_0x0271;
    L_0x0267:
        r0 = new com.google.android.gms.internal.zzaax;
        r1 = r6.m19544a();
        r0.<init>(r1);
        return r0;
    L_0x0271:
        r8.m19370d();
        r2 = r6.m19553i();
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x0287;
    L_0x027e:
        r2 = r6.m19553i();
        r11 = com.google.android.gms.internal.au.m19492a(r1, r0, r2);
        goto L_0x0288;
    L_0x0287:
        r11 = r14;
    L_0x0288:
        if (r11 != 0) goto L_0x02a3;
    L_0x028a:
        r2 = r6.m19549e();
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x02a3;
    L_0x0294:
        r2 = r0.zzaty;
        r2 = r2.zzcv;
        r3 = r6.m19549e();
        r4 = r5;
        r5 = r6;
        r6 = r8;
        r11 = m31496a(r0, r1, r2, r3, r4, r5, r6, r7);
    L_0x02a3:
        if (r11 != 0) goto L_0x02ab;
    L_0x02a5:
        r11 = new com.google.android.gms.internal.zzaax;
        r0 = 0;
        r11.<init>(r0);
    L_0x02ab:
        r0 = "tts";
        r0 = new java.lang.String[]{r0};
        r8.m19367a(r9, r0);
        r0 = r8.m19368b();
        r11.zzcpj = r0;
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aq.a(android.content.Context, com.google.android.gms.internal.ap, com.google.android.gms.internal.zzaat, java.util.concurrent.ScheduledExecutorService):com.google.android.gms.internal.zzaax");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static com.google.android.gms.internal.zzaax m31496a(com.google.android.gms.internal.zzaat r18, android.content.Context r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.google.android.gms.internal.ba r23, com.google.android.gms.internal.amb r24, com.google.android.gms.internal.ap r25) {
        /*
        r1 = r18;
        r2 = r24;
        if (r2 == 0) goto L_0x000b;
    L_0x0006:
        r4 = r24.m19361a();
        goto L_0x000c;
    L_0x000b:
        r4 = 0;
    L_0x000c:
        r5 = new com.google.android.gms.internal.az;	 Catch:{ IOException -> 0x0191 }
        r6 = r23.m19547c();	 Catch:{ IOException -> 0x0191 }
        r5.<init>(r1, r6);	 Catch:{ IOException -> 0x0191 }
        r6 = "AdRequestServiceImpl: Sending request: ";
        r7 = java.lang.String.valueOf(r21);	 Catch:{ IOException -> 0x0191 }
        r8 = r7.length();	 Catch:{ IOException -> 0x0191 }
        if (r8 == 0) goto L_0x0026;
    L_0x0021:
        r6 = r6.concat(r7);	 Catch:{ IOException -> 0x0191 }
        goto L_0x002c;
    L_0x0026:
        r7 = new java.lang.String;	 Catch:{ IOException -> 0x0191 }
        r7.<init>(r6);	 Catch:{ IOException -> 0x0191 }
        r6 = r7;
    L_0x002c:
        com.google.android.gms.internal.hx.m19911b(r6);	 Catch:{ IOException -> 0x0191 }
        r6 = new java.net.URL;	 Catch:{ IOException -> 0x0191 }
        r7 = r21;
        r6.<init>(r7);	 Catch:{ IOException -> 0x0191 }
        r7 = com.google.android.gms.ads.internal.ar.k();	 Catch:{ IOException -> 0x0191 }
        r7 = r7.elapsedRealtime();	 Catch:{ IOException -> 0x0191 }
        r9 = 0;
        r10 = 0;
    L_0x0040:
        r11 = r6.openConnection();	 Catch:{ IOException -> 0x0191 }
        r11 = (java.net.HttpURLConnection) r11;	 Catch:{ IOException -> 0x0191 }
        r12 = com.google.android.gms.ads.internal.ar.e();	 Catch:{ all -> 0x018b }
        r13 = r19;
        r14 = r20;
        r12.m19750a(r13, r14, r9, r11);	 Catch:{ all -> 0x018b }
        r12 = android.text.TextUtils.isEmpty(r22);	 Catch:{ all -> 0x018b }
        if (r12 != 0) goto L_0x0065;
    L_0x0057:
        r12 = r23.m19551g();	 Catch:{ all -> 0x018b }
        if (r12 == 0) goto L_0x0065;
    L_0x005d:
        r12 = "x-afma-drt-cookie";
        r15 = r22;
        r11.addRequestProperty(r12, r15);	 Catch:{ all -> 0x018b }
        goto L_0x0067;
    L_0x0065:
        r15 = r22;
    L_0x0067:
        r12 = r1.zzcoa;	 Catch:{ all -> 0x018b }
        r16 = android.text.TextUtils.isEmpty(r12);	 Catch:{ all -> 0x018b }
        if (r16 != 0) goto L_0x0079;
    L_0x006f:
        r9 = "Sending webview cookie in ad request header.";
        com.google.android.gms.internal.hx.m19911b(r9);	 Catch:{ all -> 0x018b }
        r9 = "Cookie";
        r11.addRequestProperty(r9, r12);	 Catch:{ all -> 0x018b }
    L_0x0079:
        r9 = 1;
        if (r23 == 0) goto L_0x00af;
    L_0x007c:
        r3 = r23.m19548d();	 Catch:{ all -> 0x018b }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x018b }
        if (r3 != 0) goto L_0x00af;
    L_0x0086:
        r11.setDoOutput(r9);	 Catch:{ all -> 0x018b }
        r3 = r23.m19548d();	 Catch:{ all -> 0x018b }
        r3 = r3.getBytes();	 Catch:{ all -> 0x018b }
        r9 = r3.length;	 Catch:{ all -> 0x018b }
        r11.setFixedLengthStreamingMode(r9);	 Catch:{ all -> 0x018b }
        r9 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x00a8 }
        r13 = r11.getOutputStream();	 Catch:{ all -> 0x00a8 }
        r9.<init>(r13);	 Catch:{ all -> 0x00a8 }
        r9.write(r3);	 Catch:{ all -> 0x00a5 }
        com.google.android.gms.common.util.C2523h.a(r9);	 Catch:{ all -> 0x018b }
        goto L_0x00b0;
    L_0x00a5:
        r0 = move-exception;
        r1 = r0;
        goto L_0x00ab;
    L_0x00a8:
        r0 = move-exception;
        r1 = r0;
        r9 = 0;
    L_0x00ab:
        com.google.android.gms.common.util.C2523h.a(r9);	 Catch:{ all -> 0x018b }
        throw r1;	 Catch:{ all -> 0x018b }
    L_0x00af:
        r3 = 0;
    L_0x00b0:
        r9 = new com.google.android.gms.internal.hq;	 Catch:{ all -> 0x018b }
        r13 = r1.zzcnq;	 Catch:{ all -> 0x018b }
        r9.<init>(r13);	 Catch:{ all -> 0x018b }
        r9.m19905a(r11, r3);	 Catch:{ all -> 0x018b }
        r3 = r11.getResponseCode();	 Catch:{ all -> 0x018b }
        r13 = r11.getHeaderFields();	 Catch:{ all -> 0x018b }
        r9.m19904a(r11, r3);	 Catch:{ all -> 0x018b }
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r14 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r3 < r1) goto L_0x010e;
    L_0x00cb:
        if (r3 >= r14) goto L_0x010e;
    L_0x00cd:
        r1 = r6.toString();	 Catch:{ all -> 0x018b }
        r6 = new java.io.InputStreamReader;	 Catch:{ all -> 0x0107 }
        r10 = r11.getInputStream();	 Catch:{ all -> 0x0107 }
        r6.<init>(r10);	 Catch:{ all -> 0x0107 }
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ all -> 0x0104 }
        r10 = com.google.android.gms.internal.fk.m19689a(r6);	 Catch:{ all -> 0x0104 }
        com.google.android.gms.common.util.C2523h.a(r6);	 Catch:{ all -> 0x018b }
        r9.m19902a(r10);	 Catch:{ all -> 0x018b }
        m31498a(r1, r13, r10, r3);	 Catch:{ all -> 0x018b }
        r5.m19540a(r1, r13, r10);	 Catch:{ all -> 0x018b }
        if (r2 == 0) goto L_0x00f8;
    L_0x00ef:
        r1 = "ufe";
        r1 = new java.lang.String[]{r1};	 Catch:{ all -> 0x018b }
        r2.m19367a(r4, r1);	 Catch:{ all -> 0x018b }
    L_0x00f8:
        r1 = r23.m19554j();	 Catch:{ all -> 0x018b }
        r1 = r5.m19539a(r7, r1);	 Catch:{ all -> 0x018b }
        r11.disconnect();	 Catch:{ IOException -> 0x0191 }
        return r1;
    L_0x0104:
        r0 = move-exception;
        r1 = r0;
        goto L_0x010a;
    L_0x0107:
        r0 = move-exception;
        r1 = r0;
        r6 = 0;
    L_0x010a:
        com.google.android.gms.common.util.C2523h.a(r6);	 Catch:{ all -> 0x018b }
        throw r1;	 Catch:{ all -> 0x018b }
    L_0x010e:
        r1 = r6.toString();	 Catch:{ all -> 0x018b }
        r6 = 0;
        m31498a(r1, r13, r6, r3);	 Catch:{ all -> 0x018b }
        if (r3 < r14) goto L_0x016b;
    L_0x0118:
        r1 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r3 >= r1) goto L_0x016b;
    L_0x011c:
        r1 = "Location";
        r1 = r11.getHeaderField(r1);	 Catch:{ all -> 0x018b }
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x018b }
        if (r3 == 0) goto L_0x0137;
    L_0x0128:
        r1 = "No location header to follow redirect.";
        com.google.android.gms.internal.hx.m19916e(r1);	 Catch:{ all -> 0x018b }
        r1 = new com.google.android.gms.internal.zzaax;	 Catch:{ all -> 0x018b }
        r2 = 0;
        r1.<init>(r2);	 Catch:{ all -> 0x018b }
        r11.disconnect();	 Catch:{ IOException -> 0x0191 }
        return r1;
    L_0x0137:
        r3 = new java.net.URL;	 Catch:{ all -> 0x018b }
        r3.<init>(r1);	 Catch:{ all -> 0x018b }
        r1 = 1;
        r10 = r10 + r1;
        r1 = com.google.android.gms.internal.alo.cL;	 Catch:{ all -> 0x018b }
        r9 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x018b }
        r1 = r9.m19334a(r1);	 Catch:{ all -> 0x018b }
        r1 = (java.lang.Integer) r1;	 Catch:{ all -> 0x018b }
        r1 = r1.intValue();	 Catch:{ all -> 0x018b }
        if (r10 <= r1) goto L_0x015f;
    L_0x0150:
        r1 = "Too many redirects.";
        com.google.android.gms.internal.hx.m19916e(r1);	 Catch:{ all -> 0x018b }
        r1 = new com.google.android.gms.internal.zzaax;	 Catch:{ all -> 0x018b }
        r2 = 0;
        r1.<init>(r2);	 Catch:{ all -> 0x018b }
        r11.disconnect();	 Catch:{ IOException -> 0x0191 }
        return r1;
    L_0x015f:
        r5.m19541a(r13);	 Catch:{ all -> 0x018b }
        r11.disconnect();	 Catch:{ IOException -> 0x0191 }
        r6 = r3;
        r1 = r18;
        r9 = 0;
        goto L_0x0040;
    L_0x016b:
        r1 = 46;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x018b }
        r2.<init>(r1);	 Catch:{ all -> 0x018b }
        r1 = "Received error HTTP response code: ";
        r2.append(r1);	 Catch:{ all -> 0x018b }
        r2.append(r3);	 Catch:{ all -> 0x018b }
        r1 = r2.toString();	 Catch:{ all -> 0x018b }
        com.google.android.gms.internal.hx.m19916e(r1);	 Catch:{ all -> 0x018b }
        r1 = new com.google.android.gms.internal.zzaax;	 Catch:{ all -> 0x018b }
        r2 = 0;
        r1.<init>(r2);	 Catch:{ all -> 0x018b }
        r11.disconnect();	 Catch:{ IOException -> 0x0191 }
        return r1;
    L_0x018b:
        r0 = move-exception;
        r1 = r0;
        r11.disconnect();	 Catch:{ IOException -> 0x0191 }
        throw r1;	 Catch:{ IOException -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        r1 = r0;
        r2 = "Error while connecting to ad server: ";
        r1 = r1.getMessage();
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x01a8;
    L_0x01a3:
        r1 = r2.concat(r1);
        goto L_0x01ad;
    L_0x01a8:
        r1 = new java.lang.String;
        r1.<init>(r2);
    L_0x01ad:
        com.google.android.gms.internal.hx.m19916e(r1);
        r1 = new com.google.android.gms.internal.zzaax;
        r2 = 2;
        r1.<init>(r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aq.a(com.google.android.gms.internal.zzaat, android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ba, com.google.android.gms.internal.amb, com.google.android.gms.internal.ap):com.google.android.gms.internal.zzaax");
    }

    /* renamed from: a */
    private static void m31498a(String str, Map<String, List<String>> map, String str2, int i) {
        if (hx.m19910a(2)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 39);
            stringBuilder.append("Http Response: {\n  URL:\n    ");
            stringBuilder.append(str);
            stringBuilder.append("\n  Headers:");
            ec.m27332a(stringBuilder.toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    stringBuilder2.append("    ");
                    stringBuilder2.append(str3);
                    stringBuilder2.append(":");
                    ec.m27332a(stringBuilder2.toString());
                    for (String valueOf : (List) map.get(str3)) {
                        String str4 = "      ";
                        String valueOf2 = String.valueOf(valueOf2);
                        ec.m27332a(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
                    }
                }
            }
            ec.m27332a("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + AdError.NETWORK_ERROR_CODE;
                    ec.m27332a(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                ec.m27332a("    null");
            }
            StringBuilder stringBuilder3 = new StringBuilder(34);
            stringBuilder3.append("  Response Code:\n    ");
            stringBuilder3.append(i);
            stringBuilder3.append("\n}");
            ec.m27332a(stringBuilder3.toString());
        }
    }

    public final void zza(zzaat zzaat, zzabe zzabe) {
        ar.i().m27292a(this.f26774c, zzaat.zzaty);
        Future a = fe.m19676a(new as(this, zzaat, zzabe));
        ar.s().m19836a();
        ar.s().m19837b().postDelayed(new at(this, a), 60000);
    }

    public final void zza(zzabm zzabm, zzabh zzabh) {
        ec.m27332a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    public final zzaax zzb(zzaat zzaat) {
        return m31495a(this.f26774c, this.f26775d, zzaat, this.f26776e);
    }
}
