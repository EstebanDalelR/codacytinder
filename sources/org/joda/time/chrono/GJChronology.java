package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.AssembledChronology.C19307a;
import org.joda.time.field.C19482a;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.C19316b;
import org.joda.time.format.C19322g;

public final class GJChronology extends AssembledChronology {
    /* renamed from: a */
    static final Instant f61900a = new Instant(-12219292800000L);
    /* renamed from: b */
    private static final ConcurrentHashMap<C19309h, GJChronology> f61901b = new ConcurrentHashMap();
    private static final long serialVersionUID = -2545574827706931671L;
    /* renamed from: c */
    private JulianChronology f61902c;
    /* renamed from: d */
    private GregorianChronology f61903d;
    /* renamed from: e */
    private Instant f61904e;
    /* renamed from: f */
    private long f61905f;
    /* renamed from: g */
    private long f61906g;

    /* renamed from: org.joda.time.chrono.GJChronology$a */
    private class C19625a extends C19482a {
        /* renamed from: a */
        final C19305b f61381a;
        /* renamed from: b */
        final C19305b f61382b;
        /* renamed from: c */
        final long f61383c;
        /* renamed from: d */
        final boolean f61384d;
        /* renamed from: e */
        protected C19306c f61385e;
        /* renamed from: f */
        protected C19306c f61386f;
        /* renamed from: g */
        final /* synthetic */ GJChronology f61387g;

        C19625a(GJChronology gJChronology, C19305b c19305b, C19305b c19305b2, long j) {
            this(gJChronology, c19305b, c19305b2, j, false);
        }

        C19625a(GJChronology gJChronology, C19305b c19305b, C19305b c19305b2, long j, boolean z) {
            this(gJChronology, c19305b, c19305b2, null, j, z);
        }

        C19625a(GJChronology gJChronology, C19305b c19305b, C19305b c19305b2, C19306c c19306c, long j, boolean z) {
            this.f61387g = gJChronology;
            super(c19305b2.mo14534a());
            this.f61381a = c19305b;
            this.f61382b = c19305b2;
            this.f61383c = j;
            this.f61384d = z;
            this.f61385e = c19305b2.mo14548d();
            if (c19306c == null) {
                c19306c = c19305b2.mo14550e();
                if (c19306c == null) {
                    c19306c = c19305b.mo14550e();
                }
            }
            this.f61386f = c19306c;
        }

        /* renamed from: a */
        public int mo14524a(long j) {
            if (j >= this.f61383c) {
                return this.f61382b.mo14524a(j);
            }
            return this.f61381a.mo14524a(j);
        }

        /* renamed from: a */
        public String mo14532a(long j, Locale locale) {
            if (j >= this.f61383c) {
                return this.f61382b.mo14532a(j, locale);
            }
            return this.f61381a.mo14532a(j, locale);
        }

        /* renamed from: a */
        public String mo14531a(int i, Locale locale) {
            return this.f61382b.mo14531a(i, locale);
        }

        /* renamed from: b */
        public String mo14541b(long j, Locale locale) {
            if (j >= this.f61383c) {
                return this.f61382b.mo14541b(j, locale);
            }
            return this.f61381a.mo14541b(j, locale);
        }

        /* renamed from: b */
        public String mo14540b(int i, Locale locale) {
            return this.f61382b.mo14540b(i, locale);
        }

        /* renamed from: a */
        public long mo14528a(long j, int i) {
            return this.f61382b.mo14528a(j, i);
        }

        /* renamed from: a */
        public long mo14529a(long j, long j2) {
            return this.f61382b.mo14529a(j, j2);
        }

        /* renamed from: b */
        public int mo14535b(long j, long j2) {
            return this.f61382b.mo14535b(j, j2);
        }

        /* renamed from: c */
        public long mo14545c(long j, long j2) {
            return this.f61382b.mo14545c(j, j2);
        }

