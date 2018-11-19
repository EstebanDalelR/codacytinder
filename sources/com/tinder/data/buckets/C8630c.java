package com.tinder.data.buckets;

import com.tinder.api.buckets.BucketsRequestBody;
import com.tinder.api.buckets.BucketsResponse;
import com.tinder.api.buckets.BucketsService;
import com.tinder.domain.experiments.Buckets;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/data/buckets/BucketsApiClient;", "", "bucketsService", "Lcom/tinder/api/buckets/BucketsService;", "bucketsAdapter", "Lcom/tinder/data/buckets/BucketsAdapter;", "(Lcom/tinder/api/buckets/BucketsService;Lcom/tinder/data/buckets/BucketsAdapter;)V", "createRequestBody", "Lcom/tinder/api/buckets/BucketsRequestBody;", "deviceId", "", "fromApi", "Lcom/tinder/domain/experiments/Buckets;", "bucketsResponse", "Lcom/tinder/api/buckets/BucketsResponse;", "getBuckets", "Lio/reactivex/Single;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.buckets.c */
public final class C8630c {
    /* renamed from: a */
    private final BucketsService f30483a;
    /* renamed from: b */
    private final C8627a f30484b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/api/buckets/BucketsRequestBody;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.buckets.c$a */
    static final class C8629a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C8630c f30481a;
        /* renamed from: b */
        final /* synthetic */ String f30482b;

        C8629a(C8630c c8630c, String str) {
            this.f30481a = c8630c;
            this.f30482b = str;
        }

        public /* synthetic */ Object call() {
            return m36774a();
        }

        @NotNull
        /* renamed from: a */
        public final BucketsRequestBody m36774a() {
            return this.f30481a.m36779b(this.f30482b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/api/buckets/BucketsResponse;", "it", "Lcom/tinder/api/buckets/BucketsRequestBody;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.buckets.c$b */
    static final class C10755b<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C8630c f35152a;

        C10755b(C8630c c8630c) {
            this.f35152a = c8630c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43158a((BucketsRequestBody) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<BucketsResponse> m43158a(@NotNull BucketsRequestBody bucketsRequestBody) {
            C2668g.b(bucketsRequestBody, "it");
            return this.f35152a.f30483a.loadExperiments(bucketsRequestBody);
        }
    }

    @Inject
    public C8630c(@NotNull BucketsService bucketsService, @NotNull C8627a c8627a) {
        C2668g.b(bucketsService, "bucketsService");
        C2668g.b(c8627a, "bucketsAdapter");
        this.f30483a = bucketsService;
        this.f30484b = c8627a;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<Buckets> m36780a(@NotNull String str) {
        C2668g.b(str, "deviceId");
        str = C3960g.c(new C8629a(this, str)).a(new C10755b(this)).e(new C10756d(new BucketsApiClient$getBuckets$3(this)));
        C2668g.a(str, "Single.fromCallable { cr…      .map(this::fromApi)");
        return str;
    }

    /* renamed from: b */
    private final BucketsRequestBody m36779b(String str) {
        return new BucketsRequestBody(str, this.f30484b.m36772a());
    }

    /* renamed from: a */
    private final Buckets m36777a(BucketsResponse bucketsResponse) {
        return this.f30484b.m36771a(bucketsResponse.getData().getBuckets());
    }
}
