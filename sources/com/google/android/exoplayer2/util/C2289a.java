package com.google.android.exoplayer2.util;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.exoplayer2.util.a */
public final class C2289a {
    /* renamed from: a */
    public static void m8311a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m8312a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static int m8308a(int i, int i2, int i3) {
        if (i >= i2) {
            if (i < i3) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public static void m8313b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m8314b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: a */
    public static <T> T m8309a(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: a */
    public static String m8310a(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }
}
