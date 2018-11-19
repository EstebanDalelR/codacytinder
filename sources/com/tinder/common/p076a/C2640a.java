package com.tinder.common.p076a;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* renamed from: com.tinder.common.a.a */
public final class C2640a {
    @Nonnull
    /* renamed from: a */
    public static <T> T m9986a(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    @Nonnull
    /* renamed from: a */
    public static <T> T m9987a(@Nullable T t, @Nullable String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static void m9988a(boolean z, @Nullable String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m9989b(boolean z, @Nullable String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
