package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;

final class aly extends alv {
    aly() {
    }

    @Nullable
    /* renamed from: a */
    private static String m27133a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }

    /* renamed from: a */
    public final String mo4353a(@Nullable String str, String str2) {
        str = m27133a(str);
        Object a = m27133a(str2);
        if (TextUtils.isEmpty(str)) {
            return a;
        }
        if (TextUtils.isEmpty(a)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(a).length());
        stringBuilder.append(str);
        stringBuilder.append(",");
        stringBuilder.append(a);
        return stringBuilder.toString();
    }
}
