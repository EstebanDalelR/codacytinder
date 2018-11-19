package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Arrays;

final class ah {
    @NonNull
    /* renamed from: a */
    static <T> T m6917a(@Nullable T t) {
        return m6918a(t, "Input object was null");
    }

    @NonNull
    /* renamed from: a */
    static <T> T m6918a(@Nullable T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    @SafeVarargs
    @NonNull
    /* renamed from: a */
    static <T> T m6919a(@NonNull T... tArr) {
        return m6916a(Arrays.asList(tArr));
    }

    @NonNull
    /* renamed from: a */
    static <T> T m6916a(@NonNull Iterable<T> iterable) {
        for (T next : iterable) {
            if (next != null) {
                return next;
            }
        }
        throw new NullPointerException("All elements in the input iterable were null");
    }
}
