package org.joda.time.chrono;

import org.joda.time.C19304a;

abstract class BasicFixedMonthChronology extends BasicChronology {
    private static final long serialVersionUID = 261387371998L;

    /* renamed from: P */
    int mo14855P() {
        return 30;
    }

    /* renamed from: S */
    int mo14856S() {
        return 13;
    }

    /* renamed from: T */
    long mo14857T() {
        return 31557600000L;
    }

    /* renamed from: U */
    long mo14858U() {
        return 15778800000L;
    }

    /* renamed from: V */
    long mo14859V() {
        return 2592000000L;
    }

    /* renamed from: c */
    long mo14865c(int i, int i2) {
        return ((long) (i2 - 1)) * 2592000000L;
    }

    /* renamed from: e */
    boolean mo14866e(int i) {
        return (i & 3) == 3;
    }

    /* renamed from: f */
    int mo14867f(int i) {
        return i != 13 ? 30 : 6;
    }

    BasicFixedMonthChronology(C19304a c19304a, Object obj, int i) {
        super(c19304a, obj, i);
    }

    /* renamed from: f */
    long mo14868f(long j, int i) {
        int c = m71135c(j, mo14876a(j));
        j = m71150h(j);
        if (c > 365 && !mo14866e(i)) {
            c--;
        }
        return m71123a(i, 1, c) + ((long) j);
    }

    /* renamed from: a */
    long mo14861a(long j, long j2) {
        int a = mo14876a(j);
        int a2 = mo14876a(j2);
        a -= a2;
        if (j - m71140d(a) < j2 - m71140d(a2)) {
            a--;
        }
        return (long) a;
    }

    /* renamed from: c */
    int mo14864c(long j) {
        return ((m71138d(j) - 1) % 30) + 1;
    }

    /* renamed from: b */
    int mo14862b(int i, int i2) {
        if (i2 != 13) {
            return 30;
        }
        return mo14866e(i) != 0 ? 6 : 5;
    }

    /* renamed from: b */
    int mo14863b(long j) {
        return ((m71138d(j) - 1) / 30) + 1;
    }

    /* renamed from: a */
    int mo14860a(long j, int i) {
        return ((int) ((j - m71140d(i)) / 2592000000L)) + 1;
    }
}
