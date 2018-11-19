package com.tinder.recs.data;

import rx.functions.Action1;

final /* synthetic */ class RecsDataPrefetcher$$Lambda$2 implements Action1 {
    private final RecsDataPrefetcher arg$1;

    RecsDataPrefetcher$$Lambda$2(RecsDataPrefetcher recsDataPrefetcher) {
        this.arg$1 = recsDataPrefetcher;
    }

    public void call(Object obj) {
        this.arg$1.lambda$preloadImage$1$RecsDataPrefetcher((String) obj);
    }
}
