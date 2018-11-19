package com.google.android.m4b.maps.p125y;

/* renamed from: com.google.android.m4b.maps.y.c */
public final class C5562c {
    /* renamed from: a */
    private static boolean m24257a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: a */
    public static String m24256a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (C5562c.m24257a(str.charAt(i))) {
                str = str.toCharArray();
                while (i < length) {
                    char c = str[i];
                    if (C5562c.m24257a(c)) {
                        str[i] = (char) (c ^ 32);
                    }
                    i++;
                }
                return String.valueOf(str);
            }
            i++;
        }
        return str;
    }
}
