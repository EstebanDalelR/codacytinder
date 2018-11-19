package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.C15887c;
import okhttp3.C15957l.C15956a;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.C15966s.C15965a;
import okhttp3.internal.C15900a;
import okhttp3.internal.http.C15924c;
import okhttp3.internal.http.C15925d;

/* renamed from: okhttp3.internal.cache.b */
public final class C15910b {
    @Nullable
    /* renamed from: a */
    public final C15963q f49275a;
    @Nullable
    /* renamed from: b */
    public final C15966s f49276b;

    /* renamed from: okhttp3.internal.cache.b$a */
    public static class C15909a {
        /* renamed from: a */
        final long f49263a;
        /* renamed from: b */
        final C15963q f49264b;
        /* renamed from: c */
        final C15966s f49265c;
        /* renamed from: d */
        private Date f49266d;
        /* renamed from: e */
        private String f49267e;
        /* renamed from: f */
        private Date f49268f;
        /* renamed from: g */
        private String f49269g;
        /* renamed from: h */
        private Date f49270h;
        /* renamed from: i */
        private long f49271i;
        /* renamed from: j */
        private long f49272j;
        /* renamed from: k */
        private String f49273k;
        /* renamed from: l */
        private int f49274l = -1;

        public C15909a(long j, C15963q c15963q, C15966s c15966s) {
            this.f49263a = j;
            this.f49264b = c15963q;
            this.f49265c = c15966s;
            if (c15966s != null) {
                this.f49271i = c15966s.m60565m();
                this.f49272j = c15966s.m60566n();
                j = c15966s.m60559g();
                c15963q = j.m60473a();
                for (int i = 0; i < c15963q; i++) {
                    c15966s = j.m60474a(i);
                    String b = j.m60476b(i);
                    if ("Date".equalsIgnoreCase(c15966s)) {
                        this.f49266d = C15924c.m60259a(b);
                        this.f49267e = b;
                    } else if ("Expires".equalsIgnoreCase(c15966s)) {
                        this.f49270h = C15924c.m60259a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(c15966s)) {
                        this.f49268f = C15924c.m60259a(b);
                        this.f49269g = b;
                    } else if ("ETag".equalsIgnoreCase(c15966s)) {
                        this.f49273k = b;
                    } else if ("Age".equalsIgnoreCase(c15966s) != null) {
                        this.f49274l = C15925d.m60268b(b, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public C15910b m60186a() {
            C15910b b = m60182b();
            return (b.f49275a == null || !this.f49264b.m60532f().m60053i()) ? b : new C15910b(null, null);
        }

        /* renamed from: b */
        private C15910b m60182b() {
            if (this.f49265c == null) {
                return new C15910b(this.f49264b, null);
            }
            if (this.f49264b.m60533g() && this.f49265c.m60558f() == null) {
                return new C15910b(this.f49264b, null);
            }
            if (!C15910b.m60187a(this.f49265c, this.f49264b)) {
                return new C15910b(this.f49264b, null);
            }
            C15887c f = this.f49264b.m60532f();
            if (!f.m60045a()) {
                if (!C15909a.m60181a(this.f49264b)) {
                    C15887c l = this.f49265c.m60564l();
                    if (l.m60054j()) {
                        return new C15910b(null, this.f49265c);
                    }
                    String str;
                    String str2;
                    long d = m60184d();
                    long c = m60183c();
                    if (f.m60047c() != -1) {
                        c = Math.min(c, TimeUnit.SECONDS.toMillis((long) f.m60047c()));
                    }
                    long j = 0;
                    long toMillis = f.m60052h() != -1 ? TimeUnit.SECONDS.toMillis((long) f.m60052h()) : 0;
                    if (!(l.m60050f() || f.m60051g() == -1)) {
                        j = TimeUnit.SECONDS.toMillis((long) f.m60051g());
                    }
                    if (!l.m60045a()) {
                        long j2 = d + toMillis;
                        if (j2 < c + j) {
                            C15965a i = this.f49265c.m60561i();
                            if (j2 >= c) {
                                i.m60548b("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (d > 86400000 && m60185e()) {
                                i.m60548b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            return new C15910b(null, i.m60546a());
                        }
                    }
                    if (this.f49273k != null) {
                        str = "If-None-Match";
                        str2 = this.f49273k;
                    } else if (this.f49268f != null) {
                        str = "If-Modified-Since";
                        str2 = this.f49269g;
                    } else if (this.f49266d == null) {
                        return new C15910b(this.f49264b, null);
                    } else {
                        str = "If-Modified-Since";
                        str2 = this.f49267e;
                    }
                    C15956a b = this.f49264b.m60529c().m60478b();
                    C15900a.f49230a.mo13405a(b, str, str2);
                    return new C15910b(this.f49264b.m60531e().m60515a(b.m60466a()).m60524d(), this.f49265c);
                }
            }
            return new C15910b(this.f49264b, null);
        }

        /* renamed from: c */
        private long m60183c() {
            C15887c l = this.f49265c.m60564l();
            if (l.m60047c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) l.m60047c());
            }
            long j = 0;
            long time;
            long time2;
            if (this.f49270h != null) {
                if (this.f49266d != null) {
                    time = this.f49266d.getTime();
                } else {
                    time = this.f49272j;
                }
                time2 = this.f49270h.getTime() - time;
                if (time2 > 0) {
                    j = time2;
                }
                return j;
            } else if (this.f49268f == null || this.f49265c.m60553a().m60526a().m60016m() != null) {
                return 0;
            } else {
                if (this.f49266d != null) {
                    time = this.f49266d.getTime();
                } else {
                    time = this.f49271i;
                }
                time2 = time - this.f49268f.getTime();
                if (time2 > 0) {
                    j = time2 / 10;
                }
                return j;
            }
        }

        /* renamed from: d */
        private long m60184d() {
            long j = 0;
            if (this.f49266d != null) {
                j = Math.max(0, this.f49272j - this.f49266d.getTime());
            }
            if (this.f49274l != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) this.f49274l));
            }
            return (j + (this.f49272j - this.f49271i)) + (this.f49263a - this.f49272j);
        }

        /* renamed from: e */
        private boolean m60185e() {
            return this.f49265c.m60564l().m60047c() == -1 && this.f49270h == null;
        }

        /* renamed from: a */
        private static boolean m60181a(C15963q c15963q) {
            if (c15963q.m60525a("If-Modified-Since") == null) {
                if (c15963q.m60525a("If-None-Match") == null) {
                    return null;
                }
            }
            return true;
        }
    }

    C15910b(C15963q c15963q, C15966s c15966s) {
        this.f49275a = c15963q;
        this.f49276b = c15966s;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static boolean m60187a(okhttp3.C15966s r3, okhttp3.C15963q r4) {
        /*
        r0 = r3.m60555c();
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
        r0 = r3.m60551a(r0);
        if (r0 != 0) goto L_0x0030;
    L_0x0011:
        r0 = r3.m60564l();
        r0 = r0.m60047c();
        r2 = -1;
        if (r0 != r2) goto L_0x0030;
    L_0x001c:
        r0 = r3.m60564l();
        r0 = r0.m60049e();
        if (r0 != 0) goto L_0x0030;
    L_0x0026:
        r0 = r3.m60564l();
        r0 = r0.m60048d();
        if (r0 == 0) goto L_0x0046;
    L_0x0030:
        r3 = r3.m60564l();
        r3 = r3.m60046b();
        if (r3 != 0) goto L_0x0045;
    L_0x003a:
        r3 = r4.m60532f();
        r3 = r3.m60046b();
        if (r3 != 0) goto L_0x0045;
    L_0x0044:
        r1 = 1;
    L_0x0045:
        return r1;
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.b.a(okhttp3.s, okhttp3.q):boolean");
    }
}
