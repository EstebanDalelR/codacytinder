package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C19304a;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology.C19307a;

public final class GregorianChronology extends BasicGJChronology {
    /* renamed from: a */
    private static final GregorianChronology f62358a = m71688b(DateTimeZone.f8461a);
    /* renamed from: b */
    private static final ConcurrentHashMap<DateTimeZone, GregorianChronology[]> f62359b = new ConcurrentHashMap();
    private static final long serialVersionUID = -861407383323710522L;

    /* renamed from: Q */
    int mo14872Q() {
        return -292275054;
    }

    /* renamed from: R */
    int mo14873R() {
        return 292278993;
    }

    /* renamed from: T */
    long mo14857T() {
        return 31556952000L;
    }

    /* renamed from: U */
    long mo14858U() {
        return 15778476000L;
    }

    /* renamed from: V */
    long mo14859V() {
        return 2629746000L;
    }

    /* renamed from: W */
    long mo14874W() {
        return 31083597720000L;
    }

    /* renamed from: Z */
    public static GregorianChronology m71686Z() {
        return f62358a;
    }

    public static GregorianChronology aa() {
        return m71687a(DateTimeZone.a(), 4);
    }

    /* renamed from: b */
    public static GregorianChronology m71688b(DateTimeZone dateTimeZone) {
        return m71687a(dateTimeZone, 4);
    }

    /* renamed from: a */
    public static org.joda.time.chrono.GregorianChronology m71687a(org.joda.time.DateTimeZone r5, int r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r5 != 0) goto L_0x0006;
    L_0x0002:
        r5 = org.joda.time.DateTimeZone.a();
    L_0x0006:
        r0 = f62359b;
        r0 = r0.get(r5);
        r0 = (org.joda.time.chrono.GregorianChronology[]) r0;
        if (r0 != 0) goto L_0x001e;
    L_0x0010:
        r0 = 7;
        r0 = new org.joda.time.chrono.GregorianChronology[r0];
        r1 = f62359b;
        r1 = r1.putIfAbsent(r5, r0);
        r1 = (org.joda.time.chrono.GregorianChronology[]) r1;
        if (r1 == 0) goto L_0x001e;
    L_0x001d:
        r0 = r1;
    L_0x001e:
        r1 = r6 + -1;
        r2 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        if (r2 != 0) goto L_0x004c;
    L_0x0024:
        monitor-enter(r0);
        r2 = r0[r1];	 Catch:{ all -> 0x0049 }
        if (r2 != 0) goto L_0x0047;	 Catch:{ all -> 0x0049 }
    L_0x0029:
        r2 = org.joda.time.DateTimeZone.f8461a;	 Catch:{ all -> 0x0049 }
        r3 = 0;	 Catch:{ all -> 0x0049 }
        if (r5 != r2) goto L_0x0034;	 Catch:{ all -> 0x0049 }
    L_0x002e:
        r5 = new org.joda.time.chrono.GregorianChronology;	 Catch:{ all -> 0x0049 }
        r5.<init>(r3, r3, r6);	 Catch:{ all -> 0x0049 }
        goto L_0x0044;	 Catch:{ all -> 0x0049 }
    L_0x0034:
        r2 = org.joda.time.DateTimeZone.f8461a;	 Catch:{ all -> 0x0049 }
        r2 = m71687a(r2, r6);	 Catch:{ all -> 0x0049 }
        r4 = new org.joda.time.chrono.GregorianChronology;	 Catch:{ all -> 0x0049 }
        r5 = org.joda.time.chrono.ZonedChronology.m71234a(r2, r5);	 Catch:{ all -> 0x0049 }
        r4.<init>(r5, r3, r6);	 Catch:{ all -> 0x0049 }
        r5 = r4;	 Catch:{ all -> 0x0049 }
    L_0x0044:
        r0[r1] = r5;	 Catch:{ all -> 0x0049 }
        r2 = r5;	 Catch:{ all -> 0x0049 }
    L_0x0047:
        monitor-exit(r0);	 Catch:{ all -> 0x0049 }
        goto L_0x004c;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r5 = move-exception;	 Catch:{ all -> 0x0049 }
        monitor-exit(r0);	 Catch:{ all -> 0x0049 }
        throw r5;
    L_0x004c:
        return r2;
    L_0x004d:
        r5 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Invalid min days in first week: ";
        r0.append(r1);
        r0.append(r6);
        r6 = r0.toString();
        r5.<init>(r6);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.GregorianChronology.a(org.joda.time.DateTimeZone, int):org.joda.time.chrono.GregorianChronology");
    }

    private GregorianChronology(C19304a c19304a, Object obj, int i) {
        super(c19304a, obj, i);
    }

    private Object readResolve() {
        C19304a L = m70691L();
        int N = mo14801N();
        if (N == 0) {
            N = 4;
        }
        return m71687a(L == null ? DateTimeZone.f8461a : L.mo14710a(), N);
    }

    /* renamed from: b */
    public C19304a mo14712b() {
        return f62358a;
    }

    /* renamed from: a */
    public C19304a mo14711a(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        if (dateTimeZone == mo14710a()) {
            return this;
        }
        return m71688b(dateTimeZone);
    }

    /* renamed from: a */
    protected void mo14802a(C19307a c19307a) {
        if (m70691L() == null) {
            super.mo14802a(c19307a);
        }
    }

    /* renamed from: e */
    boolean mo14866e(int i) {
        return (i & 3) == 0 && (i % 100 != 0 || i % 400 == 0);
    }

    /* renamed from: g */
    long mo14878g(int i) {
        int i2;
        int i3 = i / 100;
        if (i < 0) {
            i2 = ((((i + 3) >> 2) - i3) + ((i3 + 3) >> 2)) - 1;
        } else {
            i2 = ((i >> 2) - i3) + (i3 >> 2);
            if (mo14866e(i)) {
                i2--;
            }
        }
        return ((((long) i) * 365) + ((long) (i2 - 719527))) * 86400000;
    }
}
