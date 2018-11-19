package com.tinder.recs.analytics;

import com.tinder.common.navigation.Screen;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/tinder/common/navigation/Screen;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class RecsSessionTracker$startTracking$4<T> implements Consumer<Pair<? extends Screen, ? extends Screen>> {
    final /* synthetic */ RecsSessionTracker this$0;

    RecsSessionTracker$startTracking$4(RecsSessionTracker recsSessionTracker) {
        this.this$0 = recsSessionTracker;
    }

    public final void accept(Pair<? extends Screen, ? extends Screen> pair) {
        this.this$0.onScreenChange((Screen) pair.m59803a(), (Screen) pair.m59804b());
    }
}
