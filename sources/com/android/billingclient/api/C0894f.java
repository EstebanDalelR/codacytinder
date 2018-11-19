package com.android.billingclient.api;

import java.util.List;

/* renamed from: com.android.billingclient.api.f */
public class C0894f {
    /* renamed from: a */
    private String f2322a;
    /* renamed from: b */
    private List<String> f2323b;

    /* renamed from: com.android.billingclient.api.f$a */
    public static class C0893a {
        /* renamed from: a */
        private C0894f f2321a;

        private C0893a() {
            this.f2321a = new C0894f();
        }

        /* renamed from: a */
        public C0893a m3014a(List<String> list) {
            this.f2321a.f2323b = list;
            return this;
        }

        /* renamed from: a */
        public C0893a m3013a(String str) {
            this.f2321a.f2322a = str;
            return this;
        }

        /* renamed from: a */
        public C0894f m3015a() {
            return this.f2321a;
        }
    }

    /* renamed from: a */
    public String m3019a() {
        return this.f2322a;
    }

    /* renamed from: b */
    public List<String> m3020b() {
        return this.f2323b;
    }

    /* renamed from: c */
    public static C0893a m3018c() {
        return new C0893a();
    }
}
