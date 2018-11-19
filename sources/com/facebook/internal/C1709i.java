package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.i */
public final class C1709i {
    /* renamed from: a */
    private boolean f4720a;
    /* renamed from: b */
    private String f4721b;
    /* renamed from: c */
    private boolean f4722c;
    /* renamed from: d */
    private boolean f4723d;
    /* renamed from: e */
    private int f4724e;
    /* renamed from: f */
    private EnumSet<SmartLoginOption> f4725f;
    /* renamed from: g */
    private Map<String, Map<String, C1708a>> f4726g;
    /* renamed from: h */
    private boolean f4727h;
    /* renamed from: i */
    private C1705f f4728i;
    /* renamed from: j */
    private String f4729j;
    /* renamed from: k */
    private String f4730k;
    /* renamed from: l */
    private boolean f4731l;
    /* renamed from: m */
    private String f4732m;

    /* renamed from: com.facebook.internal.i$a */
    public static class C1708a {
        /* renamed from: a */
        private String f4716a;
        /* renamed from: b */
        private String f4717b;
        /* renamed from: c */
        private Uri f4718c;
        /* renamed from: d */
        private int[] f4719d;

        /* renamed from: a */
        public static C1708a m5889a(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            Uri uri = null;
            if (Utility.m5785a(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            optString = split[1];
            if (!Utility.m5785a(str)) {
                if (!Utility.m5785a(optString)) {
                    String optString2 = jSONObject.optString("url");
                    if (!Utility.m5785a(optString2)) {
                        uri = Uri.parse(optString2);
                    }
                    return new C1708a(str, optString, uri, C1708a.m5890a(jSONObject.optJSONArray("versions")));
                }
            }
            return null;
        }

        /* renamed from: a */
        private static int[] m5890a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!Utility.m5785a(optString)) {
                        try {
                            optInt = Integer.parseInt(optString);
                        } catch (Exception e) {
                            Utility.m5777a("FacebookSDK", e);
                            optInt = -1;
                        }
                    }
                }
                iArr[i] = optInt;
            }
            return iArr;
        }

        private C1708a(String str, String str2, Uri uri, int[] iArr) {
            this.f4716a = str;
            this.f4717b = str2;
            this.f4718c = uri;
            this.f4719d = iArr;
        }

        /* renamed from: a */
        public String m5891a() {
            return this.f4716a;
        }

        /* renamed from: b */
        public String m5892b() {
            return this.f4717b;
        }

        /* renamed from: c */
        public Uri m5893c() {
            return this.f4718c;
        }

        /* renamed from: d */
        public int[] m5894d() {
            return this.f4719d;
        }
    }

    public C1709i(boolean z, String str, boolean z2, boolean z3, int i, EnumSet<SmartLoginOption> enumSet, Map<String, Map<String, C1708a>> map, boolean z4, C1705f c1705f, String str2, String str3, boolean z5, String str4) {
        this.f4720a = z;
        this.f4721b = str;
        this.f4722c = z2;
        this.f4723d = z3;
        this.f4726g = map;
        this.f4728i = c1705f;
        this.f4724e = i;
        this.f4727h = z4;
        this.f4725f = enumSet;
        this.f4729j = str2;
        this.f4730k = str3;
        this.f4731l = z5;
        this.f4732m = str4;
    }

    /* renamed from: a */
    public boolean m5896a() {
        return this.f4720a;
    }

    /* renamed from: b */
    public String m5897b() {
        return this.f4721b;
    }

    /* renamed from: c */
    public boolean m5898c() {
        return this.f4722c;
    }

    /* renamed from: d */
    public boolean m5899d() {
        return this.f4723d;
    }

    /* renamed from: e */
    public int m5900e() {
        return this.f4724e;
    }

    /* renamed from: f */
    public boolean m5901f() {
        return this.f4727h;
    }

    /* renamed from: g */
    public EnumSet<SmartLoginOption> m5902g() {
        return this.f4725f;
    }

    /* renamed from: h */
    public Map<String, Map<String, C1708a>> m5903h() {
        return this.f4726g;
    }

    /* renamed from: i */
    public C1705f m5904i() {
        return this.f4728i;
    }

    /* renamed from: j */
    public boolean m5905j() {
        return this.f4731l;
    }

    /* renamed from: k */
    public String m5906k() {
        return this.f4732m;
    }

    /* renamed from: a */
    public static C1708a m5895a(String str, String str2, String str3) {
        if (!Utility.m5785a(str2)) {
            if (!Utility.m5785a(str3)) {
                str = C1712j.m5907a(str);
                if (str != null) {
                    Map map = (Map) str.m5903h().get(str2);
                    if (map != null) {
                        return (C1708a) map.get(str3);
                    }
                }
                return null;
            }
        }
        return null;
    }
}
