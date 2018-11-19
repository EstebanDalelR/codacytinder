package com.tinder.domain.experiments;

import io.reactivex.functions.Action;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class BucketsWorker$start$1 implements Action {
    final /* synthetic */ BucketsWorker this$0;

    BucketsWorker$start$1(BucketsWorker bucketsWorker) {
        this.this$0 = bucketsWorker;
    }

    public final void run() {
        BucketsWorker.access$getLogger$p(this.this$0).debug("Buckets fetched");
    }
}
