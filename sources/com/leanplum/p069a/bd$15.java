package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$15 */
final class bd$15 extends be {
    bd$15() {
    }

    /* renamed from: a */
    public final Object m30552a(String str) {
        return (str.startsWith("r") && str.length() == 3) ? str.substring(1) : null;
    }

    /* renamed from: a */
    public final boolean m30553a(Object obj, Configuration configuration) {
        return configuration.locale.getCountry().toLowerCase().equals(obj);
    }
}
