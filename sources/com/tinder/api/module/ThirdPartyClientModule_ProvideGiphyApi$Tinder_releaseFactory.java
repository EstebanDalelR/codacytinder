package com.tinder.api.module;

import com.squareup.moshi.C5987p;
import com.tinder.api.giphy.GiphyApi;
import com.tinder.common.provider.C2643c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;

public final class ThirdPartyClientModule_ProvideGiphyApi$Tinder_releaseFactory implements Factory<GiphyApi> {
    private final Provider<C2643c> defaultLocaleProvider;
    private final ThirdPartyClientModule module;
    private final Provider<C5987p> moshiProvider;
    private final Provider<C17692o> okHttpClientProvider;

    public ThirdPartyClientModule_ProvideGiphyApi$Tinder_releaseFactory(ThirdPartyClientModule thirdPartyClientModule, Provider<C17692o> provider, Provider<C5987p> provider2, Provider<C2643c> provider3) {
        this.module = thirdPartyClientModule;
        this.okHttpClientProvider = provider;
        this.moshiProvider = provider2;
        this.defaultLocaleProvider = provider3;
    }

    public GiphyApi get() {
        return provideInstance(this.module, this.okHttpClientProvider, this.moshiProvider, this.defaultLocaleProvider);
    }

    public static GiphyApi provideInstance(ThirdPartyClientModule thirdPartyClientModule, Provider<C17692o> provider, Provider<C5987p> provider2, Provider<C2643c> provider3) {
        return proxyProvideGiphyApi$Tinder_release(thirdPartyClientModule, (C17692o) provider.get(), (C5987p) provider2.get(), (C2643c) provider3.get());
    }

    public static ThirdPartyClientModule_ProvideGiphyApi$Tinder_releaseFactory create(ThirdPartyClientModule thirdPartyClientModule, Provider<C17692o> provider, Provider<C5987p> provider2, Provider<C2643c> provider3) {
        return new ThirdPartyClientModule_ProvideGiphyApi$Tinder_releaseFactory(thirdPartyClientModule, provider, provider2, provider3);
    }

    public static GiphyApi proxyProvideGiphyApi$Tinder_release(ThirdPartyClientModule thirdPartyClientModule, C17692o c17692o, C5987p c5987p, C2643c c2643c) {
        return (GiphyApi) C15521i.a(thirdPartyClientModule.provideGiphyApi$Tinder_release(c17692o, c5987p, c2643c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
