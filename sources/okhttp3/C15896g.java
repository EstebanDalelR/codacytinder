package okhttp3;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.C15908c;

/* renamed from: okhttp3.g */
public final class C15896g {
    /* renamed from: a */
    public static final C15896g f49202a = new C15895a(true).m60078a(f49205h).m60077a(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m60075a(true).m60079a();
    /* renamed from: b */
    public static final C15896g f49203b = new C15895a(f49202a).m60077a(TlsVersion.TLS_1_0).m60075a(true).m60079a();
    /* renamed from: c */
    public static final C15896g f49204c = new C15895a(false).m60079a();
    /* renamed from: h */
    private static final C15892e[] f49205h = new C15892e[]{C15892e.aX, C15892e.bb, C15892e.aY, C15892e.bc, C15892e.bi, C15892e.bh, C15892e.aI, C15892e.aJ, C15892e.ag, C15892e.ah, C15892e.f49141E, C15892e.f49145I, C15892e.f49171i};
    /* renamed from: d */
    final boolean f49206d;
    /* renamed from: e */
    final boolean f49207e;
    @Nullable
    /* renamed from: f */
    final String[] f49208f;
    @Nullable
    /* renamed from: g */
    final String[] f49209g;

    /* renamed from: okhttp3.g$a */
    public static final class C15895a {
        /* renamed from: a */
        boolean f49198a;
        @Nullable
        /* renamed from: b */
        String[] f49199b;
        @Nullable
        /* renamed from: c */
        String[] f49200c;
        /* renamed from: d */
        boolean f49201d;

        C15895a(boolean z) {
            this.f49198a = z;
        }

        public C15895a(C15896g c15896g) {
            this.f49198a = c15896g.f49206d;
            this.f49199b = c15896g.f49208f;
            this.f49200c = c15896g.f49209g;
            this.f49201d = c15896g.f49207e;
        }

        /* renamed from: a */
        public C15895a m60078a(C15892e... c15892eArr) {
            if (this.f49198a) {
                String[] strArr = new String[c15892eArr.length];
                for (int i = 0; i < c15892eArr.length; i++) {
                    strArr[i] = c15892eArr[i].bj;
                }
                return m60076a(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: a */
        public C15895a m60076a(String... strArr) {
            if (!this.f49198a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            } else {
                this.f49199b = (String[]) strArr.clone();
                return this;
            }
        }

        /* renamed from: a */
        public C15895a m60077a(TlsVersion... tlsVersionArr) {
            if (this.f49198a) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i = 0; i < tlsVersionArr.length; i++) {
                    strArr[i] = tlsVersionArr[i].javaName;
                }
                return m60080b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: b */
        public C15895a m60080b(String... strArr) {
            if (!this.f49198a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            } else {
                this.f49200c = (String[]) strArr.clone();
                return this;
            }
        }

        /* renamed from: a */
        public C15895a m60075a(boolean z) {
            if (this.f49198a) {
                this.f49201d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: a */
        public C15896g m60079a() {
            return new C15896g(this);
        }
    }

    C15896g(C15895a c15895a) {
        this.f49206d = c15895a.f49198a;
        this.f49208f = c15895a.f49199b;
        this.f49209g = c15895a.f49200c;
        this.f49207e = c15895a.f49201d;
    }

    /* renamed from: a */
    public boolean m60083a() {
        return this.f49206d;
    }

    @Nullable
    /* renamed from: b */
    public List<C15892e> m60085b() {
        return this.f49208f != null ? C15892e.m60065a(this.f49208f) : null;
    }

    @Nullable
    /* renamed from: c */
    public List<TlsVersion> m60086c() {
        return this.f49209g != null ? TlsVersion.forJavaNames(this.f49209g) : null;
    }

    /* renamed from: d */
    public boolean m60087d() {
        return this.f49207e;
    }

    /* renamed from: a */
    void m60082a(SSLSocket sSLSocket, boolean z) {
        z = m60081b(sSLSocket, z);
        if (z.f49209g != null) {
            sSLSocket.setEnabledProtocols(z.f49209g);
        }
        if (z.f49208f != null) {
            sSLSocket.setEnabledCipherSuites(z.f49208f);
        }
    }

    /* renamed from: b */
    private C15896g m60081b(SSLSocket sSLSocket, boolean z) {
        String[] a;
        String[] a2;
        if (this.f49208f != null) {
            a = C15908c.m60171a(C15892e.f49163a, sSLSocket.getEnabledCipherSuites(), this.f49208f);
        } else {
            a = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f49209g != null) {
            a2 = C15908c.m60171a(C15908c.f49252h, sSLSocket.getEnabledProtocols(), this.f49209g);
        } else {
            a2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        boolean a3 = C15908c.m60154a(C15892e.f49163a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && !a3) {
            a = C15908c.m60172a(a, supportedCipherSuites[a3]);
        }
        return new C15895a(this).m60076a(a).m60080b(a2).m60079a();
    }

    /* renamed from: a */
    public boolean m60084a(SSLSocket sSLSocket) {
        if (!this.f49206d) {
            return false;
        }
        if (this.f49209g != null && !C15908c.m60175b(C15908c.f49252h, this.f49209g, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f49208f == null || C15908c.m60175b(C15892e.f49163a, this.f49208f, sSLSocket.getEnabledCipherSuites()) != null) {
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C15896g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C15896g c15896g = (C15896g) obj;
        if (this.f49206d != c15896g.f49206d) {
            return false;
        }
        return !this.f49206d || (Arrays.equals(this.f49208f, c15896g.f49208f) && Arrays.equals(this.f49209g, c15896g.f49209g) && this.f49207e == c15896g.f49207e);
    }

    public int hashCode() {
        return this.f49206d ? ((((527 + Arrays.hashCode(this.f49208f)) * 31) + Arrays.hashCode(this.f49209g)) * 31) + (this.f49207e ^ 1) : 17;
    }

    public String toString() {
        if (!this.f49206d) {
            return "ConnectionSpec()";
        }
        String obj = this.f49208f != null ? m60085b().toString() : "[all enabled]";
        String obj2 = this.f49209g != null ? m60086c().toString() : "[all enabled]";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConnectionSpec(cipherSuites=");
        stringBuilder.append(obj);
        stringBuilder.append(", tlsVersions=");
        stringBuilder.append(obj2);
        stringBuilder.append(", supportsTlsExtensions=");
        stringBuilder.append(this.f49207e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
