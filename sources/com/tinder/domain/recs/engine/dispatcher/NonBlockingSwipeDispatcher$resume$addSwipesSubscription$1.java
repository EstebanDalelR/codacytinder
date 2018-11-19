package com.tinder.domain.recs.engine.dispatcher;

import com.tinder.domain.recs.model.Swipe;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/domain/recs/model/Swipe;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
final class NonBlockingSwipeDispatcher$resume$addSwipesSubscription$1<T> implements Action1<Set<? extends Swipe>> {
    final /* synthetic */ NonBlockingSwipeDispatcher this$0;

    NonBlockingSwipeDispatcher$resume$addSwipesSubscription$1(NonBlockingSwipeDispatcher nonBlockingSwipeDispatcher) {
        this.this$0 = nonBlockingSwipeDispatcher;
    }

    public final void call(Set<Swipe> set) {
        NonBlockingSwipeDispatcher nonBlockingSwipeDispatcher = this.this$0;
        C2668g.a(set, "it");
        nonBlockingSwipeDispatcher.handleNewSwipes(set);
    }
}
