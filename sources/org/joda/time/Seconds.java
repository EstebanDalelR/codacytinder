package org.joda.time;

import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.format.C19323h;
import org.joda.time.format.C19326m;

public final class Seconds extends BaseSingleFieldPeriod {
    /* renamed from: a */
    public static final Seconds f14106a = new Seconds(0);
    /* renamed from: b */
    public static final Seconds f14107b = new Seconds(1);
    /* renamed from: c */
    public static final Seconds f14108c = new Seconds(2);
    /* renamed from: d */
    public static final Seconds f14109d = new Seconds(3);
    /* renamed from: e */
    public static final Seconds f14110e = new Seconds(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    /* renamed from: f */
    public static final Seconds f14111f = new Seconds(Integer.MIN_VALUE);
    /* renamed from: g */
    private static final C19326m f14112g = C19323h.a().a(PeriodType.g());
    private static final long serialVersionUID = 87525275727380862L;

    /* renamed from: a */
    public static Seconds m17396a(int i) {
        if (i == Integer.MIN_VALUE) {
            return f14111f;
        }
        if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return f14110e;
        }
        switch (i) {
            case 0:
                return f14106a;
            case 1:
                return f14107b;
            case 2:
                return f14108c;
            case 3:
                return f14109d;
            default:
                return new Seconds(i);
        }
    }

    /* renamed from: a */
    public static Seconds m17397a(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return m17396a(BaseSingleFieldPeriod.m15481a(readableInstant, readableInstant2, DurationFieldType.b()));
    }

    /* renamed from: a */
    public static Seconds m17398a(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if ((readablePartial instanceof LocalTime) && (readablePartial2 instanceof LocalTime)) {
            return m17396a(DateTimeUtils.a(readablePartial.getChronology()).f().c(((LocalTime) readablePartial2).mo3939b(), ((LocalTime) readablePartial).mo3939b()));
        }
        return m17396a(BaseSingleFieldPeriod.m15482a(readablePartial, readablePartial2, f14106a));
    }

    private Seconds(int i) {
        super(i);
    }

    private Object readResolve() {
        return m17396a(m15485c());
    }

    /* renamed from: a */
    public DurationFieldType mo3624a() {
        return DurationFieldType.b();
    }

    public PeriodType getPeriodType() {
        return PeriodType.g();
    }

    /* renamed from: b */
    public int m17400b() {
        return m15485c();
    }

    @ToString
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PT");
        stringBuilder.append(String.valueOf(m15485c()));
        stringBuilder.append("S");
        return stringBuilder.toString();
    }
}
