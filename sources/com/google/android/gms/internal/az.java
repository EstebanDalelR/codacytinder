package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@zzzv
public final class az {
    /* renamed from: A */
    private zzaaz f15796A;
    /* renamed from: B */
    private boolean f15797B = false;
    /* renamed from: C */
    private String f15798C;
    /* renamed from: D */
    private List<String> f15799D;
    /* renamed from: E */
    private boolean f15800E;
    /* renamed from: F */
    private String f15801F;
    /* renamed from: G */
    private zzaey f15802G;
    /* renamed from: H */
    private boolean f15803H;
    /* renamed from: I */
    private boolean f15804I;
    /* renamed from: J */
    private final zzaat f15805J;
    /* renamed from: a */
    private String f15806a;
    /* renamed from: b */
    private String f15807b;
    /* renamed from: c */
    private String f15808c;
    /* renamed from: d */
    private List<String> f15809d;
    /* renamed from: e */
    private String f15810e;
    /* renamed from: f */
    private String f15811f;
    /* renamed from: g */
    private String f15812g;
    /* renamed from: h */
    private List<String> f15813h;
    /* renamed from: i */
    private long f15814i = -1;
    /* renamed from: j */
    private boolean f15815j = false;
    /* renamed from: k */
    private final long f15816k = -1;
    /* renamed from: l */
    private List<String> f15817l;
    /* renamed from: m */
    private long f15818m = -1;
    /* renamed from: n */
    private int f15819n = -1;
    /* renamed from: o */
    private boolean f15820o = false;
    /* renamed from: p */
    private boolean f15821p = false;
    /* renamed from: q */
    private boolean f15822q = false;
    /* renamed from: r */
    private boolean f15823r = true;
    /* renamed from: s */
    private boolean f15824s = true;
    /* renamed from: t */
    private String f15825t = "";
    /* renamed from: u */
    private boolean f15826u = false;
    /* renamed from: v */
    private boolean f15827v = false;
    /* renamed from: w */
    private zzaeq f15828w;
    /* renamed from: x */
    private List<String> f15829x;
    /* renamed from: y */
    private List<String> f15830y;
    /* renamed from: z */
    private boolean f15831z = false;

    public az(zzaat zzaat, String str) {
        this.f15807b = str;
        this.f15805J = zzaat;
    }

    /* renamed from: a */
    private static String m19535a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    /* renamed from: b */
    private static long m19536b(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2, java.lang.String r3) {
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
        r2 = r2.get(r3);
        r2 = (java.util.List) r2;
        if (r2 == 0) goto L_0x004e;
    L_0x0008:
        r0 = r2.isEmpty();
        if (r0 != 0) goto L_0x004e;
    L_0x000e:
        r0 = 0;
        r2 = r2.get(r0);
        r2 = (java.lang.String) r2;
        r0 = java.lang.Float.parseFloat(r2);	 Catch:{ NumberFormatException -> 0x001f }
        r2 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r0 = r0 * r2;
        r2 = (long) r0;
        return r2;
    L_0x001f:
        r0 = java.lang.String.valueOf(r3);
        r0 = r0.length();
        r0 = r0 + 36;
        r1 = java.lang.String.valueOf(r2);
        r1 = r1.length();
        r0 = r0 + r1;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Could not parse float from ";
        r1.append(r0);
        r1.append(r3);
        r3 = " header: ";
        r1.append(r3);
        r1.append(r2);
        r2 = r1.toString();
        com.google.android.gms.internal.hx.m19916e(r2);
    L_0x004e:
        r2 = -1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.az.b(java.util.Map, java.lang.String):long");
    }

