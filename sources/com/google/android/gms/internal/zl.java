package com.google.android.gms.internal;

import java.util.Arrays;

final class zl {
    /* renamed from: a */
    private static long m20283a(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16)))) & 4294967295L;
    }

    /* renamed from: a */
    private static long m20284a(byte[] bArr, int i, int i2) {
        return (m20283a(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: a */
    private static void m20285a(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (j & 255));
            i2++;
            j >>= 8;
        }
    }

    /* renamed from: a */
    static byte[] m20286a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        Object obj = bArr2;
        if (bArr3.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long a;
        long a2 = m20284a(bArr3, 0, 0) & 67108863;
        int i = 2;
        int i2 = 3;
        long a3 = m20284a(bArr3, 3, 2) & 67108611;
        long a4 = m20284a(bArr3, 6, 4) & 67092735;
        long a5 = m20284a(bArr3, 9, 6) & 66076671;
        long a6 = m20284a(bArr3, 12, 8) & 1048575;
        long j = a3 * 5;
        long j2 = a4 * 5;
        long j3 = a5 * 5;
        long j4 = a6 * 5;
        byte[] bArr4 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = j6;
        long j8 = j7;
        long j9 = j8;
        int i3 = 0;
        while (i3 < obj.length) {
            int min = Math.min(16, obj.length - i3);
            System.arraycopy(obj, i3, bArr4, 0, min);
            bArr4[min] = (byte) 1;
            if (min != 16) {
                Arrays.fill(bArr4, min + 1, 17, (byte) 0);
            }
            long a7 = j9 + m20284a(bArr4, 0, 0);
            long a8 = j5 + m20284a(bArr4, i2, i);
            j9 = j6 + m20284a(bArr4, 6, 4);
            j6 = j7 + m20284a(bArr4, 9, 6);
            a = j8 + (m20284a(bArr4, 12, 8) | ((long) (bArr4[16] << 24)));
            j7 = ((((a7 * a2) + (a8 * j4)) + (j9 * j3)) + (j6 * j2)) + (a * j);
            j8 = ((((a7 * a3) + (a8 * a2)) + (j9 * j4)) + (j6 * j3)) + (a * j2);
            long j10 = ((((a7 * a4) + (a8 * a3)) + (j9 * a2)) + (j6 * j4)) + (a * j3);
            long j11 = ((((a7 * a5) + (a8 * a4)) + (j9 * a3)) + (j6 * a2)) + (a * j4);
            j6 = ((((a7 * a6) + (a8 * a5)) + (j9 * a4)) + (j6 * a3)) + (a * a2);
            j5 = j7 & 67108863;
            j7 = j8 + (j7 >> 26);
            j8 = j7 & 67108863;
            j7 = j10 + (j7 >> 26);
            j9 = j7 & 67108863;
            j7 = j11 + (j7 >> 26);
            j10 = j7 & 67108863;
            j7 = j6 + (j7 >> 26);
            j6 = j7 & 67108863;
            j7 = j5 + ((j7 >> 26) * 5);
            j5 = j7 & 67108863;
            j7 = j8 + (j7 >> 26);
            i3 += 16;
            j8 = j6;
            j6 = j9;
            i = 2;
            i2 = 3;
            j9 = j5;
            j5 = j7;
            j7 = j10;
        }
        long j12 = j6 + (j5 >> 26);
        long j13 = j12 & 67108863;
        j12 = j7 + (j12 >> 26);
        a3 = j12 & 67108863;
        j12 = j8 + (j12 >> 26);
        a4 = j12 & 67108863;
        j12 = j9 + ((j12 >> 26) * 5);
        j = j12 & 67108863;
        j12 = (j5 & 67108863) + (j12 >> 26);
        a = j + 5;
        long j14 = a & 67108863;
        a = j12 + (a >> 26);
        a5 = a & 67108863;
        a = j13 + (a >> 26);
        a6 = a & 67108863;
        a = a3 + (a >> 26);
        j2 = a & 67108863;
        j3 = (a4 + (a >> 26)) - 67108864;
        a = j3 >> 63;
        long j15 = j & a;
        j = j12 & a;
        j12 = j13 & a;
        j13 = a3 & a;
        a3 = a4 & a;
        j4 = a ^ -1;
        j14 = j15 | (j14 & j4);
        j15 = j | (a5 & j4);
        a4 = j12 | (a6 & j4);
        j12 = j13 | (j2 & j4);
        j13 = a3 | (j3 & j4);
        j14 = (j14 | (j15 << 26)) & 4294967295L;
        j15 = ((j15 >> 6) | (a4 << 20)) & 4294967295L;
        a3 = ((a4 >> 12) | (j12 << 14)) & 4294967295L;
        a4 = j14 + m20283a(bArr3, 16);
        j14 = (j15 + m20283a(bArr3, 20)) + (a4 >> 32);
        j15 = j14 & 4294967295L;
        long a9 = (a3 + m20283a(bArr3, 24)) + (j14 >> 32);
        long j16 = a9 & 4294967295L;
        long a10 = (((((j12 >> 18) | (j13 << 8)) & 4294967295L) + m20283a(bArr3, 28)) + (a9 >> 32)) & 4294967295L;
        byte[] bArr5 = new byte[16];
        m20285a(bArr5, a4 & 4294967295L, 0);
        m20285a(bArr5, j15, 4);
        m20285a(bArr5, j16, 8);
        m20285a(bArr5, a10, 12);
        return bArr5;
    }
}
