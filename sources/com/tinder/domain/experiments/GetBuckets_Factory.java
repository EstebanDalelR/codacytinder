package com.tinder.domain.experiments;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetBuckets_Factory implements Factory<GetBuckets> {
    private final Provider<BucketRepository> bucketRepositoryProvider;

    public GetBuckets_Factory(Provider<BucketRepository> provider) {
        this.bucketRepositoryProvider = provider;
    }

    public GetBuckets get() {
        return provideInstance(this.bucketRepositoryProvider);
    }

    public static GetBuckets provideInstance(Provider<BucketRepository> provider) {
        return new GetBuckets((BucketRepository) provider.get());
    }

    public static GetBuckets_Factory create(Provider<BucketRepository> provider) {
        return new GetBuckets_Factory(provider);
    }

    public static GetBuckets newGetBuckets(BucketRepository bucketRepository) {
        return new GetBuckets(bucketRepository);
    }
}
