package org.objectweb.asm;

/* renamed from: org.objectweb.asm.k */
final class C19507k extends C19341j {
    /* renamed from: c */
    private final C19506g f60953c;
    /* renamed from: d */
    private final int f60954d;
    /* renamed from: e */
    private final int f60955e;
    /* renamed from: f */
    private final int f60956f;
    /* renamed from: g */
    private int f60957g;
    /* renamed from: h */
    private int f60958h;
    /* renamed from: i */
    private C19505b f60959i;
    /* renamed from: j */
    private C19505b f60960j;
    /* renamed from: k */
    private C19505b f60961k;
    /* renamed from: l */
    private C19505b f60962l;
    /* renamed from: m */
    private C19335c f60963m;

    C19507k(C19506g c19506g, int i, String str, String str2, String str3, Object obj) {
        super(327680);
        if (c19506g.f60944r == null) {
            c19506g.f60944r = this;
        } else {
            c19506g.f60945s.b = this;
        }
        c19506g.f60945s = this;
        this.f60953c = c19506g;
        this.f60954d = i;
        this.f60955e = c19506g.m70394a(str);
        this.f60956f = c19506g.m70394a(str2);
        if (str3 != null) {
            this.f60957g = c19506g.m70394a(str3);
        }
        if (obj != null) {
            this.f60958h = c19506g.m70404a(obj).f60365a;
        }
    }

    /* renamed from: a */
    public C19334a mo14598a(int i, C19349t c19349t, String str, boolean z) {
        C19336d c19336d = new C19336d();
        C19505b.m70377a(i, c19349t, c19336d);
        c19336d.m69358b(this.f60953c.m70394a(str)).m69358b(0);
        C19334a c19505b = new C19505b(this.f60953c, true, c19336d, c19336d, c19336d.f60313b - 2);
        if (z) {
            c19505b.f60905c = this.f60961k;
            this.f60961k = c19505b;
            return c19505b;
        }
        c19505b.f60905c = this.f60962l;
        this.f60962l = c19505b;
        return c19505b;
    }

    /* renamed from: a */
    public C19334a mo14599a(String str, boolean z) {
        C19336d c19336d = new C19336d();
        c19336d.m69358b(this.f60953c.m70394a(str)).m69358b(0);
        C19334a c19505b = new C19505b(this.f60953c, true, c19336d, c19336d, 2);
        if (z) {
            c19505b.f60905c = this.f60959i;
            this.f60959i = c19505b;
            return c19505b;
        }
        c19505b.f60905c = this.f60960j;
        this.f60960j = c19505b;
        return c19505b;
    }

    /* renamed from: a */
    public void mo14600a() {
    }

    /* renamed from: a */
    public void mo14601a(C19335c c19335c) {
        c19335c.f60311c = this.f60963m;
        this.f60963m = c19335c;
    }

    /* renamed from: a */
    void m70431a(C19336d c19336d) {
        c19336d.m69358b(((((this.f60954d & 262144) / 64) | 393216) ^ -1) & this.f60954d).m69358b(this.f60955e).m69358b(this.f60956f);
        int i = this.f60958h != 0 ? 1 : 0;
        if ((this.f60954d & 4096) != 0 && ((this.f60953c.f60931e & 65535) < 49 || (this.f60954d & 262144) != 0)) {
            i++;
        }
        if ((this.f60954d & 131072) != 0) {
            i++;
        }
        if (this.f60957g != 0) {
            i++;
        }
        if (this.f60959i != null) {
            i++;
        }
        if (this.f60960j != null) {
            i++;
        }
        if (this.f60961k != null) {
            i++;
        }
        if (this.f60962l != null) {
            i++;
        }
        if (this.f60963m != null) {
            i += this.f60963m.m69350c();
        }
        c19336d.m69358b(i);
        if (this.f60958h != 0) {
            c19336d.m69358b(this.f60953c.m70394a("ConstantValue"));
            c19336d.m69360c(2).m69358b(this.f60958h);
        }
        if ((this.f60954d & 4096) != 0 && ((this.f60953c.f60931e & 65535) < 49 || (this.f60954d & 262144) != 0)) {
            c19336d.m69358b(this.f60953c.m70394a("Synthetic")).m69360c(0);
        }
        if ((this.f60954d & 131072) != 0) {
            c19336d.m69358b(this.f60953c.m70394a("Deprecated")).m69360c(0);
        }
        if (this.f60957g != 0) {
            c19336d.m69358b(this.f60953c.m70394a("Signature"));
            c19336d.m69360c(2).m69358b(this.f60957g);
        }
        if (this.f60959i != null) {
            c19336d.m69358b(this.f60953c.m70394a("RuntimeVisibleAnnotations"));
            this.f60959i.m70384a(c19336d);
        }
        if (this.f60960j != null) {
            c19336d.m69358b(this.f60953c.m70394a("RuntimeInvisibleAnnotations"));
            this.f60960j.m70384a(c19336d);
        }
        if (this.f60961k != null) {
            c19336d.m69358b(this.f60953c.m70394a("RuntimeVisibleTypeAnnotations"));
            this.f60961k.m70384a(c19336d);
        }
        if (this.f60962l != null) {
            c19336d.m69358b(this.f60953c.m70394a("RuntimeInvisibleTypeAnnotations"));
            this.f60962l.m70384a(c19336d);
        }
        if (this.f60963m != null) {
            this.f60963m.m69346a(this.f60953c, null, 0, -1, -1, c19336d);
        }
    }

    /* renamed from: b */
    int m70432b() {
        int i;
        if (this.f60958h != 0) {
            this.f60953c.m70394a("ConstantValue");
            i = 16;
        } else {
            i = 8;
        }
        if ((this.f60954d & 4096) != 0 && ((this.f60953c.f60931e & 65535) < 49 || (this.f60954d & 262144) != 0)) {
            this.f60953c.m70394a("Synthetic");
            i += 6;
        }
        if ((this.f60954d & 131072) != 0) {
            this.f60953c.m70394a("Deprecated");
            i += 6;
        }
        if (this.f60957g != 0) {
            this.f60953c.m70394a("Signature");
            i += 8;
        }
        if (this.f60959i != null) {
            this.f60953c.m70394a("RuntimeVisibleAnnotations");
            i += this.f60959i.m70385b() + 8;
        }
        if (this.f60960j != null) {
            this.f60953c.m70394a("RuntimeInvisibleAnnotations");
            i += this.f60960j.m70385b() + 8;
        }
        if (this.f60961k != null) {
            this.f60953c.m70394a("RuntimeVisibleTypeAnnotations");
            i += this.f60961k.m70385b() + 8;
        }
        if (this.f60962l != null) {
            this.f60953c.m70394a("RuntimeInvisibleTypeAnnotations");
            i += this.f60962l.m70385b() + 8;
        }
        return this.f60963m != null ? i + this.f60963m.m69348b(this.f60953c, null, 0, -1, -1) : i;
    }
}
