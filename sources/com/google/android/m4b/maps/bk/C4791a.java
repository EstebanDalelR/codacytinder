package com.google.android.m4b.maps.bk;

import java.util.Comparator;

/* renamed from: com.google.android.m4b.maps.bk.a */
abstract class C4791a {
    /* renamed from: a */
    protected int f17489a;

    /* renamed from: com.google.android.m4b.maps.bk.a$a */
    public static class C4789a implements Comparator<int[]> {
        /* renamed from: a */
        private final C4791a f17478a;
        /* renamed from: b */
        private final double f17479b;
        /* renamed from: c */
        private final double f17480c;

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m21200a((int[]) obj, (int[]) obj2);
        }

        public C4789a(C4791a c4791a, int i) {
            this.f17478a = c4791a;
            this.f17479b = c4791a.mo5023a(i);
            this.f17480c = c4791a.mo5026b(i);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public final int m21200a(int[] r26, int[] r27) {
            /*
            r25 = this;
            r0 = r25;
            r3 = r0.f17478a;
            r4 = 1;
            r5 = r26[r4];
            r18 = r3.mo5023a(r5);
            r3 = r0.f17478a;
            r1 = r26[r4];
            r20 = r3.mo5026b(r1);
            r1 = r0.f17478a;
            r3 = r27[r4];
            r22 = r1.mo5023a(r3);
            r1 = r0.f17478a;
            r2 = r27[r4];
            r1 = r1.mo5026b(r2);
            r5 = r0.f17479b;
            r3 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1));
            r24 = -1;
            if (r3 != 0) goto L_0x0032;
        L_0x002b:
            r5 = r0.f17480c;
            r3 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1));
            if (r3 != 0) goto L_0x0032;
        L_0x0031:
            return r24;
        L_0x0032:
            r5 = r0.f17479b;
            r3 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1));
            if (r3 != 0) goto L_0x003f;
        L_0x0038:
            r5 = r0.f17480c;
            r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
            if (r3 != 0) goto L_0x003f;
        L_0x003e:
            return r4;
        L_0x003f:
            r10 = r0.f17479b;
            r12 = r0.f17480c;
            r6 = r18;
            r8 = r20;
            r3 = com.google.android.m4b.maps.bk.C4806l.m21280a(r6, r8, r10, r12);
            r14 = 0;
            if (r3 < 0) goto L_0x0065;
        L_0x004e:
            r10 = r0.f17479b;
            r12 = r0.f17480c;
            r6 = r18;
            r8 = r20;
            r3 = com.google.android.m4b.maps.bk.C4806l.m21280a(r6, r8, r10, r12);
            if (r3 != 0) goto L_0x0063;
        L_0x005c:
            r5 = r0.f17480c;
            r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1));
            if (r3 >= 0) goto L_0x0063;
        L_0x0062:
            goto L_0x0065;
        L_0x0063:
            r3 = 0;
            goto L_0x0066;
        L_0x0065:
            r3 = 1;
        L_0x0066:
            r9 = r0.f17479b;
            r11 = r0.f17480c;
            r5 = r22;
            r7 = r1;
            r5 = com.google.android.m4b.maps.bk.C4806l.m21280a(r5, r7, r9, r11);
            if (r5 < 0) goto L_0x0086;
        L_0x0073:
            r9 = r0.f17479b;
            r11 = r0.f17480c;
            r5 = r22;
            r7 = r1;
            r5 = com.google.android.m4b.maps.bk.C4806l.m21280a(r5, r7, r9, r11);
            if (r5 >= 0) goto L_0x0087;
        L_0x0080:
            r5 = r0.f17480c;
            r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
            if (r7 >= 0) goto L_0x0087;
        L_0x0086:
            r14 = 1;
        L_0x0087:
            if (r3 != r14) goto L_0x00b3;
        L_0x0089:
            r6 = r0.f17479b;
            r8 = r0.f17480c;
            r10 = r22;
            r12 = r1;
            r14 = r18;
            r16 = r20;
            r5 = com.google.android.m4b.maps.bk.C4806l.m21279a(r6, r8, r10, r12, r14, r16);
            r7 = 0;
            r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r3 != 0) goto L_0x00ad;
        L_0x009e:
            r6 = r18;
            r8 = r20;
            r10 = r22;
            r12 = r1;
            r1 = com.google.android.m4b.maps.bk.C4806l.m21280a(r6, r8, r10, r12);
            if (r1 <= 0) goto L_0x00ac;
        L_0x00ab:
            return r4;
        L_0x00ac:
            return r24;
        L_0x00ad:
            r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r1 <= 0) goto L_0x00b2;
        L_0x00b1:
            return r4;
        L_0x00b2:
            return r24;
        L_0x00b3:
            if (r3 == 0) goto L_0x00b6;
        L_0x00b5:
            return r24;
        L_0x00b6:
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bk.a.a.a(int[], int[]):int");
        }
    }

    /* renamed from: com.google.android.m4b.maps.bk.a$b */
    public enum C4790b {
        SPLIT_VERTEX,
        MERGE_VERTEX,
        RIGHT_VERTEX,
        LEFT_VERTEX,
        START_VERTEX,
        END_VERTEX,
        INTERSECTION_VERTEX
    }

    /* renamed from: a */
    public abstract double mo5023a(int i);

    /* renamed from: a */
    public abstract int mo5024a();

    /* renamed from: a */
    abstract void mo5025a(int i, double[] dArr, int i2, int i3);

    /* renamed from: b */
    public abstract double mo5026b(int i);

    /* renamed from: c */
    public abstract int mo5027c(int i);

    /* renamed from: d */
    public abstract int mo5028d(int i);

    /* renamed from: e */
    public abstract C4790b mo5029e(int i);

    C4791a() {
    }

    /* renamed from: a */
    public final int m21205a(int i, int i2) {
        return C4806l.m21280a(mo5023a(i), mo5026b(i), mo5023a(i2), mo5026b(i2));
    }

    /* renamed from: a */
    public final double m21203a(int i, int i2, int i3) {
        return C4806l.m21279a(mo5023a(i), mo5026b(i), mo5023a(i2), mo5026b(i2), mo5023a(i3), mo5026b(i3));
    }

    /* renamed from: a */
    public final boolean m21207a(int i, int i2, int i3, int i4, int i5) {
        if (!(m21205a(i, i2) == 0 || m21205a(i, i3) == 0 || m21205a(i, i4) == 0)) {
            if (m21205a(i, i5) != 0) {
                if ((m21201b(i2, i, i3) == 0 && m21201b(i4, i, i5) == 0) || (m21201b(i2, i, i5) == 0 && m21201b(i4, i, i3) == 0)) {
                    return false;
                }
                if (m21201b(i2, i, i4) == 0 && m21201b(i3, i, i5) == 0) {
                    if (m21205a(i2, i) == m21205a(i4, i) || m21205a(i3, i) == m21205a(i5, i)) {
                        return false;
                    }
                    return true;
                } else if (m21201b(i2, i, i4) == 0) {
                    if (m21205a(i2, i) == m21205a(i4, i) || m21201b(i2, i, i3) == m21201b(i2, i, i5)) {
                        return false;
                    }
                    return true;
                } else if (m21201b(i3, i, i5) != 0) {
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    if (m21201b(i2, i, i3) == 0) {
                        i6 = i2;
                        i7 = i3;
                        i8 = i4;
                        i9 = i5;
                    } else {
                        i6 = -1;
                        i7 = -1;
                        i8 = -1;
                        i9 = -1;
                    }
                    if (m21201b(i2, i, i5) == 0) {
                        i6 = i2;
                        i9 = i3;
                        i8 = i4;
                        i7 = i5;
                    }
                    if (m21201b(i3, i, i4) == 0) {
                        i9 = i2;
                        i6 = i3;
                        i7 = i4;
                        i8 = i5;
                    }
                    if (m21201b(i4, i, i5) == 0) {
                        i8 = i2;
                        i9 = i3;
                        i6 = i4;
                        i7 = i5;
                    }
                    if (i6 != -1) {
                        if (m21205a(i, i6) != m21205a(i, i7) && m21201b(i6, i, r5) == m21201b(i6, i, r6) && m21201b(r5, i, i6) == m21201b(r5, i, r6)) {
                            return true;
                        }
                        return false;
                    } else if (m21201b(i2, i, i3) != m21201b(i2, i, i5)) {
                        if (m21201b(i2, i, i4) != m21201b(i2, i, i3)) {
                            i3 = i5;
                        }
                        if (m21201b(i3, i, i2) != m21201b(i3, i, i4)) {
                            return true;
                        }
                        return false;
                    } else if (m21201b(i2, i, i3) != m21201b(i2, i, i4) || m21201b(i4, i, i3) == m21201b(i4, i, i5)) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (m21205a(i3, i) == m21205a(i5, i) || m21201b(i3, i, i2) == m21201b(i3, i, i4)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m21201b(int i, int i2, int i3) {
        i = m21203a(i, i2, i3);
        if (i > 0) {
            return 1;
        }
        return i == 0 ? 0 : -1;
    }

    /* renamed from: f */
    public int mo7060f(int i) {
        if (i >= 0) {
            if (i < this.f17489a) {
                return 0;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int mo7061g(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return this.f17489a;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: h */
    protected final int m21214h(int i) {
        if (this.f17489a == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i %= this.f17489a;
        return i < 0 ? i + this.f17489a : i;
    }
}
