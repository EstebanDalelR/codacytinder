package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.bo.bg;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.bq.l */
public final class C4872l {
    /* renamed from: a */
    private static final Map<bg, C4870j> f17888a = new HashMap();

    /* renamed from: a */
    public static void m21828a(bg bgVar, C4870j c4870j) {
        f17888a.put(bgVar, c4870j);
    }

    /* renamed from: a */
    public static boolean m21829a(bg bgVar) {
        return f17888a.containsKey(bgVar);
    }

    /* renamed from: b */
    public static C4870j m21830b(bg bgVar) {
        C4870j c4870j = (C4870j) f17888a.get(bgVar);
        if (c4870j != null) {
            return c4870j;
        }
        bgVar = String.valueOf(bgVar);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(bgVar).length() + 36);
        stringBuilder.append("TileStore: ");
        stringBuilder.append(bgVar);
        stringBuilder.append(" has not been registered ");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
