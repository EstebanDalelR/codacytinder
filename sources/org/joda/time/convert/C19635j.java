package org.joda.time.convert;

import org.joda.time.C19304a;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;

/* renamed from: org.joda.time.convert.j */
class C19635j extends C19481a implements DurationConverter, IntervalConverter, PeriodConverter {
    /* renamed from: a */
    static final C19635j f61405a = new C19635j();

    public boolean isReadableInterval(Object obj, C19304a c19304a) {
        return true;
    }

    protected C19635j() {
    }

    public long getDurationMillis(Object obj) {
        return ((ReadableInterval) obj).toDurationMillis();
    }

    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, C19304a c19304a) {
        ReadableInterval readableInterval = (ReadableInterval) obj;
        if (c19304a == null) {
            c19304a = DateTimeUtils.m68909a(readableInterval);
        }
        obj = c19304a.mo14495a((ReadablePeriod) readWritablePeriod, readableInterval.getStartMillis(), readableInterval.getEndMillis());
        for (c19304a = null; c19304a < obj.length; c19304a++) {
            readWritablePeriod.setValue(c19304a, obj[c19304a]);
        }
    }

    public void setInto(ReadWritableInterval readWritableInterval, Object obj, C19304a c19304a) {
        ReadableInterval readableInterval = (ReadableInterval) obj;
        readWritableInterval.setInterval(readableInterval);
        if (c19304a != null) {
            readWritableInterval.setChronology(c19304a);
        } else {
            readWritableInterval.setChronology(readableInterval.getChronology());
        }
    }

    public Class<?> getSupportedType() {
        return ReadableInterval.class;
    }
}
