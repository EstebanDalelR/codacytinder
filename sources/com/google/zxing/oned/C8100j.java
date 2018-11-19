package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5665b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.j */
public final class C8100j extends C7812u {
    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        i = new StringBuilder("Can only encode EAN_8, but got ");
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
        boolean[] zArr = new boolean[67];
        int b = C7002o.m30505b(zArr, 0, C7811t.f28262b, true) + 0;
        int i = 0;
        while (i <= 3) {
            int i2 = i + 1;
            b += C7002o.m30505b(zArr, b, C7811t.f28265e[Integer.parseInt(str.substring(i, i2))], false);
            i = i2;
        }
        b += C7002o.m30505b(zArr, b, C7811t.f28263c, false);
        i = 4;
        while (i <= 7) {
            int i3 = i + 1;
            b += C7002o.m30505b(zArr, b, C7811t.f28265e[Integer.parseInt(str.substring(i, i3))], true);
            i = i3;
        }
        C7002o.m30505b(zArr, b, C7811t.f28262b, true);
        return zArr;
    }
}
