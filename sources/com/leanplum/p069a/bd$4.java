package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$4 */
final class bd$4 extends be {
    /* renamed from: a */
    private static int f25523a = 4;
    /* renamed from: b */
    private static int f25524b = 5;

    bd$4() {
    }

    /* renamed from: a */
    public final Object m30574a(String str) {
        if ("car".equals(str)) {
            return Integer.valueOf(3);
        }
        if ("desk".equals(str)) {
            return Integer.valueOf(2);
        }
        if ("television".equals(str)) {
            return Integer.valueOf(4);
        }
        return "appliance".equals(str) != null ? Integer.valueOf(5) : null;
    }

    /* renamed from: a */
    public final boolean m30575a(Object obj, Configuration configuration) {
        return (configuration.uiMode & 15) == ((Integer) obj).intValue() ? true : null;
    }
}
