package com.google.android.m4b.maps.ah;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.ah.d */
class C4617d {
    /* renamed from: a */
    private final Set<Type> f17033a = new HashSet();

    /* renamed from: a */
    void mo4847a(Class<?> cls) {
    }

    /* renamed from: a */
    void mo4852a(GenericArrayType genericArrayType) {
    }

    /* renamed from: a */
    void mo4848a(ParameterizedType parameterizedType) {
    }

    /* renamed from: a */
    void mo4849a(TypeVariable<?> typeVariable) {
    }

    /* renamed from: a */
    void mo4850a(WildcardType wildcardType) {
    }

    C4617d() {
    }

    /* renamed from: a */
    public final void m20723a(Type... typeArr) {
        for (Object obj : typeArr) {
            if (obj != null && this.f17033a.add(obj)) {
                try {
                    if (obj instanceof TypeVariable) {
                        mo4849a((TypeVariable) obj);
                    } else if (obj instanceof WildcardType) {
                        mo4850a((WildcardType) obj);
                    } else if (obj instanceof ParameterizedType) {
                        mo4848a((ParameterizedType) obj);
                    } else if (obj instanceof Class) {
                        mo4847a((Class) obj);
                    } else if (obj instanceof GenericArrayType) {
                        mo4852a((GenericArrayType) obj);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Unknown type: ");
                        stringBuilder.append(obj);
                        throw new AssertionError(stringBuilder.toString());
                    }
                } catch (Throwable th) {
                    this.f17033a.remove(obj);
                }
            }
        }
    }
}
