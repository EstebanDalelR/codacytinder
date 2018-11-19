package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5674f;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C5664a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.t */
public abstract class C7811t extends C7001n {
    /* renamed from: b */
    static final int[] f28262b = new int[]{1, 1, 1};
    /* renamed from: c */
    static final int[] f28263c = new int[]{1, 1, 1, 1, 1};
    /* renamed from: d */
    static final int[] f28264d = new int[]{1, 1, 1, 1, 1, 1};
    /* renamed from: e */
    static final int[][] f28265e = new int[][]{new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
    /* renamed from: f */
    static final int[][] f28266f = new int[20][];
    /* renamed from: a */
    private final StringBuilder f28267a;
    /* renamed from: g */
    private final C5679s f28268g;
    /* renamed from: h */
    private final C5676k f28269h;

    /* renamed from: a */
    protected abstract int mo7599a(C5664a c5664a, int[] iArr, StringBuilder stringBuilder) throws NotFoundException;

    /* renamed from: a */
    abstract BarcodeFormat mo7600a();

    static {
        int i = 10;
        System.arraycopy(f28265e, 0, f28266f, 0, 10);
        while (i < 20) {
            int[] iArr = f28265e[i - 10];
            int[] iArr2 = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr2[i2] = iArr[(iArr.length - i2) - 1];
            }
            f28266f[i] = iArr2;
            i++;
        }
    }

