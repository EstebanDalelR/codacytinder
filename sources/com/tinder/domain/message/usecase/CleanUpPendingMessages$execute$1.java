package com.tinder.domain.message.usecase;

import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class CleanUpPendingMessages$execute$1 implements Action0 {
    final /* synthetic */ CleanUpPendingMessages this$0;

    CleanUpPendingMessages$execute$1(CleanUpPendingMessages cleanUpPendingMessages) {
        this.this$0 = cleanUpPendingMessages;
    }

    public final void call() {
        CleanUpPendingMessages.access$getLogger$p(this.this$0).debug("Successfully completed pending message cleanup");
    }
}
