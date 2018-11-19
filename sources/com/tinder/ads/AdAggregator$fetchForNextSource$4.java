package com.tinder.ads;

import com.tinder.ads.cache.AdQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "ad", "Lcom/tinder/ads/Ad;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class AdAggregator$fetchForNextSource$4<T> implements Action1<Ad<?>> {
    final /* synthetic */ AdAggregator this$0;

    AdAggregator$fetchForNextSource$4(AdAggregator adAggregator) {
        this.this$0 = adAggregator;
    }

    public final void call(Ad<?> ad) {
        AdQueue access$getAdQueue$p = this.this$0.adQueue;
        C2668g.a(ad, "ad");
        access$getAdQueue$p.add(ad);
        this.this$0.notifyAdAdded(ad);
        this.this$0.sourceMediator.reset();
    }
}
