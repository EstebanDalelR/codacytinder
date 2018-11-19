package io.fabric.sdk.android.services.network;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: io.fabric.sdk.android.services.network.e */
class C15653e {
    /* renamed from: a */
    final KeyStore f48442a;
    /* renamed from: b */
    private final HashMap<Principal, X509Certificate> f48443b;

    public C15653e(InputStream inputStream, String str) {
        KeyStore a = m58811a(inputStream, str);
        this.f48443b = m58812a(a);
        this.f48442a = a;
    }

    /* renamed from: a */
    public boolean m58813a(X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = (X509Certificate) this.f48443b.get(x509Certificate.getSubjectX500Principal());
        return (x509Certificate2 == null || x509Certificate2.getPublicKey().equals(x509Certificate.getPublicKey()) == null) ? null : true;
    }

    /* renamed from: b */
    public java.security.cert.X509Certificate m58814b(java.security.cert.X509Certificate r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.f48443b;
        r1 = r5.getIssuerX500Principal();
        r0 = r0.get(r1);
        r0 = (java.security.cert.X509Certificate) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r2 = r0.getSubjectX500Principal();
        r3 = r5.getSubjectX500Principal();
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x001f;
    L_0x001e:
        return r1;
    L_0x001f:
        r2 = r0.getPublicKey();	 Catch:{ GeneralSecurityException -> 0x0027 }
        r5.verify(r2);	 Catch:{ GeneralSecurityException -> 0x0027 }
        return r0;
    L_0x0027:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.e.b(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    /* renamed from: a */
    private HashMap<Principal, X509Certificate> m58812a(KeyStore keyStore) {
        try {
            HashMap<Principal, X509Certificate> hashMap = new HashMap();
            Enumeration aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate((String) aliases.nextElement());
                if (x509Certificate != null) {
                    hashMap.put(x509Certificate.getSubjectX500Principal(), x509Certificate);
                }
            }
            return hashMap;
        } catch (KeyStore keyStore2) {
            throw new AssertionError(keyStore2);
        }
    }

    /* renamed from: a */
    private KeyStore m58811a(InputStream inputStream, String str) {
        InputStream bufferedInputStream;
        try {
            KeyStore instance = KeyStore.getInstance("BKS");
            bufferedInputStream = new BufferedInputStream(inputStream);
            instance.load(bufferedInputStream, str.toCharArray());
            bufferedInputStream.close();
            return instance;
        } catch (InputStream inputStream2) {
            throw new AssertionError(inputStream2);
        } catch (InputStream inputStream22) {
            throw new AssertionError(inputStream22);
        } catch (InputStream inputStream222) {
            throw new AssertionError(inputStream222);
        } catch (InputStream inputStream2222) {
            throw new AssertionError(inputStream2222);
        } catch (Throwable th) {
            bufferedInputStream.close();
        }
    }
}
