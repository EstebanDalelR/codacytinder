package com.tinder.recs.data;

import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class DefaultRatingsApiClient$rate$5 implements Action0 {
    final /* synthetic */ DefaultRatingsApiClient this$0;

    DefaultRatingsApiClient$rate$5(DefaultRatingsApiClient defaultRatingsApiClient) {
        this.this$0 = defaultRatingsApiClient;
    }

    public final void call() {
        this.this$0.recsEvent.a("SUPER_LIKE_TIMER_KEY");
    }
}
