package okhttp3.internal.http;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import okhttp3.C15897h;
import okhttp3.C15957l;
import okhttp3.C15957l.C15956a;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.internal.C15908c;

/* renamed from: okhttp3.internal.http.d */
public final class C15925d {
    /* renamed from: a */
    private static final Pattern f49353a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

    /* renamed from: a */
    public static long m60264a(C15966s c15966s) {
        return C15925d.m60263a(c15966s.m60559g());
    }

    /* renamed from: a */
    public static long m60263a(C15957l c15957l) {
        return C15925d.m60262a(c15957l.m60475a("Content-Length"));
    }

    /* renamed from: a */
    private static long m60262a(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = -1;
        if (r4 != 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x000a }
        return r2;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.d.a(java.lang.String):long");
    }

    /* renamed from: a */
    public static boolean m60267a(C15966s c15966s, C15957l c15957l, C15963q c15963q) {
        for (String str : C15925d.m60274e(c15966s)) {
            if (!C15908c.m60168a(c15957l.m60477b(str), c15963q.m60528b(str))) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m60270b(C15966s c15966s) {
        return C15925d.m60269b(c15966s.m60559g());
    }

    /* renamed from: b */
    public static boolean m60269b(C15957l c15957l) {
        return C15925d.m60271c(c15957l).contains("*");
    }

    /* renamed from: e */
    private static Set<String> m60274e(C15966s c15966s) {
        return C15925d.m60271c(c15966s.m60559g());
    }

    /* renamed from: c */
    public static Set<String> m60271c(C15957l c15957l) {
        Set<String> emptySet = Collections.emptySet();
        int a = c15957l.m60473a();
        Set<String> set = emptySet;
        for (int i = 0; i < a; i++) {
            if ("Vary".equalsIgnoreCase(c15957l.m60474a(i))) {
                String b = c15957l.m60476b(i);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : b.split(",")) {
                    set.add(trim.trim());
                }
            }
        }
        return set;
    }

    /* renamed from: c */
    public static C15957l m60272c(C15966s c15966s) {
        return C15925d.m60265a(c15966s.m60562j().m60553a().m60529c(), c15966s.m60559g());
    }

    /* renamed from: a */
    public static C15957l m60265a(C15957l c15957l, C15957l c15957l2) {
        c15957l2 = C15925d.m60271c(c15957l2);
        if (c15957l2.isEmpty()) {
            return new C15956a().m60466a();
        }
        C15956a c15956a = new C15956a();
        int a = c15957l.m60473a();
        for (int i = 0; i < a; i++) {
            String a2 = c15957l.m60474a(i);
            if (c15957l2.contains(a2)) {
                c15956a.m60465a(a2, c15957l.m60476b(i));
            }
        }
        return c15956a.m60466a();
    }

    /* renamed from: a */
    public static void m60266a(CookieJar cookieJar, HttpUrl httpUrl, C15957l c15957l) {
        if (cookieJar != CookieJar.f49062a) {
            c15957l = C15897h.m60091a(httpUrl, c15957l);
            if (!c15957l.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, c15957l);
            }
        }
    }

    /* renamed from: d */
    public static boolean m60273d(C15966s c15966s) {
        if (c15966s.m60553a().m60527b().equals("HEAD")) {
            return false;
        }
        int c = c15966s.m60555c();
        if (((c >= 100 && c < Callback.DEFAULT_DRAG_ANIMATION_DURATION) || c == 204 || c == 304) && C15925d.m60264a(c15966s) == -1) {
            if ("chunked".equalsIgnoreCase(c15966s.m60551a("Transfer-Encoding")) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int m60261a(String str, int i, String str2) {
        while (i < str.length()) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static int m60260a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static int m60268b(java.lang.String r3, int r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0019 }
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x000f;
    L_0x000b:
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        return r3;
    L_0x000f:
        r3 = 0;
        r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r2 >= 0) goto L_0x0017;
    L_0x0015:
        r3 = 0;
        return r3;
    L_0x0017:
        r3 = (int) r0;
        return r3;
    L_0x0019:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.d.b(java.lang.String, int):int");
    }
}
