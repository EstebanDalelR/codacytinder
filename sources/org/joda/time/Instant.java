package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.C3962c;
import org.joda.time.chrono.ISOChronology;

public final class Instant extends C3962c implements Serializable, ReadableInstant {
    private static final long serialVersionUID = 3299096530934209741L;
    /* renamed from: a */
    private final long f61335a;

    public Instant toInstant() {
        return this;
    }

    public Instant() {
        this.f61335a = DateTimeUtils.m68902a();
    }

    public Instant(long j) {
        this.f61335a = j;
    }

    public long getMillis() {
        return this.f61335a;
    }

    public C19304a getChronology() {
        return ISOChronology.m71188N();
    }

    public DateTime toDateTime() {
        return new DateTime(getMillis(), ISOChronology.m71189O());
    }

    public MutableDateTime toMutableDateTime() {
        return new MutableDateTime(getMillis(), ISOChronology.m71189O());
    }
}
