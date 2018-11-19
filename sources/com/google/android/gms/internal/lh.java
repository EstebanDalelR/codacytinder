package com.google.android.gms.internal;

import com.tinder.api.ManagerWebServices;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeMap;

public final class lh {
    /* renamed from: a */
    private static long m20027a(String str) {
        try {
            return m20031a().parse(str).getTime();
        } catch (Throwable e) {
            cg.m19568a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: a */
    public static com.google.android.gms.internal.pt m20028a(com.google.android.gms.internal.amz r19) {
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
        r0 = r19;
        r1 = java.lang.System.currentTimeMillis();
        r3 = r0.f15515c;
        r4 = "Date";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x0017;
    L_0x0012:
        r7 = m20027a(r4);
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
        r5 = m20027a(r4);
        goto L_0x00a2;
    L_0x00a0:
        r5 = 0;
    L_0x00a2:
        r4 = "Last-Modified";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x00b1;
    L_0x00ac:
        r9 = m20027a(r4);
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
        r11 = new com.google.android.gms.internal.pt;
        r11.<init>();
        r12 = r0.f15514b;
        r11.f16398a = r12;
        r11.f16399b = r4;
        r11.f16403f = r5;
        r11.f16402e = r1;
        r11.f16400c = r7;
        r11.f16401d = r9;
        r11.f16404g = r3;
        r0 = r0.f15516d;
        r11.f16405h = r0;
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.lh.a(com.google.android.gms.internal.amz):com.google.android.gms.internal.pt");
    }

    /* renamed from: a */
    static String m20029a(long j) {
        return m20031a().format(new Date(j));
    }

    /* renamed from: a */
    public static String m20030a(Map<String, String> map) {
        String str = "ISO-8859-1";
        String str2 = (String) map.get(ManagerWebServices.PARAM_CONTENT_TYPE);
        if (str2 != null) {
            String[] split = str2.split(";");
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    private static SimpleDateFormat m20031a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: a */
    static Map<String, String> m20032a(List<ajr> list) {
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (ajr ajr : list) {
            treeMap.put(ajr.m19223a(), ajr.m19224b());
        }
        return treeMap;
    }

    /* renamed from: b */
    static List<ajr> m20033b(Map<String, String> map) {
        List<ajr> arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(new ajr((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }
}
