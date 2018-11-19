package org.joda.time;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import org.joda.convert.ToString;
import org.joda.time.base.C4306g;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.C19322g;

public final class LocalTime extends C4306g implements Serializable, ReadablePartial {
    /* renamed from: a */
    public static final LocalTime f14726a = new LocalTime(0, 0, 0, 0);
    /* renamed from: b */
    private static final Set<DurationFieldType> f14727b = new HashSet();
    private static final long serialVersionUID = -12873158713873L;
    /* renamed from: c */
    private final long f14728c;
    /* renamed from: d */
    private final C19304a f14729d;

    public int size() {
        return 4;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return mo3937a((ReadablePartial) obj);
    }

    static {
        f14727b.add(DurationFieldType.a());
        f14727b.add(DurationFieldType.b());
        f14727b.add(DurationFieldType.c());
        f14727b.add(DurationFieldType.d());
    }

    public LocalTime() {
        this(DateTimeUtils.a(), ISOChronology.O());
    }

    public LocalTime(long j, C19304a c19304a) {
        c19304a = DateTimeUtils.a(c19304a);
        j = c19304a.a().m10343a(DateTimeZone.f8461a, j);
        c19304a = c19304a.b();
        this.f14728c = (long) c19304a.e().a(j);
        this.f14729d = c19304a;
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, ISOChronology.N());
    }

    public LocalTime(int i, int i2, int i3, int i4, C19304a c19304a) {
        c19304a = DateTimeUtils.a(c19304a).b();
        i = c19304a.a(0, i, i2, i3, i4);
        this.f14729d = c19304a;
        this.f14728c = i;
    }

    private Object readResolve() {
        if (this.f14729d == null) {
            return new LocalTime(this.f14728c, ISOChronology.N());
        }
        return !DateTimeZone.f8461a.equals(this.f14729d.a()) ? new LocalTime(this.f14728c, this.f14729d.b()) : this;
    }

    /* renamed from: a */
    protected C19305b mo3938a(int i, C19304a c19304a) {
        switch (i) {
            case 0:
                return c19304a.m();
            case 1:
                return c19304a.j();
            case 2:
                return c19304a.g();
            case 3:
                return c19304a.d();
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
                return getChronology().m().a(mo3939b());
            case 1:
                return getChronology().j().a(mo3939b());
            case 2:
                return getChronology().g().a(mo3939b());
            case 3:
                return getChronology().d().a(mo3939b());
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
        boolean z = false;
        if (dateTimeFieldType == null || !m18430a(dateTimeFieldType.y())) {
            return false;
        }
        DurationFieldType z2 = dateTimeFieldType.z();
        if (m18430a(z2) || z2 == DurationFieldType.f()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public boolean m18430a(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        C19306c a = durationFieldType.a(getChronology());
        if (f14727b.contains(durationFieldType) == null) {
            if (a.d() >= getChronology().s().d()) {
                return false;
            }
        }
        return a.b();
    }

    /* renamed from: b */
    protected long mo3939b() {
        return this.f14728c;
    }

    public C19304a getChronology() {
        return this.f14729d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.f14729d.equals(localTime.f14729d)) {
                if (this.f14728c != localTime.f14728c) {
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
        if (readablePartial instanceof LocalTime) {
            LocalTime localTime = (LocalTime) readablePartial;
            if (this.f14729d.equals(localTime.f14729d)) {
                if (this.f14728c < localTime.f14728c) {
                    i = -1;
                } else if (this.f14728c != localTime.f14728c) {
                    i = 1;
                }
                return i;
            }
        }
        return super.mo3937a(readablePartial);
    }

    @ToString
    public String toString() {
        return C19322g.d().a(this);
    }
}
