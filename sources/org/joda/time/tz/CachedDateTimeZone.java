package org.joda.time.tz;

import org.joda.time.DateTimeZone;

public class CachedDateTimeZone extends DateTimeZone {
    /* renamed from: b */
    private static final int f60883b;
    private static final long serialVersionUID = 5472298452022250685L;
    /* renamed from: c */
    private final DateTimeZone f60884c;
    /* renamed from: d */
    private final transient C19329a[] f60885d = new C19329a[(f60883b + 1)];

    /* renamed from: org.joda.time.tz.CachedDateTimeZone$a */
    private static final class C19329a {
        /* renamed from: a */
        public final long f60283a;
        /* renamed from: b */
        public final DateTimeZone f60284b;
        /* renamed from: c */
        C19329a f60285c;
        /* renamed from: d */
        private String f60286d;
        /* renamed from: e */
        private int f60287e = Integer.MIN_VALUE;
        /* renamed from: f */
        private int f60288f = Integer.MIN_VALUE;

        C19329a(DateTimeZone dateTimeZone, long j) {
            this.f60283a = j;
            this.f60284b = dateTimeZone;
        }

        /* renamed from: a */
        public String m69320a(long j) {
            if (this.f60285c != null) {
                if (j >= this.f60285c.f60283a) {
                    return this.f60285c.m69320a(j);
                }
            }
            if (this.f60286d == null) {
                this.f60286d = this.f60284b.a(this.f60283a);
            }
            return this.f60286d;
        }

        /* renamed from: b */
        public int m69321b(long j) {
            if (this.f60285c != null) {
                if (j >= this.f60285c.f60283a) {
                    return this.f60285c.m69321b(j);
                }
            }
            if (this.f60287e == Integer.MIN_VALUE) {
                this.f60287e = this.f60284b.b(this.f60283a);
            }
            return this.f60287e;
        }

        /* renamed from: c */
        public int m69322c(long j) {
            if (this.f60285c != null) {
                if (j >= this.f60285c.f60283a) {
                    return this.f60285c.m69322c(j);
                }
            }
            if (this.f60288f == Integer.MIN_VALUE) {
                this.f60288f = this.f60284b.c(this.f60283a);
            }
            return this.f60288f;
        }
    }

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "org.joda.time.tz.CachedDateTimeZone.size";	 Catch:{ SecurityException -> 0x0007 }
        r0 = java.lang.Integer.getInteger(r0);	 Catch:{ SecurityException -> 0x0007 }
        goto L_0x0008;
    L_0x0007:
        r0 = 0;
    L_0x0008:
        r1 = 1;
        if (r0 != 0) goto L_0x000e;
    L_0x000b:
        r0 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        goto L_0x001e;
    L_0x000e:
        r0 = r0.intValue();
        r0 = r0 + -1;
        r2 = 0;
    L_0x0015:
        if (r0 <= 0) goto L_0x001c;
    L_0x0017:
        r2 = r2 + 1;
        r0 = r0 >> 1;
        goto L_0x0015;
    L_0x001c:
        r0 = r1 << r2;
    L_0x001e:
        r0 = r0 - r1;
        f60883b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.CachedDateTimeZone.<clinit>():void");
    }

    /* renamed from: b */
    public static CachedDateTimeZone m70335b(DateTimeZone dateTimeZone) {
        if (dateTimeZone instanceof CachedDateTimeZone) {
            return (CachedDateTimeZone) dateTimeZone;
        }
        return new CachedDateTimeZone(dateTimeZone);
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.e());
        this.f60884c = dateTimeZone;
    }

    /* renamed from: a */
    public String m70338a(long j) {
        return m70336i(j).m69320a(j);
    }

    /* renamed from: b */
    public int m70339b(long j) {
        return m70336i(j).m69321b(j);
    }

    /* renamed from: c */
    public int m70340c(long j) {
        return m70336i(j).m69322c(j);
    }

    /* renamed from: f */
    public boolean m70341f() {
        return this.f60884c.f();
    }

    /* renamed from: g */
    public long m70342g(long j) {
        return this.f60884c.g(j);
    }

    /* renamed from: h */
    public long m70343h(long j) {
        return this.f60884c.h(j);
    }

    public int hashCode() {
        return this.f60884c.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof CachedDateTimeZone ? this.f60884c.equals(((CachedDateTimeZone) obj).f60884c) : null;
    }

    /* renamed from: i */
    private C19329a m70336i(long j) {
        int i = (int) (j >> 32);
        C19329a[] c19329aArr = this.f60885d;
        int i2 = f60883b & i;
        C19329a c19329a = c19329aArr[i2];
        if (c19329a != null && ((int) (c19329a.f60283a >> 32)) == i) {
            return c19329a;
        }
        c19329a = m70337j(j);
        c19329aArr[i2] = c19329a;
        return c19329a;
    }

    /* renamed from: j */
    private C19329a m70337j(long j) {
        long j2 = j & -4294967296L;
        j = new C19329a(this.f60884c, j2);
        long j3 = j2 | 4294967295L;
        C19329a c19329a = j;
        while (true) {
            long g = this.f60884c.g(j2);
            if (g == j2) {
                break;
            } else if (g > j3) {
                break;
            } else {
                C19329a c19329a2 = new C19329a(this.f60884c, g);
                c19329a.f60285c = c19329a2;
                c19329a = c19329a2;
                j2 = g;
            }
        }
        return j;
    }
}
