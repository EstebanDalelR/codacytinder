package com.android.volley;

import java.util.Collections;
import java.util.Map;

public interface Cache {

    /* renamed from: com.android.volley.Cache$a */
    public static class C0901a {
        /* renamed from: a */
        public byte[] f2328a;
        /* renamed from: b */
        public String f2329b;
        /* renamed from: c */
        public long f2330c;
        /* renamed from: d */
        public long f2331d;
        /* renamed from: e */
        public long f2332e;
        /* renamed from: f */
        public long f2333f;
        /* renamed from: g */
        public Map<String, String> f2334g = Collections.emptyMap();

        /* renamed from: a */
        public boolean m3031a() {
            return this.f2332e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean m3032b() {
            return this.f2333f < System.currentTimeMillis();
        }
    }

    void clear();

    C0901a get(String str);

    void initialize();

    void invalidate(String str, boolean z);

    void put(String str, C0901a c0901a);

    void remove(String str);
}
