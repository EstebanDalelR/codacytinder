package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5665b;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.p129a.C5689c;
import com.google.zxing.qrcode.p129a.C5692f;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.a */
public final class C7005a implements Writer {
    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return encode(str, barcodeFormat, i, i2, null);
    }

    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.QR_CODE) {
            i = new StringBuilder("Can only encode QR_CODE, but got ");
            i.append(barcodeFormat);
            throw new IllegalArgumentException(i.toString());
        } else {
            if (i >= 0) {
                if (i2 >= 0) {
                    ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
                    int i3 = 4;
                    if (map != null) {
                        if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                            errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(EncodeHintType.ERROR_CORRECTION).toString());
                        }
                        if (map.containsKey(EncodeHintType.MARGIN)) {
                            i3 = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
                        }
                    }
                    return C7005a.m30512a(C5689c.m24911a(str, errorCorrectionLevel, (Map) map), i, i2, i3);
                }
            }
            barcodeFormat = new StringBuilder("Requested dimensions are too small: ");
            barcodeFormat.append(i);
            barcodeFormat.append(120);
            barcodeFormat.append(i2);
            throw new IllegalArgumentException(barcodeFormat.toString());
        }
    }

    /* renamed from: a */
    private static C5665b m30512a(C5692f c5692f, int i, int i2, int i3) {
        c5692f = c5692f.m24956a();
        if (c5692f == null) {
            throw new IllegalStateException();
        }
        int b = c5692f.m24904b();
        int a = c5692f.m24900a();
        i3 <<= 1;
        int i4 = b + i3;
        i3 += a;
        i = Math.max(i, i4);
        i2 = Math.max(i2, i3);
        i3 = Math.min(i / i4, i2 / i3);
        i4 = (i - (b * i3)) / 2;
        int i5 = (i2 - (a * i3)) / 2;
        C5665b c5665b = new C5665b(i, i2);
        i2 = 0;
        while (i2 < a) {
            int i6 = i4;
            int i7 = 0;
            while (i7 < b) {
                if (c5692f.m24899a(i7, i2) == (byte) 1) {
                    c5665b.m24767a(i6, i5, i3, i3);
                }
                i7++;
                i6 += i3;
            }
            i2++;
            i5 += i3;
        }
        return c5665b;
    }
}
