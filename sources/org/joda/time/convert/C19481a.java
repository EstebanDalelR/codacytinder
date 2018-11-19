package org.joda.time.convert;

import com.tinder.api.ManagerWebServices;
import org.joda.time.C19304a;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.C19316b;

/* renamed from: org.joda.time.convert.a */
public abstract class C19481a implements Converter {
    public boolean isReadableInterval(Object obj, C19304a c19304a) {
        return false;
    }

    protected C19481a() {
    }

    public long getInstantMillis(Object obj, C19304a c19304a) {
        return DateTimeUtils.m68902a();
    }

    public C19304a getChronology(Object obj, DateTimeZone dateTimeZone) {
        return ISOChronology.m71190b(dateTimeZone);
    }

    public C19304a getChronology(Object obj, C19304a c19304a) {
        return DateTimeUtils.m68910a(c19304a);
    }

    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, C19304a c19304a) {
        return c19304a.mo14493a(readablePartial, getInstantMillis(obj, c19304a));
    }

    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, C19304a c19304a, C19316b c19316b) {
        return getPartialValues(readablePartial, obj, c19304a);
    }

    public PeriodType getPeriodType(Object obj) {
        return PeriodType.m68936a();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Converter[");
        stringBuilder.append(getSupportedType() == null ? ManagerWebServices.NULL_STRING_VALUE : getSupportedType().getName());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
