package com.google.zxing.oned;

import com.google.zxing.C5659b;
import com.google.zxing.C5674f;
import com.google.zxing.C5675g;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C5664a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.n */
public abstract class C7001n implements Reader {
    /* renamed from: a */
    public abstract C5674f mo7371a(int i, C5664a c5664a, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    public void reset() {
    }

    public C5674f decode(C5659b c5659b) throws NotFoundException, FormatException {
        return decode(c5659b, null);
    }

    public C5674f decode(C5659b c5659b, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return m30501a(c5659b, map);
        } catch (NotFoundException e) {
            Object obj = (map == null || !map.containsKey(DecodeHintType.TRY_HARDER)) ? null : 1;
            if (obj == null || !c5659b.m24727d()) {
                throw e;
            }
            c5659b = c5659b.m24728e();
            map = m30501a(c5659b, map);
            Map c = map.m24844c();
            int i = 270;
            if (c != null && c.containsKey(ResultMetadataType.ORIENTATION)) {
                i = (((Integer) c.get(ResultMetadataType.ORIENTATION)).intValue() + 270) % 360;
            }
            map.m24840a(ResultMetadataType.ORIENTATION, Integer.valueOf(i));
            C5675g[] b = map.m24843b();
            if (b != null) {
                c5659b = c5659b.m24725b();
                for (int i2 = 0; i2 < b.length; i2++) {
                    b[i2] = new C5675g((((float) c5659b) - b[i2].m24846b()) - 1.0f, b[i2].m24845a());
                }
            }
            return map;
        }
    }

