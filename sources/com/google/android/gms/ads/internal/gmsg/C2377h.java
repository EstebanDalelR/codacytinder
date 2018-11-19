package com.google.android.gms.ads.internal.gmsg;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.hd;
import com.google.android.gms.internal.ki;
import com.google.android.gms.internal.kj;
import com.google.android.gms.internal.zzamp;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzaog;
import com.google.android.gms.internal.zzaox;
import com.google.android.gms.internal.zzzv;
import java.util.HashMap;
import java.util.Map;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.gmsg.h */
public final class C2377h {
    /* renamed from: a */
    public static final zzt<zzanh> f7241a = C3743i.f11802a;
    /* renamed from: b */
    public static final zzt<zzanh> f7242b = C3744j.f11803a;
    /* renamed from: c */
    public static final zzt<zzanh> f7243c = C3745k.f11804a;
    /* renamed from: d */
    public static final zzt<zzanh> f7244d = new C3750p();
    /* renamed from: e */
    public static final zzt<zzanh> f7245e = new C3751q();
    /* renamed from: f */
    public static final zzt<zzanh> f7246f = C3746l.f11805a;
    /* renamed from: g */
    public static final zzt<Object> f7247g = new C3752r();
    /* renamed from: h */
    public static final zzt<zzanh> f7248h = new C3753s();
    /* renamed from: i */
    public static final zzt<zzanh> f7249i = C3747m.f11806a;
    /* renamed from: j */
    public static final zzt<zzanh> f7250j = new C3754t();
    /* renamed from: k */
    public static final zzt<zzanh> f7251k = new C3755u();
    /* renamed from: l */
    public static final zzt<zzamp> f7252l = new ki();
    /* renamed from: m */
    public static final zzt<zzamp> f7253m = new kj();
    /* renamed from: n */
    public static final zzt<zzanh> f7254n = new C3742g();
    /* renamed from: o */
    public static final C3740e f7255o = new C3740e();
    /* renamed from: p */
    public static final zzt<zzanh> f7256p = new C3756v();
    /* renamed from: q */
    public static final zzt<zzanh> f7257q = new C3757w();
    /* renamed from: r */
    public static final zzt<zzanh> f7258r = new C3749o();
    /* renamed from: s */
    private static zzt<Object> f7259s = new C3748n();

