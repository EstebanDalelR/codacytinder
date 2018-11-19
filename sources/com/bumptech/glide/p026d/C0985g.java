package com.bumptech.glide.p026d;

/* renamed from: com.bumptech.glide.d.g */
public class C0985g {
    /* renamed from: a */
    private Class<?> f2678a;
    /* renamed from: b */
    private Class<?> f2679b;

    public C0985g(Class<?> cls, Class<?> cls2) {
        m3403a(cls, cls2);
    }

    /* renamed from: a */
    public void m3403a(Class<?> cls, Class<?> cls2) {
        this.f2678a = cls;
        this.f2679b = cls2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiClassKey{first=");
        stringBuilder.append(this.f2678a);
        stringBuilder.append(", second=");
        stringBuilder.append(this.f2679b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C0985g c0985g = (C0985g) obj;
                return this.f2678a.equals(c0985g.f2678a) && this.f2679b.equals(c0985g.f2679b) != null;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f2678a.hashCode() * 31) + this.f2679b.hashCode();
    }
}
