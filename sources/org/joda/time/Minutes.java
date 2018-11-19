package org.joda.time;

import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.format.C19323h;
import org.joda.time.format.C19326m;

public final class Minutes extends BaseSingleFieldPeriod {
    /* renamed from: a */
    public static final Minutes f14099a = new Minutes(0);
    /* renamed from: b */
    public static final Minutes f14100b = new Minutes(1);
    /* renamed from: c */
    public static final Minutes f14101c = new Minutes(2);
    /* renamed from: d */
    public static final Minutes f14102d = new Minutes(3);
    /* renamed from: e */
    public static final Minutes f14103e = new Minutes(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    /* renamed from: f */
    public static final Minutes f14104f = new Minutes(Integer.MIN_VALUE);
    /* renamed from: g */
    private static final C19326m f14105g = C19323h.a().a(PeriodType.f());
    private static final long serialVersionUID = 87525275727380863L;

    /* renamed from: a */
    public static Minutes m17392a(int i) {
        if (i == Integer.MIN_VALUE) {
            return f14104f;
        }
        if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return f14103e;
        }
        switch (i) {
            case 0:
                return f14099a;
            case 1:
                return f14100b;
            case 2:
                return f14101c;
            case 3:
                return f14102d;
            default:
                return new Minutes(i);
        }
    }

    /* renamed from: a */
    public static Minutes m17393a(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return m17392a(BaseSingleFieldPeriod.m15481a(readableInstant, readableInstant2, DurationFieldType.c()));
    }

    private Minutes(int i) {
        super(i);
    }

    private Object readResolve() {
        return m17392a(m15485c());
    }

    /* renamed from: a */
    public DurationFieldType mo3624a() {
        return DurationFieldType.c();
    }

    public PeriodType getPeriodType() {
        return PeriodType.f();
    }

    /* renamed from: b */
    public int m17395b() {
        return m15485c();
    }

    @ToString
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PT");
        stringBuilder.append(String.valueOf(m15485c()));
        stringBuilder.append("M");
        return stringBuilder.toString();
    }
}
