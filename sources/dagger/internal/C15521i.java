package dagger.internal;

/* renamed from: dagger.internal.i */
public final class C15521i {
    /* renamed from: a */
    public static <T> T m58000a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m58001a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static <T> T m58002a(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        if (str.contains("%s") == null) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        } else if (str.indexOf("%s") != str.lastIndexOf("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        } else {
            if ((obj instanceof Class) != null) {
                t = ((Class) obj).getCanonicalName();
            } else {
                t = String.valueOf(obj);
            }
            throw new NullPointerException(str.replace("%s", t));
        }
    }
}
