package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BasePeriod;

public final class Period extends BasePeriod implements Serializable, ReadablePeriod {
    /* renamed from: a */
    public static final Period f61874a = new Period();
    private static final long serialVersionUID = 741052353876488155L;

    public Period toPeriod() {
        return this;
    }

    /* renamed from: a */
    public static Period m71099a(int i) {
        return new Period(new int[]{0, i, 0, 0, 0, 0, 0, 0}, PeriodType.m68936a());
    }

    /* renamed from: b */
    public static Period m71100b(int i) {
        return new Period(new int[]{0, 0, i, 0, 0, 0, 0, 0}, PeriodType.m68936a());
    }

    /* renamed from: c */
    public static Period m71101c(int i) {
        return new Period(new int[]{0, 0, 0, i, 0, 0, 0, 0}, PeriodType.m68936a());
    }

    public Period() {
        super(0, null, null);
    }

    public Period(long j) {
        super(j);
    }

    public Period(long j, long j2, C19304a c19304a) {
        super(j, j2, null, c19304a);
    }

    public Period(long j, long j2, PeriodType periodType, C19304a c19304a) {
        super(j, j2, periodType, c19304a);
    }

    public Period(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        super(readableInstant, readableInstant2, periodType);
    }

    public Period(Object obj) {
        super(obj, null, null);
    }

    private Period(int[] iArr, PeriodType periodType) {
        super(iArr, periodType);
    }

    /* renamed from: a */
    public int m71102a() {
        return getPeriodType().m68943a(this, PeriodType.f60094d);
    }

    /* renamed from: a */
    public Period mo14800a(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        return new Period(super.m70674a(i(), readablePeriod), getPeriodType());
    }
}
