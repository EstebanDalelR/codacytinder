package com.tinder.api.retrofit;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15963q.C15962a;
import okhttp3.C15966s;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/api/retrofit/TinderAuthHeaderInterceptor;", "Lokhttp3/Interceptor;", "authTokenProvider", "Lcom/tinder/api/retrofit/AuthTokenProvider;", "(Lcom/tinder/api/retrofit/AuthTokenProvider;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "api_release"}, k = 1, mv = {1, 1, 10})
public final class TinderAuthHeaderInterceptor implements Interceptor {
    private final AuthTokenProvider authTokenProvider;

    @Inject
    public TinderAuthHeaderInterceptor(@NotNull AuthTokenProvider authTokenProvider) {
        C2668g.b(authTokenProvider, "authTokenProvider");
        this.authTokenProvider = authTokenProvider;
    }

    @NotNull
    public C15966s intercept(@NotNull Chain chain) {
        C2668g.b(chain, "chain");
        C15962a e = chain.request().e();
        String authToken = this.authTokenProvider.getAuthToken();
        if (authToken != null) {
            e.a("X-Auth-Token", authToken);
        }
        chain = chain.proceed(e.d());
        C2668g.a(chain, "chain.proceed(requestBuilder.build())");
        return chain;
    }
}
