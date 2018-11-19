package java8.util;

import com.tinder.domain.config.model.ProfileEditingConfig;

final class DualPivotQuicksort {
    private DualPivotQuicksort() {
    }

    /* renamed from: a */
    static void m59054a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4) {
        Object obj = iArr;
        int i5 = i;
        int i6 = i2;
        Object obj2 = iArr2;
        boolean z = true;
        if (i6 - i5 < 286) {
            m59053a((int[]) obj, i5, i6, true);
            return;
        }
        int i7;
        int[] iArr3 = new int[68];
        iArr3[0] = i5;
        int i8 = i5;
        boolean z2 = false;
        while (i8 < i6) {
            while (i8 < i6) {
                int i9 = i8 + 1;
                if (obj[i8] != obj[i9]) {
                    break;
                }
                i8 = i9;
            }
            if (i8 == i6) {
                break;
            }
            int i10;
            i9 = i8 + 1;
            if (obj[i8] < obj[i9]) {
                while (true) {
                    i8++;
                    if (i8 > i6 || obj[i8 - 1] > obj[i8]) {
                        break;
                    }
                }
            } else if (obj[i8] > obj[i9]) {
                while (true) {
                    i8++;
                    if (i8 > i6 || obj[i8 - 1] < obj[i8]) {
                        i7 = iArr3[z2] - 1;
                        i9 = i8;
                    }
                }
                i7 = iArr3[z2] - 1;
                i9 = i8;
                while (true) {
                    i7++;
                    i9--;
                    if (i7 >= i9) {
                        break;
                    }
                    int i11 = obj[i7];
                    obj[i7] = obj[i9];
                    obj[i9] = i11;
                }
            }
            if (iArr3[z2] > i5 && obj[iArr3[z2]] >= obj[iArr3[z2] - 1]) {
                i10 = z2 - 1;
            }
            z2 = i10 + 1;
            if (z2) {
                m59053a((int[]) obj, i5, i6, true);
                return;
            }
            iArr3[z2] = i8;
        }
        if (z2 != 0) {
            if (z2 != 1 || iArr3[z2] <= i6) {
                boolean z3;
                Object obj3;
                boolean z4;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                i6++;
                if (iArr3[z2] < i6) {
                    z2++;
                    iArr3[z2] = i6;
                }
                i8 = 1;
                i7 = 0;
                while (true) {
                    z3 = i8 << 1;
                    if (z3 >= z2) {
                        break;
                    }
                    i7 = (byte) (i7 ^ 1);
                }
                i8 = i6 - i5;
                if (obj2 != null && i4 >= i8) {
                    if (i3 + i8 <= obj2.length) {
                        i9 = i3;
                        if (i7 != 0) {
                            System.arraycopy(obj, i5, obj2, i9, i8);
                            i9 -= i5;
                            i5 = 0;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                        } else {
                            i5 = i9 - i5;
                            i9 = 0;
                        }
                        while (z2 > z) {
                            z4 = false;
                            for (z3 = true; z3 <= z2; z3 += 2) {
                                i11 = iArr3[z3];
                                i12 = iArr3[z3 - 1];
                                i13 = iArr3[z3 - 2];
                                i14 = i12;
                                i15 = i13;
                                while (i13 < i11) {
                                    if (i14 < i11) {
                                        if (i15 < i12 || obj[i15 + i9] > obj[i14 + i9]) {
                                            i16 = i14 + 1;
                                            obj2[i13 + i5] = obj[i14 + i9];
                                            i14 = i16;
                                            i13++;
                                        }
                                    }
                                    i16 = i15 + 1;
                                    obj2[i13 + i5] = obj[i15 + i9];
                                    i15 = i16;
                                    i13++;
                                }
                                z4++;
                                iArr3[z4] = i11;
                            }
                            if ((z2 & 1) != 0) {
                                i17 = iArr3[z2 - 1];
                                i16 = i6;
                                while (true) {
                                    i16--;
                                    if (i16 >= i17) {
                                        break;
                                    }
                                    obj2[i16 + i5] = obj[i16 + i9];
                                }
                                z4++;
                                iArr3[z4] = i6;
                            }
                            z2 = z4;
                            z = true;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                            i18 = i9;
                            i9 = i5;
                            i5 = i18;
                        }
                    }
                }
                obj2 = new int[i8];
                i9 = 0;
                if (i7 != 0) {
                    i5 = i9 - i5;
                    i9 = 0;
                } else {
                    System.arraycopy(obj, i5, obj2, i9, i8);
                    i9 -= i5;
                    i5 = 0;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                }
                while (z2 > z) {
                    z4 = false;
                    for (z3 = true; z3 <= z2; z3 += 2) {
                        i11 = iArr3[z3];
                        i12 = iArr3[z3 - 1];
                        i13 = iArr3[z3 - 2];
                        i14 = i12;
                        i15 = i13;
                        while (i13 < i11) {
                            if (i14 < i11) {
                                if (i15 < i12) {
                                }
                                i16 = i14 + 1;
                                obj2[i13 + i5] = obj[i14 + i9];
                                i14 = i16;
                                i13++;
                            }
                            i16 = i15 + 1;
                            obj2[i13 + i5] = obj[i15 + i9];
                            i15 = i16;
                            i13++;
                        }
                        z4++;
                        iArr3[z4] = i11;
                    }
                    if ((z2 & 1) != 0) {
                        i17 = iArr3[z2 - 1];
                        i16 = i6;
                        while (true) {
                            i16--;
                            if (i16 >= i17) {
                                break;
                            }
                            obj2[i16 + i5] = obj[i16 + i9];
                        }
                        z4++;
                        iArr3[z4] = i6;
                    }
                    z2 = z4;
                    z = true;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                    i18 = i9;
                    i9 = i5;
                    i5 = i18;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m59053a(int[] r11, int r12, int r13, boolean r14) {
        /*
        r0 = r13 - r12;
        r0 = r0 + 1;
        r1 = 47;
        if (r0 >= r1) goto L_0x0080;
    L_0x0008:
        if (r14 == 0) goto L_0x0029;
    L_0x000a:
        r14 = r12;
    L_0x000b:
        if (r14 >= r13) goto L_0x007f;
    L_0x000d:
        r0 = r14 + 1;
        r1 = r11[r0];
    L_0x0011:
        r2 = r11[r14];
        if (r1 >= r2) goto L_0x0023;
    L_0x0015:
        r2 = r14 + 1;
        r3 = r11[r14];
        r11[r2] = r3;
        r2 = r14 + -1;
        if (r14 != r12) goto L_0x0021;
    L_0x001f:
        r14 = r2;
        goto L_0x0023;
    L_0x0021:
        r14 = r2;
        goto L_0x0011;
    L_0x0023:
        r14 = r14 + 1;
        r11[r14] = r1;
        r14 = r0;
        goto L_0x000b;
    L_0x0029:
        if (r12 < r13) goto L_0x002c;
    L_0x002b:
        return;
    L_0x002c:
        r12 = r12 + 1;
        r14 = r11[r12];
        r0 = r12 + -1;
        r0 = r11[r0];
        if (r14 >= r0) goto L_0x0029;
    L_0x0036:
        r14 = r12 + 1;
        if (r14 > r13) goto L_0x006c;
    L_0x003a:
        r0 = r11[r12];
        r1 = r11[r14];
        if (r0 >= r1) goto L_0x0045;
    L_0x0040:
        r1 = r11[r14];
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x0045:
        r12 = r12 + -1;
        r2 = r11[r12];
        if (r0 >= r2) goto L_0x0052;
    L_0x004b:
        r2 = r12 + 2;
        r3 = r11[r12];
        r11[r2] = r3;
        goto L_0x0045;
    L_0x0052:
        r12 = r12 + 1;
        r2 = r12 + 1;
        r11[r2] = r0;
    L_0x0058:
        r12 = r12 + -1;
        r0 = r11[r12];
        if (r1 >= r0) goto L_0x0065;
    L_0x005e:
        r0 = r12 + 1;
        r2 = r11[r12];
        r11[r0] = r2;
        goto L_0x0058;
    L_0x0065:
        r12 = r12 + 1;
        r11[r12] = r1;
        r12 = r14 + 1;
        goto L_0x0036;
    L_0x006c:
        r12 = r11[r13];
    L_0x006e:
        r13 = r13 + -1;
        r14 = r11[r13];
        if (r12 >= r14) goto L_0x007b;
    L_0x0074:
        r14 = r13 + 1;
        r0 = r11[r13];
        r11[r14] = r0;
        goto L_0x006e;
    L_0x007b:
        r13 = r13 + 1;
        r11[r13] = r12;
    L_0x007f:
        return;
    L_0x0080:
        r1 = r0 >> 3;
        r0 = r0 >> 6;
        r1 = r1 + r0;
        r1 = r1 + 1;
        r0 = r12 + r13;
        r0 = r0 >>> 1;
        r2 = r0 - r1;
        r3 = r2 - r1;
        r4 = r0 + r1;
        r1 = r1 + r4;
        r5 = r11[r2];
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x00a0;
    L_0x0098:
        r5 = r11[r2];
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00a0:
        r5 = r11[r0];
        r6 = r11[r2];
        if (r5 >= r6) goto L_0x00b8;
    L_0x00a6:
        r5 = r11[r0];
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x00b8;
    L_0x00b2:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00b8:
        r5 = r11[r4];
        r6 = r11[r0];
        if (r5 >= r6) goto L_0x00da;
    L_0x00be:
        r5 = r11[r4];
        r6 = r11[r0];
        r11[r4] = r6;
        r11[r0] = r5;
        r6 = r11[r2];
        if (r5 >= r6) goto L_0x00da;
    L_0x00ca:
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x00da;
    L_0x00d4:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00da:
        r5 = r11[r1];
        r6 = r11[r4];
        if (r5 >= r6) goto L_0x0106;
    L_0x00e0:
        r5 = r11[r1];
        r6 = r11[r4];
        r11[r1] = r6;
        r11[r4] = r5;
        r6 = r11[r0];
        if (r5 >= r6) goto L_0x0106;
    L_0x00ec:
        r6 = r11[r0];
        r11[r4] = r6;
        r11[r0] = r5;
        r6 = r11[r2];
        if (r5 >= r6) goto L_0x0106;
    L_0x00f6:
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x0106;
    L_0x0100:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x0106:
        r5 = r11[r3];
        r6 = r11[r2];
        r7 = 0;
        if (r5 == r6) goto L_0x01db;
    L_0x010d:
        r5 = r11[r2];
        r6 = r11[r0];
        if (r5 == r6) goto L_0x01db;
    L_0x0113:
        r5 = r11[r0];
        r6 = r11[r4];
        if (r5 == r6) goto L_0x01db;
    L_0x0119:
        r5 = r11[r4];
        r6 = r11[r1];
        if (r5 == r6) goto L_0x01db;
    L_0x011f:
        r0 = r11[r2];
        r5 = r11[r4];
        r6 = r11[r12];
        r11[r2] = r6;
        r2 = r11[r13];
        r11[r4] = r2;
        r2 = r12;
    L_0x012c:
        r2 = r2 + 1;
        r4 = r11[r2];
        if (r4 >= r0) goto L_0x0133;
    L_0x0132:
        goto L_0x012c;
    L_0x0133:
        r4 = r13;
    L_0x0134:
        r4 = r4 + -1;
        r6 = r11[r4];
        if (r6 <= r5) goto L_0x013b;
    L_0x013a:
        goto L_0x0134;
    L_0x013b:
        r6 = r2 + -1;
    L_0x013d:
        r6 = r6 + 1;
        if (r6 > r4) goto L_0x0174;
    L_0x0141:
        r8 = r11[r6];
        if (r8 >= r0) goto L_0x014e;
    L_0x0145:
        r9 = r11[r2];
        r11[r6] = r9;
        r11[r2] = r8;
        r2 = r2 + 1;
        goto L_0x013d;
    L_0x014e:
        if (r8 <= r5) goto L_0x013d;
    L_0x0150:
        r9 = r11[r4];
        if (r9 <= r5) goto L_0x015c;
    L_0x0154:
        r9 = r4 + -1;
        if (r4 != r6) goto L_0x015a;
    L_0x0158:
        r4 = r9;
        goto L_0x0174;
    L_0x015a:
        r4 = r9;
        goto L_0x0150;
    L_0x015c:
        r9 = r11[r4];
        if (r9 >= r0) goto L_0x016b;
    L_0x0160:
        r9 = r11[r2];
        r11[r6] = r9;
        r9 = r11[r4];
        r11[r2] = r9;
        r2 = r2 + 1;
        goto L_0x016f;
    L_0x016b:
        r9 = r11[r4];
        r11[r6] = r9;
    L_0x016f:
        r11[r4] = r8;
        r4 = r4 + -1;
        goto L_0x013d;
    L_0x0174:
        r6 = r2 + -1;
        r8 = r11[r6];
        r11[r12] = r8;
        r11[r6] = r0;
        r6 = r4 + 1;
        r8 = r11[r6];
        r11[r13] = r8;
        r11[r6] = r5;
        r6 = r2 + -2;
        m59053a(r11, r12, r6, r14);
        r12 = r4 + 2;
        m59053a(r11, r12, r13, r7);
        if (r2 >= r3) goto L_0x01d7;
    L_0x0190:
        if (r1 >= r4) goto L_0x01d7;
    L_0x0192:
        r12 = r11[r2];
        if (r12 != r0) goto L_0x0199;
    L_0x0196:
        r2 = r2 + 1;
        goto L_0x0192;
    L_0x0199:
        r12 = r11[r4];
        if (r12 != r5) goto L_0x01a0;
    L_0x019d:
        r4 = r4 + -1;
        goto L_0x0199;
    L_0x01a0:
        r12 = r2 + -1;
    L_0x01a2:
        r12 = r12 + 1;
        if (r12 > r4) goto L_0x01d7;
    L_0x01a6:
        r13 = r11[r12];
        if (r13 != r0) goto L_0x01b3;
    L_0x01aa:
        r14 = r11[r2];
        r11[r12] = r14;
        r11[r2] = r13;
        r2 = r2 + 1;
        goto L_0x01a2;
    L_0x01b3:
        if (r13 != r5) goto L_0x01a2;
    L_0x01b5:
        r14 = r11[r4];
        if (r14 != r5) goto L_0x01c1;
    L_0x01b9:
        r14 = r4 + -1;
        if (r4 != r12) goto L_0x01bf;
    L_0x01bd:
        r4 = r14;
        goto L_0x01d7;
    L_0x01bf:
        r4 = r14;
        goto L_0x01b5;
    L_0x01c1:
        r14 = r11[r4];
        if (r14 != r0) goto L_0x01ce;
    L_0x01c5:
        r14 = r11[r2];
        r11[r12] = r14;
        r11[r2] = r0;
        r2 = r2 + 1;
        goto L_0x01d2;
    L_0x01ce:
        r14 = r11[r4];
        r11[r12] = r14;
    L_0x01d2:
        r11[r4] = r13;
        r4 = r4 + -1;
        goto L_0x01a2;
    L_0x01d7:
        m59053a(r11, r2, r4, r7);
        goto L_0x021d;
    L_0x01db:
        r0 = r11[r0];
        r1 = r12;
        r3 = r1;
        r2 = r13;
    L_0x01e0:
        if (r1 > r2) goto L_0x0213;
    L_0x01e2:
        r4 = r11[r1];
        if (r4 != r0) goto L_0x01e7;
    L_0x01e6:
        goto L_0x0210;
    L_0x01e7:
        r4 = r11[r1];
        if (r4 >= r0) goto L_0x01f4;
    L_0x01eb:
        r5 = r11[r3];
        r11[r1] = r5;
        r11[r3] = r4;
        r3 = r3 + 1;
        goto L_0x0210;
    L_0x01f4:
        r5 = r11[r2];
        if (r5 <= r0) goto L_0x01fb;
    L_0x01f8:
        r2 = r2 + -1;
        goto L_0x01f4;
    L_0x01fb:
        r5 = r11[r2];
        if (r5 >= r0) goto L_0x020a;
    L_0x01ff:
        r5 = r11[r3];
        r11[r1] = r5;
        r5 = r11[r2];
        r11[r3] = r5;
        r3 = r3 + 1;
        goto L_0x020c;
    L_0x020a:
        r11[r1] = r0;
    L_0x020c:
        r11[r2] = r4;
        r2 = r2 + -1;
    L_0x0210:
        r1 = r1 + 1;
        goto L_0x01e0;
    L_0x0213:
        r3 = r3 + -1;
        m59053a(r11, r12, r3, r14);
        r2 = r2 + 1;
        m59053a(r11, r2, r13, r7);
    L_0x021d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.DualPivotQuicksort.a(int[], int, int, boolean):void");
    }

    /* renamed from: a */
    static void m59056a(long[] jArr, int i, int i2, long[] jArr2, int i3, int i4) {
        Object obj = jArr;
        int i5 = i;
        int i6 = i2;
        Object obj2 = jArr2;
        if (i6 - i5 < 286) {
            m59055a((long[]) obj, i5, i6, true);
            return;
        }
        int i7;
        int[] iArr = new int[68];
        iArr[0] = i5;
        int i8 = i5;
        int i9 = 0;
        while (i8 < i6) {
            while (i8 < i6) {
                int i10 = i8 + 1;
                if (obj[i8] != obj[i10]) {
                    break;
                }
                i8 = i10;
            }
            if (i8 == i6) {
                break;
            }
            int i11;
            i10 = i8 + 1;
            if (obj[i8] < obj[i10]) {
                while (true) {
                    i8++;
                    if (i8 > i6 || obj[i8 - 1] > obj[i8]) {
                        break;
                    }
                }
            } else if (obj[i8] > obj[i10]) {
                while (true) {
                    i8++;
                    if (i8 > i6 || obj[i8 - 1] < obj[i8]) {
                        i11 = iArr[i9] - 1;
                        i7 = i8;
                    }
                }
                i11 = iArr[i9] - 1;
                i7 = i8;
                while (true) {
                    i11++;
                    i7--;
                    if (i11 >= i7) {
                        break;
                    }
                    long j = obj[i11];
                    obj[i11] = obj[i7];
                    obj[i7] = j;
                }
            }
            if (iArr[i9] > i5 && obj[iArr[i9]] >= obj[iArr[i9] - 1]) {
                i9--;
            }
            i9++;
            if (i9 == 67) {
                m59055a((long[]) obj, i5, i6, true);
                return;
            }
            iArr[i9] = i8;
        }
        if (i9 != 0) {
            if (i9 != 1 || iArr[i9] <= i6) {
                Object obj3;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                i6++;
                if (iArr[i9] < i6) {
                    i9++;
                    iArr[i9] = i6;
                }
                i8 = 1;
                i11 = 0;
                while (true) {
                    i8 <<= 1;
                    if (i8 >= i9) {
                        break;
                    }
                    i11 = (byte) (i11 ^ 1);
                }
                i8 = i6 - i5;
                if (obj2 != null && i4 >= i8) {
                    if (i3 + i8 <= obj2.length) {
                        i7 = i3;
                        if (i11 != 0) {
                            System.arraycopy(obj, i5, obj2, i7, i8);
                            i7 -= i5;
                            i5 = 0;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                        } else {
                            i5 = i7 - i5;
                            i7 = 0;
                        }
                        while (i9 > 1) {
                            i11 = 0;
                            for (i8 = 2; i8 <= i9; i8 += 2) {
                                i10 = iArr[i8];
                                i12 = iArr[i8 - 1];
                                i13 = iArr[i8 - 2];
                                i14 = i12;
                                i15 = i13;
                                while (i13 < i10) {
                                    if (i14 < i10) {
                                        if (i15 < i12 || obj[i15 + i7] > obj[i14 + i7]) {
                                            i16 = i14 + 1;
                                            obj2[i13 + i5] = obj[i14 + i7];
                                            i14 = i16;
                                            i13++;
                                        }
                                    }
                                    i16 = i15 + 1;
                                    obj2[i13 + i5] = obj[i15 + i7];
                                    i15 = i16;
                                    i13++;
                                }
                                i11++;
                                iArr[i11] = i10;
                            }
                            if ((i9 & 1) != 0) {
                                i8 = iArr[i9 - 1];
                                i9 = i6;
                                while (true) {
                                    i9--;
                                    if (i9 >= i8) {
                                        break;
                                    }
                                    obj2[i9 + i5] = obj[i9 + i7];
                                }
                                i11++;
                                iArr[i11] = i6;
                            }
                            i9 = i11;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                            i17 = i7;
                            i7 = i5;
                            i5 = i17;
                        }
                    }
                }
                obj2 = new long[i8];
                i7 = 0;
                if (i11 != 0) {
                    i5 = i7 - i5;
                    i7 = 0;
                } else {
                    System.arraycopy(obj, i5, obj2, i7, i8);
                    i7 -= i5;
                    i5 = 0;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                }
                while (i9 > 1) {
                    i11 = 0;
                    for (i8 = 2; i8 <= i9; i8 += 2) {
                        i10 = iArr[i8];
                        i12 = iArr[i8 - 1];
                        i13 = iArr[i8 - 2];
                        i14 = i12;
                        i15 = i13;
                        while (i13 < i10) {
                            if (i14 < i10) {
                                if (i15 < i12) {
                                }
                                i16 = i14 + 1;
                                obj2[i13 + i5] = obj[i14 + i7];
                                i14 = i16;
                                i13++;
                            }
                            i16 = i15 + 1;
                            obj2[i13 + i5] = obj[i15 + i7];
                            i15 = i16;
                            i13++;
                        }
                        i11++;
                        iArr[i11] = i10;
                    }
                    if ((i9 & 1) != 0) {
                        i8 = iArr[i9 - 1];
                        i9 = i6;
                        while (true) {
                            i9--;
                            if (i9 >= i8) {
                                break;
                            }
                            obj2[i9 + i5] = obj[i9 + i7];
                        }
                        i11++;
                        iArr[i11] = i6;
                    }
                    i9 = i11;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                    i17 = i7;
                    i7 = i5;
                    i5 = i17;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m59055a(long[] r21, int r22, int r23, boolean r24) {
        /*
        r0 = r21;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r4 = r2 - r1;
        r4 = r4 + 1;
        r5 = 47;
        if (r4 >= r5) goto L_0x0096;
    L_0x0010:
        if (r3 == 0) goto L_0x0033;
    L_0x0012:
        r3 = r1;
    L_0x0013:
        if (r3 >= r2) goto L_0x0095;
    L_0x0015:
        r4 = r3 + 1;
        r5 = r0[r4];
    L_0x0019:
        r7 = r0[r3];
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 >= 0) goto L_0x002d;
    L_0x001f:
        r7 = r3 + 1;
        r8 = r0[r3];
        r0[r7] = r8;
        r7 = r3 + -1;
        if (r3 != r1) goto L_0x002b;
    L_0x0029:
        r3 = r7;
        goto L_0x002d;
    L_0x002b:
        r3 = r7;
        goto L_0x0019;
    L_0x002d:
        r3 = r3 + 1;
        r0[r3] = r5;
        r3 = r4;
        goto L_0x0013;
    L_0x0033:
        if (r1 < r2) goto L_0x0036;
    L_0x0035:
        return;
    L_0x0036:
        r1 = r1 + 1;
        r3 = r0[r1];
        r5 = r1 + -1;
        r5 = r0[r5];
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 >= 0) goto L_0x0033;
    L_0x0042:
        r3 = r1 + 1;
        if (r3 > r2) goto L_0x0080;
    L_0x0046:
        r4 = r0[r1];
        r6 = r0[r3];
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 >= 0) goto L_0x0055;
    L_0x004e:
        r6 = r0[r3];
        r19 = r4;
        r4 = r6;
        r6 = r19;
    L_0x0055:
        r1 = r1 + -1;
        r8 = r0[r1];
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x0064;
    L_0x005d:
        r8 = r1 + 2;
        r9 = r0[r1];
        r0[r8] = r9;
        goto L_0x0055;
    L_0x0064:
        r1 = r1 + 1;
        r8 = r1 + 1;
        r0[r8] = r4;
    L_0x006a:
        r1 = r1 + -1;
        r4 = r0[r1];
        r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r8 >= 0) goto L_0x0079;
    L_0x0072:
        r4 = r1 + 1;
        r8 = r0[r1];
        r0[r4] = r8;
        goto L_0x006a;
    L_0x0079:
        r1 = r1 + 1;
        r0[r1] = r6;
        r1 = r3 + 1;
        goto L_0x0042;
    L_0x0080:
        r3 = r0[r2];
    L_0x0082:
        r2 = r2 + -1;
        r5 = r0[r2];
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 >= 0) goto L_0x0091;
    L_0x008a:
        r1 = r2 + 1;
        r5 = r0[r2];
        r0[r1] = r5;
        goto L_0x0082;
    L_0x0091:
        r2 = r2 + 1;
        r0[r2] = r3;
    L_0x0095:
        return;
    L_0x0096:
        r5 = r4 >> 3;
        r4 = r4 >> 6;
        r5 = r5 + r4;
        r5 = r5 + 1;
        r4 = r1 + r2;
        r4 = r4 >>> 1;
        r6 = r4 - r5;
        r7 = r6 - r5;
        r8 = r4 + r5;
        r5 = r5 + r8;
        r9 = r0[r6];
        r11 = r0[r7];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00b8;
    L_0x00b0:
        r9 = r0[r6];
        r11 = r0[r7];
        r0[r6] = r11;
        r0[r7] = r9;
    L_0x00b8:
        r9 = r0[r4];
        r11 = r0[r6];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00d4;
    L_0x00c0:
        r9 = r0[r4];
        r11 = r0[r6];
        r0[r4] = r11;
        r0[r6] = r9;
        r11 = r0[r7];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00d4;
    L_0x00ce:
        r11 = r0[r7];
        r0[r6] = r11;
        r0[r7] = r9;
    L_0x00d4:
        r9 = r0[r8];
        r11 = r0[r4];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00fc;
    L_0x00dc:
        r9 = r0[r8];
        r11 = r0[r4];
        r0[r8] = r11;
        r0[r4] = r9;
        r11 = r0[r6];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00fc;
    L_0x00ea:
        r11 = r0[r6];
        r0[r4] = r11;
        r0[r6] = r9;
        r11 = r0[r7];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00fc;
    L_0x00f6:
        r11 = r0[r7];
        r0[r6] = r11;
        r0[r7] = r9;
    L_0x00fc:
        r9 = r0[r5];
        r11 = r0[r8];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x0130;
    L_0x0104:
        r9 = r0[r5];
        r11 = r0[r8];
        r0[r5] = r11;
        r0[r8] = r9;
        r11 = r0[r4];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x0130;
    L_0x0112:
        r11 = r0[r4];
        r0[r8] = r11;
        r0[r4] = r9;
        r11 = r0[r6];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x0130;
    L_0x011e:
        r11 = r0[r6];
        r0[r4] = r11;
        r0[r6] = r9;
        r11 = r0[r7];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x0130;
    L_0x012a:
        r11 = r0[r7];
        r0[r6] = r11;
        r0[r7] = r9;
    L_0x0130:
        r9 = r0[r7];
        r11 = r0[r6];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        r9 = 0;
        if (r13 == 0) goto L_0x0227;
    L_0x0139:
        r10 = r0[r6];
        r12 = r0[r4];
        r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r14 == 0) goto L_0x0227;
    L_0x0141:
        r10 = r0[r4];
        r12 = r0[r8];
        r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r14 == 0) goto L_0x0227;
    L_0x0149:
        r10 = r0[r8];
        r12 = r0[r5];
        r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r14 == 0) goto L_0x0227;
    L_0x0151:
        r10 = r0[r6];
        r12 = r0[r8];
        r14 = r0[r1];
        r0[r6] = r14;
        r14 = r0[r2];
        r0[r8] = r14;
        r4 = r1;
    L_0x015e:
        r4 = r4 + 1;
        r14 = r0[r4];
        r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1));
        if (r6 >= 0) goto L_0x0167;
    L_0x0166:
        goto L_0x015e;
    L_0x0167:
        r6 = r2;
    L_0x0168:
        r6 = r6 + -1;
        r14 = r0[r6];
        r8 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r8 <= 0) goto L_0x0171;
    L_0x0170:
        goto L_0x0168;
    L_0x0171:
        r8 = r4 + -1;
    L_0x0173:
        r8 = r8 + 1;
        if (r8 > r6) goto L_0x01b4;
    L_0x0177:
        r14 = r0[r8];
        r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1));
        if (r16 >= 0) goto L_0x0186;
    L_0x017d:
        r16 = r0[r4];
        r0[r8] = r16;
        r0[r4] = r14;
        r4 = r4 + 1;
        goto L_0x0173;
    L_0x0186:
        r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r16 <= 0) goto L_0x0173;
    L_0x018a:
        r16 = r0[r6];
        r18 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1));
        if (r18 <= 0) goto L_0x019a;
    L_0x0190:
        r16 = r6 + -1;
        if (r6 != r8) goto L_0x0197;
    L_0x0194:
        r6 = r16;
        goto L_0x01b4;
    L_0x0197:
        r6 = r16;
        goto L_0x018a;
    L_0x019a:
        r16 = r0[r6];
        r18 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1));
        if (r18 >= 0) goto L_0x01ab;
    L_0x01a0:
        r16 = r0[r4];
        r0[r8] = r16;
        r16 = r0[r6];
        r0[r4] = r16;
        r4 = r4 + 1;
        goto L_0x01af;
    L_0x01ab:
        r16 = r0[r6];
        r0[r8] = r16;
    L_0x01af:
        r0[r6] = r14;
        r6 = r6 + -1;
        goto L_0x0173;
    L_0x01b4:
        r8 = r4 + -1;
        r14 = r0[r8];
        r0[r1] = r14;
        r0[r8] = r10;
        r8 = r6 + 1;
        r14 = r0[r8];
        r0[r2] = r14;
        r0[r8] = r12;
        r8 = r4 + -2;
        m59055a(r0, r1, r8, r3);
        r1 = r6 + 2;
        m59055a(r0, r1, r2, r9);
        if (r4 >= r7) goto L_0x0223;
    L_0x01d0:
        if (r5 >= r6) goto L_0x0223;
    L_0x01d2:
        r1 = r0[r4];
        r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1));
        if (r3 != 0) goto L_0x01db;
    L_0x01d8:
        r4 = r4 + 1;
        goto L_0x01d2;
    L_0x01db:
        r1 = r0[r6];
        r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1));
        if (r3 != 0) goto L_0x01e4;
    L_0x01e1:
        r6 = r6 + -1;
        goto L_0x01db;
    L_0x01e4:
        r1 = r4 + -1;
    L_0x01e6:
        r1 = r1 + 1;
        if (r1 > r6) goto L_0x0223;
    L_0x01ea:
        r2 = r0[r1];
        r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r5 != 0) goto L_0x01f9;
    L_0x01f0:
        r7 = r0[r4];
        r0[r1] = r7;
        r0[r4] = r2;
        r4 = r4 + 1;
        goto L_0x01e6;
    L_0x01f9:
        r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r5 != 0) goto L_0x01e6;
    L_0x01fd:
        r7 = r0[r6];
        r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1));
        if (r5 != 0) goto L_0x020b;
    L_0x0203:
        r5 = r6 + -1;
        if (r6 != r1) goto L_0x0209;
    L_0x0207:
        r6 = r5;
        goto L_0x0223;
    L_0x0209:
        r6 = r5;
        goto L_0x01fd;
    L_0x020b:
        r7 = r0[r6];
        r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1));
        if (r5 != 0) goto L_0x021a;
    L_0x0211:
        r7 = r0[r4];
        r0[r1] = r7;
        r0[r4] = r10;
        r4 = r4 + 1;
        goto L_0x021e;
    L_0x021a:
        r7 = r0[r6];
        r0[r1] = r7;
    L_0x021e:
        r0[r6] = r2;
        r6 = r6 + -1;
        goto L_0x01e6;
    L_0x0223:
        m59055a(r0, r4, r6, r9);
        goto L_0x0271;
    L_0x0227:
        r4 = r0[r4];
        r6 = r1;
        r8 = r6;
        r7 = r2;
    L_0x022c:
        if (r6 > r7) goto L_0x0267;
    L_0x022e:
        r10 = r0[r6];
        r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r12 != 0) goto L_0x0235;
    L_0x0234:
        goto L_0x0264;
    L_0x0235:
        r10 = r0[r6];
        r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r12 >= 0) goto L_0x0244;
    L_0x023b:
        r12 = r0[r8];
        r0[r6] = r12;
        r0[r8] = r10;
        r8 = r8 + 1;
        goto L_0x0264;
    L_0x0244:
        r12 = r0[r7];
        r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r14 <= 0) goto L_0x024d;
    L_0x024a:
        r7 = r7 + -1;
        goto L_0x0244;
    L_0x024d:
        r12 = r0[r7];
        r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r14 >= 0) goto L_0x025e;
    L_0x0253:
        r12 = r0[r8];
        r0[r6] = r12;
        r12 = r0[r7];
        r0[r8] = r12;
        r8 = r8 + 1;
        goto L_0x0260;
    L_0x025e:
        r0[r6] = r4;
    L_0x0260:
        r0[r7] = r10;
        r7 = r7 + -1;
    L_0x0264:
        r6 = r6 + 1;
        goto L_0x022c;
    L_0x0267:
        r8 = r8 + -1;
        m59055a(r0, r1, r8, r3);
        r7 = r7 + 1;
        m59055a(r0, r7, r2, r9);
    L_0x0271:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.DualPivotQuicksort.a(long[], int, int, boolean):void");
    }

    /* renamed from: a */
    static void m59058a(short[] sArr, int i, int i2, short[] sArr2, int i3, int i4) {
        if (i2 - i > 3200) {
            int i5;
            sArr2 = 65536;
            i3 = new int[65536];
            i4 = i - 1;
            while (true) {
                i4++;
                if (i4 > i2) {
                    break;
                }
                i5 = sArr[i4] - -32768;
                i3[i5] = i3[i5] + 1;
            }
            i2++;
            while (i2 > i) {
                while (true) {
                    sArr2--;
                    if (i3[sArr2] != 0) {
                        break;
                    }
                }
                i4 = (short) (sArr2 - 32768);
                i5 = i3[sArr2];
                do {
                    i2--;
                    sArr[i2] = i4;
                    i5--;
                } while (i5 > 0);
            }
            return;
        }
        m59062b(sArr, i, i2, sArr2, i3, i4);
    }

    /* renamed from: b */
    private static void m59062b(short[] sArr, int i, int i2, short[] sArr2, int i3, int i4) {
        Object obj = sArr;
        int i5 = i;
        int i6 = i2;
        Object obj2 = sArr2;
        boolean z = true;
        if (i6 - i5 < 286) {
            m59057a((short[]) obj, i5, i6, true);
            return;
        }
        int[] iArr = new int[68];
        iArr[0] = i5;
        int i7 = i5;
        boolean z2 = false;
        while (i7 < i6) {
            while (i7 < i6) {
                int i8 = i7 + 1;
                if (obj[i7] != obj[i8]) {
                    break;
                }
                i7 = i8;
            }
            if (i7 == i6) {
                break;
            }
            int i9;
            int i10;
            i8 = i7 + 1;
            if (obj[i7] < obj[i8]) {
                while (true) {
                    i7++;
                    if (i7 > i6 || obj[i7 - 1] > obj[i7]) {
                        break;
                    }
                }
            } else if (obj[i7] > obj[i8]) {
                while (true) {
                    i7++;
                    if (i7 > i6 || obj[i7 - 1] < obj[i7]) {
                        i9 = iArr[z2] - 1;
                        i8 = i7;
                    }
                }
                i9 = iArr[z2] - 1;
                i8 = i7;
                while (true) {
                    i9++;
                    i8--;
                    if (i9 >= i8) {
                        break;
                    }
                    short s = obj[i9];
                    obj[i9] = obj[i8];
                    obj[i8] = s;
                }
            }
            if (iArr[z2] > i5 && obj[iArr[z2]] >= obj[iArr[z2] - 1]) {
                i10 = z2 - 1;
            }
            z2 = i10 + 1;
            if (z2) {
                m59057a((short[]) obj, i5, i6, true);
                return;
            }
            iArr[z2] = i7;
        }
        if (z2 != 0) {
            if (z2 != 1 || iArr[z2] <= i6) {
                boolean z3;
                Object obj3;
                boolean z4;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                i6++;
                if (iArr[z2] < i6) {
                    z2++;
                    iArr[z2] = i6;
                }
                i7 = 1;
                i9 = 0;
                while (true) {
                    z3 = i7 << 1;
                    if (z3 >= z2) {
                        break;
                    }
                    i9 = (byte) (i9 ^ 1);
                }
                i7 = i6 - i5;
                if (obj2 != null && i4 >= i7) {
                    if (i3 + i7 <= obj2.length) {
                        i8 = i3;
                        if (i9 != 0) {
                            System.arraycopy(obj, i5, obj2, i8, i7);
                            i8 -= i5;
                            i5 = 0;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                        } else {
                            i5 = i8 - i5;
                            i8 = 0;
                        }
                        while (z2 > z) {
                            z4 = false;
                            for (z3 = true; z3 <= z2; z3 += 2) {
                                i11 = iArr[z3];
                                i12 = iArr[z3 - 1];
                                i13 = iArr[z3 - 2];
                                i14 = i12;
                                i15 = i13;
                                while (i13 < i11) {
                                    if (i14 < i11) {
                                        if (i15 < i12 || obj[i15 + i8] > obj[i14 + i8]) {
                                            i16 = i14 + 1;
                                            obj2[i13 + i5] = obj[i14 + i8];
                                            i14 = i16;
                                            i13++;
                                        }
                                    }
                                    i16 = i15 + 1;
                                    obj2[i13 + i5] = obj[i15 + i8];
                                    i15 = i16;
                                    i13++;
                                }
                                z4++;
                                iArr[z4] = i11;
                            }
                            if ((z2 & 1) != 0) {
                                i17 = iArr[z2 - 1];
                                i16 = i6;
                                while (true) {
                                    i16--;
                                    if (i16 >= i17) {
                                        break;
                                    }
                                    obj2[i16 + i5] = obj[i16 + i8];
                                }
                                z4++;
                                iArr[z4] = i6;
                            }
                            z2 = z4;
                            z = true;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                            i18 = i8;
                            i8 = i5;
                            i5 = i18;
                        }
                    }
                }
                obj2 = new short[i7];
                i8 = 0;
                if (i9 != 0) {
                    i5 = i8 - i5;
                    i8 = 0;
                } else {
                    System.arraycopy(obj, i5, obj2, i8, i7);
                    i8 -= i5;
                    i5 = 0;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                }
                while (z2 > z) {
                    z4 = false;
                    for (z3 = true; z3 <= z2; z3 += 2) {
                        i11 = iArr[z3];
                        i12 = iArr[z3 - 1];
                        i13 = iArr[z3 - 2];
                        i14 = i12;
                        i15 = i13;
                        while (i13 < i11) {
                            if (i14 < i11) {
                                if (i15 < i12) {
                                }
                                i16 = i14 + 1;
                                obj2[i13 + i5] = obj[i14 + i8];
                                i14 = i16;
                                i13++;
                            }
                            i16 = i15 + 1;
                            obj2[i13 + i5] = obj[i15 + i8];
                            i15 = i16;
                            i13++;
                        }
                        z4++;
                        iArr[z4] = i11;
                    }
                    if ((z2 & 1) != 0) {
                        i17 = iArr[z2 - 1];
                        i16 = i6;
                        while (true) {
                            i16--;
                            if (i16 >= i17) {
                                break;
                            }
                            obj2[i16 + i5] = obj[i16 + i8];
                        }
                        z4++;
                        iArr[z4] = i6;
                    }
                    z2 = z4;
                    z = true;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                    i18 = i8;
                    i8 = i5;
                    i5 = i18;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m59057a(short[] r11, int r12, int r13, boolean r14) {
        /*
        r0 = r13 - r12;
        r0 = r0 + 1;
        r1 = 47;
        if (r0 >= r1) goto L_0x0080;
    L_0x0008:
        if (r14 == 0) goto L_0x0029;
    L_0x000a:
        r14 = r12;
    L_0x000b:
        if (r14 >= r13) goto L_0x007f;
    L_0x000d:
        r0 = r14 + 1;
        r1 = r11[r0];
    L_0x0011:
        r2 = r11[r14];
        if (r1 >= r2) goto L_0x0023;
    L_0x0015:
        r2 = r14 + 1;
        r3 = r11[r14];
        r11[r2] = r3;
        r2 = r14 + -1;
        if (r14 != r12) goto L_0x0021;
    L_0x001f:
        r14 = r2;
        goto L_0x0023;
    L_0x0021:
        r14 = r2;
        goto L_0x0011;
    L_0x0023:
        r14 = r14 + 1;
        r11[r14] = r1;
        r14 = r0;
        goto L_0x000b;
    L_0x0029:
        if (r12 < r13) goto L_0x002c;
    L_0x002b:
        return;
    L_0x002c:
        r12 = r12 + 1;
        r14 = r11[r12];
        r0 = r12 + -1;
        r0 = r11[r0];
        if (r14 >= r0) goto L_0x0029;
    L_0x0036:
        r14 = r12 + 1;
        if (r14 > r13) goto L_0x006c;
    L_0x003a:
        r0 = r11[r12];
        r1 = r11[r14];
        if (r0 >= r1) goto L_0x0045;
    L_0x0040:
        r1 = r11[r14];
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x0045:
        r12 = r12 + -1;
        r2 = r11[r12];
        if (r0 >= r2) goto L_0x0052;
    L_0x004b:
        r2 = r12 + 2;
        r3 = r11[r12];
        r11[r2] = r3;
        goto L_0x0045;
    L_0x0052:
        r12 = r12 + 1;
        r2 = r12 + 1;
        r11[r2] = r0;
    L_0x0058:
        r12 = r12 + -1;
        r0 = r11[r12];
        if (r1 >= r0) goto L_0x0065;
    L_0x005e:
        r0 = r12 + 1;
        r2 = r11[r12];
        r11[r0] = r2;
        goto L_0x0058;
    L_0x0065:
        r12 = r12 + 1;
        r11[r12] = r1;
        r12 = r14 + 1;
        goto L_0x0036;
    L_0x006c:
        r12 = r11[r13];
    L_0x006e:
        r13 = r13 + -1;
        r14 = r11[r13];
        if (r12 >= r14) goto L_0x007b;
    L_0x0074:
        r14 = r13 + 1;
        r0 = r11[r13];
        r11[r14] = r0;
        goto L_0x006e;
    L_0x007b:
        r13 = r13 + 1;
        r11[r13] = r12;
    L_0x007f:
        return;
    L_0x0080:
        r1 = r0 >> 3;
        r0 = r0 >> 6;
        r1 = r1 + r0;
        r1 = r1 + 1;
        r0 = r12 + r13;
        r0 = r0 >>> 1;
        r2 = r0 - r1;
        r3 = r2 - r1;
        r4 = r0 + r1;
        r1 = r1 + r4;
        r5 = r11[r2];
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x00a0;
    L_0x0098:
        r5 = r11[r2];
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00a0:
        r5 = r11[r0];
        r6 = r11[r2];
        if (r5 >= r6) goto L_0x00b8;
    L_0x00a6:
        r5 = r11[r0];
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x00b8;
    L_0x00b2:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00b8:
        r5 = r11[r4];
        r6 = r11[r0];
        if (r5 >= r6) goto L_0x00da;
    L_0x00be:
        r5 = r11[r4];
        r6 = r11[r0];
        r11[r4] = r6;
        r11[r0] = r5;
        r6 = r11[r2];
        if (r5 >= r6) goto L_0x00da;
    L_0x00ca:
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x00da;
    L_0x00d4:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00da:
        r5 = r11[r1];
        r6 = r11[r4];
        if (r5 >= r6) goto L_0x0106;
    L_0x00e0:
        r5 = r11[r1];
        r6 = r11[r4];
        r11[r1] = r6;
        r11[r4] = r5;
        r6 = r11[r0];
        if (r5 >= r6) goto L_0x0106;
    L_0x00ec:
        r6 = r11[r0];
        r11[r4] = r6;
        r11[r0] = r5;
        r6 = r11[r2];
        if (r5 >= r6) goto L_0x0106;
    L_0x00f6:
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x0106;
    L_0x0100:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x0106:
        r5 = r11[r3];
        r6 = r11[r2];
        r7 = 0;
        if (r5 == r6) goto L_0x01db;
    L_0x010d:
        r5 = r11[r2];
        r6 = r11[r0];
        if (r5 == r6) goto L_0x01db;
    L_0x0113:
        r5 = r11[r0];
        r6 = r11[r4];
        if (r5 == r6) goto L_0x01db;
    L_0x0119:
        r5 = r11[r4];
        r6 = r11[r1];
        if (r5 == r6) goto L_0x01db;
    L_0x011f:
        r0 = r11[r2];
        r5 = r11[r4];
        r6 = r11[r12];
        r11[r2] = r6;
        r2 = r11[r13];
        r11[r4] = r2;
        r2 = r12;
    L_0x012c:
        r2 = r2 + 1;
        r4 = r11[r2];
        if (r4 >= r0) goto L_0x0133;
    L_0x0132:
        goto L_0x012c;
    L_0x0133:
        r4 = r13;
    L_0x0134:
        r4 = r4 + -1;
        r6 = r11[r4];
        if (r6 <= r5) goto L_0x013b;
    L_0x013a:
        goto L_0x0134;
    L_0x013b:
        r6 = r2 + -1;
    L_0x013d:
        r6 = r6 + 1;
        if (r6 > r4) goto L_0x0174;
    L_0x0141:
        r8 = r11[r6];
        if (r8 >= r0) goto L_0x014e;
    L_0x0145:
        r9 = r11[r2];
        r11[r6] = r9;
        r11[r2] = r8;
        r2 = r2 + 1;
        goto L_0x013d;
    L_0x014e:
        if (r8 <= r5) goto L_0x013d;
    L_0x0150:
        r9 = r11[r4];
        if (r9 <= r5) goto L_0x015c;
    L_0x0154:
        r9 = r4 + -1;
        if (r4 != r6) goto L_0x015a;
    L_0x0158:
        r4 = r9;
        goto L_0x0174;
    L_0x015a:
        r4 = r9;
        goto L_0x0150;
    L_0x015c:
        r9 = r11[r4];
        if (r9 >= r0) goto L_0x016b;
    L_0x0160:
        r9 = r11[r2];
        r11[r6] = r9;
        r9 = r11[r4];
        r11[r2] = r9;
        r2 = r2 + 1;
        goto L_0x016f;
    L_0x016b:
        r9 = r11[r4];
        r11[r6] = r9;
    L_0x016f:
        r11[r4] = r8;
        r4 = r4 + -1;
        goto L_0x013d;
    L_0x0174:
        r6 = r2 + -1;
        r8 = r11[r6];
        r11[r12] = r8;
        r11[r6] = r0;
        r6 = r4 + 1;
        r8 = r11[r6];
        r11[r13] = r8;
        r11[r6] = r5;
        r6 = r2 + -2;
        m59057a(r11, r12, r6, r14);
        r12 = r4 + 2;
        m59057a(r11, r12, r13, r7);
        if (r2 >= r3) goto L_0x01d7;
    L_0x0190:
        if (r1 >= r4) goto L_0x01d7;
    L_0x0192:
        r12 = r11[r2];
        if (r12 != r0) goto L_0x0199;
    L_0x0196:
        r2 = r2 + 1;
        goto L_0x0192;
    L_0x0199:
        r12 = r11[r4];
        if (r12 != r5) goto L_0x01a0;
    L_0x019d:
        r4 = r4 + -1;
        goto L_0x0199;
    L_0x01a0:
        r12 = r2 + -1;
    L_0x01a2:
        r12 = r12 + 1;
        if (r12 > r4) goto L_0x01d7;
    L_0x01a6:
        r13 = r11[r12];
        if (r13 != r0) goto L_0x01b3;
    L_0x01aa:
        r14 = r11[r2];
        r11[r12] = r14;
        r11[r2] = r13;
        r2 = r2 + 1;
        goto L_0x01a2;
    L_0x01b3:
        if (r13 != r5) goto L_0x01a2;
    L_0x01b5:
        r14 = r11[r4];
        if (r14 != r5) goto L_0x01c1;
    L_0x01b9:
        r14 = r4 + -1;
        if (r4 != r12) goto L_0x01bf;
    L_0x01bd:
        r4 = r14;
        goto L_0x01d7;
    L_0x01bf:
        r4 = r14;
        goto L_0x01b5;
    L_0x01c1:
        r14 = r11[r4];
        if (r14 != r0) goto L_0x01ce;
    L_0x01c5:
        r14 = r11[r2];
        r11[r12] = r14;
        r11[r2] = r0;
        r2 = r2 + 1;
        goto L_0x01d2;
    L_0x01ce:
        r14 = r11[r4];
        r11[r12] = r14;
    L_0x01d2:
        r11[r4] = r13;
        r4 = r4 + -1;
        goto L_0x01a2;
    L_0x01d7:
        m59057a(r11, r2, r4, r7);
        goto L_0x021d;
    L_0x01db:
        r0 = r11[r0];
        r1 = r12;
        r3 = r1;
        r2 = r13;
    L_0x01e0:
        if (r1 > r2) goto L_0x0213;
    L_0x01e2:
        r4 = r11[r1];
        if (r4 != r0) goto L_0x01e7;
    L_0x01e6:
        goto L_0x0210;
    L_0x01e7:
        r4 = r11[r1];
        if (r4 >= r0) goto L_0x01f4;
    L_0x01eb:
        r5 = r11[r3];
        r11[r1] = r5;
        r11[r3] = r4;
        r3 = r3 + 1;
        goto L_0x0210;
    L_0x01f4:
        r5 = r11[r2];
        if (r5 <= r0) goto L_0x01fb;
    L_0x01f8:
        r2 = r2 + -1;
        goto L_0x01f4;
    L_0x01fb:
        r5 = r11[r2];
        if (r5 >= r0) goto L_0x020a;
    L_0x01ff:
        r5 = r11[r3];
        r11[r1] = r5;
        r5 = r11[r2];
        r11[r3] = r5;
        r3 = r3 + 1;
        goto L_0x020c;
    L_0x020a:
        r11[r1] = r0;
    L_0x020c:
        r11[r2] = r4;
        r2 = r2 + -1;
    L_0x0210:
        r1 = r1 + 1;
        goto L_0x01e0;
    L_0x0213:
        r3 = r3 + -1;
        m59057a(r11, r12, r3, r14);
        r2 = r2 + 1;
        m59057a(r11, r2, r13, r7);
    L_0x021d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.DualPivotQuicksort.a(short[], int, int, boolean):void");
    }

    /* renamed from: a */
    static void m59048a(char[] cArr, int i, int i2, char[] cArr2, int i3, int i4) {
        if (i2 - i > 3200) {
            cArr2 = 65536;
            i3 = new int[65536];
            i4 = i - 1;
            while (true) {
                i4++;
                if (i4 > i2) {
                    break;
                }
                char c = cArr[i4];
                i3[c] = i3[c] + 1;
            }
            i2++;
            while (i2 > i) {
                while (true) {
                    cArr2--;
                    if (i3[cArr2] != 0) {
                        break;
                    }
                }
                i4 = (char) cArr2;
                int i5 = i3[cArr2];
                do {
                    i2--;
                    cArr[i2] = i4;
                    i5--;
                } while (i5 > 0);
            }
            return;
        }
        m59059b(cArr, i, i2, cArr2, i3, i4);
    }

    /* renamed from: b */
    private static void m59059b(char[] cArr, int i, int i2, char[] cArr2, int i3, int i4) {
        Object obj = cArr;
        int i5 = i;
        int i6 = i2;
        Object obj2 = cArr2;
        boolean z = true;
        if (i6 - i5 < 286) {
            m59047a((char[]) obj, i5, i6, true);
            return;
        }
        int i7;
        int[] iArr = new int[68];
        iArr[0] = i5;
        int i8 = i5;
        boolean z2 = false;
        while (i8 < i6) {
            while (i8 < i6) {
                int i9 = i8 + 1;
                if (obj[i8] != obj[i9]) {
                    break;
                }
                i8 = i9;
            }
            if (i8 == i6) {
                break;
            }
            int i10;
            i9 = i8 + 1;
            if (obj[i8] < obj[i9]) {
                while (true) {
                    i8++;
                    if (i8 > i6 || obj[i8 - 1] > obj[i8]) {
                        break;
                    }
                }
            } else if (obj[i8] > obj[i9]) {
                while (true) {
                    i8++;
                    if (i8 > i6 || obj[i8 - 1] < obj[i8]) {
                        i7 = iArr[z2] - 1;
                        i9 = i8;
                    }
                }
                i7 = iArr[z2] - 1;
                i9 = i8;
                while (true) {
                    i7++;
                    i9--;
                    if (i7 >= i9) {
                        break;
                    }
                    char c = obj[i7];
                    obj[i7] = obj[i9];
                    obj[i9] = c;
                }
            }
            if (iArr[z2] > i5 && obj[iArr[z2]] >= obj[iArr[z2] - 1]) {
                i10 = z2 - 1;
            }
            z2 = i10 + 1;
            if (z2) {
                m59047a((char[]) obj, i5, i6, true);
                return;
            }
            iArr[z2] = i8;
        }
        if (z2 != 0) {
            if (z2 != 1 || iArr[z2] <= i6) {
                boolean z3;
                Object obj3;
                boolean z4;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                i6++;
                if (iArr[z2] < i6) {
                    z2++;
                    iArr[z2] = i6;
                }
                i8 = 1;
                i7 = 0;
                while (true) {
                    z3 = i8 << 1;
                    if (z3 >= z2) {
                        break;
                    }
                    i7 = (byte) (i7 ^ 1);
                }
                i8 = i6 - i5;
                if (obj2 != null && i4 >= i8) {
                    if (i3 + i8 <= obj2.length) {
                        i9 = i3;
                        if (i7 != 0) {
                            System.arraycopy(obj, i5, obj2, i9, i8);
                            i9 -= i5;
                            i5 = 0;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                        } else {
                            i5 = i9 - i5;
                            i9 = 0;
                        }
                        while (z2 > z) {
                            z4 = false;
                            for (z3 = true; z3 <= z2; z3 += 2) {
                                i11 = iArr[z3];
                                i12 = iArr[z3 - 1];
                                i13 = iArr[z3 - 2];
                                i14 = i12;
                                i15 = i13;
                                while (i13 < i11) {
                                    if (i14 < i11) {
                                        if (i15 < i12 || obj[i15 + i9] > obj[i14 + i9]) {
                                            i16 = i14 + 1;
                                            obj2[i13 + i5] = obj[i14 + i9];
                                            i14 = i16;
                                            i13++;
                                        }
                                    }
                                    i16 = i15 + 1;
                                    obj2[i13 + i5] = obj[i15 + i9];
                                    i15 = i16;
                                    i13++;
                                }
                                z4++;
                                iArr[z4] = i11;
                            }
                            if ((z2 & 1) != 0) {
                                i17 = iArr[z2 - 1];
                                i16 = i6;
                                while (true) {
                                    i16--;
                                    if (i16 >= i17) {
                                        break;
                                    }
                                    obj2[i16 + i5] = obj[i16 + i9];
                                }
                                z4++;
                                iArr[z4] = i6;
                            }
                            z2 = z4;
                            z = true;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                            i18 = i9;
                            i9 = i5;
                            i5 = i18;
                        }
                    }
                }
                obj2 = new char[i8];
                i9 = 0;
                if (i7 != 0) {
                    i5 = i9 - i5;
                    i9 = 0;
                } else {
                    System.arraycopy(obj, i5, obj2, i9, i8);
                    i9 -= i5;
                    i5 = 0;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                }
                while (z2 > z) {
                    z4 = false;
                    for (z3 = true; z3 <= z2; z3 += 2) {
                        i11 = iArr[z3];
                        i12 = iArr[z3 - 1];
                        i13 = iArr[z3 - 2];
                        i14 = i12;
                        i15 = i13;
                        while (i13 < i11) {
                            if (i14 < i11) {
                                if (i15 < i12) {
                                }
                                i16 = i14 + 1;
                                obj2[i13 + i5] = obj[i14 + i9];
                                i14 = i16;
                                i13++;
                            }
                            i16 = i15 + 1;
                            obj2[i13 + i5] = obj[i15 + i9];
                            i15 = i16;
                            i13++;
                        }
                        z4++;
                        iArr[z4] = i11;
                    }
                    if ((z2 & 1) != 0) {
                        i17 = iArr[z2 - 1];
                        i16 = i6;
                        while (true) {
                            i16--;
                            if (i16 >= i17) {
                                break;
                            }
                            obj2[i16 + i5] = obj[i16 + i9];
                        }
                        z4++;
                        iArr[z4] = i6;
                    }
                    z2 = z4;
                    z = true;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                    i18 = i9;
                    i9 = i5;
                    i5 = i18;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m59047a(char[] r11, int r12, int r13, boolean r14) {
        /*
        r0 = r13 - r12;
        r0 = r0 + 1;
        r1 = 47;
        if (r0 >= r1) goto L_0x0080;
    L_0x0008:
        if (r14 == 0) goto L_0x0029;
    L_0x000a:
        r14 = r12;
    L_0x000b:
        if (r14 >= r13) goto L_0x007f;
    L_0x000d:
        r0 = r14 + 1;
        r1 = r11[r0];
    L_0x0011:
        r2 = r11[r14];
        if (r1 >= r2) goto L_0x0023;
    L_0x0015:
        r2 = r14 + 1;
        r3 = r11[r14];
        r11[r2] = r3;
        r2 = r14 + -1;
        if (r14 != r12) goto L_0x0021;
    L_0x001f:
        r14 = r2;
        goto L_0x0023;
    L_0x0021:
        r14 = r2;
        goto L_0x0011;
    L_0x0023:
        r14 = r14 + 1;
        r11[r14] = r1;
        r14 = r0;
        goto L_0x000b;
    L_0x0029:
        if (r12 < r13) goto L_0x002c;
    L_0x002b:
        return;
    L_0x002c:
        r12 = r12 + 1;
        r14 = r11[r12];
        r0 = r12 + -1;
        r0 = r11[r0];
        if (r14 >= r0) goto L_0x0029;
    L_0x0036:
        r14 = r12 + 1;
        if (r14 > r13) goto L_0x006c;
    L_0x003a:
        r0 = r11[r12];
        r1 = r11[r14];
        if (r0 >= r1) goto L_0x0045;
    L_0x0040:
        r1 = r11[r14];
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x0045:
        r12 = r12 + -1;
        r2 = r11[r12];
        if (r0 >= r2) goto L_0x0052;
    L_0x004b:
        r2 = r12 + 2;
        r3 = r11[r12];
        r11[r2] = r3;
        goto L_0x0045;
    L_0x0052:
        r12 = r12 + 1;
        r2 = r12 + 1;
        r11[r2] = r0;
    L_0x0058:
        r12 = r12 + -1;
        r0 = r11[r12];
        if (r1 >= r0) goto L_0x0065;
    L_0x005e:
        r0 = r12 + 1;
        r2 = r11[r12];
        r11[r0] = r2;
        goto L_0x0058;
    L_0x0065:
        r12 = r12 + 1;
        r11[r12] = r1;
        r12 = r14 + 1;
        goto L_0x0036;
    L_0x006c:
        r12 = r11[r13];
    L_0x006e:
        r13 = r13 + -1;
        r14 = r11[r13];
        if (r12 >= r14) goto L_0x007b;
    L_0x0074:
        r14 = r13 + 1;
        r0 = r11[r13];
        r11[r14] = r0;
        goto L_0x006e;
    L_0x007b:
        r13 = r13 + 1;
        r11[r13] = r12;
    L_0x007f:
        return;
    L_0x0080:
        r1 = r0 >> 3;
        r0 = r0 >> 6;
        r1 = r1 + r0;
        r1 = r1 + 1;
        r0 = r12 + r13;
        r0 = r0 >>> 1;
        r2 = r0 - r1;
        r3 = r2 - r1;
        r4 = r0 + r1;
        r1 = r1 + r4;
        r5 = r11[r2];
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x00a0;
    L_0x0098:
        r5 = r11[r2];
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00a0:
        r5 = r11[r0];
        r6 = r11[r2];
        if (r5 >= r6) goto L_0x00b8;
    L_0x00a6:
        r5 = r11[r0];
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x00b8;
    L_0x00b2:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00b8:
        r5 = r11[r4];
        r6 = r11[r0];
        if (r5 >= r6) goto L_0x00da;
    L_0x00be:
        r5 = r11[r4];
        r6 = r11[r0];
        r11[r4] = r6;
        r11[r0] = r5;
        r6 = r11[r2];
        if (r5 >= r6) goto L_0x00da;
    L_0x00ca:
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x00da;
    L_0x00d4:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00da:
        r5 = r11[r1];
        r6 = r11[r4];
        if (r5 >= r6) goto L_0x0106;
    L_0x00e0:
        r5 = r11[r1];
        r6 = r11[r4];
        r11[r1] = r6;
        r11[r4] = r5;
        r6 = r11[r0];
        if (r5 >= r6) goto L_0x0106;
    L_0x00ec:
        r6 = r11[r0];
        r11[r4] = r6;
        r11[r0] = r5;
        r6 = r11[r2];
        if (r5 >= r6) goto L_0x0106;
    L_0x00f6:
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        if (r5 >= r6) goto L_0x0106;
    L_0x0100:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x0106:
        r5 = r11[r3];
        r6 = r11[r2];
        r7 = 0;
        if (r5 == r6) goto L_0x01db;
    L_0x010d:
        r5 = r11[r2];
        r6 = r11[r0];
        if (r5 == r6) goto L_0x01db;
    L_0x0113:
        r5 = r11[r0];
        r6 = r11[r4];
        if (r5 == r6) goto L_0x01db;
    L_0x0119:
        r5 = r11[r4];
        r6 = r11[r1];
        if (r5 == r6) goto L_0x01db;
    L_0x011f:
        r0 = r11[r2];
        r5 = r11[r4];
        r6 = r11[r12];
        r11[r2] = r6;
        r2 = r11[r13];
        r11[r4] = r2;
        r2 = r12;
    L_0x012c:
        r2 = r2 + 1;
        r4 = r11[r2];
        if (r4 >= r0) goto L_0x0133;
    L_0x0132:
        goto L_0x012c;
    L_0x0133:
        r4 = r13;
    L_0x0134:
        r4 = r4 + -1;
        r6 = r11[r4];
        if (r6 <= r5) goto L_0x013b;
    L_0x013a:
        goto L_0x0134;
    L_0x013b:
        r6 = r2 + -1;
    L_0x013d:
        r6 = r6 + 1;
        if (r6 > r4) goto L_0x0174;
    L_0x0141:
        r8 = r11[r6];
        if (r8 >= r0) goto L_0x014e;
    L_0x0145:
        r9 = r11[r2];
        r11[r6] = r9;
        r11[r2] = r8;
        r2 = r2 + 1;
        goto L_0x013d;
    L_0x014e:
        if (r8 <= r5) goto L_0x013d;
    L_0x0150:
        r9 = r11[r4];
        if (r9 <= r5) goto L_0x015c;
    L_0x0154:
        r9 = r4 + -1;
        if (r4 != r6) goto L_0x015a;
    L_0x0158:
        r4 = r9;
        goto L_0x0174;
    L_0x015a:
        r4 = r9;
        goto L_0x0150;
    L_0x015c:
        r9 = r11[r4];
        if (r9 >= r0) goto L_0x016b;
    L_0x0160:
        r9 = r11[r2];
        r11[r6] = r9;
        r9 = r11[r4];
        r11[r2] = r9;
        r2 = r2 + 1;
        goto L_0x016f;
    L_0x016b:
        r9 = r11[r4];
        r11[r6] = r9;
    L_0x016f:
        r11[r4] = r8;
        r4 = r4 + -1;
        goto L_0x013d;
    L_0x0174:
        r6 = r2 + -1;
        r8 = r11[r6];
        r11[r12] = r8;
        r11[r6] = r0;
        r6 = r4 + 1;
        r8 = r11[r6];
        r11[r13] = r8;
        r11[r6] = r5;
        r6 = r2 + -2;
        m59047a(r11, r12, r6, r14);
        r12 = r4 + 2;
        m59047a(r11, r12, r13, r7);
        if (r2 >= r3) goto L_0x01d7;
    L_0x0190:
        if (r1 >= r4) goto L_0x01d7;
    L_0x0192:
        r12 = r11[r2];
        if (r12 != r0) goto L_0x0199;
    L_0x0196:
        r2 = r2 + 1;
        goto L_0x0192;
    L_0x0199:
        r12 = r11[r4];
        if (r12 != r5) goto L_0x01a0;
    L_0x019d:
        r4 = r4 + -1;
        goto L_0x0199;
    L_0x01a0:
        r12 = r2 + -1;
    L_0x01a2:
        r12 = r12 + 1;
        if (r12 > r4) goto L_0x01d7;
    L_0x01a6:
        r13 = r11[r12];
        if (r13 != r0) goto L_0x01b3;
    L_0x01aa:
        r14 = r11[r2];
        r11[r12] = r14;
        r11[r2] = r13;
        r2 = r2 + 1;
        goto L_0x01a2;
    L_0x01b3:
        if (r13 != r5) goto L_0x01a2;
    L_0x01b5:
        r14 = r11[r4];
        if (r14 != r5) goto L_0x01c1;
    L_0x01b9:
        r14 = r4 + -1;
        if (r4 != r12) goto L_0x01bf;
    L_0x01bd:
        r4 = r14;
        goto L_0x01d7;
    L_0x01bf:
        r4 = r14;
        goto L_0x01b5;
    L_0x01c1:
        r14 = r11[r4];
        if (r14 != r0) goto L_0x01ce;
    L_0x01c5:
        r14 = r11[r2];
        r11[r12] = r14;
        r11[r2] = r0;
        r2 = r2 + 1;
        goto L_0x01d2;
    L_0x01ce:
        r14 = r11[r4];
        r11[r12] = r14;
    L_0x01d2:
        r11[r4] = r13;
        r4 = r4 + -1;
        goto L_0x01a2;
    L_0x01d7:
        m59047a(r11, r2, r4, r7);
        goto L_0x021d;
    L_0x01db:
        r0 = r11[r0];
        r1 = r12;
        r3 = r1;
        r2 = r13;
    L_0x01e0:
        if (r1 > r2) goto L_0x0213;
    L_0x01e2:
        r4 = r11[r1];
        if (r4 != r0) goto L_0x01e7;
    L_0x01e6:
        goto L_0x0210;
    L_0x01e7:
        r4 = r11[r1];
        if (r4 >= r0) goto L_0x01f4;
    L_0x01eb:
        r5 = r11[r3];
        r11[r1] = r5;
        r11[r3] = r4;
        r3 = r3 + 1;
        goto L_0x0210;
    L_0x01f4:
        r5 = r11[r2];
        if (r5 <= r0) goto L_0x01fb;
    L_0x01f8:
        r2 = r2 + -1;
        goto L_0x01f4;
    L_0x01fb:
        r5 = r11[r2];
        if (r5 >= r0) goto L_0x020a;
    L_0x01ff:
        r5 = r11[r3];
        r11[r1] = r5;
        r5 = r11[r2];
        r11[r3] = r5;
        r3 = r3 + 1;
        goto L_0x020c;
    L_0x020a:
        r11[r1] = r0;
    L_0x020c:
        r11[r2] = r4;
        r2 = r2 + -1;
    L_0x0210:
        r1 = r1 + 1;
        goto L_0x01e0;
    L_0x0213:
        r3 = r3 + -1;
        m59047a(r11, r12, r3, r14);
        r2 = r2 + 1;
        m59047a(r11, r2, r13, r7);
    L_0x021d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.DualPivotQuicksort.a(char[], int, int, boolean):void");
    }

    /* renamed from: a */
    static void m59046a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte b;
        if (i2 - i > 29) {
            i3 = 256;
            int[] iArr = new int[256];
            int i5 = i - 1;
            while (true) {
                i5++;
                if (i5 > i2) {
                    break;
                }
                i4 = bArr[i5] + ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                iArr[i4] = iArr[i4] + 1;
            }
            i2++;
            while (i2 > i) {
                while (true) {
                    i3--;
                    if (iArr[i3] != 0) {
                        break;
                    }
                }
                b = (byte) (i3 - 128);
                i4 = iArr[i3];
                do {
                    i2--;
                    bArr[i2] = b;
                    i4--;
                } while (i4 > 0);
            }
            return;
        }
        i3 = i;
        while (i3 < i2) {
            int i6 = i3 + 1;
            b = bArr[i6];
            while (b < bArr[i3]) {
                bArr[i3 + 1] = bArr[i3];
                i4 = i3 - 1;
                if (i3 == i) {
                    i3 = i4;
                    break;
                }
                i3 = i4;
            }
            bArr[i3 + 1] = b;
            i3 = i6;
        }
    }

    /* renamed from: a */
    static void m59052a(float[] fArr, int i, int i2, float[] fArr2, int i3, int i4) {
        while (i <= i2 && Float.isNaN(fArr[i2])) {
            i2--;
        }
        int i5 = i2;
        while (true) {
            i2--;
            if (i2 < i) {
                break;
            }
            float f = fArr[i2];
            if (f != f) {
                fArr[i2] = fArr[i5];
                fArr[i5] = f;
                i5--;
            }
        }
        m59061b(fArr, i, i5, fArr2, i3, i4);
        i2 = i5;
        while (i < i2) {
            i3 = (i + i2) >>> 1;
            if (fArr[i3] < 0) {
                i = i3 + 1;
            } else {
                i2 = i3;
            }
        }
        while (i <= i5 && Float.floatToRawIntBits(fArr[i]) < 0) {
            i++;
        }
        i2 = i - 1;
        while (true) {
            i++;
            if (i <= i5) {
                i3 = fArr[i];
                if (i3 == 0) {
                    if (Float.floatToRawIntBits(i3) < 0) {
                        fArr[i] = 0.0f;
                        i2++;
                        fArr[i2] = Integer.MIN_VALUE;
                    }
                } else {
                    return;
                }
            }
            return;
        }
    }

    /* renamed from: b */
    private static void m59061b(float[] fArr, int i, int i2, float[] fArr2, int i3, int i4) {
        Object obj = fArr;
        int i5 = i;
        int i6 = i2;
        Object obj2 = fArr2;
        if (i6 - i5 < 286) {
            m59051a((float[]) obj, i5, i6, true);
            return;
        }
        int[] iArr = new int[68];
        iArr[0] = i5;
        int i7 = i5;
        int i8 = 0;
        while (i7 < i6) {
            while (i7 < i6) {
                int i9 = i7 + 1;
                if (obj[i7] != obj[i9]) {
                    break;
                }
                i7 = i9;
            }
            if (i7 == i6) {
                break;
            }
            int i10;
            i9 = i7 + 1;
            if (obj[i7] < obj[i9]) {
                while (true) {
                    i7++;
                    if (i7 > i6 || obj[i7 - 1] > obj[i7]) {
                        break;
                    }
                }
            } else if (obj[i7] > obj[i9]) {
                while (true) {
                    i7++;
                    if (i7 > i6 || obj[i7 - 1] < obj[i7]) {
                        i10 = iArr[i8] - 1;
                        i9 = i7;
                    }
                }
                i10 = iArr[i8] - 1;
                i9 = i7;
                while (true) {
                    i10++;
                    i9--;
                    if (i10 >= i9) {
                        break;
                    }
                    float f = obj[i10];
                    obj[i10] = obj[i9];
                    obj[i9] = f;
                }
            }
            if (iArr[i8] > i5 && obj[iArr[i8]] >= obj[iArr[i8] - 1]) {
                i8--;
            }
            i8++;
            if (i8 == 67) {
                m59051a((float[]) obj, i5, i6, true);
                return;
            }
            iArr[i8] = i7;
        }
        if (i8 != 0) {
            if (i8 != 1 || iArr[i8] <= i6) {
                Object obj3;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                i6++;
                if (iArr[i8] < i6) {
                    i8++;
                    iArr[i8] = i6;
                }
                i7 = 1;
                i10 = 0;
                while (true) {
                    i7 <<= 1;
                    if (i7 >= i8) {
                        break;
                    }
                    i10 = (byte) (i10 ^ 1);
                }
                i7 = i6 - i5;
                if (obj2 != null && i4 >= i7) {
                    if (i3 + i7 <= obj2.length) {
                        i9 = i3;
                        if (i10 != 0) {
                            System.arraycopy(obj, i5, obj2, i9, i7);
                            i9 -= i5;
                            i5 = 0;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                        } else {
                            i5 = i9 - i5;
                            i9 = 0;
                        }
                        while (i8 > 1) {
                            i10 = 0;
                            for (i7 = 2; i7 <= i8; i7 += 2) {
                                i11 = iArr[i7];
                                i12 = iArr[i7 - 1];
                                i13 = iArr[i7 - 2];
                                i14 = i12;
                                i15 = i13;
                                while (i13 < i11) {
                                    if (i14 < i11) {
                                        if (i15 < i12 || obj[i15 + i9] > obj[i14 + i9]) {
                                            i16 = i14 + 1;
                                            obj2[i13 + i5] = obj[i14 + i9];
                                            i14 = i16;
                                            i13++;
                                        }
                                    }
                                    i16 = i15 + 1;
                                    obj2[i13 + i5] = obj[i15 + i9];
                                    i15 = i16;
                                    i13++;
                                }
                                i10++;
                                iArr[i10] = i11;
                            }
                            if ((i8 & 1) != 0) {
                                i7 = iArr[i8 - 1];
                                i8 = i6;
                                while (true) {
                                    i8--;
                                    if (i8 >= i7) {
                                        break;
                                    }
                                    obj2[i8 + i5] = obj[i8 + i9];
                                }
                                i10++;
                                iArr[i10] = i6;
                            }
                            i8 = i10;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                            i17 = i9;
                            i9 = i5;
                            i5 = i17;
                        }
                    }
                }
                obj2 = new float[i7];
                i9 = 0;
                if (i10 != 0) {
                    i5 = i9 - i5;
                    i9 = 0;
                } else {
                    System.arraycopy(obj, i5, obj2, i9, i7);
                    i9 -= i5;
                    i5 = 0;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                }
                while (i8 > 1) {
                    i10 = 0;
                    for (i7 = 2; i7 <= i8; i7 += 2) {
                        i11 = iArr[i7];
                        i12 = iArr[i7 - 1];
                        i13 = iArr[i7 - 2];
                        i14 = i12;
                        i15 = i13;
                        while (i13 < i11) {
                            if (i14 < i11) {
                                if (i15 < i12) {
                                }
                                i16 = i14 + 1;
                                obj2[i13 + i5] = obj[i14 + i9];
                                i14 = i16;
                                i13++;
                            }
                            i16 = i15 + 1;
                            obj2[i13 + i5] = obj[i15 + i9];
                            i15 = i16;
                            i13++;
                        }
                        i10++;
                        iArr[i10] = i11;
                    }
                    if ((i8 & 1) != 0) {
                        i7 = iArr[i8 - 1];
                        i8 = i6;
                        while (true) {
                            i8--;
                            if (i8 >= i7) {
                                break;
                            }
                            obj2[i8 + i5] = obj[i8 + i9];
                        }
                        i10++;
                        iArr[i10] = i6;
                    }
                    i8 = i10;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                    i17 = i9;
                    i9 = i5;
                    i5 = i17;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m59051a(float[] r11, int r12, int r13, boolean r14) {
        /*
        r0 = r13 - r12;
        r0 = r0 + 1;
        r1 = 47;
        if (r0 >= r1) goto L_0x008c;
    L_0x0008:
        if (r14 == 0) goto L_0x002b;
    L_0x000a:
        r14 = r12;
    L_0x000b:
        if (r14 >= r13) goto L_0x008b;
    L_0x000d:
        r0 = r14 + 1;
        r1 = r11[r0];
    L_0x0011:
        r2 = r11[r14];
        r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x0025;
    L_0x0017:
        r2 = r14 + 1;
        r3 = r11[r14];
        r11[r2] = r3;
        r2 = r14 + -1;
        if (r14 != r12) goto L_0x0023;
    L_0x0021:
        r14 = r2;
        goto L_0x0025;
    L_0x0023:
        r14 = r2;
        goto L_0x0011;
    L_0x0025:
        r14 = r14 + 1;
        r11[r14] = r1;
        r14 = r0;
        goto L_0x000b;
    L_0x002b:
        if (r12 < r13) goto L_0x002e;
    L_0x002d:
        return;
    L_0x002e:
        r12 = r12 + 1;
        r14 = r11[r12];
        r0 = r12 + -1;
        r0 = r11[r0];
        r14 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r14 >= 0) goto L_0x002b;
    L_0x003a:
        r14 = r12 + 1;
        if (r14 > r13) goto L_0x0076;
    L_0x003e:
        r0 = r11[r12];
        r1 = r11[r14];
        r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r2 >= 0) goto L_0x004b;
    L_0x0046:
        r1 = r11[r14];
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x004b:
        r12 = r12 + -1;
        r2 = r11[r12];
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x005a;
    L_0x0053:
        r2 = r12 + 2;
        r3 = r11[r12];
        r11[r2] = r3;
        goto L_0x004b;
    L_0x005a:
        r12 = r12 + 1;
        r2 = r12 + 1;
        r11[r2] = r0;
    L_0x0060:
        r12 = r12 + -1;
        r0 = r11[r12];
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x006f;
    L_0x0068:
        r0 = r12 + 1;
        r2 = r11[r12];
        r11[r0] = r2;
        goto L_0x0060;
    L_0x006f:
        r12 = r12 + 1;
        r11[r12] = r1;
        r12 = r14 + 1;
        goto L_0x003a;
    L_0x0076:
        r12 = r11[r13];
    L_0x0078:
        r13 = r13 + -1;
        r14 = r11[r13];
        r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r14 >= 0) goto L_0x0087;
    L_0x0080:
        r14 = r13 + 1;
        r0 = r11[r13];
        r11[r14] = r0;
        goto L_0x0078;
    L_0x0087:
        r13 = r13 + 1;
        r11[r13] = r12;
    L_0x008b:
        return;
    L_0x008c:
        r1 = r0 >> 3;
        r0 = r0 >> 6;
        r1 = r1 + r0;
        r1 = r1 + 1;
        r0 = r12 + r13;
        r0 = r0 >>> 1;
        r2 = r0 - r1;
        r3 = r2 - r1;
        r4 = r0 + r1;
        r1 = r1 + r4;
        r5 = r11[r2];
        r6 = r11[r3];
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 >= 0) goto L_0x00ae;
    L_0x00a6:
        r5 = r11[r2];
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00ae:
        r5 = r11[r0];
        r6 = r11[r2];
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 >= 0) goto L_0x00ca;
    L_0x00b6:
        r5 = r11[r0];
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r6 >= 0) goto L_0x00ca;
    L_0x00c4:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00ca:
        r5 = r11[r4];
        r6 = r11[r0];
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 >= 0) goto L_0x00f2;
    L_0x00d2:
        r5 = r11[r4];
        r6 = r11[r0];
        r11[r4] = r6;
        r11[r0] = r5;
        r6 = r11[r2];
        r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r6 >= 0) goto L_0x00f2;
    L_0x00e0:
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r6 >= 0) goto L_0x00f2;
    L_0x00ec:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x00f2:
        r5 = r11[r1];
        r6 = r11[r4];
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 >= 0) goto L_0x0126;
    L_0x00fa:
        r5 = r11[r1];
        r6 = r11[r4];
        r11[r1] = r6;
        r11[r4] = r5;
        r6 = r11[r0];
        r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r6 >= 0) goto L_0x0126;
    L_0x0108:
        r6 = r11[r0];
        r11[r4] = r6;
        r11[r0] = r5;
        r6 = r11[r2];
        r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r6 >= 0) goto L_0x0126;
    L_0x0114:
        r6 = r11[r2];
        r11[r0] = r6;
        r11[r2] = r5;
        r6 = r11[r3];
        r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r6 >= 0) goto L_0x0126;
    L_0x0120:
        r6 = r11[r3];
        r11[r2] = r6;
        r11[r3] = r5;
    L_0x0126:
        r5 = r11[r3];
        r6 = r11[r2];
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        r6 = 0;
        if (r5 == 0) goto L_0x021d;
    L_0x012f:
        r5 = r11[r2];
        r7 = r11[r0];
        r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r5 == 0) goto L_0x021d;
    L_0x0137:
        r5 = r11[r0];
        r7 = r11[r4];
        r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r5 == 0) goto L_0x021d;
    L_0x013f:
        r5 = r11[r4];
        r7 = r11[r1];
        r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r5 == 0) goto L_0x021d;
    L_0x0147:
        r0 = r11[r2];
        r5 = r11[r4];
        r7 = r11[r12];
        r11[r2] = r7;
        r2 = r11[r13];
        r11[r4] = r2;
        r2 = r12;
    L_0x0154:
        r2 = r2 + 1;
        r4 = r11[r2];
        r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r4 >= 0) goto L_0x015d;
    L_0x015c:
        goto L_0x0154;
    L_0x015d:
        r4 = r13;
    L_0x015e:
        r4 = r4 + -1;
        r7 = r11[r4];
        r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x0167;
    L_0x0166:
        goto L_0x015e;
    L_0x0167:
        r7 = r2 + -1;
    L_0x0169:
        r7 = r7 + 1;
        if (r7 > r4) goto L_0x01a8;
    L_0x016d:
        r8 = r11[r7];
        r9 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r9 >= 0) goto L_0x017c;
    L_0x0173:
        r9 = r11[r2];
        r11[r7] = r9;
        r11[r2] = r8;
        r2 = r2 + 1;
        goto L_0x0169;
    L_0x017c:
        r9 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r9 <= 0) goto L_0x0169;
    L_0x0180:
        r9 = r11[r4];
        r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r9 <= 0) goto L_0x018e;
    L_0x0186:
        r9 = r4 + -1;
        if (r4 != r7) goto L_0x018c;
    L_0x018a:
        r4 = r9;
        goto L_0x01a8;
    L_0x018c:
        r4 = r9;
        goto L_0x0180;
    L_0x018e:
        r9 = r11[r4];
        r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r9 >= 0) goto L_0x019f;
    L_0x0194:
        r9 = r11[r2];
        r11[r7] = r9;
        r9 = r11[r4];
        r11[r2] = r9;
        r2 = r2 + 1;
        goto L_0x01a3;
    L_0x019f:
        r9 = r11[r4];
        r11[r7] = r9;
    L_0x01a3:
        r11[r4] = r8;
        r4 = r4 + -1;
        goto L_0x0169;
    L_0x01a8:
        r7 = r2 + -1;
        r8 = r11[r7];
        r11[r12] = r8;
        r11[r7] = r0;
        r7 = r4 + 1;
        r8 = r11[r7];
        r11[r13] = r8;
        r11[r7] = r5;
        r7 = r2 + -2;
        m59051a(r11, r12, r7, r14);
        r12 = r4 + 2;
        m59051a(r11, r12, r13, r6);
        if (r2 >= r3) goto L_0x0219;
    L_0x01c4:
        if (r1 >= r4) goto L_0x0219;
    L_0x01c6:
        r12 = r11[r2];
        r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r12 != 0) goto L_0x01cf;
    L_0x01cc:
        r2 = r2 + 1;
        goto L_0x01c6;
    L_0x01cf:
        r12 = r11[r4];
        r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1));
        if (r12 != 0) goto L_0x01d8;
    L_0x01d5:
        r4 = r4 + -1;
        goto L_0x01cf;
    L_0x01d8:
        r12 = r2 + -1;
    L_0x01da:
        r12 = r12 + 1;
        if (r12 > r4) goto L_0x0219;
    L_0x01de:
        r13 = r11[r12];
        r14 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));
        if (r14 != 0) goto L_0x01ed;
    L_0x01e4:
        r14 = r11[r2];
        r11[r12] = r14;
        r11[r2] = r13;
        r2 = r2 + 1;
        goto L_0x01da;
    L_0x01ed:
        r14 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1));
        if (r14 != 0) goto L_0x01da;
    L_0x01f1:
        r14 = r11[r4];
        r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1));
        if (r14 != 0) goto L_0x01ff;
    L_0x01f7:
        r14 = r4 + -1;
        if (r4 != r12) goto L_0x01fd;
    L_0x01fb:
        r4 = r14;
        goto L_0x0219;
    L_0x01fd:
        r4 = r14;
        goto L_0x01f1;
    L_0x01ff:
        r14 = r11[r4];
        r14 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r14 != 0) goto L_0x0210;
    L_0x0205:
        r14 = r11[r2];
        r11[r12] = r14;
        r14 = r11[r4];
        r11[r2] = r14;
        r2 = r2 + 1;
        goto L_0x0214;
    L_0x0210:
        r14 = r11[r4];
        r11[r12] = r14;
    L_0x0214:
        r11[r4] = r13;
        r4 = r4 + -1;
        goto L_0x01da;
    L_0x0219:
        m59051a(r11, r2, r4, r6);
        goto L_0x0269;
    L_0x021d:
        r0 = r11[r0];
        r1 = r12;
        r3 = r1;
        r2 = r13;
    L_0x0222:
        if (r1 > r2) goto L_0x025f;
    L_0x0224:
        r4 = r11[r1];
        r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r4 != 0) goto L_0x022b;
    L_0x022a:
        goto L_0x025c;
    L_0x022b:
        r4 = r11[r1];
        r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r5 >= 0) goto L_0x023a;
    L_0x0231:
        r5 = r11[r3];
        r11[r1] = r5;
        r11[r3] = r4;
        r3 = r3 + 1;
        goto L_0x025c;
    L_0x023a:
        r5 = r11[r2];
        r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r5 <= 0) goto L_0x0243;
    L_0x0240:
        r2 = r2 + -1;
        goto L_0x023a;
    L_0x0243:
        r5 = r11[r2];
        r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r5 >= 0) goto L_0x0254;
    L_0x0249:
        r5 = r11[r3];
        r11[r1] = r5;
        r5 = r11[r2];
        r11[r3] = r5;
        r3 = r3 + 1;
        goto L_0x0258;
    L_0x0254:
        r5 = r11[r2];
        r11[r1] = r5;
    L_0x0258:
        r11[r2] = r4;
        r2 = r2 + -1;
    L_0x025c:
        r1 = r1 + 1;
        goto L_0x0222;
    L_0x025f:
        r3 = r3 + -1;
        m59051a(r11, r12, r3, r14);
        r2 = r2 + 1;
        m59051a(r11, r2, r13, r6);
    L_0x0269:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.DualPivotQuicksort.a(float[], int, int, boolean):void");
    }

    /* renamed from: a */
    static void m59050a(double[] dArr, int i, int i2, double[] dArr2, int i3, int i4) {
        while (i <= i2 && Double.isNaN(dArr[i2])) {
            i2--;
        }
        int i5 = i2;
        while (true) {
            i2--;
            if (i2 < i) {
                break;
            }
            double d = dArr[i2];
            if (d != d) {
                dArr[i2] = dArr[i5];
                dArr[i5] = d;
                i5--;
            }
        }
        m59060b(dArr, i, i5, dArr2, i3, i4);
        i2 = i5;
        while (i < i2) {
            i4 = (i + i2) >>> 1;
            if (dArr[i4] < 0.0d) {
                i = i4 + 1;
            } else {
                i2 = i4;
            }
        }
        while (i <= i5 && Double.doubleToRawLongBits(dArr[i]) < 0) {
            i++;
        }
        i2 = i - 1;
        while (true) {
            i++;
            if (i <= i5) {
                double d2 = dArr[i];
                if (d2 == 0.0d) {
                    if (Double.doubleToRawLongBits(d2) < 0) {
                        dArr[i] = 0.0d;
                        i2++;
                        dArr[i2] = -0.0d;
                    }
                } else {
                    return;
                }
            }
            return;
        }
    }

    /* renamed from: b */
    private static void m59060b(double[] dArr, int i, int i2, double[] dArr2, int i3, int i4) {
        Object obj = dArr;
        int i5 = i;
        int i6 = i2;
        Object obj2 = dArr2;
        if (i6 - i5 < 286) {
            m59049a((double[]) obj, i5, i6, true);
            return;
        }
        int i7;
        int i8;
        int[] iArr = new int[68];
        iArr[0] = i5;
        int i9 = i5;
        int i10 = 0;
        while (i9 < i6) {
            while (i9 < i6) {
                int i11 = i9 + 1;
                if (obj[i9] != obj[i11]) {
                    break;
                }
                i9 = i11;
            }
            if (i9 == i6) {
                break;
            }
            i11 = i9 + 1;
            if (obj[i9] < obj[i11]) {
                while (true) {
                    i9++;
                    if (i9 > i6 || obj[i9 - 1] > obj[i9]) {
                        break;
                    }
                }
            } else if (obj[i9] > obj[i11]) {
                while (true) {
                    i9++;
                    if (i9 > i6 || obj[i9 - 1] < obj[i9]) {
                        i7 = iArr[i10] - 1;
                        i8 = i9;
                    }
                }
                i7 = iArr[i10] - 1;
                i8 = i9;
                while (true) {
                    i7++;
                    i8--;
                    if (i7 >= i8) {
                        break;
                    }
                    double d = obj[i7];
                    obj[i7] = obj[i8];
                    obj[i8] = d;
                }
            }
            if (iArr[i10] > i5 && obj[iArr[i10]] >= obj[iArr[i10] - 1]) {
                i10--;
            }
            i10++;
            if (i10 == 67) {
                m59049a((double[]) obj, i5, i6, true);
                return;
            }
            iArr[i10] = i9;
        }
        if (i10 != 0) {
            if (i10 != 1 || iArr[i10] <= i6) {
                Object obj3;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                i6++;
                if (iArr[i10] < i6) {
                    i10++;
                    iArr[i10] = i6;
                }
                i9 = 1;
                i7 = 0;
                while (true) {
                    i9 <<= 1;
                    if (i9 >= i10) {
                        break;
                    }
                    i7 = (byte) (i7 ^ 1);
                }
                i9 = i6 - i5;
                if (obj2 != null && i4 >= i9) {
                    if (i3 + i9 <= obj2.length) {
                        i8 = i3;
                        if (i7 != 0) {
                            System.arraycopy(obj, i5, obj2, i8, i9);
                            i8 -= i5;
                            i5 = 0;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                        } else {
                            i5 = i8 - i5;
                            i8 = 0;
                        }
                        while (i10 > 1) {
                            i7 = 0;
                            for (i9 = 2; i9 <= i10; i9 += 2) {
                                i11 = iArr[i9];
                                i12 = iArr[i9 - 1];
                                i13 = iArr[i9 - 2];
                                i14 = i12;
                                i15 = i13;
                                while (i13 < i11) {
                                    if (i14 < i11) {
                                        if (i15 < i12 || obj[i15 + i8] > obj[i14 + i8]) {
                                            i16 = i14 + 1;
                                            obj2[i13 + i5] = obj[i14 + i8];
                                            i14 = i16;
                                            i13++;
                                        }
                                    }
                                    i16 = i15 + 1;
                                    obj2[i13 + i5] = obj[i15 + i8];
                                    i15 = i16;
                                    i13++;
                                }
                                i7++;
                                iArr[i7] = i11;
                            }
                            if ((i10 & 1) != 0) {
                                i9 = iArr[i10 - 1];
                                i10 = i6;
                                while (true) {
                                    i10--;
                                    if (i10 >= i9) {
                                        break;
                                    }
                                    obj2[i10 + i5] = obj[i10 + i8];
                                }
                                i7++;
                                iArr[i7] = i6;
                            }
                            i10 = i7;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                            i17 = i8;
                            i8 = i5;
                            i5 = i17;
                        }
                    }
                }
                obj2 = new double[i9];
                i8 = 0;
                if (i7 != 0) {
                    i5 = i8 - i5;
                    i8 = 0;
                } else {
                    System.arraycopy(obj, i5, obj2, i8, i9);
                    i8 -= i5;
                    i5 = 0;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                }
                while (i10 > 1) {
                    i7 = 0;
                    for (i9 = 2; i9 <= i10; i9 += 2) {
                        i11 = iArr[i9];
                        i12 = iArr[i9 - 1];
                        i13 = iArr[i9 - 2];
                        i14 = i12;
                        i15 = i13;
                        while (i13 < i11) {
                            if (i14 < i11) {
                                if (i15 < i12) {
                                }
                                i16 = i14 + 1;
                                obj2[i13 + i5] = obj[i14 + i8];
                                i14 = i16;
                                i13++;
                            }
                            i16 = i15 + 1;
                            obj2[i13 + i5] = obj[i15 + i8];
                            i15 = i16;
                            i13++;
                        }
                        i7++;
                        iArr[i7] = i11;
                    }
                    if ((i10 & 1) != 0) {
                        i9 = iArr[i10 - 1];
                        i10 = i6;
                        while (true) {
                            i10--;
                            if (i10 >= i9) {
                                break;
                            }
                            obj2[i10 + i5] = obj[i10 + i8];
                        }
                        i7++;
                        iArr[i7] = i6;
                    }
                    i10 = i7;
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                    i17 = i8;
                    i8 = i5;
                    i5 = i17;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m59049a(double[] r21, int r22, int r23, boolean r24) {
        /*
        r0 = r21;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r4 = r2 - r1;
        r4 = r4 + 1;
        r5 = 47;
        if (r4 >= r5) goto L_0x0096;
    L_0x0010:
        if (r3 == 0) goto L_0x0033;
    L_0x0012:
        r3 = r1;
    L_0x0013:
        if (r3 >= r2) goto L_0x0095;
    L_0x0015:
        r4 = r3 + 1;
        r5 = r0[r4];
    L_0x0019:
        r7 = r0[r3];
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 >= 0) goto L_0x002d;
    L_0x001f:
        r7 = r3 + 1;
        r8 = r0[r3];
        r0[r7] = r8;
        r7 = r3 + -1;
        if (r3 != r1) goto L_0x002b;
    L_0x0029:
        r3 = r7;
        goto L_0x002d;
    L_0x002b:
        r3 = r7;
        goto L_0x0019;
    L_0x002d:
        r3 = r3 + 1;
        r0[r3] = r5;
        r3 = r4;
        goto L_0x0013;
    L_0x0033:
        if (r1 < r2) goto L_0x0036;
    L_0x0035:
        return;
    L_0x0036:
        r1 = r1 + 1;
        r3 = r0[r1];
        r5 = r1 + -1;
        r5 = r0[r5];
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 >= 0) goto L_0x0033;
    L_0x0042:
        r3 = r1 + 1;
        if (r3 > r2) goto L_0x0080;
    L_0x0046:
        r4 = r0[r1];
        r6 = r0[r3];
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 >= 0) goto L_0x0055;
    L_0x004e:
        r6 = r0[r3];
        r19 = r4;
        r4 = r6;
        r6 = r19;
    L_0x0055:
        r1 = r1 + -1;
        r8 = r0[r1];
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x0064;
    L_0x005d:
        r8 = r1 + 2;
        r9 = r0[r1];
        r0[r8] = r9;
        goto L_0x0055;
    L_0x0064:
        r1 = r1 + 1;
        r8 = r1 + 1;
        r0[r8] = r4;
    L_0x006a:
        r1 = r1 + -1;
        r4 = r0[r1];
        r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r8 >= 0) goto L_0x0079;
    L_0x0072:
        r4 = r1 + 1;
        r8 = r0[r1];
        r0[r4] = r8;
        goto L_0x006a;
    L_0x0079:
        r1 = r1 + 1;
        r0[r1] = r6;
        r1 = r3 + 1;
        goto L_0x0042;
    L_0x0080:
        r3 = r0[r2];
    L_0x0082:
        r2 = r2 + -1;
        r5 = r0[r2];
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 >= 0) goto L_0x0091;
    L_0x008a:
        r1 = r2 + 1;
        r5 = r0[r2];
        r0[r1] = r5;
        goto L_0x0082;
    L_0x0091:
        r2 = r2 + 1;
        r0[r2] = r3;
    L_0x0095:
        return;
    L_0x0096:
        r5 = r4 >> 3;
        r4 = r4 >> 6;
        r5 = r5 + r4;
        r5 = r5 + 1;
        r4 = r1 + r2;
        r4 = r4 >>> 1;
        r6 = r4 - r5;
        r7 = r6 - r5;
        r8 = r4 + r5;
        r5 = r5 + r8;
        r9 = r0[r6];
        r11 = r0[r7];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00b8;
    L_0x00b0:
        r9 = r0[r6];
        r11 = r0[r7];
        r0[r6] = r11;
        r0[r7] = r9;
    L_0x00b8:
        r9 = r0[r4];
        r11 = r0[r6];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00d4;
    L_0x00c0:
        r9 = r0[r4];
        r11 = r0[r6];
        r0[r4] = r11;
        r0[r6] = r9;
        r11 = r0[r7];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00d4;
    L_0x00ce:
        r11 = r0[r7];
        r0[r6] = r11;
        r0[r7] = r9;
    L_0x00d4:
        r9 = r0[r8];
        r11 = r0[r4];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00fc;
    L_0x00dc:
        r9 = r0[r8];
        r11 = r0[r4];
        r0[r8] = r11;
        r0[r4] = r9;
        r11 = r0[r6];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00fc;
    L_0x00ea:
        r11 = r0[r6];
        r0[r4] = r11;
        r0[r6] = r9;
        r11 = r0[r7];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x00fc;
    L_0x00f6:
        r11 = r0[r7];
        r0[r6] = r11;
        r0[r7] = r9;
    L_0x00fc:
        r9 = r0[r5];
        r11 = r0[r8];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x0130;
    L_0x0104:
        r9 = r0[r5];
        r11 = r0[r8];
        r0[r5] = r11;
        r0[r8] = r9;
        r11 = r0[r4];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x0130;
    L_0x0112:
        r11 = r0[r4];
        r0[r8] = r11;
        r0[r4] = r9;
        r11 = r0[r6];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x0130;
    L_0x011e:
        r11 = r0[r6];
        r0[r4] = r11;
        r0[r6] = r9;
        r11 = r0[r7];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 >= 0) goto L_0x0130;
    L_0x012a:
        r11 = r0[r7];
        r0[r6] = r11;
        r0[r7] = r9;
    L_0x0130:
        r9 = r0[r7];
        r11 = r0[r6];
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        r9 = 0;
        if (r13 == 0) goto L_0x0229;
    L_0x0139:
        r10 = r0[r6];
        r12 = r0[r4];
        r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r14 == 0) goto L_0x0229;
    L_0x0141:
        r10 = r0[r4];
        r12 = r0[r8];
        r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r14 == 0) goto L_0x0229;
    L_0x0149:
        r10 = r0[r8];
        r12 = r0[r5];
        r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r14 == 0) goto L_0x0229;
    L_0x0151:
        r10 = r0[r6];
        r12 = r0[r8];
        r14 = r0[r1];
        r0[r6] = r14;
        r14 = r0[r2];
        r0[r8] = r14;
        r4 = r1;
    L_0x015e:
        r4 = r4 + 1;
        r14 = r0[r4];
        r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1));
        if (r6 >= 0) goto L_0x0167;
    L_0x0166:
        goto L_0x015e;
    L_0x0167:
        r6 = r2;
    L_0x0168:
        r6 = r6 + -1;
        r14 = r0[r6];
        r8 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r8 <= 0) goto L_0x0171;
    L_0x0170:
        goto L_0x0168;
    L_0x0171:
        r8 = r4 + -1;
    L_0x0173:
        r8 = r8 + 1;
        if (r8 > r6) goto L_0x01b4;
    L_0x0177:
        r14 = r0[r8];
        r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1));
        if (r16 >= 0) goto L_0x0186;
    L_0x017d:
        r16 = r0[r4];
        r0[r8] = r16;
        r0[r4] = r14;
        r4 = r4 + 1;
        goto L_0x0173;
    L_0x0186:
        r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r16 <= 0) goto L_0x0173;
    L_0x018a:
        r16 = r0[r6];
        r18 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1));
        if (r18 <= 0) goto L_0x019a;
    L_0x0190:
        r16 = r6 + -1;
        if (r6 != r8) goto L_0x0197;
    L_0x0194:
        r6 = r16;
        goto L_0x01b4;
    L_0x0197:
        r6 = r16;
        goto L_0x018a;
    L_0x019a:
        r16 = r0[r6];
        r18 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1));
        if (r18 >= 0) goto L_0x01ab;
    L_0x01a0:
        r16 = r0[r4];
        r0[r8] = r16;
        r16 = r0[r6];
        r0[r4] = r16;
        r4 = r4 + 1;
        goto L_0x01af;
    L_0x01ab:
        r16 = r0[r6];
        r0[r8] = r16;
    L_0x01af:
        r0[r6] = r14;
        r6 = r6 + -1;
        goto L_0x0173;
    L_0x01b4:
        r8 = r4 + -1;
        r14 = r0[r8];
        r0[r1] = r14;
        r0[r8] = r10;
        r8 = r6 + 1;
        r14 = r0[r8];
        r0[r2] = r14;
        r0[r8] = r12;
        r8 = r4 + -2;
        m59049a(r0, r1, r8, r3);
        r1 = r6 + 2;
        m59049a(r0, r1, r2, r9);
        if (r4 >= r7) goto L_0x0225;
    L_0x01d0:
        if (r5 >= r6) goto L_0x0225;
    L_0x01d2:
        r1 = r0[r4];
        r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1));
        if (r3 != 0) goto L_0x01db;
    L_0x01d8:
        r4 = r4 + 1;
        goto L_0x01d2;
    L_0x01db:
        r1 = r0[r6];
        r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1));
        if (r3 != 0) goto L_0x01e4;
    L_0x01e1:
        r6 = r6 + -1;
        goto L_0x01db;
    L_0x01e4:
        r1 = r4 + -1;
    L_0x01e6:
        r1 = r1 + 1;
        if (r1 > r6) goto L_0x0225;
    L_0x01ea:
        r2 = r0[r1];
        r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r5 != 0) goto L_0x01f9;
    L_0x01f0:
        r7 = r0[r4];
        r0[r1] = r7;
        r0[r4] = r2;
        r4 = r4 + 1;
        goto L_0x01e6;
    L_0x01f9:
        r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r5 != 0) goto L_0x01e6;
    L_0x01fd:
        r7 = r0[r6];
        r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1));
        if (r5 != 0) goto L_0x020b;
    L_0x0203:
        r5 = r6 + -1;
        if (r6 != r1) goto L_0x0209;
    L_0x0207:
        r6 = r5;
        goto L_0x0225;
    L_0x0209:
        r6 = r5;
        goto L_0x01fd;
    L_0x020b:
        r7 = r0[r6];
        r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1));
        if (r5 != 0) goto L_0x021c;
    L_0x0211:
        r7 = r0[r4];
        r0[r1] = r7;
        r7 = r0[r6];
        r0[r4] = r7;
        r4 = r4 + 1;
        goto L_0x0220;
    L_0x021c:
        r7 = r0[r6];
        r0[r1] = r7;
    L_0x0220:
        r0[r6] = r2;
        r6 = r6 + -1;
        goto L_0x01e6;
    L_0x0225:
        m59049a(r0, r4, r6, r9);
        goto L_0x0275;
    L_0x0229:
        r4 = r0[r4];
        r6 = r1;
        r8 = r6;
        r7 = r2;
    L_0x022e:
        if (r6 > r7) goto L_0x026b;
    L_0x0230:
        r10 = r0[r6];
        r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r12 != 0) goto L_0x0237;
    L_0x0236:
        goto L_0x0268;
    L_0x0237:
        r10 = r0[r6];
        r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r12 >= 0) goto L_0x0246;
    L_0x023d:
        r12 = r0[r8];
        r0[r6] = r12;
        r0[r8] = r10;
        r8 = r8 + 1;
        goto L_0x0268;
    L_0x0246:
        r12 = r0[r7];
        r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r14 <= 0) goto L_0x024f;
    L_0x024c:
        r7 = r7 + -1;
        goto L_0x0246;
    L_0x024f:
        r12 = r0[r7];
        r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r14 >= 0) goto L_0x0260;
    L_0x0255:
        r12 = r0[r8];
        r0[r6] = r12;
        r12 = r0[r7];
        r0[r8] = r12;
        r8 = r8 + 1;
        goto L_0x0264;
    L_0x0260:
        r12 = r0[r7];
        r0[r6] = r12;
    L_0x0264:
        r0[r7] = r10;
        r7 = r7 + -1;
    L_0x0268:
        r6 = r6 + 1;
        goto L_0x022e;
    L_0x026b:
        r8 = r8 + -1;
        m59049a(r0, r1, r8, r3);
        r7 = r7 + 1;
        m59049a(r0, r7, r2, r9);
    L_0x0275:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.DualPivotQuicksort.a(double[], int, int, boolean):void");
    }
}
