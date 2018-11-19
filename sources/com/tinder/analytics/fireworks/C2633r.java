package com.tinder.analytics.fireworks;

import javax.annotation.Nonnull;

/* renamed from: com.tinder.analytics.fireworks.r */
public class C2633r {
    @Nonnull
    /* renamed from: a */
    private String f8219a;
    @Nonnull
    /* renamed from: b */
    private Class<?> f8220b;

    @Nonnull
    /* renamed from: a */
    public static C2633r m9871a(@Nonnull String str, @Nonnull Class<?> cls) {
        return new C2633r(str, cls);
    }

    private C2633r(@Nonnull String str, @Nonnull Class<?> cls) {
        this.f8219a = str;
        this.f8220b = cls;
    }

    @Nonnull
    /* renamed from: a */
    public String m9872a() {
        return this.f8219a;
    }

    @Nonnull
    /* renamed from: b */
    public Class<?> m9873b() {
        return this.f8220b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2633r c2633r = (C2633r) obj;
                if (this.f8219a.equals(c2633r.f8219a)) {
                    return this.f8220b.equals(c2633r.f8220b);
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f8219a.hashCode() * 31) + this.f8220b.hashCode();
    }
}
