package com.tinder.api.timeout;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.C15966s.C15965a;
import okhttp3.C15968t;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/api/timeout/TimeoutInterceptor;", "Lokhttp3/Interceptor;", "matchingUrlPath", "", "(Ljava/lang/String;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "api_release"}, k = 1, mv = {1, 1, 10})
public abstract class TimeoutInterceptor implements Interceptor {
    private final String matchingUrlPath;

    public TimeoutInterceptor(@NotNull String str) {
        C2668g.b(str, "matchingUrlPath");
        this.matchingUrlPath = str;
    }

    @NotNull
    public C15966s intercept(@NotNull Chain chain) {
        C2668g.b(chain, "chain");
        C15963q request = chain.request();
        try {
            chain = chain.proceed(request);
            C2668g.a(chain, "chain.proceed(request)");
            return chain;
        } catch (Chain chain2) {
            String httpUrl = request.a().toString();
            C2668g.a(httpUrl, "request.url().toString()");
            if (C19303i.b(httpUrl, this.matchingUrlPath, false, 2, null)) {
                chain2 = new C15965a().a(504).a(Protocol.HTTP_1_1).a(request).a("Timeout").a(C15968t.create(null, "Timeout")).a();
                C2668g.a(chain2, "Response.Builder()\n     …                 .build()");
                return chain2;
            }
            throw ((Throwable) chain2);
        }
    }
}
