package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: okhttp3.internal.tls.b */
public final class C17684b implements TrustRootIndex {
    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f54988a = new LinkedHashMap();

    public C17684b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.f54988a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f54988a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r5.getIssuerX500Principal();
        r1 = r4.f54988a;
        r0 = r1.get(r0);
        r0 = (java.util.Set) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r0 = r0.iterator();
    L_0x0014:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0028;
    L_0x001a:
        r2 = r0.next();
        r2 = (java.security.cert.X509Certificate) r2;
        r3 = r2.getPublicKey();
        r5.verify(r3);	 Catch:{ Exception -> 0x0014 }
        return r2;
    L_0x0028:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.b.findByIssuerAndSignature(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17684b) || ((C17684b) obj).f54988a.equals(this.f54988a) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f54988a.hashCode();
    }
}
