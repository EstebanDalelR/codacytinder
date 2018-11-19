package okhttp3.internal.p460a;

import android.support.v4.media.session.PlaybackStateCompat;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.C15957l;
import okhttp3.C15957l.C15956a;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.C15966s.C15965a;
import okhttp3.C15968t;
import okhttp3.C17692o;
import okhttp3.HttpUrl;
import okhttp3.internal.C15900a;
import okhttp3.internal.C15908c;
import okhttp3.internal.connection.C15921f;
import okhttp3.internal.connection.C17659c;
import okhttp3.internal.http.C15925d;
import okhttp3.internal.http.C15927h;
import okhttp3.internal.http.C15928j;
import okhttp3.internal.http.C17663g;
import okhttp3.internal.http.HttpCodec;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C15976k;
import okio.C15982q;
import okio.C17705g;
import okio.C18549c;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.a.a */
public final class C17648a implements HttpCodec {
    /* renamed from: a */
    final C17692o f54854a;
    /* renamed from: b */
    final C15921f f54855b;
    /* renamed from: c */
    final BufferedSource f54856c;
    /* renamed from: d */
    final BufferedSink f54857d;
    /* renamed from: e */
    int f54858e = 0;
    /* renamed from: f */
    private long f54859f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* renamed from: okhttp3.internal.a.a$a */
    private abstract class C17645a implements Source {
        /* renamed from: a */
        protected final C17705g f54843a;
        /* renamed from: b */
        protected boolean f54844b;
        /* renamed from: c */
        protected long f54845c;
        /* renamed from: d */
        final /* synthetic */ C17648a f54846d;

        private C17645a(C17648a c17648a) {
            this.f54846d = c17648a;
            this.f54843a = new C17705g(this.f54846d.f54856c.timeout());
            this.f54845c = 0;
        }

        public C15982q timeout() {
            return this.f54843a;
        }

        public long read(C18549c c18549c, long j) throws IOException {
            try {
                c18549c = this.f54846d.f54856c.read(c18549c, j);
                if (c18549c > 0) {
                    this.f54845c += c18549c;
                }
                return c18549c;
            } catch (C18549c c18549c2) {
                m64258a(0, c18549c2);
                throw c18549c2;
            }
        }

