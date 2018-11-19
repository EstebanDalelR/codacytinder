package org.joda.time.field;

import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.h */
public class C19801h extends C19639b {
    /* renamed from: a */
    final int f61939a;
    /* renamed from: b */
    final C19306c f61940b;
    /* renamed from: c */
    final C19306c f61941c;

    /* renamed from: g */
    public int mo14553g() {
        return 0;
    }

    public C19801h(C19305b c19305b, C19306c c19306c, DateTimeFieldType dateTimeFieldType, int i) {
        super(c19305b, dateTimeFieldType);
        if (i < 2) {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        this.f61941c = c19306c;
        this.f61940b = c19305b.mo14548d();
        this.f61939a = i;
    }

    public C19801h(C19798c c19798c) {
        this(c19798c, c19798c.mo14534a());
    }

    public C19801h(C19798c c19798c, DateTimeFieldType dateTimeFieldType) {
        this(c19798c, c19798c.m70847i().mo14548d(), dateTimeFieldType);
    }

    public C19801h(C19798c c19798c, C19306c c19306c, DateTimeFieldType dateTimeFieldType) {
        super(c19798c.m70847i(), dateTimeFieldType);
        this.f61939a = c19798c.f61929a;
        this.f61940b = c19306c;
        this.f61941c = c19798c.f61930b;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        j = m70847i().mo14524a(j);
        if (j >= null) {
            return j % this.f61939a;
        }
        return (this.f61939a - 1) + ((j + 1) % this.f61939a);
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, 0, this.f61939a - 1);
        return m70847i().mo14538b(j, (m71378a(m70847i().mo14524a(j)) * this.f61939a) + i);
    }

    /* renamed from: d */
    public C19306c mo14548d() {
        return this.f61940b;
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        return this.f61941c;
    }

    /* renamed from: h */
    public int mo14555h() {
        return this.f61939a - 1;
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        return m70847i().mo14547d(j);
    }

    /* renamed from: e */
    public long mo14549e(long j) {
        return m70847i().mo14549e(j);
    }

    /* renamed from: f */
    public long mo14551f(long j) {
        return m70847i().mo14551f(j);
    }

    /* renamed from: g */
    public long mo14554g(long j) {
        return m70847i().mo14554g(j);
    }

    /* renamed from: h */
    public long mo14556h(long j) {
        return m70847i().mo14556h(j);
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        return m70847i().mo14557i(j);
    }

    /* renamed from: a */
    private int m71378a(int i) {
        if (i >= 0) {
            return i / this.f61939a;
        }
        return ((i + 1) / this.f61939a) - 1;
    }
}
