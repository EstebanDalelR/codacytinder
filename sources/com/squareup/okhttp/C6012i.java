package com.squareup.okhttp;

import com.squareup.okhttp.internal.C6058i;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: com.squareup.okhttp.i */
public final class C6012i {
    /* renamed from: a */
    public static final C6012i f21979a = new C6011a(true).m25858a(f21982d).m25859a(TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m25857a(true).m25861a();
    /* renamed from: b */
    public static final C6012i f21980b = new C6011a(f21979a).m25859a(TlsVersion.TLS_1_0).m25857a(true).m25861a();
    /* renamed from: c */
    public static final C6012i f21981c = new C6011a(false).m25861a();
    /* renamed from: d */
    private static final CipherSuite[] f21982d = new CipherSuite[]{CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
    /* renamed from: e */
    private final boolean f21983e;
    /* renamed from: f */
    private final boolean f21984f;
    /* renamed from: g */
    private final String[] f21985g;
    /* renamed from: h */
    private final String[] f21986h;

    /* renamed from: com.squareup.okhttp.i$a */
    public static final class C6011a {
        /* renamed from: a */
        private boolean f21975a;
        /* renamed from: b */
        private String[] f21976b;
        /* renamed from: c */
        private String[] f21977c;
        /* renamed from: d */
        private boolean f21978d;

        C6011a(boolean z) {
            this.f21975a = z;
        }

        public C6011a(C6012i c6012i) {
            this.f21975a = c6012i.f21983e;
            this.f21976b = c6012i.f21985g;
            this.f21977c = c6012i.f21986h;
            this.f21978d = c6012i.f21984f;
        }

        /* renamed from: a */
        public C6011a m25858a(CipherSuite... cipherSuiteArr) {
            if (this.f21975a) {
                String[] strArr = new String[cipherSuiteArr.length];
                for (int i = 0; i < cipherSuiteArr.length; i++) {
                    strArr[i] = cipherSuiteArr[i].javaName;
                }
                return m25860a(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: a */
        public C6011a m25860a(String... strArr) {
            if (!this.f21975a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            } else {
                this.f21976b = (String[]) strArr.clone();
                return this;
            }
        }

        /* renamed from: a */
        public C6011a m25859a(TlsVersion... tlsVersionArr) {
            if (this.f21975a) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i = 0; i < tlsVersionArr.length; i++) {
                    strArr[i] = tlsVersionArr[i].javaName;
                }
                return m25862b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: b */
        public C6011a m25862b(String... strArr) {
            if (!this.f21975a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            } else {
                this.f21977c = (String[]) strArr.clone();
                return this;
            }
        }

        /* renamed from: a */
        public C6011a m25857a(boolean z) {
            if (this.f21975a) {
                this.f21978d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: a */
        public C6012i m25861a() {
            return new C6012i();
        }
    }

    private C6012i(C6011a c6011a) {
        this.f21983e = c6011a.f21975a;
        this.f21985g = c6011a.f21976b;
        this.f21986h = c6011a.f21977c;
        this.f21984f = c6011a.f21978d;
    }

    /* renamed from: a */
    public List<CipherSuite> m25869a() {
        if (this.f21985g == null) {
            return null;
        }
        Object[] objArr = new CipherSuite[this.f21985g.length];
        for (int i = 0; i < this.f21985g.length; i++) {
            objArr[i] = CipherSuite.forJavaName(this.f21985g[i]);
        }
        return C6058i.m26241a(objArr);
    }

    /* renamed from: b */
    public List<TlsVersion> m25872b() {
        if (this.f21986h == null) {
            return null;
        }
        Object[] objArr = new TlsVersion[this.f21986h.length];
        for (int i = 0; i < this.f21986h.length; i++) {
            objArr[i] = TlsVersion.forJavaName(this.f21986h[i]);
        }
        return C6058i.m26241a(objArr);
    }

    /* renamed from: c */
    public boolean m25873c() {
        return this.f21984f;
    }

    /* renamed from: a */
    void m25870a(SSLSocket sSLSocket, boolean z) {
        z = m25865b(sSLSocket, z);
        if (z.f21986h != null) {
            sSLSocket.setEnabledProtocols(z.f21986h);
        }
        if (z.f21985g != null) {
            sSLSocket.setEnabledCipherSuites(z.f21985g);
        }
    }

    /* renamed from: b */
    private C6012i m25865b(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f21985g != null) {
            strArr = (String[]) C6058i.m26254a(String.class, this.f21985g, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f21986h != null) {
            strArr2 = (String[]) C6058i.m26254a(String.class, this.f21986h, sSLSocket.getEnabledProtocols());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        if (z && C6058i.m26253a(sSLSocket.getSupportedCipherSuites(), "TLS_FALLBACK_SCSV") != null) {
            strArr = C6058i.m26256b(strArr, "TLS_FALLBACK_SCSV");
        }
        return new C6011a(this).m25860a(strArr).m25862b(strArr2).m25861a();
    }

    /* renamed from: a */
    public boolean m25871a(SSLSocket sSLSocket) {
        if (!this.f21983e) {
            return false;
        }
        if (this.f21986h != null && !C6012i.m25864a(this.f21986h, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f21985g == null || C6012i.m25864a(this.f21985g, sSLSocket.getEnabledCipherSuites()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m25864a(String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0)) {
            if (strArr2.length != 0) {
                for (String a : strArr) {
                    if (C6058i.m26253a(strArr2, a)) {
                        return 1;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6012i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C6012i c6012i = (C6012i) obj;
        if (this.f21983e != c6012i.f21983e) {
            return false;
        }
        return !this.f21983e || (Arrays.equals(this.f21985g, c6012i.f21985g) && Arrays.equals(this.f21986h, c6012i.f21986h) && this.f21984f == c6012i.f21984f);
    }

    public int hashCode() {
        return this.f21983e ? ((((527 + Arrays.hashCode(this.f21985g)) * 31) + Arrays.hashCode(this.f21986h)) * 31) + (this.f21984f ^ 1) : 17;
    }

    public String toString() {
        if (!this.f21983e) {
            return "ConnectionSpec()";
        }
        String obj = this.f21985g != null ? m25869a().toString() : "[all enabled]";
        String obj2 = this.f21986h != null ? m25872b().toString() : "[all enabled]";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConnectionSpec(cipherSuites=");
        stringBuilder.append(obj);
        stringBuilder.append(", tlsVersions=");
        stringBuilder.append(obj2);
        stringBuilder.append(", supportsTlsExtensions=");
        stringBuilder.append(this.f21984f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
