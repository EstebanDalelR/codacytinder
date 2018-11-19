package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.C15908c;
import okhttp3.internal.tls.C15944c;
import okio.ByteString;

/* renamed from: okhttp3.d */
public final class C15890d {
    /* renamed from: a */
    public static final C15890d f49134a = new C15888a().m60056a();
    /* renamed from: b */
    private final Set<C15889b> f49135b;
    @Nullable
    /* renamed from: c */
    private final C15944c f49136c;

    /* renamed from: okhttp3.d$a */
    public static final class C15888a {
        /* renamed from: a */
        private final List<C15889b> f49129a = new ArrayList();

        /* renamed from: a */
        public C15888a m60055a(String str, String... strArr) {
            if (str == null) {
                throw new NullPointerException("pattern == null");
            }
            for (String c15889b : strArr) {
                this.f49129a.add(new C15889b(str, c15889b));
            }
            return this;
        }

        /* renamed from: a */
        public C15890d m60056a() {
            return new C15890d(new LinkedHashSet(this.f49129a), null);
        }
    }

    /* renamed from: okhttp3.d$b */
    static final class C15889b {
        /* renamed from: a */
        final String f49130a;
        /* renamed from: b */
        final String f49131b;
        /* renamed from: c */
        final String f49132c;
        /* renamed from: d */
        final ByteString f49133d;

        C15889b(String str, String str2) {
            StringBuilder stringBuilder;
            this.f49130a = str;
            if (str.startsWith("*.")) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("http://");
                stringBuilder.append(str.substring("*.".length()));
                str = HttpUrl.m60000f(stringBuilder.toString()).m60010g();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("http://");
                stringBuilder.append(str);
                str = HttpUrl.m60000f(stringBuilder.toString()).m60010g();
            }
            this.f49131b = str;
            if (str2.startsWith("sha1/") != null) {
                this.f49132c = "sha1/";
                this.f49133d = ByteString.m60583b(str2.substring("sha1/".length()));
            } else if (str2.startsWith("sha256/") != null) {
                this.f49132c = "sha256/";
                this.f49133d = ByteString.m60583b(str2.substring("sha256/".length()));
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("pins must start with 'sha256/' or 'sha1/': ");
                stringBuilder.append(str2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            if (this.f49133d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("pins must be base64: ");
                stringBuilder.append(str2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        boolean m60057a(String str) {
            if (!this.f49130a.startsWith("*.")) {
                return str.equals(this.f49131b);
            }
            int indexOf = str.indexOf(46);
            boolean z = true;
            if ((str.length() - indexOf) - 1 == this.f49131b.length()) {
                if (str.regionMatches(false, indexOf + 1, this.f49131b, 0, this.f49131b.length()) != null) {
                    return z;
                }
            }
            z = false;
            return z;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C15889b) {
                C15889b c15889b = (C15889b) obj;
                if (this.f49130a.equals(c15889b.f49130a) && this.f49132c.equals(c15889b.f49132c) && this.f49133d.equals(c15889b.f49133d) != null) {
                    return true;
                }
            }
            return null;
        }

        public int hashCode() {
            return ((((527 + this.f49130a.hashCode()) * 31) + this.f49132c.hashCode()) * 31) + this.f49133d.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f49132c);
            stringBuilder.append(this.f49133d.mo13424b());
            return stringBuilder.toString();
        }
    }

    C15890d(Set<C15889b> set, @Nullable C15944c c15944c) {
        this.f49135b = set;
        this.f49136c = c15944c;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15890d) {
            C15890d c15890d = (C15890d) obj;
            if (C15908c.m60168a(this.f49136c, c15890d.f49136c) && this.f49135b.equals(c15890d.f49135b) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((this.f49136c != null ? this.f49136c.hashCode() : 0) * 31) + this.f49135b.hashCode();
    }

    /* renamed from: a */
    public void m60063a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List a = m60061a(str);
        if (!a.isEmpty()) {
            int i;
            if (this.f49136c != null) {
                list = this.f49136c.mo13333a(list, str);
            }
            int size = list.size();
            for (i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = a.size();
                Object obj = null;
                Object obj2 = obj;
                for (int i2 = 0; i2 < size2; i2++) {
                    C15889b c15889b = (C15889b) a.get(i2);
                    if (c15889b.f49132c.equals("sha256/")) {
                        if (obj == null) {
                            obj = C15890d.m60060b(x509Certificate);
                        }
                        if (c15889b.f49133d.equals(obj)) {
                            return;
                        }
                    } else if (c15889b.f49132c.equals("sha1/")) {
                        if (obj2 == null) {
                            obj2 = C15890d.m60059a(x509Certificate);
                        }
                        if (c15889b.f49133d.equals(obj2)) {
                            return;
                        }
                    } else {
                        list = new StringBuilder();
                        list.append("unsupported hashAlgorithm: ");
                        list.append(c15889b.f49132c);
                        throw new AssertionError(list.toString());
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Certificate pinning failure!");
            stringBuilder.append("\n  Peer certificate chain:");
            i = list.size();
            for (int i3 = 0; i3 < i; i3++) {
                Certificate certificate = (X509Certificate) list.get(i3);
                stringBuilder.append("\n    ");
                stringBuilder.append(C15890d.m60058a(certificate));
                stringBuilder.append(": ");
                stringBuilder.append(certificate.getSubjectDN().getName());
            }
            stringBuilder.append("\n  Pinned certificates for ");
            stringBuilder.append(str);
            stringBuilder.append(":");
            str = a.size();
            for (int i4 = 0; i4 < str; i4++) {
                C15889b c15889b2 = (C15889b) a.get(i4);
                stringBuilder.append("\n    ");
                stringBuilder.append(c15889b2);
            }
            throw new SSLPeerUnverifiedException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    List<C15889b> m60061a(String str) {
        List<C15889b> emptyList = Collections.emptyList();
        for (C15889b c15889b : this.f49135b) {
            if (c15889b.m60057a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(c15889b);
            }
        }
        return emptyList;
    }

    /* renamed from: a */
    C15890d m60062a(@Nullable C15944c c15944c) {
        if (C15908c.m60168a(this.f49136c, (Object) c15944c)) {
            return this;
        }
        return new C15890d(this.f49135b, c15944c);
    }

    /* renamed from: a */
    public static String m60058a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sha256/");
            stringBuilder.append(C15890d.m60060b((X509Certificate) certificate).mo13424b());
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: a */
    static ByteString m60059a(X509Certificate x509Certificate) {
        return ByteString.m60581a(x509Certificate.getPublicKey().getEncoded()).mo13426d();
    }

    /* renamed from: b */
    static ByteString m60060b(X509Certificate x509Certificate) {
        return ByteString.m60581a(x509Certificate.getPublicKey().getEncoded()).mo13427e();
    }
}