    /* renamed from: a */
    static final /* synthetic */ void m8712a(com.google.android.gms.ads.internal.js.zza r5, java.util.Map r6) {
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
        r0 = "u";
        r6 = r6.get(r0);
        r6 = (java.lang.String) r6;
        if (r6 != 0) goto L_0x0010;
    L_0x000a:
        r5 = "URL missing from click GMSG.";
        com.google.android.gms.internal.ec.e(r5);
        return;
    L_0x0010:
        r0 = android.net.Uri.parse(r6);
        r1 = r5;	 Catch:{ zzcw -> 0x0040 }
        r1 = (com.google.android.gms.internal.zzaow) r1;	 Catch:{ zzcw -> 0x0040 }
        r1 = r1.zztb();	 Catch:{ zzcw -> 0x0040 }
        if (r1 == 0) goto L_0x0059;	 Catch:{ zzcw -> 0x0040 }
    L_0x001d:
        r2 = r1.a(r0);	 Catch:{ zzcw -> 0x0040 }
        if (r2 == 0) goto L_0x0059;	 Catch:{ zzcw -> 0x0040 }
    L_0x0023:
        r2 = r5;	 Catch:{ zzcw -> 0x0040 }
        r2 = (com.google.android.gms.internal.zzaog) r2;	 Catch:{ zzcw -> 0x0040 }
        r2 = r2.getContext();	 Catch:{ zzcw -> 0x0040 }
        r3 = r5;	 Catch:{ zzcw -> 0x0040 }
        r3 = (com.google.android.gms.internal.zzaoy) r3;	 Catch:{ zzcw -> 0x0040 }
        if (r3 != 0) goto L_0x0031;	 Catch:{ zzcw -> 0x0040 }
    L_0x002f:
        r1 = 0;	 Catch:{ zzcw -> 0x0040 }
        throw r1;	 Catch:{ zzcw -> 0x0040 }
    L_0x0031:
        r3 = (android.view.View) r3;	 Catch:{ zzcw -> 0x0040 }
        r4 = r5;	 Catch:{ zzcw -> 0x0040 }
        r4 = (com.google.android.gms.internal.zzaog) r4;	 Catch:{ zzcw -> 0x0040 }
        r4 = r4.zzsi();	 Catch:{ zzcw -> 0x0040 }
        r1 = r1.a(r0, r2, r3, r4);	 Catch:{ zzcw -> 0x0040 }
        r0 = r1;
        goto L_0x0059;
    L_0x0040:
        r1 = "Unable to append parameter to URL: ";
        r6 = java.lang.String.valueOf(r6);
        r2 = r6.length();
        if (r2 == 0) goto L_0x0051;
    L_0x004c:
        r6 = r1.concat(r6);
        goto L_0x0056;
    L_0x0051:
        r6 = new java.lang.String;
        r6.<init>(r1);
    L_0x0056:
        com.google.android.gms.internal.ec.e(r6);
    L_0x0059:
        r6 = com.google.android.gms.ads.internal.ar.m8669z();
        r1 = r5;
        r1 = (com.google.android.gms.internal.zzaog) r1;
        r2 = r1.getContext();
        r3 = com.google.android.gms.internal.alo.am;
        r4 = com.google.android.gms.internal.aja.f();
        r3 = r4.a(r3);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x007e;
    L_0x0076:
        r6 = r6.a(r2);
        if (r6 == 0) goto L_0x007e;
    L_0x007c:
        r6 = 1;
        goto L_0x007f;
    L_0x007e:
        r6 = 0;
    L_0x007f:
        if (r6 == 0) goto L_0x00b1;
    L_0x0081:
        r6 = "fbs_aeid";
        r6 = r0.getQueryParameter(r6);
        r6 = android.text.TextUtils.isEmpty(r6);
        if (r6 == 0) goto L_0x00b1;
    L_0x008d:
        r6 = com.google.android.gms.ads.internal.ar.m8669z();
        r2 = r1.getContext();
        r6 = r6.i(r2);
        com.google.android.gms.ads.internal.ar.m8648e();
        r2 = "fbs_aeid";
        r0 = r0.toString();
        r0 = com.google.android.gms.internal.fk.a(r0, r2, r6);
        r2 = com.google.android.gms.ads.internal.ar.m8669z();
        r3 = r1.getContext();
        r2.d(r3, r6);
    L_0x00b1:
        r6 = r0.toString();
        r0 = new com.google.android.gms.internal.hd;
        r1 = r1.getContext();
        r5 = (com.google.android.gms.internal.zzaox) r5;
        r5 = r5.zzsk();
        r5 = r5.zzcv;
        r0.<init>(r1, r5, r6);
        r0.e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.h.a(com.google.android.gms.ads.internal.js.zza, java.util.Map):void");
    }

