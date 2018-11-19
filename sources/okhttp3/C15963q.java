package okhttp3;

import java.net.URL;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.C15957l.C15956a;
import okhttp3.internal.C15908c;
import okhttp3.internal.http.C15926e;

/* renamed from: okhttp3.q */
public final class C15963q {
    /* renamed from: a */
    final HttpUrl f49553a;
    /* renamed from: b */
    final String f49554b;
    /* renamed from: c */
    final C15957l f49555c;
    @Nullable
    /* renamed from: d */
    final C15964r f49556d;
    /* renamed from: e */
    final Object f49557e;
    /* renamed from: f */
    private volatile C15887c f49558f;

    /* renamed from: okhttp3.q$a */
    public static class C15962a {
        /* renamed from: a */
        HttpUrl f49548a;
        /* renamed from: b */
        String f49549b;
        /* renamed from: c */
        C15956a f49550c;
        /* renamed from: d */
        C15964r f49551d;
        /* renamed from: e */
        Object f49552e;

        public C15962a() {
            this.f49549b = "GET";
            this.f49550c = new C15956a();
        }

        C15962a(C15963q c15963q) {
            this.f49548a = c15963q.f49553a;
            this.f49549b = c15963q.f49554b;
            this.f49551d = c15963q.f49556d;
            this.f49552e = c15963q.f49557e;
            this.f49550c = c15963q.f49555c.m60478b();
        }

        /* renamed from: a */
        public C15962a m60514a(HttpUrl httpUrl) {
            if (httpUrl == null) {
                throw new NullPointerException("url == null");
            }
            this.f49548a = httpUrl;
            return this;
        }

        /* renamed from: a */
        public C15962a m60510a(String str) {
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            StringBuilder stringBuilder;
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("http:");
                stringBuilder.append(str.substring(3));
                str = stringBuilder.toString();
            } else {
                if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("https:");
                    stringBuilder.append(str.substring(4));
                    str = stringBuilder.toString();
                }
            }
            HttpUrl f = HttpUrl.m60000f(str);
            if (f != null) {
                return m60514a(f);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("unexpected url: ");
            stringBuilder2.append(str);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }

        /* renamed from: a */
        public C15962a m60513a(URL url) {
            if (url == null) {
                throw new NullPointerException("url == null");
            }
            HttpUrl a = HttpUrl.m59993a(url);
            if (a != null) {
                return m60514a(a);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected url: ");
            stringBuilder.append(url);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C15962a m60511a(String str, String str2) {
            this.f49550c.m60470c(str, str2);
            return this;
        }

        /* renamed from: b */
        public C15962a m60519b(String str, String str2) {
            this.f49550c.m60465a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C15962a m60518b(String str) {
            this.f49550c.m60467b(str);
            return this;
        }

        /* renamed from: a */
        public C15962a m60515a(C15957l c15957l) {
            this.f49550c = c15957l.m60478b();
            return this;
        }

        /* renamed from: a */
        public C15962a m60508a() {
            return m60512a("GET", null);
        }

        /* renamed from: b */
        public C15962a m60517b() {
            return m60512a("HEAD", null);
        }

        /* renamed from: a */
        public C15962a m60516a(C15964r c15964r) {
            return m60512a("POST", c15964r);
        }

        /* renamed from: b */
        public C15962a m60520b(@Nullable C15964r c15964r) {
            return m60512a("DELETE", c15964r);
        }

        /* renamed from: c */
        public C15962a m60521c() {
            return m60520b(C15908c.f49248d);
        }

        /* renamed from: c */
        public C15962a m60522c(C15964r c15964r) {
            return m60512a("PUT", c15964r);
        }

        /* renamed from: d */
        public C15962a m60523d(C15964r c15964r) {
            return m60512a("PATCH", c15964r);
        }

        /* renamed from: a */
        public C15962a m60512a(String str, @Nullable C15964r c15964r) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (c15964r != null && !C15926e.m60277c(str)) {
                r0 = new StringBuilder();
                r0.append("method ");
                r0.append(str);
                r0.append(" must not have a request body.");
                throw new IllegalArgumentException(r0.toString());
            } else if (c15964r == null && C15926e.m60276b(str)) {
                r0 = new StringBuilder();
                r0.append("method ");
                r0.append(str);
                r0.append(" must have a request body.");
                throw new IllegalArgumentException(r0.toString());
            } else {
                this.f49549b = str;
                this.f49551d = c15964r;
                return this;
            }
        }

        /* renamed from: a */
        public C15962a m60509a(Object obj) {
            this.f49552e = obj;
            return this;
        }

        /* renamed from: d */
        public C15963q m60524d() {
            if (this.f49548a != null) {
                return new C15963q(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    C15963q(C15962a c15962a) {
        this.f49553a = c15962a.f49548a;
        this.f49554b = c15962a.f49549b;
        this.f49555c = c15962a.f49550c.m60466a();
        this.f49556d = c15962a.f49551d;
        this.f49557e = c15962a.f49552e != null ? c15962a.f49552e : this;
    }

    /* renamed from: a */
    public HttpUrl m60526a() {
        return this.f49553a;
    }

    /* renamed from: b */
    public String m60527b() {
        return this.f49554b;
    }

    /* renamed from: c */
    public C15957l m60529c() {
        return this.f49555c;
    }

    @Nullable
    /* renamed from: a */
    public String m60525a(String str) {
        return this.f49555c.m60475a(str);
    }

    /* renamed from: b */
    public List<String> m60528b(String str) {
        return this.f49555c.m60477b(str);
    }

    @Nullable
    /* renamed from: d */
    public C15964r m60530d() {
        return this.f49556d;
    }

    /* renamed from: e */
    public C15962a m60531e() {
        return new C15962a(this);
    }

    /* renamed from: f */
    public C15887c m60532f() {
        C15887c c15887c = this.f49558f;
        if (c15887c != null) {
            return c15887c;
        }
        c15887c = C15887c.m60043a(this.f49555c);
        this.f49558f = c15887c;
        return c15887c;
    }

    /* renamed from: g */
    public boolean m60533g() {
        return this.f49553a.m60006d();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{method=");
        stringBuilder.append(this.f49554b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f49553a);
        stringBuilder.append(", tag=");
        stringBuilder.append(this.f49557e != this ? this.f49557e : null);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
