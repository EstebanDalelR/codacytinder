package org.joda.time.field;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import org.joda.time.C19305b;
import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.e */
public class C19799e extends C19639b {
    /* renamed from: a */
    private final int f61934a;
    /* renamed from: b */
    private final int f61935b;
    /* renamed from: c */
    private final int f61936c;

    public C19799e(C19305b c19305b, int i) {
        this(c19305b, c19305b == null ? null : c19305b.mo14534a(), i, Integer.MIN_VALUE, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public C19799e(C19305b c19305b, DateTimeFieldType dateTimeFieldType, int i) {
        this(c19305b, dateTimeFieldType, i, Integer.MIN_VALUE, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public C19799e(C19305b c19305b, DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        super(c19305b, dateTimeFieldType);
        if (i == 0) {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
        this.f61934a = i;
        if (i2 < c19305b.mo14553g() + i) {
            this.f61935b = c19305b.mo14553g() + i;
        } else {
            this.f61935b = i2;
        }
        if (i3 > c19305b.mo14555h() + i) {
            this.f61936c = c19305b.mo14555h() + i;
        } else {
            this.f61936c = i3;
        }
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        return super.mo14524a(j) + this.f61934a;
    }

    /* renamed from: a */
    public long mo14528a(long j, int i) {
        j = super.mo14528a(j, i);
        C19314d.m69091a((C19305b) this, mo14524a(j), this.f61935b, this.f61936c);
        return j;
    }

    /* renamed from: a */
    public long mo14529a(long j, long j2) {
        j = super.mo14529a(j, j2);
        C19314d.m69091a((C19305b) this, mo14524a(j), this.f61935b, this.f61936c);
        return j;
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, this.f61935b, this.f61936c);
        return super.mo14538b(j, i - this.f61934a);
    }

    /* renamed from: b */
    public boolean mo14543b(long j) {
        return m70847i().mo14543b(j);
    }

    /* renamed from: f */
    public C19306c mo14552f() {
        return m70847i().mo14552f();
    }

    /* renamed from: g */
    public int mo14553g() {
        return this.f61935b;
    }

    /* renamed from: h */
    public int mo14555h() {
        return this.f61936c;
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
