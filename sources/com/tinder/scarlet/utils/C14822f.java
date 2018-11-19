package com.tinder.scarlet.utils;

import com.tinder.api.ManagerWebServices;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* renamed from: com.tinder.scarlet.utils.f */
final class C14822f {
    /* renamed from: a */
    static final Type[] f46420a = new Type[0];

    /* renamed from: a */
    static Class<?> m56170a(Type type) {
        C14822f.m56171a((Object) type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
            if (type instanceof Class) {
                return (Class) type;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(C14822f.m56170a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return C14822f.m56170a(((WildcardType) type).getUpperBounds()[0]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            stringBuilder.append(type);
            stringBuilder.append("> is of type ");
            stringBuilder.append(type.getClass().getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    static <T> T m56171a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static Type m56172a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0) {
            if (i < actualTypeArguments.length) {
                i = actualTypeArguments[i];
                return (i instanceof WildcardType) != null ? ((WildcardType) i).getUpperBounds()[null] : i;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index ");
        stringBuilder.append(i);
        stringBuilder.append(" not in range [0,");
        stringBuilder.append(actualTypeArguments.length);
        stringBuilder.append(") for ");
        stringBuilder.append(parameterizedType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    static boolean m56173b(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type b : ((ParameterizedType) type).getActualTypeArguments()) {
                if (C14822f.m56173b(b)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return C14822f.m56173b(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            String str;
            if (type == null) {
                str = ManagerWebServices.NULL_STRING_VALUE;
            } else {
                str = type.getClass().getName();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            stringBuilder.append(type);
            stringBuilder.append("> is of type ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
