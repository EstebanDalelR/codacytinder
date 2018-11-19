package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseInterval;
import org.joda.time.field.C19314d;

public class MutableInterval extends BaseInterval implements Serializable, Cloneable, ReadWritableInterval {
    private static final long serialVersionUID = -5982824024992428470L;

    public MutableInterval() {
        super(0, 0, null);
    }

    public MutableInterval(long j, long j2, C19304a c19304a) {
        super(j, j2, c19304a);
    }

    public void setInterval(long j, long j2) {
        super.m70666a(j, j2, getChronology());
    }

    public void setInterval(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            throw new IllegalArgumentException("Interval must not be null");
        }
        super.m70666a(readableInterval.getStartMillis(), readableInterval.getEndMillis(), readableInterval.getChronology());
    }

    public void setInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant == null && readableInstant2 == null) {
            long a = DateTimeUtils.m68902a();
            setInterval(a, a);
            return;
        }
        super.m70666a(DateTimeUtils.m68904a(readableInstant), DateTimeUtils.m68904a(readableInstant2), DateTimeUtils.m68914b(readableInstant));
    }

    public void setChronology(C19304a c19304a) {
        super.m70666a(getStartMillis(), getEndMillis(), c19304a);
    }

    public void setStartMillis(long j) {
        super.m70666a(j, getEndMillis(), getChronology());
    }

    public void setStart(ReadableInstant readableInstant) {
        super.m70666a(DateTimeUtils.m68904a(readableInstant), getEndMillis(), getChronology());
    }

    public void setEndMillis(long j) {
        super.m70666a(getStartMillis(), j, getChronology());
    }

    public void setEnd(ReadableInstant readableInstant) {
        super.m70666a(getStartMillis(), DateTimeUtils.m68904a(readableInstant), getChronology());
    }

    public void setDurationAfterStart(ReadableDuration readableDuration) {
        setEndMillis(C19314d.m69089a(getStartMillis(), DateTimeUtils.m68903a(readableDuration)));
    }

    public void setDurationBeforeEnd(ReadableDuration readableDuration) {
        setStartMillis(C19314d.m69089a(getEndMillis(), -DateTimeUtils.m68903a(readableDuration)));
    }

    public void setPeriodAfterStart(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            setEndMillis(getStartMillis());
        } else {
            setEndMillis(getChronology().mo14491a(readablePeriod, getStartMillis(), 1));
        }
    }

    public void setPeriodBeforeEnd(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            setStartMillis(getEndMillis());
        } else {
            setStartMillis(getChronology().mo14491a(readablePeriod, getEndMillis(), -1));
        }
    }

    public java.lang.Object clone() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new java.lang.InternalError;
        r1 = "Clone error";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.MutableInterval.clone():java.lang.Object");
    }
}
