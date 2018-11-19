package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.C15608c;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: io.fabric.sdk.android.services.network.d */
class C15652d implements X509TrustManager {
    /* renamed from: a */
    private static final X509Certificate[] f48436a = new X509Certificate[0];
    /* renamed from: b */
    private final TrustManager[] f48437b;
    /* renamed from: c */
    private final C15653e f48438c;
    /* renamed from: d */
    private final long f48439d;
    /* renamed from: e */
    private final List<byte[]> f48440e = new LinkedList();
    /* renamed from: f */
    private final Set<X509Certificate> f48441f = Collections.synchronizedSet(new HashSet());

    public C15652d(C15653e c15653e, PinningInfoProvider pinningInfoProvider) {
        this.f48437b = m58810a(c15653e);
        this.f48438c = c15653e;
        this.f48439d = pinningInfoProvider.getPinCreationTimeInMillis();
        for (String a : pinningInfoProvider.getPins()) {
            this.f48440e.add(m58809a(a));
        }
    }

    /* renamed from: a */
    private TrustManager[] m58810a(C15653e c15653e) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(c15653e.f48442a);
            return instance.getTrustManagers();
        } catch (C15653e c15653e2) {
            throw new AssertionError(c15653e2);
        } catch (C15653e c15653e22) {
            throw new AssertionError(c15653e22);
        }
    }

    /* renamed from: a */
    private boolean m58808a(X509Certificate x509Certificate) throws CertificateException {
        try {
            x509Certificate = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] equals : this.f48440e) {
                if (Arrays.equals(equals, x509Certificate)) {
                    return true;
                }
            }
            return null;
        } catch (X509Certificate x509Certificate2) {
            throw new CertificateException(x509Certificate2);
        }
    }

    /* renamed from: a */
    private void m58807a(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        for (TrustManager trustManager : this.f48437b) {
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    private void m58806a(X509Certificate[] x509CertificateArr) throws CertificateException {
        if (this.f48439d == -1 || System.currentTimeMillis() - this.f48439d <= 15552000000L) {
            x509CertificateArr = C15649a.m58804a(x509CertificateArr, this.f48438c);
            int length = x509CertificateArr.length;
            int i = 0;
            while (i < length) {
                if (!m58808a(x509CertificateArr[i])) {
                    i++;
                } else {
                    return;
                }
            }
            throw new CertificateException("No valid pins found in chain!");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Certificate pins are stale, (");
        stringBuilder.append(System.currentTimeMillis() - this.f48439d);
        stringBuilder.append(" millis vs ");
        stringBuilder.append(15552000000L);
        stringBuilder.append(" millis) falling back to system trust.");
        C15608c.m58560h().mo12804w("Fabric", stringBuilder.toString());
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Client certificates not supported!");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.f48441f.contains(x509CertificateArr[0])) {
            m58807a(x509CertificateArr, str);
            m58806a(x509CertificateArr);
            this.f48441f.add(x509CertificateArr[0]);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f48436a;
    }

    /* renamed from: a */
    private byte[] m58809a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
