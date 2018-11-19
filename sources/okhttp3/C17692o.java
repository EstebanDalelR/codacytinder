package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C15957l.C15956a;
import okhttp3.C15966s.C15965a;
import okhttp3.Call.Factory;
import okhttp3.internal.C15900a;
import okhttp3.internal.C15908c;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.connection.C15917d;
import okhttp3.internal.connection.C15921f;
import okhttp3.internal.connection.C17659c;
import okhttp3.internal.p461b.C15904f;
import okhttp3.internal.tls.C15944c;
import okhttp3.internal.tls.C15945d;
import okhttp3.internal.ws.C17686a;

/* renamed from: okhttp3.o */
public class C17692o implements Cloneable, Factory, WebSocket.Factory {
    /* renamed from: a */
    static final List<Protocol> f55040a = C15908c.m60162a(Protocol.HTTP_2, Protocol.HTTP_1_1);
    /* renamed from: b */
    static final List<C15896g> f55041b = C15908c.m60162a(C15896g.f49202a, C15896g.f49204c);
    /* renamed from: A */
    final int f55042A;
    /* renamed from: B */
    final int f55043B;
    /* renamed from: C */
    final int f55044C;
    /* renamed from: c */
    final C15898i f55045c;
    @Nullable
    /* renamed from: d */
    final Proxy f55046d;
    /* renamed from: e */
    final List<Protocol> f55047e;
    /* renamed from: f */
    final List<C15896g> f55048f;
    /* renamed from: g */
    final List<Interceptor> f55049g;
    /* renamed from: h */
    final List<Interceptor> f55050h;
    /* renamed from: i */
    final EventListener.Factory f55051i;
    /* renamed from: j */
    final ProxySelector f55052j;
    /* renamed from: k */
    final CookieJar f55053k;
    @Nullable
    /* renamed from: l */
    final C2670b f55054l;
    @Nullable
    /* renamed from: m */
    final InternalCache f55055m;
    /* renamed from: n */
    final SocketFactory f55056n;
    @Nullable
    /* renamed from: o */
    final SSLSocketFactory f55057o;
    @Nullable
    /* renamed from: p */
    final C15944c f55058p;
    /* renamed from: q */
    final HostnameVerifier f55059q;
    /* renamed from: r */
    final C15890d f55060r;
    /* renamed from: s */
    final Authenticator f55061s;
    /* renamed from: t */
    final Authenticator f55062t;
    /* renamed from: u */
    final C15894f f55063u;
    /* renamed from: v */
    final Dns f55064v;
    /* renamed from: w */
    final boolean f55065w;
    /* renamed from: x */
    final boolean f55066x;
    /* renamed from: y */
    final boolean f55067y;
    /* renamed from: z */
    final int f55068z;

    /* renamed from: okhttp3.o$a */
    public static final class C15961a {
        /* renamed from: A */
        int f49521A;
        /* renamed from: a */
        C15898i f49522a;
        @Nullable
        /* renamed from: b */
        Proxy f49523b;
        /* renamed from: c */
        List<Protocol> f49524c;
        /* renamed from: d */
        List<C15896g> f49525d;
        /* renamed from: e */
        final List<Interceptor> f49526e;
        /* renamed from: f */
        final List<Interceptor> f49527f;
        /* renamed from: g */
        EventListener.Factory f49528g;
        /* renamed from: h */
        ProxySelector f49529h;
        /* renamed from: i */
        CookieJar f49530i;
        @Nullable
        /* renamed from: j */
        C2670b f49531j;
        @Nullable
        /* renamed from: k */
        InternalCache f49532k;
        /* renamed from: l */
        SocketFactory f49533l;
        @Nullable
        /* renamed from: m */
        SSLSocketFactory f49534m;
        @Nullable
        /* renamed from: n */
        C15944c f49535n;
        /* renamed from: o */
        HostnameVerifier f49536o;
        /* renamed from: p */
        C15890d f49537p;
        /* renamed from: q */
        Authenticator f49538q;
        /* renamed from: r */
        Authenticator f49539r;
        /* renamed from: s */
        C15894f f49540s;
        /* renamed from: t */
        Dns f49541t;
        /* renamed from: u */
        boolean f49542u;
        /* renamed from: v */
        boolean f49543v;
        /* renamed from: w */
        boolean f49544w;
        /* renamed from: x */
        int f49545x;
        /* renamed from: y */
        int f49546y;
        /* renamed from: z */
        int f49547z;

