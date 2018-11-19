package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.C15885a;
import okhttp3.C15969u;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.internal.C15908c;

/* renamed from: okhttp3.internal.connection.e */
public final class C15919e {
    /* renamed from: a */
    private final C15885a f49326a;
    /* renamed from: b */
    private final C15917d f49327b;
    /* renamed from: c */
    private final Call f49328c;
    /* renamed from: d */
    private final EventListener f49329d;
    /* renamed from: e */
    private List<Proxy> f49330e = Collections.emptyList();
    /* renamed from: f */
    private int f49331f;
    /* renamed from: g */
    private List<InetSocketAddress> f49332g = Collections.emptyList();
    /* renamed from: h */
    private final List<C15969u> f49333h = new ArrayList();

    /* renamed from: okhttp3.internal.connection.e$a */
    public static final class C15918a {
        /* renamed from: a */
        private final List<C15969u> f49324a;
        /* renamed from: b */
        private int f49325b = 0;

        C15918a(List<C15969u> list) {
            this.f49324a = list;
        }

        /* renamed from: a */
        public boolean m60227a() {
            return this.f49325b < this.f49324a.size();
        }

        /* renamed from: b */
        public C15969u m60228b() {
            if (m60227a()) {
                List list = this.f49324a;
                int i = this.f49325b;
                this.f49325b = i + 1;
                return (C15969u) list.get(i);
            }
            throw new NoSuchElementException();
        }

        /* renamed from: c */
        public List<C15969u> m60229c() {
            return new ArrayList(this.f49324a);
        }
    }

    public C15919e(C15885a c15885a, C15917d c15917d, Call call, EventListener eventListener) {
        this.f49326a = c15885a;
        this.f49327b = c15917d;
        this.f49328c = call;
        this.f49329d = eventListener;
        m60232a(c15885a.m60021a(), c15885a.m60029h());
    }

    /* renamed from: a */
    public boolean m60236a() {
        if (!m60233c()) {
            if (this.f49333h.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public C15918a m60237b() throws IOException {
        if (m60236a()) {
            List arrayList = new ArrayList();
            while (m60233c()) {
                Proxy d = m60234d();
                int size = this.f49332g.size();
                for (int i = 0; i < size; i++) {
                    C15969u c15969u = new C15969u(this.f49326a, d, (InetSocketAddress) this.f49332g.get(i));
                    if (this.f49327b.m60226c(c15969u)) {
                        this.f49333h.add(c15969u);
                    } else {
                        arrayList.add(c15969u);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f49333h);
                this.f49333h.clear();
            }
            return new C15918a(arrayList);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public void m60235a(C15969u c15969u, IOException iOException) {
        if (!(c15969u.m60568b().type() == Type.DIRECT || this.f49326a.m60028g() == null)) {
            this.f49326a.m60028g().connectFailed(this.f49326a.m60021a().m60002b(), c15969u.m60568b().address(), iOException);
        }
        this.f49327b.m60224a(c15969u);
    }

    /* renamed from: a */
    private void m60232a(HttpUrl httpUrl, Proxy proxy) {
        if (proxy != null) {
            this.f49330e = Collections.singletonList(proxy);
        } else {
            List select = this.f49326a.m60028g().select(httpUrl.m60002b());
            if (select == null || select.isEmpty() != null) {
                httpUrl = C15908c.m60162a(Proxy.NO_PROXY);
            } else {
                httpUrl = C15908c.m60161a(select);
            }
            this.f49330e = httpUrl;
        }
        this.f49331f = 0;
    }

    /* renamed from: c */
    private boolean m60233c() {
        return this.f49331f < this.f49330e.size();
    }

    /* renamed from: d */
    private Proxy m60234d() throws IOException {
        if (m60233c()) {
            List list = this.f49330e;
            int i = this.f49331f;
            this.f49331f = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m60231a(proxy);
            return proxy;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No route to ");
        stringBuilder.append(this.f49326a.m60021a().m60010g());
        stringBuilder.append("; exhausted proxy configurations: ");
        stringBuilder.append(this.f49330e);
        throw new SocketException(stringBuilder.toString());
    }

    /* renamed from: a */
    private void m60231a(Proxy proxy) throws IOException {
        String a;
        int port;
        List lookup;
        int size;
        int i;
        StringBuilder stringBuilder;
        this.f49332g = new ArrayList();
        if (proxy.type() != Type.DIRECT) {
            if (proxy.type() != Type.SOCKS) {
                SocketAddress address = proxy.address();
                if (address instanceof InetSocketAddress) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    a = C15919e.m60230a(inetSocketAddress);
                    port = inetSocketAddress.getPort();
                    if (port >= 1) {
                        if (port > 65535) {
                            if (proxy.type() != Type.SOCKS) {
                                this.f49332g.add(InetSocketAddress.createUnresolved(a, port));
                                return;
                            }
                            this.f49329d.m59946a(this.f49328c, a);
                            lookup = this.f49326a.m60023b().lookup(a);
                            if (lookup.isEmpty()) {
                                this.f49329d.m59947a(this.f49328c, a, lookup);
                                size = lookup.size();
                                for (i = 0; i < size; i++) {
                                    this.f49332g.add(new InetSocketAddress((InetAddress) lookup.get(i), port));
                                }
                                return;
                            }
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(this.f49326a.m60023b());
                            stringBuilder2.append(" returned no addresses for ");
                            stringBuilder2.append(a);
                            throw new UnknownHostException(stringBuilder2.toString());
                        }
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("No route to ");
                    stringBuilder.append(a);
                    stringBuilder.append(":");
                    stringBuilder.append(port);
                    stringBuilder.append("; port is out of range");
                    throw new SocketException(stringBuilder.toString());
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Proxy.address() is not an InetSocketAddress: ");
                stringBuilder3.append(address.getClass());
                throw new IllegalArgumentException(stringBuilder3.toString());
            }
        }
        a = this.f49326a.m60021a().m60010g();
        port = this.f49326a.m60021a().m60011h();
        if (port >= 1) {
            if (port > 65535) {
                if (proxy.type() != Type.SOCKS) {
                    this.f49329d.m59946a(this.f49328c, a);
                    lookup = this.f49326a.m60023b().lookup(a);
                    if (lookup.isEmpty()) {
                        this.f49329d.m59947a(this.f49328c, a, lookup);
                        size = lookup.size();
                        for (i = 0; i < size; i++) {
                            this.f49332g.add(new InetSocketAddress((InetAddress) lookup.get(i), port));
                        }
                        return;
                    }
                    StringBuilder stringBuilder22 = new StringBuilder();
                    stringBuilder22.append(this.f49326a.m60023b());
                    stringBuilder22.append(" returned no addresses for ");
                    stringBuilder22.append(a);
                    throw new UnknownHostException(stringBuilder22.toString());
                }
                this.f49332g.add(InetSocketAddress.createUnresolved(a, port));
                return;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("No route to ");
        stringBuilder.append(a);
        stringBuilder.append(":");
        stringBuilder.append(port);
        stringBuilder.append("; port is out of range");
        throw new SocketException(stringBuilder.toString());
    }

    /* renamed from: a */
    static String m60230a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
