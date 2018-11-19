package com.tinder.base.p174d.p175a;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15966s;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, d2 = {"Lcom/tinder/base/network/interceptor/ImageCacheInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "base_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.base.d.a.a */
public final class C10359a implements Interceptor {
    @NotNull
    public C15966s intercept(@NotNull Chain chain) throws IOException {
        C2668g.b(chain, "chain");
        if ((C2668g.a(chain.request().a().g(), "images.gotinder.com") ^ 1) != 0) {
            chain = chain.proceed(chain.request());
            C2668g.a(chain, "chain.proceed(chain.request())");
            return chain;
        }
        chain = chain.proceed(chain.request());
        if (chain.g().a("Cache-Control") == null) {
            chain = chain.i().a("Cache-Control", "max-age=25200").a();
            C2668g.a(chain, "original.newBuilder().he…CONTROL, MAX_AGE).build()");
        } else {
            C2668g.a(chain, "original");
        }
        return chain;
    }
}
