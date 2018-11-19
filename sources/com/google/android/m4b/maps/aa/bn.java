package com.google.android.m4b.maps.aa;

import java.lang.reflect.Field;

final class bn {

    /* renamed from: com.google.android.m4b.maps.aa.bn$a */
    static final class C4572a<T> {
        /* renamed from: a */
        private final Field f16960a;

        private C4572a(Field field) {
            this.f16960a = field;
            field.setAccessible(true);
        }

        /* renamed from: a */
        final void m20649a(T t, Object obj) {
            try {
                this.f16960a.set(t, obj);
            } catch (T t2) {
                throw new AssertionError(t2);
            }
        }

        /* renamed from: a */
        final void m20648a(T t, int i) {
            try {
                this.f16960a.set(t, Integer.valueOf(i));
            } catch (T t2) {
                throw new AssertionError(t2);
            }
        }
    }

    /* renamed from: a */
    static <T> C4572a<T> m20650a(Class<T> cls, String str) {
        try {
            return new C4572a(cls.getDeclaredField(str));
        } catch (Class<T> cls2) {
            throw new AssertionError(cls2);
        }
    }
}
