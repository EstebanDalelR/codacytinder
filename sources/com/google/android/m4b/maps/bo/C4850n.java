package com.google.android.m4b.maps.bo;

/* renamed from: com.google.android.m4b.maps.bo.n */
public final class C4850n {
    /* renamed from: a */
    private final String f17815a;
    /* renamed from: b */
    private final int f17816b;

    public C4850n(String str, int i) {
        this.f17815a = str;
        this.f17816b = i;
    }

    /* renamed from: a */
    public final String m21758a() {
        return this.f17815a;
    }

    /* renamed from: b */
    public final int m21759b() {
        return this.f17816b;
    }

    public final int hashCode() {
        return ((this.f17815a.hashCode() + 31) * 31) + this.f17816b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4850n c4850n = (C4850n) obj;
        return this.f17815a == c4850n.f17815a && this.f17816b == c4850n.f17816b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Icon{url=");
        stringBuilder.append(this.f17815a);
        stringBuilder.append(", , scaleDownFactor=");
        stringBuilder.append(this.f17816b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
