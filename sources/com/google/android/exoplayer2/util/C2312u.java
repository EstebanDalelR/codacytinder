package com.google.android.exoplayer2.util;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.google.android.exoplayer2.util.u */
public final class C2312u {
    /* renamed from: a */
    public static Uri m8450a(String str, String str2) {
        return Uri.parse(C2312u.m8453b(str, str2));
    }

    /* renamed from: b */
    public static String m8453b(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] a = C2312u.m8452a(str2);
        if (a[0] != -1) {
            stringBuilder.append(str2);
            C2312u.m8451a(stringBuilder, a[1], a[2]);
            return stringBuilder.toString();
        }
        int[] a2 = C2312u.m8452a(str);
        if (a[3] == 0) {
            stringBuilder.append(str, 0, a2[3]);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        } else if (a[2] == 0) {
            stringBuilder.append(str, 0, a2[2]);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        } else if (a[1] != 0) {
            int i = a2[0] + 1;
            stringBuilder.append(str, 0, i);
            stringBuilder.append(str2);
            return C2312u.m8451a(stringBuilder, a[1] + i, i + a[2]);
        } else if (str2.charAt(a[1]) == '/') {
            stringBuilder.append(str, 0, a2[1]);
            stringBuilder.append(str2);
            return C2312u.m8451a(stringBuilder, a2[1], a2[1] + a[2]);
        } else if (a2[0] + 2 >= a2[1] || a2[1] != a2[2]) {
            int lastIndexOf = str.lastIndexOf(47, a2[2] - 1);
            int i2 = lastIndexOf == -1 ? a2[1] : lastIndexOf + 1;
            stringBuilder.append(str, 0, i2);
            stringBuilder.append(str2);
            return C2312u.m8451a(stringBuilder, a2[1], i2 + a[2]);
        } else {
            stringBuilder.append(str, 0, a2[1]);
            stringBuilder.append('/');
            stringBuilder.append(str2);
            return C2312u.m8451a(stringBuilder, a2[1], (a2[1] + a[2]) + 1);
        }
    }

    /* renamed from: a */
    private static String m8451a(StringBuilder stringBuilder, int i, int i2) {
        if (i >= i2) {
            return stringBuilder.toString();
        }
        if (stringBuilder.charAt(i) == '/') {
            i++;
        }
        int i3 = i;
        int i4 = i2;
        while (true) {
            i2 = i3;
            while (i2 <= i4) {
                int i5;
                if (i2 == i4) {
                    i5 = i2;
                } else if (stringBuilder.charAt(i2) == '/') {
                    i5 = i2 + 1;
                } else {
                    i2++;
                }
                int i6 = i3 + 1;
                if (i2 == i6 && stringBuilder.charAt(i3) == '.') {
                    stringBuilder.delete(i3, i5);
                    i4 -= i5 - i3;
                } else {
                    if (i2 == i3 + 2 && stringBuilder.charAt(i3) == '.' && stringBuilder.charAt(i6) == '.') {
                        i2 = stringBuilder.lastIndexOf("/", i3 - 2) + 1;
                        i3 = i2 > i ? i2 : i;
                        stringBuilder.delete(i3, i5);
                        i4 -= i5 - i3;
                    } else {
                        i2++;
                    }
                    i3 = i2;
                }
            }
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    private static int[] m8452a(String str) {
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        indexOf = str.indexOf(63);
        if (indexOf == -1 || indexOf > length) {
            indexOf = length;
        }
        int indexOf2 = str.indexOf(47);
        if (indexOf2 == -1 || indexOf2 > indexOf) {
            indexOf2 = indexOf;
        }
        int indexOf3 = str.indexOf(58);
        if (indexOf3 > indexOf2) {
            indexOf3 = -1;
        }
        indexOf2 = indexOf3 + 2;
        Object obj = (indexOf2 < indexOf && str.charAt(indexOf3 + 1) == '/' && str.charAt(indexOf2) == '/') ? 1 : null;
        if (obj != null) {
            str = str.indexOf(47, indexOf3 + 3);
            if (str == -1 || str > indexOf) {
                str = indexOf;
            }
        } else {
            str = indexOf3 + 1;
        }
        iArr[0] = indexOf3;
        iArr[1] = str;
        iArr[2] = indexOf;
        iArr[3] = length;
        return iArr;
    }
}
