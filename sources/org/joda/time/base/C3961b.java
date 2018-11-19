package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.format.C19320f;

/* renamed from: org.joda.time.base.b */
public abstract class C3961b implements ReadableDuration {
    public /* synthetic */ int compareTo(Object obj) {
        return m15486a((ReadableDuration) obj);
    }

    protected C3961b() {
    }

    public Duration toDuration() {
        return new Duration(getMillis());
    }

    public Period toPeriod() {
        return new Period(getMillis());
    }

    /* renamed from: a */
    public int m15486a(ReadableDuration readableDuration) {
        long millis = getMillis();
        long millis2 = readableDuration.getMillis();
        if (millis < millis2) {
            return -1;
        }
        return millis > millis2 ? 1 : null;
    }

    public boolean isEqual(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.f61873a;
        }
        return m15486a(readableDuration) == null ? true : null;
    }

    public boolean isLongerThan(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.f61873a;
        }
        return m15486a(readableDuration) > null ? true : null;
    }

    public boolean isShorterThan(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.f61873a;
        }
        return m15486a(readableDuration) < null ? true : null;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadableDuration)) {
            return false;
        }
        if (getMillis() != ((ReadableDuration) obj).getMillis()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long millis = getMillis();
        return (int) (millis ^ (millis >>> 32));
    }

    @ToString
    public String toString() {
        long millis = getMillis();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        Object obj = millis < 0 ? 1 : null;
        C19320f.a(stringBuffer, millis);
        while (true) {
            int i = 3;
            if (stringBuffer.length() >= (obj != null ? 7 : 6)) {
                break;
            }
            if (obj == null) {
                i = 2;
            }
            stringBuffer.insert(i, "0");
        }
        if ((millis / 1000) * 1000 == millis) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
