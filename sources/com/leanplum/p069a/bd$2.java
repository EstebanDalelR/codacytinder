package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$2 */
final class bd$2 extends be {
    bd$2() {
    }

    /* renamed from: a */
    public final Object m30570a(String str) {
        if ("long".equals(str)) {
            return Integer.valueOf(32);
        }
        return "notlong".equals(str) != null ? Integer.valueOf(16) : null;
    }

    /* renamed from: a */
    public final boolean m30571a(Object obj, Configuration configuration) {
        return (configuration.screenLayout & 48) == ((Integer) obj).intValue() ? true : null;
    }
}
