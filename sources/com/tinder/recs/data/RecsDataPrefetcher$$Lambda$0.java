package com.tinder.recs.data;

import com.tinder.recs.card.CardSize;
import rx.functions.Action1;

final /* synthetic */ class RecsDataPrefetcher$$Lambda$0 implements Action1 {
    private final RecsDataPrefetcher arg$1;

    RecsDataPrefetcher$$Lambda$0(RecsDataPrefetcher recsDataPrefetcher) {
        this.arg$1 = recsDataPrefetcher;
    }

    public void call(Object obj) {
        this.arg$1.lambda$new$0$RecsDataPrefetcher((CardSize) obj);
    }
}
