package com.appsflyer;

/* renamed from: com.appsflyer.m */
final class C0940m {
    /* renamed from: a */
    private C0939a f2485a;
    /* renamed from: b */
    private String f2486b;
    /* renamed from: c */
    private boolean f2487c;

    /* renamed from: com.appsflyer.m$a */
    enum C0939a {
        GOOGLE(0),
        AMAZON(1);
        
        private int intValue;

        private C0939a(int i) {
            this.intValue = i;
        }

        public final String toString() {
            return String.valueOf(this.intValue);
        }
    }

    C0940m(C0939a c0939a, String str, boolean z) {
        this.f2485a = c0939a;
        this.f2486b = str;
        this.f2487c = z;
    }

    /* renamed from: a */
    final String m3208a() {
        return this.f2486b;
    }

    /* renamed from: b */
    final boolean m3209b() {
        return this.f2487c;
    }

    public final String toString() {
        return String.format("%s,%s", new Object[]{this.f2486b, Boolean.valueOf(this.f2487c)});
    }
}
