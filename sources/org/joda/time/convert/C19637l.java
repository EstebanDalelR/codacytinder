package org.joda.time.convert;

import org.joda.time.C19304a;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/* renamed from: org.joda.time.convert.l */
class C19637l extends C19481a implements PeriodConverter {
    /* renamed from: a */
    static final C19637l f61407a = new C19637l();

    protected C19637l() {
    }

    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, C19304a c19304a) {
        readWritablePeriod.setPeriod((ReadablePeriod) obj);
    }

    public PeriodType getPeriodType(Object obj) {
        return ((ReadablePeriod) obj).getPeriodType();
    }

    public Class<?> getSupportedType() {
        return ReadablePeriod.class;
    }
}
