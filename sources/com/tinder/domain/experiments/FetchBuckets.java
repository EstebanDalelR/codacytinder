package com.tinder.domain.experiments;

import com.tinder.domain.auth.UniqueIdFactory;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\b\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/experiments/FetchBuckets;", "Lkotlin/Function0;", "Lio/reactivex/Completable;", "bucketsRepository", "Lcom/tinder/domain/experiments/BucketRepository;", "uniqueIdFactory", "Lcom/tinder/domain/auth/UniqueIdFactory;", "(Lcom/tinder/domain/experiments/BucketRepository;Lcom/tinder/domain/auth/UniqueIdFactory;)V", "invoke", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FetchBuckets implements Function0<C3956a> {
    private final BucketRepository bucketsRepository;
    private final UniqueIdFactory uniqueIdFactory;

    @Inject
    public FetchBuckets(@NotNull BucketRepository bucketRepository, @NotNull UniqueIdFactory uniqueIdFactory) {
        C2668g.b(bucketRepository, "bucketsRepository");
        C2668g.b(uniqueIdFactory, "uniqueIdFactory");
        this.bucketsRepository = bucketRepository;
        this.uniqueIdFactory = uniqueIdFactory;
    }

    @NotNull
    public C3956a invoke() {
        return this.bucketsRepository.fetchBuckets(this.uniqueIdFactory.getInstanceId());
    }
}
