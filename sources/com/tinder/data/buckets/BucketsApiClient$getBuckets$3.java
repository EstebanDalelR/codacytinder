package com.tinder.data.buckets;

import com.tinder.api.buckets.BucketsResponse;
import com.tinder.domain.experiments.Buckets;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/domain/experiments/Buckets;", "p1", "Lcom/tinder/api/buckets/BucketsResponse;", "Lkotlin/ParameterName;", "name", "bucketsResponse", "invoke"}, k = 3, mv = {1, 1, 10})
final class BucketsApiClient$getBuckets$3 extends FunctionReference implements Function1<BucketsResponse, Buckets> {
    BucketsApiClient$getBuckets$3(C8630c c8630c) {
        super(1, c8630c);
    }

    public final String getName() {
        return "fromApi";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C8630c.class);
    }

    public final String getSignature() {
        return "fromApi(Lcom/tinder/api/buckets/BucketsResponse;)Lcom/tinder/domain/experiments/Buckets;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54062a((BucketsResponse) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Buckets m54062a(@NotNull BucketsResponse bucketsResponse) {
        C2668g.b(bucketsResponse, "p1");
        return ((C8630c) this.receiver).m36777a(bucketsResponse);
    }
}
