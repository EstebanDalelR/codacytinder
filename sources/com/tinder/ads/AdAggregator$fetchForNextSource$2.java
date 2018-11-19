package com.tinder.ads;

import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 7})
final class AdAggregator$fetchForNextSource$2 implements Action0 {
    final /* synthetic */ AdSource $source;
    final /* synthetic */ AdAggregator this$0;

    AdAggregator$fetchForNextSource$2(AdAggregator adAggregator, AdSource adSource) {
        this.this$0 = adAggregator;
        this.$source = adSource;
    }

    public final void call() {
        this.this$0.notifyAdRequestSent(this.$source);
    }
}