    /* renamed from: a */
    private com.google.zxing.C5674f m30501a(com.google.zxing.C5659b r20, java.util.Map<com.google.zxing.DecodeHintType, ?> r21) throws com.google.zxing.NotFoundException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r19 = this;
        r0 = r21;
        r1 = r20.m24723a();
        r2 = r20.m24725b();
        r3 = new com.google.zxing.common.a;
        r3.<init>(r1);
        r4 = r2 >> 1;
        r5 = 0;
        r6 = 1;
        if (r0 == 0) goto L_0x001f;
    L_0x0015:
        r7 = com.google.zxing.DecodeHintType.TRY_HARDER;
        r7 = r0.containsKey(r7);
        if (r7 == 0) goto L_0x001f;
    L_0x001d:
        r7 = 1;
        goto L_0x0020;
    L_0x001f:
        r7 = 0;
    L_0x0020:
        if (r7 == 0) goto L_0x0025;
    L_0x0022:
        r8 = 8;
        goto L_0x0026;
    L_0x0025:
        r8 = 5;
    L_0x0026:
        r8 = r2 >> r8;
        r8 = java.lang.Math.max(r6, r8);
        if (r7 == 0) goto L_0x0030;
    L_0x002e:
        r7 = r2;
        goto L_0x0032;
    L_0x0030:
        r7 = 15;
    L_0x0032:
        r9 = r0;
        r0 = 0;
    L_0x0034:
        if (r0 >= r7) goto L_0x00eb;
    L_0x0036:
        r10 = r0 + 1;
        r11 = r10 / 2;
        r0 = r0 & 1;
        if (r0 != 0) goto L_0x0040;
    L_0x003e:
        r0 = 1;
        goto L_0x0041;
    L_0x0040:
        r0 = 0;
    L_0x0041:
        if (r0 == 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0045;
    L_0x0044:
        r11 = -r11;
    L_0x0045:
        r11 = r11 * r8;
        r11 = r11 + r4;
        if (r11 < 0) goto L_0x00eb;
    L_0x004a:
        if (r11 >= r2) goto L_0x00eb;
    L_0x004c:
        r0 = r20;
        r12 = r0.m24724a(r11, r3);	 Catch:{ NotFoundException -> 0x00dc }
        r3 = 0;
    L_0x0053:
        r13 = 2;
        if (r3 >= r13) goto L_0x00d3;
    L_0x0056:
        if (r3 != r6) goto L_0x0075;
    L_0x0058:
        r12.m24762c();
        if (r9 == 0) goto L_0x0075;
    L_0x005d:
        r13 = com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK;
        r13 = r9.containsKey(r13);
        if (r13 == 0) goto L_0x0075;
    L_0x0065:
        r13 = new java.util.EnumMap;
        r14 = com.google.zxing.DecodeHintType.class;
        r13.<init>(r14);
        r13.putAll(r9);
        r9 = com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK;
        r13.remove(r9);
        r9 = r13;
    L_0x0075:
        r13 = r19;
        r14 = r13.mo7371a(r11, r12, r9);	 Catch:{ ReaderException -> 0x00c4 }
        if (r3 != r6) goto L_0x00c3;	 Catch:{ ReaderException -> 0x00c4 }
    L_0x007d:
        r15 = com.google.zxing.ResultMetadataType.ORIENTATION;	 Catch:{ ReaderException -> 0x00c4 }
        r6 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;	 Catch:{ ReaderException -> 0x00c4 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ ReaderException -> 0x00c4 }
        r14.m24840a(r15, r6);	 Catch:{ ReaderException -> 0x00c4 }
        r6 = r14.m24843b();	 Catch:{ ReaderException -> 0x00c4 }
        if (r6 == 0) goto L_0x00c3;	 Catch:{ ReaderException -> 0x00c4 }
    L_0x008e:
        r15 = new com.google.zxing.g;	 Catch:{ ReaderException -> 0x00c4 }
        r0 = (float) r1;
        r16 = r1;
        r1 = r6[r5];	 Catch:{ ReaderException -> 0x00c6 }
        r1 = r1.m24845a();	 Catch:{ ReaderException -> 0x00c6 }
        r1 = r0 - r1;
        r17 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = r1 - r17;
        r18 = r2;
        r2 = r6[r5];	 Catch:{ ReaderException -> 0x00c8 }
        r2 = r2.m24846b();	 Catch:{ ReaderException -> 0x00c8 }
        r15.<init>(r1, r2);	 Catch:{ ReaderException -> 0x00c8 }
        r6[r5] = r15;	 Catch:{ ReaderException -> 0x00c8 }
        r1 = new com.google.zxing.g;	 Catch:{ ReaderException -> 0x00c8 }
        r2 = 1;
        r15 = r6[r2];	 Catch:{ ReaderException -> 0x00c9 }
        r15 = r15.m24845a();	 Catch:{ ReaderException -> 0x00c9 }
        r0 = r0 - r15;	 Catch:{ ReaderException -> 0x00c9 }
        r0 = r0 - r17;	 Catch:{ ReaderException -> 0x00c9 }
        r15 = r6[r2];	 Catch:{ ReaderException -> 0x00c9 }
        r15 = r15.m24846b();	 Catch:{ ReaderException -> 0x00c9 }
        r1.<init>(r0, r15);	 Catch:{ ReaderException -> 0x00c9 }
        r6[r2] = r1;	 Catch:{ ReaderException -> 0x00c9 }
    L_0x00c3:
        return r14;
    L_0x00c4:
        r16 = r1;
    L_0x00c6:
        r18 = r2;
    L_0x00c8:
        r2 = 1;
    L_0x00c9:
        r3 = r3 + 1;
        r1 = r16;
        r2 = r18;
        r0 = r20;
        r6 = 1;
        goto L_0x0053;
    L_0x00d3:
        r13 = r19;
        r16 = r1;
        r18 = r2;
        r2 = 1;
        r3 = r12;
        goto L_0x00e3;
    L_0x00dc:
        r13 = r19;
        r16 = r1;
        r18 = r2;
        r2 = 1;
    L_0x00e3:
        r0 = r10;
        r1 = r16;
        r2 = r18;
        r6 = 1;
        goto L_0x0034;
    L_0x00eb:
        r13 = r19;
        r0 = com.google.zxing.NotFoundException.m30473a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.n.a(com.google.zxing.b, java.util.Map):com.google.zxing.f");
    }

    /* renamed from: a */
    protected static void m30502a(C5664a c5664a, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        Arrays.fill(iArr, 0, length, 0);
        int a = c5664a.m24751a();
        if (i >= a) {
            throw NotFoundException.m30473a();
        }
        int a2 = c5664a.m24756a(i) ^ 1;
        int i2 = 0;
        while (i < a) {
            if ((c5664a.m24756a(i) ^ a2) == 0) {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                a2 = a2 == 0 ? 1 : 0;
            } else {
                iArr[i2] = iArr[i2] + 1;
            }
            i++;
        }
        if (i2 == length) {
            return;
        }
        if (i2 != length - 1 || i != a) {
            throw NotFoundException.m30473a();
        }
    }

    /* renamed from: a */
    protected static float m30500a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        f *= f3;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f5 = ((float) iArr2[i4]) * f3;
            float f6 = (float) iArr[i4];
            f6 = f6 > f5 ? f6 - f5 : f5 - f6;
            if (f6 > f) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f6;
        }
        return f4 / f2;
    }
}
