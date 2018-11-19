package com.tinder.domain.recs.engine.cardstack;

import com.tinder.domain.recs.model.RecsLoadingStatus.Uninitialized;
import kotlin.Metadata;
import rx.Subscription;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lrx/Subscription;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
final class CardStackRecsLoader$resetRecsData$1<T> implements Action1<Subscription> {
    final /* synthetic */ CardStackRecsLoader this$0;

    CardStackRecsLoader$resetRecsData$1(CardStackRecsLoader cardStackRecsLoader) {
        this.this$0 = cardStackRecsLoader;
    }

    public final void call(Subscription subscription) {
        this.this$0.unsubscribeFromRecsLoading();
        this.this$0.updateAndNotifyLoadingStatus(Uninitialized.INSTANCE);
        this.this$0.resetMissingLocationRetryCount();
    }
}
