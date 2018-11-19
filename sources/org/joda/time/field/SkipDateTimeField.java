package org.joda.time.field;

import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

public final class SkipDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -8869148464118507846L;
    /* renamed from: a */
    private final C19304a f61414a;
    /* renamed from: b */
    private final int f61415b;
    /* renamed from: c */
    private transient int f61416c;

    public SkipDateTimeField(C19304a c19304a, C19305b c19305b) {
        this(c19304a, c19305b, 0);
    }

    public SkipDateTimeField(C19304a c19304a, C19305b c19305b, int i) {
        super(c19305b);
        this.f61414a = c19304a;
        c19304a = super.mo14553g();
        if (c19304a < i) {
            this.f61416c = c19304a - 1;
        } else if (c19304a == i) {
            this.f61416c = i + 1;
        } else {
            this.f61416c = c19304a;
        }
        this.f61415b = i;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        j = super.mo14524a(j);
        return j <= this.f61415b ? j - 1 : j;
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, this.f61416c, mo14555h());
        if (i <= this.f61415b) {
            if (i == this.f61415b) {
                throw new IllegalFieldValueException(DateTimeFieldType.m68893s(), Integer.valueOf(i), null, null);
            }
            i++;
        }
        return super.mo14538b(j, i);
    }

    /* renamed from: g */
    public int mo14553g() {
        return this.f61416c;
    }

    private Object readResolve() {
        return mo14534a().mo14453a(this.f61414a);
    }
}
