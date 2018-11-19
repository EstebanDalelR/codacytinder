package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C5995a;
import com.squareup.okhttp.C6068p;
import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.C6077u;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.internal.C6021d;
import com.squareup.okhttp.internal.C6041h;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.squareup.okhttp.internal.http.n */
public final class C6055n {
    /* renamed from: a */
    private final C5995a f22191a;
    /* renamed from: b */
    private final HttpUrl f22192b;
    /* renamed from: c */
    private final C6068p f22193c;
    /* renamed from: d */
    private final C6041h f22194d;
    /* renamed from: e */
    private Proxy f22195e;
    /* renamed from: f */
    private InetSocketAddress f22196f;
    /* renamed from: g */
    private List<Proxy> f22197g = Collections.emptyList();
    /* renamed from: h */
    private int f22198h;
    /* renamed from: i */
    private List<InetSocketAddress> f22199i = Collections.emptyList();
    /* renamed from: j */
    private int f22200j;
    /* renamed from: k */
    private final List<C6077u> f22201k = new ArrayList();

    private C6055n(C5995a c5995a, HttpUrl httpUrl, C6068p c6068p) {
        this.f22191a = c5995a;
        this.f22192b = httpUrl;
        this.f22193c = c6068p;
        this.f22194d = C6021d.f22041b.mo6561b(c6068p);
        m26226a(httpUrl, c5995a.m25760i());
    }

    /* renamed from: a */
    public static C6055n m26224a(C5995a c5995a, C6071q c6071q, C6068p c6068p) throws IOException {
        return new C6055n(c5995a, c6071q.m26343a(), c6068p);
    }

    /* renamed from: a */
    public boolean m26235a() {
        if (!(m26230e() || m26228c())) {
            if (!m26232g()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public C6077u m26236b() throws IOException {
        if (!m26230e()) {
            if (m26228c()) {
                this.f22195e = m26229d();
            } else if (m26232g()) {
                return m26233h();
            } else {
                throw new NoSuchElementException();
            }
        }
        this.f22196f = m26231f();
        C6077u c6077u = new C6077u(this.f22191a, this.f22195e, this.f22196f);
        if (!this.f22194d.m26121c(c6077u)) {
            return c6077u;
        }
        this.f22201k.add(c6077u);
        return m26236b();
    }

    /* renamed from: a */
    public void m26234a(C6077u c6077u, IOException iOException) {
        if (!(c6077u.m26415b().type() == Type.DIRECT || this.f22191a.m25759h() == null)) {
            this.f22191a.m25759h().connectFailed(this.f22192b.m25738b(), c6077u.m26415b().address(), iOException);
        }
        this.f22194d.m26119a(c6077u);
    }

    /* renamed from: a */
    private void m26226a(HttpUrl httpUrl, Proxy proxy) {
        if (proxy != null) {
            this.f22197g = Collections.singletonList(proxy);
        } else {
            this.f22197g = new ArrayList();
            httpUrl = this.f22193c.m26301e().select(httpUrl.m25738b());
            if (httpUrl != null) {
                this.f22197g.addAll(httpUrl);
            }
            this.f22197g.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f22197g.add(Proxy.NO_PROXY);
        }
        this.f22198h = null;
    }

    /* renamed from: c */
    private boolean m26228c() {
        return this.f22198h < this.f22197g.size();
    }

    /* renamed from: d */
    private Proxy m26229d() throws IOException {
        if (m26228c()) {
            List list = this.f22197g;
            int i = this.f22198h;
            this.f22198h = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m26227a(proxy);
            return proxy;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No route to ");
        stringBuilder.append(this.f22191a.m25752a());
        stringBuilder.append("; exhausted proxy configurations: ");
        stringBuilder.append(this.f22197g);
        throw new SocketException(stringBuilder.toString());
    }

    /* renamed from: a */
    private void m26227a(Proxy proxy) throws IOException {
        String a;
        List lookup;
        int size;
        int i;
        StringBuilder stringBuilder;
        this.f22199i = new ArrayList();
        if (proxy.type() != Type.DIRECT) {
            if (proxy.type() != Type.SOCKS) {
                proxy = proxy.address();
                if (proxy instanceof InetSocketAddress) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy;
                    a = C6055n.m26225a(inetSocketAddress);
                    proxy = inetSocketAddress.getPort();
                    if (proxy >= 1) {
                        if (proxy > 65535) {
                            lookup = this.f22191a.m25754c().lookup(a);
                            size = lookup.size();
                            for (i = 0; i < size; i++) {
                                this.f22199i.add(new InetSocketAddress((InetAddress) lookup.get(i), proxy));
                            }
                            this.f22200j = 0;
                            return;
                        }
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("No route to ");
                    stringBuilder.append(a);
                    stringBuilder.append(":");
                    stringBuilder.append(proxy);
                    stringBuilder.append("; port is out of range");
                    throw new SocketException(stringBuilder.toString());
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Proxy.address() is not an InetSocketAddress: ");
                stringBuilder2.append(proxy.getClass());
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        a = this.f22191a.m25752a();
        proxy = this.f22191a.m25753b();
        if (proxy >= 1) {
            if (proxy > 65535) {
                lookup = this.f22191a.m25754c().lookup(a);
                size = lookup.size();
                for (i = 0; i < size; i++) {
                    this.f22199i.add(new InetSocketAddress((InetAddress) lookup.get(i), proxy));
                }
                this.f22200j = 0;
                return;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("No route to ");
        stringBuilder.append(a);
        stringBuilder.append(":");
        stringBuilder.append(proxy);
        stringBuilder.append("; port is out of range");
        throw new SocketException(stringBuilder.toString());
    }

    /* renamed from: a */
    static String m26225a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    /* renamed from: e */
    private boolean m26230e() {
        return this.f22200j < this.f22199i.size();
    }

    /* renamed from: f */
    private InetSocketAddress m26231f() throws IOException {
        if (m26230e()) {
            List list = this.f22199i;
            int i = this.f22200j;
            this.f22200j = i + 1;
            return (InetSocketAddress) list.get(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No route to ");
        stringBuilder.append(this.f22191a.m25752a());
        stringBuilder.append("; exhausted inet socket addresses: ");
        stringBuilder.append(this.f22199i);
        throw new SocketException(stringBuilder.toString());
    }

    /* renamed from: g */
    private boolean m26232g() {
        return this.f22201k.isEmpty() ^ 1;
    }

    /* renamed from: h */
    private C6077u m26233h() {
        return (C6077u) this.f22201k.remove(0);
    }
}