    /* renamed from: a */
    static final /* synthetic */ void m8713a(zzaog zzaog, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            ec.e("URL missing from httpTrack GMSG.");
        } else {
            new hd(zzaog.getContext(), ((zzaox) zzaog).zzsk().zzcv, str).e();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m8714a(com.google.android.gms.internal.zzaow r3, java.util.Map r4) {
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
        r0 = "tx";
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r1 = "ty";
        r1 = r4.get(r1);
        r1 = (java.lang.String) r1;
        r2 = "td";
        r4 = r4.get(r2);
        r4 = (java.lang.String) r4;
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0032 }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0032 }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0032 }
        r3 = r3.zztb();	 Catch:{ NumberFormatException -> 0x0032 }
        if (r3 == 0) goto L_0x0031;	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x002a:
        r3 = r3.a();	 Catch:{ NumberFormatException -> 0x0032 }
        r3.zza(r0, r1, r4);	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x0031:
        return;
    L_0x0032:
        r3 = "Could not parse touch parameters from gmsg.";
        com.google.android.gms.internal.ec.e(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.h.a(com.google.android.gms.internal.zzaow, java.util.Map):void");
    }

    /* renamed from: b */
    static final /* synthetic */ void m8715b(com.google.android.gms.internal.zzaog r17, java.util.Map r18) {
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
        r2 = r17.getContext();
        r2 = r2.getPackageManager();
        r3 = "data";
        r4 = r18;
        r3 = r4.get(r3);
        r3 = (java.lang.String) r3;
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x010a }
        r4.<init>(r3);	 Catch:{ JSONException -> 0x010a }
        r3 = "intents";	 Catch:{ JSONException -> 0x00fb }
        r3 = r4.getJSONArray(r3);	 Catch:{ JSONException -> 0x00fb }
        r4 = new org.json.JSONObject;
        r4.<init>();
        r5 = 0;
        r6 = 0;
    L_0x0024:
        r7 = r3.length();
        if (r6 >= r7) goto L_0x00f1;
    L_0x002a:
        r7 = r3.getJSONObject(r6);	 Catch:{ JSONException -> 0x00e7 }
        r8 = "id";
        r8 = r7.optString(r8);
        r9 = "u";
        r9 = r7.optString(r9);
        r10 = "i";
        r10 = r7.optString(r10);
        r11 = "m";
        r11 = r7.optString(r11);
        r12 = "p";
        r12 = r7.optString(r12);
        r13 = "c";
        r13 = r7.optString(r13);
        r14 = "f";
        r7.optString(r14);
        r14 = "e";
        r7.optString(r14);
        r14 = "intent_url";
        r7 = r7.optString(r14);
        r14 = 0;
        r15 = android.text.TextUtils.isEmpty(r7);
        if (r15 != 0) goto L_0x0089;
    L_0x0069:
        r15 = android.content.Intent.parseUri(r7, r5);	 Catch:{ URISyntaxException -> 0x006f }
        r14 = r15;
        goto L_0x0089;
    L_0x006f:
        r0 = move-exception;
        r15 = "Error parsing the url: ";
        r7 = java.lang.String.valueOf(r7);
        r16 = r7.length();
        if (r16 == 0) goto L_0x0081;
    L_0x007c:
        r7 = r15.concat(r7);
        goto L_0x0086;
    L_0x0081:
        r7 = new java.lang.String;
        r7.<init>(r15);
    L_0x0086:
        com.google.android.gms.internal.ec.b(r7, r0);
    L_0x0089:
        r7 = 1;
        if (r14 != 0) goto L_0x00d5;
    L_0x008c:
        r14 = new android.content.Intent;
        r14.<init>();
        r15 = android.text.TextUtils.isEmpty(r9);
        if (r15 != 0) goto L_0x009e;
    L_0x0097:
        r9 = android.net.Uri.parse(r9);
        r14.setData(r9);
    L_0x009e:
        r9 = android.text.TextUtils.isEmpty(r10);
        if (r9 != 0) goto L_0x00a7;
    L_0x00a4:
        r14.setAction(r10);
    L_0x00a7:
        r9 = android.text.TextUtils.isEmpty(r11);
        if (r9 != 0) goto L_0x00b0;
    L_0x00ad:
        r14.setType(r11);
    L_0x00b0:
        r9 = android.text.TextUtils.isEmpty(r12);
        if (r9 != 0) goto L_0x00b9;
    L_0x00b6:
        r14.setPackage(r12);
    L_0x00b9:
        r9 = android.text.TextUtils.isEmpty(r13);
        if (r9 != 0) goto L_0x00d5;
    L_0x00bf:
        r9 = "/";
        r10 = 2;
        r9 = r13.split(r9, r10);
        r11 = r9.length;
        if (r11 != r10) goto L_0x00d5;
    L_0x00c9:
        r10 = new android.content.ComponentName;
        r11 = r9[r5];
        r9 = r9[r7];
        r10.<init>(r11, r9);
        r14.setComponent(r10);
    L_0x00d5:
        r9 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r9 = r2.resolveActivity(r14, r9);
        if (r9 == 0) goto L_0x00de;
    L_0x00dd:
        goto L_0x00df;
    L_0x00de:
        r7 = 0;
    L_0x00df:
        r4.put(r8, r7);	 Catch:{ JSONException -> 0x00e3 }
        goto L_0x00ed;
    L_0x00e3:
        r0 = move-exception;
        r7 = "Error constructing openable urls response.";
        goto L_0x00ea;
    L_0x00e7:
        r0 = move-exception;
        r7 = "Error parsing the intent data.";
    L_0x00ea:
        com.google.android.gms.internal.ec.b(r7, r0);
    L_0x00ed:
        r6 = r6 + 1;
        goto L_0x0024;
    L_0x00f1:
        r1 = r17;
        r1 = (com.google.android.gms.ads.internal.js.zza) r1;
        r2 = "openableIntents";
        r1.zza(r2, r4);
        return;
    L_0x00fb:
        r1 = r17;
        r1 = (com.google.android.gms.ads.internal.js.zza) r1;
        r2 = "openableIntents";
        r3 = new org.json.JSONObject;
        r3.<init>();
        r1.zza(r2, r3);
        return;
    L_0x010a:
        r1 = r17;
        r1 = (com.google.android.gms.ads.internal.js.zza) r1;
        r2 = "openableIntents";
        r3 = new org.json.JSONObject;
        r3.<init>();
        r1.zza(r2, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.h.b(com.google.android.gms.internal.zzaog, java.util.Map):void");
    }

    /* renamed from: c */
    static final /* synthetic */ void m8716c(zzaog zzaog, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            ec.e("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        Map hashMap = new HashMap();
        PackageManager packageManager = zzaog.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zza) zzaog).zza("openableURLs", hashMap);
    }
}
