package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.C15908c;

/* renamed from: okhttp3.k */
public final class C15955k {
    /* renamed from: a */
    private final TlsVersion f49503a;
    /* renamed from: b */
    private final C15892e f49504b;
    /* renamed from: c */
    private final List<Certificate> f49505c;
    /* renamed from: d */
    private final List<Certificate> f49506d;

    private C15955k(TlsVersion tlsVersion, C15892e c15892e, List<Certificate> list, List<Certificate> list2) {
        this.f49503a = tlsVersion;
        this.f49504b = c15892e;
        this.f49505c = list;
        this.f49506d = list2;
    }

    /* renamed from: a */
    public static okhttp3.C15955k m60457a(javax.net.ssl.SSLSession r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r4.getCipherSuite();
        if (r0 != 0) goto L_0x000e;
    L_0x0006:
        r4 = new java.lang.IllegalStateException;
        r0 = "cipherSuite == null";
        r4.<init>(r0);
        throw r4;
    L_0x000e:
        r0 = okhttp3.C15892e.m60066a(r0);
        r1 = r4.getProtocol();
        if (r1 != 0) goto L_0x0020;
    L_0x0018:
        r4 = new java.lang.IllegalStateException;
        r0 = "tlsVersion == null";
        r4.<init>(r0);
        throw r4;
    L_0x0020:
        r1 = okhttp3.TlsVersion.forJavaName(r1);
        r2 = r4.getPeerCertificates();	 Catch:{ SSLPeerUnverifiedException -> 0x0029 }
        goto L_0x002a;
    L_0x0029:
        r2 = 0;
    L_0x002a:
        if (r2 == 0) goto L_0x0031;
    L_0x002c:
        r2 = okhttp3.internal.C15908c.m60162a(r2);
        goto L_0x0035;
    L_0x0031:
        r2 = java.util.Collections.emptyList();
    L_0x0035:
        r4 = r4.getLocalCertificates();
        if (r4 == 0) goto L_0x0040;
    L_0x003b:
        r4 = okhttp3.internal.C15908c.m60162a(r4);
        goto L_0x0044;
    L_0x0040:
        r4 = java.util.Collections.emptyList();
    L_0x0044:
        r3 = new okhttp3.k;
        r3.<init>(r1, r0, r2, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.k.a(javax.net.ssl.SSLSession):okhttp3.k");
    }

    /* renamed from: a */
    public static C15955k m60458a(TlsVersion tlsVersion, C15892e c15892e, List<Certificate> list, List<Certificate> list2) {
        if (tlsVersion == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (c15892e != null) {
            return new C15955k(tlsVersion, c15892e, C15908c.m60161a((List) list), C15908c.m60161a((List) list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    /* renamed from: a */
    public TlsVersion m60459a() {
        return this.f49503a;
    }

    /* renamed from: b */
    public C15892e m60460b() {
        return this.f49504b;
    }

    /* renamed from: c */
    public List<Certificate> m60461c() {
        return this.f49505c;
    }

    /* renamed from: d */
    public List<Certificate> m60462d() {
        return this.f49506d;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = false;
        if (!(obj instanceof C15955k)) {
            return false;
        }
        C15955k c15955k = (C15955k) obj;
        if (this.f49503a.equals(c15955k.f49503a) && this.f49504b.equals(c15955k.f49504b) && this.f49505c.equals(c15955k.f49505c) && this.f49506d.equals(c15955k.f49506d) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((((527 + this.f49503a.hashCode()) * 31) + this.f49504b.hashCode()) * 31) + this.f49505c.hashCode()) * 31) + this.f49506d.hashCode();
    }
}
