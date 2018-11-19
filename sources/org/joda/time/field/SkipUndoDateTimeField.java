package org.joda.time.field;

import org.joda.time.C19304a;
import org.joda.time.C19305b;

public final class SkipUndoDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -5875876968979L;
    /* renamed from: a */
    private final C19304a f61417a;
    /* renamed from: b */
    private final int f61418b;
    /* renamed from: c */
    private transient int f61419c;

    public SkipUndoDateTimeField(C19304a c19304a, C19305b c19305b) {
        this(c19304a, c19305b, 0);
    }

    public SkipUndoDateTimeField(C19304a c19304a, C19305b c19305b, int i) {
        super(c19305b);
        this.f61417a = c19304a;
        c19304a = super.mo14553g();
        if (c19304a < i) {
            this.f61419c = c19304a + 1;
        } else if (c19304a == i + 1) {
            this.f61419c = i;
        } else {
            this.f61419c = c19304a;
        }
        this.f61418b = i;
    }

    /* renamed from: a */
    public int mo14524a(long j) {
        j = super.mo14524a(j);
        return j < this.f61418b ? j + 1 : j;
    }

    /* renamed from: b */
    public long mo14538b(long j, int i) {
        C19314d.m69091a((C19305b) this, i, this.f61419c, mo14555h());
        if (i <= this.f61418b) {
            i--;
        }
        return super.mo14538b(j, i);
    }

    /* renamed from: g */
    public int mo14553g() {
        return this.f61419c;
    }

    private Object readResolve() {
        return mo14534a().mo14453a(this.f61417a);
    }
}
