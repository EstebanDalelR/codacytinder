package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.format.C19316b;
import org.joda.time.format.C19322g;

public final class DateTime extends BaseDateTime implements Serializable, ReadableDateTime {
    private static final long serialVersionUID = -5171125899451703815L;

    public DateTime toDateTime() {
        return this;
    }

    /* renamed from: a */
    public static DateTime m18605a() {
        return new DateTime();
    }

    @FromString
    /* renamed from: a */
    public static DateTime m18606a(String str) {
        return m18607a(str, C19322g.b().e());
    }

    /* renamed from: a */
    public static DateTime m18607a(String str, C19316b c19316b) {
        return c19316b.d(str);
    }

    public DateTime(long j) {
        super(j);
    }

    public DateTime(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public DateTime(long j, C19304a c19304a) {
        super(j, c19304a);
    }

    public DateTime(Object obj) {
        super(obj, (C19304a) null);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4, i5, 0, 0);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, C19304a c19304a) {
        super(i, i2, i3, i4, i5, i6, i7, c19304a);
    }

    /* renamed from: a */
    public DateTime m18609a(long j) {
        return j == getMillis() ? this : new DateTime(j, getChronology());
    }

    /* renamed from: a */
    public DateTime m18614a(C19304a c19304a) {
        c19304a = DateTimeUtils.a(c19304a);
        return c19304a == getChronology() ? this : new DateTime(getMillis(), c19304a);
    }

    /* renamed from: a */
    public DateTime m18611a(DateTimeZone dateTimeZone) {
        return m18614a(getChronology().a(dateTimeZone));
    }

    /* renamed from: b */
    public DateTime m18617b(DateTimeZone dateTimeZone) {
        dateTimeZone = DateTimeUtils.a(dateTimeZone);
        DateTimeZone a = DateTimeUtils.a(getZone());
        if (dateTimeZone == a) {
            return this;
        }
        return new DateTime(a.m10343a(dateTimeZone, getMillis()), getChronology().a(dateTimeZone));
    }

    /* renamed from: a */
    public DateTime m18610a(long j, int i) {
        if (j != 0) {
            if (i != 0) {
                return m18609a(getChronology().a(getMillis(), j, i));
            }
        }
        return this;
    }

    /* renamed from: a */
    public DateTime m18613a(ReadablePeriod readablePeriod, int i) {
        if (readablePeriod != null) {
            if (i != 0) {
                return m18609a(getChronology().a(readablePeriod, getMillis(), i));
            }
        }
        return this;
    }

    /* renamed from: b */
    public DateTime m18616b(long j) {
        return m18610a(j, 1);
    }

    /* renamed from: a */
    public DateTime m18612a(ReadablePeriod readablePeriod) {
        return m18613a(readablePeriod, 1);
    }

    /* renamed from: a */
    public DateTime m18608a(int i) {
        if (i == 0) {
            return this;
        }
        return m18609a(getChronology().l().a(getMillis(), i));
    }

    /* renamed from: b */
    public DateTime m18615b(int i) {
        if (i == 0) {
            return this;
        }
        return m18609a(getChronology().c().a(getMillis(), i));
    }

    /* renamed from: c */
    public DateTime m18622c(long j) {
        return m18610a(j, -1);
    }

    /* renamed from: b */
    public DateTime m18618b(ReadablePeriod readablePeriod) {
        return m18613a(readablePeriod, -1);
    }

    /* renamed from: c */
    public DateTime m18621c(int i) {
        if (i == 0) {
            return this;
        }
        return m18609a(getChronology().D().b(getMillis(), i));
    }

    /* renamed from: b */
    public LocalDate m18619b() {
        return new LocalDate(getMillis(), getChronology());
    }

    /* renamed from: d */
    public DateTime m18624d(int i) {
        return m18609a(getChronology().C().b(getMillis(), i));
    }

    /* renamed from: c */
    public DateTime$Property m18620c() {
        return new DateTime$Property(this, getChronology().C());
    }

    /* renamed from: d */
    public DateTime$Property m18623d() {
        return new DateTime$Property(this, getChronology().u());
    }

    /* renamed from: e */
    public DateTime$Property m18625e() {
        return new DateTime$Property(this, getChronology().t());
    }

    /* renamed from: f */
    public DateTime$Property m18626f() {
        return new DateTime$Property(this, getChronology().g());
    }
}
