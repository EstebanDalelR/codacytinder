package org.joda.time;

import java.io.Serializable;

public abstract class DurationFieldType implements Serializable {
    /* renamed from: a */
    static final DurationFieldType f60070a = new StandardDurationFieldType("eras", (byte) 1);
    /* renamed from: b */
    static final DurationFieldType f60071b = new StandardDurationFieldType("centuries", (byte) 2);
    /* renamed from: c */
    static final DurationFieldType f60072c = new StandardDurationFieldType("weekyears", (byte) 3);
    /* renamed from: d */
    static final DurationFieldType f60073d = new StandardDurationFieldType("years", (byte) 4);
    /* renamed from: e */
    static final DurationFieldType f60074e = new StandardDurationFieldType("months", (byte) 5);
    /* renamed from: f */
    static final DurationFieldType f60075f = new StandardDurationFieldType("weeks", (byte) 6);
    /* renamed from: g */
    static final DurationFieldType f60076g = new StandardDurationFieldType("days", (byte) 7);
    /* renamed from: h */
    static final DurationFieldType f60077h = new StandardDurationFieldType("halfdays", (byte) 8);
    /* renamed from: i */
    static final DurationFieldType f60078i = new StandardDurationFieldType("hours", (byte) 9);
    /* renamed from: j */
    static final DurationFieldType f60079j = new StandardDurationFieldType("minutes", (byte) 10);
    /* renamed from: k */
    static final DurationFieldType f60080k = new StandardDurationFieldType("seconds", (byte) 11);
    /* renamed from: l */
    static final DurationFieldType f60081l = new StandardDurationFieldType("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    /* renamed from: m */
    private final String f60082m;

    private static class StandardDurationFieldType extends DurationFieldType {
        private static final long serialVersionUID = 31156755687123L;
        /* renamed from: m */
        private final byte f60815m;

        StandardDurationFieldType(String str, byte b) {
            super(str);
            this.f60815m = b;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StandardDurationFieldType)) {
                return false;
            }
            if (this.f60815m != ((StandardDurationFieldType) obj).f60815m) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return 1 << this.f60815m;
        }

        /* renamed from: a */
        public C19306c mo14457a(C19304a c19304a) {
            c19304a = DateTimeUtils.m68910a(c19304a);
            switch (this.f60815m) {
                case (byte) 1:
                    return c19304a.mo14485J();
                case (byte) 2:
                    return c19304a.mo14483H();
                case (byte) 3:
                    return c19304a.mo14519y();
                case (byte) 4:
                    return c19304a.mo14479D();
                case (byte) 5:
                    return c19304a.mo14477B();
                case (byte) 6:
                    return c19304a.mo14517w();
                case (byte) 7:
                    return c19304a.mo14513s();
                case (byte) 8:
                    return c19304a.mo14509o();
                case (byte) 9:
                    return c19304a.mo14506l();
                case (byte) 10:
                    return c19304a.mo14503i();
                case (byte) 11:
                    return c19304a.mo14500f();
                case (byte) 12:
                    return c19304a.mo14497c();
                default:
                    throw new InternalError();
            }
        }

        private Object readResolve() {
            switch (this.f60815m) {
                case (byte) 1:
                    return a;
                case (byte) 2:
                    return b;
                case (byte) 3:
                    return c;
                case (byte) 4:
                    return d;
                case (byte) 5:
                    return e;
                case (byte) 6:
                    return f;
                case (byte) 7:
                    return g;
                case (byte) 8:
                    return h;
                case (byte) 9:
                    return i;
                case (byte) 10:
                    return j;
                case (byte) 11:
                    return k;
                case (byte) 12:
                    return l;
                default:
                    return this;
            }
        }
    }

    /* renamed from: a */
    public abstract C19306c mo14457a(C19304a c19304a);

    protected DurationFieldType(String str) {
        this.f60082m = str;
    }

    /* renamed from: a */
    public static DurationFieldType m68918a() {
        return f60081l;
    }

    /* renamed from: b */
    public static DurationFieldType m68919b() {
        return f60080k;
    }

    /* renamed from: c */
    public static DurationFieldType m68920c() {
        return f60079j;
    }

    /* renamed from: d */
    public static DurationFieldType m68921d() {
        return f60078i;
    }

    /* renamed from: e */
    public static DurationFieldType m68922e() {
        return f60077h;
    }

    /* renamed from: f */
    public static DurationFieldType m68923f() {
        return f60076g;
    }

    /* renamed from: g */
    public static DurationFieldType m68924g() {
        return f60075f;
    }

    /* renamed from: h */
    public static DurationFieldType m68925h() {
        return f60072c;
    }

    /* renamed from: i */
    public static DurationFieldType m68926i() {
        return f60074e;
    }

    /* renamed from: j */
    public static DurationFieldType m68927j() {
        return f60073d;
    }

    /* renamed from: k */
    public static DurationFieldType m68928k() {
        return f60071b;
    }

    /* renamed from: l */
    public static DurationFieldType m68929l() {
        return f60070a;
    }

    /* renamed from: m */
    public String m68931m() {
        return this.f60082m;
    }

    public String toString() {
        return m68931m();
    }
}
