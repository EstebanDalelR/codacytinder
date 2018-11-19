package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

/* renamed from: com.squareup.okhttp.u */
public final class C6077u {
    /* renamed from: a */
    final C5995a f22291a;
    /* renamed from: b */
    final Proxy f22292b;
    /* renamed from: c */
    final InetSocketAddress f22293c;

    public C6077u(C5995a c5995a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c5995a == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        } else {
            this.f22291a = c5995a;
            this.f22292b = proxy;
            this.f22293c = inetSocketAddress;
        }
    }

    /* renamed from: a */
    public C5995a m26414a() {
        return this.f22291a;
    }

    /* renamed from: b */
    public Proxy m26415b() {
        return this.f22292b;
    }

    /* renamed from: c */
    public InetSocketAddress m26416c() {
        return this.f22293c;
    }

    /* renamed from: d */
    public boolean m26417d() {
        return this.f22291a.f21909j != null && this.f22292b.type() == Type.HTTP;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C6077u)) {
            return false;
        }
        C6077u c6077u = (C6077u) obj;
        if (this.f22291a.equals(c6077u.f22291a) && this.f22292b.equals(c6077u.f22292b) && this.f22293c.equals(c6077u.f22293c) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((527 + this.f22291a.hashCode()) * 31) + this.f22292b.hashCode()) * 31) + this.f22293c.hashCode();
    }
}
