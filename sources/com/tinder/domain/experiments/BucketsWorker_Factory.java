package com.tinder.domain.experiments;

import com.tinder.common.logger.Logger;
import com.tinder.common.reactivex.schedulers.Schedulers;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class BucketsWorker_Factory implements Factory<BucketsWorker> {
    private final Provider<FetchBuckets> fetchBucketsProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<Schedulers> schedulersProvider;

    public BucketsWorker_Factory(Provider<FetchBuckets> provider, Provider<Logger> provider2, Provider<Schedulers> provider3) {
        this.fetchBucketsProvider = provider;
        this.loggerProvider = provider2;
        this.schedulersProvider = provider3;
    }

    public BucketsWorker get() {
        return provideInstance(this.fetchBucketsProvider, this.loggerProvider, this.schedulersProvider);
    }

    public static BucketsWorker provideInstance(Provider<FetchBuckets> provider, Provider<Logger> provider2, Provider<Schedulers> provider3) {
        return new BucketsWorker((FetchBuckets) provider.get(), (Logger) provider2.get(), (Schedulers) provider3.get());
    }

    public static BucketsWorker_Factory create(Provider<FetchBuckets> provider, Provider<Logger> provider2, Provider<Schedulers> provider3) {
        return new BucketsWorker_Factory(provider, provider2, provider3);
    }

    public static BucketsWorker newBucketsWorker(FetchBuckets fetchBuckets, Logger logger, Schedulers schedulers) {
        return new BucketsWorker(fetchBuckets, logger, schedulers);
    }
}
