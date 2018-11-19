package com.tinder.recs.data;

import io.reactivex.functions.Action;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class SwipeCountSharedPreferencesRepository$updateSwipeCount$1 implements Action {
    final /* synthetic */ int $count;
    final /* synthetic */ SwipeCountSharedPreferencesRepository this$0;

    SwipeCountSharedPreferencesRepository$updateSwipeCount$1(SwipeCountSharedPreferencesRepository swipeCountSharedPreferencesRepository, int i) {
        this.this$0 = swipeCountSharedPreferencesRepository;
        this.$count = i;
    }

    public final void run() {
        this.this$0.setSwipeCount(this.$count);
    }
}
