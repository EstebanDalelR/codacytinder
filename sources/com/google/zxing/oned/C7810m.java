package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5665b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.m */
public final class C7810m extends C7002o {
    /* renamed from: a */
    private static final int[] f28260a = new int[]{1, 1, 1, 1};
    /* renamed from: b */
    private static final int[] f28261b = new int[]{3, 1, 1};

    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        i = new StringBuilder("Can only encode ITF, but got ");
        i.append(barcodeFormat);
        throw new IllegalArgumentException(i.toString());
    }

    /* renamed from: a */
    public boolean[] mo7370a(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length > 80) {
            StringBuilder stringBuilder = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
            stringBuilder.append(length);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int b = C7002o.m30505b(zArr, 0, f28260a, true);
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 10);
                int digit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[18];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 * 2;
                    iArr[i3] = C7809l.f28255a[digit][i2];
                    iArr[i3 + 1] = C7809l.f28255a[digit2][i2];
                }
                b += C7002o.m30505b(zArr, b, iArr, true);
            }
            C7002o.m30505b(zArr, b, f28261b, true);
            return zArr;
        }
    }
}
