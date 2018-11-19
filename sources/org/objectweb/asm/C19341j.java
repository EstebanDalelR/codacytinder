package org.objectweb.asm;

/* renamed from: org.objectweb.asm.j */
public abstract class C19341j {
    /* renamed from: a */
    protected final int f60344a;
    /* renamed from: b */
    protected C19341j f60345b;

    public C19341j(int i) {
        this(i, null);
    }

    public C19341j(int i, C19341j c19341j) {
        if (i == 262144 || i == 327680) {
            this.f60344a = i;
            this.f60345b = c19341j;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C19334a mo14598a(int i, C19349t c19349t, String str, boolean z) {
        if (this.f60344a >= 327680) {
            return this.f60345b != null ? this.f60345b.mo14598a(i, c19349t, str, z) : null;
        } else {
            throw new RuntimeException();
        }
    }

    /* renamed from: a */
    public C19334a mo14599a(String str, boolean z) {
        return this.f60345b != null ? this.f60345b.mo14599a(str, z) : null;
    }

    /* renamed from: a */
    public void mo14600a() {
        if (this.f60345b != null) {
            this.f60345b.mo14600a();
        }
    }

    /* renamed from: a */
    public void mo14601a(C19335c c19335c) {
        if (this.f60345b != null) {
            this.f60345b.mo14601a(c19335c);
        }
    }
}
