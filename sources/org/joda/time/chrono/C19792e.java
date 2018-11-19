package org.joda.time.chrono;

import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadablePartial;
import org.joda.time.field.C19640g;

/* renamed from: org.joda.time.chrono.e */
final class C19792e extends C19640g {
    /* renamed from: b */
    private final BasicChronology f61922b;

    /* renamed from: g */
    public int mo14553g() {
        return 1;
    }

    /* renamed from: h */
    public int mo14555h() {
        return 53;
    }

    C19792e(BasicChronology basicChronology, C19306c c19306c) {
        super(DateTimeFieldType.m68889o(), c19306c);
        this.f61922b = basicChronology;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        return this.f61922b.m71145f(j);
    }

    /* renamed from: e */
    public C19306c mo14550e() {
        return this.f61922b.mo14519y();
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        return super.mo14547d(j + 259200000) - 259200000;
    }

    /* renamed from: e */
    public long mo14549e(long j) {
        return super.mo14549e(j + 259200000) - 259200000;
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        return super.mo14557i(j + 259200000);
    }

    /* renamed from: c */
    public int mo14544c(long j) {
        return this.f61922b.m71129b(this.f61922b.m71141e(j));
    }

    /* renamed from: b */
    public int mo14536b(ReadablePartial readablePartial) {
        if (!readablePartial.isSupported(DateTimeFieldType.m68890p())) {
            return 53;
        }
        return this.f61922b.m71129b(readablePartial.get(DateTimeFieldType.m68890p()));
    }

    /* renamed from: b */
    public int mo14537b(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i = 0; i < size; i++) {
            if (readablePartial.getFieldType(i) == DateTimeFieldType.m68890p()) {
                return this.f61922b.m71129b(iArr[i]);
            }
        }
        return 53;
    }

    /* renamed from: d */
    protected int mo14803d(long j, int i) {
        return i > 52 ? mo14544c(j) : 52;
    }
}
