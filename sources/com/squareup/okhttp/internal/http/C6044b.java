package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C6000c;
import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.C6071q.C6070a;
import com.squareup.okhttp.C6075s;
import com.squareup.okhttp.C6075s.C6074a;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.okhttp.internal.http.b */
public final class C6044b {
    /* renamed from: a */
    public final C6071q f22152a;
    /* renamed from: b */
    public final C6075s f22153b;

    /* renamed from: com.squareup.okhttp.internal.http.b$a */
    public static class C6043a {
        /* renamed from: a */
        final long f22140a;
        /* renamed from: b */
        final C6071q f22141b;
        /* renamed from: c */
        final C6075s f22142c;
        /* renamed from: d */
        private Date f22143d;
        /* renamed from: e */
        private String f22144e;
        /* renamed from: f */
        private Date f22145f;
        /* renamed from: g */
        private String f22146g;
        /* renamed from: h */
        private Date f22147h;
        /* renamed from: i */
        private long f22148i;
        /* renamed from: j */
        private long f22149j;
        /* renamed from: k */
        private String f22150k;
        /* renamed from: l */
        private int f22151l = -1;

        public C6043a(long j, C6071q c6071q, C6075s c6075s) {
            this.f22140a = j;
            this.f22141b = c6071q;
            this.f22142c = c6075s;
            if (c6075s != null) {
                j = c6075s.m26401g();
                c6071q = j.m26282a();
                for (int i = 0; i < c6071q; i++) {
                    c6075s = j.m26283a(i);
                    String b = j.m26286b(i);
                    if ("Date".equalsIgnoreCase(c6075s)) {
                        this.f22143d = C6049f.m26164a(b);
                        this.f22144e = b;
                    } else if ("Expires".equalsIgnoreCase(c6075s)) {
                        this.f22147h = C6049f.m26164a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(c6075s)) {
                        this.f22145f = C6049f.m26164a(b);
                        this.f22146g = b;
                    } else if ("ETag".equalsIgnoreCase(c6075s)) {
                        this.f22150k = b;
                    } else if ("Age".equalsIgnoreCase(c6075s)) {
                        this.f22151l = C6045d.m26135b(b, -1);
                    } else if (C6053j.f22187b.equalsIgnoreCase(c6075s)) {
                        this.f22148i = Long.parseLong(b);
                    } else if (C6053j.f22188c.equalsIgnoreCase(c6075s) != null) {
                        this.f22149j = Long.parseLong(b);
                    }
                }
            }
        }

        /* renamed from: a */
        public C6044b m26131a() {
            C6044b b = m26127b();
            return (b.f22152a == null || !this.f22141b.m26352h().m25804i()) ? b : new C6044b(null, null);
        }

        /* renamed from: b */
        private C6044b m26127b() {
            if (this.f22142c == null) {
                return new C6044b(this.f22141b, null);
            }
            if (this.f22141b.m26353i() && this.f22142c.m26400f() == null) {
                return new C6044b(this.f22141b, null);
            }
            if (!C6044b.m26132a(this.f22142c, this.f22141b)) {
                return new C6044b(this.f22141b, null);
            }
            C6000c h = this.f22141b.m26352h();
            if (!h.m25796a()) {
                if (!C6043a.m26126a(this.f22141b)) {
                    long d = m26129d();
                    long c = m26128c();
                    if (h.m25798c() != -1) {
                        c = Math.min(c, TimeUnit.SECONDS.toMillis((long) h.m25798c()));
                    }
                    long j = 0;
                    long toMillis = h.m25803h() != -1 ? TimeUnit.SECONDS.toMillis((long) h.m25803h()) : 0;
                    C6000c m = this.f22142c.m26407m();
                    if (!(m.m25801f() || h.m25802g() == -1)) {
                        j = TimeUnit.SECONDS.toMillis((long) h.m25802g());
                    }
                    if (!m.m25796a()) {
                        long j2 = d + toMillis;
                        if (j2 < c + j) {
                            C6074a i = this.f22142c.m26403i();
                            if (j2 >= c) {
                                i.m26381b("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (d > 86400000 && m26130e()) {
                                i.m26381b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            return new C6044b(null, i.m26379a());
                        }
                    }
                    C6070a g = this.f22141b.m26351g();
                    if (this.f22150k != null) {
                        g.m26334a("If-None-Match", this.f22150k);
                    } else if (this.f22145f != null) {
                        g.m26334a("If-Modified-Since", this.f22146g);
                    } else if (this.f22143d != null) {
                        g.m26334a("If-Modified-Since", this.f22144e);
                    }
                    C6071q a = g.m26335a();
                    return C6043a.m26126a(a) ? new C6044b(a, this.f22142c) : new C6044b(a, null);
                }
            }
            return new C6044b(this.f22141b, null);
        }

        /* renamed from: c */
        private long m26128c() {
            C6000c m = this.f22142c.m26407m();
            if (m.m25798c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) m.m25798c());
            }
            long j = 0;
            long time;
            if (this.f22147h != null) {
                time = this.f22147h.getTime() - (this.f22143d != null ? this.f22143d.getTime() : this.f22149j);
                if (time > 0) {
                    j = time;
                }
                return j;
            } else if (this.f22145f == null || this.f22142c.m26393a().m26343a().m25749l() != null) {
                return 0;
            } else {
                time = (this.f22143d != null ? this.f22143d.getTime() : this.f22148i) - this.f22145f.getTime();
                if (time > 0) {
                    j = time / 10;
                }
                return j;
            }
        }

