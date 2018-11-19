package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C5664a;

/* renamed from: com.google.zxing.oned.h */
public final class C8098h extends C7811t {
    /* renamed from: a */
    static final int[] f29061a = new int[]{0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    /* renamed from: g */
    private final int[] f29062g;

    /* renamed from: a */
    protected int mo7599a(C5664a c5664a, int[] iArr, StringBuilder stringBuilder) throws NotFoundException {
        int[] iArr2 = this.f29062g;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int a = c5664a.m24751a();
        int i = iArr[1];
        iArr = null;
        int i2 = 0;
        while (iArr < 6 && i < a) {
            int a2 = C7811t.m33568a(c5664a, iArr2, i, f);
            stringBuilder.append((char) ((a2 % 10) + 48));
            int i3 = i;
            for (int i4 : iArr2) {
                i3 += i4;
            }
            if (a2 >= 10) {
                i2 = (1 << (5 - iArr)) | i2;
            }
            iArr++;
            i = i3;
        }
        C8098h.m34447a(stringBuilder, i2);
        int i5 = C7811t.m33571a(c5664a, i, true, c)[1];
        iArr = null;
        while (iArr < 6 && i5 < a) {
            stringBuilder.append((char) (C7811t.m33568a(c5664a, iArr2, i5, e) + 48));
            i2 = i5;
            for (int i6 : iArr2) {
                i2 += i6;
            }
            iArr++;
            i5 = i2;
        }
        return i5;
    }

    /* renamed from: a */
    BarcodeFormat mo7600a() {
        return BarcodeFormat.EAN_13;
    }

    /* renamed from: a */
    private static void m34447a(StringBuilder stringBuilder, int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f29061a[i2]) {
                stringBuilder.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.m30473a();
    }
}
