package org.joda.time;

public interface ReadWritableInstant extends ReadableInstant {
    void add(long j);

    void add(DurationFieldType durationFieldType, int i);

    void add(ReadableDuration readableDuration);

    void add(ReadableDuration readableDuration, int i);

    void add(ReadablePeriod readablePeriod);

    void add(ReadablePeriod readablePeriod, int i);

    void set(DateTimeFieldType dateTimeFieldType, int i);

    void setChronology(C19304a c19304a);

    void setMillis(long j);

    void setMillis(ReadableInstant readableInstant);

    void setZone(DateTimeZone dateTimeZone);

    void setZoneRetainFields(DateTimeZone dateTimeZone);
}
