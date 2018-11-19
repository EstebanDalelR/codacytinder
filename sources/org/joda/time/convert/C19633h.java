package org.joda.time.convert;

import org.joda.time.C19304a;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePeriod;

/* renamed from: org.joda.time.convert.h */
class C19633h extends C19481a implements DurationConverter, PeriodConverter {
    /* renamed from: a */
    static final C19633h f61403a = new C19633h();

    protected C19633h() {
    }

    public long getDurationMillis(Object obj) {
        return ((ReadableDuration) obj).getMillis();
    }

    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, C19304a c19304a) {
        obj = DateTimeUtils.m68910a(c19304a).mo14494a((ReadablePeriod) readWritablePeriod, ((ReadableDuration) obj).getMillis());
        for (c19304a = null; c19304a < obj.length; c19304a++) {
            readWritablePeriod.setValue(c19304a, obj[c19304a]);
        }
    }

    public Class<?> getSupportedType() {
        return ReadableDuration.class;
    }
}
