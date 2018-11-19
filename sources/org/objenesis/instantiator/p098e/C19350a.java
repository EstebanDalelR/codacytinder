package org.objenesis.instantiator.p098e;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;

/* renamed from: org.objenesis.instantiator.e.a */
class C19350a {
    /* renamed from: a */
    public static <T> Constructor<T> m69487a(Class<T> cls, Constructor<?> constructor) {
        Class a = C19350a.m69485a();
        Object a2 = C19350a.m69486a(a);
        try {
            return (Constructor) C19350a.m69488b(a).invoke(a2, new Object[]{cls, constructor});
        } catch (Class<T> cls2) {
            throw new ObjenesisException(cls2);
        } catch (Class<T> cls22) {
            throw new ObjenesisException(cls22);
        } catch (Class<T> cls222) {
            throw new ObjenesisException(cls222);
        }
    }

    /* renamed from: a */
    private static Class<?> m69485a() {
        try {
            return Class.forName("sun.reflect.ReflectionFactory");
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        }
    }

    /* renamed from: a */
    private static Object m69486a(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("getReflectionFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (Class<?> cls2) {
            throw new ObjenesisException(cls2);
        } catch (Class<?> cls22) {
            throw new ObjenesisException(cls22);
        } catch (Class<?> cls222) {
            throw new ObjenesisException(cls222);
        } catch (Class<?> cls2222) {
            throw new ObjenesisException(cls2222);
        }
    }

    /* renamed from: b */
    private static Method m69488b(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("newConstructorForSerialization", new Class[]{Class.class, Constructor.class});
        } catch (Class<?> cls2) {
            throw new ObjenesisException(cls2);
        }
    }
}
