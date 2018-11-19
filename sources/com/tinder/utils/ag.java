package com.tinder.utils;

import android.support.annotation.NonNull;

public final class ag<T extends Comparable<? super T>> {
    /* renamed from: a */
    private final T f47619a;
    /* renamed from: b */
    private final T f47620b;

    public ag(T t, T t2) {
        this.f47619a = (Comparable) m57619a((Object) t, "lower must not be null");
        this.f47620b = (Comparable) m57619a((Object) t2, "upper must not be null");
        if (t.compareTo(t2) > null) {
            throw new IllegalArgumentException("lower must be less than or equal to upper");
        }
    }

    /* renamed from: a */
    public static <T extends Comparable<? super T>> ag<T> m57618a(T t, T t2) {
        return new ag(t, t2);
    }

    /* renamed from: a */
    public T m57620a() {
        return this.f47619a;
    }

    /* renamed from: b */
    public T m57622b() {
        return this.f47620b;
    }

    /* renamed from: a */
    public boolean m57621a(T t) {
        m57619a((Object) t, "value must not be null");
        Object obj = t.compareTo(this.f47619a) >= 0 ? 1 : null;
        t = t.compareTo(this.f47620b) <= null ? true : null;
        if (obj == null || t == null) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        if (this.f47619a.equals(agVar.f47619a) && this.f47620b.equals(agVar.f47620b) != null) {
            z = true;
        }
        return z;
    }

    public String toString() {
        return String.format("[%s, %s]", new Object[]{this.f47619a, this.f47620b});
    }

    public int hashCode() {
        return m57617a(this.f47619a, this.f47620b);
    }

    /* renamed from: a */
    public static <T> int m57617a(T t, T t2) {
        t = m57616a((Object) t);
        if (t2 == null) {
            t2 = null;
        } else {
            t2 = t2.hashCode();
        }
        return ((t << 5) - t) ^ t2;
    }

    /* renamed from: a */
    public static <T> int m57616a(T t) {
        return t == null ? null : t.hashCode();
    }

    @NonNull
    /* renamed from: a */
    private static <T> T m57619a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
