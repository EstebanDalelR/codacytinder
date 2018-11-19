package org.joda.time;

/* renamed from: org.joda.time.c */
public abstract class C19306c implements Comparable<C19306c> {
    /* renamed from: a */
    public abstract long mo14558a(long j, int i);

    /* renamed from: a */
    public abstract long mo14559a(long j, long j2);

    /* renamed from: a */
    public abstract DurationFieldType mo14521a();

    /* renamed from: b */
    public abstract boolean mo14522b();

    /* renamed from: c */
    public abstract int mo14523c(long j, long j2);

    /* renamed from: c */
    public abstract boolean mo14560c();

    /* renamed from: d */
    public abstract long mo14561d();

    /* renamed from: d */
    public abstract long mo14562d(long j, long j2);

    /* renamed from: b */
    public long m69035b(long j, int i) {
        if (i == Integer.MIN_VALUE) {
            return m69036b(j, (long) i);
        }
        return mo14558a(j, -i);
    }

    /* renamed from: b */
    public long m69036b(long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            return mo14559a(j, -j2);
        }
        throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
    }
}
