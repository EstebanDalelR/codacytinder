package com.google.android.m4b.maps.p125y;

/* renamed from: com.google.android.m4b.maps.y.m */
final class C6855m<T> extends C5570i<T> {
    private static final long serialVersionUID = 0;
    /* renamed from: a */
    private final T f25410a;

    /* renamed from: b */
    public final boolean mo5814b() {
        return true;
    }

    C6855m(T t) {
        this.f25410a = t;
    }

    /* renamed from: a */
    public final T mo5813a(T t) {
        C5571j.m24293a((Object) t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.f25410a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6855m)) {
            return null;
        }
        return this.f25410a.equals(((C6855m) obj).f25410a);
    }

    public final int hashCode() {
        return this.f25410a.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Optional.of(");
        stringBuilder.append(this.f25410a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
