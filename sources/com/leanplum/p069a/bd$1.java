package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$1 */
final class bd$1 extends be {
    bd$1() {
    }

    /* renamed from: a */
    public final Object m30565a(String str) {
        return str.startsWith("mcc") ? Integer.getInteger(str.substring(3)) : null;
    }

    /* renamed from: a */
    public final boolean m30566a(Object obj, Configuration configuration) {
        return configuration.mcc == ((Integer) obj).intValue() ? true : null;
    }
}
