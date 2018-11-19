package com.tinder.domain.recs.engine.cardgrid;

import com.tinder.domain.recs.model.RecsUpdate;
import kotlin.C15813i;
import kotlin.Metadata;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
final class CardGridRecsLoader$resume$recsUpdatesSubscription$1<T> implements Action1<RecsUpdate> {
    final /* synthetic */ CardGridRecsLoader this$0;

    CardGridRecsLoader$resume$recsUpdatesSubscription$1(CardGridRecsLoader cardGridRecsLoader) {
        this.this$0 = cardGridRecsLoader;
    }

    public final void call(RecsUpdate recsUpdate) {
        synchronized (this.this$0) {
            this.this$0.lastKnownRecsUpdates = recsUpdate;
            this.this$0.loadMoreRecsIfNeeded();
            recsUpdate = C15813i.f49016a;
        }
    }
}
