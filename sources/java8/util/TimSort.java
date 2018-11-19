package java8.util;

import java.lang.reflect.Array;
import java.util.Comparator;

class TimSort<T> {
    /* renamed from: a */
    private final T[] f48781a;
    /* renamed from: b */
    private final Comparator<? super T> f48782b;
    /* renamed from: c */
    private int f48783c = 7;
    /* renamed from: d */
    private T[] f48784d;
    /* renamed from: e */
    private int f48785e;
    /* renamed from: f */
    private int f48786f;
    /* renamed from: g */
    private int f48787g = 0;
    /* renamed from: h */
    private final int[] f48788h;
    /* renamed from: i */
    private final int[] f48789i;

    /* renamed from: a */
    private static int m59199a(int i) {
        int i2 = 0;
        while (i >= 32) {
            i2 |= i & 1;
            i >>= 1;
        }
        return i + i2;
    }

    private TimSort(T[] tArr, Comparator<? super T> comparator, T[] tArr2, int i, int i2) {
        this.f48781a = tArr;
        this.f48782b = comparator;
        comparator = tArr.length;
        int i3 = comparator < 512 ? comparator >>> 1 : 256;
        if (tArr2 != null && i2 >= i3) {
            if (i + i3 <= tArr2.length) {
                this.f48784d = tArr2;
                this.f48785e = i;
                this.f48786f = i2;
                tArr = comparator >= 120 ? 5 : comparator >= 1542 ? 10 : comparator >= 119151 ? 24 : 49;
                this.f48788h = new int[tArr];
                this.f48789i = new int[tArr];
            }
        }
        this.f48784d = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i3);
        this.f48785e = 0;
        this.f48786f = i3;
        if (comparator >= 120) {
            if (comparator >= 1542) {
                if (comparator >= 119151) {
                }
            }
        }
        this.f48788h = new int[tArr];
        this.f48789i = new int[tArr];
    }

    /* renamed from: a */
    static <T> void m59207a(T[] tArr, int i, int i2, Comparator<? super T> comparator, T[] tArr2, int i3, int i4) {
        int i5 = i2 - i;
        if (i5 >= 2) {
            if (i5 < 32) {
                m59206a(tArr, i, i2, m59201a((Object[]) tArr, i, i2, (Comparator) comparator) + i, comparator);
                return;
            }
            TimSort timSort = new TimSort(tArr, comparator, tArr2, i3, i4);
            tArr2 = m59199a(i5);
            do {
                i3 = m59201a((Object[]) tArr, i, i2, (Comparator) comparator);
                if (i3 < tArr2) {
                    i4 = i5 <= tArr2 ? i5 : tArr2;
                    m59206a(tArr, i, i + i4, i3 + i, comparator);
                    i3 = i4;
                }
                timSort.m59203a(i, i3);
                timSort.m59202a();
                i += i3;
                i5 -= i3;
            } while (i5 != 0);
            timSort.m59209b();
        }
    }

    /* renamed from: a */
    private static <T> void m59206a(T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        if (i3 == i) {
            i3++;
        }
        while (i3 < i2) {
            Object obj = tArr[i3];
            int i4 = i;
            int i5 = i3;
            while (i4 < i5) {
                int i6 = (i4 + i5) >>> 1;
                if (comparator.compare(obj, tArr[i6]) < 0) {
                    i5 = i6;
                } else {
                    i4 = i6 + 1;
                }
            }
            i5 = i3 - i4;
            switch (i5) {
                case 1:
                    break;
                case 2:
                    tArr[i4 + 2] = tArr[i4 + 1];
                    break;
                default:
                    System.arraycopy(tArr, i4, tArr, i4 + 1, i5);
                    continue;
            }
            tArr[i4 + 1] = tArr[i4];
            tArr[i4] = obj;
            i3++;
        }
    }

    /* renamed from: a */
    private static <T> int m59201a(T[] tArr, int i, int i2, Comparator<? super T> comparator) {
        int i3 = i + 1;
        if (i3 == i2) {
            return 1;
        }
        int i4 = i3 + 1;
        if (comparator.compare(tArr[i3], tArr[i]) < 0) {
            while (i4 < i2 && comparator.compare(tArr[i4], tArr[i4 - 1]) < 0) {
                i4++;
            }
            m59205a(tArr, i, i4);
        } else {
            while (i4 < i2 && comparator.compare(tArr[i4], tArr[i4 - 1]) >= 0) {
                i4++;
            }
        }
        return i4 - i;
    }

    /* renamed from: a */
    private static void m59205a(Object[] objArr, int i, int i2) {
        i2--;
        while (i < i2) {
            Object obj = objArr[i];
            int i3 = i + 1;
            objArr[i] = objArr[i2];
            i = i2 - 1;
            objArr[i2] = obj;
            i2 = i;
            i = i3;
        }
    }

    /* renamed from: a */
    private void m59203a(int i, int i2) {
        this.f48788h[this.f48787g] = i;
        this.f48789i[this.f48787g] = i2;
        this.f48787g++;
    }

    /* renamed from: a */
    private void m59202a() {
        while (this.f48787g > 1) {
            int i = this.f48787g - 2;
            if (i > 0) {
                int i2 = i - 1;
                int i3 = i + 1;
                if (this.f48789i[i2] <= this.f48789i[i] + this.f48789i[i3]) {
                    if (this.f48789i[i2] < this.f48789i[i3]) {
                        i--;
                    }
                    m59210b(i);
                }
            }
            if (this.f48789i[i] <= this.f48789i[i + 1]) {
                m59210b(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m59209b() {
        while (this.f48787g > 1) {
            int i = this.f48787g - 2;
            if (i > 0 && this.f48789i[i - 1] < this.f48789i[i + 1]) {
                i--;
            }
            m59210b(i);
        }
    }

    /* renamed from: b */
    private void m59210b(int i) {
        int i2 = i;
        int i3 = this.f48788h[i2];
        int i4 = this.f48789i[i2];
        int i5 = i2 + 1;
        int i6 = this.f48788h[i5];
        int i7 = this.f48789i[i5];
        this.f48789i[i2] = i4 + i7;
        if (i2 == this.f48787g - 3) {
            i2 += 2;
            r0.f48788h[i5] = r0.f48788h[i2];
            r0.f48789i[i5] = r0.f48789i[i2];
        }
        r0.f48787g--;
        i2 = m59208b(r0.f48781a[i6], r0.f48781a, i3, i4, 0, r0.f48782b);
        i3 += i2;
        i4 -= i2;
        if (i4 != 0) {
            int i8 = i6;
            i2 = m59200a(r0.f48781a[(i3 + i4) - 1], r0.f48781a, i6, i7, i7 - 1, r0.f48782b);
            if (i2 != 0) {
                if (i4 <= i2) {
                    m59204a(i3, i4, i8, i2);
                } else {
                    m59211b(i3, i4, i8, i2);
                }
            }
        }
    }

    /* renamed from: a */
    private static <T> int m59200a(T t, T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        int i4 = i + i3;
        int i5;
        int i6;
        int i7;
        if (comparator.compare(t, tArr[i4]) > 0) {
            i2 -= i3;
            i5 = 0;
            i6 = 1;
            while (i6 < i2 && comparator.compare(t, tArr[i4 + i6]) > 0) {
                i5 = (i6 << 1) + 1;
                if (i5 <= 0) {
                    i5 = i6;
                    i6 = i2;
                } else {
                    i7 = i6;
                    i6 = i5;
                    i5 = i7;
                }
            }
            if (i6 <= i2) {
                i2 = i6;
            }
            i5 += i3;
            i3 = i2 + i3;
            i2 = i5;
        } else {
            i2 = i3 + 1;
            i5 = 0;
            i6 = 1;
            while (i6 < i2 && comparator.compare(t, tArr[i4 - i6]) <= 0) {
                i5 = (i6 << 1) + 1;
                if (i5 <= 0) {
                    i5 = i6;
                    i6 = i2;
                } else {
                    i7 = i6;
                    i6 = i5;
                    i5 = i7;
                }
            }
            if (i6 <= i2) {
                i2 = i6;
            }
            i2 = i3 - i2;
            i3 -= i5;
        }
        i2++;
        while (i2 < i3) {
            i4 = ((i3 - i2) >>> 1) + i2;
            if (comparator.compare(t, tArr[i + i4]) > 0) {
                i2 = i4 + 1;
            } else {
                i3 = i4;
            }
        }
        return i3;
    }

    /* renamed from: b */
    private static <T> int m59208b(T t, T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        int i4 = i + i3;
        int i5;
        int i6;
        int i7;
        if (comparator.compare(t, tArr[i4]) < 0) {
            i2 = i3 + 1;
            i5 = 0;
            i6 = 1;
            while (i6 < i2 && comparator.compare(t, tArr[i4 - i6]) < 0) {
                i5 = (i6 << 1) + 1;
                if (i5 <= 0) {
                    i5 = i6;
                    i6 = i2;
                } else {
                    i7 = i6;
                    i6 = i5;
                    i5 = i7;
                }
            }
            if (i6 <= i2) {
                i2 = i6;
            }
            i2 = i3 - i2;
            i3 -= i5;
        } else {
            i2 -= i3;
            i5 = 0;
            i6 = 1;
            while (i6 < i2 && comparator.compare(t, tArr[i4 + i6]) >= 0) {
                i5 = (i6 << 1) + 1;
                if (i5 <= 0) {
                    i5 = i6;
                    i6 = i2;
                } else {
                    i7 = i6;
                    i6 = i5;
                    i5 = i7;
                }
            }
            if (i6 <= i2) {
                i2 = i6;
            }
            i4 = i5 + i3;
            i3 += i2;
            i2 = i4;
        }
        i2++;
        while (i2 < i3) {
            i4 = ((i3 - i2) >>> 1) + i2;
            if (comparator.compare(t, tArr[i + i4]) < 0) {
                i3 = i4;
            } else {
                i2 = i4 + 1;
            }
        }
        return i3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m59204a(int r20, int r21, int r22, int r23) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r21;
        r7 = r0.f48781a;
        r8 = r0.m59212c(r2);
        r4 = r0.f48785e;
        java.lang.System.arraycopy(r7, r1, r8, r4, r2);
        r5 = r1 + 1;
        r6 = r22 + 1;
        r3 = r7[r22];
        r7[r1] = r3;
        r1 = r23 + -1;
        if (r1 != 0) goto L_0x0021;
    L_0x001d:
        java.lang.System.arraycopy(r8, r4, r7, r5, r2);
        return;
    L_0x0021:
        r9 = 1;
        if (r2 != r9) goto L_0x002d;
    L_0x0024:
        java.lang.System.arraycopy(r7, r6, r7, r5, r1);
        r5 = r5 + r1;
        r1 = r8[r4];
        r7[r5] = r1;
        return;
    L_0x002d:
        r10 = r0.f48782b;
        r3 = r0.f48783c;
    L_0x0031:
        r13 = r2;
        r12 = 0;
        r2 = r1;
        r1 = 0;
    L_0x0035:
        r14 = r7[r6];
        r15 = r8[r4];
        r14 = r10.compare(r14, r15);
        if (r14 >= 0) goto L_0x0054;
    L_0x003f:
        r12 = r5 + 1;
        r14 = r6 + 1;
        r6 = r7[r6];
        r7[r5] = r6;
        r1 = r1 + r9;
        r2 = r2 + -1;
        if (r2 != 0) goto L_0x0050;
    L_0x004c:
        r1 = r12;
        r12 = r14;
        goto L_0x00e7;
    L_0x0050:
        r5 = r12;
        r6 = r14;
        r12 = 0;
        goto L_0x0068;
    L_0x0054:
        r1 = r5 + 1;
        r14 = r4 + 1;
        r4 = r8[r4];
        r7[r5] = r4;
        r12 = r12 + r9;
        r13 = r13 + -1;
        if (r13 != r9) goto L_0x0065;
    L_0x0061:
        r12 = r6;
        r4 = r14;
        goto L_0x00e7;
    L_0x0065:
        r5 = r1;
        r4 = r14;
        r1 = 0;
    L_0x0068:
        r14 = r12 | r1;
        if (r14 < r3) goto L_0x0035;
    L_0x006c:
        r16 = r2;
        r17 = r3;
        r15 = r5;
        r12 = r6;
        r14 = r13;
        r13 = r4;
    L_0x0074:
        r1 = r7[r12];
        r5 = 0;
        r2 = r8;
        r3 = r13;
        r4 = r14;
        r6 = r10;
        r6 = m59208b(r1, r2, r3, r4, r5, r6);
        if (r6 == 0) goto L_0x0095;
    L_0x0081:
        java.lang.System.arraycopy(r8, r13, r7, r15, r6);
        r1 = r15 + r6;
        r4 = r13 + r6;
        r13 = r14 - r6;
        if (r13 > r9) goto L_0x0092;
    L_0x008c:
        r2 = r16;
        r3 = r17;
        goto L_0x00e7;
    L_0x0092:
        r15 = r1;
        r14 = r13;
        r13 = r4;
    L_0x0095:
        r5 = r15 + 1;
        r4 = r12 + 1;
        r1 = r7[r12];
        r7[r15] = r1;
        r12 = r16 + -1;
        if (r12 != 0) goto L_0x00a9;
    L_0x00a1:
        r1 = r5;
        r2 = r12;
        r3 = r17;
        r12 = r4;
        r4 = r13;
        r13 = r14;
        goto L_0x00e7;
    L_0x00a9:
        r1 = r8[r13];
        r15 = 0;
        r2 = r7;
        r3 = r4;
        r11 = r4;
        r4 = r12;
        r9 = r5;
        r5 = r15;
        r15 = r6;
        r6 = r10;
        r1 = m59200a(r1, r2, r3, r4, r5, r6);
        if (r1 == 0) goto L_0x00d3;
    L_0x00ba:
        java.lang.System.arraycopy(r7, r11, r7, r9, r1);
        r2 = r9 + r1;
        r6 = r11 + r1;
        r3 = r12 - r1;
        if (r3 != 0) goto L_0x00ce;
    L_0x00c5:
        r1 = r2;
        r2 = r3;
        r12 = r6;
        r4 = r13;
        r13 = r14;
        r3 = r17;
        r9 = 1;
        goto L_0x00e7;
    L_0x00ce:
        r9 = r2;
        r16 = r3;
        r12 = r6;
        goto L_0x00d6;
    L_0x00d3:
        r16 = r12;
        r12 = r11;
    L_0x00d6:
        r2 = r9 + 1;
        r3 = r13 + 1;
        r4 = r8[r13];
        r7[r9] = r4;
        r14 = r14 + -1;
        r9 = 1;
        if (r14 != r9) goto L_0x0105;
    L_0x00e3:
        r1 = r2;
        r4 = r3;
        r13 = r14;
        goto L_0x008c;
    L_0x00e7:
        if (r3 >= r9) goto L_0x00ea;
    L_0x00e9:
        r3 = 1;
    L_0x00ea:
        r0.f48783c = r3;
        if (r13 != r9) goto L_0x00f7;
    L_0x00ee:
        java.lang.System.arraycopy(r7, r12, r7, r1, r2);
        r1 = r1 + r2;
        r2 = r8[r4];
        r7[r1] = r2;
        goto L_0x0104;
    L_0x00f7:
        if (r13 != 0) goto L_0x0101;
    L_0x00f9:
        r1 = new java.lang.IllegalArgumentException;
        r2 = "Comparison method violates its general contract!";
        r1.<init>(r2);
        throw r1;
    L_0x0101:
        java.lang.System.arraycopy(r8, r4, r7, r1, r13);
    L_0x0104:
        return;
    L_0x0105:
        r17 = r17 + -1;
        r4 = 7;
        if (r15 < r4) goto L_0x010c;
    L_0x010a:
        r5 = 1;
        goto L_0x010d;
    L_0x010c:
        r5 = 0;
    L_0x010d:
        if (r1 < r4) goto L_0x0111;
    L_0x010f:
        r1 = 1;
        goto L_0x0112;
    L_0x0111:
        r1 = 0;
    L_0x0112:
        r1 = r1 | r5;
        if (r1 != 0) goto L_0x0124;
    L_0x0115:
        if (r17 >= 0) goto L_0x0119;
    L_0x0117:
        r17 = 0;
    L_0x0119:
        r1 = r17 + 2;
        r5 = r2;
        r4 = r3;
        r6 = r12;
        r2 = r14;
        r3 = r1;
        r1 = r16;
        goto L_0x0031;
    L_0x0124:
        r15 = r2;
        r13 = r3;
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.TimSort.a(int, int, int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private void m59211b(int r22, int r23, int r24, int r25) {
        /*
        r21 = this;
        r0 = r21;
        r2 = r24;
        r3 = r25;
        r7 = r0.f48781a;
        r8 = r0.m59212c(r3);
        r9 = r0.f48785e;
        java.lang.System.arraycopy(r7, r2, r8, r9, r3);
        r4 = r22 + r23;
        r10 = 1;
        r4 = r4 - r10;
        r5 = r9 + r3;
        r5 = r5 - r10;
        r2 = r2 + r3;
        r2 = r2 - r10;
        r6 = r2 + -1;
        r11 = r4 + -1;
        r4 = r7[r4];
        r7[r2] = r4;
        r1 = r23 + -1;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r3 + -1;
        r6 = r6 - r1;
        java.lang.System.arraycopy(r8, r9, r7, r6, r3);
        return;
    L_0x002d:
        if (r3 != r10) goto L_0x003c;
    L_0x002f:
        r6 = r6 - r1;
        r11 = r11 - r1;
        r11 = r11 + r10;
        r2 = r6 + 1;
        java.lang.System.arraycopy(r7, r11, r7, r2, r1);
        r1 = r8[r5];
        r7[r6] = r1;
        return;
    L_0x003c:
        r12 = r0.f48782b;
        r2 = r0.f48783c;
    L_0x0040:
        r14 = r3;
        r4 = 0;
        r3 = r1;
        r1 = 0;
    L_0x0044:
        r13 = r8[r5];
        r10 = r7[r11];
        r10 = r12.compare(r13, r10);
        if (r10 >= 0) goto L_0x0065;
    L_0x004e:
        r4 = r6 + -1;
        r10 = r11 + -1;
        r11 = r7[r11];
        r7[r6] = r11;
        r6 = 1;
        r1 = r1 + r6;
        r3 = r3 + -1;
        if (r3 != 0) goto L_0x0061;
    L_0x005c:
        r11 = r10;
    L_0x005d:
        r6 = 1;
        r10 = r2;
        goto L_0x0113;
    L_0x0061:
        r6 = r4;
        r11 = r10;
        r4 = 0;
        goto L_0x0079;
    L_0x0065:
        r1 = r6 + -1;
        r10 = r5 + -1;
        r5 = r8[r5];
        r7[r6] = r5;
        r5 = 1;
        r4 = r4 + r5;
        r14 = r14 + -1;
        if (r14 != r5) goto L_0x0076;
    L_0x0073:
        r4 = r1;
        r5 = r10;
        goto L_0x005d;
    L_0x0076:
        r6 = r1;
        r5 = r10;
        r1 = 0;
    L_0x0079:
        r10 = r1 | r4;
        if (r10 < r2) goto L_0x015f;
    L_0x007d:
        r17 = r2;
        r10 = r3;
        r13 = r6;
        r16 = r14;
        r14 = r11;
        r11 = r5;
    L_0x0085:
        r1 = r8[r11];
        r5 = r10 + -1;
        r2 = r7;
        r3 = r22;
        r4 = r10;
        r6 = r12;
        r1 = m59208b(r1, r2, r3, r4, r5, r6);
        r6 = r10 - r1;
        if (r6 == 0) goto L_0x00b1;
    L_0x0096:
        r4 = r13 - r6;
        r1 = r14 - r6;
        r3 = r10 - r6;
        r2 = r1 + 1;
        r5 = r4 + 1;
        java.lang.System.arraycopy(r7, r2, r7, r5, r6);
        if (r3 != 0) goto L_0x00ae;
    L_0x00a5:
        r5 = r11;
        r14 = r16;
        r10 = r17;
        r6 = 1;
        r11 = r1;
        goto L_0x0113;
    L_0x00ae:
        r14 = r1;
        r10 = r3;
        r13 = r4;
    L_0x00b1:
        r18 = r13 + -1;
        r19 = r11 + -1;
        r1 = r8[r11];
        r7[r13] = r1;
        r11 = r16 + -1;
        r1 = 1;
        if (r11 != r1) goto L_0x00cc;
    L_0x00be:
        r3 = r10;
        r10 = r17;
        r4 = r18;
        r5 = r19;
        r6 = 1;
        r20 = r14;
        r14 = r11;
        r11 = r20;
        goto L_0x0113;
    L_0x00cc:
        r1 = r7[r14];
        r5 = r11 + -1;
        r2 = r8;
        r3 = r9;
        r4 = r11;
        r13 = r6;
        r6 = r12;
        r1 = m59200a(r1, r2, r3, r4, r5, r6);
        r1 = r11 - r1;
        if (r1 == 0) goto L_0x00fa;
    L_0x00dd:
        r4 = r18 - r1;
        r5 = r19 - r1;
        r2 = r11 - r1;
        r3 = r5 + 1;
        r6 = r4 + 1;
        java.lang.System.arraycopy(r8, r3, r7, r6, r1);
        r3 = 1;
        if (r2 > r3) goto L_0x00f4;
    L_0x00ed:
        r3 = r10;
        r11 = r14;
        r10 = r17;
        r6 = 1;
        r14 = r2;
        goto L_0x0113;
    L_0x00f4:
        r16 = r2;
        r18 = r4;
        r11 = r5;
        goto L_0x00fe;
    L_0x00fa:
        r16 = r11;
        r11 = r19;
    L_0x00fe:
        r2 = r18 + -1;
        r3 = r14 + -1;
        r4 = r7[r14];
        r7[r18] = r4;
        r10 = r10 + -1;
        if (r10 != 0) goto L_0x0138;
    L_0x010a:
        r4 = r2;
        r5 = r11;
        r14 = r16;
        r6 = 1;
        r11 = r3;
        r3 = r10;
        r10 = r17;
    L_0x0113:
        if (r10 >= r6) goto L_0x0116;
    L_0x0115:
        r10 = 1;
    L_0x0116:
        r0.f48783c = r10;
        if (r14 != r6) goto L_0x0127;
    L_0x011a:
        r4 = r4 - r3;
        r11 = r11 - r3;
        r11 = r11 + r6;
        r1 = r4 + 1;
        java.lang.System.arraycopy(r7, r11, r7, r1, r3);
        r1 = r8[r5];
        r7[r4] = r1;
        goto L_0x0137;
    L_0x0127:
        if (r14 != 0) goto L_0x0131;
    L_0x0129:
        r1 = new java.lang.IllegalArgumentException;
        r2 = "Comparison method violates its general contract!";
        r1.<init>(r2);
        throw r1;
    L_0x0131:
        r1 = r14 + -1;
        r4 = r4 - r1;
        java.lang.System.arraycopy(r8, r9, r7, r4, r14);
    L_0x0137:
        return;
    L_0x0138:
        r6 = 1;
        r17 = r17 + -1;
        r4 = 7;
        if (r13 < r4) goto L_0x0140;
    L_0x013e:
        r5 = 1;
        goto L_0x0141;
    L_0x0140:
        r5 = 0;
    L_0x0141:
        if (r1 < r4) goto L_0x0145;
    L_0x0143:
        r1 = 1;
        goto L_0x0146;
    L_0x0145:
        r1 = 0;
    L_0x0146:
        r1 = r1 | r5;
        if (r1 != 0) goto L_0x015b;
    L_0x0149:
        if (r17 >= 0) goto L_0x014d;
    L_0x014b:
        r15 = 0;
        goto L_0x014f;
    L_0x014d:
        r15 = r17;
    L_0x014f:
        r1 = r15 + 2;
        r6 = r2;
        r5 = r11;
        r2 = r1;
        r11 = r3;
        r1 = r10;
        r3 = r16;
        r10 = 1;
        goto L_0x0040;
    L_0x015b:
        r13 = r2;
        r14 = r3;
        goto L_0x0085;
    L_0x015f:
        r10 = 1;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.TimSort.b(int, int, int, int):void");
    }

    /* renamed from: c */
    private T[] m59212c(int i) {
        if (this.f48786f < i) {
            int i2 = (i >> 1) | i;
            i2 |= i2 >> 2;
            i2 |= i2 >> 4;
            i2 |= i2 >> 8;
            i2 = (i2 | (i2 >> 16)) + 1;
            if (i2 >= 0) {
                i = Math.min(i2, this.f48781a.length >>> 1);
            }
            this.f48784d = (Object[]) Array.newInstance(this.f48781a.getClass().getComponentType(), i);
            this.f48786f = i;
            this.f48785e = 0;
        }
        return this.f48784d;
    }
}
