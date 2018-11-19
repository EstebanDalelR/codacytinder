package okhttp3;

import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.C15957l.C15956a;
import okhttp3.C15963q.C15962a;
import okhttp3.C15966s.C15965a;
import okhttp3.internal.cache.C15915c.C15912a;
import okhttp3.internal.cache.C15915c.C15914c;
import okhttp3.internal.http.C15925d;
import okhttp3.internal.http.C15928j;
import okhttp3.internal.p461b.C15904f;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.C15976k;
import okio.C18549c;
import okio.Source;

final class b$c {
    /* renamed from: a */
    private static final String f49094a;
    /* renamed from: b */
    private static final String f49095b;
    /* renamed from: c */
    private final String f49096c;
    /* renamed from: d */
    private final C15957l f49097d;
    /* renamed from: e */
    private final String f49098e;
    /* renamed from: f */
    private final Protocol f49099f;
    /* renamed from: g */
    private final int f49100g;
    /* renamed from: h */
    private final String f49101h;
    /* renamed from: i */
    private final C15957l f49102i;
    @Nullable
    /* renamed from: j */
    private final C15955k f49103j;
    /* renamed from: k */
    private final long f49104k;
    /* renamed from: l */
    private final long f49105l;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C15904f.m60134c().m60146d());
        stringBuilder.append("-Sent-Millis");
        f49094a = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(C15904f.m60134c().m60146d());
        stringBuilder.append("-Received-Millis");
        f49095b = stringBuilder.toString();
    }

    b$c(Source source) throws IOException {
        try {
            BufferedSource a = C15976k.m60609a(source);
            this.f49096c = a.readUtf8LineStrict();
            this.f49098e = a.readUtf8LineStrict();
            C15956a c15956a = new C15956a();
            int a2 = C2670b.a(a);
            for (int i = 0; i < a2; i++) {
                c15956a.m60464a(a.readUtf8LineStrict());
            }
            this.f49097d = c15956a.m60466a();
            C15928j a3 = C15928j.m60283a(a.readUtf8LineStrict());
            this.f49099f = a3.f49354a;
            this.f49100g = a3.f49355b;
            this.f49101h = a3.f49356c;
            c15956a = new C15956a();
            a2 = C2670b.a(a);
            for (int i2 = 0; i2 < a2; i2++) {
                c15956a.m60464a(a.readUtf8LineStrict());
            }
            String c = c15956a.m60469c(f49094a);
            String c2 = c15956a.m60469c(f49095b);
            c15956a.m60467b(f49094a);
            c15956a.m60467b(f49095b);
            long j = 0;
            this.f49104k = c != null ? Long.parseLong(c) : 0;
            if (c2 != null) {
                j = Long.parseLong(c2);
            }
            this.f49105l = j;
            this.f49102i = c15956a.m60466a();
            if (m60035a()) {
                String readUtf8LineStrict = a.readUtf8LineStrict();
                if (readUtf8LineStrict.length() > 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("expected \"\" but was \"");
                    stringBuilder.append(readUtf8LineStrict);
                    stringBuilder.append("\"");
                    throw new IOException(stringBuilder.toString());
                }
                TlsVersion tlsVersion;
                C15892e a4 = C15892e.m60066a(a.readUtf8LineStrict());
                List a5 = m60033a(a);
                List a6 = m60033a(a);
                if (a.exhausted()) {
                    tlsVersion = TlsVersion.SSL_3_0;
                } else {
                    tlsVersion = TlsVersion.forJavaName(a.readUtf8LineStrict());
                }
                this.f49103j = C15955k.m60458a(tlsVersion, a4, a5, a6);
            } else {
                this.f49103j = null;
            }
            source.close();
        } catch (Throwable th) {
            source.close();
        }
    }

    b$c(C15966s c15966s) {
        this.f49096c = c15966s.m60553a().m60526a().toString();
        this.f49097d = C15925d.m60272c(c15966s);
        this.f49098e = c15966s.m60553a().m60527b();
        this.f49099f = c15966s.m60554b();
        this.f49100g = c15966s.m60555c();
        this.f49101h = c15966s.m60557e();
        this.f49102i = c15966s.m60559g();
        this.f49103j = c15966s.m60558f();
        this.f49104k = c15966s.m60565m();
        this.f49105l = c15966s.m60566n();
    }

    /* renamed from: a */
    public void m60037a(C15912a c15912a) throws IOException {
        int i = 0;
        BufferedSink a = C15976k.m60608a(c15912a.m60188a(0));
        a.writeUtf8(this.f49096c).writeByte(10);
        a.writeUtf8(this.f49098e).writeByte(10);
        a.writeDecimalLong((long) this.f49097d.m60473a()).writeByte(10);
        int a2 = this.f49097d.m60473a();
        for (int i2 = 0; i2 < a2; i2++) {
            a.writeUtf8(this.f49097d.m60474a(i2)).writeUtf8(": ").writeUtf8(this.f49097d.m60476b(i2)).writeByte(10);
        }
        a.writeUtf8(new C15928j(this.f49099f, this.f49100g, this.f49101h).toString()).writeByte(10);
        a.writeDecimalLong((long) (this.f49102i.m60473a() + 2)).writeByte(10);
        a2 = this.f49102i.m60473a();
        while (i < a2) {
            a.writeUtf8(this.f49102i.m60474a(i)).writeUtf8(": ").writeUtf8(this.f49102i.m60476b(i)).writeByte(10);
            i++;
        }
        a.writeUtf8(f49094a).writeUtf8(": ").writeDecimalLong(this.f49104k).writeByte(10);
        a.writeUtf8(f49095b).writeUtf8(": ").writeDecimalLong(this.f49105l).writeByte(10);
        if (m60035a()) {
            a.writeByte(10);
            a.writeUtf8(this.f49103j.m60460b().m60068a()).writeByte(10);
            m60034a(a, this.f49103j.m60461c());
            m60034a(a, this.f49103j.m60462d());
            a.writeUtf8(this.f49103j.m60459a().javaName()).writeByte(10);
        }
        a.close();
    }

    /* renamed from: a */
    private boolean m60035a() {
        return this.f49096c.startsWith("https://");
    }

    /* renamed from: a */
    private List<Certificate> m60033a(BufferedSource bufferedSource) throws IOException {
        int a = C2670b.a(bufferedSource);
        if (a == -1) {
            return Collections.emptyList();
        }
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            List<Certificate> arrayList = new ArrayList(a);
            for (int i = 0; i < a; i++) {
                String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                C18549c c18549c = new C18549c();
                c18549c.m66952a(ByteString.m60583b(readUtf8LineStrict));
                arrayList.add(instance.generateCertificate(c18549c.inputStream()));
            }
            return arrayList;
        } catch (BufferedSource bufferedSource2) {
            throw new IOException(bufferedSource2.getMessage());
        }
    }

    /* renamed from: a */
    private void m60034a(BufferedSink bufferedSink, List<Certificate> list) throws IOException {
        try {
            bufferedSink.writeDecimalLong((long) list.size()).writeByte(10);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bufferedSink.writeUtf8(ByteString.m60581a(((Certificate) list.get(i)).getEncoded()).mo13424b()).writeByte(10);
            }
        } catch (BufferedSink bufferedSink2) {
            throw new IOException(bufferedSink2.getMessage());
        }
    }

    /* renamed from: a */
    public boolean m60038a(C15963q c15963q, C15966s c15966s) {
        return (this.f49096c.equals(c15963q.m60526a().toString()) && this.f49098e.equals(c15963q.m60527b()) && C15925d.m60267a(c15966s, this.f49097d, c15963q) != null) ? true : null;
    }

    /* renamed from: a */
    public C15966s m60036a(C15914c c15914c) {
        String a = this.f49102i.m60475a(ManagerWebServices.PARAM_CONTENT_TYPE);
        String a2 = this.f49102i.m60475a("Content-Length");
        return new C15965a().m60543a(new C15962a().m60510a(this.f49096c).m60512a(this.f49098e, null).m60515a(this.f49097d).m60524d()).m60540a(this.f49099f).m60536a(this.f49100g).m60538a(this.f49101h).m60542a(this.f49102i).m60545a(new b$b(c15914c, a, a2)).m60541a(this.f49103j).m60537a(this.f49104k).m60547b(this.f49105l).m60546a();
    }
}
