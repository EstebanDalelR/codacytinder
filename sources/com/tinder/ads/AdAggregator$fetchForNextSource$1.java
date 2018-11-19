package com.tinder.ads;

import com.tinder.ads.validation.AdValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0003*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/ads/Ad;", "it", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class AdAggregator$fetchForNextSource$1<T, R> implements Func1<T, R> {
    final /* synthetic */ AdAggregator this$0;

    AdAggregator$fetchForNextSource$1(AdAggregator adAggregator) {
        this.this$0 = adAggregator;
    }

    @NotNull
    public final Ad<?> call(Ad<?> ad) {
        AdValidator access$getAdValidator$p = this.this$0.adValidator;
        C2668g.a(ad, "it");
        return access$getAdValidator$p.validate(ad);
    }
}
