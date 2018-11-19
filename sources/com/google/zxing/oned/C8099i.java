package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5665b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.i */
public final class C8099i extends C7812u {
    public C5665b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        i = new StringBuilder("Can only encode EAN_13, but got ");
        i.append(barcodeFormat);
        throw new IllegalArgumentException(i.toString());
    }

    /* renamed from: a */
    public boolean[] mo7370a(java.lang.String r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r0 = r10.length();
        r1 = 13;
        if (r0 == r1) goto L_0x0020;
    L_0x0008:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Requested contents should be 13 digits long, but got ";
        r1.<init>(r2);
        r10 = r10.length();
        r1.append(r10);
        r10 = r1.toString();
        r0.<init>(r10);
        throw r0;
    L_0x0020:
        r0 = com.google.zxing.oned.C7811t.m33569a(r10);	 Catch:{ FormatException -> 0x0090 }
        if (r0 != 0) goto L_0x002e;	 Catch:{ FormatException -> 0x0090 }
    L_0x0026:
        r10 = new java.lang.IllegalArgumentException;	 Catch:{ FormatException -> 0x0090 }
        r0 = "Contents do not pass checksum";	 Catch:{ FormatException -> 0x0090 }
        r10.<init>(r0);	 Catch:{ FormatException -> 0x0090 }
        throw r10;	 Catch:{ FormatException -> 0x0090 }
    L_0x002e:
        r0 = 0;
        r1 = 1;
        r2 = r10.substring(r0, r1);
        r2 = java.lang.Integer.parseInt(r2);
        r3 = com.google.zxing.oned.C8098h.f29061a;
        r2 = r3[r2];
        r3 = 95;
        r3 = new boolean[r3];
        r4 = com.google.zxing.oned.C7811t.f28262b;
        r4 = com.google.zxing.oned.C7002o.m30505b(r3, r0, r4, r1);
        r4 = r4 + r0;
        r5 = r4;
        r4 = 1;
    L_0x0049:
        r6 = 6;
        if (r4 > r6) goto L_0x0069;
    L_0x004c:
        r7 = r4 + 1;
        r8 = r10.substring(r4, r7);
        r8 = java.lang.Integer.parseInt(r8);
        r6 = r6 - r4;
        r4 = r2 >> r6;
        r4 = r4 & r1;
        if (r4 != r1) goto L_0x005e;
    L_0x005c:
        r8 = r8 + 10;
    L_0x005e:
        r4 = com.google.zxing.oned.C7811t.f28266f;
        r4 = r4[r8];
        r4 = com.google.zxing.oned.C7002o.m30505b(r3, r5, r4, r0);
        r5 = r5 + r4;
        r4 = r7;
        goto L_0x0049;
    L_0x0069:
        r2 = com.google.zxing.oned.C7811t.f28263c;
        r0 = com.google.zxing.oned.C7002o.m30505b(r3, r5, r2, r0);
        r5 = r5 + r0;
        r0 = 7;
    L_0x0071:
        r2 = 12;
        if (r0 > r2) goto L_0x008a;
    L_0x0075:
        r2 = r0 + 1;
        r0 = r10.substring(r0, r2);
        r0 = java.lang.Integer.parseInt(r0);
        r4 = com.google.zxing.oned.C7811t.f28265e;
        r0 = r4[r0];
        r0 = com.google.zxing.oned.C7002o.m30505b(r3, r5, r0, r1);
        r5 = r5 + r0;
        r0 = r2;
        goto L_0x0071;
    L_0x008a:
        r10 = com.google.zxing.oned.C7811t.f28262b;
        com.google.zxing.oned.C7002o.m30505b(r3, r5, r10, r1);
        return r3;
    L_0x0090:
        r10 = new java.lang.IllegalArgumentException;
        r0 = "Illegal contents";
        r10.<init>(r0);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.i.a(java.lang.String):boolean[]");
    }
}
