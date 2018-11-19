package com.tinder.recs.module;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.TinderApi;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.match.C10799v;
import com.tinder.data.recs.C10990e;
import com.tinder.domain.match.provider.NewMatchNotifier;
import com.tinder.domain.profile.usecase.SaveSuperlikeStatus;
import com.tinder.domain.recs.RatingsApiClient;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.recs.analytics.AddNewMatchEvent;
import com.tinder.recs.data.RatingRequestFactory;
import com.tinder.recs.data.RatingResultAdapter;
import com.tinder.superlike.p418a.C15066a;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideRatingsApiClientFactory implements Factory<RatingsApiClient> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<AddNewMatchEvent> addNewMatchEventProvider;
    private final Provider<C2630h> fireworksProvider;
    private final Provider<C10990e> insertBrandedMatchProvider;
    private final Provider<LikeStatusProvider> likeStatusProvider;
    private final Provider<C10799v> matchDomainApiAdapterProvider;
    private final RecsModule module;
    private final Provider<NewMatchNotifier> newMatchNotifierProvider;
    private final Provider<RatingRequestFactory> ratingRequestFactoryProvider;
    private final Provider<RatingResultAdapter> ratingResultAdapterProvider;
    private final Provider<RecsEngineRegistry> recsEngineRegistryProvider;
    private final Provider<SaveSuperlikeStatus> saveSuperlikeStatusProvider;
    private final Provider<C15066a> superlikeStatusAdapterProvider;
    private final Provider<C15082f> superlikeStatusProvider;
    private final Provider<TinderApi> tinderApiProvider;

    public RecsModule_ProvideRatingsApiClientFactory(RecsModule recsModule, Provider<TinderApi> provider, Provider<RatingRequestFactory> provider2, Provider<RatingResultAdapter> provider3, Provider<LikeStatusProvider> provider4, Provider<C15066a> provider5, Provider<C15082f> provider6, Provider<C10799v> provider7, Provider<NewMatchNotifier> provider8, Provider<RecsEngineRegistry> provider9, Provider<C2630h> provider10, Provider<AbTestUtility> provider11, Provider<AddNewMatchEvent> provider12, Provider<C10990e> provider13, Provider<SaveSuperlikeStatus> provider14) {
        this.module = recsModule;
        this.tinderApiProvider = provider;
        this.ratingRequestFactoryProvider = provider2;
        this.ratingResultAdapterProvider = provider3;
        this.likeStatusProvider = provider4;
        this.superlikeStatusAdapterProvider = provider5;
        this.superlikeStatusProvider = provider6;
        this.matchDomainApiAdapterProvider = provider7;
        this.newMatchNotifierProvider = provider8;
        this.recsEngineRegistryProvider = provider9;
        this.fireworksProvider = provider10;
        this.abTestUtilityProvider = provider11;
        this.addNewMatchEventProvider = provider12;
        this.insertBrandedMatchProvider = provider13;
        this.saveSuperlikeStatusProvider = provider14;
    }

    public RatingsApiClient get() {
        return provideInstance(this.module, this.tinderApiProvider, this.ratingRequestFactoryProvider, this.ratingResultAdapterProvider, this.likeStatusProvider, this.superlikeStatusAdapterProvider, this.superlikeStatusProvider, this.matchDomainApiAdapterProvider, this.newMatchNotifierProvider, this.recsEngineRegistryProvider, this.fireworksProvider, this.abTestUtilityProvider, this.addNewMatchEventProvider, this.insertBrandedMatchProvider, this.saveSuperlikeStatusProvider);
    }

    public static RatingsApiClient provideInstance(RecsModule recsModule, Provider<TinderApi> provider, Provider<RatingRequestFactory> provider2, Provider<RatingResultAdapter> provider3, Provider<LikeStatusProvider> provider4, Provider<C15066a> provider5, Provider<C15082f> provider6, Provider<C10799v> provider7, Provider<NewMatchNotifier> provider8, Provider<RecsEngineRegistry> provider9, Provider<C2630h> provider10, Provider<AbTestUtility> provider11, Provider<AddNewMatchEvent> provider12, Provider<C10990e> provider13, Provider<SaveSuperlikeStatus> provider14) {
        return proxyProvideRatingsApiClient(recsModule, (TinderApi) provider.get(), (RatingRequestFactory) provider2.get(), (RatingResultAdapter) provider3.get(), (LikeStatusProvider) provider4.get(), (C15066a) provider5.get(), (C15082f) provider6.get(), (C10799v) provider7.get(), (NewMatchNotifier) provider8.get(), (RecsEngineRegistry) provider9.get(), (C2630h) provider10.get(), (AbTestUtility) provider11.get(), (AddNewMatchEvent) provider12.get(), (C10990e) provider13.get(), (SaveSuperlikeStatus) provider14.get());
    }

    public static RecsModule_ProvideRatingsApiClientFactory create(RecsModule recsModule, Provider<TinderApi> provider, Provider<RatingRequestFactory> provider2, Provider<RatingResultAdapter> provider3, Provider<LikeStatusProvider> provider4, Provider<C15066a> provider5, Provider<C15082f> provider6, Provider<C10799v> provider7, Provider<NewMatchNotifier> provider8, Provider<RecsEngineRegistry> provider9, Provider<C2630h> provider10, Provider<AbTestUtility> provider11, Provider<AddNewMatchEvent> provider12, Provider<C10990e> provider13, Provider<SaveSuperlikeStatus> provider14) {
        return new RecsModule_ProvideRatingsApiClientFactory(recsModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static RatingsApiClient proxyProvideRatingsApiClient(RecsModule recsModule, TinderApi tinderApi, RatingRequestFactory ratingRequestFactory, RatingResultAdapter ratingResultAdapter, LikeStatusProvider likeStatusProvider, C15066a c15066a, C15082f c15082f, C10799v c10799v, NewMatchNotifier newMatchNotifier, RecsEngineRegistry recsEngineRegistry, C2630h c2630h, AbTestUtility abTestUtility, AddNewMatchEvent addNewMatchEvent, C10990e c10990e, SaveSuperlikeStatus saveSuperlikeStatus) {
        return (RatingsApiClient) C15521i.m58001a(recsModule.provideRatingsApiClient(tinderApi, ratingRequestFactory, ratingResultAdapter, likeStatusProvider, c15066a, c15082f, c10799v, newMatchNotifier, recsEngineRegistry, c2630h, abTestUtility, addNewMatchEvent, c10990e, saveSuperlikeStatus), "Cannot return null from a non-@Nullable @Provides method");
    }
}
