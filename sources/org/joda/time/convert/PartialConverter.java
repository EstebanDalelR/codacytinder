package org.joda.time.convert;

import org.joda.time.C19304a;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.format.C19316b;

public interface PartialConverter extends Converter {
    C19304a getChronology(Object obj, DateTimeZone dateTimeZone);

    C19304a getChronology(Object obj, C19304a c19304a);

    int[] getPartialValues(ReadablePartial readablePartial, Object obj, C19304a c19304a);

    int[] getPartialValues(ReadablePartial readablePartial, Object obj, C19304a c19304a, C19316b c19316b);
}
