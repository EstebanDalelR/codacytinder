package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.android.m4b.maps.aa.k */
final class C6365k<T> extends bc<T> implements Serializable {
    private static final long serialVersionUID = 0;
    /* renamed from: a */
    private Comparator<T> f23694a;

    C6365k(Comparator<T> comparator) {
        this.f23694a = (Comparator) C5571j.m24292a((Object) comparator);
    }

    public final int compare(T t, T t2) {
        return this.f23694a.compare(t, t2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6365k)) {
            return null;
        }
        return this.f23694a.equals(((C6365k) obj).f23694a);
    }

    public final int hashCode() {
        return this.f23694a.hashCode();
    }

    public final String toString() {
        return this.f23694a.toString();
    }
}
