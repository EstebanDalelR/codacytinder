package com.foursquare.internal.util;

import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.foursquare.internal.util.a */
public class C1939a {
    /* renamed from: a */
    private static char[] f5218a = new char[64];
    /* renamed from: b */
    private static byte[] f5219b = new byte[ProfileEditingConfig.DEFAULT_MAX_LENGTH];

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            int i2 = i + 1;
            f5218a[i] = c;
            c = (char) (c + 1);
            i = i2;
        }
        c = 'a';
        while (c <= 'z') {
            i2 = i + 1;
            f5218a[i] = c;
            c = (char) (c + 1);
            i = i2;
        }
        c = '0';
        while (c <= '9') {
            i2 = i + 1;
            f5218a[i] = c;
            c = (char) (c + 1);
            i = i2;
        }
        int i3 = i + 1;
        f5218a[i] = '+';
        f5218a[i3] = '/';
        for (int i4 = 0; i4 < f5219b.length; i4++) {
            f5219b[i4] = (byte) -1;
        }
        for (int i5 = 0; i5 < 64; i5++) {
            f5219b[f5218a[i5]] = (byte) i5;
        }
    }

    /* renamed from: a */
    public static char[] m6810a(byte[] bArr) {
        return C1939a.m6811a(bArr, bArr.length);
    }

    /* renamed from: a */
    public static char[] m6811a(byte[] bArr, int i) {
        int i2 = ((i * 4) + 2) / 3;
        char[] cArr = new char[(((i + 2) / 3) * 4)];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5;
            int i6;
            int i7 = i3 + 1;
            i3 = bArr[i3] & 255;
            if (i7 < i) {
                i5 = i7 + 1;
                i7 = bArr[i7] & 255;
            } else {
                i5 = i7;
                i7 = 0;
            }
            if (i5 < i) {
                i6 = i5 + 1;
                i5 = bArr[i5] & 255;
            } else {
                i6 = i5;
                i5 = 0;
            }
            int i8 = i3 >>> 2;
            i3 = ((i3 & 3) << 4) | (i7 >>> 4);
            i7 = ((i7 & 15) << 2) | (i5 >>> 6);
            i5 &= 63;
            int i9 = i4 + 1;
            cArr[i4] = f5218a[i8];
            i4 = i9 + 1;
            cArr[i9] = f5218a[i3];
            char c = '=';
            cArr[i4] = i4 < i2 ? f5218a[i7] : '=';
            i4++;
            if (i4 < i2) {
                c = f5218a[i5];
            }
            cArr[i4] = c;
            i4++;
            i3 = i6;
        }
        return cArr;
    }

    /* renamed from: a */
    public static byte[] m6808a(String str) {
        return C1939a.m6809a(str.toCharArray());
    }

    /* renamed from: a */
    public static byte[] m6809a(char[] cArr) {
        int length = cArr.length;
        if (length % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (length > 0 && cArr[length - 1] == '=') {
            length--;
        }
        int i = (length * 3) / 4;
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4;
            int i5 = i2 + 1;
            char c = cArr[i2];
            int i6 = i5 + 1;
            char c2 = cArr[i5];
            int i7 = 65;
            if (i6 < length) {
                i4 = i6 + 1;
                i6 = cArr[i6];
            } else {
                i4 = i6;
                i6 = 65;
            }
            if (i4 < length) {
                i7 = i4 + 1;
                char c3 = cArr[i4];
                i4 = i7;
                i7 = c3;
            }
            if (c <= '' && c2 <= '' && i6 <= 127) {
                if (i7 <= 127) {
                    byte b = f5219b[c];
                    byte b2 = f5219b[c2];
                    byte b3 = f5219b[i6];
                    byte b4 = f5219b[i7];
                    if (b >= (byte) 0 && b2 >= (byte) 0 && b3 >= (byte) 0) {
                        if (b4 >= (byte) 0) {
                            i2 = (b << 2) | (b2 >>> 4);
                            i5 = ((b2 & 15) << 4) | (b3 >>> 2);
                            i6 = ((b3 & 3) << 6) | b4;
                            i7 = i3 + 1;
                            bArr[i3] = (byte) i2;
                            if (i7 < i) {
                                i2 = i7 + 1;
                                bArr[i7] = (byte) i5;
                            } else {
                                i2 = i7;
                            }
                            if (i2 < i) {
                                i3 = i2 + 1;
                                bArr[i2] = (byte) i6;
                            } else {
                                i3 = i2;
                            }
                            i2 = i4;
                        }
                    }
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
            }
            throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
        }
        return bArr;
    }
}
