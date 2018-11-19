package org.joda.time.convert;

import org.joda.time.C19304a;
import org.joda.time.DateTimeUtils;
import org.joda.time.Period;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;

/* renamed from: org.joda.time.convert.g */
class C19632g extends C19481a implements DurationConverter, InstantConverter, IntervalConverter, PartialConverter, PeriodConverter {
    /* renamed from: a */
    static final C19632g f61402a = new C19632g();

    public long getDurationMillis(Object obj) {
        return 0;
    }

    public Class<?> getSupportedType() {
        return null;
    }

    protected C19632g() {
    }

    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, C19304a c19304a) {
        readWritablePeriod.setPeriod((Period) null);
    }

    public void setInto(ReadWritableInterval readWritableInterval, Object obj, C19304a c19304a) {
        readWritableInterval.setChronology(c19304a);
        long a = DateTimeUtils.m68902a();
        readWritableInterval.setInterval(a, a);
    }
}
