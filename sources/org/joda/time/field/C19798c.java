package org.joda.time.field;

import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.c */
public class C19798c extends C19639b {
    /* renamed from: a */
    final int f61929a;
    /* renamed from: b */
    final C19306c f61930b;
    /* renamed from: c */
    final C19306c f61931c;
    /* renamed from: d */
    private final int f61932d;
    /* renamed from: e */
    private final int f61933e;

    public C19798c(C19305b c19305b, DateTimeFieldType dateTimeFieldType, int i) {
        this(c19305b, c19305b.mo14550e(), dateTimeFieldType, i);
    }

    public C19798c(C19305b c19305b, C19306c c19306c, DateTimeFieldType dateTimeFieldType, int i) {
        super(c19305b, dateTimeFieldType);
        if (i < 2) {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        C19306c d = c19305b.mo14548d();
        if (d == null) {
            this.f61930b = null;
        } else {
            this.f61930b = new ScaledDurationField(d, dateTimeFieldType.mo14454y(), i);
        }
        this.f61931c = c19306c;
        this.f61929a = i;
        c19306c = c19305b.mo14553g();
        c19306c = c19306c >= null ? c19306c / i : ((c19306c + 1) / i) - 1;
        c19305b = c19305b.mo14555h();
        c19305b = c19305b >= null ? c19305b / i : ((c19305b + 1) / i) - 1;
        this.f61932d = c19306c;
        this.f61933e = c19305b;
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        if (this.f61931c != null) {
            return this.f61931c;
        }
        return super.mo14550e();
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        j = m70847i().mo14524a(j);
        if (j >= null) {
            return j / this.f61929a;
        }
        return ((j + 1) / this.f61929a) - 1;
    }

    /* renamed from: a */
    public long mo14528a(long j, int i) {
        return m70847i().mo14528a(j, i * this.f61929a);
    }

    /* renamed from: a */
    public long mo14529a(long j, long j2) {
        return m70847i().mo14529a(j, j2 * ((long) this.f61929a));
    }

    /* renamed from: b */
    public int mo14535b(long j, long j2) {
        return m70847i().mo14535b(j, j2) / this.f61929a;
    }

    /* renamed from: c */
    public long mo14545c(long j, long j2) {
        return m70847i().mo14545c(j, j2) / ((long) this.f61929a);
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, this.f61932d, this.f61933e);
        return m70847i().mo14538b(j, (i * this.f61929a) + m71347a(m70847i().mo14524a(j)));
    }

    /* renamed from: d */
    public C19306c mo14548d() {
        return this.f61930b;
    }

    /* renamed from: g */
    public int mo14553g() {
        return this.f61932d;
    }

    /* renamed from: h */
    public int mo14555h() {
        return this.f61933e;
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        C19305b i = m70847i();
        return i.mo14547d(i.mo14538b(j, mo14524a(j) * this.f61929a));
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        return mo14538b(j, mo14524a(m70847i().mo14557i(j)));
    }

    /* renamed from: a */
    private int m71347a(int i) {
        if (i >= 0) {
            return i % this.f61929a;
        }
        return (this.f61929a - 1) + ((i + 1) % this.f61929a);
    }
}
