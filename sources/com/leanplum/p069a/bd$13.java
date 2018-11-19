package com.leanplum.p069a;

import android.content.res.Configuration;
import android.os.Build.VERSION;

/* renamed from: com.leanplum.a.bd$13 */
final class bd$13 extends be {
    bd$13() {
    }

    /* renamed from: a */
    public final Object m30548a(String str) {
        return str.startsWith("v") ? Integer.getInteger(str.substring(1)) : null;
    }

    /* renamed from: a */
    public final boolean m30549a(Object obj, Configuration configuration) {
        return VERSION.SDK_INT >= ((Integer) obj).intValue() ? true : null;
    }
}
