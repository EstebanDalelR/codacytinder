package org.joda.time.field;

import org.joda.time.C19306c;
import org.joda.time.DurationFieldType;

public class ScaledDurationField extends DecoratedDurationField {
    private static final long serialVersionUID = -3205227092378684157L;
    /* renamed from: a */
    private final int f61928a;

    public ScaledDurationField(C19306c c19306c, DurationFieldType durationFieldType, int i) {
        super(c19306c, durationFieldType);
        if (i != 0) {
            if (i != 1) {
                this.f61928a = i;
                return;
            }
        }
        throw new IllegalArgumentException("The scalar must not be 0 or 1");
    }

    /* renamed from: a */
    public long mo14558a(long j, int i) {
        return m70817f().mo14559a(j, ((long) i) * ((long) this.f61928a));
    }

    /* renamed from: a */
    public long mo14559a(long j, long j2) {
        return m70817f().mo14559a(j, C19314d.m69088a(j2, this.f61928a));
    }

    /* renamed from: c */
    public int mo14523c(long j, long j2) {
        return m70817f().mo14523c(j, j2) / this.f61928a;
    }

    /* renamed from: d */
    public long mo14562d(long j, long j2) {
        return m70817f().mo14562d(j, j2) / ((long) this.f61928a);
    }

    /* renamed from: d */
    public long mo14561d() {
        return m70817f().mo14561d() * ((long) this.f61928a);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaledDurationField)) {
            return false;
        }
        ScaledDurationField scaledDurationField = (ScaledDurationField) obj;
        if (!m70817f().equals(scaledDurationField.m70817f()) || mo14521a() != scaledDurationField.mo14521a() || this.f61928a != scaledDurationField.f61928a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = (long) this.f61928a;
        return (((int) (j ^ (j >>> 32))) + mo14521a().hashCode()) + m70817f().hashCode();
    }
}
