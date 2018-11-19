package com.google.android.m4b.maps.p125y;

/* renamed from: com.google.android.m4b.maps.y.a */
final class C6845a<T> extends C5570i<T> {
    /* renamed from: a */
    private static C6845a<Object> f25380a = new C6845a();
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public final boolean mo5814b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 1502476572;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    /* renamed from: a */
    static <T> C5570i<T> m30298a() {
        return f25380a;
    }

    private C6845a() {
    }

    /* renamed from: a */
    public final T mo5813a(T t) {
        return C5571j.m24293a((Object) t, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }

    private Object readResolve() {
        return f25380a;
    }
}
