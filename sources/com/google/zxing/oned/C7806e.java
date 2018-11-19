package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5665b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.e */
public final class C7806e extends C7002o {
    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        i = new StringBuilder("Can only encode CODE_39, but got ");
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
        int i = length + 25;
        int i2 = 0;
        while (i2 < length) {
            int indexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i2));
            if (indexOf < 0) {
                stringBuilder = new StringBuilder("Bad contents: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            C7806e.m33546a(C7805d.f28244a[indexOf], iArr);
            indexOf = i;
            for (i = 0; i < 9; i++) {
                indexOf += iArr[i];
            }
            i2++;
            i = indexOf;
        }
        boolean[] zArr = new boolean[i];
        C7806e.m33546a(C7805d.f28245b, iArr);
        i = C7002o.m30505b(zArr, 0, iArr, true);
        int[] iArr2 = new int[]{1};
        int b = i + C7002o.m30505b(zArr, i, iArr2, false);
        for (i = 0; i < length; i++) {
            C7806e.m33546a(C7805d.f28244a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i))], iArr);
            b += C7002o.m30505b(zArr, b, iArr, true);
            b += C7002o.m30505b(zArr, b, iArr2, false);
        }
        C7806e.m33546a(C7805d.f28245b, iArr);
        C7002o.m30505b(zArr, b, iArr, true);
        return zArr;
    }

    /* renamed from: a */
    private static void m33546a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }
}
