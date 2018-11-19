package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.C19304a;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

public interface DateTimePrinter {
    int estimatePrintedLength();

    void printTo(Writer writer, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException;

    void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException;

    void printTo(StringBuffer stringBuffer, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale);

    void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale);
}
