package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5665b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.p */
public final class C7003p implements Writer {
    /* renamed from: a */
    private final C8099i f25460a = new C8099i();

    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return encode(str, barcodeFormat, i, i2, null);
    }

    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f25460a.encode(C7003p.m30508a(str), BarcodeFormat.EAN_13, i, i2, map);
        }
        i = new StringBuilder("Can only encode UPC-A, but got ");
        i.append(barcodeFormat);
        throw new IllegalArgumentException(i.toString());
    }

    /* renamed from: a */
    private static String m30508a(String str) {
        StringBuilder stringBuilder;
        int length = str.length();
        if (length == 11) {
            int i = 0;
            for (length = 0; length < 11; length++) {
                i += (str.charAt(length) - 48) * (length % 2 == 0 ? 3 : 1);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append((1000 - i) % 10);
            str = stringBuilder.toString();
        } else if (length != 12) {
            StringBuilder stringBuilder2 = new StringBuilder("Requested contents should be 11 or 12 digits long, but got ");
            stringBuilder2.append(str.length());
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        stringBuilder = new StringBuilder("0");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
