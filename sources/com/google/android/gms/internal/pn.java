package com.google.android.gms.internal;

import android.util.Base64;

public final class pn {
    /* renamed from: a */
    public static String m20136a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? 11 : 2);
    }

    /* renamed from: a */
    public static byte[] m20137a(String str, boolean z) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, z ? 11 : 2);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        String str2 = "Unable to decode ";
        str = String.valueOf(str);
        throw new IllegalArgumentException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
