package com.squareup.okhttp;

import com.squareup.okhttp.C6066n.C6065a;
import com.squareup.okhttp.internal.C6021d;
import com.squareup.okhttp.internal.C6041h;
import com.squareup.okhttp.internal.C6058i;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.http.C6050g;
import com.squareup.okhttp.internal.http.C7235a;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.Transport;
import com.squareup.okhttp.internal.p151a.C6014b;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.squareup.okhttp.p */
public class C6068p implements Cloneable {
    /* renamed from: a */
    private static final List<Protocol> f22230a = C6058i.m26241a(Protocol.HTTP_2, Protocol.SPDY_3, Protocol.HTTP_1_1);
    /* renamed from: b */
    private static final List<C6012i> f22231b = C6058i.m26241a(C6012i.f21979a, C6012i.f21980b, C6012i.f21981c);
    /* renamed from: c */
    private static SSLSocketFactory f22232c;
    /* renamed from: A */
    private int f22233A;
    /* renamed from: d */
    private final C6041h f22234d;
    /* renamed from: e */
    private C6061k f22235e;
    /* renamed from: f */
    private Proxy f22236f;
    /* renamed from: g */
    private List<Protocol> f22237g;
    /* renamed from: h */
    private List<C6012i> f22238h;
    /* renamed from: i */
    private final List<Interceptor> f22239i;
    /* renamed from: j */
    private final List<Interceptor> f22240j;
    /* renamed from: k */
    private ProxySelector f22241k;
    /* renamed from: l */
    private CookieHandler f22242l;
    /* renamed from: m */
    private InternalCache f22243m;
    /* renamed from: n */
    private C5997b f22244n;
    /* renamed from: o */
    private SocketFactory f22245o;
    /* renamed from: p */
    private SSLSocketFactory f22246p;
    /* renamed from: q */
    private HostnameVerifier f22247q;
    /* renamed from: r */
    private C6005e f22248r;
    /* renamed from: s */
    private Authenticator f22249s;
    /* renamed from: t */
    private C6009h f22250t;
    /* renamed from: u */
    private Dns f22251u;
    /* renamed from: v */
    private boolean f22252v;
    /* renamed from: w */
    private boolean f22253w;
    /* renamed from: x */
    private boolean f22254x;
    /* renamed from: y */
    private int f22255y;
    /* renamed from: z */
    private int f22256z;

    /* renamed from: com.squareup.okhttp.p$1 */
    static class C72471 extends C6021d {
        C72471() {
        }

        /* renamed from: a */
        public Transport mo6553a(C6007g c6007g, C6050g c6050g) throws IOException {
            return c6007g.m25826a(c6050g);
        }

        /* renamed from: a */
        public boolean mo6559a(C6007g c6007g) {
            return c6007g.m25831a();
        }

        /* renamed from: a */
        public void mo6554a(C6007g c6007g, Object obj) throws IOException {
            c6007g.m25832b(obj);
        }

        /* renamed from: b */
        public int mo6560b(C6007g c6007g) {
            return c6007g.m25844m();
        }

        /* renamed from: b */
        public void mo6562b(C6007g c6007g, C6050g c6050g) {
            c6007g.m25830a((Object) c6050g);
        }

        /* renamed from: c */
        public boolean mo6563c(C6007g c6007g) {
            return c6007g.m25837f();
        }

        /* renamed from: a */
        public void mo6557a(C6065a c6065a, String str) {
            c6065a.m26275a(str);
        }

        /* renamed from: a */
        public InternalCache mo6552a(C6068p c6068p) {
            return c6068p.m26303g();
        }

        /* renamed from: a */
        public void mo6555a(C6009h c6009h, C6007g c6007g) {
            c6009h.m25850a(c6007g);
        }

        /* renamed from: b */
        public C6041h mo6561b(C6068p c6068p) {
            return c6068p.m26315s();
        }

        /* renamed from: a */
        public void mo6558a(C6068p c6068p, C6007g c6007g, C6050g c6050g) throws RouteException {
            c6007g.m25829a(c6068p, (Object) c6050g);
        }

