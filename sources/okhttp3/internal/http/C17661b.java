package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.C15966s.C15965a;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.C15908c;
import okhttp3.internal.connection.C15921f;
import okhttp3.internal.connection.C17659c;
import okio.BufferedSink;
import okio.C15976k;
import okio.C17703e;
import okio.C18549c;
import okio.Sink;

/* renamed from: okhttp3.internal.http.b */
public final class C17661b implements Interceptor {
    /* renamed from: a */
    private final boolean f54901a;

    /* renamed from: okhttp3.internal.http.b$a */
    static final class C18546a extends C17703e {
        /* renamed from: a */
        long f57790a;

        C18546a(Sink sink) {
            super(sink);
        }

        public void write(C18549c c18549c, long j) throws IOException {
            super.write(c18549c, j);
            this.f57790a += j;
        }
    }

    public C17661b(boolean z) {
        this.f54901a = z;
    }

    public C15966s intercept(Chain chain) throws IOException {
        C17662f c17662f = (C17662f) chain;
        HttpCodec b = c17662f.m64318b();
        C15921f a = c17662f.m64316a();
        C17659c c17659c = (C17659c) c17662f.connection();
        C15963q request = c17662f.request();
        long currentTimeMillis = System.currentTimeMillis();
        c17662f.m64319c().m59958c(c17662f.call());
        b.writeRequestHeaders(request);
        c17662f.m64319c().m59953a(c17662f.call(), request);
        C15965a c15965a = null;
        if (C15926e.m60277c(request.m60527b()) && request.m60530d() != null) {
            if ("100-continue".equalsIgnoreCase(request.m60525a("Expect"))) {
                b.flushRequest();
                c17662f.m64319c().m59960e(c17662f.call());
                c15965a = b.readResponseHeaders(true);
            }
            if (c15965a == null) {
                c17662f.m64319c().m59959d(c17662f.call());
                Sink c18546a = new C18546a(b.createRequestBody(request, request.m60530d().contentLength()));
                BufferedSink a2 = C15976k.m60608a(c18546a);
                request.m60530d().writeTo(a2);
                a2.close();
                c17662f.m64319c().m59944a(c17662f.call(), c18546a.f57790a);
            } else if (!c17659c.m64314b()) {
                a.m60253e();
            }
        }
        b.finishRequest();
        if (c15965a == null) {
            c17662f.m64319c().m59960e(c17662f.call());
            c15965a = b.readResponseHeaders(false);
        }
        C15966s a3 = c15965a.m60543a(request).m60541a(a.m60251c().handshake()).m60537a(currentTimeMillis).m60547b(System.currentTimeMillis()).m60546a();
        int c = a3.m60555c();
        if (c == 100) {
            a3 = b.readResponseHeaders(false).m60543a(request).m60541a(a.m60251c().handshake()).m60537a(currentTimeMillis).m60547b(System.currentTimeMillis()).m60546a();
            c = a3.m60555c();
        }
        c17662f.m64319c().m59954a(c17662f.call(), a3);
        if (this.f54901a == null || c != 101) {
            chain = a3.m60561i().m60545a(b.openResponseBody(a3)).m60546a();
        } else {
            chain = a3.m60561i().m60545a(C15908c.f49247c).m60546a();
        }
        if ("close".equalsIgnoreCase(chain.m60553a().m60525a("Connection")) || "close".equalsIgnoreCase(chain.m60551a("Connection"))) {
            a.m60253e();
        }
        if ((c != 204 && c != 205) || chain.m60560h().contentLength() <= 0) {
            return chain;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HTTP ");
        stringBuilder.append(c);
        stringBuilder.append(" had non-zero Content-Length: ");
        stringBuilder.append(chain.m60560h().contentLength());
        throw new ProtocolException(stringBuilder.toString());
    }
}
