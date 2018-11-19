package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$10 */
final class bd$10 extends be {
    bd$10() {
    }

    /* renamed from: a */
    public final Object m30542a(String str) {
        if ("navexposed".equals(str)) {
            return Integer.valueOf(1);
        }
        return "navhidden".equals(str) != null ? Integer.valueOf(2) : null;
    }

    /* renamed from: a */
    public final boolean m30543a(Object obj, Configuration configuration) {
        return configuration.navigationHidden == ((Integer) obj).intValue() ? true : null;
    }
}
