package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

@zzzv
public final class aqo {
    /* renamed from: a */
    private final Map<aqp, aqq> f15584a = new HashMap();
    /* renamed from: b */
    private final LinkedList<aqp> f15585b = new LinkedList();
    @Nullable
    /* renamed from: c */
    private apk f15586c;

    /* renamed from: a */
    static Set<String> m19411a(zzjj zzjj) {
        Set<String> hashSet = new HashSet();
        hashSet.addAll(zzjj.extras.keySet());
        Bundle bundle = zzjj.zzbdp.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    /* renamed from: a */
    private static void m19412a(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    private static void m19413a(String str, aqp aqp) {
        if (hx.m19910a(2)) {
            ec.m27332a(String.format(str, new Object[]{aqp}));
        }
    }

    /* renamed from: a */
    private static java.lang.String[] m19414a(java.lang.String r5) {
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
        r0 = 0;
        r1 = "\u0000";	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r5 = r5.split(r1);	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r1 = 0;	 Catch:{ UnsupportedEncodingException -> 0x001e }
    L_0x0008:
        r2 = r5.length;	 Catch:{ UnsupportedEncodingException -> 0x001e }
        if (r1 >= r2) goto L_0x001d;	 Catch:{ UnsupportedEncodingException -> 0x001e }
    L_0x000b:
        r2 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r3 = r5[r1];	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r3 = android.util.Base64.decode(r3, r0);	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r4 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r2.<init>(r3, r4);	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r5[r1] = r2;	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r1 = r1 + 1;
        goto L_0x0008;
    L_0x001d:
        return r5;
    L_0x001e:
        r5 = new java.lang.String[r0];
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aqo.a(java.lang.String):java.lang.String[]");
    }

    /* renamed from: b */
    static zzjj m19415b(zzjj zzjj) {
        zzjj = m19420d(zzjj);
        String str = "_skipMediation";
        Bundle bundle = zzjj.zzbdp.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean(str, true);
        }
        zzjj.extras.putBoolean(str, true);
        return zzjj;
    }

    /* renamed from: b */
    private final java.lang.String m19416b() {
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
        r4 = this;
        r0 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r0.<init>();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r1 = r4.f15585b;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r1 = r1.iterator();	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x000b:
        r2 = r1.hasNext();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        if (r2 == 0) goto L_0x0035;	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x0011:
        r2 = r1.next();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = (com.google.android.gms.internal.aqp) r2;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = r2.toString();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r3 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = r2.getBytes(r3);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r3 = 0;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = android.util.Base64.encodeToString(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r0.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = r1.hasNext();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        if (r2 == 0) goto L_0x000b;	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x002f:
        r2 = "\u0000";	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r0.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        goto L_0x000b;	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x0035:
        r0 = r0.toString();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        return r0;
    L_0x003a:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aqo.b():java.lang.String");
    }

    /* renamed from: b */
    private static boolean m19417b(String str) {
        try {
            return Pattern.matches((String) aja.m19221f().m19334a(alo.aM), str);
        } catch (Throwable e) {
            ar.i().m27296a(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    /* renamed from: c */
    private static zzjj m19418c(zzjj zzjj) {
        zzjj = m19420d(zzjj);
        for (String str : ((String) aja.m19221f().m19334a(alo.aI)).split(",")) {
            m19412a(zzjj.zzbdp, str);
            String str2 = "com.google.ads.mediation.admob.AdMobAdapter/";
            if (str.startsWith(str2)) {
                m19412a(zzjj.extras, str.replaceFirst(str2, ""));
            }
        }
        return zzjj;
    }

    /* renamed from: c */
    private static java.lang.String m19419c(java.lang.String r2) {
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
        r0 = "([^/]+/[0-9]+).*";	 Catch:{ RuntimeException -> 0x0016 }
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ RuntimeException -> 0x0016 }
        r0 = r0.matcher(r2);	 Catch:{ RuntimeException -> 0x0016 }
        r1 = r0.matches();	 Catch:{ RuntimeException -> 0x0016 }
        if (r1 == 0) goto L_0x0016;	 Catch:{ RuntimeException -> 0x0016 }
    L_0x0010:
        r1 = 1;	 Catch:{ RuntimeException -> 0x0016 }
        r0 = r0.group(r1);	 Catch:{ RuntimeException -> 0x0016 }
        return r0;
    L_0x0016:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aqo.c(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    private static zzjj m19420d(zzjj zzjj) {
        Parcel obtain = Parcel.obtain();
        zzjj.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzjj = (zzjj) zzjj.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        if (((Boolean) aja.m19221f().m19334a(alo.aB)).booleanValue()) {
            zzjj.zzh(zzjj);
        }
        return zzjj;
    }

    @Nullable
    /* renamed from: a */
    final aqr m19421a(zzjj zzjj, String str) {
        if (m19417b(str)) {
            return null;
        }
        int i = new bc(this.f15586c.m19401a()).m19561a().f15858n;
        zzjj = m19418c(zzjj);
        str = m19419c(str);
        aqp aqp = new aqp(zzjj, str, i);
        aqq aqq = (aqq) this.f15584a.get(aqp);
        if (aqq == null) {
            m19413a("Interstitial pool created at %s.", aqp);
            aqq = new aqq(zzjj, str, i);
            this.f15584a.put(aqp, aqq);
        }
        this.f15585b.remove(aqp);
        this.f15585b.add(aqp);
        aqq.m19436g();
        while (true) {
            if (this.f15585b.size() <= ((Integer) aja.m19221f().m19334a(alo.aJ)).intValue()) {
                break;
            }
            aqp aqp2 = (aqp) this.f15585b.remove();
            aqq aqq2 = (aqq) this.f15584a.get(aqp2);
            m19413a("Evicting interstitial queue for %s.", aqp2);
            while (aqq2.m19433d() > 0) {
                aqr a = aqq2.m19427a(null);
                if (a.f15597e) {
                    aqs.m19439a().m19442c();
                }
                a.f15593a.h();
            }
            this.f15584a.remove(aqp2);
        }
        while (aqq.m19433d() > 0) {
            aqr a2 = aqq.m19427a(zzjj);
            if (a2.f15597e) {
                if (ar.k().currentTimeMillis() - a2.f15596d > ((long) ((Integer) aja.m19221f().m19334a(alo.aL)).intValue()) * 1000) {
                    m19413a("Expired interstitial at %s.", aqp);
                    aqs.m19439a().m19441b();
                }
            }
            String str2 = a2.f15594b != null ? " (inline) " : " ";
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 34);
            stringBuilder.append("Pooled interstitial");
            stringBuilder.append(str2);
            stringBuilder.append("returned at %s.");
            m19413a(stringBuilder.toString(), aqp);
            return a2;
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final void m19422a() {
        /*
        r9 = this;
        r0 = r9.f15586c;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r9.f15584a;
        r0 = r0.entrySet();
        r0 = r0.iterator();
    L_0x000f:
        r1 = r0.hasNext();
        r2 = 0;
        if (r1 == 0) goto L_0x0089;
    L_0x0016:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r3 = r1.getKey();
        r3 = (com.google.android.gms.internal.aqp) r3;
        r1 = r1.getValue();
        r1 = (com.google.android.gms.internal.aqq) r1;
        r4 = 2;
        r5 = com.google.android.gms.internal.hx.m19910a(r4);
        if (r5 == 0) goto L_0x0056;
    L_0x002f:
        r5 = r1.m19433d();
        r6 = r1.m19434e();
        if (r6 >= r5) goto L_0x0056;
    L_0x0039:
        r7 = "Loading %s/%s pooled interstitials for %s.";
        r8 = 3;
        r8 = new java.lang.Object[r8];
        r6 = r5 - r6;
        r6 = java.lang.Integer.valueOf(r6);
        r8[r2] = r6;
        r5 = java.lang.Integer.valueOf(r5);
        r6 = 1;
        r8[r6] = r5;
        r8[r4] = r3;
        r4 = java.lang.String.format(r7, r8);
        com.google.android.gms.internal.ec.m27332a(r4);
    L_0x0056:
        r4 = r1.m19435f();
        r4 = r4 + r2;
    L_0x005b:
        r2 = r1.m19433d();
        r5 = com.google.android.gms.internal.alo.aK;
        r6 = com.google.android.gms.internal.aja.m19221f();
        r5 = r6.m19334a(r5);
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        if (r2 >= r5) goto L_0x0081;
    L_0x0071:
        r2 = "Pooling and loading one new interstitial for %s.";
        m19413a(r2, r3);
        r2 = r9.f15586c;
        r2 = r1.m19430a(r2);
        if (r2 == 0) goto L_0x005b;
    L_0x007e:
        r4 = r4 + 1;
        goto L_0x005b;
    L_0x0081:
        r1 = com.google.android.gms.internal.aqs.m19439a();
        r1.m19440a(r4);
        goto L_0x000f;
    L_0x0089:
        r0 = r9.f15586c;
        if (r0 == 0) goto L_0x00ea;
    L_0x008d:
        r0 = r9.f15586c;
        r0 = r0.m19401a();
        r1 = "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool";
        r0 = r0.getSharedPreferences(r1, r2);
        r0 = r0.edit();
        r0.clear();
        r1 = r9.f15584a;
        r1 = r1.entrySet();
        r1 = r1.iterator();
    L_0x00aa:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00de;
    L_0x00b0:
        r2 = r1.next();
        r2 = (java.util.Map.Entry) r2;
        r3 = r2.getKey();
        r3 = (com.google.android.gms.internal.aqp) r3;
        r2 = r2.getValue();
        r2 = (com.google.android.gms.internal.aqq) r2;
        r4 = r2.m19437h();
        if (r4 == 0) goto L_0x00aa;
    L_0x00c8:
        r4 = new com.google.android.gms.internal.aqu;
        r4.<init>(r2);
        r2 = r4.m19451a();
        r4 = r3.toString();
        r0.putString(r4, r2);
        r2 = "Saved interstitial queue for %s.";
        m19413a(r2, r3);
        goto L_0x00aa;
    L_0x00de:
        r1 = "PoolKeys";
        r2 = r9.m19416b();
        r0.putString(r1, r2);
        r0.apply();
    L_0x00ea:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aqo.a():void");
    }

    /* renamed from: a */
    final void m19423a(apk apk) {
        if (this.f15586c == null) {
            this.f15586c = apk.m19404b();
            if (this.f15586c != null) {
                int i = 0;
                SharedPreferences sharedPreferences = this.f15586c.m19401a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.f15585b.size() > 0) {
                    aqp aqp = (aqp) this.f15585b.remove();
                    aqq aqq = (aqq) this.f15584a.get(aqp);
                    m19413a("Flushing interstitial queue for %s.", aqp);
                    while (aqq.m19433d() > 0) {
                        aqq.m19427a(null).f15593a.h();
                    }
                    this.f15584a.remove(aqp);
                }
                try {
                    Map hashMap = new HashMap();
                    for (Entry entry : sharedPreferences.getAll().entrySet()) {
                        if (!((String) entry.getKey()).equals("PoolKeys")) {
                            aqu a = aqu.m19450a((String) entry.getValue());
                            aqp aqp2 = new aqp(a.f15606a, a.f15607b, a.f15608c);
                            if (!this.f15584a.containsKey(aqp2)) {
                                this.f15584a.put(aqp2, new aqq(a.f15606a, a.f15607b, a.f15608c));
                                hashMap.put(aqp2.toString(), aqp2);
                                m19413a("Restored interstitial queue for %s.", aqp2);
                            }
                        }
                    }
                    String[] a2 = m19414a(sharedPreferences.getString("PoolKeys", ""));
                    int length = a2.length;
                    while (i < length) {
                        aqp aqp3 = (aqp) hashMap.get(a2[i]);
                        if (this.f15584a.containsKey(aqp3)) {
                            this.f15585b.add(aqp3);
                        }
                        i++;
                    }
                } catch (Throwable e) {
                    ar.i().m27296a(e, "InterstitialAdPool.restore");
                    hx.m19914c("Malformed preferences value for InterstitialAdPool.", e);
                    this.f15584a.clear();
                    this.f15585b.clear();
                }
            }
        }
    }

    /* renamed from: b */
    final void m19424b(zzjj zzjj, String str) {
        if (this.f15586c != null) {
            int i = new bc(this.f15586c.m19401a()).m19561a().f15858n;
            zzjj c = m19418c(zzjj);
            str = m19419c(str);
            aqp aqp = new aqp(c, str, i);
            aqq aqq = (aqq) this.f15584a.get(aqp);
            if (aqq == null) {
                m19413a("Interstitial pool created at %s.", aqp);
                aqq = new aqq(c, str, i);
                this.f15584a.put(aqp, aqq);
            }
            aqq.m19429a(this.f15586c, zzjj);
            aqq.m19436g();
            m19413a("Inline entry added to the queue at %s.", aqp);
        }
    }
}
