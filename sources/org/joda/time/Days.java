package org.joda.time;

import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.format.C19323h;
import org.joda.time.format.C19326m;

public final class Days extends BaseSingleFieldPeriod {
    /* renamed from: a */
    public static final Days f14088a = new Days(0);
    /* renamed from: b */
    public static final Days f14089b = new Days(1);
    /* renamed from: c */
    public static final Days f14090c = new Days(2);
    /* renamed from: d */
    public static final Days f14091d = new Days(3);
    /* renamed from: e */
    public static final Days f14092e = new Days(4);
    /* renamed from: f */
    public static final Days f14093f = new Days(5);
    /* renamed from: g */
    public static final Days f14094g = new Days(6);
    /* renamed from: h */
    public static final Days f14095h = new Days(7);
    /* renamed from: i */
    public static final Days f14096i = new Days(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    /* renamed from: j */
    public static final Days f14097j = new Days(Integer.MIN_VALUE);
    /* renamed from: k */
    private static final C19326m f14098k = C19323h.a().a(PeriodType.e());
    private static final long serialVersionUID = 87525275727380865L;

    /* renamed from: a */
    public static Days m17386a(int i) {
        if (i == Integer.MIN_VALUE) {
            return f14097j;
        }
        if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return f14096i;
        }
        switch (i) {
            case 0:
                return f14088a;
            case 1:
                return f14089b;
            case 2:
                return f14090c;
            case 3:
                return f14091d;
            case 4:
                return f14092e;
            case 5:
                return f14093f;
            case 6:
                return f14094g;
            case 7:
                return f14095h;
            default:
                return new Days(i);
        }
    }

    /* renamed from: a */
    public static Days m17387a(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return m17386a(BaseSingleFieldPeriod.m15481a(readableInstant, readableInstant2, DurationFieldType.f()));
    }

    /* renamed from: a */
    public static Days m17388a(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if ((readablePartial instanceof LocalDate) && (readablePartial2 instanceof LocalDate)) {
            return m17386a(DateTimeUtils.a(readablePartial.getChronology()).s().c(((LocalDate) readablePartial2).mo3939b(), ((LocalDate) readablePartial).mo3939b()));
        }
        return m17386a(BaseSingleFieldPeriod.m15482a(readablePartial, readablePartial2, f14088a));
    }

    private Days(int i) {
        super(i);
    }

    private Object readResolve() {
        return m17386a(m15485c());
    }

    /* renamed from: a */
    public DurationFieldType mo3624a() {
        return DurationFieldType.f();
    }

    public PeriodType getPeriodType() {
        return PeriodType.e();
    }

    /* renamed from: b */
    public int m17391b() {
        return m15485c();
    }

    /* renamed from: a */
    public boolean m17390a(Days days) {
        boolean z = false;
        if (days == null) {
            if (m15485c() > null) {
                z = true;
            }
            return z;
        }
        if (m15485c() > days.m15485c()) {
            z = true;
        }
        return z;
    }

    @ToString
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("P");
        stringBuilder.append(String.valueOf(m15485c()));
        stringBuilder.append("D");
        return stringBuilder.toString();
    }
}
