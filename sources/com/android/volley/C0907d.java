package com.android.volley;

import java.security.MessageDigest;

/* renamed from: com.android.volley.d */
class C0907d {
    /* renamed from: a */
    private static final char[] f2374a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    private static String m3048a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = f2374a[i2 >>> 4];
            cArr[i3 + 1] = f2374a[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static String m3047a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            str = str.getBytes("UTF-8");
            instance.update(str, 0, str.length);
            return C0907d.m3048a(instance.digest());
        } catch (String str2) {
            str2.printStackTrace();
            return null;
        } catch (String str22) {
            str22.printStackTrace();
            return null;
        }
    }
}
