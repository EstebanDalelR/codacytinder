package org.joda.time.field;

import org.joda.time.DurationFieldType;

public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    /* renamed from: a */
    private final long f61413a;

    /* renamed from: c */
    public final boolean mo14560c() {
        return true;
    }

    public PreciseDurationField(DurationFieldType durationFieldType, long j) {
        super(durationFieldType);
        this.f61413a = j;
    }

    /* renamed from: d */
    public final long mo14561d() {
        return this.f61413a;
    }

    /* renamed from: a */
    public long mo14558a(long j, int i) {
        return C19314d.m69089a(j, ((long) i) * this.f61413a);
    }

    /* renamed from: a */
    public long mo14559a(long j, long j2) {
        return C19314d.m69089a(j, C19314d.m69094c(j2, this.f61413a));
    }

    /* renamed from: d */
    public long mo14562d(long j, long j2) {
        return C19314d.m69093b(j, j2) / this.f61413a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreciseDurationField)) {
            return false;
        }
        PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
        if (mo14521a() != preciseDurationField.mo14521a() || this.f61413a != preciseDurationField.f61413a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.f61413a;
        return ((int) (j ^ (j >>> 32))) + mo14521a().hashCode();
    }
}
