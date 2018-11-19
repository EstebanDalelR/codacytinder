package com.facebook.ads.internal.p041h;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p047k.C1476a;
import com.facebook.ads.internal.p047k.C1490h;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.facebook.ads.internal.h.d */
public abstract class C1420d {
    /* renamed from: a */
    protected final String f3919a;
    /* renamed from: b */
    protected final double f3920b;
    /* renamed from: c */
    protected final double f3921c;
    /* renamed from: d */
    protected final String f3922d;
    /* renamed from: e */
    protected final Map<String, String> f3923e;

    public C1420d(Context context, String str, double d, String str2, Map<String, String> map) {
        this.f3919a = str;
        this.f3920b = ((double) System.currentTimeMillis()) / 1000.0d;
        this.f3921c = d;
        this.f3922d = str2;
        Map hashMap = new HashMap();
        if (!(map == null || map.isEmpty())) {
            hashMap.putAll(map);
        }
        if (mo1737c()) {
            hashMap.put("analog", C1490h.m5244a(C1476a.m5161a()));
        }
        this.f3923e = C1420d.m4955a(hashMap);
    }

    public C1420d(String str, double d, String str2, Map<String, String> map) {
        this(null, str, d, str2, map);
    }

    /* renamed from: a */
    private static Map<String, String> m4955a(Map<String, String> map) {
        Map<String, String> hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 != null) {
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public abstract C1426h mo1735a();

    /* renamed from: b */
    public abstract String mo1736b();

    /* renamed from: c */
    public abstract boolean mo1737c();

    /* renamed from: d */
    public String m4959d() {
        return this.f3919a;
    }

    /* renamed from: e */
    public double m4960e() {
        return this.f3920b;
    }

    /* renamed from: f */
    public double m4961f() {
        return this.f3921c;
    }

    /* renamed from: g */
    public String m4962g() {
        return this.f3922d;
    }

    /* renamed from: h */
    public Map<String, String> m4963h() {
        return this.f3923e;
    }

    /* renamed from: i */
    public final boolean m4964i() {
        return mo1735a() == C1426h.IMMEDIATE;
    }

    /* renamed from: j */
    public final boolean m4965j() {
        return TextUtils.isEmpty(this.f3919a) ^ 1;
    }
}