        /* renamed from: b */
        public long mo14538b(long j, int i) {
            if (j >= this.f61383c) {
                j = this.f61382b.mo14538b(j, i);
                if (j < this.f61383c) {
                    if (j + this.f61387g.f61906g < this.f61383c) {
                        j = m70748k(j);
                    }
                    if (mo14524a(j) != i) {
                        throw new IllegalFieldValueException(this.f61382b.mo14534a(), Integer.valueOf(i), null, null);
                    }
                }
            }
            j = this.f61381a.mo14538b(j, i);
            if (j >= this.f61383c) {
                if (j - this.f61387g.f61906g >= this.f61383c) {
                    j = m70747j(j);
                }
                if (mo14524a(j) != i) {
                    throw new IllegalFieldValueException(this.f61381a.mo14534a(), Integer.valueOf(i), null, null);
                }
            }
            return j;
        }

        /* renamed from: a */
        public long mo14530a(long j, String str, Locale locale) {
            if (j >= this.f61383c) {
                j = this.f61382b.mo14530a(j, str, locale);
                if (j >= this.f61383c || j + this.f61387g.f61906g >= this.f61383c) {
                    return j;
                }
                return m70748k(j);
            }
            j = this.f61381a.mo14530a(j, str, locale);
            return (j < this.f61383c || j - this.f61387g.f61906g < this.f61383c) ? j : m70747j(j);
        }

        /* renamed from: d */
        public C19306c mo14548d() {
            return this.f61385e;
        }

        /* renamed from: e */
        public C19306c mo14550e() {
            return this.f61386f;
        }

        /* renamed from: b */
        public boolean mo14543b(long j) {
            if (j >= this.f61383c) {
                return this.f61382b.mo14543b(j);
            }
            return this.f61381a.mo14543b(j);
        }

        /* renamed from: f */
        public C19306c mo14552f() {
            return this.f61382b.mo14552f();
        }

        /* renamed from: g */
        public int mo14553g() {
            return this.f61381a.mo14553g();
        }

        /* renamed from: a */
        public int mo14526a(ReadablePartial readablePartial) {
            return this.f61381a.mo14526a(readablePartial);
        }

        /* renamed from: a */
        public int mo14527a(ReadablePartial readablePartial, int[] iArr) {
            return this.f61381a.mo14527a(readablePartial, iArr);
        }

        /* renamed from: h */
        public int mo14555h() {
            return this.f61382b.mo14555h();
        }

        /* renamed from: c */
        public int mo14544c(long j) {
            if (j >= this.f61383c) {
                return this.f61382b.mo14544c(j);
            }
            int c = this.f61381a.mo14544c(j);
            if (this.f61381a.mo14538b(j, c) >= this.f61383c) {
                c = this.f61381a.mo14524a(this.f61381a.mo14528a(this.f61383c, -1));
            }
            return c;
        }

        /* renamed from: b */
        public int mo14536b(ReadablePartial readablePartial) {
            return mo14544c(GJChronology.m71168N().mo14496b(readablePartial, 0));
        }

        /* renamed from: b */
        public int mo14537b(ReadablePartial readablePartial, int[] iArr) {
            C19304a N = GJChronology.m71168N();
            int size = readablePartial.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                C19305b a = readablePartial.getFieldType(i).mo14453a(N);
                if (iArr[i] <= a.mo14544c(j)) {
                    j = a.mo14538b(j, iArr[i]);
                }
            }
            return mo14544c(j);
        }

        /* renamed from: d */
        public long mo14547d(long j) {
            if (j < this.f61383c) {
                return this.f61381a.mo14547d(j);
            }
            j = this.f61382b.mo14547d(j);
            if (j >= this.f61383c || j + this.f61387g.f61906g >= this.f61383c) {
                return j;
            }
            return m70748k(j);
        }

        /* renamed from: e */
        public long mo14549e(long j) {
            if (j >= this.f61383c) {
                return this.f61382b.mo14549e(j);
            }
            j = this.f61381a.mo14549e(j);
            return (j < this.f61383c || j - this.f61387g.f61906g < this.f61383c) ? j : m70747j(j);
        }

