package com.leanplum.p069a;

import android.util.Pair;

/* renamed from: com.leanplum.a.b */
enum C5723b {
    LEGACY_TOKEN(0),
    APP_ID_KEY(1);
    
    /* renamed from: c */
    public final String f21178c;
    /* renamed from: d */
    private int f21179d;
    /* renamed from: e */
    private String f21180e;

    private C5723b(int i) {
        this.f21178c = String.format("%02d", new Object[]{Integer.valueOf(i)});
        r2 = new StringBuilder();
        r2.append(this.f21178c);
        r2.append("[");
        this.f21180e = r2.toString();
    }

    /* renamed from: a */
    private static C5723b m25062a(int i) {
        return i == 1 ? APP_ID_KEY : 0;
    }

    /* renamed from: a */
    public static Pair<C5723b, String> m25061a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                if (str.startsWith("[")) {
                    return Pair.create(LEGACY_TOKEN, str);
                }
                if (str.startsWith(APP_ID_KEY.f21180e)) {
                    return Pair.create(APP_ID_KEY, str.substring(APP_ID_KEY.f21180e.length() - 1));
                }
                return null;
            }
        }
        return null;
    }
}
