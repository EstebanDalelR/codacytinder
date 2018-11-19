package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class abx {
    /* renamed from: a */
    static final Charset f15002a = Charset.forName("UTF-8");
    /* renamed from: b */
    public static final byte[] f15003b;
    /* renamed from: c */
    private static Charset f15004c = Charset.forName("ISO-8859-1");
    /* renamed from: d */
    private static ByteBuffer f15005d;
    /* renamed from: e */
    private static abk f15006e = abk.m18816a(f15003b);

    static {
        byte[] bArr = new byte[0];
        f15003b = bArr;
        f15005d = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    static int m18855a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (i = i2; i < i2 + i3; i++) {
            i4 = (i4 * 31) + bArr[i];
        }
        return i4;
    }

    /* renamed from: a */
    public static int m18856a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m18857a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    public static int m18858a(byte[] bArr) {
        int length = bArr.length;
        int a = m18855a(length, bArr, 0, length);
        return a == 0 ? 1 : a;
    }

    /* renamed from: a */
    static <T> T m18859a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static <T> T m18860a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static boolean m18861a(zzfhe zzfhe) {
        return false;
    }
}
