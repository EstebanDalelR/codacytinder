package org.joda.time.base;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.field.C19314d;
import org.joda.time.format.C19316b;
import org.joda.time.format.C19322g;

/* renamed from: org.joda.time.base.d */
public abstract class C19480d implements ReadableInterval {
    protected C19480d() {
    }

    /* renamed from: a */
    protected void m70121a(long j, long j2) {
        if (j2 < j) {
            throw new IllegalArgumentException("The end instant must be greater the start");
        }
    }

    public DateTime getStart() {
        return new DateTime(getStartMillis(), getChronology());
    }

    public DateTime getEnd() {
        return new DateTime(getEndMillis(), getChronology());
    }

    /* renamed from: a */
    public boolean m70123a(long j) {
        return (j < getStartMillis() || j >= getEndMillis()) ? 0 : 1;
    }

    /* renamed from: a */
    public boolean m70122a() {
        return m70123a(DateTimeUtils.m68902a());
    }

    public boolean contains(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return m70122a();
        }
        return m70123a(readableInstant.getMillis());
    }

    public boolean contains(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            return m70122a();
        }
        long startMillis = readableInterval.getStartMillis();
        long endMillis = readableInterval.getEndMillis();
        long startMillis2 = getStartMillis();
        long endMillis2 = getEndMillis();
        readableInterval = (startMillis2 > startMillis || startMillis >= endMillis2 || endMillis > endMillis2) ? null : true;
        return readableInterval;
    }

    public boolean overlaps(ReadableInterval readableInterval) {
        long startMillis = getStartMillis();
        long endMillis = getEndMillis();
        boolean z = false;
        if (readableInterval == null) {
            long a = DateTimeUtils.m68902a();
            if (startMillis < a && a < endMillis) {
                z = true;
            }
            return z;
        }
        a = readableInterval.getStartMillis();
        if (startMillis < readableInterval.getEndMillis() && a < endMillis) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public boolean m70125b(long j) {
        return getEndMillis() <= j ? 1 : 0;
    }

    /* renamed from: b */
    public boolean m70124b() {
        return m70125b(DateTimeUtils.m68902a());
    }

    public boolean isBefore(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return m70124b();
        }
        return m70125b(readableInstant.getMillis());
    }

    public boolean isBefore(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            return m70124b();
        }
        return m70125b(readableInterval.getStartMillis());
    }

    /* renamed from: c */
    public boolean m70127c(long j) {
        return getStartMillis() > j ? 1 : 0;
    }

    /* renamed from: c */
    public boolean m70126c() {
        return m70127c(DateTimeUtils.m68902a());
    }

    public boolean isAfter(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return m70126c();
        }
        return m70127c(readableInstant.getMillis());
    }

    public boolean isAfter(ReadableInterval readableInterval) {
        long a;
        if (readableInterval == null) {
            a = DateTimeUtils.m68902a();
        } else {
            a = readableInterval.getEndMillis();
        }
        return getStartMillis() >= a ? true : null;
    }

    public Interval toInterval() {
        return new Interval(getStartMillis(), getEndMillis(), getChronology());
    }

    public MutableInterval toMutableInterval() {
        return new MutableInterval(getStartMillis(), getEndMillis(), getChronology());
    }

    public long toDurationMillis() {
        return C19314d.m69093b(getEndMillis(), getStartMillis());
    }

    public Duration toDuration() {
        long toDurationMillis = toDurationMillis();
        if (toDurationMillis == 0) {
            return Duration.f61873a;
        }
        return new Duration(toDurationMillis);
    }

    public Period toPeriod() {
        return new Period(getStartMillis(), getEndMillis(), getChronology());
    }

    public Period toPeriod(PeriodType periodType) {
        return new Period(getStartMillis(), getEndMillis(), periodType, getChronology());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadableInterval)) {
            return false;
        }
        ReadableInterval readableInterval = (ReadableInterval) obj;
        if (getStartMillis() != readableInterval.getStartMillis() || getEndMillis() != readableInterval.getEndMillis() || C19314d.m69092a(getChronology(), readableInterval.getChronology()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long startMillis = getStartMillis();
        long endMillis = getEndMillis();
        return ((((3007 + ((int) (startMillis ^ (startMillis >>> 32)))) * 31) + ((int) (endMillis ^ (endMillis >>> 32)))) * 31) + getChronology().hashCode();
    }

    public String toString() {
        C19316b a = C19322g.m69278e().m69164a(getChronology());
        StringBuffer stringBuffer = new StringBuffer(48);
        a.m69169a(stringBuffer, getStartMillis());
        stringBuffer.append('/');
        a.m69169a(stringBuffer, getEndMillis());
        return stringBuffer.toString();
    }
}
