package com.tinder.analytics.performance;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nonnull;

@Deprecated
/* renamed from: com.tinder.analytics.performance.n */
public final class C2635n {
    /* renamed from: a */
    public static String m9916a(@Nonnull String str) {
        return C2635n.m9917a(str, Collections.emptyMap());
    }

    /* renamed from: a */
    public static String m9917a(@Nonnull String str, @Nonnull Map<String, String> map) {
        str = C2635n.m9919c(C2635n.m9918b(str));
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
        }
        return str;
    }

    /* renamed from: b */
    private static String m9918b(@Nonnull String str) {
        int indexOf = str.indexOf(63);
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: c */
    private static String m9919c(@Nonnull String str) {
        return str.replace("http://", "").replace("https://", "");
    }
}
