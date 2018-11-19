package org.joda.time;

import java.io.Serializable;

public abstract class DateTimeFieldType implements Serializable {
    /* renamed from: a */
    private static final DateTimeFieldType f60040a = new StandardDateTimeFieldType("era", (byte) 1, DurationFieldType.m68929l(), null);
    /* renamed from: b */
    private static final DateTimeFieldType f60041b = new StandardDateTimeFieldType("yearOfEra", (byte) 2, DurationFieldType.m68927j(), DurationFieldType.m68929l());
    /* renamed from: c */
    private static final DateTimeFieldType f60042c = new StandardDateTimeFieldType("centuryOfEra", (byte) 3, DurationFieldType.m68928k(), DurationFieldType.m68929l());
    /* renamed from: d */
    private static final DateTimeFieldType f60043d = new StandardDateTimeFieldType("yearOfCentury", (byte) 4, DurationFieldType.m68927j(), DurationFieldType.m68928k());
    /* renamed from: e */
    private static final DateTimeFieldType f60044e = new StandardDateTimeFieldType("year", (byte) 5, DurationFieldType.m68927j(), null);
    /* renamed from: f */
    private static final DateTimeFieldType f60045f = new StandardDateTimeFieldType("dayOfYear", (byte) 6, DurationFieldType.m68923f(), DurationFieldType.m68927j());
    /* renamed from: g */
    private static final DateTimeFieldType f60046g = new StandardDateTimeFieldType("monthOfYear", (byte) 7, DurationFieldType.m68926i(), DurationFieldType.m68927j());
    /* renamed from: h */
    private static final DateTimeFieldType f60047h = new StandardDateTimeFieldType("dayOfMonth", (byte) 8, DurationFieldType.m68923f(), DurationFieldType.m68926i());
    /* renamed from: i */
    private static final DateTimeFieldType f60048i = new StandardDateTimeFieldType("weekyearOfCentury", (byte) 9, DurationFieldType.m68925h(), DurationFieldType.m68928k());
    /* renamed from: j */
    private static final DateTimeFieldType f60049j = new StandardDateTimeFieldType("weekyear", (byte) 10, DurationFieldType.m68925h(), null);
    /* renamed from: k */
    private static final DateTimeFieldType f60050k = new StandardDateTimeFieldType("weekOfWeekyear", (byte) 11, DurationFieldType.m68924g(), DurationFieldType.m68925h());
    /* renamed from: l */
    private static final DateTimeFieldType f60051l = new StandardDateTimeFieldType("dayOfWeek", (byte) 12, DurationFieldType.m68923f(), DurationFieldType.m68924g());
    /* renamed from: m */
    private static final DateTimeFieldType f60052m = new StandardDateTimeFieldType("halfdayOfDay", (byte) 13, DurationFieldType.m68922e(), DurationFieldType.m68923f());
    /* renamed from: n */
    private static final DateTimeFieldType f60053n = new StandardDateTimeFieldType("hourOfHalfday", (byte) 14, DurationFieldType.m68921d(), DurationFieldType.m68922e());
    /* renamed from: o */
    private static final DateTimeFieldType f60054o = new StandardDateTimeFieldType("clockhourOfHalfday", (byte) 15, DurationFieldType.m68921d(), DurationFieldType.m68922e());
    /* renamed from: p */
    private static final DateTimeFieldType f60055p = new StandardDateTimeFieldType("clockhourOfDay", (byte) 16, DurationFieldType.m68921d(), DurationFieldType.m68923f());
    /* renamed from: q */
    private static final DateTimeFieldType f60056q = new StandardDateTimeFieldType("hourOfDay", (byte) 17, DurationFieldType.m68921d(), DurationFieldType.m68923f());
    /* renamed from: r */
    private static final DateTimeFieldType f60057r = new StandardDateTimeFieldType("minuteOfDay", (byte) 18, DurationFieldType.m68920c(), DurationFieldType.m68923f());
    /* renamed from: s */
    private static final DateTimeFieldType f60058s = new StandardDateTimeFieldType("minuteOfHour", (byte) 19, DurationFieldType.m68920c(), DurationFieldType.m68921d());
    private static final long serialVersionUID = -42615285973990L;
    /* renamed from: t */
    private static final DateTimeFieldType f60059t = new StandardDateTimeFieldType("secondOfDay", (byte) 20, DurationFieldType.m68919b(), DurationFieldType.m68923f());
    /* renamed from: u */
    private static final DateTimeFieldType f60060u = new StandardDateTimeFieldType("secondOfMinute", (byte) 21, DurationFieldType.m68919b(), DurationFieldType.m68920c());
    /* renamed from: v */
    private static final DateTimeFieldType f60061v = new StandardDateTimeFieldType("millisOfDay", (byte) 22, DurationFieldType.m68918a(), DurationFieldType.m68923f());
    /* renamed from: w */
    private static final DateTimeFieldType f60062w = new StandardDateTimeFieldType("millisOfSecond", (byte) 23, DurationFieldType.m68918a(), DurationFieldType.m68919b());
    /* renamed from: x */
    private final String f60063x;

