package com.google.android.m4b.maps.ay;

import com.google.android.m4b.maps.p125y.C5571j;
import io.fabric.sdk.android.services.events.C15645a;

/* renamed from: com.google.android.m4b.maps.ay.s */
public final class C4727s {
    /* renamed from: a */
    private String f17363a;
    /* renamed from: b */
    private String f17364b;
    /* renamed from: c */
    private String f17365c;

    /* renamed from: a */
    public static String m21040a(String str) {
        String str2 = "en";
        if (str == null) {
            return str2;
        }
        str = str.replace('-', '_').split(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
        if (str[0].length() != 2 && str[0].length() != 3) {
            return str2;
        }
        str2 = str[0].toLowerCase();
        if (str.length < 2 || str[1].length() != 2) {
            return str2;
        }
        str2 = String.valueOf(str2);
        str = String.valueOf(str[1].toUpperCase());
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length());
        stringBuilder.append(str2);
        stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    C4727s(String str) {
        str = C4727s.m21040a(str);
        String a = C4727s.m21040a(System.getProperty("microedition.locale"));
        if (!"en".equals(a)) {
            if (a.length() != 2 || !str.startsWith(a)) {
                str = a;
            }
        }
        m21046b(str);
        m21047c(null);
    }

    /* renamed from: a */
    public final String m21045a() {
        return this.f17364b;
    }

    /* renamed from: b */
    public final void m21046b(String str) {
        this.f17363a = C4727s.m21040a(str);
    }

    /* renamed from: c */
    public final void m21047c(String str) {
        this.f17364b = str != null ? C4727s.m21040a(str) : this.f17363a;
        this.f17365c = C4727s.m21042d(this.f17364b);
    }

    /* renamed from: d */
    public static String m21042d(String str) {
        int f = C4727s.m21044f(str);
        if (f < 0) {
            return str;
        }
        return str.substring(0, f);
    }

    /* renamed from: e */
    public static String m21043e(String str) {
        int f = C4727s.m21044f(str);
        if (f < 0) {
            return null;
        }
        str = str.substring(f + 1);
        f = C4727s.m21044f(str);
        if (f >= 0) {
            str = str.substring(0, f);
        }
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    /* renamed from: f */
    private static int m21044f(String str) {
        int indexOf = str.indexOf(95);
        str = str.indexOf(45);
        if (indexOf < 0) {
            return str;
        }
        return (str >= null && indexOf >= str) ? str : indexOf;
    }

    /* renamed from: a */
    public static String m21041a(String str, String[] strArr) {
        C5571j.m24301b(strArr.length > 0);
        if (str == null) {
            str = "en";
        } else {
            if (!str.equals("en_AU")) {
                if (!str.equals("en_NZ")) {
                    if (str.startsWith("nb")) {
                        str = "no";
                    }
                }
            }
            str = "en_GB";
        }
        String d = C4727s.m21042d(str);
        int i = 0;
        int i2 = 0;
        Object obj = -1;
        while (i < strArr.length) {
            String str2 = strArr[i];
            Object obj2 = str.equals(str2) ? 4 : str.startsWith(str2) ? 3 : str2.startsWith(d) ? 2 : (i == 0 ? 1 : null) != null ? 1 : null;
            if (obj2 > obj) {
                i2 = i;
                obj = obj2;
            }
            i++;
        }
        return strArr[i2];
    }
}
