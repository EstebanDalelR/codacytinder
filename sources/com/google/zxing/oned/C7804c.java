package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.C5664a;

/* renamed from: com.google.zxing.oned.c */
public final class C7804c extends C7001n {
    /* renamed from: a */
    static final int[][] f28243a = new int[][]{new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* renamed from: a */
    private static int[] m33539a(C5664a c5664a) throws NotFoundException {
        int a = c5664a.m24751a();
        int b = c5664a.m24759b(0);
        Object obj = new int[6];
        int i = b;
        int i2 = 0;
        int i3 = 0;
        while (b < a) {
            if ((c5664a.m24756a(b) ^ i2) != 0) {
                obj[i3] = obj[i3] + 1;
            } else {
                if (i3 == 5) {
                    float f = 0.25f;
                    int i4 = -1;
                    for (int i5 = 103; i5 <= 105; i5++) {
                        float a2 = C7001n.m30500a((int[]) obj, f28243a[i5], 0.7f);
                        if (a2 < f) {
                            i4 = i5;
                            f = a2;
                        }
                    }
                    if (i4 < 0 || !c5664a.m24757a(Math.max(0, i - ((b - i) / 2)), i, false)) {
                        i += obj[0] + obj[1];
                        System.arraycopy(obj, 2, obj, 0, 4);
                        obj[4] = null;
                        obj[5] = null;
                        i3--;
                    } else {
                        return new int[]{i, b, i4};
                    }
                }
                i3++;
                obj[i3] = 1;
                i2 ^= 1;
            }
            b++;
        }
        throw NotFoundException.m30473a();
    }

    /* renamed from: a */
    private static int m33538a(C5664a c5664a, int[] iArr, int i) throws NotFoundException {
        C7001n.m30502a(c5664a, i, iArr);
        c5664a = 1048576000;
        i = -1;
        for (int i2 = 0; i2 < f28243a.length; i2++) {
            float a = C7001n.m30500a(iArr, f28243a[i2], 0.7f);
            if (a < c5664a) {
                i = i2;
                c5664a = a;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw NotFoundException.m30473a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public com.google.zxing.C5674f mo7371a(int r23, com.google.zxing.common.C5664a r24, java.util.Map<com.google.zxing.DecodeHintType, ?> r25) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
        r22 = this;
        r0 = r24;
        r1 = r25;
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0012;
    L_0x0008:
        r4 = com.google.zxing.DecodeHintType.ASSUME_GS1;
        r1 = r1.containsKey(r4);
        if (r1 == 0) goto L_0x0012;
    L_0x0010:
        r1 = 1;
        goto L_0x0013;
    L_0x0012:
        r1 = 0;
    L_0x0013:
        r4 = com.google.zxing.oned.C7804c.m33539a(r24);
        r5 = 2;
        r6 = r4[r5];
        r7 = new java.util.ArrayList;
        r8 = 20;
        r7.<init>(r8);
        r9 = (byte) r6;
        r9 = java.lang.Byte.valueOf(r9);
        r7.add(r9);
        switch(r6) {
            case 103: goto L_0x0037;
            case 104: goto L_0x0034;
            case 105: goto L_0x0031;
            default: goto L_0x002c;
        };
    L_0x002c:
        r0 = com.google.zxing.FormatException.m30472a();
        throw r0;
    L_0x0031:
        r12 = 99;
        goto L_0x0039;
    L_0x0034:
        r12 = 100;
        goto L_0x0039;
    L_0x0037:
        r12 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
    L_0x0039:
        r13 = new java.lang.StringBuilder;
        r13.<init>(r8);
        r8 = r4[r3];
        r14 = r4[r2];
        r15 = 6;
        r2 = new int[r15];
        r16 = r6;
        r9 = r8;
        r3 = r12;
        r5 = 0;
        r6 = 0;
        r8 = 0;
        r10 = 0;
        r12 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 1;
    L_0x0054:
        if (r6 != 0) goto L_0x01a5;
    L_0x0056:
        r9 = com.google.zxing.oned.C7804c.m33538a(r0, r2, r14);
        r11 = (byte) r9;
        r11 = java.lang.Byte.valueOf(r11);
        r7.add(r11);
        r11 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r9 == r11) goto L_0x0068;
    L_0x0066:
        r19 = 1;
    L_0x0068:
        if (r9 == r11) goto L_0x0070;
    L_0x006a:
        r17 = r17 + 1;
        r18 = r17 * r9;
        r16 = r16 + r18;
    L_0x0070:
        r18 = r14;
        r11 = 0;
    L_0x0073:
        if (r11 >= r15) goto L_0x007c;
    L_0x0075:
        r20 = r2[r11];
        r18 = r18 + r20;
        r11 = r11 + 1;
        goto L_0x0073;
    L_0x007c:
        switch(r9) {
            case 103: goto L_0x0088;
            case 104: goto L_0x0088;
            case 105: goto L_0x0088;
            default: goto L_0x007f;
        };
    L_0x007f:
        r11 = 96;
        switch(r3) {
            case 99: goto L_0x014b;
            case 100: goto L_0x00ec;
            case 101: goto L_0x008d;
            default: goto L_0x0084;
        };
    L_0x0084:
        r11 = 100;
        goto L_0x0188;
    L_0x0088:
        r0 = com.google.zxing.FormatException.m30472a();
        throw r0;
    L_0x008d:
        r15 = 64;
        if (r9 >= r15) goto L_0x00a4;
    L_0x0091:
        if (r5 != r10) goto L_0x009b;
    L_0x0093:
        r5 = r9 + 32;
        r5 = (char) r5;
        r13.append(r5);
        goto L_0x00ff;
    L_0x009b:
        r5 = r9 + 32;
        r5 = r5 + 128;
        r5 = (char) r5;
        r13.append(r5);
        goto L_0x00ff;
    L_0x00a4:
        if (r9 >= r11) goto L_0x00b6;
    L_0x00a6:
        if (r5 != r10) goto L_0x00af;
    L_0x00a8:
        r5 = r9 + -64;
        r5 = (char) r5;
        r13.append(r5);
        goto L_0x00ff;
    L_0x00af:
        r5 = r9 + 64;
        r5 = (char) r5;
        r13.append(r5);
        goto L_0x00ff;
    L_0x00b6:
        r11 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r9 == r11) goto L_0x00bc;
    L_0x00ba:
        r19 = 0;
    L_0x00bc:
        if (r9 == r11) goto L_0x0145;
    L_0x00be:
        switch(r9) {
            case 96: goto L_0x0146;
            case 97: goto L_0x0146;
            case 98: goto L_0x00e8;
            case 99: goto L_0x013c;
            case 100: goto L_0x00e3;
            case 101: goto L_0x00d9;
            case 102: goto L_0x00c3;
            default: goto L_0x00c1;
        };
    L_0x00c1:
        goto L_0x0146;
    L_0x00c3:
        if (r1 == 0) goto L_0x0146;
    L_0x00c5:
        r11 = r13.length();
        if (r11 != 0) goto L_0x00d2;
    L_0x00cb:
        r11 = "]C1";
        r13.append(r11);
        goto L_0x0146;
    L_0x00d2:
        r11 = 29;
        r13.append(r11);
        goto L_0x0146;
    L_0x00d9:
        if (r10 != 0) goto L_0x00de;
    L_0x00db:
        if (r5 == 0) goto L_0x00de;
    L_0x00dd:
        goto L_0x012d;
    L_0x00de:
        if (r10 == 0) goto L_0x0137;
    L_0x00e0:
        if (r5 == 0) goto L_0x0137;
    L_0x00e2:
        goto L_0x0134;
    L_0x00e3:
        r15 = r5;
        r3 = 100;
        goto L_0x0147;
    L_0x00e8:
        r15 = r5;
        r3 = 100;
        goto L_0x0143;
    L_0x00ec:
        if (r9 >= r11) goto L_0x0105;
    L_0x00ee:
        if (r5 != r10) goto L_0x00f7;
    L_0x00f0:
        r5 = r9 + 32;
        r5 = (char) r5;
        r13.append(r5);
        goto L_0x00ff;
    L_0x00f7:
        r5 = r9 + 32;
        r5 = r5 + 128;
        r5 = (char) r5;
        r13.append(r5);
    L_0x00ff:
        r5 = 0;
    L_0x0100:
        r11 = 100;
        r15 = 0;
        goto L_0x018a;
    L_0x0105:
        r11 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r9 == r11) goto L_0x010b;
    L_0x0109:
        r19 = 0;
    L_0x010b:
        if (r9 == r11) goto L_0x0145;
    L_0x010d:
        switch(r9) {
            case 96: goto L_0x0146;
            case 97: goto L_0x0146;
            case 98: goto L_0x0140;
            case 99: goto L_0x013c;
            case 100: goto L_0x0129;
            case 101: goto L_0x0125;
            case 102: goto L_0x0111;
            default: goto L_0x0110;
        };
    L_0x0110:
        goto L_0x0146;
    L_0x0111:
        if (r1 == 0) goto L_0x0146;
    L_0x0113:
        r11 = r13.length();
        if (r11 != 0) goto L_0x011f;
    L_0x0119:
        r11 = "]C1";
        r13.append(r11);
        goto L_0x0146;
    L_0x011f:
        r11 = 29;
        r13.append(r11);
        goto L_0x0146;
    L_0x0125:
        r15 = r5;
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0147;
    L_0x0129:
        if (r10 != 0) goto L_0x0130;
    L_0x012b:
        if (r5 == 0) goto L_0x0130;
    L_0x012d:
        r5 = 0;
        r10 = 1;
        goto L_0x0100;
    L_0x0130:
        if (r10 == 0) goto L_0x0137;
    L_0x0132:
        if (r5 == 0) goto L_0x0137;
    L_0x0134:
        r5 = 0;
        r10 = 0;
        goto L_0x0100;
    L_0x0137:
        r5 = 0;
        r11 = 100;
        r15 = 1;
        goto L_0x018a;
    L_0x013c:
        r15 = r5;
        r3 = 99;
        goto L_0x0147;
    L_0x0140:
        r15 = r5;
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
    L_0x0143:
        r5 = 1;
        goto L_0x0148;
    L_0x0145:
        r6 = 1;
    L_0x0146:
        r15 = r5;
    L_0x0147:
        r5 = 0;
    L_0x0148:
        r11 = 100;
        goto L_0x018a;
    L_0x014b:
        r11 = 100;
        if (r9 >= r11) goto L_0x015c;
    L_0x014f:
        r15 = 10;
        if (r9 >= r15) goto L_0x0158;
    L_0x0153:
        r15 = 48;
        r13.append(r15);
    L_0x0158:
        r13.append(r9);
        goto L_0x0188;
    L_0x015c:
        r15 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r9 == r15) goto L_0x0162;
    L_0x0160:
        r19 = 0;
    L_0x0162:
        if (r9 == r15) goto L_0x0184;
    L_0x0164:
        switch(r9) {
            case 100: goto L_0x0180;
            case 101: goto L_0x017c;
            case 102: goto L_0x0168;
            default: goto L_0x0167;
        };
    L_0x0167:
        goto L_0x0188;
    L_0x0168:
        if (r1 == 0) goto L_0x0188;
    L_0x016a:
        r15 = r13.length();
        if (r15 != 0) goto L_0x0176;
    L_0x0170:
        r15 = "]C1";
        r13.append(r15);
        goto L_0x0188;
    L_0x0176:
        r15 = 29;
        r13.append(r15);
        goto L_0x0188;
    L_0x017c:
        r15 = r5;
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0189;
    L_0x0180:
        r15 = r5;
        r3 = 100;
        goto L_0x0189;
    L_0x0184:
        r15 = r5;
        r5 = 0;
        r6 = 1;
        goto L_0x018a;
    L_0x0188:
        r15 = r5;
    L_0x0189:
        r5 = 0;
    L_0x018a:
        if (r8 == 0) goto L_0x0196;
    L_0x018c:
        r8 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r3 != r8) goto L_0x0193;
    L_0x0190:
        r3 = 100;
        goto L_0x0198;
    L_0x0193:
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0198;
    L_0x0196:
        r8 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
    L_0x0198:
        r8 = r5;
        r5 = r15;
        r15 = 6;
        r21 = r12;
        r12 = r9;
        r9 = r14;
        r14 = r18;
        r18 = r21;
        goto L_0x0054;
    L_0x01a5:
        r1 = r14 - r9;
        r2 = r0.m24761c(r14);
        r5 = r24.m24751a();
        r6 = r2 - r9;
        r8 = 2;
        r6 = r6 / r8;
        r6 = r6 + r2;
        r5 = java.lang.Math.min(r5, r6);
        r6 = 0;
        r0 = r0.m24757a(r2, r5, r6);
        if (r0 != 0) goto L_0x01c4;
    L_0x01bf:
        r0 = com.google.zxing.NotFoundException.m30473a();
        throw r0;
    L_0x01c4:
        r12 = r18;
        r17 = r17 * r12;
        r16 = r16 - r17;
        r0 = r16 % 103;
        if (r0 == r12) goto L_0x01d3;
    L_0x01ce:
        r0 = com.google.zxing.ChecksumException.m30471a();
        throw r0;
    L_0x01d3:
        r0 = r13.length();
        if (r0 != 0) goto L_0x01de;
    L_0x01d9:
        r0 = com.google.zxing.NotFoundException.m30473a();
        throw r0;
    L_0x01de:
        if (r0 <= 0) goto L_0x01f1;
    L_0x01e0:
        if (r19 == 0) goto L_0x01f1;
    L_0x01e2:
        r2 = 99;
        if (r3 != r2) goto L_0x01ec;
    L_0x01e6:
        r2 = r0 + -2;
        r13.delete(r2, r0);
        goto L_0x01f1;
    L_0x01ec:
        r2 = r0 + -1;
        r13.delete(r2, r0);
    L_0x01f1:
        r0 = 1;
        r2 = r4[r0];
        r0 = 0;
        r3 = r4[r0];
        r2 = r2 + r3;
        r0 = (float) r2;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 / r2;
        r3 = (float) r9;
        r1 = (float) r1;
        r1 = r1 / r2;
        r3 = r3 + r1;
        r1 = r7.size();
        r2 = new byte[r1];
        r4 = 0;
    L_0x0207:
        if (r4 >= r1) goto L_0x0218;
    L_0x0209:
        r5 = r7.get(r4);
        r5 = (java.lang.Byte) r5;
        r5 = r5.byteValue();
        r2[r4] = r5;
        r4 = r4 + 1;
        goto L_0x0207;
    L_0x0218:
        r1 = new com.google.zxing.f;
        r4 = r13.toString();
        r5 = 2;
        r5 = new com.google.zxing.C5675g[r5];
        r6 = new com.google.zxing.g;
        r7 = r23;
        r7 = (float) r7;
        r6.<init>(r0, r7);
        r0 = 0;
        r5[r0] = r6;
        r0 = new com.google.zxing.g;
        r0.<init>(r3, r7);
        r3 = 1;
        r5[r3] = r0;
        r0 = com.google.zxing.BarcodeFormat.CODE_128;
        r1.<init>(r4, r2, r5, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.c.a(int, com.google.zxing.common.a, java.util.Map):com.google.zxing.f");
    }
}
