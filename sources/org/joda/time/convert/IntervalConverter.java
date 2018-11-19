package org.joda.time.convert;

import org.joda.time.C19304a;
import org.joda.time.ReadWritableInterval;

public interface IntervalConverter extends Converter {
    boolean isReadableInterval(Object obj, C19304a c19304a);

    void setInto(ReadWritableInterval readWritableInterval, Object obj, C19304a c19304a);
}
