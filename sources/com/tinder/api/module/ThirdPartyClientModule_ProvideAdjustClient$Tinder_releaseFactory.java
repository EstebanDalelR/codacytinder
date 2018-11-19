package com.tinder.api.module;

import com.tinder.spotify.api.AdjustClient;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;
import retrofit2.Retrofit.Builder;

public final class ThirdPartyClientModule_ProvideAdjustClient$Tinder_releaseFactory implements Factory<AdjustClient> {
    private final ThirdPartyClientModule module;
    private final Provider<C17692o> okHttpClientProvider;
    private final Provider<Builder> retrofitBuilderProvider;

    public ThirdPartyClientModule_ProvideAdjustClient$Tinder_releaseFactory(ThirdPartyClientModule thirdPartyClientModule, Provider<C17692o> provider, Provider<Builder> provider2) {
        this.module = thirdPartyClientModule;
        this.okHttpClientProvider = provider;
        this.retrofitBuilderProvider = provider2;
    }

    public AdjustClient get() {
        return provideInstance(this.module, this.okHttpClientProvider, this.retrofitBuilderProvider);
    }

    public static AdjustClient provideInstance(ThirdPartyClientModule thirdPartyClientModule, Provider<C17692o> provider, Provider<Builder> provider2) {
        return proxyProvideAdjustClient$Tinder_release(thirdPartyClientModule, (C17692o) provider.get(), (Builder) provider2.get());
    }

    public static ThirdPartyClientModule_ProvideAdjustClient$Tinder_releaseFactory create(ThirdPartyClientModule thirdPartyClientModule, Provider<C17692o> provider, Provider<Builder> provider2) {
        return new ThirdPartyClientModule_ProvideAdjustClient$Tinder_releaseFactory(thirdPartyClientModule, provider, provider2);
    }

    public static AdjustClient proxyProvideAdjustClient$Tinder_release(ThirdPartyClientModule thirdPartyClientModule, C17692o c17692o, Builder builder) {
        return (AdjustClient) C15521i.a(thirdPartyClientModule.provideAdjustClient$Tinder_release(c17692o, builder), "Cannot return null from a non-@Nullable @Provides method");
    }
}
