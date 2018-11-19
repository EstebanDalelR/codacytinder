package io.reactivex.internal.functions;

import io.reactivex.functions.BiPredicate;

/* renamed from: io.reactivex.internal.functions.a */
public final class C15684a {
    /* renamed from: a */
    static final BiPredicate<Object, Object> f48551a = new C17388a();

    /* renamed from: io.reactivex.internal.functions.a$a */
    static final class C17388a implements BiPredicate<Object, Object> {
        C17388a() {
        }

        public boolean test(Object obj, Object obj2) {
            return C15684a.m58896a(obj, obj2);
        }
    }

    /* renamed from: a */
    public static int m58890a(int i, int i2) {
        return i < i2 ? -1 : i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m58892a(long j, long j2) {
        return j < j2 ? -1 : j > j2 ? 1 : 0;
    }

    /* renamed from: a */
    public static <T> T m58895a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m58896a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> BiPredicate<T, T> m58894a() {
        return f48551a;
    }

    /* renamed from: a */
    public static int m58891a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" > 0 required but it was ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static long m58893a(long j, String str) {
        if (j > 0) {
            return j;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" > 0 required but it was ");
        stringBuilder.append(j);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
