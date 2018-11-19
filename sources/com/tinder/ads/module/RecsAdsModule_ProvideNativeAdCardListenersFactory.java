package com.tinder.ads.module;

import com.tinder.ads.NativeAdCardLikeListener;
import com.tinder.recsads.C16458f;
import com.tinder.recsads.C16459h;
import com.tinder.recsads.NativeCardListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

public final class RecsAdsModule_ProvideNativeAdCardListenersFactory implements Factory<Set<NativeCardListener>> {
    private final Provider<NativeAdCardLikeListener> cardAnalyticsListenerProvider;
    private final Provider<C16458f> cardLikeListenerProvider;
    private final Provider<C16459h> trackImpressionListenerProvider;

    public RecsAdsModule_ProvideNativeAdCardListenersFactory(Provider<NativeAdCardLikeListener> provider, Provider<C16458f> provider2, Provider<C16459h> provider3) {
        this.cardAnalyticsListenerProvider = provider;
        this.cardLikeListenerProvider = provider2;
        this.trackImpressionListenerProvider = provider3;
    }

    public Set<NativeCardListener> get() {
        return provideInstance(this.cardAnalyticsListenerProvider, this.cardLikeListenerProvider, this.trackImpressionListenerProvider);
    }

    public static Set<NativeCardListener> provideInstance(Provider<NativeAdCardLikeListener> provider, Provider<C16458f> provider2, Provider<C16459h> provider3) {
        return proxyProvideNativeAdCardListeners((NativeAdCardLikeListener) provider.get(), (C16458f) provider2.get(), (C16459h) provider3.get());
    }

    public static RecsAdsModule_ProvideNativeAdCardListenersFactory create(Provider<NativeAdCardLikeListener> provider, Provider<C16458f> provider2, Provider<C16459h> provider3) {
        return new RecsAdsModule_ProvideNativeAdCardListenersFactory(provider, provider2, provider3);
    }

    public static Set<NativeCardListener> proxyProvideNativeAdCardListeners(NativeAdCardLikeListener nativeAdCardLikeListener, C16458f c16458f, C16459h c16459h) {
        return (Set) C15521i.a(RecsAdsModule.provideNativeAdCardListeners(nativeAdCardLikeListener, c16458f, c16459h), "Cannot return null from a non-@Nullable @Provides method");
    }
}
