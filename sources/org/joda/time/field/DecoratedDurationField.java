package org.joda.time.field;

import org.joda.time.C19306c;
import org.joda.time.DurationFieldType;

public class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    /* renamed from: a */
    private final C19306c f61409a;

    public DecoratedDurationField(C19306c c19306c, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (c19306c == null) {
            throw new IllegalArgumentException("The field must not be null");
        } else if (c19306c.mo14522b() == null) {
            throw new IllegalArgumentException("The field must be supported");
        } else {
            this.f61409a = c19306c;
        }
    }

    /* renamed from: f */
    public final C19306c m70817f() {
        return this.f61409a;
    }

    /* renamed from: c */
    public boolean mo14560c() {
        return this.f61409a.mo14560c();
    }

    /* renamed from: a */
    public long mo14558a(long j, int i) {
        return this.f61409a.mo14558a(j, i);
    }

    /* renamed from: a */
    public long mo14559a(long j, long j2) {
        return this.f61409a.mo14559a(j, j2);
    }

    /* renamed from: d */
    public long mo14562d(long j, long j2) {
        return this.f61409a.mo14562d(j, j2);
    }

    /* renamed from: d */
    public long mo14561d() {
        return this.f61409a.mo14561d();
    }
}
