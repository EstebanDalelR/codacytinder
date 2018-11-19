package com.google.android.gms.internal;

public final class aea<M extends adz<M>, T> {
    /* renamed from: a */
    protected final Class<T> f15089a;
    /* renamed from: b */
    public final int f15090b;
    /* renamed from: c */
    protected final boolean f15091c;
    /* renamed from: d */
    private int f15092d;

    /* renamed from: a */
    protected final int m19033a(Object obj) {
        int i = this.f15090b >>> 3;
        switch (this.f15092d) {
            case 10:
                return (ady.m19007b(i) << 1) + ((aee) obj).m19064f();
            case 11:
                return ady.m19009b(i, (aee) obj);
            default:
                i = this.f15092d;
                StringBuilder stringBuilder = new StringBuilder(24);
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    protected final void m19034a(Object obj, ady ady) {
        try {
            ady.m19029c(this.f15090b);
            switch (this.f15092d) {
                case 10:
                    int i = this.f15090b >>> 3;
                    ((aee) obj).mo4218a(ady);
                    ady.m19030c(i, 4);
                    return;
                case 11:
                    ady.m19027a((aee) obj);
                    return;
                default:
                    int i2 = this.f15092d;
                    StringBuilder stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(i2);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aea)) {
            return false;
        }
        aea aea = (aea) obj;
        return this.f15092d == aea.f15092d && this.f15089a == aea.f15089a && this.f15090b == aea.f15090b && this.f15091c == aea.f15091c;
    }

    public final int hashCode() {
        return ((((((this.f15092d + 1147) * 31) + this.f15089a.hashCode()) * 31) + this.f15090b) * 31) + this.f15091c;
    }
}
