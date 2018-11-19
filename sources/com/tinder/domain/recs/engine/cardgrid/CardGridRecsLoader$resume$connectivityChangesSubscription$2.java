package com.tinder.domain.recs.engine.cardgrid;

import kotlin.C15813i;
import kotlin.Metadata;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 9})
final class CardGridRecsLoader$resume$connectivityChangesSubscription$2<T> implements Action1<Boolean> {
    final /* synthetic */ CardGridRecsLoader this$0;

    CardGridRecsLoader$resume$connectivityChangesSubscription$2(CardGridRecsLoader cardGridRecsLoader) {
        this.this$0 = cardGridRecsLoader;
    }

    public final void call(Boolean bool) {
        synchronized (this.this$0) {
            this.this$0.loadMoreRecsIfNeeded();
            C15813i c15813i = C15813i.f49016a;
        }
    }
}
