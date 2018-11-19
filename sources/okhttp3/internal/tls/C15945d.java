package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import okhttp3.internal.C15908c;

/* renamed from: okhttp3.internal.tls.d */
public final class C15945d implements HostnameVerifier {
    /* renamed from: a */
    public static final C15945d f49466a = new C15945d();

    private C15945d() {
    }

    public boolean verify(java.lang.String r2, javax.net.ssl.SSLSession r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = 0;
        r3 = r3.getPeerCertificates();	 Catch:{ SSLException -> 0x000e }
        r3 = r3[r0];	 Catch:{ SSLException -> 0x000e }
        r3 = (java.security.cert.X509Certificate) r3;	 Catch:{ SSLException -> 0x000e }
        r2 = r1.m60438a(r2, r3);	 Catch:{ SSLException -> 0x000e }
        return r2;
    L_0x000e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.d.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }

    /* renamed from: a */
    public boolean m60438a(String str, X509Certificate x509Certificate) {
        if (C15908c.m60178c(str)) {
            return m60435b(str, x509Certificate);
        }
        return m60436c(str, x509Certificate);
    }

    /* renamed from: b */
    private boolean m60435b(String str, X509Certificate x509Certificate) {
        x509Certificate = C15945d.m60434a(x509Certificate, 7);
        int size = x509Certificate.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase((String) x509Certificate.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m60436c(String str, X509Certificate x509Certificate) {
        str = str.toLowerCase(Locale.US);
        for (String a : C15945d.m60434a(x509Certificate, 2)) {
            if (m60437a(str, a)) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<String> m60433a(X509Certificate x509Certificate) {
        Collection a = C15945d.m60434a(x509Certificate, 7);
        x509Certificate = C15945d.m60434a(x509Certificate, 2);
        List<String> arrayList = new ArrayList(a.size() + x509Certificate.size());
        arrayList.addAll(a);
        arrayList.addAll(x509Certificate);
        return arrayList;
    }

    /* renamed from: a */
    private static java.util.List<java.lang.String> m60434a(java.security.cert.X509Certificate r4, int r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.util.ArrayList;
        r0.<init>();
        r4 = r4.getSubjectAlternativeNames();	 Catch:{ CertificateParsingException -> 0x0048 }
        if (r4 != 0) goto L_0x0010;	 Catch:{ CertificateParsingException -> 0x0048 }
    L_0x000b:
        r4 = java.util.Collections.emptyList();	 Catch:{ CertificateParsingException -> 0x0048 }
        return r4;	 Catch:{ CertificateParsingException -> 0x0048 }
    L_0x0010:
        r4 = r4.iterator();	 Catch:{ CertificateParsingException -> 0x0048 }
    L_0x0014:
        r1 = r4.hasNext();	 Catch:{ CertificateParsingException -> 0x0048 }
        if (r1 == 0) goto L_0x0047;	 Catch:{ CertificateParsingException -> 0x0048 }
    L_0x001a:
        r1 = r4.next();	 Catch:{ CertificateParsingException -> 0x0048 }
        r1 = (java.util.List) r1;	 Catch:{ CertificateParsingException -> 0x0048 }
        if (r1 == 0) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0048 }
    L_0x0022:
        r2 = r1.size();	 Catch:{ CertificateParsingException -> 0x0048 }
        r3 = 2;	 Catch:{ CertificateParsingException -> 0x0048 }
        if (r2 >= r3) goto L_0x002a;	 Catch:{ CertificateParsingException -> 0x0048 }
    L_0x0029:
        goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0048 }
    L_0x002a:
        r2 = 0;	 Catch:{ CertificateParsingException -> 0x0048 }
        r2 = r1.get(r2);	 Catch:{ CertificateParsingException -> 0x0048 }
        r2 = (java.lang.Integer) r2;	 Catch:{ CertificateParsingException -> 0x0048 }
        if (r2 != 0) goto L_0x0034;	 Catch:{ CertificateParsingException -> 0x0048 }
    L_0x0033:
        goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0048 }
    L_0x0034:
        r2 = r2.intValue();	 Catch:{ CertificateParsingException -> 0x0048 }
        if (r2 != r5) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0048 }
    L_0x003a:
        r2 = 1;	 Catch:{ CertificateParsingException -> 0x0048 }
        r1 = r1.get(r2);	 Catch:{ CertificateParsingException -> 0x0048 }
        r1 = (java.lang.String) r1;	 Catch:{ CertificateParsingException -> 0x0048 }
        if (r1 == 0) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0048 }
    L_0x0043:
        r0.add(r1);	 Catch:{ CertificateParsingException -> 0x0048 }
        goto L_0x0014;
    L_0x0047:
        return r0;
    L_0x0048:
        r4 = java.util.Collections.emptyList();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.d.a(java.security.cert.X509Certificate, int):java.util.List<java.lang.String>");
    }

    /* renamed from: a */
    public boolean m60437a(String str, String str2) {
        if (!(str == null || str.length() == 0 || str.startsWith("."))) {
            if (!str.endsWith("..")) {
                if (!(str2 == null || str2.length() == 0 || str2.startsWith("."))) {
                    if (!str2.endsWith("..")) {
                        StringBuilder stringBuilder;
                        if (!str.endsWith(".")) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append('.');
                            str = stringBuilder.toString();
                        }
                        if (!str2.endsWith(".")) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str2);
                            stringBuilder.append('.');
                            str2 = stringBuilder.toString();
                        }
                        str2 = str2.toLowerCase(Locale.US);
                        if (!str2.contains("*")) {
                            return str.equals(str2);
                        }
                        if (str2.startsWith("*.")) {
                            if (str2.indexOf(42, 1) == -1) {
                                if (str.length() < str2.length() || "*.".equals(str2)) {
                                    return false;
                                }
                                str2 = str2.substring(1);
                                if (!str.endsWith(str2)) {
                                    return false;
                                }
                                int length = str.length() - str2.length();
                                if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                                    return true;
                                }
                                return false;
                            }
                        }
                        return false;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
