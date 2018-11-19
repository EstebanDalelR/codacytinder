package com.tinder.data.buckets;

import com.tinder.domain.experiments.BucketRepository;
import com.tinder.domain.experiments.Buckets;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/data/buckets/BucketsDataRepository;", "Lcom/tinder/domain/experiments/BucketRepository;", "bucketsApiClient", "Lcom/tinder/data/buckets/BucketsApiClient;", "bucketsStore", "Lcom/tinder/data/buckets/BucketsStore;", "(Lcom/tinder/data/buckets/BucketsApiClient;Lcom/tinder/data/buckets/BucketsStore;)V", "fetchBuckets", "Lio/reactivex/Completable;", "deviceId", "", "getBuckets", "Lio/reactivex/Single;", "Lcom/tinder/domain/experiments/Buckets;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.buckets.e */
public final class C10758e implements BucketRepository {
    /* renamed from: a */
    private final C8630c f35155a;
    /* renamed from: b */
    private final C8634g f35156b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/domain/experiments/Buckets;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.buckets.e$a */
    static final class C10757a<T, R> implements Function<Buckets, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C10758e f35154a;

        C10757a(C10758e c10758e) {
            this.f35154a = c10758e;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43159a((Buckets) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m43159a(@NotNull Buckets buckets) {
            C2668g.b(buckets, "it");
            return this.f35154a.f35156b.m36787a(buckets);
        }
    }

    @Inject
    public C10758e(@NotNull C8630c c8630c, @NotNull C8634g c8634g) {
        C2668g.b(c8630c, "bucketsApiClient");
        C2668g.b(c8634g, "bucketsStore");
        this.f35155a = c8630c;
        this.f35156b = c8634g;
    }

    @NotNull
    public C3960g<Buckets> getBuckets() {
        return this.f35156b.m36788a();
    }

    @NotNull
    public C3956a fetchBuckets(@NotNull String str) {
        C2668g.b(str, "deviceId");
        str = this.f35155a.m36780a(str).d(new C10757a(this));
        C2668g.a(str, "bucketsApiClient.getBuck…sStore.save(it)\n        }");
        return str;
    }
}
