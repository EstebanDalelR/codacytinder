package com.android.volley.toolbox;

import com.tinder.api.ManagerWebServices;
import java.util.Map;

/* renamed from: com.android.volley.toolbox.c */
public class C0915c {
    /* renamed from: a */
    public static com.android.volley.Cache.C0901a m3066a(com.android.volley.NetworkResponse r19) {
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
        r0 = r19;
        r1 = java.lang.System.currentTimeMillis();
        r3 = r0.f2337c;
        r4 = "Date";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x0017;
    L_0x0012:
        r7 = com.android.volley.toolbox.C0915c.m3065a(r4);
        goto L_0x0019;
    L_0x0017:
        r7 = 0;
    L_0x0019:
        r4 = "Cache-Control";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        r10 = 0;
        if (r4 == 0) goto L_0x008a;
    L_0x0024:
        r11 = ",";
        r4 = r4.split(r11);
        r11 = 0;
        r13 = 0;
        r14 = 0;
    L_0x002f:
        r9 = r4.length;
        if (r10 >= r9) goto L_0x0087;
    L_0x0032:
        r9 = r4[r10];
        r9 = r9.trim();
        r5 = "no-cache";
        r5 = r9.equals(r5);
        if (r5 != 0) goto L_0x0085;
    L_0x0040:
        r5 = "no-store";
        r5 = r9.equals(r5);
        if (r5 == 0) goto L_0x0049;
    L_0x0048:
        goto L_0x0085;
    L_0x0049:
        r5 = "max-age=";
        r5 = r9.startsWith(r5);
        if (r5 == 0) goto L_0x005d;
    L_0x0051:
        r5 = 8;
        r5 = r9.substring(r5);	 Catch:{ Exception -> 0x0082 }
        r5 = java.lang.Long.parseLong(r5);	 Catch:{ Exception -> 0x0082 }
        r11 = r5;
        goto L_0x0082;
    L_0x005d:
        r5 = "stale-while-revalidate=";
        r5 = r9.startsWith(r5);
        if (r5 == 0) goto L_0x0071;
    L_0x0065:
        r5 = 23;
        r5 = r9.substring(r5);	 Catch:{ Exception -> 0x0082 }
        r5 = java.lang.Long.parseLong(r5);	 Catch:{ Exception -> 0x0082 }
        r14 = r5;
        goto L_0x0082;
    L_0x0071:
        r5 = "must-revalidate";
        r5 = r9.equals(r5);
        if (r5 != 0) goto L_0x0081;
    L_0x0079:
        r5 = "proxy-revalidate";
        r5 = r9.equals(r5);
        if (r5 == 0) goto L_0x0082;
    L_0x0081:
        r13 = 1;
    L_0x0082:
        r10 = r10 + 1;
        goto L_0x002f;
    L_0x0085:
        r0 = 0;
        return r0;
    L_0x0087:
        r16 = 1;
        goto L_0x0091;
    L_0x008a:
        r11 = 0;
        r13 = 0;
        r14 = 0;
        r16 = 0;
    L_0x0091:
        r4 = "Expires";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x00a0;
    L_0x009b:
        r5 = com.android.volley.toolbox.C0915c.m3065a(r4);
        goto L_0x00a2;
    L_0x00a0:
        r5 = 0;
    L_0x00a2:
        r4 = "Last-Modified";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x00b1;
    L_0x00ac:
        r9 = com.android.volley.toolbox.C0915c.m3065a(r4);
        goto L_0x00b3;
    L_0x00b1:
        r9 = 0;
    L_0x00b3:
        r4 = "ETag";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        if (r16 == 0) goto L_0x00d2;
    L_0x00bd:
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r11 = r11 * r5;
        r16 = r1 + r11;
        if (r13 == 0) goto L_0x00c8;
    L_0x00c5:
        r5 = r16;
        goto L_0x00ce;
    L_0x00c8:
        r14 = r14 * r5;
        r1 = 0;
        r1 = r16 + r14;
        r5 = r1;
    L_0x00ce:
        r1 = r5;
        r5 = r16;
        goto L_0x00e5;
    L_0x00d2:
        r16 = 0;
        r11 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1));
        if (r11 <= 0) goto L_0x00e2;
    L_0x00d8:
        r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r11 < 0) goto L_0x00e2;
    L_0x00dc:
        r11 = r5 - r7;
        r5 = r1 + r11;
        r1 = r5;
        goto L_0x00e5;
    L_0x00e2:
        r1 = r16;
        r5 = r1;
    L_0x00e5:
        r11 = new com.android.volley.Cache$a;
        r11.<init>();
        r0 = r0.f2336b;
        r11.f2328a = r0;
        r11.f2329b = r4;
        r11.f2333f = r5;
        r11.f2332e = r1;
        r11.f2330c = r7;
        r11.f2331d = r9;
        r11.f2334g = r3;
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.c.a(com.android.volley.NetworkResponse):com.android.volley.Cache$a");
    }

    /* renamed from: a */
    public static long m3065a(java.lang.String r2) {
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
        r2 = org.apache.http.impl.cookie.DateUtils.parseDate(r2);	 Catch:{ DateParseException -> 0x0009 }
        r0 = r2.getTime();	 Catch:{ DateParseException -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.c.a(java.lang.String):long");
    }

    /* renamed from: a */
    public static String m3068a(Map<String, String> map, String str) {
        String str2 = (String) map.get(ManagerWebServices.PARAM_CONTENT_TYPE);
        if (str2 != null) {
            map = str2.split(";");
            for (int i = 1; i < map.length; i++) {
                String[] split = map[i].trim().split("=");
                if (split.length == 2 && split[0].equals("charset")) {
                    return split[1];
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m3067a(Map<String, String> map) {
        return C0915c.m3068a(map, "ISO-8859-1");
    }
}
