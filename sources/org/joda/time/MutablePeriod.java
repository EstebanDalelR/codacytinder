package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BasePeriod;
import org.joda.time.field.C19314d;

public class MutablePeriod extends BasePeriod implements Serializable, Cloneable, ReadWritablePeriod {
    private static final long serialVersionUID = 3436451121567212165L;

    public MutablePeriod() {
        super(0, null, null);
    }

    public MutablePeriod(long j, PeriodType periodType) {
        super(j, periodType, null);
    }

    public MutablePeriod(Object obj) {
        super(obj, null, null);
    }

    public MutablePeriod(Object obj, PeriodType periodType, C19304a c19304a) {
        super(obj, periodType, c19304a);
    }

    public void clear() {
        super.m70672a(new int[size()]);
    }

    public void setValue(int i, int i2) {
        super.setValue(i, i2);
    }

    public void set(DurationFieldType durationFieldType, int i) {
        super.m70671a(durationFieldType, i);
    }

    public void setPeriod(ReadablePeriod readablePeriod) {
        super.setPeriod(readablePeriod);
    }

    public void setPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super.setPeriod(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public void setPeriod(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            m71089a(0);
            return;
        }
        m71090a(readableInterval.getStartMillis(), readableInterval.getEndMillis(), DateTimeUtils.m68910a(readableInterval.getChronology()));
    }

    /* renamed from: a */
    public void m71090a(long j, long j2, C19304a c19304a) {
        m70672a((int[]) DateTimeUtils.m68910a(c19304a).mo14495a((ReadablePeriod) this, j, j2));
    }

    /* renamed from: a */
    public void m71089a(long j) {
        m71091a(j, null);
    }

    /* renamed from: a */
    public void m71091a(long j, C19304a c19304a) {
        m70672a((int[]) DateTimeUtils.m68910a(c19304a).mo14494a((ReadablePeriod) this, j));
    }

    public void add(DurationFieldType durationFieldType, int i) {
        super.m70675b(durationFieldType, i);
    }

    public void add(ReadablePeriod readablePeriod) {
        super.m70676b(readablePeriod);
    }

    public void add(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        setPeriod(C19314d.m69086a(m71088a(), i), C19314d.m69086a(m71092b(), i2), C19314d.m69086a(m71093c(), i3), C19314d.m69086a(m71094d(), i4), C19314d.m69086a(m71095e(), i5), C19314d.m69086a(m71096f(), i6), C19314d.m69086a(m71097g(), i7), C19314d.m69086a(m71098h(), i8));
    }

    public void add(ReadableInterval readableInterval) {
        if (readableInterval != null) {
            add(readableInterval.toPeriod(getPeriodType()));
        }
    }

    /* renamed from: a */
    public int m71088a() {
        return getPeriodType().m68943a(this, PeriodType.f60091a);
    }

    /* renamed from: b */
    public int m71092b() {
        return getPeriodType().m68943a(this, PeriodType.f60092b);
    }

    /* renamed from: c */
    public int m71093c() {
        return getPeriodType().m68943a(this, PeriodType.f60093c);
    }

    /* renamed from: d */
    public int m71094d() {
        return getPeriodType().m68943a(this, PeriodType.f60094d);
    }

    /* renamed from: e */
    public int m71095e() {
        return getPeriodType().m68943a(this, PeriodType.f60095e);
    }

    /* renamed from: f */
    public int m71096f() {
        return getPeriodType().m68943a(this, PeriodType.f60096f);
    }

    /* renamed from: g */
    public int m71097g() {
        return getPeriodType().m68943a(this, PeriodType.f60097g);
    }

    /* renamed from: h */
    public int m71098h() {
        return getPeriodType().m68943a(this, PeriodType.f60098h);
    }

    public void setYears(int i) {
        super.m70671a(DurationFieldType.m68927j(), i);
    }

    public void addYears(int i) {
        super.m70675b(DurationFieldType.m68927j(), i);
    }

    public void setMonths(int i) {
        super.m70671a(DurationFieldType.m68926i(), i);
    }

    public void addMonths(int i) {
        super.m70675b(DurationFieldType.m68926i(), i);
    }

    public void setWeeks(int i) {
        super.m70671a(DurationFieldType.m68924g(), i);
    }

    public void addWeeks(int i) {
        super.m70675b(DurationFieldType.m68924g(), i);
    }

    public void setDays(int i) {
        super.m70671a(DurationFieldType.m68923f(), i);
    }

    public void addDays(int i) {
        super.m70675b(DurationFieldType.m68923f(), i);
    }

    public void setHours(int i) {
        super.m70671a(DurationFieldType.m68921d(), i);
    }

    public void addHours(int i) {
        super.m70675b(DurationFieldType.m68921d(), i);
    }

    public void setMinutes(int i) {
        super.m70671a(DurationFieldType.m68920c(), i);
    }

    public void addMinutes(int i) {
        super.m70675b(DurationFieldType.m68920c(), i);
    }

    public void setSeconds(int i) {
        super.m70671a(DurationFieldType.m68919b(), i);
    }

    public void addSeconds(int i) {
        super.m70675b(DurationFieldType.m68919b(), i);
    }

    public void setMillis(int i) {
        super.m70671a(DurationFieldType.m68918a(), i);
    }

    public void addMillis(int i) {
        super.m70675b(DurationFieldType.m68918a(), i);
    }

    public java.lang.Object clone() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new java.lang.InternalError;
        r1 = "Clone error";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.MutablePeriod.clone():java.lang.Object");
    }
}