    private static class StandardDateTimeFieldType extends DateTimeFieldType {
        private static final long serialVersionUID = -9937958251642L;
        /* renamed from: a */
        private final byte f60812a;
        /* renamed from: b */
        private final transient DurationFieldType f60813b;
        /* renamed from: c */
        private final transient DurationFieldType f60814c;

        StandardDateTimeFieldType(String str, byte b, DurationFieldType durationFieldType, DurationFieldType durationFieldType2) {
            super(str);
            this.f60812a = b;
            this.f60813b = durationFieldType;
            this.f60814c = durationFieldType2;
        }

        /* renamed from: y */
        public DurationFieldType mo14454y() {
            return this.f60813b;
        }

        /* renamed from: z */
        public DurationFieldType mo14455z() {
            return this.f60814c;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StandardDateTimeFieldType)) {
                return false;
            }
            if (this.f60812a != ((StandardDateTimeFieldType) obj).f60812a) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return 1 << this.f60812a;
        }

        /* renamed from: a */
        public C19305b mo14453a(C19304a c19304a) {
            c19304a = DateTimeUtils.m68910a(c19304a);
            switch (this.f60812a) {
                case (byte) 1:
                    return c19304a.mo14486K();
                case (byte) 2:
                    return c19304a.mo14481F();
                case (byte) 3:
                    return c19304a.mo14484I();
                case (byte) 4:
                    return c19304a.mo14482G();
                case (byte) 5:
                    return c19304a.mo14480E();
                case (byte) 6:
                    return c19304a.mo14516v();
                case (byte) 7:
                    return c19304a.mo14478C();
                case (byte) 8:
                    return c19304a.mo14515u();
                case (byte) 9:
                    return c19304a.mo14476A();
                case (byte) 10:
                    return c19304a.mo14520z();
                case (byte) 11:
                    return c19304a.mo14518x();
                case (byte) 12:
                    return c19304a.mo14514t();
                case (byte) 13:
                    return c19304a.mo14512r();
                case (byte) 14:
                    return c19304a.mo14510p();
                case (byte) 15:
                    return c19304a.mo14511q();
                case (byte) 16:
                    return c19304a.mo14508n();
                case (byte) 17:
                    return c19304a.mo14507m();
                case (byte) 18:
                    return c19304a.mo14505k();
                case (byte) 19:
                    return c19304a.mo14504j();
                case (byte) 20:
                    return c19304a.mo14502h();
                case (byte) 21:
                    return c19304a.mo14501g();
                case (byte) 22:
                    return c19304a.mo14499e();
                case (byte) 23:
                    return c19304a.mo14498d();
                default:
                    throw new InternalError();
            }
        }

        private Object readResolve() {
            switch (this.f60812a) {
                case (byte) 1:
                    return DateTimeFieldType.f60040a;
                case (byte) 2:
                    return DateTimeFieldType.f60041b;
                case (byte) 3:
                    return DateTimeFieldType.f60042c;
                case (byte) 4:
                    return DateTimeFieldType.f60043d;
                case (byte) 5:
                    return DateTimeFieldType.f60044e;
                case (byte) 6:
                    return DateTimeFieldType.f60045f;
                case (byte) 7:
                    return DateTimeFieldType.f60046g;
                case (byte) 8:
                    return DateTimeFieldType.f60047h;
                case (byte) 9:
                    return DateTimeFieldType.f60048i;
                case (byte) 10:
                    return DateTimeFieldType.f60049j;
                case (byte) 11:
                    return DateTimeFieldType.f60050k;
                case (byte) 12:
                    return DateTimeFieldType.f60051l;
                case (byte) 13:
                    return DateTimeFieldType.f60052m;
                case (byte) 14:
                    return DateTimeFieldType.f60053n;
                case (byte) 15:
                    return DateTimeFieldType.f60054o;
                case (byte) 16:
                    return DateTimeFieldType.f60055p;
                case (byte) 17:
                    return DateTimeFieldType.f60056q;
                case (byte) 18:
                    return DateTimeFieldType.f60057r;
                case (byte) 19:
                    return DateTimeFieldType.f60058s;
                case (byte) 20:
                    return DateTimeFieldType.f60059t;
                case (byte) 21:
                    return DateTimeFieldType.f60060u;
                case (byte) 22:
                    return DateTimeFieldType.f60061v;
                case (byte) 23:
                    return DateTimeFieldType.f60062w;
                default:
                    return this;
            }
        }
    }

    /* renamed from: a */
    public abstract C19305b mo14453a(C19304a c19304a);

    /* renamed from: y */
    public abstract DurationFieldType mo14454y();

    /* renamed from: z */
    public abstract DurationFieldType mo14455z();

    protected DateTimeFieldType(String str) {
        this.f60063x = str;
    }

    /* renamed from: a */
    public static DateTimeFieldType m68875a() {
        return f60062w;
    }

    /* renamed from: b */
    public static DateTimeFieldType m68876b() {
        return f60061v;
    }

    /* renamed from: c */
    public static DateTimeFieldType m68877c() {
        return f60060u;
    }

    /* renamed from: d */
    public static DateTimeFieldType m68878d() {
        return f60059t;
    }

    /* renamed from: e */
    public static DateTimeFieldType m68879e() {
        return f60058s;
    }

    /* renamed from: f */
    public static DateTimeFieldType m68880f() {
        return f60057r;
    }

    /* renamed from: g */
    public static DateTimeFieldType m68881g() {
        return f60056q;
    }

    /* renamed from: h */
    public static DateTimeFieldType m68882h() {
        return f60055p;
    }

    /* renamed from: i */
    public static DateTimeFieldType m68883i() {
        return f60053n;
    }

    /* renamed from: j */
    public static DateTimeFieldType m68884j() {
        return f60054o;
    }

    /* renamed from: k */
    public static DateTimeFieldType m68885k() {
        return f60052m;
    }

    /* renamed from: l */
    public static DateTimeFieldType m68886l() {
        return f60051l;
    }

    /* renamed from: m */
    public static DateTimeFieldType m68887m() {
        return f60047h;
    }

    /* renamed from: n */
    public static DateTimeFieldType m68888n() {
        return f60045f;
    }

    /* renamed from: o */
    public static DateTimeFieldType m68889o() {
        return f60050k;
    }

    /* renamed from: p */
    public static DateTimeFieldType m68890p() {
        return f60049j;
    }

    /* renamed from: q */
    public static DateTimeFieldType m68891q() {
        return f60048i;
    }

    /* renamed from: r */
    public static DateTimeFieldType m68892r() {
        return f60046g;
    }

    /* renamed from: s */
    public static DateTimeFieldType m68893s() {
        return f60044e;
    }

    /* renamed from: t */
    public static DateTimeFieldType m68894t() {
        return f60041b;
    }

    /* renamed from: u */
    public static DateTimeFieldType m68895u() {
        return f60043d;
    }

    /* renamed from: v */
    public static DateTimeFieldType m68896v() {
        return f60042c;
    }

    /* renamed from: w */
    public static DateTimeFieldType m68897w() {
        return f60040a;
    }

    /* renamed from: x */
    public String m68899x() {
        return this.f60063x;
    }

    public String toString() {
        return m68899x();
    }
}
