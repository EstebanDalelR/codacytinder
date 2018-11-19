package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.C19304a;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* renamed from: org.joda.time.format.l */
class C19496l implements DateTimePrinter, C19325k {
    /* renamed from: a */
    private final C19325k f60860a;

    public int estimatePrintedLength() {
        return this.f60860a.estimatePrintedLength();
    }

    public void printTo(java.lang.StringBuffer r9, long r10, org.joda.time.C19304a r12, int r13, org.joda.time.DateTimeZone r14, java.util.Locale r15) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = r8.f60860a;	 Catch:{ IOException -> 0x000b }
        r1 = r9;	 Catch:{ IOException -> 0x000b }
        r2 = r10;	 Catch:{ IOException -> 0x000b }
        r4 = r12;	 Catch:{ IOException -> 0x000b }
        r5 = r13;	 Catch:{ IOException -> 0x000b }
        r6 = r14;	 Catch:{ IOException -> 0x000b }
        r7 = r15;	 Catch:{ IOException -> 0x000b }
        r0.printTo(r1, r2, r4, r5, r6, r7);	 Catch:{ IOException -> 0x000b }
    L_0x000b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.l.printTo(java.lang.StringBuffer, long, org.joda.time.a, int, org.joda.time.DateTimeZone, java.util.Locale):void");
    }

    public void printTo(Writer writer, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        this.f60860a.printTo(writer, j, c19304a, i, dateTimeZone, locale);
    }

    public void printTo(Appendable appendable, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        this.f60860a.printTo(appendable, j, c19304a, i, dateTimeZone, locale);
    }

    public void printTo(java.lang.StringBuffer r2, org.joda.time.ReadablePartial r3, java.util.Locale r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f60860a;	 Catch:{ IOException -> 0x0005 }
        r0.printTo(r2, r3, r4);	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.l.printTo(java.lang.StringBuffer, org.joda.time.ReadablePartial, java.util.Locale):void");
    }

    public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
        this.f60860a.printTo(writer, readablePartial, locale);
    }

    public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        this.f60860a.printTo(appendable, readablePartial, locale);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19496l)) {
            return null;
        }
        return this.f60860a.equals(((C19496l) obj).f60860a);
    }
}
