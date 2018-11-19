package org.joda.time;

final class UTCDateTimeZone extends DateTimeZone {
    /* renamed from: b */
    static final DateTimeZone f60818b = new UTCDateTimeZone();
    private static final long serialVersionUID = -3513011772763289092L;

    /* renamed from: a */
    public String m70114a(long j) {
        return "UTC";
    }

    /* renamed from: b */
    public int m70115b(long j) {
        return 0;
    }

    /* renamed from: c */
    public int m70116c(long j) {
        return 0;
    }

    /* renamed from: e */
    public int m70117e(long j) {
        return 0;
    }

    /* renamed from: f */
    public boolean m70118f() {
        return true;
    }

    /* renamed from: g */
    public long m70119g(long j) {
        return j;
    }

    /* renamed from: h */
    public long m70120h(long j) {
        return j;
    }

    public UTCDateTimeZone() {
        super("UTC");
    }

    public boolean equals(Object obj) {
        return obj instanceof UTCDateTimeZone;
    }

    public int hashCode() {
        return e().hashCode();
    }
}
