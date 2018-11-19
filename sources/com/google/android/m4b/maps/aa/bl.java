package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.io.Serializable;

final class bl extends bc<Comparable> implements Serializable {
    /* renamed from: a */
    static final bl f23681a = new bl();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        C5571j.m24292a((Object) comparable);
        if (comparable == comparable2) {
            return null;
        }
        return comparable2.compareTo(comparable);
    }

    private Object readResolve() {
        return f23681a;
    }

    private bl() {
    }

    /* renamed from: a */
    public final <S extends Comparable> bc<S> mo4827a() {
        return ba.f23677a;
    }
}
