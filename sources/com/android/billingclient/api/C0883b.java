package com.android.billingclient.api;

import java.util.ArrayList;

/* renamed from: com.android.billingclient.api.b */
public class C0883b {
    /* renamed from: a */
    private String f2293a;
    /* renamed from: b */
    private String f2294b;
    /* renamed from: c */
    private ArrayList<String> f2295c;
    /* renamed from: d */
    private boolean f2296d;
    /* renamed from: e */
    private String f2297e;
    /* renamed from: f */
    private boolean f2298f;

    /* renamed from: com.android.billingclient.api.b$a */
    public static class C0882a {
        /* renamed from: a */
        private C0883b f2292a;

        private C0882a() {
            this.f2292a = new C0883b();
        }

        /* renamed from: a */
        public C0882a m2980a(String str) {
            this.f2292a.f2293a = str;
            return this;
        }

        /* renamed from: b */
        public C0882a m2983b(String str) {
            this.f2292a.f2294b = str;
            return this;
        }

        /* renamed from: a */
        public C0882a m2981a(ArrayList<String> arrayList) {
            this.f2292a.f2295c = arrayList;
            return this;
        }

        /* renamed from: a */
        public C0883b m2982a() {
            return this.f2292a;
        }
    }

    /* renamed from: a */
    public String m2988a() {
        return this.f2293a;
    }

    /* renamed from: b */
    public String m2989b() {
        return this.f2294b;
    }

    /* renamed from: c */
    public ArrayList<String> m2990c() {
        return this.f2295c;
    }

    /* renamed from: d */
    public boolean m2991d() {
        return this.f2296d ^ 1;
    }

    /* renamed from: e */
    public String m2992e() {
        return this.f2297e;
    }

    /* renamed from: f */
    public boolean m2993f() {
        return this.f2298f;
    }

    /* renamed from: g */
    public boolean m2994g() {
        if (!this.f2296d && this.f2297e == null) {
            if (!this.f2298f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static C0882a m2987h() {
        return new C0882a();
    }
}
