package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$9 */
final class bd$9 extends be {
    bd$9() {
    }

    /* renamed from: a */
    public final Object m30585a(String str) {
        if ("nokeys".equals(str)) {
            return Integer.valueOf(1);
        }
        if ("qwerty".equals(str)) {
            return Integer.valueOf(2);
        }
        return "12key".equals(str) != null ? Integer.valueOf(3) : null;
    }

    /* renamed from: a */
    public final boolean m30586a(Object obj, Configuration configuration) {
        return configuration.keyboard == ((Integer) obj).intValue() ? true : null;
    }
}
