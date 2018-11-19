package com.facebook.ads.internal.p047k;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.k.m */
public class C1499m {
    /* renamed from: a */
    public final String f4148a;
    /* renamed from: b */
    public final long f4149b;
    /* renamed from: c */
    public final long f4150c;
    /* renamed from: d */
    public final long f4151d;
    /* renamed from: e */
    public final long f4152e;
    /* renamed from: f */
    public final long f4153f;
    /* renamed from: g */
    public final long f4154g;
    /* renamed from: h */
    public final long f4155h;

    /* renamed from: com.facebook.ads.internal.k.m$a */
    public static class C1498a {
        /* renamed from: a */
        private final String f4140a;
        /* renamed from: b */
        private long f4141b = -1;
        /* renamed from: c */
        private long f4142c = -1;
        /* renamed from: d */
        private long f4143d = -1;
        /* renamed from: e */
        private long f4144e = -1;
        /* renamed from: f */
        private long f4145f = -1;
        /* renamed from: g */
        private long f4146g = -1;
        /* renamed from: h */
        private long f4147h = -1;

        public C1498a(String str) {
            this.f4140a = str;
        }

        /* renamed from: a */
        public C1498a m5271a(long j) {
            this.f4141b = j;
            return this;
        }

        /* renamed from: a */
        public C1499m m5272a() {
            return new C1499m(this.f4140a, this.f4141b, this.f4142c, this.f4143d, this.f4144e, this.f4145f, this.f4146g, this.f4147h);
        }

        /* renamed from: b */
        public C1498a m5273b(long j) {
            this.f4142c = j;
            return this;
        }

        /* renamed from: c */
        public C1498a m5274c(long j) {
            this.f4143d = j;
            return this;
        }

        /* renamed from: d */
        public C1498a m5275d(long j) {
            this.f4144e = j;
            return this;
        }

        /* renamed from: e */
        public C1498a m5276e(long j) {
            this.f4145f = j;
            return this;
        }

        /* renamed from: f */
        public C1498a m5277f(long j) {
            this.f4146g = j;
            return this;
        }

        /* renamed from: g */
        public C1498a m5278g(long j) {
            this.f4147h = j;
            return this;
        }
    }

    private C1499m(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f4148a = str;
        this.f4149b = j;
        this.f4150c = j2;
        this.f4151d = j3;
        this.f4152e = j4;
        this.f4153f = j5;
        this.f4154g = j6;
        this.f4155h = j7;
    }

    /* renamed from: a */
    public Map<String, String> m5279a() {
        Map<String, String> hashMap = new HashMap(7);
        hashMap.put("initial_url", this.f4148a);
        hashMap.put("handler_time_ms", String.valueOf(this.f4149b));
        hashMap.put("load_start_ms", String.valueOf(this.f4150c));
        hashMap.put("response_end_ms", String.valueOf(this.f4151d));
        hashMap.put("dom_content_loaded_ms", String.valueOf(this.f4152e));
        hashMap.put("scroll_ready_ms", String.valueOf(this.f4153f));
        hashMap.put("load_finish_ms", String.valueOf(this.f4154g));
        hashMap.put("session_finish_ms", String.valueOf(this.f4155h));
        return hashMap;
    }
}
