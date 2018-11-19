package okhttp3.internal.http;

import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.util.List;
import okhttp3.C15897h;
import okhttp3.C15958m;
import okhttp3.C15963q;
import okhttp3.C15963q.C15962a;
import okhttp3.C15964r;
import okhttp3.C15966s;
import okhttp3.C15966s.C15965a;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.C15908c;
import okhttp3.internal.C15922d;
import okio.C15976k;
import okio.C17707i;
import okio.Source;

/* renamed from: okhttp3.internal.http.a */
public final class C17660a implements Interceptor {
    /* renamed from: a */
    private final CookieJar f54900a;

    public C17660a(CookieJar cookieJar) {
        this.f54900a = cookieJar;
    }

    public C15966s intercept(Chain chain) throws IOException {
        C15963q request = chain.request();
        C15962a e = request.m60531e();
        C15964r d = request.m60530d();
        if (d != null) {
            C15958m contentType = d.contentType();
            if (contentType != null) {
                e.m60511a(ManagerWebServices.PARAM_CONTENT_TYPE, contentType.toString());
            }
            long contentLength = d.contentLength();
            if (contentLength != -1) {
                e.m60511a("Content-Length", Long.toString(contentLength));
                e.m60518b("Transfer-Encoding");
            } else {
                e.m60511a("Transfer-Encoding", "chunked");
                e.m60518b("Content-Length");
            }
        }
        boolean z = false;
        if (request.m60525a("Host") == null) {
            e.m60511a("Host", C15908c.m60158a(request.m60526a(), false));
        }
        if (request.m60525a("Connection") == null) {
            e.m60511a("Connection", "Keep-Alive");
        }
        if (request.m60525a("Accept-Encoding") == null && request.m60525a("Range") == null) {
            z = true;
            e.m60511a("Accept-Encoding", "gzip");
        }
        List loadForRequest = this.f54900a.loadForRequest(request.m60526a());
        if (!loadForRequest.isEmpty()) {
            e.m60511a("Cookie", m64315a(loadForRequest));
        }
        if (request.m60525a("User-Agent") == null) {
            e.m60511a("User-Agent", C15922d.m60256a());
        }
        chain = chain.proceed(e.m60524d());
        C15925d.m60266a(this.f54900a, request.m60526a(), chain.m60559g());
        C15965a a = chain.m60561i().m60543a(request);
        if (z && "gzip".equalsIgnoreCase(chain.m60551a("Content-Encoding")) && C15925d.m60273d(chain)) {
            Source c17707i = new C17707i(chain.m60560h().source());
            a.m60542a(chain.m60559g().m60478b().m60467b("Content-Encoding").m60467b("Content-Length").m60466a());
            a.m60545a(new C17663g(chain.m60551a(ManagerWebServices.PARAM_CONTENT_TYPE), -1, C15976k.m60609a(c17707i)));
        }
        return a.m60546a();
    }

    /* renamed from: a */
    private String m64315a(List<C15897h> list) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append("; ");
            }
            C15897h c15897h = (C15897h) list.get(i);
            stringBuilder.append(c15897h.m60096a());
            stringBuilder.append('=');
            stringBuilder.append(c15897h.m60098b());
        }
        return stringBuilder.toString();
    }
}
