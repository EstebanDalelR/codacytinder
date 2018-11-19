package com.tinder.api.keepalive;

import com.tinder.scarlet.websocket.okhttp.request.RequestFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import okhttp3.C15963q;
import okhttp3.C15963q.C15962a;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/api/keepalive/KeepAliveRequestFactory;", "Lcom/tinder/scarlet/websocket/okhttp/request/RequestFactory;", "baseUrl", "", "(Ljava/lang/String;)V", "cachedRequest", "Lokhttp3/Request;", "createKeepAliveUrl", "Lokhttp3/HttpUrl;", "baseHttpUrl", "createKeepAliveUrlHost", "baseUrlHost", "createKeepAliveUrlSubDomain", "baseUrlSubDomain", "createRequest", "isProduction", "", "Companion", "api_release"}, k = 1, mv = {1, 1, 10})
public final class KeepAliveRequestFactory implements RequestFactory {
    public static final Companion Companion = new Companion();
    private static final String PRODUCTION_KEEP_ALIVE_SUB_DOMAIN = "keepalive";
    private static final String PRODUCTION_SUB_DOMAIN = "api";
    private static final String SUB_DOMAIN_DELIMITER = ".";
    private final String baseUrl;
    private final C15963q cachedRequest;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/api/keepalive/KeepAliveRequestFactory$Companion;", "", "()V", "PRODUCTION_KEEP_ALIVE_SUB_DOMAIN", "", "PRODUCTION_SUB_DOMAIN", "SUB_DOMAIN_DELIMITER", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    public KeepAliveRequestFactory(@NotNull String str) {
        C2668g.b(str, "baseUrl");
        this.baseUrl = str;
        str = HttpUrl.f(this.baseUrl);
        if (str == null) {
            str = new StringBuilder();
            str.append("Failed to parse the base url: ");
            str.append(this.baseUrl);
            throw new IllegalArgumentException(str.toString().toString());
        }
        str = new C15962a().a(createKeepAliveUrl(str)).d();
        C2668g.a(str, "Request.Builder()\n      …rl))\n            .build()");
        this.cachedRequest = str;
    }

    @NotNull
    public C15963q createRequest() {
        return this.cachedRequest;
    }

    private final HttpUrl createKeepAliveUrl(HttpUrl httpUrl) {
        Builder q = httpUrl.q();
        httpUrl = httpUrl.g();
        C2668g.a(httpUrl, "baseHttpUrl.host()");
        httpUrl = q.d(createKeepAliveUrlHost(httpUrl)).e("ws").c();
        C2668g.a(httpUrl, "baseHttpUrl.newBuilder()…\n                .build()");
        return httpUrl;
    }

    private final String createKeepAliveUrlHost(String str) {
        return C19303i.a(str, SUB_DOMAIN_DELIMITER, createKeepAliveUrlSubDomain(C19303i.a(str, SUB_DOMAIN_DELIMITER, null, 2, null)), null, 4, null);
    }

    private final String createKeepAliveUrlSubDomain(String str) {
        return isProduction(str) ? PRODUCTION_KEEP_ALIVE_SUB_DOMAIN : str;
    }

    private final boolean isProduction(@NotNull String str) {
        return C2668g.a(str, PRODUCTION_SUB_DOMAIN);
    }
}
