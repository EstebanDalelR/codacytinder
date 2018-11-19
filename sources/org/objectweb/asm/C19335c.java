package org.objectweb.asm;

/* renamed from: org.objectweb.asm.c */
public class C19335c {
    /* renamed from: a */
    public final String f60309a;
    /* renamed from: b */
    byte[] f60310b;
    /* renamed from: c */
    C19335c f60311c;

    protected C19335c(String str) {
        this.f60309a = str;
    }

    /* renamed from: a */
    protected C19335c m69344a(C19337e c19337e, int i, int i2, char[] cArr, int i3, C19346p[] c19346pArr) {
        C19335c c19335c = new C19335c(this.f60309a);
        c19335c.f60310b = new byte[i2];
        System.arraycopy(c19337e.f60314a, i, c19335c.f60310b, 0, i2);
        return c19335c;
    }

    /* renamed from: a */
    protected C19336d m69345a(C19506g c19506g, byte[] bArr, int i, int i2, int i3) {
        C19336d c19336d = new C19336d();
        c19336d.f60312a = this.f60310b;
        c19336d.f60313b = this.f60310b.length;
        return c19336d;
    }

    /* renamed from: a */
    final void m69346a(C19506g c19506g, byte[] bArr, int i, int i2, int i3, C19336d c19336d) {
        for (C19335c c19335c = this; c19335c != null; c19335c = c19335c.f60311c) {
            C19336d a = c19335c.m69345a(c19506g, bArr, i, i2, i3);
            c19336d.m69358b(c19506g.m70394a(c19335c.f60309a)).m69360c(a.f60313b);
            c19336d.m69357a(a.f60312a, 0, a.f60313b);
        }
    }

    /* renamed from: a */
    public boolean m69347a() {
        return false;
    }

    /* renamed from: b */
    final int m69348b(C19506g c19506g, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (C19335c c19335c = this; c19335c != null; c19335c = c19335c.f60311c) {
            c19506g.m70394a(c19335c.f60309a);
            i4 += c19335c.m69345a(c19506g, bArr, i, i2, i3).f60313b + 6;
        }
        return i4;
    }

    /* renamed from: b */
    protected C19346p[] m69349b() {
        return null;
    }

    /* renamed from: c */
    final int m69350c() {
        int i = 0;
        for (C19335c c19335c = this; c19335c != null; c19335c = c19335c.f60311c) {
            i++;
        }
        return i;
    }
}
