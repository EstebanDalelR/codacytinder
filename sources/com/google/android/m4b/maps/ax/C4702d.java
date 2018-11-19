package com.google.android.m4b.maps.ax;

/* renamed from: com.google.android.m4b.maps.ax.d */
public final class C4702d {
    /* renamed from: a */
    public static long m20904a(String str) {
        if (C4702d.m20905a(str, 16)) {
            return Long.parseLong(C4702d.m20907c(str), 16) - Long.MIN_VALUE;
        }
        return Long.parseLong(str, 16);
    }

    /* renamed from: b */
    public static int m20906b(String str) {
        if (C4702d.m20905a(str, 8)) {
            return Integer.parseInt(C4702d.m20907c(str), 16) - Integer.MIN_VALUE;
        }
        return Integer.parseInt(str, 16);
    }

    /* renamed from: a */
    private static boolean m20905a(String str, int i) {
        if (str.length() != i || Integer.parseInt(String.valueOf(str.charAt(0)), 16) <= 7) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static String m20907c(String str) {
        String valueOf = String.valueOf(String.valueOf(Integer.parseInt(String.valueOf(str.charAt(0)), 16) - 8));
        str = String.valueOf(str.substring(1));
        return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }
}
