package com.squareup.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.squareup.okhttp.internal.f */
class C6023f<T> {
    /* renamed from: a */
    private final Class<?> f22043a;
    /* renamed from: b */
    private final String f22044b;
    /* renamed from: c */
    private final Class[] f22045c;

    public C6023f(Class<?> cls, String str, Class... clsArr) {
        this.f22043a = cls;
        this.f22044b = str;
        this.f22045c = clsArr;
    }

    /* renamed from: a */
    public boolean m25965a(T t) {
        return m25962a(t.getClass()) != null ? true : null;
    }

    /* renamed from: a */
    public java.lang.Object m25964a(T r3, java.lang.Object... r4) throws java.lang.reflect.InvocationTargetException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r3.getClass();
        r0 = r2.m25962a(r0);
        r1 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        r3 = r0.invoke(r3, r4);	 Catch:{ IllegalAccessException -> 0x0011 }
        return r3;
    L_0x0011:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.f.a(java.lang.Object, java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: b */
    public Object m25966b(T t, Object... objArr) {
        try {
            return m25964a(t, objArr);
        } catch (T t2) {
            t2 = t2.getTargetException();
            if ((t2 instanceof RuntimeException) != null) {
                throw ((RuntimeException) t2);
            }
            objArr = new AssertionError("Unexpected exception");
            objArr.initCause(t2);
            throw objArr;
        }
    }

    /* renamed from: c */
    public Object m25967c(T t, Object... objArr) throws InvocationTargetException {
        Method a = m25962a(t.getClass());
        if (a == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Method ");
            stringBuilder.append(this.f22044b);
            stringBuilder.append(" not supported for object ");
            stringBuilder.append(t);
            throw new AssertionError(stringBuilder.toString());
        }
        try {
            return a.invoke(t, objArr);
        } catch (T t2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unexpectedly could not call: ");
            stringBuilder2.append(a);
            objArr = new AssertionError(stringBuilder2.toString());
            objArr.initCause(t2);
            throw objArr;
        }
    }

    /* renamed from: d */
    public Object m25968d(T t, Object... objArr) {
        try {
            return m25967c(t, objArr);
        } catch (T t2) {
            t2 = t2.getTargetException();
            if ((t2 instanceof RuntimeException) != null) {
                throw ((RuntimeException) t2);
            }
            objArr = new AssertionError("Unexpected exception");
            objArr.initCause(t2);
            throw objArr;
        }
    }

    /* renamed from: a */
    private Method m25962a(Class<?> cls) {
        if (this.f22044b == null) {
            return null;
        }
        cls = C6023f.m25963a(cls, this.f22044b, this.f22045c);
        if (cls == null || this.f22043a == null || this.f22043a.isAssignableFrom(cls.getReturnType())) {
            return cls;
        }
        return null;
    }

    /* renamed from: a */
    private static java.lang.reflect.Method m25963a(java.lang.Class<?> r1, java.lang.String r2, java.lang.Class[] r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = r1.getMethod(r2, r3);	 Catch:{ NoSuchMethodException -> 0x000d }
        r2 = r1.getModifiers();	 Catch:{ NoSuchMethodException -> 0x000e }
        r2 = r2 & 1;
        if (r2 != 0) goto L_0x000e;
    L_0x000d:
        r1 = r0;
    L_0x000e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.f.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }
}
