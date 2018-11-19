package com.squareup.okhttp;

import com.squareup.okhttp.internal.C6058i;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;

/* renamed from: com.squareup.okhttp.e */
public final class C6005e {
    /* renamed from: a */
    public static final C6005e f21954a = new C6004a().m25815a();
    /* renamed from: b */
    private final Map<String, Set<ByteString>> f21955b;

    /* renamed from: com.squareup.okhttp.e$a */
    public static final class C6004a {
        /* renamed from: a */
        private final Map<String, Set<ByteString>> f21953a = new LinkedHashMap();

        /* renamed from: a */
        public C6005e m25815a() {
            return new C6005e();
        }
    }

    private C6005e(C6004a c6004a) {
        this.f21955b = C6058i.m26243a(c6004a.f21953a);
    }

    /* renamed from: a */
    public void m25819a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        Set<ByteString> a = m25818a(str);
        if (a != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                if (!a.contains(C6005e.m25817a((X509Certificate) list.get(i)))) {
                    i++;
                } else {
                    return;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Certificate pinning failure!");
            stringBuilder.append("\n  Peer certificate chain:");
            i = list.size();
            for (int i2 = 0; i2 < i; i2++) {
                Certificate certificate = (X509Certificate) list.get(i2);
                stringBuilder.append("\n    ");
                stringBuilder.append(C6005e.m25816a(certificate));
                stringBuilder.append(": ");
                stringBuilder.append(certificate.getSubjectDN().getName());
            }
            stringBuilder.append("\n  Pinned certificates for ");
            stringBuilder.append(str);
            stringBuilder.append(":");
            for (ByteString byteString : a) {
                stringBuilder.append("\n    sha1/");
                stringBuilder.append(byteString.b());
            }
            throw new SSLPeerUnverifiedException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    Set<ByteString> m25818a(String str) {
        Set set = (Set) this.f21955b.get(str);
        int indexOf = str.indexOf(46);
        if (indexOf != str.lastIndexOf(46)) {
            Map map = this.f21955b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("*.");
            stringBuilder.append(str.substring(indexOf + 1));
            str = (Set) map.get(stringBuilder.toString());
        } else {
            str = null;
        }
        if (set == null && str == null) {
            return null;
        }
        if (set == null || str == null) {
            return set != null ? set : str;
        } else {
            Set<ByteString> linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(set);
            linkedHashSet.addAll(str);
            return linkedHashSet;
        }
    }

    /* renamed from: a */
    public static String m25816a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sha1/");
            stringBuilder.append(C6005e.m25817a((X509Certificate) certificate).b());
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: a */
    private static ByteString m25817a(X509Certificate x509Certificate) {
        return C6058i.m26245a(ByteString.a(x509Certificate.getPublicKey().getEncoded()));
    }
}
