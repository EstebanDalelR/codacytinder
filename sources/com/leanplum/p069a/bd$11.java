package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$11 */
final class bd$11 extends be {
    bd$11() {
    }

    /* renamed from: a */
    public final Object m30544a(String str) {
        if ("nonav".equals(str)) {
            return Integer.valueOf(1);
        }
        if ("dpad".equals(str)) {
            return Integer.valueOf(2);
        }
        if ("trackball".equals(str)) {
            return Integer.valueOf(3);
        }
        return "wheel".equals(str) != null ? Integer.valueOf(4) : null;
    }

    /* renamed from: a */
    public final boolean m30545a(Object obj, Configuration configuration) {
        return configuration.navigation == ((Integer) obj).intValue() ? true : null;
    }
}
