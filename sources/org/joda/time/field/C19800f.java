package org.joda.time.field;

import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.f */
public class C19800f extends C19640g {
    /* renamed from: b */
    private final int f61937b;
    /* renamed from: c */
    private final C19306c f61938c;

    public C19800f(DateTimeFieldType dateTimeFieldType, C19306c c19306c, C19306c c19306c2) {
        super(dateTimeFieldType, c19306c);
        if (c19306c2.mo14560c() == null) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        this.f61937b = (int) (c19306c2.mo14561d() / m70854i());
        if (this.f61937b < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.f61938c = c19306c2;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        if (j >= 0) {
            return (int) ((j / m70854i()) % ((long) this.f61937b));
        }
        return (this.f61937b - 1) + ((int) (((j + 1) / m70854i()) % ((long) this.f61937b)));
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, mo14553g(), mo14555h());
        return j + (((long) (i - mo14524a(j))) * this.a);
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        return this.f61938c;
    }

    /* renamed from: h */
    public int mo14555h() {
        return this.f61937b - 1;
    }
}
