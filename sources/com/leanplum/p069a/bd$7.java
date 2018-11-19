package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$7 */
final class bd$7 extends be {
    bd$7() {
    }

    /* renamed from: a */
    public final Object m30581a(String str) {
        if ("notouch".equals(str)) {
            return Integer.valueOf(1);
        }
        return "finger".equals(str) != null ? Integer.valueOf(3) : null;
    }

    /* renamed from: a */
    public final boolean m30582a(Object obj, Configuration configuration) {
        return configuration.touchscreen == ((Integer) obj).intValue() ? true : null;
    }
}
