package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5665b;
import com.google.zxing.pdf417.encoder.C5682c;
import com.google.zxing.pdf417.encoder.C5683d;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.google.zxing.pdf417.a */
public final class C7004a implements Writer {
    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            i = new StringBuilder("Can only encode PDF_417, but got ");
            i.append(barcodeFormat);
            throw new IllegalArgumentException(i.toString());
        }
        int i3;
        int i4;
        C5683d c5683d = new C5683d();
        barcodeFormat = 30;
        int i5 = 2;
        if (map != null) {
            if (map.containsKey(EncodeHintType.PDF417_COMPACT)) {
                c5683d.m24880a(Boolean.valueOf(map.get(EncodeHintType.PDF417_COMPACT).toString()).booleanValue());
            }
            if (map.containsKey(EncodeHintType.PDF417_COMPACTION)) {
                c5683d.m24877a(Compaction.valueOf(map.get(EncodeHintType.PDF417_COMPACTION).toString()));
            }
            if (map.containsKey(EncodeHintType.PDF417_DIMENSIONS)) {
                C5682c c5682c = (C5682c) map.get(EncodeHintType.PDF417_DIMENSIONS);
                c5683d.m24876a(c5682c.m24867b(), c5682c.m24866a(), c5682c.m24869d(), c5682c.m24868c());
            }
            if (map.containsKey(EncodeHintType.MARGIN)) {
                barcodeFormat = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
            }
            if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                i5 = Integer.parseInt(map.get(EncodeHintType.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(EncodeHintType.CHARACTER_SET)) {
                c5683d.m24879a(Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString()));
            }
            i3 = barcodeFormat;
            i4 = i5;
        } else {
            i4 = 2;
            i3 = 30;
        }
        return C7004a.m30509a(c5683d, str, i4, i, i2, i3);
    }

    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return encode(str, barcodeFormat, i, i2, null);
    }

    /* renamed from: a */
    private static C5665b m30509a(C5683d c5683d, String str, int i, int i2, int i3, int i4) throws WriterException {
        Object obj;
        c5683d.m24878a(str, i);
        str = c5683d.m24875a().m24861a(1, 4);
        if (((i3 > i2 ? 1 : 0) ^ (str[0].length < str.length ? 1 : 0)) != 0) {
            str = C7004a.m30511a(str);
            obj = 1;
        } else {
            obj = null;
        }
        i2 /= str[0].length;
        i3 /= str.length;
        if (i2 >= i3) {
            i2 = i3;
        }
        if (i2 <= 1) {
            return C7004a.m30510a(str, i4);
        }
        c5683d = c5683d.m24875a().m24861a(i2, i2 << 2);
        if (obj != null) {
            c5683d = C7004a.m30511a(c5683d);
        }
        return C7004a.m30510a(c5683d, i4);
    }

    /* renamed from: a */
    private static C5665b m30510a(byte[][] bArr, int i) {
        int i2 = i * 2;
        C5665b c5665b = new C5665b(bArr[0].length + i2, bArr.length + i2);
        c5665b.m24766a();
        int c = (c5665b.m24771c() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr[i3][i4] == (byte) 1) {
                    c5665b.m24770b(i4 + i, c);
                }
            }
            i3++;
            c--;
        }
        return c5665b;
    }

    /* renamed from: a */
    private static byte[][] m30511a(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, new int[]{bArr[0].length, bArr.length});
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }
}
