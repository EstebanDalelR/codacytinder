package org.objectweb.asm;

/* renamed from: org.objectweb.asm.q */
public abstract class C19347q {
    /* renamed from: a */
    protected final int f60385a;
    /* renamed from: b */
    protected C19347q f60386b;

    public C19347q(int i) {
        this(i, null);
    }

    public C19347q(int i, C19347q c19347q) {
        if (i == 262144 || i == 327680) {
            this.f60385a = i;
            this.f60386b = c19347q;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C19334a mo14602a() {
        return this.f60386b != null ? this.f60386b.mo14602a() : null;
    }

    /* renamed from: a */
    public C19334a mo14603a(int i, String str, boolean z) {
        return this.f60386b != null ? this.f60386b.mo14603a(i, str, z) : null;
    }

    /* renamed from: a */
    public C19334a mo14604a(int i, C19349t c19349t, String str, boolean z) {
        if (this.f60385a >= 327680) {
            return this.f60386b != null ? this.f60386b.mo14604a(i, c19349t, str, z) : null;
        } else {
            throw new RuntimeException();
        }
    }

    /* renamed from: a */
    public C19334a mo14605a(int i, C19349t c19349t, C19346p[] c19346pArr, C19346p[] c19346pArr2, int[] iArr, String str, boolean z) {
        if (this.f60385a >= 327680) {
            return r0.f60386b != null ? r0.f60386b.mo14605a(i, c19349t, c19346pArr, c19346pArr2, iArr, str, z) : null;
        } else {
            throw new RuntimeException();
        }
    }

    /* renamed from: a */
    public C19334a mo14606a(String str, boolean z) {
        return this.f60386b != null ? this.f60386b.mo14606a(str, z) : null;
    }

    /* renamed from: a */
    public void mo14607a(int i) {
        if (this.f60386b != null) {
            this.f60386b.mo14607a(i);
        }
    }

    /* renamed from: a */
    public void mo14608a(int i, int i2) {
        if (this.f60386b != null) {
            this.f60386b.mo14608a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo14609a(int i, int i2, C19346p c19346p, C19346p... c19346pArr) {
        if (this.f60386b != null) {
            this.f60386b.mo14609a(i, i2, c19346p, c19346pArr);
        }
    }

    /* renamed from: a */
    public void mo14610a(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        if (this.f60386b != null) {
            this.f60386b.mo14610a(i, i2, objArr, i3, objArr2);
        }
    }

    /* renamed from: a */
    public void mo14611a(int i, String str) {
        if (this.f60386b != null) {
            this.f60386b.mo14611a(i, str);
        }
    }

    /* renamed from: a */
    public void mo14612a(int i, String str, String str2, String str3) {
        if (this.f60386b != null) {
            this.f60386b.mo14612a(i, str, str2, str3);
        }
    }

    /* renamed from: a */
    public void mo14613a(int i, String str, String str2, String str3, boolean z) {
        if (this.f60385a < 327680) {
            if (z != (i == 185)) {
                throw new IllegalArgumentException("INVOKESPECIAL/STATIC on interfaces require ASM 5");
            }
            m69456b(i, str, str2, str3);
            return;
        }
        if (this.f60386b != null) {
            this.f60386b.mo14613a(i, str, str2, str3, z);
        }
    }

    /* renamed from: a */
    public void mo14614a(int i, C19346p c19346p) {
        if (this.f60386b != null) {
            this.f60386b.mo14614a(i, c19346p);
        }
    }

    /* renamed from: a */
    public void mo14615a(Object obj) {
        if (this.f60386b != null) {
            this.f60386b.mo14615a(obj);
        }
    }

    /* renamed from: a */
    public void mo14616a(String str, int i) {
        if (this.f60385a < 327680) {
            throw new RuntimeException();
        } else if (this.f60386b != null) {
            this.f60386b.mo14616a(str, i);
        }
    }

    /* renamed from: a */
    public void mo14617a(String str, String str2, String str3, C19346p c19346p, C19346p c19346p2, int i) {
        if (this.f60386b != null) {
            this.f60386b.mo14617a(str, str2, str3, c19346p, c19346p2, i);
        }
    }

    /* renamed from: a */
    public void mo14618a(String str, String str2, C19343m c19343m, Object... objArr) {
        if (this.f60386b != null) {
            this.f60386b.mo14618a(str, str2, c19343m, objArr);
        }
    }

    /* renamed from: a */
    public void mo14619a(C19335c c19335c) {
        if (this.f60386b != null) {
            this.f60386b.mo14619a(c19335c);
        }
    }

    /* renamed from: a */
    public void mo14620a(C19346p c19346p) {
        if (this.f60386b != null) {
            this.f60386b.mo14620a(c19346p);
        }
    }

    /* renamed from: a */
    public void mo14621a(C19346p c19346p, C19346p c19346p2, C19346p c19346p3, String str) {
        if (this.f60386b != null) {
            this.f60386b.mo14621a(c19346p, c19346p2, c19346p3, str);
        }
    }

    /* renamed from: a */
    public void mo14622a(C19346p c19346p, int[] iArr, C19346p[] c19346pArr) {
        if (this.f60386b != null) {
            this.f60386b.mo14622a(c19346p, iArr, c19346pArr);
        }
    }

    /* renamed from: b */
    public C19334a mo14623b(int i, C19349t c19349t, String str, boolean z) {
        if (this.f60385a >= 327680) {
            return this.f60386b != null ? this.f60386b.mo14623b(i, c19349t, str, z) : null;
        } else {
            throw new RuntimeException();
        }
    }

    /* renamed from: b */
    public void mo14624b() {
        if (this.f60386b != null) {
            this.f60386b.mo14624b();
        }
    }

    /* renamed from: b */
    public void mo14625b(int i, int i2) {
        if (this.f60386b != null) {
            this.f60386b.mo14625b(i, i2);
        }
    }

    /* renamed from: b */
    public void m69456b(int i, String str, String str2, String str3) {
        if (this.f60385a >= 327680) {
            mo14613a(i, str, str2, str3, i == 185);
            return;
        }
        if (this.f60386b != null) {
            this.f60386b.m69456b(i, str, str2, str3);
        }
    }

    /* renamed from: b */
    public void mo14626b(int i, C19346p c19346p) {
        if (this.f60386b != null) {
            this.f60386b.mo14626b(i, c19346p);
        }
    }

    /* renamed from: b */
    public void mo14627b(String str, int i) {
        if (this.f60386b != null) {
            this.f60386b.mo14627b(str, i);
        }
    }

    /* renamed from: c */
    public C19334a mo14628c(int i, C19349t c19349t, String str, boolean z) {
        if (this.f60385a >= 327680) {
            return this.f60386b != null ? this.f60386b.mo14628c(i, c19349t, str, z) : null;
        } else {
            throw new RuntimeException();
        }
    }

    /* renamed from: c */
    public void mo14629c() {
        if (this.f60386b != null) {
            this.f60386b.mo14629c();
        }
    }

    /* renamed from: c */
    public void mo14630c(int i, int i2) {
        if (this.f60386b != null) {
            this.f60386b.mo14630c(i, i2);
        }
    }

    /* renamed from: d */
    public void mo14631d(int i, int i2) {
        if (this.f60386b != null) {
            this.f60386b.mo14631d(i, i2);
        }
    }
}
