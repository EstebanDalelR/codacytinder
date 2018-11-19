package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import javax.annotation.Nullable;

/* renamed from: okhttp3.u */
public final class C15969u {
    /* renamed from: a */
    final C15885a f49588a;
    /* renamed from: b */
    final Proxy f49589b;
    /* renamed from: c */
    final InetSocketAddress f49590c;

    public C15969u(C15885a c15885a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c15885a == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        } else {
            this.f49588a = c15885a;
            this.f49589b = proxy;
            this.f49590c = inetSocketAddress;
        }
    }

    /* renamed from: a */
    public C15885a m60567a() {
        return this.f49588a;
    }

    /* renamed from: b */
    public Proxy m60568b() {
        return this.f49589b;
    }

    /* renamed from: c */
    public InetSocketAddress m60569c() {
        return this.f49590c;
    }

    /* renamed from: d */
    public boolean m60570d() {
        return this.f49588a.f49091i != null && this.f49589b.type() == Type.HTTP;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C15969u) {
            C15969u c15969u = (C15969u) obj;
            if (c15969u.f49588a.equals(this.f49588a) && c15969u.f49589b.equals(this.f49589b) && c15969u.f49590c.equals(this.f49590c) != null) {
                return true;
            }
        }
        return null;
    }

    public int hashCode() {
        return ((((527 + this.f49588a.hashCode()) * 31) + this.f49589b.hashCode()) * 31) + this.f49590c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Route{");
        stringBuilder.append(this.f49590c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
