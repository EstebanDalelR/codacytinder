package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.format.C19323h;

/* renamed from: org.joda.time.base.f */
public abstract class C3964f implements ReadablePeriod {
    protected C3964f() {
    }

    public int size() {
        return getPeriodType().i();
    }

    public DurationFieldType getFieldType(int i) {
        return getPeriodType().a(i);
    }

    /* renamed from: i */
    public int[] m15501i() {
        int[] iArr = new int[size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = getValue(i);
        }
        return iArr;
    }

    public int get(DurationFieldType durationFieldType) {
        durationFieldType = m15500a(durationFieldType);
        if (durationFieldType == -1) {
            return null;
        }
        return getValue(durationFieldType);
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        return getPeriodType().a(durationFieldType);
    }

    /* renamed from: a */
    public int m15500a(DurationFieldType durationFieldType) {
        return getPeriodType().b(durationFieldType);
    }

    public Period toPeriod() {
        return new Period(this);
    }

    public MutablePeriod toMutablePeriod() {
        return new MutablePeriod(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePeriod)) {
            return false;
        }
        ReadablePeriod readablePeriod = (ReadablePeriod) obj;
        if (size() != readablePeriod.size()) {
            return false;
        }
        int size = size();
        int i = 0;
        while (i < size) {
            if (getValue(i) == readablePeriod.getValue(i)) {
                if (getFieldType(i) == readablePeriod.getFieldType(i)) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 27) + getValue(i2)) * 27) + getFieldType(i2).hashCode();
        }
        return i;
    }

    @ToString
    public String toString() {
        return C19323h.a().a(this);
    }
}
