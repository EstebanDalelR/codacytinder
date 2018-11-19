package com.tinder.domain.recs.engine.dispatcher;

import kotlin.Metadata;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isConnected", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.domain.recs.engine.dispatcher.NonBlockingSwipeDispatcher$subscribeToConnectivity$connectivitySubscription$1 */
final class C13909x5d5cab8e<T> implements Action1<Boolean> {
    final /* synthetic */ NonBlockingSwipeDispatcher this$0;

    C13909x5d5cab8e(NonBlockingSwipeDispatcher nonBlockingSwipeDispatcher) {
        this.this$0 = nonBlockingSwipeDispatcher;
    }

    public final void call(Boolean bool) {
        if (bool.booleanValue() == null) {
            this.this$0.pause();
        } else {
            this.this$0.resume();
        }
    }
}
