package org.joda.time.convert;

import org.joda.time.C19304a;
import org.joda.time.DateTimeZone;

public interface InstantConverter extends Converter {
    C19304a getChronology(Object obj, DateTimeZone dateTimeZone);

    C19304a getChronology(Object obj, C19304a c19304a);

    long getInstantMillis(Object obj, C19304a c19304a);
}
