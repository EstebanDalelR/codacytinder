package io.fabric.sdk.android.services.network;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;

/* renamed from: io.fabric.sdk.android.services.network.a */
final class C15649a {
    /* renamed from: a */
    public static X509Certificate[] m58804a(X509Certificate[] x509CertificateArr, C15653e c15653e) throws CertificateException {
        LinkedList linkedList = new LinkedList();
        boolean a = c15653e.m58813a(x509CertificateArr[0]);
        linkedList.add(x509CertificateArr[0]);
        int i = 1;
        boolean z = a;
        int i2 = 1;
        while (i2 < x509CertificateArr.length) {
            if (c15653e.m58813a(x509CertificateArr[i2])) {
                z = true;
            }
            if (!C15649a.m58803a(x509CertificateArr[i2], x509CertificateArr[i2 - 1])) {
                break;
            }
            linkedList.add(x509CertificateArr[i2]);
            i2++;
        }
        x509CertificateArr = c15653e.m58814b(x509CertificateArr[i2 - 1]);
        if (x509CertificateArr != null) {
            linkedList.add(x509CertificateArr);
        } else {
            i = z;
        }
        if (i != 0) {
            return (X509Certificate[]) linkedList.toArray(new X509Certificate[linkedList.size()]);
        }
        throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
    }

    /* renamed from: a */
    private static boolean m58803a(java.security.cert.X509Certificate r2, java.security.cert.X509Certificate r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r2.getSubjectX500Principal();
        r1 = r3.getIssuerX500Principal();
        r0 = r0.equals(r1);
        r1 = 0;
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r2 = r2.getPublicKey();	 Catch:{ GeneralSecurityException -> 0x0019 }
        r3.verify(r2);	 Catch:{ GeneralSecurityException -> 0x0019 }
        r2 = 1;
        return r2;
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.a.a(java.security.cert.X509Certificate, java.security.cert.X509Certificate):boolean");
    }
}
