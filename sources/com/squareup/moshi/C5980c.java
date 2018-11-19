package com.squareup.moshi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.squareup.moshi.c */
abstract class C5980c<T> {

    /* renamed from: com.squareup.moshi.c$1 */
    class C71771 extends C5980c<T> {
        /* renamed from: a */
        final /* synthetic */ Constructor f25953a;
        /* renamed from: b */
        final /* synthetic */ Class f25954b;

        C71771(Constructor constructor, Class cls) {
            this.f25953a = constructor;
            this.f25954b = cls;
        }

        /* renamed from: a */
        public T mo6446a() throws IllegalAccessException, InvocationTargetException, InstantiationException {
            return this.f25953a.newInstance(null);
        }

        public String toString() {
            return this.f25954b.getName();
        }
    }

    /* renamed from: com.squareup.moshi.c$2 */
    class C71782 extends C5980c<T> {
        /* renamed from: a */
        final /* synthetic */ Method f25955a;
        /* renamed from: b */
        final /* synthetic */ Object f25956b;
        /* renamed from: c */
        final /* synthetic */ Class f25957c;

        C71782(Method method, Object obj, Class cls) {
            this.f25955a = method;
            this.f25956b = obj;
            this.f25957c = cls;
        }

        /* renamed from: a */
        public T mo6446a() throws InvocationTargetException, IllegalAccessException {
            return this.f25955a.invoke(this.f25956b, new Object[]{this.f25957c});
        }

        public String toString() {
            return this.f25957c.getName();
        }
    }

    /* renamed from: com.squareup.moshi.c$3 */
    class C71793 extends C5980c<T> {
        /* renamed from: a */
        final /* synthetic */ Method f25958a;
        /* renamed from: b */
        final /* synthetic */ Class f25959b;
        /* renamed from: c */
        final /* synthetic */ int f25960c;

        C71793(Method method, Class cls, int i) {
            this.f25958a = method;
            this.f25959b = cls;
            this.f25960c = i;
        }

        /* renamed from: a */
        public T mo6446a() throws InvocationTargetException, IllegalAccessException {
            return this.f25958a.invoke(null, new Object[]{this.f25959b, Integer.valueOf(this.f25960c)});
        }

        public String toString() {
            return this.f25959b.getName();
        }
    }

    /* renamed from: com.squareup.moshi.c$4 */
    class C71804 extends C5980c<T> {
        /* renamed from: a */
        final /* synthetic */ Method f25961a;
        /* renamed from: b */
        final /* synthetic */ Class f25962b;

        C71804(Method method, Class cls) {
            this.f25961a = method;
            this.f25962b = cls;
        }

        /* renamed from: a */
        public T mo6446a() throws InvocationTargetException, IllegalAccessException {
            return this.f25961a.invoke(null, new Object[]{this.f25962b, Object.class});
        }

        public String toString() {
            return this.f25962b.getName();
        }
    }

    /* renamed from: a */
    abstract T mo6446a() throws InvocationTargetException, IllegalAccessException, InstantiationException;

    C5980c() {
    }

    /* renamed from: a */
    public static <T> com.squareup.moshi.C5980c<T> m25630a(java.lang.Class<?> r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = 1;
        r2 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0011 }
        r2 = r8.getDeclaredConstructor(r2);	 Catch:{ NoSuchMethodException -> 0x0011 }
        r2.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0011 }
        r3 = new com.squareup.moshi.c$1;	 Catch:{ NoSuchMethodException -> 0x0011 }
        r3.<init>(r2, r8);	 Catch:{ NoSuchMethodException -> 0x0011 }
        return r3;
    L_0x0011:
        r2 = 0;
        r3 = "sun.misc.Unsafe";	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r3 = java.lang.Class.forName(r3);	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r4 = "theUnsafe";	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r4 = r3.getDeclaredField(r4);	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r4.setAccessible(r1);	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r4 = r4.get(r2);	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r5 = "allocateInstance";	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r6 = new java.lang.Class[r1];	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r7 = java.lang.Class.class;	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r6[r0] = r7;	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r3 = r3.getMethod(r5, r6);	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r5 = new com.squareup.moshi.c$2;	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        r5.<init>(r3, r4, r8);	 Catch:{ IllegalAccessException -> 0x00b7, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037, ClassNotFoundException -> 0x0037 }
        return r5;
    L_0x0037:
        r3 = 2;
        r4 = java.io.ObjectStreamClass.class;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r5 = "getConstructorId";	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r6 = new java.lang.Class[r1];	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r7 = java.lang.Class.class;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r6[r0] = r7;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r4 = r4.getDeclaredMethod(r5, r6);	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r4.setAccessible(r1);	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r5 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r6 = java.lang.Object.class;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r5[r0] = r6;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r2 = r4.invoke(r2, r5);	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r2 = (java.lang.Integer) r2;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r2 = r2.intValue();	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r4 = java.io.ObjectStreamClass.class;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r5 = "newInstance";	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r6 = new java.lang.Class[r3];	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r7 = java.lang.Class.class;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r6[r0] = r7;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r7 = java.lang.Integer.TYPE;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r6[r1] = r7;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r4 = r4.getDeclaredMethod(r5, r6);	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r4.setAccessible(r1);	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r5 = new com.squareup.moshi.c$3;	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        r5.<init>(r4, r8, r2);	 Catch:{ IllegalAccessException -> 0x00b1, InvocationTargetException -> 0x00aa, NoSuchMethodException -> 0x0074 }
        return r5;
    L_0x0074:
        r2 = java.io.ObjectInputStream.class;	 Catch:{ Exception -> 0x008f }
        r4 = "newInstance";	 Catch:{ Exception -> 0x008f }
        r3 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x008f }
        r5 = java.lang.Class.class;	 Catch:{ Exception -> 0x008f }
        r3[r0] = r5;	 Catch:{ Exception -> 0x008f }
        r0 = java.lang.Class.class;	 Catch:{ Exception -> 0x008f }
        r3[r1] = r0;	 Catch:{ Exception -> 0x008f }
        r0 = r2.getDeclaredMethod(r4, r3);	 Catch:{ Exception -> 0x008f }
        r0.setAccessible(r1);	 Catch:{ Exception -> 0x008f }
        r1 = new com.squareup.moshi.c$4;	 Catch:{ Exception -> 0x008f }
        r1.<init>(r0, r8);	 Catch:{ Exception -> 0x008f }
        return r1;
    L_0x008f:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "cannot construct instances of ";
        r1.append(r2);
        r8 = r8.getName();
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x00aa:
        r8 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r8);
        throw r0;
    L_0x00b1:
        r8 = new java.lang.AssertionError;
        r8.<init>();
        throw r8;
    L_0x00b7:
        r8 = new java.lang.AssertionError;
        r8.<init>();
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.c.a(java.lang.Class):com.squareup.moshi.c<T>");
    }
}
