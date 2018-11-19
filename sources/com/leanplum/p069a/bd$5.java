package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$5 */
final class bd$5 extends be {
    bd$5() {
    }

    /* renamed from: a */
    public final Object m30576a(String str) {
        if ("night".equals(str)) {
            return Integer.valueOf(32);
        }
        return "notnight".equals(str) != null ? Integer.valueOf(16) : null;
    }

    /* renamed from: a */
    public final boolean m30577a(Object obj, Configuration configuration) {
        return (configuration.uiMode & 48) == ((Integer) obj).intValue() ? true : null;
    }
}