        /* renamed from: a */
        public int mo14525a(Locale locale) {
            return Math.max(this.f61381a.mo14525a(locale), this.f61382b.mo14525a(locale));
        }

        /* renamed from: j */
        protected long m70747j(long j) {
            if (this.f61384d) {
                return this.f61387g.m71186c(j);
            }
            return this.f61387g.m71180a(j);
        }

        /* renamed from: k */
        protected long m70748k(long j) {
            if (this.f61384d) {
                return this.f61387g.m71187d(j);
            }
            return this.f61387g.m71184b(j);
        }
    }

    private static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        /* renamed from: a */
        private final C19787b f61898a;

        LinkedDurationField(C19306c c19306c, C19787b c19787b) {
            super(c19306c, c19306c.mo14521a());
            this.f61898a = c19787b;
        }

        /* renamed from: a */
        public long mo14558a(long j, int i) {
            return this.f61898a.mo14528a(j, i);
        }

        /* renamed from: a */
        public long mo14559a(long j, long j2) {
            return this.f61898a.mo14529a(j, j2);
        }

        /* renamed from: c */
        public int mo14523c(long j, long j2) {
            return this.f61898a.mo14535b(j, j2);
        }

        /* renamed from: d */
        public long mo14562d(long j, long j2) {
            return this.f61898a.mo14545c(j, j2);
        }
    }

    /* renamed from: org.joda.time.chrono.GJChronology$b */
    private final class C19787b extends C19625a {
        /* renamed from: h */
        final /* synthetic */ GJChronology f61899h;

        C19787b(GJChronology gJChronology, C19305b c19305b, C19305b c19305b2, long j) {
            this(gJChronology, c19305b, c19305b2, null, j, false);
        }

        C19787b(GJChronology gJChronology, C19305b c19305b, C19305b c19305b2, C19306c c19306c, long j) {
            this(gJChronology, c19305b, c19305b2, c19306c, j, false);
        }

        C19787b(GJChronology gJChronology, C19305b c19305b, C19305b c19305b2, C19306c c19306c, C19306c c19306c2, long j) {
            this(gJChronology, c19305b, c19305b2, c19306c, j, false);
            this.f = c19306c2;
        }

        C19787b(GJChronology gJChronology, C19305b c19305b, C19305b c19305b2, C19306c c19306c, long j, boolean z) {
            this.f61899h = gJChronology;
            super(gJChronology, c19305b, c19305b2, j, z);
            if (c19306c == null) {
                c19306c = new LinkedDurationField(this.e, this);
            }
            this.e = c19306c;
        }

        /* renamed from: a */
        public long mo14528a(long j, int i) {
            if (j >= this.c) {
                j = this.b.mo14528a(j, i);
                if (j >= this.c || j + this.f61899h.f61906g >= this.c) {
                    return j;
                }
                if (this.d != 0) {
                    if (this.f61899h.f61903d.mo14520z().mo14524a(j) <= 0) {
                        j = this.f61899h.f61903d.mo14520z().mo14528a(j, -1);
                    }
                } else if (this.f61899h.f61903d.mo14480E().mo14524a(j) <= 0) {
                    j = this.f61899h.f61903d.mo14480E().mo14528a(j, -1);
                }
                return m70748k(j);
            }
            j = this.a.mo14528a(j, i);
            return (j < this.c || j - this.f61899h.f61906g < this.c) ? j : m70747j(j);
        }

        /* renamed from: a */
        public long mo14529a(long j, long j2) {
            if (j >= this.c) {
                j = this.b.mo14529a(j, j2);
                if (j >= this.c || j + this.f61899h.f61906g >= this.c) {
                    return j;
                }
                if (this.d != null) {
                    if (this.f61899h.f61903d.mo14520z().mo14524a(j) <= null) {
                        j = this.f61899h.f61903d.mo14520z().mo14528a(j, -1);
                    }
                } else if (this.f61899h.f61903d.mo14480E().mo14524a(j) <= null) {
                    j = this.f61899h.f61903d.mo14480E().mo14528a(j, -1);
                }
                return m70748k(j);
            }
            j = this.a.mo14529a(j, j2);
            return (j < this.c || j - this.f61899h.f61906g < this.c) ? j : m70747j(j);
        }

        /* renamed from: b */
        public int mo14535b(long j, long j2) {
            if (j >= this.c) {
                if (j2 >= this.c) {
                    return this.b.mo14535b(j, j2);
                }
                return this.a.mo14535b(m70748k(j), j2);
            } else if (j2 < this.c) {
                return this.a.mo14535b(j, j2);
            } else {
                return this.b.mo14535b(m70747j(j), j2);
            }
        }

        /* renamed from: c */
        public long mo14545c(long j, long j2) {
            if (j >= this.c) {
                if (j2 >= this.c) {
                    return this.b.mo14545c(j, j2);
                }
                return this.a.mo14545c(m70748k(j), j2);
            } else if (j2 < this.c) {
                return this.a.mo14545c(j, j2);
            } else {
                return this.b.mo14545c(m70747j(j), j2);
            }
        }

        /* renamed from: c */
        public int mo14544c(long j) {
            if (j >= this.c) {
                return this.b.mo14544c(j);
            }
            return this.a.mo14544c(j);
        }
    }

    /* renamed from: a */
    private static long m71170a(long j, C19304a c19304a, C19304a c19304a2) {
        return c19304a2.mo14487a(c19304a.mo14480E().mo14524a(j), c19304a.mo14478C().mo14524a(j), c19304a.mo14515u().mo14524a(j), c19304a.mo14499e().mo14524a(j));
    }

    /* renamed from: b */
    private static long m71175b(long j, C19304a c19304a, C19304a c19304a2) {
        return c19304a2.mo14499e().mo14538b(c19304a2.mo14514t().mo14538b(c19304a2.mo14518x().mo14538b(c19304a2.mo14520z().mo14538b(0, c19304a.mo14520z().mo14524a(j)), c19304a.mo14518x().mo14524a(j)), c19304a.mo14514t().mo14524a(j)), c19304a.mo14499e().mo14524a(j));
    }

    /* renamed from: N */
    public static GJChronology m71168N() {
        return m71174a(DateTimeZone.f8461a, f61900a, 4);
    }

    /* renamed from: O */
    public static GJChronology m71169O() {
        return m71174a(DateTimeZone.a(), f61900a, 4);
    }

    /* renamed from: a */
    public static GJChronology m71173a(DateTimeZone dateTimeZone, ReadableInstant readableInstant) {
        return m71174a(dateTimeZone, readableInstant, 4);
    }

    /* renamed from: a */
    public static GJChronology m71174a(DateTimeZone dateTimeZone, ReadableInstant readableInstant, int i) {
        dateTimeZone = DateTimeUtils.m68906a(dateTimeZone);
        if (readableInstant == null) {
            readableInstant = f61900a;
        } else {
            readableInstant = readableInstant.toInstant();
            if (new LocalDate(readableInstant.getMillis(), GregorianChronology.m71688b(dateTimeZone)).d() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        C19309h c19309h = new C19309h(dateTimeZone, readableInstant, i);
        GJChronology gJChronology = (GJChronology) f61901b.get(c19309h);
        if (gJChronology != null) {
            return gJChronology;
        }
        if (dateTimeZone == DateTimeZone.f8461a) {
            gJChronology = new GJChronology(JulianChronology.m71701a(dateTimeZone, i), GregorianChronology.m71687a(dateTimeZone, i), readableInstant);
        } else {
            C19304a a = m71174a(DateTimeZone.f8461a, readableInstant, i);
            gJChronology = new GJChronology(ZonedChronology.m71234a(a, dateTimeZone), a.f61902c, a.f61903d, a.f61904e);
        }
        GJChronology gJChronology2 = (GJChronology) f61901b.putIfAbsent(c19309h, gJChronology);
        return gJChronology2 != null ? gJChronology2 : gJChronology;
    }

    /* renamed from: a */
    public static GJChronology m71172a(DateTimeZone dateTimeZone, long j, int i) {
        ReadableInstant readableInstant;
        if (j == f61900a.getMillis()) {
            readableInstant = null;
        } else {
            readableInstant = new Instant(j);
        }
        return m71174a(dateTimeZone, readableInstant, i);
    }

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private GJChronology(C19304a c19304a, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(c19304a, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private Object readResolve() {
        return m71174a(mo14710a(), this.f61904e, m71177P());
    }

    /* renamed from: a */
    public DateTimeZone mo14710a() {
        C19304a L = m70691L();
        if (L != null) {
            return L.mo14710a();
        }
        return DateTimeZone.f8461a;
    }

    /* renamed from: b */
    public C19304a mo14712b() {
        return mo14711a(DateTimeZone.f8461a);
    }

    /* renamed from: a */
    public C19304a mo14711a(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.a();
        }
        if (dateTimeZone == mo14710a()) {
            return this;
        }
        return m71174a(dateTimeZone, this.f61904e, m71177P());
    }

    /* renamed from: a */
    public long mo14487a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        C19304a L = m70691L();
        if (L != null) {
            return L.mo14487a(i, i2, i3, i4);
        }
        long a = this.f61903d.mo14487a(i, i2, i3, i4);
        if (a < this.f61905f) {
            a = this.f61902c.mo14487a(i, i2, i3, i4);
            if (a >= this.f61905f) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return a;
    }

    /* renamed from: a */
    public long mo14488a(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        C19304a L = m70691L();
        if (L != null) {
            return L.mo14488a(i, i2, i3, i4, i5, i6, i7);
        }
        long a;
        int i8;
        int i9;
        try {
            a = r1.f61903d.mo14488a(i, i2, i3, i4, i5, i6, i7);
            i8 = i2;
            i9 = i3;
        } catch (IllegalFieldValueException e) {
            IllegalFieldValueException illegalFieldValueException = e;
            i8 = i2;
            if (i8 == 2) {
                i9 = i3;
                if (i9 == 29) {
                    long a2 = r1.f61903d.mo14488a(i, i8, 28, i4, i5, i6, i7);
                    if (a2 >= r1.f61905f) {
                        throw illegalFieldValueException;
                    }
                    a = a2;
                }
            }
            throw illegalFieldValueException;
        }
        if (a < r1.f61905f) {
            a = r1.f61902c.mo14488a(i, i8, i9, i4, i5, i6, i7);
            if (a >= r1.f61905f) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return a;
    }

    /* renamed from: P */
    public int m71177P() {
        return this.f61903d.mo14801N();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJChronology)) {
            return false;
        }
        GJChronology gJChronology = (GJChronology) obj;
        if (this.f61905f != gJChronology.f61905f || m71177P() != gJChronology.m71177P() || mo14710a().equals(gJChronology.mo14710a()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((("GJ".hashCode() * 11) + mo14710a().hashCode()) + m71177P()) + this.f61904e.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology");
        stringBuffer.append('[');
        stringBuffer.append(mo14710a().e());
        if (this.f61905f != f61900a.getMillis()) {
            C19316b c;
            stringBuffer.append(",cutover=");
            if (mo14712b().mo14516v().mo14557i(this.f61905f) == 0) {
                c = C19322g.m69276c();
            } else {
                c = C19322g.m69278e();
            }
            c.m69164a(mo14712b()).m69169a(stringBuffer, this.f61905f);
        }
        if (m71177P() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(m71177P());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    /* renamed from: a */
    protected void mo14802a(C19307a c19307a) {
        Object[] objArr = (Object[]) m70692M();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        C19304a c19304a = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.f61905f = instant.getMillis();
        this.f61902c = julianChronology;
        this.f61903d = c19304a;
        this.f61904e = instant;
        if (m70691L() == null) {
            if (julianChronology.mo14801N() != c19304a.mo14801N()) {
                throw new IllegalArgumentException();
            }
            this.f61906g = this.f61905f - m71180a(this.f61905f);
            c19307a.m69044a(c19304a);
            if (c19304a.mo14499e().mo14524a(this.f61905f) == 0) {
                c19307a.f60131m = new C19625a(this, julianChronology.mo14498d(), c19307a.f60131m, this.f61905f);
                c19307a.f60132n = new C19625a(this, julianChronology.mo14499e(), c19307a.f60132n, this.f61905f);
                c19307a.f60133o = new C19625a(this, julianChronology.mo14501g(), c19307a.f60133o, this.f61905f);
                c19307a.f60134p = new C19625a(this, julianChronology.mo14502h(), c19307a.f60134p, this.f61905f);
                c19307a.f60135q = new C19625a(this, julianChronology.mo14504j(), c19307a.f60135q, this.f61905f);
                c19307a.f60136r = new C19625a(this, julianChronology.mo14505k(), c19307a.f60136r, this.f61905f);
                c19307a.f60137s = new C19625a(this, julianChronology.mo14507m(), c19307a.f60137s, this.f61905f);
                c19307a.f60139u = new C19625a(this, julianChronology.mo14510p(), c19307a.f60139u, this.f61905f);
                c19307a.f60138t = new C19625a(this, julianChronology.mo14508n(), c19307a.f60138t, this.f61905f);
                c19307a.f60140v = new C19625a(this, julianChronology.mo14511q(), c19307a.f60140v, this.f61905f);
                c19307a.f60141w = new C19625a(this, julianChronology.mo14512r(), c19307a.f60141w, this.f61905f);
            }
            c19307a.f60118I = new C19625a(this, julianChronology.mo14486K(), c19307a.f60118I, this.f61905f);
            c19307a.f60114E = new C19787b(this, julianChronology.mo14480E(), c19307a.f60114E, this.f61905f);
            c19307a.f60128j = c19307a.f60114E.mo14548d();
            c19307a.f60115F = new C19787b(this, julianChronology.mo14481F(), c19307a.f60115F, c19307a.f60128j, this.f61905f);
            c19307a.f60117H = new C19787b(this, julianChronology.mo14484I(), c19307a.f60117H, this.f61905f);
            c19307a.f60129k = c19307a.f60117H.mo14548d();
            c19307a.f60116G = new C19787b(this, julianChronology.mo14482G(), c19307a.f60116G, c19307a.f60128j, c19307a.f60129k, this.f61905f);
            c19307a.f60113D = new C19787b(this, julianChronology.mo14478C(), c19307a.f60113D, null, c19307a.f60128j, this.f61905f);
            c19307a.f60127i = c19307a.f60113D.mo14548d();
            c19307a.f60111B = new C19787b(this, julianChronology.mo14520z(), c19307a.f60111B, null, this.f61905f, true);
            c19307a.f60126h = c19307a.f60111B.mo14548d();
            c19307a.f60112C = new C19787b(this, julianChronology.mo14476A(), c19307a.f60112C, c19307a.f60126h, c19307a.f60129k, this.f61905f);
            c19307a.f60144z = new C19625a(this, julianChronology.mo14516v(), c19307a.f60144z, c19307a.f60128j, c19304a.mo14480E().mo14549e(this.f61905f), false);
            c19307a.f60110A = new C19625a(this, julianChronology.mo14518x(), c19307a.f60110A, c19307a.f60126h, c19304a.mo14520z().mo14549e(this.f61905f), true);
            C19305b c19625a = new C19625a(this, julianChronology.mo14515u(), c19307a.f60143y, this.f61905f);
            c19625a.f61386f = c19307a.f60127i;
            c19307a.f60143y = c19625a;
        }
    }

    /* renamed from: a */
    long m71180a(long j) {
        return m71170a(j, this.f61902c, this.f61903d);
    }

    /* renamed from: b */
    long m71184b(long j) {
        return m71170a(j, this.f61903d, this.f61902c);
    }

    /* renamed from: c */
    long m71186c(long j) {
        return m71175b(j, this.f61902c, this.f61903d);
    }

    /* renamed from: d */
    long m71187d(long j) {
        return m71175b(j, this.f61903d, this.f61902c);
    }
}
