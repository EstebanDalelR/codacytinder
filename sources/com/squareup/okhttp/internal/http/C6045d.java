package com.squareup.okhttp.internal.http;

/* renamed from: com.squareup.okhttp.internal.http.d */
public final class C6045d {
    /* renamed from: a */
    public static int m26134a(String str, int i, String str2) {
        while (i < str.length()) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static int m26133a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static int m26135b(java.lang.String r3, int r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0019 }
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x000f;
    L_0x000b:
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        return r3;
    L_0x000f:
        r3 = 0;
        r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r2 >= 0) goto L_0x0017;
    L_0x0015:
        r3 = 0;
        return r3;
    L_0x0017:
        r3 = (int) r0;
        return r3;
    L_0x0019:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.d.b(java.lang.String, int):int");
    }
}
