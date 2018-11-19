package com.squareup.okhttp;

import com.squareup.okhttp.C6066n.C6065a;
import com.squareup.okhttp.internal.http.C6051h;
import java.io.IOException;
import java.net.URI;
import java.util.List;

/* renamed from: com.squareup.okhttp.q */
public final class C6071q {
    /* renamed from: a */
    private final HttpUrl f22262a;
    /* renamed from: b */
    private final String f22263b;
    /* renamed from: c */
    private final C6066n f22264c;
    /* renamed from: d */
    private final C6072r f22265d;
    /* renamed from: e */
    private final Object f22266e;
    /* renamed from: f */
    private volatile URI f22267f;
    /* renamed from: g */
    private volatile C6000c f22268g;

    /* renamed from: com.squareup.okhttp.q$a */
    public static class C6070a {
        /* renamed from: a */
        private HttpUrl f22257a;
        /* renamed from: b */
        private String f22258b;
        /* renamed from: c */
        private C6065a f22259c;
        /* renamed from: d */
        private C6072r f22260d;
        /* renamed from: e */
        private Object f22261e;

        public C6070a() {
            this.f22258b = "GET";
            this.f22259c = new C6065a();
        }

        private C6070a(C6071q c6071q) {
            this.f22257a = c6071q.f22262a;
            this.f22258b = c6071q.f22263b;
            this.f22260d = c6071q.f22265d;
            this.f22261e = c6071q.f22266e;
            this.f22259c = c6071q.f22264c.m26285b();
        }

        /* renamed from: a */
        public C6070a m26328a(HttpUrl httpUrl) {
            if (httpUrl == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f22257a = httpUrl;
            return this;
        }

        /* renamed from: a */
        public C6070a m26332a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("url == null");
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
            HttpUrl d = HttpUrl.m25736d(str);
            if (d != null) {
                return m26328a(d);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("unexpected url: ");
            stringBuilder2.append(str);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }

        /* renamed from: a */
        public C6070a m26334a(String str, String str2) {
            this.f22259c.m26280c(str, str2);
            return this;
        }

        /* renamed from: b */
        public C6070a m26337b(String str, String str2) {
            this.f22259c.m26276a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C6070a m26336b(String str) {
            this.f22259c.m26278b(str);
            return this;
        }

        /* renamed from: a */
        public C6070a m26330a(C6066n c6066n) {
            this.f22259c = c6066n.m26285b();
            return this;
        }

        /* renamed from: a */
        public C6070a m26329a(C6000c c6000c) {
            String c6000c2 = c6000c.toString();
            if (c6000c2.isEmpty()) {
                return m26336b("Cache-Control");
            }
            return m26334a("Cache-Control", c6000c2);
        }

        /* renamed from: a */
        public C6070a m26331a(C6072r c6072r) {
            return m26333a("POST", c6072r);
        }

        /* renamed from: a */
        public C6070a m26333a(String str, C6072r c6072r) {
            if (str != null) {
                if (str.length() != 0) {
                    StringBuilder stringBuilder;
                    if (c6072r != null && !C6051h.m26202c(str)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("method ");
                        stringBuilder.append(str);
                        stringBuilder.append(" must not have a request body.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else if (c6072r == null && C6051h.m26201b(str)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("method ");
                        stringBuilder.append(str);
                        stringBuilder.append(" must have a request body.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else {
                        this.f22258b = str;
                        this.f22260d = c6072r;
                        return this;
                    }
                }
            }
            throw new IllegalArgumentException("method == null || method.length() == 0");
        }

        /* renamed from: a */
        public C6071q m26335a() {
            if (this.f22257a != null) {
                return new C6071q();
            }
            throw new IllegalStateException("url == null");
        }
    }

    private C6071q(C6070a c6070a) {
        this.f22262a = c6070a.f22257a;
        this.f22263b = c6070a.f22258b;
        this.f22264c = c6070a.f22259c.m26277a();
        this.f22265d = c6070a.f22260d;
        this.f22266e = c6070a.f22261e != null ? c6070a.f22261e : this;
    }

    /* renamed from: a */
    public HttpUrl m26343a() {
        return this.f22262a;
    }

    /* renamed from: b */
    public URI m26345b() throws IOException {
        try {
            URI uri = this.f22267f;
            if (uri != null) {
                return uri;
            }
            uri = this.f22262a.m25738b();
            this.f22267f = uri;
            return uri;
        } catch (IllegalStateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: c */
    public String m26347c() {
        return this.f22262a.toString();
    }

    /* renamed from: d */
    public String m26348d() {
        return this.f22263b;
    }

    /* renamed from: e */
    public C6066n m26349e() {
        return this.f22264c;
    }

    /* renamed from: a */
    public String m26344a(String str) {
        return this.f22264c.m26284a(str);
    }

    /* renamed from: b */
    public List<String> m26346b(String str) {
        return this.f22264c.m26288c(str);
    }

    /* renamed from: f */
    public C6072r m26350f() {
        return this.f22265d;
    }

    /* renamed from: g */
    public C6070a m26351g() {
        return new C6070a();
    }

    /* renamed from: h */
    public C6000c m26352h() {
        C6000c c6000c = this.f22268g;
        if (c6000c != null) {
            return c6000c;
        }
        c6000c = C6000c.m25794a(this.f22264c);
        this.f22268g = c6000c;
        return c6000c;
    }

    /* renamed from: i */
    public boolean m26353i() {
        return this.f22262a.m25741d();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{method=");
        stringBuilder.append(this.f22263b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f22262a);
        stringBuilder.append(", tag=");
        stringBuilder.append(this.f22266e != this ? this.f22266e : null);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
