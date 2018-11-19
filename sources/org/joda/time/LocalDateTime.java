package org.joda.time;

import com.facebook.ads.AdError;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.joda.convert.ToString;
import org.joda.time.base.C4306g;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.C19322g;

public final class LocalDateTime extends C4306g implements Serializable, ReadablePartial {
    private static final long serialVersionUID = -268716875315837168L;
    /* renamed from: a */
    private final long f14724a;
    /* renamed from: b */
    private final C19304a f14725b;

    public int size() {
        return 4;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return mo3937a((ReadablePartial) obj);
    }

    /* renamed from: a */
    public static LocalDateTime m18408a() {
        return new LocalDateTime();
    }

    /* renamed from: a */
    public static LocalDateTime m18409a(Calendar calendar) {
        if (calendar == null) {
            throw new IllegalArgumentException("The calendar must not be null");
        }
        int i = calendar.get(0);
        int i2 = calendar.get(1);
        if (i != 1) {
            i2 = 1 - i2;
        }
        return new LocalDateTime(i2, calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
    }

    /* renamed from: a */
    public static LocalDateTime m18410a(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else if (date.getTime() >= 0) {
            return new LocalDateTime(date.getYear() + 1900, date.getMonth() + 1, date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + AdError.NETWORK_ERROR_CODE) % AdError.NETWORK_ERROR_CODE);
        } else {
            Calendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return m18409a(gregorianCalendar);
        }
    }

    public LocalDateTime() {
        this(DateTimeUtils.a(), ISOChronology.O());
    }

    public LocalDateTime(long j, C19304a c19304a) {
        c19304a = DateTimeUtils.a(c19304a);
        this.f14724a = c19304a.a().m10343a(DateTimeZone.f8461a, j);
        this.f14725b = c19304a.b();
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, i3, i4, i5, i6, i7, ISOChronology.N());
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, C19304a c19304a) {
        C19304a b = DateTimeUtils.a(c19304a).b();
        long a = b.a(i, i2, i3, i4, i5, i6, i7);
        this.f14725b = b;
        this.f14724a = a;
    }

    private Object readResolve() {
        if (this.f14725b == null) {
            return new LocalDateTime(this.f14724a, ISOChronology.N());
        }
        return !DateTimeZone.f8461a.equals(this.f14725b.a()) ? new LocalDateTime(this.f14724a, this.f14725b.b()) : this;
    }

    /* renamed from: a */
    protected C19305b mo3938a(int i, C19304a c19304a) {
        switch (i) {
            case 0:
                return c19304a.E();
            case 1:
                return c19304a.C();
            case 2:
                return c19304a.u();
            case 3:
                return c19304a.e();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid index: ");
                stringBuilder.append(i);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public int getValue(int i) {
        switch (i) {
            case 0:
                return getChronology().E().a(mo3939b());
            case 1:
                return getChronology().C().a(mo3939b());
            case 2:
                return getChronology().u().a(mo3939b());
            case 3:
                return getChronology().e().a(mo3939b());
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid index: ");
                stringBuilder.append(i);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.a(getChronology()).a(mo3939b());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        return dateTimeFieldType == null ? null : dateTimeFieldType.a(getChronology()).c();
    }

    /* renamed from: b */
    protected long mo3939b() {
        return this.f14724a;
    }

    public C19304a getChronology() {
        return this.f14725b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f14725b.equals(localDateTime.f14725b)) {
                if (this.f14724a != localDateTime.f14724a) {
                    z = false;
                }
                return z;
            }
        }
        return super.equals(obj);
    }

    /* renamed from: a */
    public int mo3937a(ReadablePartial readablePartial) {
        int i = 0;
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) readablePartial;
            if (this.f14725b.equals(localDateTime.f14725b)) {
                if (this.f14724a < localDateTime.f14724a) {
                    i = -1;
                } else if (this.f14724a != localDateTime.f14724a) {
                    i = 1;
                }
                return i;
            }
        }
        return super.mo3937a(readablePartial);
    }

    /* renamed from: c */
    public DateTime m18418c() {
        return m18412a((DateTimeZone) null);
    }

    /* renamed from: a */
    public DateTime m18412a(DateTimeZone dateTimeZone) {
        return new DateTime(m18420e(), m18421f(), m18422g(), m18423h(), m18424i(), m18425j(), m18426k(), this.f14725b.a(DateTimeUtils.a(dateTimeZone)));
    }

    /* renamed from: d */
    public LocalDate m18419d() {
        return new LocalDate(mo3939b(), getChronology());
    }

    /* renamed from: a */
    LocalDateTime m18413a(long j) {
        return j == mo3939b() ? this : new LocalDateTime(j, getChronology());
    }

    /* renamed from: a */
    public LocalDateTime m18415a(ReadablePeriod readablePeriod, int i) {
        if (readablePeriod != null) {
            if (i != 0) {
                return m18413a(getChronology().a(readablePeriod, mo3939b(), i));
            }
        }
        return this;
    }

    /* renamed from: a */
    public LocalDateTime m18414a(ReadablePeriod readablePeriod) {
        return m18415a(readablePeriod, 1);
    }

    /* renamed from: e */
    public int m18420e() {
        return getChronology().E().a(mo3939b());
    }

    /* renamed from: f */
    public int m18421f() {
        return getChronology().C().a(mo3939b());
    }

    /* renamed from: g */
    public int m18422g() {
        return getChronology().u().a(mo3939b());
    }

    /* renamed from: h */
    public int m18423h() {
        return getChronology().m().a(mo3939b());
    }

    /* renamed from: i */
    public int m18424i() {
        return getChronology().j().a(mo3939b());
    }

    /* renamed from: j */
    public int m18425j() {
        return getChronology().g().a(mo3939b());
    }

    /* renamed from: k */
    public int m18426k() {
        return getChronology().d().a(mo3939b());
    }

    /* renamed from: l */
    public int m18427l() {
        return getChronology().e().a(mo3939b());
    }

    @ToString
    public String toString() {
        return C19322g.e().a(this);
    }
}
