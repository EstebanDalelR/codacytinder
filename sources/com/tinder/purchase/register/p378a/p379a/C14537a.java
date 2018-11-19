package com.tinder.purchase.register.p378a.p379a;

import java.util.Map;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: com.tinder.purchase.register.a.a.a */
public class C14537a {
    /* renamed from: a */
    public static final Pattern f45941a = Pattern.compile("^plus_subscription.*$");
    /* renamed from: b */
    public static final Pattern f45942b = Pattern.compile("^gold_subscription.*$");
    /* renamed from: c */
    private static Map<String, Integer> f45943c;

    /* renamed from: a */
    public static boolean m55534a(String str) {
        return f45941a.matcher(str).matches();
    }

    /* renamed from: b */
    public static boolean m55535b(String str) {
        return f45942b.matcher(str).matches();
    }
}
