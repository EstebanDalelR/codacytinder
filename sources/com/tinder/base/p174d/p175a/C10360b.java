package com.tinder.base.p174d.p175a;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15966s;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/tinder/base/network/interceptor/ImageHostRewriteInterceptor;", "Lokhttp3/Interceptor;", "spec", "Lcom/tinder/base/network/interceptor/ImageHostRewriteInterceptor$UrlRewriteSpec;", "(Lcom/tinder/base/network/interceptor/ImageHostRewriteInterceptor$UrlRewriteSpec;)V", "getSpec", "()Lcom/tinder/base/network/interceptor/ImageHostRewriteInterceptor$UrlRewriteSpec;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "UrlRewriteSpec", "base_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.base.d.a.b */
public final class C10360b implements Interceptor {
    @NotNull
    /* renamed from: a */
    private final C8305a f33811a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tinder/base/network/interceptor/ImageHostRewriteInterceptor$UrlRewriteSpec;", "", "matchingHost", "", "rewriteHost", "rewriteScheme", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMatchingHost", "()Ljava/lang/String;", "getRewriteHost", "getRewriteScheme", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.base.d.a.b$a */
    public static final class C8305a {
        @NotNull
        /* renamed from: a */
        private final String f29580a;
        @NotNull
        /* renamed from: b */
        private final String f29581b;
        @NotNull
        /* renamed from: c */
        private final String f29582c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8305a) {
                    C8305a c8305a = (C8305a) obj;
                    if (C2668g.a(this.f29580a, c8305a.f29580a) && C2668g.a(this.f29581b, c8305a.f29581b) && C2668g.a(this.f29582c, c8305a.f29582c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f29580a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29581b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29582c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("UrlRewriteSpec(matchingHost=");
            stringBuilder.append(this.f29580a);
            stringBuilder.append(", rewriteHost=");
            stringBuilder.append(this.f29581b);
            stringBuilder.append(", rewriteScheme=");
            stringBuilder.append(this.f29582c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8305a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            C2668g.b(str, "matchingHost");
            C2668g.b(str2, "rewriteHost");
            C2668g.b(str3, "rewriteScheme");
            this.f29580a = str;
            this.f29581b = str2;
            this.f29582c = str3;
        }

        @NotNull
        /* renamed from: a */
        public final String m35398a() {
            return this.f29580a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35399b() {
            return this.f29581b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35400c() {
            return this.f29582c;
        }
    }

    public C10360b(@NotNull C8305a c8305a) {
        C2668g.b(c8305a, "spec");
        this.f33811a = c8305a;
    }

    @NotNull
    public C15966s intercept(@NotNull Chain chain) {
        C2668g.b(chain, "chain");
        HttpUrl a = chain.request().a();
        if ((C2668g.a(this.f33811a.m35398a(), a.g()) ^ 1) != 0) {
            chain = chain.proceed(chain.request());
            C2668g.a(chain, "chain.proceed(chain.request())");
            return chain;
        }
        chain = chain.proceed(chain.request().e().a(a.q().a(this.f33811a.m35400c()).d(this.f33811a.m35399b()).c()).d());
        C2668g.a(chain, "chain.proceed(rewrittenRequest)");
        return chain;
    }
}
