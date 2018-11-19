package com.tinder.smsauth.data.p412a;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5987p.C5986a;
import com.squareup.moshi.C7190m;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C17692o;
import okhttp3.C17692o.C15961a;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u0010J \u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00140\u0005H\u0001¢\u0006\u0002\b\u0015J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u001cJ\r\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/smsauth/data/network/NetworkModule;", "", "baseUrl", "", "appInterceptors", "", "Lokhttp3/Interceptor;", "(Ljava/lang/String;Ljava/util/Set;)V", "provideCommonHeaderIntercetpor", "provideCommonHeaderIntercetpor$data", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideMoshi$data", "provideMoshiConverter", "Lretrofit2/converter/moshi/MoshiConverterFactory;", "moshi", "provideMoshiConverter$data", "provideOkHttp", "Lokhttp3/OkHttpClient;", "interceptors", "Lkotlin/jvm/JvmSuppressWildcards;", "provideOkHttp$data", "provideRetrofit", "Lretrofit2/Retrofit;", "httpClient", "rxJavaCallAdapterFactory", "Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;", "moshiConverterFactory", "provideRetrofit$data", "provideRxJavaCallAdapter", "provideRxJavaCallAdapter$data", "data"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.smsauth.data.a.b */
public final class C14966b {
    /* renamed from: a */
    private final String f46729a;
    /* renamed from: b */
    private final Set<Interceptor> f46730b;

    public C14966b(@NotNull String str, @NotNull Set<? extends Interceptor> set) {
        C2668g.b(str, "baseUrl");
        C2668g.b(set, "appInterceptors");
        this.f46729a = str;
        this.f46730b = set;
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C17692o m56547a(@NotNull Set<Interceptor> set) {
        C2668g.b(set, "interceptors");
        C15961a c15961a = new C15961a();
        c15961a.m60490a().addAll(set);
        c15961a.m60490a().addAll(this.f46730b);
        set = c15961a.m60505b();
        C2668g.a(set, "builder.build()");
        return set;
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final Retrofit m56548a(@NotNull C17692o c17692o, @NotNull RxJava2CallAdapterFactory rxJava2CallAdapterFactory, @NotNull MoshiConverterFactory moshiConverterFactory) {
        C2668g.b(c17692o, "httpClient");
        C2668g.b(rxJava2CallAdapterFactory, "rxJavaCallAdapterFactory");
        C2668g.b(moshiConverterFactory, "moshiConverterFactory");
        c17692o = new Builder().client(c17692o).baseUrl(this.f46729a).addCallAdapterFactory(rxJava2CallAdapterFactory).addConverterFactory(moshiConverterFactory).build();
        C2668g.a(c17692o, "Retrofit.Builder()\n     …ory)\n            .build()");
        return c17692o;
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C5987p m56546a() {
        C5987p a = new C5986a().a(new C7190m()).a();
        C2668g.a(a, "Moshi.Builder()\n        …y())\n            .build()");
        return a;
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final RxJava2CallAdapterFactory m56550b() {
        RxJava2CallAdapterFactory create = RxJava2CallAdapterFactory.create();
        C2668g.a(create, "RxJava2CallAdapterFactory.create()");
        return create;
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final MoshiConverterFactory m56549a(@NotNull C5987p c5987p) {
        C2668g.b(c5987p, "moshi");
        c5987p = MoshiConverterFactory.create(c5987p);
        C2668g.a(c5987p, "MoshiConverterFactory.create(moshi)");
        return c5987p;
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: c */
    public final Interceptor m56551c() {
        return new C16717a();
    }
}
