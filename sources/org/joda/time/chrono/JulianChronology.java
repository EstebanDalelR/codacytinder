package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C19304a;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology.C19307a;
import org.joda.time.field.SkipDateTimeField;

public final class JulianChronology extends BasicGJChronology {
    /* renamed from: a */
    private static final JulianChronology f62360a = m71702b(DateTimeZone.f8461a);
    /* renamed from: b */
    private static final ConcurrentHashMap<DateTimeZone, JulianChronology[]> f62361b = new ConcurrentHashMap();
    private static final long serialVersionUID = -8731039522547897247L;

    /* renamed from: Q */
    int mo14872Q() {
        return -292269054;
    }

    /* renamed from: R */
    int mo14873R() {
        return 292272992;
    }

    /* renamed from: T */
    long mo14857T() {
        return 31557600000L;
    }

    /* renamed from: U */
    long mo14858U() {
        return 15778800000L;
    }

    /* renamed from: V */
    long mo14859V() {
        return 2629800000L;
    }

    /* renamed from: W */
    long mo14874W() {
        return 31083663600000L;
    }

    /* renamed from: e */
    boolean mo14866e(int i) {
        return (i & 3) == 0;
    }

    /* renamed from: i */
    static int m71703i(int i) {
        if (i > 0) {
            return i;
        }
        if (i != 0) {
            return i + 1;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.m68893s(), Integer.valueOf(i), null, null);
    }

    /* renamed from: Z */
    public static JulianChronology m71700Z() {
        return m71701a(DateTimeZone.a(), 4);
    }

    /* renamed from: b */
    public static JulianChronology m71702b(DateTimeZone dateTimeZone) {
        return m71701a(dateTimeZone, 4);
    }

    /* renamed from: a */
    public static org.joda.time.chrono.JulianChronology m71701a(org.joda.time.DateTimeZone r5, int r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r5 != 0) goto L_0x0006;
    L_0x0002:
        r5 = org.joda.time.DateTimeZone.a();
    L_0x0006:
        r0 = f62361b;
        r0 = r0.get(r5);
        r0 = (org.joda.time.chrono.JulianChronology[]) r0;
        if (r0 != 0) goto L_0x001e;
    L_0x0010:
        r0 = 7;
        r0 = new org.joda.time.chrono.JulianChronology[r0];
        r1 = f62361b;
        r1 = r1.putIfAbsent(r5, r0);
        r1 = (org.joda.time.chrono.JulianChronology[]) r1;
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
        r5 = new org.joda.time.chrono.JulianChronology;	 Catch:{ all -> 0x0049 }
        r5.<init>(r3, r3, r6);	 Catch:{ all -> 0x0049 }
        goto L_0x0044;	 Catch:{ all -> 0x0049 }
    L_0x0034:
        r2 = org.joda.time.DateTimeZone.f8461a;	 Catch:{ all -> 0x0049 }
        r2 = m71701a(r2, r6);	 Catch:{ all -> 0x0049 }
        r4 = new org.joda.time.chrono.JulianChronology;	 Catch:{ all -> 0x0049 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.JulianChronology.a(org.joda.time.DateTimeZone, int):org.joda.time.chrono.JulianChronology");
    }

    JulianChronology(C19304a c19304a, Object obj, int i) {
        super(c19304a, obj, i);
    }

    private Object readResolve() {
        C19304a L = m70691L();
        int N = mo14801N();
        if (N == 0) {
            N = 4;
        }
        return m71701a(L == null ? DateTimeZone.f8461a : L.mo14710a(), N);
    }

    /* renamed from: b */
    public C19304a mo14712b() {
        return f62360a;
    }

    /* renamed from: a */
    public C19304a mo14711a(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        if (dateTimeZone == mo14710a()) {
            return this;
        }
        return m71702b(dateTimeZone);
    }

    /* renamed from: b */
    long mo14881b(int i, int i2, int i3) throws IllegalArgumentException {
        return super.mo14881b(m71703i(i), i2, i3);
    }

    /* renamed from: g */
    long mo14878g(int i) {
        int i2 = i - 1968;
        if (i2 <= 0) {
            i = (i2 + 3) >> 2;
        } else {
            int i3 = i2 >> 2;
            i = mo14866e(i) == 0 ? i3 + 1 : i3;
        }
        return (((((long) i2) * 365) + ((long) i)) * 86400000) - 62035200000L;
    }

    /* renamed from: a */
    protected void mo14802a(C19307a c19307a) {
        if (m70691L() == null) {
            super.mo14802a(c19307a);
            c19307a.f60114E = new SkipDateTimeField(this, c19307a.f60114E);
            c19307a.f60111B = new SkipDateTimeField(this, c19307a.f60111B);
        }
    }
}
