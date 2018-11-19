package okhttp3.internal.http;

/* renamed from: okhttp3.internal.http.e */
public final class C15926e {
    /* renamed from: a */
    public static boolean m60275a(String str) {
        if (!(str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE"))) {
            if (str.equals("MOVE") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m60276b(String str) {
        if (!(str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH"))) {
            if (str.equals("REPORT") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m60277c(String str) {
        return (str.equals("GET") || str.equals("HEAD") != null) ? null : true;
    }

    /* renamed from: d */
    public static boolean m60278d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m60279e(String str) {
        return str.equals("PROPFIND") ^ 1;
    }
}
