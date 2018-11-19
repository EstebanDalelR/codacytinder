package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C6849f;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.aa.h */
final class C6364h<F, T> extends bc<F> implements Serializable {
    private static final long serialVersionUID = 0;
    /* renamed from: a */
    private C6849f<F, ? extends T> f23692a;
    /* renamed from: b */
    private bc<T> f23693b;

    C6364h(C6849f<F, ? extends T> c6849f, bc<T> bcVar) {
        this.f23692a = (C6849f) C5571j.m24292a((Object) c6849f);
        this.f23693b = (bc) C5571j.m24292a((Object) bcVar);
    }

    public final int compare(F f, F f2) {
        return this.f23693b.compare(this.f23692a.mo7022a(f), this.f23692a.mo7022a(f2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6364h)) {
            return false;
        }
        C6364h c6364h = (C6364h) obj;
        return this.f23692a.equals(c6364h.f23692a) && this.f23693b.equals(c6364h.f23693b) != null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23692a, this.f23693b});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f23693b);
        stringBuilder.append(".onResultOf(");
        stringBuilder.append(this.f23692a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
