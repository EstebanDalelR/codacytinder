package org.joda.time.chrono;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

/* renamed from: org.joda.time.chrono.h */
class C19309h {
    /* renamed from: a */
    private final DateTimeZone f60152a;
    /* renamed from: b */
    private final Instant f60153b;
    /* renamed from: c */
    private final int f60154c;

    C19309h(DateTimeZone dateTimeZone, Instant instant, int i) {
        this.f60152a = dateTimeZone;
        this.f60153b = instant;
        this.f60154c = i;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.f60153b == null ? 0 : this.f60153b.hashCode()) + 31) * 31) + this.f60154c) * 31;
        if (this.f60152a != null) {
            i = this.f60152a.hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C19309h)) {
            return false;
        }
        C19309h c19309h = (C19309h) obj;
        if (this.f60153b == null) {
            if (c19309h.f60153b != null) {
                return false;
            }
        } else if (!this.f60153b.equals(c19309h.f60153b)) {
            return false;
        }
        if (this.f60154c != c19309h.f60154c) {
            return false;
        }
        if (this.f60152a == null) {
            if (c19309h.f60152a != null) {
                return false;
            }
        } else if (this.f60152a.equals(c19309h.f60152a) == null) {
            return false;
        }
        return true;
    }
}
