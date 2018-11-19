package com.tinder.domain.recs.engine.cardstack;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isConnected", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 9})
final class CardStackRecsLoader$subscribeToConnectivityUpdates$1<T> implements Action1<Boolean> {
    final /* synthetic */ CardStackRecsLoader this$0;

    CardStackRecsLoader$subscribeToConnectivityUpdates$1(CardStackRecsLoader cardStackRecsLoader) {
        this.this$0 = cardStackRecsLoader;
    }

    public final void call(Boolean bool) {
        if (bool == null) {
            C2668g.a();
        }
        if (bool.booleanValue() != null && this.this$0.isPaused == null) {
            this.this$0.evaluateLoadMore();
        }
    }
}
