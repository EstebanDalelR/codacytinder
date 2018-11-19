package org.joda.time.base;

import java.util.Date;
import org.joda.convert.ToString;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.field.C19314d;
import org.joda.time.format.C19316b;
import org.joda.time.format.C19322g;

/* renamed from: org.joda.time.base.c */
public abstract class C3962c implements ReadableInstant {
    public /* synthetic */ int compareTo(Object obj) {
        return m15487a((ReadableInstant) obj);
    }

    protected C3962c() {
    }

    public DateTimeZone getZone() {
        return getChronology().a();
    }

    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.a(getChronology()).a(getMillis());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        return dateTimeFieldType == null ? null : dateTimeFieldType.a(getChronology()).c();
    }

    public Instant toInstant() {
        return new Instant(getMillis());
    }

    public DateTime toDateTime() {
        return new DateTime(getMillis(), getZone());
    }

    public MutableDateTime toMutableDateTime() {
        return new MutableDateTime(getMillis(), getZone());
    }

    /* renamed from: g */
    public Date m15492g() {
        return new Date(getMillis());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadableInstant)) {
            return false;
        }
        ReadableInstant readableInstant = (ReadableInstant) obj;
        if (getMillis() != readableInstant.getMillis() || C19314d.a(getChronology(), readableInstant.getChronology()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((int) (getMillis() ^ (getMillis() >>> 32))) + getChronology().hashCode();
    }

    /* renamed from: a */
    public int m15487a(ReadableInstant readableInstant) {
        if (this == readableInstant) {
            return 0;
        }
        long millis = readableInstant.getMillis();
        long millis2 = getMillis();
        if (millis2 == millis) {
            return 0;
        }
        return millis2 < millis ? -1 : 1;
    }

    /* renamed from: d */
    public boolean m15489d(long j) {
        return getMillis() > j ? 1 : 0;
    }

    /* renamed from: h */
    public boolean m15493h() {
        return m15489d(DateTimeUtils.a());
    }

    public boolean isAfter(ReadableInstant readableInstant) {
        return m15489d(DateTimeUtils.a(readableInstant));
    }

    /* renamed from: e */
    public boolean m15490e(long j) {
        return getMillis() < j ? 1 : 0;
    }

    /* renamed from: i */
    public boolean m15494i() {
        return m15490e(DateTimeUtils.a());
    }

    public boolean isBefore(ReadableInstant readableInstant) {
        return m15490e(DateTimeUtils.a(readableInstant));
    }

    /* renamed from: f */
    public boolean m15491f(long j) {
        return getMillis() == j ? 1 : 0;
    }

    public boolean isEqual(ReadableInstant readableInstant) {
        return m15491f(DateTimeUtils.a(readableInstant));
    }

    @ToString
    public String toString() {
        return C19322g.e().a(this);
    }

    /* renamed from: a */
    public String m15488a(C19316b c19316b) {
        if (c19316b == null) {
            return toString();
        }
        return c19316b.a(this);
    }
}
