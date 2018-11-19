package com.tinder.domain.experiments;

import io.reactivex.C3960g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/domain/experiments/GetBuckets;", "Lkotlin/Function0;", "Lio/reactivex/Single;", "Lcom/tinder/domain/experiments/Buckets;", "bucketRepository", "Lcom/tinder/domain/experiments/BucketRepository;", "(Lcom/tinder/domain/experiments/BucketRepository;)V", "invoke", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class GetBuckets implements Function0<C3960g<Buckets>> {
    private final BucketRepository bucketRepository;

    @Inject
    public GetBuckets(@NotNull BucketRepository bucketRepository) {
        C2668g.b(bucketRepository, "bucketRepository");
        this.bucketRepository = bucketRepository;
    }

    @NotNull
    public C3960g<Buckets> invoke() {
        return this.bucketRepository.getBuckets();
    }
}
