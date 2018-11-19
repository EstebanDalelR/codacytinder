package jp.wasabeef.glide.transformations.p457b;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

/* renamed from: jp.wasabeef.glide.transformations.b.a */
public class C15795a {
    /* renamed from: a */
    public static Bitmap m59801a(Bitmap bitmap, int i, boolean z) {
        Bitmap bitmap2;
        int i2 = i;
        if (z) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = bitmap.copy(bitmap.getConfig(), true);
        }
        if (i2 < 1) {
            return null;
        }
        Bitmap bitmap3;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i6 = width * height;
        int[] iArr2 = new int[i6];
        bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i7 = width - 1;
        int i8 = height - 1;
        int i9 = (i2 + i2) + 1;
        int[] iArr3 = new int[i6];
        int[] iArr4 = new int[i6];
        int[] iArr5 = new int[i6];
        int[] iArr6 = new int[Math.max(width, height)];
        int i10 = (i9 + 1) >> 1;
        i10 *= i10;
        i6 = i10 * 256;
        int[] iArr7 = new int[i6];
        for (int i11 = 0; i11 < i6; i11++) {
            iArr7[i11] = i11 / i10;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, new int[]{i9, 3});
        i10 = i2 + 1;
        i6 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i6 < height) {
            bitmap3 = bitmap2;
            i3 = -i2;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i3 <= i2) {
                i4 = i8;
                i5 = height;
                i8 = iArr2[i12 + Math.min(i7, Math.max(i3, 0))];
                int[] iArr9 = iArr8[i3 + i2];
                iArr9[0] = (i8 & 16711680) >> 16;
                iArr9[1] = (i8 & 65280) >> 8;
                iArr9[2] = i8 & 255;
                i8 = i10 - Math.abs(i3);
                i14 += iArr9[0] * i8;
                i15 += iArr9[1] * i8;
                i16 += iArr9[2] * i8;
                if (i3 > 0) {
                    i17 += iArr9[0];
                    i18 += iArr9[1];
                    i19 += iArr9[2];
                } else {
                    i20 += iArr9[0];
                    i21 += iArr9[1];
                    i22 += iArr9[2];
                }
                i3++;
                height = i5;
                i8 = i4;
            }
            i4 = i8;
            i5 = height;
            i8 = i2;
            i3 = 0;
            while (i3 < width) {
                iArr3[i12] = iArr7[i14];
                iArr4[i12] = iArr7[i15];
                iArr5[i12] = iArr7[i16];
                i14 -= i20;
                i15 -= i21;
                i16 -= i22;
                int[] iArr10 = iArr8[((i8 - i2) + i9) % i9];
                i20 -= iArr10[0];
                i21 -= iArr10[1];
                i22 -= iArr10[2];
                if (i6 == 0) {
                    iArr = iArr7;
                    iArr6[i3] = Math.min((i3 + i2) + 1, i7);
                } else {
                    iArr = iArr7;
                }
                int i23 = iArr2[i13 + iArr6[i3]];
                iArr10[0] = (i23 & 16711680) >> 16;
                iArr10[1] = (i23 & 65280) >> 8;
                iArr10[2] = i23 & 255;
                i17 += iArr10[0];
                i18 += iArr10[1];
                i19 += iArr10[2];
                i14 += i17;
                i15 += i18;
                i16 += i19;
                i8 = (i8 + 1) % i9;
                iArr10 = iArr8[i8 % i9];
                i20 += iArr10[0];
                i21 += iArr10[1];
                i22 += iArr10[2];
                i17 -= iArr10[0];
                i18 -= iArr10[1];
                i19 -= iArr10[2];
                i12++;
                i3++;
                iArr7 = iArr;
            }
            iArr = iArr7;
            i13 += width;
            i6++;
            bitmap2 = bitmap3;
            height = i5;
            i8 = i4;
        }
        bitmap3 = bitmap2;
        i4 = i8;
        i5 = height;
        iArr = iArr7;
        i3 = 0;
        while (i3 < width) {
            int[] iArr11;
            int abs;
            i7 = -i2;
            i8 = i7 * width;
            height = 0;
            i6 = 0;
            i23 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            while (i7 <= i2) {
                iArr11 = iArr6;
                i18 = Math.max(0, i8) + i3;
                int[] iArr12 = iArr8[i7 + i2];
                iArr12[0] = iArr3[i18];
                iArr12[1] = iArr4[i18];
                iArr12[2] = iArr5[i18];
                abs = i10 - Math.abs(i7);
                height += iArr3[i18] * abs;
                i6 += iArr4[i18] * abs;
                i23 += iArr5[i18] * abs;
                if (i7 > 0) {
                    i12 += iArr12[0];
                    i13 += iArr12[1];
                    i14 += iArr12[2];
                } else {
                    i15 += iArr12[0];
                    i16 += iArr12[1];
                    i17 += iArr12[2];
                }
                abs = i4;
                if (i7 < abs) {
                    i8 += width;
                }
                i7++;
                i4 = abs;
                iArr6 = iArr11;
            }
            iArr11 = iArr6;
            abs = i4;
            i8 = i3;
            i18 = i13;
            i19 = i14;
            i7 = 0;
            i13 = i2;
            i14 = i12;
            i12 = i23;
            i23 = i6;
            i6 = height;
            height = i5;
            while (i7 < height) {
                iArr2[i8] = (((iArr2[i8] & -16777216) | (iArr[i6] << 16)) | (iArr[i23] << 8)) | iArr[i12];
                i6 -= i15;
                i23 -= i16;
                i12 -= i17;
                int[] iArr13 = iArr8[((i13 - i2) + i9) % i9];
                i15 -= iArr13[0];
                i16 -= iArr13[1];
                i17 -= iArr13[2];
                if (i3 == 0) {
                    iArr11[i7] = Math.min(i7 + i10, abs) * width;
                }
                i2 = iArr11[i7] + i3;
                iArr13[0] = iArr3[i2];
                iArr13[1] = iArr4[i2];
                iArr13[2] = iArr5[i2];
                i14 += iArr13[0];
                i18 += iArr13[1];
                i19 += iArr13[2];
                i6 += i14;
                i23 += i18;
                i12 += i19;
                i13 = (i13 + 1) % i9;
                int[] iArr14 = iArr8[i13];
                i15 += iArr14[0];
                i16 += iArr14[1];
                i17 += iArr14[2];
                i14 -= iArr14[0];
                i18 -= iArr14[1];
                i19 -= iArr14[2];
                i8 += width;
                i7++;
                i2 = i;
            }
            i3++;
            i4 = abs;
            i5 = height;
            iArr6 = iArr11;
            i2 = i;
        }
        bitmap3.setPixels(iArr2, 0, width, 0, 0, width, i5);
        return bitmap3;
    }
}
