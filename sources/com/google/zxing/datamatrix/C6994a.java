package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5660c;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.C5665b;
import com.google.zxing.datamatrix.encoder.C5667e;
import com.google.zxing.datamatrix.encoder.C5670i;
import com.google.zxing.datamatrix.encoder.C5671j;
import com.google.zxing.datamatrix.encoder.C5672k;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.p129a.C5687b;
import java.util.Map;

/* renamed from: com.google.zxing.datamatrix.a */
public final class C6994a implements Writer {
    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2) {
        return encode(str, barcodeFormat, i, i2, null);
    }

    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            i = new StringBuilder("Can only encode DATA_MATRIX, but got ");
            i.append(barcodeFormat);
            throw new IllegalArgumentException(i.toString());
        } else {
            if (i >= 0) {
                if (i2 >= 0) {
                    C5660c c5660c;
                    SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
                    C5660c c5660c2 = 0;
                    if (map != null) {
                        SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
                        if (symbolShapeHint2 != null) {
                            symbolShapeHint = symbolShapeHint2;
                        }
                        c5660c = (C5660c) map.get(EncodeHintType.MIN_SIZE);
                        if (c5660c == null) {
                            c5660c = 0;
                        }
                        C5660c c5660c3 = (C5660c) map.get(EncodeHintType.MAX_SIZE);
                        if (c5660c3 != null) {
                            c5660c2 = c5660c3;
                        }
                    } else {
                        c5660c = 0;
                    }
                    str = C5671j.m24817a(str, symbolShapeHint, c5660c, c5660c2);
                    C5672k a = C5672k.m24827a(str.length(), symbolShapeHint, c5660c, c5660c2, true);
                    i = new C5667e(C5670i.m24811a(str, a), a.m24832b(), a.m24834c());
                    i.m24787a();
                    return C6994a.m30478a(i, a);
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
    private static C5665b m30478a(C5667e c5667e, C5672k c5672k) {
        int b = c5672k.m24832b();
        int c = c5672k.m24834c();
        C5687b c5687b = new C5687b(c5672k.m24835d(), c5672k.m24836e());
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            int i3;
            int i4;
            if (i2 % c5672k.f21020c == 0) {
                i3 = 0;
                for (i4 = 0; i4 < c5672k.m24835d(); i4++) {
                    c5687b.m24903a(i3, i, i4 % 2 == 0);
                    i3++;
                }
                i++;
            }
            i3 = 0;
            for (i4 = 0; i4 < b; i4++) {
                if (i4 % c5672k.f21019b == 0) {
                    c5687b.m24903a(i3, i, true);
                    i3++;
                }
                c5687b.m24903a(i3, i, c5667e.m24788a(i4, i2));
                i3++;
                if (i4 % c5672k.f21019b == c5672k.f21019b - 1) {
                    c5687b.m24903a(i3, i, i2 % 2 == 0);
                    i3++;
                }
            }
            i++;
            if (i2 % c5672k.f21020c == c5672k.f21020c - 1) {
                i3 = 0;
                for (i4 = 0; i4 < c5672k.m24835d(); i4++) {
                    c5687b.m24903a(i3, i, true);
                    i3++;
                }
                i++;
            }
        }
        return C6994a.m30479a(c5687b);
    }

    /* renamed from: a */
    private static C5665b m30479a(C5687b c5687b) {
        int b = c5687b.m24904b();
        int a = c5687b.m24900a();
        C5665b c5665b = new C5665b(b, a);
        c5665b.m24766a();
        for (int i = 0; i < b; i++) {
            for (int i2 = 0; i2 < a; i2++) {
                if (c5687b.m24899a(i, i2) == (byte) 1) {
                    c5665b.m24770b(i, i2);
                }
            }
        }
        return c5665b;
    }
}
