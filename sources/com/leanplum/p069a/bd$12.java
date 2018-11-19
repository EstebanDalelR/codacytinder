package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$12 */
final class bd$12 extends be {
    bd$12() {
    }

    /* renamed from: a */
    public final Object m30546a(String str) {
        return str.startsWith("mnc") ? Integer.getInteger(str.substring(3)) : null;
    }

    /* renamed from: a */
    public final boolean m30547a(Object obj, Configuration configuration) {
        return configuration.mnc == ((Integer) obj).intValue() ? true : null;
    }
}