        public C15961a() {
            this.f49526e = new ArrayList();
            this.f49527f = new ArrayList();
            this.f49522a = new C15898i();
            this.f49524c = C17692o.f55040a;
            this.f49525d = C17692o.f55041b;
            this.f49528g = EventListener.m59942a(EventListener.f49064a);
            this.f49529h = ProxySelector.getDefault();
            this.f49530i = CookieJar.f49062a;
            this.f49533l = SocketFactory.getDefault();
            this.f49536o = C15945d.f49466a;
            this.f49537p = C15890d.f49134a;
            this.f49538q = Authenticator.f49061a;
            this.f49539r = Authenticator.f49061a;
            this.f49540s = new C15894f();
            this.f49541t = Dns.f49063a;
            this.f49542u = true;
            this.f49543v = true;
            this.f49544w = true;
            this.f49545x = 10000;
            this.f49546y = 10000;
            this.f49547z = 10000;
            this.f49521A = 0;
        }

        C15961a(C17692o c17692o) {
            this.f49526e = new ArrayList();
            this.f49527f = new ArrayList();
            this.f49522a = c17692o.f55045c;
            this.f49523b = c17692o.f55046d;
            this.f49524c = c17692o.f55047e;
            this.f49525d = c17692o.f55048f;
            this.f49526e.addAll(c17692o.f55049g);
            this.f49527f.addAll(c17692o.f55050h);
            this.f49528g = c17692o.f55051i;
            this.f49529h = c17692o.f55052j;
            this.f49530i = c17692o.f55053k;
            this.f49532k = c17692o.f55055m;
            this.f49531j = c17692o.f55054l;
            this.f49533l = c17692o.f55056n;
            this.f49534m = c17692o.f55057o;
            this.f49535n = c17692o.f55058p;
            this.f49536o = c17692o.f55059q;
            this.f49537p = c17692o.f55060r;
            this.f49538q = c17692o.f55061s;
            this.f49539r = c17692o.f55062t;
            this.f49540s = c17692o.f55063u;
            this.f49541t = c17692o.f55064v;
            this.f49542u = c17692o.f55065w;
            this.f49543v = c17692o.f55066x;
            this.f49544w = c17692o.f55067y;
            this.f49545x = c17692o.f55068z;
            this.f49546y = c17692o.f55042A;
            this.f49547z = c17692o.f55043B;
            this.f49521A = c17692o.f55044C;
        }

        /* renamed from: a */
        public C15961a m60491a(long j, TimeUnit timeUnit) {
            this.f49545x = C15908c.m60153a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: b */
        public C15961a m60503b(long j, TimeUnit timeUnit) {
            this.f49546y = C15908c.m60153a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public C15961a m60506c(long j, TimeUnit timeUnit) {
            this.f49547z = C15908c.m60153a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: d */
        public C15961a m60507d(long j, TimeUnit timeUnit) {
            this.f49521A = C15908c.m60153a("interval", j, timeUnit);
            return this;
        }

        /* renamed from: a */
        public C15961a m60498a(@Nullable C2670b c2670b) {
            this.f49531j = c2670b;
            this.f49532k = null;
            return this;
        }

        /* renamed from: a */
        public C15961a m60494a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager == null) {
                throw new NullPointerException("trustManager == null");
            } else {
                this.f49534m = sSLSocketFactory;
                this.f49535n = C15944c.m60431a(x509TrustManager);
                return this;
            }
        }

        /* renamed from: a */
        public C15961a m60493a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier == null) {
                throw new NullPointerException("hostnameVerifier == null");
            }
            this.f49536o = hostnameVerifier;
            return this;
        }

