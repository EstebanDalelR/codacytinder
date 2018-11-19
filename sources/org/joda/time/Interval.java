package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseInterval;

public final class Interval extends BaseInterval implements Serializable, ReadableInterval {
    private static final long serialVersionUID = 4922451897541386752L;

    public Interval toInterval() {
        return this;
    }

    public Interval(long j, long j2, C19304a c19304a) {
        super(j, j2, c19304a);
    }

    public Interval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }
}
