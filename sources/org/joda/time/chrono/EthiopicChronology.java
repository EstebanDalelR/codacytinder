package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology.C19307a;
import org.joda.time.field.SkipDateTimeField;

public final class EthiopicChronology extends BasicFixedMonthChronology {
    /* renamed from: a */
    private static final C19305b f62355a = new C19627d("EE");
    /* renamed from: b */
    private static final ConcurrentHashMap<DateTimeZone, EthiopicChronology[]> f62356b = new ConcurrentHashMap();
    /* renamed from: c */
    private static final EthiopicChronology f62357c = m71677b(DateTimeZone.f8461a);
    private static final long serialVersionUID = -5972804258688333942L;

    /* renamed from: Q */
    int mo14872Q() {
        return -292269337;
    }

    /* renamed from: R */
    int mo14873R() {
        return 292272984;
    }

    /* renamed from: W */
    long mo14874W() {
        return 30962844000000L;
    }

    /* renamed from: Z */
    public static EthiopicChronology m71675Z() {
        return m71676a(DateTimeZone.a(), 4);
    }

    /* renamed from: b */
    public static EthiopicChronology m71677b(DateTimeZone dateTimeZone) {
        return m71676a(dateTimeZone, 4);
    }

    /* renamed from: a */
    public static org.joda.time.chrono.EthiopicChronology m71676a(org.joda.time.DateTimeZone r13, int r14) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r13 != 0) goto L_0x0006;
    L_0x0002:
        r13 = org.joda.time.DateTimeZone.a();
    L_0x0006:
        r0 = f62356b;
        r0 = r0.get(r13);
        r0 = (org.joda.time.chrono.EthiopicChronology[]) r0;
        if (r0 != 0) goto L_0x001e;
    L_0x0010:
        r0 = 7;
        r0 = new org.joda.time.chrono.EthiopicChronology[r0];
        r1 = f62356b;
        r1 = r1.putIfAbsent(r13, r0);
        r1 = (org.joda.time.chrono.EthiopicChronology[]) r1;
        if (r1 == 0) goto L_0x001e;
    L_0x001d:
        r0 = r1;
    L_0x001e:
        r1 = r14 + -1;
        r2 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0063 }
        if (r2 != 0) goto L_0x0062;
    L_0x0024:
        monitor-enter(r0);
        r2 = r0[r1];	 Catch:{ all -> 0x005f }
        if (r2 != 0) goto L_0x005d;	 Catch:{ all -> 0x005f }
    L_0x0029:
        r2 = org.joda.time.DateTimeZone.f8461a;	 Catch:{ all -> 0x005f }
        r3 = 0;	 Catch:{ all -> 0x005f }
        if (r13 != r2) goto L_0x004b;	 Catch:{ all -> 0x005f }
    L_0x002e:
        r13 = new org.joda.time.chrono.EthiopicChronology;	 Catch:{ all -> 0x005f }
        r13.<init>(r3, r3, r14);	 Catch:{ all -> 0x005f }
        r2 = new org.joda.time.DateTime;	 Catch:{ all -> 0x005f }
        r5 = 1;	 Catch:{ all -> 0x005f }
        r6 = 1;	 Catch:{ all -> 0x005f }
        r7 = 1;	 Catch:{ all -> 0x005f }
        r8 = 0;	 Catch:{ all -> 0x005f }
        r9 = 0;	 Catch:{ all -> 0x005f }
        r10 = 0;	 Catch:{ all -> 0x005f }
        r11 = 0;	 Catch:{ all -> 0x005f }
        r4 = r2;	 Catch:{ all -> 0x005f }
        r12 = r13;	 Catch:{ all -> 0x005f }
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x005f }
        r4 = new org.joda.time.chrono.EthiopicChronology;	 Catch:{ all -> 0x005f }
        r13 = org.joda.time.chrono.LimitChronology.m71221a(r13, r2, r3);	 Catch:{ all -> 0x005f }
        r4.<init>(r13, r3, r14);	 Catch:{ all -> 0x005f }
        goto L_0x005a;	 Catch:{ all -> 0x005f }
    L_0x004b:
        r2 = org.joda.time.DateTimeZone.f8461a;	 Catch:{ all -> 0x005f }
        r2 = m71676a(r2, r14);	 Catch:{ all -> 0x005f }
        r4 = new org.joda.time.chrono.EthiopicChronology;	 Catch:{ all -> 0x005f }
        r13 = org.joda.time.chrono.ZonedChronology.m71234a(r2, r13);	 Catch:{ all -> 0x005f }
        r4.<init>(r13, r3, r14);	 Catch:{ all -> 0x005f }
    L_0x005a:
        r0[r1] = r4;	 Catch:{ all -> 0x005f }
        r2 = r4;	 Catch:{ all -> 0x005f }
    L_0x005d:
        monitor-exit(r0);	 Catch:{ all -> 0x005f }
        goto L_0x0062;	 Catch:{ all -> 0x005f }
    L_0x005f:
        r13 = move-exception;	 Catch:{ all -> 0x005f }
        monitor-exit(r0);	 Catch:{ all -> 0x005f }
        throw r13;
    L_0x0062:
        return r2;
    L_0x0063:
        r13 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Invalid min days in first week: ";
        r0.append(r1);
        r0.append(r14);
        r14 = r0.toString();
        r13.<init>(r14);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.EthiopicChronology.a(org.joda.time.DateTimeZone, int):org.joda.time.chrono.EthiopicChronology");
    }

    EthiopicChronology(C19304a c19304a, Object obj, int i) {
        super(c19304a, obj, i);
    }

    private Object readResolve() {
        C19304a L = m70691L();
        return m71676a(L == null ? DateTimeZone.f8461a : L.mo14710a(), mo14801N());
    }

    /* renamed from: b */
    public C19304a mo14712b() {
        return f62357c;
    }

    /* renamed from: a */
    public C19304a mo14711a(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        if (dateTimeZone == mo14710a()) {
            return this;
        }
        return m71677b(dateTimeZone);
    }

    /* renamed from: j */
    boolean mo14870j(long j) {
        return (mo14515u().mo14524a(j) != 6 || mo14478C().mo14543b(j) == null) ? 0 : 1;
    }

    /* renamed from: g */
    long mo14878g(int i) {
        int i2 = i - 1963;
        if (i2 <= 0) {
            i = (i2 + 3) >> 2;
        } else {
            int i3 = i2 >> 2;
            i = mo14866e(i) == 0 ? i3 + 1 : i3;
        }
        return (((((long) i2) * 365) + ((long) i)) * 86400000) + 21859200000L;
    }

    /* renamed from: a */
    protected void mo14802a(C19307a c19307a) {
        if (m70691L() == null) {
            super.mo14802a(c19307a);
            c19307a.f60114E = new SkipDateTimeField(this, c19307a.f60114E);
            c19307a.f60111B = new SkipDateTimeField(this, c19307a.f60111B);
            c19307a.f60118I = f62355a;
            c19307a.f60113D = new C19791c(this, 13);
            c19307a.f60127i = c19307a.f60113D.mo14548d();
        }
    }
}
