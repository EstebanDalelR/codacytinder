package org.objectweb.asm;

/* renamed from: org.objectweb.asm.a */
public abstract class C19334a {
    /* renamed from: a */
    protected final int f60307a;
    /* renamed from: b */
    protected C19334a f60308b;

    public C19334a(int i) {
        this(i, null);
    }

    public C19334a(int i, C19334a c19334a) {
        if (i == 262144 || i == 327680) {
            this.f60307a = i;
            this.f60308b = c19334a;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C19334a mo14583a(String str) {
        return this.f60308b != null ? this.f60308b.mo14583a(str) : null;
    }

    /* renamed from: a */
    public C19334a mo14584a(String str, String str2) {
        return this.f60308b != null ? this.f60308b.mo14584a(str, str2) : null;
    }

    /* renamed from: a */
    public void mo14585a() {
        if (this.f60308b != null) {
            this.f60308b.mo14585a();
        }
    }

    /* renamed from: a */
    public void mo14586a(String str, Object obj) {
        if (this.f60308b != null) {
            this.f60308b.mo14586a(str, obj);
        }
    }

    /* renamed from: a */
    public void mo14587a(String str, String str2, String str3) {
        if (this.f60308b != null) {
            this.f60308b.mo14587a(str, str2, str3);
        }
    }
}
