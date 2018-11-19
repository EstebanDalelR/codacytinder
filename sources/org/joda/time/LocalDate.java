package org.joda.time;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import org.joda.convert.ToString;
import org.joda.time.base.C4306g;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.C19311c;
import org.joda.time.convert.PartialConverter;
import org.joda.time.format.C19316b;
import org.joda.time.format.C19322g;

public final class LocalDate extends C4306g implements Serializable, ReadablePartial {
    /* renamed from: a */
    private static final Set<DurationFieldType> f14720a = new HashSet();
    private static final long serialVersionUID = -8775358157899L;
    /* renamed from: b */
    private final long f14721b;
    /* renamed from: c */
    private final C19304a f14722c;
    /* renamed from: d */
    private transient int f14723d;

    public int size() {
        return 3;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return mo3937a((ReadablePartial) obj);
    }

    static {
        f14720a.add(DurationFieldType.f());
        f14720a.add(DurationFieldType.g());
        f14720a.add(DurationFieldType.i());
        f14720a.add(DurationFieldType.h());
        f14720a.add(DurationFieldType.j());
        f14720a.add(DurationFieldType.k());
        f14720a.add(DurationFieldType.l());
    }

    /* renamed from: a */
    public static LocalDate m18393a() {
        return new LocalDate();
    }

    /* renamed from: a */
    public static LocalDate m18394a(String str, C19316b c19316b) {
        return c19316b.b(str);
    }

    public LocalDate() {
        this(DateTimeUtils.a(), ISOChronology.O());
    }

    public LocalDate(long j, C19304a c19304a) {
        c19304a = DateTimeUtils.a(c19304a);
        j = c19304a.a().m10343a(DateTimeZone.f8461a, j);
        c19304a = c19304a.b();
        this.f14721b = c19304a.u().d(j);
        this.f14722c = c19304a;
    }

    public LocalDate(Object obj) {
        this(obj, (C19304a) null);
    }

    public LocalDate(Object obj, C19304a c19304a) {
        PartialConverter b = C19311c.a().b(obj);
        c19304a = DateTimeUtils.a(b.getChronology(obj, c19304a));
        this.f14722c = c19304a.b();
        obj = b.getPartialValues(this, obj, c19304a, C19322g.a());
        this.f14721b = this.f14722c.a(obj[0], obj[1], obj[2], 0);
    }

    public LocalDate(int i, int i2, int i3) {
        this(i, i2, i3, ISOChronology.N());
    }

    public LocalDate(int i, int i2, int i3, C19304a c19304a) {
        c19304a = DateTimeUtils.a(c19304a).b();
        i = c19304a.a(i, i2, i3, 0);
        this.f14722c = c19304a;
        this.f14721b = i;
    }

    private Object readResolve() {
        if (this.f14722c == null) {
            return new LocalDate(this.f14721b, ISOChronology.N());
        }
        return !DateTimeZone.f8461a.equals(this.f14722c.a()) ? new LocalDate(this.f14721b, this.f14722c.b()) : this;
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
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid index: ");
                stringBuilder.append(i);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (isSupported(dateTimeFieldType)) {
            return dateTimeFieldType.a(getChronology()).a(mo3939b());
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field '");
            stringBuilder.append(dateTimeFieldType);
            stringBuilder.append("' is not supported");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        DurationFieldType y = dateTimeFieldType.y();
        if (!f14720a.contains(y)) {
            if (y.a(getChronology()).d() < getChronology().s().d()) {
                return false;
            }
        }
        return dateTimeFieldType.a(getChronology()).c();
    }

    /* renamed from: b */
    protected long mo3939b() {
        return this.f14721b;
    }

    public C19304a getChronology() {
        return this.f14722c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            LocalDate localDate = (LocalDate) obj;
            if (this.f14722c.equals(localDate.f14722c)) {
                if (this.f14721b != localDate.f14721b) {
                    z = false;
                }
                return z;
            }
        }
        return super.equals(obj);
    }

    public int hashCode() {
        int i = this.f14723d;
        if (i != 0) {
            return i;
        }
        i = super.hashCode();
        this.f14723d = i;
        return i;
    }

    /* renamed from: a */
    public int mo3937a(ReadablePartial readablePartial) {
        int i = 0;
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalDate) {
            LocalDate localDate = (LocalDate) readablePartial;
            if (this.f14722c.equals(localDate.f14722c)) {
                if (this.f14721b < localDate.f14721b) {
                    i = -1;
                } else if (this.f14721b != localDate.f14721b) {
                    i = 1;
                }
                return i;
            }
        }
        return super.mo3937a(readablePartial);
    }

    /* renamed from: c */
    public DateTime m18402c() {
        return m18396a(null);
    }

    /* renamed from: a */
    public DateTime m18396a(DateTimeZone dateTimeZone) {
        dateTimeZone = DateTimeUtils.a(dateTimeZone);
        C19304a a = getChronology().a(dateTimeZone);
        return new DateTime(a.u().d(dateTimeZone.m10341a(mo3939b() + 21600000, false)), a);
    }

    /* renamed from: a */
    LocalDate m18398a(long j) {
        j = this.f14722c.u().d(j);
        return j == mo3939b() ? this : new LocalDate(j, getChronology());
    }

    /* renamed from: a */
    public LocalDate m18397a(int i) {
        if (i == 0) {
            return this;
        }
        return m18398a(getChronology().D().a(mo3939b(), i));
    }

    /* renamed from: b */
    public LocalDate m18401b(int i) {
        if (i == 0) {
            return this;
        }
        return m18398a(getChronology().s().a(mo3939b(), i));
    }

    /* renamed from: c */
    public LocalDate m18403c(int i) {
        if (i == 0) {
            return this;
        }
        return m18398a(getChronology().D().b(mo3939b(), i));
    }

    /* renamed from: d */
    public int m18404d() {
        return getChronology().E().a(mo3939b());
    }

    /* renamed from: e */
    public int m18406e() {
        return getChronology().C().a(mo3939b());
    }

    /* renamed from: f */
    public int m18407f() {
        return getChronology().u().a(mo3939b());
    }

    /* renamed from: d */
    public LocalDate m18405d(int i) {
        return m18398a(getChronology().C().b(mo3939b(), i));
    }

    @ToString
    public String toString() {
        return C19322g.c().a(this);
    }
}
