package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.aztec.p127a.C5653a;
import com.google.zxing.aztec.p127a.C5654c;
import com.google.zxing.common.C5665b;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.google.zxing.aztec.a */
public final class C6993a implements Writer {
    /* renamed from: a */
    private static final Charset f25459a = Charset.forName("ISO-8859-1");

    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2) {
        return encode(str, barcodeFormat, i, i2, null);
    }

    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        Charset charset;
        int i3;
        int parseInt;
        Charset charset2 = f25459a;
        int i4 = 33;
        if (map != null) {
            if (map.containsKey(EncodeHintType.CHARACTER_SET)) {
                charset2 = Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString());
            }
            if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                i4 = Integer.parseInt(map.get(EncodeHintType.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(EncodeHintType.AZTEC_LAYERS)) {
                charset = charset2;
                i3 = i4;
                parseInt = Integer.parseInt(map.get(EncodeHintType.AZTEC_LAYERS).toString());
                return C6993a.m30477a(str, barcodeFormat, i, i2, charset, i3, parseInt);
            }
            charset = charset2;
            i3 = i4;
        } else {
            charset = charset2;
            i3 = 33;
        }
        parseInt = 0;
        return C6993a.m30477a(str, barcodeFormat, i, i2, charset, i3, parseInt);
    }

    /* renamed from: a */
    private static C5665b m30477a(String str, BarcodeFormat barcodeFormat, int i, int i2, Charset charset, int i3, int i4) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return C6993a.m30476a(C5654c.m24695a(str.getBytes(charset), i3, i4), i, i2);
        }
        i = new StringBuilder("Can only encode AZTEC, but got ");
        i.append(barcodeFormat);
        throw new IllegalArgumentException(i.toString());
    }

    /* renamed from: a */
    private static C5665b m30476a(C5653a c5653a, int i, int i2) {
        c5653a = c5653a.m24688a();
        if (c5653a == null) {
            throw new IllegalStateException();
        }
        int b = c5653a.m24769b();
        int c = c5653a.m24771c();
        i = Math.max(i, b);
        i2 = Math.max(i2, c);
        int min = Math.min(i / b, i2 / c);
        int i3 = (i - (b * min)) / 2;
        int i4 = (i2 - (c * min)) / 2;
        C5665b c5665b = new C5665b(i, i2);
        i2 = 0;
        while (i2 < c) {
            int i5 = i3;
            int i6 = 0;
            while (i6 < b) {
                if (c5653a.m24768a(i6, i2)) {
                    c5665b.m24767a(i5, i4, min, min);
                }
                i6++;
                i5 += min;
            }
            i2++;
            i4 += min;
        }
        return c5665b;
    }
}
