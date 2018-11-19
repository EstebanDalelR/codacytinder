package android.support.v4.util;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.util.l */
public class C0561l {
    /* renamed from: a */
    public static void m2063a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @NonNull
    /* renamed from: a */
    public static <T> T m2061a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    @NonNull
    /* renamed from: a */
    public static <T> T m2062a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static void m2064a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @IntRange(from = 0)
    /* renamed from: a */
    public static int m2060a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }
}
