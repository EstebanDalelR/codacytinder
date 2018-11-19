package com.tinder.recs.view;

import com.tinder.domain.recs.model.Rec;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class RecsView$onGamePadButtonClickedFromProfile$3 extends Lambda implements Function0<C15813i> {
    final /* synthetic */ Rec $rec;
    final /* synthetic */ RecsView this$0;

    RecsView$onGamePadButtonClickedFromProfile$3(RecsView recsView, Rec rec) {
        this.this$0 = recsView;
        this.$rec = rec;
        super(0);
    }

    public final void invoke() {
        this.this$0.getPresenter$Tinder_release().superlikeOnRecFromUserProfile(this.$rec);
    }
}
