package org.joda.time;

import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.format.C19323h;
import org.joda.time.format.C19326m;

public final class Weeks extends BaseSingleFieldPeriod {
    /* renamed from: a */
    public static final Weeks f14113a = new Weeks(0);
    /* renamed from: b */
    public static final Weeks f14114b = new Weeks(1);
    /* renamed from: c */
    public static final Weeks f14115c = new Weeks(2);
    /* renamed from: d */
    public static final Weeks f14116d = new Weeks(3);
    /* renamed from: e */
    public static final Weeks f14117e = new Weeks(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    /* renamed from: f */
    public static final Weeks f14118f = new Weeks(Integer.MIN_VALUE);
    /* renamed from: g */
    private static final C19326m f14119g = C19323h.a().a(PeriodType.d());
    private static final long serialVersionUID = 87525275727380866L;

    /* renamed from: a */
    public static Weeks m17401a(int i) {
        if (i == Integer.MIN_VALUE) {
            return f14118f;
        }
        if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return f14117e;
        }
        switch (i) {
            case 0:
                return f14113a;
            case 1:
                return f14114b;
            case 2:
                return f14115c;
            case 3:
                return f14116d;
            default:
                return new Weeks(i);
        }
    }

    private Weeks(int i) {
        super(i);
    }

    private Object readResolve() {
        return m17401a(m15485c());
    }

    /* renamed from: a */
    public DurationFieldType mo3624a() {
        return DurationFieldType.g();
    }

    public PeriodType getPeriodType() {
        return PeriodType.d();
    }

    @ToString
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("P");
        stringBuilder.append(String.valueOf(m15485c()));
        stringBuilder.append("W");
        return stringBuilder.toString();
    }
}
