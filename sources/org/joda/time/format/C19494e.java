package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.C19304a;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* renamed from: org.joda.time.format.e */
class C19494e implements C19325k {
    /* renamed from: a */
    private final DateTimePrinter f60858a;

    /* renamed from: a */
    static C19325k m70319a(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter instanceof C19496l) {
            return (C19325k) dateTimePrinter;
        }
        if (dateTimePrinter == null) {
            return null;
        }
        return new C19494e(dateTimePrinter);
    }

    private C19494e(DateTimePrinter dateTimePrinter) {
        this.f60858a = dateTimePrinter;
    }

    public int estimatePrintedLength() {
        return this.f60858a.estimatePrintedLength();
    }

    public void printTo(Appendable appendable, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        C19494e c19494e = this;
        Appendable appendable2 = appendable;
        if (appendable2 instanceof StringBuffer) {
            c19494e.f60858a.printTo((StringBuffer) appendable2, j, c19304a, i, dateTimeZone, locale);
        }
        if (appendable2 instanceof Writer) {
            c19494e.f60858a.printTo((Writer) appendable2, j, c19304a, i, dateTimeZone, locale);
        }
        CharSequence stringBuffer = new StringBuffer(estimatePrintedLength());
        c19494e.f60858a.printTo((StringBuffer) stringBuffer, j, c19304a, i, dateTimeZone, locale);
        appendable2.append(stringBuffer);
    }

    public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        if (appendable instanceof StringBuffer) {
            this.f60858a.printTo((StringBuffer) appendable, readablePartial, locale);
        }
        if (appendable instanceof Writer) {
            this.f60858a.printTo((Writer) appendable, readablePartial, locale);
        }
        StringBuffer stringBuffer = new StringBuffer(estimatePrintedLength());
        this.f60858a.printTo(stringBuffer, readablePartial, locale);
        appendable.append(stringBuffer);
    }
}
