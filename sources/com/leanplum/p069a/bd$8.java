package com.leanplum.p069a;

import android.content.res.Configuration;

/* renamed from: com.leanplum.a.bd$8 */
final class bd$8 extends be {
    bd$8() {
    }

    /* renamed from: a */
    public final Object m30583a(String str) {
        if ("keysexposed".equals(str)) {
            return Integer.valueOf(1);
        }
        if ("keyshidden".equals(str)) {
            return Integer.valueOf(2);
        }
        return "keyssoft".equals(str) != null ? Integer.valueOf(null) : null;
    }

    /* renamed from: a */
    public final boolean m30584a(Object obj, Configuration configuration) {
        Integer num = (Integer) obj;
        if (num.intValue() != 0) {
            if (configuration.keyboardHidden != num.intValue()) {
                return null;
            }
        }
        return true;
    }
}
