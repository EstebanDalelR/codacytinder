package com.tinder.domain.recs.engine;

import com.tinder.domain.recs.GlobalRecsConsumptionEventPublisher;
import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.RecsRepository;
import com.tinder.domain.recs.engine.SwipeProcessor.SwipeRulesProcessor;
import com.tinder.domain.recs.model.Rec$Source;
import dagger.internal.Factory;
import javax.inject.Provider;
import rx.C2671a;

public final class SwipeProcessor_Factory implements Factory<SwipeProcessor> {
    private final Provider<Config> configProvider;
    private final Provider<GlobalRecsConsumptionEventPublisher> globalRecsConsumptionEventPublisherProvider;
    private final Provider<C2671a> ioThreadSchedulerProvider;
    private final Provider<C2671a> mainThreadSchedulerProvider;
    private final Provider<Rec$Source> recSourceProvider;
    private final Provider<RecsRepository> recsRepositoryProvider;
    private final Provider<SwipeProcessingRulesResolver> rulesResolverProvider;
    private final Provider<SwipeRulesProcessor> swipeRulesProcessorProvider;

    public SwipeProcessor_Factory(Provider<RecsRepository> provider, Provider<SwipeProcessingRulesResolver> provider2, Provider<Rec$Source> provider3, Provider<Config> provider4, Provider<GlobalRecsConsumptionEventPublisher> provider5, Provider<SwipeRulesProcessor> provider6, Provider<C2671a> provider7, Provider<C2671a> provider8) {
        this.recsRepositoryProvider = provider;
        this.rulesResolverProvider = provider2;
        this.recSourceProvider = provider3;
        this.configProvider = provider4;
        this.globalRecsConsumptionEventPublisherProvider = provider5;
        this.swipeRulesProcessorProvider = provider6;
        this.ioThreadSchedulerProvider = provider7;
        this.mainThreadSchedulerProvider = provider8;
    }

    public SwipeProcessor get() {
        return new SwipeProcessor((RecsRepository) this.recsRepositoryProvider.get(), (SwipeProcessingRulesResolver) this.rulesResolverProvider.get(), (Rec$Source) this.recSourceProvider.get(), (Config) this.configProvider.get(), (GlobalRecsConsumptionEventPublisher) this.globalRecsConsumptionEventPublisherProvider.get(), (SwipeRulesProcessor) this.swipeRulesProcessorProvider.get(), (C2671a) this.ioThreadSchedulerProvider.get(), (C2671a) this.mainThreadSchedulerProvider.get());
    }

    public static SwipeProcessor_Factory create(Provider<RecsRepository> provider, Provider<SwipeProcessingRulesResolver> provider2, Provider<Rec$Source> provider3, Provider<Config> provider4, Provider<GlobalRecsConsumptionEventPublisher> provider5, Provider<SwipeRulesProcessor> provider6, Provider<C2671a> provider7, Provider<C2671a> provider8) {
        return new SwipeProcessor_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }
}
