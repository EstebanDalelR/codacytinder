package com.leanplum.p069a;

import java.util.Map;

/* renamed from: com.leanplum.a.bb */
public final class bb {
    /* renamed from: a */
    private static bb f7981a;

    /* renamed from: a */
    public static synchronized bb m9588a() {
        bb bbVar;
        synchronized (bb.class) {
            if (f7981a == null) {
                f7981a = new bb();
            }
            bbVar = f7981a;
        }
        return bbVar;
    }

    /* renamed from: a */
    public static aw m9587a(String str, String str2, Map<String, Object> map) {
        return new aw(str, str2, map);
    }
}
