package com.squareup.sqldelight;

import android.support.annotation.NonNull;

/* renamed from: com.squareup.sqldelight.a */
public final class C7263a<T extends Enum<T>> implements ColumnAdapter<T, String> {
    /* renamed from: a */
    private final Class<T> f26165a;

    @NonNull
    public /* synthetic */ Object decode(Object obj) {
        return m31089a((String) obj);
    }

    public /* synthetic */ Object encode(@NonNull Object obj) {
        return m31090a((Enum) obj);
    }

    /* renamed from: a */
    public static <T extends Enum<T>> C7263a<T> m31088a(Class<T> cls) {
        if (cls != null) {
            return new C7263a(cls);
        }
        throw new NullPointerException("cls == null");
    }

    private C7263a(Class<T> cls) {
        this.f26165a = cls;
    }

    @NonNull
    /* renamed from: a */
    public T m31089a(String str) {
        return Enum.valueOf(this.f26165a, str);
    }

    /* renamed from: a */
    public String m31090a(@NonNull T t) {
        return t.name();
    }
}
