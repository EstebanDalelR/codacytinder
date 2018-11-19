package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C19304a;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;

public abstract class BaseSingleFieldPeriod implements Serializable, Comparable<BaseSingleFieldPeriod>, ReadablePeriod {
    private static final long serialVersionUID = 9386874258972L;
    /* renamed from: a */
    private volatile int f12607a;

    /* renamed from: a */
    public abstract DurationFieldType mo3624a();

    public abstract PeriodType getPeriodType();

    public int size() {
        return 1;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m15483a((BaseSingleFieldPeriod) obj);
    }

    /* renamed from: a */
    protected static int m15481a(ReadableInstant readableInstant, ReadableInstant readableInstant2, DurationFieldType durationFieldType) {
        if (readableInstant != null) {
            if (readableInstant2 != null) {
                return durationFieldType.a(DateTimeUtils.b(readableInstant)).c(readableInstant2.getMillis(), readableInstant.getMillis());
            }
        }
        throw new IllegalArgumentException("ReadableInstant objects must not be null");
    }

    /* renamed from: a */
    protected static int m15482a(ReadablePartial readablePartial, ReadablePartial readablePartial2, ReadablePeriod readablePeriod) {
        if (readablePartial != null) {
            if (readablePartial2 != null) {
                if (readablePartial.size() != readablePartial2.size()) {
                    throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
                int size = readablePartial.size();
                for (int i = 0; i < size; i++) {
                    if (readablePartial.getFieldType(i) != readablePartial2.getFieldType(i)) {
                        throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                    }
                }
                if (DateTimeUtils.a(readablePartial)) {
                    C19304a b = DateTimeUtils.a(readablePartial.getChronology()).b();
                    return b.a(readablePeriod, b.b(readablePartial, 63072000000L), b.b(readablePartial2, 63072000000L))[0];
                }
                throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
            }
        }
        throw new IllegalArgumentException("ReadablePartial objects must not be null");
    }

    protected BaseSingleFieldPeriod(int i) {
        this.f12607a = i;
    }

    /* renamed from: c */
    protected int m15485c() {
        return this.f12607a;
    }

    public DurationFieldType getFieldType(int i) {
        if (i == 0) {
            return mo3624a();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public int getValue(int i) {
        if (i == 0) {
            return m15485c();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public int get(DurationFieldType durationFieldType) {
        return durationFieldType == mo3624a() ? m15485c() : null;
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        return durationFieldType == mo3624a() ? true : null;
    }

    public Period toPeriod() {
        return Period.f61874a.a(this);
    }

    public MutablePeriod toMutablePeriod() {
        MutablePeriod mutablePeriod = new MutablePeriod();
        mutablePeriod.add(this);
        return mutablePeriod;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePeriod)) {
            return false;
        }
        ReadablePeriod readablePeriod = (ReadablePeriod) obj;
        if (readablePeriod.getPeriodType() != getPeriodType() || readablePeriod.getValue(0) != m15485c()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((459 + m15485c()) * 27) + mo3624a().hashCode();
    }

    /* renamed from: a */
    public int m15483a(BaseSingleFieldPeriod baseSingleFieldPeriod) {
        if (baseSingleFieldPeriod.getClass() != getClass()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass());
            stringBuilder.append(" cannot be compared to ");
            stringBuilder.append(baseSingleFieldPeriod.getClass());
            throw new ClassCastException(stringBuilder.toString());
        }
        baseSingleFieldPeriod = baseSingleFieldPeriod.m15485c();
        int c = m15485c();
        if (c > baseSingleFieldPeriod) {
            return 1;
        }
        return c < baseSingleFieldPeriod ? -1 : null;
    }
}
