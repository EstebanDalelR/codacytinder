package org.joda.time.chrono;

import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadablePartial;
import org.joda.time.field.C19640g;

/* renamed from: org.joda.time.chrono.b */
final class C19790b extends C19640g {
    /* renamed from: b */
    private final BasicChronology f61918b;

    /* renamed from: g */
    public int mo14553g() {
        return 1;
    }

    C19790b(BasicChronology basicChronology, C19306c c19306c) {
        super(DateTimeFieldType.m68888n(), c19306c);
        this.f61918b = basicChronology;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        return this.f61918b.m71138d(j);
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        return this.f61918b.mo14479D();
    }

    /* renamed from: h */
    public int mo14555h() {
        return this.f61918b.mo14871O();
    }

    /* renamed from: c */
    public int mo14544c(long j) {
        return this.f61918b.mo14875a(this.f61918b.mo14876a(j));
    }

    /* renamed from: b */
    public int mo14536b(ReadablePartial readablePartial) {
        if (!readablePartial.isSupported(DateTimeFieldType.m68893s())) {
            return this.f61918b.mo14871O();
        }
        return this.f61918b.mo14875a(readablePartial.get(DateTimeFieldType.m68893s()));
    }

    /* renamed from: b */
    public int mo14537b(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i = 0; i < size; i++) {
            if (readablePartial.getFieldType(i) == DateTimeFieldType.m68893s()) {
                return this.f61918b.mo14875a(iArr[i]);
            }
        }
        return this.f61918b.mo14871O();
    }

    /* renamed from: d */
    protected int mo14803d(long j, int i) {
        int O = this.f61918b.mo14871O() - 1;
        return (i > O || i < 1) ? mo14544c(j) : O;
    }

    /* renamed from: b */
    public boolean mo14543b(long j) {
        return this.f61918b.mo14870j(j);
    }
}
