package com.google.android.m4b.maps.p125y;

import java.io.Serializable;

/* renamed from: com.google.android.m4b.maps.y.i */
public abstract class C5570i<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public abstract T mo5813a(T t);

    /* renamed from: b */
    public abstract boolean mo5814b();

    /* renamed from: c */
    public static <T> C5570i<T> m24287c() {
        return C6845a.m30298a();
    }

    /* renamed from: b */
    public static <T> C5570i<T> m24286b(T t) {
        return new C6855m(C5571j.m24292a((Object) t));
    }

    C5570i() {
    }

    /* renamed from: c */
    public static <T> C5570i<T> m24288c(T t) {
        if (t == null) {
            return C6845a.m30298a();
        }
        return new C6855m(t);
    }
}
