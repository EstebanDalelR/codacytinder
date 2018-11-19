package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.field.C19314d;

public abstract class BaseDuration extends C3961b implements Serializable, ReadableDuration {
    private static final long serialVersionUID = 2581698638990L;
    /* renamed from: a */
    private volatile long f61336a;

    protected BaseDuration(long j) {
        this.f61336a = j;
    }

    protected BaseDuration(long j, long j2) {
        this.f61336a = C19314d.m69093b(j2, j);
    }

    protected BaseDuration(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant == readableInstant2) {
            this.f61336a = null;
            return;
        }
        this.f61336a = C19314d.m69093b(DateTimeUtils.m68904a(readableInstant2), DateTimeUtils.m68904a(readableInstant));
    }

    public long getMillis() {
        return this.f61336a;
    }
}
