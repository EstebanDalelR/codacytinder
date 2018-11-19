package org.joda.time.field;

import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.b */
public abstract class C19639b extends C19482a {
    /* renamed from: a */
    private final C19305b f61420a;

    protected C19639b(C19305b c19305b, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeFieldType);
        if (c19305b == null) {
            throw new IllegalArgumentException("The field must not be null");
        } else if (c19305b.mo14546c() == null) {
            throw new IllegalArgumentException("The field must be supported");
        } else {
            this.f61420a = c19305b;
        }
    }

    /* renamed from: i */
    public final C19305b m70847i() {
        return this.f61420a;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        return this.f61420a.mo14524a(j);
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        return this.f61420a.mo14538b(j, i);
    }

    /* renamed from: d */
    public C19306c mo14548d() {
        return this.f61420a.mo14548d();
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        return this.f61420a.mo14550e();
    }

    /* renamed from: g */
    public int mo14553g() {
        return this.f61420a.mo14553g();
    }

    /* renamed from: h */
    public int mo14555h() {
        return this.f61420a.mo14555h();
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        return this.f61420a.mo14547d(j);
    }
}
