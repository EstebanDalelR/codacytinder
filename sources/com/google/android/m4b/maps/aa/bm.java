package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.io.Serializable;

final class bm<T> extends bc<T> implements Serializable {
    private static final long serialVersionUID = 0;
    /* renamed from: a */
    private bc<? super T> f23682a;

    bm(bc<? super T> bcVar) {
        this.f23682a = (bc) C5571j.m24292a((Object) bcVar);
    }

    public final int compare(T t, T t2) {
        return this.f23682a.compare(t2, t);
    }

    /* renamed from: a */
    public final <S extends T> bc<S> mo4827a() {
        return this.f23682a;
    }

    public final int hashCode() {
        return -this.f23682a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return null;
        }
        return this.f23682a.equals(((bm) obj).f23682a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f23682a);
        stringBuilder.append(".reverse()");
        return stringBuilder.toString();
    }
}
