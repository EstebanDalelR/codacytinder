package com.tinder.base.p174d.p175a;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/base/network/interceptor/ImageProfilingNetworkInterceptor;", "Lokhttp3/Interceptor;", "performanceCache", "Lcom/tinder/base/network/interceptor/ImagePerformanceCache;", "hostUrlWhitelist", "", "", "(Lcom/tinder/base/network/interceptor/ImagePerformanceCache;Ljava/util/Set;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldRecordPerformanceFrom", "", "url", "base_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.base.d.a.e */
public final class C10361e implements Interceptor {
    /* renamed from: a */
    private final C8308d f33812a;
    /* renamed from: b */
    private final Set<String> f33813b;

    public C10361e(@NotNull C8308d c8308d, @NotNull Set<String> set) {
        C2668g.b(c8308d, "performanceCache");
        C2668g.b(set, "hostUrlWhitelist");
        this.f33812a = c8308d;
        this.f33813b = set;
    }

    @NotNull
    public C15966s intercept(@NotNull Chain chain) {
        String g;
        boolean a;
        long nanoTime;
        C2668g.b(chain, "chain");
        C15963q request = chain.request();
        Object obj = null;
        HttpUrl a2 = request != null ? request.a() : null;
        if (a2 != null) {
            g = a2.g();
            if (g != null) {
                a = m42180a(g);
                nanoTime = System.nanoTime();
                chain = chain.proceed(request);
                if (a) {
                    C2668g.a(chain, "response");
                    return chain;
                }
                long toMillis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                C8308d c8308d = this.f33812a;
                if (a2 != null) {
                    obj = a2.a();
                }
                c8308d.m35405a(String.valueOf(obj), toMillis, chain.c());
                C2668g.a(chain, "response");
                return chain;
            }
        }
        g = "";
        a = m42180a(g);
        nanoTime = System.nanoTime();
        chain = chain.proceed(request);
        if (a) {
            long toMillis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            C8308d c8308d2 = this.f33812a;
            if (a2 != null) {
                obj = a2.a();
            }
            c8308d2.m35405a(String.valueOf(obj), toMillis2, chain.c());
            C2668g.a(chain, "response");
            return chain;
        }
        C2668g.a(chain, "response");
        return chain;
    }

    /* renamed from: a */
    private final boolean m42180a(String str) {
        return this.f33813b.contains(str);
    }
}
