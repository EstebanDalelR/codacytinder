package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.io.Serializable;

final class ba extends bc<Comparable> implements Serializable {
    /* renamed from: a */
    static final ba f23677a = new ba();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural()";
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        obj = (Comparable) obj;
        obj2 = (Comparable) obj2;
        C5571j.m24292a(obj);
        C5571j.m24292a(obj2);
        return obj.compareTo(obj2);
    }

    /* renamed from: a */
    public final <S extends Comparable> bc<S> mo4827a() {
        return bl.f23681a;
    }

    private Object readResolve() {
        return f23677a;
    }

    private ba() {
    }
}