        /* renamed from: a */
        public void mo6556a(C6012i c6012i, SSLSocket sSLSocket, boolean z) {
            c6012i.m25870a(sSLSocket, z);
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m26322z();
    }

    static {
        C6021d.f22041b = new C72471();
    }

    public C6068p() {
        this.f22239i = new ArrayList();
        this.f22240j = new ArrayList();
        this.f22252v = true;
        this.f22253w = true;
        this.f22254x = true;
        this.f22255y = 10000;
        this.f22256z = 10000;
        this.f22233A = 10000;
        this.f22234d = new C6041h();
        this.f22235e = new C6061k();
    }

    private C6068p(C6068p c6068p) {
        this.f22239i = new ArrayList();
        this.f22240j = new ArrayList();
        this.f22252v = true;
        this.f22253w = true;
        this.f22254x = true;
        this.f22255y = 10000;
        this.f22256z = 10000;
        this.f22233A = 10000;
        this.f22234d = c6068p.f22234d;
        this.f22235e = c6068p.f22235e;
        this.f22236f = c6068p.f22236f;
        this.f22237g = c6068p.f22237g;
        this.f22238h = c6068p.f22238h;
        this.f22239i.addAll(c6068p.f22239i);
        this.f22240j.addAll(c6068p.f22240j);
        this.f22241k = c6068p.f22241k;
        this.f22242l = c6068p.f22242l;
        this.f22244n = c6068p.f22244n;
        this.f22243m = this.f22244n != null ? this.f22244n.f21920a : c6068p.f22243m;
        this.f22245o = c6068p.f22245o;
        this.f22246p = c6068p.f22246p;
        this.f22247q = c6068p.f22247q;
        this.f22248r = c6068p.f22248r;
        this.f22249s = c6068p.f22249s;
        this.f22250t = c6068p.f22250t;
        this.f22251u = c6068p.f22251u;
        this.f22252v = c6068p.f22252v;
        this.f22253w = c6068p.f22253w;
        this.f22254x = c6068p.f22254x;
        this.f22255y = c6068p.f22255y;
        this.f22256z = c6068p.f22256z;
        this.f22233A = c6068p.f22233A;
    }

