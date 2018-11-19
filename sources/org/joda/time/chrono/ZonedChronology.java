package org.joda.time.chrono;

import com.google.android.exoplayer2.Format;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.AssembledChronology.C19307a;
import org.joda.time.field.BaseDurationField;
import org.joda.time.field.C19482a;

public final class ZonedChronology extends AssembledChronology {
    private static final long serialVersionUID = -1079258847191166848L;

    static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        /* renamed from: a */
        final C19306c f61388a;
        /* renamed from: b */
        final boolean f61389b;
        /* renamed from: c */
        final DateTimeZone f61390c;

        ZonedDurationField(C19306c c19306c, DateTimeZone dateTimeZone) {
            super(c19306c.mo14521a());
            if (c19306c.mo14522b()) {
                this.f61388a = c19306c;
                this.f61389b = ZonedChronology.m71235a(c19306c);
                this.f61390c = dateTimeZone;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: c */
        public boolean mo14560c() {
            if (this.f61389b) {
                return this.f61388a.mo14560c();
            }
            return this.f61388a.mo14560c() && this.f61390c.f();
        }

        /* renamed from: d */
        public long mo14561d() {
            return this.f61388a.mo14561d();
        }

        /* renamed from: a */
        public long mo14558a(long j, int i) {
            int a = m70749a(j);
            j = this.f61388a.mo14558a(j + ((long) a), i);
            if (this.f61389b == 0) {
                a = m70750b(j);
            }
            return j - ((long) a);
        }

        /* renamed from: a */
        public long mo14559a(long j, long j2) {
            int a = m70749a(j);
            j = this.f61388a.mo14559a(j + ((long) a), j2);
            if (this.f61389b == null) {
                a = m70750b(j);
            }
            return j - ((long) a);
        }

        /* renamed from: c */
        public int mo14523c(long j, long j2) {
            int a = m70749a(j2);
            return this.f61388a.mo14523c(j + ((long) (this.f61389b ? a : m70749a(j))), j2 + ((long) a));
        }

        /* renamed from: d */
        public long mo14562d(long j, long j2) {
            int a = m70749a(j2);
            return this.f61388a.mo14562d(j + ((long) (this.f61389b ? a : m70749a(j))), j2 + ((long) a));
        }

        /* renamed from: a */
        private int m70749a(long j) {
            int b = this.f61390c.b(j);
            long j2 = (long) b;
            if ((j ^ (j + j2)) >= 0 || (j ^ j2) < 0) {
                return b;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        /* renamed from: b */
        private int m70750b(long j) {
            int e = this.f61390c.e(j);
            long j2 = (long) e;
            if ((j ^ (j - j2)) >= 0 || (j ^ j2) >= 0) {
                return e;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZonedDurationField)) {
                return false;
            }
            ZonedDurationField zonedDurationField = (ZonedDurationField) obj;
            if (!this.f61388a.equals(zonedDurationField.f61388a) || this.f61390c.equals(zonedDurationField.f61390c) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.f61388a.hashCode() ^ this.f61390c.hashCode();
        }
    }

    /* renamed from: org.joda.time.chrono.ZonedChronology$a */
    static final class C19626a extends C19482a {
        /* renamed from: a */
        final C19305b f61391a;
        /* renamed from: b */
        final DateTimeZone f61392b;
        /* renamed from: c */
        final C19306c f61393c;
        /* renamed from: d */
        final boolean f61394d;
        /* renamed from: e */
        final C19306c f61395e;
        /* renamed from: f */
        final C19306c f61396f;

        C19626a(C19305b c19305b, DateTimeZone dateTimeZone, C19306c c19306c, C19306c c19306c2, C19306c c19306c3) {
            super(c19305b.mo14534a());
            if (c19305b.mo14546c()) {
                this.f61391a = c19305b;
                this.f61392b = dateTimeZone;
                this.f61393c = c19306c;
                this.f61394d = ZonedChronology.m71235a(c19306c);
                this.f61395e = c19306c2;
                this.f61396f = c19306c3;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: a */
        public int mo14524a(long j) {
            return this.f61391a.mo14524a(this.f61392b.f(j));
        }

        /* renamed from: a */
        public String mo14532a(long j, Locale locale) {
            return this.f61391a.mo14532a(this.f61392b.f(j), locale);
        }

        /* renamed from: b */
        public String mo14541b(long j, Locale locale) {
            return this.f61391a.mo14541b(this.f61392b.f(j), locale);
        }

        /* renamed from: a */
        public String mo14531a(int i, Locale locale) {
            return this.f61391a.mo14531a(i, locale);
        }

        /* renamed from: b */
        public String mo14540b(int i, Locale locale) {
            return this.f61391a.mo14540b(i, locale);
        }

        /* renamed from: a */
        public long mo14528a(long j, int i) {
            if (this.f61394d) {
                long j2 = (long) m70757j(j);
                return this.f61391a.mo14528a(j + j2, i) - j2;
            }
            return this.f61392b.a(this.f61391a.mo14528a(this.f61392b.f(j), i), false, j);
        }

        /* renamed from: a */
        public long mo14529a(long j, long j2) {
            if (this.f61394d) {
                long j3 = (long) m70757j(j);
                return this.f61391a.mo14529a(j + j3, j2) - j3;
            }
            return this.f61392b.a(this.f61391a.mo14529a(this.f61392b.f(j), j2), false, j);
        }

        /* renamed from: b */
        public long mo14538b(long j, int i) {
            long b = this.f61391a.mo14538b(this.f61392b.f(j), i);
            j = this.f61392b.a(b, false, j);
            if (mo14524a(j) == i) {
                return j;
            }
            j = new IllegalInstantException(b, this.f61392b.e());
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(this.f61391a.mo14534a(), Integer.valueOf(i), j.getMessage());
            illegalFieldValueException.initCause(j);
            throw illegalFieldValueException;
        }

        /* renamed from: a */
        public long mo14530a(long j, String str, Locale locale) {
            return this.f61392b.a(this.f61391a.mo14530a(this.f61392b.f(j), str, locale), false, j);
        }

        /* renamed from: b */
        public int mo14535b(long j, long j2) {
            int j3 = m70757j(j2);
            return this.f61391a.mo14535b(j + ((long) (this.f61394d ? j3 : m70757j(j))), j2 + ((long) j3));
        }

        /* renamed from: c */
        public long mo14545c(long j, long j2) {
            int j3 = m70757j(j2);
            return this.f61391a.mo14545c(j + ((long) (this.f61394d ? j3 : m70757j(j))), j2 + ((long) j3));
        }

        /* renamed from: d */
        public final C19306c mo14548d() {
            return this.f61393c;
        }

        /* renamed from: e */
        public final C19306c mo14550e() {
            return this.f61395e;
        }

        /* renamed from: b */
        public boolean mo14543b(long j) {
            return this.f61391a.mo14543b(this.f61392b.f(j));
        }

        /* renamed from: f */
        public final C19306c mo14552f() {
            return this.f61396f;
        }

        /* renamed from: d */
        public long mo14547d(long j) {
            if (this.f61394d) {
                long j2 = (long) m70757j(j);
                return this.f61391a.mo14547d(j + j2) - j2;
            }
            return this.f61392b.a(this.f61391a.mo14547d(this.f61392b.f(j)), false, j);
        }

        /* renamed from: e */
        public long mo14549e(long j) {
            if (this.f61394d) {
                long j2 = (long) m70757j(j);
                return this.f61391a.mo14549e(j + j2) - j2;
            }
            return this.f61392b.a(this.f61391a.mo14549e(this.f61392b.f(j)), false, j);
        }

        /* renamed from: i */
        public long mo14557i(long j) {
            return this.f61391a.mo14557i(this.f61392b.f(j));
        }

        /* renamed from: g */
        public int mo14553g() {
            return this.f61391a.mo14553g();
        }

        /* renamed from: a */
        public int mo14526a(ReadablePartial readablePartial) {
            return this.f61391a.mo14526a(readablePartial);
        }

        /* renamed from: a */
        public int mo14527a(ReadablePartial readablePartial, int[] iArr) {
            return this.f61391a.mo14527a(readablePartial, iArr);
        }

        /* renamed from: h */
        public int mo14555h() {
            return this.f61391a.mo14555h();
        }

        /* renamed from: c */
        public int mo14544c(long j) {
            return this.f61391a.mo14544c(this.f61392b.f(j));
        }

        /* renamed from: b */
        public int mo14536b(ReadablePartial readablePartial) {
            return this.f61391a.mo14536b(readablePartial);
        }

        /* renamed from: b */
        public int mo14537b(ReadablePartial readablePartial, int[] iArr) {
            return this.f61391a.mo14537b(readablePartial, iArr);
        }

        /* renamed from: a */
        public int mo14525a(Locale locale) {
            return this.f61391a.mo14525a(locale);
        }

        /* renamed from: j */
        private int m70757j(long j) {
            int b = this.f61392b.b(j);
            long j2 = (long) b;
            if ((j ^ (j + j2)) >= 0 || (j ^ j2) < 0) {
                return b;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19626a)) {
                return false;
            }
            C19626a c19626a = (C19626a) obj;
            if (!this.f61391a.equals(c19626a.f61391a) || !this.f61392b.equals(c19626a.f61392b) || !this.f61393c.equals(c19626a.f61393c) || this.f61395e.equals(c19626a.f61395e) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.f61391a.hashCode() ^ this.f61392b.hashCode();
        }
    }

    /* renamed from: a */
    public static ZonedChronology m71234a(C19304a c19304a, DateTimeZone dateTimeZone) {
        if (c19304a == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        c19304a = c19304a.mo14712b();
        if (c19304a == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        } else if (dateTimeZone != null) {
            return new ZonedChronology(c19304a, dateTimeZone);
        } else {
            throw new IllegalArgumentException("DateTimeZone must not be null");
        }
    }

    /* renamed from: a */
    static boolean m71235a(C19306c c19306c) {
        return (c19306c == null || c19306c.mo14561d() >= 43200000) ? null : true;
    }

    private ZonedChronology(C19304a c19304a, DateTimeZone dateTimeZone) {
        super(c19304a, dateTimeZone);
    }

    /* renamed from: a */
    public DateTimeZone mo14710a() {
        return (DateTimeZone) m70692M();
    }

    /* renamed from: b */
    public C19304a mo14712b() {
        return m70691L();
    }

    /* renamed from: a */
    public C19304a mo14711a(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        if (dateTimeZone == m70692M()) {
            return this;
        }
        if (dateTimeZone == DateTimeZone.f8461a) {
            return m70691L();
        }
        return new ZonedChronology(m70691L(), dateTimeZone);
    }

    /* renamed from: a */
    public long mo14487a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return m71231a(m70691L().mo14487a(i, i2, i3, i4));
    }

    /* renamed from: a */
    public long mo14488a(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return m71231a(m70691L().mo14488a(i, i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: a */
    public long mo14489a(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return m71231a(m70691L().mo14489a(j + ((long) mo14710a().b(j)), i, i2, i3, i4));
    }

    /* renamed from: a */
    private long m71231a(long j) {
        if (j == Format.OFFSET_SAMPLE_RELATIVE) {
            return Format.OFFSET_SAMPLE_RELATIVE;
        }
        if (j == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        DateTimeZone a = mo14710a();
        int e = a.e(j);
        long j2 = j - ((long) e);
        if (j > 604800000 && j2 < 0) {
            return Format.OFFSET_SAMPLE_RELATIVE;
        }
        if (j < -604800000 && j2 > 0) {
            return Long.MIN_VALUE;
        }
        if (e == a.b(j2)) {
            return j2;
        }
        throw new IllegalInstantException(j, a.e());
    }

    /* renamed from: a */
    protected void mo14802a(C19307a c19307a) {
        HashMap hashMap = new HashMap();
        c19307a.f60130l = m71233a(c19307a.f60130l, hashMap);
        c19307a.f60129k = m71233a(c19307a.f60129k, hashMap);
        c19307a.f60128j = m71233a(c19307a.f60128j, hashMap);
        c19307a.f60127i = m71233a(c19307a.f60127i, hashMap);
        c19307a.f60126h = m71233a(c19307a.f60126h, hashMap);
        c19307a.f60125g = m71233a(c19307a.f60125g, hashMap);
        c19307a.f60124f = m71233a(c19307a.f60124f, hashMap);
        c19307a.f60123e = m71233a(c19307a.f60123e, hashMap);
        c19307a.f60122d = m71233a(c19307a.f60122d, hashMap);
        c19307a.f60121c = m71233a(c19307a.f60121c, hashMap);
        c19307a.f60120b = m71233a(c19307a.f60120b, hashMap);
        c19307a.f60119a = m71233a(c19307a.f60119a, hashMap);
        c19307a.f60114E = m71232a(c19307a.f60114E, hashMap);
        c19307a.f60115F = m71232a(c19307a.f60115F, hashMap);
        c19307a.f60116G = m71232a(c19307a.f60116G, hashMap);
        c19307a.f60117H = m71232a(c19307a.f60117H, hashMap);
        c19307a.f60118I = m71232a(c19307a.f60118I, hashMap);
        c19307a.f60142x = m71232a(c19307a.f60142x, hashMap);
        c19307a.f60143y = m71232a(c19307a.f60143y, hashMap);
        c19307a.f60144z = m71232a(c19307a.f60144z, hashMap);
        c19307a.f60113D = m71232a(c19307a.f60113D, hashMap);
        c19307a.f60110A = m71232a(c19307a.f60110A, hashMap);
        c19307a.f60111B = m71232a(c19307a.f60111B, hashMap);
        c19307a.f60112C = m71232a(c19307a.f60112C, hashMap);
        c19307a.f60131m = m71232a(c19307a.f60131m, hashMap);
        c19307a.f60132n = m71232a(c19307a.f60132n, hashMap);
        c19307a.f60133o = m71232a(c19307a.f60133o, hashMap);
        c19307a.f60134p = m71232a(c19307a.f60134p, hashMap);
        c19307a.f60135q = m71232a(c19307a.f60135q, hashMap);
        c19307a.f60136r = m71232a(c19307a.f60136r, hashMap);
        c19307a.f60137s = m71232a(c19307a.f60137s, hashMap);
        c19307a.f60139u = m71232a(c19307a.f60139u, hashMap);
        c19307a.f60138t = m71232a(c19307a.f60138t, hashMap);
        c19307a.f60140v = m71232a(c19307a.f60140v, hashMap);
        c19307a.f60141w = m71232a(c19307a.f60141w, hashMap);
    }

    /* renamed from: a */
    private C19306c m71233a(C19306c c19306c, HashMap<Object, Object> hashMap) {
        if (c19306c != null) {
            if (c19306c.mo14522b()) {
                if (hashMap.containsKey(c19306c)) {
                    return (C19306c) hashMap.get(c19306c);
                }
                C19306c zonedDurationField = new ZonedDurationField(c19306c, mo14710a());
                hashMap.put(c19306c, zonedDurationField);
                return zonedDurationField;
            }
        }
        return c19306c;
    }

    /* renamed from: a */
    private C19305b m71232a(C19305b c19305b, HashMap<Object, Object> hashMap) {
        if (c19305b != null) {
            if (c19305b.mo14546c()) {
                if (hashMap.containsKey(c19305b)) {
                    return (C19305b) hashMap.get(c19305b);
                }
                C19305b c19626a = new C19626a(c19305b, mo14710a(), m71233a(c19305b.mo14548d(), (HashMap) hashMap), m71233a(c19305b.mo14550e(), (HashMap) hashMap), m71233a(c19305b.mo14552f(), (HashMap) hashMap));
                hashMap.put(c19305b, c19626a);
                return c19626a;
            }
        }
        return c19305b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        if (!m70691L().equals(zonedChronology.m70691L()) || mo14710a().equals(zonedChronology.mo14710a()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((mo14710a().hashCode() * 11) + 326565) + (m70691L().hashCode() * 7);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ZonedChronology[");
        stringBuilder.append(m70691L());
        stringBuilder.append(", ");
        stringBuilder.append(mo14710a().e());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
