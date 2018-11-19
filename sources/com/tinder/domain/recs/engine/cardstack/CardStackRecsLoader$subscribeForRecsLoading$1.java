package com.tinder.domain.recs.engine.cardstack;

import com.tinder.domain.recs.model.RecsLoadingStatus;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 9})
final class CardStackRecsLoader$subscribeForRecsLoading$1 implements Action0 {
    final /* synthetic */ RecsLoadingStatus $recsLoadingStatus;
    final /* synthetic */ CardStackRecsLoader this$0;

    CardStackRecsLoader$subscribeForRecsLoading$1(CardStackRecsLoader cardStackRecsLoader, RecsLoadingStatus recsLoadingStatus) {
        this.this$0 = cardStackRecsLoader;
        this.$recsLoadingStatus = recsLoadingStatus;
    }

    public final void call() {
        this.this$0.updateAndNotifyLoadingStatus(this.$recsLoadingStatus);
    }
}
