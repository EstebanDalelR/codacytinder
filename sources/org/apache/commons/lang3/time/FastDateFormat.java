package org.apache.commons.lang3.time;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateFormat extends Format implements DateParser, DatePrinter {
    /* renamed from: a */
    private static final C16006c<FastDateFormat> f55137a = new C177201();
    private static final long serialVersionUID = 2;
    /* renamed from: b */
    private final FastDatePrinter f55138b;
    /* renamed from: c */
    private final FastDateParser f55139c;

    /* renamed from: org.apache.commons.lang3.time.FastDateFormat$1 */
    static class C177201 extends C16006c<FastDateFormat> {
        C177201() {
        }

        /* renamed from: b */
        protected /* synthetic */ Format mo13457b(String str, TimeZone timeZone, Locale locale) {
            return m64559a(str, timeZone, locale);
        }

        /* renamed from: a */
        protected FastDateFormat m64559a(String str, TimeZone timeZone, Locale locale) {
            return new FastDateFormat(str, timeZone, locale);
        }
    }

    /* renamed from: a */
    public static FastDateFormat m64561a(String str, TimeZone timeZone) {
        return (FastDateFormat) f55137a.m60768c(str, timeZone, null);
    }

    protected FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    protected FastDateFormat(String str, TimeZone timeZone, Locale locale, Date date) {
        this.f55138b = new FastDatePrinter(str, timeZone, locale);
        this.f55139c = new FastDateParser(str, timeZone, locale, date);
    }

    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.f55138b.m64609a(obj));
        return stringBuffer;
    }

    public String format(long j) {
        return this.f55138b.format(j);
    }

    public String format(Date date) {
        return this.f55138b.format(date);
    }

    public String format(Calendar calendar) {
        return this.f55138b.format(calendar);
    }

    @Deprecated
    public StringBuffer format(long j, StringBuffer stringBuffer) {
        return this.f55138b.format(j, stringBuffer);
    }

    @Deprecated
    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        return this.f55138b.format(date, stringBuffer);
    }

    @Deprecated
    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return this.f55138b.format(calendar, stringBuffer);
    }

    public <B extends Appendable> B format(long j, B b) {
        return this.f55138b.format(j, (Appendable) b);
    }

    public <B extends Appendable> B format(Date date, B b) {
        return this.f55138b.format(date, (Appendable) b);
    }

    public <B extends Appendable> B format(Calendar calendar, B b) {
        return this.f55138b.format(calendar, (Appendable) b);
    }

    public Date parse(String str) throws ParseException {
        return this.f55139c.parse(str);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        return this.f55139c.parse(str, parsePosition);
    }

    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        return this.f55139c.parse(str, parsePosition, calendar);
    }

    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.f55139c.parseObject(str, parsePosition);
    }

    public String getPattern() {
        return this.f55138b.getPattern();
    }

    public TimeZone getTimeZone() {
        return this.f55138b.getTimeZone();
    }

    public Locale getLocale() {
        return this.f55138b.getLocale();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateFormat)) {
            return null;
        }
        return this.f55138b.equals(((FastDateFormat) obj).f55138b);
    }

    public int hashCode() {
        return this.f55138b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastDateFormat[");
        stringBuilder.append(this.f55138b.getPattern());
        stringBuilder.append(",");
        stringBuilder.append(this.f55138b.getLocale());
        stringBuilder.append(",");
        stringBuilder.append(this.f55138b.getTimeZone().getID());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