    /* renamed from: a */
    public void m26295a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        } else {
            long toMillis = timeUnit.toMillis(j);
            if (toMillis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (toMillis != 0 || j <= 0) {
                this.f22255y = (int) toMillis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        }
    }

    /* renamed from: a */
    public int m26292a() {
        return this.f22255y;
    }

    /* renamed from: b */
    public void m26297b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        } else {
            long toMillis = timeUnit.toMillis(j);
            if (toMillis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (toMillis != 0 || j <= 0) {
                this.f22256z = (int) toMillis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        }
    }

    /* renamed from: b */
    public int m26296b() {
        return this.f22256z;
    }

    /* renamed from: c */
    public void m26299c(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        } else {
            long toMillis = timeUnit.toMillis(j);
            if (toMillis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (toMillis != 0 || j <= 0) {
                this.f22233A = (int) toMillis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        }
    }

    /* renamed from: c */
    public int m26298c() {
        return this.f22233A;
    }

    /* renamed from: d */
    public Proxy m26300d() {
        return this.f22236f;
    }

    /* renamed from: e */
    public ProxySelector m26301e() {
        return this.f22241k;
    }

    /* renamed from: f */
    public CookieHandler m26302f() {
        return this.f22242l;
    }

    /* renamed from: g */
    InternalCache m26303g() {
        return this.f22243m;
    }

    /* renamed from: a */
    public C6068p m26294a(C5997b c5997b) {
        this.f22244n = c5997b;
        this.f22243m = null;
        return this;
    }

    /* renamed from: h */
    public C5997b m26304h() {
        return this.f22244n;
    }

    /* renamed from: i */
    public Dns m26305i() {
        return this.f22251u;
    }

    /* renamed from: j */
    public SocketFactory m26306j() {
        return this.f22245o;
    }

    /* renamed from: k */
    public SSLSocketFactory m26307k() {
        return this.f22246p;
    }

    /* renamed from: l */
    public HostnameVerifier m26308l() {
        return this.f22247q;
    }

    /* renamed from: m */
    public C6005e m26309m() {
        return this.f22248r;
    }

    /* renamed from: n */
    public Authenticator m26310n() {
        return this.f22249s;
    }

    /* renamed from: o */
    public C6009h m26311o() {
        return this.f22250t;
    }

    /* renamed from: p */
    public boolean m26312p() {
        return this.f22252v;
    }

    /* renamed from: q */
    public boolean m26313q() {
        return this.f22253w;
    }

    /* renamed from: r */
    public boolean m26314r() {
        return this.f22254x;
    }

    /* renamed from: s */
    C6041h m26315s() {
        return this.f22234d;
    }

    /* renamed from: t */
    public C6061k m26316t() {
        return this.f22235e;
    }

    /* renamed from: u */
    public List<Protocol> m26317u() {
        return this.f22237g;
    }

    /* renamed from: v */
    public List<C6012i> m26318v() {
        return this.f22238h;
    }

    /* renamed from: w */
    public List<Interceptor> m26319w() {
        return this.f22239i;
    }

    /* renamed from: x */
    public List<Interceptor> m26320x() {
        return this.f22240j;
    }

    /* renamed from: a */
    public C6002d m26293a(C6071q c6071q) {
        return new C6002d(this, c6071q);
    }

    /* renamed from: y */
    C6068p m26321y() {
        C6068p c6068p = new C6068p(this);
        if (c6068p.f22241k == null) {
            c6068p.f22241k = ProxySelector.getDefault();
        }
        if (c6068p.f22242l == null) {
            c6068p.f22242l = CookieHandler.getDefault();
        }
        if (c6068p.f22245o == null) {
            c6068p.f22245o = SocketFactory.getDefault();
        }
        if (c6068p.f22246p == null) {
            c6068p.f22246p = m26291A();
        }
        if (c6068p.f22247q == null) {
            c6068p.f22247q = C6014b.f21994a;
        }
        if (c6068p.f22248r == null) {
            c6068p.f22248r = C6005e.f21954a;
        }
        if (c6068p.f22249s == null) {
            c6068p.f22249s = C7235a.f26099a;
        }
        if (c6068p.f22250t == null) {
            c6068p.f22250t = C6009h.m25845a();
        }
        if (c6068p.f22237g == null) {
            c6068p.f22237g = f22230a;
        }
        if (c6068p.f22238h == null) {
            c6068p.f22238h = f22231b;
        }
        if (c6068p.f22251u == null) {
            c6068p.f22251u = Dns.f21880a;
        }
        return c6068p;
    }

    /* renamed from: A */
    private synchronized javax.net.ssl.SSLSocketFactory m26291A() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = f22232c;	 Catch:{ all -> 0x0020 }
        if (r0 != 0) goto L_0x001c;
    L_0x0005:
        r0 = "TLS";	 Catch:{ GeneralSecurityException -> 0x0016 }
        r0 = javax.net.ssl.SSLContext.getInstance(r0);	 Catch:{ GeneralSecurityException -> 0x0016 }
        r1 = 0;	 Catch:{ GeneralSecurityException -> 0x0016 }
        r0.init(r1, r1, r1);	 Catch:{ GeneralSecurityException -> 0x0016 }
        r0 = r0.getSocketFactory();	 Catch:{ GeneralSecurityException -> 0x0016 }
        f22232c = r0;	 Catch:{ GeneralSecurityException -> 0x0016 }
        goto L_0x001c;
    L_0x0016:
        r0 = new java.lang.AssertionError;	 Catch:{ all -> 0x0020 }
        r0.<init>();	 Catch:{ all -> 0x0020 }
        throw r0;	 Catch:{ all -> 0x0020 }
    L_0x001c:
        r0 = f22232c;	 Catch:{ all -> 0x0020 }
        monitor-exit(r2);
        return r0;
    L_0x0020:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.p.A():javax.net.ssl.SSLSocketFactory");
    }

    /* renamed from: z */
    public C6068p m26322z() {
        return new C6068p(this);
    }
}
