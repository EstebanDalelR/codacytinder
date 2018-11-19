package com.tinder.api.module;

import com.squareup.moshi.C5987p;
import com.tinder.api.giphy.GiphyApi;
import com.tinder.api.giphy.GiphyApi.Rating;
import com.tinder.common.provider.C2643c;
import com.tinder.module.Published;
import com.tinder.spotify.api.AdjustClient;
import com.tinder.spotify.api.SpotifyLogMauApiClient;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C17692o;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001f\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u000bJ'\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0012J\u001f\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/module/ThirdPartyClientModule;", "", "()V", "decorateWithGsonAndRxJava", "Lretrofit2/Retrofit$Builder;", "builder", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideAdjustClient", "Lcom/tinder/spotify/api/AdjustClient;", "retrofitBuilder", "provideAdjustClient$Tinder_release", "provideGiphyApi", "Lcom/tinder/api/giphy/GiphyApi;", "moshi", "Lcom/squareup/moshi/Moshi;", "defaultLocaleProvider", "Lcom/tinder/common/provider/DefaultLocaleProvider;", "provideGiphyApi$Tinder_release", "provideSpotifyLogMauApiClient", "Lcom/tinder/spotify/api/SpotifyLogMauApiClient;", "provideSpotifyLogMauApiClient$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Published
@Module(includes = {RetrofitModule.class})
public final class ThirdPartyClientModule {
    @Singleton
    @NotNull
    @Provides
    public final GiphyApi provideGiphyApi$Tinder_release(@NotNull @OkHttpQualifiers$Public C17692o c17692o, @NotNull C5987p c5987p, @NotNull C2643c c2643c) {
        C2668g.b(c17692o, "okHttpClient");
        C2668g.b(c5987p, "moshi");
        C2668g.b(c2643c, "defaultLocaleProvider");
        Builder addCallAdapterFactory = new Builder().client(c17692o).baseUrl("https://api.giphy.com/").addCallAdapterFactory(RxJava2CallAdapterFactory.create());
        C2668g.a(addCallAdapterFactory, "retrofitBuilder");
        return new GiphyApi("fBEDuhnVCiP16", Rating.PG_13, new ThirdPartyClientModule$provideGiphyApi$1(c2643c), c5987p, addCallAdapterFactory);
    }

    @Singleton
    @NotNull
    @Provides
    public final AdjustClient provideAdjustClient$Tinder_release(@NotNull @OkHttpQualifiers$Public C17692o c17692o, @NotNull Builder builder) {
        C2668g.b(c17692o, "okHttpClient");
        C2668g.b(builder, "retrofitBuilder");
        c17692o = decorateWithGsonAndRxJava(builder, c17692o).baseUrl("https://app.adjust.com").build().create(AdjustClient.class);
        C2668g.a(c17692o, "decorateWithGsonAndRxJav…AdjustClient::class.java)");
        return (AdjustClient) c17692o;
    }

    @Singleton
    @NotNull
    @Provides
    public final SpotifyLogMauApiClient provideSpotifyLogMauApiClient$Tinder_release(@NotNull @OkHttpQualifiers$Public C17692o c17692o, @NotNull Builder builder) {
        C2668g.b(c17692o, "okHttpClient");
        C2668g.b(builder, "retrofitBuilder");
        c17692o = decorateWithGsonAndRxJava(builder, c17692o).baseUrl("https://log2.spotify.com").build().create(SpotifyLogMauApiClient.class);
        C2668g.a(c17692o, "decorateWithGsonAndRxJav…MauApiClient::class.java)");
        return (SpotifyLogMauApiClient) c17692o;
    }

    private final Builder decorateWithGsonAndRxJava(Builder builder, C17692o c17692o) {
        builder = builder.client(c17692o).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create());
        C2668g.a(builder, "builder\n            .cli…onverterFactory.create())");
        return builder;
    }
}
