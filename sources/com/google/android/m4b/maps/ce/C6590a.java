package com.google.android.m4b.maps.ce;

import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.ce.a */
public final class C6590a<T> extends C5094b {
    /* renamed from: a */
    private final T f24721a;
    /* renamed from: b */
    private final C5094b f24722b;

    public C6590a(C5094b c5094b, T t, boolean z) {
        super(t != null ? t.toString() : false, true);
        C5571j.m24292a((Object) t);
        this.f24722b = c5094b;
        this.f24721a = t;
    }

    /* renamed from: a */
    public final T m29455a() {
        return this.f24721a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C6590a c6590a = (C6590a) obj;
                return C5094b.m22746a(this.f24722b, c6590a.f24722b) && this.f24721a.equals(c6590a.f24721a) != null;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f24722b != null ? this.f24722b.hashCode() : 0) * 31) + this.f24721a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[KeyedLabelSource: ");
        if (this.f24722b != null) {
            stringBuilder.append(this.f24722b);
            stringBuilder.append(", ");
        }
        stringBuilder.append(this.f24721a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
