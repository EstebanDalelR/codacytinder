package org.joda.time.chrono;

import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C19314d;
import org.joda.time.field.C19639b;

/* renamed from: org.joda.time.chrono.n */
class C19797n extends C19639b {
    /* renamed from: a */
    static final C19305b f61927a = new C19797n();

    /* renamed from: g */
    public int mo14553g() {
        return 0;
    }

    private C19797n() {
        super(GregorianChronology.m71686Z().mo14480E(), DateTimeFieldType.m68894t());
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        return GregorianChronology.m71686Z().mo14485J();
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        j = m70847i().mo14524a(j);
        return j < null ? -j : j;
    }

    /* renamed from: a */
    public long mo14528a(long j, int i) {
        return m70847i().mo14528a(j, i);
    }

    /* renamed from: a */
    public long mo14529a(long j, long j2) {
        return m70847i().mo14529a(j, j2);
    }

    /* renamed from: b */
    public int mo14535b(long j, long j2) {
        return m70847i().mo14535b(j, j2);
    }

    /* renamed from: c */
    public long mo14545c(long j, long j2) {
        return m70847i().mo14545c(j, j2);
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, 0, mo14555h());
        if (m70847i().mo14524a(j) < 0) {
            i = -i;
        }
        return super.mo14538b(j, i);
    }

    /* renamed from: h */
    public int mo14555h() {
        return m70847i().mo14555h();
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        return m70847i().mo14547d(j);
    }

    /* renamed from: e */
    public long mo14549e(long j) {
        return m70847i().mo14549e(j);
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        return m70847i().mo14557i(j);
    }
}
