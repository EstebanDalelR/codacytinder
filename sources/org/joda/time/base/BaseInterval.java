package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C19304a;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.ISOChronology;

public abstract class BaseInterval extends C19480d implements Serializable, ReadableInterval {
    private static final long serialVersionUID = 576586928732749278L;
    /* renamed from: a */
    private volatile C19304a f61337a;
    /* renamed from: b */
    private volatile long f61338b;
    /* renamed from: c */
    private volatile long f61339c;

    protected BaseInterval(long j, long j2, C19304a c19304a) {
        this.f61337a = DateTimeUtils.m68910a(c19304a);
        m70121a(j, j2);
        this.f61338b = j;
        this.f61339c = j2;
    }

    protected BaseInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant == null && readableInstant2 == null) {
            readableInstant = DateTimeUtils.m68902a();
            this.f61339c = readableInstant;
            this.f61338b = readableInstant;
            this.f61337a = ISOChronology.m71189O();
            return;
        }
        this.f61337a = DateTimeUtils.m68914b(readableInstant);
        this.f61338b = DateTimeUtils.m68904a(readableInstant);
        this.f61339c = DateTimeUtils.m68904a(readableInstant2);
        m70121a(this.f61338b, this.f61339c);
    }

    public C19304a getChronology() {
        return this.f61337a;
    }

    public long getStartMillis() {
        return this.f61338b;
    }

    public long getEndMillis() {
        return this.f61339c;
    }

    /* renamed from: a */
    protected void m70666a(long j, long j2, C19304a c19304a) {
        m70121a(j, j2);
        this.f61338b = j;
        this.f61339c = j2;
        this.f61337a = DateTimeUtils.m68910a(c19304a);
    }
}
