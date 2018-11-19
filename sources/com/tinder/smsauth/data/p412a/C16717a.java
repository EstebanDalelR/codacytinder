package com.tinder.smsauth.data.p412a;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15957l.C15956a;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/smsauth/data/network/CommonHeaderInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "data"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.data.a.a */
public final class C16717a implements Interceptor {
    @NotNull
    public C15966s intercept(@NotNull Chain chain) {
        C2668g.b(chain, "chain");
        C15963q request = chain.request();
        C15956a b = request.m60529c().m60478b();
        b.m60465a("platform", "android");
        chain = chain.proceed(request.m60531e().m60515a(b.m60466a()).m60524d());
        C2668g.a(chain, "chain.proceed(\n         …       .build()\n        )");
        return chain;
    }
}
