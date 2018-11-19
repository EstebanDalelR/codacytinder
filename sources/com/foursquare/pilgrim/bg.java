package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

abstract class bg<T, E> {

    /* renamed from: com.foursquare.pilgrim.bg$a */
    static final class C3547a<T, E> extends bg<T, E> {
        @NonNull
        /* renamed from: a */
        private E f10638a;

        C3547a(@NonNull E e) {
            super();
            this.f10638a = e;
        }
    }

    /* renamed from: com.foursquare.pilgrim.bg$b */
    static final class C3548b<T, E> extends bg<T, E> {
        @Nullable
        /* renamed from: a */
        private T f10639a;

        C3548b(@Nullable T t) {
            super();
            this.f10639a = t;
        }
    }

    /* renamed from: a */
    final boolean m7104a() {
        return this instanceof C3548b;
    }

    /* renamed from: b */
    final boolean m7105b() {
        return this instanceof C3547a;
    }

    @Nullable
    /* renamed from: a */
    final T m7103a(@NonNull RuntimeException runtimeException) {
        if (m7104a()) {
            return ((C3548b) this).f10639a;
        }
        throw runtimeException;
    }

    @Nullable
    /* renamed from: c */
    final E m7106c() {
        return m7105b() ? ((C3547a) this).f10638a : null;
    }

    private bg() {
    }
}
