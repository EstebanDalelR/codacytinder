package com.tinder.domain.experiments;

import com.tinder.domain.auth.UniqueIdFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FetchBuckets_Factory implements Factory<FetchBuckets> {
    private final Provider<BucketRepository> bucketsRepositoryProvider;
    private final Provider<UniqueIdFactory> uniqueIdFactoryProvider;

    public FetchBuckets_Factory(Provider<BucketRepository> provider, Provider<UniqueIdFactory> provider2) {
        this.bucketsRepositoryProvider = provider;
        this.uniqueIdFactoryProvider = provider2;
    }

    public FetchBuckets get() {
        return provideInstance(this.bucketsRepositoryProvider, this.uniqueIdFactoryProvider);
    }

    public static FetchBuckets provideInstance(Provider<BucketRepository> provider, Provider<UniqueIdFactory> provider2) {
        return new FetchBuckets((BucketRepository) provider.get(), (UniqueIdFactory) provider2.get());
    }

    public static FetchBuckets_Factory create(Provider<BucketRepository> provider, Provider<UniqueIdFactory> provider2) {
        return new FetchBuckets_Factory(provider, provider2);
    }

    public static FetchBuckets newFetchBuckets(BucketRepository bucketRepository, UniqueIdFactory uniqueIdFactory) {
        return new FetchBuckets(bucketRepository, uniqueIdFactory);
    }
}
