package org.joda.time.format;

import java.io.IOException;
import java.util.Locale;
import org.joda.time.C19304a;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* renamed from: org.joda.time.format.k */
interface C19325k {
    int estimatePrintedLength();

    void printTo(Appendable appendable, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException;

    void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException;
}
