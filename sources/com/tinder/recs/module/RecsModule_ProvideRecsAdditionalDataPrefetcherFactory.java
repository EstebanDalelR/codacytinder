package com.tinder.recs.module;

import android.content.Context;
import com.tinder.domain.recs.RecsAdditionalDataPrefetcher;
import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.card.CardSizeProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideRecsAdditionalDataPrefetcherFactory implements Factory<RecsAdditionalDataPrefetcher> {
    private final Provider<Context> appContextProvider;
    private final Provider<CardSizeProvider> cardSizeProvider;
    private final RecsModule module;
    private final Provider<RecsPhotoUrlFactory> recsPhotoUrlFactoryProvider;

    public RecsModule_ProvideRecsAdditionalDataPrefetcherFactory(RecsModule recsModule, Provider<Context> provider, Provider<RecsPhotoUrlFactory> provider2, Provider<CardSizeProvider> provider3) {
        this.module = recsModule;
        this.appContextProvider = provider;
        this.recsPhotoUrlFactoryProvider = provider2;
        this.cardSizeProvider = provider3;
    }

    public RecsAdditionalDataPrefetcher get() {
        return provideInstance(this.module, this.appContextProvider, this.recsPhotoUrlFactoryProvider, this.cardSizeProvider);
    }

    public static RecsAdditionalDataPrefetcher provideInstance(RecsModule recsModule, Provider<Context> provider, Provider<RecsPhotoUrlFactory> provider2, Provider<CardSizeProvider> provider3) {
        return proxyProvideRecsAdditionalDataPrefetcher(recsModule, (Context) provider.get(), (RecsPhotoUrlFactory) provider2.get(), (CardSizeProvider) provider3.get());
    }

    public static RecsModule_ProvideRecsAdditionalDataPrefetcherFactory create(RecsModule recsModule, Provider<Context> provider, Provider<RecsPhotoUrlFactory> provider2, Provider<CardSizeProvider> provider3) {
        return new RecsModule_ProvideRecsAdditionalDataPrefetcherFactory(recsModule, provider, provider2, provider3);
    }

    public static RecsAdditionalDataPrefetcher proxyProvideRecsAdditionalDataPrefetcher(RecsModule recsModule, Context context, RecsPhotoUrlFactory recsPhotoUrlFactory, CardSizeProvider cardSizeProvider) {
        return (RecsAdditionalDataPrefetcher) C15521i.m58001a(recsModule.provideRecsAdditionalDataPrefetcher(context, recsPhotoUrlFactory, cardSizeProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
