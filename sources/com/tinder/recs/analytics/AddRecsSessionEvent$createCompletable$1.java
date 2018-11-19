package com.tinder.recs.analytics;

import com.tinder.etl.event.uk;
import io.reactivex.functions.Action;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class AddRecsSessionEvent$createCompletable$1 implements Action {
    final /* synthetic */ uk $request;
    final /* synthetic */ AddRecsSessionEvent this$0;

    AddRecsSessionEvent$createCompletable$1(AddRecsSessionEvent addRecsSessionEvent, uk ukVar) {
        this.this$0 = addRecsSessionEvent;
        this.$request = ukVar;
    }

    public final void run() {
        this.this$0.fireworks.a(this.$request);
    }
}
