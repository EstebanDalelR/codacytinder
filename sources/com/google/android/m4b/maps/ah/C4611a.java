package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.p125y.C5571j;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.google.android.m4b.maps.ah.a */
class C4611a<T> {
    C4611a() {
    }

    /* renamed from: a */
    final Type m20701a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C5571j.m24299a(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
