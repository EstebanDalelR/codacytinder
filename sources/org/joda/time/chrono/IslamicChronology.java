package org.joda.time.chrono;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology.C19307a;

public final class IslamicChronology extends BasicChronology {
    /* renamed from: a */
    public static final LeapYearPatternType f62153a = new LeapYearPatternType(0, 623158436);
    /* renamed from: b */
    public static final LeapYearPatternType f62154b = new LeapYearPatternType(1, 623191204);
    /* renamed from: c */
    public static final LeapYearPatternType f62155c = new LeapYearPatternType(2, 690562340);
    /* renamed from: d */
    public static final LeapYearPatternType f62156d = new LeapYearPatternType(3, 153692453);
    /* renamed from: e */
    private static final C19305b f62157e = new C19627d("AH");
    /* renamed from: f */
    private static final ConcurrentHashMap<DateTimeZone, IslamicChronology[]> f62158f = new ConcurrentHashMap();
    /* renamed from: g */
    private static final IslamicChronology f62159g = m71515b(DateTimeZone.f8461a);
    private static final long serialVersionUID = -3663823829888L;
    /* renamed from: h */
    private final LeapYearPatternType f62160h;

    public static class LeapYearPatternType implements Serializable {
        private static final long serialVersionUID = 26581275372698L;
        /* renamed from: a */
        final byte f60148a;
        /* renamed from: b */
        final int f60149b;

        LeapYearPatternType(int i, int i2) {
            this.f60148a = (byte) i;
            this.f60149b = i2;
        }

        /* renamed from: a */
        boolean m69045a(int i) {
            if (((1 << (i % 30)) & this.f60149b) > 0) {
                return true;
            }
            return false;
        }

