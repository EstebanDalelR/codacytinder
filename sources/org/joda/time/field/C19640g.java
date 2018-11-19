package org.joda.time.field;

import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.g */
public abstract class C19640g extends C19482a {
    /* renamed from: a */
    final long f61421a;
    /* renamed from: b */
    private final C19306c f61422b;

    /* renamed from: g */
    public int mo14553g() {
        return 0;
    }

    public C19640g(DateTimeFieldType dateTimeFieldType, C19306c c19306c) {
        super(dateTimeFieldType);
        if (c19306c.mo14560c() == null) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        this.f61421a = c19306c.mo14561d();
        if (this.f61421a < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.f61422b = c19306c;
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, mo14553g(), mo14803d(j, i));
        return j + (((long) (i - mo14524a(j))) * this.f61421a);
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        if (j >= 0) {
            return j - (j % this.f61421a);
        }
        long j2 = j + 1;
        return (j2 - (j2 % this.f61421a)) - this.f61421a;
    }

    /* renamed from: e */
    public long mo14549e(long j) {
        if (j <= 0) {
            return j - (j % this.f61421a);
        }
        long j2 = j - 1;
        return (j2 - (j2 % this.f61421a)) + this.f61421a;
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        if (j >= 0) {
            return j % this.f61421a;
        }
        return (((j + 1) % this.f61421a) + this.f61421a) - 1;
    }

    /* renamed from: d */
    public C19306c mo14548d() {
        return this.f61422b;
    }

    /* renamed from: i */
    public final long m70854i() {
        return this.f61421a;
    }

    /* renamed from: d */
    protected int mo14803d(long j, int i) {
        return mo14544c(j);
    }
}
