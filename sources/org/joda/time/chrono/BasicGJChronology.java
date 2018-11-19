package org.joda.time.chrono;

import org.joda.time.C19304a;

abstract class BasicGJChronology extends BasicChronology {
    /* renamed from: a */
    private static final int[] f62149a = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    /* renamed from: b */
    private static final int[] f62150b = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    /* renamed from: c */
    private static final long[] f62151c = new long[12];
    /* renamed from: d */
    private static final long[] f62152d = new long[12];
    private static final long serialVersionUID = 538276888268L;

    static {
        long j = 0;
        int i = 0;
        long j2 = 0;
        while (i < 11) {
            long j3 = j + (((long) f62149a[i]) * 86400000);
            int i2 = i + 1;
            f62151c[i2] = j3;
            long j4 = j2 + (((long) f62150b[i]) * 86400000);
            f62152d[i2] = j4;
            i = i2;
            j2 = j4;
            j = j3;
        }
    }

    BasicGJChronology(C19304a c19304a, Object obj, int i) {
        super(c19304a, obj, i);
    }

    /* renamed from: j */
    boolean mo14870j(long j) {
        return (mo14515u().mo14524a(j) != 29 || mo14478C().mo14543b(j) == null) ? 0 : 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    int mo14860a(long r13, int r15) {
        /*
        r12 = this;
        r0 = r12.m71140d(r15);
        r2 = r13 - r0;
        r13 = 10;
        r0 = r2 >> r13;
        r14 = (int) r0;
        r15 = r12.mo14866e(r15);
        r0 = 12;
        r1 = 11;
        r2 = 9;
        r3 = 8;
        r4 = 7;
        r5 = 6;
        r6 = 5;
        r7 = 4;
        r8 = 3;
        r9 = 2;
        r10 = 1;
        r11 = 2615625; // 0x27e949 float:3.665271E-39 double:1.2922905E-317;
        if (r15 == 0) goto L_0x007a;
    L_0x0023:
        r15 = 15356250; // 0xea515a float:2.151869E-38 double:7.5869956E-317;
        if (r14 >= r15) goto L_0x004f;
    L_0x0028:
        r13 = 7678125; // 0x7528ad float:1.0759345E-38 double:3.793498E-317;
        if (r14 >= r13) goto L_0x003c;
    L_0x002d:
        if (r14 >= r11) goto L_0x0031;
    L_0x002f:
        goto L_0x00b6;
    L_0x0031:
        r13 = 5062500; // 0x4d3f64 float:7.094073E-39 double:2.5012073E-317;
        if (r14 >= r13) goto L_0x0039;
    L_0x0036:
        r10 = 2;
        goto L_0x00b6;
    L_0x0039:
        r10 = 3;
        goto L_0x00b6;
    L_0x003c:
        r13 = 10209375; // 0x9bc85f float:1.4306382E-38 double:5.0441015E-317;
        if (r14 >= r13) goto L_0x0044;
    L_0x0041:
        r10 = 4;
        goto L_0x00b6;
    L_0x0044:
        r13 = 12825000; // 0xc3b1a8 float:1.7971653E-38 double:6.336392E-317;
        if (r14 >= r13) goto L_0x004c;
    L_0x0049:
        r10 = 5;
        goto L_0x00b6;
    L_0x004c:
        r10 = 6;
        goto L_0x00b6;
    L_0x004f:
        r15 = 23118750; // 0x160c39e float:4.128265E-38 double:1.142218E-316;
        if (r14 >= r15) goto L_0x0067;
    L_0x0054:
        r13 = 17971875; // 0x1123aa3 float:2.6858035E-38 double:8.879286E-317;
        if (r14 >= r13) goto L_0x005c;
    L_0x0059:
        r10 = 7;
        goto L_0x00b6;
    L_0x005c:
        r13 = 20587500; // 0x13a23ec float:3.4188577E-38 double:1.01715765E-316;
        if (r14 >= r13) goto L_0x0064;
    L_0x0061:
        r10 = 8;
        goto L_0x00b6;
    L_0x0064:
        r10 = 9;
        goto L_0x00b6;
    L_0x0067:
        r15 = 25734375; // 0x188ace7 float:5.020661E-38 double:1.27144706E-316;
        if (r14 >= r15) goto L_0x006f;
    L_0x006c:
        r10 = 10;
        goto L_0x00b6;
    L_0x006f:
        r13 = 28265625; // 0x1af4c99 float:6.439476E-38 double:1.39650743E-316;
        if (r14 >= r13) goto L_0x0077;
    L_0x0074:
        r10 = 11;
        goto L_0x00b6;
    L_0x0077:
        r10 = 12;
        goto L_0x00b6;
    L_0x007a:
        r15 = 15271875; // 0xe907c3 float:2.1400455E-38 double:7.545309E-317;
        if (r14 >= r15) goto L_0x0099;
    L_0x007f:
        r13 = 7593750; // 0x73df16 float:1.064111E-38 double:3.751811E-317;
        if (r14 >= r13) goto L_0x008d;
    L_0x0084:
        if (r14 >= r11) goto L_0x0087;
    L_0x0086:
        goto L_0x00b6;
    L_0x0087:
        r13 = 4978125; // 0x4bf5cd float:6.975839E-39 double:2.4595205E-317;
        if (r14 >= r13) goto L_0x0039;
    L_0x008c:
        goto L_0x0036;
    L_0x008d:
        r13 = 10125000; // 0x9a7ec8 float:1.4188147E-38 double:5.0024147E-317;
        if (r14 >= r13) goto L_0x0093;
    L_0x0092:
        goto L_0x0041;
    L_0x0093:
        r13 = 12740625; // 0xc26811 float:1.7853418E-38 double:6.294705E-317;
        if (r14 >= r13) goto L_0x004c;
    L_0x0098:
        goto L_0x0049;
    L_0x0099:
        r15 = 23034375; // 0x15f7a07 float:4.1046182E-38 double:1.13804934E-316;
        if (r14 >= r15) goto L_0x00aa;
    L_0x009e:
        r13 = 17887500; // 0x110f10c float:2.6621566E-38 double:8.837599E-317;
        if (r14 >= r13) goto L_0x00a4;
    L_0x00a3:
        goto L_0x0059;
    L_0x00a4:
        r13 = 20503125; // 0x138da55 float:3.3952108E-38 double:1.01298897E-316;
        if (r14 >= r13) goto L_0x0064;
    L_0x00a9:
        goto L_0x0061;
    L_0x00aa:
        r15 = 25650000; // 0x1876350 float:4.9733674E-38 double:1.2672784E-316;
        if (r14 >= r15) goto L_0x00b0;
    L_0x00af:
        goto L_0x006c;
    L_0x00b0:
        r13 = 28181250; // 0x1ae0302 float:6.392182E-38 double:1.39233875E-316;
        if (r14 >= r13) goto L_0x0077;
    L_0x00b5:
        goto L_0x0074;
    L_0x00b6:
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicGJChronology.a(long, int):int");
    }

    /* renamed from: b */
    int mo14862b(int i, int i2) {
        if (mo14866e(i) != 0) {
            return f62150b[i2 - 1];
        }
        return f62149a[i2 - 1];
    }

    /* renamed from: f */
    int mo14867f(int i) {
        return f62150b[i - 1];
    }

    /* renamed from: e */
    int mo14869e(long j, int i) {
        return (i > 28 || i < 1) ? m71151i(j) : 28;
    }

    /* renamed from: c */
    long mo14865c(int i, int i2) {
        if (mo14866e(i) != 0) {
            return f62152d[i2 - 1];
        }
        return f62151c[i2 - 1];
    }

    /* renamed from: a */
    long mo14861a(long j, long j2) {
        int a = mo14876a(j);
        int a2 = mo14876a(j2);
        long d = j - m71140d(a);
        long d2 = j2 - m71140d(a2);
        if (d2 >= 5097600000L) {
            if (mo14866e(a2) != null) {
                if (mo14866e(a) == null) {
                    d2 -= 86400000;
                }
            } else if (d >= 5097600000L && mo14866e(a) != null) {
                d -= 86400000;
            }
        }
        a -= a2;
        if (d < d2) {
            a--;
        }
        return (long) a;
    }

    /* renamed from: f */
    long mo14868f(long j, int i) {
        int a = mo14876a(j);
        int c = m71135c(j, a);
        j = m71150h(j);
        if (c > 59) {
            if (mo14866e(a)) {
                if (!mo14866e(i)) {
                    c--;
                }
            } else if (mo14866e(i)) {
                c++;
            }
        }
        return m71123a(i, 1, c) + ((long) j);
    }
}