        private Object readResolve() {
            switch (this.f60148a) {
                case (byte) 0:
                    return IslamicChronology.f62153a;
                case (byte) 1:
                    return IslamicChronology.f62154b;
                case (byte) 2:
                    return IslamicChronology.f62155c;
                case (byte) 3:
                    return IslamicChronology.f62156d;
                default:
                    return this;
            }
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof LeapYearPatternType)) {
                return false;
            }
            if (this.f60148a == ((LeapYearPatternType) obj).f60148a) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return this.f60148a;
        }
    }

    /* renamed from: O */
    int mo14871O() {
        return 355;
    }

    /* renamed from: P */
    int mo14855P() {
        return 30;
    }

    /* renamed from: Q */
    int mo14872Q() {
        return 1;
    }

    /* renamed from: R */
    int mo14873R() {
        return 292271022;
    }

    /* renamed from: T */
    long mo14857T() {
        return 30617280288L;
    }

    /* renamed from: U */
    long mo14858U() {
        return 15308640144L;
    }

    /* renamed from: V */
    long mo14859V() {
        return 2551440384L;
    }

    /* renamed from: W */
    long mo14874W() {
        return 21260793600000L;
    }

    /* renamed from: Z */
    public static IslamicChronology m71513Z() {
        return f62159g;
    }

    public static IslamicChronology aa() {
        return m71514a(DateTimeZone.a(), f62154b);
    }

    /* renamed from: b */
    public static IslamicChronology m71515b(DateTimeZone dateTimeZone) {
        return m71514a(dateTimeZone, f62154b);
    }

    /* renamed from: a */
    public static IslamicChronology m71514a(DateTimeZone dateTimeZone, LeapYearPatternType leapYearPatternType) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        IslamicChronology[] islamicChronologyArr = (IslamicChronology[]) f62158f.get(dateTimeZone);
        if (islamicChronologyArr == null) {
            islamicChronologyArr = new IslamicChronology[4];
            IslamicChronology[] islamicChronologyArr2 = (IslamicChronology[]) f62158f.putIfAbsent(dateTimeZone, islamicChronologyArr);
            if (islamicChronologyArr2 != null) {
                islamicChronologyArr = islamicChronologyArr2;
            }
        }
        IslamicChronology islamicChronology = islamicChronologyArr[leapYearPatternType.f60148a];
        if (islamicChronology == null) {
            synchronized (islamicChronologyArr) {
                islamicChronology = islamicChronologyArr[leapYearPatternType.f60148a];
                if (islamicChronology == null) {
                    IslamicChronology islamicChronology2;
                    if (dateTimeZone == DateTimeZone.f8461a) {
                        dateTimeZone = new IslamicChronology(null, null, leapYearPatternType);
                        islamicChronology2 = new IslamicChronology(LimitChronology.m71221a(dateTimeZone, new DateTime(1, 1, 1, 0, 0, 0, 0, dateTimeZone), null), null, leapYearPatternType);
                    } else {
                        islamicChronology2 = new IslamicChronology(ZonedChronology.m71234a(m71514a(DateTimeZone.f8461a, leapYearPatternType), dateTimeZone), null, leapYearPatternType);
                    }
                    islamicChronologyArr[leapYearPatternType.f60148a] = islamicChronology2;
                    islamicChronology = islamicChronology2;
                }
            }
        }
        return islamicChronology;
    }

    IslamicChronology(C19304a c19304a, Object obj, LeapYearPatternType leapYearPatternType) {
        super(c19304a, obj, 4);
        this.f62160h = leapYearPatternType;
    }

    private Object readResolve() {
        C19304a L = m70691L();
        return L == null ? m71513Z() : m71515b(L.mo14710a());
    }

    public LeapYearPatternType ab() {
        return this.f62160h;
    }

    /* renamed from: b */
    public C19304a mo14712b() {
        return f62159g;
    }

    /* renamed from: a */
    public C19304a mo14711a(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        if (dateTimeZone == mo14710a()) {
            return this;
        }
        return m71515b(dateTimeZone);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IslamicChronology)) {
            return false;
        }
        if (ab().f60148a != ((IslamicChronology) obj).ab().f60148a || super.equals(obj) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (super.hashCode() * 13) + ab().hashCode();
    }

    /* renamed from: a */
    int mo14876a(long j) {
        long j2 = j - -42521587200000L;
        long j3 = j2 / 918518400000L;
        j2 %= 918518400000L;
        j = (int) ((j3 * 30) + 1);
        long j4 = mo14866e(j) ? 30672000000L : 30585600000L;
        while (j2 >= j4) {
            long j5 = j2 - j4;
            j++;
            j4 = mo14866e(j) ? 30672000000L : 30585600000L;
            j2 = j5;
        }
        return j;
    }

    /* renamed from: f */
    long mo14868f(long j, int i) {
        int c = m71135c(j, mo14876a(j));
        j = m71150h(j);
        if (c > 354 && !mo14866e(i)) {
            c--;
        }
        return m71123a(i, 1, c) + ((long) j);
    }

    /* renamed from: a */
    long mo14861a(long j, long j2) {
        int a = mo14876a(j);
        int a2 = mo14876a(j2);
        a -= a2;
        if (j - m71140d(a) < j2 - m71140d(a2)) {
            a--;
        }
        return (long) a;
    }

    /* renamed from: c */
    long mo14865c(int i, int i2) {
        i2--;
        if (i2 % 2 == 1) {
            return (((long) (i2 / 2)) * 802632704) + 2592000000L;
        }
        return ((long) (i2 / 2)) * 802632704;
    }

    /* renamed from: c */
    int mo14864c(long j) {
        j = m71138d(j) - 1;
        if (j == 354) {
            return 30;
        }
        return ((j % 59) % 30) + 1;
    }

    /* renamed from: e */
    boolean mo14866e(int i) {
        return this.f62160h.m69045a(i);
    }

    /* renamed from: a */
    int mo14875a(int i) {
        return mo14866e(i) != 0 ? 355 : 354;
    }

    /* renamed from: b */
    int mo14862b(int i, int i2) {
        int i3 = 30;
        if (i2 == 12 && mo14866e(i) != 0) {
            return 30;
        }
        if ((i2 - 1) % 2 != 0) {
            i3 = 29;
        }
        return i3;
    }

    /* renamed from: f */
    int mo14867f(int i) {
        int i2 = 30;
        if (i == 12) {
            return 30;
        }
        if ((i - 1) % 2 != 0) {
            i2 = 29;
        }
        return i2;
    }

    /* renamed from: a */
    int mo14860a(long j, int i) {
        j = (int) ((j - m71140d(i)) / 86400000);
        if (j == 354) {
            return 12;
        }
        return ((j * 2) / 59) + 1;
    }

    /* renamed from: g */
    long mo14878g(int i) {
        StringBuilder stringBuilder;
        if (i > 292271022) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Year is too large: ");
            stringBuilder.append(i);
            stringBuilder.append(" > ");
            stringBuilder.append(292271022);
            throw new ArithmeticException(stringBuilder.toString());
        } else if (i < -292269337) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Year is too small: ");
            stringBuilder.append(i);
            stringBuilder.append(" < ");
            stringBuilder.append(-292269337);
            throw new ArithmeticException(stringBuilder.toString());
        } else {
            i--;
            long j = (((long) (i / 30)) * 918518400000L) - 42521587200000L;
            int i2 = 1;
            i = (i % 30) + 1;
            while (i2 < i) {
                long j2 = mo14866e(i2) ? 30672000000L : 30585600000L;
                i2++;
                j += j2;
            }
            return j;
        }
    }

    /* renamed from: a */
    protected void mo14802a(C19307a c19307a) {
        if (m70691L() == null) {
            super.mo14802a(c19307a);
            c19307a.f60118I = f62157e;
            c19307a.f60113D = new C19791c(this, 12);
            c19307a.f60127i = c19307a.f60113D.mo14548d();
        }
    }
}
