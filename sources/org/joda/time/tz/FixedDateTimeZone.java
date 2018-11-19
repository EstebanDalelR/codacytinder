package org.joda.time.tz;

import org.joda.time.DateTimeZone;

public final class FixedDateTimeZone extends DateTimeZone {
    private static final long serialVersionUID = -3513011772763289092L;
    /* renamed from: b */
    private final String f60894b;
    /* renamed from: c */
    private final int f60895c;
    /* renamed from: d */
    private final int f60896d;

    /* renamed from: f */
    public boolean m70363f() {
        return true;
    }

    /* renamed from: g */
    public long m70364g(long j) {
        return j;
    }

    /* renamed from: h */
    public long m70365h(long j) {
        return j;
    }

    public FixedDateTimeZone(String str, String str2, int i, int i2) {
        super(str);
        this.f60894b = str2;
        this.f60895c = i;
        this.f60896d = i2;
    }

    /* renamed from: a */
    public String m70359a(long j) {
        return this.f60894b;
    }

    /* renamed from: b */
    public int m70360b(long j) {
        return this.f60895c;
    }

    /* renamed from: c */
    public int m70361c(long j) {
        return this.f60896d;
    }

    /* renamed from: e */
    public int m70362e(long j) {
        return this.f60895c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDateTimeZone)) {
            return false;
        }
        FixedDateTimeZone fixedDateTimeZone = (FixedDateTimeZone) obj;
        if (!e().equals(fixedDateTimeZone.e()) || this.f60896d != fixedDateTimeZone.f60896d || this.f60895c != fixedDateTimeZone.f60895c) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (e().hashCode() + (this.f60896d * 37)) + (this.f60895c * 31);
    }
}