        /* renamed from: d */
        private long m26129d() {
            long j = 0;
            if (this.f22143d != null) {
                j = Math.max(0, this.f22149j - this.f22143d.getTime());
            }
            if (this.f22151l != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) this.f22151l));
            }
            return (j + (this.f22149j - this.f22148i)) + (this.f22140a - this.f22149j);
        }

        /* renamed from: e */
        private boolean m26130e() {
            return this.f22142c.m26407m().m25798c() == -1 && this.f22147h == null;
        }

        /* renamed from: a */
        private static boolean m26126a(C6071q c6071q) {
            if (c6071q.m26344a("If-Modified-Since") == null) {
                if (c6071q.m26344a("If-None-Match") == null) {
                    return null;
                }
            }
            return true;
        }
    }

    private C6044b(C6071q c6071q, C6075s c6075s) {
        this.f22152a = c6071q;
        this.f22153b = c6075s;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static boolean m26132a(com.squareup.okhttp.C6075s r3, com.squareup.okhttp.C6071q r4) {
        /*
        r0 = r3.m26397c();
        r1 = 0;
        switch(r0) {
            case 200: goto L_0x0030;
            case 203: goto L_0x0030;
            case 204: goto L_0x0030;
            case 300: goto L_0x0030;
            case 301: goto L_0x0030;
            case 302: goto L_0x0009;
            case 307: goto L_0x0009;
            case 308: goto L_0x0030;
            case 404: goto L_0x0030;
            case 405: goto L_0x0030;
            case 410: goto L_0x0030;
            case 414: goto L_0x0030;
            case 501: goto L_0x0030;
            default: goto L_0x0008;
        };
    L_0x0008:
        goto L_0x0046;
    L_0x0009:
        r0 = "Expires";
        r0 = r3.m26394a(r0);
        if (r0 != 0) goto L_0x0030;
    L_0x0011:
        r0 = r3.m26407m();
        r0 = r0.m25798c();
        r2 = -1;
        if (r0 != r2) goto L_0x0030;
    L_0x001c:
        r0 = r3.m26407m();
        r0 = r0.m25800e();
        if (r0 != 0) goto L_0x0030;
    L_0x0026:
        r0 = r3.m26407m();
        r0 = r0.m25799d();
        if (r0 == 0) goto L_0x0046;
    L_0x0030:
        r3 = r3.m26407m();
        r3 = r3.m25797b();
        if (r3 != 0) goto L_0x0045;
    L_0x003a:
        r3 = r4.m26352h();
        r3 = r3.m25797b();
        if (r3 != 0) goto L_0x0045;
    L_0x0044:
        r1 = 1;
    L_0x0045:
        return r1;
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.b.a(com.squareup.okhttp.s, com.squareup.okhttp.q):boolean");
    }
}
