package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.C17321b;
import io.fabric.sdk.android.Logger;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.fabric.sdk.android.services.network.b */
public class C17345b implements HttpRequestFactory {
    /* renamed from: a */
    private final Logger f53068a;
    /* renamed from: b */
    private PinningInfoProvider f53069b;
    /* renamed from: c */
    private SSLSocketFactory f53070c;
    /* renamed from: d */
    private boolean f53071d;

    public C17345b() {
        this(new C17321b());
    }

    public C17345b(Logger logger) {
        this.f53068a = logger;
    }

    public PinningInfoProvider getPinningInfoProvider() {
        return this.f53069b;
    }

    public void setPinningInfoProvider(PinningInfoProvider pinningInfoProvider) {
        if (this.f53069b != pinningInfoProvider) {
            this.f53069b = pinningInfoProvider;
            m63403a();
        }
    }

    /* renamed from: a */
    private synchronized void m63403a() {
        this.f53071d = false;
        this.f53070c = null;
    }

    public HttpRequest buildHttpRequest(HttpMethod httpMethod, String str) {
        return buildHttpRequest(httpMethod, str, Collections.emptyMap());
    }

    public HttpRequest buildHttpRequest(HttpMethod httpMethod, String str, Map<String, String> map) {
        switch (httpMethod) {
            case GET:
                httpMethod = HttpRequest.m58750a((CharSequence) str, (Map) map, true);
                break;
            case POST:
                httpMethod = HttpRequest.m58755b((CharSequence) str, (Map) map, true);
                break;
            case PUT:
                httpMethod = HttpRequest.m58758d((CharSequence) str);
                break;
            case DELETE:
                httpMethod = HttpRequest.m58759e((CharSequence) str);
                break;
            default:
                throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (!(m63404a(str) == null || this.f53069b == null)) {
            str = m63405b();
            if (str != null) {
                ((HttpsURLConnection) httpMethod.m58777a()).setSSLSocketFactory(str);
            }
        }
        return httpMethod;
    }

    /* renamed from: a */
    private boolean m63404a(String str) {
        return (str == null || str.toLowerCase(Locale.US).startsWith("https") == null) ? null : true;
    }

    /* renamed from: b */
    private synchronized SSLSocketFactory m63405b() {
        if (this.f53070c == null && !this.f53071d) {
            this.f53070c = m63406c();
        }
        return this.f53070c;
    }

    /* renamed from: c */
    private synchronized SSLSocketFactory m63406c() {
        SSLSocketFactory a;
        this.f53071d = true;
        try {
            a = C15651c.m58805a(this.f53069b);
            this.f53068a.mo12791d("Fabric", "Custom SSL pinning enabled");
        } catch (Throwable e) {
            this.f53068a.mo12794e("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return a;
    }
}