        /* renamed from: a */
        public C15961a m60499a(C15890d c15890d) {
            if (c15890d == null) {
                throw new NullPointerException("certificatePinner == null");
            }
            this.f49537p = c15890d;
            return this;
        }

        /* renamed from: a */
        public C15961a m60495a(Authenticator authenticator) {
            if (authenticator == null) {
                throw new NullPointerException("authenticator == null");
            }
            this.f49539r = authenticator;
            return this;
        }

        /* renamed from: a */
        public C15961a m60500a(C15894f c15894f) {
            if (c15894f == null) {
                throw new NullPointerException("connectionPool == null");
            }
            this.f49540s = c15894f;
            return this;
        }

        /* renamed from: a */
        public C15961a m60502a(boolean z) {
            this.f49544w = z;
            return this;
        }

        /* renamed from: a */
        public C15961a m60501a(C15898i c15898i) {
            if (c15898i == null) {
                throw new IllegalArgumentException("dispatcher == null");
            }
            this.f49522a = c15898i;
            return this;
        }

        /* renamed from: a */
        public C15961a m60492a(List<Protocol> list) {
            List arrayList = new ArrayList(list);
            StringBuilder stringBuilder;
            if (arrayList.contains(Protocol.HTTP_1_1) == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("protocols doesn't contain http/1.1: ");
                stringBuilder.append(arrayList);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (arrayList.contains(Protocol.HTTP_1_0) != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("protocols must not contain http/1.0: ");
                stringBuilder.append(arrayList);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (arrayList.contains(null) != null) {
                throw new IllegalArgumentException("protocols must not contain null");
            } else {
                arrayList.remove(Protocol.SPDY_3);
                this.f49524c = Collections.unmodifiableList(arrayList);
                return this;
            }
        }

        /* renamed from: b */
        public C15961a m60504b(List<C15896g> list) {
            this.f49525d = C15908c.m60161a((List) list);
            return this;
        }

        /* renamed from: a */
        public List<Interceptor> m60490a() {
            return this.f49526e;
        }

        /* renamed from: a */
        public C15961a m60497a(Interceptor interceptor) {
            if (interceptor == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f49526e.add(interceptor);
            return this;
        }

        /* renamed from: a */
        public C15961a m60496a(EventListener eventListener) {
            if (eventListener == null) {
                throw new NullPointerException("eventListener == null");
            }
            this.f49528g = EventListener.m59942a(eventListener);
            return this;
        }

        /* renamed from: b */
        public C17692o m60505b() {
            return new C17692o(this);
        }
    }

    /* renamed from: okhttp3.o$1 */
    class C176911 extends C15900a {
        C176911() {
        }

        /* renamed from: a */
        public void mo13404a(C15956a c15956a, String str) {
            c15956a.m60464a(str);
        }

        /* renamed from: a */
        public void mo13405a(C15956a c15956a, String str, String str2) {
            c15956a.m60468b(str, str2);
        }

        /* renamed from: a */
        public boolean mo13407a(C15894f c15894f, C17659c c17659c) {
            return c15894f.m60074b(c17659c);
        }

        /* renamed from: a */
        public C17659c mo13400a(C15894f c15894f, C15885a c15885a, C15921f c15921f, C15969u c15969u) {
            return c15894f.m60072a(c15885a, c15921f, c15969u);
        }

        /* renamed from: a */
        public boolean mo13406a(C15885a c15885a, C15885a c15885a2) {
            return c15885a.m60022a(c15885a2);
        }

        /* renamed from: a */
        public Socket mo13398a(C15894f c15894f, C15885a c15885a, C15921f c15921f) {
            return c15894f.m60071a(c15885a, c15921f);
        }

        /* renamed from: b */
        public void mo13408b(C15894f c15894f, C17659c c17659c) {
            c15894f.m60073a(c17659c);
        }

        /* renamed from: a */
        public C15917d mo13401a(C15894f c15894f) {
            return c15894f.f49192a;
        }

        /* renamed from: a */
        public int mo13397a(C15965a c15965a) {
            return c15965a.f49561c;
        }

        /* renamed from: a */
        public void mo13403a(C15896g c15896g, SSLSocket sSLSocket, boolean z) {
            c15896g.m60082a(sSLSocket, z);
        }

        /* renamed from: a */
        public C15921f mo13402a(Call call) {
            return ((C17694p) call).m64424b();
        }

        /* renamed from: a */
        public Call mo13399a(C17692o c17692o, C15963q c15963q) {
            return C17694p.m64421a(c17692o, c15963q, true);
        }
    }

    static {
        C15900a.f49230a = new C176911();
    }

    public C17692o() {
        this(new C15961a());
    }

    C17692o(C15961a c15961a) {
        StringBuilder stringBuilder;
        this.f55045c = c15961a.f49522a;
        this.f55046d = c15961a.f49523b;
        this.f55047e = c15961a.f49524c;
        this.f55048f = c15961a.f49525d;
        this.f55049g = C15908c.m60161a(c15961a.f49526e);
        this.f55050h = C15908c.m60161a(c15961a.f49527f);
        this.f55051i = c15961a.f49528g;
        this.f55052j = c15961a.f49529h;
        this.f55053k = c15961a.f49530i;
        this.f55054l = c15961a.f49531j;
        this.f55055m = c15961a.f49532k;
        this.f55056n = c15961a.f49533l;
        loop0:
        while (true) {
            Object obj = null;
            for (C15896g c15896g : this.f55048f) {
                if (obj != null || c15896g.m60083a()) {
                    obj = 1;
                }
            }
            break loop0;
        }
        if (c15961a.f49534m == null) {
            if (obj != null) {
                X509TrustManager A = m64389A();
                this.f55057o = m64390a(A);
                this.f55058p = C15944c.m60431a(A);
                this.f55059q = c15961a.f49536o;
                this.f55060r = c15961a.f49537p.m60062a(this.f55058p);
                this.f55061s = c15961a.f49538q;
                this.f55062t = c15961a.f49539r;
                this.f55063u = c15961a.f49540s;
                this.f55064v = c15961a.f49541t;
                this.f55065w = c15961a.f49542u;
                this.f55066x = c15961a.f49543v;
                this.f55067y = c15961a.f49544w;
                this.f55068z = c15961a.f49545x;
                this.f55042A = c15961a.f49546y;
                this.f55043B = c15961a.f49547z;
                this.f55044C = c15961a.f49521A;
                if (this.f55049g.contains(null) != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Null interceptor: ");
                    stringBuilder.append(this.f55049g);
                    throw new IllegalStateException(stringBuilder.toString());
                } else if (this.f55050h.contains(null) != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Null network interceptor: ");
                    stringBuilder.append(this.f55050h);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
        }
        this.f55057o = c15961a.f49534m;
        this.f55058p = c15961a.f49535n;
        this.f55059q = c15961a.f49536o;
        this.f55060r = c15961a.f49537p.m60062a(this.f55058p);
        this.f55061s = c15961a.f49538q;
        this.f55062t = c15961a.f49539r;
        this.f55063u = c15961a.f49540s;
        this.f55064v = c15961a.f49541t;
        this.f55065w = c15961a.f49542u;
        this.f55066x = c15961a.f49543v;
        this.f55067y = c15961a.f49544w;
        this.f55068z = c15961a.f49545x;
        this.f55042A = c15961a.f49546y;
        this.f55043B = c15961a.f49547z;
        this.f55044C = c15961a.f49521A;
        if (this.f55049g.contains(null) != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Null interceptor: ");
            stringBuilder.append(this.f55049g);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.f55050h.contains(null) != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Null network interceptor: ");
            stringBuilder.append(this.f55050h);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: A */
    private X509TrustManager m64389A() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1) {
                if (trustManagers[0] instanceof X509TrustManager) {
                    return (X509TrustManager) trustManagers[0];
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected default trust managers:");
            stringBuilder.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(stringBuilder.toString());
        } catch (Exception e) {
            throw C15908c.m60155a("No System TLS", e);
        }
    }

    /* renamed from: a */
    private SSLSocketFactory m64390a(X509TrustManager x509TrustManager) {
        try {
            SSLContext B_ = C15904f.m60134c().B_();
            B_.init(null, new TrustManager[]{x509TrustManager}, null);
            return B_.getSocketFactory();
        } catch (Exception e) {
            throw C15908c.m60155a("No System TLS", e);
        }
    }

    /* renamed from: a */
    public int m64391a() {
        return this.f55068z;
    }

    /* renamed from: b */
    public int m64392b() {
        return this.f55042A;
    }

    /* renamed from: c */
    public int m64393c() {
        return this.f55043B;
    }

    /* renamed from: d */
    public int m64394d() {
        return this.f55044C;
    }

    /* renamed from: e */
    public Proxy m64395e() {
        return this.f55046d;
    }

    /* renamed from: f */
    public ProxySelector m64396f() {
        return this.f55052j;
    }

    /* renamed from: g */
    public CookieJar m64397g() {
        return this.f55053k;
    }

    /* renamed from: h */
    InternalCache m64398h() {
        return this.f55054l != null ? this.f55054l.f8454a : this.f55055m;
    }

    /* renamed from: i */
    public Dns m64399i() {
        return this.f55064v;
    }

    /* renamed from: j */
    public SocketFactory m64400j() {
        return this.f55056n;
    }

    /* renamed from: k */
    public SSLSocketFactory m64401k() {
        return this.f55057o;
    }

    /* renamed from: l */
    public HostnameVerifier m64402l() {
        return this.f55059q;
    }

    /* renamed from: m */
    public C15890d m64403m() {
        return this.f55060r;
    }

    /* renamed from: n */
    public Authenticator m64404n() {
        return this.f55062t;
    }

    /* renamed from: o */
    public Authenticator m64405o() {
        return this.f55061s;
    }

    /* renamed from: p */
    public C15894f m64406p() {
        return this.f55063u;
    }

    /* renamed from: q */
    public boolean m64407q() {
        return this.f55065w;
    }

    /* renamed from: r */
    public boolean m64408r() {
        return this.f55066x;
    }

    /* renamed from: s */
    public boolean m64409s() {
        return this.f55067y;
    }

    /* renamed from: t */
    public C15898i m64410t() {
        return this.f55045c;
    }

    /* renamed from: u */
    public List<Protocol> m64411u() {
        return this.f55047e;
    }

    /* renamed from: v */
    public List<C15896g> m64412v() {
        return this.f55048f;
    }

    /* renamed from: w */
    public List<Interceptor> m64413w() {
        return this.f55049g;
    }

    /* renamed from: x */
    public List<Interceptor> m64414x() {
        return this.f55050h;
    }

    /* renamed from: y */
    public EventListener.Factory m64415y() {
        return this.f55051i;
    }

    public Call newCall(C15963q c15963q) {
        return C17694p.m64421a(this, c15963q, false);
    }

    public WebSocket newWebSocket(C15963q c15963q, C15970v c15970v) {
        WebSocket c17686a = new C17686a(c15963q, c15970v, new Random(), (long) this.f55044C);
        c17686a.m64367a(this);
        return c17686a;
    }

    /* renamed from: z */
    public C15961a m64416z() {
        return new C15961a(this);
    }
}
