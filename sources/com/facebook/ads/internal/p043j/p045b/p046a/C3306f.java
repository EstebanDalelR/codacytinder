package com.facebook.ads.internal.p043j.p045b.p046a;

import android.text.TextUtils;
import com.facebook.ads.internal.p043j.p045b.C1468m;

/* renamed from: com.facebook.ads.internal.j.b.a.f */
public class C3306f implements C1446c {
    /* renamed from: b */
    private String m12756b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf == -1 || lastIndexOf <= str.lastIndexOf(47) || (lastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(lastIndexOf + 1, str.length());
    }

    /* renamed from: a */
    public String mo1774a(String str) {
        Object b = m12756b(str);
        str = C1468m.m5142d(str);
        if (TextUtils.isEmpty(b)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".");
        stringBuilder.append(b);
        return stringBuilder.toString();
    }
}
