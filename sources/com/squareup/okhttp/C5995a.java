package com.squareup.okhttp;

import com.squareup.okhttp.internal.C6058i;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.squareup.okhttp.a */
public final class C5995a {
    /* renamed from: a */
    final String f21900a;
    /* renamed from: b */
    final int f21901b;
    /* renamed from: c */
    final Dns f21902c;
    /* renamed from: d */
    final SocketFactory f21903d;
    /* renamed from: e */
    final Authenticator f21904e;
    /* renamed from: f */
    final List<Protocol> f21905f;
    /* renamed from: g */
    final List<C6012i> f21906g;
    /* renamed from: h */
    final ProxySelector f21907h;
    /* renamed from: i */
    final Proxy f21908i;
    /* renamed from: j */
    final SSLSocketFactory f21909j;
    /* renamed from: k */
    final HostnameVerifier f21910k;
    /* renamed from: l */
    final C6005e f21911l;

    public C5995a(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C6005e c6005e, Authenticator authenticator, Proxy proxy, List<Protocol> list, List<C6012i> list2, ProxySelector proxySelector) {
        if (str == null) {
            throw new NullPointerException("uriHost == null");
        }
        this.f21900a = str;
        if (i <= 0) {
            dns = new StringBuilder();
            dns.append("uriPort <= 0: ");
            dns.append(i);
            throw new IllegalArgumentException(dns.toString());
        }
        this.f21901b = i;
        if (dns == null) {
            throw new IllegalArgumentException("dns == null");
        }
        this.f21902c = dns;
        if (socketFactory == null) {
            throw new IllegalArgumentException("socketFactory == null");
        }
        this.f21903d = socketFactory;
        if (authenticator == null) {
            throw new IllegalArgumentException("authenticator == null");
        }
        this.f21904e = authenticator;
        if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        }
        this.f21905f = C6058i.m26240a((List) list);
        if (list2 == null) {
            throw new IllegalArgumentException("connectionSpecs == null");
        }
        this.f21906g = C6058i.m26240a((List) list2);
        if (proxySelector == null) {
            throw new IllegalArgumentException("proxySelector == null");
        }
        this.f21907h = proxySelector;
        this.f21908i = proxy;
        this.f21909j = sSLSocketFactory;
        this.f21910k = hostnameVerifier;
        this.f21911l = c6005e;
    }

    /* renamed from: a */
    public String m25752a() {
        return this.f21900a;
    }

    /* renamed from: b */
    public int m25753b() {
        return this.f21901b;
    }

    /* renamed from: c */
    public Dns m25754c() {
        return this.f21902c;
    }

    /* renamed from: d */
    public SocketFactory m25755d() {
        return this.f21903d;
    }

    /* renamed from: e */
    public Authenticator m25756e() {
        return this.f21904e;
    }

    /* renamed from: f */
    public List<Protocol> m25757f() {
        return this.f21905f;
    }

    /* renamed from: g */
    public List<C6012i> m25758g() {
        return this.f21906g;
    }

    /* renamed from: h */
    public ProxySelector m25759h() {
        return this.f21907h;
    }

    /* renamed from: i */
    public Proxy m25760i() {
        return this.f21908i;
    }

    /* renamed from: j */
    public SSLSocketFactory m25761j() {
        return this.f21909j;
    }

    /* renamed from: k */
    public HostnameVerifier m25762k() {
        return this.f21910k;
    }

    /* renamed from: l */
    public C6005e m25763l() {
        return this.f21911l;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C5995a)) {
            return false;
        }
        C5995a c5995a = (C5995a) obj;
        if (this.f21900a.equals(c5995a.f21900a) && this.f21901b == c5995a.f21901b && this.f21902c.equals(c5995a.f21902c) && this.f21904e.equals(c5995a.f21904e) && this.f21905f.equals(c5995a.f21905f) && this.f21906g.equals(c5995a.f21906g) && this.f21907h.equals(c5995a.f21907h) && C6058i.m26251a(this.f21908i, c5995a.f21908i) && C6058i.m26251a(this.f21909j, c5995a.f21909j) && C6058i.m26251a(this.f21910k, c5995a.f21910k) && C6058i.m26251a(this.f21911l, c5995a.f21911l) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((((527 + this.f21900a.hashCode()) * 31) + this.f21901b) * 31) + this.f21902c.hashCode()) * 31) + this.f21904e.hashCode()) * 31) + this.f21905f.hashCode()) * 31) + this.f21906g.hashCode()) * 31) + this.f21907h.hashCode()) * 31) + (this.f21908i != null ? this.f21908i.hashCode() : 0)) * 31) + (this.f21909j != null ? this.f21909j.hashCode() : 0)) * 31) + (this.f21910k != null ? this.f21910k.hashCode() : 0)) * 31;
        if (this.f21911l != null) {
            i = this.f21911l.hashCode();
        }
        return hashCode + i;
    }
}
