package org.joda.time.convert;

import org.joda.time.C19304a;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;

public interface PeriodConverter extends Converter {
    PeriodType getPeriodType(Object obj);

    void setInto(ReadWritablePeriod readWritablePeriod, Object obj, C19304a c19304a);
}
