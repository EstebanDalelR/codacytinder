package org.joda.time.chrono;

import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C19314d;
import org.joda.time.field.ImpreciseDateTimeField;

/* renamed from: org.joda.time.chrono.c */
class C19791c extends ImpreciseDateTimeField {
    /* renamed from: a */
    private final BasicChronology f61919a;
    /* renamed from: c */
    private final int f61920c = this.f61919a.mo14856S();
    /* renamed from: d */
    private final int f61921d;

    /* renamed from: g */
    public int mo14553g() {
        return 1;
    }

    C19791c(BasicChronology basicChronology, int i) {
        super(DateTimeFieldType.m68892r(), basicChronology.mo14859V());
        this.f61919a = basicChronology;
        this.f61921d = i;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        return this.f61919a.mo14863b(j);
    }

    /* renamed from: a */
    public long mo14528a(long j, int i) {
        if (i == 0) {
            return j;
        }
        long h = (long) this.f61919a.m71150h(j);
        int a = this.f61919a.mo14876a(j);
        int a2 = this.f61919a.mo14860a(j, a);
        int i2 = a2 - 1;
        int i3 = i2 + i;
        if (a2 <= 0 || i3 >= 0) {
            i = i3;
            i3 = a;
        } else {
            i3 = a + 1;
            i = (i - this.f61920c) + i2;
        }
        if (i >= 0) {
            i3 += i / this.f61920c;
            i = (i % this.f61920c) + 1;
        } else {
            i3 = (i3 + (i / this.f61920c)) - 1;
            i = Math.abs(i) % this.f61920c;
            if (i == 0) {
                i = this.f61920c;
            }
            i = (this.f61920c - i) + 1;
            if (i == 1) {
                i3++;
            }
        }
        int a3 = this.f61919a.m71121a(j, a, a2);
        int b = this.f61919a.mo14862b(i3, i);
        if (a3 > b) {
            a3 = b;
        }
        return this.f61919a.m71123a(i3, i, a3) + h;
    }

    /* renamed from: a */
    public long mo14529a(long j, long j2) {
        C19791c c19791c = this;
        long j3 = j;
        long j4 = j2;
        int i = (int) j4;
        if (((long) i) == j4) {
            return mo14528a(j3, i);
        }
        long j5;
        long j6;
        int a;
        int b;
        StringBuilder stringBuilder;
        long h = (long) c19791c.f61919a.m71150h(j3);
        int a2 = c19791c.f61919a.mo14876a(j3);
        int a3 = c19791c.f61919a.mo14860a(j3, a2);
        long j7 = ((long) (a3 - 1)) + j4;
        if (j7 >= 0) {
            j5 = ((long) a2) + (j7 / ((long) c19791c.f61920c));
            j6 = (j7 % ((long) c19791c.f61920c)) + 1;
        } else {
            j5 = (((long) a2) + (j7 / ((long) c19791c.f61920c))) - 1;
            int abs = (int) (Math.abs(j7) % ((long) c19791c.f61920c));
            if (abs == 0) {
                abs = c19791c.f61920c;
            }
            j6 = (long) ((c19791c.f61920c - abs) + 1);
            if (j6 == 1) {
                j7 = j5 + 1;
                if (j7 >= ((long) c19791c.f61919a.mo14872Q())) {
                    if (j7 > ((long) c19791c.f61919a.mo14873R())) {
                        int i2 = (int) j7;
                        int i3 = (int) j6;
                        a = c19791c.f61919a.m71121a(j3, a2, a3);
                        b = c19791c.f61919a.mo14862b(i2, i3);
                        if (a > b) {
                            a = b;
                        }
                        return c19791c.f61919a.m71123a(i2, i3, a) + h;
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Magnitude of add amount is too large: ");
                stringBuilder.append(j4);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        j7 = j5;
        if (j7 >= ((long) c19791c.f61919a.mo14872Q())) {
            if (j7 > ((long) c19791c.f61919a.mo14873R())) {
                int i22 = (int) j7;
                int i32 = (int) j6;
                a = c19791c.f61919a.m71121a(j3, a2, a3);
                b = c19791c.f61919a.mo14862b(i22, i32);
                if (a > b) {
                    a = b;
                }
                return c19791c.f61919a.m71123a(i22, i32, a) + h;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Magnitude of add amount is too large: ");
        stringBuilder.append(j4);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: c */
    public long mo14545c(long j, long j2) {
        if (j < j2) {
            return (long) (-mo14535b(j2, j));
        }
        int a = this.f61919a.mo14876a(j);
        int a2 = this.f61919a.mo14860a(j, a);
        int a3 = this.f61919a.mo14876a(j2);
        int a4 = this.f61919a.mo14860a(j2, a3);
        long j3 = ((((long) (a - a3)) * ((long) this.f61920c)) + ((long) a2)) - ((long) a4);
        int a5 = this.f61919a.m71121a(j, a, a2);
        if (a5 == this.f61919a.mo14862b(a, a2) && this.f61919a.m71121a(j2, a3, a4) > a5) {
            j2 = this.f61919a.mo14515u().mo14538b(j2, a5);
        }
        return j - this.f61919a.m71122a(a, a2) < j2 - this.f61919a.m71122a(a3, a4) ? j3 - 1 : j3;
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, 1, this.f61920c);
        int a = this.f61919a.mo14876a(j);
        int b = this.f61919a.m71132b(j, a);
        int b2 = this.f61919a.mo14862b(a, i);
        if (b > b2) {
            b = b2;
        }
        return this.f61919a.m71123a(a, i, b) + ((long) this.f61919a.m71150h(j));
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        return this.f61919a.mo14479D();
    }

    /* renamed from: b */
    public boolean mo14543b(long j) {
        int a = this.f61919a.mo14876a(j);
        boolean z = false;
        if (!this.f61919a.mo14866e(a)) {
            return false;
        }
        if (this.f61919a.mo14860a(j, a) == this.f61921d) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public C19306c mo14552f() {
        return this.f61919a.mo14513s();
    }

    /* renamed from: h */
    public int mo14555h() {
        return this.f61920c;
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        int a = this.f61919a.mo14876a(j);
        return this.f61919a.m71122a(a, this.f61919a.mo14860a(j, a));
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        return j - mo14547d(j);
    }
}
