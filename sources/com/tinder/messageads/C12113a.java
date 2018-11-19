package com.tinder.messageads;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15963q.C15962a;
import okhttp3.C15966s;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/messageads/GoogleDfpUserAgentInterceptor;", "Lokhttp3/Interceptor;", "versionName", "", "userAgentCache", "Lcom/tinder/messageads/UserAgentCache;", "(Ljava/lang/String;Lcom/tinder/messageads/UserAgentCache;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.a */
public final class C12113a implements Interceptor {
    /* renamed from: a */
    private final String f39290a;
    /* renamed from: b */
    private final UserAgentCache f39291b;

    public C12113a(@NotNull String str, @NotNull UserAgentCache userAgentCache) {
        C2668g.b(str, "versionName");
        C2668g.b(userAgentCache, "userAgentCache");
        this.f39290a = str;
        this.f39291b = userAgentCache;
    }

    @NotNull
    public C15966s intercept(@NotNull Chain chain) {
        C2668g.b(chain, "chain");
        C15962a e = chain.request().e();
        if (this.f39291b.exists()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.f39291b.get());
            stringBuilder.append(" TinderAndroid/");
            stringBuilder.append(this.f39290a);
            e.b("User-Agent", stringBuilder.toString());
        }
        chain = chain.proceed(e.d());
        C2668g.a(chain, "chain.proceed(newRequestBuilder.build())");
        return chain;
    }
}
