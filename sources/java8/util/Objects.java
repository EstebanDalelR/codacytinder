package java8.util;

public final class Objects {
    /* renamed from: c */
    public static boolean m59117c(Object obj) {
        return obj == null;
    }

    /* renamed from: d */
    public static boolean m59118d(Object obj) {
        return obj != null;
    }

    private Objects() {
    }

    /* renamed from: a */
    public static boolean m59114a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int m59112a(Object obj) {
        return obj != null ? obj.hashCode() : null;
    }

    /* renamed from: b */
    public static <T> T m59115b(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m59113a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: b */
    public static <T> T m59116b(T t, T t2) {
        return t != null ? t : m59113a((Object) t2, "defaultObj");
    }
}
