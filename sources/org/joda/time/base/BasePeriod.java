package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C19304a;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.C19311c;
import org.joda.time.convert.PeriodConverter;
import org.joda.time.field.C19314d;

public abstract class BasePeriod extends C3964f implements Serializable, ReadablePeriod {
    /* renamed from: a */
    private static final ReadablePeriod f61340a = new C196241();
    private static final long serialVersionUID = -2110953284060001145L;
    /* renamed from: b */
    private final PeriodType f61341b;
    /* renamed from: c */
    private final int[] f61342c;

    /* renamed from: org.joda.time.base.BasePeriod$1 */
    static class C196241 extends C3964f {
        public int getValue(int i) {
            return 0;
        }

        C196241() {
        }

        public PeriodType getPeriodType() {
            return PeriodType.m68937b();
        }
    }

    protected BasePeriod(long j, long j2, PeriodType periodType, C19304a c19304a) {
        periodType = m70670a(periodType);
        C19304a a = DateTimeUtils.m68910a(c19304a);
        this.f61341b = periodType;
        this.f61342c = a.mo14495a((ReadablePeriod) this, j, j2);
    }

    protected BasePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        periodType = m70670a(periodType);
        if (readableInstant == null && readableInstant2 == null) {
            this.f61341b = periodType;
            this.f61342c = new int[size()];
            return;
        }
        long a = DateTimeUtils.m68904a(readableInstant);
        long a2 = DateTimeUtils.m68904a(readableInstant2);
        C19304a a3 = DateTimeUtils.m68908a(readableInstant, readableInstant2);
        this.f61341b = periodType;
        this.f61342c = a3.mo14495a((ReadablePeriod) this, a, a2);
    }

    protected BasePeriod(long j) {
        this.f61341b = PeriodType.m68936a();
        j = ISOChronology.m71188N().mo14494a(f61340a, j);
        this.f61342c = new int[8];
        System.arraycopy(j, 0, this.f61342c, 4, 4);
    }

    protected BasePeriod(long j, PeriodType periodType, C19304a c19304a) {
        periodType = m70670a(periodType);
        c19304a = DateTimeUtils.m68910a(c19304a);
        this.f61341b = periodType;
        this.f61342c = c19304a.mo14494a((ReadablePeriod) this, j);
    }

    protected BasePeriod(Object obj, PeriodType periodType, C19304a c19304a) {
        PeriodConverter c = C19311c.m69066a().m69069c(obj);
        if (periodType == null) {
            periodType = c.getPeriodType(obj);
        }
        periodType = m70670a(periodType);
        this.f61341b = periodType;
        if (this instanceof ReadWritablePeriod) {
            this.f61342c = new int[size()];
            c.setInto((ReadWritablePeriod) this, obj, DateTimeUtils.m68910a(c19304a));
            return;
        }
        this.f61342c = new MutablePeriod(obj, periodType, c19304a).i();
    }

    protected BasePeriod(int[] iArr, PeriodType periodType) {
        this.f61341b = periodType;
        this.f61342c = iArr;
    }

    /* renamed from: a */
    protected PeriodType m70670a(PeriodType periodType) {
        return DateTimeUtils.m68907a(periodType);
    }

    public PeriodType getPeriodType() {
        return this.f61341b;
    }

    public int getValue(int i) {
        return this.f61342c[i];
    }

    /* renamed from: a */
    private void m70667a(DurationFieldType durationFieldType, int[] iArr, int i) {
        int a = a(durationFieldType);
        if (a != -1) {
            iArr[a] = i;
        } else if (i != 0) {
            i = new StringBuilder();
            i.append("Period does not support field '");
            i.append(durationFieldType.m68931m());
            i.append("'");
            throw new IllegalArgumentException(i.toString());
        }
    }

    protected void setPeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            m70672a(new int[size()]);
        } else {
            mo14800a(readablePeriod);
        }
    }

    /* renamed from: a */
    private void mo14800a(ReadablePeriod readablePeriod) {
        int[] iArr = new int[size()];
        int size = readablePeriod.size();
        for (int i = 0; i < size; i++) {
            m70667a(readablePeriod.getFieldType(i), iArr, readablePeriod.getValue(i));
        }
        m70672a(iArr);
    }

    protected void setPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m70672a(m70669a(i, i2, i3, i4, i5, i6, i7, i8));
    }

    /* renamed from: a */
    private int[] m70669a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr = new int[size()];
        m70667a(DurationFieldType.m68927j(), iArr, i);
        m70667a(DurationFieldType.m68926i(), iArr, i2);
        m70667a(DurationFieldType.m68924g(), iArr, i3);
        m70667a(DurationFieldType.m68923f(), iArr, i4);
        m70667a(DurationFieldType.m68921d(), iArr, i5);
        m70667a(DurationFieldType.m68920c(), iArr, i6);
        m70667a(DurationFieldType.m68919b(), iArr, i7);
        m70667a(DurationFieldType.m68918a(), iArr, i8);
        return iArr;
    }

    /* renamed from: a */
    protected void m70671a(DurationFieldType durationFieldType, int i) {
        m70673a(this.f61342c, durationFieldType, i);
    }

    /* renamed from: a */
    protected void m70673a(int[] iArr, DurationFieldType durationFieldType, int i) {
        int a = a(durationFieldType);
        if (a != -1) {
            iArr[a] = i;
        } else if (i != 0 || durationFieldType == null) {
            i = new StringBuilder();
            i.append("Period does not support field '");
            i.append(durationFieldType);
            i.append("'");
            throw new IllegalArgumentException(i.toString());
        }
    }

    /* renamed from: b */
    protected void m70675b(DurationFieldType durationFieldType, int i) {
        m70677b(this.f61342c, durationFieldType, i);
    }

    /* renamed from: b */
    protected void m70677b(int[] iArr, DurationFieldType durationFieldType, int i) {
        int a = a(durationFieldType);
        if (a != -1) {
            iArr[a] = C19314d.m69086a(iArr[a], i);
        } else if (i != 0 || durationFieldType == null) {
            i = new StringBuilder();
            i.append("Period does not support field '");
            i.append(durationFieldType);
            i.append("'");
            throw new IllegalArgumentException(i.toString());
        }
    }

    /* renamed from: a */
    protected int[] m70674a(int[] iArr, ReadablePeriod readablePeriod) {
        int size = readablePeriod.size();
        for (int i = 0; i < size; i++) {
            m70667a(readablePeriod.getFieldType(i), iArr, readablePeriod.getValue(i));
        }
        return iArr;
    }

    /* renamed from: b */
    protected void m70676b(ReadablePeriod readablePeriod) {
        if (readablePeriod != null) {
            m70672a(m70678b(i(), readablePeriod));
        }
    }

    /* renamed from: b */
    protected int[] m70678b(int[] iArr, ReadablePeriod readablePeriod) {
        int size = readablePeriod.size();
        for (int i = 0; i < size; i++) {
            DurationFieldType fieldType = readablePeriod.getFieldType(i);
            int value = readablePeriod.getValue(i);
            if (value != 0) {
                int a = a(fieldType);
                if (a == -1) {
                    readablePeriod = new StringBuilder();
                    readablePeriod.append("Period does not support field '");
                    readablePeriod.append(fieldType.m68931m());
                    readablePeriod.append("'");
                    throw new IllegalArgumentException(readablePeriod.toString());
                }
                iArr[a] = C19314d.m69086a(getValue(a), value);
            }
        }
        return iArr;
    }

    protected void setValue(int i, int i2) {
        this.f61342c[i] = i2;
    }

    /* renamed from: a */
    protected void m70672a(int[] iArr) {
        System.arraycopy(iArr, 0, this.f61342c, 0, this.f61342c.length);
    }
}
