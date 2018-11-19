package com.squareup.okhttp.internal.http;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.squareup.okhttp.C5995a;
import com.squareup.okhttp.C6005e;
import com.squareup.okhttp.C6007g;
import com.squareup.okhttp.C6009h;
import com.squareup.okhttp.C6066n;
import com.squareup.okhttp.C6066n.C6065a;
import com.squareup.okhttp.C6067o;
import com.squareup.okhttp.C6068p;
import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.C6071q.C6070a;
import com.squareup.okhttp.C6075s;
import com.squareup.okhttp.C6075s.C6074a;
import com.squareup.okhttp.C6076t;
import com.squareup.okhttp.C6077u;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Interceptor.Chain;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.C6021d;
import com.squareup.okhttp.internal.C6058i;
import com.squareup.okhttp.internal.C6059j;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.http.C6044b.C6043a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C15976k;
import okio.C15982q;
import okio.C17707i;
import okio.C18549c;
import okio.Sink;
import okio.Source;

/* renamed from: com.squareup.okhttp.internal.http.g */
public final class C6050g {
    /* renamed from: d */
    private static final C6076t f22165d = new C72401();
    /* renamed from: a */
    final C6068p f22166a;
    /* renamed from: b */
    long f22167b = -1;
    /* renamed from: c */
    public final boolean f22168c;
    /* renamed from: e */
    private C6007g f22169e;
    /* renamed from: f */
    private C5995a f22170f;
    /* renamed from: g */
    private C6055n f22171g;
    /* renamed from: h */
    private C6077u f22172h;
    /* renamed from: i */
    private final C6075s f22173i;
    /* renamed from: j */
    private Transport f22174j;
    /* renamed from: k */
    private boolean f22175k;
    /* renamed from: l */
    private final C6071q f22176l;
    /* renamed from: m */
    private C6071q f22177m;
    /* renamed from: n */
    private C6075s f22178n;
    /* renamed from: o */
    private C6075s f22179o;
    /* renamed from: p */
    private Sink f22180p;
    /* renamed from: q */
    private BufferedSink f22181q;
    /* renamed from: r */
    private final boolean f22182r;
    /* renamed from: s */
    private final boolean f22183s;
    /* renamed from: t */
    private CacheRequest f22184t;
    /* renamed from: u */
    private C6044b f22185u;

    /* renamed from: com.squareup.okhttp.internal.http.g$1 */
    static class C72401 extends C6076t {
        /* renamed from: a */
        public C6067o mo6485a() {
            return null;
        }

        /* renamed from: b */
        public long mo6486b() {
            return 0;
        }

        C72401() {
        }

        /* renamed from: c */
        public BufferedSource mo6487c() {
            return new C18549c();
        }
    }

    /* renamed from: com.squareup.okhttp.internal.http.g$a */
    class C7242a implements Chain {
        /* renamed from: a */
        final /* synthetic */ C6050g f26130a;
        /* renamed from: b */
        private final int f26131b;
        /* renamed from: c */
        private final C6071q f26132c;
        /* renamed from: d */
        private int f26133d;

        C7242a(C6050g c6050g, int i, C6071q c6071q) {
            this.f26130a = c6050g;
            this.f26131b = i;
            this.f26132c = c6071q;
        }

        public C6007g connection() {
            return this.f26130a.f22169e;
        }

        public C6071q request() {
            return this.f26132c;
        }

