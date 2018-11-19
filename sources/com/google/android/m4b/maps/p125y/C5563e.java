package com.google.android.m4b.maps.p125y;

import java.io.Serializable;

/* renamed from: com.google.android.m4b.maps.y.e */
public abstract class C5563e<T> {

    /* renamed from: com.google.android.m4b.maps.y.e$a */
    static final class C6847a extends C5563e<Object> implements Serializable {
        /* renamed from: a */
        static final C6847a f25398a = new C6847a();
        private static final long serialVersionUID = 1;

        C6847a() {
        }

        /* renamed from: b */
        protected final boolean mo5817b(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* renamed from: b */
        public final int mo5816b(Object obj) {
            return obj.hashCode();
        }

        private Object readResolve() {
            return f25398a;
        }
    }

    /* renamed from: com.google.android.m4b.maps.y.e$b */
    static final class C6848b extends C5563e<Object> implements Serializable {
        /* renamed from: a */
        static final C6848b f25399a = new C6848b();
        private static final long serialVersionUID = 1;

        /* renamed from: b */
        protected final boolean mo5817b(Object obj, Object obj2) {
            return false;
        }

        C6848b() {
        }

        /* renamed from: b */
        protected final int mo5816b(Object obj) {
            return System.identityHashCode(obj);
        }

        private Object readResolve() {
            return f25399a;
        }
    }

    /* renamed from: b */
    protected abstract int mo5816b(T t);

    /* renamed from: b */
    protected abstract boolean mo5817b(T t, T t2);

    protected C5563e() {
    }

    /* renamed from: a */
    public final boolean m24261a(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t != null) {
            if (t2 != null) {
                return mo5817b(t, t2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int m24260a(T t) {
        return t == null ? null : mo5816b(t);
    }

    /* renamed from: a */
    public static C5563e<Object> m24258a() {
        return C6847a.f25398a;
    }

    /* renamed from: b */
    public static C5563e<Object> m24259b() {
        return C6848b.f25399a;
    }
}
