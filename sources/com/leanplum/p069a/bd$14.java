package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$14 */
final class bd$14 extends be {
    bd$14() {
    }

    /* renamed from: a */
    public final Object m30550a(String str) {
        return str.length() == 2 ? str : null;
    }

    /* renamed from: a */
    public final boolean m30551a(Object obj, Configuration configuration) {
        return configuration.locale.getLanguage().equals(obj);
    }
}
