package org.joda.time.field;

import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadablePartial;

/* renamed from: org.joda.time.field.i */
public final class C19802i extends C19639b {
    /* renamed from: a */
    public int mo14526a(ReadablePartial readablePartial) {
        return 1;
    }

    /* renamed from: a */
    public int mo14527a(ReadablePartial readablePartial, int[] iArr) {
        return 1;
    }

    /* renamed from: g */
    public int mo14553g() {
        return 1;
    }

    public C19802i(C19305b c19305b, DateTimeFieldType dateTimeFieldType) {
        super(c19305b, dateTimeFieldType);
        if (c19305b.mo14553g() != null) {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        }
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        j = m70847i().mo14524a(j);
        return j == null ? mo14555h() : j;
    }

    /* renamed from: a */
    public long mo14528a(long j, int i) {
        return m70847i().mo14528a(j, i);
    }

    /* renamed from: a */
    public long mo14529a(long j, long j2) {
        return m70847i().mo14529a(j, j2);
    }

    /* renamed from: b */
    public int mo14535b(long j, long j2) {
        return m70847i().mo14535b(j, j2);
    }

    /* renamed from: c */
    public long mo14545c(long j, long j2) {
        return m70847i().mo14545c(j, j2);
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        int h = mo14555h();
        C19314d.m69091a((C19305b) this, i, 1, h);
        if (i == h) {
            i = 0;
        }
        return m70847i().mo14538b(j, i);
    }

    /* renamed from: b */
    public boolean mo14543b(long j) {
        return m70847i().mo14543b(j);
    }

    /* renamed from: f */
    public C19306c mo14552f() {
        return m70847i().mo14552f();
    }

    /* renamed from: h */
    public int mo14555h() {
        return m70847i().mo14555h() + 1;
    }

    /* renamed from: c */
    public int mo14544c(long j) {
        return m70847i().mo14544c(j) + 1;
    }

    /* renamed from: b */
    public int mo14536b(ReadablePartial readablePartial) {
        return m70847i().mo14536b(readablePartial) + 1;
    }

    /* renamed from: b */
    public int mo14537b(ReadablePartial readablePartial, int[] iArr) {
        return m70847i().mo14537b(readablePartial, iArr) + 1;
    }

    /* renamed from: d */
    public long mo14547d(long j) {
        return m70847i().mo14547d(j);
    }

    /* renamed from: e */
    public long mo14549e(long j) {
        return m70847i().mo14549e(j);
    }

    /* renamed from: f */
    public long mo14551f(long j) {
        return m70847i().mo14551f(j);
    }

    /* renamed from: g */
    public long mo14554g(long j) {
        return m70847i().mo14554g(j);
    }

    /* renamed from: h */
    public long mo14556h(long j) {
        return m70847i().mo14556h(j);
    }

    /* renamed from: i */
    public long mo14557i(long j) {
        return m70847i().mo14557i(j);
    }
}