        public C6075s proceed(C6071q c6071q) throws IOException {
            StringBuilder stringBuilder;
            this.f26133d++;
            if (this.f26131b > 0) {
                Interceptor interceptor = (Interceptor) this.f26130a.f22166a.m26320x().get(this.f26131b - 1);
                C5995a a = connection().m25834c().m26414a();
                if (c6071q.m26343a().m25744g().equals(a.m25752a())) {
                    if (c6071q.m26343a().m25745h() == a.m25753b()) {
                        if (this.f26133d > 1) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("network interceptor ");
                            stringBuilder.append(interceptor);
                            stringBuilder.append(" must call proceed() exactly once");
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("network interceptor ");
                stringBuilder.append(interceptor);
                stringBuilder.append(" must retain the same host and port");
                throw new IllegalStateException(stringBuilder.toString());
            }
            if (this.f26131b < this.f26130a.f22166a.m26320x().size()) {
                Object c7242a = new C7242a(this.f26130a, this.f26131b + 1, c6071q);
                Interceptor interceptor2 = (Interceptor) this.f26130a.f22166a.m26320x().get(this.f26131b);
                C6075s intercept = interceptor2.intercept(c7242a);
                if (c7242a.f26133d != 1) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("network interceptor ");
                    stringBuilder.append(interceptor2);
                    stringBuilder.append(" must call proceed() exactly once");
                    throw new IllegalStateException(stringBuilder.toString());
                } else if (intercept != null) {
                    return intercept;
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("network interceptor ");
                    stringBuilder.append(interceptor2);
                    stringBuilder.append(" returned null");
                    throw new NullPointerException(stringBuilder.toString());
                }
            }
            this.f26130a.f22174j.writeRequestHeaders(c6071q);
            this.f26130a.f22177m = c6071q;
            if (this.f26130a.m26190a(c6071q) && c6071q.m26350f() != null) {
                BufferedSink a2 = C15976k.a(this.f26130a.f22174j.createRequestBody(c6071q, c6071q.m26350f().mo6566b()));
                c6071q.m26350f().mo6565a(a2);
                a2.close();
            }
            c6071q = this.f26130a.m26184n();
            int c = c6071q.m26397c();
            if ((c != 204 && c != 205) || c6071q.m26402h().mo6486b() <= 0) {
                return c6071q;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("HTTP ");
            stringBuilder2.append(c);
            stringBuilder2.append(" had non-zero Content-Length: ");
            stringBuilder2.append(c6071q.m26402h().mo6486b());
            throw new ProtocolException(stringBuilder2.toString());
        }
    }

    public C6050g(C6068p c6068p, C6071q c6071q, boolean z, boolean z2, boolean z3, C6007g c6007g, C6055n c6055n, C7245m c7245m, C6075s c6075s) {
        this.f22166a = c6068p;
        this.f22176l = c6071q;
        this.f22168c = z;
        this.f22182r = z2;
        this.f22183s = z3;
        this.f22169e = c6007g;
        this.f22171g = c6055n;
        this.f22180p = c7245m;
        this.f22173i = c6075s;
        if (c6007g != null) {
            C6021d.f22041b.mo6562b(c6007g, this);
            this.f22172h = c6007g.m25834c();
            return;
        }
        this.f22172h = null;
    }

    /* renamed from: a */
    public void m26187a() throws RequestException, RouteException, IOException {
        if (this.f22185u == null) {
            if (this.f22174j != null) {
                throw new IllegalStateException();
            }
            C6071q b = m26176b(this.f22176l);
            InternalCache a = C6021d.f22041b.mo6552a(this.f22166a);
            C6075s c6075s = a != null ? a.get(b) : null;
            this.f22185u = new C6043a(System.currentTimeMillis(), b, c6075s).m26131a();
            this.f22177m = this.f22185u.f22152a;
            this.f22178n = this.f22185u.f22153b;
            if (a != null) {
                a.trackResponse(this.f22185u);
            }
            if (c6075s != null && this.f22178n == null) {
                C6058i.m26247a(c6075s.m26402h());
            }
            if (this.f22177m != null) {
                if (this.f22169e == null) {
                    m26181k();
                }
                this.f22174j = C6021d.f22041b.mo6553a(this.f22169e, this);
                if (this.f22182r && m26190a(this.f22177m) && this.f22180p == null) {
                    long a2 = C6053j.m26205a(b);
                    if (!this.f22168c) {
                        this.f22174j.writeRequestHeaders(this.f22177m);
                        this.f22180p = this.f22174j.createRequestBody(this.f22177m, a2);
                    } else if (a2 > 2147483647L) {
                        throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                    } else if (a2 != -1) {
                        this.f22174j.writeRequestHeaders(this.f22177m);
                        this.f22180p = new C7245m((int) a2);
                    } else {
                        this.f22180p = new C7245m();
                    }
                }
            } else {
                if (this.f22169e != null) {
                    C6021d.f22041b.mo6555a(this.f22166a.m26311o(), this.f22169e);
                    this.f22169e = null;
                }
                if (this.f22178n != null) {
                    this.f22179o = this.f22178n.m26403i().m26374a(this.f22176l).m26382c(C6050g.m26177b(this.f22173i)).m26380b(C6050g.m26177b(this.f22178n)).m26379a();
                } else {
                    this.f22179o = new C6074a().m26374a(this.f22176l).m26382c(C6050g.m26177b(this.f22173i)).m26371a(Protocol.HTTP_1_1).m26370a(504).m26377a("Unsatisfiable Request (only-if-cached)").m26376a(f22165d).m26379a();
                }
                this.f22179o = m26180c(this.f22179o);
            }
        }
    }

    /* renamed from: b */
    private static C6075s m26177b(C6075s c6075s) {
        return (c6075s == null || c6075s.m26402h() == null) ? c6075s : c6075s.m26403i().m26376a(null).m26379a();
    }

    /* renamed from: k */
    private void m26181k() throws RequestException, RouteException {
        if (this.f22169e != null) {
            throw new IllegalStateException();
        }
        if (this.f22171g == null) {
            this.f22170f = C6050g.m26166a(this.f22166a, this.f22177m);
            try {
                this.f22171g = C6055n.m26224a(this.f22170f, this.f22177m, this.f22166a);
            } catch (IOException e) {
                throw new RequestException(e);
            }
        }
        this.f22169e = m26182l();
        C6021d.f22041b.mo6558a(this.f22166a, this.f22169e, this);
        this.f22172h = this.f22169e.m25834c();
    }

    /* renamed from: l */
    private C6007g m26182l() throws RouteException {
        C6007g a;
        C6009h o = this.f22166a.m26311o();
        while (true) {
            a = o.m25849a(this.f22170f);
            if (a == null) {
                try {
                    return new C6007g(o, this.f22171g.m26236b());
                } catch (IOException e) {
                    throw new RouteException(e);
                }
            } else if (this.f22177m.m26348d().equals("GET")) {
                break;
            } else if (C6021d.f22041b.mo6563c(a)) {
                break;
            } else {
                C6058i.m26249a(a.m25835d());
            }
        }
        return a;
    }

    /* renamed from: b */
    public void m26191b() {
        if (this.f22167b != -1) {
            throw new IllegalStateException();
        }
        this.f22167b = System.currentTimeMillis();
    }

    /* renamed from: a */
    boolean m26190a(C6071q c6071q) {
        return C6051h.m26202c(c6071q.m26348d());
    }

    /* renamed from: c */
    public C6071q m26192c() {
        return this.f22176l;
    }

    /* renamed from: d */
    public C6075s m26193d() {
        if (this.f22179o != null) {
            return this.f22179o;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public C6007g m26194e() {
        return this.f22169e;
    }

    /* renamed from: a */
    public C6050g m26185a(RouteException routeException) {
        if (!(this.f22171g == null || this.f22169e == null)) {
            m26171a(this.f22171g, routeException.m26124a());
        }
        if ((this.f22171g == null && this.f22169e == null) || ((this.f22171g != null && !this.f22171g.m26235a()) || m26178b(routeException) == null)) {
            return null;
        }
        return new C6050g(this.f22166a, this.f22176l, this.f22168c, this.f22182r, this.f22183s, m26197h(), this.f22171g, (C7245m) this.f22180p, this.f22173i);
    }

    /* renamed from: b */
    private boolean m26178b(RouteException routeException) {
        if (!this.f22166a.m26314r()) {
            return false;
        }
        routeException = routeException.m26124a();
        if (routeException instanceof ProtocolException) {
            return false;
        }
        if (routeException instanceof InterruptedIOException) {
            return routeException instanceof SocketTimeoutException;
        }
        if ((!(routeException instanceof SSLHandshakeException) || !(routeException.getCause() instanceof CertificateException)) && (routeException instanceof SSLPeerUnverifiedException) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C6050g m26186a(IOException iOException, Sink sink) {
        Object obj;
        if (!(this.f22171g == null || this.f22169e == null)) {
            m26171a(this.f22171g, iOException);
        }
        if (sink != null) {
            if (!(sink instanceof C7245m)) {
                obj = null;
                if (!(this.f22171g == null && this.f22169e == null) && ((this.f22171g == null || this.f22171g.m26235a()) && m26174a(iOException) != null)) {
                    if (obj != null) {
                        return new C6050g(this.f22166a, this.f22176l, this.f22168c, this.f22182r, this.f22183s, m26197h(), this.f22171g, (C7245m) sink, this.f22173i);
                    }
                }
                return null;
            }
        }
        obj = 1;
        if (obj != null) {
            return null;
        }
        return new C6050g(this.f22166a, this.f22176l, this.f22168c, this.f22182r, this.f22183s, m26197h(), this.f22171g, (C7245m) sink, this.f22173i);
    }

    /* renamed from: a */
    private void m26171a(C6055n c6055n, IOException iOException) {
        if (C6021d.f22041b.mo6560b(this.f22169e) <= 0) {
            c6055n.m26234a(this.f22169e.m25834c(), iOException);
        }
    }

    /* renamed from: a */
    private boolean m26174a(IOException iOException) {
        if (this.f22166a.m26314r() && !(iOException instanceof ProtocolException) && (iOException instanceof InterruptedIOException) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C6077u m26195f() {
        return this.f22172h;
    }

    /* renamed from: m */
    private void m26183m() throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = com.squareup.okhttp.internal.C6021d.f22041b;
        r1 = r3.f22166a;
        r0 = r0.mo6552a(r1);
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r1 = r3.f22179o;
        r2 = r3.f22177m;
        r1 = com.squareup.okhttp.internal.http.C6044b.m26132a(r1, r2);
        if (r1 != 0) goto L_0x0027;
    L_0x0015:
        r1 = r3.f22177m;
        r1 = r1.m26348d();
        r1 = com.squareup.okhttp.internal.http.C6051h.m26200a(r1);
        if (r1 == 0) goto L_0x0026;
    L_0x0021:
        r1 = r3.f22177m;	 Catch:{ IOException -> 0x0026 }
        r0.remove(r1);	 Catch:{ IOException -> 0x0026 }
    L_0x0026:
        return;
    L_0x0027:
        r1 = r3.f22179o;
        r1 = com.squareup.okhttp.internal.http.C6050g.m26177b(r1);
        r0 = r0.put(r1);
        r3.f22184t = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.g.m():void");
    }

    /* renamed from: g */
    public void m26196g() throws IOException {
        if (!(this.f22174j == null || this.f22169e == null)) {
            this.f22174j.releaseConnectionOnIdle();
        }
        this.f22169e = null;
    }

    /* renamed from: h */
    public C6007g m26197h() {
        if (this.f22181q != null) {
            C6058i.m26247a(this.f22181q);
        } else if (this.f22180p != null) {
            C6058i.m26247a(this.f22180p);
        }
        if (this.f22179o == null) {
            if (this.f22169e != null) {
                C6058i.m26249a(this.f22169e.m25835d());
            }
            this.f22169e = null;
            return null;
        }
        C6058i.m26247a(this.f22179o.m26402h());
        if (this.f22174j == null || this.f22169e == null || this.f22174j.canReuseConnection()) {
            if (!(this.f22169e == null || C6021d.f22041b.mo6559a(this.f22169e))) {
                this.f22169e = null;
            }
            C6007g c6007g = this.f22169e;
            this.f22169e = null;
            return c6007g;
        }
        C6058i.m26249a(this.f22169e.m25835d());
        this.f22169e = null;
        return null;
    }

    /* renamed from: c */
    private C6075s m26180c(C6075s c6075s) throws IOException {
        if (this.f22175k) {
            if ("gzip".equalsIgnoreCase(this.f22179o.m26394a("Content-Encoding"))) {
                if (c6075s.m26402h() == null) {
                    return c6075s;
                }
                Source c17707i = new C17707i(c6075s.m26402h().mo6487c());
                C6066n a = c6075s.m26401g().m26285b().m26278b("Content-Encoding").m26278b("Content-Length").m26277a();
                return c6075s.m26403i().m26373a(a).m26376a(new C7244k(a, C15976k.a(c17707i))).m26379a();
            }
        }
        return c6075s;
    }

    /* renamed from: a */
    public static boolean m26172a(C6075s c6075s) {
        if (c6075s.m26393a().m26348d().equals("HEAD")) {
            return false;
        }
        int c = c6075s.m26397c();
        if (((c >= 100 && c < Callback.DEFAULT_DRAG_ANIMATION_DURATION) || c == 204 || c == 304) && C6053j.m26206a(c6075s) == -1) {
            if ("chunked".equalsIgnoreCase(c6075s.m26394a("Transfer-Encoding")) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private C6071q m26176b(C6071q c6071q) throws IOException {
        C6070a g = c6071q.m26351g();
        if (c6071q.m26344a("Host") == null) {
            g.m26334a("Host", C6058i.m26238a(c6071q.m26343a()));
        }
        if (c6071q.m26344a("Connection") == null) {
            g.m26334a("Connection", "Keep-Alive");
        }
        if (c6071q.m26344a("Accept-Encoding") == null) {
            this.f22175k = true;
            g.m26334a("Accept-Encoding", "gzip");
        }
        CookieHandler f = this.f22166a.m26302f();
        if (f != null) {
            C6053j.m26211a(g, f.get(c6071q.m26345b(), C6053j.m26210a(g.m26335a().m26349e(), null)));
        }
        if (c6071q.m26344a("User-Agent") == null) {
            g.m26334a("User-Agent", C6059j.m26257a());
        }
        return g.m26335a();
    }

    /* renamed from: i */
    public void m26198i() throws IOException {
        if (this.f22179o == null) {
            if (this.f22177m == null && this.f22178n == null) {
                throw new IllegalStateException("call sendRequest() first!");
            } else if (this.f22177m != null) {
                C6075s n;
                if (this.f22183s) {
                    this.f22174j.writeRequestHeaders(this.f22177m);
                    n = m26184n();
                } else if (this.f22182r) {
                    if (this.f22181q != null && this.f22181q.buffer().a() > 0) {
                        this.f22181q.emit();
                    }
                    if (this.f22167b == -1) {
                        if (C6053j.m26205a(this.f22177m) == -1 && (this.f22180p instanceof C7245m)) {
                            this.f22177m = this.f22177m.m26351g().m26334a("Content-Length", Long.toString(((C7245m) this.f22180p).m31040a())).m26335a();
                        }
                        this.f22174j.writeRequestHeaders(this.f22177m);
                    }
                    if (this.f22180p != null) {
                        if (this.f22181q != null) {
                            this.f22181q.close();
                        } else {
                            this.f22180p.close();
                        }
                        if (this.f22180p instanceof C7245m) {
                            this.f22174j.writeRequestBody((C7245m) this.f22180p);
                        }
                    }
                    n = m26184n();
                } else {
                    n = new C7242a(this, 0, this.f22177m).proceed(this.f22177m);
                }
                m26188a(n.m26401g());
                if (this.f22178n != null) {
                    if (C6050g.m26173a(this.f22178n, n)) {
                        this.f22179o = this.f22178n.m26403i().m26374a(this.f22176l).m26382c(C6050g.m26177b(this.f22173i)).m26373a(C6050g.m26168a(this.f22178n.m26401g(), n.m26401g())).m26380b(C6050g.m26177b(this.f22178n)).m26375a(C6050g.m26177b(n)).m26379a();
                        n.m26402h().close();
                        m26196g();
                        InternalCache a = C6021d.f22041b.mo6552a(this.f22166a);
                        a.trackConditionalCacheHit();
                        a.update(this.f22178n, C6050g.m26177b(this.f22179o));
                        this.f22179o = m26180c(this.f22179o);
                        return;
                    }
                    C6058i.m26247a(this.f22178n.m26402h());
                }
                this.f22179o = n.m26403i().m26374a(this.f22176l).m26382c(C6050g.m26177b(this.f22173i)).m26380b(C6050g.m26177b(this.f22178n)).m26375a(C6050g.m26177b(n)).m26379a();
                if (C6050g.m26172a(this.f22179o)) {
                    m26183m();
                    this.f22179o = m26180c(m26170a(this.f22184t, this.f22179o));
                }
            }
        }
    }

    /* renamed from: n */
    private C6075s m26184n() throws IOException {
        this.f22174j.finishRequest();
        C6075s a = this.f22174j.readResponseHeaders().m26374a(this.f22177m).m26372a(this.f22169e.m25841j()).m26378a(C6053j.f22187b, Long.toString(this.f22167b)).m26378a(C6053j.f22188c, Long.toString(System.currentTimeMillis())).m26379a();
        return !this.f22183s ? a.m26403i().m26376a(this.f22174j.openResponseBody(a)).m26379a() : a;
    }

    /* renamed from: a */
    private C6075s m26170a(final CacheRequest cacheRequest, C6075s c6075s) throws IOException {
        if (cacheRequest == null) {
            return c6075s;
        }
        Sink body = cacheRequest.body();
        if (body == null) {
            return c6075s;
        }
        final BufferedSource c = c6075s.m26402h().mo6487c();
        final BufferedSink a = C15976k.a(body);
        return c6075s.m26403i().m26376a(new C7244k(c6075s.m26401g(), C15976k.a(new Source(this) {
            /* renamed from: a */
            boolean f26125a;
            /* renamed from: e */
            final /* synthetic */ C6050g f26129e;

            public long read(C18549c c18549c, long j) throws IOException {
                try {
                    j = c.read(c18549c, j);
                    if (j == -1) {
                        if (this.f26125a == null) {
                            this.f26125a = true;
                            a.close();
                        }
                        return -1;
                    }
                    c18549c.a(a.buffer(), c18549c.a() - j, j);
                    a.emitCompleteSegments();
                    return j;
                } catch (C18549c c18549c2) {
                    if (this.f26125a == null) {
                        this.f26125a = true;
                        cacheRequest.abort();
                    }
                    throw c18549c2;
                }
            }

            public C15982q timeout() {
                return c.timeout();
            }

            public void close() throws IOException {
                if (!(this.f26125a || C6058i.m26252a((Source) this, 100, TimeUnit.MILLISECONDS))) {
                    this.f26125a = true;
                    cacheRequest.abort();
                }
                c.close();
            }
        }))).m26379a();
    }

    /* renamed from: a */
    private static boolean m26173a(C6075s c6075s, C6075s c6075s2) {
        if (c6075s2.m26397c() == 304) {
            return true;
        }
        c6075s = c6075s.m26401g().m26287b("Last-Modified");
        if (c6075s != null) {
            c6075s2 = c6075s2.m26401g().m26287b("Last-Modified");
            if (c6075s2 != null && c6075s2.getTime() < c6075s.getTime()) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C6066n m26168a(C6066n c6066n, C6066n c6066n2) throws IOException {
        C6065a c6065a = new C6065a();
        int a = c6066n.m26282a();
        for (int i = 0; i < a; i++) {
            String a2 = c6066n.m26283a(i);
            String b = c6066n.m26286b(i);
            if (!"Warning".equalsIgnoreCase(a2) || !b.startsWith("1")) {
                if (!C6053j.m26213a(a2) || c6066n2.m26284a(a2) == null) {
                    c6065a.m26276a(a2, b);
                }
            }
        }
        c6066n = c6066n2.m26282a();
        for (int i2 = 0; i2 < c6066n; i2++) {
            String a3 = c6066n2.m26283a(i2);
            if (!"Content-Length".equalsIgnoreCase(a3)) {
                if (C6053j.m26213a(a3)) {
                    c6065a.m26276a(a3, c6066n2.m26286b(i2));
                }
            }
        }
        return c6065a.m26277a();
    }

    /* renamed from: a */
    public void m26188a(C6066n c6066n) throws IOException {
        CookieHandler f = this.f22166a.m26302f();
        if (f != null) {
            f.put(this.f22176l.m26345b(), C6053j.m26210a(c6066n, null));
        }
    }

    /* renamed from: j */
    public C6071q m26199j() throws IOException {
        if (this.f22179o == null) {
            throw new IllegalStateException();
        }
        Proxy b;
        if (m26195f() != null) {
            b = m26195f().m26415b();
        } else {
            b = this.f22166a.m26300d();
        }
        int c = this.f22179o.m26397c();
        if (c != 401) {
            if (c != 407) {
                switch (c) {
                    case MapboxConstants.ANIMATION_DURATION /*300*/:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        switch (c) {
                            case 307:
                            case 308:
                                if (!(this.f22176l.m26348d().equals("GET") || this.f22176l.m26348d().equals("HEAD"))) {
                                    return null;
                                }
                            default:
                                return null;
                        }
                }
                if (!this.f22166a.m26313q()) {
                    return null;
                }
                String a = this.f22179o.m26394a("Location");
                if (a == null) {
                    return null;
                }
                HttpUrl c2 = this.f22176l.m26343a().m25739c(a);
                if (c2 == null) {
                    return null;
                }
                if (!c2.m25740c().equals(this.f22176l.m26343a().m25740c()) && !this.f22166a.m26312p()) {
                    return null;
                }
                C6070a g = this.f22176l.m26351g();
                if (C6051h.m26202c(this.f22176l.m26348d())) {
                    g.m26333a("GET", null);
                    g.m26336b("Transfer-Encoding");
                    g.m26336b("Content-Length");
                    g.m26336b(ManagerWebServices.PARAM_CONTENT_TYPE);
                }
                if (!m26189a(c2)) {
                    g.m26336b("Authorization");
                }
                return g.m26328a(c2).m26335a();
            } else if (b.type() != Type.HTTP) {
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
        }
        return C6053j.m26208a(this.f22166a.m26310n(), this.f22179o, b);
    }

    /* renamed from: a */
    public boolean m26189a(HttpUrl httpUrl) {
        HttpUrl a = this.f22176l.m26343a();
        return (a.m25744g().equals(httpUrl.m25744g()) && a.m25745h() == httpUrl.m25745h() && a.m25740c().equals(httpUrl.m25740c()) != null) ? true : null;
    }

    /* renamed from: a */
    private static C5995a m26166a(C6068p c6068p, C6071q c6071q) {
        HostnameVerifier l;
        SSLSocketFactory sSLSocketFactory;
        C6005e m;
        if (c6071q.m26353i()) {
            SSLSocketFactory k = c6068p.m26307k();
            l = c6068p.m26308l();
            sSLSocketFactory = k;
            m = c6068p.m26309m();
        } else {
            sSLSocketFactory = null;
            l = sSLSocketFactory;
            m = l;
        }
        return new C5995a(c6071q.m26343a().m25744g(), c6071q.m26343a().m25745h(), c6068p.m26305i(), c6068p.m26306j(), sSLSocketFactory, l, m, c6068p.m26310n(), c6068p.m26300d(), c6068p.m26317u(), c6068p.m26318v(), c6068p.m26301e());
    }
}
