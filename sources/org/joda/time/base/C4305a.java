package org.joda.time.base;

import java.util.Locale;
import org.joda.convert.ToString;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadableDateTime;
import org.joda.time.format.C19315a;

/* renamed from: org.joda.time.base.a */
public abstract class C4305a extends C3962c implements ReadableDateTime {
    protected C4305a() {
    }

    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.a(getChronology()).a(getMillis());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public int getEra() {
        return getChronology().K().a(getMillis());
    }

    public int getCenturyOfEra() {
        return getChronology().I().a(getMillis());
    }

    public int getYearOfEra() {
        return getChronology().F().a(getMillis());
    }

    public int getYearOfCentury() {
        return getChronology().G().a(getMillis());
    }

    public int getYear() {
        return getChronology().E().a(getMillis());
    }

    public int getWeekyear() {
        return getChronology().z().a(getMillis());
    }

    public int getMonthOfYear() {
        return getChronology().C().a(getMillis());
    }

    public int getWeekOfWeekyear() {
        return getChronology().x().a(getMillis());
    }

    public int getDayOfYear() {
        return getChronology().v().a(getMillis());
    }

    public int getDayOfMonth() {
        return getChronology().u().a(getMillis());
    }

    public int getDayOfWeek() {
        return getChronology().t().a(getMillis());
    }

    public int getHourOfDay() {
        return getChronology().m().a(getMillis());
    }

    public int getMinuteOfDay() {
        return getChronology().k().a(getMillis());
    }

    public int getMinuteOfHour() {
        return getChronology().j().a(getMillis());
    }

    public int getSecondOfDay() {
        return getChronology().h().a(getMillis());
    }

    public int getSecondOfMinute() {
        return getChronology().g().a(getMillis());
    }

    public int getMillisOfDay() {
        return getChronology().e().a(getMillis());
    }

    public int getMillisOfSecond() {
        return getChronology().d().a(getMillis());
    }

    @ToString
    public String toString() {
        return super.toString();
    }

    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return C19315a.a(str).a(this);
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return C19315a.a(str).a(locale).a(this);
    }
}
