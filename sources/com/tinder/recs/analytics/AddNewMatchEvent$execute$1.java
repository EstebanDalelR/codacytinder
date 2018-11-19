package com.tinder.recs.analytics;

import com.tinder.api.model.common.ApiMatch;
import com.tinder.domain.recs.model.Rec$Type;
import com.tinder.domain.recs.model.RecType;
import com.tinder.recs.analytics.AddNewMatchEvent.Request;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class AddNewMatchEvent$execute$1 implements Action0 {
    final /* synthetic */ Request $request;
    final /* synthetic */ AddNewMatchEvent this$0;

    AddNewMatchEvent$execute$1(AddNewMatchEvent addNewMatchEvent, Request request) {
        this.this$0 = addNewMatchEvent;
        this.$request = request;
    }

    public final void call() {
        ApiMatch ratingMatch = this.$request.getRatingMatch();
        Rec$Type type = this.$request.getSwipe().getRec().getType();
        if (type == RecType.USER) {
            this.this$0.getFireworks().a(this.this$0.createUserMatchEvent(ratingMatch));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rec.Type ");
        stringBuilder.append(type);
        stringBuilder.append(" not configured");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
