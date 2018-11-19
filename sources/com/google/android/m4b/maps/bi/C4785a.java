package com.google.android.m4b.maps.bi;

import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.bi.a */
public final class C4785a {
    /* renamed from: a */
    public static String[] m21190a(String str, char c) {
        c = String.valueOf(c);
        C5571j.m24293a((Object) str, (Object) "split target should not be null");
        int length = str.length();
        int i = 0;
        int indexOf = str.indexOf(c, 0);
        int i2 = 0;
        while (indexOf != -1 && indexOf < length) {
            i2++;
            if (indexOf >= 0) {
                indexOf += c.length();
            }
            indexOf = str.indexOf(c, indexOf);
        }
        String[] strArr = new String[(i2 + 1)];
        indexOf = 0;
        while (i < i2) {
            int indexOf2 = str.indexOf(c, indexOf);
            strArr[i] = str.substring(indexOf, indexOf2);
            indexOf = c.length() + indexOf2;
            i++;
        }
        strArr[i2] = str.substring(indexOf);
        return strArr;
    }

    /* renamed from: a */
    public static String m21189a(String str, int i, char c) {
        if (str.length() >= 6) {
            return str;
        }
        i = new StringBuilder(str);
        while (i.length() < 6) {
            i.append('0');
        }
        return i.toString();
    }

    /* renamed from: a */
    public static String m21188a(int i) {
        int i2 = i / 1000000;
        int abs = Math.abs(i - (i2 * 1000000));
        StringBuilder stringBuilder = new StringBuilder();
        if (i < 0 && i2 == 0) {
            stringBuilder.append("-");
        }
        stringBuilder.append(i2);
        if (abs > 0) {
            stringBuilder.append(".");
            stringBuilder.append(String.valueOf(abs + 1000000).substring(1));
        }
        return stringBuilder.toString();
    }
}
