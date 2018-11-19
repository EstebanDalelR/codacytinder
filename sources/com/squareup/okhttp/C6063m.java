package com.squareup.okhttp;

import com.squareup.okhttp.internal.C6058i;
import java.security.cert.Certificate;
import java.util.List;

/* renamed from: com.squareup.okhttp.m */
public final class C6063m {
    /* renamed from: a */
    private final String f22219a;
    /* renamed from: b */
    private final List<Certificate> f22220b;
    /* renamed from: c */
    private final List<Certificate> f22221c;

    private C6063m(String str, List<Certificate> list, List<Certificate> list2) {
        this.f22219a = str;
        this.f22220b = list;
        this.f22221c = list2;
    }

    /* renamed from: a */
    public static com.squareup.okhttp.C6063m m26269a(javax.net.ssl.SSLSession r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r3.getCipherSuite();
        if (r0 != 0) goto L_0x000e;
    L_0x0006:
        r3 = new java.lang.IllegalStateException;
        r0 = "cipherSuite == null";
        r3.<init>(r0);
        throw r3;
    L_0x000e:
        r1 = r3.getPeerCertificates();	 Catch:{ SSLPeerUnverifiedException -> 0x0013 }
        goto L_0x0014;
    L_0x0013:
        r1 = 0;
    L_0x0014:
        if (r1 == 0) goto L_0x001b;
    L_0x0016:
        r1 = com.squareup.okhttp.internal.C6058i.m26241a(r1);
        goto L_0x001f;
    L_0x001b:
        r1 = java.util.Collections.emptyList();
    L_0x001f:
        r3 = r3.getLocalCertificates();
        if (r3 == 0) goto L_0x002a;
    L_0x0025:
        r3 = com.squareup.okhttp.internal.C6058i.m26241a(r3);
        goto L_0x002e;
    L_0x002a:
        r3 = java.util.Collections.emptyList();
    L_0x002e:
        r2 = new com.squareup.okhttp.m;
        r2.<init>(r0, r1, r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.m.a(javax.net.ssl.SSLSession):com.squareup.okhttp.m");
    }

    /* renamed from: a */
    public static C6063m m26268a(String str, List<Certificate> list, List<Certificate> list2) {
        if (str != null) {
            return new C6063m(str, C6058i.m26240a((List) list), C6058i.m26240a((List) list2));
        }
        throw new IllegalArgumentException("cipherSuite == null");
    }

    /* renamed from: a */
    public String m26270a() {
        return this.f22219a;
    }

    /* renamed from: b */
    public List<Certificate> m26271b() {
        return this.f22220b;
    }

    /* renamed from: c */
    public List<Certificate> m26272c() {
        return this.f22221c;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C6063m)) {
            return false;
        }
        C6063m c6063m = (C6063m) obj;
        if (this.f22219a.equals(c6063m.f22219a) && this.f22220b.equals(c6063m.f22220b) && this.f22221c.equals(c6063m.f22221c) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((527 + this.f22219a.hashCode()) * 31) + this.f22220b.hashCode()) * 31) + this.f22221c.hashCode();
    }
}
