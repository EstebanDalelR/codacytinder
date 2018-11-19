package org.joda.time.chrono;

import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadablePartial;
import org.joda.time.field.C19640g;

/* renamed from: org.joda.time.chrono.a */
final class C19789a extends C19640g {
    /* renamed from: b */
    private final BasicChronology f61917b;

    /* renamed from: g */
    public int mo14553g() {
        return 1;
    }

    C19789a(BasicChronology basicChronology, C19306c c19306c) {
        super(DateTimeFieldType.m68887m(), c19306c);
        this.f61917b = basicChronology;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        return this.f61917b.mo14864c(j);
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        return this.f61917b.mo14477B();
    }

    /* renamed from: h */
    public int mo14555h() {
        return this.f61917b.mo14855P();
    }

    /* renamed from: c */
    public int mo14544c(long j) {
        return this.f61917b.m71151i(j);
    }

    /* renamed from: b */
    public int mo14536b(ReadablePartial readablePartial) {
        if (!readablePartial.isSupported(DateTimeFieldType.m68892r())) {
            return mo14555h();
        }
        int i = readablePartial.get(DateTimeFieldType.m68892r());
        if (!readablePartial.isSupported(DateTimeFieldType.m68893s())) {
            return this.f61917b.mo14867f(i);
        }
        return this.f61917b.mo14862b(readablePartial.get(DateTimeFieldType.m68893s()), i);
    }

    /* renamed from: b */
    public int mo14537b(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i = 0; i < size; i++) {
            if (readablePartial.getFieldType(i) == DateTimeFieldType.m68892r()) {
                i = iArr[i];
                for (int i2 = 0; i2 < size; i2++) {
                    if (readablePartial.getFieldType(i2) == DateTimeFieldType.m68893s()) {
                        return this.f61917b.mo14862b(iArr[i2], i);
                    }
                }
                return this.f61917b.mo14867f(i);
            }
        }
        return mo14555h();
    }

    /* renamed from: d */
    protected int mo14803d(long j, int i) {
        return this.f61917b.mo14869e(j, i);
    }

    /* renamed from: b */
    public boolean mo14543b(long j) {
        return this.f61917b.mo14870j(j);
    }
}
