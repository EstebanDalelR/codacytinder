package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.C19314d;

public final class Duration extends BaseDuration implements Serializable, ReadableDuration {
    /* renamed from: a */
    public static final Duration f61873a = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration toDuration() {
        return this;
    }

    public Duration(long j) {
        super(j);
    }

    public Duration(long j, long j2) {
        super(j, j2);
    }

    public Duration(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    /* renamed from: a */
    public long m71085a() {
        return getMillis() / 86400000;
    }

    /* renamed from: b */
    public long m71086b() {
        return getMillis() / 1000;
    }

    /* renamed from: c */
    public Days m71087c() {
        return Days.a(C19314d.m69087a(m71085a()));
    }
}
