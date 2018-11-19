package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.toppicks.TopPicksScreenState;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/toppicks/TopPicksScreenState;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class ResetScreenState$execute$1<T> implements Consumer<TopPicksScreenState> {
    final /* synthetic */ ResetReason $request;
    final /* synthetic */ ResetScreenState this$0;

    ResetScreenState$execute$1(ResetScreenState resetScreenState, ResetReason resetReason) {
        this.this$0 = resetScreenState;
        this.$request = resetReason;
    }

    public final void accept(TopPicksScreenState topPicksScreenState) {
        ResetScreenState resetScreenState = this.this$0;
        C2668g.a(topPicksScreenState, "it");
        resetScreenState.handleResetForState(topPicksScreenState, this.$request);
    }
}
