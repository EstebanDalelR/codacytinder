package org.joda.time.format;

import java.util.Locale;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/* renamed from: org.joda.time.format.m */
public class C19326m {
    /* renamed from: a */
    private final PeriodPrinter f60269a;
    /* renamed from: b */
    private final PeriodParser f60270b;
    /* renamed from: c */
    private final Locale f60271c;
    /* renamed from: d */
    private final PeriodType f60272d;

    public C19326m(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        this.f60269a = periodPrinter;
        this.f60270b = periodParser;
        this.f60271c = null;
        this.f60272d = null;
    }

    C19326m(PeriodPrinter periodPrinter, PeriodParser periodParser, Locale locale, PeriodType periodType) {
        this.f60269a = periodPrinter;
        this.f60270b = periodParser;
        this.f60271c = locale;
        this.f60272d = periodType;
    }

    /* renamed from: a */
    public PeriodPrinter m69289a() {
        return this.f60269a;
    }

    /* renamed from: b */
    public PeriodParser m69292b() {
        return this.f60270b;
    }

    /* renamed from: a */
    public C19326m m69290a(PeriodType periodType) {
        if (periodType == this.f60272d) {
            return this;
        }
        return new C19326m(this.f60269a, this.f60270b, this.f60271c, periodType);
    }

    /* renamed from: a */
    public String m69287a(ReadablePeriod readablePeriod) {
        m69284c();
        m69283b(readablePeriod);
        PeriodPrinter a = m69289a();
        StringBuffer stringBuffer = new StringBuffer(a.calculatePrintedLength(readablePeriod, this.f60271c));
        a.printTo(stringBuffer, readablePeriod, this.f60271c);
        return stringBuffer.toString();
    }

    /* renamed from: c */
    private void m69284c() {
        if (this.f60269a == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
    }

    /* renamed from: b */
    private void m69283b(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            throw new IllegalArgumentException("Period must not be null");
        }
    }

    /* renamed from: a */
    public int m69286a(ReadWritablePeriod readWritablePeriod, String str, int i) {
        m69285d();
        m69283b((ReadablePeriod) readWritablePeriod);
        return m69292b().parseInto(readWritablePeriod, str, i, this.f60271c);
    }

    /* renamed from: a */
    public Period m69288a(String str) {
        m69285d();
        return m69291b(str).toPeriod();
    }

    /* renamed from: b */
    public MutablePeriod m69291b(String str) {
        m69285d();
        Object mutablePeriod = new MutablePeriod(0, this.f60272d);
        int parseInto = m69292b().parseInto(mutablePeriod, str, 0, this.f60271c);
        if (parseInto < 0) {
            parseInto ^= -1;
        } else if (parseInto >= str.length()) {
            return mutablePeriod;
        }
        throw new IllegalArgumentException(C19320f.m69213a(str, parseInto));
    }

    /* renamed from: d */
    private void m69285d() {
        if (this.f60270b == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
    }
}
