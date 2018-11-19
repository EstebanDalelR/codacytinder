package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl.Builder;
import okhttp3.internal.C15908c;

/* renamed from: okhttp3.a */
public final class C15885a {
    /* renamed from: a */
    final HttpUrl f49083a;
    /* renamed from: b */
    final Dns f49084b;
    /* renamed from: c */
    final SocketFactory f49085c;
    /* renamed from: d */
    final Authenticator f49086d;
    /* renamed from: e */
    final List<Protocol> f49087e;
    /* renamed from: f */
    final List<C15896g> f49088f;
    /* renamed from: g */
    final ProxySelector f49089g;
    @Nullable
    /* renamed from: h */
    final Proxy f49090h;
    @Nullable
    /* renamed from: i */
    final SSLSocketFactory f49091i;
    @Nullable
    /* renamed from: j */
    final HostnameVerifier f49092j;
    @Nullable
    /* renamed from: k */
    final C15890d f49093k;

    public C15885a(String str, int i, Dns dns, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable C15890d c15890d, Authenticator authenticator, @Nullable Proxy proxy, List<Protocol> list, List<C15896g> list2, ProxySelector proxySelector) {
        this.f49083a = new Builder().m59976a(sSLSocketFactory != null ? "https" : "http").m59983d(str).m59975a(i).m59982c();
        if (dns == null) {
            throw new NullPointerException("dns == null");
        }
        this.f49084b = dns;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f49085c = socketFactory;
        if (authenticator == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f49086d = authenticator;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f49087e = C15908c.m60161a((List) list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f49088f = C15908c.m60161a((List) list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f49089g = proxySelector;
        this.f49090h = proxy;
        this.f49091i = sSLSocketFactory;
        this.f49092j = hostnameVerifier;
        this.f49093k = c15890d;
    }

    /* renamed from: a */
    public HttpUrl m60021a() {
        return this.f49083a;
    }

    /* renamed from: b */
    public Dns m60023b() {
        return this.f49084b;
    }

    /* renamed from: c */
    public SocketFactory m60024c() {
        return this.f49085c;
    }

    /* renamed from: d */
    public Authenticator m60025d() {
        return this.f49086d;
    }

    /* renamed from: e */
    public List<Protocol> m60026e() {
        return this.f49087e;
    }

    /* renamed from: f */
    public List<C15896g> m60027f() {
        return this.f49088f;
    }

    /* renamed from: g */
    public ProxySelector m60028g() {
        return this.f49089g;
    }

    @Nullable
    /* renamed from: h */
    public Proxy m60029h() {
        return this.f49090h;
    }

    @Nullable
    /* renamed from: i */
    public SSLSocketFactory m60030i() {
        return this.f49091i;
    }

    @Nullable
    /* renamed from: j */
    public HostnameVerifier m60031j() {
        return this.f49092j;
    }

    @Nullable
    /* renamed from: k */
    public C15890d m60032k() {
        return this.f49093k;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C15885a) {
            C15885a c15885a = (C15885a) obj;
            if (this.f49083a.equals(c15885a.f49083a) && m60022a(c15885a) != null) {
                return true;
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((527 + this.f49083a.hashCode()) * 31) + this.f49084b.hashCode()) * 31) + this.f49086d.hashCode()) * 31) + this.f49087e.hashCode()) * 31) + this.f49088f.hashCode()) * 31) + this.f49089g.hashCode()) * 31) + (this.f49090h != null ? this.f49090h.hashCode() : 0)) * 31) + (this.f49091i != null ? this.f49091i.hashCode() : 0)) * 31) + (this.f49092j != null ? this.f49092j.hashCode() : 0)) * 31;
        if (this.f49093k != null) {
            i = this.f49093k.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    boolean m60022a(C15885a c15885a) {
        return (this.f49084b.equals(c15885a.f49084b) && this.f49086d.equals(c15885a.f49086d) && this.f49087e.equals(c15885a.f49087e) && this.f49088f.equals(c15885a.f49088f) && this.f49089g.equals(c15885a.f49089g) && C15908c.m60168a(this.f49090h, c15885a.f49090h) && C15908c.m60168a(this.f49091i, c15885a.f49091i) && C15908c.m60168a(this.f49092j, c15885a.f49092j) && C15908c.m60168a(this.f49093k, c15885a.f49093k) && m60021a().m60011h() == c15885a.m60021a().m60011h()) ? true : null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Address{");
        stringBuilder.append(this.f49083a.m60010g());
        stringBuilder.append(":");
        stringBuilder.append(this.f49083a.m60011h());
        if (this.f49090h != null) {
            stringBuilder.append(", proxy=");
            stringBuilder.append(this.f49090h);
        } else {
            stringBuilder.append(", proxySelector=");
            stringBuilder.append(this.f49089g);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
