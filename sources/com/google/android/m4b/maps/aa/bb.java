package com.google.android.m4b.maps.aa;

import java.lang.reflect.Array;

public final class bb {
    /* renamed from: a */
    static final Object[] f16958a = new Object[0];

    /* renamed from: b */
    static <T> T[] m20640b(T[] tArr, int i) {
        Object a = m20639a((Object[]) tArr, i);
        System.arraycopy(tArr, 0, a, 0, Math.min(tArr.length, i));
        return a;
    }

    /* renamed from: a */
    static Object[] m20638a(Object... objArr) {
        return m20641c(objArr, objArr.length);
    }

    /* renamed from: c */
    static Object[] m20641c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m20637a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: a */
    static Object m20637a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder("at index ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static <T> T[] m20639a(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }
}
