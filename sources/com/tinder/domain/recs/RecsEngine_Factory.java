package com.tinder.domain.recs;

import com.tinder.data.recs.C10992i;
import com.tinder.data.recs.C8788l;
import com.tinder.domain.recs.engine.RecsLoader;
import com.tinder.domain.recs.engine.SwipeProcessor;
import com.tinder.domain.recs.model.Rec$Source;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsEngine_Factory implements Factory<RecsEngine> {
    private final Provider<GlobalRecsConsumptionListenerRegistry> globalRecsConsumptionListenerRegistryProvider;
    private final Provider<Rec$Source> recSourceProvider;
    private final Provider<C10992i> recsDataStoreProvider;
    private final Provider<RecsLoader> recsLoaderProvider;
    private final Provider<RecsRepository> recsRepositoryProvider;
    private final Provider<C8788l> rewindStackProvider;
    private final Provider<SwipeProcessor> swipeProcessorProvider;

    public RecsEngine_Factory(Provider<Rec$Source> provider, Provider<RecsRepository> provider2, Provider<C10992i> provider3, Provider<RecsLoader> provider4, Provider<SwipeProcessor> provider5, Provider<C8788l> provider6, Provider<GlobalRecsConsumptionListenerRegistry> provider7) {
        this.recSourceProvider = provider;
        this.recsRepositoryProvider = provider2;
        this.recsDataStoreProvider = provider3;
        this.recsLoaderProvider = provider4;
        this.swipeProcessorProvider = provider5;
        this.rewindStackProvider = provider6;
        this.globalRecsConsumptionListenerRegistryProvider = provider7;
    }

    public RecsEngine get() {
        return new RecsEngine((Rec$Source) this.recSourceProvider.get(), (RecsRepository) this.recsRepositoryProvider.get(), (C10992i) this.recsDataStoreProvider.get(), (RecsLoader) this.recsLoaderProvider.get(), (SwipeProcessor) this.swipeProcessorProvider.get(), (C8788l) this.rewindStackProvider.get(), (GlobalRecsConsumptionListenerRegistry) this.globalRecsConsumptionListenerRegistryProvider.get());
    }

    public static RecsEngine_Factory create(Provider<Rec$Source> provider, Provider<RecsRepository> provider2, Provider<C10992i> provider3, Provider<RecsLoader> provider4, Provider<SwipeProcessor> provider5, Provider<C8788l> provider6, Provider<GlobalRecsConsumptionListenerRegistry> provider7) {
        return new RecsEngine_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }
}
