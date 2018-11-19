package org.joda.time;

import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.format.C19323h;
import org.joda.time.format.C19326m;

public final class Years extends BaseSingleFieldPeriod {
    /* renamed from: a */
    public static final Years f14120a = new Years(0);
    /* renamed from: b */
    public static final Years f14121b = new Years(1);
    /* renamed from: c */
    public static final Years f14122c = new Years(2);
    /* renamed from: d */
    public static final Years f14123d = new Years(3);
    /* renamed from: e */
    public static final Years f14124e = new Years(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    /* renamed from: f */
    public static final Years f14125f = new Years(Integer.MIN_VALUE);
    /* renamed from: g */
    private static final C19326m f14126g = C19323h.a().a(PeriodType.c());
    private static final long serialVersionUID = 87525275727380868L;

    /* renamed from: a */
    public static Years m17403a(int i) {
        if (i == Integer.MIN_VALUE) {
            return f14125f;
        }
        if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return f14124e;
        }
        switch (i) {
            case 0:
                return f14120a;
            case 1:
                return f14121b;
            case 2:
                return f14122c;
            case 3:
                return f14123d;
            default:
                return new Years(i);
        }
    }

    /* renamed from: a */
    public static Years m17404a(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if ((readablePartial instanceof LocalDate) && (readablePartial2 instanceof LocalDate)) {
            return m17403a(DateTimeUtils.a(readablePartial.getChronology()).D().c(((LocalDate) readablePartial2).mo3939b(), ((LocalDate) readablePartial).mo3939b()));
        }
        return m17403a(BaseSingleFieldPeriod.m15482a(readablePartial, readablePartial2, f14120a));
    }

    private Years(int i) {
        super(i);
    }

    private Object readResolve() {
        return m17403a(m15485c());
    }

    /* renamed from: a */
    public DurationFieldType mo3624a() {
        return DurationFieldType.j();
    }

    public PeriodType getPeriodType() {
        return PeriodType.c();
    }

    /* renamed from: b */
    public int m17406b() {
        return m15485c();
    }

    @ToString
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("P");
        stringBuilder.append(String.valueOf(m15485c()));
        stringBuilder.append("Y");
        return stringBuilder.toString();
    }
}
