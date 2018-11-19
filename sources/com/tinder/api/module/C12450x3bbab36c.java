package com.tinder.api.module;

import com.tinder.spotify.api.SpotifyLogMauApiClient;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;
import retrofit2.Retrofit.Builder;

/* renamed from: com.tinder.api.module.ThirdPartyClientModule_ProvideSpotifyLogMauApiClient$Tinder_releaseFactory */
public final class C12450x3bbab36c implements Factory<SpotifyLogMauApiClient> {
    private final ThirdPartyClientModule module;
    private final Provider<C17692o> okHttpClientProvider;
    private final Provider<Builder> retrofitBuilderProvider;

    public C12450x3bbab36c(ThirdPartyClientModule thirdPartyClientModule, Provider<C17692o> provider, Provider<Builder> provider2) {
        this.module = thirdPartyClientModule;
        this.okHttpClientProvider = provider;
        this.retrofitBuilderProvider = provider2;
    }

    public SpotifyLogMauApiClient get() {
        return C12450x3bbab36c.provideInstance(this.module, this.okHttpClientProvider, this.retrofitBuilderProvider);
    }

    public static SpotifyLogMauApiClient provideInstance(ThirdPartyClientModule thirdPartyClientModule, Provider<C17692o> provider, Provider<Builder> provider2) {
        return C12450x3bbab36c.proxyProvideSpotifyLogMauApiClient$Tinder_release(thirdPartyClientModule, (C17692o) provider.get(), (Builder) provider2.get());
    }

    public static C12450x3bbab36c create(ThirdPartyClientModule thirdPartyClientModule, Provider<C17692o> provider, Provider<Builder> provider2) {
        return new C12450x3bbab36c(thirdPartyClientModule, provider, provider2);
    }

    public static SpotifyLogMauApiClient proxyProvideSpotifyLogMauApiClient$Tinder_release(ThirdPartyClientModule thirdPartyClientModule, C17692o c17692o, Builder builder) {
        return (SpotifyLogMauApiClient) C15521i.a(thirdPartyClientModule.provideSpotifyLogMauApiClient$Tinder_release(c17692o, builder), "Cannot return null from a non-@Nullable @Provides method");
    }
}
