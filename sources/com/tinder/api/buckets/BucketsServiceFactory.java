package com.tinder.api.buckets;

import com.squareup.moshi.C5987p.C5986a;
import com.squareup.moshi.C7190m;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import okhttp3.C17692o;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/api/buckets/BucketsServiceFactory;", "", "()V", "create", "Lcom/tinder/api/buckets/BucketsService;", "baseUrl", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "api_release"}, k = 1, mv = {1, 1, 10})
public final class BucketsServiceFactory {
    public static final BucketsServiceFactory INSTANCE = new BucketsServiceFactory();

    private BucketsServiceFactory() {
    }

    @JvmStatic
    @NotNull
    public static final BucketsService create(@NotNull String str, @NotNull C17692o c17692o) {
        C2668g.b(str, "baseUrl");
        C2668g.b(c17692o, "okHttpClient");
        str = new Builder().client(c17692o).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(MoshiConverterFactory.create(new C5986a().m25663a(new C7190m()).m25664a())).baseUrl(str).build().create(BucketsService.class);
        C2668g.a(str, "retrofit.create(BucketsService::class.java)");
        return (BucketsService) str;
    }
}
