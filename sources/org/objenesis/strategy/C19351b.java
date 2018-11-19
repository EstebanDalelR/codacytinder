package org.objenesis.strategy;

import org.objenesis.ObjenesisException;

/* renamed from: org.objenesis.strategy.b */
public final class C19351b {
    /* renamed from: a */
    public static final String f60410a = System.getProperty("java.specification.version");
    /* renamed from: b */
    public static final String f60411b = System.getProperty("java.runtime.version");
    /* renamed from: c */
    public static final String f60412c = System.getProperty("java.vm.info");
    /* renamed from: d */
    public static final String f60413d = System.getProperty("java.vm.version");
    /* renamed from: e */
    public static final String f60414e = System.getProperty("java.vm.vendor");
    /* renamed from: f */
    public static final String f60415f = System.getProperty("java.vm.name");
    /* renamed from: g */
    public static final int f60416g = C19351b.m69495e();
    /* renamed from: h */
    public static final boolean f60417h = C19351b.m69493c();
    /* renamed from: i */
    public static final String f60418i = C19351b.m69494d();

    /* renamed from: a */
    public static boolean m69491a(String str) {
        return f60415f.startsWith(str);
    }

    /* renamed from: a */
    public static boolean m69490a() {
        return f60417h;
    }

    /* renamed from: c */
    private static boolean m69493c() {
        boolean z = false;
        if (C19351b.m69495e() == 0) {
            return false;
        }
        String property = System.getProperty("java.boot.class.path");
        if (property != null && property.toLowerCase().contains("core-oj.jar")) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m69492b() {
        return f60418i != null;
    }

    /* renamed from: d */
    private static String m69494d() {
        return System.getProperty("com.google.appengine.runtime.version");
    }

    /* renamed from: e */
    private static int m69495e() {
        if (C19351b.m69491a("Dalvik")) {
            return C19351b.m69496f();
        }
        return 0;
    }

    /* renamed from: f */
    private static int m69496f() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "android.os.Build$VERSION";	 Catch:{ ClassNotFoundException -> 0x0024 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0024 }
        r1 = "SDK_INT";	 Catch:{ NoSuchFieldException -> 0x001f }
        r1 = r0.getField(r1);	 Catch:{ NoSuchFieldException -> 0x001f }
        r0 = 0;
        r0 = r1.get(r0);	 Catch:{ IllegalAccessException -> 0x0018 }
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalAccessException -> 0x0018 }
        r0 = r0.intValue();	 Catch:{ IllegalAccessException -> 0x0018 }
        return r0;
    L_0x0018:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x001f:
        r0 = org.objenesis.strategy.C19351b.m69489a(r0);
        return r0;
    L_0x0024:
        r0 = move-exception;
        r1 = new org.objenesis.ObjenesisException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objenesis.strategy.b.f():int");
    }

    /* renamed from: a */
    private static int m69489a(Class<?> cls) {
        try {
            try {
                return Integer.parseInt((String) cls.getField("SDK").get(null));
            } catch (Class<?> cls2) {
                throw new RuntimeException(cls2);
            }
        } catch (Class<?> cls22) {
            throw new ObjenesisException(cls22);
        }
    }
}
