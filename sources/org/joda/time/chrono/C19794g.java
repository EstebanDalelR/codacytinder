package org.joda.time.chrono;

import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C19314d;
import org.joda.time.field.ImpreciseDateTimeField;

/* renamed from: org.joda.time.chrono.g */
class C19794g extends ImpreciseDateTimeField {
    /* renamed from: a */
    protected final BasicChronology f61924a;

    /* renamed from: e */
    public C19306c mo14550e() {
        return null;
    }

    C19794g(BasicChronology basicChronology) {
        super(DateTimeFieldType.m68893s(), basicChronology.mo14857T());
        this.f61924a = basicChronology;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        return this.f61924a.mo14876a(j);
    }

    /* renamed from: a */
    public long mo14528a(long j, int i) {
        if (i == 0) {
            return j;
        }
        return mo14538b(j, C19314d.m69086a(mo14524a(j), i));
    }

    /* renamed from: a */
    public long mo14529a(long j, long j2) {
        return mo14528a(j, C19314d.m69087a(j2));
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, this.f61924a.mo14872Q(), this.f61924a.mo14873R());
        return this.f61924a.mo14868f(j, i);
    }

    /* renamed from: c */
    public long mo14804c(long j, int i) {
        C19314d.m69091a((C19305b) this, i, this.f61924a.mo14872Q() - 1, this.f61924a.mo14873R() + 1);
        return this.f61924a.mo14868f(j, i);
    }

    /* renamed from: c */
    public long mo14545c(long j, long j2) {
        if (j < j2) {
            return -this.f61924a.mo14861a(j2, j);
        }
        return this.f61924a.mo14861a(j, j2);
    }

    /* renamed from: b */
    public boolean mo14543b(long j) {
        return this.f61924a.mo14866e(mo14524a(j));
    }

    /* renamed from: f */
    public C19306c mo14552f() {
        return this.f61924a.mo14513s();
    }

    /* renamed from: g */
    public int mo14553g() {
        return this.f61924a.mo14872Q();
    }

    /* renamed from: h */
    public int mo14555h() {
        return this.f61924a.mo14873R();
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        return this.f61924a.m71140d(mo14524a(j));
    }

    /* renamed from: e */
    public long mo14549e(long j) {
        int a = mo14524a(j);
        return j != this.f61924a.m71140d(a) ? this.f61924a.m71140d(a + 1) : j;
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        return j - mo14547d(j);
    }
}