        /* renamed from: a */
        protected final void m64258a(boolean z, IOException iOException) throws IOException {
            if (this.f54846d.f54858e != 6) {
                if (this.f54846d.f54858e != 5) {
                    iOException = new StringBuilder();
                    iOException.append("state: ");
                    iOException.append(this.f54846d.f54858e);
                    throw new IllegalStateException(iOException.toString());
                }
                this.f54846d.m64264a(this.f54843a);
                this.f54846d.f54858e = 6;
                if (this.f54846d.f54855b != null) {
                    this.f54846d.f54855b.m60249a(z ^ 1, this.f54846d, this.f54845c, iOException);
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.a.a$b */
    private final class C17646b implements Sink {
        /* renamed from: a */
        final /* synthetic */ C17648a f54847a;
        /* renamed from: b */
        private final C17705g f54848b = new C17705g(this.f54847a.f54857d.timeout());
        /* renamed from: c */
        private boolean f54849c;

        C17646b(C17648a c17648a) {
            this.f54847a = c17648a;
        }

        public C15982q timeout() {
            return this.f54848b;
        }

        public void write(C18549c c18549c, long j) throws IOException {
            if (this.f54849c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                this.f54847a.f54857d.writeHexadecimalUnsignedLong(j);
                this.f54847a.f54857d.writeUtf8("\r\n");
                this.f54847a.f54857d.write(c18549c, j);
                this.f54847a.f54857d.writeUtf8("\r\n");
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f54849c) {
                this.f54847a.f54857d.flush();
            }
        }

        public synchronized void close() throws IOException {
            if (!this.f54849c) {
                this.f54849c = true;
                this.f54847a.f54857d.writeUtf8("0\r\n\r\n");
                this.f54847a.m64264a(this.f54848b);
                this.f54847a.f54858e = 3;
            }
        }
    }

    /* renamed from: okhttp3.internal.a.a$d */
    private final class C17647d implements Sink {
        /* renamed from: a */
        final /* synthetic */ C17648a f54850a;
        /* renamed from: b */
        private final C17705g f54851b = new C17705g(this.f54850a.f54857d.timeout());
        /* renamed from: c */
        private boolean f54852c;
        /* renamed from: d */
        private long f54853d;

        C17647d(C17648a c17648a, long j) {
            this.f54850a = c17648a;
            this.f54853d = j;
        }

        public C15982q timeout() {
            return this.f54851b;
        }

        public void write(C18549c c18549c, long j) throws IOException {
            if (this.f54852c) {
                throw new IllegalStateException("closed");
            }
            C15908c.m60164a(c18549c.m66945a(), 0, j);
            if (j > this.f54853d) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("expected ");
                stringBuilder.append(this.f54853d);
                stringBuilder.append(" bytes but received ");
                stringBuilder.append(j);
                throw new ProtocolException(stringBuilder.toString());
            }
            this.f54850a.f54857d.write(c18549c, j);
            this.f54853d -= j;
        }

        public void flush() throws IOException {
            if (!this.f54852c) {
                this.f54850a.f54857d.flush();
            }
        }

        public void close() throws IOException {
            if (!this.f54852c) {
                this.f54852c = true;
                if (this.f54853d > 0) {
                    throw new ProtocolException("unexpected end of stream");
                }
                this.f54850a.m64264a(this.f54851b);
                this.f54850a.f54858e = 3;
            }
        }
    }

    /* renamed from: okhttp3.internal.a.a$c */
    private class C18542c extends C17645a {
        /* renamed from: e */
        final /* synthetic */ C17648a f57781e;
        /* renamed from: f */
        private final HttpUrl f57782f;
        /* renamed from: g */
        private long f57783g = -1;
        /* renamed from: h */
        private boolean f57784h = true;

        C18542c(C17648a c17648a, HttpUrl httpUrl) {
            this.f57781e = c17648a;
            super();
            this.f57782f = httpUrl;
        }

        public long read(C18549c c18549c, long j) throws IOException {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (!this.f57784h) {
                return -1;
            } else {
                if (this.f57783g == 0 || this.f57783g == -1) {
                    m66936a();
                    if (!this.f57784h) {
                        return -1;
                    }
                }
                c18549c = super.read(c18549c, Math.min(j, this.f57783g));
                if (c18549c == -1) {
                    c18549c = new ProtocolException("unexpected end of stream");
                    m64258a(0, c18549c);
                    throw c18549c;
                }
                this.f57783g -= c18549c;
                return c18549c;
            }
        }

        /* renamed from: a */
        private void m66936a() throws IOException {
            if (this.f57783g != -1) {
                this.f57781e.f54856c.readUtf8LineStrict();
            }
            try {
                this.f57783g = this.f57781e.f54856c.readHexadecimalUnsignedLong();
                String trim = this.f57781e.f54856c.readUtf8LineStrict().trim();
                if (this.f57783g >= 0) {
                    if (trim.isEmpty() || trim.startsWith(";")) {
                        if (this.f57783g == 0) {
                            this.f57784h = false;
                            C15925d.m60266a(this.f57781e.f54854a.m64397g(), this.f57782f, this.f57781e.m64260a());
                            m64258a(true, null);
                            return;
                        }
                        return;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("expected chunk size and optional extensions but was \"");
                stringBuilder.append(this.f57783g);
                stringBuilder.append(trim);
                stringBuilder.append("\"");
                throw new ProtocolException(stringBuilder.toString());
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (this.f57784h && !C15908c.m60170a((Source) this, 100, TimeUnit.MILLISECONDS)) {
                    m64258a(false, null);
                }
                this.b = true;
            }
        }
    }

    /* renamed from: okhttp3.internal.a.a$e */
    private class C18543e extends C17645a {
        /* renamed from: e */
        final /* synthetic */ C17648a f57785e;
        /* renamed from: f */
        private long f57786f;

        C18543e(C17648a c17648a, long j) throws IOException {
            this.f57785e = c17648a;
            super();
            this.f57786f = j;
            if (this.f57786f == 0) {
                m64258a(true, null);
            }
        }

        public long read(C18549c c18549c, long j) throws IOException {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.f57786f == 0) {
                return -1;
            } else {
                c18549c = super.read(c18549c, Math.min(this.f57786f, j));
                if (c18549c == -1) {
                    c18549c = new ProtocolException("unexpected end of stream");
                    m64258a(0, c18549c);
                    throw c18549c;
                }
                this.f57786f -= c18549c;
                if (this.f57786f == 0) {
                    m64258a(true, null);
                }
                return c18549c;
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (!(this.f57786f == 0 || C15908c.m60170a((Source) this, 100, TimeUnit.MILLISECONDS))) {
                    m64258a(false, null);
                }
                this.b = true;
            }
        }
    }

    /* renamed from: okhttp3.internal.a.a$f */
    private class C18544f extends C17645a {
        /* renamed from: e */
        final /* synthetic */ C17648a f57787e;
        /* renamed from: f */
        private boolean f57788f;

        C18544f(C17648a c17648a) {
            this.f57787e = c17648a;
            super();
        }

        public long read(C18549c c18549c, long j) throws IOException {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.f57788f) {
                return -1;
            } else {
                c18549c = super.read(c18549c, j);
                if (c18549c != -1) {
                    return c18549c;
                }
                this.f57788f = true;
                m64258a(true, 0);
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (!this.f57788f) {
                    m64258a(false, null);
                }
                this.b = true;
            }
        }
    }

    public C17648a(C17692o c17692o, C15921f c15921f, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.f54854a = c17692o;
        this.f54855b = c15921f;
        this.f54856c = bufferedSource;
        this.f54857d = bufferedSink;
    }

    public Sink createRequestBody(C15963q c15963q, long j) {
        if ("chunked".equalsIgnoreCase(c15963q.m60525a("Transfer-Encoding")) != null) {
            return m64265b();
        }
        if (j != -1) {
            return m64261a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public void cancel() {
        C17659c c = this.f54855b.m60251c();
        if (c != null) {
            c.m64307a();
        }
    }

    public void writeRequestHeaders(C15963q c15963q) throws IOException {
        m64263a(c15963q.m60529c(), C15927h.m60281a(c15963q, this.f54855b.m60251c().route().m60568b().type()));
    }

    public C15968t openResponseBody(C15966s c15966s) throws IOException {
        this.f54855b.f49338c.m59961f(this.f54855b.f49337b);
        String a = c15966s.m60551a(ManagerWebServices.PARAM_CONTENT_TYPE);
        if (!C15925d.m60273d(c15966s)) {
            return new C17663g(a, 0, C15976k.m60609a(m64266b(0)));
        }
        if ("chunked".equalsIgnoreCase(c15966s.m60551a("Transfer-Encoding"))) {
            return new C17663g(a, -1, C15976k.m60609a(m64262a(c15966s.m60553a().m60526a())));
        }
        long a2 = C15925d.m60264a(c15966s);
        if (a2 != -1) {
            return new C17663g(a, a2, C15976k.m60609a(m64266b(a2)));
        }
        return new C17663g(a, -1, C15976k.m60609a(m64267c()));
    }

    public void flushRequest() throws IOException {
        this.f54857d.flush();
    }

    public void finishRequest() throws IOException {
        this.f54857d.flush();
    }

    /* renamed from: a */
    public void m64263a(C15957l c15957l, String str) throws IOException {
        if (this.f54858e != 0) {
            str = new StringBuilder();
            str.append("state: ");
            str.append(this.f54858e);
            throw new IllegalStateException(str.toString());
        }
        this.f54857d.writeUtf8(str).writeUtf8("\r\n");
        int a = c15957l.m60473a();
        for (int i = null; i < a; i++) {
            this.f54857d.writeUtf8(c15957l.m60474a(i)).writeUtf8(": ").writeUtf8(c15957l.m60476b(i)).writeUtf8("\r\n");
        }
        this.f54857d.writeUtf8("\r\n");
        this.f54858e = 1;
    }

    public C15965a readResponseHeaders(boolean z) throws IOException {
        if (this.f54858e == 1 || this.f54858e == 3) {
            try {
                C15928j a = C15928j.m60283a(m64259d());
                C15965a a2 = new C15965a().m60540a(a.f49354a).m60536a(a.f49355b).m60538a(a.f49356c).m60542a(m64260a());
                if (z && a.f49355b) {
                    return false;
                }
                if (a.f49355b) {
                    this.f54858e = 3;
                    return a2;
                }
                this.f54858e = true;
                return a2;
            } catch (boolean z2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected end of stream on ");
                stringBuilder.append(this.f54855b);
                IOException iOException = new IOException(stringBuilder.toString());
                iOException.initCause(z2);
                throw iOException;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("state: ");
        stringBuilder2.append(this.f54858e);
        throw new IllegalStateException(stringBuilder2.toString());
    }

    /* renamed from: d */
    private String m64259d() throws IOException {
        String readUtf8LineStrict = this.f54856c.readUtf8LineStrict(this.f54859f);
        this.f54859f -= (long) readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    /* renamed from: a */
    public C15957l m64260a() throws IOException {
        C15956a c15956a = new C15956a();
        while (true) {
            String d = m64259d();
            if (d.length() == 0) {
                return c15956a.m60466a();
            }
            C15900a.f49230a.mo13404a(c15956a, d);
        }
    }

    /* renamed from: b */
    public Sink m64265b() {
        if (this.f54858e != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f54858e);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f54858e = 2;
        return new C17646b(this);
    }

    /* renamed from: a */
    public Sink m64261a(long j) {
        if (this.f54858e != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f54858e);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f54858e = 2;
        return new C17647d(this, j);
    }

    /* renamed from: b */
    public Source m64266b(long j) throws IOException {
        if (this.f54858e != 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f54858e);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f54858e = 5;
        return new C18543e(this, j);
    }

    /* renamed from: a */
    public Source m64262a(HttpUrl httpUrl) throws IOException {
        if (this.f54858e != 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f54858e);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f54858e = 5;
        return new C18542c(this, httpUrl);
    }

    /* renamed from: c */
    public Source m64267c() throws IOException {
        if (this.f54858e != 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.f54858e);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.f54855b == null) {
            throw new IllegalStateException("streamAllocation == null");
        } else {
            this.f54858e = 5;
            this.f54855b.m60253e();
            return new C18544f(this);
        }
    }

    /* renamed from: a */
    void m64264a(C17705g c17705g) {
        C15982q a = c17705g.m64459a();
        c17705g.m64458a(C15982q.f49620c);
        a.mo13439f();
        a.p_();
    }
}
