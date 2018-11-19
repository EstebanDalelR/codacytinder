package com.google.android.gms.internal;

import java.nio.ByteBuffer;

abstract class ym extends yj {
    private ym(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    private static void m31665a(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = yj.m27495a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = yj.m27495a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = yj.m27495a(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = yj.m27495a(iArr[i2] ^ iArr[i3], 7);
    }

    /* renamed from: b */
    private static void m31667b(int[] iArr, byte[] bArr) {
        Object a = yj.m27498a(ByteBuffer.wrap(bArr));
        System.arraycopy(a, 0, iArr, 4, a.length);
    }

    /* renamed from: e */
    private static void m31669e(int[] iArr) {
        System.arraycopy(a, 0, iArr, 0, a.length);
    }

    /* renamed from: b */
    final void mo6909b(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m31665a(iArr2, 0, 4, 8, 12);
            m31665a(iArr2, 1, 5, 9, 13);
            m31665a(iArr2, 2, 6, 10, 14);
            m31665a(iArr2, 3, 7, 11, 15);
            m31665a(iArr2, 0, 5, 10, 15);
            m31665a(iArr2, 1, 6, 11, 12);
            m31665a(iArr2, 2, 7, 8, 13);
            m31665a(iArr2, 3, 4, 9, 14);
        }
    }
}
