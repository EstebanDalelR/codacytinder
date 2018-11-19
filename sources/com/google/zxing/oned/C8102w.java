package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5665b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.w */
public final class C8102w extends C7812u {
    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        i = new StringBuilder("Can only encode UPC_E, but got ");
        i.append(barcodeFormat);
        throw new IllegalArgumentException(i.toString());
    }

    /* renamed from: a */
    public boolean[] mo7370a(String str) {
        if (str.length() != 8) {
            StringBuilder stringBuilder = new StringBuilder("Requested contents should be 8 digits long, but got ");
            stringBuilder.append(str.length());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i = C8101v.f29063a[Integer.parseInt(str.substring(7, 8))];
        boolean[] zArr = new boolean[51];
        int b = C7002o.m30505b(zArr, 0, C7811t.f28262b, true) + 0;
        int i2 = 1;
        while (i2 <= 6) {
            int i3 = i2 + 1;
            int parseInt = Integer.parseInt(str.substring(i2, i3));
            if (((i >> (6 - i2)) & 1) == 1) {
                parseInt += 10;
            }
            b += C7002o.m30505b(zArr, b, C7811t.f28266f[parseInt], false);
            i2 = i3;
        }
        C7002o.m30505b(zArr, b, C7811t.f28264d, false);
        return zArr;
    }
}
