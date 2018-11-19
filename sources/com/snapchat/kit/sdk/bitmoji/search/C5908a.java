package com.snapchat.kit.sdk.bitmoji.search;

import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.snapchat.kit.sdk.bitmoji.search.a */
public enum C5908a {
    GREETING("greeting"),
    AFFECTION("affection"),
    POSITIVE("positive"),
    NEGATIVE("negative"),
    OCCASIONS("occasions");
    
    /* renamed from: g */
    private static final Map<String, C5908a> f21643g = null;
    /* renamed from: f */
    private final String f21645f;

    static {
        f21643g = new HashMap();
        C5908a[] values = C5908a.values();
        int length = values.length;
        int i;
        while (i < length) {
            C5908a c5908a = values[i];
            f21643g.put(c5908a.f21645f, c5908a);
            i++;
        }
    }

    private C5908a(String str) {
        this.f21645f = str;
    }

    @Nullable
    /* renamed from: a */
    public static C5908a m25489a(String str) {
        return (C5908a) f21643g.get(str);
    }
}
