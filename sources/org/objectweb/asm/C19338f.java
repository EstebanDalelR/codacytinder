package org.objectweb.asm;

/* renamed from: org.objectweb.asm.f */
public abstract class C19338f {
    /* renamed from: a */
    protected final int f60319a;
    /* renamed from: b */
    protected C19338f f60320b;

    public C19338f(int i) {
        this(i, null);
    }

    public C19338f(int i, C19338f c19338f) {
        if (i == 262144 || i == 327680) {
            this.f60319a = i;
            this.f60320b = c19338f;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C19334a mo14588a(int i, C19349t c19349t, String str, boolean z) {
        if (this.f60319a >= 327680) {
            return this.f60320b != null ? this.f60320b.mo14588a(i, c19349t, str, z) : null;
        } else {
            throw new RuntimeException();
        }
    }

    /* renamed from: a */
    public C19334a mo14589a(String str, boolean z) {
        return this.f60320b != null ? this.f60320b.mo14589a(str, z) : null;
    }

    /* renamed from: a */
    public C19341j mo14590a(int i, String str, String str2, String str3, Object obj) {
        return this.f60320b != null ? this.f60320b.mo14590a(i, str, str2, str3, obj) : null;
    }

    /* renamed from: a */
    public C19347q mo14591a(int i, String str, String str2, String str3, String[] strArr) {
        return this.f60320b != null ? this.f60320b.mo14591a(i, str, str2, str3, strArr) : null;
    }

    /* renamed from: a */
    public void mo14592a() {
        if (this.f60320b != null) {
            this.f60320b.mo14592a();
        }
    }

    /* renamed from: a */
    public void mo14593a(int i, int i2, String str, String str2, String str3, String[] strArr) {
        if (this.f60320b != null) {
            this.f60320b.mo14593a(i, i2, str, str2, str3, strArr);
        }
    }

    /* renamed from: a */
    public void mo14594a(String str, String str2) {
        if (this.f60320b != null) {
            this.f60320b.mo14594a(str, str2);
        }
    }

    /* renamed from: a */
    public void mo14595a(String str, String str2, String str3) {
        if (this.f60320b != null) {
            this.f60320b.mo14595a(str, str2, str3);
        }
    }

    /* renamed from: a */
    public void mo14596a(String str, String str2, String str3, int i) {
        if (this.f60320b != null) {
            this.f60320b.mo14596a(str, str2, str3, i);
        }
    }

    /* renamed from: a */
    public void mo14597a(C19335c c19335c) {
        if (this.f60320b != null) {
            this.f60320b.mo14597a(c19335c);
        }
    }
}
