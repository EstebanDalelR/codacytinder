package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.bq.C8066a.C4861b;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.bq.g */
public final class C4867g {
    /* renamed from: a */
    private static final Map<C4861b, Integer> f17872a;

    /* renamed from: com.google.android.m4b.maps.bq.g$a */
    public interface C4866a {
        /* renamed from: a */
        void mo5148a();
    }

    static {
        Map a = ax.m20617a(5);
        f17872a = a;
        a.put(C4861b.PREFETCH_OFFLINE_MAP, Integer.valueOf(1));
    }

    /* renamed from: a */
    private static void m21802a(int i) {
        StringBuilder stringBuilder;
        if ((i >> 10) != 0) {
            stringBuilder = new StringBuilder(42);
            stringBuilder.append("the modifier [");
            stringBuilder.append(i);
            stringBuilder.append("] is out of bound");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (((i & 31) & (i >> 5)) != 0) {
            stringBuilder = new StringBuilder(44);
            stringBuilder.append("the modifier [");
            stringBuilder.append(i);
            stringBuilder.append("] has conflict bits");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static int m21800a(int i, int i2) {
        C4867g.m21802a(i);
        C4867g.m21802a(i2);
        int i3 = i2 & 31;
        i2 >>= 5;
        return ((((i >> 5) & (i3 ^ 31)) | i2) << 5) + (((i & 31) & (i2 ^ 31)) | i3);
    }

    /* renamed from: a */
    public static boolean m21803a(C4861b c4861b) {
        return f17872a.containsKey(c4861b);
    }

    /* renamed from: a */
    public static int m21801a(C4861b c4861b, boolean z) {
        Integer num = (Integer) f17872a.get(c4861b);
        if (num == null) {
            return null;
        }
        return z ? num.intValue() : num.intValue() << 5;
    }
}
