package com.leanplum.p069a;

import android.text.TextUtils;
import com.tinder.api.ManagerWebServices;
import java.io.InputStream;

/* renamed from: com.leanplum.a.c */
public final class C2586c<T> {
    /* renamed from: a */
    private String f8039a;
    /* renamed from: b */
    private String f8040b;
    /* renamed from: c */
    private T f8041c;
    /* renamed from: d */
    private boolean f8042d;

    private C2586c() {
    }

    /* renamed from: a */
    private static <T> C2586c<T> m9682a(String str, T t, String str2) {
        C2586c<T> c2586c = new C2586c();
        c2586c.f8039a = str;
        c2586c.f8040b = str2;
        c2586c.f8041c = t;
        return c2586c;
    }

    /* renamed from: a */
    public static <T> C2586c<T> m9681a(String str, T t) {
        return C2586c.m9682a(str, t, bq.m9640a((Object) t));
    }

    /* renamed from: a */
    public static C2586c<Integer> m9680a(String str, int i) {
        return C2586c.m9682a(str, Integer.valueOf(i), ManagerWebServices.PARAM_BADGE_COLOR);
    }

    /* renamed from: a */
    public static C2586c<String> m9683a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        str = C2586c.m9682a(str, str2, ManagerWebServices.PARAM_FILE);
        bq.m9650a(str.f8041c, str.f8041c, str.m9686d(), false, null, 0);
        return str;
    }

    /* renamed from: b */
    public static C2586c<String> m9684b(String str, String str2) {
        str = C2586c.m9682a(str, str2, ManagerWebServices.PARAM_FILE);
        str.f8042d = true;
        bq.m9650a(str.f8041c, str.f8041c, str.m9686d(), false, null, 0);
        return str;
    }

    /* renamed from: c */
    public static C2586c<String> m9685c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return C2586c.m9682a(str, str2, "action");
    }

    /* renamed from: a */
    public final String m9687a() {
        return this.f8039a;
    }

    /* renamed from: b */
    public final String m9688b() {
        return this.f8040b;
    }

    /* renamed from: c */
    public final T m9689c() {
        return this.f8041c;
    }

    /* renamed from: d */
    private InputStream m9686d() {
        if (this.f8040b.equals(ManagerWebServices.PARAM_FILE)) {
            return C2594s.m9719a(false, Boolean.valueOf(this.f8042d), Boolean.valueOf(this.f8042d), (String) this.f8041c, (String) this.f8041c, null);
        }
        return null;
    }
}
