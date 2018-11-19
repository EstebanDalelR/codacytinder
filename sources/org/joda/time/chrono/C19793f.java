package org.joda.time.chrono;

import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C19314d;
import org.joda.time.field.ImpreciseDateTimeField;

/* renamed from: org.joda.time.chrono.f */
final class C19793f extends ImpreciseDateTimeField {
    /* renamed from: a */
    private final BasicChronology f61923a;

    /* renamed from: e */
    public C19306c mo14550e() {
        return null;
    }

    C19793f(BasicChronology basicChronology) {
        super(DateTimeFieldType.m68890p(), basicChronology.mo14857T());
        this.f61923a = basicChronology;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        return this.f61923a.m71141e(j);
    }

    /* renamed from: a */
    public long mo14528a(long j, int i) {
        return i == 0 ? j : mo14538b(j, mo14524a(j) + i);
    }

    /* renamed from: a */
    public long mo14529a(long j, long j2) {
        return mo14528a(j, C19314d.m69087a(j2));
    }

    /* renamed from: c */
    public long mo14545c(long j, long j2) {
        if (j < j2) {
            return (long) (-mo14535b(j2, j));
        }
        int a = mo14524a(j);
        int a2 = mo14524a(j2);
        j = mo14557i(j);
        j2 = mo14557i(j2);
        if (j2 >= 31449600000L && this.f61923a.m71129b(a) <= 52) {
            j2 -= 604800000;
        }
        a -= a2;
        if (j < j2) {
            a--;
        }
        return (long) a;
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, Math.abs(i), this.f61923a.mo14872Q(), this.f61923a.mo14873R());
        int a = mo14524a(j);
        if (a == i) {
            return j;
        }
        int g = this.f61923a.m71147g(j);
        a = this.f61923a.m71129b(a);
        int b = this.f61923a.m71129b(i);
        if (b < a) {
            a = b;
        }
        b = this.f61923a.m71145f(j);
        if (b <= a) {
            a = b;
        }
        j = this.f61923a.mo14868f(j, i);
        b = mo14524a(j);
        long j2 = b < i ? j + 604800000 : b > i ? j - 604800000 : j;
        return this.f61923a.mo14514t().mo14538b(j2 + (((long) (a - this.f61923a.m71145f(j2))) * 604800000), g);
    }

    /* renamed from: b */
    public boolean mo14543b(long j) {
        return this.f61923a.m71129b(this.f61923a.m71141e(j)) > 52 ? 1 : 0;
    }

    /* renamed from: f */
    public C19306c mo14552f() {
        return this.f61923a.mo14517w();
    }

    /* renamed from: g */
    public int mo14553g() {
        return this.f61923a.mo14872Q();
    }

    /* renamed from: h */
    public int mo14555h() {
        return this.f61923a.mo14873R();
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        j = this.f61923a.mo14518x().mo14547d(j);
        int f = this.f61923a.m71145f(j);
        return f > 1 ? j - (((long) (f - 1)) * 604800000) : j;
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        return j - mo14547d(j);
    }
}
