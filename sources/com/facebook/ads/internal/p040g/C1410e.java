package com.facebook.ads.internal.p040g;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.g.e */
public class C1410e {
    /* renamed from: c */
    private static final String f3871c = "e";
    /* renamed from: d */
    private static final AdPlacementType f3872d = AdPlacementType.UNKNOWN;
    /* renamed from: a */
    public int f3873a = -1;
    /* renamed from: b */
    public int f3874b = -1;
    /* renamed from: e */
    private final long f3875e = System.currentTimeMillis();
    /* renamed from: f */
    private AdPlacementType f3876f = f3872d;
    /* renamed from: g */
    private int f3877g = 1;
    /* renamed from: h */
    private int f3878h = 0;
    /* renamed from: i */
    private int f3879i = 0;
    /* renamed from: j */
    private int f3880j = 20;
    /* renamed from: k */
    private int f3881k = 0;
    /* renamed from: l */
    private int f3882l = AdError.NETWORK_ERROR_CODE;
    /* renamed from: m */
    private int f3883m = 10000;
    /* renamed from: n */
    private boolean f3884n = false;
    /* renamed from: o */
    private List<C1406b> f3885o = null;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C1410e(java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
        r9 = this;
        r9.<init>();
        r0 = -1;
        r9.f3873a = r0;
        r9.f3874b = r0;
        r1 = f3872d;
        r9.f3876f = r1;
        r1 = 1;
        r9.f3877g = r1;
        r2 = 0;
        r9.f3878h = r2;
        r9.f3879i = r2;
        r3 = 20;
        r9.f3880j = r3;
        r9.f3881k = r2;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r9.f3882l = r3;
        r3 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r9.f3883m = r3;
        r9.f3884n = r2;
        r3 = 0;
        r9.f3885o = r3;
        r3 = java.lang.System.currentTimeMillis();
        r9.f3875e = r3;
        r10 = r10.entrySet();
        r10 = r10.iterator();
    L_0x0035:
        r3 = r10.hasNext();
        if (r3 == 0) goto L_0x01f6;
    L_0x003b:
        r3 = r10.next();
        r3 = (java.util.Map.Entry) r3;
        r4 = r3.getKey();
        r4 = (java.lang.String) r4;
        r5 = r4.hashCode();
        switch(r5) {
            case -1899431321: goto L_0x00c3;
            case -1561601017: goto L_0x00b9;
            case -856794442: goto L_0x00ae;
            case -726276175: goto L_0x00a3;
            case -553208868: goto L_0x0099;
            case 3575610: goto L_0x008f;
            case 700812481: goto L_0x0085;
            case 858630459: goto L_0x007b;
            case 1085444827: goto L_0x0071;
            case 1183549815: goto L_0x0066;
            case 1503616961: goto L_0x005b;
            case 2002133996: goto L_0x0050;
            default: goto L_0x004e;
        };
    L_0x004e:
        goto L_0x00ce;
    L_0x0050:
        r5 = "placement_width";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x0058:
        r4 = 6;
        goto L_0x00cf;
    L_0x005b:
        r5 = "placement_height";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x0063:
        r4 = 7;
        goto L_0x00cf;
    L_0x0066:
        r5 = "viewability_check_initial_delay";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x006e:
        r4 = 8;
        goto L_0x00cf;
    L_0x0071:
        r5 = "refresh";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x0079:
        r4 = 3;
        goto L_0x00cf;
    L_0x007b:
        r5 = "viewability_check_ticker";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x0083:
        r4 = 2;
        goto L_0x00cf;
    L_0x0085:
        r5 = "min_viewability_percentage";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x008d:
        r4 = 1;
        goto L_0x00cf;
    L_0x008f:
        r5 = "type";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x0097:
        r4 = 0;
        goto L_0x00cf;
    L_0x0099:
        r5 = "cacheable";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x00a1:
        r4 = 5;
        goto L_0x00cf;
    L_0x00a3:
        r5 = "request_timeout";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x00ab:
        r4 = 10;
        goto L_0x00cf;
    L_0x00ae:
        r5 = "viewability_check_interval";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x00b6:
        r4 = 9;
        goto L_0x00cf;
    L_0x00b9:
        r5 = "refresh_threshold";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x00c1:
        r4 = 4;
        goto L_0x00cf;
    L_0x00c3:
        r5 = "conv_tracking_data";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x00ce;
    L_0x00cb:
        r4 = 11;
        goto L_0x00cf;
    L_0x00ce:
        r4 = -1;
    L_0x00cf:
        switch(r4) {
            case 0: goto L_0x01e8;
            case 1: goto L_0x01da;
            case 2: goto L_0x01cc;
            case 3: goto L_0x01be;
            case 4: goto L_0x01b0;
            case 5: goto L_0x019e;
            case 6: goto L_0x0190;
            case 7: goto L_0x0182;
            case 8: goto L_0x0174;
            case 9: goto L_0x0166;
            case 10: goto L_0x0158;
            case 11: goto L_0x00d4;
            default: goto L_0x00d2;
        };
    L_0x00d2:
        goto L_0x0035;
    L_0x00d4:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = com.facebook.ads.internal.p040g.C1406b.m4891a(r3);
        r9.f3885o = r3;
        r3 = android.webkit.CookieManager.getInstance();	 Catch:{ Exception -> 0x014e }
        r4 = r3.acceptCookie();	 Catch:{ Exception -> 0x014e }
        r3.setAcceptCookie(r1);	 Catch:{ Exception -> 0x014e }
        r5 = r9.f3885o;	 Catch:{ Exception -> 0x014e }
        r5 = r5.iterator();	 Catch:{ Exception -> 0x014e }
    L_0x00f1:
        r6 = r5.hasNext();	 Catch:{ Exception -> 0x014e }
        if (r6 == 0) goto L_0x013c;
    L_0x00f7:
        r6 = r5.next();	 Catch:{ Exception -> 0x014e }
        r6 = (com.facebook.ads.internal.p040g.C1406b) r6;	 Catch:{ Exception -> 0x014e }
        r7 = r6.m4893b();	 Catch:{ Exception -> 0x014e }
        if (r7 == 0) goto L_0x00f1;
    L_0x0103:
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x014e }
        r7.<init>();	 Catch:{ Exception -> 0x014e }
        r8 = r6.f3856b;	 Catch:{ Exception -> 0x014e }
        r7.append(r8);	 Catch:{ Exception -> 0x014e }
        r8 = "=";
        r7.append(r8);	 Catch:{ Exception -> 0x014e }
        r8 = r6.f3857c;	 Catch:{ Exception -> 0x014e }
        r7.append(r8);	 Catch:{ Exception -> 0x014e }
        r8 = ";Domain=";
        r7.append(r8);	 Catch:{ Exception -> 0x014e }
        r8 = r6.f3855a;	 Catch:{ Exception -> 0x014e }
        r7.append(r8);	 Catch:{ Exception -> 0x014e }
        r8 = ";Expires=";
        r7.append(r8);	 Catch:{ Exception -> 0x014e }
        r8 = r6.m4892a();	 Catch:{ Exception -> 0x014e }
        r7.append(r8);	 Catch:{ Exception -> 0x014e }
        r8 = ";path=/";
        r7.append(r8);	 Catch:{ Exception -> 0x014e }
        r7 = r7.toString();	 Catch:{ Exception -> 0x014e }
        r6 = r6.f3855a;	 Catch:{ Exception -> 0x014e }
        r3.setCookie(r6, r7);	 Catch:{ Exception -> 0x014e }
        goto L_0x00f1;
    L_0x013c:
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x014e }
        r6 = 21;
        if (r5 >= r6) goto L_0x0149;
    L_0x0142:
        r5 = android.webkit.CookieSyncManager.getInstance();	 Catch:{ Exception -> 0x014e }
        r5.startSync();	 Catch:{ Exception -> 0x014e }
    L_0x0149:
        r3.setAcceptCookie(r4);	 Catch:{ Exception -> 0x014e }
        goto L_0x0035;
    L_0x014e:
        r3 = move-exception;
        r4 = f3871c;
        r5 = "Failed to set cookie.";
        android.util.Log.w(r4, r5, r3);
        goto L_0x0035;
    L_0x0158:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = java.lang.Integer.parseInt(r3);
        r9.f3883m = r3;
        goto L_0x0035;
    L_0x0166:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = java.lang.Integer.parseInt(r3);
        r9.f3882l = r3;
        goto L_0x0035;
    L_0x0174:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = java.lang.Integer.parseInt(r3);
        r9.f3881k = r3;
        goto L_0x0035;
    L_0x0182:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = java.lang.Integer.parseInt(r3);
        r9.f3874b = r3;
        goto L_0x0035;
    L_0x0190:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = java.lang.Integer.parseInt(r3);
        r9.f3873a = r3;
        goto L_0x0035;
    L_0x019e:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = java.lang.Boolean.valueOf(r3);
        r3 = r3.booleanValue();
        r9.f3884n = r3;
        goto L_0x0035;
    L_0x01b0:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = java.lang.Integer.parseInt(r3);
        r9.f3880j = r3;
        goto L_0x0035;
    L_0x01be:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = java.lang.Integer.parseInt(r3);
        r9.f3879i = r3;
        goto L_0x0035;
    L_0x01cc:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = java.lang.Integer.parseInt(r3);
        r9.f3878h = r3;
        goto L_0x0035;
    L_0x01da:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = java.lang.Integer.parseInt(r3);
        r9.f3877g = r3;
        goto L_0x0035;
    L_0x01e8:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = com.facebook.ads.internal.server.AdPlacementType.fromString(r3);
        r9.f3876f = r3;
        goto L_0x0035;
    L_0x01f6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.g.e.<init>(java.util.Map):void");
    }

    /* renamed from: a */
    public static C1410e m4900a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator keys = jSONObject.keys();
        Map hashMap = new HashMap();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            hashMap.put(str, String.valueOf(jSONObject.opt(str)));
        }
        return new C1410e(hashMap);
    }

    /* renamed from: a */
    public long m4901a() {
        return this.f3875e;
    }

    /* renamed from: b */
    public AdPlacementType m4902b() {
        return this.f3876f;
    }

    /* renamed from: c */
    public long m4903c() {
        return (long) (this.f3879i * AdError.NETWORK_ERROR_CODE);
    }

    /* renamed from: d */
    public long m4904d() {
        return (long) (this.f3880j * AdError.NETWORK_ERROR_CODE);
    }

    /* renamed from: e */
    public boolean m4905e() {
        return this.f3884n;
    }

    /* renamed from: f */
    public int m4906f() {
        return this.f3877g;
    }

    /* renamed from: g */
    public int m4907g() {
        return this.f3878h;
    }

    /* renamed from: h */
    public int m4908h() {
        return this.f3881k;
    }

    /* renamed from: i */
    public int m4909i() {
        return this.f3882l;
    }

    /* renamed from: j */
    public int m4910j() {
        return this.f3883m;
    }
}
