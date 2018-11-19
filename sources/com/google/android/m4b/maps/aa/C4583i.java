package com.google.android.m4b.maps.aa;

/* renamed from: com.google.android.m4b.maps.aa.i */
final class C4583i {
    /* renamed from: a */
    static void m20669a(Object obj, Object obj2) {
        StringBuilder stringBuilder;
        if (obj == null) {
            stringBuilder = new StringBuilder("null key in entry: null=");
            stringBuilder.append(obj2);
            throw new NullPointerException(stringBuilder.toString());
        } else if (obj2 == null) {
            stringBuilder = new StringBuilder("null value in entry: ");
            stringBuilder.append(obj);
            stringBuilder.append("=null");
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    static int m20668a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" cannot be negative but was: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
