package okhttp3.internal.http2;

import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.C15957l;
import okhttp3.C15957l.C15956a;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.C15966s.C15965a;
import okhttp3.C15968t;
import okhttp3.C17692o;
import okhttp3.Interceptor.Chain;
import okhttp3.Protocol;
import okhttp3.internal.C15900a;
import okhttp3.internal.C15908c;
import okhttp3.internal.connection.C15921f;
import okhttp3.internal.http.C15925d;
import okhttp3.internal.http.C15927h;
import okhttp3.internal.http.C15928j;
import okhttp3.internal.http.C17663g;
import okhttp3.internal.http.HttpCodec;
import okio.ByteString;
import okio.C15976k;
import okio.C17704f;
import okio.C18549c;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.http2.d */
public final class C17666d implements HttpCodec {
    /* renamed from: b */
    private static final ByteString f54922b = ByteString.m60580a("connection");
    /* renamed from: c */
    private static final ByteString f54923c = ByteString.m60580a("host");
    /* renamed from: d */
    private static final ByteString f54924d = ByteString.m60580a("keep-alive");
    /* renamed from: e */
    private static final ByteString f54925e = ByteString.m60580a("proxy-connection");
    /* renamed from: f */
    private static final ByteString f54926f = ByteString.m60580a("transfer-encoding");
    /* renamed from: g */
    private static final ByteString f54927g = ByteString.m60580a("te");
    /* renamed from: h */
    private static final ByteString f54928h = ByteString.m60580a("encoding");
    /* renamed from: i */
    private static final ByteString f54929i = ByteString.m60580a("upgrade");
    /* renamed from: j */
    private static final List<ByteString> f54930j = C15908c.m60162a(f54922b, f54923c, f54924d, f54925e, f54927g, f54926f, f54928h, f54929i, C15929a.f49361c, C15929a.f49362d, C15929a.f49363e, C15929a.f49364f);
    /* renamed from: k */
    private static final List<ByteString> f54931k = C15908c.m60162a(f54922b, f54923c, f54924d, f54925e, f54927g, f54926f, f54928h, f54929i);
    /* renamed from: a */
    final C15921f f54932a;
    /* renamed from: l */
    private final C17692o f54933l;
    /* renamed from: m */
    private final Chain f54934m;
    /* renamed from: n */
    private final C15936e f54935n;
    /* renamed from: o */
    private C15939g f54936o;

    /* renamed from: okhttp3.internal.http2.d$a */
    class C18547a extends C17704f {
        /* renamed from: a */
        boolean f57791a = null;
        /* renamed from: b */
        long f57792b = null;
        /* renamed from: c */
        final /* synthetic */ C17666d f57793c;

        C18547a(C17666d c17666d, Source source) {
            this.f57793c = c17666d;
            super(source);
        }

        public long read(C18549c c18549c, long j) throws IOException {
            try {
                c18549c = delegate().read(c18549c, j);
                if (c18549c > 0) {
                    this.f57792b += c18549c;
                }
                return c18549c;
            } catch (C18549c c18549c2) {
                m66938a(c18549c2);
                throw c18549c2;
            }
        }

        public void close() throws IOException {
            super.close();
            m66938a(null);
        }

        /* renamed from: a */
        private void m66938a(IOException iOException) {
            if (!this.f57791a) {
                this.f57791a = true;
                this.f57793c.f54932a.m60249a(false, this.f57793c, this.f57792b, iOException);
            }
        }
    }

    public C17666d(C17692o c17692o, Chain chain, C15921f c15921f, C15936e c15936e) {
        this.f54933l = c17692o;
        this.f54934m = chain;
        this.f54932a = c15921f;
        this.f54935n = c15936e;
    }

    public Sink createRequestBody(C15963q c15963q, long j) {
        return this.f54936o.m60387h();
    }

    public void writeRequestHeaders(C15963q c15963q) throws IOException {
        if (this.f54936o == null) {
            this.f54936o = this.f54935n.m60329a(C17666d.m64330a(c15963q), c15963q.m60530d() != null);
            this.f54936o.m60384e().mo13437a((long) this.f54934m.readTimeoutMillis(), TimeUnit.MILLISECONDS);
            this.f54936o.m60385f().mo13437a((long) this.f54934m.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        }
    }

    public void flushRequest() throws IOException {
        this.f54935n.m60342b();
    }

    public void finishRequest() throws IOException {
        this.f54936o.m60387h().close();
    }

    public C15965a readResponseHeaders(boolean z) throws IOException {
        C15965a a = C17666d.m64331a(this.f54936o.m60383d());
        return (z && C15900a.f49230a.mo13397a(a)) ? false : a;
    }

    /* renamed from: a */
    public static List<C15929a> m64330a(C15963q c15963q) {
        C15957l c = c15963q.m60529c();
        List<C15929a> arrayList = new ArrayList(c.m60473a() + 4);
        arrayList.add(new C15929a(C15929a.f49361c, c15963q.m60527b()));
        arrayList.add(new C15929a(C15929a.f49362d, C15927h.m60280a(c15963q.m60526a())));
        String a = c15963q.m60525a("Host");
        if (a != null) {
            arrayList.add(new C15929a(C15929a.f49364f, a));
        }
        arrayList.add(new C15929a(C15929a.f49363e, c15963q.m60526a().m60003c()));
        int a2 = c.m60473a();
        for (int i = null; i < a2; i++) {
            ByteString a3 = ByteString.m60580a(c.m60474a(i).toLowerCase(Locale.US));
            if (!f54930j.contains(a3)) {
                arrayList.add(new C15929a(a3, c.m60476b(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C15965a m64331a(List<C15929a> list) throws IOException {
        C15956a c15956a = new C15956a();
        int size = list.size();
        C15956a c15956a2 = c15956a;
        C15928j c15928j = null;
        for (int i = 0; i < size; i++) {
            C15929a c15929a = (C15929a) list.get(i);
            if (c15929a != null) {
                ByteString byteString = c15929a.f49365g;
                String a = c15929a.f49366h.mo13419a();
                if (byteString.equals(C15929a.f49360b)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("HTTP/1.1 ");
                    stringBuilder.append(a);
                    c15928j = C15928j.m60283a(stringBuilder.toString());
                } else if (!f54931k.contains(byteString)) {
                    C15900a.f49230a.mo13405a(c15956a2, byteString.mo13419a(), a);
                }
            } else if (c15928j != null && c15928j.f49355b == 100) {
                c15956a2 = new C15956a();
                c15928j = null;
            }
        }
        if (c15928j != null) {
            return new C15965a().m60540a(Protocol.HTTP_2).m60536a(c15928j.f49355b).m60538a(c15928j.f49356c).m60542a(c15956a2.m60466a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public C15968t openResponseBody(C15966s c15966s) throws IOException {
        this.f54932a.f49338c.m59961f(this.f54932a.f49337b);
        return new C17663g(c15966s.m60551a(ManagerWebServices.PARAM_CONTENT_TYPE), C15925d.m60264a(c15966s), C15976k.m60609a(new C18547a(this, this.f54936o.m60386g())));
    }

    public void cancel() {
        if (this.f54936o != null) {
            this.f54936o.m60379b(ErrorCode.CANCEL);
        }
    }
}
