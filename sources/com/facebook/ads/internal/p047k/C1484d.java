package com.facebook.ads.internal.p047k;

import com.facebook.ads.internal.p040g.C1408c;
import com.facebook.ads.internal.p040g.C1413g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.k.d */
public class C1484d {
    /* renamed from: a */
    private static Map<String, Long> f4111a = new ConcurrentHashMap();
    /* renamed from: b */
    private static Map<String, Long> f4112b = new ConcurrentHashMap();
    /* renamed from: c */
    private static Map<String, String> f4113c = new ConcurrentHashMap();

    /* renamed from: a */
    private static long m5219a(String str, C1408c c1408c) {
        if (f4111a.containsKey(str)) {
            return ((Long) f4111a.get(str)).longValue();
        }
        switch (c1408c) {
            case BANNER:
                return 15000;
            default:
                return -1000;
        }
    }

    /* renamed from: a */
    public static void m5220a(long j, C1413g c1413g) {
        f4111a.put(C1484d.m5225d(c1413g), Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m5221a(String str, C1413g c1413g) {
        f4113c.put(C1484d.m5225d(c1413g), str);
    }

    /* renamed from: a */
    public static boolean m5222a(C1413g c1413g) {
        String d = C1484d.m5225d(c1413g);
        boolean z = false;
        if (!f4112b.containsKey(d)) {
            return false;
        }
        long longValue = ((Long) f4112b.get(d)).longValue();
        if (System.currentTimeMillis() - longValue < C1484d.m5219a(d, c1413g.m4915b())) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public static void m5223b(C1413g c1413g) {
        f4112b.put(C1484d.m5225d(c1413g), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: c */
    public static String m5224c(C1413g c1413g) {
        return (String) f4113c.get(C1484d.m5225d(c1413g));
    }

    /* renamed from: d */
    private static String m5225d(C1413g c1413g) {
        String str = "%s:%s:%s:%d:%d:%d";
        Object[] objArr = new Object[6];
        int i = 0;
        objArr[0] = c1413g.m4914a();
        objArr[1] = c1413g.m4915b();
        objArr[2] = c1413g.f3895e;
        objArr[3] = Integer.valueOf(c1413g.m4916c() == null ? 0 : c1413g.m4916c().getHeight());
        if (c1413g.m4916c() != null) {
            i = c1413g.m4916c().getWidth();
        }
        objArr[4] = Integer.valueOf(i);
        objArr[5] = Integer.valueOf(c1413g.m4917d());
        return String.format(str, objArr);
    }
}