    /* renamed from: c */
    private static List<String> m19537c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m19538d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? false : Boolean.valueOf((String) list.get(0)).booleanValue();
    }

    /* renamed from: a */
    public final zzaax m19539a(long j, boolean z) {
        zzaat zzaat = this.f15805J;
        String str = this.f15807b;
        String str2 = this.f15808c;
        List list = this.f15809d;
        List list2 = this.f15813h;
        long j2 = this.f15814i;
        boolean z2 = this.f15815j;
        List list3 = this.f15817l;
        long j3 = this.f15818m;
        int i = this.f15819n;
        String str3 = this.f15806a;
        return new zzaax(zzaat, str, str2, list, list2, j2, z2, -1, list3, j3, i, str3, j, this.f15811f, this.f15812g, this.f15820o, this.f15821p, this.f15822q, this.f15823r, false, this.f15825t, this.f15826u, this.f15827v, this.f15828w, this.f15829x, this.f15830y, this.f15831z, this.f15796A, this.f15797B, this.f15798C, this.f15799D, this.f15800E, this.f15801F, this.f15802G, this.f15810e, this.f15824s, this.f15803H, this.f15804I, z ? 2 : 1);
    }

    /* renamed from: a */
    public final void m19540a(String str, Map<String, List<String>> map, String str2) {
        this.f15808c = str2;
        m19541a(map);
    }

    /* renamed from: a */
    public final void m19541a(Map<String, List<String>> map) {
        String str;
        this.f15806a = m19535a((Map) map, "X-Afma-Ad-Size");
        this.f15801F = m19535a((Map) map, "X-Afma-Ad-Slot-Size");
        List c = m19537c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f15809d = c;
        }
        this.f15810e = m19535a((Map) map, "X-Afma-Debug-Signals");
        c = (List) map.get("X-Afma-Debug-Dialog");
        if (!(c == null || c.isEmpty())) {
            this.f15811f = (String) c.get(0);
        }
        c = m19537c(map, "X-Afma-Tracking-Urls");
        if (c != null) {
            this.f15813h = c;
        }
        long b = m19536b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f15814i = b;
        }
        this.f15815j |= m19538d(map, "X-Afma-Mediation");
        c = m19537c(map, "X-Afma-Manual-Tracking-Urls");
        if (c != null) {
            this.f15817l = c;
        }
        b = m19536b(map, "X-Afma-Refresh-Rate");
        if (b != -1) {
            this.f15818m = b;
        }
        c = (List) map.get("X-Afma-Orientation");
        if (!(c == null || c.isEmpty())) {
            int b2;
            str = (String) c.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                b2 = ar.g().mo4621b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                b2 = ar.g().mo4619a();
            }
            this.f15819n = b2;
        }
        this.f15812g = m19535a((Map) map, "X-Afma-ActiveView");
        c = (List) map.get("X-Afma-Use-HTTPS");
        if (!(c == null || c.isEmpty())) {
            this.f15822q = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        this.f15820o |= m19538d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f15821p = "native".equals(m19535a((Map) map, "X-Afma-Ad-Format"));
        c = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (!(c == null || c.isEmpty())) {
            this.f15823r = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        c = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (!(c == null || c.isEmpty())) {
            this.f15824s = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        c = (List) map.get("X-Afma-Gws-Query-Id");
        if (!(c == null || c.isEmpty())) {
            this.f15825t = (String) c.get(0);
        }
        str = m19535a((Map) map, "X-Afma-Fluid");
        if (str != null && str.equals("height")) {
            this.f15826u = true;
        }
        this.f15827v = "native_express".equals(m19535a((Map) map, "X-Afma-Ad-Format"));
        this.f15828w = zzaeq.zzbu(m19535a((Map) map, "X-Afma-Rewards"));
        if (this.f15829x == null) {
            this.f15829x = m19537c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f15830y == null) {
            this.f15830y = m19537c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f15831z |= m19538d(map, "X-Afma-Use-Displayed-Impression");
        this.f15797B |= m19538d(map, "X-Afma-Auto-Collect-Location");
        this.f15798C = m19535a((Map) map, "Set-Cookie");
        Object a = m19535a((Map) map, "X-Afma-Auto-Protection-Configuration");
        if (a != null) {
            if (!TextUtils.isEmpty(a)) {
                try {
                    this.f15796A = zzaaz.zzl(new JSONObject(a));
                } catch (Throwable e) {
                    hx.m19914c("Error parsing configuration JSON", e);
                    this.f15796A = new zzaaz();
                }
                c = m19537c(map, "X-Afma-Remote-Ping-Urls");
                if (c != null) {
                    this.f15799D = c;
                }
                a = m19535a((Map) map, "X-Afma-Safe-Browsing");
                if (!TextUtils.isEmpty(a)) {
                    try {
                        this.f15802G = zzaey.zzo(new JSONObject(a));
                    } catch (Throwable e2) {
                        hx.m19914c("Error parsing safe browsing header", e2);
                    }
                }
                this.f15800E |= m19538d(map, "X-Afma-Render-In-Browser");
                a = m19535a((Map) map, "X-Afma-Pool");
                if (!TextUtils.isEmpty(a)) {
                    try {
                        this.f15803H = new JSONObject(a).getBoolean("never_pool");
                    } catch (Throwable e22) {
                        hx.m19914c("Error parsing interstitial pool header", e22);
                    }
                }
                this.f15804I = m19538d(map, "X-Afma-Custom-Close-Blocked");
            }
        }
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
        buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
        if (!TextUtils.isEmpty(this.f15811f)) {
            buildUpon.appendQueryParameter("debugDialog", this.f15811f);
        }
        boolean booleanValue = ((Boolean) aja.m19221f().m19334a(alo.f15454e)).booleanValue();
        String[] strArr = new String[1];
        str = buildUpon.toString();
        String str2 = "navigationURL";
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("&");
        stringBuilder.append(str2);
        stringBuilder.append("={NAVIGATION_URL}");
        strArr[0] = stringBuilder.toString();
        this.f15796A = new zzaaz(booleanValue, Arrays.asList(strArr));
        c = m19537c(map, "X-Afma-Remote-Ping-Urls");
        if (c != null) {
            this.f15799D = c;
        }
        a = m19535a((Map) map, "X-Afma-Safe-Browsing");
        if (TextUtils.isEmpty(a)) {
            this.f15802G = zzaey.zzo(new JSONObject(a));
        }
        this.f15800E |= m19538d(map, "X-Afma-Render-In-Browser");
        a = m19535a((Map) map, "X-Afma-Pool");
        if (TextUtils.isEmpty(a)) {
            this.f15803H = new JSONObject(a).getBoolean("never_pool");
        }
        this.f15804I = m19538d(map, "X-Afma-Custom-Close-Blocked");
    }
}
