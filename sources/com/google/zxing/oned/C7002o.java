package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5665b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.o */
public abstract class C7002o implements Writer {
    /* renamed from: a */
    public int mo7372a() {
        return 10;
    }

    /* renamed from: a */
    public abstract boolean[] mo7370a(String str);

    public final C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return encode(str, barcodeFormat, i, i2, null);
    }

    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty() != null) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i >= 0) {
            if (i2 >= 0) {
                barcodeFormat = mo7372a();
                if (map != null && map.containsKey(EncodeHintType.MARGIN)) {
                    barcodeFormat = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
                }
                return C7002o.m30504a(mo7370a(str), i, i2, barcodeFormat);
            }
        }
        barcodeFormat = new StringBuilder("Negative size is not allowed. Input: ");
        barcodeFormat.append(i);
        barcodeFormat.append(120);
        barcodeFormat.append(i2);
        throw new IllegalArgumentException(barcodeFormat.toString());
    }

    /* renamed from: a */
    private static C5665b m30504a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        i3 += length;
        i = Math.max(i, i3);
        i2 = Math.max(1, i2);
        i3 = i / i3;
        int i4 = (i - (length * i3)) / 2;
        C5665b c5665b = new C5665b(i, i2);
        int i5 = i4;
        i4 = 0;
        while (i4 < length) {
            if (zArr[i4]) {
                c5665b.m24767a(i5, 0, i3, i2);
            }
            i4++;
            i5 += i3;
        }
        return c5665b;
    }

    /* renamed from: b */
    protected static int m30505b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = i;
        boolean z2 = z;
        i = 0;
        z = false;
        while (i < length) {
            int i3 = iArr[i];
            int i4 = i2;
            i2 = 0;
            while (i2 < i3) {
                int i5 = i4 + 1;
                zArr[i4] = z2;
                i2++;
                i4 = i5;
            }
            z += i3;
            z2 = !z2;
            i++;
            i2 = i4;
        }
        return z;
    }
}
