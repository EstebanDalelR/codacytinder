package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.p461b.C15904f;

/* renamed from: okhttp3.internal.tls.c */
public abstract class C15944c {
    /* renamed from: a */
    public abstract List<Certificate> mo13333a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;

    /* renamed from: a */
    public static C15944c m60431a(X509TrustManager x509TrustManager) {
        return C15904f.m60134c().mo13337a(x509TrustManager);
    }
}