    /* renamed from: a */
    static int[] m33570a(C5664a c5664a) throws NotFoundException {
        int[] iArr = new int[f28262b.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, f28262b.length, 0);
            iArr2 = C7811t.m33572a(c5664a, i, false, f28262b, iArr);
            i = iArr2[0];
            int i2 = iArr2[1];
            int i3 = i - (i2 - i);
            if (i3 >= 0) {
                z = c5664a.m24757a(i3, i, false);
            }
            i = i2;
        }
        return iArr2;
    }

    /* renamed from: a */
    public C5674f mo7371a(int i, C5664a c5664a, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return m33576a(i, c5664a, C7811t.m33570a(c5664a), (Map) map);
    }

    /* renamed from: a */
    public com.google.zxing.C5674f m33576a(int r12, com.google.zxing.common.C5664a r13, int[] r14, java.util.Map<com.google.zxing.DecodeHintType, ?> r15) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r0 = 0;
        if (r15 != 0) goto L_0x0005;
    L_0x0003:
        r1 = r0;
        goto L_0x000d;
    L_0x0005:
        r1 = com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK;
        r1 = r15.get(r1);
        r1 = (com.google.zxing.ResultPointCallback) r1;
    L_0x000d:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = 1;
        r4 = 0;
        if (r1 == 0) goto L_0x0023;
    L_0x0013:
        r5 = new com.google.zxing.g;
        r6 = r14[r4];
        r7 = r14[r3];
        r6 = r6 + r7;
        r6 = (float) r6;
        r6 = r6 / r2;
        r7 = (float) r12;
        r5.<init>(r6, r7);
        r1.foundPossibleResultPoint(r5);
    L_0x0023:
        r5 = r11.f28267a;
        r5.setLength(r4);
        r6 = r11.mo7599a(r13, r14, r5);
        if (r1 == 0) goto L_0x0038;
    L_0x002e:
        r7 = new com.google.zxing.g;
        r8 = (float) r6;
        r9 = (float) r12;
        r7.<init>(r8, r9);
        r1.foundPossibleResultPoint(r7);
    L_0x0038:
        r6 = r11.mo7602a(r13, r6);
        if (r1 == 0) goto L_0x004e;
    L_0x003e:
        r7 = new com.google.zxing.g;
        r8 = r6[r4];
        r9 = r6[r3];
        r8 = r8 + r9;
        r8 = (float) r8;
        r8 = r8 / r2;
        r9 = (float) r12;
        r7.<init>(r8, r9);
        r1.foundPossibleResultPoint(r7);
    L_0x004e:
        r1 = r6[r3];
        r7 = r6[r4];
        r7 = r1 - r7;
        r7 = r7 + r1;
        r8 = r13.m24751a();
        if (r7 >= r8) goto L_0x0109;
    L_0x005b:
        r1 = r13.m24757a(r1, r7, r4);
        if (r1 != 0) goto L_0x0063;
    L_0x0061:
        goto L_0x0109;
    L_0x0063:
        r1 = r5.toString();
        r5 = r1.length();
        r7 = 8;
        if (r5 >= r7) goto L_0x0074;
    L_0x006f:
        r12 = com.google.zxing.FormatException.m30472a();
        throw r12;
    L_0x0074:
        r5 = r11.mo7601a(r1);
        if (r5 != 0) goto L_0x007f;
    L_0x007a:
        r12 = com.google.zxing.ChecksumException.m30471a();
        throw r12;
    L_0x007f:
        r5 = r14[r3];
        r14 = r14[r4];
        r5 = r5 + r14;
        r14 = (float) r5;
        r14 = r14 / r2;
        r5 = r6[r3];
        r7 = r6[r4];
        r5 = r5 + r7;
        r5 = (float) r5;
        r5 = r5 / r2;
        r2 = r11.mo7600a();
        r7 = new com.google.zxing.f;
        r8 = 2;
        r8 = new com.google.zxing.C5675g[r8];
        r9 = new com.google.zxing.g;
        r10 = (float) r12;
        r9.<init>(r14, r10);
        r8[r4] = r9;
        r14 = new com.google.zxing.g;
        r14.<init>(r5, r10);
        r8[r3] = r14;
        r7.<init>(r1, r0, r8, r2);
        r14 = r11.f28268g;	 Catch:{ ReaderException -> 0x00d0 }
        r5 = r6[r3];	 Catch:{ ReaderException -> 0x00d0 }
        r12 = r14.m24859a(r12, r13, r5);	 Catch:{ ReaderException -> 0x00d0 }
        r13 = com.google.zxing.ResultMetadataType.UPC_EAN_EXTENSION;	 Catch:{ ReaderException -> 0x00d0 }
        r14 = r12.m24839a();	 Catch:{ ReaderException -> 0x00d0 }
        r7.m24840a(r13, r14);	 Catch:{ ReaderException -> 0x00d0 }
        r13 = r12.m24844c();	 Catch:{ ReaderException -> 0x00d0 }
        r7.m24841a(r13);	 Catch:{ ReaderException -> 0x00d0 }
        r13 = r12.m24843b();	 Catch:{ ReaderException -> 0x00d0 }
        r7.m24842a(r13);	 Catch:{ ReaderException -> 0x00d0 }
        r12 = r12.m24839a();	 Catch:{ ReaderException -> 0x00d0 }
        r12 = r12.length();	 Catch:{ ReaderException -> 0x00d0 }
        goto L_0x00d1;
    L_0x00d0:
        r12 = 0;
    L_0x00d1:
        if (r15 != 0) goto L_0x00d4;
    L_0x00d3:
        goto L_0x00dd;
    L_0x00d4:
        r13 = com.google.zxing.DecodeHintType.ALLOWED_EAN_EXTENSIONS;
        r13 = r15.get(r13);
        r0 = r13;
        r0 = (int[]) r0;
    L_0x00dd:
        if (r0 == 0) goto L_0x00f3;
    L_0x00df:
        r13 = r0.length;
        r14 = 0;
    L_0x00e1:
        if (r14 >= r13) goto L_0x00eb;
    L_0x00e3:
        r15 = r0[r14];
        if (r12 != r15) goto L_0x00e8;
    L_0x00e7:
        goto L_0x00ec;
    L_0x00e8:
        r14 = r14 + 1;
        goto L_0x00e1;
    L_0x00eb:
        r3 = 0;
    L_0x00ec:
        if (r3 != 0) goto L_0x00f3;
    L_0x00ee:
        r12 = com.google.zxing.NotFoundException.m30473a();
        throw r12;
    L_0x00f3:
        r12 = com.google.zxing.BarcodeFormat.EAN_13;
        if (r2 == r12) goto L_0x00fb;
    L_0x00f7:
        r12 = com.google.zxing.BarcodeFormat.UPC_A;
        if (r2 != r12) goto L_0x0108;
    L_0x00fb:
        r12 = r11.f28269h;
        r12 = r12.m24849a(r1);
        if (r12 == 0) goto L_0x0108;
    L_0x0103:
        r13 = com.google.zxing.ResultMetadataType.POSSIBLE_COUNTRY;
        r7.m24840a(r13, r12);
    L_0x0108:
        return r7;
    L_0x0109:
        r12 = com.google.zxing.NotFoundException.m30473a();
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.t.a(int, com.google.zxing.common.a, int[], java.util.Map):com.google.zxing.f");
    }

    /* renamed from: a */
    boolean mo7601a(String str) throws FormatException {
        return C7811t.m33569a((CharSequence) str);
    }

    /* renamed from: a */
    static boolean m33569a(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 2;
        int i2 = 0;
        while (i >= 0) {
            int charAt = charSequence.charAt(i) - 48;
            if (charAt >= 0) {
                if (charAt <= 9) {
                    i2 += charAt;
                    i -= 2;
                }
            }
            throw FormatException.m30472a();
        }
        i2 *= 3;
        length--;
        while (length >= 0) {
            charAt = charSequence.charAt(length) - 48;
            if (charAt >= 0) {
                if (charAt <= 9) {
                    i2 += charAt;
                    length -= 2;
                }
            }
            throw FormatException.m30472a();
        }
        if (i2 % 10 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    int[] mo7602a(C5664a c5664a, int i) throws NotFoundException {
        return C7811t.m33571a(c5664a, i, false, f28262b);
    }

    /* renamed from: a */
    static int[] m33571a(C5664a c5664a, int i, boolean z, int[] iArr) throws NotFoundException {
        return C7811t.m33572a(c5664a, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: a */
    private static int[] m33572a(C5664a c5664a, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int a = c5664a.m24751a();
        i = z ? c5664a.m24761c(i) : c5664a.m24759b(i);
        int length = iArr.length;
        int i2 = i;
        int i3 = 0;
        while (i < a) {
            boolean z2 = true;
            if ((c5664a.m24756a(i) ^ z) != 0) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (C7001n.m30500a(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                if (z) {
                    z2 = false;
                }
                z = z2;
            }
            i++;
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    static int m33568a(C5664a c5664a, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        C7001n.m30502a(c5664a, i, iArr);
        c5664a = iArr2.length;
        i = 1056293519;
        int i2 = -1;
        for (int i3 = 0; i3 < c5664a; i3++) {
            int a = C7001n.m30500a(iArr, iArr2[i3], 0.7f);
            if (a < i) {
                i2 = i3;
                i = a;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.m30473a();
    }
}
