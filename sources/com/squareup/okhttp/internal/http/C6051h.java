package com.squareup.okhttp.internal.http;

/* renamed from: com.squareup.okhttp.internal.http.h */
public final class C6051h {
    /* renamed from: a */
    public static boolean m26200a(String str) {
        if (!(str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE"))) {
            if (str.equals("MOVE") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m26201b(String str) {
        if (!(str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH"))) {
            if (str.equals("REPORT") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m26202c(String str) {
        if (!(C6051h.m26201b(str) || str.equals("OPTIONS") || str.equals("DELETE") || str.equals("PROPFIND") || str.equals("MKCOL"))) {
            if (str.equals("LOCK") == null) {
                return null;
            }
        }
        return true;
    }
}
