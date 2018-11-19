package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5665b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.g */
public class C7808g extends C7002o {
    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        i = new StringBuilder("Can only encode CODE_93, but got ");
        i.append(barcodeFormat);
        throw new IllegalArgumentException(i.toString());
    }

    /* renamed from: a */
    public boolean[] mo7370a(String str) {
        int length = str.length();
        if (length > 80) {
            StringBuilder stringBuilder = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
            stringBuilder.append(length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[((((str.length() + 2) + 2) * 9) + 1)];
        C7808g.m33557a(C7807f.f28250a[47], iArr);
        int i = 0;
        int a = C7808g.m33556a(zArr, 0, iArr, true);
        while (i < length) {
            C7808g.m33557a(C7807f.f28250a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], iArr);
            a += C7808g.m33556a(zArr, a, iArr, true);
            i++;
        }
        length = C7808g.m33555a(str, 20);
        C7808g.m33557a(C7807f.f28250a[length], iArr);
        a += C7808g.m33556a(zArr, a, iArr, true);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(length));
        C7808g.m33557a(C7807f.f28250a[C7808g.m33555a(stringBuilder2.toString(), 15)], iArr);
        a += C7808g.m33556a(zArr, a, iArr, true);
        C7808g.m33557a(C7807f.f28250a[47], iArr);
        zArr[a + C7808g.m33556a(zArr, a, iArr, true)] = true;
        return zArr;
    }

    /* renamed from: a */
    private static void m33557a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: a */
    protected static int m33556a(boolean[] zArr, int i, int[] iArr, boolean z) {
        z = iArr.length;
        int i2 = i;
        boolean z2 = false;
        while (z2 < z) {
            int i3 = i2 + 1;
            zArr[i2] = iArr[z2] != 0;
            z2++;
            i2 = i3;
        }
        return 9;
    }

    /* renamed from: a */
    private static int m33555a(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }
}
