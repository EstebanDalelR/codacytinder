package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$3 */
final class bd$3 extends be {
    bd$3() {
    }

    /* renamed from: a */
    public final Object m30572a(String str) {
        if ("port".equals(str)) {
            return Integer.valueOf(1);
        }
        return "land".equals(str) != null ? Integer.valueOf(2) : null;
    }

    /* renamed from: a */
    public final boolean m30573a(Object obj, Configuration configuration) {
        return configuration.orientation == ((Integer) obj).intValue() ? true : null;
    }
}
